import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int titleSong;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt5443;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!ve;")
	public static Js5 spritesArchive;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5434 = 0;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_33 = new SoftLruHashTable(260);

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!na;")
	public static final JagString aClass100_1042 = Static28.parse("Null");

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_1043 = Static28.parse(" <col=00ff80>");

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4273() {
		@Pc(14) int playerX = PlayerList.self.xFine + Static132.anInt3291;
		@Pc(20) int playerZ = PlayerList.self.zFine + Static206.anInt4774;
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
		if (Preferences.aBoolean63) {
			for (@Pc(93) int local93 = 0; local93 < Static182.keyQueueSize; local93++) {
				@Pc(104) int code = Static227.keyCodes[local93];
				if (code == Keyboard.KEY_UP) {
					Camera.pitchDirection = 1;
					Camera.pitchTarget += 47;
				} else if (code == Keyboard.KEY_DOWN) {
					Camera.pitchDirection = 0;
					Camera.pitchTarget -= 17;
				} else if (code == Keyboard.KEY_LEFT) {
					Camera.yawDirection = 1;
					Camera.yawTarget -= 65;
				} else if (code == Keyboard.KEY_RIGHT) {
					Camera.yawDirection = 0;
					Camera.yawTarget += 191;
				}
			}
			Camera.clampCameraAngle();
		}
	}
}
