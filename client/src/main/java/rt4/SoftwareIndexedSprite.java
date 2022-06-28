package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class SoftwareIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "[B")
	public byte[] pixels;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
	private final int[] anIntArray144;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.innerWidth = arg0;
		this.innerHeight = arg1;
		this.xOffset = arg2;
		this.yOffset = arg3;
		this.width = arg4;
		this.height = arg5;
		this.pixels = arg6;
		this.anIntArray144 = arg7;
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V")
	public SoftwareIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.innerWidth = this.width = arg0;
		this.innerHeight = this.height = arg1;
		this.xOffset = this.yOffset = 0;
		this.pixels = new byte[arg0 * arg1];
		this.anIntArray144 = new int[arg2];
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
	public static void method1391(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(1) int local1 = arg3;
		for (@Pc(4) int local4 = -arg8; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg4 >> 16) * arg11;
			for (@Pc(15) int local15 = -arg7; local15 < 0; local15++) {
				@Pc(25) byte local25 = arg1[(arg3 >> 16) + local12];
				if (local25 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg2[local25 & 0xFF];
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIII)V")
	public static void method1393(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(23) byte local23;
			for (local16 = local4; local16 < 0; local16++) {
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				local23 = arg1[arg3++];
				if (local23 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local23 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIIIIII)V")
	public static void method1394(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = arg3;
		@Pc(7) int local7 = arg12 >> 16 & 0xFF;
		@Pc(13) int local13 = arg12 >> 8 & 0xFF;
		@Pc(17) int local17 = arg12 & 0xFF;
		for (@Pc(20) int local20 = -arg8; local20 < 0; local20++) {
			@Pc(28) int local28 = (arg4 >> 16) * arg11;
			for (@Pc(31) int local31 = -arg7; local31 < 0; local31++) {
				@Pc(41) byte local41 = arg1[(arg3 >> 16) + local28];
				if (local41 == 0) {
					arg5++;
				} else {
					@Pc(49) int local49 = arg2[local41 & 0xFF];
					@Pc(55) int local55 = local49 >> 16 & 0xFF;
					@Pc(61) int local61 = local49 >> 8 & 0xFF;
					@Pc(65) int local65 = local49 & 0xFF;
					arg0[arg5++] = (local55 * local7 >> 8 << 16) + (local61 * local13 >> 8 << 8) + (local65 * local17 >> 8);
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = local1;
			arg5 += arg6;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "([I[B[IIIIIIII)V")
	public static void method1397(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = 256 - arg9;
		for (@Pc(6) int local6 = -arg6; local6 < 0; local6++) {
			for (@Pc(11) int local11 = -arg5; local11 < 0; local11++) {
				@Pc(18) byte local18 = arg1[arg3++];
				if (local18 == 0) {
					arg4++;
				} else {
					@Pc(26) int local26 = arg2[local18 & 0xFF];
					@Pc(30) int local30 = arg0[arg4];
					arg0[arg4++] = ((local26 & 0xFF00FF) * arg9 + (local30 & 0xFF00FF) * local3 & 0xFF00FF00) + ((local26 & 0xFF00) * arg9 + (local30 & 0xFF00) * local3 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V")
	public final void adjustPalette(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray144.length; local1++) {
			@Pc(15) int local15 = this.anIntArray144[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray144[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray144[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray144[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
	public final void method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.width;
		@Pc(5) int local5 = this.height;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.innerWidth;
		@Pc(15) int local15 = this.innerHeight;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.xOffset > 0) {
			local41 = ((this.xOffset << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			local41 = ((this.yOffset << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.yOffset << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * SoftwareRaster.width;
		@Pc(125) int local125 = SoftwareRaster.width - arg2;
		if (arg1 + arg3 > SoftwareRaster.clipBottom) {
			arg3 -= arg1 + arg3 - SoftwareRaster.clipBottom;
		}
		@Pc(145) int local145;
		if (arg1 < SoftwareRaster.clipTop) {
			local145 = SoftwareRaster.clipTop - arg1;
			arg3 -= local145;
			local41 += local145 * SoftwareRaster.width;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > SoftwareRaster.clipRight) {
			local145 = arg0 + arg2 - SoftwareRaster.clipRight;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < SoftwareRaster.clipLeft) {
			local145 = SoftwareRaster.clipLeft - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		method1394(SoftwareRaster.pixels, this.pixels, this.anIntArray144, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
	public final void clear() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.pixels.length - 7;
		while (local1 < local7) {
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
			this.pixels[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.pixels[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()V")
	public final void flipVertical() {
		@Pc(6) byte[] local6 = new byte[this.width * this.height];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.width; local10++) {
			for (@Pc(19) int local19 = this.height - 1; local19 >= 0; local19--) {
				local6[local8++] = this.pixels[local10 + local19 * this.width];
			}
		}
		this.pixels = local6;
		local10 = this.yOffset;
		this.yOffset = this.xOffset;
		this.xOffset = this.innerHeight - this.height - local10;
		local10 = this.height;
		this.height = this.width;
		this.width = local10;
		local10 = this.innerHeight;
		this.innerHeight = this.innerWidth;
		this.innerWidth = local10;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	@Override
	public final void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.xOffset;
		arg1 += this.yOffset;
		@Pc(15) int local15 = arg0 + arg1 * SoftwareRaster.width;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.width - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < SoftwareRaster.clipTop) {
			local36 = SoftwareRaster.clipTop - arg1;
			local20 -= local36;
			arg1 = SoftwareRaster.clipTop;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.width;
		}
		if (arg1 + local20 > SoftwareRaster.clipBottom) {
			local20 -= arg1 + local20 - SoftwareRaster.clipBottom;
		}
		if (arg0 < SoftwareRaster.clipLeft) {
			local36 = SoftwareRaster.clipLeft - arg0;
			local23 -= local36;
			arg0 = SoftwareRaster.clipLeft;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > SoftwareRaster.clipRight) {
			local36 = arg0 + local23 - SoftwareRaster.clipRight;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			method1397(SoftwareRaster.pixels, this.pixels, this.anIntArray144, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()V")
	public final void trim() {
		if (this.width == this.innerWidth && this.height == this.innerHeight) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.innerWidth * this.innerHeight];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.height; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.width; local27++) {
				local17[local27 + this.xOffset + (local21 + this.yOffset) * this.innerWidth] = this.pixels[local19++];
			}
		}
		this.pixels = local17;
		this.width = this.innerWidth;
		this.height = this.innerHeight;
		this.xOffset = 0;
		this.yOffset = 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V")
	public final void method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.width;
		@Pc(5) int local5 = this.height;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.innerWidth;
		@Pc(15) int local15 = this.innerHeight;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.xOffset > 0) {
			local41 = ((this.xOffset << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			local41 = ((this.yOffset << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.yOffset << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * SoftwareRaster.width;
		@Pc(125) int local125 = SoftwareRaster.width - arg2;
		if (arg1 + arg3 > SoftwareRaster.clipBottom) {
			arg3 -= arg1 + arg3 - SoftwareRaster.clipBottom;
		}
		@Pc(145) int local145;
		if (arg1 < SoftwareRaster.clipTop) {
			local145 = SoftwareRaster.clipTop - arg1;
			arg3 -= local145;
			local41 += local145 * SoftwareRaster.width;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > SoftwareRaster.clipRight) {
			local145 = arg0 + arg2 - SoftwareRaster.clipRight;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < SoftwareRaster.clipLeft) {
			local145 = SoftwareRaster.clipLeft - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		method1391(SoftwareRaster.pixels, this.pixels, this.anIntArray144, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	@Override
	public final void renderTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.xOffset;
		arg1 += this.yOffset;
		@Pc(15) int local15 = arg0 + arg1 * SoftwareRaster.width;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.height;
		@Pc(23) int local23 = this.width;
		@Pc(27) int local27 = SoftwareRaster.width - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < SoftwareRaster.clipTop) {
			local36 = SoftwareRaster.clipTop - arg1;
			local20 -= local36;
			arg1 = SoftwareRaster.clipTop;
			local17 = local36 * local23;
			local15 += local36 * SoftwareRaster.width;
		}
		if (arg1 + local20 > SoftwareRaster.clipBottom) {
			local20 -= arg1 + local20 - SoftwareRaster.clipBottom;
		}
		if (arg0 < SoftwareRaster.clipLeft) {
			local36 = SoftwareRaster.clipLeft - arg0;
			local23 -= local36;
			arg0 = SoftwareRaster.clipLeft;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > SoftwareRaster.clipRight) {
			local36 = arg0 + local23 - SoftwareRaster.clipRight;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			method1393(SoftwareRaster.pixels, this.pixels, this.anIntArray144, local17, local15, local23, local20, local27, local29);
		}
	}
}
