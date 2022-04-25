import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ih;")
	public static final LinkedList highPriorityRequests = new LinkedList();

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!ck;")
	public static final BasType aClass20_1 = new BasType();

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int anInt36 = 0;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public static int updatedVarcsWriterIndex = 0;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!be;")
	public static Component aClass13_1 = null;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
	public static int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static12.tileSettings[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static12.tileSettings[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method23(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static228.method3909(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
	public static void method24(@OriginalArg(1) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static238.method4143(1, arg0);
		local16.pushClient();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!na;I)I")
	public static int method25(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < Static9.anInt178; local20++) {
			if (arg0.equalsIgnoreCase(Static122.aClass100Array92[local20])) {
				return local20;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z")
	public static boolean method26() throws IOException {
		if (Protocol.socket == null) {
			return false;
		}
		@Pc(14) int local14 = Protocol.socket.available();
		if (local14 == 0) {
			return false;
		}
		if (Protocol.opcode == -1) {
			local14--;
			Protocol.socket.read(0, 1, Protocol.inboundBuffer.data);
			Protocol.inboundBuffer.offset = 0;
			Protocol.opcode = Protocol.inboundBuffer.g1isaac();
			Protocol.length = Static234.anIntArray456[Protocol.opcode];
		}
		if (Protocol.length == -1) {
			if (local14 <= 0) {
				return false;
			}
			Protocol.socket.read(0, 1, Protocol.inboundBuffer.data);
			local14--;
			Protocol.length = Protocol.inboundBuffer.data[0] & 0xFF;
		}
		if (Protocol.length == -2) {
			if (local14 <= 1) {
				return false;
			}
			local14 -= 2;
			Protocol.socket.read(0, 2, Protocol.inboundBuffer.data);
			Protocol.inboundBuffer.offset = 0;
			Protocol.length = Protocol.inboundBuffer.g2();
		}
		if (Protocol.length > local14) {
			return false;
		}
		Protocol.inboundBuffer.offset = 0;
		Protocol.socket.read(0, Protocol.length, Protocol.inboundBuffer.data);
		Static49.anInt1462 = Static5.anInt45;
		Static5.anInt45 = Static230.anInt5152;
		Static230.anInt5152 = Protocol.opcode;
		Static201.anInt1862 = 0;
		@Pc(133) int local133;
		if (Protocol.opcode == 60) {
			local133 = Protocol.inboundBuffer.g2sub();
			@Pc(137) byte local137 = Protocol.inboundBuffer.g1neg();
			Static170.method2575(local137, local133);
			Protocol.opcode = -1;
			return true;
		}
		@Pc(171) int local171;
		@Pc(156) JagString local156;
		if (Protocol.opcode == 115) {
			local133 = Protocol.inboundBuffer.g2();
			local156 = Protocol.inboundBuffer.gjstr();
			@Pc(163) Object[] local163 = new Object[local156.length() + 1];
			for (local171 = local156.length() - 1; local171 >= 0; local171--) {
				if (local156.charAt(local171) == 115) {
					local163[local171 + 1] = Protocol.inboundBuffer.gjstr();
				} else {
					local163[local171 + 1] = Integer.valueOf(Protocol.inboundBuffer.g4());
				}
			}
			local163[0] = Integer.valueOf(Protocol.inboundBuffer.g4());
			if (Static248.method3288(local133)) {
				@Pc(226) HookRequest local226 = new HookRequest();
				local226.arguments = local163;
				Static82.method1767(local226);
			}
			Protocol.opcode = -1;
			return true;
		}
		@Pc(275) long local275;
		@Pc(262) boolean local262;
		@Pc(277) int local277;
		@Pc(506) JagString local506;
		if (Protocol.opcode == 70) {
			@Pc(245) JagString local245 = Protocol.inboundBuffer.gjstr();
			if (local245.method3130(Static196.aClass100_863)) {
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local275 = local156.encode37();
				local262 = false;
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 4, LocalizedText.TRADEREQ);
				}
			} else if (local245.method3130(Static61.aClass100_423)) {
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local275 = local156.encode37();
				local262 = false;
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					local506 = local245.substring(local245.length() - 9, local245.indexOf(Static264.aClass100_875) + 1);
					Static103.method2231(local156, 8, local506);
				}
			} else if (local245.method3130(Static191.aClass100_845)) {
				local262 = false;
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local275 = local156.encode37();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (local275 == Static190.aLongArray6[local277]) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 10, JagString.EMPTY);
				}
			} else if (local245.method3130(Static141.aClass100_664)) {
				local156 = local245.substring(local245.indexOf(Static141.aClass100_664), 0);
				Static103.method2231(JagString.EMPTY, 11, local156);
			} else if (local245.method3130(Static138.aClass100_654)) {
				local156 = local245.substring(local245.indexOf(Static138.aClass100_654), 0);
				if (Static11.anInt384 == 0) {
					Static103.method2231(JagString.EMPTY, 12, local156);
				}
			} else if (local245.method3130(Static244.aClass100_1014)) {
				local156 = local245.substring(local245.indexOf(Static244.aClass100_1014), 0);
				if (Static11.anInt384 == 0) {
					Static103.method2231(JagString.EMPTY, 13, local156);
				}
			} else if (local245.method3130(Static56.aClass100_379)) {
				local262 = false;
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local275 = local156.encode37();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (local275 == Static190.aLongArray6[local277]) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 14, JagString.EMPTY);
				}
			} else if (local245.method3130(Static112.aClass100_574)) {
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local262 = false;
				local275 = local156.encode37();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 15, JagString.EMPTY);
				}
			} else if (local245.method3130(Static217.aClass100_916)) {
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local275 = local156.encode37();
				local262 = false;
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (local275 == Static190.aLongArray6[local277]) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					Static103.method2231(local156, 16, JagString.EMPTY);
				}
			} else if (local245.method3130(Static164.aClass100_770)) {
				local156 = local245.substring(local245.indexOf(Static264.aClass100_875), 0);
				local262 = false;
				local275 = local156.encode37();
				for (local277 = 0; local277 < Static35.anInt1093; local277++) {
					if (Static190.aLongArray6[local277] == local275) {
						local262 = true;
						break;
					}
				}
				if (!local262 && Static11.anInt384 == 0) {
					local506 = local245.substring(local245.length() - 9, local245.indexOf(Static264.aClass100_875) + 1);
					Static103.method2231(local156, 21, local506);
				}
			} else {
				Static103.method2231(JagString.EMPTY, 0, local245);
			}
			Protocol.opcode = -1;
			return true;
		}
		@Pc(786) int local786;
		@Pc(790) JagString local790;
		if (Protocol.opcode == 123) {
			local133 = Protocol.inboundBuffer.g2le();
			local786 = Protocol.inboundBuffer.g2sub();
			local790 = Protocol.inboundBuffer.gjstr();
			if (Static248.method3288(local786)) {
				Static193.method3498(local790, local133);
			}
			Protocol.opcode = -1;
			return true;
		} else if (Protocol.opcode == 230) {
			Static180.anInt4264 = Protocol.inboundBuffer.g1add();
			Static115.anInt2940 = Protocol.inboundBuffer.g1ssub();
			while (Protocol.length > Protocol.inboundBuffer.offset) {
				Protocol.opcode = Protocol.inboundBuffer.g1();
				Static75.method1634();
			}
			Protocol.opcode = -1;
			return true;
		} else if (Protocol.opcode == 153) {
			Protocol.opcode = -1;
			Static115.anInt2939 = 0;
			return true;
		} else {
			@Pc(864) int local864;
			if (Protocol.opcode == 220) {
				local133 = Protocol.inboundBuffer.p4rme();
				local786 = Protocol.inboundBuffer.g2le();
				local864 = Protocol.inboundBuffer.g2();
				if (Static248.method3288(local864)) {
					Static229.method3938(local786, local133);
				}
				Protocol.opcode = -1;
				return true;
			}
			@Pc(884) long local884;
			@Pc(908) int local908;
			@Pc(916) int local916;
			@Pc(899) long local899;
			@Pc(904) long local904;
			if (Protocol.opcode == 81) {
				local884 = Protocol.inboundBuffer.g8();
				Protocol.inboundBuffer.g1s();
				local275 = Protocol.inboundBuffer.g8();
				local899 = Protocol.inboundBuffer.g2();
				local904 = Protocol.inboundBuffer.g3();
				local908 = Protocol.inboundBuffer.g1();
				@Pc(910) boolean local910 = false;
				local916 = Protocol.inboundBuffer.g2();
				@Pc(922) long local922 = (local899 << 32) + local904;
				@Pc(924) int local924 = 0;
				label1320: while (true) {
					if (local924 < 100) {
						if (local922 != Static233.aLongArray9[local924]) {
							local924++;
							continue;
						}
						local910 = true;
						break;
					}
					if (local908 <= 1) {
						for (local924 = 0; local924 < Static35.anInt1093; local924++) {
							if (Static190.aLongArray6[local924] == local884) {
								local910 = true;
								break label1320;
							}
						}
					}
					break;
				}
				if (!local910 && Static11.anInt384 == 0) {
					Static233.aLongArray9[Static251.anInt5447] = local922;
					Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
					@Pc(999) JagString local999 = QuickChatPhraseTypeList.get(local916).method770(Protocol.inboundBuffer);
					if (local908 == 2 || local908 == 3) {
						Static154.method2928(local916, 20, local999, Base37.decodeLowerCase(local275).method3125(), JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }));
					} else if (local908 == 1) {
						Static154.method2928(local916, 20, local999, Base37.decodeLowerCase(local275).method3125(), JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }));
					} else {
						Static154.method2928(local916, 20, local999, Base37.decodeLowerCase(local275).method3125(), Base37.decodeLowerCase(local884).method3125());
					}
				}
				Protocol.opcode = -1;
				return true;
			}
			@Pc(1146) int local1146;
			@Pc(1160) int local1160;
			@Pc(1245) boolean local1245;
			if (Protocol.opcode == 55) {
				Static278.anInt5867 = InterfaceList.transmitTimer;
				local884 = Protocol.inboundBuffer.g8();
				if (local884 == 0L) {
					Static270.aClass100_1094 = null;
					Protocol.opcode = -1;
					Static15.aClass100_87 = null;
					Static199.aClass3_Sub22Array1 = null;
					Static214.anInt5577 = 0;
					return true;
				}
				local275 = Protocol.inboundBuffer.g8();
				Static15.aClass100_87 = Base37.decodeLowerCase(local275);
				Static270.aClass100_1094 = Base37.decodeLowerCase(local884);
				Static50.aByte6 = Protocol.inboundBuffer.g1s();
				local1146 = Protocol.inboundBuffer.g1();
				if (local1146 == 255) {
					Protocol.opcode = -1;
					return true;
				}
				Static214.anInt5577 = local1146;
				@Pc(1158) Class3_Sub22[] local1158 = new Class3_Sub22[100];
				for (local1160 = 0; local1160 < Static214.anInt5577; local1160++) {
					local1158[local1160] = new Class3_Sub22();
					local1158[local1160].key = Protocol.inboundBuffer.g8();
					local1158[local1160].aClass100_636 = Base37.decodeLowerCase(local1158[local1160].key);
					local1158[local1160].anInt3340 = Protocol.inboundBuffer.g2();
					local1158[local1160].aByte9 = Protocol.inboundBuffer.g1s();
					local1158[local1160].aClass100_635 = Protocol.inboundBuffer.gjstr();
					if (Static101.aLong98 == local1158[local1160].key) {
						Static160.aByte14 = local1158[local1160].aByte9;
					}
				}
				local908 = Static214.anInt5577;
				while (local908 > 0) {
					local1245 = true;
					local908--;
					for (local916 = 0; local916 < local908; local916++) {
						if (local1158[local916].aClass100_636.method3139(local1158[local916 + 1].aClass100_636) > 0) {
							local1245 = false;
							@Pc(1279) Class3_Sub22 local1279 = local1158[local916];
							local1158[local916] = local1158[local916 + 1];
							local1158[local916 + 1] = local1279;
						}
					}
					if (local1245) {
						break;
					}
				}
				Static199.aClass3_Sub22Array1 = local1158;
				Protocol.opcode = -1;
				return true;
			} else if (Protocol.opcode == 164) {
				local133 = Protocol.inboundBuffer.g4rme();
				Static232.aClass212_5 = GameShell.signLink.getReverseDns(local133);
				Protocol.opcode = -1;
				return true;
			} else if (Protocol.opcode == 225) {
				Static64.method1495();
				Protocol.opcode = -1;
				return true;
			} else if (Protocol.opcode == 48) {
				local133 = Protocol.inboundBuffer.g2();
				local156 = Protocol.inboundBuffer.gjstr();
				local864 = Protocol.inboundBuffer.g2leadd();
				if (Static248.method3288(local133)) {
					Static193.method3498(local156, local864);
				}
				Protocol.opcode = -1;
				return true;
			} else if (Protocol.opcode == 232) {
				Static59.anInt1812 = Protocol.inboundBuffer.g1();
				Static49.anInt1459 = Protocol.inboundBuffer.g1();
				Static84.anInt2256 = Protocol.inboundBuffer.g1();
				Protocol.opcode = -1;
				return true;
			} else {
				@Pc(1409) JagString local1409;
				if (Protocol.opcode == 44) {
					local133 = Protocol.inboundBuffer.g2leadd();
					if (local133 == 65535) {
						local133 = -1;
					}
					local786 = Protocol.inboundBuffer.g1();
					local864 = Protocol.inboundBuffer.g1();
					local1409 = Protocol.inboundBuffer.gjstr();
					if (local864 >= 1 && local864 <= 8) {
						if (local1409.equalsIgnoreCase(Static92.aClass100_510)) {
							local1409 = null;
						}
						Static160.aClass100Array121[local864 - 1] = local1409;
						Static191.anIntArray388[local864 - 1] = local133;
						Static1.aBooleanArray1[local864 - 1] = local786 == 0;
					}
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 226) {
					local133 = Protocol.inboundBuffer.g4();
					local786 = Protocol.inboundBuffer.g2sub();
					Static170.method2575(local133, local786);
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 21) {
					local133 = Protocol.inboundBuffer.p1neg();
					local786 = Protocol.inboundBuffer.g2();
					local864 = Protocol.inboundBuffer.g4me();
					if (Static248.method3288(local786)) {
						Static153.method2905(local864, local133);
					}
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 145) {
					local133 = Protocol.inboundBuffer.g2leadd();
					local786 = Protocol.inboundBuffer.g1add();
					local864 = Protocol.inboundBuffer.g2leadd();
					if (Static248.method3288(local864)) {
						if (local786 == 2) {
							Static5.method34();
						}
						InterfaceList.topLevelInterface = local133;
						Static81.method1753(local133);
						Static210.method3712(false);
						Static74.method1626(InterfaceList.topLevelInterface);
						for (local171 = 0; local171 < 100; local171++) {
							Static186.aBooleanArray100[local171] = true;
						}
					}
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 69) {
					local133 = Protocol.inboundBuffer.g2leadd();
					local786 = Protocol.inboundBuffer.g4();
					local864 = Protocol.inboundBuffer.g2sub();
					if (Static248.method3288(local133)) {
						Static132.method2606(local864, local786);
					}
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 141) {
					local884 = Protocol.inboundBuffer.g8();
					local864 = Protocol.inboundBuffer.g2();
					local1409 = QuickChatPhraseTypeList.get(local864).method770(Protocol.inboundBuffer);
					Static154.method2928(local864, 19, local1409, null, Base37.decodeLowerCase(local884).method3125());
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 169) {
					Static271.method4598(Protocol.inboundBuffer);
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 89) {
					Static8.method121();
					InterfaceList.method2245();
					Static70.updatedVarpsWriterIndex += 32;
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 125) {
					local133 = Protocol.inboundBuffer.g2();
					local786 = Protocol.inboundBuffer.g1();
					local864 = Protocol.inboundBuffer.g1();
					local171 = Protocol.inboundBuffer.g2();
					local1146 = Protocol.inboundBuffer.g1();
					local277 = Protocol.inboundBuffer.g1();
					if (Static248.method3288(local133)) {
						Static260.method3849(local171, local864, local1146, local786, local277);
					}
					Protocol.opcode = -1;
					return true;
				} else if (Protocol.opcode == 36) {
					local133 = Protocol.inboundBuffer.p4rme();
					local786 = Protocol.inboundBuffer.g2les();
					local864 = Protocol.inboundBuffer.g2sub();
					if (Static248.method3288(local864)) {
						Static225.method3893(local133, local786);
					}
					Protocol.opcode = -1;
					return true;
				} else {
					@Pc(1814) ServerActiveProperties local1814;
					@Pc(1804) ServerActiveProperties local1804;
					if (Protocol.opcode == 9) {
						local133 = Protocol.inboundBuffer.g2leadd();
						local786 = Protocol.inboundBuffer.g4me();
						local864 = Protocol.inboundBuffer.g2sub();
						local171 = Protocol.inboundBuffer.g2le();
						if (local171 == 65535) {
							local171 = -1;
						}
						local1146 = Protocol.inboundBuffer.g2sub();
						if (local1146 == 65535) {
							local1146 = -1;
						}
						if (Static248.method3288(local864)) {
							for (local277 = local1146; local277 <= local171; local277++) {
								local904 = (long) local277 + ((long) local786 << 32);
								local1804 = (ServerActiveProperties) Static210.aClass133_21.get(local904);
								if (local1804 != null) {
									local1814 = new ServerActiveProperties(local1804.anInt546, local133);
									local1804.unlink();
								} else if (local277 == -1) {
									local1814 = new ServerActiveProperties(InterfaceList.getComponent(local786).aClass3_Sub4_1.anInt546, local133);
								} else {
									local1814 = new ServerActiveProperties(0, local133);
								}
								Static210.aClass133_21.put(local1814, local904);
							}
						}
						Protocol.opcode = -1;
						return true;
					}
					@Pc(1986) int local1986;
					if (Protocol.opcode == 56) {
						local133 = Protocol.inboundBuffer.g2();
						local786 = Protocol.inboundBuffer.g2le();
						local864 = Protocol.inboundBuffer.g4rme();
						local171 = Protocol.inboundBuffer.g2leadd();
						if (local864 >> 30 == 0) {
							@Pc(1994) SeqType local1994;
							if (local864 >> 29 != 0) {
								local1146 = local864 & 0xFFFF;
								@Pc(1894) Npc local1894 = Static175.npcs[local1146];
								if (local1894 != null) {
									if (local171 == 65535) {
										local171 = -1;
									}
									local1245 = true;
									if (local171 != -1 && local1894.anInt3432 != -1 && SeqTypeList.get(SpotAnimTypeList.get(local171).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(local1894.anInt3432).seqId).anInt5355) {
										local1245 = false;
									}
									if (local1245) {
										local1894.anInt3361 = 0;
										local1894.anInt3432 = local171;
										local1894.anInt3359 = Static83.loop + local133;
										local1894.anInt3399 = 0;
										if (local1894.anInt3359 > Static83.loop) {
											local1894.anInt3399 = -1;
										}
										local1894.anInt3394 = local786;
										local1894.anInt3418 = 1;
										if (local1894.anInt3432 != -1 && Static83.loop == local1894.anInt3359) {
											local1986 = SpotAnimTypeList.get(local1894.anInt3432).seqId;
											if (local1986 != -1) {
												local1994 = SeqTypeList.get(local1986);
												if (local1994 != null && local1994.frames != null) {
													SoundPlayer.playSeqSound(local1894.zFine, local1994, local1894.xFine, false, 0);
												}
											}
										}
									}
								}
							} else if (local864 >> 28 != 0) {
								local1146 = local864 & 0xFFFF;
								@Pc(2033) Player local2033;
								if (PlayerList.selfId == local1146) {
									local2033 = PlayerList.self;
								} else {
									local2033 = Static159.players[local1146];
								}
								if (local2033 != null) {
									if (local171 == 65535) {
										local171 = -1;
									}
									local1245 = true;
									if (local171 != -1 && local2033.anInt3432 != -1 && SeqTypeList.get(SpotAnimTypeList.get(local171).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(local2033.anInt3432).seqId).anInt5355) {
										local1245 = false;
									}
									if (local1245) {
										local2033.anInt3359 = local133 + Static83.loop;
										local2033.anInt3394 = local786;
										local2033.anInt3432 = local171;
										if (local2033.anInt3432 == 65535) {
											local2033.anInt3432 = -1;
										}
										local2033.anInt3418 = 1;
										local2033.anInt3361 = 0;
										local2033.anInt3399 = 0;
										if (local2033.anInt3359 > Static83.loop) {
											local2033.anInt3399 = -1;
										}
										if (local2033.anInt3432 != -1 && local2033.anInt3359 == Static83.loop) {
											local1986 = SpotAnimTypeList.get(local2033.anInt3432).seqId;
											if (local1986 != -1) {
												local1994 = SeqTypeList.get(local1986);
												if (local1994 != null && local1994.frames != null) {
													SoundPlayer.playSeqSound(local2033.zFine, local1994, local2033.xFine, local2033 == PlayerList.self, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local1146 = local864 >> 28 & 0x3;
							local277 = (local864 >> 14 & 0x3FFF) - Static225.originX;
							local1160 = (local864 & 0x3FFF) - Static142.originZ;
							if (local277 >= 0 && local1160 >= 0 && local277 < 104 && local1160 < 104) {
								local1160 = local1160 * 128 + 64;
								local277 = local277 * 128 + 64;
								@Pc(2241) SpotAnim local2241 = new SpotAnim(local171, local1146, local277, local1160, SceneGraph.getTileHeight(local1146, local277, local1160) - local786, local133, Static83.loop);
								Static99.aClass69_64.addTail(new SpotAnimNode(local2241));
							}
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 207) {
						local133 = Protocol.inboundBuffer.p4rme();
						local786 = Protocol.inboundBuffer.g2sub();
						local864 = Protocol.inboundBuffer.g2();
						local171 = Protocol.inboundBuffer.g2sub();
						if (Static248.method3288(local786)) {
							Static190.method3444(local171 + (local864 << 16), local133);
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 38) {
						InterfaceList.method2245();
						local133 = Protocol.inboundBuffer.g1add();
						local786 = Protocol.inboundBuffer.g4rme();
						local864 = Protocol.inboundBuffer.g1();
						Static227.anIntArray446[local864] = local786;
						Static99.anIntArray240[local864] = local133;
						Static141.anIntArray326[local864] = 1;
						for (local171 = 0; local171 < 98; local171++) {
							if (ObjType.anIntArray213[local171] <= local786) {
								Static141.anIntArray326[local864] = local171 + 2;
							}
						}
						Static249.anIntArray478[Static89.anInt2385++ & 0x1F] = local864;
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 104 || Protocol.opcode == 121 || Protocol.opcode == 97 || Protocol.opcode == 14 || Protocol.opcode == 202 || Protocol.opcode == 135 || Protocol.opcode == 17 || Protocol.opcode == 16 || Protocol.opcode == 240 || Protocol.opcode == 33 || Protocol.opcode == 20 || Protocol.opcode == 195 || Protocol.opcode == 179) {
						Static75.method1634();
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 149) {
						local133 = Protocol.inboundBuffer.g2();
						local786 = Protocol.inboundBuffer.g4();
						if (Static248.method3288(local133)) {
							@Pc(2441) Class3_Sub31 local2441 = (Class3_Sub31) Static119.aClass133_9.get((long) local786);
							if (local2441 != null) {
								Static132.method2605(true, local2441);
							}
							if (Static39.aClass13_10 != null) {
								Static43.redraw(Static39.aClass13_10);
								Static39.aClass13_10 = null;
							}
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 187) {
						local133 = Protocol.inboundBuffer.g2le();
						local786 = Protocol.inboundBuffer.g2();
						local864 = Protocol.inboundBuffer.g2();
						if (Static248.method3288(local786)) {
							Camera.yawTarget = local133;
							Camera.pitchTarget = local864;
							if (Static227.cameraType == 2) {
								Static240.cameraPitch = (int)Camera.pitchTarget;
								Static184.cameraYaw = (int)Camera.yawTarget;
							}
							Camera.clampCameraAngle();
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 132) {
						local133 = Protocol.inboundBuffer.g2();
						local786 = Protocol.inboundBuffer.g2sub();
						local864 = Protocol.inboundBuffer.g2leadd();
						local171 = Protocol.inboundBuffer.g2leadd();
						local1146 = Protocol.inboundBuffer.g4();
						if (Static248.method3288(local786)) {
							Static261.method4505(local864, local1146, local171, local133);
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 112) {
						Static115.anInt2940 = Protocol.inboundBuffer.g1();
						Static180.anInt4264 = Protocol.inboundBuffer.p1neg();
						for (local133 = Static115.anInt2940; local133 < Static115.anInt2940 + 8; local133++) {
							for (local786 = Static180.anInt4264; local786 < Static180.anInt4264 + 8; local786++) {
								if (Static159.aClass69ArrayArrayArray1[Static55.level][local133][local786] != null) {
									Static159.aClass69ArrayArrayArray1[Static55.level][local133][local786] = null;
									Static220.spawnGroundObject(local786, local133);
								}
							}
						}
						for (@Pc(2604) Class3_Sub7 local2604 = (Class3_Sub7) Static26.aClass69_27.method2289(); local2604 != null; local2604 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
							if (local2604.anInt928 >= Static115.anInt2940 && Static115.anInt2940 + 8 > local2604.anInt928 && local2604.anInt916 >= Static180.anInt4264 && local2604.anInt916 < Static180.anInt4264 + 8 && local2604.anInt918 == Static55.level) {
								local2604.anInt924 = 0;
							}
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 144) {
						local133 = Protocol.inboundBuffer.p4rme();
						@Pc(2666) Component local2666 = InterfaceList.getComponent(local133);
						for (local864 = 0; local864 < local2666.objTypes.length; local864++) {
							local2666.objTypes[local864] = -1;
							local2666.objTypes[local864] = 0;
						}
						Static43.redraw(local2666);
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 130) {
						local133 = Protocol.inboundBuffer.g4me();
						local786 = Protocol.inboundBuffer.g2leadd();
						local864 = Protocol.inboundBuffer.g2sub();
						if (local864 == 65535) {
							local864 = -1;
						}
						if (Static248.method3288(local786)) {
							Static132.method2607(-1, 1, local133, local864);
						}
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 192) {
						Static270.anInt5795 = Protocol.inboundBuffer.g1();
						Protocol.opcode = -1;
						return true;
					} else if (Protocol.opcode == 13) {
						local133 = Protocol.inboundBuffer.g1ssub();
						local786 = Protocol.inboundBuffer.g1add();
						local864 = Protocol.inboundBuffer.g1();
						Static55.level = local786 >> 1;
						PlayerList.self.method1265(local133, (local786 & 0x1) == 1, local864);
						Protocol.opcode = -1;
						return true;
					} else {
						@Pc(3002) int local3002;
						@Pc(3038) JagString local3038;
						@Pc(3020) JagString local3020;
						if (Protocol.opcode == 62) {
							local884 = Protocol.inboundBuffer.g8();
							local864 = Protocol.inboundBuffer.g2();
							local171 = Protocol.inboundBuffer.g1();
							local262 = true;
							if (local884 < 0L) {
								local884 &= Long.MAX_VALUE;
								local262 = false;
							}
							local506 = JagString.EMPTY;
							if (local864 > 0) {
								local506 = Protocol.inboundBuffer.gjstr();
							}
							@Pc(2834) JagString local2834 = Base37.decodeLowerCase(local884).method3125();
							for (local1986 = 0; local1986 < Static9.anInt178; local1986++) {
								if (local884 == Static92.aLongArray3[local1986]) {
									if (local864 != Static104.anIntArray255[local1986]) {
										Static104.anIntArray255[local1986] = local864;
										if (local864 > 0) {
											Static103.method2231(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { local2834, LocalizedText.FRIENDLOGIN}));
										}
										if (local864 == 0) {
											Static103.method2231(JagString.EMPTY, 5, JagString.concatenate(new JagString[] { local2834, LocalizedText.FRIENDLOGOUT}));
										}
									}
									Static214.aClass100Array170[local1986] = local506;
									Static106.anIntArray258[local1986] = local171;
									local2834 = null;
									Static3.aBooleanArray135[local1986] = local262;
									break;
								}
							}
							if (local2834 != null && Static9.anInt178 < 200) {
								Static92.aLongArray3[Static9.anInt178] = local884;
								Static122.aClass100Array92[Static9.anInt178] = local2834;
								Static104.anIntArray255[Static9.anInt178] = local864;
								Static214.aClass100Array170[Static9.anInt178] = local506;
								Static106.anIntArray258[Static9.anInt178] = local171;
								Static3.aBooleanArray135[Static9.anInt178] = local262;
								Static9.anInt178++;
							}
							Static185.anInt4369 = InterfaceList.transmitTimer;
							local908 = Static9.anInt178;
							while (local908 > 0) {
								local908--;
								@Pc(2961) boolean local2961 = true;
								for (local916 = 0; local916 < local908; local916++) {
									if (Static104.anIntArray255[local916] != Static125.worldId && Static125.worldId == Static104.anIntArray255[local916 + 1] || Static104.anIntArray255[local916] == 0 && Static104.anIntArray255[local916 + 1] != 0) {
										local2961 = false;
										local3002 = Static104.anIntArray255[local916];
										Static104.anIntArray255[local916] = Static104.anIntArray255[local916 + 1];
										Static104.anIntArray255[local916 + 1] = local3002;
										local3020 = Static214.aClass100Array170[local916];
										Static214.aClass100Array170[local916] = Static214.aClass100Array170[local916 + 1];
										Static214.aClass100Array170[local916 + 1] = local3020;
										local3038 = Static122.aClass100Array92[local916];
										Static122.aClass100Array92[local916] = Static122.aClass100Array92[local916 + 1];
										Static122.aClass100Array92[local916 + 1] = local3038;
										@Pc(3056) long local3056 = Static92.aLongArray3[local916];
										Static92.aLongArray3[local916] = Static92.aLongArray3[local916 + 1];
										Static92.aLongArray3[local916 + 1] = local3056;
										@Pc(3074) int local3074 = Static106.anIntArray258[local916];
										Static106.anIntArray258[local916] = Static106.anIntArray258[local916 + 1];
										Static106.anIntArray258[local916 + 1] = local3074;
										@Pc(3092) boolean local3092 = Static3.aBooleanArray135[local916];
										Static3.aBooleanArray135[local916] = Static3.aBooleanArray135[local916 + 1];
										Static3.aBooleanArray135[local916 + 1] = local3092;
									}
								}
								if (local2961) {
									break;
								}
							}
							Protocol.opcode = -1;
							return true;
						} else if (Protocol.opcode == 160) {
							if (Protocol.length == 0) {
								Static195.aClass100_859 = LocalizedText.WALKHERE;
							} else {
								Static195.aClass100_859 = Protocol.inboundBuffer.gjstr();
							}
							Protocol.opcode = -1;
							return true;
						} else if (Protocol.opcode == 128) {
							for (local133 = 0; local133 < Static7.varps.length; local133++) {
								if (Static106.anIntArray257[local133] != Static7.varps[local133]) {
									Static7.varps[local133] = Static106.anIntArray257[local133];
									Static85.method1775(local133);
									Static83.updatedVarps[Static70.updatedVarpsWriterIndex++ & 0x1F] = local133;
								}
							}
							Protocol.opcode = -1;
							return true;
						} else if (Protocol.opcode == 154) {
							local133 = Protocol.inboundBuffer.g2();
							local786 = Protocol.inboundBuffer.g1();
							local864 = Protocol.inboundBuffer.g1();
							local171 = Protocol.inboundBuffer.g2();
							local1146 = Protocol.inboundBuffer.g1();
							local277 = Protocol.inboundBuffer.g1();
							if (Static248.method3288(local133)) {
								Static141.method2722(true, local1146, local171, local277, local864, local786);
							}
							Protocol.opcode = -1;
							return true;
						} else if (Protocol.opcode == 247) {
							local884 = Protocol.inboundBuffer.g8();
							local275 = Protocol.inboundBuffer.g2();
							local899 = Protocol.inboundBuffer.g3();
							local1160 = Protocol.inboundBuffer.g1();
							local1986 = Protocol.inboundBuffer.g2();
							@Pc(3263) boolean local3263 = false;
							@Pc(3270) long local3270 = (local275 << 32) + local899;
							@Pc(3272) int local3272 = 0;
							label1402: while (true) {
								if (local3272 < 100) {
									if (local3270 != Static233.aLongArray9[local3272]) {
										local3272++;
										continue;
									}
									local3263 = true;
									break;
								}
								if (local1160 <= 1) {
									for (local3272 = 0; local3272 < Static35.anInt1093; local3272++) {
										if (local884 == Static190.aLongArray6[local3272]) {
											local3263 = true;
											break label1402;
										}
									}
								}
								break;
							}
							if (!local3263 && Static11.anInt384 == 0) {
								Static233.aLongArray9[Static251.anInt5447] = local3270;
								Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
								local3020 = QuickChatPhraseTypeList.get(local1986).method770(Protocol.inboundBuffer);
								if (local1160 == 2) {
									Static154.method2928(local1986, 18, local3020, null, JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }));
								} else if (local1160 == 1) {
									Static154.method2928(local1986, 18, local3020, null, JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }));
								} else {
									Static154.method2928(local1986, 18, local3020, null, Base37.decodeLowerCase(local884).method3125());
								}
							}
							Protocol.opcode = -1;
							return true;
						} else {
							@Pc(3456) Class3_Sub31 local3456;
							if (Protocol.opcode == 176) {
								local133 = Protocol.inboundBuffer.g4rme();
								local786 = Protocol.inboundBuffer.g2sub();
								local864 = Protocol.inboundBuffer.g4rme();
								if (Static248.method3288(local786)) {
									@Pc(3449) Class3_Sub31 local3449 = (Class3_Sub31) Static119.aClass133_9.get((long) local133);
									local3456 = (Class3_Sub31) Static119.aClass133_9.get((long) local864);
									if (local3456 != null) {
										Static132.method2605(local3449 == null || local3456.anInt5878 != local3449.anInt5878, local3456);
									}
									if (local3449 != null) {
										local3449.unlink();
										Static119.aClass133_9.put(local3449, (long) local864);
									}
									@Pc(3490) Component local3490 = InterfaceList.getComponent(local133);
									if (local3490 != null) {
										Static43.redraw(local3490);
									}
									local3490 = InterfaceList.getComponent(local864);
									if (local3490 != null) {
										Static43.redraw(local3490);
										Static17.method531(local3490, true);
									}
									if (InterfaceList.topLevelInterface != -1) {
										Static54.method1304(1, InterfaceList.topLevelInterface);
									}
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 27) {
								local133 = Protocol.inboundBuffer.g2();
								local786 = Protocol.inboundBuffer.g1();
								local864 = Protocol.inboundBuffer.g1();
								local171 = Protocol.inboundBuffer.g1();
								local1146 = Protocol.inboundBuffer.g1();
								local277 = Protocol.inboundBuffer.g2();
								if (Static248.method3288(local133)) {
									Static176.aBooleanArray95[local786] = true;
									Static222.anIntArray437[local786] = local864;
									Static276.anIntArray564[local786] = local171;
									Static202.anIntArray424[local786] = local1146;
									Static31.anIntArray76[local786] = local277;
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 2) {
								local133 = Protocol.inboundBuffer.g4rme();
								local786 = Protocol.inboundBuffer.g2sub();
								local864 = Protocol.inboundBuffer.g2leadd();
								if (Static248.method3288(local786)) {
									Static136.method2649(local864, local133);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 85) {
								Static60.rebootTimer = Protocol.inboundBuffer.g2() * 30;
								Protocol.opcode = -1;
								Static209.miscTransmitAt = InterfaceList.transmitTimer;
								return true;
							} else if (Protocol.opcode == 114) {
								Static202.method3654(GameShell.signLink, Protocol.inboundBuffer, Protocol.length);
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 65) {
								local133 = Protocol.inboundBuffer.g2le();
								local786 = Protocol.inboundBuffer.p1neg();
								local864 = Protocol.inboundBuffer.g2leadd();
								if (Static248.method3288(local133)) {
									Static132.method2606(local864, local786);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 234) {
								InterfaceList.method2245();
								Static12.anInt400 = Protocol.inboundBuffer.g1();
								Static209.miscTransmitAt = InterfaceList.transmitTimer;
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 209) {
								if (InterfaceList.topLevelInterface != -1) {
									Static54.method1304(0, InterfaceList.topLevelInterface);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 191) {
								local133 = Protocol.inboundBuffer.g2le();
								Static13.method472(local133);
								Static27.anIntArray70[Static111.anInt2901++ & 0x1F] = local133 & 0x7FFF;
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 102) {
								local133 = Protocol.inboundBuffer.g2le();
								local786 = Protocol.inboundBuffer.g1ssub();
								local864 = Protocol.inboundBuffer.g2();
								@Pc(3766) Npc local3766 = Static175.npcs[local133];
								if (local3766 != null) {
									Static223.method3855(local786, local864, local3766);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 159) {
								InterfaceList.method2245();
								Static251.anInt5456 = Protocol.inboundBuffer.g2s();
								Static209.miscTransmitAt = InterfaceList.transmitTimer;
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 71) {
								local884 = Protocol.inboundBuffer.g8();
								local790 = Static218.method2862(Static65.method1497(Protocol.inboundBuffer).method3116());
								Static103.method2231(Base37.decodeLowerCase(local884).method3125(), 6, local790);
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 42) {
								if (GameShell.fullScreenFrame != null) {
									Static241.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
								}
								@Pc(3848) byte[] local3848 = new byte[Protocol.length];
								Protocol.inboundBuffer.method2237(local3848, Protocol.length);
								local156 = Static10.decodeString(local3848, Protocol.length, 0);
								if (GameShell.frame == null && (SignLink.anInt5928 == 3 || !SignLink.osName.startsWith("win") || client.haveIe6)) {
									Static169.openUrl(local156, true);
								} else {
									Static175.url = local156;
									Static164.newTab = true;
									Static33.openUrlRequest = GameShell.signLink.openUrl(new String(local156.method3148(), "ISO-8859-1"));
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 111) {
								local133 = Protocol.inboundBuffer.g2sub();
								local786 = Protocol.inboundBuffer.p4rme();
								local864 = Protocol.inboundBuffer.g2leadd();
								local171 = Protocol.inboundBuffer.g2le();
								local1146 = Protocol.inboundBuffer.g2leadd();
								if (Static248.method3288(local133)) {
									Static132.method2607(local864, 7, local786, local171 << 16 | local1146);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 37) {
								local133 = Protocol.inboundBuffer.g1add();
								local786 = Protocol.inboundBuffer.g2le();
								Static272.method3995(local133, local786);
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 155) {
								local133 = Protocol.inboundBuffer.g1();
								local786 = Protocol.inboundBuffer.p4rme();
								local864 = Protocol.inboundBuffer.g2sub();
								local171 = Protocol.inboundBuffer.g2();
								if (Static248.method3288(local864)) {
									local3456 = (Class3_Sub31) Static119.aClass133_9.get((long) local786);
									if (local3456 != null) {
										Static132.method2605(local3456.anInt5878 != local171, local3456);
									}
									Static44.method1148(local171, local786, local133);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 131) {
								for (local133 = 0; local133 < Static159.players.length; local133++) {
									if (Static159.players[local133] != null) {
										Static159.players[local133].seqId = -1;
									}
								}
								for (local133 = 0; local133 < Static175.npcs.length; local133++) {
									if (Static175.npcs[local133] != null) {
										Static175.npcs[local133].seqId = -1;
									}
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 217) {
								local133 = Protocol.inboundBuffer.g1();
								@Pc(4084) Class102 local4084 = new Class102();
								local786 = local133 >> 6;
								local4084.anInt4058 = local133 & 0x3F;
								local4084.anInt4048 = Protocol.inboundBuffer.g1();
								if (local4084.anInt4048 >= 0 && local4084.anInt4048 < Sprites.headhints.length) {
									if (local4084.anInt4058 == 1 || local4084.anInt4058 == 10) {
										local4084.anInt4057 = Protocol.inboundBuffer.g2();
										Protocol.inboundBuffer.offset += 3;
									} else if (local4084.anInt4058 >= 2 && local4084.anInt4058 <= 6) {
										if (local4084.anInt4058 == 2) {
											local4084.anInt4045 = 64;
											local4084.anInt4047 = 64;
										}
										if (local4084.anInt4058 == 3) {
											local4084.anInt4045 = 0;
											local4084.anInt4047 = 64;
										}
										if (local4084.anInt4058 == 4) {
											local4084.anInt4045 = 128;
											local4084.anInt4047 = 64;
										}
										if (local4084.anInt4058 == 5) {
											local4084.anInt4045 = 64;
											local4084.anInt4047 = 0;
										}
										if (local4084.anInt4058 == 6) {
											local4084.anInt4045 = 64;
											local4084.anInt4047 = 128;
										}
										local4084.anInt4058 = 2;
										local4084.anInt4053 = Protocol.inboundBuffer.g2();
										local4084.anInt4046 = Protocol.inboundBuffer.g2();
										local4084.anInt4050 = Protocol.inboundBuffer.g1();
									}
									local4084.anInt4052 = Protocol.inboundBuffer.g2();
									if (local4084.anInt4052 == 65535) {
										local4084.anInt4052 = -1;
									}
									Static143.aClass102Array1[local786] = local4084;
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 126) {
								Static35.anInt1093 = Protocol.length / 8;
								for (local133 = 0; local133 < Static35.anInt1093; local133++) {
									Static190.aLongArray6[local133] = Protocol.inboundBuffer.g8();
									Static193.aClass100Array134[local133] = Base37.decodeLowerCase(Static190.aLongArray6[local133]);
								}
								Static185.anInt4369 = InterfaceList.transmitTimer;
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 32) {
								Static86.method1800();
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 119) {
								local133 = Protocol.inboundBuffer.g2sub();
								local786 = Protocol.inboundBuffer.g4me();
								local864 = Protocol.inboundBuffer.g2s();
								local171 = Protocol.inboundBuffer.g2sadd();
								if (Static248.method3288(local133)) {
									Static280.method4666(local864, local786, local171);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 235) {
								local133 = Protocol.inboundBuffer.g1ssub();
								local786 = local133 >> 2;
								local864 = local133 & 0x3;
								local171 = Static133.anIntArray453[local786];
								local1146 = Protocol.inboundBuffer.g2();
								local277 = Protocol.inboundBuffer.g4();
								if (local1146 == 65535) {
									local1146 = -1;
								}
								local908 = local277 & 0x3FFF;
								local1986 = local277 >> 14 & 0x3FFF;
								local1986 -= Static225.originX;
								local908 -= Static142.originZ;
								local1160 = local277 >> 28 & 0x3;
								Static92.method1881(local1160, local864, local786, local908, local171, local1986, local1146);
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 0) {
								local884 = Protocol.inboundBuffer.g8();
								local275 = Protocol.inboundBuffer.g2();
								local899 = Protocol.inboundBuffer.g3();
								local1160 = Protocol.inboundBuffer.g1();
								@Pc(4425) boolean local4425 = false;
								@Pc(4431) long local4431 = local899 + (local275 << 32);
								local3002 = 0;
								label1450: while (true) {
									if (local3002 >= 100) {
										if (local1160 <= 1) {
											if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
												local4425 = true;
											} else {
												for (local3002 = 0; local3002 < Static35.anInt1093; local3002++) {
													if (local884 == Static190.aLongArray6[local3002]) {
														local4425 = true;
														break label1450;
													}
												}
											}
										}
										break;
									}
									if (local4431 == Static233.aLongArray9[local3002]) {
										local4425 = true;
										break;
									}
									local3002++;
								}
								if (!local4425 && Static11.anInt384 == 0) {
									Static233.aLongArray9[Static251.anInt5447] = local4431;
									Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
									@Pc(4518) JagString local4518 = Static218.method2862(Static65.method1497(Protocol.inboundBuffer).method3116());
									if (local1160 == 2 || local1160 == 3) {
										Static103.method2231(JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }), 7, local4518);
									} else if (local1160 == 1) {
										Static103.method2231(JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }), 7, local4518);
									} else {
										Static103.method2231(Base37.decodeLowerCase(local884).method3125(), 3, local4518);
									}
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 54) {
								local884 = Protocol.inboundBuffer.g8();
								Protocol.inboundBuffer.g1s();
								local275 = Protocol.inboundBuffer.g8();
								local899 = Protocol.inboundBuffer.g2();
								local904 = Protocol.inboundBuffer.g3();
								@Pc(4626) long local4626 = (local899 << 32) + local904;
								local908 = Protocol.inboundBuffer.g1();
								@Pc(4632) boolean local4632 = false;
								@Pc(4634) int local4634 = 0;
								label1575: while (true) {
									if (local4634 >= 100) {
										if (local908 <= 1) {
											if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
												local4632 = true;
											} else {
												for (local4634 = 0; local4634 < Static35.anInt1093; local4634++) {
													if (Static190.aLongArray6[local4634] == local884) {
														local4632 = true;
														break label1575;
													}
												}
											}
										}
										break;
									}
									if (Static233.aLongArray9[local4634] == local4626) {
										local4632 = true;
										break;
									}
									local4634++;
								}
								if (!local4632 && Static11.anInt384 == 0) {
									Static233.aLongArray9[Static251.anInt5447] = local4626;
									Static251.anInt5447 = (Static251.anInt5447 + 1) % 100;
									local3038 = Static218.method2862(Static65.method1497(Protocol.inboundBuffer).method3116());
									if (local908 == 2 || local908 == 3) {
										Static73.method1598(local3038, JagString.concatenate(new JagString[] { Static44.aClass100_336, Base37.decodeLowerCase(local884).method3125() }), Base37.decodeLowerCase(local275).method3125());
									} else if (local908 == 1) {
										Static73.method1598(local3038, JagString.concatenate(new JagString[] { Static65.aClass100_435, Base37.decodeLowerCase(local884).method3125() }), Base37.decodeLowerCase(local275).method3125());
									} else {
										Static73.method1598(local3038, Base37.decodeLowerCase(local884).method3125(), Base37.decodeLowerCase(local275).method3125());
									}
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 214) {
								Protocol.readRebuildPacket(true);
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 172) {
								local133 = Protocol.inboundBuffer.g2();
								local786 = Protocol.inboundBuffer.g1();
								if (local133 == 65535) {
									local133 = -1;
								}
								local864 = Protocol.inboundBuffer.g2();
								SoundPlayer.play(local786, local133, local864);
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 66) {
								local133 = Protocol.inboundBuffer.g2leadd();
								local786 = Protocol.inboundBuffer.g4rme();
								if (Static248.method3288(local133)) {
									local864 = 0;
									if (PlayerList.self.appearance != null) {
										local864 = PlayerList.self.appearance.method1952();
									}
									Static132.method2607(-1, 3, local786, local864);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 171) {
								local133 = Protocol.inboundBuffer.p4rme();
								local156 = Protocol.inboundBuffer.gjstr();
								local864 = Protocol.inboundBuffer.g2sub();
								if (Static248.method3288(local864)) {
									Static80.method3617(local156, local133);
								}
								Protocol.opcode = -1;
								return true;
							} else if (Protocol.opcode == 84) {
								local133 = Protocol.inboundBuffer.g4me();
								local786 = Protocol.inboundBuffer.g2leadd();
								Static272.method3995(local133, local786);
								Protocol.opcode = -1;
								return true;
							} else {
								@Pc(4956) Component local4956;
								if (Protocol.opcode == 22) {
									local133 = Protocol.inboundBuffer.g4();
									local786 = Protocol.inboundBuffer.g2();
									if (local133 < -70000) {
										local786 += 32768;
									}
									if (local133 < 0) {
										local4956 = null;
									} else {
										local4956 = InterfaceList.getComponent(local133);
									}
									while (Protocol.inboundBuffer.offset < Protocol.length) {
										local171 = Protocol.inboundBuffer.gSmart1or2();
										local1146 = Protocol.inboundBuffer.g2();
										local277 = 0;
										if (local1146 != 0) {
											local277 = Protocol.inboundBuffer.g1();
											if (local277 == 255) {
												local277 = Protocol.inboundBuffer.g4();
											}
										}
										if (local4956 != null && local171 >= 0 && local4956.objTypes.length > local171) {
											local4956.objTypes[local171] = local1146;
											local4956.objCounts[local171] = local277;
										}
										Static280.method4672(local1146 - 1, local171, local277, local786);
									}
									if (local4956 != null) {
										Static43.redraw(local4956);
									}
									InterfaceList.method2245();
									Static27.anIntArray70[Static111.anInt2901++ & 0x1F] = local786 & 0x7FFF;
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 24) {
									local133 = Protocol.inboundBuffer.g2();
									if (Static248.method3288(local133)) {
										Static35.resetCameraEffects();
									}
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 86) {
									Static278.processLogout();
									Protocol.opcode = -1;
									return false;
								} else if (Protocol.opcode == 116) {
									local133 = Protocol.inboundBuffer.g1();
									if (Protocol.inboundBuffer.g1() == 0) {
										Static229.aClass136Array1[local133] = new StockMarketOffer();
									} else {
										Protocol.inboundBuffer.offset--;
										Static229.aClass136Array1[local133] = new StockMarketOffer(Protocol.inboundBuffer);
									}
									Protocol.opcode = -1;
									Static207.anInt4778 = InterfaceList.transmitTimer;
									return true;
								} else if (Protocol.opcode == 73) {
									local133 = Protocol.inboundBuffer.g2sub();
									local786 = Protocol.inboundBuffer.g4me();
									if (local133 == 65535) {
										local133 = -1;
									}
									local864 = Protocol.inboundBuffer.g2le();
									if (Static248.method3288(local864)) {
										Static132.method2607(-1, 2, local786, local133);
									}
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 162) {
									Protocol.readRebuildPacket(false);
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 165) {
									local133 = Protocol.inboundBuffer.g2le();
									local786 = Protocol.inboundBuffer.g2le();
									if (local786 == 65535) {
										local786 = -1;
									}
									local864 = Protocol.inboundBuffer.g4();
									local171 = Protocol.inboundBuffer.g2sub();
									local1146 = Protocol.inboundBuffer.g4rme();
									if (local171 == 65535) {
										local171 = -1;
									}
									if (Static248.method3288(local133)) {
										for (local277 = local171; local277 <= local786; local277++) {
											local904 = ((long) local864 << 32) + ((long) local277);
											local1804 = (ServerActiveProperties) Static210.aClass133_21.get(local904);
											if (local1804 != null) {
												local1814 = new ServerActiveProperties(local1146, local1804.anInt540);
												local1804.unlink();
											} else if (local277 == -1) {
												local1814 = new ServerActiveProperties(local1146, InterfaceList.getComponent(local864).aClass3_Sub4_1.anInt540);
											} else {
												local1814 = new ServerActiveProperties(local1146, -1);
											}
											Static210.aClass133_21.put(local1814, local904);
										}
									}
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 197) {
									Static166.anInt4054 = Protocol.inboundBuffer.g1();
									Static185.anInt4369 = InterfaceList.transmitTimer;
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 196) {
									local884 = Protocol.inboundBuffer.g8();
									local864 = Protocol.inboundBuffer.g2();
									@Pc(5325) byte local5325 = Protocol.inboundBuffer.g1s();
									local262 = false;
									if ((Long.MIN_VALUE & local884) != 0L) {
										local262 = true;
									}
									if (local262) {
										if (Static214.anInt5577 == 0) {
											Protocol.opcode = -1;
											return true;
										}
										local884 &= Long.MAX_VALUE;
										for (local277 = 0; Static214.anInt5577 > local277 && (local884 != Static199.aClass3_Sub22Array1[local277].key || local864 != Static199.aClass3_Sub22Array1[local277].anInt3340); local277++) {
										}
										if (local277 < Static214.anInt5577) {
											while (Static214.anInt5577 - 1 > local277) {
												Static199.aClass3_Sub22Array1[local277] = Static199.aClass3_Sub22Array1[local277 + 1];
												local277++;
											}
											Static214.anInt5577--;
											Static199.aClass3_Sub22Array1[Static214.anInt5577] = null;
										}
									} else {
										local506 = Protocol.inboundBuffer.gjstr();
										@Pc(5347) Class3_Sub22 local5347 = new Class3_Sub22();
										local5347.key = local884;
										local5347.aClass100_636 = Base37.decodeLowerCase(local5347.key);
										local5347.aByte9 = local5325;
										local5347.aClass100_635 = local506;
										local5347.anInt3340 = local864;
										for (local1986 = Static214.anInt5577 - 1; local1986 >= 0; local1986--) {
											local908 = Static199.aClass3_Sub22Array1[local1986].aClass100_636.method3139(local5347.aClass100_636);
											if (local908 == 0) {
												Static199.aClass3_Sub22Array1[local1986].anInt3340 = local864;
												Static199.aClass3_Sub22Array1[local1986].aByte9 = local5325;
												Static199.aClass3_Sub22Array1[local1986].aClass100_635 = local506;
												if (local884 == Static101.aLong98) {
													Static160.aByte14 = local5325;
												}
												Static278.anInt5867 = InterfaceList.transmitTimer;
												Protocol.opcode = -1;
												return true;
											}
											if (local908 < 0) {
												break;
											}
										}
										if (Static199.aClass3_Sub22Array1.length <= Static214.anInt5577) {
											Protocol.opcode = -1;
											return true;
										}
										for (local908 = Static214.anInt5577 - 1; local908 > local1986; local908--) {
											Static199.aClass3_Sub22Array1[local908 + 1] = Static199.aClass3_Sub22Array1[local908];
										}
										if (Static214.anInt5577 == 0) {
											Static199.aClass3_Sub22Array1 = new Class3_Sub22[100];
										}
										Static199.aClass3_Sub22Array1[local1986 + 1] = local5347;
										if (Static101.aLong98 == local884) {
											Static160.aByte14 = local5325;
										}
										Static214.anInt5577++;
									}
									Protocol.opcode = -1;
									Static278.anInt5867 = InterfaceList.transmitTimer;
									return true;
								} else if (Protocol.opcode == 50) {
									local133 = Protocol.inboundBuffer.g4();
									local786 = Protocol.inboundBuffer.p4rme();
									local864 = Protocol.inboundBuffer.g2leadd();
									if (local864 == 65535) {
										local864 = -1;
									}
									local171 = Protocol.inboundBuffer.g2le();
									if (Static248.method3288(local171)) {
										@Pc(5603) Component local5603 = InterfaceList.getComponent(local786);
										@Pc(5615) ObjType local5615;
										if (local5603.aBoolean32) {
											Static209.method3707(local786, local133, local864);
											local5615 = ObjTypeList.get(local864);
											Static261.method4505(local5615.zoom2d, local786, local5615.yAngle2d, local5615.xAngle2d);
											Static145.method2745(local786, local5615.zAngle2d, local5615.yOffset2d, local5615.xOffset2d);
										} else if (local864 == -1) {
											local5603.modelType = 0;
											Protocol.opcode = -1;
											return true;
										} else {
											local5615 = ObjTypeList.get(local864);
											local5603.modelXAngle = local5615.xAngle2d;
											local5603.modelZoom = local5615.zoom2d * 100 / local133;
											local5603.modelType = 4;
											local5603.modelId = local864;
											local5603.modelYAngle = local5615.yAngle2d;
											Static43.redraw(local5603);
										}
									}
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 105) {
									local133 = Protocol.inboundBuffer.g4();
									local786 = Protocol.inboundBuffer.g2();
									if (local133 < -70000) {
										local786 += 32768;
									}
									if (local133 >= 0) {
										local4956 = InterfaceList.getComponent(local133);
									} else {
										local4956 = null;
									}
									if (local4956 != null) {
										for (local171 = 0; local171 < local4956.objTypes.length; local171++) {
											local4956.objTypes[local171] = 0;
											local4956.objCounts[local171] = 0;
										}
									}
									Static14.method475(local786);
									local171 = Protocol.inboundBuffer.g2();
									for (local1146 = 0; local1146 < local171; local1146++) {
										local277 = Protocol.inboundBuffer.g1ssub();
										if (local277 == 255) {
											local277 = Protocol.inboundBuffer.g4();
										}
										local1160 = Protocol.inboundBuffer.g2();
										if (local4956 != null && local1146 < local4956.objTypes.length) {
											local4956.objTypes[local1146] = local1160;
											local4956.objCounts[local1146] = local277;
										}
										Static280.method4672(local1160 - 1, local1146, local277, local786);
									}
									if (local4956 != null) {
										Static43.redraw(local4956);
									}
									InterfaceList.method2245();
									Static27.anIntArray70[Static111.anInt2901++ & 0x1F] = local786 & 0x7FFF;
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 142) {
									Static230.method3954(Protocol.inboundBuffer.gjstr());
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 26) {
									Static115.anInt2940 = Protocol.inboundBuffer.p1neg();
									Static180.anInt4264 = Protocol.inboundBuffer.g1();
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 4) {
									local133 = Protocol.inboundBuffer.g2leadd();
									if (local133 == 65535) {
										local133 = -1;
									}
									Static148.method2765(local133);
									Protocol.opcode = -1;
									return true;
								} else if (Protocol.opcode == 208) {
									local133 = Protocol.inboundBuffer.g3le();
									local786 = Protocol.inboundBuffer.g2le();
									if (local786 == 65535) {
										local786 = -1;
									}
									Static278.method4650(local133, local786);
									Protocol.opcode = -1;
									return true;
								} else {
									TracingException.report("T1 - " + Protocol.opcode + "," + Static5.anInt45 + "," + Static49.anInt1462 + " - " + Protocol.length, null);
									Static278.processLogout();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method28() {
		Static43.redraw(Static105.aClass13_14);
		Static213.anInt4851++;
		if (Static44.aBoolean83 && Static146.aBoolean174) {
			@Pc(30) int local30 = Static215.anInt4873;
			local30 -= Static246.anInt5388;
			if (Static81.anInt2225 > local30) {
				local30 = Static81.anInt2225;
			}
			@Pc(41) int local41 = Static223.anInt5032;
			if (Static81.anInt2225 + aClass13_1.anInt445 < local30 - -Static105.aClass13_14.anInt445) {
				local30 = Static81.anInt2225 + aClass13_1.anInt445 - Static105.aClass13_14.anInt445;
			}
			local41 -= Static165.anInt4035;
			if (local41 < Static228.anInt5103) {
				local41 = Static228.anInt5103;
			}
			if (Static228.anInt5103 + aClass13_1.anInt459 < local41 - -Static105.aClass13_14.anInt459) {
				local41 = Static228.anInt5103 + aClass13_1.anInt459 - Static105.aClass13_14.anInt459;
			}
			@Pc(109) int local109 = local41 - Static20.anInt660;
			@Pc(114) int local114 = local30 - Static124.anInt3075;
			@Pc(122) int local122 = local30 + aClass13_1.anInt489 - Static81.anInt2225;
			@Pc(130) int local130 = aClass13_1.scrollY + local41 - Static228.anInt5103;
			@Pc(133) int local133 = Static105.aClass13_14.anInt472;
			if (Static213.anInt4851 > Static105.aClass13_14.anInt447 && (local133 < local114 || -local133 > local114 || local109 > local133 || local109 < -local133)) {
				Static138.aBoolean172 = true;
			}
			@Pc(176) HookRequest local176;
			if (Static105.aClass13_14.anObjectArray26 != null && Static138.aBoolean172) {
				local176 = new HookRequest();
				local176.source = Static105.aClass13_14;
				local176.arguments = Static105.aClass13_14.anObjectArray26;
				local176.mouseX = local122;
				local176.mouseY = local130;
				Static82.method1767(local176);
			}
			if (Static22.anInt723 == 0) {
				if (Static138.aBoolean172) {
					if (Static105.aClass13_14.anObjectArray16 != null) {
						local176 = new HookRequest();
						local176.mouseY = local130;
						local176.target = Static56.aClass13_12;
						local176.mouseX = local122;
						local176.arguments = Static105.aClass13_14.anObjectArray16;
						local176.source = Static105.aClass13_14;
						Static82.method1767(local176);
					}
					if (Static56.aClass13_12 != null && Static36.method938(Static105.aClass13_14) != null) {
						Protocol.outboundBuffer.p1isaac(79);
						Protocol.outboundBuffer.p4me(Static105.aClass13_14.id);
						Protocol.outboundBuffer.p2le(Static56.aClass13_12.createdComponentId);
						Protocol.outboundBuffer.p4(Static56.aClass13_12.id);
						Protocol.outboundBuffer.p2le(Static105.aClass13_14.createdComponentId);
					}
				} else if ((Static116.anInt2952 == 1 || Static277.method4640(Static231.anInt5204 - 1)) && Static231.anInt5204 > 2) {
					Static226.method3901();
				} else if (Static231.anInt5204 > 0) {
					Static59.method1372();
				}
				Static105.aClass13_14 = null;
			}
		} else if (Static213.anInt4851 > 1) {
			Static105.aClass13_14 = null;
		}
	}
}
