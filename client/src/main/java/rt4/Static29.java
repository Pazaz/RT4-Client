package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

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

}
