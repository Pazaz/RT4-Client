import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_260 = JagString.parse(")1a2)1m");

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!na;")
	public static final JagString aClass100_264 = JagString.parse("Card:");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BZII)Lclient!na;")
	public static JagString method1025(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(23) int local23 = 1;
		@Pc(27) int local27 = arg1 / 10;
		while (local27 != 0) {
			local27 /= 10;
			local23++;
		}
		@Pc(38) int local38 = local23;
		if (arg1 < 0 || arg0) {
			local38 = local23 + 1;
		}
		@Pc(46) byte[] local46 = new byte[local38];
		if (arg1 < 0) {
			local46[0] = 45;
		} else if (arg0) {
			local46[0] = 43;
		}
		for (@Pc(61) int local61 = 0; local61 < local23; local61++) {
			@Pc(68) int local68 = arg1 % 10;
			if (local68 < 0) {
				local68 = -local68;
			}
			if (local68 > 9) {
				local68 += 39;
			}
			local46[local38 - local61 - 1] = (byte) (local68 + 48);
			arg1 /= 10;
		}
		@Pc(112) JagString local112 = new JagString();
		local112.chars = local46;
		local112.length = local38;
		return local112;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 128 || arg2 < 128 || arg5 > 13056 || arg2 > 13056) {
			Static16.anInt548 = -1;
			Static65.anInt1951 = -1;
			return;
		}
		@Pc(38) int local38 = SceneGraph.getTileHeight(Player.level, arg5, arg2) - arg3;
		@Pc(42) int local42 = arg2 - Static134.renderZ;
		@Pc(46) int local46 = local38 - Static5.anInt40;
		@Pc(50) int local50 = arg5 - Static138.renderX;
		@Pc(54) int local54 = MathUtils.sin[Static240.cameraPitch];
		@Pc(58) int local58 = MathUtils.cos[Static240.cameraPitch];
		@Pc(62) int local62 = MathUtils.sin[Static184.cameraYaw];
		@Pc(66) int local66 = MathUtils.cos[Static184.cameraYaw];
		@Pc(76) int local76 = local50 * local66 + local62 * local42 >> 16;
		@Pc(87) int local87 = local42 * local66 - local62 * local50 >> 16;
		@Pc(89) int local89 = local76;
		@Pc(99) int local99 = local58 * local46 - local87 * local54 >> 16;
		@Pc(113) int local113 = local87 * local58 + local46 * local54 >> 16;
		if (local113 < 50) {
			Static16.anInt548 = -1;
			Static65.anInt1951 = -1;
		} else if (GlRenderer.enabled) {
			@Pc(150) int local150 = arg1 * 512 >> 8;
			Static65.anInt1951 = local150 * local89 / local113 + arg0;
			@Pc(164) int local164 = arg6 * 512 >> 8;
			Static16.anInt548 = local164 * local99 / local113 + arg4;
		} else {
			Static65.anInt1951 = (local89 << 9) / local113 + arg0;
			Static16.anInt548 = (local99 << 9) / local113 + arg4;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)I")
	public static int method1029() {
		return PlayerAppearance.aClass99_33.method3100();
	}
}
