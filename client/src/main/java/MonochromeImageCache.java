import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class MonochromeImageCache {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[B")
	public static final byte[] aByteArray53 = new byte[32896];

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	private int anInt4062 = -1;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	private int anInt4066 = 0;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!ih;")
	private LinkedList aClass69_96 = new LinkedList();

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	private final int anInt4067;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	private final int anInt4064;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[Lclient!lb;")
	private Class3_Sub23[] aClass3_Sub23Array1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			for (@Pc(15) int local15 = 0; local15 <= local10; local15++) {
				aByteArray53[local8++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local10 * local10 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	public MonochromeImageCache(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4067 = arg1;
		this.anInt4064 = arg0;
		this.aClass3_Sub23Array1 = new Class3_Sub23[this.anInt4067];
		this.anIntArrayArrayArray13 = new int[this.anInt4064][3][arg2];
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[[[I")
	public final int[][][] method3168() {
		if (this.anInt4067 != this.anInt4064) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt4064; local27++) {
			this.aClass3_Sub23Array1[local27] = Static13.aClass3_Sub23_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public final void method3169() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4064; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.aClass3_Sub23Array1 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass69_96.method2278();
		this.aClass69_96 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)[[I")
	public final int[][] method3173(@OriginalArg(1) int arg0) {
		if (this.anInt4064 == this.anInt4067) {
			this.aBoolean195 = this.aClass3_Sub23Array1[arg0] == null;
			this.aClass3_Sub23Array1[arg0] = Static13.aClass3_Sub23_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt4064 == 1) {
			this.aBoolean195 = this.anInt4062 != arg0;
			this.anInt4062 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(44) Class3_Sub23 local44 = this.aClass3_Sub23Array1[arg0];
			if (local44 == null) {
				this.aBoolean195 = true;
				if (this.anInt4066 < this.anInt4064) {
					local44 = new Class3_Sub23(arg0, this.anInt4066);
					this.anInt4066++;
				} else {
					@Pc(80) Class3_Sub23 local80 = (Class3_Sub23) this.aClass69_96.method2279();
					local44 = new Class3_Sub23(arg0, local80.anInt3468);
					this.aClass3_Sub23Array1[local80.anInt3476] = null;
					local80.method4658();
				}
				this.aClass3_Sub23Array1[arg0] = local44;
			} else {
				this.aBoolean195 = false;
			}
			this.aClass69_96.method2283(local44);
			return this.anIntArrayArrayArray13[local44.anInt3468];
		}
	}
}
