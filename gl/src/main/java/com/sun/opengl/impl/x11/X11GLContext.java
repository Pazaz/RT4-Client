package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.GLContextImpl;
import com.sun.opengl.impl.GLDrawableFactoryImpl;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GLException;

public abstract class X11GLContext extends GLContextImpl {

	protected X11GLDrawable drawable;

	protected long context;

	private boolean glXQueryExtensionsStringInitialized;

	private boolean glXQueryExtensionsStringAvailable;

	private static final Map functionNameMap = new HashMap();

	private GLXExt glXExt;

	private GLXExtProcAddressTable glXExtProcAddressTable;

	protected long mostRecentDisplay;

	public X11GLContext(X11GLDrawable arg0) {
		this.drawable = arg0;
	}

	public GLXExt getGLXExt() {
		if (this.glXExt == null) {
			this.glXExt = new GLXExtImpl(this);
		}
		return this.glXExt;
	}

	protected String mapToRealGLExtensionName(String arg0) {
		return arg0;
	}

	protected abstract void create();

	protected void createContext(boolean arg0) {
		XVisualInfo var2 = this.drawable.chooseVisual(arg0);
		long var3 = 0L;
		this.context = GLX.glXCreateContext(this.drawable.getDisplay(), var2, var3, arg0);
		if (this.context == 0L) {
			throw new GLException("Unable to create OpenGL context");
		}
	}

	protected int makeCurrentImpl() throws GLException {
		boolean var1 = false;
		if (this.context == 0L) {
			this.create();
			var1 = true;
		}
		if (!GLX.glXMakeCurrent(this.drawable.getDisplay(), this.drawable.getDrawable(), this.context)) {
			throw new GLException("Error making context current");
		}
		this.mostRecentDisplay = this.drawable.getDisplay();
		if (var1) {
			this.resetGLFunctionAvailability();
			return 2;
		} else {
			return 1;
		}
	}

	protected void releaseImpl() throws GLException {
		this.lockToolkit();
		try {
			if (!GLX.glXMakeCurrent(this.mostRecentDisplay, 0L, 0L)) {
				throw new GLException("Error freeing OpenGL context");
			}
		} finally {
			this.unlockToolkit();
		}
	}

	protected void destroyImpl() throws GLException {
		this.lockToolkit();
		try {
			if (this.context != 0L) {
				GLX.glXDestroyContext(this.mostRecentDisplay, this.context);
				this.context = 0L;
				this.mostRecentDisplay = 0L;
			}
		} finally {
			this.unlockToolkit();
		}
	}

	protected void resetGLFunctionAvailability() {
		super.resetGLFunctionAvailability();
		this.resetProcAddressTable(this.getGLXExtProcAddressTable());
	}

	public GLXExtProcAddressTable getGLXExtProcAddressTable() {
		if (this.glXExtProcAddressTable == null) {
			this.glXExtProcAddressTable = new GLXExtProcAddressTable();
		}
		return this.glXExtProcAddressTable;
	}

	public synchronized String getPlatformExtensionsString() {
		if (this.mostRecentDisplay == 0L) {
			throw new GLException("Context not current");
		}
		if (!this.glXQueryExtensionsStringInitialized) {
			this.glXQueryExtensionsStringAvailable = GLDrawableFactoryImpl.getFactoryImpl().dynamicLookupFunction("glXQueryExtensionsString") != 0L;
			this.glXQueryExtensionsStringInitialized = true;
		}
		if (!this.glXQueryExtensionsStringAvailable) {
			return "";
		}
		this.lockToolkit();
		String var2;
		try {
			String var1 = GLX.glXQueryExtensionsString(this.mostRecentDisplay, GLX.DefaultScreen(this.mostRecentDisplay));
			var2 = var1;
		} finally {
			this.unlockToolkit();
		}
		return var2;
	}

	public void setSwapInterval(int arg0) {
		this.lockToolkit();
		try {
			GLXExt var2 = this.getGLXExt();
			if (var2.isExtensionAvailable("GLX_SGI_swap_control")) {
				var2.glXSwapIntervalSGI(arg0);
			}
		} finally {
			this.unlockToolkit();
		}
	}

	protected void lockToolkit() {
		X11GLDrawableFactory.getX11Factory().lockToolkit();
	}

	protected void unlockToolkit() {
		X11GLDrawableFactory.getX11Factory().unlockToolkit();
	}

	static {
		functionNameMap.put("glAllocateMemoryNV", "glXAllocateMemoryNV");
		functionNameMap.put("glFreeMemoryNV", "glXFreeMemoryNV");
	}
}
