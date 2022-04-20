import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[[Lclient!li;")
	public static final Environment[][] aClass92ArrayArray1 = new Environment[13][13];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void loop() {
		while (true) {
			@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) Static128.aClass69_77.method2287();
			if (local17 == null) {
				return;
			}
			@Pc(40) PathingEntity local40;
			@Pc(29) int local29;
			if (local17.anInt1192 < 0) {
				local29 = -local17.anInt1192 - 1;
				if (local29 == Static16.anInt549) {
					local40 = Static173.self;
				} else {
					local40 = Static159.aClass8_Sub4_Sub1Array1[local29];
				}
			} else {
				local29 = local17.anInt1192 - 1;
				local40 = Static175.aClass8_Sub4_Sub2Array1[local29];
			}
			if (local40 != null) {
				@Pc(63) LocType local63 = Static271.method4601(local17.anInt1189);
				if (Static55.level < 3) {
				}
				@Pc(86) int local86;
				@Pc(83) int local83;
				if (local17.anInt1206 == 1 || local17.anInt1206 == 3) {
					local83 = local63.anInt4397;
					local86 = local63.anInt4403;
				} else {
					local86 = local63.anInt4397;
					local83 = local63.anInt4403;
				}
				@Pc(103) int local103 = (local86 + 1 >> 1) + local17.anInt1190;
				@Pc(110) int local110 = (local86 >> 1) + local17.anInt1190;
				@Pc(117) int local117 = (local83 >> 1) + local17.anInt1204;
				@Pc(126) int local126 = (local83 + 1 >> 1) + local17.anInt1204;
				@Pc(130) int[][] local130 = Static83.anIntArrayArrayArray4[Static55.level];
				@Pc(157) int local157 = local130[local103][local126] + local130[local110][local126] + local130[local110][local117] + local130[local103][local117] >> 2;
				@Pc(159) Entity local159 = null;
				@Pc(164) int local164 = Static133.anIntArray453[local17.anInt1198];
				if (local164 == 0) {
					@Pc(176) Wall local176 = Static262.method4509(Static55.level, local17.anInt1190, local17.anInt1204);
					if (local176 != null) {
						local159 = local176.aClass8_5;
					}
				} else if (local164 == 1) {
					@Pc(231) WallDecor local231 = Static83.method435(Static55.level, local17.anInt1190, local17.anInt1204);
					if (local231 != null) {
						local159 = local231.aClass8_3;
					}
				} else if (local164 == 2) {
					@Pc(198) Scenery local198 = Static133.method4008(Static55.level, local17.anInt1190, local17.anInt1204);
					if (local198 != null) {
						local159 = local198.aClass8_4;
					}
				} else if (local164 == 3) {
					@Pc(216) GroundDecor local216 = Static269.method2210(Static55.level, local17.anInt1190, local17.anInt1204);
					if (local216 != null) {
						local159 = local216.aClass8_1;
					}
				}
				if (local159 != null) {
					Static29.method800(Static55.level, local17.anInt1204, 0, local17.anInt1190, local17.anInt1205 + 1, -1, local164, 0, local17.anInt1187 + 1);
					local40.anInt3375 = local17.anInt1205 + Static83.anInt372;
					local40.anInt3426 = local83 * 64 + local17.anInt1204 * 128;
					local40.anInt3379 = local86 * 64 + local17.anInt1190 * 128;
					local40.anObject5 = local159;
					@Pc(292) int local292 = local17.anInt1188;
					local40.anInt3406 = local157;
					local40.anInt3390 = Static83.anInt372 + local17.anInt1187;
					@Pc(304) int local304 = local17.anInt1191;
					@Pc(307) int local307 = local17.anInt1197;
					@Pc(310) int local310 = local17.anInt1200;
					@Pc(316) int local316;
					if (local292 > local304) {
						local316 = local292;
						local292 = local304;
						local304 = local316;
					}
					local40.anInt3411 = local17.anInt1190 + local304;
					if (local307 > local310) {
						local316 = local307;
						local307 = local310;
						local310 = local316;
					}
					local40.anInt3374 = local17.anInt1204 + local307;
					local40.anInt3410 = local310 + local17.anInt1204;
					local40.anInt3384 = local17.anInt1190 + local292;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public static void method3474() {
		Static250.aClass99_33.method3103();
		Static139.aClass99_21.method3103();
	}
}
