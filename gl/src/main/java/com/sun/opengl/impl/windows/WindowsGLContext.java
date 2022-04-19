package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.GLContextImpl;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GLException;

public class WindowsGLContext extends GLContextImpl {

	protected WindowsGLDrawable drawable;

	protected long hglrc;

	private boolean wglGetExtensionsStringEXTInitialized;

	private boolean wglGetExtensionsStringEXTAvailable;

	private static final Map functionNameMap = new HashMap();

	private static final Map extensionNameMap;

	private WGLExt wglExt;

	private WGLExtProcAddressTable wglExtProcAddressTable;

	public WindowsGLContext(WindowsGLDrawable arg0) {
		this.drawable = arg0;
	}

	public Object getPlatformGLExtensions() {
		return this.getWGLExt();
	}

	public WGLExt getWGLExt() {
		if (this.wglExt == null) {
			this.wglExt = new WGLExtImpl(this);
		}
		return this.wglExt;
	}

	protected String mapToRealGLExtensionName(String arg0) {
		String var2 = (String) extensionNameMap.get(arg0);
		return var2 == null ? arg0 : var2;
	}

	protected void create() {
		if (this.drawable.getHDC() == 0L) {
			throw new GLException("Internal error: attempted to create OpenGL context without an associated drawable");
		}
		this.hglrc = WGL.wglCreateContext(this.drawable.getHDC());
		if (this.hglrc == 0L) {
			throw new GLException("Unable to create OpenGL context for device context " + toHexString(this.drawable.getHDC()));
		}
	}

	protected int makeCurrentImpl() throws GLException {
		boolean var1 = false;
		if (this.hglrc == 0L) {
			this.create();
			var1 = true;
		}
		if (!WGL.wglMakeCurrent(this.drawable.getHDC(), this.hglrc)) {
			throw new GLException("Error making context current: " + WGL.GetLastError());
		} else if (var1) {
			this.resetGLFunctionAvailability();
			return 2;
		} else {
			return 1;
		}
	}

	protected void releaseImpl() throws GLException {
		if (!WGL.wglMakeCurrent(0L, 0L)) {
			throw new GLException("Error freeing OpenGL context: " + WGL.GetLastError());
		}
	}

	protected void destroyImpl() throws GLException {
		if (this.hglrc != 0L) {
			if (!WGL.wglDeleteContext(this.hglrc)) {
				throw new GLException("Unable to delete OpenGL context");
			}
			this.hglrc = 0L;
		}
	}

	protected void resetGLFunctionAvailability() {
		super.resetGLFunctionAvailability();
		this.resetProcAddressTable(this.getWGLExtProcAddressTable());
	}

	public WGLExtProcAddressTable getWGLExtProcAddressTable() {
		if (this.wglExtProcAddressTable == null) {
			this.wglExtProcAddressTable = new WGLExtProcAddressTable();
		}
		return this.wglExtProcAddressTable;
	}

	public String getPlatformExtensionsString() {
		if (!this.wglGetExtensionsStringEXTInitialized) {
			this.wglGetExtensionsStringEXTAvailable = WGL.wglGetProcAddress("wglGetExtensionsStringEXT") != 0L;
			this.wglGetExtensionsStringEXTInitialized = true;
		}
		return this.wglGetExtensionsStringEXTAvailable ? this.getWGLExt().wglGetExtensionsStringEXT() : "";
	}

	public void setSwapInterval(int arg0) {
		WGLExt var2 = this.getWGLExt();
		if (var2.isExtensionAvailable("WGL_EXT_swap_control")) {
			var2.wglSwapIntervalEXT(arg0);
		}
	}

	static {
		functionNameMap.put("glAllocateMemoryNV", "wglAllocateMemoryNV");
		functionNameMap.put("glFreeMemoryNV", "wglFreeMemoryNV");
		extensionNameMap = new HashMap();
		extensionNameMap.put("GL_ARB_pbuffer", "WGL_ARB_pbuffer");
		extensionNameMap.put("GL_ARB_pixel_format", "WGL_ARB_pixel_format");
	}
}
