package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "[I")
	public static final int[] anIntArray471 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_1010 = JagString.parse("null");

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ec;)V")
	public static void method4193(@OriginalArg(0) Scenery arg0) {
		for (@Pc(2) int local2 = arg0.anInt1701; local2 <= arg0.anInt1713; local2++) {
			for (@Pc(9) int local9 = arg0.anInt1696; local9 <= arg0.anInt1698; local9++) {
				@Pc(22) Tile local22 = SceneGraph.tiles[arg0.anInt1709][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.sceneryLen; local26++) {
						if (local22.scenery[local26] == arg0) {
							local22.sceneryLen--;
							for (@Pc(44) int local44 = local26; local44 < local22.sceneryLen; local44++) {
								local22.scenery[local44] = local22.scenery[local44 + 1];
								local22.anIntArray59[local44] = local22.anIntArray59[local44 + 1];
							}
							local22.scenery[local22.sceneryLen] = null;
							break;
						}
					}
					local22.anInt664 = 0;
					for (local26 = 0; local26 < local22.sceneryLen; local26++) {
						local22.anInt664 |= local22.anIntArray59[local26];
					}
				}
			}
		}
	}
}