package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Flames {
	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public static final int[] flameGradientSource = new int[]{0xbf6428, 0xec963a, 0xf2d766, 0xfff2ba};

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!na;")
	public static final JagString RUNES = JagString.parse("runes");

	@OriginalMember(owner = "client!cl", name = "ab", descriptor = "[I")
	public static final int[] flameShiftX = new int[256];

	@OriginalMember(owner = "client!km", name = "Yc", descriptor = "I")
	public static int runesId;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int flameCycle = 0;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	public static int[] flameBuffer1;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "[Lclient!ek;")
	public static SoftwareIndexedSprite[] runes;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
	public static int[] flameGradient;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
	public static int[] flameBuffer2;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
	public static int[] flameIntensityBuffer;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!mm;")
	public static SoftwareSprite imageFlames;

	@OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
	public static int[] flameIntensity;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int flameOffset = 0;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public static int anInt6 = 0;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt5084 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		runesId = archive.getGroupId(RUNES);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ve;I)Z")
	public static boolean isReady(@OriginalArg(0) Js5 archive) {
		return archive.isFileReady(runesId);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void update() {
		flameCycle++;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ve;)V")
	public static void load(@OriginalArg(1) Js5 archive) {
		runes = SpriteLoader.loadSoftwareIndexedSpritesAutoDetect(runesId, archive);
		flameGradient = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(30) int local30 = flameGradientSource[local15 + 1] >> 16 & 0xFF;
			@Pc(39) float local39 = (float) (flameGradientSource[local15] >> 16 & 0xFF);
			@Pc(48) float local48 = (float) (flameGradientSource[local15] >> 8 & 0xFF);
			@Pc(55) float local55 = (float) (flameGradientSource[local15] & 0xFF);
			@Pc(62) float local62 = ((float) local30 - local39) / 64.0F;
			@Pc(72) int local72 = flameGradientSource[local15 + 1] >> 8 & 0xFF;
			@Pc(80) float local80 = ((float) local72 - local48) / 64.0F;
			@Pc(88) int local88 = flameGradientSource[local15 + 1] & 0xFF;
			@Pc(95) float local95 = ((float) local88 - local55) / 64.0F;
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				flameGradient[local97 + local15 * 64] = (int) local55 | (int) local48 << 8 | (int) local39 << 16;
				local48 += local80;
				local55 += local95;
				local39 += local62;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			flameGradient[local15] = flameGradientSource[3];
		}
		flameBuffer1 = new int[32768];
		flameBuffer2 = new int[32768];
		setRune(null);
		flameIntensity = new int[32768];
		flameIntensityBuffer = new int[32768];
		imageFlames = new SoftwareSprite(128, 254);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public static void method4528(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		flameOffset += arg0 * 128;
		@Pc(40) int local40;
		if (flameBuffer1.length < flameOffset) {
			flameOffset -= flameBuffer1.length;
			local40 = (int) (Math.random() * 12.0D);
			setRune(runes[local40]);
		}
		local40 = 0;
		@Pc(54) int local54 = (256 - arg0) * 128;
		@Pc(58) int local58 = arg0 * 128;
		@Pc(60) int local60;
		@Pc(89) int local89;
		for (local60 = 0; local60 < local54; local60++) {
			local89 = flameIntensityBuffer[local40 + local58] - arg0 * flameBuffer1[flameBuffer1.length - 1 & flameOffset + local40] / 6;
			if (local89 < 0) {
				local89 = 0;
			}
			flameIntensityBuffer[local40++] = local89;
		}
		@Pc(117) int local117;
		@Pc(125) int local125;
		for (local60 = 256 - arg0; local60 < 256; local60++) {
			local89 = local60 * 128;
			for (local117 = 0; local117 < 128; local117++) {
				local125 = (int) (Math.random() * 100.0D);
				if (local125 < 50 && local117 > 10 && local117 < 118) {
					flameIntensityBuffer[local117 + local89] = 255;
				} else {
					flameIntensityBuffer[local117 + local89] = 0;
				}
			}
		}
		for (local60 = 0; local60 < 256 - arg0; local60++) {
			flameShiftX[local60] = flameShiftX[local60 + arg0];
		}
		for (local60 = 256 - arg0; local60 < 256; local60++) {
			flameShiftX[local60] = (int) (Math.sin((double) anInt6 / 14.0D) * 16.0D + Math.sin((double) anInt6 / 15.0D) * 14.0D + Math.sin((double) anInt6 / 16.0D) * 12.0D);
			anInt6++;
		}
		anInt5084 += arg0;
		local60 = (arg0 + (client.loop & 0x1)) / 2;
		if (local60 <= 0) {
			return;
		}
		for (local89 = 0; local89 < anInt5084; local89++) {
			local117 = (int) (Math.random() * 124.0D) + 2;
			local125 = (int) (Math.random() * 128.0D) + 128;
			flameIntensityBuffer[local117 + (local125 << 7)] = 192;
		}
		anInt5084 = 0;
		@Pc(290) int local290;
		for (local89 = 0; local89 < 256; local89++) {
			local125 = local89 * 128;
			local117 = 0;
			for (local290 = -local60; local290 < 128; local290++) {
				if (local60 + local290 < 128) {
					local117 += flameIntensityBuffer[local125 + local290 + local60];
				}
				if (local290 - local60 - 1 >= 0) {
					local117 -= flameIntensityBuffer[local290 + local125 - local60 - 1];
				}
				if (local290 >= 0) {
					flameIntensity[local290 + local125] = local117 / (local60 * 2 + 1);
				}
			}
		}
		for (local89 = 0; local89 < 128; local89++) {
			local117 = 0;
			for (local125 = -local60; local125 < 256; local125++) {
				local290 = local125 * 128;
				if (local125 + local60 < 256) {
					local117 += flameIntensity[local60 * 128 + local89 + local290];
				}
				if (local125 - local60 - 1 >= 0) {
					local117 -= flameIntensity[local89 + local290 - (local60 + 1) * 128];
				}
				if (local125 >= 0) {
					flameIntensityBuffer[local290 + local89] = local117 / (local60 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!ek;)V")
	public static void setRune(@OriginalArg(1) SoftwareIndexedSprite sprite) {
		@Pc(5) int local5;
		for (local5 = 0; local5 < flameBuffer1.length; local5++) {
			flameBuffer1[local5] = 0;
		}
		@Pc(36) int local36;
		for (local5 = 0; local5 < 5000; local5++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			flameBuffer1[local36] = (int) (Math.random() * 284.0D);
		}
		@Pc(66) int local66;
		@Pc(76) int local76;
		for (local5 = 0; local5 < 20; local5++) {
			for (local36 = 1; local36 < 255; local36++) {
				for (local66 = 1; local66 < 127; local66++) {
					local76 = local66 + (local36 << 7);
					flameBuffer2[local76] = (flameBuffer1[local76 + 128] + flameBuffer1[local76 - 1] + flameBuffer1[local76 + 1] + flameBuffer1[local76 + -128]) / 4;
				}
			}
			@Pc(113) int[] local113 = flameBuffer1;
			flameBuffer1 = flameBuffer2;
			flameBuffer2 = local113;
		}
		if (sprite == null) {
			return;
		}
		local5 = 0;
		for (local36 = 0; local36 < sprite.height; local36++) {
			for (local66 = 0; local66 < sprite.width; local66++) {
				if (sprite.pixels[local5++] != 0) {
					local76 = sprite.xOffset + local66 + 16;
					@Pc(162) int local162 = sprite.yOffset + local36 + 16;
					@Pc(169) int local169 = local76 + (local162 << 7);
					flameBuffer1[local169] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public static void render(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (flameCycle > 0) {
			method4528(flameCycle);
			flameCycle = 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = SoftwareRaster.width * arg1;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 1; local28 < 255; local28++) {
			@Pc(43) int local43 = (256 - local28) * flameShiftX[local28] / 256;
			if (local43 < 0) {
				local43 = 0;
			}
			local20 += local43;
			@Pc(55) int local55;
			for (local55 = local43; local55 < 128; local55++) {
				@Pc(65) int local65 = SoftwareRaster.pixels[local24++ + arg0];
				@Pc(70) int local70 = flameIntensityBuffer[local20++];
				if (local70 == 0) {
					imageFlames.pixels[local26++] = local65;
				} else {
					@Pc(76) int local76 = local70 + 18;
					if (local76 > 255) {
						local76 = 255;
					}
					@Pc(89) int local89 = 256 - local70 - 18;
					if (local89 > 255) {
						local89 = 255;
					}
					local70 = flameGradient[local70];
					imageFlames.pixels[local26++] = (local89 * (local65 & 0xFF00FF) + (local70 & 0xFF00FF) * local76 & 0xFF00FF00) + ((local70 & 0xFF00) * local76 + ((local65 & 0xFF00) * local89) & 0xFF0000) >> 8;
				}
			}
			for (local55 = 0; local55 < local43; local55++) {
				imageFlames.pixels[local26++] = SoftwareRaster.pixels[arg0 + local24++];
			}
			local24 += SoftwareRaster.width - 128;
		}
		if (GlRenderer.enabled) {
			GlRaster.drawPixels(imageFlames.pixels, arg0, arg1, imageFlames.width, imageFlames.height);
		} else {
			imageFlames.drawPixels(arg0, arg1);
		}
	}
}
