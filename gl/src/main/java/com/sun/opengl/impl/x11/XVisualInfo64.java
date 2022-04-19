package com.sun.opengl.impl.x11;

import java.nio.ByteBuffer;

class XVisualInfo64 extends XVisualInfo {

	public static int size() {
		return 64;
	}

	XVisualInfo64(ByteBuffer arg0) {
		super(arg0);
	}

	public XVisualInfo visualid(long arg0) {
		this.accessor.setLongAt(1, arg0);
		return this;
	}

	public XVisualInfo screen(int arg0) {
		this.accessor.setIntAt(4, arg0);
		return this;
	}
}
