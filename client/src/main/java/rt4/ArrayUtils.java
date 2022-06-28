package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ArrayUtils {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([JI[JII)V")
	public static void copy(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 3;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 3;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(83) int local83 = local15 - 3;
		while (arg1 < local83) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local83 + 3;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([II[III)V")
	public static void copy(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IIII)V")
	public static void fill(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = arg1 + arg2 - 7;
		while (arg1 < local5) {
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
		}
		local5 += 7;
		while (arg1 < local5) {
			arg0[arg1++] = arg3;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([FI[FII)V")
	public static void copy(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == arg2) {
			return;
		}
		@Pc(114) int local114 = arg4;
		@Pc(115) int local115 = local114 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local114 = local115 + 7;
		while (arg1 < local114) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([SI[SII)V")
	public static void copy(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
	public static void copy(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
	public static void clear(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg2 - 7;
		while (arg1 < local5) {
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
		}
		local5 += 7;
		while (arg1 < local5) {
			arg0[arg1++] = 0;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[J[I)V")
	public static void sort(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		method436(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([JII[II)V")
	public static void method436(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(20) int local20 = arg1;
		@Pc(26) int local26 = (arg2 + arg1) / 2;
		@Pc(30) long local30 = arg0[local26];
		arg0[local26] = arg0[arg2];
		arg0[arg2] = local30;
		@Pc(44) int local44 = arg3[local26];
		arg3[local26] = arg3[arg2];
		arg3[arg2] = local44;
		for (@Pc(56) int local56 = arg1; local56 < arg2; local56++) {
			if (arg0[local56] < local30 + (long) (local56 & 0x1)) {
				@Pc(76) long local76 = arg0[local56];
				arg0[local56] = arg0[local20];
				arg0[local20] = local76;
				@Pc(90) int local90 = arg3[local56];
				arg3[local56] = arg3[local20];
				arg3[local20++] = local90;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local30;
		arg3[arg2] = arg3[local20];
		arg3[local20] = local44;
		method436(arg0, arg1, local20 - 1, arg3);
		method436(arg0, local20 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([II)[I")
	public static int[] copyOfNullable(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) int[] local18 = new int[arg0.length];
			copy(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[S)[S")
	public static short[] copyOfNullable(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			copy(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([SI)[S")
	public static short[] copyOf(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		copy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([FI)[F")
	public static float[] copyOf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		copy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)V")
	public static void fillRange(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(14) int local14 = arg2 - 1;
		@Pc(17) int local17 = local14 - 7;
		while (local17 > arg1) {
			@Pc(22) int local22 = arg1 + 1;
			arg0[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg0[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg0[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg0[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg0[local42] = arg3;
			@Pc(47) int local47 = local42 + 1;
			arg0[local47] = arg3;
			@Pc(52) int local52 = local47 + 1;
			arg0[local52] = arg3;
			arg1 = local52 + 1;
			arg0[arg1] = arg3;
		}
		while (local14 > arg1) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}
}
