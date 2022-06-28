package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class StructType extends SecondaryNode {

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "Lclient!sc;")
	private HashTable params;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)I")
	public final int getParam(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(29) IntNode local29 = (IntNode) this.params.get(arg0);
			return local29 == null ? arg1 : local29.value;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!wa;IB)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(17) int local17 = arg0.g1();
		@Pc(25) int local25;
		if (this.params == null) {
			local25 = IntUtils.clp2(local17);
			this.params = new HashTable(local25);
		}
		for (local25 = 0; local25 < local17; local25++) {
			@Pc(45) boolean local45 = arg0.g1() == 1;
			@Pc(49) int local49 = arg0.g3();
			@Pc(58) Node local58;
			if (local45) {
				local58 = new StringNode(arg0.gjstr());
			} else {
				local58 = new IntNode(arg0.g4());
			}
			this.params.put(local58, local49);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!na;BI)Lclient!na;")
	public final JagString getParam(@OriginalArg(0) JagString arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(16) StringNode local16 = (StringNode) this.params.get(arg1);
			return local16 == null ? arg0 : local16.value;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.decode(arg0, local5);
		}
	}
}
