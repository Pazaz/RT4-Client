import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class TextureOpTiledSprite extends TextureOpSprite {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195 && this.method2573()) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(32) int local32 = arg0 % this.anInt3240 * this.anInt3240;
			@Pc(36) int[] local36 = local11[1];
			@Pc(40) int[] local40 = local11[2];
			for (@Pc(42) int local42 = 0; local42 < Static189.anInt4457; local42++) {
				@Pc(55) int local55 = this.anIntArray305[local32 + local42 % this.anInt3239];
				local40[local42] = (local55 & 0xFF) << 4;
				local36[local42] = local55 >> 4 & 0xFF0;
				local24[local42] = local55 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
