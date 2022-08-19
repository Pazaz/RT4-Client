package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class FloType {

	@OriginalMember(owner = "client!ca", name = "db", descriptor = "I")
	public static int anInt865 = 0;
	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
	public boolean blendTexture = false;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	public int texture = -1;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public int anInt5885 = 128;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	public int textureBrightness = 8;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int waterOpacity = 16;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public int secondaryColor = -1;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "Z")
	public boolean occludeUnderlay = true;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
	public int baseColor = 0;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int waterColor = 1190717;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public static int method492(@OriginalArg(1) int color) {
		return color == 16711935 ? -1 : ColorUtils.rgbToHsl(color);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!wa;I)V")
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int id) {
		while (true) {
			@Pc(5) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer, id);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!wa;I)V")
	private void decode(@OriginalArg(1) int opcode, @OriginalArg(2) Buffer buffer, @OriginalArg(3) int id) {
		if (opcode == 1) {
			this.baseColor = method492(buffer.g3());
		} else if (opcode == 2) {
			this.texture = buffer.g1();
		} else if (opcode == 3) {
			this.texture = buffer.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (opcode == 5) {
			this.occludeUnderlay = false;
		} else if (opcode == 7) {
			this.secondaryColor = method492(buffer.g3());
		} else if (opcode == 8) {
			anInt865 = id;
		} else if (opcode == 9) {
			this.anInt5885 = buffer.g2();
		} else if (opcode == 10) {
			this.aBoolean311 = false;
		} else if (opcode == 11) {
			this.textureBrightness = buffer.g1();
		} else if (opcode == 12) {
			this.blendTexture = true;
		} else if (opcode == 13) {
			this.waterColor = buffer.g3();
		} else if (opcode == 14) {
			/*
			 * Handles how deep into water the player is able to see,
			 * seems to (but not confirmed) work in jumps of 2, so: "0, 2, 4, 6" etc.
			 * It seems any number equals to or less than 0, removes any visual
			 * effect obscuring the depth view. The first increment in order,
			 * being 2, blocks almost 100% of the view of the underwater map (UM).
			 */
			this.waterOpacity = buffer.g1();
		}
	}
}
