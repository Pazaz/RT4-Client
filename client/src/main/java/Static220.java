import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt4941 = 1;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_28 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Z")
	public static boolean aBoolean244 = true;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_930 = Static28.parse("(Z");

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
	public static void method3797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) LinkedList local9 = Static159.aClass69ArrayArrayArray1[Static55.level][arg1][arg0];
		if (local9 == null) {
			Static187.method3420(Static55.level, arg1, arg0);
			return;
		}
		@Pc(28) int local28 = -99999999;
		@Pc(30) ObjStackNode local30 = null;
		@Pc(35) ObjStackNode local35;
		for (local35 = (ObjStackNode) local9.method2289(); local35 != null; local35 = (ObjStackNode) local9.method2288()) {
			@Pc(44) ObjType local44 = Static71.method1439(local35.aClass8_Sub7_1.anInt5555);
			@Pc(47) int local47 = local44.anInt2325;
			if (local44.anInt2336 == 1) {
				local47 *= local35.aClass8_Sub7_1.anInt5550 + 1;
			}
			if (local28 < local47) {
				local28 = local47;
				local30 = local35;
			}
		}
		if (local30 == null) {
			Static187.method3420(Static55.level, arg1, arg0);
			return;
		}
		local9.method2283(local30);
		@Pc(89) ObjStack local89 = null;
		@Pc(91) ObjStack local91 = null;
		for (local35 = (ObjStackNode) local9.method2289(); local35 != null; local35 = (ObjStackNode) local9.method2288()) {
			@Pc(103) ObjStack local103 = local35.aClass8_Sub7_1;
			if (local103.anInt5555 != local30.aClass8_Sub7_1.anInt5555) {
				if (local89 == null) {
					local89 = local103;
				}
				if (local103.anInt5555 != local89.anInt5555 && local91 == null) {
					local91 = local103;
				}
			}
		}
		@Pc(152) long local152 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static69.method1543(Static55.level, arg1, arg0, Static207.method3685(Static55.level, arg1 * 128 + 64, arg0 * 128 + 64), local30.aClass8_Sub7_1, local152, local89, local91);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(JB)V")
	public static void method3799(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIIILclient!ak;I)Lclient!ak;")
	public static Model method3800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Model arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = (long) arg2;
		@Pc(10) Model local10 = (Model) Static110.aClass99_15.method3106(local4);
		if (local10 == null) {
			@Pc(22) RawModel local22 = Static77.method1686(Static267.aClass153_109, arg2);
			if (local22 == null) {
				return null;
			}
			local10 = local22.method1679(64, 768, -50, -10, -50);
			Static110.aClass99_15.method3095(local10, local4);
		}
		@Pc(42) int local42 = arg4.method4562();
		@Pc(45) int local45 = arg4.method4561();
		@Pc(48) int local48 = arg4.method4576();
		@Pc(51) int local51 = arg4.method4550();
		local10 = local10.method4560(true, true, true);
		if (arg0 != 0) {
			local10.method4554(arg0);
		}
		@Pc(94) int local94;
		if (GlRenderer.enabled) {
			@Pc(68) GlModel local68 = (GlModel) local10;
			if (arg5 != Static207.method3685(Static55.level, arg3 + local42, arg1 + local48) || arg5 != Static207.method3685(Static55.level, arg3 + local45, local51 + arg1)) {
				for (local94 = 0; local94 < local68.anInt5295; local94++) {
					local68.anIntArray465[local94] += Static207.method3685(Static55.level, local68.anIntArray461[local94] + arg3, local68.anIntArray466[local94] + arg1) - arg5;
				}
				local68.aClass127_4.aBoolean235 = false;
				local68.aClass5_1.aBoolean3 = false;
			}
		} else {
			@Pc(142) SoftwareModel local142 = (SoftwareModel) local10;
			if (arg5 != Static207.method3685(Static55.level, local42 + arg3, local48 + arg1) || arg5 != Static207.method3685(Static55.level, arg3 + local45, local51 + arg1)) {
				for (local94 = 0; local94 < local142.anInt5788; local94++) {
					local142.anIntArray527[local94] += Static207.method3685(Static55.level, arg3 + local142.anIntArray528[local94], local142.anIntArray531[local94] + arg1) - arg5;
				}
				local142.aBoolean305 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public static void method3801() {
		for (@Pc(1) int local1 = 0; local1 < Static126.anInt3114; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static152.anInt3594; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static99.anInt2550; local11++) {
					@Pc(22) Tile local22 = Static130.aClass3_Sub5ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Wall local27 = local22.aClass77_1;
						if (local27 != null && local27.aClass8_5.method4543()) {
							Static69.method1544(local27.aClass8_5, local1, local6, local11, 1, 1);
							if (local27.aClass8_6 != null && local27.aClass8_6.method4543()) {
								Static69.method1544(local27.aClass8_6, local1, local6, local11, 1, 1);
								local27.aClass8_5.method4544(local27.aClass8_6, 0, 0, 0, false);
								local27.aClass8_6 = local27.aClass8_6.method4539();
							}
							local27.aClass8_5 = local27.aClass8_5.method4539();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt662; local83++) {
							@Pc(92) Scenery local92 = local22.aClass31Array1[local83];
							if (local92 != null && local92.aClass8_4.method4543()) {
								Static69.method1544(local92.aClass8_4, local1, local6, local11, local92.anInt1713 + 1 - local92.anInt1701, local92.anInt1698 - local92.anInt1696 + 1);
								local92.aClass8_4 = local92.aClass8_4.method4539();
							}
						}
						@Pc(131) GroundDecor local131 = local22.aClass15_1;
						if (local131 != null && local131.aClass8_1.method4543()) {
							Static264.method3574(local131.aClass8_1, local1, local6, local11);
							local131.aClass8_1 = local131.aClass8_1.method4539();
						}
					}
				}
			}
		}
	}
}
