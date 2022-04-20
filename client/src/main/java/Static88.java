import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Z)V")
	public static void method1817(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static86.aClass153_37 = arg0;
		Static58.aClass153_28 = arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!jl;)V")
	public static void method1818(@OriginalArg(1) int arg0, @OriginalArg(2) HookRequest arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray31;
		@Pc(10) int local10 = (Integer) local4[0];
		@Pc(14) ClientScript local14 = Static91.method1875(local10);
		if (local14 == null) {
			return;
		}
		Static138.anInt3445 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = -1;
		@Pc(33) int[] local33 = local14.anIntArray416;
		@Pc(36) int[] local36 = local14.anIntArray415;
		@Pc(44) byte local44 = -1;
		@Pc(58) int local58;
		try {
			Static215.anIntArray432 = new int[local14.anInt4667];
			@Pc(50) int local50 = 0;
			Static180.aClass100Array125 = new JagString[local14.anInt4671];
			@Pc(56) int local56 = 0;
			@Pc(77) int local77;
			@Pc(194) JagString local194;
			for (local58 = 1; local58 < local4.length; local58++) {
				if (local4[local58] instanceof Integer) {
					local77 = (Integer) local4[local58];
					if (local77 == -2147483647) {
						local77 = arg1.anInt3102;
					}
					if (local77 == -2147483646) {
						local77 = arg1.anInt3097;
					}
					if (local77 == -2147483645) {
						local77 = arg1.source == null ? -1 : arg1.source.anInt507;
					}
					if (local77 == -2147483644) {
						local77 = arg1.anInt3101;
					}
					if (local77 == -2147483643) {
						local77 = arg1.source == null ? -1 : arg1.source.componentId;
					}
					if (local77 == -2147483642) {
						local77 = arg1.aClass13_16 == null ? -1 : arg1.aClass13_16.anInt507;
					}
					if (local77 == -2147483641) {
						local77 = arg1.aClass13_16 == null ? -1 : arg1.aClass13_16.componentId;
					}
					if (local77 == -2147483640) {
						local77 = arg1.anInt3100;
					}
					if (local77 == -2147483639) {
						local77 = arg1.anInt3099;
					}
					Static215.anIntArray432[local50++] = local77;
				} else if (local4[local58] instanceof JagString) {
					local194 = (JagString) local4[local58];
					if (local194.method3108(Static15.aClass100_83)) {
						local194 = arg1.aClass100_598;
					}
					Static180.aClass100Array125[local56++] = local194;
				}
			}
			local58 = 0;
			label4266: while (true) {
				local58++;
				if (arg0 < local58) {
					throw new RuntimeException("slow");
				}
				local30++;
				@Pc(226) int local226 = local36[local30];
				@Pc(803) int local803;
				@Pc(652) int local652;
				@Pc(809) int local809;
				@Pc(609) JagString local609;
				if (local226 < 100) {
					if (local226 == 0) {
						Static254.anIntArray487[local28++] = local33[local30];
						continue;
					}
					if (local226 == 1) {
						local77 = local33[local30];
						Static254.anIntArray487[local28++] = Static7.anIntArray75[local77];
						continue;
					}
					if (local226 == 2) {
						local77 = local33[local30];
						local28--;
						Static148.method2766(local77, Static254.anIntArray487[local28]);
						continue;
					}
					if (local226 == 3) {
						Static3.aClass100Array176[local26++] = local14.aClass100Array140[local30];
						continue;
					}
					if (local226 == 6) {
						local30 += local33[local30];
						continue;
					}
					if (local226 == 7) {
						local28 -= 2;
						if (Static254.anIntArray487[local28] != Static254.anIntArray487[local28 + 1]) {
							local30 += local33[local30];
						}
						continue;
					}
					if (local226 == 8) {
						local28 -= 2;
						if (Static254.anIntArray487[local28 + 1] == Static254.anIntArray487[local28]) {
							local30 += local33[local30];
						}
						continue;
					}
					if (local226 == 9) {
						local28 -= 2;
						if (Static254.anIntArray487[local28] < Static254.anIntArray487[local28 + 1]) {
							local30 += local33[local30];
						}
						continue;
					}
					if (local226 == 10) {
						local28 -= 2;
						if (Static254.anIntArray487[local28 + 1] < Static254.anIntArray487[local28]) {
							local30 += local33[local30];
						}
						continue;
					}
					if (local226 == 21) {
						if (Static138.anInt3445 == 0) {
							return;
						}
						@Pc(423) GoSubFrame local423 = Static67.aClass61Array3[--Static138.anInt3445];
						local14 = local423.aClass3_Sub2_Sub17_1;
						Static215.anIntArray432 = local423.anIntArray237;
						local36 = local14.anIntArray415;
						local30 = local423.anInt2515;
						Static180.aClass100Array125 = local423.aClass100Array79;
						local33 = local14.anIntArray416;
						continue;
					}
					if (local226 == 25) {
						local77 = local33[local30];
						Static254.anIntArray487[local28++] = Static155.method2945(local77);
						continue;
					}
					if (local226 == 27) {
						local77 = local33[local30];
						local28--;
						Static202.method3655(local77, Static254.anIntArray487[local28]);
						continue;
					}
					if (local226 == 31) {
						local28 -= 2;
						if (Static254.anIntArray487[local28 + 1] >= Static254.anIntArray487[local28]) {
							local30 += local33[local30];
						}
						continue;
					}
					if (local226 == 32) {
						local28 -= 2;
						if (Static254.anIntArray487[local28] >= Static254.anIntArray487[local28 + 1]) {
							local30 += local33[local30];
						}
						continue;
					}
					if (local226 == 33) {
						Static254.anIntArray487[local28++] = Static215.anIntArray432[local33[local30]];
						continue;
					}
					@Pc(555) int local555;
					if (local226 == 34) {
						local555 = local33[local30];
						local28--;
						Static215.anIntArray432[local555] = Static254.anIntArray487[local28];
						continue;
					}
					if (local226 == 35) {
						Static3.aClass100Array176[local26++] = Static180.aClass100Array125[local33[local30]];
						continue;
					}
					if (local226 == 36) {
						local555 = local33[local30];
						local26--;
						Static180.aClass100Array125[local555] = Static3.aClass100Array176[local26];
						continue;
					}
					if (local226 == 37) {
						local77 = local33[local30];
						local26 -= local77;
						local609 = Static118.method2355(local26, local77, Static3.aClass100Array176);
						Static3.aClass100Array176[local26++] = local609;
						continue;
					}
					if (local226 == 38) {
						local28--;
						continue;
					}
					if (local226 == 39) {
						local26--;
						continue;
					}
					if (local226 == 40) {
						local77 = local33[local30];
						@Pc(642) ClientScript local642 = Static91.method1875(local77);
						@Pc(646) int[] local646 = new int[local642.anInt4667];
						@Pc(650) JagString[] local650 = new JagString[local642.anInt4671];
						for (local652 = 0; local652 < local642.anInt4665; local652++) {
							local646[local652] = Static254.anIntArray487[local652 + local28 - local642.anInt4665];
						}
						for (local652 = 0; local652 < local642.anInt4669; local652++) {
							local650[local652] = Static3.aClass100Array176[local652 + local26 - local642.anInt4669];
						}
						local28 -= local642.anInt4665;
						local26 -= local642.anInt4669;
						@Pc(705) GoSubFrame local705 = new GoSubFrame();
						local705.aClass100Array79 = Static180.aClass100Array125;
						local705.anIntArray237 = Static215.anIntArray432;
						local705.anInt2515 = local30;
						local705.aClass3_Sub2_Sub17_1 = local14;
						if (Static138.anInt3445 >= Static67.aClass61Array3.length) {
							throw new RuntimeException();
						}
						local14 = local642;
						local30 = -1;
						Static67.aClass61Array3[Static138.anInt3445++] = local705;
						Static215.anIntArray432 = local646;
						local33 = local642.anIntArray416;
						local36 = local642.anIntArray415;
						Static180.aClass100Array125 = local650;
						continue;
					}
					if (local226 == 42) {
						Static254.anIntArray487[local28++] = Static155.varcs[local33[local30]];
						continue;
					}
					if (local226 == 43) {
						local77 = local33[local30];
						local28--;
						Static155.varcs[local77] = Static254.anIntArray487[local28];
						Static4.method24(local77);
						continue;
					}
					if (local226 == 44) {
						local77 = local33[local30] >> 16;
						local28--;
						local803 = Static254.anIntArray487[local28];
						local809 = local33[local30] & 0xFFFF;
						if (local803 >= 0 && local803 <= 5000) {
							Static55.anIntArray140[local77] = local803;
							@Pc(828) byte local828 = -1;
							if (local809 == 105) {
								local828 = 0;
							}
							local652 = 0;
							while (true) {
								if (local803 <= local652) {
									continue label4266;
								}
								Static179.anIntArrayArray33[local77][local652] = local828;
								local652++;
							}
						}
						throw new RuntimeException();
					}
					if (local226 == 45) {
						local77 = local33[local30];
						local28--;
						local809 = Static254.anIntArray487[local28];
						if (local809 >= 0 && local809 < Static55.anIntArray140[local77]) {
							Static254.anIntArray487[local28++] = Static179.anIntArrayArray33[local77][local809];
							continue;
						}
						throw new RuntimeException();
					}
					if (local226 == 46) {
						local77 = local33[local30];
						local28 -= 2;
						local809 = Static254.anIntArray487[local28];
						if (local809 >= 0 && local809 < Static55.anIntArray140[local77]) {
							Static179.anIntArrayArray33[local77][local809] = Static254.anIntArray487[local28 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local226 == 47) {
						local194 = Static226.varcstrs[local33[local30]];
						if (local194 == null) {
							local194 = Static254.aClass100_1061;
						}
						Static3.aClass100Array176[local26++] = local194;
						continue;
					}
					if (local226 == 48) {
						local77 = local33[local30];
						local26--;
						Static226.varcstrs[local77] = Static3.aClass100Array176[local26];
						Static89.method1840(local77);
						continue;
					}
					if (local226 == 51) {
						@Pc(992) HashTable local992 = local14.aClass133Array1[local33[local30]];
						local28--;
						@Pc(1002) IntNode local1002 = (IntNode) local992.method3863((long) Static254.anIntArray487[local28]);
						if (local1002 != null) {
							local30 += local1002.anInt3141;
						}
						continue;
					}
				}
				@Pc(1020) boolean local1020;
				if (local33[local30] == 1) {
					local1020 = true;
				} else {
					local1020 = false;
				}
				@Pc(1182) Component local1182;
				@Pc(1052) int local1052;
				@Pc(1063) Component local1063;
				@Pc(1087) int local1087;
				@Pc(1256) Component local1256;
				if (local226 < 300) {
					if (local226 == 100) {
						local28 -= 3;
						local809 = Static254.anIntArray487[local28];
						local803 = Static254.anIntArray487[local28 + 1];
						local1052 = Static254.anIntArray487[local28 + 2];
						if (local803 != 0) {
							local1063 = Static5.getComponent(local809);
							if (local1063.createdComponents == null) {
								local1063.createdComponents = new Component[local1052 + 1];
							}
							if (local1052 >= local1063.createdComponents.length) {
								@Pc(1085) Component[] local1085 = new Component[local1052 + 1];
								for (local1087 = 0; local1087 < local1063.createdComponents.length; local1087++) {
									local1085[local1087] = local1063.createdComponents[local1087];
								}
								local1063.createdComponents = local1085;
							}
							if (local1052 > 0 && local1063.createdComponents[local1052 - 1] == null) {
								throw new RuntimeException("Gap at:" + (local1052 - 1));
							}
							@Pc(1137) Component local1137 = new Component();
							local1137.aBoolean32 = true;
							local1137.componentId = local1052;
							local1137.layer = local1137.anInt507 = local1063.anInt507;
							local1137.anInt452 = local803;
							local1063.createdComponents[local1052] = local1137;
							if (local1020) {
								Static274.aClass13_24 = local1137;
							} else {
								Static227.aClass13_25 = local1137;
							}
							Static43.method1143(local1063);
							continue;
						}
						throw new RuntimeException();
					}
					@Pc(1204) Component local1204;
					if (local226 == 101) {
						local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
						if (local1182.componentId == -1) {
							if (!local1020) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1204 = Static5.getComponent(local1182.anInt507);
						local1204.createdComponents[local1182.componentId] = null;
						Static43.method1143(local1204);
						continue;
					}
					if (local226 == 102) {
						local28--;
						local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
						local1182.createdComponents = null;
						Static43.method1143(local1182);
						continue;
					}
					if (local226 == 200) {
						local28 -= 2;
						local809 = Static254.anIntArray487[local28];
						local803 = Static254.anIntArray487[local28 + 1];
						local1256 = Static201.method1418(local809, local803);
						if (local1256 != null && local803 != -1) {
							Static254.anIntArray487[local28++] = 1;
							if (local1020) {
								Static274.aClass13_24 = local1256;
							} else {
								Static227.aClass13_25 = local1256;
							}
							continue;
						}
						Static254.anIntArray487[local28++] = 0;
						continue;
					}
					if (local226 == 201) {
						local28--;
						local809 = Static254.anIntArray487[local28];
						local1204 = Static5.getComponent(local809);
						if (local1204 == null) {
							Static254.anIntArray487[local28++] = 0;
						} else {
							Static254.anIntArray487[local28++] = 1;
							if (local1020) {
								Static274.aClass13_24 = local1204;
							} else {
								Static227.aClass13_25 = local1204;
							}
						}
						continue;
					}
				} else {
					@Pc(12388) boolean local12388;
					if (local226 < 500) {
						if (local226 == 403) {
							local28 -= 2;
							local803 = Static254.anIntArray487[local28 + 1];
							local809 = Static254.anIntArray487[local28];
							for (local1052 = 0; local1052 < Static204.anIntArray425.length; local1052++) {
								if (local809 == Static204.anIntArray425[local1052]) {
									Static173.self.aClass59_1.method1953(local1052, local803);
									continue label4266;
								}
							}
							local1052 = 0;
							while (true) {
								if (local1052 >= Static153.anIntArray351.length) {
									continue label4266;
								}
								if (local809 == Static153.anIntArray351[local1052]) {
									Static173.self.aClass59_1.method1953(local1052, local803);
									continue label4266;
								}
								local1052++;
							}
						}
						if (local226 == 404) {
							local28 -= 2;
							local809 = Static254.anIntArray487[local28];
							local803 = Static254.anIntArray487[local28 + 1];
							Static173.self.aClass59_1.method1951(local809, local803);
							continue;
						}
						if (local226 == 410) {
							local28--;
							local12388 = Static254.anIntArray487[local28] != 0;
							Static173.self.aClass59_1.method1948(local12388);
							continue;
						}
					} else {
						@Pc(1552) boolean local1552;
						if ((local226 < 1000 || local226 >= 1100) && (local226 < 2000 || local226 >= 2100)) {
							@Pc(2522) JagString local2522;
							if (local226 >= 1100 && local226 < 1200 || !(local226 < 2100 || local226 >= 2200)) {
								if (local226 < 2000) {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
								} else {
									local226 -= 1000;
									local28--;
									local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
								}
								if (local226 == 1100) {
									local28 -= 2;
									local1182.anInt489 = Static254.anIntArray487[local28];
									if (local1182.anInt489 > local1182.anInt486 - local1182.anInt445) {
										local1182.anInt489 = local1182.anInt486 - local1182.anInt445;
									}
									if (local1182.anInt489 < 0) {
										local1182.anInt489 = 0;
									}
									local1182.scrollY = Static254.anIntArray487[local28 + 1];
									if (local1182.scrollY > local1182.anInt491 - local1182.anInt459) {
										local1182.scrollY = local1182.anInt491 - local1182.anInt459;
									}
									if (local1182.scrollY < 0) {
										local1182.scrollY = 0;
									}
									Static43.method1143(local1182);
									if (local1182.componentId == -1) {
										Static118.method2353(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1101) {
									local28--;
									local1182.anInt474 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									if (local1182.componentId == -1) {
										Static245.method4224(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1102) {
									local28--;
									local1182.aBoolean30 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1103) {
									local28--;
									local1182.anInt476 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1104) {
									local28--;
									local1182.anInt490 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1105) {
									local28--;
									local1182.anInt477 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1106) {
									local28--;
									local1182.anInt521 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1107) {
									local28--;
									local1182.aBoolean23 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1108) {
									local1182.modelType = 1;
									local28--;
									local1182.modelId = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									if (local1182.componentId == -1) {
										Static271.method4600(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1109) {
									local28 -= 6;
									local1182.modelXOffset = Static254.anIntArray487[local28];
									local1182.modelZOffset = Static254.anIntArray487[local28 + 1];
									local1182.modelXAngle = Static254.anIntArray487[local28 + 2];
									local1182.modelYAngle = Static254.anIntArray487[local28 + 3];
									local1182.modelYOffset = Static254.anIntArray487[local28 + 4];
									local1182.modelZoom = Static254.anIntArray487[local28 + 5];
									Static43.method1143(local1182);
									if (local1182.componentId == -1) {
										Static153.method2910(local1182.anInt507);
										Static180.method3328(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1110) {
									local28--;
									local803 = Static254.anIntArray487[local28];
									if (local1182.anInt522 != local803) {
										local1182.anInt522 = local803;
										local1182.anInt510 = 0;
										local1182.anInt500 = 0;
										local1182.anInt496 = 1;
										Static43.method1143(local1182);
									}
									if (local1182.componentId == -1) {
										Static181.method3345(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1111) {
									local28--;
									local1182.aBoolean22 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1112) {
									local26--;
									local2522 = Static3.aClass100Array176[local26];
									if (!local2522.method3108(local1182.aClass100_84)) {
										local1182.aClass100_84 = local2522;
										Static43.method1143(local1182);
									}
									if (local1182.componentId == -1) {
										Static163.method3096(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1113) {
									local28--;
									local1182.anInt502 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1114) {
									local28 -= 3;
									local1182.anInt460 = Static254.anIntArray487[local28];
									local1182.anInt478 = Static254.anIntArray487[local28 + 1];
									local1182.anInt467 = Static254.anIntArray487[local28 + 2];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1115) {
									local28--;
									local1182.aBoolean28 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1116) {
									local28--;
									local1182.anInt514 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1117) {
									local28--;
									local1182.anInt513 = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1118) {
									local28--;
									local1182.aBoolean21 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1119) {
									local28--;
									local1182.aBoolean26 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1120) {
									local28 -= 2;
									local1182.anInt486 = Static254.anIntArray487[local28];
									local1182.anInt491 = Static254.anIntArray487[local28 + 1];
									Static43.method1143(local1182);
									if (local1182.anInt452 == 0) {
										Static17.method531(local1182, false);
									}
									continue;
								}
								if (local226 == 1121) {
									local28 -= 2;
									local1182.aShort11 = (short) Static254.anIntArray487[local28];
									local1182.aShort10 = (short) Static254.anIntArray487[local28 + 1];
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1122) {
									local28--;
									local1182.aBoolean18 = Static254.anIntArray487[local28] == 1;
									Static43.method1143(local1182);
									continue;
								}
								if (local226 == 1123) {
									local28--;
									local1182.modelZoom = Static254.anIntArray487[local28];
									Static43.method1143(local1182);
									if (local1182.componentId == -1) {
										Static153.method2910(local1182.anInt507);
									}
									continue;
								}
							} else if (local226 >= 1200 && local226 < 1300 || !(local226 < 2200 || local226 >= 2300)) {
								if (local226 < 2000) {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
								} else {
									local28--;
									local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
									local226 -= 1000;
								}
								Static43.method1143(local1182);
								if (local226 == 1200 || local226 == 1205) {
									local28 -= 2;
									local1052 = Static254.anIntArray487[local28 + 1];
									local803 = Static254.anIntArray487[local28];
									if (local1182.componentId == -1) {
										Static251.method4279(local1182.anInt507);
										Static153.method2910(local1182.anInt507);
										Static180.method3328(local1182.anInt507);
									}
									if (local803 == -1) {
										local1182.modelId = -1;
										local1182.modelType = 1;
										local1182.objId = -1;
									} else {
										local1182.objId = local803;
										local1182.objCount = local1052;
										@Pc(13416) ObjType local13416 = Static71.method1439(local803);
										local1182.modelYOffset = local13416.anInt2339;
										local1182.modelXOffset = local13416.anInt2359;
										local1182.modelXAngle = local13416.anInt2353;
										local1182.modelZOffset = local13416.anInt2319;
										local1182.modelYAngle = local13416.anInt2369;
										local1182.modelZoom = local13416.anInt2375;
										if (local1182.anInt451 > 0) {
											local1182.modelZoom = local1182.modelZoom * 32 / local1182.anInt451;
										} else if (local1182.baseWidth > 0) {
											local1182.modelZoom = local1182.modelZoom * 32 / local1182.baseWidth;
										}
										if (local226 == 1205) {
											local1182.aBoolean31 = false;
										} else {
											local1182.aBoolean31 = true;
										}
									}
									continue;
								}
								if (local226 == 1201) {
									local1182.modelType = 2;
									local28--;
									local1182.modelId = Static254.anIntArray487[local28];
									if (local1182.componentId == -1) {
										Static271.method4600(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1202) {
									local1182.modelType = 3;
									local1182.modelId = Static173.self.aClass59_1.method1952();
									if (local1182.componentId == -1) {
										Static271.method4600(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1203) {
									local1182.modelType = 6;
									local28--;
									local1182.modelId = Static254.anIntArray487[local28];
									if (local1182.componentId == -1) {
										Static271.method4600(local1182.anInt507);
									}
									continue;
								}
								if (local226 == 1204) {
									local1182.modelType = 5;
									local28--;
									local1182.modelId = Static254.anIntArray487[local28];
									if (local1182.componentId == -1) {
										Static271.method4600(local1182.anInt507);
									}
									continue;
								}
							} else if (local226 >= 1300 && local226 < 1400 || local226 >= 2300 && local226 < 2400) {
								if (local226 >= 2000) {
									local28--;
									local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
									local226 -= 1000;
								} else {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
								}
								if (local226 == 1300) {
									local28--;
									local803 = Static254.anIntArray487[local28] - 1;
									if (local803 >= 0 && local803 <= 9) {
										local26--;
										local1182.method480(Static3.aClass100Array176[local26], local803);
										continue;
									}
									local26--;
									continue;
								}
								if (local226 == 1301) {
									local28 -= 2;
									local1052 = Static254.anIntArray487[local28 + 1];
									local803 = Static254.anIntArray487[local28];
									local1182.aClass13_5 = Static201.method1418(local803, local1052);
									continue;
								}
								if (local226 == 1302) {
									local28--;
									local1182.aBoolean27 = Static254.anIntArray487[local28] == 1;
									continue;
								}
								if (local226 == 1303) {
									local28--;
									local1182.anInt472 = Static254.anIntArray487[local28];
									continue;
								}
								if (local226 == 1304) {
									local28--;
									local1182.anInt447 = Static254.anIntArray487[local28];
									continue;
								}
								if (local226 == 1305) {
									local26--;
									local1182.aClass100_88 = Static3.aClass100Array176[local26];
									continue;
								}
								if (local226 == 1306) {
									local26--;
									local1182.aClass100_86 = Static3.aClass100Array176[local26];
									continue;
								}
								if (local226 == 1307) {
									local1182.aClass100Array18 = null;
									continue;
								}
								if (local226 == 1308) {
									local28--;
									local1182.anInt484 = Static254.anIntArray487[local28];
									local28--;
									local1182.anInt499 = Static254.anIntArray487[local28];
									continue;
								}
								if (local226 == 1309) {
									local28--;
									local803 = Static254.anIntArray487[local28];
									local28--;
									local1052 = Static254.anIntArray487[local28];
									if (local1052 >= 1 && local1052 <= 10) {
										local1182.method477(local1052 - 1, local803);
									}
									continue;
								}
							} else {
								@Pc(4859) int local4859;
								if (local226 >= 1400 && local226 < 1500 || local226 >= 2400 && local226 < 2500) {
									if (local226 < 2000) {
										local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
									} else {
										local226 -= 1000;
										local28--;
										local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
									}
									@Pc(12937) int[] local12937 = null;
									local26--;
									local2522 = Static3.aClass100Array176[local26];
									if (local2522.length() > 0 && local2522.method3149(local2522.length() - 1) == 89) {
										local28--;
										local652 = Static254.anIntArray487[local28];
										if (local652 > 0) {
											local12937 = new int[local652];
											while (local652-- > 0) {
												local28--;
												local12937[local652] = Static254.anIntArray487[local28];
											}
										}
										local2522 = local2522.substring(local2522.length() - 1, 0);
									}
									@Pc(13000) Object[] local13000 = new Object[local2522.length() + 1];
									for (local4859 = local13000.length - 1; local4859 >= 1; local4859--) {
										if (local2522.method3149(local4859 - 1) == 115) {
											local26--;
											local13000[local4859] = Static3.aClass100Array176[local26];
										} else {
											local28--;
											local13000[local4859] = Integer.valueOf(Static254.anIntArray487[local28]);
										}
									}
									local28--;
									local4859 = Static254.anIntArray487[local28];
									if (local4859 == -1) {
										local13000 = null;
									} else {
										local13000[0] = Integer.valueOf(local4859);
									}
									local1182.aBoolean25 = true;
									if (local226 == 1400) {
										local1182.anObjectArray5 = local13000;
									} else if (local226 == 1401) {
										local1182.anObjectArray9 = local13000;
									} else if (local226 == 1402) {
										local1182.anObjectArray18 = local13000;
									} else if (local226 == 1403) {
										local1182.anObjectArray19 = local13000;
									} else if (local226 == 1404) {
										local1182.anObjectArray24 = local13000;
									} else if (local226 == 1405) {
										local1182.anObjectArray26 = local13000;
									} else if (local226 == 1406) {
										local1182.anObjectArray27 = local13000;
									} else if (local226 == 1407) {
										local1182.anIntArray44 = local12937;
										local1182.anObjectArray25 = local13000;
									} else if (local226 == 1408) {
										local1182.anObjectArray22 = local13000;
									} else if (local226 == 1409) {
										local1182.anObjectArray29 = local13000;
									} else if (local226 == 1410) {
										local1182.anObjectArray16 = local13000;
									} else if (local226 == 1411) {
										local1182.anObjectArray6 = local13000;
									} else if (local226 == 1412) {
										local1182.anObjectArray23 = local13000;
									} else if (local226 == 1414) {
										local1182.anIntArray34 = local12937;
										local1182.anObjectArray7 = local13000;
									} else if (local226 == 1415) {
										local1182.anIntArray42 = local12937;
										local1182.anObjectArray2 = local13000;
									} else if (local226 == 1416) {
										local1182.anObjectArray11 = local13000;
									} else if (local226 == 1417) {
										local1182.anObjectArray10 = local13000;
									} else if (local226 == 1418) {
										local1182.anObjectArray20 = local13000;
									} else if (local226 == 1419) {
										local1182.anObjectArray14 = local13000;
									} else if (local226 == 1420) {
										local1182.anObjectArray1 = local13000;
									} else if (local226 == 1421) {
										local1182.anObjectArray28 = local13000;
									} else if (local226 == 1422) {
										local1182.anObjectArray30 = local13000;
									} else if (local226 == 1423) {
										local1182.anObjectArray12 = local13000;
									} else if (local226 == 1424) {
										local1182.anObjectArray8 = local13000;
									} else if (local226 == 1425) {
										local1182.anObjectArray21 = local13000;
									} else if (local226 == 1426) {
										local1182.anObjectArray13 = local13000;
									} else if (local226 == 1427) {
										local1182.anObjectArray17 = local13000;
									} else if (local226 == 1428) {
										local1182.anObjectArray4 = local13000;
										local1182.anIntArray38 = local12937;
									} else if (local226 == 1429) {
										local1182.anIntArray35 = local12937;
										local1182.anObjectArray15 = local13000;
									}
									continue;
								}
								if (local226 < 1600) {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
									if (local226 == 1500) {
										Static254.anIntArray487[local28++] = local1182.x;
										continue;
									}
									if (local226 == 1501) {
										Static254.anIntArray487[local28++] = local1182.y;
										continue;
									}
									if (local226 == 1502) {
										Static254.anIntArray487[local28++] = local1182.anInt445;
										continue;
									}
									if (local226 == 1503) {
										Static254.anIntArray487[local28++] = local1182.anInt459;
										continue;
									}
									if (local226 == 1504) {
										Static254.anIntArray487[local28++] = local1182.hidden ? 1 : 0;
										continue;
									}
									if (local226 == 1505) {
										Static254.anIntArray487[local28++] = local1182.layer;
										continue;
									}
								} else if (local226 < 1700) {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
									if (local226 == 1600) {
										Static254.anIntArray487[local28++] = local1182.anInt489;
										continue;
									}
									if (local226 == 1601) {
										Static254.anIntArray487[local28++] = local1182.scrollY;
										continue;
									}
									if (local226 == 1602) {
										Static3.aClass100Array176[local26++] = local1182.aClass100_84;
										continue;
									}
									if (local226 == 1603) {
										Static254.anIntArray487[local28++] = local1182.anInt486;
										continue;
									}
									if (local226 == 1604) {
										Static254.anIntArray487[local28++] = local1182.anInt491;
										continue;
									}
									if (local226 == 1605) {
										Static254.anIntArray487[local28++] = local1182.modelZoom;
										continue;
									}
									if (local226 == 1606) {
										Static254.anIntArray487[local28++] = local1182.modelXAngle;
										continue;
									}
									if (local226 == 1607) {
										Static254.anIntArray487[local28++] = local1182.modelYOffset;
										continue;
									}
									if (local226 == 1608) {
										Static254.anIntArray487[local28++] = local1182.modelYAngle;
										continue;
									}
									if (local226 == 1609) {
										Static254.anIntArray487[local28++] = local1182.anInt476;
										continue;
									}
									if (local226 == 1610) {
										Static254.anIntArray487[local28++] = local1182.modelXOffset;
										continue;
									}
									if (local226 == 1611) {
										Static254.anIntArray487[local28++] = local1182.modelZOffset;
										continue;
									}
									if (local226 == 1612) {
										Static254.anIntArray487[local28++] = local1182.anInt477;
										continue;
									}
								} else if (local226 < 1800) {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
									if (local226 == 1700) {
										Static254.anIntArray487[local28++] = local1182.objId;
										continue;
									}
									if (local226 == 1701) {
										if (local1182.objId == -1) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = local1182.objCount;
										}
										continue;
									}
									if (local226 == 1702) {
										Static254.anIntArray487[local28++] = local1182.componentId;
										continue;
									}
								} else if (local226 < 1900) {
									local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
									if (local226 == 1800) {
										Static254.anIntArray487[local28++] = Static36.method940(local1182).method512();
										continue;
									}
									if (local226 == 1801) {
										local28--;
										local803 = Static254.anIntArray487[local28];
										local803--;
										if (local1182.aClass100Array18 != null && local803 < local1182.aClass100Array18.length && local1182.aClass100Array18[local803] != null) {
											Static3.aClass100Array176[local26++] = local1182.aClass100Array18[local803];
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 1802) {
										if (local1182.aClass100_88 == null) {
											Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										} else {
											Static3.aClass100Array176[local26++] = local1182.aClass100_88;
										}
										continue;
									}
								} else if (local226 < 2600) {
									local28--;
									local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
									if (local226 == 2500) {
										Static254.anIntArray487[local28++] = local1182.x;
										continue;
									}
									if (local226 == 2501) {
										Static254.anIntArray487[local28++] = local1182.y;
										continue;
									}
									if (local226 == 2502) {
										Static254.anIntArray487[local28++] = local1182.anInt445;
										continue;
									}
									if (local226 == 2503) {
										Static254.anIntArray487[local28++] = local1182.anInt459;
										continue;
									}
									if (local226 == 2504) {
										Static254.anIntArray487[local28++] = local1182.hidden ? 1 : 0;
										continue;
									}
									if (local226 == 2505) {
										Static254.anIntArray487[local28++] = local1182.layer;
										continue;
									}
								} else if (local226 < 2700) {
									local28--;
									local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
									if (local226 == 2600) {
										Static254.anIntArray487[local28++] = local1182.anInt489;
										continue;
									}
									if (local226 == 2601) {
										Static254.anIntArray487[local28++] = local1182.scrollY;
										continue;
									}
									if (local226 == 2602) {
										Static3.aClass100Array176[local26++] = local1182.aClass100_84;
										continue;
									}
									if (local226 == 2603) {
										Static254.anIntArray487[local28++] = local1182.anInt486;
										continue;
									}
									if (local226 == 2604) {
										Static254.anIntArray487[local28++] = local1182.anInt491;
										continue;
									}
									if (local226 == 2605) {
										Static254.anIntArray487[local28++] = local1182.modelZoom;
										continue;
									}
									if (local226 == 2606) {
										Static254.anIntArray487[local28++] = local1182.modelXAngle;
										continue;
									}
									if (local226 == 2607) {
										Static254.anIntArray487[local28++] = local1182.modelYOffset;
										continue;
									}
									if (local226 == 2608) {
										Static254.anIntArray487[local28++] = local1182.modelYAngle;
										continue;
									}
									if (local226 == 2609) {
										Static254.anIntArray487[local28++] = local1182.anInt476;
										continue;
									}
									if (local226 == 2610) {
										Static254.anIntArray487[local28++] = local1182.modelXOffset;
										continue;
									}
									if (local226 == 2611) {
										Static254.anIntArray487[local28++] = local1182.modelZOffset;
										continue;
									}
									if (local226 == 2612) {
										Static254.anIntArray487[local28++] = local1182.anInt477;
										continue;
									}
								} else if (local226 < 2800) {
									if (local226 == 2700) {
										local28--;
										local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
										Static254.anIntArray487[local28++] = local1182.objId;
										continue;
									}
									if (local226 == 2701) {
										local28--;
										local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
										if (local1182.objId == -1) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = local1182.objCount;
										}
										continue;
									}
									if (local226 == 2702) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										@Pc(12566) Class3_Sub31 local12566 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local809);
										if (local12566 == null) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = 1;
										}
										continue;
									}
									if (local226 == 2703) {
										local28--;
										local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
										if (local1182.createdComponents == null) {
											Static254.anIntArray487[local28++] = 0;
											continue;
										}
										local803 = local1182.createdComponents.length;
										for (local1052 = 0; local1052 < local1182.createdComponents.length; local1052++) {
											if (local1182.createdComponents[local1052] == null) {
												local803 = local1052;
												break;
											}
										}
										Static254.anIntArray487[local28++] = local803;
										continue;
									}
									if (local226 == 2704 || local226 == 2705) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										@Pc(12663) Class3_Sub31 local12663 = (Class3_Sub31) Static119.aClass133_9.method3863((long) local809);
										if (local12663 != null && local12663.anInt5878 == local803) {
											Static254.anIntArray487[local28++] = 1;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
								} else if (local226 < 2900) {
									local28--;
									local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
									if (local226 == 2800) {
										Static254.anIntArray487[local28++] = Static36.method940(local1182).method512();
										continue;
									}
									if (local226 == 2801) {
										local28--;
										local803 = Static254.anIntArray487[local28];
										local803--;
										if (local1182.aClass100Array18 != null && local1182.aClass100Array18.length > local803 && local1182.aClass100Array18[local803] != null) {
											Static3.aClass100Array176[local26++] = local1182.aClass100Array18[local803];
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 2802) {
										if (local1182.aClass100_88 == null) {
											Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										} else {
											Static3.aClass100Array176[local26++] = local1182.aClass100_88;
										}
										continue;
									}
								} else if (local226 < 3200) {
									if (local226 == 3100) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static103.method2231(Static72.aClass100_447, 0, local609);
										continue;
									}
									if (local226 == 3101) {
										local28 -= 2;
										Static186.method3415(Static254.anIntArray487[local28 + 1], Static254.anIntArray487[local28], Static173.self);
										continue;
									}
									if (local226 == 3103) {
										Static153.method2909();
										continue;
									}
									if (local226 == 3104) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local803 = 0;
										if (local609.method3123()) {
											local803 = local609.method3132();
										}
										Static6.outboundBuffer.p1isaac(23);
										Static6.outboundBuffer.p4(local803);
										continue;
									}
									if (local226 == 3105) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static6.outboundBuffer.p1isaac(244);
										Static6.outboundBuffer.p8(local609.encode37());
										continue;
									}
									if (local226 == 3106) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static6.outboundBuffer.p1isaac(65);
										Static6.outboundBuffer.p1(local609.length() + 1);
										Static6.outboundBuffer.pjstr(local609);
										continue;
									}
									if (local226 == 3107) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										local26--;
										local2522 = Static3.aClass100Array176[local26];
										Static276.method4613(local809, local2522);
										continue;
									}
									if (local226 == 3108) {
										local28 -= 3;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										local1052 = Static254.anIntArray487[local28 + 2];
										local1063 = Static5.getComponent(local1052);
										Static40.method1015(local803, local809, local1063);
										continue;
									}
									if (local226 == 3109) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local1256 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
										local803 = Static254.anIntArray487[local28 + 1];
										Static40.method1015(local803, local809, local1256);
										continue;
									}
									if (local226 == 3110) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static6.outboundBuffer.p1isaac(111);
										Static6.outboundBuffer.p2(local809);
										continue;
									}
								} else if (local226 < 3300) {
									if (local226 == 3200) {
										local28 -= 3;
										Static26.method744(Static254.anIntArray487[local28 + 1], Static254.anIntArray487[local28], Static254.anIntArray487[local28 + 2]);
										continue;
									}
									if (local226 == 3201) {
										local28--;
										Static148.method2765(Static254.anIntArray487[local28]);
										continue;
									}
									if (local226 == 3202) {
										local28 -= 2;
										Static278.method4650(Static254.anIntArray487[local28 + 1], Static254.anIntArray487[local28]);
										continue;
									}
								} else if (local226 < 3400) {
									if (local226 == 3300) {
										Static254.anIntArray487[local28++] = Static83.anInt372;
										continue;
									}
									if (local226 == 3301) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = Static15.method484(local809, local803);
										continue;
									}
									if (local226 == 3302) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static23.method647(local809, local803);
										continue;
									}
									if (local226 == 3303) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static278.method4652(local809, local803);
										continue;
									}
									if (local226 == 3304) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static246.method4241(local809).anInt3706;
										continue;
									}
									if (local226 == 3305) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static99.anIntArray240[local809];
										continue;
									}
									if (local226 == 3306) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static141.anIntArray326[local809];
										continue;
									}
									if (local226 == 3307) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static227.anIntArray446[local809];
										continue;
									}
									if (local226 == 3308) {
										local809 = Static55.level;
										local803 = Static225.originX + (Static173.self.anInt3412 >> 7);
										local1052 = (Static173.self.anInt3421 >> 7) + Static142.originZ;
										Static254.anIntArray487[local28++] = (local809 << 28) - (-(local803 << 14) - local1052);
										continue;
									}
									if (local226 == 3309) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local809 >> 14 & 0x3FFF;
										continue;
									}
									if (local226 == 3310) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local809 >> 28;
										continue;
									}
									if (local226 == 3311) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local809 & 0x3FFF;
										continue;
									}
									if (local226 == 3312) {
										Static254.anIntArray487[local28++] = Static2.aBoolean1 ? 1 : 0;
										continue;
									}
									if (local226 == 3313) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28] + 32768;
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = Static15.method484(local809, local803);
										continue;
									}
									if (local226 == 3314) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28] + 32768;
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = Static23.method647(local809, local803);
										continue;
									}
									if (local226 == 3315) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28] + 32768;
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = Static278.method4652(local809, local803);
										continue;
									}
									if (local226 == 3316) {
										if (Static191.staffModLevel < 2) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = Static191.staffModLevel;
										}
										continue;
									}
									if (local226 == 3317) {
										Static254.anIntArray487[local28++] = Static60.rebootTimer;
										continue;
									}
									if (local226 == 3318) {
										Static254.anIntArray487[local28++] = Static125.worldId;
										continue;
									}
									if (local226 == 3321) {
										Static254.anIntArray487[local28++] = Static12.anInt400;
										continue;
									}
									if (local226 == 3322) {
										Static254.anIntArray487[local28++] = Static251.anInt5456;
										continue;
									}
									if (local226 == 3323) {
										if (Static249.anInt5431 >= 5 && Static249.anInt5431 <= 9) {
											Static254.anIntArray487[local28++] = 1;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3324) {
										if (Static249.anInt5431 >= 5 && Static249.anInt5431 <= 9) {
											Static254.anIntArray487[local28++] = Static249.anInt5431;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3325) {
										Static254.anIntArray487[local28++] = Static202.aBoolean233 ? 1 : 0;
										continue;
									}
									if (local226 == 3326) {
										Static254.anIntArray487[local28++] = Static173.self.anInt1652;
										continue;
									}
									if (local226 == 3327) {
										Static254.anIntArray487[local28++] = Static173.self.aClass59_1.aBoolean141 ? 1 : 0;
										continue;
									}
									if (local226 == 3328) {
										Static254.anIntArray487[local28++] = Static124.aBoolean157 && !Static207.aBoolean236 ? 1 : 0;
										continue;
									}
									if (local226 == 3329) {
										Static254.anIntArray487[local28++] = Static86.aBoolean129 ? 1 : 0;
										continue;
									}
									if (local226 == 3330) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static11.method446(local809);
										continue;
									}
									if (local226 == 3331) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static178.method3319(false, local809, local803);
										continue;
									}
									if (local226 == 3332) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = Static178.method3319(true, local809, local803);
										continue;
									}
									if (local226 == 3333) {
										Static254.anIntArray487[local28++] = Static5.anInt39;
										continue;
									}
									if (local226 == 3335) {
										Static254.anIntArray487[local28++] = Static141.anInt3470;
										continue;
									}
									if (local226 == 3336) {
										local28 -= 4;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										local809 += local803 << 14;
										local652 = Static254.anIntArray487[local28 + 3];
										local1052 = Static254.anIntArray487[local28 + 2];
										local809 += local1052 << 28;
										local809 += local652;
										Static254.anIntArray487[local28++] = local809;
										continue;
									}
									if (local226 == 3337) {
										Static254.anIntArray487[local28++] = Static204.anInt4760;
										continue;
									}
								} else if (local226 < 3500) {
									@Pc(3422) EnumType local3422;
									if (local226 == 3400) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										local3422 = Static253.method4330(local809);
										if (local3422.anInt3950 == 115) {
										}
										Static3.aClass100Array176[local26++] = local3422.method3085(local803);
										continue;
									}
									if (local226 == 3408) {
										local28 -= 4;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										local652 = Static254.anIntArray487[local28 + 3];
										local1052 = Static254.anIntArray487[local28 + 2];
										@Pc(3469) EnumType local3469 = Static253.method4330(local1052);
										if (local3469.anInt3957 == local809 && local3469.anInt3950 == local803) {
											if (local803 == 115) {
												Static3.aClass100Array176[local26++] = local3469.method3085(local652);
											} else {
												Static254.anIntArray487[local28++] = local3469.method3089(local652);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local226 == 3409) {
										local28 -= 3;
										local803 = Static254.anIntArray487[local28 + 1];
										local1052 = Static254.anIntArray487[local28 + 2];
										local809 = Static254.anIntArray487[local28];
										if (local803 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3549) EnumType local3549 = Static253.method4330(local803);
										if (local3549.anInt3950 != local809) {
											throw new RuntimeException("C3409-1");
										}
										Static254.anIntArray487[local28++] = local3549.method3090(local1052) ? 1 : 0;
										continue;
									}
									if (local226 == 3410) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										local26--;
										local2522 = Static3.aClass100Array176[local26];
										if (local809 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3422 = Static253.method4330(local809);
										if (local3422.anInt3950 != 115) {
											throw new RuntimeException("C3410-1");
										}
										Static254.anIntArray487[local28++] = local3422.method3086(local2522) ? 1 : 0;
										continue;
									}
									if (local226 == 3411) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										@Pc(3645) EnumType local3645 = Static253.method4330(local809);
										Static254.anIntArray487[local28++] = local3645.aClass133_16.method3864();
										continue;
									}
								} else if (local226 < 3700) {
									if (local226 == 3600) {
										if (Static166.anInt4054 == 0) {
											Static254.anIntArray487[local28++] = -2;
										} else if (Static166.anInt4054 == 1) {
											Static254.anIntArray487[local28++] = -1;
										} else {
											Static254.anIntArray487[local28++] = Static9.anInt178;
										}
										continue;
									}
									if (local226 == 3601) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static166.anInt4054 == 2 && local809 < Static9.anInt178) {
											Static3.aClass100Array176[local26++] = Static122.aClass100Array92[local809];
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 3602) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static166.anInt4054 == 2 && Static9.anInt178 > local809) {
											Static254.anIntArray487[local28++] = Static104.anIntArray255[local809];
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3603) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static166.anInt4054 == 2 && Static9.anInt178 > local809) {
											Static254.anIntArray487[local28++] = Static106.anIntArray258[local809];
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3604) {
										local28--;
										local803 = Static254.anIntArray487[local28];
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static171.method3221(local609, local803);
										continue;
									}
									if (local226 == 3605) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static64.method1496(local609.encode37());
										continue;
									}
									if (local226 == 3606) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static193.method3500(local609.encode37());
										continue;
									}
									if (local226 == 3607) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static140.method2707(local609.encode37());
										continue;
									}
									if (local226 == 3608) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static69.method1542(local609.encode37());
										continue;
									}
									if (local226 == 3609) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										if (local609.method3138(Static72.aClass100_446) || local609.method3138(Static101.aClass100_537)) {
											local609 = local609.method3136(7);
										}
										Static254.anIntArray487[local28++] = Static98.method1965(local609) ? 1 : 0;
										continue;
									}
									if (local226 == 3610) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static166.anInt4054 == 2 && Static9.anInt178 > local809) {
											Static3.aClass100Array176[local26++] = Static214.aClass100Array170[local809];
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 3611) {
										if (Static15.aClass100_87 == null) {
											Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										} else {
											Static3.aClass100Array176[local26++] = Static15.aClass100_87.method3125();
										}
										continue;
									}
									if (local226 == 3612) {
										if (Static15.aClass100_87 == null) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = Static214.anInt5577;
										}
										continue;
									}
									if (local226 == 3613) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static15.aClass100_87 != null && Static214.anInt5577 > local809) {
											Static3.aClass100Array176[local26++] = Static199.aClass3_Sub22Array1[local809].aClass100_636.method3125();
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 3614) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static15.aClass100_87 != null && local809 < Static214.anInt5577) {
											Static254.anIntArray487[local28++] = Static199.aClass3_Sub22Array1[local809].anInt3340;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3615) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static15.aClass100_87 != null && Static214.anInt5577 > local809) {
											Static254.anIntArray487[local28++] = Static199.aClass3_Sub22Array1[local809].aByte9;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3616) {
										Static254.anIntArray487[local28++] = Static50.aByte6;
										continue;
									}
									if (local226 == 3617) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static178.method3318(local609);
										continue;
									}
									if (local226 == 3618) {
										Static254.anIntArray487[local28++] = Static160.aByte14;
										continue;
									}
									if (local226 == 3619) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static156.method2956(local609.encode37());
										continue;
									}
									if (local226 == 3620) {
										Static134.method2623();
										continue;
									}
									if (local226 == 3621) {
										if (Static166.anInt4054 == 0) {
											Static254.anIntArray487[local28++] = -1;
										} else {
											Static254.anIntArray487[local28++] = Static35.anInt1093;
										}
										continue;
									}
									if (local226 == 3622) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static166.anInt4054 != 0 && Static35.anInt1093 > local809) {
											Static3.aClass100Array176[local26++] = Static79.decode37(Static190.aLongArray6[local809]).method3125();
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 3623) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										if (local609.method3138(Static72.aClass100_446) || local609.method3138(Static101.aClass100_537)) {
											local609 = local609.method3136(7);
										}
										Static254.anIntArray487[local28++] = Static238.method4144(local609) ? 1 : 0;
										continue;
									}
									if (local226 == 3624) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static199.aClass3_Sub22Array1 != null && Static214.anInt5577 > local809 && Static199.aClass3_Sub22Array1[local809].aClass100_636.method3111(Static173.self.aClass100_364)) {
											Static254.anIntArray487[local28++] = 1;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3625) {
										if (Static270.aClass100_1094 == null) {
											Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										} else {
											Static3.aClass100Array176[local26++] = Static270.aClass100_1094.method3125();
										}
										continue;
									}
									if (local226 == 3626) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static15.aClass100_87 != null && Static214.anInt5577 > local809) {
											Static3.aClass100Array176[local26++] = Static199.aClass3_Sub22Array1[local809].aClass100_635;
											continue;
										}
										Static3.aClass100Array176[local26++] = Static72.aClass100_447;
										continue;
									}
									if (local226 == 3627) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										if (Static166.anInt4054 == 2 && local809 >= 0 && local809 < Static9.anInt178) {
											Static254.anIntArray487[local28++] = Static3.aBooleanArray135[local809] ? 1 : 0;
											continue;
										}
										Static254.anIntArray487[local28++] = 0;
										continue;
									}
									if (local226 == 3628) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										if (local609.method3138(Static72.aClass100_446) || local609.method3138(Static101.aClass100_537)) {
											local609 = local609.method3136(7);
										}
										Static254.anIntArray487[local28++] = Static4.method25(local609);
										continue;
									}
									if (local226 == 3629) {
										Static254.anIntArray487[local28++] = Static279.anInt5880;
										continue;
									}
								} else if (local226 < 4000) {
									if (local226 == 3903) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static229.aClass136Array1[local809].method3905();
										continue;
									}
									if (local226 == 3904) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static229.aClass136Array1[local809].anInt5094;
										continue;
									}
									if (local226 == 3905) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static229.aClass136Array1[local809].anInt5099;
										continue;
									}
									if (local226 == 3906) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static229.aClass136Array1[local809].anInt5090;
										continue;
									}
									if (local226 == 3907) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static229.aClass136Array1[local809].anInt5089;
										continue;
									}
									if (local226 == 3908) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static229.aClass136Array1[local809].anInt5092;
										continue;
									}
									if (local226 == 3910) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										local803 = Static229.aClass136Array1[local809].method3904();
										Static254.anIntArray487[local28++] = local803 == 0 ? 1 : 0;
										continue;
									}
									if (local226 == 3911) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										local803 = Static229.aClass136Array1[local809].method3904();
										Static254.anIntArray487[local28++] = local803 == 2 ? 1 : 0;
										continue;
									}
									if (local226 == 3912) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										local803 = Static229.aClass136Array1[local809].method3904();
										Static254.anIntArray487[local28++] = local803 == 5 ? 1 : 0;
										continue;
									}
									if (local226 == 3913) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										local803 = Static229.aClass136Array1[local809].method3904();
										Static254.anIntArray487[local28++] = local803 == 1 ? 1 : 0;
										continue;
									}
								} else if (local226 < 4100) {
									if (local226 == 4000) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local803 + local809;
										continue;
									}
									if (local226 == 4001) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local809 - local803;
										continue;
									}
									if (local226 == 4002) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local803 * local809;
										continue;
									}
									if (local226 == 4003) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local809 / local803;
										continue;
									}
									if (local226 == 4004) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = (int) ((double) local809 * Math.random());
										continue;
									}
									if (local226 == 4005) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = (int) (Math.random() * (double) (local809 + 1));
										continue;
									}
									if (local226 == 4006) {
										local28 -= 5;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										local652 = Static254.anIntArray487[local28 + 3];
										local1052 = Static254.anIntArray487[local28 + 2];
										local4859 = Static254.anIntArray487[local28 + 4];
										Static254.anIntArray487[local28++] = (local803 - local809) * (local4859 + -local1052) / (local652 - local1052) + local809;
										continue;
									}
									@Pc(4899) long local4899;
									@Pc(4892) long local4892;
									if (local226 == 4007) {
										local28 -= 2;
										local4892 = Static254.anIntArray487[local28];
										local4899 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = (int) (local4892 * local4899 / 100L + local4892);
										continue;
									}
									if (local226 == 4008) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local809 | 0x1 << local803;
										continue;
									}
									if (local226 == 4009) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = -(0x1 << local803) - 1 & local809;
										continue;
									}
									if (local226 == 4010) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = (local809 & 0x1 << local803) == 0 ? 0 : 1;
										continue;
									}
									if (local226 == 4011) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local809 % local803;
										continue;
									}
									if (local226 == 4012) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										if (local809 == 0) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = (int) Math.pow((double) local809, (double) local803);
										}
										continue;
									}
									if (local226 == 4013) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										if (local809 == 0) {
											Static254.anIntArray487[local28++] = 0;
										} else if (local803 == 0) {
											Static254.anIntArray487[local28++] = Integer.MAX_VALUE;
										} else {
											Static254.anIntArray487[local28++] = (int) Math.pow((double) local809, 1.0D / (double) local803);
										}
										continue;
									}
									if (local226 == 4014) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local803 & local809;
										continue;
									}
									if (local226 == 4015) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local809 | local803;
										continue;
									}
									if (local226 == 4016) {
										local28 -= 2;
										local809 = Static254.anIntArray487[local28];
										local803 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local809 < local803 ? local809 : local803;
										continue;
									}
									if (local226 == 4017) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local803 >= local809 ? local803 : local809;
										continue;
									}
									if (local226 == 4018) {
										local28 -= 3;
										local4892 = Static254.anIntArray487[local28];
										local4899 = Static254.anIntArray487[local28 + 1];
										@Pc(5251) long local5251 = (long) Static254.anIntArray487[local28 + 2];
										Static254.anIntArray487[local28++] = (int) (local4892 * local5251 / local4899);
										continue;
									}
								} else if (local226 >= 4200) {
									@Pc(5294) Class3_Sub2_Sub12 local5294;
									if (local226 < 4300) {
										if (local226 == 4200) {
											local28--;
											local809 = Static254.anIntArray487[local28];
											Static3.aClass100Array176[local26++] = Static71.method1439(local809).aClass100_495;
											continue;
										}
										@Pc(11269) ObjType local11269;
										if (local226 == 4201) {
											local28 -= 2;
											local809 = Static254.anIntArray487[local28];
											local803 = Static254.anIntArray487[local28 + 1];
											local11269 = Static71.method1439(local809);
											if (local803 >= 1 && local803 <= 5 && local11269.aClass100Array72[local803 - 1] != null) {
												Static3.aClass100Array176[local26++] = local11269.aClass100Array72[local803 - 1];
												continue;
											}
											Static3.aClass100Array176[local26++] = Static72.aClass100_447;
											continue;
										}
										if (local226 == 4202) {
											local28 -= 2;
											local809 = Static254.anIntArray487[local28];
											local803 = Static254.anIntArray487[local28 + 1];
											local11269 = Static71.method1439(local809);
											if (local803 >= 1 && local803 <= 5 && local11269.aClass100Array71[local803 - 1] != null) {
												Static3.aClass100Array176[local26++] = local11269.aClass100Array71[local803 - 1];
												continue;
											}
											Static3.aClass100Array176[local26++] = Static72.aClass100_447;
											continue;
										}
										if (local226 == 4203) {
											local28--;
											local809 = Static254.anIntArray487[local28];
											Static254.anIntArray487[local28++] = Static71.method1439(local809).anInt2325;
											continue;
										}
										if (local226 == 4204) {
											local28--;
											local809 = Static254.anIntArray487[local28];
											Static254.anIntArray487[local28++] = Static71.method1439(local809).anInt2336 == 1 ? 1 : 0;
											continue;
										}
										@Pc(11417) ObjType local11417;
										if (local226 == 4205) {
											local28--;
											local809 = Static254.anIntArray487[local28];
											local11417 = Static71.method1439(local809);
											if (local11417.anInt2358 == -1 && local11417.anInt2356 >= 0) {
												Static254.anIntArray487[local28++] = local11417.anInt2356;
												continue;
											}
											Static254.anIntArray487[local28++] = local809;
											continue;
										}
										if (local226 == 4206) {
											local28--;
											local809 = Static254.anIntArray487[local28];
											local11417 = Static71.method1439(local809);
											if (local11417.anInt2358 >= 0 && local11417.anInt2356 >= 0) {
												Static254.anIntArray487[local28++] = local11417.anInt2356;
												continue;
											}
											Static254.anIntArray487[local28++] = local809;
											continue;
										}
										if (local226 == 4207) {
											local28--;
											local809 = Static254.anIntArray487[local28];
											Static254.anIntArray487[local28++] = Static71.method1439(local809).aBoolean131 ? 1 : 0;
											continue;
										}
										if (local226 == 4208) {
											local28 -= 2;
											local809 = Static254.anIntArray487[local28];
											local803 = Static254.anIntArray487[local28 + 1];
											local5294 = Static110.method2277(local803);
											if (local5294.method2078()) {
												Static3.aClass100Array176[local26++] = Static71.method1439(local809).method1819(local5294.aClass100_544, local803);
											} else {
												Static254.anIntArray487[local28++] = Static71.method1439(local809).method1829(local5294.anInt2667, local803);
											}
											continue;
										}
										if (local226 == 4210) {
											local26--;
											local609 = Static3.aClass100Array176[local26];
											local28--;
											local803 = Static254.anIntArray487[local28];
											Static155.method2941(local803 == 1, local609);
											Static254.anIntArray487[local28++] = Static111.anInt2905;
											continue;
										}
										if (local226 == 4211) {
											if (Static169.aShortArray52 != null && Static67.anInt3356 < Static111.anInt2905) {
												Static254.anIntArray487[local28++] = Static169.aShortArray52[Static67.anInt3356++] & 0xFFFF;
												continue;
											}
											Static254.anIntArray487[local28++] = -1;
											continue;
										}
										if (local226 == 4212) {
											Static67.anInt3356 = 0;
											continue;
										}
									} else if (local226 < 4400) {
										if (local226 == 4300) {
											local28 -= 2;
											local809 = Static254.anIntArray487[local28];
											local803 = Static254.anIntArray487[local28 + 1];
											local5294 = Static110.method2277(local803);
											if (local5294.method2078()) {
												Static3.aClass100Array176[local26++] = Static214.method4363(local809).method2938(local803, local5294.aClass100_544);
											} else {
												Static254.anIntArray487[local28++] = Static214.method4363(local809).method2936(local803, local5294.anInt2667);
											}
											continue;
										}
									} else if (local226 >= 4500) {
										if (local226 >= 4600) {
											if (local226 < 5100) {
												if (local226 == 5000) {
													Static254.anIntArray487[local28++] = Static59.anInt1812;
													continue;
												}
												if (local226 == 5001) {
													local28 -= 3;
													Static59.anInt1812 = Static254.anIntArray487[local28];
													Static49.anInt1459 = Static254.anIntArray487[local28 + 1];
													Static84.anInt2256 = Static254.anIntArray487[local28 + 2];
													Static6.outboundBuffer.p1isaac(157);
													Static6.outboundBuffer.p1(Static59.anInt1812);
													Static6.outboundBuffer.p1(Static49.anInt1459);
													Static6.outboundBuffer.p1(Static84.anInt2256);
													continue;
												}
												if (local226 == 5002) {
													local26--;
													local609 = Static3.aClass100Array176[local26];
													local28 -= 2;
													local803 = Static254.anIntArray487[local28];
													local1052 = Static254.anIntArray487[local28 + 1];
													Static6.outboundBuffer.p1isaac(99);
													Static6.outboundBuffer.p8(local609.encode37());
													Static6.outboundBuffer.p1(local803 - 1);
													Static6.outboundBuffer.p1(local1052);
													continue;
												}
												if (local226 == 5003) {
													local2522 = null;
													local28--;
													local809 = Static254.anIntArray487[local28];
													if (local809 < 100) {
														local2522 = Static230.aClass100Array158[local809];
													}
													if (local2522 == null) {
														local2522 = Static72.aClass100_447;
													}
													Static3.aClass100Array176[local26++] = local2522;
													continue;
												}
												if (local226 == 5004) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													local803 = -1;
													if (local809 < 100 && Static230.aClass100Array158[local809] != null) {
														local803 = Static26.anIntArray67[local809];
													}
													Static254.anIntArray487[local28++] = local803;
													continue;
												}
												if (local226 == 5005) {
													Static254.anIntArray487[local28++] = Static49.anInt1459;
													continue;
												}
												if (local226 == 5008) {
													local26--;
													local609 = Static3.aClass100Array176[local26];
													if (!local609.method3138(Static12.aClass100_74)) {
														if (Static191.staffModLevel == 0 && (Static124.aBoolean157 && !Static207.aBoolean236 || Static86.aBoolean129)) {
															continue;
														}
														local2522 = local609.toLowerCase();
														@Pc(5555) byte local5555 = 0;
														if (local2522.method3138(LocalizedText.STABLE_CHATCOL0)) {
															local5555 = 0;
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL0.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL1)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL1.length());
															local5555 = 1;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL2)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL2.length());
															local5555 = 2;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL3)) {
															local5555 = 3;
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL3.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL4)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL4.length());
															local5555 = 4;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL5)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL5.length());
															local5555 = 5;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL6)) {
															local5555 = 6;
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL6.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL7)) {
															local5555 = 7;
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL7.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL8)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL8.length());
															local5555 = 8;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL9)) {
															local5555 = 9;
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL9.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL10)) {
															local5555 = 10;
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL10.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATCOL11)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATCOL11.length());
															local5555 = 11;
														} else if (Static141.anInt3470 != 0) {
															if (local2522.method3138(LocalizedText.CHATCOL0)) {
																local5555 = 0;
																local609 = local609.method3136(LocalizedText.CHATCOL0.length());
															} else if (local2522.method3138(LocalizedText.CHATCOL1)) {
																local609 = local609.method3136(LocalizedText.CHATCOL1.length());
																local5555 = 1;
															} else if (local2522.method3138(LocalizedText.CHATCOL2)) {
																local609 = local609.method3136(LocalizedText.CHATCOL2.length());
																local5555 = 2;
															} else if (local2522.method3138(LocalizedText.CHATCOL3)) {
																local609 = local609.method3136(LocalizedText.CHATCOL3.length());
																local5555 = 3;
															} else if (local2522.method3138(LocalizedText.CHATCOL4)) {
																local609 = local609.method3136(LocalizedText.CHATCOL4.length());
																local5555 = 4;
															} else if (local2522.method3138(LocalizedText.CHATCOL5)) {
																local5555 = 5;
																local609 = local609.method3136(LocalizedText.CHATCOL5.length());
															} else if (local2522.method3138(LocalizedText.CHATCOL6)) {
																local609 = local609.method3136(LocalizedText.CHATCOL6.length());
																local5555 = 6;
															} else if (local2522.method3138(LocalizedText.CHATCOL7)) {
																local5555 = 7;
																local609 = local609.method3136(LocalizedText.CHATCOL7.length());
															} else if (local2522.method3138(LocalizedText.CHATCOL8)) {
																local5555 = 8;
																local609 = local609.method3136(LocalizedText.CHATCOL8.length());
															} else if (local2522.method3138(LocalizedText.CHATCOL9)) {
																local5555 = 9;
																local609 = local609.method3136(LocalizedText.CHATCOL9.length());
															} else if (local2522.method3138(LocalizedText.CHATCOL10)) {
																local609 = local609.method3136(LocalizedText.CHATCOL10.length());
																local5555 = 10;
															} else if (local2522.method3138(LocalizedText.CHATCOL11)) {
																local609 = local609.method3136(LocalizedText.CHATCOL11.length());
																local5555 = 11;
															}
														}
														@Pc(5943) byte local5943 = 0;
														local2522 = local609.toLowerCase();
														if (local2522.method3138(LocalizedText.STABLE_CHATEFFECT1)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATEFFECT1.length());
															local5943 = 1;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATEFFECT2)) {
															local5943 = 2;
															local609 = local609.method3136(LocalizedText.STABLE_CHATEFFECT2.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATEFFECT3)) {
															local609 = local609.method3136(LocalizedText.STABLE_CHATEFFECT3.length());
															local5943 = 3;
														} else if (local2522.method3138(LocalizedText.STABLE_CHATEFFECT4)) {
															local5943 = 4;
															local609 = local609.method3136(LocalizedText.STABLE_CHATEFFECT4.length());
														} else if (local2522.method3138(LocalizedText.STABLE_CHATEFFECTC5)) {
															local5943 = 5;
															local609 = local609.method3136(LocalizedText.STABLE_CHATEFFECTC5.length());
														} else if (Static141.anInt3470 != 0) {
															if (local2522.method3138(LocalizedText.CHATEFFECT1)) {
																local609 = local609.method3136(LocalizedText.CHATEFFECT1.length());
																local5943 = 1;
															} else if (local2522.method3138(LocalizedText.CHATEFFECT2)) {
																local5943 = 2;
																local609 = local609.method3136(LocalizedText.CHATEFFECT2.length());
															} else if (local2522.method3138(LocalizedText.CHATEFFECT3)) {
																local5943 = 3;
																local609 = local609.method3136(LocalizedText.CHATEFFECT3.length());
															} else if (local2522.method3138(LocalizedText.CHATEFFECT4)) {
																local5943 = 4;
																local609 = local609.method3136(LocalizedText.CHATEFFECT4.length());
															} else if (local2522.method3138(LocalizedText.CHATEFFECT5)) {
																local609 = local609.method3136(LocalizedText.CHATEFFECT5.length());
																local5943 = 5;
															}
														}
														Static6.outboundBuffer.p1isaac(237);
														Static6.outboundBuffer.p1(0);
														local4859 = Static6.outboundBuffer.offset;
														Static6.outboundBuffer.p1(local5555);
														Static6.outboundBuffer.p1(local5943);
														Static146.method2748(Static6.outboundBuffer, local609);
														Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local4859);
														continue;
													}
													Static127.method2470(local609);
													continue;
												}
												if (local226 == 5009) {
													local26 -= 2;
													local2522 = Static3.aClass100Array176[local26 + 1];
													local609 = Static3.aClass100Array176[local26];
													if (Static191.staffModLevel != 0 || (!Static124.aBoolean157 || Static207.aBoolean236) && !Static86.aBoolean129) {
														Static6.outboundBuffer.p1isaac(201);
														Static6.outboundBuffer.p1(0);
														local1052 = Static6.outboundBuffer.offset;
														Static6.outboundBuffer.p8(local609.encode37());
														Static146.method2748(Static6.outboundBuffer, local2522);
														Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local1052);
													}
													continue;
												}
												if (local226 == 5010) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													local2522 = null;
													if (local809 < 100) {
														local2522 = Static153.aClass100Array112[local809];
													}
													if (local2522 == null) {
														local2522 = Static72.aClass100_447;
													}
													Static3.aClass100Array176[local26++] = local2522;
													continue;
												}
												if (local226 == 5011) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													local2522 = null;
													if (local809 < 100) {
														local2522 = Static64.aClass100Array62[local809];
													}
													if (local2522 == null) {
														local2522 = Static72.aClass100_447;
													}
													Static3.aClass100Array176[local26++] = local2522;
													continue;
												}
												if (local226 == 5012) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													local803 = -1;
													if (local809 < 100) {
														local803 = Static241.anIntArray521[local809];
													}
													Static254.anIntArray487[local28++] = local803;
													continue;
												}
												if (local226 == 5015) {
													if (Static173.self == null || Static173.self.aClass100_364 == null) {
														local609 = Static186.username;
													} else {
														local609 = Static173.self.method1264();
													}
													Static3.aClass100Array176[local26++] = local609;
													continue;
												}
												if (local226 == 5016) {
													Static254.anIntArray487[local28++] = Static84.anInt2256;
													continue;
												}
												if (local226 == 5017) {
													Static254.anIntArray487[local28++] = Static62.anInt1941;
													continue;
												}
												if (local226 == 5050) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													Static3.aClass100Array176[local26++] = Static235.method4045(local809).aClass100_79;
													continue;
												}
												@Pc(6378) Class3_Sub2_Sub2 local6378;
												if (local226 == 5051) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													local6378 = Static235.method4045(local809);
													if (local6378.anIntArray30 == null) {
														Static254.anIntArray487[local28++] = 0;
													} else {
														Static254.anIntArray487[local28++] = local6378.anIntArray30.length;
													}
													continue;
												}
												if (local226 == 5052) {
													local28 -= 2;
													local809 = Static254.anIntArray487[local28];
													local803 = Static254.anIntArray487[local28 + 1];
													@Pc(6416) Class3_Sub2_Sub2 local6416 = Static235.method4045(local809);
													local652 = local6416.anIntArray30[local803];
													Static254.anIntArray487[local28++] = local652;
													continue;
												}
												if (local226 == 5053) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													local6378 = Static235.method4045(local809);
													if (local6378.anIntArray32 == null) {
														Static254.anIntArray487[local28++] = 0;
													} else {
														Static254.anIntArray487[local28++] = local6378.anIntArray32.length;
													}
													continue;
												}
												if (local226 == 5054) {
													local28 -= 2;
													local803 = Static254.anIntArray487[local28 + 1];
													local809 = Static254.anIntArray487[local28];
													Static254.anIntArray487[local28++] = Static235.method4045(local809).anIntArray32[local803];
													continue;
												}
												if (local226 == 5055) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													Static3.aClass100Array176[local26++] = Static230.method3953(local809).method769();
													continue;
												}
												if (local226 == 5056) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													@Pc(6527) Class3_Sub2_Sub6 local6527 = Static230.method3953(local809);
													if (local6527.anIntArray72 == null) {
														Static254.anIntArray487[local28++] = 0;
													} else {
														Static254.anIntArray487[local28++] = local6527.anIntArray72.length;
													}
													continue;
												}
												if (local226 == 5057) {
													local28 -= 2;
													local803 = Static254.anIntArray487[local28 + 1];
													local809 = Static254.anIntArray487[local28];
													Static254.anIntArray487[local28++] = Static230.method3953(local809).anIntArray72[local803];
													continue;
												}
												if (local226 == 5058) {
													Static122.aClass12_1 = new Class12();
													local28--;
													Static122.aClass12_1.anInt439 = Static254.anIntArray487[local28];
													Static122.aClass12_1.aClass3_Sub2_Sub6_1 = Static230.method3953(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.anIntArray33 = new int[Static122.aClass12_1.aClass3_Sub2_Sub6_1.method767()];
													continue;
												}
												if (local226 == 5059) {
													Static6.outboundBuffer.p1isaac(167);
													Static6.outboundBuffer.p1(0);
													local809 = Static6.outboundBuffer.offset;
													Static6.outboundBuffer.p1(0);
													Static6.outboundBuffer.p2(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.aClass3_Sub2_Sub6_1.method760(Static6.outboundBuffer, Static122.aClass12_1.anIntArray33);
													Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local809);
													continue;
												}
												if (local226 == 5060) {
													local26--;
													local609 = Static3.aClass100Array176[local26];
													Static6.outboundBuffer.p1isaac(178);
													Static6.outboundBuffer.p1(0);
													local803 = Static6.outboundBuffer.offset;
													Static6.outboundBuffer.p8(local609.encode37());
													Static6.outboundBuffer.p2(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.aClass3_Sub2_Sub6_1.method760(Static6.outboundBuffer, Static122.aClass12_1.anIntArray33);
													Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local803);
													continue;
												}
												if (local226 == 5061) {
													Static6.outboundBuffer.p1isaac(167);
													Static6.outboundBuffer.p1(0);
													local809 = Static6.outboundBuffer.offset;
													Static6.outboundBuffer.p1(1);
													Static6.outboundBuffer.p2(Static122.aClass12_1.anInt439);
													Static122.aClass12_1.aClass3_Sub2_Sub6_1.method760(Static6.outboundBuffer, Static122.aClass12_1.anIntArray33);
													Static6.outboundBuffer.p1len(Static6.outboundBuffer.offset - local809);
													continue;
												}
												if (local226 == 5062) {
													local28 -= 2;
													local803 = Static254.anIntArray487[local28 + 1];
													local809 = Static254.anIntArray487[local28];
													Static254.anIntArray487[local28++] = Static235.method4045(local809).anIntArray31[local803];
													continue;
												}
												if (local226 == 5063) {
													local28 -= 2;
													local803 = Static254.anIntArray487[local28 + 1];
													local809 = Static254.anIntArray487[local28];
													Static254.anIntArray487[local28++] = Static235.method4045(local809).anIntArray29[local803];
													continue;
												}
												if (local226 == 5064) {
													local28 -= 2;
													local803 = Static254.anIntArray487[local28 + 1];
													local809 = Static254.anIntArray487[local28];
													if (local803 == -1) {
														Static254.anIntArray487[local28++] = -1;
													} else {
														Static254.anIntArray487[local28++] = Static235.method4045(local809).method469(local803);
													}
													continue;
												}
												if (local226 == 5065) {
													local28 -= 2;
													local809 = Static254.anIntArray487[local28];
													local803 = Static254.anIntArray487[local28 + 1];
													if (local803 == -1) {
														Static254.anIntArray487[local28++] = -1;
													} else {
														Static254.anIntArray487[local28++] = Static235.method4045(local809).method466(local803);
													}
													continue;
												}
												if (local226 == 5066) {
													local28--;
													local809 = Static254.anIntArray487[local28];
													Static254.anIntArray487[local28++] = Static230.method3953(local809).method767();
													continue;
												}
												if (local226 == 5067) {
													local28 -= 2;
													local803 = Static254.anIntArray487[local28 + 1];
													local809 = Static254.anIntArray487[local28];
													local1052 = Static230.method3953(local809).method765(local803);
													Static254.anIntArray487[local28++] = local1052;
													continue;
												}
												if (local226 == 5068) {
													local28 -= 2;
													local809 = Static254.anIntArray487[local28];
													local803 = Static254.anIntArray487[local28 + 1];
													Static122.aClass12_1.anIntArray33[local809] = local803;
													continue;
												}
												if (local226 == 5069) {
													local28 -= 2;
													local809 = Static254.anIntArray487[local28];
													local803 = Static254.anIntArray487[local28 + 1];
													Static122.aClass12_1.anIntArray33[local809] = local803;
													continue;
												}
												if (local226 == 5070) {
													local28 -= 3;
													local809 = Static254.anIntArray487[local28];
													local1052 = Static254.anIntArray487[local28 + 2];
													local803 = Static254.anIntArray487[local28 + 1];
													@Pc(6996) Class3_Sub2_Sub6 local6996 = Static230.method3953(local809);
													if (local6996.method765(local803) != 0) {
														throw new RuntimeException("bad command");
													}
													Static254.anIntArray487[local28++] = local6996.method764(local1052, local803);
													continue;
												}
												if (local226 == 5071) {
													local26--;
													local609 = Static3.aClass100Array176[local26];
													local28--;
													local1552 = Static254.anIntArray487[local28] == 1;
													Static24.method668(local1552, local609);
													Static254.anIntArray487[local28++] = Static111.anInt2905;
													continue;
												}
												if (local226 == 5072) {
													if (Static169.aShortArray52 != null && Static67.anInt3356 < Static111.anInt2905) {
														Static254.anIntArray487[local28++] = Static169.aShortArray52[Static67.anInt3356++] & 0xFFFF;
														continue;
													}
													Static254.anIntArray487[local28++] = -1;
													continue;
												}
												if (local226 == 5073) {
													Static67.anInt3356 = 0;
													continue;
												}
											} else if (local226 < 5200) {
												if (local226 == 5100) {
													if (Static187.pressedKeys[86]) {
														Static254.anIntArray487[local28++] = 1;
													} else {
														Static254.anIntArray487[local28++] = 0;
													}
													continue;
												}
												if (local226 == 5101) {
													if (Static187.pressedKeys[82]) {
														Static254.anIntArray487[local28++] = 1;
													} else {
														Static254.anIntArray487[local28++] = 0;
													}
													continue;
												}
												if (local226 == 5102) {
													if (Static187.pressedKeys[81]) {
														Static254.anIntArray487[local28++] = 1;
													} else {
														Static254.anIntArray487[local28++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7566) boolean local7566;
												if (local226 < 5300) {
													if (local226 == 5200) {
														local28--;
														Static155.method2940(Static254.anIntArray487[local28]);
														continue;
													}
													if (local226 == 5201) {
														Static254.anIntArray487[local28++] = Static91.method1874();
														continue;
													}
													if (local226 == 5202) {
														local28--;
														Static258.method4444(Static254.anIntArray487[local28]);
														continue;
													}
													if (local226 == 5203) {
														local26--;
														Static3.method4656(Static3.aClass100Array176[local26]);
														continue;
													}
													if (local226 == 5204) {
														Static3.aClass100Array176[local26 - 1] = Static211.method923(Static3.aClass100Array176[local26 - 1]);
														continue;
													}
													if (local226 == 5205) {
														local26--;
														Static90.method1853(Static3.aClass100Array176[local26]);
														continue;
													}
													if (local226 == 5206) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														@Pc(7264) Map local7264 = Static29.method803(local809 >> 14 & 0x3FFF, local809 & 0x3FFF);
														if (local7264 == null) {
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
														} else {
															Static3.aClass100Array176[local26++] = local7264.aClass100_138;
														}
														continue;
													}
													@Pc(7293) Map local7293;
													if (local226 == 5207) {
														local26--;
														local7293 = Static124.method2434(Static3.aClass100Array176[local26]);
														if (local7293 != null && local7293.aClass100_137 != null) {
															Static3.aClass100Array176[local26++] = local7293.aClass100_137;
															continue;
														}
														Static3.aClass100Array176[local26++] = Static72.aClass100_447;
														continue;
													}
													if (local226 == 5208) {
														Static254.anIntArray487[local28++] = Static89.anInt2387;
														Static254.anIntArray487[local28++] = Static37.anInt1176;
														continue;
													}
													if (local226 == 5209) {
														Static254.anIntArray487[local28++] = Static158.anInt3846 + Static13.anInt435;
														Static254.anIntArray487[local28++] = Static2.anInt13 + Static181.anInt4296 - Static28.anInt919 - 1;
														continue;
													}
													if (local226 == 5210) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															Static254.anIntArray487[local28++] = 0;
															Static254.anIntArray487[local28++] = 0;
														} else {
															Static254.anIntArray487[local28++] = local7293.anInt769 * 64;
															Static254.anIntArray487[local28++] = local7293.anInt764 * 64;
														}
														continue;
													}
													if (local226 == 5211) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															Static254.anIntArray487[local28++] = 0;
															Static254.anIntArray487[local28++] = 0;
														} else {
															Static254.anIntArray487[local28++] = local7293.anInt770 - local7293.anInt763;
															Static254.anIntArray487[local28++] = local7293.anInt758 - local7293.anInt771;
														}
														continue;
													}
													if (local226 == 5212) {
														local809 = Static118.method2352();
														local1052 = 0;
														if (local809 == -1) {
															local2522 = Static72.aClass100_447;
														} else {
															local2522 = Static203.aClass134_1.aClass100Array153[local809];
															local1052 = Static203.aClass134_1.method3894(local809);
														}
														local2522 = local2522.method3140(Static67.aClass100_639, Static5.aClass100_10);
														Static3.aClass100Array176[local26++] = local2522;
														Static254.anIntArray487[local28++] = local1052;
														continue;
													}
													if (local226 == 5213) {
														local1052 = 0;
														local809 = Static119.method2385();
														if (local809 == -1) {
															local2522 = Static72.aClass100_447;
														} else {
															local2522 = Static203.aClass134_1.aClass100Array153[local809];
															local1052 = Static203.aClass134_1.method3894(local809);
														}
														local2522 = local2522.method3140(Static67.aClass100_639, Static5.aClass100_10);
														Static3.aClass100Array176[local26++] = local2522;
														Static254.anIntArray487[local28++] = local1052;
														continue;
													}
													if (local226 == 5214) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														Static80.method3616(local809 >> 14 & 0x3FFF, local809 & 0x3FFF);
														continue;
													}
													if (local226 == 5215) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														local26--;
														local2522 = Static3.aClass100Array176[local26];
														local7566 = false;
														@Pc(7577) SecondaryLinkedList local7577 = Static183.method3333(local809 >> 14 & 0x3FFF, local809 & 0x3FFF);
														for (@Pc(7582) Map local7582 = (Map) local7577.method795(); local7582 != null; local7582 = (Map) local7577.method797()) {
															if (local7582.aClass100_138.method3111(local2522)) {
																local7566 = true;
																break;
															}
														}
														if (local7566) {
															Static254.anIntArray487[local28++] = 1;
														} else {
															Static254.anIntArray487[local28++] = 0;
														}
														continue;
													}
													if (local226 == 5216) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														Static253.method4332(local809);
														continue;
													}
													if (local226 == 5217) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (Static90.method1855(local809)) {
															Static254.anIntArray487[local28++] = 1;
														} else {
															Static254.anIntArray487[local28++] = 0;
														}
														continue;
													}
													if (local226 == 5218) {
														local7293 = Static214.method4361();
														if (local7293 == null) {
															Static254.anIntArray487[local28++] = -1;
														} else {
															Static254.anIntArray487[local28++] = local7293.anInt772;
														}
														continue;
													}
													if (local226 == 5219) {
														local26--;
														Static44.method1149(Static3.aClass100Array176[local26]);
														continue;
													}
													if (local226 == 5220) {
														Static254.anIntArray487[local28++] = Static41.anInt1309 == 100 ? 1 : 0;
														continue;
													}
												} else if (local226 < 5400) {
													if (local226 == 5300) {
														local28 -= 2;
														local803 = Static254.anIntArray487[local28 + 1];
														local809 = Static254.anIntArray487[local28];
														Static241.method4540(false, 3, local809, local803);
														Static254.anIntArray487[local28++] = Static69.aFrame2 == null ? 0 : 1;
														continue;
													}
													if (local226 == 5301) {
														if (Static69.aFrame2 != null) {
															Static241.method4540(false, Static214.anInt5581, -1, -1);
														}
														continue;
													}
													if (local226 == 5302) {
														@Pc(7780) Class114[] local7780 = Static3.method4660();
														Static254.anIntArray487[local28++] = local7780.length;
														continue;
													}
													if (local226 == 5303) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														@Pc(7800) Class114[] local7800 = Static3.method4660();
														Static254.anIntArray487[local28++] = local7800[local809].anInt4248;
														Static254.anIntArray487[local28++] = local7800[local809].anInt4250;
														continue;
													}
													if (local226 == 5305) {
														local803 = Static22.anInt729;
														local809 = Static114.anInt5831;
														local1052 = -1;
														@Pc(7833) Class114[] local7833 = Static3.method4660();
														for (local4859 = 0; local4859 < local7833.length; local4859++) {
															@Pc(7843) Class114 local7843 = local7833[local4859];
															if (local809 == local7843.anInt4248 && local7843.anInt4250 == local803) {
																local1052 = local4859;
																break;
															}
														}
														Static254.anIntArray487[local28++] = local1052;
														continue;
													}
													if (local226 == 5306) {
														Static254.anIntArray487[local28++] = Static144.method2736();
														continue;
													}
													if (local226 == 5307) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0 || local809 > 2) {
															local809 = 0;
														}
														Static241.method4540(false, local809, -1, -1);
														continue;
													}
													if (local226 == 5308) {
														Static254.anIntArray487[local28++] = Static214.anInt5581;
														continue;
													}
													if (local226 == 5309) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0 || local809 > 2) {
															local809 = 0;
														}
														Static214.anInt5581 = local809;
														Static203.method3663(Static71.signLink);
														continue;
													}
												} else if (local226 < 5500) {
													if (local226 == 5400) {
														local26 -= 2;
														local609 = Static3.aClass100Array176[local26];
														local2522 = Static3.aClass100Array176[local26 + 1];
														local28--;
														local1052 = Static254.anIntArray487[local28];
														Static6.outboundBuffer.p1isaac(117);
														Static6.outboundBuffer.p1(Static229.method3937(local609) + Static229.method3937(local2522) + 1);
														Static6.outboundBuffer.pjstr(local609);
														Static6.outboundBuffer.pjstr(local2522);
														Static6.outboundBuffer.p1(local1052);
														continue;
													}
													if (local226 == 5401) {
														local28 -= 2;
														Static259.aShortArray88[Static254.anIntArray487[local28]] = (short) Static105.method2253(Static254.anIntArray487[local28 + 1]);
														Static211.method924();
														Static269.method2172();
														Static278.method4649();
														Static11.method443();
														Static87.method1807();
														continue;
													}
													if (local226 == 5405) {
														local28 -= 2;
														local809 = Static254.anIntArray487[local28];
														local803 = Static254.anIntArray487[local28 + 1];
														if (local809 >= 0 && local809 < 2) {
															Static107.anIntArrayArrayArray9[local809] = new int[local803 << 1][4];
														}
														continue;
													}
													if (local226 == 5406) {
														local28 -= 7;
														local809 = Static254.anIntArray487[local28];
														local803 = Static254.anIntArray487[local28 + 1] << 1;
														local652 = Static254.anIntArray487[local28 + 3];
														local1052 = Static254.anIntArray487[local28 + 2];
														local4859 = Static254.anIntArray487[local28 + 4];
														@Pc(8108) int local8108 = Static254.anIntArray487[local28 + 6];
														local1087 = Static254.anIntArray487[local28 + 5];
														if (local809 >= 0 && local809 < 2 && Static107.anIntArrayArrayArray9[local809] != null && local803 >= 0 && Static107.anIntArrayArrayArray9[local809].length > local803) {
															Static107.anIntArrayArrayArray9[local809][local803] = new int[] { (local1052 >> 14 & 0x3FFF) * 128, local652, (local1052 & 0x3FFF) * 128, local8108 };
															Static107.anIntArrayArrayArray9[local809][local803 + 1] = new int[] { (local4859 >> 14 & 0x3FFF) * 128, local1087, (local4859 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local226 == 5407) {
														local28--;
														local809 = Static107.anIntArrayArrayArray9[Static254.anIntArray487[local28]].length >> 1;
														Static254.anIntArray487[local28++] = local809;
														continue;
													}
													if (local226 == 5411) {
														if (Static69.aFrame2 != null) {
															Static241.method4540(false, Static214.anInt5581, -1, -1);
														}
														if (Static39.aFrame1 == null) {
															Static169.openUrl(Static15.method479(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (local226 == 5419) {
														local609 = Static72.aClass100_447;
														if (Static232.aClass212_5 != null) {
															local609 = Static181.method3341(Static232.aClass212_5.anInt5926);
															try {
																if (Static232.aClass212_5.result != null) {
																	@Pc(8281) byte[] local8281 = ((String) Static232.aClass212_5.result).getBytes("ISO-8859-1");
																	local609 = Static10.decodeString(local8281, local8281.length, 0);
																}
															} catch (@Pc(8290) UnsupportedEncodingException local8290) {
															}
														}
														Static3.aClass100Array176[local26++] = local609;
														continue;
													}
													if (local226 == 5420) {
														Static254.anIntArray487[local28++] = SignLink.anInt5928 == 3 ? 1 : 0;
														continue;
													}
													if (local226 == 5421) {
														if (Static69.aFrame2 != null) {
															Static241.method4540(false, Static214.anInt5581, -1, -1);
														}
														local28--;
														local1552 = Static254.anIntArray487[local28] == 1;
														local26--;
														local609 = Static3.aClass100Array176[local26];
														@Pc(8356) JagString local8356 = Static34.method882(new JagString[] { Static15.method479(), local609 });
														if (Static39.aFrame1 != null || local1552 && SignLink.anInt5928 != 3 && SignLink.aString15.startsWith("win") && !Static178.aBoolean203) {
															Static164.newTab = local1552;
															Static175.url = local8356;
															Static33.openUrlRequest = Static71.signLink.method5131(new String(local8356.method3148(), "ISO-8859-1"));
															continue;
														}
														Static169.openUrl(local8356, local1552);
														continue;
													}
													if (local226 == 5422) {
														local28--;
														local1052 = Static254.anIntArray487[local28];
														local26 -= 2;
														local2522 = Static3.aClass100Array176[local26 + 1];
														local609 = Static3.aClass100Array176[local26];
														if (local609.length() > 0) {
															if (Static103.aClass100Array88 == null) {
																Static103.aClass100Array88 = new JagString[Static132.anIntArray309[Static266.game]];
															}
															Static103.aClass100Array88[local1052] = local609;
														}
														if (local2522.length() > 0) {
															if (Static263.aClass100Array174 == null) {
																Static263.aClass100Array174 = new JagString[Static132.anIntArray309[Static266.game]];
															}
															Static263.aClass100Array174[local1052] = local2522;
														}
														continue;
													}
													if (local226 == 5423) {
														local26--;
														Static3.aClass100Array176[local26].method3129();
														continue;
													}
													if (local226 == 5424) {
														local28 -= 11;
														Static40.anInt1275 = Static254.anIntArray487[local28];
														Static111.anInt2910 = Static254.anIntArray487[local28 + 1];
														Static251.anInt5457 = Static254.anIntArray487[local28 + 2];
														Static232.anInt5208 = Static254.anIntArray487[local28 + 3];
														Static55.anInt1736 = Static254.anIntArray487[local28 + 4];
														Static169.anInt4073 = Static254.anIntArray487[local28 + 5];
														Static85.anInt2261 = Static254.anIntArray487[local28 + 6];
														Static136.anInt3324 = Static254.anIntArray487[local28 + 7];
														Static254.anInt5556 = Static254.anIntArray487[local28 + 8];
														Static195.anInt4581 = Static254.anIntArray487[local28 + 9];
														Static262.anInt5752 = Static254.anIntArray487[local28 + 10];
														Static209.aClass153_86.method4506(Static55.anInt1736);
														Static209.aClass153_86.method4506(Static169.anInt4073);
														Static209.aClass153_86.method4506(Static85.anInt2261);
														Static209.aClass153_86.method4506(Static136.anInt3324);
														Static209.aClass153_86.method4506(Static254.anInt5556);
														Static261.aBoolean298 = true;
														continue;
													}
													if (local226 == 5425) {
														Static114.method4637();
														Static261.aBoolean298 = false;
														continue;
													}
													if (local226 == 5426) {
														local28--;
														Static270.anInt5794 = Static254.anIntArray487[local28];
														continue;
													}
													if (local226 == 5427) {
														local28 -= 2;
														Static169.anInt4075 = Static254.anIntArray487[local28];
														Static225.anInt5073 = Static254.anIntArray487[local28 + 1];
														continue;
													}
												} else if (local226 < 5600) {
													if (local226 == 5500) {
														local28 -= 4;
														local809 = Static254.anIntArray487[local28];
														local652 = Static254.anIntArray487[local28 + 3];
														local1052 = Static254.anIntArray487[local28 + 2];
														local803 = Static254.anIntArray487[local28 + 1];
														Static141.method2722(false, local1052, local803, local652, (local809 & 0x3FFF) - Static142.originZ, (local809 >> 14 & 0x3FFF) - Static225.originX);
														continue;
													}
													if (local226 == 5501) {
														local28 -= 4;
														local803 = Static254.anIntArray487[local28 + 1];
														local809 = Static254.anIntArray487[local28];
														local652 = Static254.anIntArray487[local28 + 3];
														local1052 = Static254.anIntArray487[local28 + 2];
														Static260.method3849(local803, (local809 & 0x3FFF) - Static142.originZ, local1052, (local809 >> 14 & 0x3FFF) - Static225.originX, local652);
														continue;
													}
													if (local226 == 5502) {
														local28 -= 6;
														local809 = Static254.anIntArray487[local28];
														if (local809 >= 2) {
															throw new RuntimeException();
														}
														Static155.anInt3718 = local809;
														local803 = Static254.anIntArray487[local28 + 1];
														if (Static107.anIntArrayArrayArray9[Static155.anInt3718].length >> 1 <= local803 + 1) {
															throw new RuntimeException();
														}
														Static127.anInt3125 = local803;
														Static233.anInt5224 = 0;
														Static228.anInt5101 = Static254.anIntArray487[local28 + 2];
														Static114.anInt5843 = Static254.anIntArray487[local28 + 3];
														local1052 = Static254.anIntArray487[local28 + 4];
														if (local1052 >= 2) {
															throw new RuntimeException();
														}
														Static52.anInt1694 = local1052;
														local652 = Static254.anIntArray487[local28 + 5];
														if (Static107.anIntArrayArrayArray9[Static52.anInt1694].length >> 1 <= local652 + 1) {
															throw new RuntimeException();
														}
														Static75.anInt2119 = local652;
														Static227.anInt5096 = 3;
														continue;
													}
													if (local226 == 5503) {
														Static35.method902();
														continue;
													}
													if (local226 == 5504) {
														local28 -= 2;
														Static72.anInt2031 = Static254.anIntArray487[local28];
														Static57.anInt1747 = Static254.anIntArray487[local28 + 1];
														if (Static227.anInt5096 == 2) {
															Static184.anInt4358 = Static57.anInt1747;
															Static240.anInt5333 = Static72.anInt2031;
														}
														Static87.method1812();
														continue;
													}
													if (local226 == 5505) {
														Static254.anIntArray487[local28++] = Static72.anInt2031;
														continue;
													}
													if (local226 == 5506) {
														Static254.anIntArray487[local28++] = Static57.anInt1747;
														continue;
													}
												} else if (local226 < 5700) {
													if (local226 == 5600) {
														local26 -= 2;
														local609 = Static3.aClass100Array176[local26];
														local2522 = Static3.aClass100Array176[local26 + 1];
														local28--;
														local1052 = Static254.anIntArray487[local28];
														if (Static244.anInt5370 == 10 && Static219.anInt4937 == 0 && Static184.anInt4348 == 0 && Static179.anInt4261 == 0 && Static82.anInt2231 == 0) {
															Static225.method3896(local609, local2522, local1052);
														}
														continue;
													}
													if (local226 == 5601) {
														Static185.method3395();
														continue;
													}
													if (local226 == 5602) {
														if (Static184.anInt4348 == 0) {
															Static266.anInt5336 = -2;
														}
														continue;
													}
													if (local226 == 5603) {
														local28 -= 4;
														if (Static244.anInt5370 == 10 && Static219.anInt4937 == 0 && Static184.anInt4348 == 0 && Static179.anInt4261 == 0 && Static82.anInt2231 == 0) {
															Static125.method2448(Static254.anIntArray487[local28 + 2], Static254.anIntArray487[local28 + 3], Static254.anIntArray487[local28], Static254.anIntArray487[local28 + 1]);
														}
														continue;
													}
													if (local226 == 5604) {
														local26--;
														if (Static244.anInt5370 == 10 && Static219.anInt4937 == 0 && Static184.anInt4348 == 0 && Static179.anInt4261 == 0 && Static82.anInt2231 == 0) {
															Static78.method1691(Static3.aClass100Array176[local26].encode37());
														}
														continue;
													}
													if (local226 == 5605) {
														local28 -= 4;
														local26 -= 2;
														if (Static244.anInt5370 == 10 && Static219.anInt4937 == 0 && Static184.anInt4348 == 0 && Static179.anInt4261 == 0 && Static82.anInt2231 == 0) {
															Static40.method1016(Static254.anIntArray487[local28], Static254.anIntArray487[local28 + 3], Static254.anIntArray487[local28 + 1], Static3.aClass100Array176[local26 + 1], Static3.aClass100Array176[local26].encode37(), Static254.anIntArray487[local28 + 2]);
														}
														continue;
													}
													if (local226 == 5606) {
														if (Static179.anInt4261 == 0) {
															Static223.anInt5034 = -2;
														}
														continue;
													}
													if (local226 == 5607) {
														Static254.anIntArray487[local28++] = Static266.anInt5336;
														continue;
													}
													if (local226 == 5608) {
														Static254.anIntArray487[local28++] = Static231.anInt5202;
														continue;
													}
													if (local226 == 5609) {
														Static254.anIntArray487[local28++] = Static223.anInt5034;
														continue;
													}
													if (local226 == 5610) {
														for (local809 = 0; local809 < 5; local809++) {
															Static3.aClass100Array176[local26++] = Static229.aClass100Array156.length > local809 ? Static229.aClass100Array156[local809].method3125() : Static72.aClass100_447;
														}
														Static229.aClass100Array156 = null;
														continue;
													}
													if (local226 == 5611) {
														Static254.anIntArray487[local28++] = Static204.anInt4765;
														continue;
													}
												} else if (local226 < 6100) {
													if (local226 == 6001) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 1) {
															local809 = 1;
														}
														if (local809 > 4) {
															local809 = 4;
														}
														Static113.anInt4609 = local809;
														if (!GlRenderer.enabled || !Static178.highDetailLighting) {
															if (Static113.anInt4609 == 1) {
																Rasteriser.method1911(0.9F);
															}
															if (Static113.anInt4609 == 2) {
																Rasteriser.method1911(0.8F);
															}
															if (Static113.anInt4609 == 3) {
																Rasteriser.method1911(0.7F);
															}
															if (Static113.anInt4609 == 4) {
																Rasteriser.method1911(0.6F);
															}
														}
														if (GlRenderer.enabled) {
															Static86.method1799();
															if (!Static178.highDetailLighting) {
																Static145.method2742();
															}
														}
														Static269.method2172();
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6002) {
														local28--;
														Static53.method1293(Static254.anIntArray487[local28] == 1);
														Static90.method1854();
														Static145.method2742();
														Static269.method2218();
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6003) {
														local28--;
														Static80.aBoolean231 = Static254.anIntArray487[local28] == 1;
														Static269.method2218();
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6005) {
														local28--;
														Static250.aBoolean283 = Static254.anIntArray487[local28] == 1;
														Static145.method2742();
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6006) {
														local28--;
														Static53.aBoolean99 = Static254.anIntArray487[local28] == 1;
														((Js5GlTextureProvider) Rasteriser.anInterface1_2).method3245(!Static53.aBoolean99);
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6007) {
														local28--;
														Static15.aBoolean33 = Static254.anIntArray487[local28] == 1;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6008) {
														local28--;
														Static11.aBoolean15 = Static254.anIntArray487[local28] == 1;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6009) {
														local28--;
														Static159.aBoolean189 = Static254.anIntArray487[local28] == 1;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6010) {
														local28--;
														Static209.aBoolean240 = Static254.anIntArray487[local28] == 1;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6011) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0 || local809 > 2) {
															local809 = 0;
														}
														Static139.anInt3451 = local809;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6012) {
														if (GlRenderer.enabled) {
															Static27.setMaterial(0, 0);
														}
														local28--;
														Static178.highDetailLighting = Static254.anIntArray487[local28] == 1;
														if (GlRenderer.enabled && Static178.highDetailLighting) {
															Rasteriser.method1911(0.7F);
														} else {
															if (Static113.anInt4609 == 1) {
																Rasteriser.method1911(0.9F);
															}
															if (Static113.anInt4609 == 2) {
																Rasteriser.method1911(0.8F);
															}
															if (Static113.anInt4609 == 3) {
																Rasteriser.method1911(0.7F);
															}
															if (Static113.anInt4609 == 4) {
																Rasteriser.method1911(0.6F);
															}
														}
														Static145.method2742();
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6014) {
														local28--;
														Static220.aBoolean244 = Static254.anIntArray487[local28] == 1;
														if (GlRenderer.enabled) {
															Static145.method2742();
														}
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6015) {
														local28--;
														Static71.aBoolean107 = Static254.anIntArray487[local28] == 1;
														if (GlRenderer.enabled) {
															Static86.method1799();
														}
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6016) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (GlRenderer.enabled) {
															Static35.aBoolean66 = true;
														}
														if (local809 < 0 || local809 > 2) {
															local809 = 0;
														}
														Static186.anInt4392 = local809;
														continue;
													}
													if (local226 == 6017) {
														local28--;
														Static99.aBoolean143 = Static254.anIntArray487[local28] == 1;
														Static211.method930();
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6018) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0) {
															local809 = 0;
														}
														if (local809 > 127) {
															local809 = 127;
														}
														Static125.anInt3104 = local809;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6019) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0) {
															local809 = 0;
														}
														if (local809 > 255) {
															local809 = 255;
														}
														if (local809 != Static12.anInt391) {
															if (Static12.anInt391 == 0 && Static221.anInt4363 != -1) {
																Static122.method2410(Static130.aClass153_47, Static221.anInt4363, local809);
																Static144.aBoolean173 = false;
															} else if (local809 == 0) {
																Static241.method4548();
																Static144.aBoolean173 = false;
															} else {
																Static230.method3956(local809);
															}
															Static12.anInt391 = local809;
														}
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6020) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0) {
															local809 = 0;
														}
														if (local809 > 127) {
															local809 = 127;
														}
														Static30.anInt978 = local809;
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														continue;
													}
													if (local226 == 6021) {
														local28--;
														Static127.aBoolean160 = Static254.anIntArray487[local28] == 1;
														Static269.method2218();
														continue;
													}
													if (local226 == 6023) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0) {
															local809 = 0;
														}
														if (local809 > 2) {
															local809 = 2;
														}
														local1552 = false;
														if (Static238.anInt5316 < 96) {
															local1552 = true;
															local809 = 0;
														}
														Static76.method1645(local809);
														Static203.method3663(Static71.signLink);
														Static18.sentToServer = false;
														Static254.anIntArray487[local28++] = local1552 ? 0 : 1;
														continue;
													}
													if (local226 == 6024) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0 || local809 > 2) {
															local809 = 0;
														}
														Static102.anInt2679 = local809;
														Static203.method3663(Static71.signLink);
														continue;
													}
													if (local226 == 6028) {
														local28--;
														Static64.aBoolean111 = Static254.anIntArray487[local28] != 0;
														Static203.method3663(Static71.signLink);
														continue;
													}
												} else if (local226 < 6200) {
													if (local226 == 6101) {
														Static254.anIntArray487[local28++] = Static113.anInt4609;
														continue;
													}
													if (local226 == 6102) {
														Static254.anIntArray487[local28++] = Static138.method2697() ? 1 : 0;
														continue;
													}
													if (local226 == 6103) {
														Static254.anIntArray487[local28++] = Static80.aBoolean231 ? 1 : 0;
														continue;
													}
													if (local226 == 6105) {
														Static254.anIntArray487[local28++] = Static250.aBoolean283 ? 1 : 0;
														continue;
													}
													if (local226 == 6106) {
														Static254.anIntArray487[local28++] = Static53.aBoolean99 ? 1 : 0;
														continue;
													}
													if (local226 == 6107) {
														Static254.anIntArray487[local28++] = Static15.aBoolean33 ? 1 : 0;
														continue;
													}
													if (local226 == 6108) {
														Static254.anIntArray487[local28++] = Static11.aBoolean15 ? 1 : 0;
														continue;
													}
													if (local226 == 6109) {
														Static254.anIntArray487[local28++] = Static159.aBoolean189 ? 1 : 0;
														continue;
													}
													if (local226 == 6110) {
														Static254.anIntArray487[local28++] = Static209.aBoolean240 ? 1 : 0;
														continue;
													}
													if (local226 == 6111) {
														Static254.anIntArray487[local28++] = Static139.anInt3451;
														continue;
													}
													if (local226 == 6112) {
														Static254.anIntArray487[local28++] = Static178.highDetailLighting ? 1 : 0;
														continue;
													}
													if (local226 == 6114) {
														Static254.anIntArray487[local28++] = Static220.aBoolean244 ? 1 : 0;
														continue;
													}
													if (local226 == 6115) {
														Static254.anIntArray487[local28++] = Static71.aBoolean107 ? 1 : 0;
														continue;
													}
													if (local226 == 6116) {
														Static254.anIntArray487[local28++] = Static186.anInt4392;
														continue;
													}
													if (local226 == 6117) {
														Static254.anIntArray487[local28++] = Static99.aBoolean143 ? 1 : 0;
														continue;
													}
													if (local226 == 6118) {
														Static254.anIntArray487[local28++] = Static125.anInt3104;
														continue;
													}
													if (local226 == 6119) {
														Static254.anIntArray487[local28++] = Static12.anInt391;
														continue;
													}
													if (local226 == 6120) {
														Static254.anIntArray487[local28++] = Static30.anInt978;
														continue;
													}
													if (local226 == 6121) {
														if (GlRenderer.enabled) {
															Static254.anIntArray487[local28++] = GlRenderer.arbMultisampleSupported ? 1 : 0;
														} else {
															Static254.anIntArray487[local28++] = 0;
														}
														continue;
													}
													if (local226 == 6123) {
														Static254.anIntArray487[local28++] = Static76.method1644();
														continue;
													}
													if (local226 == 6124) {
														Static254.anIntArray487[local28++] = Static102.anInt2679;
														continue;
													}
													if (local226 == 6128) {
														Static254.anIntArray487[local28++] = Static64.aBoolean111 ? 1 : 0;
														continue;
													}
												} else if (local226 < 6300) {
													if (local226 == 6200) {
														local28 -= 2;
														Static178.aShort25 = (short) Static254.anIntArray487[local28];
														if (Static178.aShort25 <= 0) {
															Static178.aShort25 = 256;
														}
														Static10.aShort9 = (short) Static254.anIntArray487[local28 + 1];
														if (Static10.aShort9 <= 0) {
															Static10.aShort9 = 205;
														}
														continue;
													}
													if (local226 == 6201) {
														local28 -= 2;
														Static263.aShort30 = (short) Static254.anIntArray487[local28];
														if (Static263.aShort30 <= 0) {
															Static263.aShort30 = 256;
														}
														Static187.aShort27 = (short) Static254.anIntArray487[local28 + 1];
														if (Static187.aShort27 <= 0) {
															Static187.aShort27 = 320;
														}
														continue;
													}
													if (local226 == 6202) {
														local28 -= 4;
														Static153.aShort22 = (short) Static254.anIntArray487[local28];
														if (Static153.aShort22 <= 0) {
															Static153.aShort22 = 1;
														}
														Static4.aShort1 = (short) Static254.anIntArray487[local28 + 1];
														if (Static4.aShort1 <= 0) {
															Static4.aShort1 = 32767;
														} else if (Static153.aShort22 > Static4.aShort1) {
															Static4.aShort1 = Static153.aShort22;
														}
														Static55.aShort12 = (short) Static254.anIntArray487[local28 + 2];
														if (Static55.aShort12 <= 0) {
															Static55.aShort12 = 1;
														}
														Static131.aShort21 = (short) Static254.anIntArray487[local28 + 3];
														if (Static131.aShort21 <= 0) {
															Static131.aShort21 = 32767;
														} else if (Static131.aShort21 < Static55.aShort12) {
															Static131.aShort21 = Static55.aShort12;
														}
														continue;
													}
													if (local226 == 6203) {
														Static115.method2314(Static280.aClass13_26.anInt445, 0, Static280.aClass13_26.anInt459, 0, false);
														Static254.anIntArray487[local28++] = Static166.anInt4055;
														Static254.anIntArray487[local28++] = Static245.anInt5377;
														continue;
													}
													if (local226 == 6204) {
														Static254.anIntArray487[local28++] = Static263.aShort30;
														Static254.anIntArray487[local28++] = Static187.aShort27;
														continue;
													}
													if (local226 == 6205) {
														Static254.anIntArray487[local28++] = Static178.aShort25;
														Static254.anIntArray487[local28++] = Static10.aShort9;
														continue;
													}
												} else if (local226 < 6400) {
													if (local226 == 6300) {
														Static254.anIntArray487[local28++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
														continue;
													}
													if (local226 == 6301) {
														Static254.anIntArray487[local28++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
														continue;
													}
													if (local226 == 6302) {
														local28 -= 3;
														local1052 = Static254.anIntArray487[local28 + 2];
														local803 = Static254.anIntArray487[local28 + 1];
														local809 = Static254.anIntArray487[local28];
														Static102.aCalendar2.clear();
														Static102.aCalendar2.set(11, 12);
														Static102.aCalendar2.set(local1052, local803, local809);
														Static254.anIntArray487[local28++] = (int) (Static102.aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local226 == 6303) {
														Static102.aCalendar2.clear();
														Static102.aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
														Static254.anIntArray487[local28++] = Static102.aCalendar2.get(1);
														continue;
													}
													if (local226 == 6304) {
														local1552 = true;
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (local809 < 0) {
															local1552 = (local809 + 1) % 4 == 0;
														} else if (local809 < 1582) {
															local1552 = local809 % 4 == 0;
														} else if (local809 % 4 != 0) {
															local1552 = false;
														} else if (local809 % 100 != 0) {
															local1552 = true;
														} else if (local809 % 400 != 0) {
															local1552 = false;
														}
														Static254.anIntArray487[local28++] = local1552 ? 1 : 0;
														continue;
													}
												} else if (local226 < 6500) {
													if (local226 == 6405) {
														Static254.anIntArray487[local28++] = Static87.method1802() ? 1 : 0;
														continue;
													}
													if (local226 == 6406) {
														Static254.anIntArray487[local28++] = Static267.method4527() ? 1 : 0;
														continue;
													}
												} else if (local226 < 6600) {
													if (local226 == 6500) {
														if (Static244.anInt5370 == 10 && Static219.anInt4937 == 0 && Static184.anInt4348 == 0 && Static179.anInt4261 == 0) {
															Static254.anIntArray487[local28++] = Static207.method3684() == -1 ? 0 : 1;
															continue;
														}
														Static254.anIntArray487[local28++] = 1;
														continue;
													}
													@Pc(10247) Class32 local10247;
													@Pc(10191) World local10191;
													if (local226 == 6501) {
														local10191 = Static18.method556();
														if (local10191 == null) {
															Static254.anIntArray487[local28++] = -1;
															Static254.anIntArray487[local28++] = 0;
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
															Static254.anIntArray487[local28++] = 0;
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
															Static254.anIntArray487[local28++] = 0;
														} else {
															Static254.anIntArray487[local28++] = local10191.anInt382;
															Static254.anIntArray487[local28++] = local10191.anInt381;
															Static3.aClass100Array176[local26++] = local10191.aClass100_69;
															local10247 = local10191.method445();
															Static254.anIntArray487[local28++] = local10247.anInt1739;
															Static3.aClass100Array176[local26++] = local10247.aClass100_378;
															Static254.anIntArray487[local28++] = local10191.anInt379;
														}
														continue;
													}
													if (local226 == 6502) {
														local10191 = method1821();
														if (local10191 == null) {
															Static254.anIntArray487[local28++] = -1;
															Static254.anIntArray487[local28++] = 0;
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
															Static254.anIntArray487[local28++] = 0;
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
															Static254.anIntArray487[local28++] = 0;
														} else {
															Static254.anIntArray487[local28++] = local10191.anInt382;
															Static254.anIntArray487[local28++] = local10191.anInt381;
															Static3.aClass100Array176[local26++] = local10191.aClass100_69;
															local10247 = local10191.method445();
															Static254.anIntArray487[local28++] = local10247.anInt1739;
															Static3.aClass100Array176[local26++] = local10247.aClass100_378;
															Static254.anIntArray487[local28++] = local10191.anInt379;
														}
														continue;
													}
													if (local226 == 6503) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														if (Static244.anInt5370 == 10 && Static219.anInt4937 == 0 && Static184.anInt4348 == 0 && Static179.anInt4261 == 0) {
															Static254.anIntArray487[local28++] = Static176.method3303(local809) ? 1 : 0;
															continue;
														}
														Static254.anIntArray487[local28++] = 0;
														continue;
													}
													if (local226 == 6504) {
														local28--;
														Static164.anInt3988 = Static254.anIntArray487[local28];
														Static203.method3663(Static71.signLink);
														continue;
													}
													if (local226 == 6505) {
														Static254.anIntArray487[local28++] = Static164.anInt3988;
														continue;
													}
													if (local226 == 6506) {
														local28--;
														local809 = Static254.anIntArray487[local28];
														@Pc(10440) World local10440 = Static54.method1310(local809);
														if (local10440 == null) {
															Static254.anIntArray487[local28++] = -1;
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
															Static254.anIntArray487[local28++] = 0;
															Static3.aClass100Array176[local26++] = Static72.aClass100_447;
															Static254.anIntArray487[local28++] = 0;
														} else {
															Static254.anIntArray487[local28++] = local10440.anInt381;
															Static3.aClass100Array176[local26++] = local10440.aClass100_69;
															@Pc(10458) Class32 local10458 = local10440.method445();
															Static254.anIntArray487[local28++] = local10458.anInt1739;
															Static3.aClass100Array176[local26++] = local10458.aClass100_378;
															Static254.anIntArray487[local28++] = local10440.anInt379;
														}
														continue;
													}
													if (local226 == 6507) {
														local28 -= 4;
														local1052 = Static254.anIntArray487[local28 + 2];
														local809 = Static254.anIntArray487[local28];
														local7566 = Static254.anIntArray487[local28 + 3] == 1;
														local1552 = Static254.anIntArray487[local28 + 1] == 1;
														Static228.method3908(local1052, local1552, local809, local7566);
														continue;
													}
												} else if (local226 < 6700) {
													if (local226 == 6600) {
														local28--;
														Static33.aBoolean63 = Static254.anIntArray487[local28] == 1;
														Static203.method3663(Static71.signLink);
														continue;
													}
													if (local226 == 6601) {
														Static254.anIntArray487[local28++] = Static33.aBoolean63 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (local226 == 4500) {
											local28 -= 2;
											local809 = Static254.anIntArray487[local28];
											local803 = Static254.anIntArray487[local28 + 1];
											local5294 = Static110.method2277(local803);
											if (local5294.method2078()) {
												Static3.aClass100Array176[local26++] = Static123.method2417(local809).method2802(local5294.aClass100_544, local803);
											} else {
												Static254.anIntArray487[local28++] = Static123.method2417(local809).method2798(local803, local5294.anInt2667);
											}
											continue;
										}
									} else if (local226 == 4400) {
										local28 -= 2;
										local803 = Static254.anIntArray487[local28 + 1];
										local809 = Static254.anIntArray487[local28];
										local5294 = Static110.method2277(local803);
										if (local5294.method2078()) {
											Static3.aClass100Array176[local26++] = Static271.method4601(local809).method3430(local5294.aClass100_544, local803);
										} else {
											Static254.anIntArray487[local28++] = Static271.method4601(local809).method3423(local5294.anInt2667, local803);
										}
										continue;
									}
								} else {
									if (local226 == 4100) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local28--;
										local803 = Static254.anIntArray487[local28];
										Static3.aClass100Array176[local26++] = Static34.method882(new JagString[] { local609, Static123.method2423(local803) });
										continue;
									}
									if (local226 == 4101) {
										local26 -= 2;
										local2522 = Static3.aClass100Array176[local26 + 1];
										local609 = Static3.aClass100Array176[local26];
										Static3.aClass100Array176[local26++] = Static34.method882(new JagString[] { local609, local2522 });
										continue;
									}
									if (local226 == 4102) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local28--;
										local803 = Static254.anIntArray487[local28];
										Static3.aClass100Array176[local26++] = Static34.method882(new JagString[] { local609, Static110.method2285(local803) });
										continue;
									}
									if (local226 == 4103) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static3.aClass100Array176[local26++] = local609.toLowerCase();
										continue;
									}
									if (local226 == 4104) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										@Pc(11770) long local11770 = (long) local809 * 86400000L + 1014768000000L;
										Static102.aCalendar2.setTime(new Date(local11770));
										local652 = Static102.aCalendar2.get(5);
										local4859 = Static102.aCalendar2.get(2);
										local1087 = Static102.aCalendar2.get(1);
										Static3.aClass100Array176[local26++] = Static34.method882(new JagString[] { Static123.method2423(local652), Static163.aClass100_767, Static34.aClass100Array40[local4859], Static163.aClass100_767, Static123.method2423(local1087) });
										continue;
									}
									if (local226 == 4105) {
										local26 -= 2;
										local2522 = Static3.aClass100Array176[local26 + 1];
										local609 = Static3.aClass100Array176[local26];
										if (Static173.self.aClass59_1 != null && Static173.self.aClass59_1.aBoolean141) {
											Static3.aClass100Array176[local26++] = local2522;
											continue;
										}
										Static3.aClass100Array176[local26++] = local609;
										continue;
									}
									if (local226 == 4106) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static3.aClass100Array176[local26++] = Static123.method2423(local809);
										continue;
									}
									if (local226 == 4107) {
										local26 -= 2;
										Static254.anIntArray487[local28++] = Static3.aClass100Array176[local26].method3126(Static3.aClass100Array176[local26 + 1]);
										continue;
									}
									if (local226 == 4108) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local28 -= 2;
										local1052 = Static254.anIntArray487[local28 + 1];
										local803 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static148.method2768(local1052).method2860(local609, local803);
										continue;
									}
									if (local226 == 4109) {
										local28 -= 2;
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local1052 = Static254.anIntArray487[local28 + 1];
										local803 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static148.method2768(local1052).method2856(local609, local803);
										continue;
									}
									if (local226 == 4110) {
										local26 -= 2;
										local609 = Static3.aClass100Array176[local26];
										local2522 = Static3.aClass100Array176[local26 + 1];
										local28--;
										if (Static254.anIntArray487[local28] == 1) {
											Static3.aClass100Array176[local26++] = local609;
										} else {
											Static3.aClass100Array176[local26++] = local2522;
										}
										continue;
									}
									if (local226 == 4111) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										Static3.aClass100Array176[local26++] = Static218.method2862(local609);
										continue;
									}
									if (local226 == 4112) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local28--;
										local803 = Static254.anIntArray487[local28];
										if (local803 == -1) {
											throw new RuntimeException("null char");
										}
										Static3.aClass100Array176[local26++] = local609.method3128(local803);
										continue;
									}
									if (local226 == 4113) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static273.method3213(local809) ? 1 : 0;
										continue;
									}
									if (local226 == 4114) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static83.method433(local809) ? 1 : 0;
										continue;
									}
									if (local226 == 4115) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static258.method4428(local809) ? 1 : 0;
										continue;
									}
									if (local226 == 4116) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static24.method671(local809) ? 1 : 0;
										continue;
									}
									if (local226 == 4117) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										if (local609 == null) {
											Static254.anIntArray487[local28++] = 0;
										} else {
											Static254.anIntArray487[local28++] = local609.length();
										}
										continue;
									}
									if (local226 == 4118) {
										local28 -= 2;
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local803 = Static254.anIntArray487[local28];
										local1052 = Static254.anIntArray487[local28 + 1];
										Static3.aClass100Array176[local26++] = local609.substring(local1052, local803);
										continue;
									}
									if (local226 == 4119) {
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local2522 = Static87.method1804(local609.length());
										@Pc(12220) boolean local12220 = false;
										for (local652 = 0; local652 < local609.length(); local652++) {
											local4859 = local609.method3149(local652);
											if (local4859 == 60) {
												local12220 = true;
											} else if (local4859 == 62) {
												local12220 = false;
											} else if (!local12220) {
												local2522.method3152(local4859);
											}
										}
										local2522.method3156();
										Static3.aClass100Array176[local26++] = local2522;
										continue;
									}
									if (local226 == 4120) {
										local28 -= 2;
										local26--;
										local609 = Static3.aClass100Array176[local26];
										local803 = Static254.anIntArray487[local28];
										local1052 = Static254.anIntArray487[local28 + 1];
										Static254.anIntArray487[local28++] = local609.method3135(local803, local1052);
										continue;
									}
									if (local226 == 4121) {
										local26 -= 2;
										local609 = Static3.aClass100Array176[local26];
										local2522 = Static3.aClass100Array176[local26 + 1];
										local28--;
										local1052 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = local609.method3146(local2522, local1052);
										continue;
									}
									if (local226 == 4122) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static231.method3984(local809);
										continue;
									}
									if (local226 == 4123) {
										local28--;
										local809 = Static254.anIntArray487[local28];
										Static254.anIntArray487[local28++] = Static143.method2733(local809);
										continue;
									}
									if (local226 == 4124) {
										local28--;
										local12388 = Static254.anIntArray487[local28] != 0;
										local28--;
										local803 = Static254.anIntArray487[local28];
										Static3.aClass100Array176[local26++] = Static182.method3360(Static141.anInt3470, local12388, 0, (long) local803);
										continue;
									}
								}
							}
						} else {
							if (local226 < 2000) {
								local1182 = local1020 ? Static274.aClass13_24 : Static227.aClass13_25;
							} else {
								local28--;
								local1182 = Static5.getComponent(Static254.anIntArray487[local28]);
								local226 -= 1000;
							}
							if (local226 == 1000) {
								local28 -= 4;
								local1182.baseX = Static254.anIntArray487[local28];
								local1182.baseY = Static254.anIntArray487[local28 + 1];
								local1052 = Static254.anIntArray487[local28 + 3];
								if (local1052 < 0) {
									local1052 = 0;
								} else if (local1052 > 5) {
									local1052 = 5;
								}
								local803 = Static254.anIntArray487[local28 + 2];
								if (local803 < 0) {
									local803 = 0;
								} else if (local803 > 5) {
									local803 = 5;
								}
								local1182.xMode = (byte) local1052;
								local1182.yMode = (byte) local803;
								Static43.method1143(local1182);
								Static74.method1625(local1182);
								if (local1182.componentId == -1) {
									Static280.method4675(local1182.anInt507);
								}
								continue;
							}
							if (local226 == 1001) {
								local28 -= 4;
								local1182.baseWidth = Static254.anIntArray487[local28];
								local1182.anInt488 = Static254.anIntArray487[local28 + 1];
								local1182.anInt451 = 0;
								local1182.anInt526 = 0;
								local803 = Static254.anIntArray487[local28 + 2];
								local1052 = Static254.anIntArray487[local28 + 3];
								if (local1052 < 0) {
									local1052 = 0;
								} else if (local1052 > 4) {
									local1052 = 4;
								}
								local1182.aByte3 = (byte) local1052;
								if (local803 < 0) {
									local803 = 0;
								} else if (local803 > 4) {
									local803 = 4;
								}
								local1182.aByte5 = (byte) local803;
								Static43.method1143(local1182);
								Static74.method1625(local1182);
								if (local1182.anInt452 == 0) {
									Static17.method531(local1182, false);
								}
								continue;
							}
							if (local226 == 1003) {
								local28--;
								local1552 = Static254.anIntArray487[local28] == 1;
								if (local1552 != local1182.hidden) {
									local1182.hidden = local1552;
									Static43.method1143(local1182);
								}
								if (local1182.componentId == -1) {
									Static93.method1906(local1182.anInt507);
								}
								continue;
							}
							if (local226 == 1004) {
								local28 -= 2;
								local1182.anInt473 = Static254.anIntArray487[local28];
								local1182.anInt442 = Static254.anIntArray487[local28 + 1];
								Static43.method1143(local1182);
								Static74.method1625(local1182);
								if (local1182.anInt452 == 0) {
									Static17.method531(local1182, false);
								}
								continue;
							}
							if (local226 == 1005) {
								local28--;
								local1182.aBoolean29 = Static254.anIntArray487[local28] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14378) Exception local14378) {
			if (local14.aClass100_880 == null) {
				if (Static83.modeWhere != 0) {
					Static103.method2231(Static72.aClass100_447, 0, Static136.aClass100_633);
				}
				Static89.method1839("CS2 - scr:" + local14.aLong192 + " op:" + local44, local14378);
			} else {
				@Pc(14385) JagString local14385 = Static87.method1804(30);
				local14385.method3113(Static219.aClass100_928).method3113(local14.aClass100_880);
				for (local58 = Static138.anInt3445 - 1; local58 >= 0; local58--) {
					local14385.method3113(Static40.aClass100_253).method3113(Static67.aClass61Array3[local58].aClass3_Sub2_Sub17_1.aClass100_880);
				}
				if (local44 == 40) {
					local58 = local33[local30];
					local14385.method3113(Static176.aClass100_802).method3113(Static123.method2423(local58));
				}
				if (Static83.modeWhere != 0) {
					Static103.method2231(Static72.aClass100_447, 0, Static34.method882(new JagString[] { Static167.aClass100_780, local14.aClass100_880 }));
				}
				Static89.method1839("CS2 - scr:" + local14.aLong192 + " op:" + local44 + new String(local14385.method3148()), local14378);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!ba;")
	public static World method1821() {
		return Static101.aClass10_Sub1Array1.length > Static51.anInt1682 ? Static101.aClass10_Sub1Array1[Static51.anInt1682++] : null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void start(@OriginalArg(0) java.awt.Component arg0) {
		arg0.addMouseListener(Static93.aClass150_1);
		arg0.addMouseMotionListener(Static93.aClass150_1);
		arg0.addFocusListener(Static93.aClass150_1);
	}
}
