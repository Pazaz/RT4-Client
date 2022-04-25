package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class HashTable {

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!ab;")
	private Node aClass3_192;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Lclient!ab;")
	private Node aClass3_193;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	private int anInt5037 = 0;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lclient!ab;")
	public final Node[] aClass3Array1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public final int anInt5023;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public HashTable(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Node[arg0];
		this.anInt5023 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(25) Node local25 = this.aClass3Array1[local13] = new Node();
			local25.aClass3_223 = local25;
			local25.aClass3_222 = local25;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public final void clear() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt5023; local5++) {
			@Pc(14) Node local14 = this.aClass3Array1[local5];
			while (true) {
				@Pc(17) Node local17 = local14.aClass3_222;
				if (local14 == local17) {
					break;
				}
				local17.unlink();
			}
		}
		this.aClass3_193 = null;
		this.aClass3_192 = null;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lclient!ab;")
	public final Node head() {
		this.anInt5037 = 0;
		return this.next();
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Lclient!ab;")
	public final Node next() {
		@Pc(24) Node local24;
		if (this.anInt5037 > 0 && this.aClass3_193 != this.aClass3Array1[this.anInt5037 - 1]) {
			local24 = this.aClass3_193;
			this.aClass3_193 = local24.aClass3_222;
			return local24;
		}
		do {
			if (this.anInt5037 >= this.anInt5023) {
				return null;
			}
			local24 = this.aClass3Array1[this.anInt5037++].aClass3_222;
		} while (this.aClass3Array1[this.anInt5037 - 1] == local24);
		this.aClass3_193 = local24.aClass3_222;
		return local24;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ab;J)V")
	public final void put(@OriginalArg(1) Node arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_223 != null) {
			arg0.unlink();
		}
		@Pc(21) Node local21 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt5023 - 1))];
		arg0.aClass3_222 = local21;
		arg0.key = arg1;
		arg0.aClass3_223 = local21.aClass3_223;
		arg0.aClass3_223.aClass3_222 = arg0;
		arg0.aClass3_222.aClass3_223 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)Lclient!ab;")
	public final Node get(@OriginalArg(0) long arg0) {
		this.aLong168 = arg0;
		@Pc(24) Node local24 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt5023 - 1))];
		for (this.aClass3_192 = local24.aClass3_222; this.aClass3_192 != local24; this.aClass3_192 = this.aClass3_192.aClass3_222) {
			if (arg0 == this.aClass3_192.key) {
				@Pc(46) Node local46 = this.aClass3_192;
				this.aClass3_192 = this.aClass3_192.aClass3_222;
				return local46;
			}
		}
		this.aClass3_192 = null;
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
	public final int size() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5023; local17++) {
			@Pc(26) Node local26 = this.aClass3Array1[local17];
			@Pc(29) Node local29 = local26.aClass3_222;
			while (local29 != local26) {
				local29 = local29.aClass3_222;
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lclient!ab;I)I")
	public final int method3865(@OriginalArg(0) Node[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5023; local15++) {
			@Pc(24) Node local24 = this.aClass3Array1[local15];
			for (@Pc(27) Node local27 = local24.aClass3_222; local27 != local24; local27 = local27.aClass3_222) {
				arg0[local13++] = local27;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Lclient!ab;")
	public final Node nextWithKey() {
		if (this.aClass3_192 == null) {
			return null;
		}
		@Pc(23) Node local23 = this.aClass3Array1[(int) (this.aLong168 & (long) (this.anInt5023 - 1))];
		while (local23 != this.aClass3_192) {
			if (this.aClass3_192.key == this.aLong168) {
				@Pc(45) Node local45 = this.aClass3_192;
				this.aClass3_192 = this.aClass3_192.aClass3_222;
				return local45;
			}
			this.aClass3_192 = this.aClass3_192.aClass3_222;
		}
		this.aClass3_192 = null;
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)I")
	public final int getBucketCount() {
		return this.anInt5023;
	}
}
