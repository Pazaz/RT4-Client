package com.sun.opengl.impl.mipmap;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GLException;

public class Mipmap {

	public static int computeLog(int arg0) {
		int var1 = 0;
		if (arg0 == 0) {
			return -1;
		}
		while ((arg0 & 0x1) < 1) {
			arg0 >>= 0x1;
			var1++;
		}
		return arg0 == 1 ? var1 : -1;
	}

	public static int nearestPower(int arg0) {
		int var1 = 1;
		if (arg0 == 0) {
			return -1;
		}
		while (arg0 != 1) {
			if (arg0 == 3) {
				return var1 * 4;
			}
			arg0 >>= 0x1;
			var1 *= 2;
		}
		return var1;
	}

	public static short GLU_SWAP_2_BYTES(short arg0) {
		boolean var1 = false;
		byte var3 = (byte) (arg0 >>> 8);
		short var2 = (short) (arg0 << 8);
		return (short) (var2 | var3 & 0xFF);
	}

	public static int GLU_SWAP_4_BYTES(int arg0) {
		int var1 = arg0 << 24;
		int var2 = var1 | (arg0 & 0xFF00) << 8;
		int var3 = var2 | arg0 >>> 8 & 0xFF00;
		return var3 | arg0 >>> 24 & 0xFF;
	}

	public static float GLU_SWAP_4_BYTES(float arg0) {
		int var1 = Float.floatToRawIntBits(arg0);
		return Float.intBitsToFloat(var1);
	}

	public static int checkMipmapArgs(int arg0, int arg1, int arg2) {
		if (!legalFormat(arg1) || !legalType(arg2)) {
			return 100900;
		} else if (arg1 == 6401) {
			return 100900;
		} else if (isLegalFormatForPackedPixelType(arg1, arg2)) {
			return 0;
		} else {
			return 100904;
		}
	}

	public static boolean legalFormat(int arg0) {
		switch(arg0) {
			case 6400:
			case 6401:
			case 6402:
			case 6403:
			case 6404:
			case 6405:
			case 6406:
			case 6407:
			case 6408:
			case 6409:
			case 6410:
			case 32992:
			case 32993:
				return true;
			default:
				return false;
		}
	}

	public static boolean legalType(int arg0) {
		switch(arg0) {
			case 5120:
			case 5121:
			case 5122:
			case 5123:
			case 5124:
			case 5125:
			case 5126:
			case 6656:
			case 32818:
			case 32819:
			case 32820:
			case 32821:
			case 32822:
			case 33634:
			case 33635:
			case 33636:
			case 33637:
			case 33638:
			case 33639:
			case 33640:
				return true;
			default:
				return false;
		}
	}

	public static boolean isTypePackedPixel(int arg0) {
		assert legalType(arg0);
		return arg0 == 32818 || arg0 == 33634 || arg0 == 33635 || arg0 == 33636 || arg0 == 32819 || arg0 == 33637 || arg0 == 32820 || arg0 == 33638 || arg0 == 32821 || arg0 == 33639 || arg0 == 32822 || arg0 == 33640;
	}

	public static boolean isLegalFormatForPackedPixelType(int arg0, int arg1) {
		if (isTypePackedPixel(arg1)) {
			return true;
		} else if ((arg1 == 32818 || arg1 == 33634 || arg1 == 33635 || arg1 == 33636) & arg0 != 6407) {
			return false;
		} else {
			return arg1 != 32819 && arg1 != 33637 && arg1 != 32820 && arg1 != 33638 && arg1 != 32821 && arg1 != 33639 && arg1 != 32822 && arg1 != 33640 || arg0 == 6408 || arg0 == 32993;
		}
	}

