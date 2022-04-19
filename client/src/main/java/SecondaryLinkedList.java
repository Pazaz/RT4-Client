import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class SecondaryLinkedList {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!rg;")
	private SecondaryNode aClass3_Sub2_22;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!rg;")
	private final SecondaryNode aClass3_Sub2_21 = new SecondaryNode();

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public SecondaryLinkedList() {
		this.aClass3_Sub2_21.aClass3_Sub2_67 = this.aClass3_Sub2_21;
		this.aClass3_Sub2_21.aClass3_Sub2_66 = this.aClass3_Sub2_21;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	public final int method793() {
		@Pc(3) int local3 = 0;
		@Pc(7) SecondaryNode local7 = this.aClass3_Sub2_21.aClass3_Sub2_67;
		while (local7 != this.aClass3_Sub2_21) {
			local7 = local7.aClass3_Sub2_67;
			local3++;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Lclient!rg;")
	public final SecondaryNode method795() {
		@Pc(3) SecondaryNode local3 = this.aClass3_Sub2_21.aClass3_Sub2_67;
		if (this.aClass3_Sub2_21 == local3) {
			this.aClass3_Sub2_22 = null;
			return null;
		} else {
			this.aClass3_Sub2_22 = local3.aClass3_Sub2_67;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lclient!rg;")
	public final SecondaryNode method796() {
		@Pc(7) SecondaryNode local7 = this.aClass3_Sub2_21.aClass3_Sub2_67;
		if (local7 == this.aClass3_Sub2_21) {
			return null;
		} else {
			local7.method4365();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!rg;")
	public final SecondaryNode method797() {
		@Pc(2) SecondaryNode local2 = this.aClass3_Sub2_22;
		if (local2 == this.aClass3_Sub2_21) {
			this.aClass3_Sub2_22 = null;
			return null;
		} else {
			this.aClass3_Sub2_22 = local2.aClass3_Sub2_67;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!rg;B)V")
	public final void method798(@OriginalArg(0) SecondaryNode arg0) {
		if (arg0.aClass3_Sub2_66 != null) {
			arg0.method4365();
		}
		arg0.aClass3_Sub2_66 = this.aClass3_Sub2_21.aClass3_Sub2_66;
		arg0.aClass3_Sub2_67 = this.aClass3_Sub2_21;
		arg0.aClass3_Sub2_66.aClass3_Sub2_67 = arg0;
		arg0.aClass3_Sub2_67.aClass3_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public final void method802() {
		while (true) {
			@Pc(15) SecondaryNode local15 = this.aClass3_Sub2_21.aClass3_Sub2_67;
			if (this.aClass3_Sub2_21 == local15) {
				this.aClass3_Sub2_22 = null;
				return;
			}
			local15.method4365();
		}
	}
}
