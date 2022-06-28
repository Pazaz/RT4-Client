package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ColorUtils {
	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	public static int rgbToHsl(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = 0.0D;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = local10;
		@Pc(37) double local37 = 0;
		@Pc(39) double local39 = local10;
		if (local10 > local19) {
			local34 = local19;
		}
		if (local32 < local34) {
			local34 = local32;
		}
		if (local19 > local10) {
			local39 = local19;
		}
		if (local32 > local39) {
			local39 = local32;
		}
		@Pc(72) double local72 = (local34 + local39) / 2.0D;
		if (local34 != local39) {
			if (local72 < 0.5D) {
				local37 = (local39 - local34) / (local34 + local39);
			}
			if (local72 >= 0.5D) {
				local37 = (local39 - local34) / (2.0D - local39 - local34);
			}
			if (local39 == local10) {
				local25 = (local19 - local32) / (local39 - local34);
			} else if (local19 == local39) {
				local25 = (local32 - local10) / (local39 - local34) + 2.0D;
			} else if (local39 == local32) {
				local25 = (local10 - local19) / (-local34 + local39) + 4.0D;
			}
		}
		@Pc(159) int local159 = (int) (local37 * 256.0D);
		@Pc(164) int local164 = (int) (local72 * 256.0D);
		local25 /= 6.0D;
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(188) int local188 = (int) (local25 * 256.0D);
		if (local159 < 0) {
			local159 = 0;
		} else if (local159 > 255) {
			local159 = 255;
		}
		if (local164 > 243) {
			local159 >>= 0x4;
		} else if (local164 > 217) {
			local159 >>= 0x3;
		} else if (local164 > 192) {
			local159 >>= 0x2;
		} else if (local164 > 179) {
			local159 >>= 0x1;
		}
		return (local188 >> 2 << 10) + (local159 >> 5 << 7) + (local164 >> 1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[F")
	public static float[] getRgbFloat(@OriginalArg(0) int arg0) {
		@Pc(7) float local7 = FogManager.getLightingModelAmbient() + FogManager.getLight0Diffuse();
		@Pc(9) int local9 = FogManager.getLightColor();
		@Pc(11) float local11 = 0.58823526F;
		aFloatArray28[3] = 1.0F;
		@Pc(24) float local24 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		aFloatArray28[1] = local7 * (float) (arg0 >> 8 & 0xFF) / 255.0F * local33 * local11;
		aFloatArray28[0] = local7 * local11 * local24 * ((float) (arg0 >> 16 & 0xFF) / 255.0F);
		@Pc(74) float local74 = (float) (local9 & 0xFF) / 255.0F;
		aFloatArray28[2] = (float) (arg0 & 0xFF) / 255.0F * local74 * local11 * local7;
		return aFloatArray28;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)I")
	public static int multiplyLightnessSafe(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)I")
	public static int multiplyLightnessGrayscale(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)I")
	public static int method4582(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
	public static int multiplyLightness(@OriginalArg(0) int a, @OriginalArg(1) int b) {
		b = b * (a & 0x7F) >> 7;
		if (b < 2) {
			b = 2;
		} else if (b > 126) {
			b = 126;
		}
		return (a & 0xFF80) + b;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	public static int multiplyLightness2(@OriginalArg(0) int a, @OriginalArg(1) int b) {
		b = b * (a & 0x7F) >> 7;
		if (b < 2) {
			b = 2;
		} else if (b > 126) {
			b = 126;
		}
		return (a & 0xFF80) + b;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int multiplyLightness3(@OriginalArg(0) int a, @OriginalArg(1) int b) {
		b = b * (a & 0x7F) >> 7;
		if (b < 2) {
			b = 2;
		} else if (b > 126) {
			b = 126;
		}
		return (a & 0xFF80) + b;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
	public static int method1309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
	}
}
