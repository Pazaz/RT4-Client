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
	public AnimFrameset(@OriginalArg(0) Js5 animsArchive, @OriginalArg(1) Js5 basesArchive, @OriginalArg(2) int id, @OriginalArg(3) boolean arg3) {
		@Pc(5) LinkedList bases = new LinkedList();
		@Pc(10) int capacity = animsArchive.getGroupCapacity(id);
		this.frames = new AnimFrame[capacity];
		@Pc(19) int[] fileIds = animsArchive.getFileIds(id);
		for (@Pc(21) int i = 0; i < fileIds.length; i++) {
			@Pc(37) byte[] bytes = animsArchive.fetchFile(id, fileIds[i]);
			@Pc(51) int baseId = bytes[1] & 0xFF | (bytes[0] & 0xFF) << 8;
			@Pc(56) AnimBase b = (AnimBase) bases.head();
			@Pc(58) AnimBase base = null;
			while (b != null) {
				if (b.id == baseId) {
					base = b;
					break;
				}
				b = (AnimBase) bases.next();
			}
			if (base == null) {
				@Pc(85) byte[] baseBytes = basesArchive.fetchFileNoDiscard(0, baseId);
				base = new AnimBase(baseId, baseBytes);
				bases.addTail(base);
			}
			this.frames[fileIds[i]] = new AnimFrame(bytes, base);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ve;ZLclient!ve;BI)Lclient!cl;")
	public static AnimFrameset create(@OriginalArg(0) Js5 animsArchive, @OriginalArg(2) Js5 basesArchive, @OriginalArg(4) int id) {
		@Pc(5) boolean ready = true;
		@Pc(16) int[] fileIds = animsArchive.getFileIds(id);
		for (@Pc(18) int i = 0; i < fileIds.length; i++) {
			@Pc(30) byte[] bytes = animsArchive.fetchFileNoDiscard(fileIds[i], id);
			if (bytes == null) {
				ready = false;
			} else {
				@Pc(49) int baseId = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
				@Pc(57) byte[] baseBytes = basesArchive.fetchFileNoDiscard(0, baseId);
				if (baseBytes == null) {
					ready = false;
				}
			}
		}
		if (!ready) {
			return null;
		}
		try {
			return new AnimFrameset(animsArchive, basesArchive, id, false);
		} catch (@Pc(84) Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)Z")
	public final boolean isAlphaTransformed(@OriginalArg(1) int frame) {
		return this.frames[frame].transformsAlpha;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Z")
	public final boolean isColorTransformed(@OriginalArg(0) int frame) {
		return this.frames[frame].transformsColor;
	}
}
