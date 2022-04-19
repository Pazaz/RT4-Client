package com.sun.opengl.impl.x11;

import java.nio.ByteBuffer;

class XVisualInfo32 extends XVisualInfo {

	public static int size() {
		return 40;
	}

	XVisualInfo32(ByteBuffer arg0) {
		super(arg0);
	}

	public XVisualInfo visualid(long arg0) {
		this.accessor.setIntAt(1, (int) arg0);
		return this;
	}

	public XVisualInfo screen(int arg0) {
		this.accessor.setIntAt(2, arg0);
		return this;
	}
}
