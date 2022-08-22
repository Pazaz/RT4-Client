package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class FluType {

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public int saturation;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public int weightedHue;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	public int lightness;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	public int chroma;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	private int color = 0;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public int texture = -1;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public int anInt4156 = 128;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
	public boolean blockShadow = true;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
	private void rgbToHsl(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local8;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		if (local21 < local8) {
			local23 = local21;
		}
		if (local30 < local23) {
			local23 = local30;
		}
		@Pc(44) double local44 = local8;
		@Pc(54) double local54 = 0.0D;
		if (local21 > local8) {
			local44 = local21;
		}
		if (local30 > local44) {
			local44 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local44 + local23) / 2.0D;
		if (local23 != local44) {
			if (local74 < 0.5D) {
				local68 = (local44 - local23) / (local44 + local23);
			}
			if (local44 == local8) {
				local54 = (local21 - local30) / (-local23 + local44);
			} else if (local21 == local44) {
				local54 = (local30 - local8) / (local44 - local23) + 2.0D;
			} else if (local30 == local44) {
				local54 = (local8 - local21) / (-local23 + local44) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local44 - local23) / ((2.0D - local44) - local23);
			}
		}
		if (local74 > 0.5D) {
			this.chroma = (int) (local68 * (1.0D - local74) * 512.0D);
		} else {
			this.chroma = (int) (local68 * local74 * 512.0D);
		}
		if (this.chroma < 1) {
			this.chroma = 1;
		}
		this.saturation = (int) (local68 * 256.0D);
		this.lightness = (int) (local74 * 256.0D);
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		local54 /= 6.0D;
		this.weightedHue = (int) ((double) this.chroma * local54);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!wa;I)V")
	public final void decode(@OriginalArg(0) int id, @OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(7) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer, id);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILclient!wa;I)V")
	private void decode(@OriginalArg(1) int opcode, @OriginalArg(2) Buffer buffer, @OriginalArg(3) int arg2) {
		if (opcode == 1) {
			this.color = buffer.g3();
			this.rgbToHsl(this.color);
		} else if (opcode == 2) {
			this.texture = buffer.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (opcode == 3) {
			this.anInt4156 = buffer.g2();
		} else if (opcode == 4) {
			this.blockShadow = false;
		}
	}
}
