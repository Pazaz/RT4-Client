import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "[I")
	public static final int[] anIntArray326 = new int[25];

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_664 = Static28.parse(":clan:");

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public static int anInt3469 = 0;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
	public static void method2720() {
		if (Static153.aClass100_724 != null) {
			Static90.method1853(Static153.aClass100_724);
			Static153.aClass100_724 = null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method2721() {
		Static65.method1500();
		Static89.aClass3_Sub2_Sub1_5 = null;
		Static107.anInt2875 = -1;
		Static217.method3768();
		Static255.cache.clear();
		Static171.aClass139_1 = new Class139();
		((Js5GlTextureProvider) Rasteriser.textureProvider).clear();
		Static120.lightCount = 0;
		Static120.lights = new Light[255];
		Static237.method4120();
		Static242.method4203();
		Static115.clear();
		Static116.clear(false);
		Static119.method2381();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(46) Player player = Static159.players[local39];
			if (player != null) {
				player.attachment = null;
			}
		}
		if (GlRenderer.enabled) {
			Static242.method4201();
			Static76.method1642();
		}
		Static102.load(Static261.js5Archive13, Static209.js5Archive8);
		Sprites.load(Static209.js5Archive8);
		Static204.aClass3_Sub2_Sub1_10 = null;
		Static39.aClass3_Sub2_Sub1_1 = null;
		Static92.aClass3_Sub2_Sub1_6 = null;
		Static165.aClass3_Sub2_Sub1_8 = null;
		Static181.aClass3_Sub2_Sub1_9 = null;
		if (client.gameState == 5) {
			Static181.load(Static209.js5Archive8);
		}
		if (client.gameState == 10) {
			Static73.method1596(false);
		}
		if (client.gameState == 30) {
			Static196.setGameState(25);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIBII)V")
	public static void method2722(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static113.anInt4612 = arg3;
		Static231.anInt5203 = arg2;
		Static245.anInt5375 = arg5;
		Static233.anInt5225 = arg1;
		Static248.anInt4232 = arg4;
		if (arg0 && Static113.anInt4612 >= 100) {
			Static138.renderX = Static245.anInt5375 * 128 + 64;
			Static134.renderZ = Static248.anInt4232 * 128 + 64;
			Static5.anInt40 = Static207.method3685(Static55.level, Static138.renderX, Static134.renderZ) - Static231.anInt5203;
		}
		Static227.cameraType = 2;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ve;Lclient!ve;ILclient!ve;)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) Js5 arg2) {
		Static243.aClass153_98 = arg1;
		Static5.aClass153_1 = arg0;
		Static225.aClass153_92 = arg2;
	}
}
