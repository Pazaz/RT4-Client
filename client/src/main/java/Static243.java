import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "Lclient!ve;")
	public static Js5 aClass153_97;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "Lclient!ok;")
	public static IndexedSprite aClass36_1;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Lclient!ve;")
	public static Js5 aClass153_98;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "[Lclient!ec;")
	public static Scenery[] aClass31Array3;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "J")
	public static volatile long aLong178 = 0L;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	public static int anInt5359 = 0;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
	public static int[] anIntArray476 = new int[2];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!sc;ZLclient!wl;)Lclient!hg;")
	public static Class3_Sub14 method4212(@OriginalArg(0) HashTable arg0, @OriginalArg(2) FloType arg1) {
		@Pc(23) long local23 = (long) ((arg1.anInt5892 + 1 << 16) + arg1.anInt5885) + ((long) arg1.anInt5897 << 56) + ((long) arg1.anInt5889 << 32);
		@Pc(38) Class3_Sub14 local38 = (Class3_Sub14) arg0.method3863(local23);
		if (local38 == null) {
			local38 = new Class3_Sub14(arg1.anInt5892, (float) arg1.anInt5885, true, false, arg1.anInt5889);
			arg0.method3862(local38, local23);
		}
		return local38;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public static void method4221() {
		Static204.anInt4762 = 0;
		Static67.prevFocus = true;
		Static183.prevClickTime = 0L;
		Static178.instance.samples = 0;
		Static26.focus = true;
		Static114.method4625();
		Static49.anInt1462 = -1;
		Static5.anInt45 = -1;
		Static164.anInt3985 = -1;
		Static267.anInt5775 = 0;
		Static60.rebootTimer = 0;
		Static6.outboundBuffer.offset = 0;
		Static230.anInt5152 = -1;
		Static201.anInt1862 = 0;
		Static57.aClass3_Sub15_Sub1_3.offset = 0;
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
		Static57.anInt1747 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static107.anInt2875 = -1;
		Static267.anInt5774 = 0;
		Static270.anInt5795 = 0;
		Static206.anInt4774 = (int) (Math.random() * 110.0D) - 55;
		Static241.aBoolean302 = false;
		Static273.anInt4130 = (int) (Math.random() * 30.0D) - 20;
		Static189.anInt4451 = 0;
		Static115.anInt2939 = 0;
		Static59.anInt1814 = (int) (Math.random() * 120.0D) - 60;
		Static62.anInt1941 = 0;
		Static230.anInt5161 = (int) (Math.random() * 80.0D) - 40;
		Static272.anInt5214 = 0;
		for (local3506 = 0; local3506 < 2048; local3506++) {
			Static159.aClass8_Sub4_Sub1Array1[local3506] = null;
			Static115.aClass3_Sub15Array1[local3506] = null;
		}
		for (local3506 = 0; local3506 < 32768; local3506++) {
			Static175.aClass8_Sub4_Sub2Array1[local3506] = null;
		}
		Static173.self = Static159.aClass8_Sub4_Sub1Array1[2047] = new Player();
		Static217.aClass69_116.method2278();
		Static99.aClass69_64.method2278();
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
		Static20.method601();
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
		if (Static154.topLevelInterace != -1) {
			Static109.method2275(Static154.topLevelInterace);
		}
		for (@Pc(3755) Class3_Sub31 local3755 = (Class3_Sub31) Static119.aClass133_9.method3859(); local3755 != null; local3755 = (Class3_Sub31) Static119.aClass133_9.method3861()) {
			Static132.method2605(true, local3755);
		}
		Static154.topLevelInterace = -1;
		Static119.aClass133_9 = new HashTable(8);
		Static52.method1287();
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
			Static86.method1799();
		}
		Static197.aBoolean228 = true;
		Static189.anInt4443 = 0;
		Static195.aClass100_859 = LocalizedText.WALKHERE;
		Static127.aBoolean160 = false;
		Static259.aShortArray88 = Static62.aShortArray19 = Static232.aShortArray74 = Static259.aShortArray87 = new short[256];
		Static114.method4637();
		Static261.aBoolean298 = false;
		Static59.method1373();
	}
}
