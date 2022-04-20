import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array88;

	@OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!i", name = "ac", descriptor = "[I")
	public static final int[] anIntArray253 = new int[256];

	@OriginalMember(owner = "client!i", name = "ic", descriptor = "Lclient!na;")
	public static final JagString aClass100_558 = Static28.parse("m");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!na;ILclient!na;I)V")
	public static void method2231(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString arg2) {
		Static154.method2928(-1, arg1, arg2, null, arg0);
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(II)V")
	public static void method2232(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static196.anIntArray408[arg0];
		@Pc(19) int local19 = Static56.anIntArray142[arg0];
		@Pc(23) int local23 = Static39.aShortArray6[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(31) long local31 = Static159.aLongArray5[arg0];
		@Pc(36) int local36 = (int) Static159.aLongArray5[arg0];
		@Pc(43) Player local43;
		if (local23 == 31) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static70.type = 2;
				Static17.milliseconds = 0;
				Static122.x = Static7.clickX;
				Static25.y = Static60.clickY;
				Static6.outboundBuffer.p1isaac(71);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		if (local23 == 46) {
			Static233.method4003(local31, local19, local15);
			Static6.outboundBuffer.p1isaac(247);
			Static6.outboundBuffer.p2le(Static142.originZ + local19);
			Static6.outboundBuffer.p2leadd(local15 + Static225.originX);
			Static6.outboundBuffer.p2(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local23 == 40) {
			Static6.outboundBuffer.p1isaac(27);
			Static6.outboundBuffer.p2(Static185.anInt4370);
			Static6.outboundBuffer.p4le2(local19);
			Static6.outboundBuffer.p2le(local15);
			Static6.outboundBuffer.p4le2(Static224.anInt5062);
			Static6.outboundBuffer.p2leadd(Static274.anInt4997);
			Static6.outboundBuffer.p2leadd(local36);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		@Pc(192) Npc local192;
		if (local23 == 19) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static122.x = Static7.clickX;
				Static70.type = 2;
				Static17.milliseconds = 0;
				Static25.y = Static60.clickY;
				Static6.outboundBuffer.p1isaac(30);
				Static6.outboundBuffer.p2(local36);
			}
		}
		if (local23 == 17) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static122.x = Static7.clickX;
				Static17.milliseconds = 0;
				Static70.type = 2;
				Static25.y = Static60.clickY;
				Static6.outboundBuffer.p1isaac(78);
				Static6.outboundBuffer.p2le(local36);
			}
		}
		if (local23 == 44) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static122.x = Static7.clickX;
				Static70.type = 2;
				Static25.y = Static60.clickY;
				Static17.milliseconds = 0;
				Static6.outboundBuffer.p1isaac(133);
				Static6.outboundBuffer.p2le(local36);
			}
		}
		if (local23 == 58) {
			Static6.outboundBuffer.p1isaac(135);
			Static6.outboundBuffer.p2add(local36);
			Static6.outboundBuffer.p2add(local15);
			Static6.outboundBuffer.p4me(local19);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 42) {
			Static233.method4003(local31, local19, local15);
			Static6.outboundBuffer.p1isaac(254);
			Static6.outboundBuffer.p2le(local15 + Static225.originX);
			Static6.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static6.outboundBuffer.p2(local19 + Static142.originZ);
		}
		if (local23 == 28) {
			Static153.method2909();
		}
		if (local23 == 45) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static122.x = Static7.clickX;
				Static70.type = 2;
				Static17.milliseconds = 0;
				Static25.y = Static60.clickY;
				Static6.outboundBuffer.p1isaac(239);
				Static6.outboundBuffer.p4le2(Static98.anInt2512);
				Static6.outboundBuffer.p2add(Static15.anInt506);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		@Pc(560) boolean local560;
		if (local23 == 18) {
			if (Static266.game == 1) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			} else {
				local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
				if (!local560) {
					Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
				}
			}
			Static122.x = Static7.clickX;
			Static17.milliseconds = 0;
			Static70.type = 2;
			Static25.y = Static60.clickY;
			Static6.outboundBuffer.p1isaac(66);
			Static6.outboundBuffer.p2le(Static225.originX + local15);
			Static6.outboundBuffer.p2(local36);
			Static6.outboundBuffer.p2leadd(local19 + Static142.originZ);
		}
		if (local23 == 1001) {
			Static233.method4003(local31, local19, local15);
			Static6.outboundBuffer.p1isaac(170);
			Static6.outboundBuffer.p2leadd(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static6.outboundBuffer.p2leadd(local15 + Static225.originX);
			Static6.outboundBuffer.p2leadd(local19 + Static142.originZ);
		}
		if (local23 == 1002) {
			Static70.type = 2;
			Static122.x = Static7.clickX;
			Static25.y = Static60.clickY;
			Static17.milliseconds = 0;
			Static6.outboundBuffer.p1isaac(92);
			Static6.outboundBuffer.p2leadd(local36);
		}
		@Pc(693) Component local693;
		if (local23 == 1006) {
			local693 = Static5.getComponent(local19);
			if (local693 == null || local693.objCounts[local15] < 100000) {
				Static6.outboundBuffer.p1isaac(92);
				Static6.outboundBuffer.p2leadd(local36);
			} else {
				method2231(Static186.aClass100_827, 0, Static34.method882(new JagString[] { Static123.method2423(local693.objCounts[local15]), Static249.aClass100_1039, Static71.method1439(local36).aClass100_495 }));
			}
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 60) {
			if (local36 == 0) {
				Static113.method3556(Static55.level, local15, local19);
			} else if (local36 == 1) {
				if (Static191.staffModLevel > 0 && Static187.pressedKeys[82] && Static187.pressedKeys[81]) {
					Static61.teleport(Static225.originX + local15, Static142.originZ + local19, Static55.level);
				} else if (Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, true, 0, local15, 0, 0, 1, local19, Static173.self.movementQueueX[0])) {
					Static6.outboundBuffer.p1(Static1.anInt5);
					Static6.outboundBuffer.p1(Static107.anInt2878);
					Static6.outboundBuffer.p2(Static57.anInt1747);
					Static6.outboundBuffer.p1(57);
					Static6.outboundBuffer.p1(Static59.anInt1814);
					Static6.outboundBuffer.p1(Static273.anInt4130);
					Static6.outboundBuffer.p1(89);
					Static6.outboundBuffer.p2(Static173.self.anInt3412);
					Static6.outboundBuffer.p2(Static173.self.anInt3421);
					Static6.outboundBuffer.p1(Static221.anInt4364);
					Static6.outboundBuffer.p1(63);
				}
			}
		}
		if (local23 == 1007) {
			Static17.milliseconds = 0;
			Static70.type = 2;
			Static25.y = Static60.clickY;
			Static122.x = Static7.clickX;
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				@Pc(884) NpcType local884 = local192.aClass96_1;
				if (local884.anIntArray357 != null) {
					local884 = local884.method2932();
				}
				if (local884 != null) {
					Static6.outboundBuffer.p1isaac(72);
					Static6.outboundBuffer.p2(local884.anInt3741);
				}
			}
		}
		if (local23 == 47) {
			Static6.outboundBuffer.p1isaac(156);
			Static6.outboundBuffer.p2leadd(local15);
			Static6.outboundBuffer.p2add(local36);
			Static6.outboundBuffer.p4le2(local19);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 3) {
			Static6.outboundBuffer.p1isaac(253);
			Static6.outboundBuffer.p4le2(Static98.anInt2512);
			Static6.outboundBuffer.p2leadd(local15);
			Static6.outboundBuffer.p4le2(local19);
			Static6.outboundBuffer.p2add(local36);
			Static6.outboundBuffer.p2le(Static15.anInt506);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 10) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static70.type = 2;
				Static25.y = Static60.clickY;
				Static122.x = Static7.clickX;
				Static17.milliseconds = 0;
				Static6.outboundBuffer.p1isaac(4);
				Static6.outboundBuffer.p2le(local36);
			}
		}
		if (local23 == 41 && Static39.aClass13_10 == null) {
			Static2.method10(local15, local19);
			Static39.aClass13_10 = Static201.method1418(local19, local15);
			Static43.method1143(Static39.aClass13_10);
		}
		if (local23 == 49) {
			Static233.method4003(local31, local19, local15);
			Static6.outboundBuffer.p1isaac(84);
			Static6.outboundBuffer.p2leadd(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static6.outboundBuffer.p2leadd(Static142.originZ + local19);
			Static6.outboundBuffer.p2le(local15 + Static225.originX);
		}
		if (local23 == 23) {
			Static6.outboundBuffer.p1isaac(206);
			Static6.outboundBuffer.p2add(local36);
			Static6.outboundBuffer.p2le(local15);
			Static6.outboundBuffer.p4le2(local19);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 14 && Static233.method4003(local31, local19, local15)) {
			Static6.outboundBuffer.p1isaac(134);
			Static6.outboundBuffer.p2add(Static225.originX + local15);
			Static6.outboundBuffer.p2(Static274.anInt4997);
			Static6.outboundBuffer.p2le(local19 + Static142.originZ);
			Static6.outboundBuffer.p2(Static185.anInt4370);
			Static6.outboundBuffer.p4me(Static224.anInt5062);
			Static6.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (local23 == 37) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static17.milliseconds = 0;
				Static70.type = 2;
				Static25.y = Static60.clickY;
				Static122.x = Static7.clickX;
				Static6.outboundBuffer.p1isaac(114);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		if (local23 == 9 || local23 == 1003) {
			Static263.method4512(Static233.aClass100Array160[arg0], local15, local36, local19);
		}
		if (local23 == 5) {
			Static6.outboundBuffer.p1isaac(55);
			Static6.outboundBuffer.p2le(local36);
			Static6.outboundBuffer.p2add(local15);
			Static6.outboundBuffer.p4rme(local19);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 21) {
			if (Static266.game == 1) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			} else {
				local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
				if (!local560) {
					Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
				}
			}
			Static70.type = 2;
			Static122.x = Static7.clickX;
			Static17.milliseconds = 0;
			Static25.y = Static60.clickY;
			Static6.outboundBuffer.p1isaac(228);
			Static6.outboundBuffer.p2(local36);
			Static6.outboundBuffer.p2le(Static225.originX + local15);
			Static6.outboundBuffer.p2leadd(Static142.originZ + local19);
		}
		if (local23 == 4) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static70.type = 2;
				Static17.milliseconds = 0;
				Static25.y = Static60.clickY;
				Static122.x = Static7.clickX;
				Static6.outboundBuffer.p1isaac(148);
				Static6.outboundBuffer.p2add(local36);
			}
		}
		if (local23 == 32) {
			local693 = Static201.method1418(local19, local15);
			if (local693 != null) {
				Static53.method1294();
				@Pc(1493) ServerActiveProperties local1493 = Static36.method940(local693);
				Static247.method4246(local19, local15, local1493.method512(), local1493.anInt540, local693.anInt499, local693.anInt484);
				Static260.anInt5014 = 0;
				Static102.aClass100_545 = Static97.method1963(local693);
				if (Static102.aClass100_545 == null) {
					Static102.aClass100_545 = Static250.aClass100_1042;
				}
				if (local693.aBoolean32) {
					Static78.aClass100_466 = Static34.method882(new JagString[] { local693.aClass100_88, Static204.aClass100_896 });
				} else {
					Static78.aClass100_466 = Static34.method882(new JagString[] { Static42.aClass100_332, local693.aClass100_85, Static204.aClass100_896 });
				}
			}
			return;
		}
		if (local23 == 29) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static25.y = Static60.clickY;
				Static17.milliseconds = 0;
				Static70.type = 2;
				Static122.x = Static7.clickX;
				Static6.outboundBuffer.p1isaac(180);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		if (local23 == 35) {
			Static6.outboundBuffer.p1isaac(161);
			Static6.outboundBuffer.p4le2(local19);
			Static6.outboundBuffer.p2leadd(local36);
			Static6.outboundBuffer.p2leadd(local15);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 15) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static17.milliseconds = 0;
				Static70.type = 2;
				Static122.x = Static7.clickX;
				Static25.y = Static60.clickY;
				Static6.outboundBuffer.p1isaac(195);
				Static6.outboundBuffer.p2add(Static15.anInt506);
				Static6.outboundBuffer.p4le2(Static98.anInt2512);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		if (local23 == 34) {
			if (Static266.game == 1) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			} else {
				local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
				if (!local560) {
					Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
				}
			}
			Static122.x = Static7.clickX;
			Static70.type = 2;
			Static25.y = Static60.clickY;
			Static17.milliseconds = 0;
			Static6.outboundBuffer.p1isaac(109);
			Static6.outboundBuffer.p2le(local19 + Static142.originZ);
			Static6.outboundBuffer.p2(local15 + Static225.originX);
			Static6.outboundBuffer.p2leadd(local36);
		}
		if (local23 == 25) {
			Static6.outboundBuffer.p1isaac(81);
			Static6.outboundBuffer.p2add(local15);
			Static6.outboundBuffer.p2(local36);
			Static6.outboundBuffer.p4rme(local19);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 2) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static25.y = Static60.clickY;
				Static70.type = 2;
				Static122.x = Static7.clickX;
				Static17.milliseconds = 0;
				Static6.outboundBuffer.p1isaac(218);
				Static6.outboundBuffer.p2le(local36);
			}
		}
		@Pc(1955) int local1955;
		if (local23 == 51) {
			Static6.outboundBuffer.p1isaac(10);
			Static6.outboundBuffer.p4(local19);
			local693 = Static5.getComponent(local19);
			if (local693.anIntArrayArray4 != null && local693.anIntArrayArray4[0][0] == 5) {
				local1955 = local693.anIntArrayArray4[0][1];
				if (Static7.anIntArray75[local1955] != local693.anIntArray48[0]) {
					Static7.anIntArray75[local1955] = local693.anIntArray48[0];
					Static85.method1775(local1955);
				}
			}
		}
		if (local23 == 26) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static70.type = 2;
				Static17.milliseconds = 0;
				Static25.y = Static60.clickY;
				Static122.x = Static7.clickX;
				Static6.outboundBuffer.p1isaac(115);
				Static6.outboundBuffer.p4me(Static224.anInt5062);
				Static6.outboundBuffer.p2le(Static185.anInt4370);
				Static6.outboundBuffer.p2le(local36);
				Static6.outboundBuffer.p2leadd(Static274.anInt4997);
			}
		}
		if (local23 == 59) {
			Static6.outboundBuffer.p1isaac(10);
			Static6.outboundBuffer.p4(local19);
			local693 = Static5.getComponent(local19);
			if (local693.anIntArrayArray4 != null && local693.anIntArrayArray4[0][0] == 5) {
				local1955 = local693.anIntArrayArray4[0][1];
				Static7.anIntArray75[local1955] = 1 - Static7.anIntArray75[local1955];
				Static85.method1775(local1955);
			}
		}
		if (local23 == 33) {
			local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
			if (!local560) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			}
			Static122.x = Static7.clickX;
			Static17.milliseconds = 0;
			Static25.y = Static60.clickY;
			Static70.type = 2;
			Static6.outboundBuffer.p1isaac(101);
			Static6.outboundBuffer.p2leadd(local15 + Static225.originX);
			Static6.outboundBuffer.p2le(Static185.anInt4370);
			Static6.outboundBuffer.p2le(Static274.anInt4997);
			Static6.outboundBuffer.p2le(local36);
			Static6.outboundBuffer.p2leadd(Static142.originZ + local19);
			Static6.outboundBuffer.p4me(Static224.anInt5062);
		}
		if (local23 == 1004) {
			Static17.milliseconds = 0;
			Static122.x = Static7.clickX;
			Static70.type = 2;
			Static25.y = Static60.clickY;
			Static6.outboundBuffer.p1isaac(94);
			Static6.outboundBuffer.p2leadd(local36);
		}
		if (local23 == 11) {
			if (local36 == 0) {
				Static125.anInt3096 = 1;
				Static113.method3556(Static55.level, local15, local19);
			} else if (local36 == 1) {
				Static6.outboundBuffer.p1isaac(131);
				Static6.outboundBuffer.p4me(Static98.anInt2512);
				Static6.outboundBuffer.p2add(Static225.originX + local15);
				Static6.outboundBuffer.p2leadd(Static15.anInt506);
				Static6.outboundBuffer.p2add(local19 + Static142.originZ);
			}
		}
		if (local23 == 8) {
			local693 = Static5.getComponent(local19);
			@Pc(2287) boolean local2287 = true;
			if (local693.anInt453 > 0) {
				local2287 = Static249.method4265(local693);
			}
			if (local2287) {
				Static6.outboundBuffer.p1isaac(10);
				Static6.outboundBuffer.p4(local19);
			}
		}
		if (local23 == 1) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static17.milliseconds = 0;
				Static25.y = Static60.clickY;
				Static70.type = 2;
				Static122.x = Static7.clickX;
				Static6.outboundBuffer.p1isaac(248);
				Static6.outboundBuffer.p2leadd(local36);
				Static6.outboundBuffer.p2(Static274.anInt4997);
				Static6.outboundBuffer.p2(Static185.anInt4370);
				Static6.outboundBuffer.p4me(Static224.anInt5062);
			}
		}
		if (local23 == 7) {
			Static6.outboundBuffer.p1isaac(85);
			Static6.outboundBuffer.p4rme(local19);
			Static6.outboundBuffer.p2(local15);
			Static6.outboundBuffer.p2add(local36);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 24) {
			if (Static266.game == 1) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			} else {
				local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
				if (!local560) {
					Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
				}
			}
			Static70.type = 2;
			Static25.y = Static60.clickY;
			Static122.x = Static7.clickX;
			Static17.milliseconds = 0;
			Static6.outboundBuffer.p1isaac(48);
			Static6.outboundBuffer.p2add(local15 + Static225.originX);
			Static6.outboundBuffer.p2leadd(local36);
			Static6.outboundBuffer.p2le(Static142.originZ + local19);
		}
		if (local23 == 38 && Static233.method4003(local31, local19, local15)) {
			Static6.outboundBuffer.p1isaac(233);
			Static6.outboundBuffer.p2leadd(local19 + Static142.originZ);
			Static6.outboundBuffer.p2add(Static225.originX + local15);
			Static6.outboundBuffer.p2leadd(Static15.anInt506);
			Static6.outboundBuffer.p4rme(Static98.anInt2512);
			Static6.outboundBuffer.p2add((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (local23 == 13) {
			Static6.outboundBuffer.p1isaac(6);
			Static6.outboundBuffer.p4(local19);
			Static6.outboundBuffer.p2add(local15);
			Static6.outboundBuffer.p2le(local36);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 57) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static70.type = 2;
				Static25.y = Static60.clickY;
				Static122.x = Static7.clickX;
				Static17.milliseconds = 0;
				Static6.outboundBuffer.p1isaac(175);
				Static6.outboundBuffer.p2add(local36);
			}
		}
		if (local23 == 22) {
			Static53.method1294();
			local693 = Static5.getComponent(local19);
			Static224.anInt5062 = local19;
			Static185.anInt4370 = local15;
			Static260.anInt5014 = 1;
			Static274.anInt4997 = local36;
			Static43.method1143(local693);
			Static34.aClass100_203 = Static34.method882(new JagString[] { Static8.aClass100_32, Static71.method1439(local36).aClass100_495, Static204.aClass100_896 });
			if (Static34.aClass100_203 == null) {
				Static34.aClass100_203 = Static92.aClass100_510;
			}
			return;
		}
		if (local23 == 50) {
			Static233.method4003(local31, local19, local15);
			Static6.outboundBuffer.p1isaac(194);
			Static6.outboundBuffer.p2leadd(local19 + Static142.originZ);
			Static6.outboundBuffer.p2le(Static225.originX + local15);
			Static6.outboundBuffer.p2((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (local23 == 48) {
			Static6.outboundBuffer.p1isaac(154);
			Static6.outboundBuffer.p2le(local15);
			Static6.outboundBuffer.p4rme(local19);
			Static6.outboundBuffer.p2leadd(local36);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 30) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static17.milliseconds = 0;
				Static122.x = Static7.clickX;
				Static25.y = Static60.clickY;
				Static70.type = 2;
				Static6.outboundBuffer.p1isaac(68);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		if (local23 == 43) {
			Static6.outboundBuffer.p1isaac(153);
			Static6.outboundBuffer.p4le2(local19);
			Static6.outboundBuffer.p2le(local15);
			Static6.outboundBuffer.p2le(local36);
			Static72.anInt2043 = 0;
			Static257.aClass13_7 = Static5.getComponent(local19);
			Static250.anInt5444 = local15;
		}
		if (local23 == 39) {
			local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
			if (!local560) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			}
			Static25.y = Static60.clickY;
			Static122.x = Static7.clickX;
			Static70.type = 2;
			Static17.milliseconds = 0;
			Static6.outboundBuffer.p1isaac(73);
			Static6.outboundBuffer.p4rme(Static98.anInt2512);
			Static6.outboundBuffer.p2(Static142.originZ + local19);
			Static6.outboundBuffer.p2leadd(local36);
			Static6.outboundBuffer.p2leadd(local15 + Static225.originX);
			Static6.outboundBuffer.p2le(Static15.anInt506);
		}
		if (local23 == 12) {
			Static6.outboundBuffer.p1isaac(82);
			Static6.outboundBuffer.p2(Static15.anInt506);
			Static6.outboundBuffer.p4rme(local19);
			Static6.outboundBuffer.p4(Static98.anInt2512);
			Static6.outboundBuffer.p2leadd(local15);
		}
		if (local23 == 36) {
			if (local36 == 0) {
				Static187.anInt4422 = 1;
				Static113.method3556(Static55.level, local15, local19);
			} else if (Static191.staffModLevel > 0 && Static187.pressedKeys[82] && Static187.pressedKeys[81]) {
				Static61.teleport(local15 + Static225.originX, Static142.originZ - -local19, Static55.level);
			} else {
				Static6.outboundBuffer.p1isaac(179);
				Static6.outboundBuffer.p2(local19 + Static142.originZ);
				Static6.outboundBuffer.p2(local15 + Static225.originX);
			}
		}
		if (local23 == 6) {
			local43 = Static159.aClass8_Sub4_Sub1Array1[local36];
			if (local43 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local43.movementQueueX[0], 1, 0, 2, local43.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static25.y = Static60.clickY;
				Static17.milliseconds = 0;
				Static70.type = 2;
				Static122.x = Static7.clickX;
				Static6.outboundBuffer.p1isaac(106);
				Static6.outboundBuffer.p2(local36);
			}
		}
		if (local23 == 20) {
			if (Static266.game == 1) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
			} else {
				local560 = Static102.method2075(Static173.self.movementQueueZ[0], 0, 0, false, 0, local15, 0, 0, 2, local19, Static173.self.movementQueueX[0]);
				if (!local560) {
					Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local15, 1, 0, 2, local19, Static173.self.movementQueueX[0]);
				}
			}
			Static25.y = Static60.clickY;
			Static17.milliseconds = 0;
			Static122.x = Static7.clickX;
			Static70.type = 2;
			Static6.outboundBuffer.p1isaac(33);
			Static6.outboundBuffer.p2(local36);
			Static6.outboundBuffer.p2(Static225.originX + local15);
			Static6.outboundBuffer.p2le(Static142.originZ + local19);
		}
		if (local23 == 16) {
			local192 = Static175.aClass8_Sub4_Sub2Array1[local36];
			if (local192 != null) {
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local192.movementQueueX[0], 1, 0, 2, local192.movementQueueZ[0], Static173.self.movementQueueX[0]);
				Static122.x = Static7.clickX;
				Static17.milliseconds = 0;
				Static25.y = Static60.clickY;
				Static70.type = 2;
				Static6.outboundBuffer.p1isaac(3);
				Static6.outboundBuffer.p2leadd(local36);
			}
		}
		if (Static260.anInt5014 != 0) {
			Static260.anInt5014 = 0;
			Static43.method1143(Static5.getComponent(Static224.anInt5062));
		}
		if (Static241.aBoolean302) {
			Static53.method1294();
		}
		if (Static257.aClass13_7 != null && Static72.anInt2043 == 0) {
			Static43.method1143(Static257.aClass13_7);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)I")
	public static int method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static222.aBoolean246) {
			arg0 = 1000000;
			Static222.aBoolean246 = false;
		}
		@Pc(15) Environment local15 = Static192.aClass92ArrayArray1[arg3][arg1];
		@Pc(25) float local25 = ((float) arg2 * 0.1F + 0.7F) * local15.aFloat16;
		@Pc(28) float local28 = local15.aFloat18;
		@Pc(31) int local31 = local15.anInt3526;
		@Pc(34) int local34 = local15.anInt3529;
		@Pc(37) int local37 = local15.anInt3525;
		if (!Static71.aBoolean107) {
			local34 = 0;
		}
		@Pc(44) float local44 = local15.aFloat17;
		if (local31 != Static109.anInt2883 || Static126.aFloat13 != local25 || Static8.aFloat1 != local28 || local44 != Static15.aFloat4 || Static166.anInt4044 != local37 || Static226.anInt5080 != local34) {
			Static126.aFloat13 = local25;
			Static253.aFloat37 = Static253.aFloat36;
			Static59.aFloat6 = Static61.aFloat7;
			Static109.anInt2883 = local31;
			Static264.anInt4623 = Static154.anInt3709;
			Static171.anInt4153 = Static79.anInt2161;
			Static15.aFloat4 = local44;
			Static3.anInt5868 = 0;
			Static131.anInt3255 = Static261.anInt5731;
			Static226.anInt5080 = local34;
			Static8.aFloat1 = local28;
			Static166.anInt4044 = local37;
			Static185.aFloat23 = Static23.aFloat5;
		}
		if (Static3.anInt5868 < 65536) {
			Static3.anInt5868 += arg0 * 250;
			if (Static3.anInt5868 >= 65536) {
				Static3.anInt5868 = 65536;
			}
			@Pc(114) float local114 = (float) Static3.anInt5868 / 65536.0F;
			@Pc(118) int local118 = Static3.anInt5868 >> 8;
			@Pc(125) int local125 = 65536 - Static3.anInt5868 >> 8;
			Static154.anInt3709 = (local118 * (Static166.anInt4044 & 0xFF00FF) + (Static264.anInt4623 & 0xFF00FF) * local125 & 0xFF00FF00) + (local125 * (Static264.anInt4623 & 0xFF00) + (Static166.anInt4044 & 0xFF00) * local118 & 0xFF0000) >> 8;
			@Pc(162) float local162 = (float) (65536 - Static3.anInt5868) / 65536.0F;
			Static61.aFloat7 = local162 * Static59.aFloat6 + local114 * Static126.aFloat13;
			Static253.aFloat36 = Static253.aFloat37 * local162 + local114 * Static8.aFloat1;
			Static23.aFloat5 = local114 * Static15.aFloat4 + local162 * Static185.aFloat23;
			Static261.anInt5731 = ((Static109.anInt2883 & 0xFF00) * local118 + local125 * (Static131.anInt3255 & 0xFF00) & 0xFF0000) + ((Static131.anInt3255 & 0xFF00FF) * local125 + ((Static109.anInt2883 & 0xFF00FF) * local118) & 0xFF00FF00) >> 8;
			Static79.anInt2161 = local118 * Static226.anInt5080 + local125 * Static171.anInt4153 >> 8;
		}
		Static161.method3060(Static261.anInt5731, Static61.aFloat7, Static253.aFloat36, Static23.aFloat5);
		Static161.method3062(Static154.anInt3709, Static79.anInt2161);
		Static161.method3063((float) Static85.anInt2263, (float) Static159.anInt3893, (float) Static148.anInt3534);
		Static161.method3058();
		return Static154.anInt3709;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(BI)I")
	public static int method2236(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(I)V")
	public static void method2239() {
		Static27.aClass99_4.method3103();
		Static244.aClass99_32.method3103();
		Static118.aClass99_16.method3103();
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "(Z)V")
	public static void method2245() {
		for (@Pc(6) Class3_Sub31 local6 = (Class3_Sub31) Static119.aClass133_9.method3859(); local6 != null; local6 = (Class3_Sub31) Static119.aClass133_9.method3861()) {
			@Pc(14) int local14 = local6.anInt5878;
			if (Static245.load(local14)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Component[] local25 = Static241.components[local14];
				@Pc(27) int local27;
				for (local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean32;
						break;
					}
				}
				if (!local21) {
					local27 = (int) local6.aLong192;
					@Pc(60) Component local60 = Static5.getComponent(local27);
					if (local60 != null) {
						Static43.method1143(local60);
					}
				}
			}
		}
	}
}
