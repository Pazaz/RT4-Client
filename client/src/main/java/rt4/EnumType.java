package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class EnumType extends SecondaryNode {

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
	public int valueType;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
	public int keyType;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "Lclient!sc;")
	public HashTable table;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "Lclient!sc;")
	private HashTable inverseTable;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
	private int defaultInt;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "Lclient!na;")
	public static final JagString NULL = JagString.parse("null");
	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "Lclient!na;")
	private JagString defaultString = NULL;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!wa;B)V")
	private void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.keyType = arg1.g1();
		} else if (arg0 == 2) {
			this.valueType = arg1.g1();
		} else if (arg0 == 3) {
			this.defaultString = arg1.gjstr();
		} else if (arg0 == 4) {
			this.defaultInt = arg1.g4();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(41) int size = arg1.g2();
			this.table = new HashTable(IntUtils.clp2(size));
			for (@Pc(51) int local51 = 0; local51 < size; local51++) {
				@Pc(58) int local58 = arg1.g4();
				@Pc(70) Node local70;
				if (arg0 == 5) {
					local70 = new StringNode(arg1.gjstr());
				} else {
					local70 = new IntNode(arg1.g4());
				}
				this.table.put(local70, local58);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)Lclient!na;")
	public final JagString getString(@OriginalArg(0) int arg0) {
		if (this.table == null) {
			return this.defaultString;
		} else {
			@Pc(26) StringNode local26 = (StringNode) this.table.get(arg0);
			return local26 == null ? this.defaultString : local26.value;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Lclient!na;I)Z")
	public final boolean containsValue(@OriginalArg(0) JagString arg0) {
		if (this.table == null) {
			return false;
		}
		if (this.inverseTable == null) {
			this.inverseStrings();
		}
		for (@Pc(38) EnumStringEntry node = (EnumStringEntry) this.inverseTable.get(arg0.longHashCode()); node != null; node = (EnumStringEntry) this.inverseTable.nextWithKey()) {
			if (node.value.strEquals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	private void inverseStrings() {
		this.inverseTable = new HashTable(this.table.getBucketCount());
		for (@Pc(22) StringNode node = (StringNode) this.table.head(); node != null; node = (StringNode) this.table.next()) {
			@Pc(36) EnumStringEntry entry = new EnumStringEntry(node.value, (int) node.key);
			this.inverseTable.put(entry, node.value.longHashCode());
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)I")
	public final int getInt(@OriginalArg(1) int arg0) {
		if (this.table == null) {
			return this.defaultInt;
		} else {
			@Pc(18) IntNode local18 = (IntNode) this.table.get(arg0);
			return local18 == null ? this.defaultInt : local18.value;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(II)Z")
	public final boolean containsValue(@OriginalArg(1) int arg0) {
		if (this.table == null) {
			return false;
		}
		if (this.inverseTable == null) {
			this.inverseInts();
		}
		@Pc(34) IntNode node = (IntNode) this.inverseTable.get(arg0);
		return node != null;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	private void inverseInts() {
		this.inverseTable = new HashTable(this.table.getBucketCount());
		for (@Pc(24) IntNode node = (IntNode) this.table.head(); node != null; node = (IntNode) this.table.next()) {
			@Pc(34) IntNode inverseNode = new IntNode((int) node.key);
			this.inverseTable.put(inverseNode, node.value);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.decode(local9, arg0);
		}
	}
}
