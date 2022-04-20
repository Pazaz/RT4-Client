import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[[[Lclient!bj;")
	public static Tile[][][] aClass3_Sub5ArrayArrayArray3;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "[Lclient!qf;")
	public static Sprite[] aClass3_Sub2_Sub1Array11;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
	public static final int[] anIntArray563 = new int[50];

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array8 = new AnimFrameset[14];

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "[I")
	public static final int[] anIntArray564 = new int[5];

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!na;")
	public static final JagString aClass100_1095 = Static28.parse("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!na;")
	public static final JagString aClass100_1096 = Static28.parse("rect_debug=");

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	public static int anInt5816 = 0;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_1097 = Static28.parse("(U2");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)Z")
	public static boolean method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static9.method187(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static256.method4394(local10 + 1, Static83.anIntArrayArrayArray4[arg0][arg1][arg2] + arg3, local14 + 1) && Static256.method4394(local10 + 128 - 1, Static83.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static256.method4394(local10 + 128 - 1, Static83.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static256.method4394(local10 + 1, Static83.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method4612() {
		Static233.aClass99_31.method3104();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!na;)V")
	public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(2) JagString arg1) {
		@Pc(7) JagString local7 = arg1.method3159().method3125();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static267.anInt5774; local15++) {
			@Pc(28) Player local28 = Static159.aClass8_Sub4_Sub1Array1[Static105.anIntArray256[local15]];
			if (local28 != null && local28.aClass100_364 != null && local28.aClass100_364.method3111(local7)) {
				local13 = true;
				Static102.method2075(Static173.self.movementQueueZ[0], 0, 1, false, 0, local28.movementQueueX[0], 1, 0, 2, local28.movementQueueZ[0], Static173.self.movementQueueX[0]);
				if (arg0 == 1) {
					Static6.outboundBuffer.p1isaac(68);
					Static6.outboundBuffer.p2leadd(Static105.anIntArray256[local15]);
				} else if (arg0 == 4) {
					Static6.outboundBuffer.p1isaac(180);
					Static6.outboundBuffer.p2leadd(Static105.anIntArray256[local15]);
				} else if (arg0 == 5) {
					Static6.outboundBuffer.p1isaac(4);
					Static6.outboundBuffer.p2le(Static105.anIntArray256[local15]);
				} else if (arg0 == 6) {
					Static6.outboundBuffer.p1isaac(133);
					Static6.outboundBuffer.p2le(Static105.anIntArray256[local15]);
				} else if (arg0 == 7) {
					Static6.outboundBuffer.p1isaac(114);
					Static6.outboundBuffer.p2leadd(Static105.anIntArray256[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static103.method2231(Static186.aClass100_827, 0, Static34.method882(new JagString[] { LocalizedText.UNABLETOFIND, local7 }));
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Lclient!ok;")
	public static IndexedSprite method4614() {
		@Pc(27) IndexedSprite local27;
		if (GlRenderer.enabled) {
			local27 = new GlIndexedSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[0], Static269.anIntArray252[0], Static254.anIntArray488[0], Static26.anIntArray66[0], Static7.aByteArrayArray5[0], Static259.anIntArray513);
		} else {
			local27 = new SoftwareIndexedSprite(Static124.anInt3080, Static227.anInt5091, Static274.anIntArray440[0], Static269.anIntArray252[0], Static254.anIntArray488[0], Static26.anIntArray66[0], Static7.aByteArrayArray5[0], Static259.anIntArray513);
		}
		Static75.method1631();
		return local27;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void method4615() {
		Static231.aClass99_29.method3102(5);
		Static219.aClass99_27.method3102(5);
	}
}
