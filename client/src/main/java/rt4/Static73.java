package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fm", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_453 = JagString.parse(")2");

	@OriginalMember(owner = "client!fm", name = "fb", descriptor = "[I")
	public static final int[] anIntArray183 = new int[14];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V")
	public static void method1596(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (InterfaceList.topLevelInterface != -1) {
				InterfaceList.method2275(InterfaceList.topLevelInterface);
			}
			for (@Pc(18) ComponentPointer local18 = (ComponentPointer) InterfaceList.openInterfaces.head(); local18 != null; local18 = (ComponentPointer) InterfaceList.openInterfaces.next()) {
				Static132.closeInterface(true, local18);
			}
			InterfaceList.topLevelInterface = -1;
			InterfaceList.openInterfaces = new HashTable(8);
			InterfaceList.method1287();
			InterfaceList.topLevelInterface = Static156.loginScreenId;
			Static210.method3712(false);
			Static87.method1807();
			Static74.method1626(InterfaceList.topLevelInterface);
		}
		Static35.anInt1092 = -1;
		Static81.method1750(Static270.anInt5794);
		PlayerList.self = new Player();
		PlayerList.self.zFine = 3000;
		PlayerList.self.xFine = 3000;
		if (!GlRenderer.enabled) {
			Static145.method2743(client.js5Archive8);
			client.setGameState(10);
			return;
		}
		if (Static227.cameraType == 2) {
			Static138.renderX = Static245.anInt5375 << 7;
			Static134.renderZ = Static248.anInt4232 << 7;
		} else {
			Static40.updateLoginScreenCamera();
		}
		Static86.setInstantFade();
		Static26.setupLoadingScreenRegion();
		client.setGameState(28);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V")
	public static void setLightPosition(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static85.anInt2263 = Static192.aClass92ArrayArray1[arg1][arg0].anInt3530;
		Static159.anInt3893 = Static192.aClass92ArrayArray1[arg1][arg0].anInt3528;
		Static148.anInt3534 = Static192.aClass92ArrayArray1[arg1][arg0].anInt3527;
		Static161.method3063((float) Static85.anInt2263, (float) Static159.anInt3893, (float) Static148.anInt3534);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!na;Lclient!na;Lclient!na;I)V")
	public static void method1598(@OriginalArg(1) JagString arg0, @OriginalArg(2) JagString arg1, @OriginalArg(3) JagString arg2) {
		Chat.add(-1, 9, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static140.anIntArrayArrayArray12[arg0][local16][local20] == -Static13.anInt437) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = SceneGraph.tileHeights[arg0][arg1][arg3] + arg5;
			if (!SceneGraph.method4394(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!SceneGraph.method4394(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!SceneGraph.method4394(local16, local156, local182)) {
				return false;
			} else if (SceneGraph.method4394(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static9.method187(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return SceneGraph.method4394(local16 + 1, SceneGraph.tileHeights[arg0][arg1][arg3] + arg5, local20 + 1) && SceneGraph.method4394(local16 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && SceneGraph.method4394(local16 + 128 - 1, SceneGraph.tileHeights[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && SceneGraph.method4394(local16 + 1, SceneGraph.tileHeights[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
