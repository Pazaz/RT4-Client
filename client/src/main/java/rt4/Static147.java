package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!na;")
	public static final JagString aClass100_672 = JagString.parse("(U (X");
	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	public static final int[] anIntArray159 = new int[6];
	@OriginalMember(owner = "client!fg", name = "l", descriptor = "[I")
	public static final int[] anIntArray164 = new int[6];
	@OriginalMember(owner = "client!fg", name = "m", descriptor = "[I")
	public static final int[] anIntArray165 = new int[6];
	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[I")
	public static final int[] anIntArray169 = new int[6];
	@OriginalMember(owner = "client!fg", name = "t", descriptor = "[I")
	public static final int[] anIntArray170 = new int[6];

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	public static void method2761(@OriginalArg(0) int arg0) {
		UnderwaterMaterialRenderer.anInt3241 = arg0;
		MaterialManager.resetArgument(3);
		MaterialManager.resetArgument(4);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!fg;IIIIIIZ)V")
	public static void method2762(@OriginalArg(0) ShapedTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray168.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray168[local5] - Static123.anInt3555;
			local22 = arg0.anIntArray160[local5] - Static123.anInt3947;
			local29 = arg0.anIntArray163[local5] - SceneGraph.anInt4903;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray161 != null) {
				anIntArray159[local5] = local39;
				anIntArray170[local5] = local61;
				anIntArray169[local5] = local71;
			}
			anIntArray165[local5] = Rasteriser.centerX + (local39 << 9) / local71;
			anIntArray164[local5] = Rasteriser.centerY + (local61 << 9) / local71;
		}
		Rasteriser.alpha = 0;
		local3 = arg0.anIntArray166.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray166[local5];
			local22 = arg0.anIntArray162[local5];
			local29 = arg0.anIntArray158[local5];
			local39 = anIntArray165[local15];
			@Pc(148) int local148 = anIntArray165[local22];
			@Pc(152) int local152 = anIntArray165[local29];
			@Pc(156) int local156 = anIntArray164[local15];
			@Pc(160) int local160 = anIntArray164[local22];
			@Pc(164) int local164 = anIntArray164[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (MiniMenu.aBoolean187 && method583(MiniMenu.anInt2388 + Rasteriser.centerX, MiniMenu.anInt3259 + Rasteriser.centerY, local156, local160, local164, local39, local148, local152)) {
					MiniMenu.anInt1742 = arg5;
					MiniMenu.anInt2954 = arg6;
				}
				if (!GlRenderer.enabled && !arg7) {
					Rasteriser.testX = local39 < 0 || local148 < 0 || local152 < 0 || local39 > Rasteriser.width || local148 > Rasteriser.width || local152 > Rasteriser.width;
					if (arg0.anIntArray161 == null || arg0.anIntArray161[local5] == -1) {
						if (arg0.anIntArray167[local5] != 12345678) {
							Rasteriser.fillGouraudTriangle(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5]);
						}
					} else if (!Preferences.manyGroundTextures) {
						@Pc(373) int local373 = Rasteriser.textureProvider.getAverageColor(arg0.anIntArray161[local5]);
						Rasteriser.fillGouraudTriangle(local156, local160, local164, local39, local148, local152, method1640(local373, arg0.anIntArray167[local5]), method1640(local373, arg0.anIntArray172[local5]), method1640(local373, arg0.anIntArray171[local5]));
					} else if (arg0.aBoolean113) {
						Rasteriser.fillTexturedTriangle(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5], anIntArray159[0], anIntArray159[1], anIntArray159[3], anIntArray170[0], anIntArray170[1], anIntArray170[3], anIntArray169[0], anIntArray169[1], anIntArray169[3], arg0.anIntArray161[local5]);
					} else {
						Rasteriser.fillTexturedTriangle(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5], anIntArray159[local15], anIntArray159[local22], anIntArray159[local29], anIntArray170[local15], anIntArray170[local22], anIntArray170[local29], anIntArray169[local15], anIntArray169[local22], anIntArray169[local29], arg0.anIntArray161[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
	public static void method2764() {
		Component.sprites.clear();
		Component.models.clear();
		Component.fonts.clear();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
