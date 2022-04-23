import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int titleSong;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt5443;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!ve;")
	public static Js5 aClass153_101;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
	public static boolean showGroundDecorations = true;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5434 = 0;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_33 = new SoftLruHashTable(260);

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_1041 = Static28.parse("scrollbar");

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!na;")
	public static final JagString aClass100_1042 = Static28.parse("Null");

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_1043 = Static28.parse(" <col=00ff80>");

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4273() {
		@Pc(14) int playerX = Static173.self.anInt3412 + Static132.anInt3291;
		@Pc(20) int playerZ = Static173.self.anInt3421 + Static206.anInt4774;
		if (Static81.cameraX - playerX < -500 || Static81.cameraX - playerX > 500 || Static111.cameraZ - playerZ < -500 || Static111.cameraZ - playerZ > 500) {
			Static81.cameraX = playerX;
			Static111.cameraZ = playerZ;
		}
		if (Static111.cameraZ != playerZ) {
			Static111.cameraZ += (playerZ - Static111.cameraZ) / 16;
		}
		if (Static81.cameraX != playerX) {
			Static81.cameraX += (playerX - Static81.cameraX) / 16;
		}
		if (Static33.aBoolean63) {
			for (@Pc(93) int local93 = 0; local93 < Static182.keyQueueSize; local93++) {
				@Pc(104) int code = Static227.keyCodes[local93];
				if (code == Keyboard.KEY_UP) {
					Static72.pitchTarget = (int)Static72.pitchTarget + 47 & 0xFFFFFFF0;
				} else if (code == Keyboard.KEY_DOWN) {
					Static72.pitchTarget = (int)Static72.pitchTarget - 17 & 0xFFFFFFF0;
				} else if (code == Keyboard.KEY_LEFT) {
					Static57.yawTarget = (int)Static57.yawTarget - 65 & 0xFFFFFF80;
				} else if (code == Keyboard.KEY_RIGHT) {
					Static57.yawTarget = (int)Static57.yawTarget + 191 & 0xFFFFFF80;
				}
			}
			Static87.clampCameraAngle();
		}
	}
}
