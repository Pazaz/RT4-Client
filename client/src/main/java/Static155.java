import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	public static int anInt3751;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt3718 = -1;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "[I")
	public static final int[] varcs = new int[2000];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public static void method2940(@OriginalArg(0) int arg0) {
		WorldMap.anInt4901 = -1;
		if (arg0 == 37) {
			WorldMap.targetZoom = 3.0F;
		} else if (arg0 == 50) {
			WorldMap.targetZoom = 4.0F;
		} else if (arg0 == 75) {
			WorldMap.targetZoom = 6.0F;
		} else if (arg0 == 100) {
			WorldMap.targetZoom = 8.0F;
		} else if (arg0 == 200) {
			WorldMap.targetZoom = 16.0F;
		}
		WorldMap.anInt4901 = -1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!na;I)V")
	public static void method2941(@OriginalArg(0) boolean arg0, @OriginalArg(1) JagString arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(12) JagString local12 = arg1.toLowerCase();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < ObjTypeList.anInt3245; local16++) {
			@Pc(27) ObjType local27 = ObjTypeList.get(local16);
			if ((!arg0 || local27.stockMarket) && local27.certificateTemplate == -1 && local27.lentTemplate == -1 && local27.dummyItem == 0 && local27.name.toLowerCase().indexOf(local12) != -1) {
				if (local14 >= 250) {
					Static169.aShortArray52 = null;
					Static111.anInt2905 = -1;
					return;
				}
				if (local14 >= local8.length) {
					@Pc(83) short[] local83 = new short[local8.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local14; local85++) {
						local83[local85] = local8[local85];
					}
					local8 = local83;
				}
				local8[local14++] = (short) local16;
			}
		}
		Static169.aShortArray52 = local8;
		Static67.anInt3356 = 0;
		Static111.anInt2905 = local14;
		@Pc(117) JagString[] local117 = new JagString[Static111.anInt2905];
		for (@Pc(119) int local119 = 0; local119 < Static111.anInt2905; local119++) {
			local117[local119] = ObjTypeList.get(local8[local119]).name;
		}
		Static202.method3656(local117, Static169.aShortArray52);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public static int getVarbit(@OriginalArg(1) int arg0) {
		@Pc(13) VarbitType local13 = VarbitTypeList.get(arg0);
		@Pc(16) int local16 = local13.baseVar;
		@Pc(19) int local19 = local13.endBit;
		@Pc(22) int local22 = local13.startBit;
		@Pc(29) int local29 = Class3_Sub9.anIntArray135[local19 - local22];
		return Static7.varps[local16] >> local22 & local29;
	}
}