	public static void closestFit(GL arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
		if (Double.parseDouble(arg0.glGetString(GL.GL_VERSION).trim().substring(0, 3)) >= 1.1D) {
			int var9 = nearestPower(arg2);
			int var10 = nearestPower(arg3);
			int[] var11 = new int[1];
			boolean var12 = false;
			try {
				do {
					int var13 = arg2 > 1 ? var9 >> 1 : var9;
					int var14 = arg3 > 1 ? var10 >> 1 : var10;
					assert var13 > 0;
					assert var14 > 0;
					int var15;
					if (arg1 == 3553 || arg1 == 32868) {
						var15 = 32868;
						arg0.glTexImage2D(var15, 1, arg4, var13, var14, 0, arg5, arg6, null);
					} else if (arg1 == 34069 || arg1 == 34070 || arg1 == 34071 || arg1 == 34072 || arg1 == 34073 || arg1 == 34074) {
						var15 = 34075;
						arg0.glTexImage2D(var15, 1, arg4, var13, var14, 0, arg5, arg6, null);
					} else {
						assert arg1 == 3552 || arg1 == 32867;
						var15 = 32867;
						arg0.glTexImage1D(var15, 1, arg4, var13, 0, arg5, arg6, null);
					}
					arg0.glGetTexLevelParameteriv(var15, GL.GL_LINES, GL.GL_TEXTURE_WIDTH, var11, 0);
					if (var11[0] == 0) {
						if (var9 == 1 && var10 == 1) {
							var12 = true;
							break;
						}
						var9 = var13;
						var10 = var14;
					}
				} while (var11[0] == 0);
			} catch (GLException var16) {
				var12 = true;
			}
			if (!var12) {
				arg7[0] = var9;
				arg8[0] = var10;
				return;
			}
		}
		int[] var17 = new int[1];
		arg0.glGetIntegerv(GL.GL_MAX_TEXTURE_SIZE, var17, 0);
		arg7[0] = nearestPower(arg2);
		if (arg7[0] > var17[0]) {
			arg7[0] = var17[0];
		}
		arg8[0] = nearestPower(arg3);
		if (arg8[0] > var17[0]) {
			arg8[0] = var17[0];
		}
	}

	public static int elements_per_group(int arg0, int arg1) {
		if (arg1 == 32818 || arg1 == 33634 || arg1 == 33635 || arg1 == 33636 || arg1 == 32819 || arg1 == 33637 || arg1 == 32820 || arg1 == 33638 || arg1 == 32821 || arg1 == 33639 || arg1 == 32822 || arg1 == 33640) {
			return 1;
		}
		switch(arg0) {
			case 6407:
			case 32992:
				return 3;
			case 6408:
			case 32993:
				return 4;
			case 6410:
				return 2;
			default:
				return 1;
		}
	}

	public static int bytes_per_element(int arg0) {
		switch(arg0) {
			case 5120:
			case 5121:
			case 6656:
			case 32818:
			case 33634:
				return 1;
			case 5122:
			case 5123:
			case 32819:
			case 32820:
			case 33635:
			case 33636:
			case 33637:
			case 33638:
				return 2;
			case 5124:
			case 5125:
			case 5126:
			case 32821:
			case 32822:
			case 33639:
			case 33640:
				return 4;
			default:
				return 4;
		}
	}

	public static boolean is_index(int arg0) {
		return arg0 == 6400 || arg0 == 6401;
	}

	public static int image_size(int arg0, int arg1, int arg2, int arg3) {
		assert arg0 > 0;
		assert arg1 > 0;
		int var5 = elements_per_group(arg2, arg3);
		int var4;
		if (arg3 == 6656) {
			var4 = (arg0 + 7) / 8;
		} else {
			var4 = bytes_per_element(arg3) * arg0;
		}
		return var4 * arg1 * var5;
	}

