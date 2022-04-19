package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.GLDrawableImpl;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLException;

public abstract class X11GLDrawable extends GLDrawableImpl {

	protected long display;

	protected long drawable;

	protected long visualID;

	protected GLCapabilities capabilities;

	protected GLCapabilitiesChooser chooser;

	public X11GLDrawable(GLCapabilities arg0, GLCapabilitiesChooser arg1) {
		this.capabilities = arg0 == null ? null : (GLCapabilities) arg0.clone();
		this.chooser = arg1;
	}

	public void setRealized(boolean arg0) {
		throw new GLException("Should not call this (should only be called for onscreen GLDrawables)");
	}

	public void swapBuffers() throws GLException {
	}

	public long getDisplay() {
		return this.display;
	}

	public long getDrawable() {
		return this.drawable;
	}

	protected XVisualInfo chooseVisual(boolean arg0) {
		if (this.display == 0L) {
			throw new GLException("null display");
		}
		XVisualInfo var3;
		if (arg0) {
			int[] var12 = new int[1];
			var3 = XVisualInfo.create();
			var3.visualid((long) this.visualID);
			this.lockToolkit();
			XVisualInfo[] var13 = GLX.XGetVisualInfo(this.display, 1L, var3, var12, 0);
			this.unlockToolkit();
			if (var13 == null || var13.length == 0) {
				throw new GLException("Error while getting XVisualInfo for visual ID " + this.visualID);
			}
			return var13[0];
		}
		byte var2 = 0;
		var3 = null;
		int[] var4 = new int[1];
		XVisualInfo var5 = XVisualInfo.create();
		var5.screen(var2);
		XVisualInfo[] var6 = null;
		GLCapabilities[] var7 = null;
		this.lockToolkit();
		int var8;
		try {
			var6 = GLX.XGetVisualInfo(this.display, 2L, var5, var4, 0);
			if (var6 == null) {
				throw new GLException("Error while enumerating available XVisualInfos");
			}
			var7 = new GLCapabilities[var6.length];
			for (var8 = 0; var8 < var6.length; var8++) {
				var7[var8] = X11GLDrawableFactory.xvi2GLCapabilities(this.display, var6[var8]);
			}
		} finally {
			this.unlockToolkit();
		}
		var8 = this.chooser.chooseCapabilities(this.capabilities, var7, -1);
		if (var8 < 0 || var8 >= var7.length) {
			throw new GLException("GLCapabilitiesChooser specified invalid index (expected 0.." + (var7.length - 1) + ")");
		}
		var3 = var6[var8];
		if (var3 == null) {
			throw new GLException("GLCapabilitiesChooser chose an invalid visual");
		}
		return var3;
	}

	protected void lockToolkit() {
		X11GLDrawableFactory.getX11Factory().lockToolkit();
	}

	protected void unlockToolkit() {
		X11GLDrawableFactory.getX11Factory().unlockToolkit();
	}
}
