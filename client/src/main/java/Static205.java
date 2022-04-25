import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!be;BI)Lclient!na;")
	public static JagString method3677(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1) {
		if (!InterfaceList.getServerActiveProperties(arg0).method503(arg1) && arg0.anObjectArray29 == null) {
			return null;
		} else if (arg0.ops == null || arg0.ops.length <= arg1 || arg0.ops[arg1] == null || arg0.ops[arg1].trim().length() == 0) {
			return Static121.aBoolean154 ? JagString.concatenate(new JagString[] { Static207.aClass100_903, Static123.parseInt(arg1) }) : null;
		} else {
			return arg0.ops[arg1];
		}
	}
}
