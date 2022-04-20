import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt2878;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!jb;")
	public static Js5NetQueue js5NetQueue;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt2875 = -1;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_566 = Static28.parse("::fpson");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray9 = new int[2][][];

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static final int[] anIntArray259 = new int[14];

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!of;")
	public static QuickChatCommandDecoder anInterface3_1 = null;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method2261() {
		if (Static147.aClass62_2 != null) {
			Static147.aClass62_2.method3565();
		}
		if (Static11.aClass62_1 != null) {
			Static11.aClass62_1.method3565();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILsignlink!ll;Ljava/awt/Component;II)Lclient!vh;")
	public static AudioChannel method2262(@OriginalArg(0) int arg0, @OriginalArg(1) SignLink arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (Static44.anInt1404 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) AudioChannel local33 = (AudioChannel) Class.forName("JavaAudioChannel").getDeclaredConstructor().newInstance();
			local33.anInt4641 = arg0;
			local33.anIntArray411 = new int[(Static164.aBoolean192 ? 2 : 1) * 256];
			local33.method3576(arg2);
			local33.anInt4644 = (arg0 & -1024) + 1024;
			if (local33.anInt4644 > 16384) {
				local33.anInt4644 = 16384;
			}
			local33.method3562(local33.anInt4644);
			if (Static258.anInt5637 > 0 && Static60.aClass19_1 == null) {
				Static60.aClass19_1 = new AudioThread();
				Static60.aClass19_1.aClass213_1 = arg1;
				arg1.method5130(Static258.anInt5637, Static60.aClass19_1);
			}
			if (Static60.aClass19_1 != null) {
				if (Static60.aClass19_1.aClass62Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static60.aClass19_1.aClass62Array1[arg3] = local33;
			}
			return local33;
		} catch (@Pc(109) Throwable local109) {
			try {
				@Pc(120) SignLinkAudioChannel local120 = new SignLinkAudioChannel(arg1, arg3);
				local120.anIntArray411 = new int[(Static164.aBoolean192 ? 2 : 1) * 256];
				local120.anInt4641 = arg0;
				local120.method3576(arg2);
				local120.anInt4644 = 16384;
				local120.method3562(local120.anInt4644);
				if (Static258.anInt5637 > 0 && Static60.aClass19_1 == null) {
					Static60.aClass19_1 = new AudioThread();
					Static60.aClass19_1.aClass213_1 = arg1;
					arg1.method5130(Static258.anInt5637, Static60.aClass19_1);
				}
				if (Static60.aClass19_1 != null) {
					if (Static60.aClass19_1.aClass62Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static60.aClass19_1.aClass62Array1[arg3] = local120;
				}
				return local120;
			} catch (@Pc(186) Throwable local186) {
				return new AudioChannel();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBII)V")
	public static void method2263(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static224.anInt5063 = arg1;
		Static172.anInt4164 = 0;
		Static267.anInt5773 = 0;
		Static106.anInt2869 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void method2264(@OriginalArg(0) Js5 arg0) {
		Static85.aClass153_36 = arg0;
	}
}
