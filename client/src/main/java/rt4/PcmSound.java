package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class PcmSound extends Sound {

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
	public boolean aBoolean165;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public int rate;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[B")
	public byte[] samples;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	public int start;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public int end;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I[BII)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.rate = arg0;
		this.samples = arg1;
		this.start = arg2;
		this.end = arg3;
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I[BIIZ)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.rate = arg0;
		this.samples = arg1;
		this.start = arg2;
		this.end = arg3;
		this.aBoolean165 = arg4;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vj;)Lclient!kj;")
	public final PcmSound resample(@OriginalArg(0) PcmResampler arg0) {
		this.samples = arg0.method4520(this.samples);
		this.rate = arg0.scaleRate(this.rate);
		if (this.start == this.end) {
			this.start = this.end = arg0.scalePosition(this.start);
		} else {
			this.start = arg0.scalePosition(this.start);
			this.end = arg0.scalePosition(this.end);
			if (this.start == this.end) {
				this.start--;
			}
		}
		return this;
	}
}
