package com.sun.opengl.impl.windows;

import javax.media.opengl.GLException;

public class WindowsOnscreenGLContext extends WindowsGLContext {

	protected WindowsOnscreenGLDrawable drawable;

	public WindowsOnscreenGLContext(WindowsOnscreenGLDrawable arg0) {
		super(arg0);
		this.drawable = arg0;
	}

	protected int makeCurrentImpl() throws GLException {
		int var1 = this.drawable.lockSurface();
		if (var1 == 1) {
			return 0;
		}
		int var2;
		try {
			if (var1 == 2) {
				super.destroyImpl();
			}
			var2 = super.makeCurrentImpl();
		} finally {
			this.drawable.unlockSurface(false);
		}
		return var2;
	}

	protected void releaseImpl() throws GLException {
		try {
			super.releaseImpl();
		} finally {
			this.drawable.unlockSurface(true);
		}
	}
}
