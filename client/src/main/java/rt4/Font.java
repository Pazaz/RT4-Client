package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!rk")
public abstract class Font extends SecondaryNode {

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "Lclient!na;")
	public static final JagString TAG_GT = JagString.parse("gt");
	@OriginalMember(owner = "client!rk", name = "L", descriptor = "Lclient!na;")
	public static final JagString TAG_LT = JagString.parse("lt");
	@OriginalMember(owner = "client!rk", name = "M", descriptor = "Lclient!na;")
	public static final JagString TAG_SHAD1 = JagString.parse("shad=");
	@OriginalMember(owner = "client!rk", name = "N", descriptor = "Lclient!na;")
	public static final JagString TAB_SHY = JagString.parse("shy");
	@OriginalMember(owner = "client!rk", name = "O", descriptor = "Lclient!na;")
	public static final JagString TAG_TRANS1 = JagString.parse("trans=");
	@OriginalMember(owner = "client!rk", name = "P", descriptor = "Lclient!na;")
	public static final JagString TAG_U1 = JagString.parse("u=");
	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lclient!na;")
	public static final JagString TAG_STR1 = JagString.parse("str=");
	@OriginalMember(owner = "client!rk", name = "R", descriptor = "Lclient!na;")
	public static final JagString TAB_EURO = JagString.parse("euro");
	@OriginalMember(owner = "client!rk", name = "T", descriptor = "Lclient!na;")
	public static final JagString TAG_COL2 = JagString.parse(")4col");
	@OriginalMember(owner = "client!rk", name = "X", descriptor = "Lclient!na;")
	public static final JagString TAG_SHAD3 = JagString.parse(")4shad");
	@OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lclient!na;")
	public static final JagString TAG_COL1 = JagString.parse("col=");
	@OriginalMember(owner = "client!rk", name = "bb", descriptor = "Lclient!na;")
	public static final JagString TAG_U2 = JagString.parse("u");
	@OriginalMember(owner = "client!rk", name = "cb", descriptor = "Lclient!na;")
	public static final JagString TAB_TIMES = JagString.parse("times");
	@OriginalMember(owner = "client!rk", name = "eb", descriptor = "Lclient!na;")
	public static final JagString TAG_TRANS2 = JagString.parse(")4trans");
	@OriginalMember(owner = "client!rk", name = "fb", descriptor = "Lclient!na;")
	public static final JagString TAG_NBSP = JagString.parse("nbsp");
	@OriginalMember(owner = "client!rk", name = "ib", descriptor = "Lclient!na;")
	public static final JagString TAG_U3 = JagString.parse(")4u");
	@OriginalMember(owner = "client!rk", name = "kb", descriptor = "Lclient!na;")
	public static final JagString TAG_BR = JagString.parse("br");
	@OriginalMember(owner = "client!rk", name = "lb", descriptor = "Lclient!na;")
	public static final JagString TAG_SHAD2 = JagString.parse("shad");
	@OriginalMember(owner = "client!rk", name = "mb", descriptor = "Lclient!na;")
	public static final JagString TAG_IMG = JagString.parse("img=");
	@OriginalMember(owner = "client!rk", name = "ob", descriptor = "Lclient!na;")
	public static final JagString TAB_COPY = JagString.parse("copy");
	@OriginalMember(owner = "client!rk", name = "pb", descriptor = "Lclient!na;")
	public static final JagString TAG_STR3 = JagString.parse(")4str");
	@OriginalMember(owner = "client!rk", name = "qb", descriptor = "Lclient!na;")
	public static final JagString TAG_REG = JagString.parse("reg");
	@OriginalMember(owner = "client!rk", name = "rb", descriptor = "Lclient!na;")
	public static final JagString TAG_STR2 = JagString.parse("str");
	@OriginalMember(owner = "client!rk", name = "sb", descriptor = "Lclient!na;")
	public static final JagString buffer = JagString.allocate(100);
	@OriginalMember(owner = "client!rk", name = "Ab", descriptor = "[Lclient!na;")
	public static final JagString[] lines = new JagString[100];
	@OriginalMember(owner = "client!rk", name = "Z", descriptor = "Lclient!na;")
	private static final JagString aClass100_706 = JagString.parse("<gt>");
	@OriginalMember(owner = "client!rk", name = "hb", descriptor = "Lclient!na;")
	private static final JagString aClass100_711 = JagString.parse("<lt>");
	@OriginalMember(owner = "client!rk", name = "tb", descriptor = "I")
	public static int strikethroughColor = -1;
	@OriginalMember(owner = "client!rk", name = "ub", descriptor = "I")
	public static int underlineColor = -1;
	@OriginalMember(owner = "client!rk", name = "vb", descriptor = "I")
	public static int extraSpaceWidth = 0;
	@OriginalMember(owner = "client!rk", name = "wb", descriptor = "I")
	public static int color = 0;
	@OriginalMember(owner = "client!rk", name = "xb", descriptor = "I")
	public static int alphaOverride = 256;
	@OriginalMember(owner = "client!rk", name = "yb", descriptor = "I")
	public static int alpha = 256;
	@OriginalMember(owner = "client!rk", name = "zb", descriptor = "I")
	public static int shadowColor = -1;
	@OriginalMember(owner = "client!rk", name = "Bb", descriptor = "I")
	public static int shadowColorOverride = -1;
	@OriginalMember(owner = "client!rk", name = "Cb", descriptor = "I")
	public static int colorOverride = 0;
	@OriginalMember(owner = "client!rk", name = "Db", descriptor = "I")
	public static int spaceWidth = 0;
	@OriginalMember(owner = "client!rk", name = "W", descriptor = "[I")
	private int[] nameIconHeights;

	@OriginalMember(owner = "client!rk", name = "gb", descriptor = "[B")
	private byte[] kerning;

	@OriginalMember(owner = "client!rk", name = "jb", descriptor = "[I")
	private int[] glyphWidths;

	@OriginalMember(owner = "client!rk", name = "nb", descriptor = "[Lclient!ok;")
	private IndexedSprite[] nameIcons;

	@OriginalMember(owner = "client!rk", name = "ab", descriptor = "I")
	public int lineHeight = 0;

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "[I")
	private int[] spriteXOffsets;

	@OriginalMember(owner = "client!rk", name = "db", descriptor = "[I")
	private int[] spriteYOffsets;

	@OriginalMember(owner = "client!rk", name = "I", descriptor = "[I")
	protected int[] spriteInnerWidths;

	@OriginalMember(owner = "client!rk", name = "U", descriptor = "[I")
	protected int[] spriteInnerHeights;

	@OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
	private int paragraphTopPadding;

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
	private int paragraphBottomPadding;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Font(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.spriteXOffsets = arg1;
		this.spriteYOffsets = arg2;
		this.spriteInnerWidths = arg3;
		this.spriteInnerHeights = arg4;
		this.decode(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.spriteYOffsets[local25] < local21 && this.spriteInnerHeights[local25] != 0) {
				local21 = this.spriteYOffsets[local25];
			}
			if (this.spriteYOffsets[local25] + this.spriteInnerHeights[local25] > local23) {
				local23 = this.spriteYOffsets[local25] + this.spriteInnerHeights[local25];
			}
		}
		this.paragraphTopPadding = this.lineHeight - local21;
		this.paragraphBottomPadding = local23 - this.lineHeight;
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([B)V")
	public Font(@OriginalArg(0) byte[] arg0) {
		this.decode(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Lclient!na;)Lclient!na;")
	public static JagString escape(@OriginalArg(0) JagString arg0) {
		@Pc(3) int local3 = arg0.length();
		@Pc(5) int local5 = 0;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			local15 = arg0.charAt(local7);
			if (local15 == 60 || local15 == 62) {
				local5 += 3;
			}
		}
		@Pc(30) JagString local30 = JagString.allocate(local3 + local5);
		for (local15 = 0; local15 < local3; local15++) {
			@Pc(40) int local40 = arg0.charAt(local15);
			if (local40 == 60) {
				local30.method3113(aClass100_711);
			} else if (local40 == 62) {
				local30.method3113(aClass100_706);
			} else {
				local30.append(local40);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2870(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(77) int local77 = local50[local58++] + local54[local62++];
			if (local77 < local37) {
				local37 = local77;
			}
		}
		return -local37;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)Lclient!rk;")
	public static Font method799(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Font local27;
		if (GlRenderer.enabled) {
			local27 = new GlFont(arg0, SpriteLoader.xOffsets, SpriteLoader.yOffsets, SpriteLoader.innerWidths, SpriteLoader.innerHeights, SpriteLoader.pixels);
		} else {
			local27 = new SoftwareFont(arg0, SpriteLoader.xOffsets, SpriteLoader.yOffsets, SpriteLoader.innerWidths, SpriteLoader.innerHeights, SpriteLoader.pixels);
		}
		SpriteLoader.clear();
		return local27;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBLclient!ve;Lclient!ve;)Lclient!rk;")
	public static Font method2462(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(4) Js5 arg2) {
		return SpriteLoader.decode(arg1, 0, arg0) ? method799(arg2.fetchFile(arg0, 0)) : null;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIIIIIIII)I")
	public final int drawInterfaceText(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.renderParagraphAlpha(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;II)V")
	private void render(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.lineHeight;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(22) int local22 = arg0.charAt(local14);
			if (local22 == 60) {
				local6 = local14;
			} else {
				@Pc(120) int local120;
				if (local22 == 62 && local6 != -1) {
					@Pc(42) JagString local42 = arg0.substring(local14, local6 + 1);
					local6 = -1;
					if (local42.strEquals(TAG_LT)) {
						local22 = 60;
					} else if (local42.strEquals(TAG_GT)) {
						local22 = 62;
					} else if (local42.strEquals(TAG_NBSP)) {
						local22 = 160;
					} else if (local42.strEquals(TAB_SHY)) {
						local22 = 173;
					} else if (local42.strEquals(TAB_TIMES)) {
						local22 = 215;
					} else if (local42.strEquals(TAB_EURO)) {
						local22 = 128;
					} else if (local42.strEquals(TAB_COPY)) {
						local22 = 169;
					} else {
						if (!local42.strEquals(TAG_REG)) {
							if (local42.startsWith(TAG_IMG)) {
								try {
									local120 = local42.substring(4).parseInt();
									@Pc(125) IndexedSprite local125 = this.nameIcons[local120];
									@Pc(136) int local136 = this.nameIconHeights == null ? local125.innerHeight : this.nameIconHeights[local120];
									if (alphaOverride == 256) {
										local125.renderTransparent(arg1, local4 + this.lineHeight - local136);
									} else {
										local125.method3335(arg1, local4 + this.lineHeight - local136, alphaOverride);
									}
									arg1 += local125.innerWidth;
									local8 = 0;
								} catch (@Pc(168) Exception local168) {
								}
							} else {
								this.parseTag(local42);
							}
							continue;
						}
						local22 = 174;
					}
				}
				if (local6 == -1) {
					if (this.kerning != null && local8 != 0) {
						arg1 += this.kerning[(local8 << 8) + local22];
					}
					@Pc(197) int local197 = this.spriteInnerWidths[local22];
					local120 = this.spriteInnerHeights[local22];
					if (local22 == 32) {
						if (spaceWidth > 0) {
							extraSpaceWidth += spaceWidth;
							arg1 += extraSpaceWidth >> 8;
							extraSpaceWidth &= 0xFF;
						}
					} else if (alphaOverride == 256) {
						if (shadowColorOverride != -1) {
							this.renderGlyph(local22, arg1 + this.spriteXOffsets[local22] + 1, local4 + this.spriteYOffsets[local22] + 1, local197, local120, shadowColorOverride);
						}
						this.renderGlyph(local22, arg1 + this.spriteXOffsets[local22], local4 + this.spriteYOffsets[local22], local197, local120, colorOverride);
					} else {
						if (shadowColorOverride != -1) {
							this.renderGlyphTransparent(local22, arg1 + this.spriteXOffsets[local22] + 1, local4 + this.spriteYOffsets[local22] + 1, local197, local120, shadowColorOverride, alphaOverride);
						}
						this.renderGlyphTransparent(local22, arg1 + this.spriteXOffsets[local22], local4 + this.spriteYOffsets[local22], local197, local120, colorOverride, alphaOverride);
					}
					@Pc(323) int local323 = this.glyphWidths[local22];
					if (strikethroughColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.method1174(arg1, local4 + (int) ((double) this.lineHeight * 0.7D), local323, strikethroughColor);
						} else {
							SoftwareRaster.drawHorizontalLine(arg1, local4 + (int) ((double) this.lineHeight * 0.7D), local323, strikethroughColor);
						}
					}
					if (underlineColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.method1174(arg1, local4 + this.lineHeight + 1, local323, underlineColor);
						} else {
							SoftwareRaster.drawHorizontalLine(arg1, local4 + this.lineHeight + 1, local323, underlineColor);
						}
					}
					arg1 += local323;
					local8 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void renderGlyph(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void renderGlyphTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lclient!na;I)I")
	public final int getMaxLineWidth(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.splitParagraph(arg0, new int[]{arg1}, lines);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.getStringWidth(lines[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIII)V")
	public final void renderLeft(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.setColors(arg3, arg4);
			this.render(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;)I")
	public final int getStringWidth(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(23) int local23 = arg0.charAt(local15);
			if (local23 == 60) {
				local5 = local15;
			} else {
				if (local23 == 62 && local5 != -1) {
					@Pc(43) JagString local43 = arg0.substring(local15, local5 + 1);
					local5 = -1;
					if (local43.strEquals(TAG_LT)) {
						local23 = 60;
					} else if (local43.strEquals(TAG_GT)) {
						local23 = 62;
					} else if (local43.strEquals(TAG_NBSP)) {
						local23 = 160;
					} else if (local43.strEquals(TAB_SHY)) {
						local23 = 173;
					} else if (local43.strEquals(TAB_TIMES)) {
						local23 = 215;
					} else if (local43.strEquals(TAB_EURO)) {
						local23 = 128;
					} else if (local43.strEquals(TAB_COPY)) {
						local23 = 169;
					} else {
						if (!local43.strEquals(TAG_REG)) {
							if (local43.startsWith(TAG_IMG)) {
								try {
									@Pc(121) int local121 = local43.substring(4).parseInt();
									local9 += this.nameIcons[local121].innerWidth;
									local7 = 0;
								} catch (@Pc(133) Exception local133) {
								}
							}
							continue;
						}
						local23 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.glyphWidths[local23];
					if (this.kerning != null && local7 != 0) {
						local9 += this.kerning[(local7 << 8) + local23];
					}
					local7 = local23;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIIILjava/util/Random;I)I")
	public final int method2859(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed(arg4);
		this.setColors(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int local21 = arg0.length();
		@Pc(24) int[] local24 = new int[local21];
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local21; local28++) {
			local24[local28] = local26;
			if ((arg3.nextInt() & 0x3) == 0) {
				local26++;
			}
		}
		this.renderOffset(arg0, arg1, arg2, local24, null);
		return local26;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Lclient!na;I)I")
	public final int getParagraphLineCount(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1) {
		return this.splitParagraph(arg0, new int[]{arg1}, lines);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lclient!na;)V")
	private void parseTag(@OriginalArg(0) JagString arg0) {
		try {
			if (arg0.startsWith(TAG_COL1)) {
				colorOverride = arg0.substring(4).parseHexString(16);
			} else if (arg0.strEquals(TAG_COL2)) {
				colorOverride = color;
			} else if (arg0.startsWith(TAG_TRANS1)) {
				alphaOverride = arg0.substring(6).parseInt();
			} else if (arg0.strEquals(TAG_TRANS2)) {
				alphaOverride = alpha;
			} else if (arg0.startsWith(TAG_STR1)) {
				strikethroughColor = arg0.substring(4).parseHexString(16);
			} else if (arg0.strEquals(TAG_STR2)) {
				strikethroughColor = 0x800000;
			} else if (arg0.strEquals(TAG_STR3)) {
				strikethroughColor = -1;
			} else if (arg0.startsWith(TAG_U1)) {
				underlineColor = arg0.substring(2).parseHexString(16);
			} else if (arg0.strEquals(TAG_U2)) {
				underlineColor = 0;
			} else if (arg0.strEquals(TAG_U3)) {
				underlineColor = -1;
			} else if (arg0.startsWith(TAG_SHAD1)) {
				shadowColorOverride = arg0.substring(5).parseHexString(16);
			} else if (arg0.strEquals(TAG_SHAD2)) {
				shadowColorOverride = 0;
			} else if (arg0.strEquals(TAG_SHAD3)) {
				shadowColorOverride = shadowColor;
			} else if (arg0.strEquals(TAG_BR)) {
				this.setColors(color, shadowColor, alpha);
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)I")
	private int getGlyphWidth(@OriginalArg(0) int arg0) {
		return this.glyphWidths[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lclient!na;IIII)V")
	public final void renderRight(@OriginalArg(0) JagString string, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (string != null) {
			this.setColors(arg3, arg4);
			this.render(string, x - this.getStringWidth(string), y);
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(Lclient!na;I)V")
	private void justify(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(7) int local7 = arg0.length();
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			@Pc(17) int local17 = arg0.charAt(local9);
			if (local17 == 60) {
				local3 = true;
			} else if (local17 == 62) {
				local3 = false;
			} else if (!local3 && local17 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			spaceWidth = (arg1 - this.getStringWidth(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;[I[Lclient!na;)I")
	public final int splitParagraph(@OriginalArg(0) JagString arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) JagString[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		buffer.method3133(0);
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(37) int local37 = arg0.charAt(local29);
			if (local37 == 60) {
				local19 = local29;
			} else {
				if (local37 == 62 && local19 != -1) {
					@Pc(57) JagString local57 = arg0.substring(local29, local19 + 1);
					local19 = -1;
					buffer.append(60);
					buffer.method3113(local57);
					buffer.append(62);
					if (local57.strEquals(TAG_BR)) {
						if (arg2[local23] == null) {
							arg2[local23] = buffer.asString().substring(buffer.length(), local11);
						} else {
							arg2[local23].method3133(0);
							arg2[local23].method3122(buffer, local11, buffer.length());
						}
						local23++;
						local11 = buffer.length();
						local9 = 0;
						local13 = -1;
						local21 = 0;
					} else if (local57.strEquals(TAG_LT)) {
						local9 += this.getGlyphWidth(60);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local57.strEquals(TAG_GT)) {
						local9 += this.getGlyphWidth(62);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local57.strEquals(TAG_NBSP)) {
						local9 += this.getGlyphWidth(160);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local57.strEquals(TAB_SHY)) {
						local9 += this.getGlyphWidth(173);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local57.strEquals(TAB_TIMES)) {
						local9 += this.getGlyphWidth(215);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local57.strEquals(TAB_EURO)) {
						local9 += this.getGlyphWidth(128);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local57.strEquals(TAB_COPY)) {
						local9 += this.getGlyphWidth(169);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local57.strEquals(TAG_REG)) {
						local9 += this.getGlyphWidth(174);
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local57.startsWith(TAG_IMG)) {
						try {
							@Pc(377) int local377 = local57.substring(4).parseInt();
							local9 += this.nameIcons[local377].innerWidth;
							local21 = 0;
						} catch (@Pc(389) Exception local389) {
						}
					}
					local37 = 0;
				}
				if (local19 == -1) {
					if (local37 != 0) {
						buffer.append(local37);
						local9 += this.glyphWidths[local37];
						if (this.kerning != null && local21 != 0) {
							local9 += this.kerning[(local21 << 8) + local37];
						}
						local21 = local37;
					}
					if (local37 == 32) {
						local13 = buffer.length();
						local15 = local9;
						local17 = 1;
					}
					if (arg1 != null && local9 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						if (arg2[local23] == null) {
							arg2[local23] = buffer.asString().substring(local13 - local17, local11);
						} else {
							arg2[local23].method3133(0);
							arg2[local23] = arg2[local23].method3122(buffer, local11, local13 - local17);
						}
						local23++;
						local11 = local13;
						local13 = -1;
						local9 -= local15;
						local21 = 0;
					}
					if (local37 == 45) {
						local13 = buffer.length();
						local15 = local9;
						local17 = 0;
					}
				}
			}
		}
		if (buffer.length() > local11) {
			if (arg2[local23] == null) {
				arg2[local23] = buffer.asString().substring(buffer.length(), local11);
			} else {
				arg2[local23].method3133(0);
				arg2[local23] = arg2[local23].method3122(buffer, local11, buffer.length());
			}
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIIIII)V")
	public final void renderShake(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.setColors(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int local23 = arg0.length();
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = (int) (Math.sin((double) local28 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.renderOffset(arg0, arg1 - this.getStringWidth(arg0) / 2, arg2, null, local26);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIIIIIIIII)I")
	public final int renderParagraphAlpha(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.setColors(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.lineHeight;
		}
		@Pc(20) int[] local20 = new int[]{arg3};
		if (arg4 < this.paragraphTopPadding + this.paragraphBottomPadding + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.splitParagraph(arg0, local20, lines);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.paragraphTopPadding;
		} else if (arg8 == 1) {
			local57 = arg2 + this.paragraphTopPadding + (arg4 - this.paragraphTopPadding - this.paragraphBottomPadding - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.paragraphBottomPadding - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.paragraphTopPadding - this.paragraphBottomPadding - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.paragraphTopPadding + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.render(lines[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.render(lines[local118], arg1 + (arg3 - this.getStringWidth(lines[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.render(lines[local118], arg1 + arg3 - this.getStringWidth(lines[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.render(lines[local118], arg1, local57);
			} else {
				this.justify(lines[local118], arg3);
				this.render(lines[local118], arg1, local57);
				spaceWidth = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIIII)V")
	public final void renderWave2(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.setColors(arg3, 0);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		@Pc(16) int[] local16 = new int[local10];
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local13[local18] = (int) (Math.sin((double) local18 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local16[local18] = (int) (Math.sin((double) local18 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.renderOffset(arg0, arg1 - this.getStringWidth(arg0) / 2, arg2, local13, local16);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lclient!na;IIIII)V")
	public final void renderWave(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.setColors(arg3, 0);
		@Pc(10) int local10 = arg0.length();
		@Pc(13) int[] local13 = new int[local10];
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			local13[local15] = (int) (Math.sin((double) local15 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.renderOffset(arg0, arg1 - this.getStringWidth(arg0) / 2, arg2, null, local13);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([Lclient!ok;[I)V")
	public final void setNameIcons(@OriginalArg(0) IndexedSprite[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.nameIcons = arg0;
		this.nameIconHeights = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)V")
	private void setColors(@OriginalArg(0) int rgb, @OriginalArg(1) int shadow) {
		strikethroughColor = -1;
		underlineColor = -1;
		shadowColor = shadow;
		shadowColorOverride = shadow;
		color = rgb;
		colorOverride = rgb;
		alpha = 256;
		alphaOverride = 256;
		spaceWidth = 0;
		extraSpaceWidth = 0;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Lclient!na;IIII)V")
	public final void renderCenter(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.setColors(arg3, arg4);
			this.render(arg0, arg1 - this.getStringWidth(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([B)V")
	private void decode(@OriginalArg(0) byte[] arg0) {
		this.glyphWidths = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.glyphWidths.length; local9++) {
				this.glyphWidths[local9] = arg0[local9] & 0xFF;
			}
			this.lineHeight = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.glyphWidths[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		@Pc(60) int local60;
		for (local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (local60 = 0; local60 < 256; local60++) {
			local58[local60] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(109) int local109;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(107) byte local107 = 0;
			for (local109 = 0; local109 < local93[local95].length; local109++) {
				local107 += arg0[local9++];
				local93[local95][local109] = local107;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(138) int local138;
		for (local138 = 0; local138 < 256; local138++) {
			local136[local138] = new byte[local55[local138]];
			@Pc(150) byte local150 = 0;
			for (@Pc(152) int local152 = 0; local152 < local136[local138].length; local152++) {
				local150 += arg0[local9++];
				local136[local138][local152] = local150;
			}
		}
		this.kerning = new byte[65536];
		for (local138 = 0; local138 < 256; local138++) {
			if (local138 != 32 && local138 != 160) {
				for (local109 = 0; local109 < 256; local109++) {
					if (local109 != 32 && local109 != 160) {
						this.kerning[(local138 << 8) + local109] = (byte) method2870(local93, local136, local58, this.glyphWidths, local55, local138, local109);
					}
				}
			}
		}
		this.lineHeight = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	private void setColors(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		strikethroughColor = -1;
		underlineColor = -1;
		shadowColor = arg1;
		shadowColorOverride = arg1;
		color = arg0;
		colorOverride = arg0;
		alpha = arg2;
		alphaOverride = arg2;
		spaceWidth = 0;
		extraSpaceWidth = 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;IIIIIIIILjava/util/Random;I[I)I")
	public final int method2878(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed(arg10);
		this.setColors(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
		@Pc(21) int local21 = arg0.length();
		@Pc(24) int[] local24 = new int[local21];
		@Pc(26) int local26 = 0;
		@Pc(28) int local28;
		for (local28 = 0; local28 < local21; local28++) {
			local24[local28] = local26;
			if ((arg9.nextInt() & 0x3) == 0) {
				local26++;
			}
		}
		local28 = arg1;
		@Pc(50) int local50 = arg2 + this.paragraphTopPadding;
		@Pc(52) int local52 = -1;
		if (arg8 == 1) {
			local50 += (arg4 - this.paragraphTopPadding - this.paragraphBottomPadding) / 2;
		} else if (arg8 == 2) {
			local50 = arg2 + arg4 - this.paragraphBottomPadding;
		}
		if (arg7 == 1) {
			local52 = this.getStringWidth(arg0) + local26;
			local28 = arg1 + (arg3 - local52) / 2;
		} else if (arg7 == 2) {
			local52 = this.getStringWidth(arg0) + local26;
			local28 = arg1 + arg3 - local52;
		}
		this.renderOffset(arg0, local28, local50, local24, null);
		if (arg11 != null) {
			if (local52 == -1) {
				local52 = this.getStringWidth(arg0) + local26;
			}
			arg11[0] = local28;
			arg11[1] = local50 - this.paragraphTopPadding;
			arg11[2] = local52;
			arg11[3] = this.paragraphTopPadding + this.paragraphBottomPadding;
		}
		return local26;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!na;II[I[I)V")
	private void renderOffset(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.lineHeight;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(24) int local24 = arg0.charAt(local16);
			if (local24 == 60) {
				local6 = local16;
			} else {
				@Pc(121) int local121;
				@Pc(130) int local130;
				@Pc(141) int local141;
				if (local24 == 62 && local6 != -1) {
					@Pc(44) JagString local44 = arg0.substring(local16, local6 + 1);
					local6 = -1;
					if (local44.strEquals(TAG_LT)) {
						local24 = 60;
					} else if (local44.strEquals(TAG_GT)) {
						local24 = 62;
					} else if (local44.strEquals(TAG_NBSP)) {
						local24 = 160;
					} else if (local44.strEquals(TAB_SHY)) {
						local24 = 173;
					} else if (local44.strEquals(TAB_TIMES)) {
						local24 = 215;
					} else if (local44.strEquals(TAB_EURO)) {
						local24 = 128;
					} else if (local44.strEquals(TAB_COPY)) {
						local24 = 169;
					} else {
						if (!local44.strEquals(TAG_REG)) {
							if (local44.startsWith(TAG_IMG)) {
								try {
									if (arg3 == null) {
										local121 = 0;
									} else {
										local121 = arg3[local10];
									}
									if (arg4 == null) {
										local130 = 0;
									} else {
										local130 = arg4[local10];
									}
									local10++;
									local141 = local44.substring(4).parseInt();
									@Pc(146) IndexedSprite local146 = this.nameIcons[local141];
									@Pc(157) int local157 = this.nameIconHeights == null ? local146.innerHeight : this.nameIconHeights[local141];
									if (alphaOverride == 256) {
										local146.renderTransparent(arg1 + local121, local4 + this.lineHeight - local157 + local130);
									} else {
										local146.method3335(arg1 + local121, local4 + this.lineHeight - local157 + local130, alphaOverride);
									}
									arg1 += local146.innerWidth;
									local8 = 0;
								} catch (@Pc(197) Exception local197) {
								}
							} else {
								this.parseTag(local44);
							}
							continue;
						}
						local24 = 174;
					}
				}
				if (local6 == -1) {
					if (this.kerning != null && local8 != 0) {
						arg1 += this.kerning[(local8 << 8) + local24];
					}
					@Pc(226) int local226 = this.spriteInnerWidths[local24];
					local121 = this.spriteInnerHeights[local24];
					if (arg3 == null) {
						local130 = 0;
					} else {
						local130 = arg3[local10];
					}
					if (arg4 == null) {
						local141 = 0;
					} else {
						local141 = arg4[local10];
					}
					local10++;
					if (local24 == 32) {
						if (spaceWidth > 0) {
							extraSpaceWidth += spaceWidth;
							arg1 += extraSpaceWidth >> 8;
							extraSpaceWidth &= 0xFF;
						}
					} else if (alphaOverride == 256) {
						if (shadowColorOverride != -1) {
							this.renderGlyph(local24, arg1 + this.spriteXOffsets[local24] + local130 + 1, local4 + this.spriteYOffsets[local24] + 1 + local141, local226, local121, shadowColorOverride);
						}
						this.renderGlyph(local24, arg1 + this.spriteXOffsets[local24] + local130, local4 + this.spriteYOffsets[local24] + local141, local226, local121, colorOverride);
					} else {
						if (shadowColorOverride != -1) {
							this.renderGlyphTransparent(local24, arg1 + this.spriteXOffsets[local24] + local130 + 1, local4 + this.spriteYOffsets[local24] + 1 + local141, local226, local121, shadowColorOverride, alphaOverride);
						}
						this.renderGlyphTransparent(local24, arg1 + this.spriteXOffsets[local24] + local130, local4 + this.spriteYOffsets[local24] + local141, local226, local121, colorOverride, alphaOverride);
					}
					@Pc(387) int local387 = this.glyphWidths[local24];
					if (strikethroughColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.method1174(arg1, local4 + (int) ((double) this.lineHeight * 0.7D), local387, strikethroughColor);
						} else {
							SoftwareRaster.drawHorizontalLine(arg1, local4 + (int) ((double) this.lineHeight * 0.7D), local387, strikethroughColor);
						}
					}
					if (underlineColor != -1) {
						if (GlRenderer.enabled) {
							GlRaster.method1174(arg1, local4 + this.lineHeight, local387, underlineColor);
						} else {
							SoftwareRaster.drawHorizontalLine(arg1, local4 + this.lineHeight, local387, underlineColor);
						}
					}
					arg1 += local387;
					local8 = local24;
				}
			}
		}
	}
}
