import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Map extends SecondaryNode {

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
	public int anInt758 = 0;

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
	public int anInt759 = -1;

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
	public int anInt763 = 12800;

	@OriginalMember(owner = "client!bn", name = "Z", descriptor = "I")
	public int anInt770 = 0;

	@OriginalMember(owner = "client!bn", name = "cb", descriptor = "I")
	public int anInt771 = 12800;

	@OriginalMember(owner = "client!bn", name = "P", descriptor = "Z")
	public boolean aBoolean50 = true;

	@OriginalMember(owner = "client!bn", name = "db", descriptor = "I")
	public int anInt772 = -1;

	@OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
	public final int anInt764;

	@OriginalMember(owner = "client!bn", name = "bb", descriptor = "Lclient!na;")
	public final JagString aClass100_138;

	@OriginalMember(owner = "client!bn", name = "Q", descriptor = "Lclient!na;")
	public final JagString aClass100_137;

	@OriginalMember(owner = "client!bn", name = "Y", descriptor = "I")
	public final int anInt769;

	@OriginalMember(owner = "client!bn", name = "ab", descriptor = "Lclient!ih;")
	public final LinkedList aClass69_23;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!na;Lclient!na;IIIZI)V")
	public Map(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt764 = arg3;
		this.anInt759 = arg4;
		this.aBoolean50 = arg5;
		this.aClass100_138 = arg0;
		this.aClass100_137 = arg1;
		this.anInt772 = arg6;
		this.anInt769 = arg2;
		if (this.anInt772 == 255) {
			this.anInt772 = 0;
		}
		this.aClass69_23 = new LinkedList();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)Z")
	public final boolean method664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt763 > arg1 || arg1 > this.anInt770 || arg0 < this.anInt771 || arg0 > this.anInt758) {
			return false;
		}
		for (@Pc(33) Class3_Sub24 local33 = (Class3_Sub24) this.aClass69_23.method2289(); local33 != null; local33 = (Class3_Sub24) this.aClass69_23.method2288()) {
			if (local33.method2760(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
	public final void method665() {
		this.anInt771 = 12800;
		this.anInt770 = 0;
		this.anInt758 = 0;
		this.anInt763 = 12800;
		for (@Pc(29) Class3_Sub24 local29 = (Class3_Sub24) this.aClass69_23.method2289(); local29 != null; local29 = (Class3_Sub24) this.aClass69_23.method2288()) {
			if (local29.anInt3522 < this.anInt771) {
				this.anInt771 = local29.anInt3522;
			}
			if (local29.anInt3520 < this.anInt763) {
				this.anInt763 = local29.anInt3520;
			}
			if (local29.anInt3523 > this.anInt770) {
				this.anInt770 = local29.anInt3523;
			}
			if (this.anInt758 < local29.anInt3524) {
				this.anInt758 = local29.anInt3524;
			}
		}
	}
}
