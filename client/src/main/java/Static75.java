import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public static int anInt2119 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V")
	public static void method1629(@OriginalArg(1) boolean arg0) {
		Static230.aBoolean250 = arg0;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(138) int local138;
		@Pc(151) int local151;
		@Pc(169) int local169;
		if (!Static230.aBoolean250) {
			local13 = Static57.aClass3_Sub15_Sub1_3.g2sub();
			local20 = (Static223.anInt5028 - Static57.aClass3_Sub15_Sub1_3.offset) / 16;
			Static72.anIntArrayArray14 = new int[local20][4];
			for (local26 = 0; local26 < local20; local26++) {
				for (local31 = 0; local31 < 4; local31++) {
					Static72.anIntArrayArray14[local26][local31] = Static57.aClass3_Sub15_Sub1_3.p4rme();
				}
			}
			local26 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
			local31 = Static57.aClass3_Sub15_Sub1_3.g2();
			local60 = Static57.aClass3_Sub15_Sub1_3.g2sub();
			local64 = Static57.aClass3_Sub15_Sub1_3.g2sub();
			Static238.anIntArray470 = new int[local20];
			Static273.aByteArrayArray13 = new byte[local20][];
			Static191.aByteArrayArray15 = null;
			Static99.anIntArray239 = new int[local20];
			Static156.aByteArrayArray11 = new byte[local20][];
			Static19.aByteArrayArray4 = new byte[local20][];
			Static175.anIntArray371 = null;
			Static36.anIntArray84 = new int[local20];
			Static186.aByteArrayArray14 = new byte[local20][];
			Static172.anIntArray366 = new int[local20];
			Static35.anIntArray82 = new int[local20];
			local20 = 0;
			@Pc(100) boolean local100 = false;
			if ((local31 / 8 == 48 || local31 / 8 == 49) && local60 / 8 == 48) {
				local100 = true;
			}
			if (local31 / 8 == 48 && local60 / 8 == 148) {
				local100 = true;
			}
			for (local138 = (local31 - 6) / 8; local138 <= (local31 + 6) / 8; local138++) {
				for (local151 = (local60 - 6) / 8; local151 <= (local60 + 6) / 8; local151++) {
					local169 = (local138 << 8) + local151;
					if (local100 && (local151 == 49 || local151 == 149 || local151 == 147 || local138 == 50 || local138 == 49 && local151 == 47)) {
						Static238.anIntArray470[local20] = local169;
						Static36.anIntArray84[local20] = -1;
						Static172.anIntArray366[local20] = -1;
						Static99.anIntArray239[local20] = -1;
						Static35.anIntArray82[local20] = -1;
					} else {
						Static238.anIntArray470[local20] = local169;
						Static36.anIntArray84[local20] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static103.aClass100_558, Static123.method2423(local138), Static86.aClass100_488, Static123.method2423(local151) }));
						Static172.anIntArray366[local20] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static270.aClass100_1090, Static123.method2423(local138), Static86.aClass100_488, Static123.method2423(local151) }));
						Static99.anIntArray239[local20] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static165.aClass100_772, Static123.method2423(local138), Static86.aClass100_488, Static123.method2423(local151) }));
						Static35.anIntArray82[local20] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static278.aClass100_1103, Static123.method2423(local138), Static86.aClass100_488, Static123.method2423(local151) }));
					}
					local20++;
				}
			}
			Static127.method2463(local26, local60, local31, local64, false, local13);
			return;
		}
		local13 = Static57.aClass3_Sub15_Sub1_3.g2leadd();
		local20 = Static57.aClass3_Sub15_Sub1_3.g2leadd();
		local26 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
		local31 = Static57.aClass3_Sub15_Sub1_3.g2leadd();
		Static57.aClass3_Sub15_Sub1_3.method2233();
		@Pc(391) int local391;
		for (local60 = 0; local60 < 4; local60++) {
			for (local64 = 0; local64 < 13; local64++) {
				for (local391 = 0; local391 < 13; local391++) {
					local138 = Static57.aClass3_Sub15_Sub1_3.method2238(1);
					if (local138 == 1) {
						Static187.anIntArrayArrayArray18[local60][local64][local391] = Static57.aClass3_Sub15_Sub1_3.method2238(26);
					} else {
						Static187.anIntArrayArrayArray18[local60][local64][local391] = -1;
					}
				}
			}
		}
		Static57.aClass3_Sub15_Sub1_3.method2244();
		local60 = (Static223.anInt5028 - Static57.aClass3_Sub15_Sub1_3.offset) / 16;
		Static72.anIntArrayArray14 = new int[local60][4];
		for (local64 = 0; local64 < local60; local64++) {
			for (local391 = 0; local391 < 4; local391++) {
				Static72.anIntArrayArray14[local64][local391] = Static57.aClass3_Sub15_Sub1_3.p4rme();
			}
		}
		local64 = Static57.aClass3_Sub15_Sub1_3.g2();
		Static35.anIntArray82 = new int[local60];
		Static172.anIntArray366 = new int[local60];
		Static36.anIntArray84 = new int[local60];
		Static19.aByteArrayArray4 = new byte[local60][];
		Static175.anIntArray371 = null;
		Static99.anIntArray239 = new int[local60];
		Static156.aByteArrayArray11 = new byte[local60][];
		Static273.aByteArrayArray13 = new byte[local60][];
		Static238.anIntArray470 = new int[local60];
		Static191.aByteArrayArray15 = null;
		Static186.aByteArrayArray14 = new byte[local60][];
		local60 = 0;
		for (local391 = 0; local391 < 4; local391++) {
			for (local138 = 0; local138 < 13; local138++) {
				for (local151 = 0; local151 < 13; local151++) {
					local169 = Static187.anIntArrayArrayArray18[local391][local138][local151];
					if (local169 != -1) {
						@Pc(555) int local555 = local169 >> 14 & 0x3FF;
						@Pc(561) int local561 = local169 >> 3 & 0x7FF;
						@Pc(571) int local571 = local561 / 8 + (local555 / 8 << 8);
						@Pc(573) int local573;
						for (local573 = 0; local573 < local60; local573++) {
							if (local571 == Static238.anIntArray470[local573]) {
								local571 = -1;
								break;
							}
						}
						if (local571 != -1) {
							Static238.anIntArray470[local60] = local571;
							@Pc(609) int local609 = local571 & 0xFF;
							local573 = local571 >> 8 & 0xFF;
							Static36.anIntArray84[local60] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static103.aClass100_558, Static123.method2423(local573), Static86.aClass100_488, Static123.method2423(local609) }));
							Static172.anIntArray366[local60] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static270.aClass100_1090, Static123.method2423(local573), Static86.aClass100_488, Static123.method2423(local609) }));
							Static99.anIntArray239[local60] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static165.aClass100_772, Static123.method2423(local573), Static86.aClass100_488, Static123.method2423(local609) }));
							Static35.anIntArray82[local60] = Static26.aClass153_16.method4482(Static34.method882(new JagString[] { Static278.aClass100_1103, Static123.method2423(local573), Static86.aClass100_488, Static123.method2423(local609) }));
							local60++;
						}
					}
				}
			}
		}
		Static127.method2463(local26, local64, local20, local31, false, local13);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method1631() {
		Static254.anIntArray488 = null;
		Static269.anIntArray252 = null;
		Static26.anIntArray66 = null;
		Static7.aByteArrayArray5 = null;
		Static274.anIntArray440 = null;
		Static259.anIntArray513 = null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method1632() {
		@Pc(9) Environment local9 = new Environment();
		for (@Pc(18) int local18 = 0; local18 < 13; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
				Static192.aClass92ArrayArray1[local18][local25] = local9;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!df;")
	public static WallDecor method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) WallDecor local14 = local7.aClass24_1;
			local7.aClass24_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public static void method1634() {
		@Pc(15) int local15;
		@Pc(23) int local23;
		@Pc(19) int local19;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (Static164.anInt3985 == 195) {
			local15 = Static57.aClass3_Sub15_Sub1_3.p1neg();
			local19 = local15 & 0x3;
			local23 = local15 >> 2;
			local27 = Static133.anIntArray453[local23];
			local31 = Static57.aClass3_Sub15_Sub1_3.g1();
			local39 = (local31 >> 4 & 0x7) + Static115.anInt2940;
			local45 = (local31 & 0x7) + Static180.anInt4264;
			if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
				Static29.method800(Static55.level, local45, local19, local39, -1, -1, local27, local23, 0);
			}
		} else if (Static164.anInt3985 == 33) {
			local15 = Static57.aClass3_Sub15_Sub1_3.g2le();
			local23 = Static57.aClass3_Sub15_Sub1_3.g1();
			local27 = (local23 & 0x7) + Static180.anInt4264;
			local19 = (local23 >> 4 & 0x7) + Static115.anInt2940;
			local31 = Static57.aClass3_Sub15_Sub1_3.g2sub();
			if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104) {
				@Pc(122) ObjStack local122 = new ObjStack();
				local122.anInt5550 = local31;
				local122.anInt5555 = local15;
				if (Static159.aClass69ArrayArrayArray1[Static55.level][local19][local27] == null) {
					Static159.aClass69ArrayArrayArray1[Static55.level][local19][local27] = new LinkedList();
				}
				Static159.aClass69ArrayArrayArray1[Static55.level][local19][local27].method2282(new ObjStackNode(local122));
				Static220.method3797(local27, local19);
			}
		} else {
			@Pc(218) int local218;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(247) int local247;
			@Pc(224) int local224;
			@Pc(236) int local236;
			@Pc(317) ProjAnim local317;
			if (Static164.anInt3985 == 121) {
				local15 = Static57.aClass3_Sub15_Sub1_3.g1();
				local23 = Static115.anInt2940 * 2 + (local15 >> 4 & 0xF);
				local19 = (local15 & 0xF) + Static180.anInt4264 * 2;
				local27 = local23 + Static57.aClass3_Sub15_Sub1_3.g1s();
				local31 = Static57.aClass3_Sub15_Sub1_3.g1s() + local19;
				local39 = Static57.aClass3_Sub15_Sub1_3.g2s();
				local45 = Static57.aClass3_Sub15_Sub1_3.g2();
				local218 = Static57.aClass3_Sub15_Sub1_3.g1() * 4;
				local224 = Static57.aClass3_Sub15_Sub1_3.g1() * 4;
				local228 = Static57.aClass3_Sub15_Sub1_3.g2();
				local232 = Static57.aClass3_Sub15_Sub1_3.g2();
				local236 = Static57.aClass3_Sub15_Sub1_3.g1();
				if (local236 == 255) {
					local236 = -1;
				}
				local247 = Static57.aClass3_Sub15_Sub1_3.g1();
				if (local23 >= 0 && local19 >= 0 && local23 < 208 && local19 < 208 && local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local45 != 65535) {
					local31 *= 64;
					local27 = local27 * 64;
					local19 = local19 * 64;
					local23 = local23 * 64;
					local317 = new ProjAnim(local45, Static55.level, local23, local19, Static207.method3685(Static55.level, local23, local19) - local218, Static83.anInt372 + local228, local232 + Static83.anInt372, local236, local247, local39, local224);
					local317.method3705(local31, Static83.anInt372 + local228, -local224 + Static207.method3685(Static55.level, local27, local31), local27);
					Static217.aClass69_116.method2282(new ProjAnimNode(local317));
				}
			} else if (Static164.anInt3985 == 17) {
				local15 = Static57.aClass3_Sub15_Sub1_3.g1();
				local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
				local19 = Static180.anInt4264 + (local15 & 0x7);
				local27 = Static57.aClass3_Sub15_Sub1_3.g2();
				local31 = Static57.aClass3_Sub15_Sub1_3.g1();
				local39 = Static57.aClass3_Sub15_Sub1_3.g2();
				if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
					local23 = local23 * 128 + 64;
					local19 = local19 * 128 + 64;
					@Pc(427) SpotAnim local427 = new SpotAnim(local27, Static55.level, local23, local19, Static207.method3685(Static55.level, local23, local19) - local31, local39, Static83.anInt372);
					Static99.aClass69_64.method2282(new SpotAnimNode(local427));
				}
			} else if (Static164.anInt3985 == 179) {
				local15 = Static57.aClass3_Sub15_Sub1_3.g1add();
				local23 = local15 >> 2;
				local19 = local15 & 0x3;
				local27 = Static133.anIntArray453[local23];
				local31 = Static57.aClass3_Sub15_Sub1_3.g1();
				local39 = Static115.anInt2940 + (local31 >> 4 & 0x7);
				local45 = (local31 & 0x7) + Static180.anInt4264;
				local218 = Static57.aClass3_Sub15_Sub1_3.g2sub();
				if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
					Static29.method800(Static55.level, local45, local19, local39, -1, local218, local27, local23, 0);
				}
			} else if (Static164.anInt3985 == 20) {
				local15 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
				local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
				local19 = Static180.anInt4264 + (local15 & 0x7);
				local27 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
				local31 = local27 >> 2;
				local39 = local27 & 0x3;
				local45 = Static133.anIntArray453[local31];
				local218 = Static57.aClass3_Sub15_Sub1_3.g2le();
				if (local218 == 65535) {
					local218 = -1;
				}
				Static92.method1881(Static55.level, local39, local31, local19, local45, local23, local218);
			} else {
				@Pc(633) int local633;
				if (Static164.anInt3985 == 202) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g1();
					local23 = local15 >> 2;
					local19 = local15 & 0x3;
					local27 = Static57.aClass3_Sub15_Sub1_3.g1();
					local31 = (local27 >> 4 & 0x7) + Static115.anInt2940;
					local39 = (local27 & 0x7) + Static180.anInt4264;
					@Pc(605) byte local605 = Static57.aClass3_Sub15_Sub1_3.p1sub();
					@Pc(609) byte local609 = Static57.aClass3_Sub15_Sub1_3.p1sub();
					@Pc(613) byte local613 = Static57.aClass3_Sub15_Sub1_3.g1sub();
					local228 = Static57.aClass3_Sub15_Sub1_3.g2sub();
					local232 = Static57.aClass3_Sub15_Sub1_3.g2le();
					@Pc(625) byte local625 = Static57.aClass3_Sub15_Sub1_3.g1s();
					local247 = Static57.aClass3_Sub15_Sub1_3.g2();
					local633 = Static57.aClass3_Sub15_Sub1_3.g2lesadd();
					if (!GlRenderer.enabled) {
						Static170.method2574(local625, local247, local633, local232, local39, local613, local19, local605, local31, local23, local609, local228);
					}
				}
				if (Static164.anInt3985 == 14) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g1();
					local19 = Static180.anInt4264 + (local15 & 0x7);
					local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
					local27 = Static57.aClass3_Sub15_Sub1_3.g2();
					local31 = Static57.aClass3_Sub15_Sub1_3.g2();
					local39 = Static57.aClass3_Sub15_Sub1_3.g2();
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
						@Pc(710) LinkedList local710 = Static159.aClass69ArrayArrayArray1[Static55.level][local23][local19];
						if (local710 != null) {
							for (@Pc(718) ObjStackNode local718 = (ObjStackNode) local710.method2289(); local718 != null; local718 = (ObjStackNode) local710.method2288()) {
								@Pc(723) ObjStack local723 = local718.aClass8_Sub7_1;
								if ((local27 & 0x7FFF) == local723.anInt5555 && local31 == local723.anInt5550) {
									local723.anInt5550 = local39;
									break;
								}
							}
							Static220.method3797(local19, local23);
						}
					}
				} else if (Static164.anInt3985 == 135) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g2leadd();
					local23 = Static57.aClass3_Sub15_Sub1_3.p1neg();
					local27 = Static180.anInt4264 + (local23 & 0x7);
					local19 = (local23 >> 4 & 0x7) + Static115.anInt2940;
					local31 = Static57.aClass3_Sub15_Sub1_3.g2le();
					local39 = Static57.aClass3_Sub15_Sub1_3.g2le();
					if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104 && Static16.anInt549 != local15) {
						@Pc(812) ObjStack local812 = new ObjStack();
						local812.anInt5550 = local31;
						local812.anInt5555 = local39;
						if (Static159.aClass69ArrayArrayArray1[Static55.level][local19][local27] == null) {
							Static159.aClass69ArrayArrayArray1[Static55.level][local19][local27] = new LinkedList();
						}
						Static159.aClass69ArrayArrayArray1[Static55.level][local19][local27].method2282(new ObjStackNode(local812));
						Static220.method3797(local27, local19);
					}
				} else if (Static164.anInt3985 == 16) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g1();
					local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
					local19 = (local15 & 0x7) + Static180.anInt4264;
					local27 = local23 + Static57.aClass3_Sub15_Sub1_3.g1s();
					local31 = Static57.aClass3_Sub15_Sub1_3.g1s() + local19;
					local39 = Static57.aClass3_Sub15_Sub1_3.g2s();
					local45 = Static57.aClass3_Sub15_Sub1_3.g2();
					local218 = Static57.aClass3_Sub15_Sub1_3.g1() * 4;
					local224 = Static57.aClass3_Sub15_Sub1_3.g1() * 4;
					local228 = Static57.aClass3_Sub15_Sub1_3.g2();
					local232 = Static57.aClass3_Sub15_Sub1_3.g2();
					local236 = Static57.aClass3_Sub15_Sub1_3.g1();
					local247 = Static57.aClass3_Sub15_Sub1_3.g1();
					if (local236 == 255) {
						local236 = -1;
					}
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104 && local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local45 != 65535) {
						local31 = local31 * 128 + 64;
						local19 = local19 * 128 + 64;
						local23 = local23 * 128 + 64;
						local27 = local27 * 128 + 64;
						local317 = new ProjAnim(local45, Static55.level, local23, local19, Static207.method3685(Static55.level, local23, local19) - local218, local228 + Static83.anInt372, local232 + Static83.anInt372, local236, local247, local39, local224);
						local317.method3705(local31, Static83.anInt372 + local228, Static207.method3685(Static55.level, local27, local31) - local224, local27);
						Static217.aClass69_116.method2282(new ProjAnimNode(local317));
					}
				} else if (Static164.anInt3985 == 104) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g1();
					local19 = Static180.anInt4264 * 2 + (local15 & 0xF);
					local23 = Static115.anInt2940 * 2 + (local15 >> 4 & 0xF);
					local27 = Static57.aClass3_Sub15_Sub1_3.g1s() + local23;
					local31 = Static57.aClass3_Sub15_Sub1_3.g1s() + local19;
					local39 = Static57.aClass3_Sub15_Sub1_3.g2s();
					local45 = Static57.aClass3_Sub15_Sub1_3.g2s();
					local218 = Static57.aClass3_Sub15_Sub1_3.g2();
					local224 = Static57.aClass3_Sub15_Sub1_3.g1s();
					local228 = Static57.aClass3_Sub15_Sub1_3.g1() * 4;
					local232 = Static57.aClass3_Sub15_Sub1_3.g2();
					local236 = Static57.aClass3_Sub15_Sub1_3.g2();
					local247 = Static57.aClass3_Sub15_Sub1_3.g1();
					local633 = Static57.aClass3_Sub15_Sub1_3.g1();
					if (local247 == 255) {
						local247 = -1;
					}
					if (local23 >= 0 && local19 >= 0 && local23 < 208 && local19 < 208 && local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local218 != 65535) {
						local27 = local27 * 64;
						local23 *= 64;
						local31 *= 64;
						local19 *= 64;
						if (local39 != 0) {
							@Pc(1194) int local1194;
							@Pc(1198) PathingEntity local1198;
							@Pc(1184) int local1184;
							@Pc(1188) int local1188;
							if (local39 >= 0) {
								local1184 = local39 - 1;
								local1188 = local1184 & 0x7FF;
								local1194 = local1184 >> 11 & 0xF;
								local1198 = Static175.aClass8_Sub4_Sub2Array1[local1188];
							} else {
								local1184 = -local39 - 1;
								local1194 = local1184 >> 11 & 0xF;
								local1188 = local1184 & 0x7FF;
								if (Static16.anInt549 == local1188) {
									local1198 = Static173.self;
								} else {
									local1198 = Static159.aClass8_Sub4_Sub1Array1[local1188];
								}
							}
							if (local1198 != null) {
								@Pc(1232) BasType local1232 = local1198.method2681();
								if (local1232.anIntArrayArray7 != null && local1232.anIntArrayArray7[local1194] != null) {
									local1188 = local1232.anIntArrayArray7[local1194][0];
									local224 -= local1232.anIntArrayArray7[local1194][1];
									@Pc(1264) int local1264 = local1232.anIntArrayArray7[local1194][2];
									@Pc(1269) int local1269 = MathUtils.anIntArray223[local1198.anInt3381];
									@Pc(1274) int local1274 = MathUtils.anIntArray225[local1198.anInt3381];
									@Pc(1284) int local1284 = local1188 * local1274 + local1264 * local1269 >> 16;
									@Pc(1295) int local1295 = local1274 * local1264 - local1188 * local1269 >> 16;
									local19 += local1295;
									local23 += local1284;
								}
							}
						}
						@Pc(1331) ProjAnim local1331 = new ProjAnim(local218, Static55.level, local23, local19, Static207.method3685(Static55.level, local23, local19) - local224, local232 + Static83.anInt372, local236 + Static83.anInt372, local247, local633, local45, local228);
						local1331.method3705(local31, local232 + Static83.anInt372, -local228 + Static207.method3685(Static55.level, local27, local31), local27);
						Static217.aClass69_116.method2282(new ProjAnimNode(local1331));
					}
				} else if (Static164.anInt3985 == 97) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g1();
					local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
					local19 = Static180.anInt4264 + (local15 & 0x7);
					local27 = Static57.aClass3_Sub15_Sub1_3.g2();
					if (local27 == 65535) {
						local27 = -1;
					}
					local31 = Static57.aClass3_Sub15_Sub1_3.g1();
					local39 = local31 >> 4 & 0xF;
					local218 = Static57.aClass3_Sub15_Sub1_3.g1();
					local45 = local31 & 0x7;
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
						local224 = local39 + 1;
						if (Static173.self.movementQueueX[0] >= local23 - local224 && local224 + local23 >= Static173.self.movementQueueX[0] && Static173.self.movementQueueZ[0] >= local19 - local224 && Static173.self.movementQueueZ[0] <= local224 + local19 && Static30.anInt978 != 0 && local45 > 0 && Static189.anInt4451 < 50 && local27 != -1) {
							Static200.anIntArray421[Static189.anInt4451] = local27;
							Static276.anIntArray563[Static189.anInt4451] = local45;
							Static164.anIntArray362[Static189.anInt4451] = local218;
							Static173.aClass138Array1[Static189.anInt4451] = null;
							Static26.anIntArray68[Static189.anInt4451] = local39 + (local23 << 16) + (local19 << 8);
							Static189.anInt4451++;
						}
					}
				} else if (Static164.anInt3985 == 240) {
					local15 = Static57.aClass3_Sub15_Sub1_3.g1ssub();
					local19 = Static180.anInt4264 + (local15 & 0x7);
					local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
					local27 = Static57.aClass3_Sub15_Sub1_3.g2();
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
						@Pc(1565) LinkedList local1565 = Static159.aClass69ArrayArrayArray1[Static55.level][local23][local19];
						if (local1565 != null) {
							for (@Pc(1572) ObjStackNode local1572 = (ObjStackNode) local1565.method2289(); local1572 != null; local1572 = (ObjStackNode) local1565.method2288()) {
								if (local1572.aClass8_Sub7_1.anInt5555 == (local27 & 0x7FFF)) {
									local1572.method4658();
									break;
								}
							}
							if (local1565.method2289() == null) {
								Static159.aClass69ArrayArrayArray1[Static55.level][local23][local19] = null;
							}
							Static220.method3797(local19, local23);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method1635(@OriginalArg(1) Js5 arg0) {
		Static166.anInt4049 = arg0.method4482(Static18.aClass100_106);
		Static130.anInt3161 = arg0.method4482(Static55.aClass100_377);
		Static73.anInt2077 = arg0.method4482(Static73.aClass100_454);
		Static280.anInt5900 = arg0.method4482(Static17.aClass100_102);
		Static131.anInt3261 = arg0.method4482(Static219.aClass100_920);
		Static36.anInt1165 = arg0.method4482(Static260.aClass100_944);
		Static214.anInt5579 = arg0.method4482(Static123.aClass100_592);
		Static34.anInt1049 = arg0.method4482(Static228.aClass100_968);
		Static202.anInt4741 = arg0.method4482(Static98.aClass100_524);
		Static149.anInt3551 = arg0.method4482(Static189.aClass100_835);
		Static19.anInt647 = arg0.method4482(Static259.aClass100_1075);
		Static32.anInt1016 = arg0.method4482(Static86.aClass100_490);
		Static78.anInt2147 = arg0.method4482(Static189.aClass100_837);
		Static124.anInt3083 = arg0.method4482(Static250.aClass100_1041);
		Static224.anInt5057 = arg0.method4482(Static27.aClass100_167);
		Static84.anInt2257 = arg0.method4482(Static18.aClass100_107);
		Static163.anInt3962 = arg0.method4482(Static280.aClass100_1108);
		Static128.anInt3143 = arg0.method4482(Static5.aClass100_9);
	}
}
