import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class AnimFrame {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!jm;")
	public AnimBase aClass3_Sub20_1 = null;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public int anInt4070 = -1;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[S")
	public final short[] aShortArray42;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[S")
	public final short[] aShortArray50;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[S")
	public final short[] aShortArray49;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
	public final short[] aShortArray43;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([BLclient!jm;)V")
	public AnimFrame(@OriginalArg(0) byte[] arg0, @OriginalArg(1) AnimBase arg1) {
		this.aClass3_Sub20_1 = arg1;
		@Pc(21) Buffer local21 = new Buffer(arg0);
		@Pc(26) Buffer local26 = new Buffer(arg0);
		local21.offset = 2;
		@Pc(33) int local33 = local21.g1();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.offset = local21.offset + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass3_Sub20_1.anIntArray291[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.g1();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static168.aShortArray51[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static168.aShortArray48[local35] = local77;
				} else {
					Static168.aShortArray48[local35] = (short) local26.gSmart1or2s();
				}
				if ((local64 & 0x2) == 0) {
					Static168.aShortArray46[local35] = local77;
				} else {
					Static168.aShortArray46[local35] = (short) local26.gSmart1or2s();
				}
				if ((local64 & 0x4) == 0) {
					Static168.aShortArray45[local35] = local77;
				} else {
					Static168.aShortArray45[local35] = (short) local26.gSmart1or2s();
				}
				Static168.aByteArray54[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static168.aShortArray48[local35] = (short) (((Static168.aShortArray48[local35] & 0xFF) << 3) + (Static168.aShortArray48[local35] >> 8 & 0x7));
					Static168.aShortArray46[local35] = (short) (((Static168.aShortArray46[local35] & 0xFF) << 3) + (Static168.aShortArray46[local35] >> 8 & 0x7));
					Static168.aShortArray45[local35] = (short) (((Static168.aShortArray45[local35] & 0xFF) << 3) + (Static168.aShortArray45[local35] >> 8 & 0x7));
				}
				Static168.aShortArray47[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static168.aShortArray47[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean197 = true;
				} else if (local56 == 7) {
					this.aBoolean196 = true;
				}
				local35++;
			}
		}
		if (local26.offset != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt4070 = local35;
		this.aShortArray42 = new short[local35];
		this.aShortArray44 = new short[local35];
		this.aShortArray50 = new short[local35];
		this.aShortArray49 = new short[local35];
		this.aShortArray43 = new short[local35];
		this.aByteArray55 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray42[local47] = Static168.aShortArray51[local47];
			this.aShortArray44[local47] = Static168.aShortArray48[local47];
			this.aShortArray50[local47] = Static168.aShortArray46[local47];
			this.aShortArray49[local47] = Static168.aShortArray45[local47];
			this.aShortArray43[local47] = Static168.aShortArray47[local47];
			this.aByteArray55[local47] = Static168.aByteArray54[local47];
		}
	}
}
