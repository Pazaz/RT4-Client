package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.GLDrawableImpl;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

public abstract class WindowsGLDrawable extends GLDrawableImpl {

	protected long hdc;

	protected GLCapabilities capabilities;

	protected GLCapabilitiesChooser chooser;

	protected boolean pixelFormatChosen;

	public WindowsGLDrawable(GLCapabilities arg0, GLCapabilitiesChooser arg1) {
		this.capabilities = (GLCapabilities) arg0.clone();
		this.chooser = arg1;
	}

	public void setRealized(boolean arg0) {
		throw new GLException("Should not call this (should only be called for onscreen GLDrawables)");
	}

	public void swapBuffers() throws GLException {
	}

	public long getHDC() {
		return this.hdc;
	}

	protected void choosePixelFormat(boolean arg0) {
		PIXELFORMATDESCRIPTOR var2 = null;
		boolean var3 = false;
		GLCapabilities var4 = null;
		int var25;
		if (arg0) {
			if ((var25 = WGL.GetPixelFormat(this.hdc)) != 0) {
				var2 = newPixelFormatDescriptor();
				if (WGL.DescribePixelFormat(this.hdc, var25, PIXELFORMATDESCRIPTOR.size(), var2) == 0) {
					throw new GLException("Unable to describe pixel format " + var25 + " of window set by Java2D/OpenGL pipeline");
				}
				this.setChosenGLCapabilities(pfd2GLCapabilities(var2));
				this.pixelFormatChosen = true;
				return;
			}
			GLCapabilities[] var5 = null;
			int var6 = 0;
			var2 = newPixelFormatDescriptor();
			WindowsDummyGLDrawable var7 = null;
			WindowsGLContext var8 = null;
			WGLExt var9 = null;
			if (this.capabilities.getSampleBuffers()) {
				var7 = new WindowsDummyGLDrawable();
				var8 = (WindowsGLContext) var7.createContext(null);
				if (var8 != null) {
					var8.makeCurrent();
					var9 = (WGLExt) var8.getPlatformGLExtensions();
				}
			}
			int var10 = -1;
			boolean var11 = false;
			boolean var12 = false;
			boolean var13 = false;
			if (var9 != null) {
				try {
					var11 = var9.isExtensionAvailable("WGL_ARB_pixel_format");
					if (var11) {
						var12 = var9.isExtensionAvailable("WGL_ARB_multisample");
						int[] var14 = new int[512];
						int[] var15 = new int[512];
						float[] var16 = new float[1];
						if (glCapabilities2iattributes(this.capabilities, var14, var9, null)) {
							int[] var17 = new int[256];
							int[] var18 = new int[1];
							if (var9.wglChoosePixelFormatARB(this.hdc, var14, 0, var16, 0, 256, var17, 0, var18, 0)) {
								var6 = var18[0];
								if (var6 > 0) {
									var10 = var17[0] - 1;
								}
							}
							byte var19 = 0;
							var14[0] = 8192;
							if (var9.wglGetPixelFormatAttribivARB(this.hdc, 0, 0, 1, var14, 0, var15, 0)) {
								var6 = var15[0];
								int var35 = var19 + 1;
								var14[var19] = 8193;
								int var37 = var35 + 1;
								var14[var35] = 8195;
								int var39 = var37 + 1;
								var14[var37] = 8208;
								int var41 = var39 + 1;
								var14[var39] = 8226;
								int var44 = var41 + 1;
								var14[var41] = 8227;
								int var46 = var44 + 1;
								var14[var44] = 8209;
								int var48 = var46 + 1;
								var14[var46] = 8210;
								int var50 = var48 + 1;
								var14[var48] = 8211;
								int var52 = var50 + 1;
								var14[var50] = 8213;
								int var54 = var52 + 1;
								var14[var52] = 8215;
								int var55 = var54 + 1;
								var14[var54] = 8217;
								int var56 = var55 + 1;
								var14[var55] = 8219;
								int var57 = var56 + 1;
								var14[var56] = 8222;
								int var58 = var57 + 1;
								var14[var57] = 8223;
								int var59 = var58 + 1;
								var14[var58] = 8224;
								int var60 = var59 + 1;
								var14[var59] = 8225;
								if (var12) {
									var14[var60++] = 8257;
									var14[var60++] = 8258;
								}
								var5 = new GLCapabilities[var6];
								for (int var20 = 0; var20 < var6; var20++) {
									if (!var9.wglGetPixelFormatAttribivARB(this.hdc, var20 + 1, 0, var60, var14, 0, var15, 0)) {
										throw new GLException("Error getting pixel format attributes for pixel format " + (var20 + 1) + " of device context");
									}
									var5[var20] = iattributes2GLCapabilities(var14, var60, var15, true);
								}
								var13 = true;
							} else {
								long var43 = (long) WGL.GetLastError();
								if (var43 != 0L) {
									throw new GLException("Unable to enumerate pixel formats of window using wglGetPixelFormatAttribivARB: error code " + WGL.GetLastError());
								}
							}
						}
					}
				} finally {
					var8.release();
					var8.destroy();
					var7.destroy();
				}
			}
			if (!var13) {
				var2 = glCapabilities2PFD(this.capabilities, arg0);
				var10 = WGL.ChoosePixelFormat(this.hdc, var2) - 1;
				var6 = WGL.DescribePixelFormat(this.hdc, 1, 0, null);
				if (var6 == 0) {
					throw new GLException("Unable to enumerate pixel formats of window for GLCapabilitiesChooser");
				}
				var5 = new GLCapabilities[var6];
				for (int var28 = 0; var28 < var6; var28++) {
					if (WGL.DescribePixelFormat(this.hdc, var28 + 1, PIXELFORMATDESCRIPTOR.size(), var2) == 0) {
						throw new GLException("Error describing pixel format " + (var28 + 1) + " of device context");
					}
					var5[var28] = pfd2GLCapabilities(var2);
				}
			}
			int var26 = this.chooser.chooseCapabilities(this.capabilities, var5, var10);
			if (var26 < 0 || var26 >= var6) {
				throw new GLException("Invalid result " + var26 + " from GLCapabilitiesChooser (should be between 0 and " + (var6 - 1) + ")");
			}
			var4 = var5[var26];
			var25 = var26 + 1;
			if (WGL.DescribePixelFormat(this.hdc, var25, PIXELFORMATDESCRIPTOR.size(), var2) == 0) {
				throw new GLException("Error re-describing the chosen pixel format: " + WGL.GetLastError());
			}
		} else {
			var2 = glCapabilities2PFD(this.capabilities, arg0);
			var25 = WGL.ChoosePixelFormat(this.hdc, var2);
		}
		if (!WGL.SetPixelFormat(this.hdc, var25, var2)) {
			long var27 = (long) WGL.GetLastError();
			throw new GLException("Unable to set pixel format " + var25 + " for device context " + toHexString(this.hdc) + ": error code " + var27);
		}
		if (var4 == null) {
			this.setChosenGLCapabilities(pfd2GLCapabilities(var2));
		} else {
			this.setChosenGLCapabilities(var4);
		}
		this.pixelFormatChosen = true;
	}

