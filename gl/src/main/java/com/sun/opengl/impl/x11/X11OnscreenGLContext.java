package com.sun.opengl.impl.x11;

import javax.media.opengl.GLException;

public class X11OnscreenGLContext extends X11GLContext {

	protected X11OnscreenGLDrawable drawable;

	public X11OnscreenGLContext(X11OnscreenGLDrawable arg0) {
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
			this.drawable.unlockSurface();
		}
		return var2;
	}

	protected void create() {
		this.createContext(true);
	}
}
