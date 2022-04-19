package com.sun.opengl.impl.x11;

import javax.media.opengl.GLException;

public class GLXExtImpl implements GLXExt {

	private X11GLContext _context;

	public int glXSwapIntervalSGI(int arg0) {
		long var2 = this._context.getGLXExtProcAddressTable()._addressof_glXSwapIntervalSGI;
		if (var2 == 0L) {
			throw new GLException("Method \"glXSwapIntervalSGI\" not available");
		}
		return this.dispatch_glXSwapIntervalSGI0(arg0, var2);
	}

	public native int dispatch_glXSwapIntervalSGI0(int arg0, long arg1);

	public GLXExtImpl(X11GLContext arg0) {
		this._context = arg0;
	}

	public boolean isExtensionAvailable(String arg0) {
		return this._context.isExtensionAvailable(arg0);
	}
}
