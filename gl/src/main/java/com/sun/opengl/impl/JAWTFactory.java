package com.sun.opengl.impl;

import java.nio.ByteBuffer;

public class JAWTFactory {

	public static boolean JAWT_GetAWT(JAWT arg0) {
		return JAWT_GetAWT0(arg0 == null ? null : arg0.getBuffer());
	}

	private static native boolean JAWT_GetAWT0(ByteBuffer arg0);
}
