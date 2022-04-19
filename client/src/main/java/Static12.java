import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public static int anInt406;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!na;")
	public static final JagString aClass100_73 = Static28.method790("runes");

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int anInt391 = 255;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!na;")
	public static final JagString aClass100_74 = Static28.method790("::");

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	public static int anInt400 = 0;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "Lclient!na;")
	public static final JagString aClass100_75 = Static28.method790("gelb:");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method447() {
		if (Static83.aFloat3 < Static138.aFloat14) {
			Static83.aFloat3 = (float) ((double) Static83.aFloat3 + (double) Static83.aFloat3 / 30.0D);
			if (Static138.aFloat14 < Static83.aFloat3) {
				Static83.aFloat3 = Static138.aFloat14;
			}
			Static38.method965();
		} else if (Static138.aFloat14 < Static83.aFloat3) {
			Static83.aFloat3 = (float) ((double) Static83.aFloat3 - (double) Static83.aFloat3 / 30.0D);
			if (Static138.aFloat14 > Static83.aFloat3) {
				Static83.aFloat3 = Static138.aFloat14;
			}
			Static38.method965();
		}
		if (Static142.anInt3482 == -1 || Static217.anInt4901 == -1) {
			return;
		}
		@Pc(60) int local60 = Static142.anInt3482 - Static13.anInt435;
		if (local60 < 2 || local60 > 2) {
			local60 >>= 0x4;
		}
		@Pc(78) int local78 = Static217.anInt4901 - Static28.anInt919;
		if (local78 < 2 || local78 > 2) {
			local78 >>= 0x4;
		}
		Static28.anInt919 -= -local78;
		Static13.anInt435 += local60;
		if (local60 == 0 && local78 == 0) {
			Static142.anInt3482 = -1;
			Static217.anInt4901 = -1;
		}
		Static38.method965();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method449() {
		Static74.aClass100_460 = Static154.aClass100_733;
		Static21.aClass100_124 = Static265.aClass100_1085;
		Static92.aClass100_508 = Static155.aClass100_739;
		Static109.aClass100_569 = Static278.aClass100_1104;
		Static56.aClass100_384 = Static37.aClass100_238;
		Static148.aClass100_675 = Static26.aClass100_159;
		Static148.aClass100_676 = Static140.aClass100_661;
		Static262.aClass100_1079 = Static16.aClass100_93;
		Static69.aClass100_444 = Static64.aClass100_432;
		Static245.aClass100_1022 = Static59.aClass100_400;
		Static191.aClass100_846 = Static71.aClass100_419;
		Static253.aClass100_1055 = Static134.aClass100_630;
		Static233.aClass100_995 = Static17.aClass100_100;
		Static184.aClass100_820 = Static81.aClass100_477;
		Static34.aClass100_201 = Static113.aClass100_871;
		Static171.aClass100_790 = Static50.aClass100_361;
		Static141.aClass100_663 = Static205.aClass100_897;
		Static41.aClass100_272 = Static138.aClass100_651;
		Static265.aClass100_1083 = Static230.aClass100_979;
		Static150.aClass100_691 = Static115.aClass100_581;
		Static220.aClass100_931 = Static244.aClass100_1015;
		Static49.aClass100_348 = Static97.aClass100_523;
		Static253.aClass100_1054 = Static250.aClass100_1040;
		Static48.aClass100_347 = Static35.aClass100_219;
		Static214.aClass100_1064 = Static246.aClass100_1027;
		Static20.aClass100_115 = Static148.aClass100_674;
		Static224.aClass100_957 = Static86.aClass100_493;
		Static69.aClass100_440 = Static64.aClass100_432;
		Static25.aClass100_155 = Static81.aClass100_474;
		Static36.aClass100_233 = Static181.aClass100_812;
		Static150.aClass100_690 = Static198.aClass100_263;
		Static138.aClass100_648 = Static82.aClass100_480;
		Static192.aClass100_849 = Static215.aClass100_912;
		Static165.aClass100_774 = Static38.aClass100_242;
		Static86.aClass100_489 = Static113.aClass100_870;
		Static7.aClass100_190 = Static35.aClass100_217;
		Static38.aClass100_240 = Static154.aClass100_732;
		Static23.aClass100_132 = Static71.aClass100_416;
		Static262.aClass100_1077 = Static224.aClass100_955;
		Static57.aClass100_391 = Static195.aClass100_858;
		Static131.aClass100_626 = Static136.aClass100_632;
		Static225.aClass100_964 = Static101.aClass100_540;
		Static164.aClass100_769 = Static157.aClass100_753;
		Static41.aClass100_271 = Static156.aClass100_743;
		Static206.aClass100_901 = Static73.aClass100_452;
		Static105.aClass100_560 = Static28.aClass100_172;
		Static82.aClass100_478 = Static154.aClass100_737;
		Static27.aClass100_166 = Static23.aClass100_131;
		Static197.aClass100_873 = Static236.aClass100_1004;
		Static259.aClass100_1073 = Static127.aClass100_605;
		Static199.aClass100_881 = Static3.aClass100_1105;
		Static11.aClass100_70 = Static106.aClass100_563;
		Static244.aClass100_1016 = Static269.aClass100_554;
		Static229.aClass100_973 = Static236.aClass100_1003;
		Static156.aClass100_746 = Static196.aClass100_862;
		Static34.aClass100_197 = Static57.aClass100_390;
		Static39.aClass100_249 = Static154.aClass100_734;
		Static51.aClass100_367 = Static115.aClass100_580;
		Static21.aClass100_123 = Static253.aClass100_1058;
		Static211.aClass100_227 = Static112.aClass100_575;
		Static2.aClass100_4 = Static127.aClass100_604;
		Static234.aClass100_998 = Static187.aClass100_831;
		Static49.aClass100_349 = Static249.aClass100_1037;
		Static16.aClass100_94 = Static33.aClass100_194;
		Static223.aClass100_949 = Static106.aClass100_565;
		Static17.aClass100_104 = Static56.aClass100_382;
		Static111.aClass100_573 = Static37.aClass100_236;
		Static71.aClass100_417 = Static7.aClass100_192;
		Static270.aClass100_1091 = Static245.aClass100_1021;
		Static196.aClass100_864 = Static126.aClass100_600;
		Static113.aClass100_869 = Static85.aClass100_484;
		Static35.aClass100_218 = Static130.aClass100_607;
		Static56.aClass100_386 = Static115.aClass100_578;
		Static35.aClass100_220 = Static130.aClass100_607;
		Static225.aClass100_960 = Static115.aClass100_577;
		Static232.aClass100_986 = Static184.aClass100_817;
		Static246.aClass100_1028 = Static155.aClass100_740;
		Static269.aClass100_555 = Static111.aClass100_572;
		Static53.aClass100_370 = Static179.aClass100_806;
		Static157.aClass100_752 = Static249.aClass100_1038;
		Static71.aClass100_418 = Static7.aClass100_192;
		Static88.aClass100_498 = Static69.aClass100_441;
		Static10.aClass100_64 = Static198.aClass100_262;
		Static170.aClass100_621 = Static187.aClass100_833;
		Static178.aClass100_804 = Static131.aClass100_625;
		Static92.aClass100_507 = Static211.aClass100_229;
		Static247.aClass100_1032 = Static187.aClass100_832;
		Static222.aClass100_937 = Static65.aClass100_436;
		Static56.aClass100_385 = Static269.aClass100_557;
		Static208.aClass100_906 = Static82.aClass100_482;
	}
}