	protected static PIXELFORMATDESCRIPTOR glCapabilities2PFD(GLCapabilities arg0, boolean arg1) {
		int var2 = arg0.getRedBits() + arg0.getGreenBits() + arg0.getBlueBits();
		if (var2 < 15) {
			throw new GLException("Bit depths < 15 (i.e., non-true-color) not supported");
		}
		PIXELFORMATDESCRIPTOR var3 = newPixelFormatDescriptor();
		int var4 = 4128;
		if (arg0.getDoubleBuffered()) {
			var4 |= 0x1;
		}
		if (arg1) {
			var4 |= 0x4;
		} else {
			var4 |= 0x8;
		}
		if (arg0.getStereo()) {
			var4 |= 0x2;
		}
		var3.dwFlags(var4);
		var3.iPixelType((byte) 0);
		var3.cColorBits((byte) var2);
		var3.cRedBits((byte) arg0.getRedBits());
		var3.cGreenBits((byte) arg0.getGreenBits());
		var3.cBlueBits((byte) arg0.getBlueBits());
		var3.cAlphaBits((byte) arg0.getAlphaBits());
		int var5 = arg0.getAccumRedBits() + arg0.getAccumGreenBits() + arg0.getAccumBlueBits();
		var3.cAccumBits((byte) var5);
		var3.cAccumRedBits((byte) arg0.getAccumRedBits());
		var3.cAccumGreenBits((byte) arg0.getAccumGreenBits());
		var3.cAccumBlueBits((byte) arg0.getAccumBlueBits());
		var3.cAccumAlphaBits((byte) arg0.getAccumAlphaBits());
		var3.cDepthBits((byte) arg0.getDepthBits());
		var3.cStencilBits((byte) arg0.getStencilBits());
		var3.iLayerType((byte) 0);
		return var3;
	}

