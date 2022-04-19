import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class ColorImageCache {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	private int anInt4467 = 0;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	private int anInt4471 = -1;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ih;")
	private LinkedList aClass69_103 = new LinkedList();

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	private final int anInt4465;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lclient!qi;")
	private ColorImageCacheEntry[] aClass3_Sub28Array1;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	private final int anInt4475;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(III)V")
	public ColorImageCache(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4465 = arg1;
		this.aClass3_Sub28Array1 = new ColorImageCacheEntry[this.anInt4465];
		this.anInt4475 = arg0;
		this.anIntArrayArray34 = new int[this.anInt4475][arg2];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public final void method3442() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4475; local3++) {
			this.anIntArrayArray34[local3] = null;
		}
		this.anIntArrayArray34 = null;
		this.aClass3_Sub28Array1 = null;
		this.aClass69_103.method2278();
		this.aClass69_103 = null;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[I")
	public final int[] method3445(@OriginalArg(1) int arg0) {
		if (this.anInt4465 == this.anInt4475) {
			this.aBoolean221 = this.aClass3_Sub28Array1[arg0] == null;
			this.aClass3_Sub28Array1[arg0] = Static105.aClass3_Sub28_1;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt4475 == 1) {
			this.aBoolean221 = this.anInt4471 != arg0;
			this.anInt4471 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(29) ColorImageCacheEntry local29 = this.aClass3_Sub28Array1[arg0];
			if (local29 == null) {
				this.aBoolean221 = true;
				if (this.anInt4467 < this.anInt4475) {
					local29 = new ColorImageCacheEntry(arg0, this.anInt4467);
					this.anInt4467++;
				} else {
					@Pc(66) ColorImageCacheEntry local66 = (ColorImageCacheEntry) this.aClass69_103.method2279();
					local29 = new ColorImageCacheEntry(arg0, local66.anInt4761);
					this.aClass3_Sub28Array1[local66.anInt4759] = null;
					local66.method4658();
				}
				this.aClass3_Sub28Array1[arg0] = local29;
			} else {
				this.aBoolean221 = false;
			}
			this.aClass69_103.method2283(local29);
			return this.anIntArrayArray34[local29.anInt4761];
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)[[I")
	public final int[][] method3446() {
		if (this.anInt4475 != this.anInt4465) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt4475; local24++) {
			this.aClass3_Sub28Array1[local24] = Static105.aClass3_Sub28_1;
		}
		return this.anIntArrayArray34;
	}
}
