package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (WorldMap.loadPercentage < 100) {
			WorldMap.method3413();
		}
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg1, arg0 + arg3, arg2 + arg1);
		} else {
			SoftwareRaster.setClip(arg0, arg1, arg0 + arg3, arg2 + arg1);
		}
		@Pc(50) int local50;
		@Pc(61) int local61;
		if (WorldMap.loadPercentage < 100) {
			local50 = arg0 + arg3 / 2;
			local61 = arg2 / 2 + arg1 - 18 - 20;
			if (GlRenderer.enabled) {
				GlRaster.method1186(arg0, arg1, arg3, arg2, 0);
				GlRaster.method1179(local50 - 152, local61, 304, 34, 9179409);
				GlRaster.method1179(local50 - 151, local61 + 1, 302, 32, 0);
				GlRaster.method1186(local50 - 150, local61 + 2, WorldMap.loadPercentage * 3, 30, 9179409);
				GlRaster.method1186(local50 + WorldMap.loadPercentage * 3 - 150, local61 - -2, 300 - WorldMap.loadPercentage * 3, 30, 0);
			} else {
				SoftwareRaster.fillRect(arg0, arg1, arg3, arg2, 0);
				SoftwareRaster.drawRect(local50 - 152, local61, 304, 34, 9179409);
				SoftwareRaster.drawRect(local50 - 151, local61 + 1, 302, 32, 0);
				SoftwareRaster.fillRect(local50 - 150, local61 + 2, WorldMap.loadPercentage * 3, 30, 9179409);
				SoftwareRaster.fillRect(WorldMap.loadPercentage * 3 + local50 - 150, local61 - -2, 300 - WorldMap.loadPercentage * 3, 30, 0);
			}
			Fonts.b12Full.renderCenter(LocalizedText.LOADINGDOTDOTDOT, local50, local61 + 20, 16777215, -1);
			return;
		}
		WorldMap.anInt1176 = (int) ((float) (arg2 * 2) / WorldMap.zoom);
		Static1.anInt2882 = WorldMap.anInt435 - (int) ((float) arg3 / WorldMap.zoom);
		@Pc(211) int local211 = WorldMap.anInt435 - (int) ((float) arg3 / WorldMap.zoom);
		local50 = WorldMap.anInt919 - (int) ((float) arg2 / WorldMap.zoom);
		Static1.anInt2884 = WorldMap.anInt919 - (int) ((float) arg2 / WorldMap.zoom);
		@Pc(236) int local236 = WorldMap.anInt919 + (int) ((float) arg2 / WorldMap.zoom);
		local61 = (int) ((float) arg3 / WorldMap.zoom) + WorldMap.anInt435;
		WorldMap.anInt2387 = (int) ((float) (arg3 * 2) / WorldMap.zoom);
		if (GlRenderer.enabled) {
			if (WorldMap.aClass3_Sub2_Sub1_Sub1_2 == null || WorldMap.aClass3_Sub2_Sub1_Sub1_2.width != arg3 || WorldMap.aClass3_Sub2_Sub1_Sub1_2.height != arg2) {
				WorldMap.aClass3_Sub2_Sub1_Sub1_2 = null;
				WorldMap.aClass3_Sub2_Sub1_Sub1_2 = new SoftwareSprite(arg3, arg2);
			}
			SoftwareRaster.setSize(WorldMap.aClass3_Sub2_Sub1_Sub1_2.pixels, arg3, arg2);
			WorldMap.method4364(arg3, 0, local61, local50, 0, local236, arg2, local211);
			method1195(arg3, 0, local61, local236, arg2, 0, local211, local50);
			Static38.method959(0, 0, local211, arg3, local236, local50, local61, arg2);
			GlRaster.method1178(WorldMap.aClass3_Sub2_Sub1_Sub1_2.pixels, arg0, arg1, arg3, arg2);
			SoftwareRaster.pixels = null;
		} else {
			WorldMap.method4364(arg3 + arg0, arg1, local61, local50, arg0, local236, arg1 + arg2, local211);
			method1195(arg0 + arg3, arg0, local61, local236, arg2 + arg1, arg1, local211, local50);
			Static38.method959(arg0, arg1, local211, arg0 + arg3, local236, local50, local61, arg2 + arg1);
		}
		if (WorldMap.anInt1864 > 0) {
			Static1.anInt2428--;
			if (Static1.anInt2428 == 0) {
				Static1.anInt2428 = 20;
				WorldMap.anInt1864--;
			}
		}

		if (Cheat.displayFps) {
			@Pc(405) int local405 = arg1 + arg2 - 8;
			@Pc(412) int local412 = arg0 + arg3 - 5;
			Fonts.p12Full.renderRight(JagString.concatenate(new JagString[]{Cheat.DEBUG_FPS, JagString.parseInt((int)GameShell.framesPerSecond)}), local412, local405, 16776960, -1);
			@Pc(434) Runtime runtime = Runtime.getRuntime();
			@Pc(443) int memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L / 1024L);
			@Pc(445) int color = 16776960;
			@Pc(446) int local446 = local405 - 15;
			if (memory > 95) {
				color = 16711680;
			}
			Fonts.p12Full.renderRight(JagString.concatenate(new JagString[]{Cheat.DEBUG_MEMORY, JagString.parseInt(memory), Cheat.DEBUG_MEMORY_UNIT}), local412, local446, color, -1);
			local405 = local446 - 15;
		}
	}

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)V")
    public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
        @Pc(13) int local13 = arg2 - arg6;
        @Pc(17) int local17 = arg3 - arg7;
        @Pc(26) int local26 = (arg0 - arg1 << 16) / local13;
        @Pc(35) int local35 = (arg4 - arg5 << 16) / local17;
        Static232.method3991(arg1, arg3, arg2, local35, arg6, local26, arg7, arg5);
    }
}
