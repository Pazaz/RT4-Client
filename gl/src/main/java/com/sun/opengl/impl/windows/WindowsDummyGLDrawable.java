package com.sun.opengl.impl.windows;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;

public class WindowsDummyGLDrawable extends WindowsGLDrawable {

	private long hwnd;

	public WindowsDummyGLDrawable() {
		super(new GLCapabilities(), (GLCapabilitiesChooser) null);
		synchronized (WindowsDummyGLDrawable.class) {
			this.hwnd = WGL.CreateDummyWindow(0, 0, 1, 1);
		}
		this.hdc = WGL.GetDC(this.hwnd);
		GLCapabilities var1 = new GLCapabilities();
		var1.setDepthBits(16);
		PIXELFORMATDESCRIPTOR var2 = glCapabilities2PFD(var1, true);
		int var3 = WGL.ChoosePixelFormat(this.hdc, var2);
		if (var3 == 0 || !WGL.SetPixelFormat(this.hdc, var3, var2)) {
			this.destroy();
		}
	}

	public GLContext createContext(GLContext arg0) {
		return this.hdc == 0L ? null : new WindowsGLContext(this);
	}

	public void destroy() {
		if (this.hdc != 0L) {
			WGL.ReleaseDC(this.hwnd, this.hdc);
			this.hdc = 0L;
		}
		if (this.hwnd != 0L) {
			WGL.ShowWindow(this.hwnd, 0);
			WGL.DestroyWindow(this.hwnd);
			this.hwnd = 0L;
		}
	}
}
