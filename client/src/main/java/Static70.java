import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	public static int type = 0;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
	public static int updatedVarpsWriterIndex = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lclient!na;")
	public static JagString method1548(@OriginalArg(1) int arg0) {
		@Pc(9) JagString local9 = Static123.parseInt(arg0);
		for (@Pc(21) int local21 = local9.length() - 3; local21 > 0; local21 -= 3) {
			local9 = JagString.concatenate(new JagString[] { local9.substring(local21, 0), Static159.aClass100_760, local9.substring(local21) });
		}
		if (local9.length() > 9) {
			return JagString.concatenate(new JagString[] { Static250.aClass100_1043, local9.substring(local9.length() - 8, 0), LocalizedText.MILLION_SHORT, Static123.aClass100_593, local9, Static116.aClass100_583 });
		} else if (local9.length() > 6) {
			return JagString.concatenate(new JagString[] { Static119.aClass100_589, local9.substring(local9.length() - 4, 0), LocalizedText.THOUSAND_SHORT, Static123.aClass100_593, local9, Static116.aClass100_583 });
		} else {
			return JagString.concatenate(new JagString[] { Static278.aClass100_1101, local9, Static230.aClass100_978 });
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
					local53 = Rasteriser.palette[Static230.method3949(local95, 96)];
				} else if (local24 >= 0) {
					local53 = Rasteriser.palette[Static230.method3949(Rasteriser.textureProvider.getAverageColor(local24), 96)];
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
					local53 = Rasteriser.palette[Static230.method3949(local95, 96)];
				}
				WorldMap.overlayColors[local11 + 1] = local53;
			}
		}
	}
}
