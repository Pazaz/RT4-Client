package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;

public class WGL {

	public static int ChoosePixelFormat(long arg0, PIXELFORMATDESCRIPTOR arg1) {
		return ChoosePixelFormat0(arg0, arg1 == null ? null : arg1.getBuffer());
	}

	private static native int ChoosePixelFormat0(long arg0, ByteBuffer arg1);

	public static native long CreateDummyWindow(int arg0, int arg1, int arg2, int arg3);

	public static int DescribePixelFormat(long arg0, int arg1, int arg2, PIXELFORMATDESCRIPTOR arg3) {
		return DescribePixelFormat0(arg0, arg1, arg2, arg3 == null ? null : arg3.getBuffer());
	}

	private static native int DescribePixelFormat0(long arg0, int arg1, int arg2, ByteBuffer arg3);

	public static native boolean DestroyWindow(long arg0);

	public static native long GetDC(long arg0);

	public static native int GetLastError();

	public static native int GetPixelFormat(long arg0);

	public static native int ReleaseDC(long arg0, long arg1);

	public static boolean SetPixelFormat(long arg0, int arg1, PIXELFORMATDESCRIPTOR arg2) {
		return SetPixelFormat0(arg0, arg1, arg2 == null ? null : arg2.getBuffer());
	}

	private static native boolean SetPixelFormat0(long arg0, int arg1, ByteBuffer arg2);

	public static native boolean ShowWindow(long arg0, int arg1);

	public static native boolean SwapBuffers(long arg0);

	public static native long wglCreateContext(long arg0);

	public static native boolean wglDeleteContext(long arg0);

	public static native long wglGetProcAddress(String arg0);

	public static native boolean wglMakeCurrent(long arg0, long arg1);
}
