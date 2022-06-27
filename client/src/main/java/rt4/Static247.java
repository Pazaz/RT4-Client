package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "[I")
	public static final int[] anIntArray294 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	@OriginalMember(owner = "client!uj", name = "A", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	@OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static final int[] anIntArray215 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	@OriginalMember(owner = "client!km", name = "Rc", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	@OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
	public static int anInt730 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
	public static void method4244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (TextureOp29.anInt4164 <= arg1 && TextureOp29.anInt5063 >= arg3 && TextureOp29.anInt5773 <= arg2 && arg4 <= TextureOp29.anInt2869) {
			if (arg5 == 1) {
				Static134.method2622(arg0, arg3, arg2, arg4, arg1);
			} else {
				method3334(arg3, arg2, arg0, arg4, arg5, arg1);
			}
		} else if (arg5 == 1) {
			Static173.method3246(arg0, arg1, arg4, arg3, arg2);
		} else {
			Static10.method352(arg4, arg5, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!rh;IIIIIIIZ)V")
    public static void method2610(@OriginalArg(0) PlainTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
        @Pc(6) int local6;
        @Pc(7) int local7 = local6 = (arg6 << 7) - Static123.anInt3555;
        @Pc(14) int local14;
        @Pc(15) int local15 = local14 = (arg7 << 7) - Static217.anInt4903;
        @Pc(20) int local20;
        @Pc(21) int local21 = local20 = local7 + 128;
        @Pc(26) int local26;
        @Pc(27) int local27 = local26 = local15 + 128;
        @Pc(37) int local37 = SceneGraph.tileHeights[arg1][arg6][arg7] - Static123.anInt3947;
        @Pc(49) int local49 = SceneGraph.tileHeights[arg1][arg6 + 1][arg7] - Static123.anInt3947;
        @Pc(63) int local63 = SceneGraph.tileHeights[arg1][arg6 + 1][arg7 + 1] - Static123.anInt3947;
        @Pc(75) int local75 = SceneGraph.tileHeights[arg1][arg6][arg7 + 1] - Static123.anInt3947;
        @Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
        @Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
        @Pc(97) int local97 = local85;
        @Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
        @Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
        @Pc(119) int local119 = local107;
        if (local117 < 50) {
            return;
        }
        local85 = local14 * arg4 + local21 * arg5 >> 16;
        @Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
        local21 = local85;
        local85 = local49 * arg3 - local143 * arg2 >> 16;
        @Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
        local49 = local85;
        if (local165 < 50) {
            return;
        }
        local85 = local27 * arg4 + local20 * arg5 >> 16;
        local27 = local27 * arg5 - local20 * arg4 >> 16;
        @Pc(193) int local193 = local85;
        local85 = local63 * arg3 - local27 * arg2 >> 16;
        local27 = local63 * arg2 + local27 * arg3 >> 16;
        local63 = local85;
        if (local27 < 50) {
            return;
        }
        local85 = local26 * arg4 + local6 * arg5 >> 16;
        @Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
        @Pc(241) int local241 = local85;
        local85 = local75 * arg3 - local239 * arg2 >> 16;
        @Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
        if (local261 < 50) {
            return;
        }
        @Pc(275) int local275 = Rasteriser.centerX + (local97 << 9) / local117;
        @Pc(283) int local283 = Rasteriser.centerY + (local119 << 9) / local117;
        @Pc(291) int local291 = Rasteriser.centerX + (local21 << 9) / local165;
        @Pc(299) int local299 = Rasteriser.centerY + (local49 << 9) / local165;
        @Pc(307) int local307 = Rasteriser.centerX + (local193 << 9) / local27;
        @Pc(315) int local315 = Rasteriser.centerY + (local63 << 9) / local27;
        @Pc(323) int local323 = Rasteriser.centerX + (local241 << 9) / local261;
        @Pc(331) int local331 = Rasteriser.centerY + (local85 << 9) / local261;
        Rasteriser.alpha = 0;
        @Pc(475) int local475;
        if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
            if (MiniMenu.aBoolean187 && Static147.method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local315, local331, local299, local307, local323, local291)) {
                MiniMenu.anInt1742 = arg6;
                MiniMenu.anInt2954 = arg7;
            }
            if (!GlRenderer.enabled && !arg8) {
                Rasteriser.testX = false;
                if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Rasteriser.width || local323 > Rasteriser.width || local291 > Rasteriser.width) {
                    Rasteriser.testX = true;
                }
                if (arg0.anInt4869 == -1) {
                    if (arg0.anInt4865 != 12345678) {
                        Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867);
                    }
                } else if (!Preferences.manyGroundTextures) {
                    local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
                    Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, Static147.method1640(local475, arg0.anInt4865), Static147.method1640(local475, arg0.anInt4864), Static147.method1640(local475, arg0.anInt4867));
                } else if (arg0.aBoolean241) {
                    Rasteriser.fillTexturedTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
                } else {
                    Rasteriser.fillTexturedTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4869);
                }
            }
        }
        if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
            return;
        }
        if (MiniMenu.aBoolean187 && Static147.method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local283, local299, local331, local275, local291, local323)) {
            MiniMenu.anInt1742 = arg6;
            MiniMenu.anInt2954 = arg7;
        }
        if (GlRenderer.enabled || arg8) {
            return;
        }
        Rasteriser.testX = false;
        if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Rasteriser.width || local291 > Rasteriser.width || local323 > Rasteriser.width) {
            Rasteriser.testX = true;
        }
        if (arg0.anInt4869 == -1) {
            if (arg0.anInt4872 != 12345678) {
                Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864);
            }
        } else if (Preferences.manyGroundTextures) {
            Rasteriser.fillTexturedTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
        } else {
            local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
            Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, Static147.method1640(local475, arg0.anInt4872), Static147.method1640(local475, arg0.anInt4867), Static147.method1640(local475, arg0.anInt4864));
        }
    }

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	public static void method3334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg4 + arg1;
		@Pc(14) int local14 = arg3 - arg4;
		@Pc(29) int local29 = arg4 + arg5;
		@Pc(31) int local31;
		for (local31 = arg1; local31 < local5; local31++) {
			TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		for (local31 = arg3; local31 > local14; local31--) {
			TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local31], arg5, arg0, arg2);
		}
		@Pc(70) int local70 = arg0 - arg4;
		for (local31 = local5; local31 <= local14; local31++) {
			@Pc(83) int[] local83 = TextureOp29SubOp4.anIntArrayArray10[local31];
			TextureOp29SubOp4.method2576(local83, arg5, local29, arg2);
			TextureOp29SubOp4.method2576(local83, local70, arg0, arg2);
		}
	}
}
