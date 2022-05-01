package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
	public static final int[] anIntArray408 = new int[500];

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!na;")
	public static final JagString TRADEREQ = JagString.parse(":tradereq:");

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
	public static void method3535(@OriginalArg(0) boolean arg0) {
		Static221.anIntArray376 = new int[104];
		Static139.anIntArray325 = new int[104];
		Static146.anInt3508 = 99;
		Static251.anIntArray479 = new int[104];
		@Pc(14) byte local14;
		if (arg0) {
			local14 = 1;
		} else {
			local14 = 4;
		}
		SceneGraph.tileShapes = new byte[local14][104][104];
		Static128.anIntArray293 = new int[104];
		Static60.anIntArrayArrayArray6 = new int[local14][105][105];
		Static118.aByteArrayArrayArray9 = new byte[local14][105][105];
		SceneGraph.tileOverlays = new byte[local14][104][104];
		Static279.anIntArray568 = new int[104];
		SceneGraph.tileAngles = new byte[local14][104][104];
		SceneGraph.tileUnderlays = new byte[local14][104][104];
	}

}
