import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!vh;")
	public static AudioChannel aClass62_2;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static volatile int anInt3521 = -1;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!na;")
	public static final JagString aClass100_672 = Static28.parse("(U (X");

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	public static void method2761(@OriginalArg(0) int arg0) {
		Static170.anInt3241 = arg0;
		Static128.method2481(3);
		Static128.method2481(4);
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
			local15 = arg0.anIntArray168[local5] - Static149.anInt3555;
			local22 = arg0.anIntArray160[local5] - Static162.anInt3947;
			local29 = arg0.anIntArray163[local5] - Static217.anInt4903;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray161 != null) {
				Static68.anIntArray159[local5] = local39;
				Static68.anIntArray170[local5] = local61;
				Static68.anIntArray169[local5] = local71;
			}
			Static68.anIntArray165[local5] = Rasteriser.anInt2471 + (local39 << 9) / local71;
			Static68.anIntArray164[local5] = Rasteriser.anInt2469 + (local61 << 9) / local71;
		}
		Rasteriser.anInt2473 = 0;
		local3 = arg0.anIntArray166.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray166[local5];
			local22 = arg0.anIntArray162[local5];
			local29 = arg0.anIntArray158[local5];
			local39 = Static68.anIntArray165[local15];
			@Pc(148) int local148 = Static68.anIntArray165[local22];
			@Pc(152) int local152 = Static68.anIntArray165[local29];
			@Pc(156) int local156 = Static68.anIntArray164[local15];
			@Pc(160) int local160 = Static68.anIntArray164[local22];
			@Pc(164) int local164 = Static68.anIntArray164[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static158.aBoolean187 && Static19.method583(Static89.anInt2388 + Rasteriser.anInt2471, Static131.anInt3259 + Rasteriser.anInt2469, local156, local160, local164, local39, local148, local152)) {
					Static56.anInt1742 = arg5;
					Static116.anInt2954 = arg6;
				}
				if (!GlRenderer.enabled && !arg7) {
					Rasteriser.aBoolean138 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Rasteriser.anInt2472 || local148 > Rasteriser.anInt2472 || local152 > Rasteriser.anInt2472) {
						Rasteriser.aBoolean138 = true;
					}
					if (arg0.anIntArray161 == null || arg0.anIntArray161[local5] == -1) {
						if (arg0.anIntArray167[local5] != 12345678) {
							Rasteriser.method1928(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5]);
						}
					} else if (!Static159.aBoolean189) {
						@Pc(373) int local373 = Rasteriser.anInterface1_2.method3234(arg0.anIntArray161[local5]);
						Rasteriser.method1928(local156, local160, local164, local39, local148, local152, Static216.method1640(local373, arg0.anIntArray167[local5]), Static216.method1640(local373, arg0.anIntArray172[local5]), Static216.method1640(local373, arg0.anIntArray171[local5]));
					} else if (arg0.aBoolean113) {
						Rasteriser.method1909(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5], Static68.anIntArray159[0], Static68.anIntArray159[1], Static68.anIntArray159[3], Static68.anIntArray170[0], Static68.anIntArray170[1], Static68.anIntArray170[3], Static68.anIntArray169[0], Static68.anIntArray169[1], Static68.anIntArray169[3], arg0.anIntArray161[local5]);
					} else {
						Rasteriser.method1909(local156, local160, local164, local39, local148, local152, arg0.anIntArray167[local5], arg0.anIntArray172[local5], arg0.anIntArray171[local5], Static68.anIntArray159[local15], Static68.anIntArray159[local22], Static68.anIntArray159[local29], Static68.anIntArray170[local15], Static68.anIntArray170[local22], Static68.anIntArray170[local29], Static68.anIntArray169[local15], Static68.anIntArray169[local22], Static68.anIntArray169[local29], arg0.anIntArray161[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
	public static void method2764() {
		Static190.aClass99_26.method3104();
		Static124.aClass99_17.method3104();
		Static87.aClass99_12.method3104();
	}
}
