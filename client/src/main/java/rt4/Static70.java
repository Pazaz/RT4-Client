package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!je", name = "db", descriptor = "Lclient!na;")
	public static final JagString aClass100_589 = JagString.parse(" <col=ffffff>");
	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_1043 = JagString.parse(" <col=00ff80>");
	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_1101 = JagString.parse(" <col=ffff00>");
	@OriginalMember(owner = "client!mi", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_760 = JagString.parse(")1");
	@OriginalMember(owner = "client!sj", name = "w", descriptor = "Lclient!na;")
	public static final JagString aClass100_978 = JagString.parse("<)4col>");
    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_583 = JagString.parse("(Y<)4col>");

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lclient!na;")
	public static JagString method1548(@OriginalArg(1) int arg0) {
		@Pc(9) JagString local9 = JagString.parseInt(arg0);
		for (@Pc(21) int local21 = local9.length() - 3; local21 > 0; local21 -= 3) {
			local9 = JagString.concatenate(new JagString[] { local9.substring(local21, 0), aClass100_760, local9.substring(local21) });
		}
		if (local9.length() > 9) {
			return JagString.concatenate(new JagString[] { aClass100_1043, local9.substring(local9.length() - 8, 0), LocalizedText.MILLION_SHORT, MiniMenu.OPEN_PARENTHESIS, local9, aClass100_583 });
		} else if (local9.length() > 6) {
			return JagString.concatenate(new JagString[] { aClass100_589, local9.substring(local9.length() - 4, 0), LocalizedText.THOUSAND_SHORT, MiniMenu.OPEN_PARENTHESIS, local9, aClass100_583 });
		} else {
			return JagString.concatenate(new JagString[] { aClass100_1101, local9, aClass100_978 });
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	public static void loadOverlayColors(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < FloTypeList.capacity; local11++) {
			@Pc(18) FloType local18 = FloTypeList.method4395(local11);
			if (local18 != null) {
				@Pc(24) int local24 = local18.texture;
				if (local24 >= 0 && !Rasteriser.textureProvider.method3236(local24)) {
					local24 = -1;
				}
				@Pc(53) int local53;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(95) int local95;
				if (local18.anInt5894 >= 0) {
					local66 = local18.anInt5894;
					local72 = (local66 & 0x7F) + arg0;
					if (local72 < 0) {
						local72 = 0;
					} else if (local72 > 127) {
						local72 = 127;
					}
					local95 = (local66 & 0x380) + (arg1 + local66 & 0xFC00) + local72;
					local53 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(local95, 96)];
				} else if (local24 >= 0) {
					local53 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(Rasteriser.textureProvider.getAverageColor(local24), 96)];
				} else if (local18.anInt5899 == -1) {
					local53 = -1;
				} else {
					local66 = local18.anInt5899;
					local72 = arg0 + (local66 & 0x7F);
					if (local72 < 0) {
						local72 = 0;
					} else if (local72 > 127) {
						local72 = 127;
					}
					local95 = local72 + (local66 & 0x380) + (local66 + arg1 & 0xFC00);
					local53 = Rasteriser.palette[ColorUtils.multiplyLightnessGrayscale(local95, 96)];
				}
				WorldMap.overlayColors[local11 + 1] = local53;
			}
		}
	}
}
