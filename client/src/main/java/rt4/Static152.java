package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	public static int anInt3604 = -1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBIIIII)V")
	public static void method4670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = arg2 - arg4;
		Static241.method4278(arg2);
		@Pc(23) int local23 = 0;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(35) int local35 = -arg2;
		@Pc(38) int local38 = -local18;
		@Pc(40) int local40 = local18;
		@Pc(42) int local42 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (arg1 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg1) {
			@Pc(52) int[] local52 = TextureOp29SubOp4.anIntArrayArray10[arg1];
			local61 = Static231.method1690(TextureOp29.anInt5063, arg5 - arg2, TextureOp29.anInt4164);
			local69 = Static231.method1690(TextureOp29.anInt5063, arg2 + arg5, TextureOp29.anInt4164);
			local78 = Static231.method1690(TextureOp29.anInt5063, arg5 - local18, TextureOp29.anInt4164);
			local87 = Static231.method1690(TextureOp29.anInt5063, arg5 + local18, TextureOp29.anInt4164);
			TextureOp29SubOp4.method2576(local52, local61, local78, arg3);
			TextureOp29SubOp4.method2576(local52, local78, local87, arg0);
			TextureOp29SubOp4.method2576(local52, local87, local69, arg3);
		}
		@Pc(107) int local107 = -1;
		while (local23 < local32) {
			local42 += 2;
			local107 += 2;
			local38 += local107;
			local35 += local42;
			if (local38 >= 0 && local40 >= 1) {
				local40--;
				Static241.anIntArray522[local40] = local23;
				local38 -= local40 << 1;
			}
			local23++;
			@Pc(264) int local264;
			@Pc(273) int local273;
			@Pc(280) int[] local280;
			@Pc(161) int local161;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				local161 = arg1 - local32;
				local61 = arg1 + local32;
				if (TextureOp29.anInt5773 <= local61 && TextureOp29.anInt2869 >= local161) {
					if (local32 >= local18) {
						local69 = Static231.method1690(TextureOp29.anInt5063, local23 + arg5, TextureOp29.anInt4164);
						local78 = Static231.method1690(TextureOp29.anInt5063, arg5 - local23, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local61], local78, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local161], local78, local69, arg3);
						}
					} else {
						local69 = Static241.anIntArray522[local32];
						local78 = Static231.method1690(TextureOp29.anInt5063, local23 + arg5, TextureOp29.anInt4164);
						local87 = Static231.method1690(TextureOp29.anInt5063, arg5 - local23, TextureOp29.anInt4164);
						local264 = Static231.method1690(TextureOp29.anInt5063, arg5 + local69, TextureOp29.anInt4164);
						local273 = Static231.method1690(TextureOp29.anInt5063, arg5 - local69, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local61];
							TextureOp29SubOp4.method2576(local280, local87, local273, arg3);
							TextureOp29SubOp4.method2576(local280, local273, local264, arg0);
							TextureOp29SubOp4.method2576(local280, local264, local78, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local161];
							TextureOp29SubOp4.method2576(local280, local87, local273, arg3);
							TextureOp29SubOp4.method2576(local280, local273, local264, arg0);
							TextureOp29SubOp4.method2576(local280, local264, local78, arg3);
						}
					}
				}
			}
			local161 = arg1 - local23;
			local61 = arg1 + local23;
			if (TextureOp29.anInt5773 <= local61 && TextureOp29.anInt2869 >= local161) {
				local69 = arg5 + local32;
				local78 = arg5 - local32;
				if (local69 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= local78) {
					local69 = Static231.method1690(TextureOp29.anInt5063, local69, TextureOp29.anInt4164);
					local78 = Static231.method1690(TextureOp29.anInt5063, local78, TextureOp29.anInt4164);
					if (local23 < local18) {
						local87 = local40 >= local23 ? local40 : Static241.anIntArray522[local23];
						local264 = Static231.method1690(TextureOp29.anInt5063, local87 + arg5, TextureOp29.anInt4164);
						local273 = Static231.method1690(TextureOp29.anInt5063, arg5 - local87, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local61];
							TextureOp29SubOp4.method2576(local280, local78, local273, arg3);
							TextureOp29SubOp4.method2576(local280, local273, local264, arg0);
							TextureOp29SubOp4.method2576(local280, local264, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							local280 = TextureOp29SubOp4.anIntArrayArray10[local161];
							TextureOp29SubOp4.method2576(local280, local78, local273, arg3);
							TextureOp29SubOp4.method2576(local280, local273, local264, arg0);
							TextureOp29SubOp4.method2576(local280, local264, local69, arg3);
						}
					} else {
						if (TextureOp29.anInt2869 >= local61) {
							TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local61], local78, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[local161], local78, local69, arg3);
						}
					}
				}
			}
		}
	}
}
