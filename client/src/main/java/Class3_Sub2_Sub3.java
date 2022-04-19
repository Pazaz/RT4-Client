import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "Lclient!bh;")
	public final Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!bh;)V")
	public Class3_Sub2_Sub3(@OriginalArg(0) Class8_Sub2 arg0) {
		this.aClass8_Sub2_1 = arg0;
	}
}
