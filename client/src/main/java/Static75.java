import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public static int anInt2119 = 0;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void setDefaultChunksAtmosphere() {
		@Pc(9) Environment local9 = new Environment();
		for (@Pc(18) int local18 = 0; local18 < 13; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
				Static192.aClass92ArrayArray1[local18][local25] = local9;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!df;")
	public static WallDecor method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = SceneGraph.tiles[arg0][arg1][arg2];
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
		if (Protocol.opcode == 195) {
			local15 = Protocol.inboundBuffer.p1neg();
			local19 = local15 & 0x3;
			local23 = local15 >> 2;
			local27 = Static133.anIntArray453[local23];
			local31 = Protocol.inboundBuffer.g1();
			local39 = (local31 >> 4 & 0x7) + Static115.anInt2940;
			local45 = (local31 & 0x7) + Static180.anInt4264;
			if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
				Static29.method800(Player.level, local45, local19, local39, -1, -1, local27, local23, 0);
			}
		} else if (Protocol.opcode == 33) {
			local15 = Protocol.inboundBuffer.g2le();
			local23 = Protocol.inboundBuffer.g1();
			local27 = (local23 & 0x7) + Static180.anInt4264;
			local19 = (local23 >> 4 & 0x7) + Static115.anInt2940;
			local31 = Protocol.inboundBuffer.g2sub();
			if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104) {
				@Pc(122) ObjStack local122 = new ObjStack();
				local122.anInt5550 = local31;
				local122.anInt5555 = local15;
				if (Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] == null) {
					Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] = new LinkedList();
				}
				Static159.aClass69ArrayArrayArray1[Player.level][local19][local27].addTail(new ObjStackNode(local122));
				Static220.spawnGroundObject(local27, local19);
			}
		} else {
			@Pc(218) int local218;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(247) int local247;
			@Pc(224) int local224;
			@Pc(236) int local236;
			@Pc(317) ProjAnim local317;
			if (Protocol.opcode == 121) {
				local15 = Protocol.inboundBuffer.g1();
				local23 = Static115.anInt2940 * 2 + (local15 >> 4 & 0xF);
				local19 = (local15 & 0xF) + Static180.anInt4264 * 2;
				local27 = local23 + Protocol.inboundBuffer.g1s();
				local31 = Protocol.inboundBuffer.g1s() + local19;
				local39 = Protocol.inboundBuffer.g2s();
				local45 = Protocol.inboundBuffer.g2();
				local218 = Protocol.inboundBuffer.g1() * 4;
				local224 = Protocol.inboundBuffer.g1() * 4;
				local228 = Protocol.inboundBuffer.g2();
				local232 = Protocol.inboundBuffer.g2();
				local236 = Protocol.inboundBuffer.g1();
				if (local236 == 255) {
					local236 = -1;
				}
				local247 = Protocol.inboundBuffer.g1();
				if (local23 >= 0 && local19 >= 0 && local23 < 208 && local19 < 208 && local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local45 != 65535) {
					local31 *= 64;
					local27 = local27 * 64;
					local19 = local19 * 64;
					local23 = local23 * 64;
					local317 = new ProjAnim(local45, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local218, client.loop + local228, local232 + client.loop, local236, local247, local39, local224);
					local317.method3705(local31, client.loop + local228, -local224 + SceneGraph.getTileHeight(Player.level, local27, local31), local27);
					Static217.aClass69_116.addTail(new ProjAnimNode(local317));
				}
			} else if (Protocol.opcode == 17) {
				local15 = Protocol.inboundBuffer.g1();
				local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
				local19 = Static180.anInt4264 + (local15 & 0x7);
				local27 = Protocol.inboundBuffer.g2();
				local31 = Protocol.inboundBuffer.g1();
				local39 = Protocol.inboundBuffer.g2();
				if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
					local23 = local23 * 128 + 64;
					local19 = local19 * 128 + 64;
					@Pc(427) SpotAnim local427 = new SpotAnim(local27, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local31, local39, client.loop);
					Static99.aClass69_64.addTail(new SpotAnimNode(local427));
				}
			} else if (Protocol.opcode == 179) {
				local15 = Protocol.inboundBuffer.g1add();
				local23 = local15 >> 2;
				local19 = local15 & 0x3;
				local27 = Static133.anIntArray453[local23];
				local31 = Protocol.inboundBuffer.g1();
				local39 = Static115.anInt2940 + (local31 >> 4 & 0x7);
				local45 = (local31 & 0x7) + Static180.anInt4264;
				local218 = Protocol.inboundBuffer.g2sub();
				if (local39 >= 0 && local45 >= 0 && local39 < 104 && local45 < 104) {
					Static29.method800(Player.level, local45, local19, local39, -1, local218, local27, local23, 0);
				}
			} else if (Protocol.opcode == 20) {
				local15 = Protocol.inboundBuffer.g1ssub();
				local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
				local19 = Static180.anInt4264 + (local15 & 0x7);
				local27 = Protocol.inboundBuffer.g1ssub();
				local31 = local27 >> 2;
				local39 = local27 & 0x3;
				local45 = Static133.anIntArray453[local31];
				local218 = Protocol.inboundBuffer.g2le();
				if (local218 == 65535) {
					local218 = -1;
				}
				Static92.method1881(Player.level, local39, local31, local19, local45, local23, local218);
			} else {
				@Pc(633) int local633;
				if (Protocol.opcode == 202) {
					local15 = Protocol.inboundBuffer.g1();
					local23 = local15 >> 2;
					local19 = local15 & 0x3;
					local27 = Protocol.inboundBuffer.g1();
					local31 = (local27 >> 4 & 0x7) + Static115.anInt2940;
					local39 = (local27 & 0x7) + Static180.anInt4264;
					@Pc(605) byte local605 = Protocol.inboundBuffer.p1sub();
					@Pc(609) byte local609 = Protocol.inboundBuffer.p1sub();
					@Pc(613) byte local613 = Protocol.inboundBuffer.g1sub();
					local228 = Protocol.inboundBuffer.g2sub();
					local232 = Protocol.inboundBuffer.g2le();
					@Pc(625) byte local625 = Protocol.inboundBuffer.g1s();
					local247 = Protocol.inboundBuffer.g2();
					local633 = Protocol.inboundBuffer.g2lesadd();
					if (!GlRenderer.enabled) {
						Static170.method2574(local625, local247, local633, local232, local39, local613, local19, local605, local31, local23, local609, local228);
					}
				}
				if (Protocol.opcode == 14) {
					local15 = Protocol.inboundBuffer.g1();
					local19 = Static180.anInt4264 + (local15 & 0x7);
					local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
					local27 = Protocol.inboundBuffer.g2();
					local31 = Protocol.inboundBuffer.g2();
					local39 = Protocol.inboundBuffer.g2();
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
						@Pc(710) LinkedList local710 = Static159.aClass69ArrayArrayArray1[Player.level][local23][local19];
						if (local710 != null) {
							for (@Pc(718) ObjStackNode local718 = (ObjStackNode) local710.method2289(); local718 != null; local718 = (ObjStackNode) local710.method2288()) {
								@Pc(723) ObjStack local723 = local718.aClass8_Sub7_1;
								if ((local27 & 0x7FFF) == local723.anInt5555 && local31 == local723.anInt5550) {
									local723.anInt5550 = local39;
									break;
								}
							}
							Static220.spawnGroundObject(local19, local23);
						}
					}
				} else if (Protocol.opcode == 135) {
					local15 = Protocol.inboundBuffer.g2leadd();
					local23 = Protocol.inboundBuffer.p1neg();
					local27 = Static180.anInt4264 + (local23 & 0x7);
					local19 = (local23 >> 4 & 0x7) + Static115.anInt2940;
					local31 = Protocol.inboundBuffer.g2le();
					local39 = Protocol.inboundBuffer.g2le();
					if (local19 >= 0 && local27 >= 0 && local19 < 104 && local27 < 104 && PlayerList.selfId != local15) {
						@Pc(812) ObjStack local812 = new ObjStack();
						local812.anInt5550 = local31;
						local812.anInt5555 = local39;
						if (Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] == null) {
							Static159.aClass69ArrayArrayArray1[Player.level][local19][local27] = new LinkedList();
						}
						Static159.aClass69ArrayArrayArray1[Player.level][local19][local27].addTail(new ObjStackNode(local812));
						Static220.spawnGroundObject(local27, local19);
					}
				} else if (Protocol.opcode == 16) {
					local15 = Protocol.inboundBuffer.g1();
					local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
					local19 = (local15 & 0x7) + Static180.anInt4264;
					local27 = local23 + Protocol.inboundBuffer.g1s();
					local31 = Protocol.inboundBuffer.g1s() + local19;
					local39 = Protocol.inboundBuffer.g2s();
					local45 = Protocol.inboundBuffer.g2();
					local218 = Protocol.inboundBuffer.g1() * 4;
					local224 = Protocol.inboundBuffer.g1() * 4;
					local228 = Protocol.inboundBuffer.g2();
					local232 = Protocol.inboundBuffer.g2();
					local236 = Protocol.inboundBuffer.g1();
					local247 = Protocol.inboundBuffer.g1();
					if (local236 == 255) {
						local236 = -1;
					}
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104 && local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104 && local45 != 65535) {
						local31 = local31 * 128 + 64;
						local19 = local19 * 128 + 64;
						local23 = local23 * 128 + 64;
						local27 = local27 * 128 + 64;
						local317 = new ProjAnim(local45, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local218, local228 + client.loop, local232 + client.loop, local236, local247, local39, local224);
						local317.method3705(local31, client.loop + local228, SceneGraph.getTileHeight(Player.level, local27, local31) - local224, local27);
						Static217.aClass69_116.addTail(new ProjAnimNode(local317));
					}
				} else if (Protocol.opcode == 104) {
					local15 = Protocol.inboundBuffer.g1();
					local19 = Static180.anInt4264 * 2 + (local15 & 0xF);
					local23 = Static115.anInt2940 * 2 + (local15 >> 4 & 0xF);
					local27 = Protocol.inboundBuffer.g1s() + local23;
					local31 = Protocol.inboundBuffer.g1s() + local19;
					local39 = Protocol.inboundBuffer.g2s();
					local45 = Protocol.inboundBuffer.g2s();
					local218 = Protocol.inboundBuffer.g2();
					local224 = Protocol.inboundBuffer.g1s();
					local228 = Protocol.inboundBuffer.g1() * 4;
					local232 = Protocol.inboundBuffer.g2();
					local236 = Protocol.inboundBuffer.g2();
					local247 = Protocol.inboundBuffer.g1();
					local633 = Protocol.inboundBuffer.g1();
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
								local1198 = NpcList.npcs[local1188];
							} else {
								local1184 = -local39 - 1;
								local1194 = local1184 >> 11 & 0xF;
								local1188 = local1184 & 0x7FF;
								if (PlayerList.selfId == local1188) {
									local1198 = PlayerList.self;
								} else {
									local1198 = PlayerList.players[local1188];
								}
							}
							if (local1198 != null) {
								@Pc(1232) BasType local1232 = local1198.method2681();
								if (local1232.modelRotateTranslate != null && local1232.modelRotateTranslate[local1194] != null) {
									local1188 = local1232.modelRotateTranslate[local1194][0];
									local224 -= local1232.modelRotateTranslate[local1194][1];
									@Pc(1264) int local1264 = local1232.modelRotateTranslate[local1194][2];
									@Pc(1269) int local1269 = MathUtils.sin[local1198.anInt3381];
									@Pc(1274) int local1274 = MathUtils.cos[local1198.anInt3381];
									@Pc(1284) int local1284 = local1188 * local1274 + local1264 * local1269 >> 16;
									@Pc(1295) int local1295 = local1274 * local1264 - local1188 * local1269 >> 16;
									local19 += local1295;
									local23 += local1284;
								}
							}
						}
						@Pc(1331) ProjAnim local1331 = new ProjAnim(local218, Player.level, local23, local19, SceneGraph.getTileHeight(Player.level, local23, local19) - local224, local232 + client.loop, local236 + client.loop, local247, local633, local45, local228);
						local1331.method3705(local31, local232 + client.loop, -local228 + SceneGraph.getTileHeight(Player.level, local27, local31), local27);
						Static217.aClass69_116.addTail(new ProjAnimNode(local1331));
					}
				} else if (Protocol.opcode == 97) {
					local15 = Protocol.inboundBuffer.g1();
					local23 = Static115.anInt2940 + (local15 >> 4 & 0x7);
					local19 = Static180.anInt4264 + (local15 & 0x7);
					local27 = Protocol.inboundBuffer.g2();
					if (local27 == 65535) {
						local27 = -1;
					}
					local31 = Protocol.inboundBuffer.g1();
					local39 = local31 >> 4 & 0xF;
					local218 = Protocol.inboundBuffer.g1();
					local45 = local31 & 0x7;
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
						local224 = local39 + 1;
						if (PlayerList.self.movementQueueX[0] >= local23 - local224 && local224 + local23 >= PlayerList.self.movementQueueX[0] && PlayerList.self.movementQueueZ[0] >= local19 - local224 && PlayerList.self.movementQueueZ[0] <= local224 + local19 && Preferences.ambientSoundsVolume != 0 && local45 > 0 && SoundPlayer.anInt4451 < 50 && local27 != -1) {
							SoundPlayer.anIntArray421[SoundPlayer.anInt4451] = local27;
							SoundPlayer.anIntArray563[SoundPlayer.anInt4451] = local45;
							SoundPlayer.anIntArray362[SoundPlayer.anInt4451] = local218;
							SoundPlayer.aClass138Array1[SoundPlayer.anInt4451] = null;
							SoundPlayer.anIntArray68[SoundPlayer.anInt4451] = local39 + (local23 << 16) + (local19 << 8);
							SoundPlayer.anInt4451++;
						}
					}
				} else if (Protocol.opcode == 240) {
					local15 = Protocol.inboundBuffer.g1ssub();
					local19 = Static180.anInt4264 + (local15 & 0x7);
					local23 = (local15 >> 4 & 0x7) + Static115.anInt2940;
					local27 = Protocol.inboundBuffer.g2();
					if (local23 >= 0 && local19 >= 0 && local23 < 104 && local19 < 104) {
						@Pc(1565) LinkedList local1565 = Static159.aClass69ArrayArrayArray1[Player.level][local23][local19];
						if (local1565 != null) {
							for (@Pc(1572) ObjStackNode local1572 = (ObjStackNode) local1565.method2289(); local1572 != null; local1572 = (ObjStackNode) local1565.method2288()) {
								if (local1572.aClass8_Sub7_1.anInt5555 == (local27 & 0x7FFF)) {
									local1572.unlink();
									break;
								}
							}
							if (local1565.method2289() == null) {
								Static159.aClass69ArrayArrayArray1[Player.level][local23][local19] = null;
							}
							Static220.spawnGroundObject(local19, local23);
						}
					}
				}
			}
		}
	}

}
