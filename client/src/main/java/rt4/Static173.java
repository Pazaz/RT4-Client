package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
	public static int[] anIntArray367;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[J[I)V")
	public static void method3243(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static83.method436(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIB)V")
	public static void method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 > TextureOp29.anInt2869 || arg2 < TextureOp29.anInt5773) {
			return;
		}
		@Pc(24) boolean local24;
		if (TextureOp29.anInt4164 > arg1) {
			local24 = false;
			arg1 = TextureOp29.anInt4164;
		} else if (TextureOp29.anInt5063 >= arg1) {
			local24 = true;
		} else {
			local24 = false;
			arg1 = TextureOp29.anInt5063;
		}
		@Pc(43) boolean local43;
		if (arg3 < TextureOp29.anInt4164) {
			arg3 = TextureOp29.anInt4164;
			local43 = false;
		} else if (arg3 > TextureOp29.anInt5063) {
			arg3 = TextureOp29.anInt5063;
			local43 = false;
		} else {
			local43 = true;
		}
		if (TextureOp29.anInt5773 > arg4) {
			arg4 = TextureOp29.anInt5773;
		} else {
			Static131.method2576(Static71.anIntArrayArray10[arg4++], arg1, arg3, arg0);
		}
		if (arg2 <= TextureOp29.anInt2869) {
			Static131.method2576(Static71.anIntArrayArray10[arg2--], arg1, arg3, arg0);
		} else {
			arg2 = TextureOp29.anInt2869;
		}
		@Pc(98) int local98;
		if (local24 && local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				@Pc(105) int[] local105 = Static71.anIntArrayArray10[local98];
				local105[arg1] = local105[arg3] = arg0;
			}
		} else if (local24) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				Static71.anIntArrayArray10[local98][arg1] = arg0;
			}
		} else if (local43) {
			for (local98 = arg4; local98 <= arg2; local98++) {
				Static71.anIntArrayArray10[local98][arg3] = arg0;
			}
		}
	}
}
