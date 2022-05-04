package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIBII)V")
	public static void method2722(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static113.anInt4612 = arg3;
		Static231.anInt5203 = arg2;
		Static245.anInt5375 = arg5;
		Static233.anInt5225 = arg1;
		Static248.anInt4232 = arg4;
		if (arg0 && Static113.anInt4612 >= 100) {
			Static138.renderX = Static245.anInt5375 * 128 + 64;
			Static134.renderZ = Static248.anInt4232 * 128 + 64;
			Static5.anInt40 = SceneGraph.getTileHeight(Player.level, Static138.renderX, Static134.renderZ) - Static231.anInt5203;
		}
		Static227.cameraType = 2;
	}

}
