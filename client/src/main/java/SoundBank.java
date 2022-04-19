import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class SoundBank {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!sc;")
	private final HashTable aClass133_11 = new HashTable(256);

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!sc;")
	private final HashTable aClass133_12 = new HashTable(256);

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!ve;")
	private final Js5 aClass153_52;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!ve;")
	private final Js5 aClass153_53;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;)V")
	public SoundBank(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		this.aClass153_52 = arg0;
		this.aClass153_53 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIII)Lclient!kj;")
	private PcmSound method2737(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF3);
		@Pc(27) int local27 = local21 | arg1 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) PcmSound local37 = (PcmSound) this.aClass133_12.method3863(local30);
		if (local37 != null) {
			return local37;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(59) SynthSound local59 = Static292.method3988(this.aClass153_52, arg1, arg2);
			if (local59 == null) {
				return null;
			}
			local37 = local59.method3989();
			this.aClass133_12.method3862(local37, local30);
			if (arg0 != null) {
				arg0[0] -= local37.aByteArray47.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[I)Lclient!kj;")
	public final PcmSound method2738(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass153_52.method4483() == 1) {
			return this.method2737(arg1, 0, arg0);
		} else if (this.aClass153_52.method4504(arg0) == 1) {
			return this.method2737(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IIB)Lclient!kj;")
	private PcmSound method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF3);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) PcmSound local33 = (PcmSound) this.aClass133_12.method3863(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(53) VorbisSound local53 = (VorbisSound) this.aClass133_11.method3863(local26);
			if (local53 == null) {
				local53 = Static117.method2345(this.aClass153_53, arg0, arg2);
				if (local53 == null) {
					return null;
				}
				this.aClass133_11.method3862(local53, local26);
			}
			local33 = local53.method2341(arg1);
			if (local33 == null) {
				return null;
			} else {
				local53.method4658();
				this.aClass133_12.method3862(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II[I)Lclient!kj;")
	public final PcmSound method2741(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass153_53.method4483() == 1) {
			return this.method2740(0, arg1, arg0);
		} else if (this.aClass153_53.method4504(arg0) == 1) {
			return this.method2740(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
