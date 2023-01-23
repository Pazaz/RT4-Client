package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import plugin.PluginRepository;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

public final class ScriptRunner {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[Lclient!na;")
	public static final JagString[] stringStack = new JagString[1000];
	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	public static final int[] intStack = new int[1000];
	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lclient!na;")
	public static final JagString EMPTY_STRING = JagString.parse("");
	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!na;")
	public static final JagString aClass100_74 = JagString.parse("::");
	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Lclient!na;")
	public static final JagString EVENT_OPBASE = JagString.parse("event_opbase");
	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!na;")
	public static final JagString aClass100_253 = JagString.parse("(U0a )2 via: ");
	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!na;")
	public static final JagString aClass100_446 = JagString.parse("<img=0>");
	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_780 = JagString.parse("Clientscript error in: ");
	@OriginalMember(owner = "client!hm", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_537 = JagString.parse("<img=1>");
	@OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();
	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!na;")
	public static final JagString CS_ERROR = JagString.parse("Clientscript error )2 check log for details");
	@OriginalMember(owner = "client!fe", name = "nc", descriptor = "[Lclient!hj;")
	public static final GoSubFrame[] callStack = new GoSubFrame[50];
	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
	public static final int[] anIntArray140 = new int[5];
	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[5][5000];
	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "Lclient!na;")
	public static final JagString aClass100_928 = JagString.parse("(U0a )2 in: ");
	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_639 = JagString.parse(" ");
	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!na;")
	public static final JagString aClass100_268 = JagString.parse(")4");
	@OriginalMember(owner = "client!he", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_518 = JagString.parse("www");
	@OriginalMember(owner = "client!e", name = "Tc", descriptor = "Lclient!na;")
	public static final JagString aClass100_365 = JagString.parse("www)2wtqa");
	@OriginalMember(owner = "client!lk", name = "J", descriptor = "Lclient!na;")
	public static final JagString aClass100_687 = JagString.parse(")4p=");
	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_424 = JagString.parse("http:)4)4");
	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_886 = JagString.parse(")3runescape)3com)4l=");
	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_98 = JagString.parse(")4a=");
	@OriginalMember(owner = "client!ch", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[104][104];
	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_767 = JagString.parse(")2");
	@OriginalMember(owner = "client!je", name = "U", descriptor = "Lclient!na;")
	public static final JagString aClass100_588 = JagString.parse("showingVideoAd");
	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_802 = JagString.parse("(U0a )2 non)2existant gosub script)2num: ");
	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_10 = JagString.parse("<br>");
	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!bd;")
	public static QuickChatPhrase activePhrase;
	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!be;")
	public static Component staticActiveComponent1;
	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!be;")
	public static Component staticActiveComponent2;
	@OriginalMember(owner = "client!og", name = "g", descriptor = "[Lclient!na;")
	public static JagString[] stringLocals;
	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
	public static int[] intLocals;
	@OriginalMember(owner = "client!km", name = "ad", descriptor = "I")
	public static int fp = 0;
	@OriginalMember(owner = "client!od", name = "g", descriptor = "S")
	public static short aShort25 = 256;
	@OriginalMember(owner = "client!an", name = "db", descriptor = "S")
	public static short aShort9 = 205;
	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "S")
	public static short aShort22 = 1;
	@OriginalMember(owner = "client!ac", name = "k", descriptor = "S")
	public static short aShort1 = 32767;
	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static int anInt4055 = 0;
	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public static int anInt5377 = 0;
	@OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
	public static int anInt773 = 0;
	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt983 = 0;
	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static int anInt5029 = 0;
	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "S")
	public static short aShort21 = 32767;
	@OriginalMember(owner = "client!ee", name = "f", descriptor = "S")
	public static short aShort12 = 1;
	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public static int anInt3325 = 0;
	@OriginalMember(owner = "client!bi", name = "jb", descriptor = "Z")
	public static boolean aBoolean43 = true;
	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public static int anInt5794 = -1;
	@OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
	public static boolean neverRemoveRoofs = false;
	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;
	@OriginalMember(owner = "client!vg", name = "b", descriptor = "S")
	public static short aShort30 = 256;
	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Z")
	public static boolean aBoolean299 = false;
	@OriginalMember(owner = "client!lj", name = "z", descriptor = "[I")
	public static int[] anIntArray338 = new int[2];
	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
	public static int[] anIntArray518 = new int[2];
	@OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
	public static int[] anIntArray476 = new int[2];
	@OriginalMember(owner = "client!e", name = "xc", descriptor = "[I")
	public static int[] anIntArray134 = new int[2];
	@OriginalMember(owner = "client!ge", name = "k", descriptor = "[I")
	public static int[] anIntArray205 = new int[2];
	@OriginalMember(owner = "client!nm", name = "W", descriptor = "Lclient!na;")
	public static JagString url;
	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public static int anInt548 = -1;
	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "S")
	public static short aShort27 = 320;
	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public static int anInt1951 = -1;
	@OriginalMember(owner = "client!em", name = "w", descriptor = "I")
	public static int anInt1892;
	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	public static int anInt3751;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (GlRenderer.enabled) {
			@Pc(25) int local25 = arg2 - 334;
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 100) {
				local25 = 100;
			}
			@Pc(51) int local51 = local25 * (aShort9 - aShort25) / 100 + aShort25;
			if (aShort22 > local51) {
				local51 = aShort22;
			} else if (aShort1 < local51) {
				local51 = aShort1;
			}
			@Pc(73) int local73 = local51 * arg2 * 512 / (arg0 * 334);
			@Pc(115) int local115;
			@Pc(122) int local122;
			@Pc(86) short local86;
			if (local73 < aShort12) {
				local86 = aShort12;
				local51 = arg0 * 334 * local86 / (arg2 * 512);
				if (aShort1 < local51) {
					local51 = aShort1;
					local115 = arg2 * 512 * local51 / (local86 * 334);
					local122 = (arg0 - local115) / 2;
					if (arg4) {
						GlRaster.method1177();
						GlRaster.fillRect(arg3, arg1, local122, arg2, 0);
						GlRaster.fillRect(arg0 + arg3 - local122, arg1, local122, arg2, 0);
					}
					arg3 += local122;
					arg0 -= local122 * 2;
				}
			} else if (aShort21 < local73) {
				local86 = aShort21;
				local51 = local86 * arg0 * 334 / (arg2 * 512);
				if (aShort22 > local51) {
					local51 = aShort22;
					local115 = local86 * arg0 * 334 / (local51 * 512);
					local122 = (arg2 - local115) / 2;
					if (arg4) {
						GlRaster.method1177();
						GlRaster.fillRect(arg3, arg1, arg0, local122, 0);
						GlRaster.fillRect(arg3, arg1 + arg2 - local122, arg0, local122, 0);
					}
					arg2 -= local122 * 2;
					arg1 += local122;
				}
			}
			anInt5029 = local51 * arg2 / 334;
		}
		anInt4055 = (short) arg0;
		anInt5377 = (short) arg2;
		anInt773 = arg1;
		anInt983 = arg3;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		anInt3325++;
		method3711();
		if (!arg1) {
			method964(true);
			method3240(true);
			method964(false);
		}
		method3240(false);
		if (!arg1) {
			updateSceneProjectiles();
		}
		method4239();
		if (GlRenderer.enabled) {
			method2314(arg3, arg4, arg0, arg2, true);
			arg2 = anInt983;
			arg4 = anInt773;
			arg3 = anInt4055;
			arg0 = anInt5377;
		}
		@Pc(59) int local59;
		@Pc(57) int local57;
		if (Camera.cameraType == 1) {
			local57 = Camera.anInt5161 + (int) Camera.yawTarget & 0x7FF;
			local59 = (int) Camera.pitchTarget;
			if (local59 < Camera.anInt5245 / 256) {
				local59 = Camera.anInt5245 / 256;
			}
			if (Camera.customCameraActive[4] && Camera.cameraAmplitude[4] + 128 > local59) {
				local59 = Camera.cameraAmplitude[4] + 128;
			}
			Camera.method555(Camera.cameraX, arg0, SceneGraph.getTileHeight(Player.plane, PlayerList.self.xFine, PlayerList.self.zFine) - 50, Camera.ZOOM - -(local59 * 3), local57, Camera.cameraZ, local59);
		}
		local57 = Camera.anInt40;
		local59 = Camera.renderX;
		@Pc(121) int local121 = Camera.renderZ;
		@Pc(123) int local123 = Camera.cameraPitch;
		@Pc(125) int local125 = Camera.cameraYaw;
		@Pc(127) int local127;
		@Pc(171) int local171;
		for (local127 = 0; local127 < 5; local127++) {
			if (Camera.customCameraActive[local127]) {
				local171 = (int) ((double) -Camera.cameraJitter[local127] + (double) (Camera.cameraJitter[local127] * 2 + 1) * Math.random() + Math.sin((double) Protocol.anIntArray76[local127] * ((double) Camera.cameraFrequency[local127] / 100.0D)) * (double) Camera.cameraAmplitude[local127]);
				if (local127 == 3) {
					Camera.cameraYaw = local171 + Camera.cameraYaw & 0x7FF;
				}
				if (local127 == 4) {
					Camera.cameraPitch += local171;
					if (Camera.cameraPitch < 128) {
						Camera.cameraPitch = 128;
					}
					if (Camera.cameraPitch > 383) {
						Camera.cameraPitch = 383;
					}
				}
				if (local127 == 2) {
					Camera.renderZ += local171;
				}
				if (local127 == 1) {
					Camera.anInt40 += local171;
				}
				if (local127 == 0) {
					Camera.renderX += local171;
				}
			}
		}
		method4302();
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg2, arg4, arg2 + arg3, arg4 - -arg0);
			@Pc(248) float local248 = (float) Camera.cameraPitch * 0.17578125F;
			@Pc(253) float local253 = (float) Camera.cameraYaw * 0.17578125F;
			if (Camera.cameraType == 3) {
				local248 = Camera.aFloat15 * 360.0F / 6.2831855F;
				local253 = Camera.aFloat10 * 360.0F / 6.2831855F;
			}
			GlRenderer.method4171(arg2, arg4, arg3, arg0, arg3 / 2 + arg2, arg4 - -(arg0 / 2), local248, local253, anInt5029, anInt5029);
		} else {
			SoftwareRaster.setClip(arg2, arg4, arg3 + arg2, arg0 + arg4);
			Rasteriser.prepare();
		}
		if (Cs1ScriptRunner.aBoolean108 || anInt3751 < arg2 || anInt3751 >= arg3 + arg2 || arg4 > anInt1892 || arg0 + arg4 <= anInt1892) {
			RawModel.allowInput = false;
			MiniMenu.anInt7 = 0;
		} else {
			RawModel.allowInput = true;
			MiniMenu.anInt7 = 0;
			local171 = Rasteriser.screenUpperX;
			@Pc(344) int local344 = Rasteriser.screenLowerY;
			local127 = Rasteriser.screenLowerX;
			GlModel.anInt3582 = local127 + (local171 - local127) * (-arg2 + anInt3751) / arg3;
			@Pc(361) int local361 = Rasteriser.screenUpperY;
			RawModel.anInt1053 = (local361 - local344) * (anInt1892 - arg4) / arg0 + local344;
		}
		client.audioLoop();
		@Pc(387) byte local387 = method4047() == 2 ? (byte) anInt3325 : 1;
		if (GlRenderer.enabled) {
			GlRenderer.restoreLighting();
			GlRenderer.setDepthTestEnabled(true);
			GlRenderer.setFogEnabled(true);
			if (client.gameState == 10) {
				local171 = FogManager.method2235(Protocol.sceneDelta, Camera.renderZ >> 10, Preferences.brightness, Camera.renderX >> 10);
			} else {
				local171 = FogManager.method2235(Protocol.sceneDelta, PlayerList.self.movementQueueZ[0] >> 3, Preferences.brightness, PlayerList.self.movementQueueX[0] >> 3);
			}
			LightingManager.method2394(client.loop, !Preferences.flickeringEffectsOn);
			GlRenderer.clearColorAndDepthBuffers(local171);
			MaterialManager.method2731(Camera.cameraPitch, Camera.renderZ, Camera.anInt40, Camera.renderX, Camera.cameraYaw);
			GlRenderer.anInt5323 = client.loop;
			SceneGraph.method2954(Camera.renderX, Camera.anInt40, Camera.renderZ, Camera.cameraPitch, Camera.cameraYaw, aByteArrayArrayArray15, anIntArray205, anIntArray338, anIntArray518, anIntArray134, anIntArray476, Player.plane + 1, local387, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7);
			aBoolean299 = true;
			LightingManager.method2390();
			MaterialManager.method2731(0, 0, 0, 0, 0);
			client.audioLoop();
			method3858();
			drawOverheads(arg4, arg3, arg2, anInt5029, arg0, anInt5029);
			MiniMap.method4000(arg3, arg2, arg0, anInt5029, anInt5029, arg4);
		} else {
			SoftwareRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			SceneGraph.method2954(Camera.renderX, Camera.anInt40, Camera.renderZ, Camera.cameraPitch, Camera.cameraYaw, aByteArrayArrayArray15, anIntArray205, anIntArray338, anIntArray518, anIntArray134, anIntArray476, Player.plane + 1, local387, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7);
			client.audioLoop();
			method3858();
			drawOverheads(arg4, arg3, arg2, 256, arg0, 256);
			MiniMap.method4000(arg3, arg2, arg0, 256, 256, arg4);
		}
		((Js5GlTextureProvider) Rasteriser.textureProvider).method3239(Protocol.sceneDelta);
		Player.method2310(arg3, arg4, arg0, arg2);
		Camera.cameraPitch = local123;
		Camera.renderZ = local121;
		Camera.anInt40 = local57;
		Camera.renderX = local59;
		Camera.cameraYaw = local125;
		if (aBoolean43 && client.js5NetQueue.getUrgentRequestCount() == 0) {
			aBoolean43 = false;
		}
		if (aBoolean43) {
			if (GlRenderer.enabled) {
				GlRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			} else {
				SoftwareRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			}
			Fonts.drawTextOnScreen(false, LocalizedText.LOADING);
		}
		if (!arg1 && !aBoolean43 && !Cs1ScriptRunner.aBoolean108 && arg2 <= anInt3751 && arg3 + arg2 > anInt3751 && arg4 <= anInt1892 && arg0 + arg4 > anInt1892) {
			MiniMenu.addEntries(arg4, arg3, arg0, arg2, anInt1892, anInt3751);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void drawOverheads(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OverheadChat.size = 0;
		@Pc(5) int local5;
		@Pc(642) int local642;
		@Pc(74) int local74;
		@Pc(265) int local265;
		@Pc(310) int local310;
		@Pc(359) int local359;
		@Pc(639) int local639;
		for (local5 = -1; local5 < PlayerList.size + NpcList.size; local5++) {
			@Pc(17) PathingEntity entity;
			if (local5 == -1) {
				entity = PlayerList.self;
			} else if (PlayerList.size > local5) {
				entity = PlayerList.players[PlayerList.ids[local5]];
			} else {
				entity = NpcList.npcs[NpcList.ids[local5 - PlayerList.size]];
			}
			if (entity != null && entity.isVisible()) {
				setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, entity.method2691() + 15, arg1 >> 1);
				if (local5 >= PlayerList.size) {
					PluginRepository.NPCOverheadDraw((Npc) entity,arg2 + anInt1951, arg0 + anInt548);
				} else {
					PluginRepository.PlayerOverheadDraw((Player) entity,arg2 + anInt1951, arg0 + anInt548);
				}

				@Pc(58) NpcType local58;
				if (entity instanceof Npc) {
					local58 = ((Npc) entity).type;
					if (local58.multiNpcs != null) {
						local58 = local58.getMultiNpc();
					}
					if (local58 == null) {
						continue;
					}
				}
				@Pc(161) int local161;
				if (local5 >= PlayerList.size) {
					local58 = ((Npc) entity).type;
					if (local58.multiNpcs != null) {
						local58 = local58.getMultiNpc();
					}
					if (local58.headicon >= 0 && Sprites.headiconPrayers.length > local58.headicon) {
						if (local58.iconHeight == -1) {
							local265 = entity.method2691() + 15;
						} else {
							local265 = local58.iconHeight + 15;
						}
						setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, local265, arg1 >> 1);
						if (anInt1951 > -1) {
							Sprites.headiconPrayers[local58.headicon].render(arg2 + anInt1951 - 12, arg0 + -30 - -anInt548);
						}
					}
					@Pc(308) MapMarker[] local308 = MiniMap.hintMapMarkers;
					for (local310 = 0; local310 < local308.length; local310++) {
						@Pc(322) MapMarker local322 = local308[local310];
						if (local322 != null && local322.type == 1 && local322.actorTargetId == NpcList.ids[local5 - PlayerList.size] && client.loop % 20 < 10) {
							if (local58.iconHeight == -1) {
								local359 = entity.method2691() + 15;
							} else {
								local359 = local58.iconHeight + 15;
							}
							setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, local359, arg1 >> 1);
							if (anInt1951 > -1) {
								Sprites.headhints[local322.anInt4048].render(arg2 + anInt1951 - 12, anInt548 + -28 + arg0);
							}
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Player local77 = (Player) entity;
					if (local77.anInt1669 != -1 || local77.anInt1649 != -1) {
						setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, entity.method2691() + 15, arg1 >> 1);
						if (anInt1951 > -1) {
							if (local77.anInt1669 != -1) {
								Sprites.headiconPks[local77.anInt1669].render(anInt1951 + arg2 - 12, arg0 + -30 + anInt548);
								local74 += 25;
							}
							if (local77.anInt1649 != -1) {
								Sprites.headiconPrayers[local77.anInt1649].render(arg2 + anInt1951 - 12, arg0 - (-anInt548 + local74));
								local74 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(159) MapMarker[] local159 = MiniMap.hintMapMarkers;
						for (local161 = 0; local161 < local159.length; local161++) {
							@Pc(173) MapMarker local173 = local159[local161];
							if (local173 != null && local173.type == 10 && PlayerList.ids[local5] == local173.actorTargetId) {
								setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, entity.method2691() + 15, arg1 >> 1);
								if (anInt1951 > -1) {
									Sprites.headhints[local173.anInt4048].render(arg2 + anInt1951 - 12, arg0 + (anInt548 - local74));
								}
							}
						}
					}
				}
				if (entity.chatMessage != null && (local5 >= PlayerList.size || Chat.publicFilter == 0 || Chat.publicFilter == 3 || Chat.publicFilter == 1 && FriendsList.contains(((Player) entity).username))) {
					setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, entity.method2691(), arg1 >> 1);
					if (anInt1951 > -1 && OverheadChat.size < OverheadChat.CAPACITY) {
						OverheadChat.anIntArray389[OverheadChat.size] = Fonts.b12Full.getStringWidth(entity.chatMessage) / 2;
						OverheadChat.anIntArray387[OverheadChat.size] = Fonts.b12Full.lineHeight;
						OverheadChat.anIntArray385[OverheadChat.size] = anInt1951;
						OverheadChat.anIntArray392[OverheadChat.size] = anInt548;
						OverheadChat.colors[OverheadChat.size] = entity.chatColor;
						OverheadChat.effects[OverheadChat.size] = entity.chatEffect;
						OverheadChat.loops[OverheadChat.size] = entity.chatLoops;
						OverheadChat.messages[OverheadChat.size] = entity.chatMessage;
						OverheadChat.size++;
					}
				}
				if (entity.hitpointsBarVisibleUntil > client.loop) {
					@Pc(508) Sprite local508 = Sprites.hitbars[0];
					@Pc(512) Sprite local512 = Sprites.hitbars[1];
					if (entity instanceof Npc) {
						@Pc(518) Npc local518 = (Npc) entity;
						@Pc(528) Sprite[] local528 = (Sprite[]) HitBarList.hitBars.get(local518.type.hitBarId);
						if (local528 == null) {
							local528 = SpriteLoader.loadAlphaSprites(local518.type.hitBarId, client.js5Archive8);
							if (local528 != null) {
								HitBarList.hitBars.put(local528, local518.type.hitBarId);
							}
						}
						if (local528 != null && local528.length == 2) {
							local512 = local528[1];
							local508 = local528[0];
						}
						@Pc(571) NpcType local571 = local518.type;
						if (local571.iconHeight == -1) {
							local310 = entity.method2691();
						} else {
							local310 = local571.iconHeight;
						}
					} else {
						local310 = entity.method2691();
					}
					setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, local508.height + local310 + 10, arg1 >> 1);
					if (anInt1951 > -1) {
						local161 = anInt1951 + arg2 - (local508.width >> 1);
						local359 = anInt548 + arg0 - 3;
						local508.render(local161, local359);
						local639 = local508.width * entity.hitpointsBar / 255;
						local642 = local508.height;
						if (GlRenderer.enabled) {
							GlRaster.method1183(local161, local359, local161 + local639, local359 + local642);
						} else {
							SoftwareRaster.method2498(local161, local359, local161 + local639, local642 + local359);
						}
						local512.render(local161, local359);
						if (GlRenderer.enabled) {
							GlRaster.setClip(arg2, arg0, arg1 + arg2, arg0 - -arg4);
						} else {
							SoftwareRaster.setClip(arg2, arg0, arg1 + arg2, arg4 + arg0);
						}
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (entity.hitVisibleUntil[local74] > client.loop) {
						if (entity instanceof Npc) {
							@Pc(725) Npc local725 = (Npc) entity;
							@Pc(728) NpcType local728 = local725.type;
							if (local728.iconHeight == -1) {
								local265 = entity.method2691() / 2;
							} else {
								local265 = local728.iconHeight / 2;
							}
						} else {
							local265 = entity.method2691() / 2;
						}
						setOverheadScreenCoordinateOffsets(arg4 >> 1, arg3, entity, arg5, local265, arg1 >> 1);
						if (anInt1951 > -1) {
							if (local74 == 1) {
								anInt548 -= 20;
							}
							if (local74 == 2) {
								anInt548 -= 10;
								anInt1951 -= 15;
							}
							if (local74 == 3) {
								anInt548 -= 10;
								anInt1951 += 15;
							}
							Sprites.hitmarks[entity.hitTypes[local74]].render(arg2 + anInt1951 - 12, arg0 + anInt548 - 12);
							Fonts.p11Full.renderCenter(JagString.parseInt(entity.hitDamages[local74]), anInt1951 + arg2 - 1, anInt548 + 3 + arg0, 16777215, 0);
						}
					}
				}
			}
		}
		for (local5 = 0; local5 < OverheadChat.size; local5++) {
			local74 = OverheadChat.anIntArray392[local5];
			@Pc(859) int local859 = OverheadChat.anIntArray385[local5];
			local310 = OverheadChat.anIntArray387[local5];
			local265 = OverheadChat.anIntArray389[local5];
			@Pc(869) boolean local869 = true;
			while (local869) {
				local869 = false;
				for (local359 = 0; local359 < local5; local359++) {
					if (OverheadChat.anIntArray392[local359] - OverheadChat.anIntArray387[local359] < local74 + 2 && local74 - local310 < OverheadChat.anIntArray392[local359] - -2 && local859 - local265 < OverheadChat.anIntArray385[local359] + OverheadChat.anIntArray389[local359] && OverheadChat.anIntArray385[local359] - OverheadChat.anIntArray389[local359] < local265 + local859 && OverheadChat.anIntArray392[local359] - OverheadChat.anIntArray387[local359] < local74) {
						local74 = OverheadChat.anIntArray392[local359] - OverheadChat.anIntArray387[local359];
						local869 = true;
					}
				}
			}
			anInt1951 = OverheadChat.anIntArray385[local5];
			anInt548 = OverheadChat.anIntArray392[local5] = local74;
			@Pc(962) JagString local962 = OverheadChat.messages[local5];
			if (VarpDomain.chatEffectsDisabled == 0) {
				local639 = 16776960;
				if (OverheadChat.colors[local5] < 6) {
					local639 = OverheadChat.COLORS[OverheadChat.colors[local5]];
				}
				if (OverheadChat.colors[local5] == 6) {
					local639 = anInt3325 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (OverheadChat.colors[local5] == 7) {
					local639 = anInt3325 % 20 < 10 ? 255 : 65535;
				}
				if (OverheadChat.colors[local5] == 8) {
					local639 = anInt3325 % 20 >= 10 ? 8454016 : 45056;
				}
				if (OverheadChat.colors[local5] == 9) {
					local642 = 150 - OverheadChat.loops[local5];
					if (local642 < 50) {
						local639 = local642 * 1280 + 16711680;
					} else if (local642 < 100) {
						local639 = 16776960 + 16384000 - local642 * 327680;
					} else if (local642 < 150) {
						local639 = local642 * 5 + 65280 - 500;
					}
				}
				if (OverheadChat.colors[local5] == 10) {
					local642 = 150 - OverheadChat.loops[local5];
					if (local642 < 50) {
						local639 = local642 * 5 + 16711680;
					} else if (local642 < 100) {
						local639 = 16711935 - (local642 - 50) * 327680;
					} else if (local642 < 150) {
						local639 = local642 * 327680 + 255 + 500 - local642 * 5 - 32768000;
					}
				}
				if (OverheadChat.colors[local5] == 11) {
					local642 = 150 - OverheadChat.loops[local5];
					if (local642 < 50) {
						local639 = 16777215 - local642 * 327685;
					} else if (local642 < 100) {
						local639 = local642 * 327685 + 65280 - 16384250;
					} else if (local642 < 150) {
						local639 = 16777215 + 32768000 - local642 * 327680;
					}
				}
				if (OverheadChat.effects[local5] == 0) {
					Fonts.b12Full.renderCenter(local962, anInt1951 + arg2, arg0 + anInt548, local639, 0);
				}
				if (OverheadChat.effects[local5] == 1) {
					Fonts.b12Full.renderWave(local962, arg2 + anInt1951, anInt548 + arg0, local639, anInt3325);
				}
				if (OverheadChat.effects[local5] == 2) {
					Fonts.b12Full.renderWave2(local962, arg2 + anInt1951, arg0 - -anInt548, local639, anInt3325);
				}
				if (OverheadChat.effects[local5] == 3) {
					Fonts.b12Full.renderShake(local962, arg2 + anInt1951, anInt548 + arg0, local639, anInt3325, 150 - OverheadChat.loops[local5]);
				}
				if (OverheadChat.effects[local5] == 4) {
					local642 = (150 - OverheadChat.loops[local5]) * (Fonts.b12Full.getStringWidth(local962) + 100) / 150;
					if (GlRenderer.enabled) {
						GlRaster.method1183(anInt1951 + arg2 - 50, arg0, anInt1951 + arg2 + 50, arg4 + arg0);
					} else {
						SoftwareRaster.method2498(arg2 + anInt1951 - 50, arg0, anInt1951 + arg2 + 50, arg4 + arg0);
					}
					Fonts.b12Full.renderLeft(local962, arg2 + anInt1951 + 50 - local642, arg0 + anInt548, local639, 0);
					if (GlRenderer.enabled) {
						GlRaster.setClip(arg2, arg0, arg1 + arg2, arg4 + arg0);
					} else {
						SoftwareRaster.setClip(arg2, arg0, arg2 + arg1, arg0 + arg4);
					}
				}
				if (OverheadChat.effects[local5] == 5) {
					@Pc(1372) int local1372 = 0;
					local642 = 150 - OverheadChat.loops[local5];
					if (GlRenderer.enabled) {
						GlRaster.method1183(arg2, anInt548 + arg0 - Fonts.b12Full.lineHeight - 1, arg1 + arg2, arg0 + anInt548 + 5);
					} else {
						SoftwareRaster.method2498(arg2, anInt548 + arg0 - Fonts.b12Full.lineHeight - 1, arg2 + arg1, anInt548 + arg0 + 5);
					}
					if (local642 < 25) {
						local1372 = local642 - 25;
					} else if (local642 > 125) {
						local1372 = local642 - 125;
					}
					Fonts.b12Full.renderCenter(local962, anInt1951 + arg2, local1372 + arg0 + anInt548, local639, 0);
					if (GlRenderer.enabled) {
						GlRaster.setClip(arg2, arg0, arg2 + arg1, arg0 + arg4);
					} else {
						SoftwareRaster.setClip(arg2, arg0, arg2 + arg1, arg0 + arg4);
					}
				}
			} else {
				Fonts.b12Full.renderCenter(local962, arg2 + anInt1951, arg0 + anInt548, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method3711() {
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
				anIntArrayArray6[local7][local14] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(ZI)V")
	public static void method964(@OriginalArg(0) boolean arg0) {
		@Pc(3) int local3 = PlayerList.size;
		if (LoginManager.mapFlagX == PlayerList.self.xFine >> 7 && PlayerList.self.zFine >> 7 == LoginManager.mapFlagZ) {
			LoginManager.mapFlagX = 0;
		}
		if (arg0) {
			local3 = 1;
		}
		@Pc(28) int local28;
		@Pc(39) Player local39;
		@Pc(82) int local82;
		@Pc(182) int local182;
		@Pc(200) int local200;
		@Pc(214) int local214;
		@Pc(223) int local223;
		@Pc(106) int local106;
		for (local28 = 0; local28 < local3; local28++) {
			if (arg0) {
				local39 = PlayerList.self;
			} else {
				local39 = PlayerList.players[PlayerList.ids[local28]];
			}
			if (local39 != null && local39.isVisible()) {
				@Pc(55) int local55 = local39.getSize();
				@Pc(77) int local77;
				if (local55 == 1) {
					if ((local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 64) {
						local77 = local39.xFine >> 7;
						local82 = local39.zFine >> 7;
						if (local77 >= 0 && local77 < 104 && local82 >= 0 && local82 < 104) {
							local106 = anIntArrayArray6[local77][local82]++;
						}
					}
				} else if (((local55 & 0x1) != 0 || (local39.xFine & 0x7F) == 0 && (local39.zFine & 0x7F) == 0) && ((local55 & 0x1) != 1 || (local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 64)) {
					local77 = local39.xFine - local55 * 64 >> 7;
					local82 = local39.zFine - local55 * 64 >> 7;
					local182 = local39.getSize() + local77;
					if (local182 > 104) {
						local182 = 104;
					}
					if (local77 < 0) {
						local77 = 0;
					}
					local200 = local82 + local39.getSize();
					if (local82 < 0) {
						local82 = 0;
					}
					if (local200 > 104) {
						local200 = 104;
					}
					for (local214 = local77; local214 < local182; local214++) {
						for (local223 = local82; local223 < local200; local223++) {
							local106 = anIntArrayArray6[local214][local223]++;
						}
					}
				}
			}
		}
		label220:
		for (local28 = 0; local28 < local3; local28++) {
			@Pc(272) long local272;
			if (arg0) {
				local39 = PlayerList.self;
				local272 = 8791798054912L;
			} else {
				local39 = PlayerList.players[PlayerList.ids[local28]];
				local272 = (long) PlayerList.ids[local28] << 32;
			}
			if (local39 != null && local39.isVisible()) {
				local39.aBoolean98 = (Preferences.manyIdleAnimations && PlayerList.size > 200 || PlayerList.size > 50) && !arg0 && local39.movementSeqId == local39.getBasType().idleAnimationId;
				local82 = local39.getSize();
				if (local82 == 1) {
					if ((local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 64) {
						local182 = local39.xFine >> 7;
						local200 = local39.zFine >> 7;
						if (local182 < 0 || local182 >= 104 || local200 < 0 || local200 >= 104) {
							continue;
						}
						if (anIntArrayArray6[local182][local200] > 1) {
							local106 = anIntArrayArray6[local182][local200]--;
							continue;
						}
					}
				} else if ((local82 & 0x1) == 0 && (local39.xFine & 0x7F) == 0 && (local39.zFine & 0x7F) == 0 || (local82 & 0x1) == 1 && (local39.xFine & 0x7F) == 64 && (local39.zFine & 0x7F) == 0) {
					local182 = local39.xFine - local82 * 64 >> 7;
					local214 = local82 + local182;
					local200 = local39.zFine - local82 * 64 >> 7;
					if (local214 > 104) {
						local214 = 104;
					}
					if (local182 < 0) {
						local182 = 0;
					}
					local223 = local82 + local200;
					if (local200 < 0) {
						local200 = 0;
					}
					@Pc(468) boolean local468 = true;
					if (local223 > 104) {
						local223 = 104;
					}
					@Pc(476) int local476;
					@Pc(485) int local485;
					for (local476 = local182; local476 < local214; local476++) {
						for (local485 = local200; local485 < local223; local485++) {
							if (anIntArrayArray6[local476][local485] <= 1) {
								local468 = false;
								break;
							}
						}
					}
					if (local468) {
						local476 = local182;
						while (true) {
							if (local476 >= local214) {
								continue label220;
							}
							for (local485 = local200; local485 < local223; local485++) {
								local106 = anIntArrayArray6[local476][local485]--;
							}
							local476++;
						}
					}
				}
				if (local39.attachment == null || client.loop < local39.attachmentSetAt || local39.attachmentResetAt <= client.loop) {
					local39.anInt3424 = SceneGraph.getTileHeight(Player.plane, local39.xFine, local39.zFine);
					SceneGraph.add(Player.plane, local39.xFine, local39.zFine, local39.anInt3424, (local82 - 1) * 64 + 60, local39, local39.anInt3381, local272, local39.aBoolean171);
				} else {
					local39.aBoolean98 = false;
					local39.anInt3424 = SceneGraph.getTileHeight(Player.plane, local39.xFine, local39.zFine);
					method3387(Player.plane, local39.xFine, local39.zFine, local39.anInt3424, local39, local39.anInt3381, local272, local39.atachmentX0, local39.attachmentZ0, local39.attachmentX1, local39.attachmentZ1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(IZ)V")
	public static void method3240(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7;
		@Pc(16) Npc local16;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(133) int local133;
		@Pc(149) int local149;
		@Pc(158) int local158;
		@Pc(171) int local171;
		for (local7 = 0; local7 < NpcList.size; local7++) {
			local16 = NpcList.npcs[NpcList.ids[local7]];
			if (local16 != null && local16.isVisible() && local16.type.toprenderpriority == arg0 && local16.type.isMultiNpcValid()) {
				@Pc(42) int local42 = local16.getSize();
				@Pc(97) int local97;
				if (local42 == 1) {
					if ((local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64) {
						local97 = local16.xFine >> 7;
						local107 = local16.zFine >> 7;
						if (local97 >= 0 && local97 < 104 && local107 >= 0 && local107 < 104) {
							local171 = anIntArrayArray6[local97][local107]++;
						}
					}
				} else if (((local42 & 0x1) != 0 || (local16.xFine & 0x7F) == 0 && (local16.zFine & 0x7F) == 0) && ((local42 & 0x1) != 1 || (local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64)) {
					local97 = local16.xFine - local42 * 64 >> 7;
					local107 = local16.zFine - local42 * 64 >> 7;
					local113 = local16.getSize() + local97;
					if (local97 < 0) {
						local97 = 0;
					}
					if (local113 > 104) {
						local113 = 104;
					}
					local133 = local107 + local16.getSize();
					if (local107 < 0) {
						local107 = 0;
					}
					if (local133 > 104) {
						local133 = 104;
					}
					for (local149 = local97; local149 < local113; local149++) {
						for (local158 = local107; local158 < local133; local158++) {
							local171 = anIntArrayArray6[local149][local158]++;
						}
					}
				}
			}
		}
		label200:
		for (local7 = 0; local7 < NpcList.size; local7++) {
			local16 = NpcList.npcs[NpcList.ids[local7]];
			@Pc(262) long local262 = (long) NpcList.ids[local7] << 32 | 0x20000000L;
			if (local16 != null && local16.isVisible() && local16.type.toprenderpriority == arg0 && local16.type.isMultiNpcValid()) {
				local107 = local16.getSize();
				if (local107 == 1) {
					if ((local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64) {
						local113 = local16.xFine >> 7;
						local133 = local16.zFine >> 7;
						if (local113 < 0 || local113 >= 104 || local133 < 0 || local133 >= 104) {
							continue;
						}
						if (anIntArrayArray6[local113][local133] > 1) {
							local171 = anIntArrayArray6[local113][local133]--;
							continue;
						}
					}
				} else if ((local107 & 0x1) == 0 && (local16.xFine & 0x7F) == 0 && (local16.zFine & 0x7F) == 0 || (local107 & 0x1) == 1 && (local16.xFine & 0x7F) == 64 && (local16.zFine & 0x7F) == 64) {
					local113 = local16.xFine - local107 * 64 >> 7;
					local133 = local16.zFine - local107 * 64 >> 7;
					local158 = local133 + local107;
					if (local133 < 0) {
						local133 = 0;
					}
					@Pc(368) boolean local368 = true;
					local149 = local113 + local107;
					if (local158 > 104) {
						local158 = 104;
					}
					if (local113 < 0) {
						local113 = 0;
					}
					if (local149 > 104) {
						local149 = 104;
					}
					@Pc(396) int local396;
					@Pc(401) int local401;
					for (local396 = local113; local396 < local149; local396++) {
						for (local401 = local133; local401 < local158; local401++) {
							if (anIntArrayArray6[local396][local401] <= 1) {
								local368 = false;
								break;
							}
						}
					}
					if (local368) {
						local396 = local113;
						while (true) {
							if (local396 >= local149) {
								continue label200;
							}
							for (local401 = local133; local401 < local158; local401++) {
								local171 = anIntArrayArray6[local396][local401]--;
							}
							local396++;
						}
					}
				}
				if (!local16.type.interactive) {
					local262 |= Long.MIN_VALUE;
				}
				local16.anInt3424 = SceneGraph.getTileHeight(Player.plane, local16.xFine, local16.zFine);
				SceneGraph.add(Player.plane, local16.xFine, local16.zFine, local16.anInt3424, local107 * 64 + 60 - 64, local16, local16.anInt3381, local262, local16.aBoolean171);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V")
	public static void updateSceneProjectiles() {
		for (@Pc(16) ProjAnimNode local16 = (ProjAnimNode) SceneGraph.projectiles.head(); local16 != null; local16 = (ProjAnimNode) SceneGraph.projectiles.next()) {
			@Pc(21) ProjAnim local21 = local16.value;
			if (Player.plane != local21.currentPlane || local21.lastCycle < client.loop) {
				local16.unlink();
			} else if (client.loop >= local21.firstCycle) {
				if (local21.targetIndex > 0) {
					@Pc(54) Npc local54 = NpcList.npcs[local21.targetIndex - 1];
					if (local54 != null && local54.xFine >= 0 && local54.xFine < 13312 && local54.zFine >= 0 && local54.zFine < 13312) {
						local21.setTarget(local54.zFine, client.loop, SceneGraph.getTileHeight(local21.currentPlane, local54.xFine, local54.zFine) - local21.baseZ, local54.xFine);
					}
				}
				if (local21.targetIndex < 0) {
					@Pc(102) int local102 = -local21.targetIndex - 1;
					@Pc(107) Player local107;
					if (PlayerList.selfId == local102) {
						local107 = PlayerList.self;
					} else {
						local107 = PlayerList.players[local102];
					}
					if (local107 != null && local107.xFine >= 0 && local107.xFine < 13312 && local107.zFine >= 0 && local107.zFine < 13312) {
						local21.setTarget(local107.zFine, client.loop, SceneGraph.getTileHeight(local21.currentPlane, local107.xFine, local107.zFine) - local21.baseZ, local107.xFine);
					}
				}
				local21.update(Protocol.sceneDelta);
				SceneGraph.add(Player.plane, (int) local21.x, (int) local21.y, (int) local21.z, 60, local21, local21.yaw, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method4239() {
		for (@Pc(9) SpotAnimNode local9 = (SpotAnimNode) SceneGraph.spotanims.head(); local9 != null; local9 = (SpotAnimNode) SceneGraph.spotanims.next()) {
			@Pc(15) SpotAnim local15 = local9.aClass8_Sub2_1;
			if (local15.anInt606 != Player.plane || local15.aBoolean41) {
				local9.unlink();
			} else if (local15.anInt590 <= client.loop) {
				local15.method558(Protocol.sceneDelta);
				if (local15.aBoolean41) {
					local9.unlink();
				} else {
					SceneGraph.add(local15.anInt606, local15.anInt604, local15.anInt598, local15.anInt599, 60, local15, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(I)V")
	public static void method2218() {
		@Pc(8) int local8 = method4047();
		if (local8 == 0) {
			aByteArrayArrayArray15 = null;
			method3993(0);
		} else if (local8 == 1) {
			method960((byte) 0);
			method3993(512);
			method2608();
		} else {
			method960((byte) (anInt3325 - 4 & 0xFF));
			method3993(2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
	public static int method4047() {
		if (neverRemoveRoofs) {
			return 0;
		} else if (SceneGraph.allLevelsAreVisible()) {
			return Preferences.removeRoofsSelectively ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)Lclient!ce;")
	public static SecondaryLinkedList method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) SecondaryLinkedList local9 = new SecondaryLinkedList();
		for (@Pc(14) Map local14 = (Map) MapList.aClass69_120.head(); local14 != null; local14 = (Map) MapList.aClass69_120.next()) {
			if (local14.valid && local14.method664(arg1, arg0)) {
				local9.addTail(local14);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BB)V")
	public static void method960(@OriginalArg(0) byte arg0) {
		if (aByteArrayArrayArray15 == null) {
			aByteArrayArrayArray15 = new byte[4][104][104];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
				for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
					aByteArrayArrayArray15[local20][local25][local32] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public static void method3993(@OriginalArg(0) int arg0) {
		anIntArray338 = new int[arg0];
		anIntArray518 = new int[arg0];
		anIntArray476 = new int[arg0];
		anIntArray134 = new int[arg0];
		anIntArray205 = new int[arg0];
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V")
	public static void method2608() {
		@Pc(7) int local7 = 0;
		for (@Pc(23) int local23 = 0; local23 < 104; local23++) {
			for (@Pc(30) int local30 = 0; local30 < 104; local30++) {
				if (method4348(true, local23, local30, SceneGraph.tiles, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BZII[[[Lclient!bj;I)Z")
	public static boolean method4348(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Tile[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (anInt3325 & 0xFF);
		if (local14 == aByteArrayArrayArray15[Player.plane][arg1][arg2]) {
			return false;
		} else if ((SceneGraph.renderFlags[Player.plane][arg1][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(47) int local47 = 0;
			@Pc(49) byte local49 = 0;
			PathFinder.queueX[0] = arg1;
			@Pc(69) int local69 = local49 + 1;
			PathFinder.queueZ[0] = arg2;
			aByteArrayArrayArray15[Player.plane][arg1][arg2] = local14;
			while (local47 != local69) {
				@Pc(94) int local94 = PathFinder.queueX[local47] >> 16 & 0xFF;
				@Pc(102) int local102 = PathFinder.queueX[local47] >> 24 & 0xFF;
				@Pc(108) int local108 = PathFinder.queueX[local47] & 0xFFFF;
				@Pc(116) int local116 = PathFinder.queueZ[local47] >> 16 & 0xFF;
				@Pc(122) int local122 = PathFinder.queueZ[local47] & 0xFFFF;
				local47 = local47 + 1 & 0xFFF;
				@Pc(130) boolean local130 = false;
				@Pc(132) boolean local132 = false;
				if ((SceneGraph.renderFlags[Player.plane][local108][local122] & 0x4) == 0) {
					local130 = true;
				}
				@Pc(150) int local150;
				@Pc(191) int local191;
				label238:
				for (local150 = Player.plane + 1; local150 <= 3; local150++) {
					if ((SceneGraph.renderFlags[local150][local108][local122] & 0x8) == 0) {
						@Pc(227) int local227;
						@Pc(358) int local358;
						if (local130 && arg3[local150][local108][local122] != null) {
							if (arg3[local150][local108][local122].wall != null) {
								local191 = SceneGraph.method2251(local94);
								if (arg3[local150][local108][local122].wall.anInt3049 == local191 || arg3[local150][local108][local122].wall.anInt3052 == local191) {
									continue;
								}
								if (local102 != 0) {
									local227 = SceneGraph.method2251(local102);
									if (local227 == arg3[local150][local108][local122].wall.anInt3049 || arg3[local150][local108][local122].wall.anInt3052 == local227) {
										continue;
									}
								}
								if (local116 != 0) {
									local227 = SceneGraph.method2251(local116);
									if (local227 == arg3[local150][local108][local122].wall.anInt3049 || local227 == arg3[local150][local108][local122].wall.anInt3052) {
										continue;
									}
								}
							}
							if (arg3[local150][local108][local122].scenery != null) {
								for (local191 = 0; local191 < arg3[local150][local108][local122].sceneryLen; local191++) {
									local227 = (int) (arg3[local150][local108][local122].scenery[local191].key >> 14 & 0x3FL);
									if (local227 == 21) {
										local227 = 19;
									}
									@Pc(352) int local352 = (int) (arg3[local150][local108][local122].scenery[local191].key >> 20 & 0x3L);
									local358 = local227 | local352 << 6;
									if (local358 == local94 || local102 != 0 && local358 == local102 || local116 != 0 && local116 == local358) {
										continue label238;
									}
								}
							}
						}
						local132 = true;
						@Pc(395) Tile local395 = arg3[local150][local108][local122];
						if (local395 != null && local395.sceneryLen > 0) {
							for (local227 = 0; local227 < local395.sceneryLen; local227++) {
								@Pc(418) Scenery local418 = local395.scenery[local227];
								if (local418.xMax != local418.xMin || local418.zMax != local418.zMin) {
									for (local358 = local418.xMin; local358 <= local418.xMax; local358++) {
										for (@Pc(450) int local450 = local418.zMin; local450 <= local418.zMax; local450++) {
											aByteArrayArrayArray15[local150][local358][local450] = local14;
										}
									}
								}
							}
						}
						aByteArrayArrayArray15[local150][local108][local122] = local14;
					}
				}
				if (local132) {
					if (SceneGraph.tileHeights[Player.plane + 1][local108][local122] > anIntArray205[arg4]) {
						anIntArray205[arg4] = SceneGraph.tileHeights[Player.plane + 1][local108][local122];
					}
					local150 = local108 << 7;
					if (local150 < anIntArray338[arg4]) {
						anIntArray338[arg4] = local150;
					} else if (anIntArray518[arg4] < local150) {
						anIntArray518[arg4] = local150;
					}
					local191 = local122 << 7;
					if (anIntArray476[arg4] > local191) {
						anIntArray476[arg4] = local191;
					} else if (anIntArray134[arg4] < local191) {
						anIntArray134[arg4] = local191;
					}
				}
				if (!local130) {
					if (local108 >= 1 && aByteArrayArrayArray15[Player.plane][local108 - 1][local122] != local14) {
						PathFinder.queueX[local69] = local108 - 1 | 0x120000 | 0xD3000000;
						PathFinder.queueZ[local69] = local122 | 0x130000;
						local69 = local69 + 1 & 0xFFF;
						aByteArrayArrayArray15[Player.plane][local108 - 1][local122] = local14;
					}
					local122++;
					if (local122 < 104) {
						if (local108 - 1 >= 0 && local14 != aByteArrayArrayArray15[Player.plane][local108 - 1][local122] && (SceneGraph.renderFlags[Player.plane][local108][local122] & 0x4) == 0 && (SceneGraph.renderFlags[Player.plane][local108 - 1][local122 - 1] & 0x4) == 0) {
							PathFinder.queueX[local69] = 0x52000000 | 0x120000 | local108 - 1;
							PathFinder.queueZ[local69] = local122 | 0x130000;
							aByteArrayArrayArray15[Player.plane][local108 - 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
						if (local14 != aByteArrayArrayArray15[Player.plane][local108][local122]) {
							PathFinder.queueX[local69] = local108 | 0x13000000 | 0x520000;
							PathFinder.queueZ[local69] = local122 | 0x530000;
							local69 = local69 + 1 & 0xFFF;
							aByteArrayArrayArray15[Player.plane][local108][local122] = local14;
						}
						if (local108 + 1 < 104 && aByteArrayArrayArray15[Player.plane][local108 + 1][local122] != local14 && (SceneGraph.renderFlags[Player.plane][local108][local122] & 0x4) == 0 && (SceneGraph.renderFlags[Player.plane][local108 + 1][local122 - 1] & 0x4) == 0) {
							PathFinder.queueX[local69] = 0x92000000 | 0x520000 | local108 + 1;
							PathFinder.queueZ[local69] = local122 | 0x530000;
							aByteArrayArrayArray15[Player.plane][local108 + 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
					}
					local122--;
					if (local108 + 1 < 104 && local14 != aByteArrayArrayArray15[Player.plane][local108 + 1][local122]) {
						PathFinder.queueX[local69] = local108 + 1 | 0x920000 | 0x53000000;
						PathFinder.queueZ[local69] = local122 | 0x930000;
						aByteArrayArrayArray15[Player.plane][local108 + 1][local122] = local14;
						local69 = local69 + 1 & 0xFFF;
					}
					local122--;
					if (local122 >= 0) {
						if (local108 - 1 >= 0 && aByteArrayArrayArray15[Player.plane][local108 - 1][local122] != local14 && (SceneGraph.renderFlags[Player.plane][local108][local122] & 0x4) == 0 && (SceneGraph.renderFlags[Player.plane][local108 - 1][local122 + 1] & 0x4) == 0) {
							PathFinder.queueX[local69] = local108 - 1 | 0xD20000 | 0x12000000;
							PathFinder.queueZ[local69] = local122 | 0xD30000;
							aByteArrayArrayArray15[Player.plane][local108 - 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
						if (local14 != aByteArrayArrayArray15[Player.plane][local108][local122]) {
							PathFinder.queueX[local69] = local108 | 0xD20000 | 0x93000000;
							PathFinder.queueZ[local69] = local122 | 0xD30000;
							local69 = local69 + 1 & 0xFFF;
							aByteArrayArrayArray15[Player.plane][local108][local122] = local14;
						}
						if (local108 + 1 < 104 && aByteArrayArrayArray15[Player.plane][local108 + 1][local122] != local14 && (SceneGraph.renderFlags[Player.plane][local108][local122] & 0x4) == 0 && (SceneGraph.renderFlags[Player.plane][local108 + 1][local122 + 1] & 0x4) == 0) {
							PathFinder.queueX[local69] = local108 + 1 | 0xD2000000 | 0x920000;
							PathFinder.queueZ[local69] = local122 | 0x930000;
							aByteArrayArrayArray15[Player.plane][local108 + 1][local122] = local14;
							local69 = local69 + 1 & 0xFFF;
						}
					}
				}
			}
			if (anIntArray205[arg4] != -1000000) {
				anIntArray205[arg4] += 10;
				anIntArray338[arg4] -= 50;
				anIntArray518[arg4] += 50;
				anIntArray134[arg4] += 50;
				anIntArray476[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!na;BZ)V")
	public static void openUrl(@OriginalArg(0) JagString arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				GameShell.instance.getAppletContext().showDocument(arg0.method3127(GameShell.instance.getCodeBase()), "_top");
			} catch (@Pc(22) Exception local22) {
			}
			return;
		}
		if (GlRenderer.enabled && GameShell.openWindowJavaScript) {
			try {
				BrowserControl.call(GameShell.signLink.applet, "openjs", new Object[]{arg0.method3127(GameShell.instance.getCodeBase()).toString()});
				return;
			} catch (@Pc(48) Throwable local48) {
			}
		}
		try {
			GameShell.instance.getAppletContext().showDocument(arg0.method3127(GameShell.instance.getCodeBase()), "_blank");
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BIILclient!fe;III)V")
	public static void setOverheadScreenCoordinateOffsets(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) PathingEntity arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		method1026(arg5, arg1, arg2.zFine, arg4, arg0, arg2.xFine, arg3);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 128 || arg2 < 128 || arg5 > 13056 || arg2 > 13056) {
			anInt548 = -1;
			anInt1951 = -1;
			return;
		}
		@Pc(38) int local38 = SceneGraph.getTileHeight(Player.plane, arg5, arg2) - arg3;
		@Pc(42) int local42 = arg2 - Camera.renderZ;
		@Pc(46) int local46 = local38 - Camera.anInt40;
		@Pc(50) int local50 = arg5 - Camera.renderX;
		@Pc(54) int local54 = MathUtils.sin[Camera.cameraPitch];
		@Pc(58) int local58 = MathUtils.cos[Camera.cameraPitch];
		@Pc(62) int local62 = MathUtils.sin[Camera.cameraYaw];
		@Pc(66) int local66 = MathUtils.cos[Camera.cameraYaw];
		@Pc(76) int local76 = local50 * local66 + local62 * local42 >> 16;
		@Pc(87) int local87 = local42 * local66 - local62 * local50 >> 16;
		@Pc(89) int local89 = local76;
		@Pc(99) int local99 = local58 * local46 - local87 * local54 >> 16;
		@Pc(113) int local113 = local87 * local58 + local46 * local54 >> 16;
		if (local113 < 50) {
			anInt548 = -1;
			anInt1951 = -1;
		} else if (GlRenderer.enabled) {
			@Pc(150) int local150 = arg1 * 512 >> 8;
			anInt1951 = local150 * local89 / local113 + arg0;
			@Pc(164) int local164 = arg6 * 512 >> 8;
			anInt548 = local164 * local99 / local113 + arg4;
		} else {
			anInt1951 = (local89 << 9) / local113 + arg0;
			anInt548 = (local99 << 9) / local113 + arg4;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!ba;")
	public static World getWorld(@OriginalArg(1) int arg0) {
		return WorldList.loaded && arg0 >= WorldList.minId && arg0 <= WorldList.maxId ? WorldList.worlds[arg0 - WorldList.minId] : null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public static void method3858() {
		for (@Pc(1) int local1 = 0; local1 < SceneGraph.sceneryLen; local1++) {
			@Pc(8) Scenery local8 = SceneGraph.scenery[local1];
			SceneGraph.removeScenery(local8);
			SceneGraph.scenery[local1] = null;
		}
		SceneGraph.sceneryLen = 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Lclient!na;")
	public static JagString method479() {
		@Pc(8) JagString local8 = aClass100_518;
		@Pc(10) JagString local10 = JagString.EMPTY;
		if (client.modeWhere != 0) {
			local8 = aClass100_365;
		}
		if (client.settings != null) {
			local10 = JagString.concatenate(new JagString[]{aClass100_687, client.settings});
		}
		return JagString.concatenate(new JagString[]{aClass100_424, local8, aClass100_886, JagString.parseInt(client.language), aClass100_98, JagString.parseInt(client.affiliate), local10, aClass100_268});
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIILclient!th;IJIIII)Z")
	public static boolean method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null || SceneGraph.method2256(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z")
	public static boolean isShowingVideoAd() {
		if (client.objectTag) {
			try {
				return !((Boolean) aClass100_588.browserControlCall(GameShell.signLink.applet));
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
	public static void method4302() {
		if (method4047() != 2) {
			return;
		}
		@Pc(27) byte local27 = (byte) (anInt3325 - 4 & 0xFF);
		@Pc(31) int local31 = anInt3325 % 104;
		@Pc(33) int local33;
		@Pc(40) int local40;
		for (local33 = 0; local33 < 4; local33++) {
			for (local40 = 0; local40 < 104; local40++) {
				aByteArrayArrayArray15[local33][local31][local40] = local27;
			}
		}
		if (Player.plane == 3) {
			return;
		}
		for (local33 = 0; local33 < 2; local33++) {
			anIntArray205[local33] = -1000000;
			anIntArray338[local33] = 1000000;
			anIntArray518[local33] = 0;
			anIntArray476[local33] = 1000000;
			anIntArray134[local33] = 0;
		}
		if (Camera.cameraType != 1) {
			local33 = SceneGraph.getTileHeight(Player.plane, Camera.renderX, Camera.renderZ);
			if (local33 - Camera.anInt40 < 800 && (SceneGraph.renderFlags[Player.plane][Camera.renderX >> 7][Camera.renderZ >> 7] & 0x4) != 0) {
				method4348(false, Camera.renderX >> 7, Camera.renderZ >> 7, SceneGraph.tiles, 1);
			}
			return;
		}
		if ((SceneGraph.renderFlags[Player.plane][PlayerList.self.xFine >> 7][PlayerList.self.zFine >> 7] & 0x4) != 0) {
			method4348(false, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7, SceneGraph.tiles, 0);
		}
		if (Camera.cameraPitch >= 310) {
			return;
		}
		@Pc(135) int local135 = PlayerList.self.zFine >> 7;
		local40 = Camera.renderZ >> 7;
		@Pc(146) int local146;
		if (local40 < local135) {
			local146 = local135 - local40;
		} else {
			local146 = local40 - local135;
		}
		local33 = Camera.renderX >> 7;
		@Pc(162) int local162 = PlayerList.self.xFine >> 7;
		@Pc(174) int local174;
		if (local162 > local33) {
			local174 = local162 - local33;
		} else {
			local174 = local33 - local162;
		}
		@Pc(192) int local192;
		@Pc(186) int local186;
		if (local174 <= local146) {
			local186 = 32768;
			local192 = local174 * 65536 / local146;
			while (local40 != local135) {
				if (local40 < local135) {
					local40++;
				} else if (local40 > local135) {
					local40--;
				}
				if ((SceneGraph.renderFlags[Player.plane][local33][local40] & 0x4) != 0) {
					method4348(false, local33, local40, SceneGraph.tiles, 1);
					break;
				}
				local186 += local192;
				if (local186 >= 65536) {
					if (local162 > local33) {
						local33++;
					} else if (local162 < local33) {
						local33--;
					}
					local186 -= 65536;
					if ((SceneGraph.renderFlags[Player.plane][local33][local40] & 0x4) != 0) {
						method4348(false, local33, local40, SceneGraph.tiles, 1);
						break;
					}
				}
			}
			return;
		}
		local186 = 32768;
		local192 = local146 * 65536 / local174;
		while (local162 != local33) {
			if (local162 > local33) {
				local33++;
			} else if (local33 > local162) {
				local33--;
			}
			if ((SceneGraph.renderFlags[Player.plane][local33][local40] & 0x4) != 0) {
				method4348(false, local33, local40, SceneGraph.tiles, 1);
				break;
			}
			local186 += local192;
			if (local186 >= 65536) {
				if (local40 < local135) {
					local40++;
				} else if (local135 < local40) {
					local40--;
				}
				local186 -= 65536;
				if ((SceneGraph.renderFlags[Player.plane][local33][local40] & 0x4) != 0) {
					method4348(false, local33, local40, SceneGraph.tiles, 1);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method2742() {
		if (client.gameState == 10 && GlRenderer.enabled) {
			client.setGameState(28);
		}
		if (client.gameState == 30) {
			client.setGameState(25);
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method3901() {
		@Pc(16) int local16 = Fonts.b12Full.getStringWidth(LocalizedText.CHOOSE_OPTION);
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < MiniMenu.size; local18++) {
			local27 = Fonts.b12Full.getStringWidth(MiniMenu.getOp(local18));
			if (local27 > local16) {
				local16 = local27;
			}
		}
		local18 = MiniMenu.size * 15 + 21;
		@Pc(43) int local43 = anInt1892;
		local16 += 8;
		local27 = anInt3751 - local16 / 2;
		if (local43 + local18 > GameShell.canvasHeight) {
			local43 = GameShell.canvasHeight - local18;
		}
		if (GameShell.canvasWidth < local27 + local16) {
			local27 = GameShell.canvasWidth - local16;
		}
		if (local27 < 0) {
			local27 = 0;
		}
		if (local43 < 0) {
			local43 = 0;
		}
		if (MiniMenu.anInt3953 == 1) {
			if (anInt3751 == Mouse.anInt5850 && Mouse.anInt5895 == anInt1892) {
				InterfaceList.anInt436 = MiniMenu.size * 15 + (InterfaceList.aBoolean298 ? 26 : 22);
				MiniMenu.anInt3953 = 0;
				InterfaceList.anInt5138 = local43;
				InterfaceList.anInt4271 = local27;
				Cs1ScriptRunner.aBoolean108 = true;
				InterfaceList.anInt761 = local16;
			}
		} else if (anInt3751 == Mouse.clickX && anInt1892 == Mouse.clickY) {
			InterfaceList.anInt4271 = local27;
			MiniMenu.anInt3953 = 0;
			InterfaceList.anInt761 = local16;
			InterfaceList.anInt5138 = local43;
			InterfaceList.anInt436 = (InterfaceList.aBoolean298 ? 26 : 22) + MiniMenu.size * 15;
			Cs1ScriptRunner.aBoolean108 = true;
		} else {
			Mouse.anInt5895 = Mouse.clickY;
			Mouse.anInt5850 = Mouse.clickX;
			MiniMenu.anInt3953 = 1;
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
	public static void method1807() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			InterfaceList.aBooleanArray100[local11] = true;
		}
	}

	public static class Cs2Opcodes {
		// Component setters
		public static final int setPosition = 1000;
		public static final int setSize = 1001;
		public static final int setHidden = 1003;
		public static final int setAspect = 1004;
		public static final int setNoClickThrough = 1005;

		public static final int setScrollPos = 1100;
		public static final int setTrans = 1103;
		public static final int setLineWid = 1104;
		public static final int setSprite = 1105;
		public static final int set2DAngle = 1106;
		public static final int setSpriteTiling = 1107;
		public static final int setModel = 1108;
		public static final int set3DRotation = 1109;
		public static final int setAnimation = 1110;
		public static final int setModelOrthog = 1111;
		public static final int setText = 1112;
		public static final int setFont = 1113;
		public static final int setTextAlignment = 1114;
		public static final int setTextAntiMacro = 1115;
		public static final int setOutlineThickness = 1116;
		public static final int setShadowColor = 1117;
		public static final int setVFlip = 1118;
		public static final int setHFlip = 1119;
		public static final int setScrollMax = 1120;
		public static final int setAlpha = 1122;
		public static final int set3DViewDistance = 1123;

		public static final int setItem = 1200;
		public static final int setNpcHead = 1201;
		public static final int setPlayerHead = 1202;
		public static final int setPlayerFull = 1204;
		public static final int setItemNoNum = 1205;

		// Component properties
		public static final int getX = 1500;
		public static final int getY = 1501;
		public static final int getWidth = 1502;
		public static final int getHeight = 1503;
		public static final int getHidden = 1504;
		public static final int getLayer = 1505;

		// Bit utilities
		public static final int addPercent = 4007;
		public static final int flagBit = 4008;
		public static final int unflagBit = 4009;
		public static final int isBitFlagged = 4010;
		public static final int mod = 4011;
		public static final int pow = 4012;
		public static final int root = 4013;
		public static final int bitAnd = 4014;
		public static final int bitOr = 4015;
		public static final int min = 4016;
		public static final int max = 4017;
		public static final int multiplyDivide = 4018;

		// String utilities
		public static final int concatInt = 4100;
		public static final int concatString = 4101;
		public static final int concatSignedInt = 4102;
		public static final int toLowerStr = 4103;
		public static final int timeToStr = 4104;
		public static final int strForGender = 4105;
		public static final int parseInt = 4106;
		public static final int compare = 4107;
		public static final int getLineCount = 4108;
		public static final int getMaxLineWidth = 4109;
		public static final int chooseString = 4110;
		public static final int escape = 4111;
		public static final int concatChar = 4112;
		public static final int isValidChar = 4113;
		public static final int isAlphaNumeric = 4114;
		public static final int isLetter = 4115;
		public static final int isDigit = 4116;
		public static final int length = 4117;
		public static final int substr = 4118;
		public static final int removeTags = 4119;
		public static final int indexOfChar = 4120;
		public static final int indexOfStr = 4121;
		public static final int toLower = 4122;
		public static final int toUpper = 4123;
		public static final int formatNumber = 4124;

		// Objs
		public static final int itemIsMembers = 4207;
		public static final int itemAttribute = 4208;
		public static final int searchItem = 4210;

		// Params
		public static final int getLocParam = 4400;
		public static final int getStructParam = 4500;

		// Privacy
		public static final int getPublicChatSetting = 5000;
		public static final int setChatSettings = 5001;
		public static final int getPrivateChatSetting = 5005;

		// Ads
		public static final int canShowVideoAd = 6405;
		public static final int isShowingVideoAd = 6406;

		// Worlds
		public static final int getFirstWorldData = 6501;
		public static final int getNextWorldData = 6502;
		public static final int setWorldHost = 6503;
		public static final int setLastWorld = 6504;
		public static final int getLastWorld = 6505;
		public static final int sortWorldList = 6507;

		public static final int setChild = 200;
		public static final int setChild2 = 201;
		public static final int setBaseIdkit = 403;
		public static final int setBaseColor = 404;
		public static final int setFemale = 410;
		public static final int setRGB = 1101;
		public static final int setFilled = 1102;
		public static final int setContextMenuOption = 1300;
		public static final int setDraggable = 1301;
		public static final int setDragRenderBehaviour = 1302;
		public static final int setDragDeadZone = 1303;
		public static final int setDragDeadTime = 1304;
		public static final int setOptionBase = 1305;
		public static final int setTargetVerb = 1306;
		public static final int hookMousePress = 1400;
		public static final int hookDraggedOver = 1401;
		public static final int hookMouseRelease = 1402;
		public static final int hookMouseEnter = 1403;
		public static final int hookMouseExit = 1404;
		public static final int hookDragStart = 1405;
		public static final int hookUseWith = 1406;
		public static final int hookVARP = 1407;
		public static final int hookFrame = 1408;
		public static final int hookOptionClick = 1409;
		public static final int hookDragRelease = 1410;
		public static final int hookDrag = 1411;
		public static final int hookMouseHover = 1412;
		public static final int hookContainer = 1414;
		public static final int hookSkill = 1415;
		public static final int hookOnUse = 1416;
		public static final int hookScroll = 1417;
		public static final int hookMsg = 1418;
		public static final int hookKey = 1419;
		public static final int hookFriendList = 1420;
		public static final int hookClanList = 1421;
		public static final int hookMiscData = 1422;
		public static final int hookDialogAbort = 1423;
		public static final int hookWidgetsOpenClose = 1424;
		public static final int hookGEUpdate = 1425;
		public static final int hookMinimapUnlock = 1426;
		public static final int hookResize = 1427;
		public static final int hookVARC = 1428;
		public static final int hookSTRING = 1429;
		public static final int getScrollX = 1600;
		public static final int getScrollY = 1601;
		public static final int getText = 1602;
		public static final int getScrollMaxH = 1603;
		public static final int getScrollMaxV = 1604;
		public static final int get3DDistance = 1605;
		public static final int getRotateX = 1606;
		public static final int getRotateZ = 1607;
		public static final int getRotateY = 1608;
		public static final int getAlpha = 1609;
		public static final int getModelXOffset = 1610;
		public static final int getModelYOffset = 1611;
		public static final int getSpriteId = 1612;
		public static final int getItemId = 1700;
		public static final int getItemAmt = 1701;
		public static final int getChildId = 1702;
		public static final int getTargetMask = 1800;
		public static final int getOption = 1801;
		public static final int getOptionBase = 1802;
		public static final int getX2 = 2500;
		public static final int getY2 = 2501;
		public static final int getWidth2 = 2502;
		public static final int getHeight2 = 2503;
		public static final int isHidden2 = 2504;
		public static final int getLayer2 = 2505;
		public static final int getScrollX2 = 2600;
		public static final int getScrollY2 = 2601;
		public static final int getText2 = 2602;
		public static final int getScrollMaxH2 = 2603;
		public static final int getScrollMaxV2 = 2604;
		public static final int get3DDistance2 = 2605;
		public static final int getRotateX2 = 2606;
		public static final int getRotateZ2 = 2607;
		public static final int getRotateY2 = 2608;
		public static final int getAlpha2 = 2609;
		public static final int getModelXOffset2 = 2610;
		public static final int getModelYOffset2 = 2611;
		public static final int getSpriteId2 = 2612;
		public static final int getItemId2 = 2700;
		public static final int getItemAmt2 = 2701;
		public static final int hasChild = 2702;
		public static final int nextChild = 2703;
		public static final int hasChildModal = 2704;
		public static final int hasChildOverlay = 2705;
		public static final int getTargetMask2 = 2800;
		public static final int getOption2 = 2801;
		public static final int getOptionBase2 = 2802;
		public static final int msg = 3100;
		public static final int animateSelf = 3101;
		public static final int sendIntegerInput = 3104;
		public static final int sendNameInput = 3105;
		public static final int sendStringInput = 3106;
		public static final int clickPlayerOption = 3107;
		public static final int playSoundEffect = 3200;
		public static final int playMusic = 3201;
		public static final int playMusicEffect = 3202;
		public static final int getClientCycle = 3300;
		public static final int getItemIdInSlot = 3301;
		public static final int getItemAmtInSlot = 3302;
		public static final int getItemAmtInContainer = 3303;
		public static final int getItemContainerLength = 3304;
		public static final int getSkillCurrentLvl = 3305;
		public static final int getSkillActualLvl = 3306;
		public static final int getSkillXp = 3307;
		public static final int getMyLocation = 3308;
		public static final int x = 3309;
		public static final int z = 3310;
		public static final int y = 3311;
		public static final int isMember = 3312;
		public static final int getItemIdInInpsectingSlot = 3313;
		public static final int getItemAmtInInspectingSlot = 3314;
		public static final int getItemAmtInInspectingContainer = 3315;
		public static final int getClientRights = 3316;
		public static final int getSystemUpdateTimer = 3317;
		public static final int getWorldId = 3318;
		public static final int getRunEnergy = 3321;
		public static final int getPlayerWeight = 3322;
		public static final int hasMoreThen5Blackmarks = 3323;
		public static final int getBlackmarks = 3324;
		public static final int isSiteSettingsMembers = 3325;
		public static final int getMyCombat = 3326;
		public static final int IsFemale = 3327;
		public static final int mapQuickchat = 3329;
		public static final int getContainerFreeSlots = 3330;
		public static final int getContainerIntAttrCountIgnoreStacks = 3331;
		public static final int getContainerIntAttrCount = 3332;
		public static final int getLoginTypeRelatedMethod3333 = 3333;
		public static final int getLanguage = 3335;
		public static final int moveCoord = 3336;
		public static final int getAffid = 3337;
		public static final int datamap = 3400;
		public static final int datamap2 = 3408;
		public static final int datamapContainsValue = 3409;
		public static final int datamapContainsValue2 = 3410;
		public static final int datamapSize = 3411;
		public static final int getFriendCount = 3600;
		public static final int getFriendName = 3601;
		public static final int getFriendWorld = 3602;
		public static final int getFriendRank = 3603;
		public static final int isFriend = 3609;
		public static final int getFriendWorldName = 3610;
		public static final int clanChatDisplayName = 3611;
		public static final int clanGetChatCount = 3612;
		public static final int clanChatUsername = 3613;
		public static final int clanChatUserWorld = 3614;
		public static final int clanChatUserRank = 3615;
		public static final int getIgnoreCount = 3621;
		public static final int getIgnoreName = 3622;
		public static final int getGEIsSelling = 3903;
		public static final int getGEItem = 3904;
		public static final int getGEItemPrice = 3905;
		public static final int getGEItemAmt = 3906;
		public static final int getGEItemAmtTransfered = 3907;
		public static final int getGECashTransfered = 3908;
		public static final int getGENotStarted = 3910;
		public static final int getGEIsStatus2 = 3911;
		public static final int getGEIsDone = 3912;
		public static final int getGEIsStatus1 = 3913;
		public static final int add = 4000;
		public static final int subtract = 4001;
		public static final int multiply = 4002;
		public static final int divide = 4003;
		public static final int rndExcl = 4004;
		public static final int rnd = 4005;
		public static final int getItemName = 4200;
		public static final int getItemGroundOption = 4201;
		public static final int getItemOption = 4202;
		public static final int getItemValue = 4203;
		public static final int itemIsStackable = 4204;
		public static final int getNotedItem = 4205;
		public static final int getRealItem = 4206;
		public static final int nextSearchResult = 4211;
		public static final int getNpcAttribute = 4300;
		public static final int getTradeSetting = 5016;
		public static final int isHoldingAlt = 5100;
		public static final int isHoldingCtrl = 5101;
		public static final int isHoldingShift = 5102;
		public static final int setWorldmapZoom = 5200;
		public static final int getWorldmapZoom = 5201;
		public static final int loadDungeonmap = 5205;
		public static final int getDungeonmap = 5206;
		public static final int getDungeonMapName = 5207;
		public static final int getDungeonmapCenter = 5210;
		public static final int setPositionInMap = 5214;
		public static final int dungeonmapContains = 5215;
		public static final int getMapDefaultZoom = 5218;
		public static final int getDisplayMode = 5306;
		public static final int getLastIp5419 = 5419;
		public static final int cameraMoveTo = 5500;
		public static final int cameraPointAt = 5501;
		public static final int cameraUnlock = 5503;
		public static final int cameraGetVrot = 5505;
		public static final int cameraGetHrot = 5506;
		public static final int directlogin = 5600;
		public static final int sendRequestAccount = 5604;
		public static final int sendCreateAccount = 5605;
		public static final int getGameloginRc = 5607;
		public static final int getWorldswitchTimer = 5608;
		public static final int getAccountCreateRC = 5609;
		public static final int getDetailedRC = 5611;
		public static final int getMinute = 6300;
		public static final int getCurrentDaysSinceLaunch = 6301;
		public static final int getDaysSinceLaunch = 6302;
		public static final int getYear = 6303;
		public static final int isLeapYear = 6304;
		public static final int setNoOptions = 1307;
		public static final int sendCloseWidgetPacket = 3103;
		public static final int skipLoginstage10 = 5601;
		public static final int resetRCs = 5602;
		public static final int resetAccountCreateRC = 5606;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!jl;)V")
	public static void run(@OriginalArg(1) int maxCycles, @OriginalArg(2) HookRequest request) {
		@Pc(4) Object[] local4 = request.arguments;
		@Pc(10) int sid = (Integer) local4[0];
		@Pc(14) ClientScript script = ClientScriptList.get(sid);
		if (script == null) {
			return;
		}
		fp = 0;
		@Pc(26) int ssp = 0;
		@Pc(28) int isp = 0;
		@Pc(30) int pc = -1;
		@Pc(33) int[] intOperands = script.intOperands;
		@Pc(36) int[] opcodes = script.opcodes;
		@Pc(44) byte op = -1;
		@Pc(58) int cycles;
		try {
			intLocals = new int[script.intLocals];
			@Pc(50) int intLocalIndex = 0;
			stringLocals = new JagString[script.stringLocals];
			@Pc(56) int stringLocalIndex = 0;
			@Pc(77) int id;
			@Pc(194) JagString value;
			for (cycles = 1; cycles < local4.length; cycles++) {
				if (local4[cycles] instanceof Integer) {
					id = (Integer) local4[cycles];
					if (id == 0x80000001) {
						id = request.mouseX;
					}
					if (id == 0x80000002) {
						id = request.mouseY;
					}
					if (id == 0x80000003) {
						id = request.source == null ? -1 : request.source.id;
					}
					if (id == 0x80000004) {
						id = request.op;
					}
					if (id == 0x80000005) {
						id = request.source == null ? -1 : request.source.createdComponentId;
					}
					if (id == 0x80000006) {
						id = request.target == null ? -1 : request.target.id;
					}
					if (id == 0x80000007) {
						id = request.target == null ? -1 : request.target.createdComponentId;
					}
					if (id == 0x80000008) {
						id = request.keyCode;
					}
					if (id == 0x80000009) {
						id = request.keyChar;
					}
					intLocals[intLocalIndex++] = id;
				} else if (local4[cycles] instanceof JagString) {
					value = (JagString) local4[cycles];
					if (value.strEquals(EVENT_OPBASE)) {
						value = request.opBase;
					}
					stringLocals[stringLocalIndex++] = value;
				}
			}
			cycles = 0;
			nextOp:
			while (true) {
				cycles++;
				if (maxCycles < cycles) {
					throw new RuntimeException("slow");
				}
				pc++;
				@Pc(226) int opcode = opcodes[pc];
				@Pc(803) int int3;
				@Pc(652) int local652;
				@Pc(809) int int1;
				@Pc(609) JagString string;
				if (opcode < 100) {
					if (opcode == 0) {
						intStack[isp++] = intOperands[pc];
						continue;
					}
					if (opcode == 1) {
						id = intOperands[pc];
						intStack[isp++] = VarpDomain.activeVarps[id];
						continue;
					}
					if (opcode == 2) {
						id = intOperands[pc];
						isp--;
						VarpDomain.method2766(id, intStack[isp]);
						continue;
					}
					if (opcode == 3) {
						stringStack[ssp++] = script.stringOperands[pc];
						continue;
					}
					if (opcode == 6) {
						pc += intOperands[pc];
						continue;
					}
					if (opcode == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 8) {
						isp -= 2;
						if (intStack[isp + 1] == intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 10) {
						isp -= 2;
						if (intStack[isp + 1] < intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 21) {
						if (fp == 0) {
							return;
						}
						@Pc(423) GoSubFrame frame = callStack[--fp];
						script = frame.script;
						intLocals = frame.intLocals;
						opcodes = script.opcodes;
						pc = frame.pc;
						stringLocals = frame.stringLocals;
						intOperands = script.intOperands;
						continue;
					}
					if (opcode == 25) {
						id = intOperands[pc];
						intStack[isp++] = VarpDomain.getVarbit(id);
						continue;
					}
					if (opcode == 27) {
						id = intOperands[pc];
						isp--;
						VarpDomain.setVarbitClient(id, intStack[isp]);
						continue;
					}
					if (opcode == 31) {
						isp -= 2;
						if (intStack[isp + 1] >= intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 32) {
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 33) {
						intStack[isp++] = intLocals[intOperands[pc]];
						continue;
					}
					@Pc(555) int local;
					if (opcode == 34) {
						local = intOperands[pc];
						isp--;
						intLocals[local] = intStack[isp];
						continue;
					}
					if (opcode == 35) {
						stringStack[ssp++] = stringLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 36) {
						local = intOperands[pc];
						ssp--;
						stringLocals[local] = stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						id = intOperands[pc];
						ssp -= id;
						string = JagString.method2355(ssp, id, stringStack);
						stringStack[ssp++] = string;
						continue;
					}
					if (opcode == 38) {
						isp--;
						continue;
					}
					if (opcode == 39) {
						ssp--;
						continue;
					}
					if (opcode == 40) {
						id = intOperands[pc];
						@Pc(642) ClientScript local642 = ClientScriptList.get(id);
						@Pc(646) int[] local646 = new int[local642.intLocals];
						@Pc(650) JagString[] local650 = new JagString[local642.stringLocals];
						for (local652 = 0; local652 < local642.intArgs; local652++) {
							local646[local652] = intStack[local652 + isp - local642.intArgs];
						}
						for (local652 = 0; local652 < local642.stringArgs; local652++) {
							local650[local652] = stringStack[local652 + ssp - local642.stringArgs];
						}
						isp -= local642.intArgs;
						ssp -= local642.stringArgs;
						@Pc(705) GoSubFrame local705 = new GoSubFrame();
						local705.stringLocals = stringLocals;
						local705.intLocals = intLocals;
						local705.pc = pc;
						local705.script = script;
						if (fp >= callStack.length) {
							throw new RuntimeException();
						}
						script = local642;
						pc = -1;
						callStack[fp++] = local705;
						intLocals = local646;
						intOperands = local642.intOperands;
						opcodes = local642.opcodes;
						stringLocals = local650;
						continue;
					}
					if (opcode == 42) {
						intStack[isp++] = VarcDomain.varcs[intOperands[pc]];
						continue;
					}
					if (opcode == 43) {
						id = intOperands[pc];
						isp--;
						VarcDomain.varcs[id] = intStack[isp];
						DelayedStateChange.method24(id);
						continue;
					}
					if (opcode == 44) {
						id = intOperands[pc] >> 16;
						isp--;
						int3 = intStack[isp];
						int1 = intOperands[pc] & 0xFFFF;
						if (int3 >= 0 && int3 <= 5000) {
							anIntArray140[id] = int3;
							@Pc(828) byte local828 = -1;
							if (int1 == 105) {
								local828 = 0;
							}
							local652 = 0;
							while (true) {
								if (int3 <= local652) {
									continue nextOp;
								}
								anIntArrayArray33[id][local652] = local828;
								local652++;
							}
						}
						throw new RuntimeException();
					}
					if (opcode == 45) {
						id = intOperands[pc];
						isp--;
						int1 = intStack[isp];
						if (int1 >= 0 && int1 < anIntArray140[id]) {
							intStack[isp++] = anIntArrayArray33[id][int1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						id = intOperands[pc];
						isp -= 2;
						int1 = intStack[isp];
						if (int1 >= 0 && int1 < anIntArray140[id]) {
							anIntArrayArray33[id][int1] = intStack[isp + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						value = VarcDomain.varcstrs[intOperands[pc]];
						if (value == null) {
							value = VarpDomain.aClass100_1061;
						}
						stringStack[ssp++] = value;
						continue;
					}
					if (opcode == 48) {
						id = intOperands[pc];
						ssp--;
						VarcDomain.varcstrs[id] = stringStack[ssp];
						DelayedStateChange.method1840(id);
						continue;
					}
					if (opcode == 51) {
						@Pc(992) HashTable local992 = script.switchTables[intOperands[pc]];
						isp--;
						@Pc(1002) IntNode local1002 = (IntNode) local992.get(intStack[isp]);
						if (local1002 != null) {
							pc += local1002.value;
						}
						continue;
					}
				}
				@Pc(1020) boolean local1020;
				local1020 = intOperands[pc] == 1;
				@Pc(1182) Component component;
				@Pc(1052) int int2;
				@Pc(1063) Component local1063;
				@Pc(1087) int local1087;
				@Pc(1256) Component local1256;
				if (opcode < 300) {
					if (opcode == 100) {
						isp -= 3;
						int1 = intStack[isp];
						int3 = intStack[isp + 1];
						int2 = intStack[isp + 2];
						if (int3 != 0) {
							local1063 = InterfaceList.getComponent(int1);
							if (local1063.createdComponents == null) {
								local1063.createdComponents = new Component[int2 + 1];
							}
							if (int2 >= local1063.createdComponents.length) {
								@Pc(1085) Component[] local1085 = new Component[int2 + 1];
								for (local1087 = 0; local1087 < local1063.createdComponents.length; local1087++) {
									local1085[local1087] = local1063.createdComponents[local1087];
								}
								local1063.createdComponents = local1085;
							}
							if (int2 > 0 && local1063.createdComponents[int2 - 1] == null) {
								throw new RuntimeException("Gap at:" + (int2 - 1));
							}
							@Pc(1137) Component local1137 = new Component();
							local1137.if3 = true;
							local1137.createdComponentId = int2;
							local1137.overlayer = local1137.id = local1063.id;
							local1137.type = int3;
							local1063.createdComponents[int2] = local1137;
							if (local1020) {
								staticActiveComponent1 = local1137;
							} else {
								staticActiveComponent2 = local1137;
							}
							InterfaceList.redraw(local1063);
							continue;
						}
						throw new RuntimeException();
					}
					@Pc(1204) Component local1204;
					if (opcode == 101) {
						component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
						if (component.createdComponentId == -1) {
							if (!local1020) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1204 = InterfaceList.getComponent(component.id);
						local1204.createdComponents[component.createdComponentId] = null;
						InterfaceList.redraw(local1204);
						continue;
					}
					if (opcode == 102) {
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
						component.createdComponents = null;
						InterfaceList.redraw(component);
						continue;
					}
					if (opcode == Cs2Opcodes.setChild) {
						isp -= 2;
						int1 = intStack[isp];
						int3 = intStack[isp + 1];
						local1256 = InterfaceList.method1418(int1, int3);
						if (local1256 != null && int3 != -1) {
							intStack[isp++] = 1;
							if (local1020) {
								staticActiveComponent1 = local1256;
							} else {
								staticActiveComponent2 = local1256;
							}
							continue;
						}
						intStack[isp++] = 0;
						continue;
					}
					if (opcode == Cs2Opcodes.setChild2) {
						isp--;
						int1 = intStack[isp];
						local1204 = InterfaceList.getComponent(int1);
						if (local1204 == null) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
							if (local1020) {
								staticActiveComponent1 = local1204;
							} else {
								staticActiveComponent2 = local1204;
							}
						}
						continue;
					}
				} else {
					@Pc(12388) boolean local12388;
					if (opcode < 500) {
						if (opcode == Cs2Opcodes.setBaseIdkit) {
							isp -= 2;
							int3 = intStack[isp + 1];
							int1 = intStack[isp];
							for (int2 = 0; int2 < PlayerAppearance.MALE_FEATURES.length; int2++) {
								if (int1 == PlayerAppearance.MALE_FEATURES[int2]) {
									PlayerList.self.appearance.setIdentikit(int2, int3);
									continue nextOp;
								}
							}
							int2 = 0;
							while (true) {
								if (int2 >= PlayerAppearance.FEMALE_FEATURES.length) {
									continue nextOp;
								}
								if (int1 == PlayerAppearance.FEMALE_FEATURES[int2]) {
									PlayerList.self.appearance.setIdentikit(int2, int3);
									continue nextOp;
								}
								int2++;
							}
						}
						if (opcode == Cs2Opcodes.setBaseColor) {
							isp -= 2;
							int1 = intStack[isp];
							int3 = intStack[isp + 1];
							PlayerList.self.appearance.setColor(int1, int3);
							continue;
						}
						if (opcode == Cs2Opcodes.setFemale) {
							isp--;
							local12388 = intStack[isp] != 0;
							PlayerList.self.appearance.setGender(local12388);
							continue;
						}
					} else {
						@Pc(1552) boolean local1552;
						if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
							@Pc(2522) JagString str1;
							if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
								if (opcode < 2000) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								} else {
									opcode -= 1000;
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
								}
								if (opcode == Cs2Opcodes.setScrollPos) {
									isp -= 2;
									component.scrollX = intStack[isp];
									if (component.scrollX > component.scrollMaxH - component.width) {
										component.scrollX = component.scrollMaxH - component.width;
									}
									if (component.scrollX < 0) {
										component.scrollX = 0;
									}
									component.scrollY = intStack[isp + 1];
									if (component.scrollY > component.scrollMaxV - component.height) {
										component.scrollY = component.scrollMaxV - component.height;
									}
									if (component.scrollY < 0) {
										component.scrollY = 0;
									}
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method2353(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setRGB) {
									isp--;
									component.color = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4224(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setFilled) {
									isp--;
									component.filled = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setTrans) {
									isp--;
									component.alpha = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setLineWid) {
									isp--;
									component.lineWidth = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setSprite) {
									isp--;
									component.spriteId = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.set2DAngle) {
									isp--;
									component.angle2d = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setSpriteTiling) {
									isp--;
									component.spriteTiling = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setModel) {
									component.modelType = 1;
									isp--;
									component.modelId = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.set3DRotation) {
									isp -= 6;
									component.modelXOffset = intStack[isp];
									component.modelZOffset = intStack[isp + 1];
									component.modelXAngle = intStack[isp + 2];
									component.modelYAngle = intStack[isp + 3];
									component.modelYOffset = intStack[isp + 4];
									component.modelZoom = intStack[isp + 5];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentModelAngleClient(component.id);
										DelayedStateChange.setComponentModelOffsetClient(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setAnimation) {
									isp--;
									int3 = intStack[isp];
									if (component.modelSeqId != int3) {
										component.modelSeqId = int3;
										component.anInt510 = 0;
										component.anInt500 = 0;
										component.anInt496 = 1;
										InterfaceList.redraw(component);
									}
									if (component.createdComponentId == -1) {
										DelayedStateChange.method3345(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setModelOrthog) {
									isp--;
									component.modelOrtho = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setText) {
									ssp--;
									str1 = stringStack[ssp];
									if (!str1.strEquals(component.text)) {
										component.text = str1;
										InterfaceList.redraw(component);
									}
									if (component.createdComponentId == -1) {
										DelayedStateChange.method3096(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setFont) {
									isp--;
									component.font = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setTextAlignment) {
									isp -= 3;
									component.halign = intStack[isp];
									component.valign = intStack[isp + 1];
									component.vpadding = intStack[isp + 2];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setTextAntiMacro) {
									isp--;
									component.shadowed = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setOutlineThickness) {
									isp--;
									component.outlineThickness = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setShadowColor) {
									isp--;
									component.shadowColor = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setVFlip) {
									isp--;
									component.vFlip = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setHFlip) {
									isp--;
									component.hFlip = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setScrollMax) {
									isp -= 2;
									component.scrollMaxH = intStack[isp];
									component.scrollMaxV = intStack[isp + 1];
									InterfaceList.redraw(component);
									if (component.type == 0) {
										InterfaceList.method531(component, false);
									}
									continue;
								}
								if (opcode == 1121) {
									isp -= 2;
									component.aShort11 = (short) intStack[isp];
									component.aShort10 = (short) intStack[isp + 1];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setAlpha) {
									isp--;
									component.hasAlpha = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.set3DViewDistance) {
									isp--;
									component.modelZoom = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentModelAngleClient(component.id);
									}
									continue;
								}
							} else if (opcode >= 1200 && opcode < 1300 || !(opcode < 2200 || opcode >= 2300)) {
								if (opcode < 2000) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								} else {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									opcode -= 1000;
								}
								InterfaceList.redraw(component);
								if (opcode == Cs2Opcodes.setItem || opcode == Cs2Opcodes.setItemNoNum) {
									isp -= 2;
									int2 = intStack[isp + 1];
									int3 = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentObjClient(component.id);
										DelayedStateChange.setComponentModelAngleClient(component.id);
										DelayedStateChange.setComponentModelOffsetClient(component.id);
									}
									if (int3 == -1) {
										component.modelId = -1;
										component.modelType = 1;
										component.objId = -1;
									} else {
										component.objId = int3;
										component.objCount = int2;
										@Pc(13416) ObjType local13416 = ObjTypeList.get(int3);
										component.modelYOffset = local13416.zAngle2D;
										component.modelXOffset = local13416.xOffset2D;
										component.modelXAngle = local13416.xAngle2D;
										component.modelZOffset = local13416.yOffset2D;
										component.modelYAngle = local13416.yAngle2D;
										component.modelZoom = local13416.zoom2d;
										if (component.anInt451 > 0) {
											component.modelZoom = component.modelZoom * 32 / component.anInt451;
										} else if (component.baseWidth > 0) {
											component.modelZoom = component.modelZoom * 32 / component.baseWidth;
										}
										component.objDrawText = opcode != Cs2Opcodes.setItemNoNum;
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setNpcHead) {
									component.modelType = 2;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1202) {
									component.modelType = 3;
									component.modelId = PlayerList.self.appearance.method1952();
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setPlayerHead) {
									component.modelType = 6;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setPlayerFull) {
									component.modelType = 5;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
							} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
								if (opcode >= 2000) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									opcode -= 1000;
								} else {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								}
								if (opcode == Cs2Opcodes.setContextMenuOption) {
									isp--;
									int3 = intStack[isp] - 1;
									if (int3 >= 0 && int3 <= 9) {
										ssp--;
										component.method480(stringStack[ssp], int3);
										continue;
									}
									ssp--;
									continue;
								}
								if (opcode == Cs2Opcodes.setDraggable) {
									isp -= 2;
									int2 = intStack[isp + 1];
									int3 = intStack[isp];
									component.aClass13_5 = InterfaceList.method1418(int3, int2);
									continue;
								}
								if (opcode == Cs2Opcodes.setDragRenderBehaviour) {
									isp--;
									component.dragRenderBehavior = intStack[isp] == 1;
									continue;
								}
								if (opcode == Cs2Opcodes.setDragDeadZone) {
									isp--;
									component.dragDeadzone = intStack[isp];
									continue;
								}
								if (opcode == Cs2Opcodes.setDragDeadTime) {
									isp--;
									component.dragDeadtime = intStack[isp];
									continue;
								}
								if (opcode == Cs2Opcodes.setOptionBase) {
									ssp--;
									component.optionBase = stringStack[ssp];
									continue;
								}
								if (opcode == Cs2Opcodes.setTargetVerb) {
									ssp--;
									component.optionCircumfix = stringStack[ssp];
									continue;
								}
								if (opcode == Cs2Opcodes.setNoOptions) {
									component.ops = null;
									continue;
								}
								if (opcode == 1308) {
									isp--;
									component.anInt484 = intStack[isp];
									isp--;
									component.anInt499 = intStack[isp];
									continue;
								}
								if (opcode == 1309) {
									isp--;
									int3 = intStack[isp];
									isp--;
									int2 = intStack[isp];
									if (int2 >= 1 && int2 <= 10) {
										component.method477(int2 - 1, int3);
									}
									continue;
								}
							} else {
								@Pc(4859) int c;
								if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
									if (opcode < 2000) {
										component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									} else {
										opcode -= 1000;
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
									}
									@Pc(12937) int[] local12937 = null;
									ssp--;
									str1 = stringStack[ssp];
									if (str1.length() > 0 && str1.charAt(str1.length() - 1) == 89) {
										isp--;
										local652 = intStack[isp];
										if (local652 > 0) {
											local12937 = new int[local652];
											while (local652-- > 0) {
												isp--;
												local12937[local652] = intStack[isp];
											}
										}
										str1 = str1.substring(str1.length() - 1, 0);
									}
									@Pc(13000) Object[] local13000 = new Object[str1.length() + 1];
									for (c = local13000.length - 1; c >= 1; c--) {
										if (str1.charAt(c - 1) == 115) {
											ssp--;
											local13000[c] = stringStack[ssp];
										} else {
											isp--;
											local13000[c] = intStack[isp];
										}
									}
									isp--;
									c = intStack[isp];
									if (c == -1) {
										local13000 = null;
									} else {
										local13000[0] = c;
									}
									component.aBoolean25 = true;
									if (opcode == Cs2Opcodes.hookMousePress) {
										component.onClickRepeat = local13000;
									} else if (opcode == Cs2Opcodes.hookDraggedOver) {
										component.onHold = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseRelease) {
										component.onRelease = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseEnter) {
										component.onMouseOver = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseExit) {
										component.onMouseLeave = local13000;
									} else if (opcode == Cs2Opcodes.hookDragStart) {
										component.onDragStart = local13000;
									} else if (opcode == Cs2Opcodes.hookUseWith) {
										component.onUseWith = local13000;
									} else if (opcode == Cs2Opcodes.hookVARP) {
										component.varpTriggers = local12937;
										component.onVarpTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookFrame) {
										component.onTimer = local13000;
									} else if (opcode == Cs2Opcodes.hookOptionClick) {
										component.onOptionClick = local13000;
									} else if (opcode == Cs2Opcodes.hookDragRelease) {
										component.onDragRelease = local13000;
									} else if (opcode == Cs2Opcodes.hookDrag) {
										component.onDrag = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseHover) {
										component.onMouseRepeat = local13000;
									} else if (opcode == Cs2Opcodes.hookContainer) {
										component.inventoryTriggers = local12937;
										component.onInvTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookSkill) {
										component.statTriggers = local12937;
										component.onStatTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookOnUse) {
										component.onUse = local13000;
									} else if (opcode == Cs2Opcodes.hookScroll) {
										component.onScroll = local13000;
									} else if (opcode == Cs2Opcodes.hookMsg) {
										component.onMsg = local13000;
									} else if (opcode == Cs2Opcodes.hookKey) {
										component.onKey = local13000;
									} else if (opcode == Cs2Opcodes.hookFriendList) {
										component.onFriendTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookClanList) {
										component.onClanTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookMiscData) {
										component.onMiscTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookDialogAbort) {
										component.onDialogAbort = local13000;
									} else if (opcode == Cs2Opcodes.hookWidgetsOpenClose) {
										component.onWidgetsOpenClose = local13000;
									} else if (opcode == Cs2Opcodes.hookGEUpdate) { // if_setonstocktransmit
										component.onStockTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookMinimapUnlock) {
										component.onMinimapUnlock = local13000;
									} else if (opcode == Cs2Opcodes.hookResize) {
										component.onResize = local13000;
									} else if (opcode == Cs2Opcodes.hookVARC) {
										component.onVarcTransmit = local13000;
										component.varcTriggers = local12937;
									} else if (opcode == Cs2Opcodes.hookSTRING) {
										component.varcstrTriggers = local12937;
										component.onVarcstrTransmit = local13000;
									}
									continue;
								}
								if (opcode < 1600) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getX) {
										intStack[isp++] = component.x;
										continue;
									}
									if (opcode == Cs2Opcodes.getY) {
										intStack[isp++] = component.y;
										continue;
									}
									if (opcode == Cs2Opcodes.getWidth) {
										intStack[isp++] = component.width;
										continue;
									}
									if (opcode == Cs2Opcodes.getHeight) {
										intStack[isp++] = component.height;
										continue;
									}
									if (opcode == Cs2Opcodes.getHidden) {
										intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getLayer) {
										intStack[isp++] = component.overlayer;
										continue;
									}
								} else if (opcode < 1700) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getScrollX) {
										intStack[isp++] = component.scrollX;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollY) {
										intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == Cs2Opcodes.getText) {
										stringStack[ssp++] = component.text;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxH) {
										intStack[isp++] = component.scrollMaxH;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxV) {
										intStack[isp++] = component.scrollMaxV;
										continue;
									}
									if (opcode == Cs2Opcodes.get3DDistance) {
										intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateX) {
										intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateZ) {
										intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateY) {
										intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getAlpha) {
										intStack[isp++] = component.alpha;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelXOffset) {
										intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelYOffset) {
										intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getSpriteId) {
										intStack[isp++] = component.spriteId;
										continue;
									}
								} else if (opcode < 1800) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getItemId) {
										intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmt) {
										if (component.objId == -1) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getChildId) {
										intStack[isp++] = component.createdComponentId;
										continue;
									}
								} else if (opcode < 1900) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getTargetMask) {
										intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
										continue;
									}
									if (opcode == Cs2Opcodes.getOption) {
										isp--;
										int3 = intStack[isp];
										int3--;
										if (component.ops != null && int3 < component.ops.length && component.ops[int3] != null) {
											stringStack[ssp++] = component.ops[int3];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.getOptionBase) {
										if (component.optionBase == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = component.optionBase;
										}
										continue;
									}
								} else if (opcode < 2600) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == Cs2Opcodes.getX2) {
										intStack[isp++] = component.x;
										continue;
									}
									if (opcode == Cs2Opcodes.getY2) {
										intStack[isp++] = component.y;
										continue;
									}
									if (opcode == Cs2Opcodes.getWidth2) {
										intStack[isp++] = component.width;
										continue;
									}
									if (opcode == Cs2Opcodes.getHeight2) {
										intStack[isp++] = component.height;
										continue;
									}
									if (opcode == Cs2Opcodes.isHidden2) {
										intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getLayer2) {
										intStack[isp++] = component.overlayer;
										continue;
									}
								} else if (opcode < 2700) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == Cs2Opcodes.getScrollX2) {
										intStack[isp++] = component.scrollX;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollY2) {
										intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == Cs2Opcodes.getText2) {
										stringStack[ssp++] = component.text;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxH2) {
										intStack[isp++] = component.scrollMaxH;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxV2) {
										intStack[isp++] = component.scrollMaxV;
										continue;
									}
									if (opcode == Cs2Opcodes.get3DDistance2) {
										intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateX2) {
										intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateZ2) {
										intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateY2) {
										intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getAlpha2) {
										intStack[isp++] = component.alpha;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelXOffset2) {
										intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelYOffset2) {
										intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getSpriteId2) {
										intStack[isp++] = component.spriteId;
										continue;
									}
								} else if (opcode < 2800) {
									if (opcode == Cs2Opcodes.getItemId2) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmt2) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										if (component.objId == -1) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.hasChild) {
										isp--;
										int1 = intStack[isp];
										@Pc(12566) ComponentPointer local12566 = (ComponentPointer) InterfaceList.openInterfaces.get(int1);
										if (local12566 == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = 1;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.nextChild) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										if (component.createdComponents == null) {
											intStack[isp++] = 0;
											continue;
										}
										int3 = component.createdComponents.length;
										for (int2 = 0; int2 < component.createdComponents.length; int2++) {
											if (component.createdComponents[int2] == null) {
												int3 = int2;
												break;
											}
										}
										intStack[isp++] = int3;
										continue;
									}
									if (opcode == Cs2Opcodes.hasChildModal || opcode == Cs2Opcodes.hasChildOverlay) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										@Pc(12663) ComponentPointer local12663 = (ComponentPointer) InterfaceList.openInterfaces.get(int1);
										if (local12663 != null && local12663.interfaceId == int3) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
								} else if (opcode < 2900) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == Cs2Opcodes.getTargetMask2) {
										intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
										continue;
									}
									if (opcode == Cs2Opcodes.getOption2) {
										isp--;
										int3 = intStack[isp];
										int3--;
										if (component.ops != null && component.ops.length > int3 && component.ops[int3] != null) {
											stringStack[ssp++] = component.ops[int3];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.getOptionBase2) {
										if (component.optionBase == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = component.optionBase;
										}
										continue;
									}
								} else if (opcode < 3200) {
									if (opcode == Cs2Opcodes.msg) {
										ssp--;
										string = stringStack[ssp];
										Chat.add(EMPTY_STRING, 0, string);
										continue;
									}
									if (opcode == Cs2Opcodes.animateSelf) {
										isp -= 2;
										Player.animate(intStack[isp + 1], intStack[isp], PlayerList.self);
										continue;
									}
									if (opcode == Cs2Opcodes.sendCloseWidgetPacket) {
										ClientProt.closeWidget();
										continue;
									}
									if (opcode == Cs2Opcodes.sendIntegerInput) {
										ssp--;
										string = stringStack[ssp];
										int3 = 0;
										if (string.isInt()) {
											int3 = string.parseInt();
										}
										Protocol.outboundBuffer.p1isaac(ClientProt.RESUME_P_COUNTDIALOG);
										Protocol.outboundBuffer.p4(int3);
										continue;
									}
									if (opcode == Cs2Opcodes.sendNameInput) {
										ssp--;
										string = stringStack[ssp];
										Protocol.outboundBuffer.p1isaac(ClientProt.RESUME_P_NAMEDIALOG);
										Protocol.outboundBuffer.p8(string.encode37());
										continue;
									}
									if (opcode == Cs2Opcodes.sendStringInput) {
										ssp--;
										string = stringStack[ssp];
										Protocol.outboundBuffer.p1isaac(ClientProt.RESUME_P_STRINGDIALOG);
										Protocol.outboundBuffer.p1(string.length() + 1);
										Protocol.outboundBuffer.pjstr(string);
										continue;
									}
									if (opcode == Cs2Opcodes.clickPlayerOption) {
										isp--;
										int1 = intStack[isp];
										ssp--;
										str1 = stringStack[ssp];
										ClientProt.clickPlayerOption(int1, str1);
										continue;
									}
									if (opcode == 3108) {
										isp -= 3;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										int2 = intStack[isp + 2];
										local1063 = InterfaceList.getComponent(int2);
										Cs1ScriptRunner.method1015(int3, int1, local1063);
										continue;
									}
									if (opcode == 3109) {
										isp -= 2;
										int1 = intStack[isp];
										local1256 = local1020 ? staticActiveComponent1 : staticActiveComponent2;
										int3 = intStack[isp + 1];
										Cs1ScriptRunner.method1015(int3, int1, local1256);
										continue;
									}
									if (opcode == 3110) {
										isp--;
										int1 = intStack[isp];
										Protocol.outboundBuffer.p1isaac(111);
										Protocol.outboundBuffer.p2(int1);
										continue;
									}
								} else if (opcode < 3300) {
									if (opcode == Cs2Opcodes.playSoundEffect) {
										isp -= 3;
										SoundPlayer.play(intStack[isp + 1], intStack[isp], intStack[isp + 2]);
										continue;
									}
									if (opcode == Cs2Opcodes.playMusic) {
										isp--;
										MusicPlayer.playSong(intStack[isp]);
										continue;
									}
									if (opcode == Cs2Opcodes.playMusicEffect) {
										isp -= 2;
										MusicPlayer.playJingle(intStack[isp + 1], intStack[isp]);
										continue;
									}
								} else if (opcode < 3400) {
									if (opcode == Cs2Opcodes.getClientCycle) {
										intStack[isp++] = client.loop;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemIdInSlot) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemType(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInSlot) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getItemCount(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInContainer) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getSlotTotal(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemContainerLength) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = InvTypeList.get(int1).size;
										continue;
									}
									if (opcode == Cs2Opcodes.getSkillCurrentLvl) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.boostedLevels[int1];
										continue;
									}
									if (opcode == Cs2Opcodes.getSkillActualLvl) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.baseLevels[int1];
										continue;
									}
									if (opcode == Cs2Opcodes.getSkillXp) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.experience[int1];
										continue;
									}
									if (opcode == Cs2Opcodes.getMyLocation) {
										int1 = Player.plane;
										int3 = Camera.originX + (PlayerList.self.xFine >> 7);
										int2 = (PlayerList.self.zFine >> 7) + Camera.originZ;
										intStack[isp++] = (int1 << 28) - (-(int3 << 14) - int2);
										continue;
									}
									if (opcode == Cs2Opcodes.x) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 >> 14 & 0x3FFF;
										continue;
									}
									if (opcode == Cs2Opcodes.z) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 >> 28;
										continue;
									}
									if (opcode == Cs2Opcodes.y) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 & 0x3FFF;
										continue;
									}
									if (opcode == Cs2Opcodes.isMember) {
										intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemIdInInpsectingSlot) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemType(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInInspectingSlot) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemCount(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInInspectingContainer) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getSlotTotal(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getClientRights) {
										if (LoginManager.staffModLevel < 2) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = LoginManager.staffModLevel;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getSystemUpdateTimer) {
										intStack[isp++] = Player.rebootTimer;
										continue;
									}
									if (opcode == Cs2Opcodes.getWorldId) {
										intStack[isp++] = Player.worldId;
										continue;
									}
									if (opcode == Cs2Opcodes.getRunEnergy) {
										intStack[isp++] = Player.runEnergy;
										continue;
									}
									if (opcode == Cs2Opcodes.getPlayerWeight) {
										intStack[isp++] = Player.weight;
										continue;
									}
									if (opcode == Cs2Opcodes.hasMoreThen5Blackmarks) {
										if (LoginManager.blackmarks >= 5 && LoginManager.blackmarks <= 9) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getBlackmarks) {
										if (LoginManager.blackmarks >= 5 && LoginManager.blackmarks <= 9) {
											intStack[isp++] = LoginManager.blackmarks;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isSiteSettingsMembers) {
										intStack[isp++] = LoginManager.playerMember ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getMyCombat) {
										intStack[isp++] = PlayerList.self.combatLevel;
										continue;
									}
									if (opcode == Cs2Opcodes.IsFemale) {
										intStack[isp++] = PlayerList.self.appearance.gender ? 1 : 0;
										continue;
									}
									if (opcode == 3328) {
										intStack[isp++] = LoginManager.playerUnderage && !LoginManager.parentalChatConsent ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.mapQuickchat) {
										intStack[isp++] = LoginManager.mapQuickChat ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getContainerFreeSlots) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Inv.getFreeSpace(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.getContainerIntAttrCountIgnoreStacks) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getTotalParam(false, int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getContainerIntAttrCount) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getTotalParam(true, int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getLoginTypeRelatedMethod3333) {
										intStack[isp++] = LoginManager.anInt39;
										continue;
									}
									if (opcode == Cs2Opcodes.getLanguage) {
										intStack[isp++] = client.language;
										continue;
									}
									if (opcode == Cs2Opcodes.moveCoord) {
										isp -= 4;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										int1 += int3 << 14;
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										int1 += int2 << 28;
										int1 += local652;
										intStack[isp++] = int1;
										continue;
									}
									if (opcode == Cs2Opcodes.getAffid) {
										intStack[isp++] = client.affiliate;
										continue;
									}
								} else if (opcode < 3500) {
									@Pc(3422) EnumType local3422;
									if (opcode == Cs2Opcodes.datamap) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local3422 = EnumTypeList.get(int1);
										if (local3422.valueType == 115) {
										}
										stringStack[ssp++] = local3422.getString(int3);
										continue;
									}
									if (opcode == Cs2Opcodes.datamap2) {
										isp -= 4;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										@Pc(3469) EnumType local3469 = EnumTypeList.get(int2);
										if (local3469.keyType == int1 && local3469.valueType == int3) {
											if (int3 == 115) {
												stringStack[ssp++] = local3469.getString(local652);
											} else {
												intStack[isp++] = local3469.getInt(local652);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (opcode == Cs2Opcodes.datamapContainsValue) {
										isp -= 3;
										int3 = intStack[isp + 1];
										int2 = intStack[isp + 2];
										int1 = intStack[isp];
										if (int3 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3549) EnumType local3549 = EnumTypeList.get(int3);
										if (local3549.valueType != int1) {
											throw new RuntimeException("C3409-1");
										}
										intStack[isp++] = local3549.containsValue(int2) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.datamapContainsValue2) {
										isp--;
										int1 = intStack[isp];
										ssp--;
										str1 = stringStack[ssp];
										if (int1 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3422 = EnumTypeList.get(int1);
										if (local3422.valueType != 115) {
											throw new RuntimeException("C3410-1");
										}
										intStack[isp++] = local3422.containsValue(str1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.datamapSize) {
										isp--;
										int1 = intStack[isp];
										@Pc(3645) EnumType local3645 = EnumTypeList.get(int1);
										intStack[isp++] = local3645.table.size();
										continue;
									}
								} else if (opcode < 3700) {
									if (opcode == Cs2Opcodes.getFriendCount) {
										if (FriendsList.state == 0) {
											intStack[isp++] = -2;
										} else if (FriendsList.state == 1) {
											intStack[isp++] = -1;
										} else {
											intStack[isp++] = FriendsList.size;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendName) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && int1 < FriendsList.size) {
											stringStack[ssp++] = FriendsList.usernames[int1];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendWorld) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											intStack[isp++] = FriendsList.worlds[int1];
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendRank) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											intStack[isp++] = FriendsList.ranks[int1];
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3604) {
										isp--;
										int3 = intStack[isp];
										ssp--;
										string = stringStack[ssp];
										FriendsList.setRank(string, int3);
										continue;
									}
									if (opcode == 3605) {
										ssp--;
										string = stringStack[ssp];
										FriendsList.add(string.encode37());
										continue;
									}
									if (opcode == 3606) {
										ssp--;
										string = stringStack[ssp];
										FriendsList.remove(string.encode37());
										continue;
									}
									if (opcode == 3607) {
										ssp--;
										string = stringStack[ssp];
										IgnoreList.add(string.encode37());
										continue;
									}
									if (opcode == 3608) {
										ssp--;
										string = stringStack[ssp];
										IgnoreList.remove(string.encode37());
										continue;
									}
									if (opcode == Cs2Opcodes.isFriend) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = FriendsList.contains(string) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendWorldName) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											stringStack[ssp++] = FriendsList.worldNames[int1];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatDisplayName) {
										if (ClanChat.name == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = ClanChat.name.toTitleCase();
										}
										continue;
									}
									if (opcode == Cs2Opcodes.clanGetChatCount) {
										if (ClanChat.name == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = ClanChat.size;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatUsername) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											stringStack[ssp++] = ClanChat.members[int1].username.toTitleCase();
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatUserWorld) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && int1 < ClanChat.size) {
											intStack[isp++] = ClanChat.members[int1].world;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatUserRank) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											intStack[isp++] = ClanChat.members[int1].rank;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3616) {
										intStack[isp++] = ClanChat.minKick;
										continue;
									}
									if (opcode == 3617) {
										ssp--;
										string = stringStack[ssp];
										ClanChat.kick(string);
										continue;
									}
									if (opcode == 3618) {
										intStack[isp++] = ClanChat.rank;
										continue;
									}
									if (opcode == 3619) {
										ssp--;
										string = stringStack[ssp];
										ClanChat.join(string.encode37());
										continue;
									}
									if (opcode == 3620) {
										ClanChat.leave();
										continue;
									}
									if (opcode == Cs2Opcodes.getIgnoreCount) {
										if (FriendsList.state == 0) {
											intStack[isp++] = -1;
										} else {
											intStack[isp++] = IgnoreList.size;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getIgnoreName) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state != 0 && IgnoreList.size > int1) {
											stringStack[ssp++] = Base37.decode37(IgnoreList.encodedUsernames[int1]).toTitleCase();
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3623) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = IgnoreList.contains(string) ? 1 : 0;
										continue;
									}
									if (opcode == 3624) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.members != null && ClanChat.size > int1 && ClanChat.members[int1].username.equalsIgnoreCase(PlayerList.self.username)) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3625) {
										if (ClanChat.owner == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = ClanChat.owner.toTitleCase();
										}
										continue;
									}
									if (opcode == 3626) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											stringStack[ssp++] = ClanChat.members[int1].worldName;
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3627) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && int1 >= 0 && int1 < FriendsList.size) {
											intStack[isp++] = FriendsList.sameGame[int1] ? 1 : 0;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3628) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = FriendsList.indexOf(string);
										continue;
									}
									if (opcode == 3629) {
										intStack[isp++] = client.country;
										continue;
									}
								} else if (opcode < 4000) {
									if (opcode == Cs2Opcodes.getGEIsSelling) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].getType();
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItem) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].item;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItemPrice) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].price;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItemAmt) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].count;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItemAmtTransfered) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].completedCount;
										continue;
									}
									if (opcode == Cs2Opcodes.getGECashTransfered) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].completedGold;
										continue;
									}
									if (opcode == Cs2Opcodes.getGENotStarted) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 0 ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEIsStatus2) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 2 ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEIsDone) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 5 ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEIsStatus1) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 1 ? 1 : 0;
										continue;
									}
								} else if (opcode < 4100) {
									if (opcode == Cs2Opcodes.add) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int3 + int1;
										continue;
									}
									if (opcode == Cs2Opcodes.subtract) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 - int3;
										continue;
									}
									if (opcode == Cs2Opcodes.multiply) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int3 * int1;
										continue;
									}
									if (opcode == Cs2Opcodes.divide) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 / int3;
										continue;
									}
									if (opcode == Cs2Opcodes.rndExcl) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = (int) ((double) int1 * Math.random());
										continue;
									}
									if (opcode == Cs2Opcodes.rnd) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = (int) (Math.random() * (double) (int1 + 1));
										continue;
									}
									if (opcode == 4006) {
										isp -= 5;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										c = intStack[isp + 4];
										intStack[isp++] = (int3 - int1) * (c + -int2) / (local652 - int2) + int1;
										continue;
									}
									@Pc(4899) long local4899;
									@Pc(4892) long local4892;
									if (opcode == Cs2Opcodes.addPercent) {
										isp -= 2;
										local4892 = intStack[isp];
										local4899 = intStack[isp + 1];
										intStack[isp++] = (int) (local4892 * local4899 / 100L + local4892);
										continue;
									}
									if (opcode == Cs2Opcodes.flagBit) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 | 0x1 << int3;
										continue;
									}
									if (opcode == Cs2Opcodes.unflagBit) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = -(0x1 << int3) - 1 & int1;
										continue;
									}
									if (opcode == Cs2Opcodes.isBitFlagged) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = (int1 & 0x1 << int3) == 0 ? 0 : 1;
										continue;
									}
									if (opcode == Cs2Opcodes.mod) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int1 % int3;
										continue;
									}
									if (opcode == Cs2Opcodes.pow) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										if (int1 == 0) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = (int) Math.pow(int1, int3);
										}
										continue;
									}
									if (opcode == Cs2Opcodes.root) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										if (int1 == 0) {
											intStack[isp++] = 0;
										} else if (int3 == 0) {
											intStack[isp++] = Integer.MAX_VALUE;
										} else {
											intStack[isp++] = (int) Math.pow(int1, 1.0D / (double) int3);
										}
										continue;
									}
									if (opcode == Cs2Opcodes.bitAnd) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int3 & int1;
										continue;
									}
									if (opcode == Cs2Opcodes.bitOr) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 | int3;
										continue;
									}
									if (opcode == Cs2Opcodes.min) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 < int3 ? int1 : int3;
										continue;
									}
									if (opcode == Cs2Opcodes.max) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int3 >= int1 ? int3 : int1;
										continue;
									}
									if (opcode == Cs2Opcodes.multiplyDivide) {
										isp -= 3;
										local4892 = intStack[isp];
										local4899 = intStack[isp + 1];
										@Pc(5251) long local5251 = intStack[isp + 2];
										intStack[isp++] = (int) (local4892 * local5251 / local4899);
										continue;
									}
								} else if (opcode >= 4200) {
									@Pc(5294) ParamType local5294;
									if (opcode < 4300) {
										if (opcode == Cs2Opcodes.getItemName) {
											isp--;
											int1 = intStack[isp];
											stringStack[ssp++] = ObjTypeList.get(int1).name;
											continue;
										}
										@Pc(11269) ObjType local11269;
										if (opcode == Cs2Opcodes.getItemGroundOption) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local11269 = ObjTypeList.get(int1);
											if (int3 >= 1 && int3 <= 5 && local11269.ops[int3 - 1] != null) {
												stringStack[ssp++] = local11269.ops[int3 - 1];
												continue;
											}
											stringStack[ssp++] = EMPTY_STRING;
											continue;
										}
										if (opcode == Cs2Opcodes.getItemOption) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local11269 = ObjTypeList.get(int1);
											if (int3 >= 1 && int3 <= 5 && local11269.iops[int3 - 1] != null) {
												stringStack[ssp++] = local11269.iops[int3 - 1];
												continue;
											}
											stringStack[ssp++] = EMPTY_STRING;
											continue;
										}
										if (opcode == Cs2Opcodes.getItemValue) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).cost;
											continue;
										}
										if (opcode == Cs2Opcodes.itemIsStackable) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).stackable == 1 ? 1 : 0;
											continue;
										}
										@Pc(11417) ObjType local11417;
										if (opcode == Cs2Opcodes.getNotedItem) {
											isp--;
											int1 = intStack[isp];
											local11417 = ObjTypeList.get(int1);
											if (local11417.certtemplate == -1 && local11417.certlink >= 0) {
												intStack[isp++] = local11417.certlink;
												continue;
											}
											intStack[isp++] = int1;
											continue;
										}
										if (opcode == Cs2Opcodes.getRealItem) {
											isp--;
											int1 = intStack[isp];
											local11417 = ObjTypeList.get(int1);
											if (local11417.certtemplate >= 0 && local11417.certlink >= 0) {
												intStack[isp++] = local11417.certlink;
												continue;
											}
											intStack[isp++] = int1;
											continue;
										}
										if (opcode == Cs2Opcodes.itemIsMembers) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).members ? 1 : 0;
											continue;
										}
										if (opcode == Cs2Opcodes.itemAttribute) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = ObjTypeList.get(int1).getParam(local5294.defaultString, int3);
											} else {
												intStack[isp++] = ObjTypeList.get(int1).getParam(local5294.defaultInt, int3);
											}
											continue;
										}
										if (opcode == Cs2Opcodes.searchItem) {
											ssp--;
											string = stringStack[ssp];
											isp--;
											int3 = intStack[isp];
											Find.search(int3 == 1, string);
											intStack[isp++] = Find.index;
											continue;
										}
										if (opcode == Cs2Opcodes.nextSearchResult) {
											if (Find.results != null && Find.size < Find.index) {
												intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
												continue;
											}
											intStack[isp++] = -1;
											continue;
										}
										if (opcode == 4212) {
											Find.size = 0;
											continue;
										}
									} else if (opcode < 4400) {
										if (opcode == Cs2Opcodes.getNpcAttribute) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = NpcTypeList.get(int1).getParam(int3, local5294.defaultString);
											} else {
												intStack[isp++] = NpcTypeList.get(int1).getParam(int3, local5294.defaultInt);
											}
											continue;
										}
									} else if (opcode >= 4500) {
										if (opcode >= 4600) {
											if (opcode < 5100) {
												if (opcode == Cs2Opcodes.getPublicChatSetting) {
													intStack[isp++] = Chat.publicFilter;
													continue;
												}
												if (opcode == Cs2Opcodes.setChatSettings) {
													isp -= 3;
													Chat.publicFilter = intStack[isp];
													Chat.privateFilter = intStack[isp + 1];
													Chat.tradeFilter = intStack[isp + 2];
													Protocol.outboundBuffer.p1isaac(ClientProt.SET_CHATFILTERSETTINGS);
													Protocol.outboundBuffer.p1(Chat.publicFilter);
													Protocol.outboundBuffer.p1(Chat.privateFilter);
													Protocol.outboundBuffer.p1(Chat.tradeFilter);
													continue;
												}
												if (opcode == 5002) {
													ssp--;
													string = stringStack[ssp];
													isp -= 2;
													int3 = intStack[isp];
													int2 = intStack[isp + 1];
													Protocol.outboundBuffer.p1isaac(ClientProt.BUG_REPORT);
													Protocol.outboundBuffer.p8(string.encode37());
													Protocol.outboundBuffer.p1(int3 - 1);
													Protocol.outboundBuffer.p1(int2);
													continue;
												}
												if (opcode == 5003) {
													str1 = null;
													isp--;
													int1 = intStack[isp];
													if (int1 < 100) {
														str1 = Chat.messages[int1];
													}
													if (str1 == null) {
														str1 = EMPTY_STRING;
													}
													stringStack[ssp++] = str1;
													continue;
												}
												if (opcode == 5004) {
													isp--;
													int1 = intStack[isp];
													int3 = -1;
													if (int1 < 100 && Chat.messages[int1] != null) {
														int3 = Chat.types[int1];
													}
													intStack[isp++] = int3;
													continue;
												}
												if (opcode == Cs2Opcodes.getPrivateChatSetting) {
													intStack[isp++] = Chat.privateFilter;
													continue;
												}
												if (opcode == 5008) {
													ssp--;
													string = stringStack[ssp];
													if (!string.startsWith(aClass100_74)) {
														if (LoginManager.staffModLevel == 0 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
															continue;
														}
														str1 = string.toLowerCase();
														@Pc(5555) byte local5555 = 0;
														if (str1.startsWith(LocalizedText.STABLE_CHATCOL0)) {
															local5555 = 0;
															string = string.substring(LocalizedText.STABLE_CHATCOL0.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL1)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL1.length());
															local5555 = 1;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL2)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL2.length());
															local5555 = 2;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL3)) {
															local5555 = 3;
															string = string.substring(LocalizedText.STABLE_CHATCOL3.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL4)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL4.length());
															local5555 = 4;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL5)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL5.length());
															local5555 = 5;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL6)) {
															local5555 = 6;
															string = string.substring(LocalizedText.STABLE_CHATCOL6.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL7)) {
															local5555 = 7;
															string = string.substring(LocalizedText.STABLE_CHATCOL7.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL8)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL8.length());
															local5555 = 8;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL9)) {
															local5555 = 9;
															string = string.substring(LocalizedText.STABLE_CHATCOL9.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL10)) {
															local5555 = 10;
															string = string.substring(LocalizedText.STABLE_CHATCOL10.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL11)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL11.length());
															local5555 = 11;
														} else if (client.language != 0) {
															if (str1.startsWith(LocalizedText.CHATCOL0)) {
																local5555 = 0;
																string = string.substring(LocalizedText.CHATCOL0.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL1)) {
																string = string.substring(LocalizedText.CHATCOL1.length());
																local5555 = 1;
															} else if (str1.startsWith(LocalizedText.CHATCOL2)) {
																string = string.substring(LocalizedText.CHATCOL2.length());
																local5555 = 2;
															} else if (str1.startsWith(LocalizedText.CHATCOL3)) {
																string = string.substring(LocalizedText.CHATCOL3.length());
																local5555 = 3;
															} else if (str1.startsWith(LocalizedText.CHATCOL4)) {
																string = string.substring(LocalizedText.CHATCOL4.length());
																local5555 = 4;
															} else if (str1.startsWith(LocalizedText.CHATCOL5)) {
																local5555 = 5;
																string = string.substring(LocalizedText.CHATCOL5.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL6)) {
																string = string.substring(LocalizedText.CHATCOL6.length());
																local5555 = 6;
															} else if (str1.startsWith(LocalizedText.CHATCOL7)) {
																local5555 = 7;
																string = string.substring(LocalizedText.CHATCOL7.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL8)) {
																local5555 = 8;
																string = string.substring(LocalizedText.CHATCOL8.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL9)) {
																local5555 = 9;
																string = string.substring(LocalizedText.CHATCOL9.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL10)) {
																string = string.substring(LocalizedText.CHATCOL10.length());
																local5555 = 10;
															} else if (str1.startsWith(LocalizedText.CHATCOL11)) {
																string = string.substring(LocalizedText.CHATCOL11.length());
																local5555 = 11;
															}
														}
														@Pc(5943) byte local5943 = 0;
														str1 = string.toLowerCase();
														if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT1)) {
															string = string.substring(LocalizedText.STABLE_CHATEFFECT1.length());
															local5943 = 1;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT2)) {
															local5943 = 2;
															string = string.substring(LocalizedText.STABLE_CHATEFFECT2.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT3)) {
															string = string.substring(LocalizedText.STABLE_CHATEFFECT3.length());
															local5943 = 3;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT4)) {
															local5943 = 4;
															string = string.substring(LocalizedText.STABLE_CHATEFFECT4.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECTC5)) {
															local5943 = 5;
															string = string.substring(LocalizedText.STABLE_CHATEFFECTC5.length());
														} else if (client.language != 0) {
															if (str1.startsWith(LocalizedText.CHATEFFECT1)) {
																string = string.substring(LocalizedText.CHATEFFECT1.length());
																local5943 = 1;
															} else if (str1.startsWith(LocalizedText.CHATEFFECT2)) {
																local5943 = 2;
																string = string.substring(LocalizedText.CHATEFFECT2.length());
															} else if (str1.startsWith(LocalizedText.CHATEFFECT3)) {
																local5943 = 3;
																string = string.substring(LocalizedText.CHATEFFECT3.length());
															} else if (str1.startsWith(LocalizedText.CHATEFFECT4)) {
																local5943 = 4;
																string = string.substring(LocalizedText.CHATEFFECT4.length());
															} else if (str1.startsWith(LocalizedText.CHATEFFECT5)) {
																string = string.substring(LocalizedText.CHATEFFECT5.length());
																local5943 = 5;
															}
														}
														Protocol.outboundBuffer.p1isaac(237);
														Protocol.outboundBuffer.p1(0);
														c = Protocol.outboundBuffer.offset;
														Protocol.outboundBuffer.p1(local5555);
														Protocol.outboundBuffer.p1(local5943);
														WordPack.encode(Protocol.outboundBuffer, string);
														Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.offset - c);
														continue;
													}
													Cheat.execute(string);
													continue;
												}
												if (opcode == 5009) {
													ssp -= 2;
													str1 = stringStack[ssp + 1];
													string = stringStack[ssp];
													if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
														Protocol.outboundBuffer.p1isaac(201);
														Protocol.outboundBuffer.p1(0);
														int2 = Protocol.outboundBuffer.offset;
														Protocol.outboundBuffer.p8(string.encode37());
														WordPack.encode(Protocol.outboundBuffer, str1);
														Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.offset - int2);
													}
													continue;
												}
												if (opcode == 5010) {
													isp--;
													int1 = intStack[isp];
													str1 = null;
													if (int1 < 100) {
														str1 = Chat.names[int1];
													}
													if (str1 == null) {
														str1 = EMPTY_STRING;
													}
													stringStack[ssp++] = str1;
													continue;
												}
												if (opcode == 5011) {
													isp--;
													int1 = intStack[isp];
													str1 = null;
													if (int1 < 100) {
														str1 = Chat.clans[int1];
													}
													if (str1 == null) {
														str1 = EMPTY_STRING;
													}
													stringStack[ssp++] = str1;
													continue;
												}
												if (opcode == 5012) {
													isp--;
													int1 = intStack[isp];
													int3 = -1;
													if (int1 < 100) {
														int3 = Chat.phraseIds[int1];
													}
													intStack[isp++] = int3;
													continue;
												}
												if (opcode == 5015) {
													if (PlayerList.self == null || PlayerList.self.username == null) {
														string = Player.usernameInput;
													} else {
														string = PlayerList.self.getName();
													}
													stringStack[ssp++] = string;
													continue;
												}
												if (opcode == Cs2Opcodes.getTradeSetting) {
													intStack[isp++] = Chat.tradeFilter;
													continue;
												}
												if (opcode == 5017) {
													intStack[isp++] = Chat.size;
													continue;
												}
												if (opcode == 5050) {
													isp--;
													int1 = intStack[isp];
													stringStack[ssp++] = QuickChatCatTypeList.get(int1).description;
													continue;
												}
												@Pc(6378) QuickChatCatType local6378;
												if (opcode == 5051) {
													isp--;
													int1 = intStack[isp];
													local6378 = QuickChatCatTypeList.get(int1);
													if (local6378.subcategories == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6378.subcategories.length;
													}
													continue;
												}
												if (opcode == 5052) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													@Pc(6416) QuickChatCatType local6416 = QuickChatCatTypeList.get(int1);
													local652 = local6416.subcategories[int3];
													intStack[isp++] = local652;
													continue;
												}
												if (opcode == 5053) {
													isp--;
													int1 = intStack[isp];
													local6378 = QuickChatCatTypeList.get(int1);
													if (local6378.phrases == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6378.phrases.length;
													}
													continue;
												}
												if (opcode == 5054) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).phrases[int3];
													continue;
												}
												if (opcode == 5055) {
													isp--;
													int1 = intStack[isp];
													stringStack[ssp++] = QuickChatPhraseTypeList.get(int1).getText();
													continue;
												}
												if (opcode == 5056) {
													isp--;
													int1 = intStack[isp];
													@Pc(6527) QuickChatPhraseType local6527 = QuickChatPhraseTypeList.get(int1);
													if (local6527.automaticResponses == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6527.automaticResponses.length;
													}
													continue;
												}
												if (opcode == 5057) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatPhraseTypeList.get(int1).automaticResponses[int3];
													continue;
												}
												if (opcode == 5058) {
													activePhrase = new QuickChatPhrase();
													isp--;
													activePhrase.id = intStack[isp];
													activePhrase.type = QuickChatPhraseTypeList.get(activePhrase.id);
													activePhrase.values = new int[activePhrase.type.getDynamicCommandCount()];
													continue;
												}
												if (opcode == 5059) {
													Protocol.outboundBuffer.p1isaac(167);
													Protocol.outboundBuffer.p1(0);
													int1 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p1(0);
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.offset - int1);
													continue;
												}
												if (opcode == 5060) {
													ssp--;
													string = stringStack[ssp];
													Protocol.outboundBuffer.p1isaac(178);
													Protocol.outboundBuffer.p1(0);
													int3 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p8(string.encode37());
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.offset - int3);
													continue;
												}
												if (opcode == 5061) {
													Protocol.outboundBuffer.p1isaac(167);
													Protocol.outboundBuffer.p1(0);
													int1 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p1(1);
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.offset - int1);
													continue;
												}
												if (opcode == 5062) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).subcategoryShortcuts[int3];
													continue;
												}
												if (opcode == 5063) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).phraseShortcuts[int3];
													continue;
												}
												if (opcode == 5064) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													if (int3 == -1) {
														intStack[isp++] = -1;
													} else {
														intStack[isp++] = QuickChatCatTypeList.get(int1).getSubcategoryByShortcut(int3);
													}
													continue;
												}
												if (opcode == 5065) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													if (int3 == -1) {
														intStack[isp++] = -1;
													} else {
														intStack[isp++] = QuickChatCatTypeList.get(int1).getPhraseByShortcut(int3);
													}
													continue;
												}
												if (opcode == 5066) {
													isp--;
													int1 = intStack[isp];
													intStack[isp++] = QuickChatPhraseTypeList.get(int1).getDynamicCommandCount();
													continue;
												}
												if (opcode == 5067) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													int2 = QuickChatPhraseTypeList.get(int1).getDynamicCommand(int3);
													intStack[isp++] = int2;
													continue;
												}
												if (opcode == 5068) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													activePhrase.values[int1] = int3;
													continue;
												}
												if (opcode == 5069) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													activePhrase.values[int1] = int3;
													continue;
												}
												if (opcode == 5070) {
													isp -= 3;
													int1 = intStack[isp];
													int2 = intStack[isp + 2];
													int3 = intStack[isp + 1];
													@Pc(6996) QuickChatPhraseType type = QuickChatPhraseTypeList.get(int1);
													if (type.getDynamicCommand(int3) != 0) {
														throw new RuntimeException("bad command");
													}
													intStack[isp++] = type.getDynamicCommandParam(int2, int3);
													continue;
												}
												if (opcode == 5071) {
													ssp--;
													string = stringStack[ssp];
													isp--;
													local1552 = intStack[isp] == 1;
													Find.findQuickChatPhrases(local1552, string);
													intStack[isp++] = Find.index;
													continue;
												}
												if (opcode == 5072) {
													if (Find.results != null && Find.size < Find.index) {
														intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
														continue;
													}
													intStack[isp++] = -1;
													continue;
												}
												if (opcode == 5073) {
													Find.size = 0;
													continue;
												}
											} else if (opcode < 5200) {
												if (opcode == Cs2Opcodes.isHoldingAlt) {
													if (Keyboard.pressedKeys[Keyboard.KEY_ALT]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == Cs2Opcodes.isHoldingCtrl) {
													if (Keyboard.pressedKeys[Keyboard.KEY_CTRL]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == Cs2Opcodes.isHoldingShift) {
													if (Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7566) boolean local7566;
												if (opcode < 5300) {
													if (opcode == Cs2Opcodes.setWorldmapZoom) {
														isp--;
														WorldMap.setTargetZoom(intStack[isp]);
														continue;
													}
													if (opcode == Cs2Opcodes.getWorldmapZoom) {
														intStack[isp++] = WorldMap.getTargetZoom();
														continue;
													}
													if (opcode == 5202) {
														isp--;
														WorldMap.method4444(intStack[isp]);
														continue;
													}
													if (opcode == 5203) {
														ssp--;
														WorldMap.method4656(stringStack[ssp]);
														continue;
													}
													if (opcode == 5204) {
														stringStack[ssp - 1] = WorldMap.method923(stringStack[ssp - 1]);
														continue;
													}
													if (opcode == Cs2Opcodes.loadDungeonmap) {
														ssp--;
														WorldMap.method1853(stringStack[ssp]);
														continue;
													}
													if (opcode == Cs2Opcodes.getDungeonmap) {
														isp--;
														int1 = intStack[isp];
														@Pc(7264) Map local7264 = MapList.getContainingSource(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														if (local7264 == null) {
															stringStack[ssp++] = EMPTY_STRING;
														} else {
															stringStack[ssp++] = local7264.group;
														}
														continue;
													}
													@Pc(7293) Map map;
													if (opcode == Cs2Opcodes.getDungeonMapName) {
														ssp--;
														map = MapList.get(stringStack[ssp]);
														if (map != null && map.name != null) {
															stringStack[ssp++] = map.name;
															continue;
														}
														stringStack[ssp++] = EMPTY_STRING;
														continue;
													}
													if (opcode == 5208) {
														intStack[isp++] = WorldMap.anInt2387;
														intStack[isp++] = WorldMap.anInt1176;
														continue;
													}
													if (opcode == 5209) {
														intStack[isp++] = WorldMap.originX + WorldMap.anInt435;
														intStack[isp++] = WorldMap.originZ + WorldMap.length - WorldMap.anInt919 - 1;
														continue;
													}
													if (opcode == Cs2Opcodes.getDungeonmapCenter) {
														map = WorldMap.getCurrentMap();
														if (map == null) {
															intStack[isp++] = 0;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = map.originX * 64;
															intStack[isp++] = map.originZ * 64;
														}
														continue;
													}
													if (opcode == 5211) {
														map = WorldMap.getCurrentMap();
														if (map == null) {
															intStack[isp++] = 0;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = map.displayMaxZ - map.displayMinX;
															intStack[isp++] = map.displayMinZ - map.displayMaxX;
														}
														continue;
													}
													if (opcode == 5212) {
														int1 = WorldMap.method2352();
														int2 = 0;
														if (int1 == -1) {
															str1 = EMPTY_STRING;
														} else {
															str1 = WorldMap.labels.aClass100Array153[int1];
															int2 = WorldMap.labels.method3894(int1);
														}
														str1 = str1.method3140(aClass100_639, aClass100_10);
														stringStack[ssp++] = str1;
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == 5213) {
														int2 = 0;
														int1 = WorldMap.method2385();
														if (int1 == -1) {
															str1 = EMPTY_STRING;
														} else {
															str1 = WorldMap.labels.aClass100Array153[int1];
															int2 = WorldMap.labels.method3894(int1);
														}
														str1 = str1.method3140(aClass100_639, aClass100_10);
														stringStack[ssp++] = str1;
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == Cs2Opcodes.setPositionInMap) {
														isp--;
														int1 = intStack[isp];
														WorldMap.method3616(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														continue;
													}
													if (opcode == Cs2Opcodes.dungeonmapContains) {
														isp--;
														int1 = intStack[isp];
														ssp--;
														str1 = stringStack[ssp];
														local7566 = false;
														@Pc(7577) SecondaryLinkedList local7577 = method3333(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														for (@Pc(7582) Map local7582 = (Map) local7577.head(); local7582 != null; local7582 = (Map) local7577.next()) {
															if (local7582.group.equalsIgnoreCase(str1)) {
																local7566 = true;
																break;
															}
														}
														if (local7566) {
															intStack[isp++] = 1;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 5216) {
														isp--;
														int1 = intStack[isp];
														MapList.method4332(int1);
														continue;
													}
													if (opcode == 5217) {
														isp--;
														int1 = intStack[isp];
														if (MapList.method1855(int1)) {
															intStack[isp++] = 1;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getMapDefaultZoom) {
														map = WorldMap.getCurrentMap();
														if (map == null) {
															intStack[isp++] = -1;
														} else {
															intStack[isp++] = map.defaultZoom;
														}
														continue;
													}
													if (opcode == 5219) {
														ssp--;
														WorldMap.method1149(stringStack[ssp]);
														continue;
													}
													if (opcode == 5220) {
														intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
														continue;
													}
												} else if (opcode < 5400) {
													if (opcode == 5300) {
														isp -= 2;
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														DisplayMode.setWindowMode(false, 3, int1, int3);
														intStack[isp++] = GameShell.fullScreenFrame == null ? 0 : 1;
														continue;
													}
													if (opcode == 5301) {
														if (GameShell.fullScreenFrame != null) {
															DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														continue;
													}
													if (opcode == 5302) {
														@Pc(7780) DisplayMode[] local7780 = DisplayMode.getDisplayModes();
														intStack[isp++] = local7780.length;
														continue;
													}
													if (opcode == 5303) {
														isp--;
														int1 = intStack[isp];
														@Pc(7800) DisplayMode[] local7800 = DisplayMode.getDisplayModes();
														intStack[isp++] = local7800[int1].width;
														intStack[isp++] = local7800[int1].height;
														continue;
													}
													if (opcode == 5305) {
														int3 = Preferences.fullScreenHeight;
														int1 = Preferences.fullScreenWidth;
														int2 = -1;
														@Pc(7833) DisplayMode[] local7833 = DisplayMode.getDisplayModes();
														for (c = 0; c < local7833.length; c++) {
															@Pc(7843) DisplayMode local7843 = local7833[c];
															if (int1 == local7843.width && local7843.height == int3) {
																int2 = c;
																break;
															}
														}
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == Cs2Opcodes.getDisplayMode) {
														intStack[isp++] = DisplayMode.getWindowMode();
														continue;
													}
													if (opcode == 5307) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														DisplayMode.setWindowMode(false, int1, -1, -1);
														continue;
													}
													if (opcode == 5308) {
														intStack[isp++] = Preferences.favoriteWorlds;
														continue;
													}
													if (opcode == 5309) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.favoriteWorlds = int1;
														Preferences.write(GameShell.signLink);
														continue;
													}
												} else if (opcode < 5500) {
													if (opcode == 5400) {
														ssp -= 2;
														string = stringStack[ssp];
														str1 = stringStack[ssp + 1];
														isp--;
														int2 = intStack[isp];
														Protocol.outboundBuffer.p1isaac(117);
														Protocol.outboundBuffer.p1(Buffer.gjstrlen(string) + Buffer.gjstrlen(str1) + 1);
														Protocol.outboundBuffer.pjstr(string);
														Protocol.outboundBuffer.pjstr(str1);
														Protocol.outboundBuffer.p1(int2);
														continue;
													}
													if (opcode == 5401) {
														isp -= 2;
														client.aShortArray88[intStack[isp]] = (short) ColorUtils.rgbToHsl(intStack[isp + 1]);
														ObjTypeList.clearModels();
														ObjTypeList.clearSprites();
														NpcTypeList.clearModels();
														NpcTypeList.clearHeadModels();
														method1807();
														continue;
													}
													if (opcode == 5405) {
														isp -= 2;
														int1 = intStack[isp];
														int3 = intStack[isp + 1];
														if (int1 >= 0 && int1 < 2) {
															Camera.anIntArrayArrayArray9[int1] = new int[int3 << 1][4];
														}
														continue;
													}
													if (opcode == 5406) {
														isp -= 7;
														int1 = intStack[isp];
														int3 = intStack[isp + 1] << 1;
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														c = intStack[isp + 4];
														@Pc(8108) int local8108 = intStack[isp + 6];
														local1087 = intStack[isp + 5];
														if (int1 >= 0 && int1 < 2 && Camera.anIntArrayArrayArray9[int1] != null && int3 >= 0 && Camera.anIntArrayArrayArray9[int1].length > int3) {
															Camera.anIntArrayArrayArray9[int1][int3] = new int[]{(int2 >> 14 & 0x3FFF) * 128, local652, (int2 & 0x3FFF) * 128, local8108};
															Camera.anIntArrayArrayArray9[int1][int3 + 1] = new int[]{(c >> 14 & 0x3FFF) * 128, local1087, (c & 0x3FFF) * 128};
														}
														continue;
													}
													if (opcode == 5407) {
														isp--;
														int1 = Camera.anIntArrayArrayArray9[intStack[isp]].length >> 1;
														intStack[isp++] = int1;
														continue;
													}
													if (opcode == 5411) {
														if (GameShell.fullScreenFrame != null) {
															DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														if (GameShell.frame == null) {
															openUrl(method479(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getLastIp5419) {
														string = EMPTY_STRING;
														if (Player.lastLogAddress != null) {
															string = JagString.formatIp(Player.lastLogAddress.intArg2);
															if (Player.lastLogAddress.result != null) {
																@Pc(8281) byte[] local8281 = ((String) Player.lastLogAddress.result).getBytes(StandardCharsets.ISO_8859_1);
																string = JagString.decodeString(local8281, local8281.length, 0);
															}
														}
														stringStack[ssp++] = string;
														continue;
													}
													if (opcode == 5420) {
														intStack[isp++] = SignLink.anInt5928 == 3 ? 1 : 0;
														continue;
													}
													if (opcode == 5421) {
														if (GameShell.fullScreenFrame != null) {
															DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														isp--;
														local1552 = intStack[isp] == 1;
														ssp--;
														string = stringStack[ssp];
														@Pc(8356) JagString local8356 = JagString.concatenate(new JagString[]{method479(), string});
														if (GameShell.frame != null || local1552 && SignLink.anInt5928 != 3 && SignLink.osName.startsWith("win") && !client.haveIe6) {
															Protocol.newTab = local1552;
															url = local8356;
															Protocol.openUrlRequest = GameShell.signLink.openUrl(new String(local8356.method3148(), StandardCharsets.ISO_8859_1));
															continue;
														}
														openUrl(local8356, local1552);
														continue;
													}
													if (opcode == 5422) {
														isp--;
														int2 = intStack[isp];
														ssp -= 2;
														str1 = stringStack[ssp + 1];
														string = stringStack[ssp];
														if (string.length() > 0) {
															if (PlayerList.playerNames == null) {
																PlayerList.playerNames = new JagString[PlayerList.anIntArray309[client.game]];
															}
															PlayerList.playerNames[int2] = string;
														}
														if (str1.length() > 0) {
															if (PlayerList.playerNames2 == null) {
																PlayerList.playerNames2 = new JagString[PlayerList.anIntArray309[client.game]];
															}
															PlayerList.playerNames2[int2] = str1;
														}
														continue;
													}
													if (opcode == 5423) {
														ssp--;
														stringStack[ssp].print();
														continue;
													}
													if (opcode == 5424) {
														isp -= 11;
														LoginManager.anInt1275 = intStack[isp];
														LoginManager.anInt2910 = intStack[isp + 1];
														LoginManager.anInt5457 = intStack[isp + 2];
														LoginManager.anInt5208 = intStack[isp + 3];
														LoginManager.anInt1736 = intStack[isp + 4];
														LoginManager.anInt4073 = intStack[isp + 5];
														LoginManager.anInt2261 = intStack[isp + 6];
														LoginManager.anInt3324 = intStack[isp + 7];
														LoginManager.anInt5556 = intStack[isp + 8];
														LoginManager.anInt4581 = intStack[isp + 9];
														LoginManager.anInt5752 = intStack[isp + 10];
														client.js5Archive8.isFileReady(LoginManager.anInt1736);
														client.js5Archive8.isFileReady(LoginManager.anInt4073);
														client.js5Archive8.isFileReady(LoginManager.anInt2261);
														client.js5Archive8.isFileReady(LoginManager.anInt3324);
														client.js5Archive8.isFileReady(LoginManager.anInt5556);
														InterfaceList.aBoolean298 = true;
														continue;
													}
													if (opcode == 5425) {
														LoginManager.method4637();
														InterfaceList.aBoolean298 = false;
														continue;
													}
													if (opcode == 5426) {
														isp--;
														anInt5794 = intStack[isp];
														continue;
													}
													if (opcode == 5427) {
														isp -= 2;
														MiniMap.anInt4075 = intStack[isp];
														MiniMap.anInt5073 = intStack[isp + 1];
														continue;
													}
												} else if (opcode < 5600) {
													if (opcode == Cs2Opcodes.cameraMoveTo) {
														isp -= 4;
														int1 = intStack[isp];
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														int3 = intStack[isp + 1];
														Camera.method2722(false, int2, int3, local652, (int1 & 0x3FFF) - Camera.originZ, (int1 >> 14 & 0x3FFF) - Camera.originX);
														continue;
													}
													if (opcode == Cs2Opcodes.cameraPointAt) {
														isp -= 4;
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														Camera.method3849(int3, (int1 & 0x3FFF) - Camera.originZ, int2, (int1 >> 14 & 0x3FFF) - Camera.originX, local652);
														continue;
													}
													if (opcode == 5502) {
														isp -= 6;
														int1 = intStack[isp];
														if (int1 >= 2) {
															throw new RuntimeException();
														}
														Camera.anInt3718 = int1;
														int3 = intStack[isp + 1];
														if (Camera.anIntArrayArrayArray9[Camera.anInt3718].length >> 1 <= int3 + 1) {
															throw new RuntimeException();
														}
														Camera.anInt3125 = int3;
														Camera.anInt5224 = 0;
														Camera.anInt5101 = intStack[isp + 2];
														Camera.anInt5843 = intStack[isp + 3];
														int2 = intStack[isp + 4];
														if (int2 >= 2) {
															throw new RuntimeException();
														}
														Camera.anInt1694 = int2;
														local652 = intStack[isp + 5];
														if (Camera.anIntArrayArrayArray9[Camera.anInt1694].length >> 1 <= local652 + 1) {
															throw new RuntimeException();
														}
														Camera.anInt2119 = local652;
														Camera.cameraType = 3;
														continue;
													}
													if (opcode == Cs2Opcodes.cameraUnlock) {
														Camera.resetCameraEffects();
														continue;
													}
													if (opcode == 5504) {
														isp -= 2;
														Camera.pitchTarget = intStack[isp];
														Camera.yawTarget = intStack[isp + 1];
														if (Camera.cameraType == 2) {
															Camera.cameraYaw = (int) Camera.yawTarget;
															Camera.cameraPitch = (int) Camera.pitchTarget;
														}
														Camera.clampCameraAngle();
														continue;
													}
													if (opcode == Cs2Opcodes.cameraGetVrot) {
														intStack[isp++] = (int) Camera.pitchTarget;
														continue;
													}
													if (opcode == Cs2Opcodes.cameraGetHrot) {
														intStack[isp++] = (int) Camera.yawTarget;
														continue;
													}
												} else if (opcode < 5700) {
													if (opcode == Cs2Opcodes.directlogin) {
														ssp -= 2;
														string = stringStack[ssp];
														str1 = stringStack[ssp + 1];
														isp--;
														int2 = intStack[isp];
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															LoginManager.method3896(string, str1, int2);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.skipLoginstage10) {
														LoginManager.method3395();
														continue;
													}
													if (opcode == Cs2Opcodes.resetRCs) {
														if (LoginManager.step == 0) {
															LoginManager.reply = -2;
														}
														continue;
													}
													if (opcode == 5603) {
														isp -= 4;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															CreateManager.checkInfo(intStack[isp + 2], intStack[isp + 3], intStack[isp], intStack[isp + 1]);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.sendRequestAccount) {
														ssp--;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															CreateManager.checkName(stringStack[ssp].encode37());
														}
														continue;
													}
													if (opcode == Cs2Opcodes.sendCreateAccount) {
														isp -= 4;
														ssp -= 2;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															CreateManager.createAccount(intStack[isp], intStack[isp + 3], intStack[isp + 1], stringStack[ssp + 1], stringStack[ssp].encode37(), intStack[isp + 2]);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.resetAccountCreateRC) {
														if (CreateManager.step == 0) {
															CreateManager.reply = -2;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getGameloginRc) {
														intStack[isp++] = LoginManager.reply;
														continue;
													}
													if (opcode == Cs2Opcodes.getWorldswitchTimer) {
														intStack[isp++] = LoginManager.hopTime;
														continue;
													}
													if (opcode == Cs2Opcodes.getAccountCreateRC) {
														intStack[isp++] = CreateManager.reply;
														continue;
													}
													if (opcode == 5610) {
														for (int1 = 0; int1 < 5; int1++) {
															stringStack[ssp++] = CreateManager.suggestedNames.length > int1 ? CreateManager.suggestedNames[int1].toTitleCase() : EMPTY_STRING;
														}
														CreateManager.suggestedNames = null;
														continue;
													}
													if (opcode == Cs2Opcodes.getDetailedRC) {
														intStack[isp++] = LoginManager.disallowResult;
														continue;
													}
												} else if (opcode < 6100) {
													if (opcode == 6001) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 1) {
															int1 = 1;
														}
														if (int1 > 4) {
															int1 = 4;
														}
														Preferences.brightness = int1;
														if (!GlRenderer.enabled || !Preferences.highDetailLighting) {
															if (Preferences.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Preferences.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Preferences.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Preferences.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														if (GlRenderer.enabled) {
															FogManager.setInstantFade();
															if (!Preferences.highDetailLighting) {
																method2742();
															}
														}
														ObjTypeList.clearSprites();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6002) {
														isp--;
														Preferences.setAllVisibleLevels(intStack[isp] == 1);
														LocTypeList.clear();
														method2742();
														method2218();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6003) {
														isp--;
														Preferences.removeRoofsSelectively = intStack[isp] == 1;
														method2218();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6005) {
														isp--;
														Preferences.showGroundDecorations = intStack[isp] == 1;
														method2742();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6006) {
														isp--;
														Preferences.highDetailTextures = intStack[isp] == 1;
														((Js5GlTextureProvider) Rasteriser.textureProvider).method3245(!Preferences.highDetailTextures);
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6007) {
														isp--;
														Preferences.manyIdleAnimations = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6008) {
														isp--;
														Preferences.flickeringEffectsOn = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6009) {
														isp--;
														Preferences.manyGroundTextures = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6010) {
														isp--;
														Preferences.characterShadowsOn = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6011) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.sceneryShadowsType = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6012) {
														if (GlRenderer.enabled) {
															MaterialManager.setMaterial(0, 0);
														}
														isp--;
														Preferences.highDetailLighting = intStack[isp] == 1;
														if (GlRenderer.enabled && Preferences.highDetailLighting) {
															Rasteriser.setBrightness(0.7F);
														} else {
															if (Preferences.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Preferences.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Preferences.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Preferences.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														method2742();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6014) {
														isp--;
														Preferences.highWaterDetail = intStack[isp] == 1;
														if (GlRenderer.enabled) {
															method2742();
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6015) {
														isp--;
														Preferences.fogEnabled = intStack[isp] == 1;
														if (GlRenderer.enabled) {
															FogManager.setInstantFade();
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6016) {
														isp--;
														int1 = intStack[isp];
														if (GlRenderer.enabled) {
															GameShell.replaceCanvas = true;
														}
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.antiAliasingMode = int1;
														continue;
													}
													if (opcode == 6017) {
														isp--;
														Preferences.stereo = intStack[isp] == 1;
														client.method930();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6018) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 127) {
															int1 = 127;
														}
														Preferences.soundEffectVolume = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6019) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 255) {
															int1 = 255;
														}
														if (int1 != Preferences.musicVolume) {
															if (Preferences.musicVolume == 0 && MusicPlayer.groupId != -1) {
																MidiPlayer.playImmediate(client.js5Archive6, MusicPlayer.groupId, int1);
																MidiPlayer.jingle = false;
															} else if (int1 == 0) {
																MidiPlayer.method4548();
																MidiPlayer.jingle = false;
															} else {
																MidiPlayer.method3956(int1);
															}
															Preferences.musicVolume = int1;
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6020) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 127) {
															int1 = 127;
														}
														Preferences.ambientSoundsVolume = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6021) {
														isp--;
														neverRemoveRoofs = intStack[isp] == 1;
														method2218();
														continue;
													}
													if (opcode == 6023) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 2) {
															int1 = 2;
														}
														local1552 = false;
														if (GameShell.maxMemory < 96) {
															local1552 = true;
															int1 = 0;
														}
														Preferences.setParticles(int1);
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														intStack[isp++] = local1552 ? 0 : 1;
														continue;
													}
													if (opcode == 6024) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.windowMode = int1;
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6028) {
														isp--;
														Preferences.cursorsEnabled = intStack[isp] != 0;
														Preferences.write(GameShell.signLink);
														continue;
													}
												} else if (opcode < 6200) {
													if (opcode == 6101) {
														intStack[isp++] = Preferences.brightness;
														continue;
													}
													if (opcode == 6102) {
														intStack[isp++] = SceneGraph.allLevelsAreVisible() ? 1 : 0;
														continue;
													}
													if (opcode == 6103) {
														intStack[isp++] = Preferences.removeRoofsSelectively ? 1 : 0;
														continue;
													}
													if (opcode == 6105) {
														intStack[isp++] = Preferences.showGroundDecorations ? 1 : 0;
														continue;
													}
													if (opcode == 6106) {
														intStack[isp++] = Preferences.highDetailTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6107) {
														intStack[isp++] = Preferences.manyIdleAnimations ? 1 : 0;
														continue;
													}
													if (opcode == 6108) {
														intStack[isp++] = Preferences.flickeringEffectsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6109) {
														intStack[isp++] = Preferences.manyGroundTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6110) {
														intStack[isp++] = Preferences.characterShadowsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6111) {
														intStack[isp++] = Preferences.sceneryShadowsType;
														continue;
													}
													if (opcode == 6112) {
														intStack[isp++] = Preferences.highDetailLighting ? 1 : 0;
														continue;
													}
													if (opcode == 6114) {
														intStack[isp++] = Preferences.highWaterDetail ? 1 : 0;
														continue;
													}
													if (opcode == 6115) {
														intStack[isp++] = Preferences.fogEnabled ? 1 : 0;
														continue;
													}
													if (opcode == 6116) {
														intStack[isp++] = Preferences.antiAliasingMode;
														continue;
													}
													if (opcode == 6117) {
														intStack[isp++] = Preferences.stereo ? 1 : 0;
														continue;
													}
													if (opcode == 6118) {
														intStack[isp++] = Preferences.soundEffectVolume;
														continue;
													}
													if (opcode == 6119) {
														intStack[isp++] = Preferences.musicVolume;
														continue;
													}
													if (opcode == 6120) {
														intStack[isp++] = Preferences.ambientSoundsVolume;
														continue;
													}
													if (opcode == 6121) {
														if (GlRenderer.enabled) {
															intStack[isp++] = GlRenderer.arbMultisampleSupported ? 1 : 0;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 6123) {
														intStack[isp++] = Preferences.getParticleSetting();
														continue;
													}
													if (opcode == 6124) {
														intStack[isp++] = Preferences.windowMode;
														continue;
													}
													if (opcode == 6128) {
														intStack[isp++] = Preferences.cursorsEnabled ? 1 : 0;
														continue;
													}
												} else if (opcode < 6300) {
													if (opcode == 6200) {
														isp -= 2;
														aShort25 = (short) intStack[isp];
														if (aShort25 <= 0) {
															aShort25 = 256;
														}
														aShort9 = (short) intStack[isp + 1];
														if (aShort9 <= 0) {
															aShort9 = 205;
														}
														continue;
													}
													if (opcode == 6201) {
														isp -= 2;
														aShort30 = (short) intStack[isp];
														if (aShort30 <= 0) {
															aShort30 = 256;
														}
														aShort27 = (short) intStack[isp + 1];
														if (aShort27 <= 0) {
															aShort27 = 320;
														}
														continue;
													}
													if (opcode == 6202) {
														isp -= 4;
														aShort22 = (short) intStack[isp];
														if (aShort22 <= 0) {
															aShort22 = 1;
														}
														aShort1 = (short) intStack[isp + 1];
														if (aShort1 <= 0) {
															aShort1 = 32767;
														} else if (aShort22 > aShort1) {
															aShort1 = aShort22;
														}
														aShort12 = (short) intStack[isp + 2];
														if (aShort12 <= 0) {
															aShort12 = 1;
														}
														aShort21 = (short) intStack[isp + 3];
														if (aShort21 <= 0) {
															aShort21 = 32767;
														} else if (aShort21 < aShort12) {
															aShort21 = aShort12;
														}
														continue;
													}
													if (opcode == 6203) {
														method2314(InterfaceList.aClass13_26.width, 0, InterfaceList.aClass13_26.height, 0, false);
														intStack[isp++] = anInt4055;
														intStack[isp++] = anInt5377;
														continue;
													}
													if (opcode == 6204) {
														intStack[isp++] = aShort30;
														intStack[isp++] = aShort27;
														continue;
													}
													if (opcode == 6205) {
														intStack[isp++] = aShort25;
														intStack[isp++] = aShort9;
														continue;
													}
												} else if (opcode < 6400) {
													if (opcode == Cs2Opcodes.getMinute) {
														intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
														continue;
													}
													if (opcode == Cs2Opcodes.getCurrentDaysSinceLaunch) {
														intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
														continue;
													}
													if (opcode == Cs2Opcodes.getDaysSinceLaunch) {
														isp -= 3;
														int2 = intStack[isp + 2];
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														aCalendar2.clear();
														aCalendar2.set(Calendar.HOUR_OF_DAY, 12);
														aCalendar2.set(int2, int3, int1);
														intStack[isp++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (opcode == Cs2Opcodes.getYear) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
														intStack[isp++] = aCalendar2.get(Calendar.YEAR);
														continue;
													}
													if (opcode == Cs2Opcodes.isLeapYear) {
														local1552 = true;
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															local1552 = (int1 + 1) % 4 == 0;
														} else if (int1 < 1582) {
															local1552 = int1 % 4 == 0;
														} else if (int1 % 4 != 0) {
															local1552 = false;
														} else if (int1 % 100 != 0) {
															local1552 = true;
														} else if (int1 % 400 != 0) {
															local1552 = false;
														}
														intStack[isp++] = local1552 ? 1 : 0;
														continue;
													}
												} else if (opcode < 6500) {
													if (opcode == Cs2Opcodes.canShowVideoAd) {
														intStack[isp++] = client.showVideoAd() ? 1 : 0;
														continue;
													}
													if (opcode == Cs2Opcodes.isShowingVideoAd) {
														intStack[isp++] = isShowingVideoAd() ? 1 : 0;
														continue;
													}
												} else if (opcode < 6600) {
													if (opcode == 6500) {
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
															intStack[isp++] = WorldList.fetch() == -1 ? 0 : 1;
															continue;
														}
														intStack[isp++] = 1;
														continue;
													}
													@Pc(10247) WorldInfo local10247;
													@Pc(10191) World world;
													if (opcode == Cs2Opcodes.getFirstWorldData) {
														world = WorldList.getFirstWorld();
														if (world == null) {
															intStack[isp++] = -1;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = world.id;
															intStack[isp++] = world.flags;
															stringStack[ssp++] = world.activity;
															local10247 = world.getWorldInfo();
															intStack[isp++] = local10247.flag;
															stringStack[ssp++] = local10247.name;
															intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getNextWorldData) {
														world = WorldList.getNextWorld();
														if (world == null) {
															intStack[isp++] = -1;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = world.id;
															intStack[isp++] = world.flags;
															stringStack[ssp++] = world.activity;
															local10247 = world.getWorldInfo();
															intStack[isp++] = local10247.flag;
															stringStack[ssp++] = local10247.name;
															intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.setWorldHost) {
														isp--;
														int1 = intStack[isp];
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
															intStack[isp++] = WorldList.hopWorld(int1) ? 1 : 0;
															continue;
														}
														intStack[isp++] = 0;
														continue;
													}
													if (opcode == Cs2Opcodes.setLastWorld) {
														isp--;
														Preferences.lastWorldId = intStack[isp];
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == Cs2Opcodes.getLastWorld) {
														intStack[isp++] = Preferences.lastWorldId;
														continue;
													}
													if (opcode == 6506) {
														isp--;
														int1 = intStack[isp];
														@Pc(10440) World local10440 = getWorld(int1);
														if (local10440 == null) {
															intStack[isp++] = -1;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local10440.flags;
															stringStack[ssp++] = local10440.activity;
															@Pc(10458) WorldInfo local10458 = local10440.getWorldInfo();
															intStack[isp++] = local10458.flag;
															stringStack[ssp++] = local10458.name;
															intStack[isp++] = local10440.players;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.sortWorldList) {
														isp -= 4;
														int2 = intStack[isp + 2];
														int1 = intStack[isp];
														local7566 = intStack[isp + 3] == 1;
														local1552 = intStack[isp + 1] == 1;
														WorldList.sortWorldList(int2, local1552, int1, local7566);
														continue;
													}
												} else if (opcode < 6700) {
													if (opcode == 6600) {
														isp--;
														Preferences.aBoolean63 = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6601) {
														intStack[isp++] = Preferences.aBoolean63 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (opcode == Cs2Opcodes.getStructParam) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = StructTypeList.get(int1).getParam(local5294.defaultString, int3);
											} else {
												intStack[isp++] = StructTypeList.get(int1).getParam(int3, local5294.defaultInt);
											}
											continue;
										}
									} else if (opcode == Cs2Opcodes.getLocParam) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										local5294 = ParamTypeList.get(int3);
										if (local5294.isString()) {
											stringStack[ssp++] = LocTypeList.get(int1).getParam(local5294.defaultString, int3);
										} else {
											intStack[isp++] = LocTypeList.get(int1).getParam(local5294.defaultInt, int3);
										}
										continue;
									}
								} else {
									if (opcode == Cs2Opcodes.concatInt) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = JagString.concatenate(new JagString[]{string, JagString.parseInt(int3)});
										continue;
									}
									if (opcode == Cs2Opcodes.concatString) {
										ssp -= 2;
										str1 = stringStack[ssp + 1];
										string = stringStack[ssp];
										stringStack[ssp++] = JagString.concatenate(new JagString[]{string, str1});
										continue;
									}
									if (opcode == Cs2Opcodes.concatSignedInt) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = JagString.concatenate(new JagString[]{string, JagString.parseIntTrue(int3)});
										continue;
									}
									if (opcode == Cs2Opcodes.toLowerStr) {
										ssp--;
										string = stringStack[ssp];
										stringStack[ssp++] = string.toLowerCase();
										continue;
									}
									if (opcode == Cs2Opcodes.timeToStr) {
										isp--;
										int1 = intStack[isp];
										@Pc(11770) long local11770 = (long) int1 * 86400000L + 1014768000000L;
										aCalendar2.setTime(new Date(local11770));
										local652 = aCalendar2.get(Calendar.DATE);
										c = aCalendar2.get(Calendar.MONTH);
										local1087 = aCalendar2.get(Calendar.YEAR);
										stringStack[ssp++] = JagString.concatenate(new JagString[]{JagString.parseInt(local652), aClass100_767, DateUtil.aClass100Array40[c], aClass100_767, JagString.parseInt(local1087)});
										continue;
									}
									if (opcode == Cs2Opcodes.strForGender) {
										ssp -= 2;
										str1 = stringStack[ssp + 1];
										string = stringStack[ssp];
										if (PlayerList.self.appearance != null && PlayerList.self.appearance.gender) {
											stringStack[ssp++] = str1;
											continue;
										}
										stringStack[ssp++] = string;
										continue;
									}
									if (opcode == Cs2Opcodes.parseInt) {
										isp--;
										int1 = intStack[isp];
										stringStack[ssp++] = JagString.parseInt(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.compare) {
										ssp -= 2;
										intStack[isp++] = stringStack[ssp].compare(stringStack[ssp + 1]);
										continue;
									}
									if (opcode == Cs2Opcodes.getLineCount) {
										ssp--;
										string = stringStack[ssp];
										isp -= 2;
										int2 = intStack[isp + 1];
										int3 = intStack[isp];
										intStack[isp++] = FontMetricsList.get(int2).getParagraphLineCount(string, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getMaxLineWidth) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int2 = intStack[isp + 1];
										int3 = intStack[isp];
										intStack[isp++] = FontMetricsList.get(int2).getMaxLineWidth(string, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.chooseString) {
										ssp -= 2;
										string = stringStack[ssp];
										str1 = stringStack[ssp + 1];
										isp--;
										if (intStack[isp] == 1) {
											stringStack[ssp++] = string;
										} else {
											stringStack[ssp++] = str1;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.escape) {
										ssp--;
										string = stringStack[ssp];
										stringStack[ssp++] = Font.escape(string);
										continue;
									}
									if (opcode == Cs2Opcodes.concatChar) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										if (int3 == -1) {
											throw new RuntimeException("null char");
										}
										stringStack[ssp++] = string.concatChar(int3);
										continue;
									}
									if (opcode == Cs2Opcodes.isValidChar) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = CharUtils.isValidChar(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isAlphaNumeric) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = CharUtils.isLetterOrDigit(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isLetter) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = CharUtils.isLetter(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isDigit) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = CharUtils.isDigit(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.length) {
										ssp--;
										string = stringStack[ssp];
										if (string == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = string.length();
										}
										continue;
									}
									if (opcode == Cs2Opcodes.substr) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int3 = intStack[isp];
										int2 = intStack[isp + 1];
										stringStack[ssp++] = string.substring(int2, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.removeTags) {
										ssp--;
										string = stringStack[ssp];
										str1 = JagString.allocate(string.length());
										@Pc(12220) boolean local12220 = false;
										for (local652 = 0; local652 < string.length(); local652++) {
											c = string.charAt(local652);
											if (c == 60) {
												local12220 = true;
											} else if (c == 62) {
												local12220 = false;
											} else if (!local12220) {
												str1.append(c);
											}
										}
										str1.method3156();
										stringStack[ssp++] = str1;
										continue;
									}
									if (opcode == Cs2Opcodes.indexOfChar) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int3 = intStack[isp];
										int2 = intStack[isp + 1];
										intStack[isp++] = string.indexOf(int3, int2);
										continue;
									}
									if (opcode == Cs2Opcodes.indexOfStr) {
										ssp -= 2;
										string = stringStack[ssp];
										str1 = stringStack[ssp + 1];
										isp--;
										int2 = intStack[isp];
										intStack[isp++] = string.indexOf(str1, int2);
										continue;
									}
									if (opcode == Cs2Opcodes.toLower) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = CharUtils.toLowerCase(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.toUpper) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = CharUtils.toUpperCase(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.formatNumber) {
										isp--;
										local12388 = intStack[isp] != 0;
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = StringUtils.formatNumber(client.language, local12388, 0, int3);
										continue;
									}
								}
							}
						} else {
							if (opcode < 2000) {
								component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
							} else {
								isp--;
								component = InterfaceList.getComponent(intStack[isp]);
								opcode -= 1000;
							}
							if (opcode == Cs2Opcodes.setPosition) {
								isp -= 4;
								component.baseX = intStack[isp];
								component.baseY = intStack[isp + 1];
								int2 = intStack[isp + 3];
								if (int2 < 0) {
									int2 = 0;
								} else if (int2 > 5) {
									int2 = 5;
								}
								int3 = intStack[isp + 2];
								if (int3 < 0) {
									int3 = 0;
								} else if (int3 > 5) {
									int3 = 5;
								}
								component.xMode = (byte) int2;
								component.yMode = (byte) int3;
								InterfaceList.redraw(component);
								InterfaceList.update(component);
								if (component.createdComponentId == -1) {
									DelayedStateChange.method4675(component.id);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setSize) {
								isp -= 4;
								component.baseWidth = intStack[isp];
								component.baseHeight = intStack[isp + 1];
								component.anInt451 = 0;
								component.anInt526 = 0;
								int3 = intStack[isp + 2];
								int2 = intStack[isp + 3];
								if (int2 < 0) {
									int2 = 0;
								} else if (int2 > 4) {
									int2 = 4;
								}
								component.dynamicHeightValue = (byte) int2;
								if (int3 < 0) {
									int3 = 0;
								} else if (int3 > 4) {
									int3 = 4;
								}
								component.dynamicWidthValue = (byte) int3;
								InterfaceList.redraw(component);
								InterfaceList.update(component);
								if (component.type == 0) {
									InterfaceList.method531(component, false);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setHidden) {
								isp--;
								local1552 = intStack[isp] == 1;
								if (local1552 != component.hidden) {
									component.hidden = local1552;
									InterfaceList.redraw(component);
								}
								if (component.createdComponentId == -1) {
									DelayedStateChange.method1906(component.id);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setAspect) {
								isp -= 2;
								component.aspectWidth = intStack[isp];
								component.aspectHeight = intStack[isp + 1];
								InterfaceList.redraw(component);
								InterfaceList.update(component);
								if (component.type == 0) {
									InterfaceList.method531(component, false);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setNoClickThrough) {
								isp--;
								component.noClickThrough = intStack[isp] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14378) Exception ex) {
			if (script.name == null) {
				if (client.modeWhere != 0) {
					Chat.add(EMPTY_STRING, 0, CS_ERROR);
				}
				TracingException.report("CS2 - scr:" + script.key + " op:" + op, ex);
			} else {
				@Pc(14385) JagString str = JagString.allocate(30);
				str.method3113(aClass100_928).method3113(script.name);
				for (cycles = fp - 1; cycles >= 0; cycles--) {
					str.method3113(aClass100_253).method3113(callStack[cycles].script.name);
				}
				if (op == 40) {
					cycles = intOperands[pc];
					str.method3113(aClass100_802).method3113(JagString.parseInt(cycles));
				}
				if (client.modeWhere != 0) {
					Chat.add(EMPTY_STRING, 0, JagString.concatenate(new JagString[]{aClass100_780, script.name}));
				}
				TracingException.report("CS2 - scr:" + script.key + " op:" + op + new String(str.method3148()), ex);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jl;)V")
	public static void run(@OriginalArg(1) HookRequest request) {
		run(200000, request);
	}

}
