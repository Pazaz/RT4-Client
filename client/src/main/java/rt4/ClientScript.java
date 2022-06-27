package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class ClientScript extends SecondaryNode {

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
	public int intArgs;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
	public int intLocals;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	public int stringArgs;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "[I")
	public int[] opcodes;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "[Lclient!sc;")
	public HashTable[] switchTables;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "Lclient!na;")
	public JagString name;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public int stringLocals;

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "[Lclient!na;")
	public JagString[] stringOperands;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "[I")
	public int[] intOperands;
}
