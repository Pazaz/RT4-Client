import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class MidiNoteStream extends PcmStream {

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Lclient!ih;")
	public final LinkedList aClass69_126 = new LinkedList();

	@OriginalMember(owner = "client!te", name = "K", descriptor = "Lclient!ei;")
	public final MixerPcmStream aClass3_Sub3_Sub2_2 = new MixerPcmStream();

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!va;")
	private final MidiPcmStream aClass3_Sub3_Sub4_3;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!va;)V")
	public MidiNoteStream(@OriginalArg(0) MidiPcmStream arg0) {
		this.aClass3_Sub3_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream method4409() {
		@Pc(9) MidiNote local9;
		do {
			local9 = (MidiNote) this.aClass69_126.method2288();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub3_Sub1_3 == null);
		return local9.aClass3_Sub3_Sub1_3;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream method4406() {
		@Pc(9) MidiNote local9 = (MidiNote) this.aClass69_126.method2289();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub3_Sub1_3 == null) {
			return this.method4409();
		} else {
			return local9.aClass3_Sub3_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!mf;II)V")
	private void method4141(@OriginalArg(0) MidiNote arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub3_Sub4_3.anIntArray508[arg0.anInt3773] & 0x4) != 0 && arg0.anInt3767 < 0) {
			@Pc(27) int local27 = this.aClass3_Sub3_Sub4_3.anIntArray503[arg0.anInt3773] / Static44.anInt1404;
			@Pc(37) int local37 = (local27 + 1048575 - arg0.anInt3775) / local27;
			arg0.anInt3775 = local27 * arg1 + arg0.anInt3775 & 0xFFFFF;
			if (arg1 >= local37) {
				if (this.aClass3_Sub3_Sub4_3.anIntArray509[arg0.anInt3773] == 0) {
					arg0.aClass3_Sub3_Sub1_3 = Static284.method399(arg0.aClass3_Sub16_Sub1_1, arg0.aClass3_Sub3_Sub1_3.method405(), arg0.aClass3_Sub3_Sub1_3.method392(), arg0.aClass3_Sub3_Sub1_3.method418());
				} else {
					arg0.aClass3_Sub3_Sub1_3 = Static284.method399(arg0.aClass3_Sub16_Sub1_1, arg0.aClass3_Sub3_Sub1_3.method405(), 0, arg0.aClass3_Sub3_Sub1_3.method418());
					this.aClass3_Sub3_Sub4_3.method4442(arg0, arg0.aClass3_Sub18_1.aShortArray36[arg0.anInt3779] < 0);
				}
				if (arg0.aClass3_Sub18_1.aShortArray36[arg0.anInt3779] < 0) {
					arg0.aClass3_Sub3_Sub1_3.method396(-1);
				}
				arg1 = arg0.anInt3775 / local27;
			}
		}
		arg0.aClass3_Sub3_Sub1_3.method4410(arg1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
	@Override
	public final int method4404() {
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	@Override
	public final void method4410(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3_Sub2_2.method4410(arg0);
		for (@Pc(15) MidiNote local15 = (MidiNote) this.aClass69_126.method2289(); local15 != null; local15 = (MidiNote) this.aClass69_126.method2288()) {
			if (!this.aClass3_Sub3_Sub4_3.method4445(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local27 <= local15.anInt3771) {
						this.method4141(local15, local27);
						local15.anInt3771 -= local27;
						break;
					}
					this.method4141(local15, local15.anInt3771);
					local27 -= local15.anInt3771;
				} while (!this.aClass3_Sub3_Sub4_3.method4433(local27, 0, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "([III)V")
	@Override
	public final void method4408(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub3_Sub2_2.method4408(arg0, arg1, arg2);
		for (@Pc(17) MidiNote local17 = (MidiNote) this.aClass69_126.method2289(); local17 != null; local17 = (MidiNote) this.aClass69_126.method2288()) {
			if (!this.aClass3_Sub3_Sub4_3.method4445(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local29 <= local17.anInt3771) {
						this.method4146(arg0, local17, local31, local29, local31 + local29);
						local17.anInt3771 -= local29;
						break;
					}
					this.method4146(arg0, local17, local31, local17.anInt3771, local29 + local31);
					local29 -= local17.anInt3771;
					local31 += local17.anInt3771;
				} while (!this.aClass3_Sub3_Sub4_3.method4433(local29, local31, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([ILclient!mf;IIIB)V")
	private void method4146(@OriginalArg(0) int[] arg0, @OriginalArg(1) MidiNote arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass3_Sub3_Sub4_3.anIntArray508[arg1.anInt3773] & 0x4) != 0 && arg1.anInt3767 < 0) {
			@Pc(26) int local26 = this.aClass3_Sub3_Sub4_3.anIntArray503[arg1.anInt3773] / Static44.anInt1404;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt3775) / local26;
				if (arg3 < local36) {
					arg1.anInt3775 += arg3 * local26;
					break;
				}
				arg3 -= local36;
				arg1.aClass3_Sub3_Sub1_3.method4408(arg0, arg2, local36);
				@Pc(55) int local55 = Static44.anInt1404 / 100;
				@Pc(58) SoundPcmStream local58 = arg1.aClass3_Sub3_Sub1_3;
				@Pc(62) int local62 = 262144 / local26;
				if (local62 < local55) {
					local55 = local62;
				}
				arg1.anInt3775 += local26 * local36 - 1048576;
				if (this.aClass3_Sub3_Sub4_3.anIntArray509[arg1.anInt3773] == 0) {
					arg1.aClass3_Sub3_Sub1_3 = Static284.method399(arg1.aClass3_Sub16_Sub1_1, local58.method405(), local58.method392(), local58.method418());
				} else {
					arg1.aClass3_Sub3_Sub1_3 = Static284.method399(arg1.aClass3_Sub16_Sub1_1, local58.method405(), 0, local58.method418());
					this.aClass3_Sub3_Sub4_3.method4442(arg1, arg1.aClass3_Sub18_1.aShortArray36[arg1.anInt3779] < 0);
					arg1.aClass3_Sub3_Sub1_3.method398(local55, local58.method392());
				}
				if (arg1.aClass3_Sub18_1.aShortArray36[arg1.anInt3779] < 0) {
					arg1.aClass3_Sub3_Sub1_3.method396(-1);
				}
				arg2 += local36;
				local58.method384(local55);
				local58.method4408(arg0, arg2, arg4 - arg2);
				if (local58.method412()) {
					this.aClass3_Sub3_Sub2_2.method1343(local58);
				}
			}
		}
		arg1.aClass3_Sub3_Sub1_3.method4408(arg0, arg2, arg3);
	}
}
