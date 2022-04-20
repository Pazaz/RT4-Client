import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!ve;")
	public static Js5 aClass153_109;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_37 = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
	public static final int[] anIntArray517 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_1087 = Static28.parse("Cabbage");

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
	public static int anInt5773 = 0;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
	public static int[] anIntArray518 = new int[2];

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
	public static int anInt5774 = 0;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public static int anInt5775 = 0;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
	public static int anInt5776 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lclient!bm;")
	public static GroundDecor method4526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) GroundDecor local14 = local7.aClass15_1;
			local7.aClass15_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z")
	public static boolean method4527() {
		if (Static150.aBoolean175) {
			try {
				return !((Boolean) Static119.aClass100_588.method3157(Static71.signLink.anApplet2));
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public static void method4528(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static123.anInt3058 += arg0 * 128;
		@Pc(40) int local40;
		if (Static270.anIntArray562.length < Static123.anInt3058) {
			Static123.anInt3058 -= Static270.anIntArray562.length;
			local40 = (int) (Math.random() * 12.0D);
			Static69.method1545(Static233.aClass36_Sub1Array1[local40]);
		}
		local40 = 0;
		@Pc(54) int local54 = (256 - arg0) * 128;
		@Pc(58) int local58 = arg0 * 128;
		@Pc(60) int local60;
		@Pc(89) int local89;
		for (local60 = 0; local60 < local54; local60++) {
			local89 = Static216.anIntArray188[local40 + local58] - arg0 * Static270.anIntArray562[Static270.anIntArray562.length - 1 & Static123.anInt3058 + local40] / 6;
			if (local89 < 0) {
				local89 = 0;
			}
			Static216.anIntArray188[local40++] = local89;
		}
		@Pc(117) int local117;
		@Pc(125) int local125;
		for (local60 = 256 - arg0; local60 < 256; local60++) {
			local89 = local60 * 128;
			for (local117 = 0; local117 < 128; local117++) {
				local125 = (int) (Math.random() * 100.0D);
				if (local125 < 50 && local117 > 10 && local117 < 118) {
					Static216.anIntArray188[local117 + local89] = 255;
				} else {
					Static216.anIntArray188[local117 + local89] = 0;
				}
			}
		}
		for (local60 = 0; local60 < 256 - arg0; local60++) {
			Static35.anIntArray83[local60] = Static35.anIntArray83[local60 + arg0];
		}
		for (local60 = 256 - arg0; local60 < 256; local60++) {
			Static35.anIntArray83[local60] = (int) (Math.sin((double) Static1.anInt6 / 14.0D) * 16.0D + Math.sin((double) Static1.anInt6 / 15.0D) * 14.0D + Math.sin((double) Static1.anInt6 / 16.0D) * 12.0D);
			Static1.anInt6++;
		}
		Static226.anInt5084 += arg0;
		local60 = (arg0 + (Static83.anInt372 & 0x1)) / 2;
		if (local60 <= 0) {
			return;
		}
		for (local89 = 0; local89 < Static226.anInt5084; local89++) {
			local117 = (int) (Math.random() * 124.0D) + 2;
			local125 = (int) (Math.random() * 128.0D) + 128;
			Static216.anIntArray188[local117 + (local125 << 7)] = 192;
		}
		Static226.anInt5084 = 0;
		@Pc(290) int local290;
		for (local89 = 0; local89 < 256; local89++) {
			local125 = local89 * 128;
			local117 = 0;
			for (local290 = -local60; local290 < 128; local290++) {
				if (local60 + local290 < 128) {
					local117 += Static216.anIntArray188[local125 + local290 + local60];
				}
				if (local290 - local60 - 1 >= 0) {
					local117 -= Static216.anIntArray188[local290 + local125 - local60 - 1];
				}
				if (local290 >= 0) {
					Static103.anIntArray254[local290 + local125] = local117 / (local60 * 2 + 1);
				}
			}
		}
		for (local89 = 0; local89 < 128; local89++) {
			local117 = 0;
			for (local125 = -local60; local125 < 256; local125++) {
				local290 = local125 * 128;
				if (local125 + local60 < 256) {
					local117 += Static103.anIntArray254[local60 * 128 + local89 + local290];
				}
				if (local125 - local60 - 1 >= 0) {
					local117 -= Static103.anIntArray254[local89 + local290 - (local60 + 1) * 128];
				}
				if (local125 >= 0) {
					Static216.anIntArray188[local290 + local89] = local117 / (local60 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method4529() {
		Static231.aClass99_29.method3103();
		Static219.aClass99_27.method3103();
	}
}
