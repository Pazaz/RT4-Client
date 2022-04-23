import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class ParamType extends SecondaryNode {

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
	public int defaultInt;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
	private int type;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "Lclient!na;")
	public JagString defaultString;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!wa;I)V")
	private void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.type = arg1.g1();
		} else if (arg0 == 2) {
			this.defaultInt = arg1.g4();
		} else if (arg0 == 5) {
			this.defaultString = arg1.gjstr();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.g1();
			if (local13 == 0) {
				return;
			}
			this.decode(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)Z")
	public final boolean isString() {
		return this.type == 115;
	}
}
