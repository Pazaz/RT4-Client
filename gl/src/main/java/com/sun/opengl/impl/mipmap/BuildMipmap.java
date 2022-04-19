package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.media.opengl.GL;

public class BuildMipmap {

	public static int bitmapBuild2DMipmaps(GL arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ByteBuffer arg7) {
		int[] var8 = new int[1];
		int[] var9 = new int[1];
		ShortBuffer var12 = null;
		ShortBuffer var15 = null;
		ShortBuffer var16 = null;
		PixelStorageModes var20 = new PixelStorageModes();
		Mipmap.retrieveStoreModes(arg0, var20);
		Mipmap.closestFit(arg0, arg1, arg3, arg4, arg2, arg5, arg6, var8, var9);
		int var11 = Mipmap.computeLog(var8[0]);
		int var10 = Mipmap.computeLog(var9[0]);
		if (var10 > var11) {
			var11 = var10;
		}
		try {
			var12 = ByteBuffer.allocateDirect(Mipmap.image_size(arg3, arg4, arg5, 5123)).order(ByteOrder.nativeOrder()).asShortBuffer();
		} catch (OutOfMemoryError var22) {
			return 100902;
		}
		int var13 = arg3;
		int var14 = arg4;
		Image.fill_image(var20, arg3, arg4, arg5, arg6, Mipmap.is_index(arg5), arg7, var12);
		int var19 = Mipmap.elements_per_group(arg5, arg6);
		arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, GL.GL_LINE_LOOP);
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, GL.GL_POINTS);
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, GL.GL_POINTS);
		arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, GL.GL_POINTS);
		arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, GL.GL_POINTS);
		for (var10 = 0; var10 < var11; var10++) {
			if (var13 == var8[0] && var14 == var9[0]) {
				var12.rewind();
				arg0.glTexImage2D(arg1, var10, arg2, var13, var14, 0, arg5, GL.GL_UNSIGNED_SHORT, var12);
			} else {
				if (var15 == null) {
					int var17 = Mipmap.image_size(var8[0], var9[0], arg5, 5123);
					try {
						var15 = ByteBuffer.allocateDirect(var17).order(ByteOrder.nativeOrder()).asShortBuffer();
					} catch (OutOfMemoryError var23) {
						arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var20.getUnpackAlignment());
						arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var20.getUnpackSkipRows());
						arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var20.getUnpackSkipPixels());
						arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var20.getUnpackRowLength());
						arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var20.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
						return 100902;
					}
				}
				ScaleInternal.scale_internal(var19, var13, var14, var12, var8[0], var9[0], var15);
				var16 = var15;
				var15 = var12;
				var12 = var16;
				var13 = var8[0];
				var14 = var9[0];
				var16.rewind();
				arg0.glTexImage2D(arg1, var10, arg2, var13, var14, 0, arg5, GL.GL_UNSIGNED_SHORT, var16);
			}
			if (var9[0] > 1) {
				var8[0] /= 2;
			}
			if (var9[0] > 1) {
				var9[0] /= 2;
			}
		}
		arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var20.getUnpackAlignment());
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var20.getUnpackSkipRows());
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var20.getUnpackSkipPixels());
		arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var20.getUnpackRowLength());
		arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var20.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
		return 0;
	}

	public static int gluBuild2DMipmapLevelsCore(GL arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, ByteBuffer arg12) {
		ByteBuffer var18 = null;
		ByteBuffer var19 = null;
		ByteBuffer var20 = null;
		Object var23 = null;
		PixelStorageModes var33 = new PixelStorageModes();
		assert Mipmap.checkMipmapArgs(arg2, arg7, arg8) == 0;
		assert arg3 >= 1 && arg4 >= 1;
		if (arg8 == 6656) {
			return bitmapBuild2DMipmaps(arg0, arg1, arg2, arg3, arg4, arg7, arg8, arg12);
		}
		int var13 = arg5;
		int var14 = arg6;
		int var16 = Mipmap.computeLog(arg5);
		int var15 = Mipmap.computeLog(arg6);
		if (var15 > var16) {
			var16 = var15;
		}
		var16 += arg9;
		Mipmap.retrieveStoreModes(arg0, var33);
		boolean var27 = var33.getUnpackSwapBytes();
		int var26 = Mipmap.elements_per_group(arg7, arg8);
		int var28;
		if (var33.getUnpackRowLength() > 0) {
			var28 = var33.getUnpackRowLength();
		} else {
			var28 = arg3;
		}
		int var29 = Mipmap.bytes_per_element(arg8);
		int var30 = var29 * var26;
		if (var29 == 1) {
			var27 = false;
		}
		int var31 = var28 * var30;
		int var32 = var31 % var33.getUnpackAlignment();
		if (var32 != 0) {
			var31 += var33.getUnpackAlignment() - var32;
		}
		arg12.position(var33.getUnpackSkipRows() * var31 + var33.getUnpackSkipPixels() * var30);
		arg12.mark();
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, GL.GL_POINTS);
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, GL.GL_POINTS);
		arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, GL.GL_POINTS);
		int var24;
		int var34;
		int var35;
		if (arg3 == arg5 && arg4 == arg6) {
			if (arg10 <= arg9 && arg9 <= arg11) {
				arg12.rewind();
				arg0.glTexImage2D(arg1, arg9, arg2, arg3, arg4, 0, arg7, arg8, arg12);
			}
			if (var16 == 0) {
				arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
				arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
				arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
				return 0;
			}
			var34 = arg5 / 2;
			var35 = arg6 / 2;
			if (var34 < 1) {
				var34 = 1;
			}
			if (var35 < 1) {
				var35 = 1;
			}
			var24 = Mipmap.image_size(var34, var35, arg7, arg8);
			try {
				switch(arg8) {
					case 5120:
					case 5121:
					case 5122:
					case 5123:
					case 5124:
					case 5125:
					case 5126:
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
						var19 = ByteBuffer.allocateDirect(var24).order(ByteOrder.nativeOrder());
						break;
					default:
						return 100900;
				}
			} catch (OutOfMemoryError var45) {
				arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
				arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
				arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
				return 100902;
			}
			if (var19 != null) {
				switch(arg8) {
					case 5120:
						HalveImage.halveImage_byte(var26, arg3, arg4, arg12, var19, var29, var31, var30);
						break;
					case 5121:
						HalveImage.halveImage_ubyte(var26, arg3, arg4, arg12, var19, var29, var31, var30);
						break;
					case 5122:
						HalveImage.halveImage_short(var26, arg3, arg4, arg12, var19.asShortBuffer(), var29, var31, var30, var27);
						break;
					case 5123:
						HalveImage.halveImage_ushort(var26, arg3, arg4, arg12, var19.asShortBuffer(), var29, var31, var30, var27);
						break;
					case 5124:
						HalveImage.halveImage_int(var26, arg3, arg4, arg12, var19.asIntBuffer(), var29, var31, var30, var27);
						break;
					case 5125:
						HalveImage.halveImage_uint(var26, arg3, arg4, arg12, var19.asIntBuffer(), var29, var31, var30, var27);
						break;
					case 5126:
						HalveImage.halveImage_float(var26, arg3, arg4, arg12, var19.asFloatBuffer(), var29, var31, var30, var27);
						break;
					case 32818:
						assert arg7 == 6407;
						HalveImage.halveImagePackedPixel(3, new Extract332(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 32819:
						HalveImage.halveImagePackedPixel(4, new Extract4444(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 32820:
						HalveImage.halveImagePackedPixel(4, new Extract5551(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 32821:
						HalveImage.halveImagePackedPixel(4, new Extract8888(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 32822:
						HalveImage.halveImagePackedPixel(4, new Extract1010102(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33634:
						assert arg7 == 6407;
						HalveImage.halveImagePackedPixel(3, new Extract233rev(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33635:
						HalveImage.halveImagePackedPixel(3, new Extract565(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33636:
						HalveImage.halveImagePackedPixel(3, new Extract565rev(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33637:
						HalveImage.halveImagePackedPixel(4, new Extract4444rev(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33638:
						HalveImage.halveImagePackedPixel(4, new Extract1555rev(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33639:
						HalveImage.halveImagePackedPixel(4, new Extract8888rev(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					case 33640:
						HalveImage.halveImagePackedPixel(4, new Extract2101010rev(), arg3, arg4, arg12, var19, var29, var31, var27);
						break;
					default:
						assert false;
				}
			}
			var13 = arg3 / 2;
			var14 = arg4 / 2;
			if (var13 < 1) {
				var13 = 1;
			}
			if (var14 < 1) {
				var14 = 1;
			}
			var27 = false;
			var31 = var13 * var30;
			var24 = Mipmap.image_size(var13, var14, arg7, arg8);
			var18 = var19;
			try {
				switch(arg8) {
					case 5120:
					case 5121:
					case 5122:
					case 5123:
					case 5124:
					case 5125:
					case 5126:
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
						var19 = ByteBuffer.allocateDirect(var24).order(ByteOrder.nativeOrder());
						break;
					default:
						return 100900;
				}
			} catch (OutOfMemoryError var44) {
				arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
				arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
				arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
				return 100902;
			}
			var15 = arg9 + 1;
		} else {
			var24 = Mipmap.image_size(arg5, arg6, arg7, arg8);
			try {
				switch(arg8) {
					case 5120:
					case 5121:
					case 5122:
					case 5123:
					case 5124:
					case 5125:
					case 5126:
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
						var19 = ByteBuffer.allocateDirect(var24).order(ByteOrder.nativeOrder());
						break;
					default:
						return 100900;
				}
			} catch (OutOfMemoryError var46) {
				arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
				arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
				arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
				arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
				return 100902;
			}
			arg12.reset();
			switch(arg8) {
				case 5120:
					ScaleInternal.scale_internal_byte(var26, arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var30);
					break;
				case 5121:
					ScaleInternal.scale_internal_ubyte(var26, arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var30);
					break;
				case 5122:
					ScaleInternal.scale_internal_ushort(var26, arg3, arg4, arg12, arg5, arg6, var19.asShortBuffer(), var29, var31, var30, var27);
					break;
				case 5123:
					ScaleInternal.scale_internal_ushort(var26, arg3, arg4, arg12, arg5, arg6, var19.asShortBuffer(), var29, var31, var30, var27);
					break;
				case 5124:
					ScaleInternal.scale_internal_int(var26, arg3, arg4, arg12, arg5, arg6, var19.asIntBuffer(), var29, var31, var30, var27);
					break;
				case 5125:
					ScaleInternal.scale_internal_uint(var26, arg3, arg4, arg12, arg5, arg6, var19.asIntBuffer(), var29, var31, var30, var27);
					break;
				case 5126:
					ScaleInternal.scale_internal_float(var26, arg3, arg4, arg12, arg5, arg6, var19.asFloatBuffer(), var29, var31, var30, var27);
					break;
				case 32818:
					ScaleInternal.scaleInternalPackedPixel(3, new Extract332(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 32819:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract4444(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 32820:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract5551(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 32821:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract8888(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 32822:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract1010102(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33634:
					ScaleInternal.scaleInternalPackedPixel(3, new Extract233rev(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33635:
					ScaleInternal.scaleInternalPackedPixel(3, new Extract565(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33636:
					ScaleInternal.scaleInternalPackedPixel(3, new Extract565rev(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33637:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract4444rev(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33638:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract1555rev(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33639:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract8888rev(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				case 33640:
					ScaleInternal.scaleInternalPackedPixel(4, new Extract2101010rev(), arg3, arg4, arg12, arg5, arg6, var19, var29, var31, var27);
					break;
				default:
					assert false;
			}
			var27 = false;
			var31 = arg5 * var30;
			var20 = var18;
			var18 = var19;
			var19 = var20;
			if (var16 != 0) {
				var34 = arg5 / 2;
				var35 = arg6 / 2;
				if (var34 < 1) {
					var34 = 1;
				}
				if (var35 < 1) {
					var35 = 1;
				}
				var24 = Mipmap.image_size(var34, var35, arg7, arg8);
				try {
					switch(arg8) {
						case 5120:
						case 5121:
						case 5122:
						case 5123:
						case 5124:
						case 5125:
						case 5126:
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
							var19 = ByteBuffer.allocateDirect(var24).order(ByteOrder.nativeOrder());
							break;
						default:
							return 100900;
					}
				} catch (OutOfMemoryError var42) {
					arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
					arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
					arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
					arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
					arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
					return 100902;
				}
			}
			var15 = arg9;
		}
		arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, GL.GL_POINTS);
		if (arg10 <= var15 && var15 <= arg11) {
			var18.rewind();
			arg0.glTexImage2D(arg1, var15, arg2, var13, var14, 0, arg7, arg8, var18);
		}
		var15++;
		while (var15 <= var16) {
			var18.rewind();
			var19.rewind();
			switch(arg8) {
				case 5120:
					HalveImage.halveImage_byte(var26, var13, var14, var18, var19, var29, var31, var30);
					break;
				case 5121:
					HalveImage.halveImage_ubyte(var26, var13, var14, var18, var19, var29, var31, var30);
					break;
				case 5122:
					HalveImage.halveImage_short(var26, var13, var14, var18, var19.asShortBuffer(), var29, var31, var30, var27);
					break;
				case 5123:
					HalveImage.halveImage_ushort(var26, var13, var14, var18, var19.asShortBuffer(), var29, var31, var30, var27);
					break;
				case 5124:
					HalveImage.halveImage_int(var26, var13, var14, var18, var19.asIntBuffer(), var29, var31, var30, var27);
					break;
				case 5125:
					HalveImage.halveImage_uint(var26, var13, var14, var18, var19.asIntBuffer(), var29, var31, var30, var27);
					break;
				case 5126:
					HalveImage.halveImage_float(var26, var13, var14, var18, var19.asFloatBuffer(), var29, var31, var30, var27);
					break;
				case 32818:
					assert arg7 == 6407;
					HalveImage.halveImagePackedPixel(3, new Extract332(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 32819:
					HalveImage.halveImagePackedPixel(4, new Extract4444(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 32820:
					HalveImage.halveImagePackedPixel(4, new Extract5551(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 32821:
					HalveImage.halveImagePackedPixel(4, new Extract8888(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 32822:
					HalveImage.halveImagePackedPixel(4, new Extract1010102(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33634:
					assert arg7 == 6407;
					HalveImage.halveImagePackedPixel(3, new Extract233rev(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33635:
					HalveImage.halveImagePackedPixel(3, new Extract565(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33636:
					HalveImage.halveImagePackedPixel(3, new Extract565rev(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33637:
					HalveImage.halveImagePackedPixel(4, new Extract4444rev(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33638:
					HalveImage.halveImagePackedPixel(4, new Extract1555rev(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33639:
					HalveImage.halveImagePackedPixel(4, new Extract8888rev(), var13, var14, var18, var19, var29, var31, var27);
					break;
				case 33640:
					HalveImage.halveImagePackedPixel(4, new Extract2101010rev(), var13, var14, var18, var19, var29, var31, var27);
					break;
				default:
					assert false;
			}
			var20 = var18;
			var18 = var19;
			var19 = var20;
			if (var13 > 1) {
				var13 /= 2;
				var31 /= 2;
			}
			if (var14 > 1) {
				var14 /= 2;
			}
			var34 = var31 % var33.getUnpackAlignment();
			if (var34 != 0) {
				var35 = var31 + var33.getUnpackAlignment() - var34;
				ByteBuffer var40 = null;
				try {
					var40 = ByteBuffer.allocateDirect(var35 * var14);
				} catch (OutOfMemoryError var43) {
					arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
					arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
					arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
					arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
					arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
					return 100902;
				}
				var18.rewind();
				int var36 = 0;
				while (true) {
					if (var36 >= var14) {
						if (arg10 <= var15 && var15 <= arg11) {
							var40.rewind();
							arg0.glTexImage2D(arg1, var15, arg2, var13, var14, 0, arg7, arg8, var40);
						}
						break;
					}
					var40.position(var35 * var36);
					for (int var37 = 0; var37 < var31; var37++) {
						var40.put(var18.get());
					}
					var36++;
				}
			} else if (arg10 <= var15 && var15 <= arg11) {
				var18.rewind();
				arg0.glTexImage2D(arg1, var15, arg2, var13, var14, 0, arg7, arg8, var18);
			}
			var15++;
		}
		arg0.glPixelStorei(GL.GL_UNPACK_ALIGNMENT, var33.getUnpackAlignment());
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_ROWS, var33.getUnpackSkipRows());
		arg0.glPixelStorei(GL.GL_UNPACK_SKIP_PIXELS, var33.getUnpackSkipPixels());
		arg0.glPixelStorei(GL.GL_UNPACK_ROW_LENGTH, var33.getUnpackRowLength());
		arg0.glPixelStorei(GL.GL_UNPACK_SWAP_BYTES, var33.getUnpackSwapBytes() ? GL.GL_LINES : GL.GL_POINTS);
		return 0;
	}
}
