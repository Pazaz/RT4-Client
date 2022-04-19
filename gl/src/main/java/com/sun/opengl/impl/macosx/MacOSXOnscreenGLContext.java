package com.sun.opengl.impl.macosx;

import javax.media.opengl.GLException;

public class MacOSXOnscreenGLContext extends MacOSXGLContext {

	protected MacOSXOnscreenGLDrawable drawable;

	public MacOSXOnscreenGLContext(MacOSXOnscreenGLDrawable arg0) {
		super(arg0);
		this.drawable = arg0;
	}

	protected int makeCurrentImpl() throws GLException {
		int var1 = this.drawable.lockSurface();
		if (var1 == 1) {
			return 0;
		}
		int var3;
		try {
			if (var1 == 2) {
				super.destroyImpl();
			}
			int var2 = super.makeCurrentImpl();
			if (var2 == 1 || var2 == 2) {
				CGL.updateContext(this.nsContext);
			}
			var3 = var2;
		} finally {
			this.drawable.unlockSurface();
		}
		return var3;
	}

	public void swapBuffers() throws GLException {
		if (!CGL.flushBuffer(this.nsContext)) {
			throw new GLException("Error swapping buffers");
		}
	}

	protected void update() throws GLException {
		if (this.nsContext == 0L) {
			throw new GLException("Context not created");
		}
		CGL.updateContext(this.nsContext);
	}

	protected boolean create() {
		return this.create(false, false);
	}
}
