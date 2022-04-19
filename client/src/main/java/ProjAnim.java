import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class ProjAnim extends Entity {

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lclient!ga;")
	private ParticleSystem aClass47_Sub1_6;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
	private int anInt4818;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
	public int anInt4821;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	private int anInt4796 = 0;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	private int anInt4798 = -1;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
	private int anInt4820 = 0;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	private int anInt4814 = -32768;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public final int anInt4800;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	private final int anInt4804;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
	public final int anInt4819;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
	private final int anInt4816;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	public final int anInt4810;

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
	private final int anInt4825;

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
	private final int anInt4817;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	public final int anInt4805;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	private final int anInt4797;

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
	public final int anInt4822;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	private final int anInt4813;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lclient!tk;")
	private final SeqType aClass144_3;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public ProjAnim(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4800 = arg6;
		this.anInt4804 = arg2;
		this.anInt4819 = arg9;
		this.anInt4816 = arg0;
		this.anInt4810 = arg1;
		this.anInt4825 = arg7;
		this.anInt4817 = arg3;
		this.aBoolean239 = false;
		this.anInt4805 = arg10;
		this.anInt4797 = arg8;
		this.anInt4822 = arg5;
		this.anInt4813 = arg4;
		@Pc(58) int local58 = Static34.method877(this.anInt4816).anInt1754;
		if (local58 == -1) {
			this.aClass144_3 = null;
		} else {
			this.aClass144_3 = Static36.method941(local58);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lclient!ak;")
	private Model method3703() {
		@Pc(14) SpotAnimType local14 = Static34.method877(this.anInt4816);
		@Pc(24) Model local24 = local14.method1319(this.anInt4798, this.anInt4820, this.anInt4796);
		if (local24 == null) {
			return null;
		} else {
			local24.method4574(this.anInt4818);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(BI)V")
	public final void method3704(@OriginalArg(1) int arg0) {
		this.aDouble8 += this.aDouble2 * (double) arg0;
		this.aDouble3 += this.aDouble7 * (double) arg0;
		this.aBoolean239 = true;
		if (this.anInt4825 == -1) {
			this.aDouble6 += this.aDouble5 * (double) arg0;
		} else {
			this.aDouble6 += (double) arg0 * this.aDouble4 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble5;
			this.aDouble5 += this.aDouble4 * (double) arg0;
		}
		this.anInt4821 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt4818 = (int) (Math.atan2(this.aDouble5, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass144_3 == null) {
			return;
		}
		this.anInt4796 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4796 <= this.aClass144_3.anIntArray474[this.anInt4820]) {
						return;
					}
					this.anInt4796 -= this.aClass144_3.anIntArray474[this.anInt4820];
					this.anInt4820++;
					if (this.anInt4820 >= this.aClass144_3.anIntArray473.length) {
						this.anInt4820 -= this.aClass144_3.anInt5362;
						if (this.anInt4820 < 0 || this.aClass144_3.anIntArray473.length <= this.anInt4820) {
							this.anInt4820 = 0;
						}
					}
					this.anInt4798 = this.anInt4820 + 1;
				} while (this.aClass144_3.anIntArray473.length > this.anInt4798);
				this.anInt4798 -= this.aClass144_3.anInt5362;
			} while (this.anInt4798 >= 0 && this.anInt4798 < this.aClass144_3.anIntArray473.length);
			this.anInt4798 = -1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIII)V")
	public final void method3705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) double local17;
		if (!this.aBoolean239) {
			@Pc(10) double local10 = (double) (arg0 - this.anInt4817);
			local17 = arg3 - this.anInt4804;
			@Pc(26) double local26 = Math.sqrt(local17 * local17 + local10 * local10);
			this.aDouble6 = this.anInt4813;
			this.aDouble3 = local10 * (double) this.anInt4797 / local26 + (double) this.anInt4817;
			this.aDouble8 = (double) this.anInt4797 * local17 / local26 + (double) this.anInt4804;
		}
		local17 = this.anInt4800 + 1 - arg1;
		this.aDouble7 = ((double) arg0 - this.aDouble3) / local17;
		this.aDouble2 = ((double) arg3 - this.aDouble8) / local17;
		this.aDouble9 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble2 * this.aDouble2);
		if (this.anInt4825 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble6) / local17;
		} else {
			if (!this.aBoolean239) {
				this.aDouble5 = -this.aDouble9 * Math.tan((double) this.anInt4825 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - this.aDouble6 - this.aDouble5 * local17) * 2.0D / (local17 * local17);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		@Pc(3) Model local3 = this.method3703();
		if (local3 != null) {
			local3.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_6);
			this.anInt4814 = local3.method4549();
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		return this.anInt4814;
	}
}
