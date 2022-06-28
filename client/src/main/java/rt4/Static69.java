package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lsignlink!ll;")
	public static SignLink signLink;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][]{new boolean[0], {true, false, true}, {true, false, false, true}, {false, false, true, true}, {true, true, false}, {false, true, true}, {true, false, false, true}, {false, false, false, true, true}, {false, true, true}, {true, false, true, true, true}, {false, true, true, true, true}, {false, true, true, true, true, false}};

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)I")
	public static int method1540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		} else {
			@Pc(17) int local17 = 128 - arg0;
			@Pc(50) int local50 = arg0 * (arg2 >>> 7 & 0x1FE01FE) + local17 * (arg1 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(65) int local65 = local17 * (arg1 & 0xFF00FF) + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00;
			return local50 + (local65 >> 7);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!ek;)V")
	public static void method1545(@OriginalArg(1) SoftwareIndexedSprite arg0) {
		@Pc(5) int local5;
		for (local5 = 0; local5 < Static267.anIntArray562.length; local5++) {
			Static267.anIntArray562[local5] = 0;
		}
		@Pc(36) int local36;
		for (local5 = 0; local5 < 5000; local5++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static267.anIntArray562[local36] = (int) (Math.random() * 284.0D);
		}
		@Pc(66) int local66;
		@Pc(76) int local76;
		for (local5 = 0; local5 < 20; local5++) {
			for (local36 = 1; local36 < 255; local36++) {
				for (local66 = 1; local66 < 127; local66++) {
					local76 = local66 + (local36 << 7);
					Static145.anIntArray516[local76] = (Static267.anIntArray562[local76 + 128] + Static267.anIntArray562[local76 - 1] + Static267.anIntArray562[local76 + 1] + Static267.anIntArray562[local76 + -128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static267.anIntArray562;
			Static267.anIntArray562 = Static145.anIntArray516;
			Static145.anIntArray516 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local5 = 0;
		for (local36 = 0; local36 < arg0.height; local36++) {
			for (local66 = 0; local66 < arg0.width; local66++) {
				if (arg0.aByteArray18[local5++] != 0) {
					local76 = arg0.anInt4280 + local66 + 16;
					@Pc(162) int local162 = arg0.anInt4273 + local36 + 16;
					@Pc(169) int local169 = local76 + (local162 << 7);
					Static267.anIntArray562[local169] = 0;
				}
			}
		}
	}

}