	public static void retrieveStoreModes(GL arg0, PixelStorageModes arg1) {
		int[] var2 = new int[1];
		arg0.glGetIntegerv(GL.GL_UNPACK_ALIGNMENT, var2, 0);
		arg1.setUnpackAlignment(var2[0]);
		arg0.glGetIntegerv(GL.GL_UNPACK_ROW_LENGTH, var2, 0);
		arg1.setUnpackRowLength(var2[0]);
		arg0.glGetIntegerv(GL.GL_UNPACK_SKIP_ROWS, var2, 0);
		arg1.setUnpackSkipRows(var2[0]);
		arg0.glGetIntegerv(GL.GL_UNPACK_SKIP_PIXELS, var2, 0);
		arg1.setUnpackSkipPixels(var2[0]);
		arg0.glGetIntegerv(GL.GL_UNPACK_LSB_FIRST, var2, 0);
		arg1.setUnpackLsbFirst(var2[0] == 1);
		arg0.glGetIntegerv(GL.GL_UNPACK_SWAP_BYTES, var2, 0);
		arg1.setUnpackSwapBytes(var2[0] == 1);
		arg0.glGetIntegerv(GL.GL_PACK_ALIGNMENT, var2, 0);
		arg1.setPackAlignment(var2[0]);
		arg0.glGetIntegerv(GL.GL_PACK_ROW_LENGTH, var2, 0);
		arg1.setPackRowLength(var2[0]);
		arg0.glGetIntegerv(GL.GL_PACK_SKIP_ROWS, var2, 0);
		arg1.setPackSkipRows(var2[0]);
		arg0.glGetIntegerv(GL.GL_PACK_SKIP_PIXELS, var2, 0);
		arg1.setPackSkipPixels(var2[0]);
		arg0.glGetIntegerv(GL.GL_PACK_LSB_FIRST, var2, 0);
		arg1.setPackLsbFirst(var2[0] == 1);
		arg0.glGetIntegerv(GL.GL_PACK_SWAP_BYTES, var2, 0);
		arg1.setPackSwapBytes(var2[0] == 1);
	}

	public static int gluBuild2DMipmaps(GL arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Object arg7) {
		int var8 = 0;
		int[] var9 = new int[1];
		int[] var10 = new int[1];
		int var13 = checkMipmapArgs(arg2, arg5, arg6);
		if (var13 != 0) {
			return var13;
		} else if (arg3 >= 1 && arg4 >= 1) {
			closestFit(arg0, arg1, arg3, arg4, arg2, arg5, arg6, var9, var10);
			int var12 = computeLog(var9[0]);
			int var11 = computeLog(var10[0]);
			if (var11 > var12) {
				var12 = var11;
			}
			ByteBuffer var14 = null;
			if (arg7 instanceof ByteBuffer) {
				var14 = (ByteBuffer) arg7;
				var8 = var14.position();
			} else if (arg7 instanceof byte[]) {
				byte[] var15 = (byte[]) arg7;
				var14 = ByteBuffer.allocateDirect(var15.length);
				var14.put(var15);
			} else if (arg7 instanceof short[]) {
				short[] var20 = (short[]) arg7;
				var14 = ByteBuffer.allocateDirect(var20.length * 2);
				ShortBuffer var16 = var14.asShortBuffer();
				var16.put(var20);
			} else if (arg7 instanceof int[]) {
				int[] var21 = (int[]) arg7;
				var14 = ByteBuffer.allocateDirect(var21.length * 4);
				IntBuffer var24 = var14.asIntBuffer();
				var24.put(var21);
			} else if (arg7 instanceof float[]) {
				float[] var22 = (float[]) arg7;
				var14 = ByteBuffer.allocateDirect(var22.length * 4);
				FloatBuffer var25 = var14.asFloatBuffer();
				var25.put(var22);
			}
			int var23;
			try {
				var23 = BuildMipmap.gluBuild2DMipmapLevelsCore(arg0, arg1, arg2, arg3, arg4, var9[0], var10[0], arg5, arg6, 0, 0, var12, var14);
			} finally {
				var14.position(var8);
			}
			return var23;
		} else {
			return 100901;
		}
	}
}
