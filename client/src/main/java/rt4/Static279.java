package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_1107 = JagString.parse(")4l=");

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lclient!na;)[Lclient!na;")
	public static JagString[] method4664(@OriginalArg(1) JagString[] arg0) {
		@Pc(8) JagString[] local8 = new JagString[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = JagString.concatenate(new JagString[] { Static123.parseInt(local15), Static27.aClass100_168 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = JagString.concatenate(new JagString[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}
}
