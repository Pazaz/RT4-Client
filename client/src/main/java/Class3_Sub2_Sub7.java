import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "[Lclient!ne;")
	public final Class104[] aClass104Array1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;IZ)V")
	public Class3_Sub2_Sub7(@OriginalArg(0) Class153 arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class69 local5 = new Class69();
		@Pc(10) int local10 = arg0.method4504(arg2);
		this.aClass104Array1 = new Class104[local10];
		@Pc(19) int[] local19 = arg0.method4503(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(37) byte[] local37 = arg0.method4495(arg2, local19[local21]);
			@Pc(51) int local51 = local37[1] & 0xFF | (local37[0] & 0xFF) << 8;
			@Pc(56) Class3_Sub20 local56 = (Class3_Sub20) local5.method2289();
			@Pc(58) Class3_Sub20 local58 = null;
			while (local56 != null) {
				if (local56.anInt3113 == local51) {
					local58 = local56;
					break;
				}
				local56 = (Class3_Sub20) local5.method2288();
			}
			if (local58 == null) {
				@Pc(85) byte[] local85 = arg1.method4502(0, local51);
				local58 = new Class3_Sub20(local51, local85);
				local5.method2282(local58);
			}
			this.aClass104Array1[local19[local21]] = new Class104(local37, local58);
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)Z")
	public final boolean method901(@OriginalArg(1) int arg0) {
		return this.aClass104Array1[arg0].aBoolean197;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Z")
	public final boolean method903(@OriginalArg(0) int arg0) {
		return this.aClass104Array1[arg0].aBoolean196;
	}
}
