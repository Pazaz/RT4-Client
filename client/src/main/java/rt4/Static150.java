package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "Lclient!na;")
	public static final JagString aClass100_687 = JagString.parse(")4p=");

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
	public static int anInt3582 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILclient!be;Z)V")
	public static void method2801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) boolean arg3) {
		@Pc(4) int local4 = arg2.anInt445;
		@Pc(7) int local7 = arg2.anInt459;
		if (arg2.dynamicWidthValue == 0) {
			arg2.anInt445 = arg2.baseWidth;
		} else if (arg2.dynamicWidthValue == 1) {
			arg2.anInt445 = arg1 - arg2.baseWidth;
		} else if (arg2.dynamicWidthValue == 2) {
			arg2.anInt445 = arg2.baseWidth * arg1 >> 14;
		} else if (arg2.dynamicWidthValue == 3) {
			if (arg2.type == 2) {
				arg2.anInt445 = arg2.baseWidth * 32 + (arg2.baseWidth - 1) * arg2.anInt512;
			} else if (arg2.type == 7) {
				arg2.anInt445 = arg2.baseWidth * 115 + arg2.anInt512 * (arg2.baseWidth - 1);
			}
		}
		if (arg2.dynamicHeightValue == 0) {
			arg2.anInt459 = arg2.baseHeight;
		} else if (arg2.dynamicHeightValue == 1) {
			arg2.anInt459 = arg0 - arg2.baseHeight;
		} else if (arg2.dynamicHeightValue == 2) {
			arg2.anInt459 = arg0 * arg2.baseHeight >> 14;
		} else if (arg2.dynamicHeightValue == 3) {
			if (arg2.type == 2) {
				arg2.anInt459 = (arg2.baseHeight - 1) * arg2.anInt516 + arg2.baseHeight * 32;
			} else if (arg2.type == 7) {
				arg2.anInt459 = arg2.baseHeight * 12 + (arg2.baseHeight - 1) * arg2.anInt516;
			}
		}
		if (arg2.dynamicWidthValue == 4) {
			arg2.anInt445 = arg2.aspectWidth * arg2.anInt459 / arg2.aspectHeight;
		}
		if (arg2.dynamicHeightValue == 4) {
			arg2.anInt459 = arg2.aspectHeight * arg2.anInt445 / arg2.aspectWidth;
		}
		if (Static121.aBoolean154 && (InterfaceList.getServerActiveProperties(arg2).accessMask != 0 || arg2.type == 0)) {
			if (arg2.anInt459 < 5 && arg2.anInt445 < 5) {
				arg2.anInt459 = 5;
				arg2.anInt445 = 5;
			} else {
				if (arg2.anInt445 <= 0) {
					arg2.anInt445 = 5;
				}
				if (arg2.anInt459 <= 0) {
					arg2.anInt459 = 5;
				}
			}
		}
		if (arg2.anInt453 == 1337) {
			Static280.aClass13_26 = arg2;
		}
		if (arg3 && arg2.anObjectArray17 != null && (local4 != arg2.anInt445 || arg2.anInt459 != local7)) {
			@Pc(305) HookRequest local305 = new HookRequest();
			local305.arguments = arg2.anObjectArray17;
			local305.source = arg2;
			InterfaceList.lowPriorityRequests.addTail(local305);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!fl;IIII)V")
	public static void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) AreaSound arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.sound == -1 && arg1.sounds == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		if (arg1.anInt2037 < arg0) {
			local20 = arg0 - arg1.anInt2037;
		} else if (arg1.anInt2041 > arg0) {
			local20 = arg1.anInt2041 - arg0;
		}
		if (arg1.anInt2028 < arg4) {
			local20 += arg4 - arg1.anInt2028;
		} else if (arg4 < arg1.anInt2029) {
			local20 += arg1.anInt2029 - arg4;
		}
		if (arg1.radius == 0 || arg1.radius < local20 - 64 || Preferences.ambientSoundsVolume == 0 || arg2 != arg1.anInt2033) {
			if (arg1.primaryStream != null) {
				client.soundStream.removeSubStream(arg1.primaryStream);
				arg1.primaryStream = null;
			}
			if (arg1.secondaryStream != null) {
				client.soundStream.removeSubStream(arg1.secondaryStream);
				arg1.secondaryStream = null;
			}
			return;
		}
		local20 -= 64;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(134) int local134 = (arg1.radius - local20) * Preferences.ambientSoundsVolume / arg1.radius;
		if (arg1.primaryStream != null) {
			arg1.primaryStream.method386(local134);
		} else if (arg1.sound >= 0) {
			@Pc(150) SynthSound local150 = SynthSound.create(client.js5Archive4, arg1.sound, 0);
			if (local150 != null) {
				@Pc(158) PcmSound local158 = local150.method3989().method2648(client.resampler);
				@Pc(163) SoundPcmStream local163 = Static284.method404(local158, local134);
				local163.method396(-1);
				client.soundStream.method1343(local163);
				arg1.primaryStream = local163;
			}
		}
		if (arg1.secondaryStream != null) {
			arg1.secondaryStream.method386(local134);
			if (!arg1.secondaryStream.method4654()) {
				arg1.secondaryStream = null;
			}
		} else if (arg1.sounds != null && (arg1.anInt2034 -= arg3) <= 0) {
			@Pc(219) int local219 = (int) ((double) arg1.sounds.length * Math.random());
			@Pc(227) SynthSound local227 = SynthSound.create(client.js5Archive4, arg1.sounds[local219], 0);
			if (local227 != null) {
				@Pc(236) PcmSound local236 = local227.method3989().method2648(client.resampler);
				@Pc(241) SoundPcmStream local241 = Static284.method404(local236, local134);
				local241.method396(0);
				client.soundStream.method1343(local241);
				arg1.anInt2034 = (int) ((double) (arg1.anInt2040 - arg1.anInt2032) * Math.random()) + arg1.anInt2032;
				arg1.secondaryStream = local241;
			}
		}
	}

}
