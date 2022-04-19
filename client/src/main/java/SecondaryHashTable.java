import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class SecondaryHashTable {

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "[Lclient!rg;")
	private final SecondaryNode[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
	public SecondaryHashTable(@OriginalArg(0) int arg0) {
		this.aClass3_Sub2Array1 = new SecondaryNode[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) SecondaryNode local23 = this.aClass3_Sub2Array1[local7] = new SecondaryNode();
			local23.aClass3_Sub2_66 = local23;
			local23.aClass3_Sub2_67 = local23;
		}
	}
}
