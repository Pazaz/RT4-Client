package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!na", name = "W", descriptor = "Z")
	public static boolean newTab;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Lclient!na;")
	public static final JagString aClass100_770 = JagString.parse(":allyreq:");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIZ)Z")
	public static boolean method3109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) long local14 = Static265.method4521(arg4, arg0 + 0, arg2);
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
			} else if (!Static33.method867(arg0, local46, arg2, local28)) {
				return false;
			}
		}
		local14 = Static35.method899(arg4, arg0 + 0, arg2);
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
			} else if (!Static33.method867(arg0, local46, arg2, local28)) {
				return false;
			}
		}
		local14 = Static20.method602(arg4, arg0 + 0, arg2);
		if (local14 != 0L) {
			local28 = (int) local14 >> 20 & 0x3;
			local35 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			@Pc(586) LocType local586 = LocTypeList.get(local35);
			if (local586.mapSceneId != -1 && !Static33.method867(arg0, local586, arg2, local28)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ba;Lclient!ba;IIIZZ)I")
	public static int method3115(@OriginalArg(0) World arg0, @OriginalArg(1) World arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = Static270.method4595(arg1, arg3, arg0, arg5);
		if (local8 != 0) {
			return arg5 ? -local8 : local8;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static270.method4595(arg1, arg2, arg0, arg4);
			return arg4 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ve;IZ)Lclient!mm;")
	public static SoftwareSprite method3117(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		return SpriteLoader.decode(arg0, arg1) ? SpriteLoader.method3537() : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZILclient!ve;)Lclient!ek;")
	public static SoftwareIndexedSprite loadSoftwareIndexedSprite(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return SpriteLoader.decode(arg1, 0, arg0) ? Static134.method2619() : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBZIZIIZ)Lclient!qf;")
	public static Sprite method3150(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(5) ObjType local5 = ObjTypeList.get(arg2);
		if (arg5 > 1 && local5.countObj != null) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg5 >= local5.countCount[local17] && local5.countCount[local17] != 0) {
					local15 = local5.countObj[local17];
				}
			}
			if (local15 != -1) {
				local5 = ObjTypeList.get(local15);
			}
		}
		@Pc(60) SoftwareModel local60 = local5.getInvModel();
		if (local60 == null) {
			return null;
		}
		@Pc(71) SoftwareSprite local71 = null;
		if (local5.certificateTemplate != -1) {
			local71 = (SoftwareSprite) method3150(0, true, local5.certificateLink, false, 1, 10, true);
			if (local71 == null) {
				return null;
			}
		} else if (local5.lentTemplate != -1) {
			local71 = (SoftwareSprite) method3150(arg0, true, local5.lentLink, false, arg4, arg5, false);
			if (local71 == null) {
				return null;
			}
		}
		@Pc(118) int[] local118 = SoftwareRaster.pixels;
		@Pc(120) int local120 = SoftwareRaster.width;
		@Pc(122) int local122 = SoftwareRaster.height;
		@Pc(125) int[] local125 = new int[4];
		SoftwareRaster.method2497(local125);
		@Pc(133) SoftwareSprite local133 = new SoftwareSprite(36, 32);
		SoftwareRaster.method2491(local133.pixels, 36, 32);
		Rasteriser.prepare();
		Rasteriser.setBounds(16, 16);
		@Pc(145) int local145 = local5.zoom2d;
		Rasteriser.jagged = false;
		if (arg6) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg4 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(176) int local176 = MathUtils.cos[local5.xAngle2d] * local145 >> 16;
		@Pc(185) int local185 = MathUtils.sin[local5.xAngle2d] * local145 >> 16;
		local60.method4571(local5.yAngle2d, local5.zAngle2d, local5.xAngle2d, local5.xOffset2d, local185 + local5.yOffset2d - local60.method4549() / 2, local5.yOffset2d + local176, -1L);
		if (arg4 >= 1) {
			local133.method303(1);
			if (arg4 >= 2) {
				local133.method303(16777215);
			}
			SoftwareRaster.method2491(local133.pixels, 36, 32);
		}
		if (arg0 != 0) {
			local133.method314(arg0);
		}
		if (local5.certificateTemplate != -1) {
			local71.method1423(0, 0);
		} else if (local5.lentTemplate != -1) {
			SoftwareRaster.method2491(local71.pixels, 36, 32);
			local133.method1423(0, 0);
			local133 = local71;
		}
		if (arg3 && (local5.stackable == 1 || arg5 != 1) && arg5 != -1) {
			ObjTypeList.aClass3_Sub2_Sub9_Sub1_1.method2857(Static52.method1288(arg5), 0, 9, 16776960, 1);
		}
		SoftwareRaster.method2491(local118, local120, local122);
		SoftwareRaster.method2488(local125);
		Rasteriser.prepare();
		Rasteriser.jagged = true;
		return GlRenderer.enabled && !arg1 ? new GlSprite(local133) : local133;
	}
}
