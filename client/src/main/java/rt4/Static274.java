package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public static int anInt4997;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static int anInt4999;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!be;")
	public static Component staticActiveComponent1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[Lclient!gb;")
	public static final RawModel[] tempModels = new RawModel[4];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
	public static int method3845(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
