import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static int anInt5393;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public static int anInt5388 = 0;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_1029 = JagString.parse("cookiehost");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method4239() {
		for (@Pc(9) SpotAnimNode local9 = (SpotAnimNode) Static99.aClass69_64.method2289(); local9 != null; local9 = (SpotAnimNode) Static99.aClass69_64.method2288()) {
			@Pc(15) SpotAnim local15 = local9.aClass8_Sub2_1;
			if (local15.anInt606 != Static55.level || local15.aBoolean41) {
				local9.unlink();
			} else if (local15.anInt590 <= Static83.loop) {
				local15.method558(Static178.anInt4247);
				if (local15.aBoolean41) {
					local9.unlink();
				} else {
					Static43.method1141(local15.anInt606, local15.anInt604, local15.anInt598, local15.anInt599, 60, local15, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!me;IIII)V")
	public static void method4240(@OriginalArg(0) NpcType arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static231.anInt5204 >= 400) {
			return;
		}
		if (arg0.multiNpcs != null) {
			arg0 = arg0.getMultiNpc();
		}
		if (arg0 == null || !arg0.aBoolean183) {
			return;
		}
		@Pc(35) JagString local35 = arg0.name;
		if (arg0.combatLevel != 0) {
			@Pc(47) JagString local47 = client.game == 1 ? LocalizedText.RATING : LocalizedText.LEVEL;
			local35 = JagString.concatenate(new JagString[] { local35, Static123.method2420(arg0.combatLevel, PlayerList.self.anInt1652), Static123.aClass100_593, local47, Static123.parseInt(arg0.combatLevel), Static72.aClass100_448 });
		}
		if (Static260.anInt5014 == 1) {
			Static98.method1966(Static169.anInt4075, (long) arg2, JagString.concatenate(new JagString[] { Static34.aClass100_203, Static201.aClass100_407, local35 }), arg1, (short) 26, LocalizedText.USE, arg3);
		} else if (Static241.aBoolean302) {
			@Pc(378) ParamType local378 = Static121.anInt3039 == -1 ? null : ParamTypeList.get(Static121.anInt3039);
			if ((Static274.anInt4999 & 0x2) != 0 && (local378 == null || arg0.getParam(Static121.anInt3039, local378.defaultInt) != local378.defaultInt)) {
				Static98.method1966(anInt5393, (long) arg2, JagString.concatenate(new JagString[] { Static78.aClass100_466, Static201.aClass100_407, local35 }), arg1, (short) 45, Static102.aClass100_545, arg3);
			}
		} else {
			@Pc(129) JagString[] local129 = arg0.ops;
			if (Static208.aBoolean237) {
				local129 = Static279.method4664(local129);
			}
			@Pc(140) int local140;
			if (local129 != null) {
				for (local140 = 4; local140 >= 0; local140--) {
					if (local129[local140] != null && (client.game != 0 || !local129[local140].equalsIgnoreCase(LocalizedText.ATTACK))) {
						@Pc(161) byte local161 = 0;
						if (local140 == 0) {
							local161 = 17;
						}
						if (local140 == 1) {
							local161 = 16;
						}
						@Pc(176) int local176 = -1;
						if (local140 == 2) {
							local161 = 4;
						}
						if (local140 == 3) {
							local161 = 19;
						}
						if (arg0.cursor1Op == local140) {
							local176 = arg0.cursor1;
						}
						if (local140 == arg0.cursor2Op) {
							local176 = arg0.cursor2;
						}
						if (local140 == 4) {
							local161 = 2;
						}
						Static98.method1966(local176, (long) arg2, JagString.concatenate(new JagString[] { Static226.aClass100_965, local35 }), arg1, local161, local129[local140], arg3);
					}
				}
			}
			if (client.game == 0 && local129 != null) {
				for (local140 = 4; local140 >= 0; local140--) {
					if (local129[local140] != null && local129[local140].equalsIgnoreCase(LocalizedText.ATTACK)) {
						@Pc(271) short local271 = 0;
						if (arg0.combatLevel > PlayerList.self.anInt1652) {
							local271 = 2000;
						}
						@Pc(281) short local281 = 0;
						if (local140 == 0) {
							local281 = 17;
						}
						if (local140 == 1) {
							local281 = 16;
						}
						if (local140 == 2) {
							local281 = 4;
						}
						if (local140 == 3) {
							local281 = 19;
						}
						if (local140 == 4) {
							local281 = 2;
						}
						if (local281 != 0) {
							local281 += local271;
						}
						Static98.method1966(arg0.anInt3752, (long) arg2, JagString.concatenate(new JagString[] { Static226.aClass100_965, local35 }), arg1, local281, local129[local140], arg3);
					}
				}
			}
			Static98.method1966(Static225.anInt5073, (long) arg2, JagString.concatenate(new JagString[] { Static226.aClass100_965, local35 }), arg1, (short) 1007, LocalizedText.EXAMINE, arg3);
		}
	}

}
