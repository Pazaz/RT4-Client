package rt4;

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

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(13) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!wa;I)V")
	private void decode(@OriginalArg(0) int opcode, @OriginalArg(1) Buffer buffer) {
		if (opcode == 1) {
			this.type = buffer.g1();
		} else if (opcode == 2) {
			this.defaultInt = buffer.g4();
		} else if (opcode == 5) {
			this.defaultString = buffer.gjstr();
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)Z")
	public final boolean isString() {
		return this.type == 115;
	}
}
