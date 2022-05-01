package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt5752;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
	public static final int[] anIntArray515 = new int[14];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILclient!th;Lclient!th;IIJ)V")
	public static void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Wall local8 = new Wall();
		local8.key = arg8;
		local8.anInt3048 = arg1 * 128 + 64;
		local8.anInt3044 = arg2 * 128 + 64;
		local8.anInt3051 = arg3;
		local8.primary = arg4;
		local8.aClass8_6 = arg5;
		local8.anInt3049 = arg6;
		local8.anInt3052 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (SceneGraph.tiles[local42][arg1][arg2] == null) {
				SceneGraph.tiles[local42][arg1][arg2] = new Tile(local42, arg1, arg2);
			}
		}
		SceneGraph.tiles[arg0][arg1][arg2].aClass77_1 = local8;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lclient!na;")
	public static JagString method4510(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? Static220.aClass100_930 : Static123.parseInt(arg0);
	}
}
