package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.ProcAddressHelper;
import com.sun.opengl.impl.GLDrawableFactoryImpl;
import com.sun.opengl.impl.JAWT;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLException;

public class X11GLDrawableFactory extends GLDrawableFactoryImpl {

	private static boolean isHeadless = GraphicsEnvironment.isHeadless();

	private static Map visualToGLCapsMap = Collections.synchronizedMap(new HashMap());

	private static long staticDisplay;

	private static boolean checkedMultisample;

	private static boolean multisampleAvailable;

	private boolean checkedXinerama;

	private boolean xineramaEnabled;

	public X11GLDrawableFactory() {
		ProcAddressHelper.resetProcAddressTable(GLX.getGLXProcAddressTable(), this);
	}

	public GLDrawable getGLDrawable(Object arg0, GLCapabilities arg1, GLCapabilitiesChooser arg2) {
		if (arg0 == null) {
			throw new IllegalArgumentException("Null target");
		} else if (arg0 instanceof Component) {
			Component var4 = (Component) arg0;
			X11OnscreenGLDrawable var5 = new X11OnscreenGLDrawable(var4);
			GraphicsConfiguration var6 = var4.getGraphicsConfiguration();
			if (var6 == null) {
				throw new IllegalArgumentException("GLDrawableFactory.chooseGraphicsConfiguration() was not used when creating this Component");
			}
			int var7 = X11SunJDKReflection.graphicsConfigurationGetVisualID(var6);
			int var8;
			if (this.isXineramaEnabled()) {
				var8 = 0;
			} else {
				var8 = X11SunJDKReflection.graphicsDeviceGetScreen(var6.getDevice());
			}
			var5.setChosenGLCapabilities((GLCapabilities) visualToGLCapsMap.get(new X11GLDrawableFactory.ScreenAndVisualIDKey(var8, (long) var7)));
			return var5;
		} else {
			throw new IllegalArgumentException("GLDrawables not supported for objects of type " + arg0.getClass().getName() + " (only Components are supported in this implementation)");
		}
	}

	public long dynamicLookupFunction(String arg0) {
		return GLX.glXGetProcAddressARB(arg0);
	}

	public static GLCapabilities xvi2GLCapabilities(long arg0, XVisualInfo arg1) {
		int[] var3 = new int[1];
		int var4 = glXGetConfig(arg0, arg1, 1, var3, 0);
		if (var4 == 0) {
			return null;
		}
		var4 = glXGetConfig(arg0, arg1, 4, var3, 0);
		if (var4 == 0) {
			return null;
		}
		GLCapabilities var5 = new GLCapabilities();
		var5.setDoubleBuffered(glXGetConfig(arg0, arg1, 5, var3, 0) != 0);
		var5.setStereo(glXGetConfig(arg0, arg1, 6, var3, 0) != 0);
		var5.setHardwareAccelerated(true);
		var5.setDepthBits(glXGetConfig(arg0, arg1, 12, var3, 0));
		var5.setStencilBits(glXGetConfig(arg0, arg1, 13, var3, 0));
		var5.setRedBits(glXGetConfig(arg0, arg1, 8, var3, 0));
		var5.setGreenBits(glXGetConfig(arg0, arg1, 9, var3, 0));
		var5.setBlueBits(glXGetConfig(arg0, arg1, 10, var3, 0));
		var5.setAlphaBits(glXGetConfig(arg0, arg1, 11, var3, 0));
		var5.setAccumRedBits(glXGetConfig(arg0, arg1, 14, var3, 0));
		var5.setAccumGreenBits(glXGetConfig(arg0, arg1, 15, var3, 0));
		var5.setAccumBlueBits(glXGetConfig(arg0, arg1, 16, var3, 0));
		var5.setAccumAlphaBits(glXGetConfig(arg0, arg1, 17, var3, 0));
		if (isMultisampleAvailable()) {
			var5.setSampleBuffers(glXGetConfig(arg0, arg1, 100000, var3, 0) != 0);
			var5.setNumSamples(glXGetConfig(arg0, arg1, 100001, var3, 0));
		}
		return var5;
	}

	public void lockToolkit() {
		if (!isHeadless) {
			JAWT.getJAWT().Lock();
		}
	}

	public void unlockToolkit() {
		if (!isHeadless) {
			JAWT.getJAWT().Unlock();
		}
	}

	public static long getDisplayConnection() {
		if (staticDisplay == 0L) {
			getX11Factory().lockToolkit();
			try {
				staticDisplay = GLX.XOpenDisplay(null);
			} finally {
				getX11Factory().unlockToolkit();
			}
			if (staticDisplay == 0L) {
				throw new GLException("Unable to open default display, needed for visual selection and offscreen surface handling");
			}
		}
		return staticDisplay;
	}

	public static boolean isMultisampleAvailable() {
		if (!checkedMultisample) {
			long var0 = getDisplayConnection();
			String var2 = GLX.glXGetClientString(var0, 3);
			if (var2 != null) {
				multisampleAvailable = var2.indexOf("GLX_ARB_multisample") >= 0;
			}
			checkedMultisample = true;
		}
		return multisampleAvailable;
	}

	private static String glXGetConfigErrorCode(int arg0) {
		switch(arg0) {
			case 1:
				return "GLX_BAD_SCREEN";
			case 2:
				return "GLX_BAD_ATTRIBUTE";
			case 3:
				return "GLX_NO_EXTENSION";
			case 4:
				return "GLX_BAD_VISUAL";
			default:
				return "Unknown error code " + arg0;
		}
	}

	public static int glXGetConfig(long arg0, XVisualInfo arg1, int arg2, int[] arg3, int arg4) {
		if (arg0 == 0L) {
			throw new GLException("No display connection");
		}
		int var6 = GLX.glXGetConfig(arg0, arg1, arg2, arg3, arg4);
		if (var6 != 0) {
			throw new GLException("glXGetConfig failed: error code " + glXGetConfigErrorCode(var6));
		}
		return arg3[arg4];
	}

	public static X11GLDrawableFactory getX11Factory() {
		return (X11GLDrawableFactory) getFactory();
	}

	protected synchronized boolean isXineramaEnabled() {
		if (!this.checkedXinerama) {
			this.checkedXinerama = true;
			this.lockToolkit();
			long var1 = getDisplayConnection();
			this.xineramaEnabled = GLX.XineramaEnabled(var1);
			this.unlockToolkit();
		}
		return this.xineramaEnabled;
	}

	static class ScreenAndVisualIDKey {

		private int screen;

		private long visualID;

		ScreenAndVisualIDKey(int arg0, long arg1) {
			this.screen = arg0;
			this.visualID = arg1;
		}

		public int hashCode() {
			return (int) ((long) this.screen + this.visualID * 13L);
		}

		public boolean equals(Object arg0) {
			if (arg0 != null && arg0 instanceof X11GLDrawableFactory.ScreenAndVisualIDKey) {
				X11GLDrawableFactory.ScreenAndVisualIDKey var2 = (X11GLDrawableFactory.ScreenAndVisualIDKey) arg0;
				return this.screen == var2.screen && this.visualID == var2.visualID;
			} else {
				return false;
			}
		}
	}
}
