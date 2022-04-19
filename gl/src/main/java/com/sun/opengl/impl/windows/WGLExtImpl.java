package com.sun.opengl.impl.windows;

import javax.media.opengl.GLException;

public class WGLExtImpl implements WGLExt {

	private WindowsGLContext _context;

	private native boolean dispatch_wglChoosePixelFormatARB1(long arg0, Object arg1, int arg2, Object arg3, int arg4, int arg5, Object arg6, int arg7, Object arg8, int arg9, long arg10);

	public boolean wglChoosePixelFormatARB(long arg0, int[] arg1, int arg2, float[] arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"piAttribIList_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		} else if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"pfAttribFList_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		} else if (arg6 != null && arg6.length <= arg7) {
			throw new GLException("array offset argument \"piFormats_offset\" (" + arg7 + ") equals or exceeds array length (" + arg6.length + ")");
		} else if (arg8 == null || arg8.length > arg9) {
			long var12 = this._context.getWGLExtProcAddressTable()._addressof_wglChoosePixelFormatARB;
			if (var12 == 0L) {
				throw new GLException("Method \"wglChoosePixelFormatARB\" not available");
			}
			return this.dispatch_wglChoosePixelFormatARB1(arg0, arg1, arg2 * 4, arg3, arg4 * 4, arg5, arg6, arg7 * 4, arg8, arg9 * 4, var12);
		} else {
			throw new GLException("array offset argument \"nNumFormats_offset\" (" + arg9 + ") equals or exceeds array length (" + arg8.length + ")");
		}
	}

	public String wglGetExtensionsStringEXT() {
		long var1 = this._context.getWGLExtProcAddressTable()._addressof_wglGetExtensionsStringEXT;
		if (var1 == 0L) {
			throw new GLException("Method \"wglGetExtensionsStringEXT\" not available");
		}
		return this.dispatch_wglGetExtensionsStringEXT0(var1);
	}

	public native String dispatch_wglGetExtensionsStringEXT0(long arg0);

	private native boolean dispatch_wglGetPixelFormatAttribivARB1(long arg0, int arg1, int arg2, int arg3, Object arg4, int arg5, Object arg6, int arg7, long arg8);

	public boolean wglGetPixelFormatAttribivARB(long arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7) {
		if (arg4 != null && arg4.length <= arg5) {
			throw new GLException("array offset argument \"piAttributes_offset\" (" + arg5 + ") equals or exceeds array length (" + arg4.length + ")");
		} else if (arg6 == null || arg6.length > arg7) {
			long var10 = this._context.getWGLExtProcAddressTable()._addressof_wglGetPixelFormatAttribivARB;
			if (var10 == 0L) {
				throw new GLException("Method \"wglGetPixelFormatAttribivARB\" not available");
			}
			return this.dispatch_wglGetPixelFormatAttribivARB1(arg0, arg1, arg2, arg3, arg4, arg5 * 4, arg6, arg7 * 4, var10);
		} else {
			throw new GLException("array offset argument \"piValues_offset\" (" + arg7 + ") equals or exceeds array length (" + arg6.length + ")");
		}
	}

	public boolean wglSwapIntervalEXT(int arg0) {
		long var2 = this._context.getWGLExtProcAddressTable()._addressof_wglSwapIntervalEXT;
		if (var2 == 0L) {
			throw new GLException("Method \"wglSwapIntervalEXT\" not available");
		}
		return this.dispatch_wglSwapIntervalEXT0(arg0, var2);
	}

	public native boolean dispatch_wglSwapIntervalEXT0(int arg0, long arg1);

	public WGLExtImpl(WindowsGLContext arg0) {
		this._context = arg0;
	}

	public boolean isExtensionAvailable(String arg0) {
		return this._context.isExtensionAvailable(arg0);
	}
}
