package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[Lclient!tk;")
	public static final SeqType[] aClass144Array1 = new SeqType[14];

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt3508 = 99;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!wa;Lclient!na;)I")
	public static int method2748(@OriginalArg(1) Buffer arg0, @OriginalArg(2) JagString arg1) {
		@Pc(6) int local6 = arg0.offset;
		@Pc(14) byte[] local14 = arg1.method3148();
		arg0.pSmart1or2(local14.length);
		arg0.offset += WordPack.codec.method1550(local14.length, arg0.data, local14, 0, arg0.offset);
		return arg0.offset - local6;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		Static235.anInt5276 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static152.mapSizeX; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static99.mapSizeZ; local8++) {
				if (SceneGraph.tiles[arg0][local3][local8] == null) {
					SceneGraph.tiles[arg0][local3][local8] = new Tile(arg0, local3, local8);
				}
			}
		}
	}
}
