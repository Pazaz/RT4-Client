package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt4941 = 1;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_930 = JagString.parse("(Z");

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
	public static void spawnGroundObject(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) LinkedList local9 = SceneGraph.objStacks[Player.level][arg1][arg0];
		if (local9 == null) {
			Static187.method3420(Player.level, arg1, arg0);
			return;
		}
		@Pc(28) int local28 = -99999999;
		@Pc(30) ObjStackNode local30 = null;
		@Pc(35) ObjStackNode local35;
		for (local35 = (ObjStackNode) local9.head(); local35 != null; local35 = (ObjStackNode) local9.next()) {
			@Pc(44) ObjType local44 = ObjTypeList.get(local35.value.type);
			@Pc(47) int local47 = local44.cost;
			if (local44.stackable == 1) {
				local47 *= local35.value.anInt5550 + 1;
			}
			if (local28 < local47) {
				local28 = local47;
				local30 = local35;
			}
		}
		if (local30 == null) {
			Static187.method3420(Player.level, arg1, arg0);
			return;
		}
		local9.addHead(local30);
		@Pc(89) ObjStack local89 = null;
		@Pc(91) ObjStack local91 = null;
		for (local35 = (ObjStackNode) local9.head(); local35 != null; local35 = (ObjStackNode) local9.next()) {
			@Pc(103) ObjStack local103 = local35.value;
			if (local103.type != local30.value.type) {
				if (local89 == null) {
					local89 = local103;
				}
				if (local103.type != local89.type && local91 == null) {
					local91 = local103;
				}
			}
		}
		@Pc(152) long local152 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static69.method1543(Player.level, arg1, arg0, SceneGraph.getTileHeight(Player.level, arg1 * 128 + 64, arg0 * 128 + 64), local30.value, local152, local89, local91);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public static void method3801() {
		for (@Pc(1) int local1 = 0; local1 < SceneGraph.anInt3114; local1++) {
			for (@Pc(6) int local6 = 0; local6 < SceneGraph.width; local6++) {
				for (@Pc(11) int local11 = 0; local11 < SceneGraph.length; local11++) {
					@Pc(22) Tile local22 = SceneGraph.tiles[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Wall local27 = local22.wall;
						if (local27 != null && local27.primary.method4543()) {
							Static69.method1544(local27.primary, local1, local6, local11, 1, 1);
							if (local27.aClass8_6 != null && local27.aClass8_6.method4543()) {
								Static69.method1544(local27.aClass8_6, local1, local6, local11, 1, 1);
								local27.primary.method4544(local27.aClass8_6, 0, 0, 0, false);
								local27.aClass8_6 = local27.aClass8_6.createModel();
							}
							local27.primary = local27.primary.createModel();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.sceneryLen; local83++) {
							@Pc(92) Scenery local92 = local22.scenery[local83];
							if (local92 != null && local92.primary.method4543()) {
								Static69.method1544(local92.primary, local1, local6, local11, local92.anInt1713 + 1 - local92.anInt1701, local92.anInt1698 - local92.anInt1696 + 1);
								local92.primary = local92.primary.createModel();
							}
						}
						@Pc(131) GroundDecor local131 = local22.groundDecor;
						if (local131 != null && local131.primary.method4543()) {
							Static264.method3574(local131.primary, local1, local6, local11);
							local131.primary = local131.primary.createModel();
						}
					}
				}
			}
		}
	}
}
