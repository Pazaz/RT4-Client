import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class3_Sub2_Sub19 extends SecondaryNode {

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!ra;")
	public final Class8_Sub6 aClass8_Sub6_1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class3_Sub2_Sub19(@OriginalArg(0) Class8_Sub6 arg0) {
		this.aClass8_Sub6_1 = arg0;
	}
}
