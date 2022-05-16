package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	public static int anInt3751;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public static int getVarbit(@OriginalArg(1) int arg0) {
		@Pc(13) VarbitType local13 = VarbitTypeList.get(arg0);
		@Pc(16) int local16 = local13.baseVar;
		@Pc(19) int local19 = local13.endBit;
		@Pc(22) int local22 = local13.startBit;
		@Pc(29) int local29 = Song_Class3_Sub9.anIntArray135[local19 - local22];
		return VarpDomain.activeVarps[local16] >> local22 & local29;
	}
}
