import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!mi", name = "T", descriptor = "[Lclient!ok;")
	public static IndexedSprite[] aClass36Array12;

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray87;

	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
	public static int anInt3893;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_760 = Static28.parse(")1");

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "[Lclient!e;")
	public static final Player[] aClass8_Sub4_Sub1Array1 = new Player[2048];

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "[J")
	public static final long[] aLongArray5 = new long[500];

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "[[[Lclient!ih;")
	public static final LinkedList[][][] aClass69ArrayArrayArray1 = new LinkedList[4][104][104];

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([IBLclient!km;[I[I)V")
	public static void method3037(@OriginalArg(0) int[] arg0, @OriginalArg(2) Npc arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg0[local3];
			@Pc(23) int local23 = arg2[local3];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg1.aClass147Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass147Array3[local25] = null;
					} else {
						@Pc(60) SeqType local60 = Static36.method941(local15);
						@Pc(65) Class147 local65 = arg1.aClass147Array3[local25];
						@Pc(68) int local68 = local60.anInt5347;
						if (local65 != null) {
							if (local15 == local65.anInt5396) {
								if (local68 == 0) {
									local65 = arg1.aClass147Array3[local25] = null;
								} else if (local68 == 1) {
									local65.anInt5399 = 0;
									local65.anInt5400 = 0;
									local65.anInt5398 = 1;
									local65.anInt5404 = 0;
									local65.anInt5408 = local23;
									Static152.method2836(arg1.anInt3421, local60, arg1.anInt3412, false, 0);
								} else if (local68 == 2) {
									local65.anInt5400 = 0;
								}
							} else if (local60.anInt5355 >= Static36.method941(local65.anInt5396).anInt5355) {
								local65 = arg1.aClass147Array3[local25] = null;
							}
						}
						if (local65 == null) {
							local65 = arg1.aClass147Array3[local25] = new Class147();
							local65.anInt5398 = 1;
							local65.anInt5404 = 0;
							local65.anInt5408 = local23;
							local65.anInt5396 = local15;
							local65.anInt5400 = 0;
							local65.anInt5399 = 0;
							Static152.method2836(arg1.anInt3421, local60, arg1.anInt3412, false, 0);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}
}
