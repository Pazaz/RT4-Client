package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class VarpType {

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public int clientCode = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(5) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!wa;BI)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 5) {
			this.clientCode = buffer.g2();
		}
	}
}
