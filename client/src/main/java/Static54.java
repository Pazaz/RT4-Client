import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!na;")
	public static final JagString aClass100_374 = JagString.parse("details");

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "Lclient!na;")
	public static final JagString aClass100_375 = JagString.parse("<)4col> x");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	public static void method1304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (InterfaceList.load(arg1)) {
			Static2.method7(InterfaceList.components[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIILclient!be;)V")
	public static void method1305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		client.audioLoop();
		if (GlRenderer.enabled) {
			Static46.method1187(arg2, arg1, arg2 + arg3.anInt445, arg1 + arg3.anInt459);
		} else {
			SoftwareRaster.method2496(arg2, arg1, arg2 + arg3.anInt445, arg1 + arg3.anInt459);
		}
		if (Static270.anInt5795 != 2 && Static270.anInt5795 != 5 && Static89.aClass3_Sub2_Sub1_5 != null) {
			@Pc(48) int local48 = Static59.anInt1814 + (int)Camera.yawTarget & 0x7FF;
			@Pc(57) int local57 = PlayerList.self.xFine / 32 + 48;
			@Pc(67) int local67 = 464 - PlayerList.self.zFine / 32;
			if (GlRenderer.enabled) {
				((GlSprite) Static89.aClass3_Sub2_Sub1_5).method1427(arg2, arg1, arg3.anInt445, arg3.anInt459, local57, local67, local48, Static273.anInt4130 + 256, (GlSprite) arg3.method489(false));
			} else {
				((SoftwareSprite) Static89.aClass3_Sub2_Sub1_5).method310(arg2, arg1, arg3.anInt445, arg3.anInt459, local57, local67, local48, Static273.anInt4130 + 256, arg3.anIntArray37, arg3.anIntArray45);
			}
			@Pc(146) int local146;
			@Pc(181) int local181;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(231) int local231;
			@Pc(200) int local200;
			@Pc(239) int local239;
			@Pc(271) int local271;
			if (Static235.mapElementList != null) {
				for (@Pc(117) int local117 = 0; local117 < Static235.mapElementList.anInt5074; local117++) {
					if (Static235.mapElementList.method3892(local117)) {
						local146 = (Static235.mapElementList.aShortArray73[local117] - Static225.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						local150 = MathUtils.sin[local48];
						local154 = MathUtils.cos[local48];
						@Pc(156) Font local156 = Fonts.p11Full;
						@Pc(164) int local164 = local150 * 256 / (Static273.anInt4130 + 256);
						local181 = (Static235.mapElementList.aShortArray72[local117] - Static142.originZ) * 4 + 2 - PlayerList.self.zFine / 32;
						@Pc(189) int local189 = local154 * 256 / (Static273.anInt4130 + 256);
						local200 = local181 * local189 - local146 * local164 >> 16;
						if (Static235.mapElementList.method3894(local117) == 1) {
							local156 = Fonts.p12Full;
						}
						if (Static235.mapElementList.method3894(local117) == 2) {
							local156 = Fonts.b12Full;
						}
						local231 = local164 * local181 + local189 * local146 >> 16;
						local239 = local156.method2856(Static235.mapElementList.aClass100Array153[local117], 100);
						@Pc(245) int local245 = local231 - local239 / 2;
						if (local245 >= -arg3.anInt445 && local245 <= arg3.anInt445 && local200 >= -arg3.anInt459 && local200 <= arg3.anInt459) {
							local271 = 16777215;
							if (Static235.mapElementList.anIntArray444[local117] != -1) {
								local271 = Static235.mapElementList.anIntArray444[local117];
							}
							if (GlRenderer.enabled) {
								Static46.method1188((GlSprite) arg3.method489(false));
							} else {
								SoftwareRaster.method2486(arg3.anIntArray37, arg3.anIntArray45);
							}
							local156.renderParagraphAlpha(Static235.mapElementList.aClass100Array153[local117], arg2 + local245 + arg3.anInt445 / 2, arg1 + arg3.anInt459 / 2 + -local200, local239, 50, local271, 0, 1, 0, 0);
							if (GlRenderer.enabled) {
								Static46.method1173();
							} else {
								SoftwareRaster.method2482();
							}
						}
					}
				}
			}
			for (local146 = 0; local146 < Static251.anInt5454; local146++) {
				local181 = Static145.anIntArray331[local146] * 4 + 2 - PlayerList.self.xFine / 32;
				local150 = Static93.anIntArray219[local146] * 4 + 2 - PlayerList.self.zFine / 32;
				@Pc(382) LocType local382 = LocTypeList.get(Static199.anIntArray417[local146]);
				if (local382.multiLocs != null) {
					local382 = local382.getMultiLoc();
					if (local382 == null || local382.mapElement == -1) {
						continue;
					}
				}
				Static60.method1446(arg3, Static67.mapfuncs[local382.mapElement], local150, local181, arg1, arg2);
			}
			for (local146 = 0; local146 < 104; local146++) {
				for (local181 = 0; local181 < 104; local181++) {
					@Pc(439) LinkedList local439 = Static159.aClass69ArrayArrayArray1[Player.level][local146][local181];
					if (local439 != null) {
						local154 = local146 * 4 + 2 - PlayerList.self.xFine / 32;
						local231 = local181 * 4 + 2 - PlayerList.self.zFine / 32;
						Static60.method1446(arg3, Sprites.mapdots[0], local231, local154, arg1, arg2);
					}
				}
			}
			for (local146 = 0; local146 < Static272.anInt5214; local146++) {
				@Pc(498) Npc local498 = Static175.npcs[Static33.anIntArray79[local146]];
				if (local498 != null && local498.method2682()) {
					@Pc(507) NpcType local507 = local498.type;
					if (local507 != null && local507.multiNpcs != null) {
						local507 = local507.getMultiNpc();
					}
					if (local507 != null && local507.aBoolean184 && local507.aBoolean183) {
						local154 = local498.xFine / 32 - PlayerList.self.xFine / 32;
						local231 = local498.zFine / 32 - PlayerList.self.zFine / 32;
						if (local507.anInt3739 == -1) {
							Static60.method1446(arg3, Sprites.mapdots[1], local231, local154, arg1, arg2);
						} else {
							Static60.method1446(arg3, Static67.mapfuncs[local507.anInt3739], local231, local154, arg1, arg2);
						}
					}
				}
			}
			for (local146 = 0; local146 < PlayerList.size; local146++) {
				@Pc(591) Player local591 = PlayerList.players[PlayerList.ids[local146]];
				if (local591 != null && local591.method2682()) {
					local154 = local591.zFine / 32 - PlayerList.self.zFine / 32;
					local150 = local591.xFine / 32 - PlayerList.self.xFine / 32;
					@Pc(624) long local624 = local591.username.encode37();
					@Pc(626) boolean local626 = false;
					for (local239 = 0; local239 < Static9.anInt178; local239++) {
						if (local624 == Static92.aLongArray3[local239] && Static104.anIntArray255[local239] != 0) {
							local626 = true;
							break;
						}
					}
					@Pc(660) boolean local660 = false;
					for (local271 = 0; local271 < Static214.anInt5577; local271++) {
						if (local624 == Static199.aClass3_Sub22Array1[local271].key) {
							local660 = true;
							break;
						}
					}
					@Pc(682) boolean local682 = false;
					if (PlayerList.self.anInt1650 != 0 && local591.anInt1650 != 0 && local591.anInt1650 == PlayerList.self.anInt1650) {
						local682 = true;
					}
					if (local626) {
						Static60.method1446(arg3, Sprites.mapdots[3], local154, local150, arg1, arg2);
					} else if (local660) {
						Static60.method1446(arg3, Sprites.mapdots[5], local154, local150, arg1, arg2);
					} else if (local682) {
						Static60.method1446(arg3, Sprites.mapdots[4], local154, local150, arg1, arg2);
					} else {
						Static60.method1446(arg3, Sprites.mapdots[2], local154, local150, arg1, arg2);
					}
				}
			}
			@Pc(756) Class102[] local756 = Static143.aClass102Array1;
			for (local181 = 0; local181 < local756.length; local181++) {
				@Pc(770) Class102 local770 = local756[local181];
				if (local770 != null && local770.anInt4058 != 0 && client.loop % 20 < 10) {
					if (local770.anInt4058 == 1 && local770.anInt4057 >= 0 && local770.anInt4057 < Static175.npcs.length) {
						@Pc(804) Npc local804 = Static175.npcs[local770.anInt4057];
						if (local804 != null) {
							local231 = local804.xFine / 32 - PlayerList.self.xFine / 32;
							local200 = local804.zFine / 32 - PlayerList.self.zFine / 32;
							Static97.method1960(local770.anInt4048, arg1, arg2, local231, local200, arg3);
						}
					}
					if (local770.anInt4058 == 2) {
						local154 = (local770.anInt4053 - Static225.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						local231 = (-Static142.originZ + local770.anInt4046) * 4 + 2 - PlayerList.self.zFine / 32;
						Static97.method1960(local770.anInt4048, arg1, arg2, local154, local231, arg3);
					}
					if (local770.anInt4058 == 10 && local770.anInt4057 >= 0 && PlayerList.players.length > local770.anInt4057) {
						@Pc(905) Player local905 = PlayerList.players[local770.anInt4057];
						if (local905 != null) {
							local200 = local905.zFine / 32 - PlayerList.self.zFine / 32;
							local231 = local905.xFine / 32 - PlayerList.self.xFine / 32;
							Static97.method1960(local770.anInt4048, arg1, arg2, local231, local200, arg3);
						}
					}
				}
			}
			if (Static115.anInt2939 != 0) {
				local146 = Static115.anInt2939 * 4 + 2 - PlayerList.self.xFine / 32;
				local181 = Static84.anInt2255 * 4 + 2 - PlayerList.self.zFine / 32;
				Static60.method1446(arg3, Sprites.mapflags, local181, local146, arg1, arg2);
			}
			if (GlRenderer.enabled) {
				Static46.method1186(arg2 + arg3.anInt445 / 2 - 1, arg1 + -1 - -(arg3.anInt459 / 2), 3, 3, 16777215);
			} else {
				SoftwareRaster.fillRect(arg3.anInt445 / 2 + arg2 - 1, arg3.anInt459 / 2 + -1 + arg1, 3, 3, 16777215);
			}
		} else if (GlRenderer.enabled) {
			@Pc(1041) Sprite local1041 = arg3.method489(false);
			if (local1041 != null) {
				local1041.method1423(arg2, arg1);
			}
		} else {
			SoftwareRaster.method2504(arg2, arg1, arg3.anIntArray37, arg3.anIntArray45);
		}
		InterfaceList.rectangleRedraw[arg0] = true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIII)V")
	public static void method1306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static172.anInt4164 && arg3 <= Static224.anInt5063) {
			@Pc(22) int local22 = Static78.method1690(Static106.anInt2869, arg1, Static267.anInt5773);
			@Pc(28) int local28 = Static78.method1690(Static106.anInt2869, arg0, Static267.anInt5773);
			Static101.method2054(local22, arg3, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([SI[Lclient!na;II)V")
	public static void method1307(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = arg3;
		@Pc(21) int local21 = (arg3 + arg1) / 2;
		@Pc(25) JagString local25 = arg2[local21];
		arg2[local21] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) short local39 = arg0[local21];
		arg0[local21] = arg0[arg1];
		arg0[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (local25 == null || arg2[local51] != null && arg2[local51].method3139(local25) < (local51 & 0x1)) {
				@Pc(80) JagString local80 = arg2[local51];
				arg2[local51] = arg2[local14];
				arg2[local14] = local80;
				@Pc(94) short local94 = arg0[local51];
				arg0[local51] = arg0[local14];
				arg0[local14++] = local94;
			}
		}
		arg2[arg1] = arg2[local14];
		arg2[local14] = local25;
		arg0[arg1] = arg0[local14];
		arg0[local14] = local39;
		method1307(arg0, local14 - 1, arg2, arg3);
		method1307(arg0, arg1, arg2, local14 + 1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
	public static int method1309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!ba;")
	public static World getWorld(@OriginalArg(1) int arg0) {
		return WorldList.loaded && arg0 >= WorldList.minId && arg0 <= WorldList.maxId ? WorldList.worlds[arg0 - WorldList.minId] : null;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
	public static void loop() {
		for (@Pc(5) int local5 = 0; local5 < SoundPlayer.anInt4451; local5++) {
			@Pc(12) int local12 = SoundPlayer.anIntArray362[local5]--;
			if (SoundPlayer.anIntArray362[local5] >= -10) {
				@Pc(79) SynthSound local79 = SoundPlayer.aClass138Array1[local5];
				if (local79 == null) {
					local79 = SynthSound.create(client.js5Archive4, SoundPlayer.anIntArray421[local5], 0);
					if (local79 == null) {
						continue;
					}
					SoundPlayer.anIntArray362[local5] += local79.method3990();
					SoundPlayer.aClass138Array1[local5] = local79;
				}
				if (SoundPlayer.anIntArray362[local5] < 0) {
					@Pc(209) int local209;
					if (SoundPlayer.anIntArray68[local5] == 0) {
						local209 = Preferences.soundEffectVolume;
					} else {
						@Pc(125) int local125 = (SoundPlayer.anIntArray68[local5] & 0xFF) * 128;
						@Pc(133) int local133 = SoundPlayer.anIntArray68[local5] >> 8 & 0xFF;
						@Pc(141) int local141 = SoundPlayer.anIntArray68[local5] >> 16 & 0xFF;
						@Pc(151) int local151 = local133 * 128 + 64 - PlayerList.self.zFine;
						if (local151 < 0) {
							local151 = -local151;
						}
						@Pc(167) int local167 = local141 * 128 + 64 - PlayerList.self.xFine;
						if (local167 < 0) {
							local167 = -local167;
						}
						@Pc(180) int local180 = local167 + local151 - 128;
						if (local125 < local180) {
							SoundPlayer.anIntArray362[local5] = -100;
							continue;
						}
						if (local180 < 0) {
							local180 = 0;
						}
						local209 = Preferences.ambientSoundsVolume * (local125 - local180) / local125;
					}
					if (local209 > 0) {
						@Pc(223) PcmSound local223 = local79.method3989().method2648(client.resampler);
						@Pc(228) SoundPcmStream local228 = Static284.method404(local223, local209);
						local228.method396(SoundPlayer.anIntArray563[local5] - 1);
						client.soundStream.method1343(local228);
					}
					SoundPlayer.anIntArray362[local5] = -100;
				}
			} else {
				SoundPlayer.anInt4451--;
				for (@Pc(28) int local28 = local5; local28 < SoundPlayer.anInt4451; local28++) {
					SoundPlayer.anIntArray421[local28] = SoundPlayer.anIntArray421[local28 + 1];
					SoundPlayer.aClass138Array1[local28] = SoundPlayer.aClass138Array1[local28 + 1];
					SoundPlayer.anIntArray563[local28] = SoundPlayer.anIntArray563[local28 + 1];
					SoundPlayer.anIntArray362[local28] = SoundPlayer.anIntArray362[local28 + 1];
					SoundPlayer.anIntArray68[local28] = SoundPlayer.anIntArray68[local28 + 1];
				}
				local5--;
			}
		}
		if (MidiPlayer.jingle && !Static136.method2655()) {
			if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1) {
				Static122.method2410(client.js5Archive6, MusicPlayer.groupId, Preferences.musicVolume);
			}
			MidiPlayer.jingle = false;
		} else if (Preferences.musicVolume != 0 && MusicPlayer.groupId != -1 && !Static136.method2655()) {
			Protocol.outboundBuffer.p1isaac(137);
			Protocol.outboundBuffer.p4(MusicPlayer.groupId);
			MusicPlayer.groupId = -1;
		}
	}
}
