package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	public static int anInt1275;
	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!be;")
	public static Component aClass13_14 = null;
	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!be;")
	public static Component aClass13_1 = null;
	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public static int anInt5388 = 0;
	@OriginalMember(owner = "client!km", name = "pc", descriptor = "Z")
	public static boolean aBoolean172 = false;
	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static int anInt4851;
	@OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
	public static int anInt4035 = 0;
	@OriginalMember(owner = "client!em", name = "z", descriptor = "Z")
	public static boolean aBoolean108 = false;
	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public static int anInt2910;
	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static int anInt5457;
	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt5208;
	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt1736;
	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt2261;
	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public static int anInt4073;
	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	public static int anInt3324;
	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public static int anInt5556;
	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	public static int anInt4581;
	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt5752;
	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1014(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, local5 + arg1.length())) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!be;)V")
	public static void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		if (aClass13_14 != null || aBoolean108 || (arg2 == null || method1836(arg2) == null)) {
			return;
		}
		aClass13_14 = arg2;
		aClass13_1 = method1836(arg2);
		anInt5388 = arg1;
		aBoolean172 = false;
		anInt4851 = 0;
		anInt4035 = arg0;
	}

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(B)V")
	public static void method1019() {
		Component.sprites.method3103();
		Component.models.method3103();
		Component.fonts.method3103();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!be;)Lclient!be;")
	public static Component method1836(@OriginalArg(1) Component arg0) {
		@Pc(12) Component local12 = Static36.method938(arg0);
		if (local12 == null) {
			local12 = arg0.aClass13_5;
		}
		return local12;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method4637() {
		Static165.aClass3_Sub2_Sub1_8 = null;
		Static39.aClass3_Sub2_Sub1_1 = null;
		Static92.aClass3_Sub2_Sub1_6 = null;
		Static181.aClass3_Sub2_Sub1_9 = null;
		Static204.aClass3_Sub2_Sub1_10 = null;
	}
}
