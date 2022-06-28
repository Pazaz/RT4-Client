package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method1949(@OriginalArg(1) int arg0) {
		if (InterfaceList.load(arg0)) {
			method2354(-1, InterfaceList.components[arg0]);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lclient!be;)V")
	public static void method2354(@OriginalArg(1) int arg0, @OriginalArg(2) Component[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Component local15 = arg1[local7];
			if (local15 != null && local15.layer == arg0 && (!local15.if3 || !Static36.method947(local15))) {
				if (local15.type == 0) {
					if (!local15.if3 && Static36.method947(local15) && local15 != InterfaceList.aClass13_22) {
						continue;
					}
					method2354(local15.id, arg1);
					if (local15.createdComponents != null) {
						method2354(local15.id, local15.createdComponents);
					}
					@Pc(73) ComponentPointer local73 = (ComponentPointer) InterfaceList.openInterfaces.get(local15.id);
					if (local73 != null) {
						method1949(local73.anInt5878);
					}
				}
				if (local15.type == 6) {
					@Pc(105) int local105;
					if (local15.modelSeqId != -1 || local15.anInt462 != -1) {
						@Pc(100) boolean local100 = Static87.method2926(local15);
						if (local100) {
							local105 = local15.anInt462;
						} else {
							local105 = local15.modelSeqId;
						}
						if (local105 != -1) {
							@Pc(118) SeqType local118 = SeqTypeList.get(local105);
							if (local118 != null) {
								local15.anInt500 += Protocol.anInt4247;
								while (local15.anInt500 > local118.anIntArray474[local15.anInt510]) {
									local15.anInt500 -= local118.anIntArray474[local15.anInt510];
									local15.anInt510++;
									if (local118.frames.length <= local15.anInt510) {
										local15.anInt510 -= local118.anInt5362;
										if (local15.anInt510 < 0 || local118.frames.length <= local15.anInt510) {
											local15.anInt510 = 0;
										}
									}
									local15.anInt496 = local15.anInt510 + 1;
									if (local118.frames.length <= local15.anInt496) {
										local15.anInt496 -= local118.anInt5362;
										if (local15.anInt496 < 0 || local118.frames.length <= local15.anInt496) {
											local15.anInt496 = -1;
										}
									}
									InterfaceList.redraw(local15);
								}
							}
						}
					}
					if (local15.modelRotationSpeed != 0 && !local15.if3) {
						@Pc(239) int local239 = local15.modelRotationSpeed >> 16;
						@Pc(243) int local243 = local239 * Protocol.anInt4247;
						local105 = local15.modelRotationSpeed << 16 >> 16;
						local15.modelXAngle = local243 + local15.modelXAngle & 0x7FF;
						local105 *= Protocol.anInt4247;
						local15.modelYAngle = local15.modelYAngle + local105 & 0x7FF;
						InterfaceList.redraw(local15);
					}
				}
			}
		}
	}
}
