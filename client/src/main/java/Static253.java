import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
	public static int anInt5526;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
	public static int anInt5527;

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!ui", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ui", name = "mb", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static136.anInt3325++;
		Static210.method3711();
		if (!arg1) {
			Static38.method964(true);
			Static173.method3240(true);
			Static38.method964(false);
		}
		Static173.method3240(false);
		if (!arg1) {
			Static195.method3532();
		}
		Static246.method4239();
		if (GlRenderer.enabled) {
			Static115.method2314(arg3, arg4, arg0, arg2, true);
			arg2 = Static7.anInt983;
			arg4 = Static24.anInt773;
			arg3 = Static166.anInt4055;
			arg0 = Static245.anInt5377;
		}
		@Pc(59) int local59;
		@Pc(57) int local57;
		if (Static227.cameraType == 1) {
			local57 = Static230.anInt5161 + (int)Camera.yawTarget & 0x7FF;
			local59 = (int)Camera.pitchTarget;
			if (local59 < Static234.anInt5245 / 256) {
				local59 = Static234.anInt5245 / 256;
			}
			if (Static176.aBooleanArray95[4] && Static276.anIntArray564[4] + 128 > local59) {
				local59 = Static276.anIntArray564[4] + 128;
			}
			Static18.method555(Static81.cameraX, arg0, SceneGraph.getTileHeight(Static55.level, PlayerList.self.xFine, PlayerList.self.zFine) - 50, 600 - -(local59 * 3), local57, Static111.cameraZ, local59);
		}
		local57 = Static5.anInt40;
		local59 = Static138.renderX;
		@Pc(121) int local121 = Static134.renderZ;
		@Pc(123) int local123 = Static240.cameraPitch;
		@Pc(125) int local125 = Static184.cameraYaw;
		@Pc(127) int local127;
		@Pc(171) int local171;
		for (local127 = 0; local127 < 5; local127++) {
			if (Static176.aBooleanArray95[local127]) {
				local171 = (int) ((double) -Static222.anIntArray437[local127] + (double) (Static222.anIntArray437[local127] * 2 + 1) * Math.random() + Math.sin((double) Static31.anIntArray76[local127] * ((double) Static202.anIntArray424[local127] / 100.0D)) * (double) Static276.anIntArray564[local127]);
				if (local127 == 3) {
					Static184.cameraYaw = local171 + Static184.cameraYaw & 0x7FF;
				}
				if (local127 == 4) {
					Static240.cameraPitch += local171;
					if (Static240.cameraPitch < 128) {
						Static240.cameraPitch = 128;
					}
					if (Static240.cameraPitch > 383) {
						Static240.cameraPitch = 383;
					}
				}
				if (local127 == 2) {
					Static134.renderZ += local171;
				}
				if (local127 == 1) {
					Static5.anInt40 += local171;
				}
				if (local127 == 0) {
					Static138.renderX += local171;
				}
			}
		}
		Static252.method4302();
		if (GlRenderer.enabled) {
			Static46.method1187(arg2, arg4, arg2 + arg3, arg4 - -arg0);
			@Pc(248) float local248 = (float) Static240.cameraPitch * 0.17578125F;
			@Pc(253) float local253 = (float) Static184.cameraYaw * 0.17578125F;
			if (Static227.cameraType == 3) {
				local248 = Static146.aFloat15 * 360.0F / 6.2831855F;
				local253 = Static84.aFloat10 * 360.0F / 6.2831855F;
			}
			GlRenderer.method4171(arg2, arg4, arg3, arg0, arg3 / 2 + arg2, arg4 - -(arg0 / 2), local248, local253, Static223.anInt5029, Static223.anInt5029);
		} else {
			SoftwareRaster.method2496(arg2, arg4, arg3 + arg2, arg0 + arg4);
			Rasteriser.prepare();
		}
		if (Static60.aBoolean108 || Static155.anInt3751 < arg2 || Static155.anInt3751 >= arg3 + arg2 || arg4 > Static60.anInt1892 || arg0 + arg4 <= Static60.anInt1892) {
			Static39.aBoolean77 = false;
			Static2.anInt7 = 0;
		} else {
			Static39.aBoolean77 = true;
			Static2.anInt7 = 0;
			local171 = Static247.screenUpperX;
			@Pc(344) int local344 = Static1.screenLowerY;
			local127 = Static240.screenLowerX;
			Static150.anInt3582 = local127 + (local171 - local127) * (-arg2 + Static155.anInt3751) / arg3;
			@Pc(361) int local361 = Static148.screenUpperY;
			Static34.anInt1053 = (local361 - local344) * (Static60.anInt1892 - arg4) / arg0 + local344;
		}
		client.audioLoop();
		@Pc(387) byte local387 = Static236.method4047() == 2 ? (byte) Static136.anInt3325 : 1;
		if (GlRenderer.enabled) {
			GlRenderer.method4173();
			GlRenderer.setDepthTestEnabled(true);
			GlRenderer.setFogEnabled(true);
			if (client.gameState == 10) {
				local171 = Static103.method2235(Static178.anInt4247, Static134.renderZ >> 10, Preferences.brightness, Static138.renderX >> 10);
			} else {
				local171 = Static103.method2235(Static178.anInt4247, PlayerList.self.movementQueueZ[0] >> 3, Preferences.brightness, PlayerList.self.movementQueueX[0] >> 3);
			}
			Static120.method2394(Static83.loop, !Preferences.flickeringEffectsOn);
			GlRenderer.clearColorAndDepthBuffers(local171);
			Static143.method2731(Static240.cameraPitch, Static134.renderZ, Static5.anInt40, Static138.renderX, Static184.cameraYaw);
			GlRenderer.anInt5323 = Static83.loop;
			Static156.method2954(Static138.renderX, Static5.anInt40, Static134.renderZ, Static240.cameraPitch, Static184.cameraYaw, Static266.aByteArrayArrayArray15, Static79.anIntArray205, Static149.anIntArray338, Static267.anIntArray518, Static50.anIntArray134, Static243.anIntArray476, Static55.level + 1, local387, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7);
			Static263.aBoolean299 = true;
			Static120.method2390();
			Static143.method2731(0, 0, 0, 0, 0);
			client.audioLoop();
			Static223.method3858();
			Static142.method2726(arg4, arg3, arg2, Static223.anInt5029, arg0, Static223.anInt5029);
			Static233.method4000(arg3, arg2, arg0, Static223.anInt5029, Static223.anInt5029, arg4);
		} else {
			SoftwareRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			Static156.method2954(Static138.renderX, Static5.anInt40, Static134.renderZ, Static240.cameraPitch, Static184.cameraYaw, Static266.aByteArrayArrayArray15, Static79.anIntArray205, Static149.anIntArray338, Static267.anIntArray518, Static50.anIntArray134, Static243.anIntArray476, Static55.level + 1, local387, PlayerList.self.xFine >> 7, PlayerList.self.zFine >> 7);
			client.audioLoop();
			Static223.method3858();
			Static142.method2726(arg4, arg3, arg2, 256, arg0, 256);
			Static233.method4000(arg3, arg2, arg0, 256, 256, arg4);
		}
		((Js5GlTextureProvider) Rasteriser.textureProvider).method3239(Static178.anInt4247);
		Static115.method2310(arg3, arg4, arg0, arg2);
		Static240.cameraPitch = local123;
		Static134.renderZ = local121;
		Static5.anInt40 = local57;
		Static138.renderX = local59;
		Static184.cameraYaw = local125;
		if (Static19.aBoolean43 && client.js5NetQueue.method2328() == 0) {
			Static19.aBoolean43 = false;
		}
		if (Static19.aBoolean43) {
			if (GlRenderer.enabled) {
				Static46.method1186(arg2, arg4, arg3, arg0, 0);
			} else {
				SoftwareRaster.fillRect(arg2, arg4, arg3, arg0, 0);
			}
			Static114.drawTextOnScreen(false, LocalizedText.LOADING);
		}
		if (!arg1 && !Static19.aBoolean43 && !Static60.aBoolean108 && arg2 <= Static155.anInt3751 && arg3 + arg2 > Static155.anInt3751 && arg4 <= Static60.anInt1892 && arg0 + arg4 > Static60.anInt1892) {
			Static176.method3304(arg4, arg3, arg0, arg2, Static60.anInt1892, Static155.anInt3751);
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)V")
	public static void method4332(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && MapList.aBooleanArray130.length > arg0) {
			MapList.aBooleanArray130[arg0] = !MapList.aBooleanArray130[arg0];
		}
	}
}
