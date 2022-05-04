package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_517 = JagString.parse("");
	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static int anInt1142 = 0;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!na;")
	public static final JagString aClass100_230 = JagString.parse("");

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Z")
	public static boolean aBoolean73 = false;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public static void method930() {
		if (client.musicChannel != null) {
			client.musicChannel.quit();
		}
		if (client.soundChannel != null) {
			client.soundChannel.quit();
		}
		AudioChannel.init(Preferences.stereo);
		client.musicChannel = AudioChannel.create(22050, GameShell.signLink, GameShell.canvas, 0);
		client.musicChannel.setStream(client.musicStream);
		client.soundChannel = AudioChannel.create(2048, GameShell.signLink, GameShell.canvas, 1);
		client.soundChannel.setStream(client.soundStream);
	}
}
