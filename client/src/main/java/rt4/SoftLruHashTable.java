package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class SoftLruHashTable {

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!sc;")
	private final HashTable table;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int arg0) {
		this.capacity = arg0;
		@Pc(11) int local11;
		for (local11 = 1; local11 + local11 < arg0; local11 += local11) {
		}
		this.available = arg0;
		this.table = new HashTable(local11);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/lang/Object;J)V")
	public final void put(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.remove(arg1);
		if (this.available == 0) {
			@Pc(26) ReferenceNode local26 = (ReferenceNode) this.queue.removeHead();
			local26.unlink();
			local26.unlinkSecondary();
		} else {
			this.available--;
		}
		@Pc(44) HardReferenceNode local44 = new HardReferenceNode(arg0);
		this.table.put(local44, arg1);
		this.queue.addTail(local44);
		local44.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(JB)V")
	public final void remove(@OriginalArg(0) long arg0) {
		@Pc(6) ReferenceNode local6 = (ReferenceNode) this.table.get(arg0);
		if (local6 != null) {
			local6.unlink();
			local6.unlinkSecondary();
			this.available++;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	public final int size() {
		@Pc(10) int local10 = 0;
		for (@Pc(16) ReferenceNode local16 = (ReferenceNode) this.queue.head(); local16 != null; local16 = (ReferenceNode) this.queue.next()) {
			if (!local16.isSoft()) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
	public final void clean(@OriginalArg(1) int arg0) {
		if (ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY == null) {
			return;
		}
		for (@Pc(9) ReferenceNode local9 = (ReferenceNode) this.queue.head(); local9 != null; local9 = (ReferenceNode) this.queue.next()) {
			if (local9.isSoft()) {
				if (local9.get() == null) {
					local9.unlink();
					local9.unlinkSecondary();
					this.available++;
				}
			} else if (++local9.secondaryKey > (long) arg0) {
				@Pc(33) ReferenceNode local33 = ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY.create(local9);
				this.table.put(local33, local9.key);
				SecondaryLinkedList.insertAfter(local9, local33);
				local9.unlink();
				local9.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public final void removeSoft() {
		for (@Pc(7) ReferenceNode local7 = (ReferenceNode) this.queue.head(); local7 != null; local7 = (ReferenceNode) this.queue.next()) {
			if (local7.isSoft()) {
				local7.unlink();
				local7.unlinkSecondary();
				this.available++;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public final void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(JB)Ljava/lang/Object;")
	public final Object get(@OriginalArg(0) long arg0) {
		@Pc(12) ReferenceNode local12 = (ReferenceNode) this.table.get(arg0);
		if (local12 == null) {
			return null;
		}
		@Pc(27) Object local27 = local12.get();
		if (local27 == null) {
			local12.unlink();
			local12.unlinkSecondary();
			this.available++;
			return null;
		}
		if (local12.isSoft()) {
			@Pc(53) HardReferenceNode local53 = new HardReferenceNode(local27);
			this.table.put(local53, local12.key);
			this.queue.addTail(local53);
			local53.secondaryKey = 0L;
			local12.unlink();
			local12.unlinkSecondary();
		} else {
			this.queue.addTail(local12);
			local12.secondaryKey = 0L;
		}
		return local27;
	}
}
