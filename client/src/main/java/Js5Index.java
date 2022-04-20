import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Js5Index {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
	public int[] anIntArray268;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!jg;")
	public IntHashTable aClass76_1;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[I")
	public int[] anIntArray272;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "[I")
	public int[] anIntArray273;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public int anInt2908;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[Lclient!jg;")
	public IntHashTable[] aClass76Array1;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public final int anInt2911;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([BI)V")
	public Js5Index(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2911 = Static71.method1442(arg0, arg0.length);
		if (arg1 != this.anInt2911) {
			throw new RuntimeException();
		}
		this.method2293(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)V")
	private void method2293(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Buffer local12 = new Buffer(Static162.method3092(arg0));
		@Pc(16) int local16 = local12.g1();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt2908 = local12.g4();
		} else {
			this.anInt2908 = 0;
		}
		@Pc(48) int local48 = local12.g1();
		@Pc(50) int local50 = 0;
		this.anInt2902 = local12.g2();
		@Pc(59) int local59 = -1;
		this.anIntArray269 = new int[this.anInt2902];
		@Pc(66) int local66;
		for (local66 = 0; local66 < this.anInt2902; local66++) {
			this.anIntArray269[local66] = local50 += local12.g2();
			if (this.anIntArray269[local66] > local59) {
				local59 = this.anIntArray269[local66];
			}
		}
		this.anInt2907 = local59 + 1;
		this.anIntArray273 = new int[this.anInt2907];
		this.anIntArrayArray22 = new int[this.anInt2907][];
		this.anIntArray268 = new int[this.anInt2907];
		this.anIntArray270 = new int[this.anInt2907];
		this.anIntArray272 = new int[this.anInt2907];
		if (local48 != 0) {
			this.anIntArray271 = new int[this.anInt2907];
			for (local66 = 0; local66 < this.anInt2907; local66++) {
				this.anIntArray271[local66] = -1;
			}
			for (local66 = 0; local66 < this.anInt2902; local66++) {
				this.anIntArray271[this.anIntArray269[local66]] = local12.g4();
			}
			this.aClass76_1 = new IntHashTable(this.anIntArray271);
		}
		for (local66 = 0; local66 < this.anInt2902; local66++) {
			this.anIntArray268[this.anIntArray269[local66]] = local12.g4();
		}
		for (local66 = 0; local66 < this.anInt2902; local66++) {
			this.anIntArray273[this.anIntArray269[local66]] = local12.g4();
		}
		for (local66 = 0; local66 < this.anInt2902; local66++) {
			this.anIntArray272[this.anIntArray269[local66]] = local12.g2();
		}
		@Pc(273) int local273;
		@Pc(278) int local278;
		@Pc(280) int local280;
		@Pc(288) int local288;
		for (local66 = 0; local66 < this.anInt2902; local66++) {
			local50 = 0;
			local273 = this.anIntArray269[local66];
			local278 = this.anIntArray272[local273];
			local280 = -1;
			this.anIntArrayArray22[local273] = new int[local278];
			for (local288 = 0; local288 < local278; local288++) {
				@Pc(306) int local306 = this.anIntArrayArray22[local273][local288] = local50 += local12.g2();
				if (local306 > local280) {
					local280 = local306;
				}
			}
			this.anIntArray270[local273] = local280 + 1;
			if (local280 + 1 == local278) {
				this.anIntArrayArray22[local273] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.aClass76Array1 = new IntHashTable[local59 + 1];
		this.anIntArrayArray21 = new int[local59 + 1][];
		for (local66 = 0; local66 < this.anInt2902; local66++) {
			local273 = this.anIntArray269[local66];
			local278 = this.anIntArray272[local273];
			this.anIntArrayArray21[local273] = new int[this.anIntArray270[local273]];
			for (local280 = 0; local280 < this.anIntArray270[local273]; local280++) {
				this.anIntArrayArray21[local273][local280] = -1;
			}
			for (local280 = 0; local280 < local278; local280++) {
				if (this.anIntArrayArray22[local273] == null) {
					local288 = local280;
				} else {
					local288 = this.anIntArrayArray22[local273][local280];
				}
				this.anIntArrayArray21[local273][local288] = local12.g4();
			}
			this.aClass76Array1[local273] = new IntHashTable(this.anIntArrayArray21[local273]);
		}
	}
}
