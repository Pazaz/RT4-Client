package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class LruHashTable {

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!rg;")
	private SecondaryNode aClass3_Sub2_37 = new SecondaryNode();

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Lclient!sc;")
	private final HashTable table;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V")
	public LruHashTable(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.available = arg0;
		while (arg0 > local13 + local13) {
			local13 += local13;
		}
		this.capacity = arg0;
		this.table = new HashTable(local13);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(JI)Lclient!rg;")
	public final SecondaryNode get(@OriginalArg(0) long arg0) {
		@Pc(16) SecondaryNode local16 = (SecondaryNode) this.table.get(arg0);
		if (local16 != null) {
			this.queue.addTail(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lclient!ab;")
	public final Node method1808() {
		return this.table.head();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!rg;JB)V")
	public final void put(@OriginalArg(0) SecondaryNode arg0, @OriginalArg(1) long arg1) {
		if (this.available == 0) {
			@Pc(14) SecondaryNode local14 = this.queue.removeHead();
			local14.unlink();
			local14.unlinkSecondary();
			if (this.aClass3_Sub2_37 == local14) {
				local14 = this.queue.removeHead();
				local14.unlink();
				local14.unlinkSecondary();
			}
		} else {
			this.available--;
		}
		this.table.put(arg0, arg1);
		this.queue.addTail(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Lclient!ab;")
	public final Node next() {
		return this.table.next();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public final void clear() {
		this.queue.clear();
		this.table.clear();
		this.aClass3_Sub2_37 = new SecondaryNode();
		this.available = this.capacity;
	}
}
