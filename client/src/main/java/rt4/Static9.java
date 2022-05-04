package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Lclient!na;")
	public static final JagString aClass100_35 = JagString.parse("showVideoAd");

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
	public static void method182() {
		Static241.aClass13Array13 = null;
		Static6.method86(InterfaceList.topLevelInterface, 0, GameShell.canvasWidth, 0, -1, GameShell.canvasHeight, 0, 0);
		if (Static241.aClass13Array13 != null) {
			Static87.method1809(0, Static127.anInt3126, Static80.anInt4696, Static241.aClass13Array13, GameShell.canvasWidth, -1412584499, 0, GameShell.canvasHeight, Static4.aClass13_1.anInt517);
			Static241.aClass13Array13 = null;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!wa;)Lclient!ci;")
	public static TextureOp29SubOp1 method184(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp1(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public static void method185() {
		if (Static119.anIntArray282 != null && Static130.anIntArray299 != null) {
			return;
		}
		Static119.anIntArray282 = new int[256];
		Static130.anIntArray299 = new int[256];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(36) double local36 = (double) local26 / 255.0D * 6.283185307179586D;
			Static119.anIntArray282[local26] = (int) (Math.sin(local36) * 4096.0D);
			Static130.anIntArray299[local26] = (int) (Math.cos(local36) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static140.anIntArrayArrayArray12[arg0][arg1][arg2];
		if (local7 == -Static13.anInt437) {
			return false;
		} else if (local7 == Static13.anInt437) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (SceneGraph.method4394(local22 + 1, SceneGraph.tileHeights[arg0][arg1][arg2], local26 + 1) && SceneGraph.method4394(local22 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2], local26 + 1) && SceneGraph.method4394(local22 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && SceneGraph.method4394(local22 + 1, SceneGraph.tileHeights[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static140.anIntArrayArrayArray12[arg0][arg1][arg2] = Static13.anInt437;
				return true;
			} else {
				Static140.anIntArrayArrayArray12[arg0][arg1][arg2] = -Static13.anInt437;
				return false;
			}
		}
	}
}
