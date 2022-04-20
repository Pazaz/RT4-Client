import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "Lclient!ve;")
	public static Js5 aClass153_49;

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt3337 = 0;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_637 = Static28.parse("<col=ffffff>");

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!wa;B)Lclient!kc;")
	public static TextureOp29SubOp2 method2664(@OriginalArg(0) Buffer arg0) {
		return new TextureOp29SubOp2(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
	public static boolean method2665(@OriginalArg(1) int arg0) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (Static56.aClass3_Sub2_Sub1_Sub1_1 == null) {
			if (GlRenderer.enabled || Static89.aClass3_Sub2_Sub1_5 == null) {
				Static56.aClass3_Sub2_Sub1_Sub1_1 = new SoftwareSprite(512, 512);
			} else {
				Static56.aClass3_Sub2_Sub1_Sub1_1 = (SoftwareSprite) Static89.aClass3_Sub2_Sub1_5;
			}
			@Pc(32) int[] local32 = Static56.aClass3_Sub2_Sub1_Sub1_1.anIntArray20;
			local35 = local32.length;
			for (local37 = 0; local37 < local35; local37++) {
				local32[local37] = 1;
			}
			for (local37 = 1; local37 < 103; local37++) {
				local76 = 4 * 512 * (103 - local37) + 24628;
				for (local80 = 1; local80 < 103; local80++) {
					if ((Static12.aByteArrayArrayArray2[arg0][local80][local37] & 0x18) == 0) {
						Static152.method2835(local32, local76, arg0, local80, local37);
					}
					if (arg0 < 3 && (Static12.aByteArrayArrayArray2[arg0 + 1][local80][local37] & 0x8) != 0) {
						Static152.method2835(local32, local76, arg0 + 1, local80, local37);
					}
					local76 += 4;
				}
			}
			Static251.anInt5454 = 0;
			for (local37 = 0; local37 < 104; local37++) {
				for (local76 = 0; local76 < 104; local76++) {
					@Pc(169) long local169 = Static20.method602(Static55.level, local37 + 0, local76);
					if (local169 != 0L) {
						@Pc(184) LocType local184 = Static271.method4601((int) (local169 >>> 32) & Integer.MAX_VALUE);
						@Pc(187) int local187 = local184.anInt4400;
						@Pc(194) int local194;
						if (local184.anIntArray380 != null) {
							for (local194 = 0; local194 < local184.anIntArray380.length; local194++) {
								if (local184.anIntArray380[local194] != -1) {
									@Pc(216) LocType local216 = Static271.method4601(local184.anIntArray380[local194]);
									if (local216.anInt4400 >= 0) {
										local187 = local216.anInt4400;
										break;
									}
								}
							}
						}
						if (local187 >= 0) {
							@Pc(237) int local237 = local76;
							local194 = local37;
							if (local187 != 22 && local187 != 29 && local187 != 34 && local187 != 36 && local187 != 46 && local187 != 47 && local187 != 48) {
								@Pc(269) int[][] local269 = Static148.aClass97Array1[Static55.level].anIntArrayArray30;
								for (@Pc(271) int local271 = 0; local271 < 10; local271++) {
									@Pc(281) int local281 = (int) (Math.random() * 4.0D);
									if (local281 == 0 && local194 > 0 && local37 - 3 < local194 && (local269[local194 - 1][local237] & 0x12C0108) == 0) {
										local194--;
									}
									if (local281 == 1 && local194 < 103 && local37 + 3 > local194 && (local269[local194 + 1][local237] & 0x12C0180) == 0) {
										local194++;
									}
									if (local281 == 2 && local237 > 0 && local76 - 3 < local237 && (local269[local194][local237 - 1] & 0x12C0102) == 0) {
										local237--;
									}
									if (local281 == 3 && local237 < 103 && local237 < local76 + 3 && (local269[local194][local237 + 1] & 0x12C0120) == 0) {
										local237++;
									}
								}
							}
							Static199.anIntArray417[Static251.anInt5454] = local184.anInt4426;
							Static145.anIntArray331[Static251.anInt5454] = local194;
							Static93.anIntArray219[Static251.anInt5454] = local237;
							Static251.anInt5454++;
						}
					}
				}
			}
		}
		Static56.aClass3_Sub2_Sub1_Sub1_1.method304();
		@Pc(455) int local455 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
		local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local37 = 1; local37 < 103; local37++) {
			for (local76 = 1; local76 < 103; local76++) {
				if ((Static12.aByteArrayArrayArray2[arg0][local76][local37] & 0x18) == 0 && !Static164.method3109(local76, local455, local37, local35, arg0)) {
					if (GlRenderer.enabled) {
						Static129.anIntArray297 = null;
					} else {
						Static260.aClass27_2.method4189();
					}
					return false;
				}
				if (arg0 < 3 && (Static12.aByteArrayArrayArray2[arg0 + 1][local76][local37] & 0x8) != 0 && !Static164.method3109(local76, local455, local37, local35, arg0 + 1)) {
					if (GlRenderer.enabled) {
						Static129.anIntArray297 = null;
					} else {
						Static260.aClass27_2.method4189();
					}
					return false;
				}
			}
		}
		if (GlRenderer.enabled) {
			@Pc(576) int[] local576 = Static56.aClass3_Sub2_Sub1_Sub1_1.anIntArray20;
			local76 = local576.length;
			for (local80 = 0; local80 < local76; local80++) {
				if (local576[local80] == 0) {
					local576[local80] = 1;
				}
			}
			Static89.aClass3_Sub2_Sub1_5 = new GlSprite(Static56.aClass3_Sub2_Sub1_Sub1_1);
		} else {
			Static89.aClass3_Sub2_Sub1_5 = Static56.aClass3_Sub2_Sub1_Sub1_1;
		}
		if (GlRenderer.enabled) {
			Static129.anIntArray297 = null;
		} else {
			Static260.aClass27_2.method4189();
		}
		Static56.aClass3_Sub2_Sub1_Sub1_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V")
	public static void method2666() {
		Static279.aClass99_38.method3102(5);
		Static56.aClass99_9.method3102(5);
	}
}
