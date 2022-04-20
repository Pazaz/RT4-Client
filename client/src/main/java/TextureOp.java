import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Lclient!nd;")
	protected MonochromeImageCache aClass103_41;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public int anInt5840;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!pf;")
	protected ColorImageCache aClass121_41;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "[Lclient!j;")
	public final TextureOp[] aClass3_Sub1Array42;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array42 = new TextureOp[arg0];
		this.aBoolean309 = arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)[I")
	protected final int[] method4624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub1Array42[arg0].aBoolean309 ? this.aClass3_Sub1Array42[arg0].method4626(arg1) : this.aClass3_Sub1Array42[arg0].method4638(arg1)[0];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[I")
	public int[] method4626(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)I")
	public int method4627() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!wa;Z)V")
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public void method4630() {
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)I")
	public int method4631() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
	public final void method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt5840 == 255 ? arg0 : this.anInt5840;
		if (this.aBoolean309) {
			this.aClass121_41 = new ColorImageCache(local15, arg0, arg1);
		} else {
			this.aClass103_41 = new MonochromeImageCache(local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
	public void method4633() {
		if (this.aBoolean309) {
			this.aClass121_41.method3442();
			this.aClass121_41 = null;
		} else {
			this.aClass103_41.method3169();
			this.aClass103_41 = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array42[arg1].aBoolean309) {
			@Pc(32) int[] local32 = this.aClass3_Sub1Array42[arg1].method4626(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass3_Sub1Array42[arg1].method4638(arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[[I")
	public int[][] method4638(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
