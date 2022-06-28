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
	public static void clear(@OriginalArg(0) int[] dest, @OriginalArg(1) int off, @OriginalArg(2) int length) {
		@Pc(5) int len = length - 7;
		while (off < len) {
			dest[off++] = 0;
			dest[off++] = 0;
			dest[off++] = 0;
			dest[off++] = 0;
			dest[off++] = 0;
			dest[off++] = 0;
			dest[off++] = 0;
			dest[off++] = 0;
		}
		len += 7;
		while (off < len) {
			dest[off++] = 0;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[J[I)V")
	public static void sort(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		sort(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([JII[II)V")
	public static void sort(@OriginalArg(0) long[] keys, @OriginalArg(1) int lo, @OriginalArg(2) int hi, @OriginalArg(3) int[] values) {
		if (lo >= hi) {
			return;
		}
		@Pc(20) int i = lo;
		@Pc(26) int mid = (hi + lo) / 2;
		@Pc(30) long pivotKey = keys[mid];
		keys[mid] = keys[hi];
		keys[hi] = pivotKey;
		@Pc(44) int pivotValue = values[mid];
		values[mid] = values[hi];
		values[hi] = pivotValue;
		for (@Pc(56) int j = lo; j < hi; j++) {
			if (keys[j] < pivotKey + (long) (j & 0x1)) {
				@Pc(76) long key = keys[j];
				keys[j] = keys[i];
				keys[i] = key;
				@Pc(90) int value = values[j];
				values[j] = values[i];
				values[i++] = value;
			}
		}
		keys[hi] = keys[i];
		keys[i] = pivotKey;
		values[hi] = values[i];
		values[i] = pivotValue;
		sort(keys, lo, i - 1, values);
		sort(keys, i + 1, hi, values);
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

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
	public static void sort(@OriginalArg(0) Object[] values, @OriginalArg(1) int hi, @OriginalArg(2) int[] keys, @OriginalArg(4) int lo) {
		if (lo >= hi) {
			return;
		}
		@Pc(11) int mid = (lo + hi) / 2;
		@Pc(15) int pivotKey = keys[mid];
		@Pc(17) int i = lo;
		keys[mid] = keys[hi];
		keys[hi] = pivotKey;
		@Pc(31) Object pivotValue = values[mid];
		values[mid] = values[hi];
		values[hi] = pivotValue;
		for (@Pc(43) int j = lo; j < hi; j++) {
			if ((j & 0x1) + pivotKey > keys[j]) {
				@Pc(67) int key = keys[j];
				keys[j] = keys[i];
				keys[i] = key;
				@Pc(81) Object value = values[j];
				values[j] = values[i];
				values[i++] = value;
			}
		}
		keys[hi] = keys[i];
		keys[i] = pivotKey;
		values[hi] = values[i];
		values[i] = pivotValue;
		sort(values, i - 1, keys, lo);
		sort(values, hi, keys, i + 1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void sort(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		sort(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZ[I[I)V")
	public static void sort(@OriginalArg(0) int lo, @OriginalArg(1) int hi, @OriginalArg(3) int[] keys, @OriginalArg(4) int[] values) {
		if (lo >= hi) {
			return;
		}
		@Pc(22) int mid = (hi + lo) / 2;
		@Pc(24) int i = lo;
		@Pc(28) int pivotKey = keys[mid];
		keys[mid] = keys[hi];
		keys[hi] = pivotKey;
		@Pc(42) int pivotValue = values[mid];
		values[mid] = values[hi];
		values[hi] = pivotValue;
		for (@Pc(54) int j = lo; j < hi; j++) {
			if (keys[j] > (j & 0x1) + pivotKey) {
				@Pc(79) int key = keys[j];
				keys[j] = keys[i];
				keys[i] = key;
				@Pc(93) int value = values[j];
				values[j] = values[i];
				values[i++] = value;
			}
		}
		keys[hi] = keys[i];
		keys[i] = pivotKey;
		values[hi] = values[i];
		values[i] = pivotValue;
		sort(lo, i - 1, keys, values);
		sort(i + 1, hi, keys, values);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[JII[Ljava/lang/Object;)V")
	public static void sort(@OriginalArg(0) int hi, @OriginalArg(1) long[] keys, @OriginalArg(3) int lo, @OriginalArg(4) Object[] values) {
		if (lo >= hi) {
			return;
		}
		@Pc(16) int i = lo;
		@Pc(23) int mid = (lo + hi) / 2;
		@Pc(27) long pivotKey = keys[mid];
		keys[mid] = keys[hi];
		keys[hi] = pivotKey;
		@Pc(41) Object pivotValue = values[mid];
		values[mid] = values[hi];
		values[hi] = pivotValue;
		for (@Pc(53) int j = lo; j < hi; j++) {
			if (pivotKey + (long) (j & 0x1) > keys[j]) {
				@Pc(72) long key = keys[j];
				keys[j] = keys[i];
				keys[i] = key;
				@Pc(86) Object value = values[j];
				values[j] = values[i];
				values[i++] = value;
			}
		}
		keys[hi] = keys[i];
		keys[i] = pivotKey;
		values[hi] = values[i];
		values[i] = pivotValue;
		sort(i - 1, keys, lo, values);
		sort(hi, keys, i + 1, values);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void sort(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		sort(arg0.length - 1, arg0, 0, arg1);
	}
}
