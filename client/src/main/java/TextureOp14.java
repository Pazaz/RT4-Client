import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class TextureOp14 extends TextureOp {

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
	private int anInt2635 = 2;

	@OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
	private int anInt2636 = 2048;

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
	private int anInt2639 = 0;

	@OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
	private int anInt2638 = 1;

	@OriginalMember(owner = "client!hm", name = "jb", descriptor = "I")
	private int anInt2646 = 5;

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "[B")
	private byte[] aByteArray38 = new byte[512];

	@OriginalMember(owner = "client!hm", name = "ib", descriptor = "I")
	private int anInt2645 = 5;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "[S")
	private short[] aShortArray35 = new short[512];

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public TextureOp14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(B)V")
	private void method2052() {
		@Pc(12) Random local12 = new Random((long) this.anInt2639);
		this.aShortArray35 = new short[512];
		if (this.anInt2636 > 0) {
			for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
				this.aShortArray35[local26] = (short) Static171.method3219(this.anInt2636, local12);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
	@Override
	public final void method4630() {
		this.aByteArray38 = Static89.method1837(this.anInt2639);
		this.method2052();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(32) int local32 = this.anInt2646 * Static64.anIntArray153[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static189.anInt4457; local42++) {
				Static253.anInt5526 = Integer.MAX_VALUE;
				Static250.anInt5443 = Integer.MAX_VALUE;
				Static121.anInt3041 = Integer.MAX_VALUE;
				Static35.anInt1091 = Integer.MAX_VALUE;
				@Pc(62) int local62 = this.anInt2645 * Static173.anIntArray367[local42] + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(165) int local165;
				for (@Pc(74) int local74 = local36 - 1; local74 <= local40; local74++) {
					@Pc(104) int local104 = this.aByteArray38[(this.anInt2646 <= local74 ? local74 - this.anInt2646 : local74) & 0xFF] & 0xFF;
					for (@Pc(108) int local108 = local66 - 1; local108 <= local70; local108++) {
						@Pc(138) int local138 = (this.aByteArray38[(this.anInt2645 <= local108 ? local108 - this.anInt2645 : local108) + local104 & 0xFF] & 0xFF) * 2;
						@Pc(142) int local142 = -(local108 << 12);
						@Pc(146) int local146 = local138 + 1;
						@Pc(151) int local151 = local142 + local62 - this.aShortArray35[local138];
						@Pc(162) int local162 = local32 - this.aShortArray35[local146] - (local74 << 12);
						local165 = this.anInt2638;
						@Pc(201) int local201;
						if (local165 == 1) {
							local201 = local162 * local162 + local151 * local151 >> 12;
						} else if (local165 == 3) {
							local151 = local151 < 0 ? -local151 : local151;
							local162 = local162 >= 0 ? local162 : -local162;
							local201 = local162 >= local151 ? local162 : local151;
						} else if (local165 == 4) {
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local162 = (int) (Math.sqrt((double) ((float) (local162 >= 0 ? local162 : -local162) / 4096.0F)) * 4096.0D);
							local201 = local162 + local151;
							local201 = local201 * local201 >> 12;
						} else if (local165 == 5) {
							local151 *= local151;
							local162 *= local162;
							local201 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local162 + local151) / 1.6777216E7F))) * 4096.0D);
						} else if (local165 == 2) {
							local201 = (local151 >= 0 ? local151 : -local151) + (local162 < 0 ? -local162 : local162);
						} else {
							local201 = (int) (Math.sqrt((double) ((float) (local162 * local162 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (local201 < Static35.anInt1091) {
							Static253.anInt5526 = Static250.anInt5443;
							Static250.anInt5443 = Static121.anInt3041;
							Static121.anInt3041 = Static35.anInt1091;
							Static35.anInt1091 = local201;
						} else if (local201 < Static121.anInt3041) {
							Static253.anInt5526 = Static250.anInt5443;
							Static250.anInt5443 = Static121.anInt3041;
							Static121.anInt3041 = local201;
						} else if (Static250.anInt5443 > local201) {
							Static253.anInt5526 = Static250.anInt5443;
							Static250.anInt5443 = local201;
						} else if (local201 < Static253.anInt5526) {
							Static253.anInt5526 = local201;
						}
					}
				}
				local165 = this.anInt2635;
				if (local165 == 0) {
					local19[local42] = Static35.anInt1091;
				} else if (local165 == 1) {
					local19[local42] = Static121.anInt3041;
				} else if (local165 == 3) {
					local19[local42] = Static250.anInt5443;
				} else if (local165 == 4) {
					local19[local42] = Static253.anInt5526;
				} else if (local165 == 2) {
					local19[local42] = Static121.anInt3041 - Static35.anInt1091;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt2645 = this.anInt2646 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt2639 = arg1.g1();
		} else if (arg0 == 2) {
			this.anInt2636 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt2635 = arg1.g1();
		} else if (arg0 == 4) {
			this.anInt2638 = arg1.g1();
		} else if (arg0 == 5) {
			this.anInt2645 = arg1.g1();
		} else if (arg0 == 6) {
			this.anInt2646 = arg1.g1();
		}
	}
}
