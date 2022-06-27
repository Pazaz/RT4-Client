package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class MonochromeImageCacheEntry extends Node {

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public final int row;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public final int index;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
	public MonochromeImageCacheEntry(@OriginalArg(0) int index, @OriginalArg(1) int row) {
		this.row = row;
		this.index = index;
	}
}