	protected static PIXELFORMATDESCRIPTOR newPixelFormatDescriptor() {
		PIXELFORMATDESCRIPTOR var0 = PIXELFORMATDESCRIPTOR.create();
		var0.nSize((short) PIXELFORMATDESCRIPTOR.size());
		var0.nVersion((short) 1);
		return var0;
	}

	protected static GLCapabilities pfd2GLCapabilities(PIXELFORMATDESCRIPTOR arg0) {
		if ((arg0.dwFlags() & 0x20) == 0) {
			return null;
		}
		GLCapabilities var1 = new GLCapabilities();
		var1.setRedBits(arg0.cRedBits());
		var1.setGreenBits(arg0.cGreenBits());
		var1.setBlueBits(arg0.cBlueBits());
		var1.setAlphaBits(arg0.cAlphaBits());
		var1.setAccumRedBits(arg0.cAccumRedBits());
		var1.setAccumGreenBits(arg0.cAccumGreenBits());
		var1.setAccumBlueBits(arg0.cAccumBlueBits());
		var1.setAccumAlphaBits(arg0.cAccumAlphaBits());
		var1.setDepthBits(arg0.cDepthBits());
		var1.setStencilBits(arg0.cStencilBits());
		var1.setDoubleBuffered((arg0.dwFlags() & 0x1) != 0);
		var1.setStereo((arg0.dwFlags() & 0x2) != 0);
		var1.setHardwareAccelerated((arg0.dwFlags() & 0x40) == 0 || (arg0.dwFlags() & 0x1000) != 0);
		return var1;
	}

