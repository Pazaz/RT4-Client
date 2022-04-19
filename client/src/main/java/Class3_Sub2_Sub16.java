import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "Lclient!uj;")
	public final Class8_Sub7 aClass8_Sub7_1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!uj;)V")
	public Class3_Sub2_Sub16(@OriginalArg(0) Class8_Sub7 arg0) {
		this.aClass8_Sub7_1 = arg0;
	}
}
