import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class AreaSound extends Node {

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt2028;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt2032;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Lclient!b;")
	public SoundPcmStream aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
	public int anInt2033;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Lclient!b;")
	public SoundPcmStream aClass3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "Lclient!pb;")
	public LocType aClass118_1;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Lclient!km;")
	public Npc aClass8_Sub4_Sub2_1;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	public int anInt2040;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
	public int anInt2041;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "Lclient!e;")
	public Player aClass8_Sub4_Sub1_1;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public int anInt2042;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
	public int anInt2044;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	public int anInt2038 = 0;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public final void method1567() {
		@Pc(8) int local8 = this.anInt2044;
		if (this.aClass118_1 != null) {
			@Pc(17) LocType local17 = this.aClass118_1.method3417();
			if (local17 == null) {
				this.anInt2044 = -1;
				this.anIntArray181 = null;
				this.anInt2040 = 0;
				this.anInt2042 = 0;
				this.anInt2032 = 0;
			} else {
				this.anInt2040 = local17.anInt4414;
				this.anInt2044 = local17.anInt4412;
				this.anInt2032 = local17.anInt4419;
				this.anInt2042 = local17.anInt4402 * 128;
				this.anIntArray181 = local17.anIntArray381;
			}
		} else if (this.aClass8_Sub4_Sub2_1 != null) {
			@Pc(92) int local92 = Static112.method2299(this.aClass8_Sub4_Sub2_1);
			if (local8 != local92) {
				@Pc(100) NpcType local100 = this.aClass8_Sub4_Sub2_1.aClass96_1;
				this.anInt2044 = local92;
				if (local100.anIntArray357 != null) {
					local100 = local100.method2932();
				}
				if (local100 == null) {
					this.anInt2042 = 0;
				} else {
					this.anInt2042 = local100.anInt3746 * 128;
				}
			}
		} else if (this.aClass8_Sub4_Sub1_1 != null) {
			this.anInt2044 = Static140.method2706(this.aClass8_Sub4_Sub1_1);
			this.anInt2042 = this.aClass8_Sub4_Sub1_1.anInt1664 * 128;
		}
		if (this.anInt2044 != local8 && this.aClass3_Sub3_Sub1_1 != null) {
			Static204.aClass3_Sub3_Sub2_1.method1347(this.aClass3_Sub3_Sub1_1);
			this.aClass3_Sub3_Sub1_1 = null;
		}
	}
}
