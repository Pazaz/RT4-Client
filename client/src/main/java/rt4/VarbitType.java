package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class VarbitType {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public int startBit;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public int endBit;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public int baseVar;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(9) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.baseVar = buffer.g2();
			this.startBit = buffer.g1();
			this.endBit = buffer.g1();
		}
	}
}
