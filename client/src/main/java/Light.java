import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Light {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
	public final boolean aBoolean124;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	private int anInt2232;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	private int anInt2233;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int anInt2235;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public final int anInt2236;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	private int anInt2239;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int anInt2240;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int anInt2241;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	public final int anInt2243;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	public int anInt2245;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	private int anInt2246;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
	public final boolean aBoolean126;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Lclient!fj;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public final int anInt2247;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "[F")
	public final float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Light(@OriginalArg(0) Buffer arg0) {
		if (Static62.anIntArray150 == null) {
			Static84.method1771();
		}
		this.anInt2241 = arg0.g1();
		this.aBoolean124 = (this.anInt2241 & 0x10) != 0;
		this.aBoolean126 = (this.anInt2241 & 0x8) != 0;
		this.anInt2241 &= 0x7;
		this.anInt2240 = arg0.g2();
		this.anInt2245 = arg0.g2();
		this.anInt2235 = arg0.g2();
		this.anInt2236 = arg0.g1();
		this.method1763();
		this.aShortArray30 = new short[this.anInt2236 * 2 + 1];
		@Pc(87) int local87;
		for (local87 = 0; local87 < this.aShortArray30.length; local87++) {
			this.aShortArray30[local87] = (short) arg0.g2();
		}
		this.anInt2247 = Rasteriser.anIntArray220[arg0.g2()];
		local87 = arg0.g1();
		this.anInt2249 = (local87 & 0xE0) << 3;
		this.anInt2243 = local87 & 0x1F;
		if (this.anInt2243 != 31) {
			this.method1766();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIIII)V")
	public final void method1762(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2233 = arg0;
		this.anInt2239 = arg2;
		this.anInt2232 = arg3;
		this.anInt2246 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	private void method1763() {
		@Pc(10) int local10 = (this.anInt2236 << 7) + 64;
		this.aFloat9 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
	public final void method1765(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(26) int local26 = this.anInt2249 + arg1 * this.anInt2246 / 50 & 0x7FF;
		@Pc(29) int local29 = this.anInt2233;
		@Pc(62) int local62;
		if (local29 == 1) {
			local62 = (MathUtils.anIntArray223[local26] >> 6) + 1024;
		} else if (local29 == 3) {
			local62 = Static62.anIntArray150[local26] >> 1;
		} else if (local29 == 4) {
			local62 = local26 >> 10 << 11;
		} else if (local29 == 2) {
			local62 = local26;
		} else if (local29 == 5) {
			local62 = (local26 < 1024 ? local26 : 2048 - local26) << 1;
		} else {
			local62 = 2048;
		}
		if (arg0) {
			local62 = 2048;
		}
		this.aFloat8 = (float) (this.anInt2232 + (local62 * this.anInt2239 >> 11)) / 2048.0F;
		@Pc(123) float local123 = this.aFloat8 / 255.0F;
		this.aFloatArray3[0] = (float) (this.anInt2247 >> 16 & 0xFF) * local123;
		this.aFloatArray3[2] = local123 * (float) (this.anInt2247 & 0xFF);
		this.aFloatArray3[1] = (float) (this.anInt2247 >> 8 & 0xFF) * local123;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	private void method1766() {
		@Pc(4) int local4 = this.anInt2243;
		if (local4 == 2) {
			this.anInt2239 = 2048;
			this.anInt2232 = 0;
			this.anInt2233 = 1;
			this.anInt2246 = 2048;
		} else if (local4 == 3) {
			this.anInt2232 = 0;
			this.anInt2246 = 4096;
			this.anInt2233 = 1;
			this.anInt2239 = 2048;
		} else if (local4 == 4) {
			this.anInt2232 = 0;
			this.anInt2239 = 2048;
			this.anInt2233 = 4;
			this.anInt2246 = 2048;
		} else if (local4 == 5) {
			this.anInt2233 = 4;
			this.anInt2239 = 2048;
			this.anInt2246 = 8192;
			this.anInt2232 = 0;
		} else if (local4 == 12) {
			this.anInt2239 = 2048;
			this.anInt2233 = 2;
			this.anInt2246 = 2048;
			this.anInt2232 = 0;
		} else if (local4 == 13) {
			this.anInt2246 = 8192;
			this.anInt2239 = 2048;
			this.anInt2233 = 2;
			this.anInt2232 = 0;
		} else if (local4 == 10) {
			this.anInt2239 = 512;
			this.anInt2233 = 3;
			this.anInt2232 = 1536;
			this.anInt2246 = 2048;
		} else if (local4 == 11) {
			this.anInt2233 = 3;
			this.anInt2246 = 4096;
			this.anInt2239 = 512;
			this.anInt2232 = 1536;
		} else if (local4 == 6) {
			this.anInt2239 = 768;
			this.anInt2232 = 1280;
			this.anInt2233 = 3;
			this.anInt2246 = 2048;
		} else if (local4 == 7) {
			this.anInt2239 = 768;
			this.anInt2232 = 1280;
			this.anInt2246 = 4096;
			this.anInt2233 = 3;
		} else if (local4 == 8) {
			this.anInt2246 = 2048;
			this.anInt2233 = 3;
			this.anInt2239 = 1024;
			this.anInt2232 = 1024;
		} else if (local4 == 9) {
			this.anInt2246 = 4096;
			this.anInt2232 = 1024;
			this.anInt2239 = 1024;
			this.anInt2233 = 3;
		} else if (local4 == 14) {
			this.anInt2246 = 2048;
			this.anInt2232 = 1280;
			this.anInt2233 = 1;
			this.anInt2239 = 768;
		} else if (local4 == 15) {
			this.anInt2239 = 512;
			this.anInt2246 = 4096;
			this.anInt2232 = 1536;
			this.anInt2233 = 1;
		} else if (local4 == 16) {
			this.anInt2246 = 8192;
			this.anInt2232 = 1792;
			this.anInt2233 = 1;
			this.anInt2239 = 256;
		} else {
			this.anInt2246 = 2048;
			this.anInt2232 = 0;
			this.anInt2239 = 2048;
			this.anInt2233 = 0;
		}
	}
}
