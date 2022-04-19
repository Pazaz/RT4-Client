import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class PcmSound extends Sound {

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
	public boolean aBoolean165;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public int anInt3314;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I[BII)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3316 = arg0;
		this.aByteArray47 = arg1;
		this.anInt3315 = arg2;
		this.anInt3314 = arg3;
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I[BIIZ)V")
	public PcmSound(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3316 = arg0;
		this.aByteArray47 = arg1;
		this.anInt3315 = arg2;
		this.anInt3314 = arg3;
		this.aBoolean165 = arg4;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!vj;)Lclient!kj;")
	public final PcmSound method2648(@OriginalArg(0) Resampler arg0) {
		this.aByteArray47 = arg0.method4520(this.aByteArray47);
		this.anInt3316 = arg0.method4524(this.anInt3316);
		if (this.anInt3315 == this.anInt3314) {
			this.anInt3315 = this.anInt3314 = arg0.method4525(this.anInt3315);
		} else {
			this.anInt3315 = arg0.method4525(this.anInt3315);
			this.anInt3314 = arg0.method4525(this.anInt3314);
			if (this.anInt3315 == this.anInt3314) {
				this.anInt3315--;
			}
		}
		return this;
	}
}
