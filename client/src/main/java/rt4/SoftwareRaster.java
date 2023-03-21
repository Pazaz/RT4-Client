package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class SoftwareRaster {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
	public static int[] pixels;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public static int clipLeft = 0;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public static int clipTop = 0;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public static int clipRight = 0;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public static int clipBottom = 0;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Lclient!vk;")
	public static FrameBuffer frameBuffer;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
	public static void method2482() {
		anIntArray295 = null;
		anIntArray296 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public static void drawRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		drawHorizontalLine(x, y, width, color);
		drawHorizontalLine(x, y + height - 1, width, color);
		drawVerticalLine(x, y, height, color);
		drawVerticalLine(x + width - 1, y, height, color);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
	public static void fillRectAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color, @OriginalArg(5) int alpha) {
		if (x < clipLeft) {
			width -= clipLeft - x;
			x = clipLeft;
		}
		if (y < clipTop) {
			height -= clipTop - y;
			y = clipTop;
		}
		if (x + width > clipRight) {
			width = clipRight - x;
		}
		if (y + height > clipBottom) {
			height = clipBottom - y;
		}
		@Pc(59) int local59 = ((color & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((color & 0xFF00) * alpha >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - alpha;
		@Pc(67) int local67 = SoftwareRaster.width - width;
		@Pc(73) int local73 = x + y * SoftwareRaster.width;
		for (@Pc(75) int local75 = 0; local75 < height; local75++) {
			for (@Pc(81) int local81 = -width; local81 < 0; local81++) {
				@Pc(87) int local87 = pixels[local73];
				@Pc(107) int local107 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				pixels[local73++] = local59 + local107;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	private static void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= clipLeft && arg1 >= clipTop && arg0 < clipRight && arg1 < clipBottom) {
			pixels[arg0 + arg1 * width] = 16776960;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[I)V")
	public static void method2486(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != clipBottom - clipTop || arg1.length != clipBottom - clipTop) {
			throw new IllegalArgumentException();
		}
		anIntArray295 = arg0;
		anIntArray296 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIII)V")
	public static void drawRectAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color, @OriginalArg(5) int alpha) {
		drawHorizontalLineAlpha(x, y, width, color, alpha);
		drawHorizontalLineAlpha(x, y + height - 1, width, color, alpha);
		if (height >= 3) {
			drawVerticalLineAlpha(x, y + 1, height - 2, color, alpha);
			drawVerticalLineAlpha(x + width - 1, y + 1, height - 2, color, alpha);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I)V")
	public static void restoreClip(@OriginalArg(0) int[] clipSides) {
		clipLeft = clipSides[0];
		clipTop = clipSides[1];
		clipRight = clipSides[2];
		clipBottom = clipSides[3];
		method2482();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public static void drawHorizontalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int length, @OriginalArg(3) int color) {
		if (y < clipTop || y >= clipBottom) {
			return;
		}
		if (x < clipLeft) {
			length -= clipLeft - x;
			x = clipLeft;
		}
		if (x + length > clipRight) {
			length = clipRight - x;
		}
		@Pc(32) int local32 = x + y * width;
		for (@Pc(34) int local34 = 0; local34 < length; local34++) {
			pixels[local32 + local34] = color;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V")
	public static void drawVerticalLine(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < clipLeft || arg0 >= clipRight) {
			return;
		}
		if (arg1 < clipTop) {
			arg2 -= clipTop - arg1;
			arg1 = clipTop;
		}
		if (arg1 + arg2 > clipBottom) {
			arg2 = clipBottom - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * width;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			pixels[local32 + local34 * width] = arg3;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	public static void setSize(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		pixels = arg0;
		width = arg1;
		height = arg2;
		setClip(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	public static void clear() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = width * height - 7;
		while (local1 < local7) {
			pixels[local1++] = 0;
			pixels[local1++] = 0;
			pixels[local1++] = 0;
			pixels[local1++] = 0;
			pixels[local1++] = 0;
			pixels[local1++] = 0;
			pixels[local1++] = 0;
			pixels[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			pixels[local1++] = 0;
		}
	}

	public static void clear(int color) {
		for (int i = 0; i < width * height; ++i) {
			pixels[i] = color;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIII)V")
	private static void drawHorizontalLineAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int length, @OriginalArg(3) int color, @OriginalArg(4) int alpha) {
		if (y < clipTop || y >= clipBottom) {
			return;
		}
		if (x < clipLeft) {
			length -= clipLeft - x;
			x = clipLeft;
		}
		if (x + length > clipRight) {
			length = clipRight - x;
		}
		@Pc(30) int local30 = 256 - alpha;
		@Pc(38) int local38 = (color >> 16 & 0xFF) * alpha;
		@Pc(46) int local46 = (color >> 8 & 0xFF) * alpha;
		@Pc(52) int local52 = (color & 0xFF) * alpha;
		@Pc(58) int local58 = x + y * width;
		for (@Pc(60) int local60 = 0; local60 < length; local60++) {
			@Pc(73) int local73 = (pixels[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (pixels[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (pixels[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			pixels[local58++] = local113;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIIIII)V")
	public static void renderLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int lineWidth) {
		@Pc(3) int local3 = x1 - x0;
		@Pc(7) int local7 = y1 - y0;
		@Pc(14) int local14 = local3 >= 0 ? local3 : -local3;
		@Pc(21) int local21 = local7 >= 0 ? local7 : -local7;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (local3 << 16) / local23;
		@Pc(43) int local43 = (local7 << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = lineWidth * local43 >> 17;
		@Pc(67) int local67 = lineWidth * local43 + 1 >> 17;
		@Pc(73) int local73 = lineWidth * local37 >> 17;
		@Pc(81) int local81 = lineWidth * local37 + 1 >> 17;
		@Pc(85) int local85 = x0 - Rasteriser.getOffsetRemainder();
		@Pc(89) int local89 = y0 - Rasteriser.getOffset();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Rasteriser.testPoints(local93, local97, local103);
		Rasteriser.fillTriangle(local113, local117, local123, local93, local97, local103, color);
		Rasteriser.testPoints(local93, local103, local109);
		Rasteriser.fillTriangle(local113, local123, local129, local93, local103, local109, color);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIIII)V")
	public static void fillRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		if (x < clipLeft) {
			width -= clipLeft - x;
			x = clipLeft;
		}
		if (y < clipTop) {
			height -= clipTop - y;
			y = clipTop;
		}
		if (x + width > clipRight) {
			width = clipRight - x;
		}
		if (y + height > clipBottom) {
			height = clipBottom - y;
		}
		@Pc(43) int local43 = SoftwareRaster.width - width;
		@Pc(49) int local49 = x + y * SoftwareRaster.width;
		for (@Pc(52) int local52 = -height; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -width; local57 < 0; local57++) {
				pixels[local49++] = color;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIII)V")
	public static void setClip(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > width) {
			arg2 = width;
		}
		if (arg3 > height) {
			arg3 = height;
		}
		clipLeft = arg0;
		clipTop = arg1;
		clipRight = arg2;
		clipBottom = arg3;
		method2482();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([I)V")
	public static void saveClip(@OriginalArg(0) int[] clipArray) {
		clipArray[0] = clipLeft;
		clipArray[1] = clipTop;
		clipArray[2] = clipRight;
		clipArray[3] = clipBottom;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(IIII)V")
	public static void method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (clipLeft < arg0) {
			clipLeft = arg0;
		}
		if (clipTop < arg1) {
			clipTop = arg1;
		}
		if (clipRight > arg2) {
			clipRight = arg2;
		}
		if (clipBottom > arg3) {
			clipBottom = arg3;
		}
		method2482();
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(IIIII)V")
	private static void drawVerticalLineAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int length, @OriginalArg(3) int color, @OriginalArg(4) int alpha) {
		if (x < clipLeft || x >= clipRight) {
			return;
		}
		if (y < clipTop) {
			length -= clipTop - y;
			y = clipTop;
		}
		if (y + length > clipBottom) {
			length = clipBottom - y;
		}
		@Pc(30) int local30 = 256 - alpha;
		@Pc(38) int local38 = (color >> 16 & 0xFF) * alpha;
		@Pc(46) int local46 = (color >> 8 & 0xFF) * alpha;
		@Pc(52) int local52 = (color & 0xFF) * alpha;
		@Pc(58) int local58 = x + y * width;
		for (@Pc(60) int local60 = 0; local60 < length; local60++) {
			@Pc(73) int local73 = (pixels[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (pixels[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (pixels[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			pixels[local58] = local113;
			local58 += width;
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(IIIII)V")
	public static void renderLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color) {
		x1 -= x0;
		y1 -= y0;
		if (y1 == 0) {
			if (x1 >= 0) {
				drawHorizontalLine(x0, y0, x1 + 1, color);
			} else {
				drawHorizontalLine(x0 + x1, y0, 1 - x1, color);
			}
		} else if (x1 != 0) {
			if (x1 + y1 < 0) {
				x0 += x1;
				x1 = -x1;
				y0 += y1;
				y1 = -y1;
			}
			@Pc(96) int local96;
			@Pc(127) int local127;
			if (x1 > y1) {
				y0 <<= 0x10;
				y0 += 32768;
				@Pc(86) int local86 = y1 << 16;
				local96 = (int) Math.floor((double) local86 / (double) x1 + 0.5D);
				x1 += x0;
				if (x0 < clipLeft) {
					y0 += local96 * (clipLeft - x0);
					x0 = clipLeft;
				}
				if (x1 >= clipRight) {
					x1 = clipRight - 1;
				}
				while (x0 <= x1) {
					local127 = y0 >> 16;
					if (local127 >= clipTop && local127 < clipBottom) {
						pixels[x0 + local127 * width] = color;
					}
					y0 += local96;
					x0++;
				}
			} else {
				x0 <<= 0x10;
				x0 += 32768;
				@Pc(160) int local160 = x1 << 16;
				local96 = (int) Math.floor((double) local160 / (double) y1 + 0.5D);
				y1 += y0;
				if (y0 < clipTop) {
					x0 += local96 * (clipTop - y0);
					y0 = clipTop;
				}
				if (y1 >= clipBottom) {
					y1 = clipBottom - 1;
				}
				while (y0 <= y1) {
					local127 = x0 >> 16;
					if (local127 >= clipLeft && local127 < clipRight) {
						pixels[local127 + y0 * width] = color;
					}
					x0 += local96;
					y0++;
				}
			}
		} else if (y1 >= 0) {
			drawVerticalLine(x0, y0, y1 + 1, color);
		} else {
			drawVerticalLine(x0, y0 + y1, -y1 + 1, color);
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(IIII)V")
	private static void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			method2485(arg0, arg1);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < clipTop) {
			local15 = clipTop;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > clipBottom) {
			local26 = clipBottom;
		}
		@Pc(33) int local33 = local15;
		@Pc(37) int local37 = arg2 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(43) int local43 = arg1 - local15;
		@Pc(47) int local47 = local43 * local43;
		@Pc(51) int local51 = local47 - local43;
		if (arg1 > local26) {
			arg1 = local26;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(105) int local105;
		@Pc(107) int local107;
		while (local33 < arg1) {
			while (local51 <= local37 || local47 <= local37) {
				local47 += local39 + local39;
				local51 += local39++ + local39;
			}
			local85 = arg0 + 1 - local39;
			if (local85 < clipLeft) {
				local85 = clipLeft;
			}
			local94 = arg0 + local39;
			if (local94 > clipRight) {
				local94 = clipRight;
			}
			local105 = local85 + local33 * width;
			for (local107 = local85; local107 < local94; local107++) {
				pixels[local105++] = 16776960;
			}
			local33++;
			local47 -= local43-- + local43;
			local51 -= local43 + local43;
		}
		local39 = arg2;
		local43 = local33 - arg1;
		local51 = local43 * local43 + local37;
		local47 = local51 - arg2;
		local51 -= local43;
		while (local33 < local26) {
			while (local51 > local37 && local47 > local37) {
				local51 -= local39-- + local39;
				local47 -= local39 + local39;
			}
			local85 = arg0 - local39;
			if (local85 < clipLeft) {
				local85 = clipLeft;
			}
			local94 = arg0 + local39;
			if (local94 > clipRight - 1) {
				local94 = clipRight - 1;
			}
			local105 = local85 + local33 * width;
			for (local107 = local85; local107 <= local94; local107++) {
				pixels[local105++] = 16776960;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(IIIII)V")
	public static void method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return;
		}
		if (arg3 == 256) {
			method2501(arg0, arg1, arg2);
			return;
		}
		@Pc(20) int local20 = 256 - arg3;
		@Pc(28) int local28 = arg3 * 255;
		@Pc(36) int local36 = arg3 * 255;
		@Pc(42) int local42 = arg3 * 0;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < clipTop) {
			local46 = clipTop;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > clipBottom) {
			local57 = clipBottom;
		}
		@Pc(64) int local64 = local46;
		@Pc(68) int local68 = arg2 * arg2;
		@Pc(70) int local70 = 0;
		@Pc(74) int local74 = arg1 - local46;
		@Pc(78) int local78 = local74 * local74;
		@Pc(82) int local82 = local78 - local74;
		if (arg1 > local57) {
			arg1 = local57;
		}
		@Pc(151) int local151;
		@Pc(161) int local161;
		@Pc(169) int local169;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(191) int local191;
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			local116 = arg0 + 1 - local70;
			if (local116 < clipLeft) {
				local116 = clipLeft;
			}
			local125 = arg0 + local70;
			if (local125 > clipRight) {
				local125 = clipRight;
			}
			local136 = local116 + local64 * width;
			for (local138 = local116; local138 < local125; local138++) {
				local151 = (pixels[local136] >> 16 & 0xFF) * local20;
				local161 = (pixels[local136] >> 8 & 0xFF) * local20;
				local169 = (pixels[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				pixels[local136++] = local191;
			}
			local64++;
			local78 -= local74-- + local74;
			local82 -= local74 + local74;
		}
		local70 = arg2;
		local74 = -local74;
		local82 = local74 * local74 + local68;
		local78 = local82 - arg2;
		local82 -= local74;
		while (local64 < local57) {
			while (local82 > local68 && local78 > local68) {
				local82 -= local70-- + local70;
				local78 -= local70 + local70;
			}
			local116 = arg0 - local70;
			if (local116 < clipLeft) {
				local116 = clipLeft;
			}
			local125 = arg0 + local70;
			if (local125 > clipRight - 1) {
				local125 = clipRight - 1;
			}
			local136 = local116 + local64 * width;
			for (local138 = local116; local138 <= local125; local138++) {
				local151 = (pixels[local136] >> 16 & 0xFF) * local20;
				local161 = (pixels[local136] >> 8 & 0xFF) * local20;
				local169 = (pixels[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				pixels[local136++] = local191;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()V")
	public static void setFullClip() {
		clipLeft = 0;
		clipTop = 0;
		clipRight = width;
		clipBottom = height;
		method2482();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[I[I)V")
	public static void method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * width;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				pixels[local17++] = 0;
			}
			local5 += width;
		}
	}
}
