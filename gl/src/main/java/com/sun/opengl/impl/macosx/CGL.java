package com.sun.opengl.impl.macosx;

import javax.media.opengl.GLException;

public class CGL {

	public static native boolean clearCurrentContext(long arg0);

	private static native long createContext1(long arg0, long arg1, long arg2, Object arg3, int arg4);

	public static long createContext(long arg0, long arg1, long arg2, int[] arg3, int arg4) {
		if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"viewNotReady_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
		return createContext1(arg0, arg1, arg2, arg3, arg4 * 4);
	}

	private static native long createPixelFormat1(Object arg0, int arg1, int arg2, Object arg3, int arg4);

	public static long createPixelFormat(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
		if (arg0 != null && arg0.length <= arg1) {
			throw new GLException("array offset argument \"iattrs_offset\" (" + arg1 + ") equals or exceeds array length (" + arg0.length + ")");
		} else if (arg3 == null || arg3.length > arg4) {
			return createPixelFormat1(arg0, arg1 * 4, arg2, arg3, arg4 * 4);
		} else {
			throw new GLException("array offset argument \"ivalues_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
	}

	public static native boolean deleteContext(long arg0);

	public static native void deletePixelFormat(long arg0);

	public static native boolean flushBuffer(long arg0);

	public static native long getProcAddress(String arg0);

	public static native boolean makeCurrentContext(long arg0);

	private static native void queryPixelFormat1(long arg0, Object arg1, int arg2, int arg3, Object arg4, int arg5);

	public static void queryPixelFormat(long arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"iattrs_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		} else if (arg4 == null || arg4.length > arg5) {
			queryPixelFormat1(arg0, arg1, arg2 * 4, arg3, arg4, arg5 * 4);
		} else {
			throw new GLException("array offset argument \"ivalues_offset\" (" + arg5 + ") equals or exceeds array length (" + arg4.length + ")");
		}
	}

	public static native void setSwapInterval(long arg0, int arg1);

	public static native void updateContext(long arg0);
}
