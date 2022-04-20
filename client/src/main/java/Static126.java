import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
	public static int anInt3114;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "Lclient!na;")
	private static final JagString aClass100_603 = Static28.parse("");

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "Lclient!na;")
	public static JagString aClass100_602 = aClass100_603;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2460() {
		if (Static154.topLevelInterace != -1) {
			Static96.method1949(Static154.topLevelInterace);
		}
		for (@Pc(15) int local15 = 0; local15 < Static24.anInt766; local15++) {
			if (Static186.aBooleanArray100[local15]) {
				Static31.aBooleanArray29[local15] = true;
			}
			Static223.aBooleanArray116[local15] = Static186.aBooleanArray100[local15];
			Static186.aBooleanArray100[local15] = false;
		}
		Static97.anInt2503 = -1;
		Static169.aClass13_18 = null;
		Static182.anInt4311 = Static83.anInt372;
		if (GlRenderer.enabled) {
			Static263.aBoolean299 = true;
		}
		Static214.anInt5574 = -1;
		if (Static154.topLevelInterace != -1) {
			Static24.anInt766 = 0;
			Static9.method182();
		}
		if (GlRenderer.enabled) {
			Static46.method1177();
		} else {
			Static129.method2503();
		}
		Static178.anInt4247 = 0;
	}
}
