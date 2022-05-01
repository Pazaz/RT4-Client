package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	public static int anInt3241 = 128;

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "[I")
	public static final int[] JS5_ARCHIVE_WEIGHTS = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILclient!th;JZ)V")
	public static void method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Entity arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) GroundDecor local6 = new GroundDecor();
		local6.primary = arg4;
		local6.anInt732 = arg1 * 128 + 64;
		local6.anInt736 = arg2 * 128 + 64;
		local6.anInt733 = arg3;
		local6.aLong26 = arg5;
		local6.aBoolean49 = arg6;
		if (SceneGraph.tiles[arg0][arg1][arg2] == null) {
			SceneGraph.tiles[arg0][arg1][arg2] = new Tile(arg0, arg1, arg2);
		}
		SceneGraph.tiles[arg0][arg1][arg2].aClass15_1 = local6;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method2574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) AttachLocRequest local7 = new AttachLocRequest();
		local7.angle = arg6;
		local7.anInt1205 = arg3;
		local7.anInt1187 = arg1;
		local7.anInt1200 = arg5;
		local7.entityId = arg2;
		local7.x = arg8;
		local7.anInt1197 = arg10;
		local7.z = arg4;
		local7.locId = arg11;
		local7.anInt1188 = arg7;
		local7.anInt1191 = arg0;
		local7.shape = arg9;
		AttachLocRequest.queue.addTail(local7);
	}

}
