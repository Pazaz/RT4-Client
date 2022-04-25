package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class HashTableIterator {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!ab;")
	private Node aClass3_135;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	private int anInt3447 = 0;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!sc;")
	private final HashTable aClass133_10;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sc;)V")
	public HashTableIterator(@OriginalArg(0) HashTable arg0) {
		this.aClass133_10 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lclient!ab;")
	public final Node method2700() {
		@Pc(30) Node local30;
		if (this.anInt3447 > 0 && this.aClass133_10.aClass3Array1[this.anInt3447 - 1] != this.aClass3_135) {
			local30 = this.aClass3_135;
			this.aClass3_135 = local30.aClass3_222;
			return local30;
		}
		do {
			if (this.aClass133_10.anInt5023 <= this.anInt3447) {
				return null;
			}
			local30 = this.aClass133_10.aClass3Array1[this.anInt3447++].aClass3_222;
		} while (local30 == this.aClass133_10.aClass3Array1[this.anInt3447 - 1]);
		this.aClass3_135 = local30.aClass3_222;
		return local30;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lclient!ab;")
	public final Node method2701() {
		this.anInt3447 = 0;
		return this.method2700();
	}
}
