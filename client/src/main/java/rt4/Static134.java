package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!ek;")
	public static SoftwareIndexedSprite method2619() {
		@Pc(25) SoftwareIndexedSprite local25 = new SoftwareIndexedSprite(SpriteLoader.width, SpriteLoader.height, SpriteLoader.xOffsets[0], SpriteLoader.yOffsets[0], SpriteLoader.innerWidths[0], SpriteLoader.innerHeights[0], SpriteLoader.pixels[0], SpriteLoader.palette);
		SpriteLoader.clear();
		return local25;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIBII)V")
	public static void method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 + 1;
		TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[arg2], arg4, arg1, arg0);
		@Pc(17) int local17 = arg3 - 1;
		TextureOp29SubOp4.method2576(TextureOp29SubOp4.anIntArrayArray10[arg3], arg4, arg1, arg0);
		for (@Pc(29) int local29 = local8; local29 <= local17; local29++) {
			@Pc(40) int[] local40 = TextureOp29SubOp4.anIntArrayArray10[local29];
			local40[arg4] = local40[arg1] = arg0;
		}
	}

}
