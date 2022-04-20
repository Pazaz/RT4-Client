import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray115;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!na;")
	public static final JagString aClass100_946 = Static28.parse("(R");

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_947 = Static28.parse(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	public static int anInt5028 = 0;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static int anInt5029 = 0;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
	public static int anInt5032 = 0;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public static int anInt5034 = -2;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray116 = new boolean[100];

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!na;")
	public static final JagString aClass100_951 = Static28.parse("<col=ff7000>");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILclient!km;)V")
	public static void method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Npc arg2) {
		if (arg2.anInt3369 == arg1 && arg1 != -1) {
			@Pc(10) SeqType local10 = Static36.method941(arg1);
			@Pc(13) int local13 = local10.anInt5347;
			if (local13 == 1) {
				arg2.anInt3373 = 1;
				arg2.anInt3425 = 0;
				arg2.anInt3360 = 0;
				arg2.anInt3371 = 0;
				arg2.anInt3420 = arg0;
				Static152.method2836(arg2.anInt3421, local10, arg2.anInt3412, false, arg2.anInt3425);
			}
			if (local13 == 2) {
				arg2.anInt3371 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3369 == -1 || Static36.method941(arg1).anInt5355 >= Static36.method941(arg2.anInt3369).anInt5355) {
			arg2.anInt3360 = 0;
			arg2.anInt3369 = arg1;
			arg2.anInt3373 = 1;
			arg2.anInt3371 = 0;
			arg2.anInt3420 = arg0;
			arg2.anInt3405 = arg2.anInt3409;
			arg2.anInt3425 = 0;
			if (arg2.anInt3369 != -1) {
				Static152.method2836(arg2.anInt3421, Static36.method941(arg2.anInt3369), arg2.anInt3412, false, arg2.anInt3425);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public static void method3858() {
		for (@Pc(1) int local1 = 0; local1 < Static22.anInt726; local1++) {
			@Pc(8) Scenery local8 = Static243.aClass31Array3[local1];
			Static266.method4193(local8);
			Static243.aClass31Array3[local1] = null;
		}
		Static22.anInt726 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lclient!j;")
	public static TextureOp method3860(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new TextureOp20();
		} else if (arg0 == 1) {
			return new TextureOpColorFill();
		} else if (arg0 == 2) {
			return new TextureOp27();
		} else if (arg0 == 3) {
			return new TextureOp25();
		} else if (arg0 == 4) {
			return new TextureOp17();
		} else if (arg0 == 5) {
			return new TextureOp21();
		} else if (arg0 == 6) {
			return new TextureOp2();
		} else if (arg0 == 7) {
			return new TextureOpCombine();
		} else if (arg0 == 8) {
			return new TextureOpCurve();
		} else if (arg0 == 9) {
			return new TextureOp7();
		} else if (arg0 == 10) {
			return new TextureOpColorGradient();
		} else if (arg0 == 11) {
			return new TextureOp18();
		} else if (arg0 == 12) {
			return new TextureOp1();
		} else if (arg0 == 13) {
			return new TextureOp26();
		} else if (arg0 == 14) {
			return new TextureOp28();
		} else if (arg0 == 15) {
			return new TextureOp14();
		} else if (arg0 == 16) {
			return new TextureOp8();
		} else if (arg0 == 17) {
			return new TextureOp13();
		} else if (arg0 == 18) {
			return new TextureOpTiledSprite();
		} else if (arg0 == 19) {
			return new TextureOp16();
		} else if (arg0 == 20) {
			return new TextureOp11();
		} else if (arg0 == 21) {
			return new TextureOp5();
		} else if (arg0 == 22) {
			return new TextureOp31();
		} else if (arg0 == 23) {
			return new TextureOp15();
		} else if (arg0 == 24) {
			return new TextureOp10();
		} else if (arg0 == 25) {
			return new TextureOp30();
		} else if (arg0 == 26) {
			return new TextureOpBinary();
		} else if (arg0 == 27) {
			return new TextureOp6();
		} else if (arg0 == 28) {
			return new TextureOp22();
		} else if (arg0 == 29) {
			return new TextureOp29();
		} else if (arg0 == 30) {
			return new TextureOp9();
		} else if (arg0 == 31) {
			return new TextureOp12();
		} else if (arg0 == 32) {
			return new TextureOp24();
		} else if (arg0 == 33) {
			return new TextureOp3();
		} else if (arg0 == 34) {
			return new TextureOp4();
		} else if (arg0 == 35) {
			return new TextureOp23();
		} else if (arg0 == 36) {
			return new TextureOp32();
		} else if (arg0 == 37) {
			return new TextureOp19();
		} else if (arg0 == 38) {
			return new TextureOp33();
		} else if (arg0 == 39) {
			return new TextureOpSprite();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3866(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static93.aClass150_1);
		arg0.removeMouseMotionListener(Static93.aClass150_1);
		arg0.removeFocusListener(Static93.aClass150_1);
		Static57.anInt1759 = 0;
	}
}
