package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public static int anInt1885;
	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt660 = -1;
	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt3337 = 0;
	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public static int anInt3075 = -1;
	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public static int anInt1396 = 0;
	@OriginalMember(owner = "client!di", name = "H", descriptor = "Z")
	public static boolean aBoolean84 = false;
	@OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
	public static int anInt4620;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!be;)Lclient!be;")
	public static Component method938(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = InterfaceList.getServerActiveProperties(arg0).getDragDepth();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = InterfaceList.getComponent(arg0.layer);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!be;)Z")
	public static boolean method947(@OriginalArg(0) Component arg0) {
		if (Cheat.qaOpTest) {
			if (InterfaceList.getServerActiveProperties(arg0).events != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.hidden;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!be;BIIII)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (aBoolean84) {
			anInt1396 = 32;
		} else {
			anInt1396 = 0;
		}
		aBoolean84 = false;
		@Pc(139) int local139;
		if (Mouse.pressedButton != 0) {
			if (arg4 <= arg3 && arg4 + 16 > arg3 && arg0 >= arg5 && arg5 + 16 > arg0) {
				arg2.scrollY -= 4;
				InterfaceList.redraw(arg2);
			} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg0 >= arg1 + arg5 - 16 && arg1 + arg5 > arg0) {
				arg2.scrollY += 4;
				InterfaceList.redraw(arg2);
			} else if (arg3 >= arg4 - anInt1396 && arg3 < arg4 + anInt1396 + 16 && arg0 >= arg5 + 16 && arg1 + arg5 - 16 > arg0) {
				local139 = arg1 * (arg1 - 32) / arg6;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(150) int local150 = arg1 - local139 - 32;
				@Pc(162) int local162 = arg0 - local139 / 2 - arg5 - 16;
				arg2.scrollY = (arg6 - arg1) * local162 / local150;
				InterfaceList.redraw(arg2);
				aBoolean84 = true;
			}
		}
		if (MouseWheel.wheelRotation == 0) {
			return;
		}
		local139 = arg2.width;
		if (arg4 - local139 <= arg3 && arg5 <= arg0 && arg3 < arg4 + 16 && arg1 + arg5 >= arg0) {
			arg2.scrollY += MouseWheel.wheelRotation * 45;
			InterfaceList.redraw(arg2);
		}
	}
}
