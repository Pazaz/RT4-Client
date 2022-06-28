package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;
import java.awt.Font;
import java.awt.*;
import java.awt.image.PixelGrabber;

@OriginalClass("client!fd")
public final class WorldMapFont {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Ljava/lang/String;")
	public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + 'Ä' + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß' + 'Á' + 'À' + 'É' + 'È' + 'Í' + 'Ì' + 'Ó' + 'Ò' + 'Ú' + 'Ù' + 'á' + 'à' + 'é' + 'è' + 'í' + 'ì' + 'ó' + 'ò' + 'ú' + 'ù' + 'Â' + 'Ê' + 'Î' + 'Ô' + 'Û' + 'â' + 'ê' + 'î' + 'ô' + 'û' + 'Æ' + 'æ';

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public static final int ALPHABET_SIZE = ALPHABET.length();

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
	private static final int[] CHAR_INDEXES = new int[256];

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	private int dataIndex;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
	private boolean grayscale;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[B")
	private byte[] data = new byte[100000];

	static {
		for (@Pc(146) int local146 = 0; local146 < 256; local146++) {
			@Pc(153) int local153 = ALPHABET.indexOf(local146);
			if (local153 == -1) {
				local153 = 74;
			}
			CHAR_INDEXES[local146] = local153 * 9;
		}
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
	public WorldMapFont(@OriginalArg(0) int size, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component component) {
		this.dataIndex = ALPHABET_SIZE * 9;
		this.grayscale = false;
		@Pc(30) Font font = new Font("Helvetica", Font.BOLD, size);
		@Pc(34) FontMetrics boldMetrics = component.getFontMetrics(font);
		@Pc(36) int i;
		for (i = 0; i < ALPHABET_SIZE; i++) {
			this.preRenderGlyph(font, boldMetrics, ALPHABET.charAt(i), i, false);
		}
		if (this.grayscale) {
			this.dataIndex = ALPHABET_SIZE * 9;
			this.grayscale = false;
			font = new Font("Helvetica", Font.PLAIN, size);
			boldMetrics = component.getFontMetrics(font);
			for (i = 0; i < ALPHABET_SIZE; i++) {
				this.preRenderGlyph(font, boldMetrics, ALPHABET.charAt(i), i, false);
			}
			if (!this.grayscale) {
				this.dataIndex = ALPHABET_SIZE * 9;
				this.grayscale = false;
				for (i = 0; i < ALPHABET_SIZE; i++) {
					this.preRenderGlyph(font, boldMetrics, ALPHABET.charAt(i), i, true);
				}
			}
		}
		@Pc(121) byte[] data = new byte[this.dataIndex];
		for (@Pc(123) int j = 0; j < this.dataIndex; j++) {
			data[j] = this.data[j];
		}
		this.data = data;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!na;IIIZ)V")
	private void renderString(@OriginalArg(0) JagString s, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int color, @OriginalArg(4) boolean shadow) {
		if (this.grayscale || color == 0) {
			shadow = false;
		}
		for (@Pc(8) int i = 0; i < s.length(); i++) {
			@Pc(20) int index = CHAR_INDEXES[s.charAt(i)];
			if (shadow) {
				this.renderGlyph(index, x + 1, y, 1, this.data);
				this.renderGlyph(index, x, y + 1, 1, this.data);
			}
			this.renderGlyph(index, x, y, color, this.data);
			x += this.data[index + 7];
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	public final int method1503() {
		return this.data[8] - 1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([I[BIIIIIII)V")
	private void renderGlyphGrayscale(@OriginalArg(0) int[] dest, @OriginalArg(1) byte[] src, @OriginalArg(2) int color, @OriginalArg(3) int srcIndex, @OriginalArg(4) int destIndex, @OriginalArg(5) int w, @OriginalArg(6) int h, @OriginalArg(7) int destStride, @OriginalArg(8) int srcStride) {
		for (@Pc(2) int y = -h; y < 0; y++) {
			for (@Pc(7) int x = -w; x < 0; x++) {
				@Pc(16) int intensity = src[srcIndex++] & 0xFF;
				if (intensity <= 30) {
					destIndex++;
				} else if (intensity >= 230) {
					dest[destIndex++] = color;
				} else {
					@Pc(32) int backgroundColor = dest[destIndex];
					dest[destIndex++] = ((color & 0xFF00FF) * intensity + (backgroundColor & 0xFF00FF) * (256 - intensity) & 0xFF00FF00) + ((color & 0xFF00) * intensity + (backgroundColor & 0xFF00) * (256 - intensity) & 0xFF0000) >> 8;
				}
			}
			destIndex += destStride;
			srcIndex += srcStride;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII[B)V")
	private void renderGlyph(@OriginalArg(0) int index, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] src) {
		@Pc(7) int local7 = arg1 + src[index + 5];
		@Pc(15) int local15 = arg2 - src[index + 6];
		@Pc(21) int width = src[index + 3];
		@Pc(27) int height = src[index + 4];
		@Pc(47) int srcIndex = src[index] * 16384 + src[index + 1] * 128 + src[index + 2];
		@Pc(53) int destIndex = local7 + local15 * SoftwareRaster.width;
		@Pc(57) int destStride = SoftwareRaster.width - width;
		@Pc(59) int srcStride = 0;
		@Pc(66) int local66;
		if (local15 < SoftwareRaster.clipTop) {
			local66 = SoftwareRaster.clipTop - local15;
			height -= local66;
			local15 = SoftwareRaster.clipTop;
			srcIndex += local66 * width;
			destIndex += local66 * SoftwareRaster.width;
		}
		if (local15 + height >= SoftwareRaster.clipBottom) {
			height -= local15 + height + 1 - SoftwareRaster.clipBottom;
		}
		if (local7 < SoftwareRaster.clipLeft) {
			local66 = SoftwareRaster.clipLeft - local7;
			width -= local66;
			local7 = SoftwareRaster.clipLeft;
			srcIndex += local66;
			destIndex += local66;
			srcStride = local66;
			destStride += local66;
		}
		if (local7 + width >= SoftwareRaster.clipRight) {
			local66 = local7 + width + 1 - SoftwareRaster.clipRight;
			width -= local66;
			srcStride += local66;
			destStride += local66;
		}
		if (width <= 0 || height <= 0) {
			return;
		}
		if (this.grayscale) {
			this.renderGlyphGrayscale(SoftwareRaster.pixels, src, arg3, srcIndex, destIndex, width, height, destStride, srcStride);
		} else {
			this.renderGlyphMono(SoftwareRaster.pixels, src, arg3, srcIndex, destIndex, width, height, destStride, srcStride);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "([I[BIIIIIII)V")
	private void renderGlyphMono(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lclient!na;IIIZ)V")
	public final void renderStringCenter(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = this.getStringWidth(arg0) / 2;
		@Pc(8) int local8 = this.method1511();
		if (arg1 - local5 <= SoftwareRaster.clipRight && (arg1 + local5 >= SoftwareRaster.clipLeft && (arg2 - local8 <= SoftwareRaster.clipBottom && arg2 >= 0))) {
			this.renderString(arg0, arg1 - local5, arg2, arg3, true);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void preRenderGlyph(@OriginalArg(0) Font arg0, @OriginalArg(1) FontMetrics arg1, @OriginalArg(2) char arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) int local3 = arg1.charWidth(arg2);
		@Pc(5) int local5 = local3;
		if (arg4) {
			try {
				if (arg2 == '/') {
					arg4 = false;
				}
				if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W') {
					local3++;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		@Pc(48) int local48 = arg1.getMaxAscent();
		@Pc(54) int local54 = arg1.getMaxAscent() + arg1.getMaxDescent();
		@Pc(57) int local57 = arg1.getHeight();
		@Pc(62) Image local62 = GameShell.canvas.createImage(local3, local54);
		@Pc(65) Graphics local65 = local62.getGraphics();
		local65.setColor(Color.black);
		local65.fillRect(0, 0, local3, local54);
		local65.setColor(Color.white);
		local65.setFont(arg0);
		local65.drawString(arg2 + "", 0, local48);
		if (arg4) {
			local65.drawString(arg2 + "", 1, local48);
		}
		@Pc(111) int[] local111 = new int[local3 * local54];
		@Pc(123) PixelGrabber local123 = new PixelGrabber(local62, 0, 0, local3, local54, local111, 0, local3);
		try {
			local123.grabPixels();
		} catch (@Pc(128) Exception local128) {
		}
		local62.flush();
		@Pc(134) int local134 = 0;
		@Pc(136) int local136 = 0;
		@Pc(138) int local138 = local3;
		@Pc(140) int local140 = local54;
		@Pc(142) int local142;
		@Pc(147) int local147;
		@Pc(158) int local158;
		label135:
		for (local142 = 0; local142 < local54; local142++) {
			for (local147 = 0; local147 < local3; local147++) {
				local158 = local111[local147 + local142 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local136 = local142;
					break label135;
				}
			}
		}
		label123:
		for (local142 = 0; local142 < local3; local142++) {
			for (local147 = 0; local147 < local54; local147++) {
				local158 = local111[local142 + local147 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local134 = local142;
					break label123;
				}
			}
		}
		label111:
		for (local142 = local54 - 1; local142 >= 0; local142--) {
			for (local147 = 0; local147 < local3; local147++) {
				local158 = local111[local147 + local142 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local140 = local142 + 1;
					break label111;
				}
			}
		}
		label99:
		for (local142 = local3 - 1; local142 >= 0; local142--) {
			for (local147 = 0; local147 < local54; local147++) {
				local158 = local111[local142 + local147 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local138 = local142 + 1;
					break label99;
				}
			}
		}
		this.data[arg3 * 9] = (byte) (this.dataIndex / 16384);
		this.data[arg3 * 9 + 1] = (byte) (this.dataIndex / 128 & 0x7F);
		this.data[arg3 * 9 + 2] = (byte) (this.dataIndex & 0x7F);
		this.data[arg3 * 9 + 3] = (byte) (local138 - local134);
		this.data[arg3 * 9 + 4] = (byte) (local140 - local136);
		this.data[arg3 * 9 + 5] = (byte) local134;
		this.data[arg3 * 9 + 6] = (byte) (local48 - local136);
		this.data[arg3 * 9 + 7] = (byte) local5;
		this.data[arg3 * 9 + 8] = (byte) local57;
		for (local142 = local136; local142 < local140; local142++) {
			for (local147 = local134; local147 < local138; local147++) {
				local158 = local111[local147 + local142 * local3] & 0xFF;
				if (local158 > 30 && local158 < 230) {
					this.grayscale = true;
				}
				this.data[this.dataIndex++] = (byte) local158;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!na;)I")
	private int getStringWidth(@OriginalArg(0) JagString arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			if (arg0.charAt(local3) == 64 && local3 + 4 < arg0.length() && arg0.charAt(local3 + 4) == 64) {
				local3 += 4;
			} else if (arg0.charAt(local3) == 126 && local3 + 4 < arg0.length() && arg0.charAt(local3 + 4) == 126) {
				local3 += 4;
			} else {
				local1 += this.data[CHAR_INDEXES[arg0.charAt(local3)] + 7];
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()I")
	public final int method1511() {
		return this.data[6];
	}
}
