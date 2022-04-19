import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class SecondaryNode extends Node {

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "J")
	public long aLong185;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!rg;")
	public SecondaryNode aClass3_Sub2_66;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!rg;")
	public SecondaryNode aClass3_Sub2_67;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	public final void method4365() {
		if (this.aClass3_Sub2_66 != null) {
			this.aClass3_Sub2_66.aClass3_Sub2_67 = this.aClass3_Sub2_67;
			this.aClass3_Sub2_67.aClass3_Sub2_66 = this.aClass3_Sub2_66;
			this.aClass3_Sub2_67 = null;
			this.aClass3_Sub2_66 = null;
		}
	}
}
