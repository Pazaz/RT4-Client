package com.sun.opengl.impl;

import java.nio.ByteBuffer;

class JAWT64 extends JAWT {

	public static int size() {
		return 48;
	}

	JAWT64(ByteBuffer arg0) {
		super(arg0);
	}

	public JAWT version(int arg0) {
		this.accessor.setIntAt(0, arg0);
		return this;
	}
}
