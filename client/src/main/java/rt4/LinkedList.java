package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class LinkedList {

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!ab;")
	private Node aClass3_110;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!ab;")
	public final Node aClass3_109 = new Node();

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.aClass3_109.aClass3_223 = this.aClass3_109;
		this.aClass3_109.aClass3_222 = this.aClass3_109;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public final void clear() {
		while (true) {
			@Pc(5) Node local5 = this.aClass3_109.aClass3_222;
			if (local5 == this.aClass3_109) {
				this.aClass3_110 = null;
				return;
			}
			local5.unlink();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lclient!ab;")
	public final Node tail() {
		@Pc(7) Node local7 = this.aClass3_109.aClass3_223;
		if (this.aClass3_109 == local7) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local7.aClass3_223;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!ab;)V")
	public final void addTail(@OriginalArg(1) Node arg0) {
		if (arg0.aClass3_223 != null) {
			arg0.unlink();
		}
		arg0.aClass3_222 = this.aClass3_109;
		arg0.aClass3_223 = this.aClass3_109.aClass3_223;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!ab;)V")
	public final void addHead(@OriginalArg(1) Node arg0) {
		if (arg0.aClass3_223 != null) {
			arg0.unlink();
		}
		arg0.aClass3_222 = this.aClass3_109.aClass3_222;
		arg0.aClass3_223 = this.aClass3_109;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Lclient!ab;")
	public final Node prev() {
		@Pc(13) Node local13 = this.aClass3_110;
		if (this.aClass3_109 == local13) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local13.aClass3_223;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lclient!ab;")
	public final Node removeHead() {
		@Pc(3) Node local3 = this.aClass3_109.aClass3_222;
		if (this.aClass3_109 == local3) {
			return null;
		} else {
			local3.unlink();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)Lclient!ab;")
	public final Node next() {
		@Pc(12) Node local12 = this.aClass3_110;
		if (local12 == this.aClass3_109) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local12.aClass3_222;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)Lclient!ab;")
	public final Node head() {
		@Pc(3) Node local3 = this.aClass3_109.aClass3_222;
		if (this.aClass3_109 == local3) {
			this.aClass3_110 = null;
			return null;
		} else {
			this.aClass3_110 = local3.aClass3_222;
			return local3;
		}
	}
}
