package com.sun.opengl.impl.x11;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GLException;

public class GLX {

	private static GLXProcAddressTable glxProcAddressTable = new GLXProcAddressTable();

	private static native ByteBuffer XGetVisualInfo1(long arg0, long arg1, ByteBuffer arg2, Object arg3, int arg4);

	public static XVisualInfo[] XGetVisualInfo(long arg0, long arg1, XVisualInfo arg2, int[] arg3, int arg4) {
		if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"arg3_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
		ByteBuffer var7 = XGetVisualInfo1(arg0, arg1, arg2 == null ? null : arg2.getBuffer(), arg3, arg4 * 4);
		if (var7 == null) {
			return null;
		}
		var7.order(ByteOrder.nativeOrder());
		XVisualInfo[] var8 = new XVisualInfo[getFirstElement(arg3, arg4)];
		for (int var9 = 0; var9 < getFirstElement(arg3, arg4); var9++) {
			var7.position(var9 * XVisualInfo.size());
			var7.limit((var9 + 1) * XVisualInfo.size());
			ByteBuffer var10 = var7.slice();
			var10.order(ByteOrder.nativeOrder());
			var7.position(0);
			var7.limit(var7.capacity());
			var8[var9] = XVisualInfo.create(var10);
		}
		return var8;
	}

	public static native long XOpenDisplay(String arg0);

	public static native boolean XineramaEnabled(long arg0);

	public static long glXCreateContext(long arg0, XVisualInfo arg1, long arg2, boolean arg3) {
		return glXCreateContext0(arg0, arg1 == null ? null : arg1.getBuffer(), arg2, arg3);
	}

	private static native long glXCreateContext0(long arg0, ByteBuffer arg1, long arg2, boolean arg3);

	public static native void glXDestroyContext(long arg0, long arg1);

	public static native String glXGetClientString(long arg0, int arg1);

	private static native int glXGetConfig1(long arg0, ByteBuffer arg1, int arg2, Object arg3, int arg4);

	public static int glXGetConfig(long arg0, XVisualInfo arg1, int arg2, int[] arg3, int arg4) {
		if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"value_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
		return glXGetConfig1(arg0, arg1 == null ? null : arg1.getBuffer(), arg2, arg3, arg4 * 4);
	}

	public static native long glXGetProcAddressARB(String arg0);

	public static native boolean glXMakeCurrent(long arg0, long arg1, long arg2);

	public static native String glXQueryExtensionsString(long arg0, int arg1);

	public static native void glXSwapBuffers(long arg0, long arg1);

	public static GLXProcAddressTable getGLXProcAddressTable() {
		return glxProcAddressTable;
	}

	public static native int DefaultScreen(long arg0);

	private static int getFirstElement(int[] arg0, int arg1) {
		return arg0[arg1];
	}
}
