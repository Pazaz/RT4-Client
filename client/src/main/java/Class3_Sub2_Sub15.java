import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
	public int anInt3950;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
	public int anInt3957;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "Lclient!sc;")
	public Class133 aClass133_16;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "Lclient!sc;")
	private Class133 aClass133_17;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
	private int anInt3960;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "Lclient!na;")
	private Class100 aClass100_766 = Static87.aClass100_494;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!wa;B)V")
	private void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.anInt3957 = arg1.method2229();
		} else if (arg0 == 2) {
			this.anInt3950 = arg1.method2229();
		} else if (arg0 == 3) {
			this.aClass100_766 = arg1.method2202();
		} else if (arg0 == 4) {
			this.anInt3960 = arg1.method2174();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(41) int local41 = arg1.method2163();
			this.aClass133_16 = new Class133(Static165.method3164(local41));
			for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
				@Pc(58) int local58 = arg1.method2174();
				@Pc(70) Node local70;
				if (arg0 == 5) {
					local70 = new Class3_Sub30(arg1.method2202());
				} else {
					local70 = new Class3_Sub21(arg1.method2174());
				}
				this.aClass133_16.method3862(local70, (long) local58);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)Lclient!na;")
	public final Class100 method3085(@OriginalArg(0) int arg0) {
		if (this.aClass133_16 == null) {
			return this.aClass100_766;
		} else {
			@Pc(26) Class3_Sub30 local26 = (Class3_Sub30) this.aClass133_16.method3863((long) arg0);
			return local26 == null ? this.aClass100_766 : local26.aClass100_980;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Lclient!na;I)Z")
	public final boolean method3086(@OriginalArg(0) Class100 arg0) {
		if (this.aClass133_16 == null) {
			return false;
		}
		if (this.aClass133_17 == null) {
			this.method3087();
		}
		for (@Pc(38) Class3_Sub13 local38 = (Class3_Sub13) this.aClass133_17.method3863(arg0.method3118()); local38 != null; local38 = (Class3_Sub13) this.aClass133_17.method3867()) {
			if (local38.aClass100_503.method3108(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	private void method3087() {
		this.aClass133_17 = new Class133(this.aClass133_16.method3868());
		for (@Pc(22) Class3_Sub30 local22 = (Class3_Sub30) this.aClass133_16.method3859(); local22 != null; local22 = (Class3_Sub30) this.aClass133_16.method3861()) {
			@Pc(36) Class3_Sub13 local36 = new Class3_Sub13(local22.aClass100_980, (int) local22.aLong192);
			this.aClass133_17.method3862(local36, local22.aClass100_980.method3118());
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)I")
	public final int method3089(@OriginalArg(1) int arg0) {
		if (this.aClass133_16 == null) {
			return this.anInt3960;
		} else {
			@Pc(18) Class3_Sub21 local18 = (Class3_Sub21) this.aClass133_16.method3863((long) arg0);
			return local18 == null ? this.anInt3960 : local18.anInt3141;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(II)Z")
	public final boolean method3090(@OriginalArg(1) int arg0) {
		if (this.aClass133_16 == null) {
			return false;
		}
		if (this.aClass133_17 == null) {
			this.method3091();
		}
		@Pc(34) Class3_Sub21 local34 = (Class3_Sub21) this.aClass133_17.method3863((long) arg0);
		return local34 != null;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	private void method3091() {
		this.aClass133_17 = new Class133(this.aClass133_16.method3868());
		for (@Pc(24) Class3_Sub21 local24 = (Class3_Sub21) this.aClass133_16.method3859(); local24 != null; local24 = (Class3_Sub21) this.aClass133_16.method3861()) {
			@Pc(34) Class3_Sub21 local34 = new Class3_Sub21((int) local24.aLong192);
			this.aClass133_17.method3862(local34, (long) local24.anInt3141);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void method3094(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2229();
			if (local9 == 0) {
				return;
			}
			this.method3084(local9, arg0);
		}
	}
}
