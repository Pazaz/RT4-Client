import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method619(@OriginalArg(1) int color) {
		WaterMaterialRenderer.aFloatArray2[0] = (float) (color >> 16 & 0xFF) / 255.0F;
		WaterMaterialRenderer.aFloatArray2[1] = (float) (color >> 8 & 0xFF) / 255.0F;
		WaterMaterialRenderer.aFloatArray2[2] = (float) (color & 0xFF) / 255.0F;
		Static128.method2481(3);
		Static128.method2481(4);
	}

}
