package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_570 = JagString.parse(")2");
	@OriginalMember(owner = "client!na", name = "W", descriptor = "Z")
	public static boolean newTab;

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "Lclient!na;")
	public static final JagString aClass100_770 = JagString.parse(":allyreq:");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIZ)Z")
	public static boolean method3109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) long local14 = SceneGraph.getWallKey(arg4, arg0 + 0, arg2);
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(42) int local42;
		@Pc(46) LocType local46;
		@Pc(65) int local65;
		@Pc(75) int[] local75;
		@Pc(90) int local90;
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) local14 >> 14 & 0x1F;
			local42 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local46 = LocTypeList.get(local42);
			if (local46.mapSceneId == -1) {
				local65 = arg1;
				if (local14 > 0L) {
					local65 = arg3;
				}
				local75 = SoftwareRaster.pixels;
				local90 = (52736 - arg2 * 512) * 4 + arg0 * 4 + 24624;
				if (local35 == 0 || local35 == 2) {
					if (local28 == 0) {
						local75[local90] = local65;
						local75[local90 + 512] = local65;
						local75[local90 + 1024] = local65;
						local75[local90 + 1536] = local65;
					} else if (local28 == 1) {
						local75[local90] = local65;
						local75[local90 + 1] = local65;
						local75[local90 + 2] = local65;
						local75[local90 + 3] = local65;
					} else if (local28 == 2) {
						local75[local90 + 3] = local65;
						local75[local90 + 3 + 512] = local65;
						local75[local90 + 3 + 1024] = local65;
						local75[local90 + 3 + 1536] = local65;
					} else if (local28 == 3) {
						local75[local90 + 1536] = local65;
						local75[local90 + 1536 + 1] = local65;
						local75[local90 + 1538] = local65;
						local75[local90 + 3 + 1536] = local65;
					}
				}
				if (local35 == 3) {
					if (local28 == 0) {
						local75[local90] = local65;
					} else if (local28 == 1) {
						local75[local90 + 3] = local65;
					} else if (local28 == 2) {
						local75[local90 + 3 + 1536] = local65;
					} else if (local28 == 3) {
						local75[local90 + 1536] = local65;
					}
				}
				if (local35 == 2) {
					if (local28 == 3) {
						local75[local90] = local65;
						local75[local90 + 512] = local65;
						local75[local90 + 1024] = local65;
						local75[local90 + 1536] = local65;
					} else if (local28 == 0) {
						local75[local90] = local65;
						local75[local90 + 1] = local65;
						local75[local90 + 2] = local65;
						local75[local90 + 3] = local65;
					} else if (local28 == 1) {
						local75[local90 + 3] = local65;
						local75[local90 + 512 + 3] = local65;
						local75[local90 + 1024 + 3] = local65;
						local75[local90 + 1536 + 3] = local65;
					} else if (local28 == 2) {
						local75[local90 + 1536] = local65;
						local75[local90 + 1536 + 1] = local65;
						local75[local90 + 1536 + 2] = local65;
						local75[local90 + 1539] = local65;
					}
				}
			} else if (!MiniMap.renderScenery(arg0, local46, arg2, local28)) {
				return false;
			}
		}
		local14 = SceneGraph.getSceneryKey(arg4, arg0 + 0, arg2);
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) local14 >> 14 & 0x1F;
			local42 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			local46 = LocTypeList.get(local42);
			if (local46.mapSceneId == -1) {
				if (local35 == 9) {
					local65 = 15658734;
					if (local14 > 0L) {
						local65 = 15597568;
					}
					local90 = arg0 * 4 + (103 - arg2) * 2048 + 24624;
					local75 = SoftwareRaster.pixels;
					if (local28 == 0 || local28 == 2) {
						local75[local90 + 1536] = local65;
						local75[local90 + 1025] = local65;
						local75[local90 + 512 + 2] = local65;
						local75[local90 + 3] = local65;
					} else {
						local75[local90] = local65;
						local75[local90 + 512 + 1] = local65;
						local75[local90 + 1024 + 2] = local65;
						local75[local90 + 1536 + 3] = local65;
					}
				}
			} else if (!MiniMap.renderScenery(arg0, local46, arg2, local28)) {
				return false;
			}
		}
		local14 = SceneGraph.getGroundDecorKey(arg4, arg0 + 0, arg2);
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			@Pc(586) LocType local586 = LocTypeList.get(local35);
			return local586.mapSceneId == -1 || MiniMap.renderScenery(arg0, local586, arg2, local28);
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ba;Lclient!ba;IIIZZ)I")
	public static int method3115(@OriginalArg(0) World arg0, @OriginalArg(1) World arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = method4595(arg1, arg3, arg0, arg5);
		if (local8 != 0) {
			return arg5 ? -local8 : local8;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = method4595(arg1, arg2, arg0, arg4);
			return arg4 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ba;IILclient!ba;Z)I")
	public static int method4595(@OriginalArg(0) World arg0, @OriginalArg(1) int arg1, @OriginalArg(3) World arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == 1) {
			@Pc(11) int local11 = arg0.players;
			@Pc(14) int local14 = arg2.players;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return arg0.getWorldInfo().name.compare(arg2.getWorldInfo().name);
		} else if (arg1 == 3) {
			if (arg0.activity.strEquals(aClass100_570)) {
				if (arg2.activity.strEquals(aClass100_570)) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.activity.strEquals(aClass100_570)) {
				return arg3 ? 1 : -1;
			} else {
				return arg0.activity.compare(arg2.activity);
			}
		} else if (arg1 == 4) {
			return arg0.isLootShare() ? (arg2.isLootShare() ? 0 : 1) : arg2.isLootShare() ? -1 : 0;
		} else if (arg1 == 5) {
			return arg0.isQuickChat() ? (arg2.isQuickChat() ? 0 : 1) : (arg2.isQuickChat() ? -1 : 0);
		} else if (arg1 == 6) {
			return arg0.isPvp() ? (arg2.isPvp() ? 0 : 1) : (arg2.isPvp() ? -1 : 0);
		} else if (arg1 == 7) {
			return arg0.isMembers() ? (arg2.isMembers() ? 0 : 1) : (arg2.isMembers() ? -1 : 0);
		} else {
			return arg0.id - arg2.id;
		}
	}
}
