package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Camera {
	@OriginalMember(owner = "client!id", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray9 = new int[2][][];
	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
	public static final int[] cameraJitter = new int[5];
	@OriginalMember(owner = "client!wh", name = "m", descriptor = "[I")
	public static final int[] cameraAmplitude = new int[5];
	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "[I")
	public static final int[] cameraFrequency = new int[5];
	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[Z")
	public static final boolean[] customCameraActive = new boolean[5];
	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public static double pitchTarget = 128;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static double yawTarget = 0;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public static double pitchAccel = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static int cameraZ;
	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
	public static int cameraX;
	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int cameraPitch;
	@OriginalMember(owner = "client!ol", name = "ib", descriptor = "I")
	public static int cameraYaw;
	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public static int cameraType;
	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public static int anInt2119 = 0;
	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public static int anInt1694 = -1;
	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	public static int anInt5843 = 0;
	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public static int anInt5101 = 0;
	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	public static int anInt5224 = 0;
	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt3125 = 0;
	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt3718 = -1;
	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public static int originZ;
	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public static int originX;
	@OriginalMember(owner = "client!bc", name = "I", descriptor = "Z")
	public static boolean aBoolean16 = false;
	@OriginalMember(owner = "client!km", name = "Pc", descriptor = "I")
	public static int renderX;
	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public static int renderZ;
	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public static int anInt4232;
	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public static int anInt5449;
	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	public static int anInt5765;
	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public static int anInt5375;
	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Z")
	public static boolean aBoolean205 = false;
	@OriginalMember(owner = "client!gk", name = "d", descriptor = "F")
	public static float aFloat10;
	public static int ZOOM = 600;
	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	public static int anInt4612;
	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public static int anInt1744;
	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt5230;
	@OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
	public static int anInt3291 = 0;
	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static int anInt4229 = 2;
	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	public static int anInt5245 = 0;
	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public static int anInt4774 = 0;
	@OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
	public static int anInt5161 = 0;
	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public static int anInt40;
	@OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
	public static float aFloat15;
	@OriginalMember(owner = "client!sk", name = "jb", descriptor = "I")
	public static int anInt5203;
	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt5217;
	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public static int anInt5225;

	public static double mod(double a, double b) {
		return ((a % b) + b) % b;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V")
	public static void clampCameraAngle() {
		if (pitchTarget < 128) {
			pitchTarget = 128;
		}
		if (pitchTarget > 383) {
			pitchTarget = 383;
		}
		yawTarget = mod(yawTarget, 2047.0d);
		@Pc(33) int local33 = cameraX >> 7;
		@Pc(37) int local37 = cameraZ >> 7;
		@Pc(43) int local43 = SceneGraph.getTileHeight(Player.plane, cameraX, cameraZ);
		@Pc(45) int local45 = 0;
		@Pc(64) int local64;
		if (local33 > 3 && local37 > 3 && local33 < 100 && local37 < 100) {
			for (local64 = local33 - 4; local64 <= local33 + 4; local64++) {
				for (@Pc(73) int local73 = local37 - 4; local73 <= local37 + 4; local73++) {
					@Pc(80) int local80 = Player.plane;
					if (local80 < 3 && (SceneGraph.renderFlags[1][local64][local73] & 0x2) == 2) {
						local80++;
					}
					@Pc(117) int local117 = (SceneGraph.aByteArrayArrayArray13[local80][local64][local73] & 0xFF) * 8 + local43 - SceneGraph.tileHeights[local80][local64][local73];
					if (local117 > local45) {
						local45 = local117;
					}
				}
			}
		}
		local64 = local45 * 192;
		if (local64 > 98048) {
			local64 = 98048;
		}
		if (local64 < 32768) {
			local64 = 32768;
		}
		if (anInt5245 < local64) {
			anInt5245 += (local64 - anInt5245) / 24;
		} else if (local64 < anInt5245) {
			anInt5245 += (local64 - anInt5245) / 80;
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public static void updateLockedCamera() {
		@Pc(9) int local9 = anInt4232 * 128 + 64;
		@Pc(15) int local15 = anInt5375 * 128 + 64;
		@Pc(23) int local23 = SceneGraph.getTileHeight(Player.plane, local15, local9) - anInt5203;
		if (anInt4612 >= 100) {
			renderX = anInt5375 * 128 + 64;
			renderZ = anInt4232 * 128 + 64;
			anInt40 = SceneGraph.getTileHeight(Player.plane, renderX, renderZ) - anInt5203;
		} else {
			if (renderX < local15) {
				renderX += anInt5225 + anInt4612 * (local15 - renderX) / 1000;
				if (renderX > local15) {
					renderX = local15;
				}
			}
			if (anInt40 < local23) {
				anInt40 += (local23 - anInt40) * anInt4612 / 1000 + anInt5225;
				if (anInt40 > local23) {
					anInt40 = local23;
				}
			}
			if (renderX > local15) {
				renderX -= anInt5225 + (renderX - local15) * anInt4612 / 1000;
				if (renderX < local15) {
					renderX = local15;
				}
			}
			if (renderZ < local9) {
				renderZ += anInt5225 + anInt4612 * (local9 - renderZ) / 1000;
				if (local9 < renderZ) {
					renderZ = local9;
				}
			}
			if (local23 < anInt40) {
				anInt40 -= (anInt40 - local23) * anInt4612 / 1000 + anInt5225;
				if (local23 > anInt40) {
					anInt40 = local23;
				}
			}
			if (renderZ > local9) {
				renderZ -= anInt5225 + (renderZ - local9) * anInt4612 / 1000;
				if (local9 > renderZ) {
					renderZ = local9;
				}
			}
		}
		local9 = anInt5765 * 128 + 64;
		local15 = anInt5449 * 128 + 64;
		local23 = SceneGraph.getTileHeight(Player.plane, local15, local9) - anInt1744;
		@Pc(236) int local236 = local23 - anInt40;
		@Pc(241) int local241 = local9 - renderZ;
		@Pc(246) int local246 = local15 - renderX;
		@Pc(257) int local257 = (int) Math.sqrt(local246 * local246 + local241 * local241);
		@Pc(268) int local268 = (int) (Math.atan2(local236, local257) * 325.949D) & 0x7FF;
		if (local268 < 128) {
			local268 = 128;
		}
		if (local268 > 383) {
			local268 = 383;
		}
		@Pc(292) int local292 = (int) (-325.949D * Math.atan2(local246, local241)) & 0x7FF;
		if (cameraPitch < local268) {
			cameraPitch += anInt5230 + anInt5217 * (local268 - cameraPitch) / 1000;
			if (cameraPitch > local268) {
				cameraPitch = local268;
			}
		}
		if (cameraPitch > local268) {
			cameraPitch -= (cameraPitch - local268) * anInt5217 / 1000 + anInt5230;
			if (cameraPitch < local268) {
				cameraPitch = local268;
			}
		}
		@Pc(350) int local350 = local292 - cameraYaw;
		if (local350 > 1024) {
			local350 -= 2048;
		}
		if (local350 < -1024) {
			local350 += 2048;
		}
		if (local350 > 0) {
			cameraYaw += local350 * anInt5217 / 1000 + anInt5230;
			cameraYaw &= 0x7FF;
		}
		if (local350 < 0) {
			cameraYaw -= anInt5217 * -local350 / 1000 + anInt5230;
			cameraYaw &= 0x7FF;
		}
		@Pc(404) int local404 = local292 - cameraYaw;
		if (local404 > 1024) {
			local404 -= 2048;
		}
		if (local404 < -1024) {
			local404 += 2048;
		}
		if (local404 < 0 && local350 > 0 || local404 > 0 && local350 < 0) {
			cameraYaw = local292;
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public static void updateLoginScreenCamera() {
		if (anInt3718 == -1 || anInt1694 == -1) {
			return;
		}
		@Pc(27) int local27 = (anInt5224 * (anInt5843 - anInt5101) >> 16) + anInt5101;
		@Pc(30) float[] renderCoordinates = new float[3];
		anInt5224 += local27;
		if (anInt5224 >= 65535) {
			anInt5224 = 65535;
			aBoolean16 = !aBoolean205;
			aBoolean205 = true;
		} else {
			aBoolean205 = false;
			aBoolean16 = false;
		}
		@Pc(66) float local66 = (float) anInt5224 / 65535.0F;
		@Pc(70) int local70 = anInt3125 * 2;
		@Pc(141) int local141;
		@Pc(131) int local131;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(146) int local146;
		@Pc(155) int local155;
		@Pc(173) int local173;
		for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
			local111 = (anIntArrayArrayArray9[anInt3718][local70 + 2][local72] + anIntArrayArrayArray9[anInt3718][local70 + 2][local72] - anIntArrayArrayArray9[anInt3718][local70 + 3][local72]) * 3;
			local119 = anIntArrayArrayArray9[anInt3718][local70][local72];
			local131 = anIntArrayArrayArray9[anInt3718][local70 + 1][local72] * 3;
			local141 = anIntArrayArrayArray9[anInt3718][local70][local72] * 3;
			local146 = local131 - local141;
			local155 = local111 + local141 - local131 * 2;
			local173 = anIntArrayArrayArray9[anInt3718][local70 + 2][local72] + local131 - local119 - local111;
			renderCoordinates[local72] = (float) local119 + (((float) local173 * local66 + (float) local155) * local66 + (float) local146) * local66;
		}
		anInt40 = (int) renderCoordinates[1] * -1;
		renderX = (int) renderCoordinates[0] - originX * 128;
		renderZ = (int) renderCoordinates[2] - originZ * 128;
		@Pc(226) float[] local226 = new float[3];
		local141 = anInt2119 * 2;
		for (local131 = 0; local131 < 3; local131++) {
			local111 = anIntArrayArrayArray9[anInt1694][local141][local131] * 3;
			local146 = (anIntArrayArrayArray9[anInt1694][local141 + 2][local131] + anIntArrayArrayArray9[anInt1694][local141 + 2][local131] - anIntArrayArrayArray9[anInt1694][local141 + 3][local131]) * 3;
			local155 = anIntArrayArrayArray9[anInt1694][local141][local131];
			local119 = anIntArrayArrayArray9[anInt1694][local141 + 1][local131] * 3;
			local173 = local119 - local111;
			@Pc(313) int local313 = local146 + local111 - local119 * 2;
			@Pc(331) int local331 = anIntArrayArrayArray9[anInt1694][local141 + 2][local131] + local119 - local146 - local155;
			local226[local131] = (float) local155 + local66 * (local66 * (local66 * (float) local331 + (float) local313) + (float) local173);
		}
		@Pc(363) float local363 = local226[0] - renderCoordinates[0];
		@Pc(371) float local371 = local226[2] - renderCoordinates[2];
		@Pc(382) float local382 = (local226[1] - renderCoordinates[1]) * -1.0F;
		@Pc(392) double local392 = Math.sqrt(local371 * local371 + local363 * local363);
		aFloat15 = (float) Math.atan2(local382, local392);
		aFloat10 = -((float) Math.atan2(local363, local371));
		cameraPitch = (int) ((double) aFloat15 * 325.949D) & 0x7FF;
		cameraYaw = (int) ((double) aFloat10 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIBI)V")
	public static void method3849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		anInt5230 = arg2;
		anInt5765 = arg1;
		anInt5217 = arg4;
		anInt5449 = arg3;
		anInt1744 = arg0;
		if (anInt5217 >= 100) {
			@Pc(30) int local30 = anInt5449 * 128 + 64;
			@Pc(36) int local36 = anInt5765 * 128 + 64;
			@Pc(44) int local44 = SceneGraph.getTileHeight(Player.plane, local30, local36) - anInt1744;
			@Pc(49) int local49 = local44 - anInt40;
			@Pc(54) int local54 = local30 - renderX;
			@Pc(59) int local59 = local36 - renderZ;
			@Pc(70) int local70 = (int) Math.sqrt(local59 * local59 + local54 * local54);
			cameraPitch = (int) (Math.atan2(local49, local70) * 325.949D) & 0x7FF;
			cameraYaw = (int) (Math.atan2(local54, local59) * -325.949D) & 0x7FF;
			if (cameraPitch < 128) {
				cameraPitch = 128;
			}
			if (cameraPitch > 383) {
				cameraPitch = 383;
			}
		}
		cameraType = 2;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIBII)V")
	public static void method2722(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		anInt4612 = arg3;
		anInt5203 = arg2;
		anInt5375 = arg5;
		anInt5225 = arg1;
		anInt4232 = arg4;
		if (arg0 && anInt4612 >= 100) {
			renderX = anInt5375 * 128 + 64;
			renderZ = anInt4232 * 128 + 64;
			anInt40 = SceneGraph.getTileHeight(Player.plane, renderX, renderZ) - anInt5203;
		}
		cameraType = 2;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	public static void resetCameraEffects() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			customCameraActive[local3] = false;
		}
		anInt5230 = 0;
		anInt5217 = 0;
		anInt3718 = -1;
		anInt1694 = -1;
		cameraType = 1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4273() {
		@Pc(14) int playerX = PlayerList.self.xFine + anInt3291;
		@Pc(20) int playerZ = PlayerList.self.zFine + anInt4774;
		if (cameraX - playerX < -500 || cameraX - playerX > 500 || cameraZ - playerZ < -500 || cameraZ - playerZ > 500) {
			cameraX = playerX;
			cameraZ = playerZ;
		}
		if (cameraZ != playerZ) {
			cameraZ += (playerZ - cameraZ) / 16;
		}
		if (cameraX != playerX) {
			cameraX += (playerX - cameraX) / 16;
		}
		if (Preferences.aBoolean63) {
			for (@Pc(93) int local93 = 0; local93 < InterfaceList.keyQueueSize; local93++) {
				@Pc(104) int code = InterfaceList.keyCodes[local93];
				if (code == Keyboard.KEY_UP) {
					pitchTarget += 47;
				} else if (code == Keyboard.KEY_DOWN) {
					pitchTarget -= 17;
				} else if (code == Keyboard.KEY_LEFT) {
					yawTarget -= 65;
				} else if (code == Keyboard.KEY_RIGHT) {
					yawTarget += 191;
				}
			}
			clampCameraAngle();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5;
		@Pc(29) int local29;
		if (GlRenderer.enabled) {
			local5 = arg1 - 334;
			if (local5 < 0) {
				local5 = 0;
			} else if (local5 > 100) {
				local5 = 100;
			}
			local29 = local5 * (ScriptRunner.aShort27 - ScriptRunner.aShort30) / 100 + ScriptRunner.aShort30;
			arg3 = local29 * arg3 >> 8;
		}
		local5 = 2048 - arg6 & 0x7FF;
		local29 = 2048 - arg4 & 0x7FF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = arg3;
		@Pc(59) int local59 = 0;
		@Pc(72) int local72;
		@Pc(68) int local68;
		if (local5 != 0) {
			local68 = MathUtils.cos[local5];
			local72 = MathUtils.sin[local5];
			local59 = local72 * -arg3 >> 16;
			local57 = local68 * arg3 >> 16;
		}
		if (local29 != 0) {
			local72 = MathUtils.sin[local29];
			local68 = MathUtils.cos[local29];
			local55 = local72 * local57 >> 16;
			local57 = local57 * local68 >> 16;
		}
		cameraPitch = arg6;
		cameraYaw = arg4;
		renderZ = arg5 - local57;
		renderX = arg0 - local55;
		anInt40 = arg2 - local59;
	}
}
