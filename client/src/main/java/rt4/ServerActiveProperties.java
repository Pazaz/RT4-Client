package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class ServerActiveProperties extends Node {

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public final int targetParam;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public final int events;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
	public ServerActiveProperties(@OriginalArg(0) int events, @OriginalArg(1) int targetParam) {
		this.targetParam = targetParam;
		this.events = events;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	public static int getTargetMask(@OriginalArg(1) int events) {
		return events >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
	public final boolean isButtonEnabled(@OriginalArg(0) int button) {
		return (this.events >> button + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z")
	public final boolean isObjReplaceEnabled() {
		return (this.events >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)I")
	public final int getDragDepth() {
		return this.events >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)Z")
	public final boolean isResumePauseButtonEnabled() {
		return (this.events & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Z")
	public final boolean isObjUseEnabled() {
		return (this.events >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Z")
	public final boolean isUseTarget() {
		return (this.events >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Z")
	public final boolean isDragTarget() {
		return (this.events >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)Z")
	public final boolean isObjOpsEnabled() {
		return (this.events >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Z")
	public final boolean isObjSwapEnabled() {
		return (this.events >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)I")
	public final int getTargetMask() {
		return getTargetMask(this.events);
	}
}
