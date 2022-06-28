package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class MidiPcmStream extends PcmStream {

	@OriginalMember(owner = "client!va", name = "Kb", descriptor = "Z")
	private boolean aBoolean293;

	@OriginalMember(owner = "client!va", name = "Lb", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!va", name = "Mb", descriptor = "I")
	private int anInt5674;

	@OriginalMember(owner = "client!va", name = "Nb", descriptor = "I")
	private int anInt5675;

	@OriginalMember(owner = "client!va", name = "Ob", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!va", name = "Qb", descriptor = "Lclient!rf;")
	private Song aClass3_Sub29_2;

	@OriginalMember(owner = "client!va", name = "Rb", descriptor = "I")
	private int anInt5676;

	@OriginalMember(owner = "client!va", name = "Sb", descriptor = "Z")
	private boolean aBoolean294;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "[I")
	private final int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!va", name = "D", descriptor = "[I")
	private final int[] anIntArray499 = new int[16];

	@OriginalMember(owner = "client!va", name = "F", descriptor = "[I")
	private final int[] anIntArray500 = new int[16];

	@OriginalMember(owner = "client!va", name = "B", descriptor = "[I")
	private final int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
	private final int anInt5646 = 1000000;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "[[Lclient!mf;")
	private final MidiNote[][] aClass3_Sub25ArrayArray2 = new MidiNote[16][128];

	@OriginalMember(owner = "client!va", name = "kb", descriptor = "[I")
	private final int[] anIntArray506 = new int[16];

	@OriginalMember(owner = "client!va", name = "C", descriptor = "[I")
	private final int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!va", name = "U", descriptor = "[I")
	public final int[] anIntArray503 = new int[16];

	@OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
	private final int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "[I")
	private final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!va", name = "tb", descriptor = "[I")
	public final int[] channelFlags = new int[16];

	@OriginalMember(owner = "client!va", name = "mb", descriptor = "[I")
	private final int[] anIntArray507 = new int[16];

	@OriginalMember(owner = "client!va", name = "Cb", descriptor = "[I")
	private final int[] anIntArray510 = new int[16];

	@OriginalMember(owner = "client!va", name = "N", descriptor = "[I")
	private final int[] anIntArray502 = new int[16];

	@OriginalMember(owner = "client!va", name = "Bb", descriptor = "[I")
	public final int[] anIntArray509 = new int[16];

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "[[Lclient!mf;")
	private final MidiNote[][] aClass3_Sub25ArrayArray1 = new MidiNote[16][128];

	@OriginalMember(owner = "client!va", name = "Eb", descriptor = "I")
	private int anInt5668 = 256;

	@OriginalMember(owner = "client!va", name = "H", descriptor = "[I")
	private final int[] anIntArray501 = new int[16];

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "[I")
	private final int[] anIntArray504 = new int[16];

	@OriginalMember(owner = "client!va", name = "K", descriptor = "Lclient!ki;")
	private final MidiDecoder aClass84_1 = new MidiDecoder();

	@OriginalMember(owner = "client!va", name = "Pb", descriptor = "Lclient!te;")
	private final MidiNoteStream aClass3_Sub3_Sub3_1 = new MidiNoteStream(this);

	@OriginalMember(owner = "client!va", name = "P", descriptor = "Lclient!sc;")
	private final HashTable aClass133_23 = new HashTable(128);

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public MidiPcmStream() {
		this.method4424();
		this.method4441(true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!rf;ILclient!ve;Lclient!le;I)Z")
	public final synchronized boolean isSongReady(@OriginalArg(0) Song arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) SoundBank arg2) {
		arg0.createPrograms();
		@Pc(5) boolean local5 = true;
		@Pc(20) int[] local20 = new int[]{22050};
		for (@Pc(34) ByteArrayNode local34 = (ByteArrayNode) arg0.programs.head(); local34 != null; local34 = (ByteArrayNode) arg0.programs.next()) {
			@Pc(40) int local40 = (int) local34.key;
			@Pc(48) MidiInstrument local48 = (MidiInstrument) this.aClass133_23.get(local40);
			if (local48 == null) {
				local48 = MidiInstrument.method2320(arg1, local40);
				if (local48 == null) {
					local5 = false;
					continue;
				}
				this.aClass133_23.put(local48, local40);
			}
			if (!local48.method2436(local20, arg2, local34.value)) {
				local5 = false;
			}
		}
		if (local5) {
			arg0.releasePrograms();
		}
		return local5;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
	public final synchronized void releaseInstruments() {
		for (@Pc(15) MidiInstrument local15 = (MidiInstrument) this.aClass133_23.head(); local15 != null; local15 = (MidiInstrument) this.aClass133_23.next()) {
			local15.method2432();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	private void method4413() {
		this.anIntArray499[9] = 128;
		this.anIntArray502[9] = 128;
		this.method4425(128, 9);
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)Z")
	public final synchronized boolean isValid() {
		return this.aClass84_1.isValid();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!rf;ZB)V")
	private synchronized void method4416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Song arg1, @OriginalArg(2) boolean arg2) {
		this.method4448(arg2);
		this.aClass84_1.init(arg1.midiBytes);
		this.aBoolean293 = arg0;
		this.aLong189 = 0L;
		@Pc(24) int local24 = this.aClass84_1.getTrackCount();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass84_1.loadTrackPosition(local26);
			this.aClass84_1.addDeltaTime(local26);
			this.aClass84_1.saveTrackPosition(local26);
		}
		this.anInt5675 = this.aClass84_1.getNextTrack();
		this.anInt5674 = this.aClass84_1.times[this.anInt5675];
		this.aLong188 = this.aClass84_1.getTimeMillis(this.anInt5674);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
	private void method4417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray497[arg0] = arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()I")
	@Override
	public final synchronized int method4404() {
		return 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZI)V")
	private void method4419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)V")
	public final synchronized void init() {
		this.method4413();
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)V")
	private void method4421(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method4421(local10);
			}
			return;
		}
		this.anIntArray495[arg0] = 12800;
		this.anIntArray496[arg0] = 8192;
		this.anIntArray505[arg0] = 16383;
		this.anIntArray497[arg0] = 8192;
		this.anIntArray500[arg0] = 0;
		this.anIntArray504[arg0] = 8192;
		this.method4443(arg0);
		this.method4438(arg0);
		this.channelFlags[arg0] = 0;
		this.anIntArray498[arg0] = 32767;
		this.anIntArray501[arg0] = 256;
		this.anIntArray509[arg0] = 0;
		this.method4423(arg0, 8192);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
	private void method4422(@OriginalArg(1) int arg0) {
		for (@Pc(20) MidiNote local20 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.head(); local20 != null; local20 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.next()) {
			if (arg0 < 0 || local20.channel == arg0) {
				if (local20.stream != null) {
					local20.stream.method384(AudioChannel.sampleRate / 100);
					if (local20.stream.method412()) {
						this.aClass3_Sub3_Sub3_1.mixer.addSubStream(local20.stream);
					}
					local20.release();
				}
				if (local20.anInt3767 < 0) {
					this.aClass3_Sub25ArrayArray1[local20.channel][local20.anInt3779] = null;
				}
				local20.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(BII)V")
	private void method4423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray510[arg0] = arg1;
		this.anIntArray503[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
	private synchronized void method4424() {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			this.anIntArray507[local5] = 256;
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(III)V")
	private void method4425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray506[arg1] != arg0) {
			this.anIntArray506[arg1] = arg0;
			for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
				this.aClass3_Sub25ArrayArray2[arg1][local21] = null;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	public final synchronized void clearInstruments() {
		for (@Pc(7) MidiInstrument local7 = (MidiInstrument) this.aClass133_23.head(); local7 != null; local7 = (MidiInstrument) this.aClass133_23.next()) {
			local7.unlink();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
	private void method4427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4434(arg2, 64, arg1);
		if ((this.channelFlags[arg1] & 0x2) != 0) {
			for (@Pc(28) MidiNote local28 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.tail(); local28 != null; local28 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.prev()) {
				if (arg1 == local28.channel && local28.anInt3767 < 0) {
					this.aClass3_Sub25ArrayArray1[arg1][local28.anInt3779] = null;
					this.aClass3_Sub25ArrayArray1[arg1][arg2] = local28;
					@Pc(72) int local72 = local28.anInt3769 + (local28.anInt3764 * local28.anInt3781 >> 12);
					local28.anInt3764 = 4096;
					local28.anInt3769 += arg2 - local28.anInt3779 << 8;
					local28.anInt3781 = local72 - local28.anInt3769;
					local28.anInt3779 = arg2;
					return;
				}
			}
		}
		@Pc(118) MidiInstrument local118 = (MidiInstrument) this.aClass133_23.get(this.anIntArray506[arg1]);
		if (local118 == null) {
			return;
		}
		@Pc(126) PcmSound local126 = local118.aClass3_Sub16_Sub1Array1[arg2];
		if (local126 == null) {
			return;
		}
		@Pc(133) MidiNote local133 = new MidiNote();
		local133.sound = local126;
		local133.instrument = local118;
		local133.channel = arg1;
		local133.aClass162_1 = local118.aClass162Array1[arg2];
		local133.anInt3776 = local118.aByteArray44[arg2];
		local133.anInt3779 = arg2;
		local133.anInt3772 = local118.aByteArray45[arg2] * arg0 * arg0 * local118.anInt3078 + 1024 >> 11;
		local133.anInt3765 = local118.aByteArray43[arg2] & 0xFF;
		local133.anInt3769 = (arg2 << 8) - (local118.aShortArray36[arg2] & 0x7FFF);
		local133.anInt3767 = -1;
		local133.anInt3770 = 0;
		local133.anInt3777 = 0;
		local133.anInt3782 = 0;
		local133.anInt3763 = 0;
		if (this.anIntArray509[arg1] == 0) {
			local133.stream = SoundPcmStream.create(local126, this.method4439(local133), this.method4449(local133), this.method4437(local133));
		} else {
			local133.stream = SoundPcmStream.create(local126, this.method4439(local133), 0, this.method4437(local133));
			this.method4442(local133, local118.aShortArray36[arg2] < 0);
		}
		if (local118.aShortArray36[arg2] < 0) {
			local133.stream.setLoops(-1);
		}
		if (local133.anInt3776 >= 0) {
			@Pc(289) MidiNote local289 = this.aClass3_Sub25ArrayArray2[arg1][local133.anInt3776];
			if (local289 != null && local289.anInt3767 < 0) {
				this.aClass3_Sub25ArrayArray1[arg1][local289.anInt3779] = null;
				local289.anInt3767 = 0;
			}
			this.aClass3_Sub25ArrayArray2[arg1][local133.anInt3776] = local133;
		}
		this.aClass3_Sub3_Sub3_1.notes.addTail(local133);
		this.aClass3_Sub25ArrayArray1[arg1][arg2] = local133;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(BI)V")
	private void method4429(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(32) int local32;
		@Pc(26) int local26;
		if (local9 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 16 & 0x7F;
			local32 = arg0 >> 8 & 0x7F;
			this.method4434(local32, local26, local20);
		} else if (local9 == 144) {
			local32 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			local26 = arg0 >> 16 & 0x7F;
			if (local26 > 0) {
				this.method4427(local26, local20, local32);
			} else {
				this.method4434(local32, 64, local20);
			}
		} else if (local9 == 160) {
			local20 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4436(local26, local32, local20);
		} else if (local9 == 176) {
			local32 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			local26 = arg0 >> 16 & 0x7F;
			if (local32 == 0) {
				this.anIntArray502[local20] = (local26 << 14) + (this.anIntArray502[local20] & 0xFFE03FFF);
			}
			if (local32 == 32) {
				this.anIntArray502[local20] = (this.anIntArray502[local20] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local32 == 1) {
				this.anIntArray500[local20] = (local26 << 7) + (this.anIntArray500[local20] & 0xFFFFC07F);
			}
			if (local32 == 33) {
				this.anIntArray500[local20] = (this.anIntArray500[local20] & 0xFFFFFF80) + local26;
			}
			if (local32 == 5) {
				this.anIntArray504[local20] = (this.anIntArray504[local20] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local32 == 37) {
				this.anIntArray504[local20] = local26 + (this.anIntArray504[local20] & 0xFFFFFF80);
			}
			if (local32 == 7) {
				this.anIntArray495[local20] = (local26 << 7) + (this.anIntArray495[local20] & 0xFFFFC07F);
			}
			if (local32 == 39) {
				this.anIntArray495[local20] = (this.anIntArray495[local20] & 0xFFFFFF80) + local26;
			}
			if (local32 == 10) {
				this.anIntArray496[local20] = (this.anIntArray496[local20] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local32 == 42) {
				this.anIntArray496[local20] = local26 + (this.anIntArray496[local20] & 0xFFFFFF80);
			}
			if (local32 == 11) {
				this.anIntArray505[local20] = (this.anIntArray505[local20] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local32 == 43) {
				this.anIntArray505[local20] = local26 + (this.anIntArray505[local20] & 0xFFFFFF80);
			}
			if (local32 == 64) {
				if (local26 >= 64) {
					this.channelFlags[local20] |= 0x1;
				} else {
					this.channelFlags[local20] &= 0xFFFFFFFE;
				}
			}
			if (local32 == 65) {
				if (local26 < 64) {
					this.method4443(local20);
					this.channelFlags[local20] &= 0xFFFFFFFD;
				} else {
					this.channelFlags[local20] |= 0x2;
				}
			}
			if (local32 == 99) {
				this.anIntArray498[local20] = (local26 << 7) + (this.anIntArray498[local20] & 0x7F);
			}
			if (local32 == 98) {
				this.anIntArray498[local20] = (this.anIntArray498[local20] & 0x3F80) + local26;
			}
			if (local32 == 101) {
				this.anIntArray498[local20] = (local26 << 7) + (this.anIntArray498[local20] & 0x7F) + 16384;
			}
			if (local32 == 100) {
				this.anIntArray498[local20] = local26 + (this.anIntArray498[local20] & 0x3F80) + 16384;
			}
			if (local32 == 120) {
				this.method4422(local20);
			}
			if (local32 == 121) {
				this.method4421(local20);
			}
			if (local32 == 123) {
				this.method4430(local20);
			}
			@Pc(522) int local522;
			if (local32 == 6) {
				local522 = this.anIntArray498[local20];
				if (local522 == 16384) {
					this.anIntArray501[local20] = (this.anIntArray501[local20] & 0xFFFFC07F) + (local26 << 7);
				}
			}
			if (local32 == 38) {
				local522 = this.anIntArray498[local20];
				if (local522 == 16384) {
					this.anIntArray501[local20] = (this.anIntArray501[local20] & 0xFFFFFF80) + local26;
				}
			}
			if (local32 == 16) {
				this.anIntArray509[local20] = (this.anIntArray509[local20] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local32 == 48) {
				this.anIntArray509[local20] = (this.anIntArray509[local20] & 0xFFFFFF80) + local26;
			}
			if (local32 == 81) {
				if (local26 >= 64) {
					this.channelFlags[local20] |= 0x4;
				} else {
					this.method4438(local20);
					this.channelFlags[local20] &= 0xFFFFFFFB;
				}
			}
			if (local32 == 17) {
				this.method4423(local20, (local26 << 7) + (this.anIntArray510[local20] & 0xFFFFC07F));
			}
			if (local32 == 49) {
				this.method4423(local20, (this.anIntArray510[local20] & 0xFFFFFF80) + local26);
			}
		} else if (local9 == 192) {
			local32 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			this.method4425(this.anIntArray502[local20] + local32, local20);
		} else if (local9 == 208) {
			local20 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			this.method4419(local20, local32);
		} else if (local9 == 224) {
			local20 = arg0 & 0xF;
			local32 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FBE) >> 8);
			this.method4417(local20, local32);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4441(true);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(II)V")
	private void method4430(@OriginalArg(1) int arg0) {
		for (@Pc(12) MidiNote local12 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.head(); local12 != null; local12 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.next()) {
			if ((arg0 < 0 || arg0 == local12.channel) && local12.anInt3767 < 0) {
				this.aClass3_Sub25ArrayArray1[local12.channel][local12.anInt3779] = null;
				local12.anInt3767 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!rf;I)V")
	public final synchronized void method4431(@OriginalArg(0) boolean arg0, @OriginalArg(1) Song arg1) {
		this.method4416(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "([III)V")
	@Override
	public final synchronized void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass84_1.isValid()) {
			@Pc(18) int local18 = this.aClass84_1.division * this.anInt5646 / AudioChannel.sampleRate;
			do {
				@Pc(28) long local28 = this.aLong189 + (long) arg2 * (long) local18;
				if (this.aLong188 - local28 >= 0L) {
					this.aLong189 = local28;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong188 + (long) local18 - this.aLong189 - 1L) / (long) local18);
				this.aLong189 += (long) local18 * (long) local59;
				this.aClass3_Sub3_Sub3_1.read(arg0, arg1, local59);
				arg2 -= local59;
				arg1 += local59;
				this.method4435();
			} while (this.aClass84_1.isValid());
		}
		this.aClass3_Sub3_Sub3_1.read(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!mf;B[I)Z")
	public final boolean method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) MidiNote arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt3771 = AudioChannel.sampleRate / 100;
		if (arg2.anInt3767 >= 0 && (arg2.stream == null || arg2.stream.method411())) {
			arg2.release();
			arg2.unlink();
			if (arg2.anInt3776 > 0 && arg2 == this.aClass3_Sub25ArrayArray2[arg2.channel][arg2.anInt3776]) {
				this.aClass3_Sub25ArrayArray2[arg2.channel][arg2.anInt3776] = null;
			}
			return true;
		}
		@Pc(54) int local54 = arg2.anInt3764;
		if (local54 > 0) {
			local54 -= (int) (Math.pow(2.0D, (double) this.anIntArray504[arg2.channel] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local54 < 0) {
				local54 = 0;
			}
			arg2.anInt3764 = local54;
		}
		arg2.stream.method410(this.method4439(arg2));
		@Pc(103) Midi_Class162 local103 = arg2.aClass162_1;
		arg2.anInt3768 += local103.anInt5814;
		arg2.anInt3774++;
		@Pc(134) double local134 = (double) ((arg2.anInt3779 - 60 << 8) + (arg2.anInt3764 * arg2.anInt3781 >> 12)) * 5.086263020833333E-6D;
		@Pc(136) boolean local136 = false;
		if (local103.anInt5815 > 0) {
			if (local103.anInt5807 > 0) {
				arg2.anInt3782 += (int) (Math.pow(2.0D, local134 * (double) local103.anInt5807) * 128.0D + 0.5D);
			} else {
				arg2.anInt3782 += 128;
			}
			if (arg2.anInt3782 * local103.anInt5815 >= 819200) {
				local136 = true;
			}
		}
		if (local103.aByteArray80 != null) {
			if (local103.anInt5810 <= 0) {
				arg2.anInt3770 += 128;
			} else {
				arg2.anInt3770 += (int) (Math.pow(2.0D, (double) local103.anInt5810 * local134) * 128.0D + 0.5D);
			}
			while (arg2.anInt3763 < local103.aByteArray80.length - 2 && arg2.anInt3770 > (local103.aByteArray80[arg2.anInt3763 + 2] & 0xFF) << 8) {
				arg2.anInt3763 += 2;
			}
			if (local103.aByteArray80.length - 2 == arg2.anInt3763 && local103.aByteArray80[arg2.anInt3763 + 1] == 0) {
				local136 = true;
			}
		}
		if (arg2.anInt3767 >= 0 && local103.aByteArray81 != null && (this.channelFlags[arg2.channel] & 0x1) == 0 && (arg2.anInt3776 < 0 || this.aClass3_Sub25ArrayArray2[arg2.channel][arg2.anInt3776] != arg2)) {
			if (local103.anInt5813 > 0) {
				arg2.anInt3767 += (int) (Math.pow(2.0D, (double) local103.anInt5813 * local134) * 128.0D + 0.5D);
			} else {
				arg2.anInt3767 += 128;
			}
			while (local103.aByteArray81.length - 2 > arg2.anInt3777 && (local103.aByteArray81[arg2.anInt3777 + 2] & 0xFF) << 8 < arg2.anInt3767) {
				arg2.anInt3777 += 2;
			}
			if (arg2.anInt3777 == local103.aByteArray81.length - 2) {
				local136 = true;
			}
		}
		if (!local136) {
			arg2.stream.method417(arg2.anInt3771, this.method4449(arg2), this.method4437(arg2));
			return false;
		}
		arg2.stream.method384(arg2.anInt3771);
		if (arg3 == null) {
			arg2.stream.skip(arg0);
		} else {
			arg2.stream.read(arg3, arg1, arg0);
		}
		if (arg2.stream.method412()) {
			this.aClass3_Sub3_Sub3_1.mixer.addSubStream(arg2.stream);
		}
		arg2.release();
		if (arg2.anInt3767 >= 0) {
			arg2.unlink();
			if (arg2.anInt3776 > 0 && this.aClass3_Sub25ArrayArray2[arg2.channel][arg2.anInt3776] == arg2) {
				this.aClass3_Sub25ArrayArray2[arg2.channel][arg2.anInt3776] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()Lclient!qb;")
	@Override
	public final synchronized PcmStream firstSubStream() {
		return this.aClass3_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIII)V")
	private void method4434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) MidiNote local12 = this.aClass3_Sub25ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub25ArrayArray1[arg2][arg0] = null;
		if ((this.channelFlags[arg2] & 0x2) == 0) {
			local12.anInt3767 = 0;
			return;
		}
		for (@Pc(44) MidiNote local44 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.head(); local44 != null; local44 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.next()) {
			if (local44.channel == local12.channel && local44.anInt3767 < 0 && local44 != local12) {
				local12.anInt3767 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
	private void method4435() {
		@Pc(8) int local8 = this.anInt5675;
		@Pc(11) int local11 = this.anInt5674;
		@Pc(20) long local20 = this.aLong188;
		if (this.aClass3_Sub29_2 != null && local11 == this.anInt5676) {
			this.method4416(this.aBoolean293, this.aClass3_Sub29_2, this.aBoolean294);
			this.method4435();
			return;
		}
		while (this.anInt5674 == local11) {
			while (local11 == this.aClass84_1.times[local8]) {
				this.aClass84_1.loadTrackPosition(local8);
				@Pc(64) int local64 = this.aClass84_1.getNextEvent(local8);
				if (local64 == 1) {
					this.aClass84_1.loadEndOfTrackPosition();
					this.aClass84_1.saveTrackPosition(local8);
					if (this.aClass84_1.hasNextTrack()) {
						if (this.aClass3_Sub29_2 != null) {
							this.method4431(this.aBoolean293, this.aClass3_Sub29_2);
							this.method4435();
							return;
						}
						if (!this.aBoolean293 || local11 == 0) {
							this.method4441(true);
							this.aClass84_1.release();
							return;
						}
						this.aClass84_1.setStartMillis(local20);
					}
					break;
				}
				if ((local64 & 0x80) != 0) {
					this.method4429(local64);
				}
				this.aClass84_1.addDeltaTime(local8);
				this.aClass84_1.saveTrackPosition(local8);
			}
			local8 = this.aClass84_1.getNextTrack();
			local11 = this.aClass84_1.times[local8];
			local20 = this.aClass84_1.getTimeMillis(local11);
		}
		this.anInt5675 = local8;
		this.aLong188 = local20;
		this.anInt5674 = local11;
		if (this.aClass3_Sub29_2 != null && local11 > this.anInt5676) {
			this.anInt5675 = -1;
			this.anInt5674 = this.anInt5676;
			this.aLong188 = this.aClass84_1.getTimeMillis(this.anInt5674);
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IIII)V")
	private void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!mf;)I")
	private int method4437(@OriginalArg(1) MidiNote arg0) {
		@Pc(5) int local5 = this.anIntArray496[arg0.channel];
		return local5 < 8192 ? arg0.anInt3765 * local5 + 32 >> 6 : 16384 - ((128 - arg0.anInt3765) * (-local5 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	@Override
	public final synchronized void skip(@OriginalArg(0) int arg0) {
		if (this.aClass84_1.isValid()) {
			@Pc(15) int local15 = this.aClass84_1.division * this.anInt5646 / AudioChannel.sampleRate;
			do {
				@Pc(25) long local25 = this.aLong189 + (long) arg0 * (long) local15;
				if (this.aLong188 - local25 >= 0L) {
					this.aLong189 = local25;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local15 + this.aLong188 - this.aLong189 - 1L) / (long) local15);
				arg0 -= local57;
				this.aLong189 += (long) local57 * (long) local15;
				this.aClass3_Sub3_Sub3_1.skip(local57);
				this.method4435();
			} while (this.aClass84_1.isValid());
		}
		this.aClass3_Sub3_Sub3_1.skip(arg0);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(II)V")
	private void method4438(@OriginalArg(0) int arg0) {
		if ((this.channelFlags[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(24) MidiNote local24 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.head(); local24 != null; local24 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.next()) {
			if (local24.channel == arg0) {
				local24.anInt3775 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!mf;)I")
	private int method4439(@OriginalArg(1) MidiNote arg0) {
		@Pc(6) Midi_Class162 local6 = arg0.aClass162_1;
		@Pc(17) int local17 = (arg0.anInt3781 * arg0.anInt3764 >> 12) + arg0.anInt3769;
		local17 += this.anIntArray501[arg0.channel] * (this.anIntArray497[arg0.channel] - 8192) >> 12;
		@Pc(62) int local62;
		if (local6.anInt5814 > 0 && (local6.anInt5809 > 0 || this.anIntArray500[arg0.channel] > 0)) {
			local62 = local6.anInt5809 << 2;
			@Pc(67) int local67 = local6.anInt5811 << 1;
			if (local67 > arg0.anInt3774) {
				local62 = arg0.anInt3774 * local62 / local67;
			}
			local62 += this.anIntArray500[arg0.channel] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt3768 & 0x1FF) * 0.01227184630308513D);
			local17 += (int) ((double) local62 * local102);
		}
		local62 = (int) ((double) (arg0.sound.rate * 256) * Math.pow(2.0D, (double) local17 * 3.255208333333333E-4D) / (double) AudioChannel.sampleRate + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
	public final int getVolume() {
		return this.anInt5668;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)V")
	private void method4441(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4422(-1);
		} else {
			this.method4430(-1);
		}
		this.method4421(-1);
		@Pc(29) int local29;
		for (local29 = 0; local29 < 16; local29++) {
			this.anIntArray506[local29] = this.anIntArray499[local29];
		}
		for (local29 = 0; local29 < 16; local29++) {
			this.anIntArray502[local29] = this.anIntArray499[local29] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!mf;ZB)V")
	public final void method4442(@OriginalArg(0) MidiNote arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.sound.samples.length;
		@Pc(27) int local27;
		if (arg1 && arg0.sound.aBoolean165) {
			@Pc(37) int local37 = local8 + local8 - arg0.sound.start;
			local8 <<= 0x8;
			local27 = (int) ((long) local37 * (long) this.anIntArray509[arg0.channel] >> 6);
			if (local27 >= local8) {
				arg0.stream.method409();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray509[arg0.channel] >> 6);
		}
		arg0.stream.method401(local27);
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(II)V")
	private void method4443(@OriginalArg(0) int arg0) {
		if ((this.channelFlags[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(20) MidiNote local20 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.head(); local20 != null; local20 = (MidiNote) this.aClass3_Sub3_Sub3_1.notes.next()) {
			if (arg0 == local20.channel && this.aClass3_Sub25ArrayArray1[arg0][local20.anInt3779] == null && local20.anInt3767 < 0) {
				local20.anInt3767 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!mf;I)Z")
	public final boolean method4445(@OriginalArg(0) MidiNote arg0) {
		if (arg0.stream != null) {
			return false;
		}
		if (arg0.anInt3767 >= 0) {
			arg0.unlink();
			if (arg0.anInt3776 > 0 && this.aClass3_Sub25ArrayArray2[arg0.channel][arg0.anInt3776] == arg0) {
				this.aClass3_Sub25ArrayArray2[arg0.channel][arg0.anInt3776] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(B)V")
	public final synchronized void method4446() {
		this.method4448(true);
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(II)V")
	public final synchronized void setVolume(@OriginalArg(1) int arg0) {
		this.anInt5668 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(ZB)V")
	private synchronized void method4448(@OriginalArg(0) boolean arg0) {
		this.aClass84_1.release();
		this.aClass3_Sub29_2 = null;
		this.method4441(arg0);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(BLclient!mf;)I")
	private int method4449(@OriginalArg(1) MidiNote arg0) {
		if (this.anIntArray507[arg0.channel] == 0) {
			return 0;
		}
		@Pc(21) Midi_Class162 local21 = arg0.aClass162_1;
		@Pc(37) int local37 = this.anIntArray495[arg0.channel] * this.anIntArray505[arg0.channel] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = arg0.anInt3772 * local45 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt5668 + 128 >> 8;
		local37 = this.anIntArray507[arg0.channel] * local63 + 128 >> 8;
		if (local21.anInt5815 > 0) {
			local37 = (int) (Math.pow(0.5D, (double) arg0.anInt3782 * 1.953125E-5D * (double) local21.anInt5815) * (double) local37 + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(143) int local143;
		@Pc(133) int local133;
		if (local21.aByteArray80 != null) {
			local105 = arg0.anInt3770;
			local113 = local21.aByteArray80[arg0.anInt3763 + 1];
			if (local21.aByteArray80.length - 2 > arg0.anInt3763) {
				local133 = (local21.aByteArray80[arg0.anInt3763 + 2] & 0xFF) << 8;
				local143 = (local21.aByteArray80[arg0.anInt3763] & 0xFF) << 8;
				local113 += (local21.aByteArray80[arg0.anInt3763 + 3] - local113) * (local105 - local143) / (local133 - local143);
			}
			local37 = local113 * local37 + 32 >> 6;
		}
		if (arg0.anInt3767 > 0 && local21.aByteArray81 != null) {
			local105 = arg0.anInt3767;
			local113 = local21.aByteArray81[arg0.anInt3777 + 1];
			if (local21.aByteArray81.length - 2 > arg0.anInt3777) {
				local143 = (local21.aByteArray81[arg0.anInt3777] & 0xFF) << 8;
				local133 = (local21.aByteArray81[arg0.anInt3777 + 2] & 0xFF) << 8;
				local113 += (local105 - local143) * (-local113 + local21.aByteArray81[arg0.anInt3777 + 3]) / (local133 - local143);
			}
			local37 = local37 * local113 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()Lclient!qb;")
	@Override
	public final synchronized PcmStream nextSubStream() {
		return null;
	}
}
