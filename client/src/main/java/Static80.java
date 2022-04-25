import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
	public static int anInt4696;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "[[[I")
	public static int[][][] underWaterTileHeightMap;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public static int anInt4701;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
	public static int anInt4702;

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_886 = Static28.parse(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ve;IIB)Lclient!mm;")
	public static SoftwareSprite loadSoftwareAlphaSprite(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1) {
		return SpriteLoader.decode(arg0, 0, arg1) ? Static102.method2071() : null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)V")
	public static void method3616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		WorldMap.anInt3482 = arg0 - WorldMap.originX;
		@Pc(24) int local24 = WorldMap.anInt3482 - (int) ((float) Static24.component.anInt445 / WorldMap.zoom);
		@Pc(33) int local33 = WorldMap.anInt3482 + (int) ((float) Static24.component.anInt445 / WorldMap.zoom);
		if (local24 < 0) {
			WorldMap.anInt3482 = (int) ((float) Static24.component.anInt445 / WorldMap.zoom);
		}
		WorldMap.anInt4901 = WorldMap.length + WorldMap.originZ - arg1 - 1;
		@Pc(61) int local61 = (int) ((float) Static24.component.anInt459 / WorldMap.zoom) + WorldMap.anInt4901;
		@Pc(70) int local70 = WorldMap.anInt4901 - (int) ((float) Static24.component.anInt459 / WorldMap.zoom);
		if (local33 > WorldMap.width) {
			WorldMap.anInt3482 = WorldMap.width - (int) ((float) Static24.component.anInt445 / WorldMap.zoom);
		}
		if (local70 < 0) {
			WorldMap.anInt4901 = (int) ((float) Static24.component.anInt459 / WorldMap.zoom);
		}
		if (WorldMap.length < local61) {
			WorldMap.anInt4901 = WorldMap.length - (int) ((float) Static24.component.anInt459 / WorldMap.zoom);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!na;II)V")
	public static void method3617(@OriginalArg(0) JagString arg0, @OriginalArg(2) int arg1) {
		@Pc(6) DelayedStateChange local6 = Static238.method4143(3, arg1);
		local6.pushServer();
		local6.stringArg = arg0;
	}
}
