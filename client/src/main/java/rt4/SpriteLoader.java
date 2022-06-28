package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SpriteLoader {
	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[I")
	public static int[] innerWidths;
	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
	public static int[] yOffsets;
	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "[I")
	public static int[] innerHeights;
	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[[B")
	public static byte[][] pixels;
	@OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
	public static int[] xOffsets;
	@OriginalMember(owner = "client!vc", name = "R", descriptor = "[I")
	public static int[] palette;
	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int frames;
	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[[B")
	public static byte[][] alpha;
	@OriginalMember(owner = "client!mi", name = "W", descriptor = "[Z")
	public static boolean[] hasAlpha;
	@OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
	public static int width;
	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZILclient!ve;I)[Lclient!ek;")
	static SoftwareIndexedSprite[] loadSoftwareIndexedSprites(@OriginalArg(1) int arg0, @OriginalArg(2) Js5 arg1) {
		return decode(arg1, 0, arg0) ? createSoftwareIndexedSprites() : null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ve;III)Z")
	public static boolean decode(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9 = arg0.fetchFile(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			decode(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)[Lclient!ek;")
	public static SoftwareIndexedSprite[] createSoftwareIndexedSprites() {
		@Pc(2) SoftwareIndexedSprite[] sprites = new SoftwareIndexedSprite[frames];
		for (@Pc(8) int local8 = 0; local8 < frames; local8++) {
			sprites[local8] = new SoftwareIndexedSprite(width, height, xOffsets[local8], yOffsets[local8], innerWidths[local8], innerHeights[local8], pixels[local8], palette);
		}
		clear();
		return sprites;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V")
	public static void decode(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer buffer = new Buffer(arg0);
		buffer.offset = arg0.length - 2;
		frames = buffer.g2();
		innerHeights = new int[frames];
		innerWidths = new int[frames];
		xOffsets = new int[frames];
		hasAlpha = new boolean[frames];
		alpha = new byte[frames][];
		yOffsets = new int[frames];
		pixels = new byte[frames][];
		buffer.offset = arg0.length - frames * 8 - 7;
		width = buffer.g2();
		height = buffer.g2();
		@Pc(66) int paletteSize = (buffer.g1() & 0xFF) + 1;
		@Pc(68) int i;
		for (i = 0; i < frames; i++) {
			xOffsets[i] = buffer.g2();
		}
		for (i = 0; i < frames; i++) {
			yOffsets[i] = buffer.g2();
		}
		for (i = 0; i < frames; i++) {
			innerWidths[i] = buffer.g2();
		}
		for (i = 0; i < frames; i++) {
			innerHeights[i] = buffer.g2();
		}
		buffer.offset = arg0.length + 3 - frames * 8 - paletteSize * 3 - 7;
		palette = new int[paletteSize];
		for (i = 1; i < paletteSize; i++) {
			palette[i] = buffer.g3();
			if (palette[i] == 0) {
				palette[i] = 1;
			}
		}
		buffer.offset = 0;
		for (i = 0; i < frames; i++) {
			@Pc(195) int local195 = innerWidths[i];
			@Pc(199) int local199 = innerHeights[i];
			@Pc(203) int local203 = local195 * local199;
			@Pc(206) byte[] local206 = new byte[local203];
			@Pc(208) boolean local208 = false;
			pixels[i] = local206;
			@Pc(215) byte[] local215 = new byte[local203];
			alpha[i] = local215;
			@Pc(223) int local223 = buffer.g1();
			@Pc(232) int local232;
			if ((local223 & 0x1) == 0) {
				for (local232 = 0; local232 < local203; local232++) {
					local206[local232] = buffer.g1b();
				}
				if ((local223 & 0x2) != 0) {
					for (local232 = 0; local232 < local203; local232++) {
						@Pc(343) byte local343 = local215[local232] = buffer.g1b();
						local208 |= local343 != -1;
					}
				}
			} else {
				local232 = 0;
				label88:
				while (true) {
					@Pc(241) int local241;
					if (local232 >= local195) {
						if ((local223 & 0x2) == 0) {
							break;
						}
						local232 = 0;
						while (true) {
							if (local232 >= local195) {
								break label88;
							}
							for (local241 = 0; local241 < local199; local241++) {
								@Pc(291) byte local291 = local215[local195 * local241 + local232] = buffer.g1b();
								local208 |= local291 != -1;
							}
							local232++;
						}
					}
					for (local241 = 0; local241 < local199; local241++) {
						local206[local232 + local241 * local195] = buffer.g1b();
					}
					local232++;
				}
			}
			hasAlpha[i] = local208;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void clear() {
		innerWidths = null;
		yOffsets = null;
		innerHeights = null;
		pixels = null;
		xOffsets = null;
		palette = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBILclient!ve;)[Lclient!qf;")
	public static Sprite[] loadAlphaSprites(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return decode(arg1, 0, arg0) ? method3730() : null;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILclient!ve;)[Lclient!mm;")
	public static SoftwareSprite[] loadSoftwareSprites(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return decode(arg1, 0, arg0) ? method474() : null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ve;II)Lclient!mm;")
	public static SoftwareSprite loadSoftwareSprite(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) int arg2) {
		return decode(arg1, arg0, arg2) ? method3537() : null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ve;BII)[Lclient!ok;")
	public static IndexedSprite[] loadIndexedSprites(@OriginalArg(0) Js5 arg0, @OriginalArg(3) int arg1) {
		return decode(arg0, 0, arg1) ? method4331() : null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!ve;)[Lclient!qf;")
	public static Sprite[] method2580(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return decode(arg1, 0, arg0) ? method870() : null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBLclient!ve;)Lclient!qf;")
	public static Sprite loadSprites(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1) {
		return decode(arg1, 0, arg0) ? method1764() : null;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)[Lclient!qf;")
	public static Sprite[] method3730() {
		@Pc(14) Sprite[] local14 = new Sprite[frames];
		for (@Pc(16) int local16 = 0; local16 < frames; local16++) {
			@Pc(23) byte[] local23 = pixels[local16];
			@Pc(31) int local31 = innerHeights[local16] * innerWidths[local16];
			if (hasAlpha[local16]) {
				@Pc(38) int[] local38 = new int[local31];
				@Pc(42) byte[] local42 = alpha[local16];
				for (@Pc(44) int local44 = 0; local44 < local31; local44++) {
					local38[local44] = palette[local23[local44] & 0xFF] | (local42[local44] & 0xFF) << 24;
				}
				if (GlRenderer.enabled) {
					local14[local16] = new GlAlphaSprite(width, height, xOffsets[local16], yOffsets[local16], innerWidths[local16], innerHeights[local16], local38);
				} else {
					local14[local16] = new SoftwareAlphaSprite(width, height, xOffsets[local16], yOffsets[local16], innerWidths[local16], innerHeights[local16], local38);
				}
			} else {
				@Pc(119) int[] local119 = new int[local31];
				for (@Pc(121) int local121 = 0; local121 < local31; local121++) {
					local119[local121] = palette[local23[local121] & 0xFF];
				}
				if (GlRenderer.enabled) {
					local14[local16] = new GlSprite(width, height, xOffsets[local16], yOffsets[local16], innerWidths[local16], innerHeights[local16], local119);
				} else {
					local14[local16] = new SoftwareSprite(width, height, xOffsets[local16], yOffsets[local16], innerWidths[local16], innerHeights[local16], local119);
				}
			}
		}
		clear();
		return local14;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)[Lclient!mm;")
	public static SoftwareSprite[] method474() {
		@Pc(4) SoftwareSprite[] local4 = new SoftwareSprite[frames];
		for (@Pc(12) int local12 = 0; local12 < frames; local12++) {
			@Pc(27) int local27 = innerHeights[local12] * innerWidths[local12];
			@Pc(31) byte[] local31 = pixels[local12];
			@Pc(34) int[] local34 = new int[local27];
			for (@Pc(36) int local36 = 0; local36 < local27; local36++) {
				local34[local36] = palette[local31[local36] & 0xFF];
			}
			local4[local12] = new SoftwareSprite(width, height, xOffsets[local12], yOffsets[local12], innerWidths[local12], innerHeights[local12], local34);
		}
		clear();
		return local4;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!mm;")
	public static SoftwareSprite method3537() {
		@Pc(13) int local13 = innerWidths[0] * innerHeights[0];
		@Pc(17) byte[] local17 = pixels[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = palette[local17[local22] & 0xFF];
		}
		@Pc(57) SoftwareSprite local57 = new SoftwareSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], local20);
		clear();
		return local57;
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)[Lclient!ok;")
	public static IndexedSprite[] method4331() {
		@Pc(8) IndexedSprite[] local8 = new IndexedSprite[frames];
		for (@Pc(10) int local10 = 0; local10 < frames; local10++) {
			if (GlRenderer.enabled) {
				local8[local10] = new GlIndexedSprite(width, height, xOffsets[local10], yOffsets[local10], innerWidths[local10], innerHeights[local10], pixels[local10], palette);
			} else {
				local8[local10] = new SoftwareIndexedSprite(width, height, xOffsets[local10], yOffsets[local10], innerWidths[local10], innerHeights[local10], pixels[local10], palette);
			}
		}
		clear();
		return local8;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)[Lclient!qf;")
	public static Sprite[] method870() {
		@Pc(6) Sprite[] local6 = new Sprite[frames];
		for (@Pc(15) int local15 = 0; local15 < frames; local15++) {
			@Pc(30) int local30 = innerWidths[local15] * innerHeights[local15];
			@Pc(34) byte[] local34 = pixels[local15];
			@Pc(37) int[] local37 = new int[local30];
			for (@Pc(39) int local39 = 0; local39 < local30; local39++) {
				local37[local39] = palette[local34[local39] & 0xFF];
			}
			if (GlRenderer.enabled) {
				local6[local15] = new GlSprite(width, height, xOffsets[local15], yOffsets[local15], innerWidths[local15], innerHeights[local15], local37);
			} else {
				local6[local15] = new SoftwareSprite(width, height, xOffsets[local15], yOffsets[local15], innerWidths[local15], innerHeights[local15], local37);
			}
		}
		clear();
		return local6;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lclient!qf;")
	public static Sprite method1764() {
		@Pc(9) byte[] local9 = pixels[0];
		@Pc(17) int local17 = innerWidths[0] * innerHeights[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(28) int local28 = 0; local28 < local17; local28++) {
			local20[local28] = palette[local9[local28] & 0xFF];
		}
		@Pc(69) Sprite local69;
		if (GlRenderer.enabled) {
			local69 = new GlSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], local20);
		} else {
			local69 = new SoftwareSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], local20);
		}
		clear();
		return local69;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!ve;I)Z")
	public static boolean decode(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.fetchFile(arg1);
		if (local13 == null) {
			return false;
		} else {
			decode(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BILclient!ve;)[Lclient!ek;")
	public static SoftwareIndexedSprite[] loadSoftwareIndexedSpritesAutoDetect(@OriginalArg(1) int arg0, @OriginalArg(2) Js5 arg1) {
		return decode(arg1, arg0) ? createSoftwareIndexedSprites() : null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!ve;Z)Lclient!ok;")
	public static IndexedSprite loadIndexedSpriteAutoDetect(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1) {
		return decode(arg1, arg0) ? method4614() : null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ve;I)Lclient!qf;")
	public static Sprite loadSpriteAutoDetect(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		return decode(arg0, arg1) ? method1764() : null;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Lclient!ok;")
	public static IndexedSprite method4614() {
		@Pc(27) IndexedSprite local27;
		if (GlRenderer.enabled) {
			local27 = new GlIndexedSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], pixels[0], palette);
		} else {
			local27 = new SoftwareIndexedSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], pixels[0], palette);
		}
		clear();
		return local27;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZILclient!ve;)Lclient!ek;")
	public static SoftwareIndexedSprite loadSoftwareIndexedSprite(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return decode(arg1, 0, arg0) ? method2619() : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ve;IZ)Lclient!mm;")
	public static SoftwareSprite loadSoftwareSpriteAutoDetect(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		return decode(arg0, arg1) ? method3537() : null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!ek;")
	public static SoftwareIndexedSprite method2619() {
		@Pc(25) SoftwareIndexedSprite local25 = new SoftwareIndexedSprite(width, height, xOffsets[0], yOffsets[0], innerWidths[0], innerHeights[0], pixels[0], palette);
		clear();
		return local25;
	}
}
