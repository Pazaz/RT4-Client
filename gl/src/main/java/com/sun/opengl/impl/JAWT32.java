package com.sun.opengl.impl;

import java.nio.ByteBuffer;

class JAWT32 extends JAWT {

	public static int size() {
		return 24;
	}

	JAWT32(ByteBuffer arg0) {
		super(arg0);
	}

	public JAWT version(int arg0) {
		this.accessor.setIntAt(0, arg0);
		return this;
	}
}
