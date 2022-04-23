import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class AnimFrame {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!jm;")
	public AnimBase base = null;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public int length = -1;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
	public boolean transformsAlpha = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Z")
	public boolean transformsColor = false;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[S")
	public final short[] indices;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[S")
	public final short[] aShortArray50;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[S")
	public final short[] aShortArray49;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
	public final short[] prevOriginIndices;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[B")
	public final byte[] flags;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([BLclient!jm;)V")
	public AnimFrame(@OriginalArg(0) byte[] arg0, @OriginalArg(1) AnimBase arg1) {
		this.base = arg1;
		@Pc(21) Buffer local21 = new Buffer(arg0);
		@Pc(26) Buffer local26 = new Buffer(arg0);
		local21.offset = 2;
		@Pc(33) int local33 = local21.g1();
		@Pc(35) int len = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.offset = local21.offset + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.base.types[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.g1();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static168.tempIndices[len] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static168.tempX[len] = local77;
				} else {
					Static168.tempX[len] = (short) local26.gSmart1or2s();
				}
				if ((local64 & 0x2) == 0) {
					Static168.tempY[len] = local77;
				} else {
					Static168.tempY[len] = (short) local26.gSmart1or2s();
				}
				if ((local64 & 0x4) == 0) {
					Static168.tempZ[len] = local77;
				} else {
					Static168.tempZ[len] = (short) local26.gSmart1or2s();
				}
				Static168.tempFlags[len] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static168.tempX[len] = (short) (((Static168.tempX[len] & 0xFF) << 3) + (Static168.tempX[len] >> 8 & 0x7));
					Static168.tempY[len] = (short) (((Static168.tempY[len] & 0xFF) << 3) + (Static168.tempY[len] >> 8 & 0x7));
					Static168.tempZ[len] = (short) (((Static168.tempZ[len] & 0xFF) << 3) + (Static168.tempZ[len] >> 8 & 0x7));
				}
				Static168.tempPrevOriginIndices[len] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static168.tempPrevOriginIndices[len] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.transformsAlpha = true;
				} else if (local56 == 7) {
					this.transformsColor = true;
				}
				len++;
			}
		}
		if (local26.offset != arg0.length) {
			throw new RuntimeException();
		}
		this.length = len;
		this.indices = new short[len];
		this.aShortArray44 = new short[len];
		this.aShortArray50 = new short[len];
		this.aShortArray49 = new short[len];
		this.prevOriginIndices = new short[len];
		this.flags = new byte[len];
		for (local47 = 0; local47 < len; local47++) {
			this.indices[local47] = Static168.tempIndices[local47];
			this.aShortArray44[local47] = Static168.tempX[local47];
			this.aShortArray50[local47] = Static168.tempY[local47];
			this.aShortArray49[local47] = Static168.tempZ[local47];
			this.prevOriginIndices[local47] = Static168.tempPrevOriginIndices[local47];
			this.flags[local47] = Static168.tempFlags[local47];
		}
	}
}
