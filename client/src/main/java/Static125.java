import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	public static int anInt3096 = 0;

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_18 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_19 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
	public static int worldId = -1;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	public static int anInt3104 = 127;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ve;Lclient!ve;)V")
	public static void method2446(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		Static14.aClass153_8 = arg0;
		Static216.aClass153_31 = arg1;
		Static53.anInt1716 = Static216.aClass153_31.method4504(3);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
	public static void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static6.outboundBuffer.offset = 0;
		Static6.outboundBuffer.p1(147);
		Static6.outboundBuffer.p1(arg2);
		Static6.outboundBuffer.p1(arg3);
		Static6.outboundBuffer.p2(arg0);
		Static6.outboundBuffer.p2(arg1);
		Static226.anInt5079 = 0;
		Static57.anInt1758 = 0;
		Static179.anInt4261 = 1;
		Static223.anInt5034 = -3;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)Lclient!kk;")
	public static Class85 method2449(@OriginalArg(0) int arg0) {
		@Pc(10) Class85 local10 = (Class85) aClass99_19.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static172.aClass153_69.method4495(Static254.method4349(arg0), Static274.method3845(arg0));
		local10 = new Class85();
		if (local31 != null) {
			local10.method2651(new Buffer(local31));
		}
		aClass99_19.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public static void method2450() {
		@Pc(9) int local9 = Static248.anInt4232 * 128 + 64;
		@Pc(15) int local15 = Static245.anInt5375 * 128 + 64;
		@Pc(23) int local23 = Static207.method3685(Static55.level, local15, local9) - Static231.anInt5203;
		if (Static113.anInt4612 >= 100) {
			Static138.anInt3439 = Static245.anInt5375 * 128 + 64;
			Static134.anInt3302 = Static248.anInt4232 * 128 + 64;
			Static5.anInt40 = Static207.method3685(Static55.level, Static138.anInt3439, Static134.anInt3302) - Static231.anInt5203;
		} else {
			if (Static138.anInt3439 < local15) {
				Static138.anInt3439 += Static233.anInt5225 + Static113.anInt4612 * (local15 - Static138.anInt3439) / 1000;
				if (Static138.anInt3439 > local15) {
					Static138.anInt3439 = local15;
				}
			}
			if (Static5.anInt40 < local23) {
				Static5.anInt40 += (local23 - Static5.anInt40) * Static113.anInt4612 / 1000 + Static233.anInt5225;
				if (Static5.anInt40 > local23) {
					Static5.anInt40 = local23;
				}
			}
			if (Static138.anInt3439 > local15) {
				Static138.anInt3439 -= Static233.anInt5225 + (Static138.anInt3439 - local15) * Static113.anInt4612 / 1000;
				if (Static138.anInt3439 < local15) {
					Static138.anInt3439 = local15;
				}
			}
			if (Static134.anInt3302 < local9) {
				Static134.anInt3302 += Static233.anInt5225 + Static113.anInt4612 * (local9 - Static134.anInt3302) / 1000;
				if (local9 < Static134.anInt3302) {
					Static134.anInt3302 = local9;
				}
			}
			if (local23 < Static5.anInt40) {
				Static5.anInt40 -= (Static5.anInt40 - local23) * Static113.anInt4612 / 1000 + Static233.anInt5225;
				if (local23 > Static5.anInt40) {
					Static5.anInt40 = local23;
				}
			}
			if (Static134.anInt3302 > local9) {
				Static134.anInt3302 -= Static233.anInt5225 + (Static134.anInt3302 - local9) * Static113.anInt4612 / 1000;
				if (local9 > Static134.anInt3302) {
					Static134.anInt3302 = local9;
				}
			}
		}
		local9 = Static265.anInt5765 * 128 + 64;
		local15 = Static251.anInt5449 * 128 + 64;
		local23 = Static207.method3685(Static55.level, local15, local9) - Static57.anInt1744;
		@Pc(236) int local236 = local23 - Static5.anInt40;
		@Pc(241) int local241 = local9 - Static134.anInt3302;
		@Pc(246) int local246 = local15 - Static138.anInt3439;
		@Pc(257) int local257 = (int) Math.sqrt((double) (local246 * local246 + local241 * local241));
		@Pc(268) int local268 = (int) (Math.atan2((double) local236, (double) local257) * 325.949D) & 0x7FF;
		if (local268 < 128) {
			local268 = 128;
		}
		if (local268 > 383) {
			local268 = 383;
		}
		@Pc(292) int local292 = (int) (-325.949D * Math.atan2((double) local246, (double) local241)) & 0x7FF;
		if (Static240.anInt5333 < local268) {
			Static240.anInt5333 += Static133.anInt5230 + Static233.anInt5217 * (local268 - Static240.anInt5333) / 1000;
			if (Static240.anInt5333 > local268) {
				Static240.anInt5333 = local268;
			}
		}
		if (Static240.anInt5333 > local268) {
			Static240.anInt5333 -= (Static240.anInt5333 - local268) * Static233.anInt5217 / 1000 + Static133.anInt5230;
			if (Static240.anInt5333 < local268) {
				Static240.anInt5333 = local268;
			}
		}
		@Pc(350) int local350 = local292 - Static184.anInt4358;
		if (local350 > 1024) {
			local350 -= 2048;
		}
		if (local350 < -1024) {
			local350 += 2048;
		}
		if (local350 > 0) {
			Static184.anInt4358 += local350 * Static233.anInt5217 / 1000 + Static133.anInt5230;
			Static184.anInt4358 &= 0x7FF;
		}
		if (local350 < 0) {
			Static184.anInt4358 -= Static233.anInt5217 * -local350 / 1000 + Static133.anInt5230;
			Static184.anInt4358 &= 0x7FF;
		}
		@Pc(404) int local404 = local292 - Static184.anInt4358;
		if (local404 > 1024) {
			local404 -= 2048;
		}
		if (local404 < -1024) {
			local404 += 2048;
		}
		if (local404 < 0 && local350 > 0 || local404 > 0 && local350 < 0) {
			Static184.anInt4358 = local292;
		}
	}
}
