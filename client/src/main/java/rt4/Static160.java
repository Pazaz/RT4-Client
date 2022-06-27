package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int anInt2886;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!be;IB)V")
	public static void method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (GlRenderer.enabled) {
			GlRaster.setClip(arg0, arg1, arg2.width + arg0, arg2.height + arg1);
		}
		if (MiniMap.state >= 3) {
			if (GlRenderer.enabled) {
				@Pc(44) Sprite local44 = arg2.method489(false);
				if (local44 != null) {
					local44.render(arg0, arg1);
				}
			} else {
				SoftwareRaster.method2504(arg0, arg1, arg2.anIntArray37, arg2.anIntArray45);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Sprites.compass).renderRotatedTransparent(arg0, arg1, arg2.width, arg2.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int)Camera.yawTarget, 256, (GlSprite) arg2.method489(false));
		} else {
			((SoftwareSprite) Sprites.compass).renderRotated(arg0, arg1, arg2.width, arg2.height, Sprites.compass.width / 2, Sprites.compass.height / 2, (int)Camera.yawTarget, arg2.anIntArray37, arg2.anIntArray45);
		}
		InterfaceList.rectangleRedraw[arg3] = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static231.anInt5205 + arg0 * Static81.anInt2222 >> 16;
		@Pc(19) int local19 = arg3 * Static81.anInt2222 - arg0 * Static231.anInt5205 >> 16;
		@Pc(29) int local29 = arg1 * anInt2886 + local19 * Static121.anInt3038 >> 16;
		@Pc(39) int local39 = arg1 * Static121.anInt3038 - local19 * anInt2886 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * anInt2886 + local19 * Static121.anInt3038 >> 16;
		@Pc(76) int local76 = arg2 * Static121.anInt3038 - local19 * anInt2886 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Rasteriser.screenLowerX && local87 < Rasteriser.screenLowerX) {
			return false;
		} else if (local50 > Rasteriser.screenUpperX && local87 > Rasteriser.screenUpperX) {
			return false;
		} else if (local56 < Rasteriser.screenLowerY && local93 < Rasteriser.screenLowerY) {
			return false;
		} else {
			return local56 <= Rasteriser.screenUpperY || local93 <= Rasteriser.screenUpperY;
		}
	}
}
