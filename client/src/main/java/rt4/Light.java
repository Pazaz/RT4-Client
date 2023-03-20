package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Light {

	@OriginalMember(owner = "client!f", name = "P", descriptor = "[I")
	public static int[] NOISE;

	// TODO: this is an educated guess, needs confirming
	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
	public final boolean shineOnLowerLevels;

	// confirm
	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
	public final boolean shineOnHigherLevels;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	private int alphaMax;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	private int flickerType;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public final int radius;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	private int alphaMin;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	public final int lightType;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "F")
	public float alpha;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	private int anInt2246;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Lclient!fj;")
	public Light_Class45 aClass45_1;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	public final int color;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "[F")
	public final float[] diffuse = new float[4];

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Light(@OriginalArg(0) Buffer buffer) {
		if (NOISE == null) {
			init();
		}
		this.level = buffer.g1();
		this.shineOnLowerLevels = (this.level & 0x10) != 0;
		this.shineOnHigherLevels = (this.level & 0x8) != 0;
		this.level &= 0x7;
		this.x = buffer.g2();
		this.z = buffer.g2();
		this.y = buffer.g2();
		this.radius = buffer.g1();
		this.method1763();
		this.aShortArray30 = new short[this.radius * 2 + 1];
		@Pc(87) int i;
		for (i = 0; i < this.aShortArray30.length; i++) {
			this.aShortArray30[i] = (short) buffer.g2();
		}
		this.color = Rasteriser.palette[buffer.g2()];
		i = buffer.g1();
		this.anInt2249 = (i & 0xE0) << 3;
		this.lightType = i & 0x1F;
		if (this.lightType != 31) {
			this.applyLightType();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void init() {
		NOISE = createNoise(0.4F);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIIIFII)[I")
	public static int[] createNoise(@OriginalArg(5) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) TextureOp34 local15 = new TextureOp34();
		local15.anInt646 = 8;
		local15.anInt642 = 4;
		local15.anInt650 = 35;
		local15.anInt641 = 8;
		local15.anInt648 = (int) (arg0 * 4096.0F);
		local15.aBoolean44 = true;
		local15.postDecode();
		Texture.setSize(1, 2048);
		local15.method584(0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIIII)V")
	public final void setUpLightType(@OriginalArg(1) int flickerType, @OriginalArg(2) int arg1, @OriginalArg(3) int alphaMin, @OriginalArg(4) int alphaMax) {
		this.flickerType = flickerType;
		this.alphaMin = alphaMin;
		this.alphaMax = alphaMax;
		this.anInt2246 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	private void method1763() {
		@Pc(10) int local10 = (this.radius << 7) + 64;
		this.aFloat9 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
	public final void method1765(@OriginalArg(0) boolean disableFlicker, @OriginalArg(1) int time) {
		@Pc(26) int t = (this.anInt2249 + ((time * this.anInt2246) / 50)) & 0x7FF;
		@Pc(29) int flickerType = this.flickerType;
		@Pc(62) int alpha;
		if (flickerType == 1) {
			alpha = (MathUtils.sin[t] >> 6) + 1024;
		} else if (flickerType == 3) {
			alpha = NOISE[t] >> 1;
		} else if (flickerType == 4) {
			alpha = t >> 10 << 11;
		} else if (flickerType == 2) {
			alpha = t;
		} else if (flickerType == 5) {
			alpha = (t < 1024 ? t : 2048 - t) << 1;
		} else {
			alpha = 2048;
		}
		if (disableFlicker) {
			alpha = 2048;
		}
		this.alpha = (float) (this.alphaMax + (alpha * this.alphaMin >> 11)) / 2048.0F;
		@Pc(123) float local123 = this.alpha / 255.0F;
		this.diffuse[0] = (float) (this.color >> 16 & 0xFF) * local123;
		this.diffuse[2] = local123 * (float) (this.color & 0xFF);
		this.diffuse[1] = (float) (this.color >> 8 & 0xFF) * local123;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	private void applyLightType() {
		@Pc(4) int type = this.lightType;
		switch (type) {
			case 2:
				this.alphaMin = 2048;
				this.alphaMax = 0;
				this.flickerType = 1;
				this.anInt2246 = 2048;
				break;
			case 3:
				this.alphaMax = 0;
				this.anInt2246 = 4096;
				this.flickerType = 1;
				this.alphaMin = 2048;
				break;
			case 4:
				this.alphaMax = 0;
				this.alphaMin = 2048;
				this.flickerType = 4;
				this.anInt2246 = 2048;
				break;
			case 5:
				this.flickerType = 4;
				this.alphaMin = 2048;
				this.anInt2246 = 8192;
				this.alphaMax = 0;
				break;
			case 12:
				this.alphaMin = 2048;
				this.flickerType = 2;
				this.anInt2246 = 2048;
				this.alphaMax = 0;
				break;
			case 13:
				this.anInt2246 = 8192;
				this.alphaMin = 2048;
				this.flickerType = 2;
				this.alphaMax = 0;
				break;
			case 10:
				this.alphaMin = 512;
				this.flickerType = 3;
				this.alphaMax = 1536;
				this.anInt2246 = 2048;
				break;
			case 11:
				this.flickerType = 3;
				this.anInt2246 = 4096;
				this.alphaMin = 512;
				this.alphaMax = 1536;
				break;
			case 6:
				this.alphaMin = 768;
				this.alphaMax = 1280;
				this.flickerType = 3;
				this.anInt2246 = 2048;
				break;
			case 7:
				this.alphaMin = 768;
				this.alphaMax = 1280;
				this.anInt2246 = 4096;
				this.flickerType = 3;
				break;
			case 8:
				this.anInt2246 = 2048;
				this.flickerType = 3;
				this.alphaMin = 1024;
				this.alphaMax = 1024;
				break;
			case 9:
				this.anInt2246 = 4096;
				this.alphaMax = 1024;
				this.alphaMin = 1024;
				this.flickerType = 3;
				break;
			case 14:
				this.anInt2246 = 2048;
				this.alphaMax = 1280;
				this.flickerType = 1;
				this.alphaMin = 768;
				break;
			case 15:
				this.alphaMin = 512;
				this.anInt2246 = 4096;
				this.alphaMax = 1536;
				this.flickerType = 1;
				break;
			case 16:
				this.anInt2246 = 8192;
				this.alphaMax = 1792;
				this.flickerType = 1;
				this.alphaMin = 256;
				break;
			default:
				this.anInt2246 = 2048;
				this.alphaMax = 0;
				this.alphaMin = 2048;
				this.flickerType = 0;
				break;
		}
	}
}
