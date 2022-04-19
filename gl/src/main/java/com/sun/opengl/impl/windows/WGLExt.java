package com.sun.opengl.impl.windows;

public interface WGLExt {

	boolean wglChoosePixelFormatARB(long arg0, int[] arg1, int arg2, float[] arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9);

	String wglGetExtensionsStringEXT();

	boolean wglGetPixelFormatAttribivARB(long arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7);

	boolean wglSwapIntervalEXT(int arg0);

	boolean isExtensionAvailable(String arg0);
}
