package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	public static int anInt3096 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
	public static void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Protocol.outboundBuffer.offset = 0;
		Protocol.outboundBuffer.p1(147);
		Protocol.outboundBuffer.p1(arg2);
		Protocol.outboundBuffer.p1(arg3);
		Protocol.outboundBuffer.p2(arg0);
		Protocol.outboundBuffer.p2(arg1);
		CreateManager.loops = 0;
		CreateManager.errors = 0;
		CreateManager.step = 1;
		CreateManager.reply = -3;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public static void updateLockedCamera() {
		@Pc(9) int local9 = Static248.anInt4232 * 128 + 64;
		@Pc(15) int local15 = Static245.anInt5375 * 128 + 64;
		@Pc(23) int local23 = SceneGraph.getTileHeight(Player.level, local15, local9) - Static231.anInt5203;
		if (Static113.anInt4612 >= 100) {
			Static138.renderX = Static245.anInt5375 * 128 + 64;
			Static134.renderZ = Static248.anInt4232 * 128 + 64;
			Static5.anInt40 = SceneGraph.getTileHeight(Player.level, Static138.renderX, Static134.renderZ) - Static231.anInt5203;
		} else {
			if (Static138.renderX < local15) {
				Static138.renderX += Static233.anInt5225 + Static113.anInt4612 * (local15 - Static138.renderX) / 1000;
				if (Static138.renderX > local15) {
					Static138.renderX = local15;
				}
			}
			if (Static5.anInt40 < local23) {
				Static5.anInt40 += (local23 - Static5.anInt40) * Static113.anInt4612 / 1000 + Static233.anInt5225;
				if (Static5.anInt40 > local23) {
					Static5.anInt40 = local23;
				}
			}
			if (Static138.renderX > local15) {
				Static138.renderX -= Static233.anInt5225 + (Static138.renderX - local15) * Static113.anInt4612 / 1000;
				if (Static138.renderX < local15) {
					Static138.renderX = local15;
				}
			}
			if (Static134.renderZ < local9) {
				Static134.renderZ += Static233.anInt5225 + Static113.anInt4612 * (local9 - Static134.renderZ) / 1000;
				if (local9 < Static134.renderZ) {
					Static134.renderZ = local9;
				}
			}
			if (local23 < Static5.anInt40) {
				Static5.anInt40 -= (Static5.anInt40 - local23) * Static113.anInt4612 / 1000 + Static233.anInt5225;
				if (local23 > Static5.anInt40) {
					Static5.anInt40 = local23;
				}
			}
			if (Static134.renderZ > local9) {
				Static134.renderZ -= Static233.anInt5225 + (Static134.renderZ - local9) * Static113.anInt4612 / 1000;
				if (local9 > Static134.renderZ) {
					Static134.renderZ = local9;
				}
			}
		}
		local9 = Static265.anInt5765 * 128 + 64;
		local15 = Static251.anInt5449 * 128 + 64;
		local23 = SceneGraph.getTileHeight(Player.level, local15, local9) - Static260.anInt1744;
		@Pc(236) int local236 = local23 - Static5.anInt40;
		@Pc(241) int local241 = local9 - Static134.renderZ;
		@Pc(246) int local246 = local15 - Static138.renderX;
		@Pc(257) int local257 = (int) Math.sqrt((double) (local246 * local246 + local241 * local241));
		@Pc(268) int local268 = (int) (Math.atan2((double) local236, (double) local257) * 325.949D) & 0x7FF;
		if (local268 < 128) {
			local268 = 128;
		}
		if (local268 > 383) {
			local268 = 383;
		}
		@Pc(292) int local292 = (int) (-325.949D * Math.atan2((double) local246, (double) local241)) & 0x7FF;
		if (Static240.cameraPitch < local268) {
			Static240.cameraPitch += Static133.anInt5230 + Static233.anInt5217 * (local268 - Static240.cameraPitch) / 1000;
			if (Static240.cameraPitch > local268) {
				Static240.cameraPitch = local268;
			}
		}
		if (Static240.cameraPitch > local268) {
			Static240.cameraPitch -= (Static240.cameraPitch - local268) * Static233.anInt5217 / 1000 + Static133.anInt5230;
			if (Static240.cameraPitch < local268) {
				Static240.cameraPitch = local268;
			}
		}
		@Pc(350) int local350 = local292 - Static184.cameraYaw;
		if (local350 > 1024) {
			local350 -= 2048;
		}
		if (local350 < -1024) {
			local350 += 2048;
		}
		if (local350 > 0) {
			Static184.cameraYaw += local350 * Static233.anInt5217 / 1000 + Static133.anInt5230;
			Static184.cameraYaw &= 0x7FF;
		}
		if (local350 < 0) {
			Static184.cameraYaw -= Static233.anInt5217 * -local350 / 1000 + Static133.anInt5230;
			Static184.cameraYaw &= 0x7FF;
		}
		@Pc(404) int local404 = local292 - Static184.cameraYaw;
		if (local404 > 1024) {
			local404 -= 2048;
		}
		if (local404 < -1024) {
			local404 += 2048;
		}
		if (local404 < 0 && local350 > 0 || local404 > 0 && local350 < 0) {
			Static184.cameraYaw = local292;
		}
	}
}
