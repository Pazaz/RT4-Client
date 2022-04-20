import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class SpotAnimType {

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public int anInt1751;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	private int anInt1748 = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	private int anInt1749 = 0;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public int anInt1754 = -1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	private int anInt1752 = 128;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	private int anInt1745 = 128;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private int anInt1755 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;B)V")
	public final void method1316(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.g1();
			if (local17 == 0) {
				return;
			}
			this.method1318(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;II)V")
	private void method1318(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1753 = arg0.g2();
		} else if (arg1 == 2) {
			this.anInt1754 = arg0.g2();
		} else if (arg1 == 4) {
			this.anInt1745 = arg0.g2();
		} else if (arg1 == 5) {
			this.anInt1752 = arg0.g2();
		} else if (arg1 == 6) {
			this.anInt1755 = arg0.g2();
		} else if (arg1 == 7) {
			this.anInt1749 = arg0.g1();
		} else if (arg1 == 8) {
			this.anInt1748 = arg0.g1();
		} else if (arg1 == 9) {
			this.aBoolean100 = true;
		} else {
			@Pc(78) int local78;
			@Pc(88) int local88;
			if (arg1 == 40) {
				local78 = arg0.g1();
				this.aShortArray15 = new short[local78];
				this.aShortArray18 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray15[local88] = (short) arg0.g2();
					this.aShortArray18[local88] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				local78 = arg0.g1();
				this.aShortArray16 = new short[local78];
				this.aShortArray17 = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.aShortArray16[local88] = (short) arg0.g2();
					this.aShortArray17[local88] = (short) arg0.g2();
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBII)Lclient!ak;")
	public final Model method1319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Model local13 = (Model) Static56.aClass99_9.method3106((long) this.anInt1751);
		if (local13 == null) {
			@Pc(28) RawModel local28 = Static77.method1686(Static93.aClass153_41, this.anInt1753);
			if (local28 == null) {
				return null;
			}
			@Pc(40) int local40;
			if (this.aShortArray15 != null) {
				for (local40 = 0; local40 < this.aShortArray15.length; local40++) {
					local28.method1687(this.aShortArray15[local40], this.aShortArray18[local40]);
				}
			}
			if (this.aShortArray16 != null) {
				for (local40 = 0; local40 < this.aShortArray16.length; local40++) {
					local28.method1669(this.aShortArray16[local40], this.aShortArray17[local40]);
				}
			}
			local13 = local28.method1679(this.anInt1749 + 64, this.anInt1748 + 850, -30, -50, -30);
			Static56.aClass99_9.method3095(local13, (long) this.anInt1751);
		}
		@Pc(118) Model local118;
		if (this.anInt1754 == -1 || arg1 == -1) {
			local118 = local13.method4560(true, true, true);
		} else {
			local118 = Static36.method941(this.anInt1754).method4219(arg0, arg2, arg1, local13);
		}
		if (this.anInt1745 != 128 || this.anInt1752 != 128) {
			local118.method4559(this.anInt1745, this.anInt1752, this.anInt1745);
		}
		if (this.anInt1755 != 0) {
			if (this.anInt1755 == 90) {
				local118.method4563();
			}
			if (this.anInt1755 == 180) {
				local118.method4552();
			}
			if (this.anInt1755 == 270) {
				local118.method4578();
			}
		}
		return local118;
	}
}
