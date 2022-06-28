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
	public static void drawRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int color) {
		drawHorizontalLine(arg0, arg1, arg2, color);
		drawHorizontalLine(arg0, arg1 + arg3 - 1, arg2, color);
		drawVerticalLine(arg0, arg1, arg3, color);
		drawVerticalLine(arg0 + arg2 - 1, arg1, arg3, color);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
	public static void fillRectAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < clipLeft) {
			arg2 -= clipLeft - arg0;
			arg0 = clipLeft;
		}
		if (arg1 < clipTop) {
			arg3 -= clipTop - arg1;
			arg1 = clipTop;
		}
		if (arg0 + arg2 > clipRight) {
			arg2 = clipRight - arg0;
		}
		if (arg1 + arg3 > clipBottom) {
			arg3 = clipBottom - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = width - arg2;
		@Pc(73) int local73 = arg0 + arg1 * width;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
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
	public static void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2493(arg0, arg1, arg2, arg4, arg5);
		method2493(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method2499(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method2499(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I)V")
	public static void restoreClip(@OriginalArg(0) int[] arg0) {
		clipLeft = arg0[0];
		clipTop = arg0[1];
		clipRight = arg0[2];
		clipBottom = arg0[3];
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
	private static void method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < clipTop || arg1 >= clipBottom) {
			return;
		}
		if (arg0 < clipLeft) {
			arg2 -= clipLeft - arg0;
			arg0 = clipLeft;
		}
		if (arg0 + arg2 > clipRight) {
			arg2 = clipRight - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * width;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (pixels[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (pixels[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (pixels[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			pixels[local58++] = local113;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIIIII)V")
	public static void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
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
		@Pc(59) int local59 = arg5 * local43 >> 17;
		@Pc(67) int local67 = arg5 * local43 + 1 >> 17;
		@Pc(73) int local73 = arg5 * local37 >> 17;
		@Pc(81) int local81 = arg5 * local37 + 1 >> 17;
		@Pc(85) int local85 = arg0 - Rasteriser.getOffsetRemainder();
		@Pc(89) int local89 = arg1 - Rasteriser.getOffset();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Rasteriser.testPoints(local93, local97, local103);
		Rasteriser.fillTriangle(local113, local117, local123, local93, local97, local103, arg4);
		Rasteriser.testPoints(local93, local103, local109);
		Rasteriser.fillTriangle(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIIII)V")
	public static void fillRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < clipLeft) {
			arg2 -= clipLeft - arg0;
			arg0 = clipLeft;
		}
		if (arg1 < clipTop) {
			arg3 -= clipTop - arg1;
			arg1 = clipTop;
		}
		if (arg0 + arg2 > clipRight) {
			arg2 = clipRight - arg0;
		}
		if (arg1 + arg3 > clipBottom) {
			arg3 = clipBottom - arg1;
		}
		@Pc(43) int local43 = width - arg2;
		@Pc(49) int local49 = arg0 + arg1 * width;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				pixels[local49++] = arg4;
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
	public static void saveClip(@OriginalArg(0) int[] arg0) {
		arg0[0] = clipLeft;
		arg0[1] = clipTop;
		arg0[2] = clipRight;
		arg0[3] = clipBottom;
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
	private static void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
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
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * width;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (pixels[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (pixels[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (pixels[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			pixels[local58] = local113;
			local58 += width;
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(IIIII)V")
	public static void method2500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				drawHorizontalLine(arg0, arg1, arg2 + 1, arg4);
			} else {
				drawHorizontalLine(arg0 + arg2, arg1, 1 - arg2, arg4);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(96) int local96;
			@Pc(127) int local127;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(86) int local86 = arg3 << 16;
				local96 = (int) Math.floor((double) local86 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < clipLeft) {
					arg1 += local96 * (clipLeft - arg0);
					arg0 = clipLeft;
				}
				if (arg2 >= clipRight) {
					arg2 = clipRight - 1;
				}
				while (arg0 <= arg2) {
					local127 = arg1 >> 16;
					if (local127 >= clipTop && local127 < clipBottom) {
						pixels[arg0 + local127 * width] = arg4;
					}
					arg1 += local96;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(160) int local160 = arg2 << 16;
				local96 = (int) Math.floor((double) local160 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < clipTop) {
					arg0 += local96 * (clipTop - arg1);
					arg1 = clipTop;
				}
				if (arg3 >= clipBottom) {
					arg3 = clipBottom - 1;
				}
				while (arg1 <= arg3) {
					local127 = arg0 >> 16;
					if (local127 >= clipLeft && local127 < clipRight) {
						pixels[local127 + arg1 * width] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			drawVerticalLine(arg0, arg1, arg3 + 1, arg4);
		} else {
			drawVerticalLine(arg0, arg1 + arg3, -arg3 + 1, arg4);
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
	public static void method2503() {
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