	protected static boolean glCapabilities2iattributes(GLCapabilities arg0, int[] arg1, WGLExt arg2, int[] arg3) throws GLException {
		if (!arg2.isExtensionAvailable("WGL_ARB_pixel_format")) {
			return false;
		}
		byte var4 = 0;
		int var5 = var4 + 1;
		arg1[var4] = 8208;
		int var6 = var5 + 1;
		arg1[var5] = 1;
		int var7 = var6 + 1;
		arg1[var6] = 8193;
		int var8 = var7 + 1;
		arg1[var7] = 1;
		int var9 = var8 + 1;
		arg1[var8] = 8209;
		if (arg0.getDoubleBuffered()) {
			var5 = var9 + 1;
			arg1[var9] = 1;
		} else {
			var5 = var9 + 1;
			arg1[var9] = 0;
		}
		arg1[var5++] = 8210;
		if (arg0.getStereo()) {
			arg1[var5++] = 1;
		} else {
			arg1[var5++] = 0;
		}
		arg1[var5++] = 8226;
		arg1[var5++] = arg0.getDepthBits();
		arg1[var5++] = 8213;
		arg1[var5++] = arg0.getRedBits();
		arg1[var5++] = 8215;
		arg1[var5++] = arg0.getGreenBits();
		arg1[var5++] = 8217;
		arg1[var5++] = arg0.getBlueBits();
		arg1[var5++] = 8219;
		arg1[var5++] = arg0.getAlphaBits();
		arg1[var5++] = 8227;
		arg1[var5++] = arg0.getStencilBits();
		if (arg0.getAccumRedBits() > 0 || arg0.getAccumGreenBits() > 0 || arg0.getAccumBlueBits() > 0 || arg0.getAccumAlphaBits() > 0) {
			arg1[var5++] = 8221;
			arg1[var5++] = arg0.getAccumRedBits() + arg0.getAccumGreenBits() + arg0.getAccumBlueBits() + arg0.getAccumAlphaBits();
			arg1[var5++] = 8222;
			arg1[var5++] = arg0.getAccumRedBits();
			arg1[var5++] = 8223;
			arg1[var5++] = arg0.getAccumGreenBits();
			arg1[var5++] = 8224;
			arg1[var5++] = arg0.getAccumBlueBits();
			arg1[var5++] = 8225;
			arg1[var5++] = arg0.getAccumAlphaBits();
		}
		if (arg2.isExtensionAvailable("WGL_ARB_multisample") && arg0.getSampleBuffers()) {
			arg1[var5++] = 8257;
			arg1[var5++] = 1;
			arg1[var5++] = 8258;
			arg1[var5++] = arg0.getNumSamples();
		}
		arg1[var5++] = 8211;
		arg1[var5++] = 8235;
		return true;
	}

	protected static GLCapabilities iattributes2GLCapabilities(int[] arg0, int arg1, int[] arg2, boolean arg3) {
		GLCapabilities var4 = new GLCapabilities();
		for (int var5 = 0; var5 < arg1; var5++) {
			int var6 = arg0[var5];
			switch(var6) {
				case 8193:
					if (arg3 && arg2[var5] != 1) {
						return null;
					}
					break;
				case 8195:
					var4.setHardwareAccelerated(arg2[var5] == 8231);
					break;
				case 8208:
					if (arg2[var5] != 1) {
						return null;
					}
					break;
				case 8209:
					var4.setDoubleBuffered(arg2[var5] == 1);
					break;
				case 8210:
					var4.setStereo(arg2[var5] == 1);
					break;
				case 8211:
					if (arg2[var5] == 8235 || arg2[var5] == 8608) {
						var4.setPbufferFloatingPointBuffers(true);
					}
					break;
				case 8213:
					var4.setRedBits(arg2[var5]);
					break;
				case 8215:
					var4.setGreenBits(arg2[var5]);
					break;
				case 8217:
					var4.setBlueBits(arg2[var5]);
					break;
				case 8219:
					var4.setAlphaBits(arg2[var5]);
					break;
				case 8222:
					var4.setAccumRedBits(arg2[var5]);
					break;
				case 8223:
					var4.setAccumGreenBits(arg2[var5]);
					break;
				case 8224:
					var4.setAccumBlueBits(arg2[var5]);
					break;
				case 8225:
					var4.setAccumAlphaBits(arg2[var5]);
					break;
				case 8226:
					var4.setDepthBits(arg2[var5]);
					break;
				case 8227:
					var4.setStencilBits(arg2[var5]);
				case 8237:
					break;
				case 8257:
					var4.setSampleBuffers(arg2[var5] != 0);
					break;
				case 8258:
					var4.setNumSamples(arg2[var5]);
					break;
				case 8368:
					if (arg2[var5] != 0) {
						var4.setPbufferFloatingPointBuffers(true);
					}
					break;
				default:
					throw new GLException("Unknown pixel format attribute " + arg0[var5]);
			}
		}
		return var4;
	}
}
