package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!be;")
	public static Component aClass13_11;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIILclient!th;IJZ)Z")
	public static boolean method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Entity arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static105.method2256(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILclient!mj;)V")
	public static void method1144(@OriginalArg(1) int z, @OriginalArg(2) int x, @OriginalArg(3) int level, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) CollisionMap collision) {
		@Pc(9) long key = 0L;
		if (arg3 == 0) {
			key = SceneGraph.getWallKey(level, x, z);
		} else if (arg3 == 1) {
			key = SceneGraph.getWallDecorKey(level, x, z);
		} else if (arg3 == 2) {
			key = SceneGraph.getSceneryKey(level, x, z);
		} else if (arg3 == 3) {
			key = SceneGraph.getGroundDecorKey(level, x, z);
		}
		@Pc(57) int shape = (int) key >> 14 & 0x1F;
		@Pc(70) int id = (int) (key >>> 32) & Integer.MAX_VALUE;
		@Pc(74) LocType type = LocTypeList.get(id);
		if (type.hasAreaSound()) {
			AreaSoundManager.remove(x, type, z, level);
		}
		@Pc(92) int angle = (int) key >> 20 & 0x3;
		if (key == 0L) {
			return;
		}
		@Pc(100) Entity local100 = null;
		@Pc(102) Entity local102 = null;
		if (arg3 == 0) {
			@Pc(110) Wall wall = SceneGraph.removeWall(level, x, z);
			if (wall != null) {
				local100 = wall.primary;
				local102 = wall.secondary;
			}
			if (type.anInt4435 != 0) {
				collision.unflagWall(angle, type.aBoolean207, z, shape, x);
			}
		} else if (arg3 == 1) {
			@Pc(233) WallDecor wallDecor = SceneGraph.removeWallDecor(level, x, z);
			if (wallDecor != null) {
				local100 = wallDecor.primary;
				local102 = wallDecor.secondary;
			}
		} else if (arg3 == 2) {
			@Pc(148) Scenery scenery = SceneGraph.removeScenery(level, x, z);
			if (scenery != null) {
				local100 = scenery.entity;
			}
			if (type.anInt4435 != 0 && type.width + x < 104 && type.width + z < 104 && x + type.length < 104 && z + type.length < 104) {
				collision.unflagScenery(x, type.width, type.aBoolean207, angle, type.length, z);
			}
		} else if (arg3 == 3) {
			@Pc(211) GroundDecor groundDecor = SceneGraph.removeGroundDecor(level, x, z);
			if (groundDecor != null) {
				local100 = groundDecor.entity;
			}
			if (type.anInt4435 == 1) {
				collision.unflagGroundDecor(z, x);
			}
		}
		if (!GlRenderer.enabled || !type.aBoolean212) {
			return;
		}
		if (shape == 2) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, 0, angle + 4, 0, shape, x, z, arg4);
			}
			if (local102 instanceof Loc) {
				((Loc) local102).method1046();
			} else {
				Loc.method181(type, 0, angle + 1 & 0x3, 0, shape, x, z, arg4);
			}
		} else if (shape == 5) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, Static238.anIntArray469[angle] * 8, angle, Static34.anIntArray80[angle] * 8, 4, x, z, arg4);
			}
		} else if (shape == 6) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, Static64.anIntArray154[angle] * 8, angle + 4, Static114.anIntArray565[angle] * 8, 4, x, z, arg4);
			}
		} else if (shape == 7) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, 0, (angle + 2 & 0x3) + 4, 0, 4, x, z, arg4);
			}
		} else if (shape == 8) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, Static64.anIntArray154[angle] * 8, angle + 4, Static114.anIntArray565[angle] * 8, 4, x, z, arg4);
			}
			if (local102 instanceof Loc) {
				((Loc) local102).method1046();
			} else {
				Loc.method181(type, Static64.anIntArray154[angle] * 8, (angle + 2 & 0x3) + 4, Static114.anIntArray565[angle] * 8, 4, x, z, arg4);
			}
		} else if (shape == 11) {
			if (local100 instanceof Loc) {
				((Loc) local100).method1046();
			} else {
				Loc.method181(type, 0, angle + 4, 0, 10, x, z, arg4);
			}
		} else if (local100 instanceof Loc) {
			((Loc) local100).method1046();
		} else {
			Loc.method181(type, 0, angle, 0, shape, x, z, arg4);
		}
	}
}
