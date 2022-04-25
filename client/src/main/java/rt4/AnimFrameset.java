package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class AnimFrameset extends SecondaryNode {

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "[Lclient!ne;")
	public final AnimFrame[] frames;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;IZ)V")
	public AnimFrameset(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) LinkedList local5 = new LinkedList();
		@Pc(10) int local10 = arg0.getGroupCapacity(arg2);
		this.frames = new AnimFrame[local10];
		@Pc(19) int[] local19 = arg0.getFileIds(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(37) byte[] local37 = arg0.getFile(arg2, local19[local21]);
			@Pc(51) int local51 = local37[1] & 0xFF | (local37[0] & 0xFF) << 8;
			@Pc(56) AnimBase local56 = (AnimBase) local5.method2289();
			@Pc(58) AnimBase local58 = null;
			while (local56 != null) {
				if (local56.id == local51) {
					local58 = local56;
					break;
				}
				local56 = (AnimBase) local5.method2288();
			}
			if (local58 == null) {
				@Pc(85) byte[] local85 = arg1.method4502(0, local51);
				local58 = new AnimBase(local51, local85);
				local5.addTail(local58);
			}
			this.frames[local19[local21]] = new AnimFrame(local37, local58);
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)Z")
	public final boolean isAlphaTransformed(@OriginalArg(1) int arg0) {
		return this.frames[arg0].transformsAlpha;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Z")
	public final boolean isColorTransformed(@OriginalArg(0) int arg0) {
		return this.frames[arg0].transformsColor;
	}
}
