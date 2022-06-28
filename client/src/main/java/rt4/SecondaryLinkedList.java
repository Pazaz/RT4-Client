package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class SecondaryLinkedList {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!rg;")
	private SecondaryNode cursor;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!rg;")
	private final SecondaryNode sentinel = new SecondaryNode();

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public SecondaryLinkedList() {
		this.sentinel.secondaryNext = this.sentinel;
		this.sentinel.secondaryPrev = this.sentinel;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rg;Lclient!rg;B)V")
	public static void insertAfter(@OriginalArg(0) SecondaryNode arg0, @OriginalArg(1) SecondaryNode arg1) {
		if (arg1.secondaryPrev != null) {
			arg1.unlinkSecondary();
		}
		arg1.secondaryPrev = arg0;
		arg1.secondaryNext = arg0.secondaryNext;
		arg1.secondaryPrev.secondaryNext = arg1;
		arg1.secondaryNext.secondaryPrev = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	public final int size() {
		@Pc(3) int local3 = 0;
		@Pc(7) SecondaryNode local7 = this.sentinel.secondaryNext;
		while (local7 != this.sentinel) {
			local7 = local7.secondaryNext;
			local3++;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Lclient!rg;")
	public final SecondaryNode head() {
		@Pc(3) SecondaryNode local3 = this.sentinel.secondaryNext;
		if (this.sentinel == local3) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local3.secondaryNext;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lclient!rg;")
	public final SecondaryNode removeHead() {
		@Pc(7) SecondaryNode local7 = this.sentinel.secondaryNext;
		if (local7 == this.sentinel) {
			return null;
		} else {
			local7.unlinkSecondary();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!rg;")
	public final SecondaryNode next() {
		@Pc(2) SecondaryNode local2 = this.cursor;
		if (local2 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = local2.secondaryNext;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!rg;B)V")
	public final void addTail(@OriginalArg(0) SecondaryNode arg0) {
		if (arg0.secondaryPrev != null) {
			arg0.unlinkSecondary();
		}
		arg0.secondaryPrev = this.sentinel.secondaryPrev;
		arg0.secondaryNext = this.sentinel;
		arg0.secondaryPrev.secondaryNext = arg0;
		arg0.secondaryNext.secondaryPrev = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public final void clear() {
		while (true) {
			@Pc(15) SecondaryNode local15 = this.sentinel.secondaryNext;
			if (this.sentinel == local15) {
				this.cursor = null;
				return;
			}
			local15.unlinkSecondary();
		}
	}
}
