package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	public static int loginScreenId;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= SceneGraph.width * 128) {
			arg0 = SceneGraph.width * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= SceneGraph.length * 128) {
			arg2 = SceneGraph.length * 128 - 1;
		}
		Static109.anInt2886 = MathUtils.sin[arg3];
		Static121.anInt3038 = MathUtils.cos[arg3];
		Static231.anInt5205 = MathUtils.sin[arg4];
		Static81.anInt2222 = MathUtils.cos[arg4];
		Static149.anInt3555 = arg0;
		Static123.anInt3947 = arg1;
		Static217.anInt4903 = arg2;
		Static167.anInt4069 = arg0 / 128;
		Static193.anInt4539 = arg2 / 128;
		Static31.anInt987 = Static167.anInt4069 - SceneGraph.visibility;
		if (Static31.anInt987 < 0) {
			Static31.anInt987 = 0;
		}
		Static80.anInt4698 = Static193.anInt4539 - SceneGraph.visibility;
		if (Static80.anInt4698 < 0) {
			Static80.anInt4698 = 0;
		}
		Static2.anInt15 = Static167.anInt4069 + SceneGraph.visibility;
		if (Static2.anInt15 > SceneGraph.width) {
			Static2.anInt15 = SceneGraph.width;
		}
		Static215.anInt4866 = Static193.anInt4539 + SceneGraph.visibility;
		if (Static215.anInt4866 > SceneGraph.length) {
			Static215.anInt4866 = SceneGraph.length;
		}
		@Pc(99) short local99;
		if (GlRenderer.enabled) {
			local99 = (short)GlobalConfig.VIEW_DISTANCE;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < SceneGraph.visibility + SceneGraph.visibility + 2; local104++) {
			for (local113 = 0; local113 < SceneGraph.visibility + SceneGraph.visibility + 2; local113++) {
				@Pc(130) int local130 = (local104 - SceneGraph.visibility << 7) - (Static149.anInt3555 & 0x7F);
				@Pc(140) int local140 = (local113 - SceneGraph.visibility << 7) - (Static217.anInt4903 & 0x7F);
				@Pc(146) int local146 = Static167.anInt4069 + local104 - SceneGraph.visibility;
				@Pc(152) int local152 = Static193.anInt4539 + local113 - SceneGraph.visibility;
				if (local146 >= 0 && local152 >= 0 && local146 < SceneGraph.width && local152 < SceneGraph.length) {
					@Pc(176) int local176;
					if (SceneGraph.underwaterTileHeights == null) {
						local176 = SceneGraph.surfaceTileHeights[0][local146][local152] + 128 - Static123.anInt3947;
					} else {
						local176 = SceneGraph.underwaterTileHeights[0][local146][local152] + 128 - Static123.anInt3947;
					}
					@Pc(201) int local201 = SceneGraph.surfaceTileHeights[3][local146][local152] - Static123.anInt3947 - 1000;
					SceneGraph.aBooleanArrayArray3[local104][local113] = Static160.method3049(local130, local201, local176, local140, local99);
				} else {
					SceneGraph.aBooleanArrayArray3[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < SceneGraph.visibility + SceneGraph.visibility + 1; local104++) {
			for (local113 = 0; local113 < SceneGraph.visibility + SceneGraph.visibility + 1; local113++) {
				SceneGraph.aBooleanArrayArray1[local104][local113] = SceneGraph.aBooleanArrayArray3[local104][local113] || SceneGraph.aBooleanArrayArray3[local104 + 1][local113] || SceneGraph.aBooleanArrayArray3[local104][local113 + 1] || SceneGraph.aBooleanArrayArray3[local104 + 1][local113 + 1];
			}
		}
		Static8.anIntArray8 = arg6;
		Static127.anIntArray292 = arg7;
		Static96.anIntArray234 = arg8;
		Static234.anIntArray454 = arg9;
		Static206.anIntArray427 = arg10;
		Static123.method2419();
		if (SceneGraph.underWaterGroundTiles != null) {
			SceneGraph.setUnderwater(true);
			Static248.method3292(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (GlRenderer.enabled) {
				MaterialManager.renderingUnderwater = false;
				MaterialManager.setMaterial(0, 0);
				FogManager.method3066(null);
				LightingManager.method2390();
			}
			SceneGraph.setUnderwater(false);
		}
		Static248.method3292(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!wa;)Lclient!ta;")
	public static TextureOp29SubOp4 method2960(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp4(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}
}
