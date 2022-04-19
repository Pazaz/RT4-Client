package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.GLContextImpl;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLException;

public abstract class MacOSXGLContext extends GLContextImpl {

	protected MacOSXGLDrawable drawable;

	protected long nsContext;

	public MacOSXGLContext(MacOSXGLDrawable arg0) {
		this.drawable = arg0;
	}

	protected String mapToRealGLExtensionName(String arg0) {
		return arg0;
	}

	protected abstract boolean create();

	protected boolean create(boolean arg0, boolean arg1) {
		long var3 = 0L;
		int[] var5 = new int[1];
		GLCapabilities var6 = this.drawable.getCapabilities();
		int[] var7 = new int[128];
		int[] var8 = new int[128];
		int var9 = 0;
		if (arg0) {
			var7[var9] = 90;
			var8[var9] = 1;
			var9++;
		}
		if (arg1) {
			var7[var9] = 58;
			var8[var9] = 1;
			var9++;
		}
		var7[var9] = 5;
		var8[var9] = var6.getDoubleBuffered() ? 1 : 0;
		var9++;
		var7[var9] = 6;
		var8[var9] = var6.getStereo() ? 1 : 0;
		var9++;
		var7[var9] = 8;
		var8[var9] = var6.getRedBits() + var6.getGreenBits() + var6.getBlueBits();
		var9++;
		var7[var9] = 11;
		var8[var9] = var6.getAlphaBits();
		var9++;
		var7[var9] = 12;
		var8[var9] = var6.getDepthBits();
		var9++;
		var7[var9] = 14;
		var8[var9] = var6.getAccumRedBits() + var6.getAccumGreenBits() + var6.getAccumBlueBits() + var6.getAccumAlphaBits();
		var9++;
		var7[var9] = 13;
		var8[var9] = var6.getStencilBits();
		var9++;
		if (var6.getSampleBuffers()) {
			var7[var9] = 55;
			var8[var9] = 1;
			var9++;
			var7[var9] = 56;
			var8[var9] = var6.getNumSamples();
			var9++;
		}
		long var10 = CGL.createPixelFormat(var7, 0, var9, var8, 0);
		if (var10 == 0L) {
			throw new GLException("Unable to allocate pixel format with requested GLCapabilities");
		}
		try {
			this.nsContext = CGL.createContext(var3, this.drawable.getView(), var10, var5, 0);
			if (this.nsContext == 0L) {
				if (var5[0] == 1) {
					boolean var19 = false;
					return var19;
				}
				throw new GLException("Error creating NSOpenGLContext with requested pixel format");
			}
			if (this.drawable.getChosenGLCapabilities() == null) {
				GLCapabilities var12 = new GLCapabilities();
				CGL.queryPixelFormat(var10, var7, 0, var9, var8, 0);
				for (int var13 = 0; var13 < var9; var13++) {
					int var14 = var7[var13];
					int var15;
					switch(var14) {
						case 5:
							var12.setDoubleBuffered(var8[var13] != 0);
							break;
						case 6:
							var12.setStereo(var8[var13] != 0);
							break;
						case 8:
							var15 = var8[var13];
							if (var15 == 32) {
								var15 = 24;
							}
							var15 /= 3;
							var12.setRedBits(var15);
							var12.setGreenBits(var15);
							var12.setBlueBits(var15);
							break;
						case 11:
							var12.setAlphaBits(var8[var13]);
							break;
						case 12:
							var12.setDepthBits(var8[var13]);
							break;
						case 13:
							var12.setStencilBits(var8[var13]);
							break;
						case 14:
							var15 = var8[var13] / 4;
							var12.setAccumRedBits(var15);
							var12.setAccumGreenBits(var15);
							var12.setAccumBlueBits(var15);
							var12.setAccumAlphaBits(var15);
							break;
						case 55:
							var12.setSampleBuffers(var8[var13] != 0);
							break;
						case 56:
							var12.setNumSamples(var8[var13]);
							break;
						case 58:
							var12.setPbufferFloatingPointBuffers(var8[var13] != 0);
					}
				}
				this.drawable.setChosenGLCapabilities(var12);
			}
		} finally {
			CGL.deletePixelFormat(var10);
		}
		return true;
	}

	protected int makeCurrentImpl() throws GLException {
		boolean var1 = false;
		if (this.nsContext == 0L) {
			if (!this.create()) {
				return 0;
			}
			var1 = true;
		}
		if (!CGL.makeCurrentContext(this.nsContext)) {
			throw new GLException("Error making nsContext current");
		} else if (var1) {
			this.resetGLFunctionAvailability();
			return 2;
		} else {
			return 1;
		}
	}

	protected void releaseImpl() throws GLException {
		if (!CGL.clearCurrentContext(this.nsContext)) {
			throw new GLException("Error freeing OpenGL nsContext");
		}
	}

	protected void destroyImpl() throws GLException {
		if (this.nsContext != 0L) {
			if (!CGL.deleteContext(this.nsContext)) {
				throw new GLException("Unable to delete OpenGL context");
			}
			this.nsContext = 0L;
		}
	}

	public String getPlatformExtensionsString() {
		return "";
	}

	public void setSwapInterval(int arg0) {
		if (this.nsContext == 0L) {
			throw new GLException("OpenGL context not current");
		}
		CGL.setSwapInterval(this.nsContext, arg0);
	}

	public boolean isExtensionAvailable(String arg0) {
		return arg0.equals("GL_ARB_pbuffer") || arg0.equals("GL_ARB_pixel_format") ? true : super.isExtensionAvailable(arg0);
	}
}
