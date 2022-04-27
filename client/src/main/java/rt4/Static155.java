package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	public static int anInt3751;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt3718 = -1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!na;I)V")
	public static void method2941(@OriginalArg(0) boolean arg0, @OriginalArg(1) JagString arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(12) JagString local12 = arg1.toLowerCase();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < ObjTypeList.anInt3245; local16++) {
			@Pc(27) ObjType local27 = ObjTypeList.get(local16);
			if ((!arg0 || local27.stockMarket) && local27.certificateTemplate == -1 && local27.lentTemplate == -1 && local27.dummyItem == 0 && local27.name.toLowerCase().indexOf(local12) != -1) {
				if (local14 >= 250) {
					Find.results = null;
					Find.index = -1;
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
		Find.results = local8;
		Find.size = 0;
		Find.index = local14;
		@Pc(117) JagString[] local117 = new JagString[Find.index];
		for (@Pc(119) int local119 = 0; local119 < Find.index; local119++) {
			local117[local119] = ObjTypeList.get(local8[local119]).name;
		}
		Static202.method3656(local117, Find.results);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public static int getVarbit(@OriginalArg(1) int arg0) {
		@Pc(13) VarbitType local13 = VarbitTypeList.get(arg0);
		@Pc(16) int local16 = local13.baseVar;
		@Pc(19) int local19 = local13.endBit;
		@Pc(22) int local22 = local13.startBit;
		@Pc(29) int local29 = Class3_Sub9.anIntArray135[local19 - local22];
		return VarpDomain.activeVarps[local16] >> local22 & local29;
	}
}
