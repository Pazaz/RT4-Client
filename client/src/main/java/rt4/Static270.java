package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_570 = JagString.parse(")2");
    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_1089 = JagString.parse(")2");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	public static int anInt5794 = -1;

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
