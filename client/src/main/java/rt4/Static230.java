package rt4;

import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_989 = JagString.parse("cookieprefix");
	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_1029 = JagString.parse("cookiehost");
	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_667 = JagString.parse("settings=");
	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!na;")
	public static final JagString aClass100_1095 = JagString.parse("; version=1; path=)4; domain=");
	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_1018 = JagString.parse("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_1082 = JagString.parse("; Expires=");
	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_821 = JagString.parse("document)3cookie=(R");
	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_946 = JagString.parse("(R");
	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_431 = JagString.parse("; Max)2Age=");
	@OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
	public static int anInt5158;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	public static int anInt5150 = 1;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Z")
	public static boolean dynamicMapRegion = false;

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
	public static int anInt5161 = 0;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
	public static void method3947() {
		PlayerAppearance.aClass99_33.clear();
		PlayerAppearance.aClass99_21.clear();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)I")
	public static int method3949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBIII)V")
	public static void method3950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= TextureOp29.anInt4164 && arg3 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg4 && TextureOp29.anInt2869 >= arg2) {
			Static176.method3308(arg2, arg3, arg4, arg0, arg1);
		} else {
			Static163.method3105(arg1, arg3, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!na;")
	public static JagString method3952(@OriginalArg(0) String arg0) {
		@Pc(14) byte[] local14;
		try {
			local14 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = arg0.getBytes();
		}
		@Pc(23) JagString local23 = new JagString();
		local23.chars = local14;
		local23.length = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.length; local31++) {
			if (local14[local31] != 0) {
				local14[local23.length++] = local14[local31];
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!na;)V")
	public static void method3954(@OriginalArg(1) JagString arg0) {
		client.settings = arg0;
		if (GameShell.signLink.applet == null) {
			return;
		}
		try {
			@Pc(17) JagString local17 = aClass100_989.fromParameters(GameShell.signLink.applet);
			@Pc(23) JagString local23 = aClass100_1029.fromParameters(GameShell.signLink.applet);
			@Pc(48) JagString local48 = JagString.concatenate(new JagString[] { local17, aClass100_667, arg0, aClass100_1095, local23 });
			if (arg0.length() == 0) {
				local48 = JagString.concatenate(new JagString[] { local48, aClass100_1018 });
			} else {
				local48 = JagString.concatenate(new JagString[] { local48, aClass100_1082, Static33.method873(MonotonicClock.currentTimeMillis() + 94608000000L), aClass100_431, Static154.method2929(94608000L) });
			}
			JagString.concatenate(new JagString[] { aClass100_821, local48, aClass100_946 }).method3134(GameShell.signLink.applet);
		} catch (@Pc(124) Throwable local124) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
	public static void method3956(@OriginalArg(0) int arg0) {
		if (MidiPlayer.anInt441 == 0) {
			Static172.aClass3_Sub3_Sub4_2.method4447(arg0);
		} else {
			MidiPlayer.anInt5527 = arg0;
		}
	}
}
