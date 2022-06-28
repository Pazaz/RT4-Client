package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray116 = new boolean[100];
	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt5574 = -1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2460() {
		if (InterfaceList.topLevelInterface != -1) {
			Static96.method1949(InterfaceList.topLevelInterface);
		}
		for (@Pc(15) int local15 = 0; local15 < InterfaceList.rectangles; local15++) {
			if (InterfaceList.aBooleanArray100[local15]) {
				InterfaceList.rectangleRedraw[local15] = true;
			}
			aBooleanArray116[local15] = InterfaceList.aBooleanArray100[local15];
			InterfaceList.aBooleanArray100[local15] = false;
		}
		Static87.anInt2503 = -1;
		InterfaceList.mouseOverInventoryInterface = null;
		Static182.anInt4311 = client.loop;
		if (GlRenderer.enabled) {
			ScriptRunner.aBoolean299 = true;
		}
		anInt5574 = -1;
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.rectangles = 0;
			Static9.method182();
		}
		if (GlRenderer.enabled) {
			GlRaster.method1177();
		} else {
			SoftwareRaster.method2503();
		}
		Protocol.anInt4247 = 0;
	}
}
