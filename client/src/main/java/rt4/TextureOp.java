package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "[I")
	public static int[] COSINE;
	@OriginalMember(owner = "client!je", name = "eb", descriptor = "[I")
	public static int[] SINE;
	@OriginalMember(owner = "client!j", name = "t", descriptor = "Lclient!nd;")
	protected MonochromeImageCache colorImageCache;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public int anInt5840;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!pf;")
	protected ColorImageCache monochromeImageCache;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "[Lclient!j;")
	public final TextureOp[] aClass3_Sub1Array42;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
	public boolean monochrome;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array42 = new TextureOp[arg0];
		this.monochrome = arg1;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public static void createTrigonometryTables() {
		if (SINE != null && COSINE != null) {
			return;
		}
		SINE = new int[256];
		COSINE = new int[256];
		for (@Pc(26) int i = 0; i < 256; i++) {
			@Pc(36) double radians = (double) i / 255.0D * 6.283185307179586D;
			SINE[i] = (int) (Math.sin(radians) * 4096.0D);
			COSINE[i] = (int) (Math.cos(radians) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)[I")
	protected final int[] getChildMonochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub1Array42[arg0].monochrome ? this.aClass3_Sub1Array42[arg0].getMonochromeOutput(arg1) : this.aClass3_Sub1Array42[arg0].getColorOutput(arg1)[0];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[I")
	public int[] getMonochromeOutput(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)I")
	public int method4627() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!wa;Z)V")
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public void postDecode() {
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)I")
	public int method4631() {
		return -1;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
	public final void method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt5840 == 255 ? arg0 : this.anInt5840;
		if (this.monochrome) {
			this.monochromeImageCache = new ColorImageCache(local15, arg0, arg1);
		} else {
			this.colorImageCache = new MonochromeImageCache(local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
	public void clearImageCache() {
		if (this.monochrome) {
			this.monochromeImageCache.clear();
			this.monochromeImageCache = null;
		} else {
			this.colorImageCache.clear();
			this.colorImageCache = null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] getChildColorOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array42[arg1].monochrome) {
			@Pc(32) int[] local32 = this.aClass3_Sub1Array42[arg1].getMonochromeOutput(arg0);
			return new int[][]{local32, local32, local32};
		} else {
			return this.aClass3_Sub1Array42[arg1].getColorOutput(arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[[I")
	public int[][] getColorOutput(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
