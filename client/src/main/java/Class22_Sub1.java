import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!gf;I)Lclient!gf;")
	@Override
	public final Class3_Sub2_Sub10 method1027(@OriginalArg(0) Class3_Sub2_Sub10 arg0) {
		return new Class3_Sub2_Sub10_Sub2(arg0.method3618());
	}
}
