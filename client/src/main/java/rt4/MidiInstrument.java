package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class MidiInstrument extends Node {

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "[B")
	public final byte[] aByteArray43 = new byte[128];

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "[I")
	private int[] anIntArray289 = new int[128];

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	public final int anInt3078;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "[B")
	public final byte[] aByteArray44;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "[B")
	public final byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "[Lclient!kj;")
	public final PcmSound[] aClass3_Sub16_Sub1Array1 = new PcmSound[128];

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "[S")
	public final short[] aShortArray36 = new short[128];

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "[Lclient!wh;")
	public final Midi_Class162[] aClass162Array1 = new Midi_Class162[128];

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V")
	public MidiInstrument(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aByteArray44 = new byte[128];
		@Pc(38) Buffer local38 = new Buffer(arg0);
		while (local38.data[local29 + local38.offset] != 0) {
			local29++;
		}
		@Pc(55) byte[] local55 = new byte[local29];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local29; local57++) {
			local55[local57] = local38.g1b();
		}
		local38.offset++;
		local29++;
		local57 = local38.offset;
		local38.offset += local29;
		@Pc(91) int local91;
		for (local91 = 0; local38.data[local38.offset + local91] != 0; local91++) {
		}
		@Pc(106) byte[] local106 = new byte[local91];
		@Pc(108) int local108;
		for (local108 = 0; local108 < local91; local108++) {
			local106[local108] = local38.g1b();
		}
		local38.offset++;
		local91++;
		@Pc(133) int local133 = 0;
		local108 = local38.offset;
		local38.offset += local91;
		while (local38.data[local133 + local38.offset] != 0) {
			local133++;
		}
		@Pc(159) byte[] local159 = new byte[local133];
		for (@Pc(161) int local161 = 0; local161 < local133; local161++) {
			local159[local161] = local38.g1b();
		}
		local38.offset++;
		local133++;
		@Pc(187) byte[] local187 = new byte[local133];
		@Pc(194) int local194;
		@Pc(206) int local206;
		if (local133 <= 1) {
			local194 = local133;
		} else {
			local194 = 2;
			local187[1] = 1;
			@Pc(204) int local204 = 1;
			for (local206 = 2; local206 < local133; local206++) {
				@Pc(217) int local217 = local38.g1();
				if (local217 == 0) {
					local204 = local194++;
				} else {
					if (local217 <= local204) {
						local217--;
					}
					local204 = local217;
				}
				local187[local206] = (byte) local204;
			}
		}
		@Pc(242) Midi_Class162[] local242 = new Midi_Class162[local194];
		for (local206 = 0; local206 < local242.length; local206++) {
			@Pc(256) Midi_Class162 local256 = local242[local206] = new Midi_Class162();
			@Pc(260) int local260 = local38.g1();
			if (local260 > 0) {
				local256.aByteArray80 = new byte[local260 * 2];
			}
			local260 = local38.g1();
			if (local260 > 0) {
				local256.aByteArray81 = new byte[local260 * 2 + 2];
				local256.aByteArray81[1] = 64;
			}
		}
		local206 = local38.g1();
		@Pc(311) byte[] local311 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local38.g1();
		@Pc(327) byte[] local327 = local206 > 0 ? new byte[local206 * 2] : null;
		@Pc(329) int local329;
		for (local329 = 0; local38.data[local329 + local38.offset] != 0; local329++) {
		}
		@Pc(346) byte[] local346 = new byte[local329];
		@Pc(348) int local348;
		for (local348 = 0; local348 < local329; local348++) {
			local346[local348] = local38.g1b();
		}
		local38.offset++;
		local329++;
		local348 = 0;
		@Pc(375) int local375;
		for (local375 = 0; local375 < 128; local375++) {
			local348 += local38.g1();
			this.aShortArray36[local375] = (short) local348;
		}
		local348 = 0;
		for (local375 = 0; local375 < 128; local375++) {
			local348 += local38.g1();
			this.aShortArray36[local375] = (short) (this.aShortArray36[local375] + (local348 << 8));
		}
		local375 = 0;
		@Pc(428) int local428 = 0;
		@Pc(430) int local430 = 0;
		@Pc(432) int local432;
		for (local432 = 0; local432 < 128; local432++) {
			if (local375 == 0) {
				if (local346.length > local428) {
					local375 = local346[local428++];
				} else {
					local375 = -1;
				}
				local430 = local38.gVarInt();
			}
			this.aShortArray36[local432] = (short) (this.aShortArray36[local432] + ((local430 - 1 & 0x2) << 14));
			this.anIntArray289[local432] = local430;
			local375--;
		}
		local375 = 0;
		local432 = 0;
		local428 = 0;
		@Pc(496) int local496;
		for (local496 = 0; local496 < 128; local496++) {
			if (this.anIntArray289[local496] != 0) {
				if (local375 == 0) {
					local432 = local38.data[local57++] - 1;
					if (local55.length > local428) {
						local375 = local55[local428++];
					} else {
						local375 = -1;
					}
				}
				local375--;
				this.aByteArray44[local496] = (byte) local432;
			}
		}
		local375 = 0;
		local428 = 0;
		local496 = 0;
		for (@Pc(550) int local550 = 0; local550 < 128; local550++) {
			if (this.anIntArray289[local550] != 0) {
				if (local375 == 0) {
					local496 = local38.data[local108++] + 16 << 2;
					if (local428 < local106.length) {
						local375 = local106[local428++];
					} else {
						local375 = -1;
					}
				}
				local375--;
				this.aByteArray43[local550] = (byte) local496;
			}
		}
		local428 = 0;
		local375 = 0;
		@Pc(609) Midi_Class162 local609 = null;
		@Pc(611) int local611;
		for (local611 = 0; local611 < 128; local611++) {
			if (this.anIntArray289[local611] != 0) {
				if (local375 == 0) {
					local609 = local242[local187[local428]];
					if (local428 >= local159.length) {
						local375 = -1;
					} else {
						local375 = local159[local428++];
					}
				}
				this.aClass162Array1[local611] = local609;
				local375--;
			}
		}
		local375 = 0;
		local428 = 0;
		local611 = 0;
		@Pc(664) int local664;
		for (local664 = 0; local664 < 128; local664++) {
			if (local375 == 0) {
				if (local428 < local346.length) {
					local375 = local346[local428++];
				} else {
					local375 = -1;
				}
				if (this.anIntArray289[local664] > 0) {
					local611 = local38.g1() + 1;
				}
			}
			local375--;
			this.aByteArray45[local664] = (byte) local611;
		}
		this.anInt3078 = local38.g1() + 1;
		@Pc(729) Midi_Class162 local729;
		@Pc(734) int local734;
		for (local664 = 0; local664 < local194; local664++) {
			local729 = local242[local664];
			if (local729.aByteArray80 != null) {
				for (local734 = 1; local734 < local729.aByteArray80.length; local734 += 2) {
					local729.aByteArray80[local734] = local38.g1b();
				}
			}
			if (local729.aByteArray81 != null) {
				for (local734 = 3; local734 < local729.aByteArray81.length - 2; local734 += 2) {
					local729.aByteArray81[local734] = local38.g1b();
				}
			}
		}
		if (local311 != null) {
			for (local664 = 1; local664 < local311.length; local664 += 2) {
				local311[local664] = local38.g1b();
			}
		}
		if (local327 != null) {
			for (local664 = 1; local664 < local327.length; local664 += 2) {
				local327[local664] = local38.g1b();
			}
		}
		for (local664 = 0; local664 < local194; local664++) {
			local729 = local242[local664];
			if (local729.aByteArray81 != null) {
				local348 = 0;
				for (local734 = 2; local734 < local729.aByteArray81.length; local734 += 2) {
					local348 -= -local38.g1() - 1;
					local729.aByteArray81[local734] = (byte) local348;
				}
			}
		}
		for (local664 = 0; local664 < local194; local664++) {
			local729 = local242[local664];
			if (local729.aByteArray80 != null) {
				local348 = 0;
				for (local734 = 2; local734 < local729.aByteArray80.length; local734 += 2) {
					local348 = local348 + local38.g1() + 1;
					local729.aByteArray80[local734] = (byte) local348;
				}
			}
		}
		@Pc(995) byte local995;
		@Pc(1014) int local1014;
		@Pc(1016) int local1016;
		@Pc(1031) int local1031;
		@Pc(1066) int local1066;
		@Pc(954) byte local954;
		if (local311 != null) {
			local348 = local38.g1();
			local311[0] = (byte) local348;
			for (local664 = 2; local664 < local311.length; local664 += 2) {
				local348 = local348 + local38.g1() + 1;
				local311[local664] = (byte) local348;
			}
			local954 = local311[0];
			@Pc(958) byte local958 = local311[1];
			for (local734 = 0; local734 < local954; local734++) {
				this.aByteArray45[local734] = (byte) (local958 * this.aByteArray45[local734] + 32 >> 6);
			}
			local734 = 2;
			while (local734 < local311.length) {
				local995 = local311[local734];
				@Pc(1001) byte local1001 = local311[local734 + 1];
				local734 += 2;
				local1014 = (local995 - local954) * local958 + (local995 - local954) / 2;
				for (local1016 = local954; local1016 < local995; local1016++) {
					local1031 = method3825(local1014, local995 - local954);
					local1014 += local1001 - local958;
					this.aByteArray45[local1016] = (byte) (local1031 * this.aByteArray45[local1016] + 32 >> 6);
				}
				local958 = local1001;
				local954 = local995;
			}
			for (local1066 = local954; local1066 < 128; local1066++) {
				this.aByteArray45[local1066] = (byte) (this.aByteArray45[local1066] * local958 + 32 >> 6);
			}
		}
		if (local327 != null) {
			local348 = local38.g1();
			local327[0] = (byte) local348;
			for (local664 = 2; local664 < local327.length; local664 += 2) {
				local348 = local348 + local38.g1() + 1;
				local327[local664] = (byte) local348;
			}
			local954 = local327[0];
			@Pc(1133) int local1133 = local327[1] << 1;
			for (local734 = 0; local734 < local954; local734++) {
				local1066 = local1133 + (this.aByteArray43[local734] & 0xFF);
				if (local1066 < 0) {
					local1066 = 0;
				}
				if (local1066 > 128) {
					local1066 = 128;
				}
				this.aByteArray43[local734] = (byte) local1066;
			}
			local734 = 2;
			@Pc(1207) int local1207;
			while (local734 < local327.length) {
				local995 = local327[local734];
				local1014 = (local995 - local954) * local1133 + (local995 - local954) / 2;
				local1207 = local327[local734 + 1] << 1;
				local734 += 2;
				for (local1016 = local954; local1016 < local995; local1016++) {
					local1031 = method3825(local1014, local995 - local954);
					local1014 += local1207 - local1133;
					@Pc(1237) int local1237 = local1031 + (this.aByteArray43[local1016] & 0xFF);
					if (local1237 < 0) {
						local1237 = 0;
					}
					if (local1237 > 128) {
						local1237 = 128;
					}
					this.aByteArray43[local1016] = (byte) local1237;
				}
				local954 = local995;
				local1133 = local1207;
			}
			for (local1066 = local954; local1066 < 128; local1066++) {
				local1207 = (this.aByteArray43[local1066] & 0xFF) + local1133;
				if (local1207 < 0) {
					local1207 = 0;
				}
				if (local1207 > 128) {
					local1207 = 128;
				}
				this.aByteArray43[local1066] = (byte) local1207;
			}
		}
		for (local664 = 0; local664 < local194; local664++) {
			local242[local664].anInt5815 = local38.g1();
		}
		for (local664 = 0; local664 < local194; local664++) {
			local729 = local242[local664];
			if (local729.aByteArray80 != null) {
				local729.anInt5810 = local38.g1();
			}
			if (local729.aByteArray81 != null) {
				local729.anInt5813 = local38.g1();
			}
			if (local729.anInt5815 > 0) {
				local729.anInt5807 = local38.g1();
			}
		}
		for (local664 = 0; local664 < local194; local664++) {
			local242[local664].anInt5814 = local38.g1();
		}
		for (local664 = 0; local664 < local194; local664++) {
			local729 = local242[local664];
			if (local729.anInt5814 > 0) {
				local729.anInt5809 = local38.g1();
			}
		}
		for (local664 = 0; local664 < local194; local664++) {
			local729 = local242[local664];
			if (local729.anInt5809 > 0) {
				local729.anInt5811 = local38.g1();
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)I")
	public static int method3825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ve;I)Lclient!jk;")
	public static MidiInstrument method2320(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.fetchFile(arg1);
		return local9 == null ? null : new MidiInstrument(local9);
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V")
	public final void method2432() {
		this.anIntArray289 = null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[ILclient!le;[B)Z")
	public final boolean method2436(@OriginalArg(1) int[] arg0, @OriginalArg(2) SoundBank arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) int local8 = 0;
		@Pc(10) PcmSound local10 = null;
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(35) int local35 = this.anIntArray289[local18];
				if (local35 != 0) {
					if (local8 != local35) {
						local8 = local35--;
						if ((local35 & 0x1) == 0) {
							local10 = arg1.getSynthSound(local35 >> 2, arg0);
						} else {
							local10 = arg1.getVorbisSound(local35 >> 2, arg0);
						}
						if (local10 == null) {
							local16 = false;
						}
					}
					if (local10 != null) {
						this.aClass3_Sub16_Sub1Array1[local18] = local10;
						this.anIntArray289[local18] = 0;
					}
				}
			}
		}
		return local16;
	}
}
