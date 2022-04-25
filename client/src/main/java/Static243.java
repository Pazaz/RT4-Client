import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lclient!ok;")
	public static IndexedSprite logo;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "[Lclient!ec;")
	public static Scenery[] aClass31Array3;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
	public static int[] anIntArray476 = new int[2];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!sc;ZLclient!wl;)Lclient!hg;")
	public static GlTile method4212(@OriginalArg(0) HashTable arg0, @OriginalArg(2) FloType arg1) {
		@Pc(23) long local23 = (long) ((arg1.texture + 1 << 16) + arg1.anInt5885) + ((long) arg1.anInt5897 << 56) + ((long) arg1.anInt5889 << 32);
		@Pc(38) GlTile local38 = (GlTile) arg0.get(local23);
		if (local38 == null) {
			local38 = new GlTile(arg1.texture, (float) arg1.anInt5885, true, false, arg1.anInt5889);
			arg0.put(local38, local23);
		}
		return local38;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public static void method4221() {
		Static204.anInt4762 = 0;
		Static67.prevFocus = true;
		Static183.prevClickTime = 0L;
		MouseRecorder.instance.samples = 0;
		GameShell.focus = true;
		Static114.method4625();
		Static49.anInt1462 = -1;
		Static5.anInt45 = -1;
		Protocol.opcode = -1;
		Static267.anInt5775 = 0;
		Static60.rebootTimer = 0;
		Protocol.outboundBuffer.offset = 0;
		Static230.anInt5152 = -1;
		Static201.anInt1862 = 0;
		Protocol.inboundBuffer.offset = 0;
		@Pc(3506) int local3506;
		for (local3506 = 0; local3506 < Static143.aClass102Array1.length; local3506++) {
			Static143.aClass102Array1[local3506] = null;
		}
		Static231.anInt5204 = 0;
		Static60.aBoolean108 = false;
		Static48.setIdleLoops(0);
		for (local3506 = 0; local3506 < 100; local3506++) {
			Static230.aClass100Array158[local3506] = null;
		}
		Static260.anInt5014 = 0;
		Static132.anInt3291 = (int) (Math.random() * 100.0D) - 50;
		Static84.anInt2255 = 0;
		Camera.yawTarget = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static107.anInt2875 = -1;
		Static267.anInt5774 = 0;
		Static270.anInt5795 = 0;
		Static206.anInt4774 = (int) (Math.random() * 110.0D) - 55;
		Static241.aBoolean302 = false;
		Static273.anInt4130 = (int) (Math.random() * 30.0D) - 20;
		SoundPlayer.anInt4451 = 0;
		Static115.anInt2939 = 0;
		Static59.anInt1814 = (int) (Math.random() * 120.0D) - 60;
		Static62.anInt1941 = 0;
		Static230.anInt5161 = (int) (Math.random() * 80.0D) - 40;
		Static272.anInt5214 = 0;
		for (local3506 = 0; local3506 < 2048; local3506++) {
			Static159.players[local3506] = null;
			Static115.aClass3_Sub15Array1[local3506] = null;
		}
		for (local3506 = 0; local3506 < 32768; local3506++) {
			Static175.npcs[local3506] = null;
		}
		PlayerList.self = Static159.players[2047] = new Player();
		Static217.aClass69_116.clear();
		Static99.aClass69_64.clear();
		if (Static159.aClass69ArrayArrayArray1 != null) {
			for (local3506 = 0; local3506 < 4; local3506++) {
				for (@Pc(3663) int local3663 = 0; local3663 < 104; local3663++) {
					for (@Pc(3670) int local3670 = 0; local3670 < 104; local3670++) {
						Static159.aClass69ArrayArrayArray1[local3506][local3663][local3670] = null;
					}
				}
			}
		}
		Static26.aClass69_27 = new LinkedList();
		Static166.anInt4054 = 0;
		Static9.anInt178 = 0;
		Static8.method121();
		DelayedStateChange.clear();
		Static133.anInt5230 = 0;
		Static233.anInt5217 = 0;
		Static265.anInt5765 = 0;
		Static231.anInt5203 = 0;
		Static248.anInt4232 = 0;
		Static245.anInt5375 = 0;
		Static57.anInt1744 = 0;
		Static251.anInt5449 = 0;
		Static113.anInt4612 = 0;
		Static233.anInt5225 = 0;
		for (local3506 = 0; local3506 < Static155.varcs.length; local3506++) {
			Static155.varcs[local3506] = -1;
		}
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.method2275(InterfaceList.topLevelInterface);
		}
		for (@Pc(3755) Class3_Sub31 local3755 = (Class3_Sub31) Static119.aClass133_9.head(); local3755 != null; local3755 = (Class3_Sub31) Static119.aClass133_9.next()) {
			Static132.method2605(true, local3755);
		}
		InterfaceList.topLevelInterface = -1;
		Static119.aClass133_9 = new HashTable(8);
		InterfaceList.method1287();
		Static39.aClass13_10 = null;
		Static60.aBoolean108 = false;
		Static231.anInt5204 = 0;
		Static134.aClass59_2.method1950(new int[] { 0, 0, 0, 0, 0 }, -1, false, null, -1);
		for (local3506 = 0; local3506 < 8; local3506++) {
			Static160.aClass100Array121[local3506] = null;
			Static1.aBooleanArray1[local3506] = false;
			Static191.anIntArray388[local3506] = -1;
		}
		Static102.method2073();
		Static19.aBoolean43 = true;
		for (local3506 = 0; local3506 < 100; local3506++) {
			Static186.aBooleanArray100[local3506] = true;
		}
		Static214.anInt5577 = 0;
		Static199.aClass3_Sub22Array1 = null;
		Static15.aClass100_87 = null;
		for (local3506 = 0; local3506 < 6; local3506++) {
			Static229.aClass136Array1[local3506] = new StockMarketOffer();
		}
		for (local3506 = 0; local3506 < 25; local3506++) {
			Static99.anIntArray240[local3506] = 0;
			Static141.anIntArray326[local3506] = 0;
			Static227.anIntArray446[local3506] = 0;
		}
		if (GlRenderer.enabled) {
			Static86.setInstantFade();
		}
		Static197.aBoolean228 = true;
		Protocol.verifyId = 0;
		Static195.aClass100_859 = LocalizedText.WALKHERE;
		Static127.neverRemoveRoofs = false;
		client.aShortArray88 = client.aShortArray19 = client.aShortArray74 = client.aShortArray87 = new short[256];
		Static114.method4637();
		Static261.aBoolean298 = false;
		Static59.method1373();
	}
}
