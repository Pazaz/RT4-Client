package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2460() {
		if (InterfaceList.topLevelInterface != -1) {
			Static96.method1949(InterfaceList.topLevelInterface);
		}
		for (@Pc(15) int local15 = 0; local15 < InterfaceList.rectangles; local15++) {
			if (InterfaceList.aBooleanArray100[local15]) {
				InterfaceList.rectangleRedraw[local15] = true;
			}
			Static223.aBooleanArray116[local15] = InterfaceList.aBooleanArray100[local15];
			InterfaceList.aBooleanArray100[local15] = false;
		}
		Static97.anInt2503 = -1;
		Static169.mouseOverInventoryInterface = null;
		Static182.anInt4311 = client.loop;
		if (GlRenderer.enabled) {
			Static263.aBoolean299 = true;
		}
		Static214.anInt5574 = -1;
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.rectangles = 0;
			Static9.method182();
		}
		if (GlRenderer.enabled) {
			GlRaster.method1177();
		} else {
			SoftwareRaster.method2503();
		}
		Static178.anInt4247 = 0;
	}
}
