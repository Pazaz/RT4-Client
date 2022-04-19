import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "[Lclient!vb;")
	public static VorbisResidue[] aClass152Array1;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray63;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
	public static int anInt2975;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lclient!uk;")
	public static VorbisMapping[] aClass151Array1;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	private static int anInt2979;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "[Lclient!ji;")
	public static VorbisCodebook[] aClass78Array1;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "[Lclient!ie;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	private static int anInt2982;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[B")
	private static byte[] aByteArray42;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Z")
	private static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)F")
	public static float method2340(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;)Z")
	private static boolean method2344(@OriginalArg(0) Js5 arg0) {
		if (!aBoolean149) {
			@Pc(7) byte[] local7 = arg0.method4495(0, 0);
			if (local7 == null) {
				return false;
			}
			method2349(local7);
			aBoolean149 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;II)Lclient!jc;")
	public static VorbisSound method2345(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2344(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4495(arg1, arg2);
			return local16 == null ? null : new VorbisSound(local16);
		} else {
			arg0.method4491(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()I")
	public static int method2346() {
		@Pc(7) int local7 = aByteArray42[anInt2979] >> anInt2982 & 0x1;
		anInt2982++;
		anInt2979 += anInt2982 >> 3;
		anInt2982 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
	public static void method2347(@OriginalArg(0) byte[] arg0) {
		aByteArray42 = arg0;
		anInt2979 = 0;
		anInt2982 = 0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([B)V")
	private static void method2349(@OriginalArg(0) byte[] arg0) {
		method2347(arg0);
		anInt2978 = 0x1 << method2350(4);
		anInt2975 = 0x1 << method2350(4);
		aFloatArray14 = new float[anInt2975];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt2978 : anInt2975;
			local30 = local26 >> 1;
			local34 = local26 >> 2;
			local38 = local26 >> 3;
			@Pc(41) float[] local41 = new float[local30];
			for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
				local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
				local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
			}
			@Pc(86) float[] local86 = new float[local30];
			for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
				local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
				local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
			}
			@Pc(138) float[] local138 = new float[local34];
			for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
				local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
				local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
			}
			@Pc(187) int[] local187 = new int[local38];
			@Pc(193) int local193 = Static204.method3674(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static24.method667(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray13 = local41;
				aFloatArray15 = local86;
				aFloatArray16 = local138;
				anIntArray276 = local187;
			} else {
				aFloatArray12 = local41;
				aFloatArray9 = local86;
				aFloatArray10 = local138;
				anIntArray277 = local187;
			}
		}
		local17 = method2350(8) + 1;
		aClass78Array1 = new VorbisCodebook[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass78Array1[local26] = new VorbisCodebook();
		}
		local26 = method2350(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method2350(16);
		}
		local26 = method2350(6) + 1;
		aClass67Array1 = new Class67[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass67Array1[local30] = new Class67();
		}
		local30 = method2350(6) + 1;
		aClass152Array1 = new VorbisResidue[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass152Array1[local34] = new VorbisResidue();
		}
		local34 = method2350(6) + 1;
		aClass151Array1 = new VorbisMapping[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass151Array1[local38] = new VorbisMapping();
		}
		local38 = method2350(6) + 1;
		aBooleanArray63 = new boolean[local38];
		anIntArray278 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray63[local340] = method2346() != 0;
			method2350(16);
			method2350(16);
			anIntArray278[local340] = method2350(8);
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
	public static int method2350(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt2982) {
			local12 = 8 - anInt2982;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray42[anInt2979] >> anInt2982 & local18) << local3;
			anInt2982 = 0;
			anInt2979++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray42[anInt2979] >> anInt2982 & local12) << local3;
			anInt2982 += arg0;
		}
		return local1;
	}
}
