package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!rf;")
	public static Song aClass3_Sub29_1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	public static int getWindowMode() {
		if (GameShell.fullScreenFrame != null) {
			return 3;
		} else if (GlRenderer.enabled && Static124.aBoolean156) {
			return 2;
		} else if (GlRenderer.enabled && !Static124.aBoolean156) {
			return 1;
		} else {
			return 0;
		}
	}
}
