import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!m;")
	public static TextureProvider anInterface1_1;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public static int anInt1176;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!fe;)V")
	public static void method949(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt3376 == 0) {
			return;
		}
		@Pc(13) BasType local13 = arg0.method2681();
		@Pc(43) int local43;
		@Pc(36) int local36;
		if (arg0.faceEntity != -1 && arg0.faceEntity < 32768) {
			@Pc(26) Npc local26 = NpcList.npcs[arg0.faceEntity];
			if (local26 != null) {
				local36 = arg0.zFine - local26.zFine;
				local43 = arg0.xFine - local26.xFine;
				if (local43 != 0 || local36 != 0) {
					arg0.anInt3400 = (int) (Math.atan2((double) local43, (double) local36) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(94) int local94;
		@Pc(70) int local70;
		if (arg0.faceEntity >= 32768) {
			local70 = arg0.faceEntity - 32768;
			if (local70 == PlayerList.selfId) {
				local70 = 2047;
			}
			@Pc(83) Player local83 = PlayerList.players[local70];
			if (local83 != null) {
				local94 = arg0.zFine - local83.zFine;
				local36 = arg0.xFine - local83.xFine;
				if (local36 != 0 || local94 != 0) {
					arg0.anInt3400 = (int) (Math.atan2((double) local36, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.faceX != 0 || arg0.faceY != 0) && (arg0.movementQueueSize == 0 || arg0.anInt3417 > 0)) {
			local70 = arg0.xFine - (arg0.faceX - Static225.originX - Static225.originX) * 64;
			local43 = arg0.zFine - (arg0.faceY - Static142.originZ - Static142.originZ) * 64;
			if (local70 != 0 || local43 != 0) {
				arg0.anInt3400 = (int) (Math.atan2((double) local70, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.faceY = 0;
			arg0.faceX = 0;
		}
		local70 = arg0.anInt3400 - arg0.anInt3381 & 0x7FF;
		if (local70 == 0) {
			arg0.anInt3385 = 0;
			arg0.anInt3414 = 0;
		} else if (local13.anInt1038 == 0) {
			arg0.anInt3385++;
			@Pc(226) boolean local226;
			if (local70 > 1024) {
				arg0.anInt3381 -= arg0.anInt3376;
				local226 = true;
				if (local70 < arg0.anInt3376 || local70 > 2048 - arg0.anInt3376) {
					arg0.anInt3381 = arg0.anInt3400;
					local226 = false;
				}
				if (local13.idleAnimationId == arg0.anInt3366 && (arg0.anInt3385 > 25 || local226)) {
					if (local13.anInt1036 == -1) {
						arg0.anInt3366 = local13.walkAnimation;
					} else {
						arg0.anInt3366 = local13.anInt1036;
					}
				}
			} else {
				local226 = true;
				arg0.anInt3381 += arg0.anInt3376;
				if (arg0.anInt3376 > local70 || local70 > 2048 - arg0.anInt3376) {
					local226 = false;
					arg0.anInt3381 = arg0.anInt3400;
				}
				if (local13.idleAnimationId == arg0.anInt3366 && (arg0.anInt3385 > 25 || local226)) {
					if (local13.anInt1067 == -1) {
						arg0.anInt3366 = local13.walkAnimation;
					} else {
						arg0.anInt3366 = local13.anInt1067;
					}
				}
			}
			arg0.anInt3381 &= 0x7FF;
		} else {
			if (local13.idleAnimationId == arg0.anInt3366 && arg0.anInt3385 > 25) {
				if (local13.anInt1067 == -1) {
					arg0.anInt3366 = local13.walkAnimation;
				} else {
					arg0.anInt3366 = local13.anInt1067;
				}
			}
			local43 = arg0.anInt3400 << 5;
			if (local43 != arg0.anInt3402) {
				arg0.anInt3387 = 0;
				arg0.anInt3402 = local43;
				local36 = local43 - arg0.anInt3377 & 0xFFFF;
				local94 = arg0.anInt3414 * arg0.anInt3414 / (local13.anInt1038 * 2);
				@Pc(471) int local471;
				if (arg0.anInt3414 > 0 && local36 >= local94 && local36 - local94 < 32768) {
					arg0.anInt3397 = local36 / 2;
					arg0.aBoolean167 = true;
					local471 = local13.anInt1031 * local13.anInt1031 / (local13.anInt1038 * 2);
					if (local471 > 32767) {
						local471 = 32767;
					}
					if (local471 < arg0.anInt3397) {
						arg0.anInt3397 = local36 - local471;
					}
				} else if (arg0.anInt3414 < 0 && local94 <= 65536 - local36 && 65536 - local36 - local94 < 32768) {
					arg0.anInt3397 = (65536 - local36) / 2;
					arg0.aBoolean167 = true;
					local471 = local13.anInt1031 * local13.anInt1031 / (local13.anInt1038 * 2);
					if (local471 > 32767) {
						local471 = 32767;
					}
					if (local471 < arg0.anInt3397) {
						arg0.anInt3397 = 65536 - local36 - local471;
					}
				} else {
					arg0.aBoolean167 = false;
				}
			}
			if (arg0.anInt3414 == 0) {
				local36 = arg0.anInt3402 - arg0.anInt3377 & 0xFFFF;
				if (local36 < local13.anInt1038) {
					arg0.anInt3377 = arg0.anInt3402;
				} else {
					arg0.anInt3387 = 0;
					local94 = local13.anInt1031 * local13.anInt1031 / (local13.anInt1038 * 2);
					arg0.aBoolean167 = true;
					if (local94 > 32767) {
						local94 = 32767;
					}
					if (local36 >= 32768) {
						arg0.anInt3414 = -local13.anInt1038;
						arg0.anInt3397 = (65536 - local36) / 2;
						if (local94 < arg0.anInt3397) {
							arg0.anInt3397 = 65536 - local36 - local94;
						}
					} else {
						arg0.anInt3414 = local13.anInt1038;
						arg0.anInt3397 = local36 / 2;
						if (local94 < arg0.anInt3397) {
							arg0.anInt3397 = local36 - local94;
						}
					}
				}
			} else if (arg0.anInt3414 <= 0) {
				if (arg0.anInt3387 >= arg0.anInt3397) {
					arg0.aBoolean167 = false;
				}
				if (!arg0.aBoolean167) {
					arg0.anInt3414 += local13.anInt1038;
					if (arg0.anInt3414 > 0) {
						arg0.anInt3414 = 0;
					}
				} else if (-local13.anInt1031 < arg0.anInt3414) {
					arg0.anInt3414 -= local13.anInt1038;
				}
			} else {
				if (arg0.anInt3397 <= arg0.anInt3387) {
					arg0.aBoolean167 = false;
				}
				if (!arg0.aBoolean167) {
					arg0.anInt3414 -= local13.anInt1038;
					if (arg0.anInt3414 < 0) {
						arg0.anInt3414 = 0;
					}
				} else if (arg0.anInt3414 < local13.anInt1031) {
					arg0.anInt3414 += local13.anInt1038;
				}
			}
			arg0.anInt3377 += arg0.anInt3414;
			arg0.anInt3377 &= 0xFFFF;
			if (arg0.anInt3414 <= 0) {
				arg0.anInt3387 -= arg0.anInt3414;
			} else {
				arg0.anInt3387 += arg0.anInt3414;
			}
			arg0.anInt3381 = arg0.anInt3377 >> 5;
		}
	}
}
