import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	public static int anInt1049;

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
	public static int anInt1060;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Lclient!na;")
	private static final JagString aClass100_195 = Static28.parse("Discard");

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "[I")
	public static final int[] anIntArray80 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "Lclient!na;")
	private static final JagString aClass100_207 = Static28.parse("Jan");

	@OriginalMember(owner = "client!ck", name = "hb", descriptor = "Lclient!na;")
	private static final JagString aClass100_212 = Static28.parse("Feb");

	@OriginalMember(owner = "client!ck", name = "gb", descriptor = "Lclient!na;")
	private static final JagString aClass100_211 = Static28.parse("Mar");

	@OriginalMember(owner = "client!ck", name = "db", descriptor = "Lclient!na;")
	private static final JagString aClass100_210 = Static28.parse("Apr");

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!na;")
	private static final JagString aClass100_199 = Static28.parse("May");

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "Lclient!na;")
	private static final JagString aClass100_204 = Static28.parse("Jun");

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "Lclient!na;")
	private static final JagString aClass100_202 = Static28.parse("Jul");

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!na;")
	private static final JagString aClass100_198 = Static28.parse("Aug");

	@OriginalMember(owner = "client!ck", name = "V", descriptor = "Lclient!na;")
	private static final JagString aClass100_208 = Static28.parse("Sep");

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "Lclient!na;")
	private static final JagString aClass100_206 = Static28.parse("Oct");

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lclient!na;")
	private static final JagString aClass100_209 = Static28.parse("Nov");

	@OriginalMember(owner = "client!ck", name = "O", descriptor = "Lclient!na;")
	private static final JagString aClass100_205 = Static28.parse("Dec");

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array40 = new JagString[] { aClass100_207, aClass100_212, aClass100_211, aClass100_210, aClass100_199, aClass100_204, aClass100_202, aClass100_198, aClass100_208, aClass100_206, aClass100_209, aClass100_205 };

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public static volatile int anInt1034 = 0;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "Lclient!na;")
	private static final JagString aClass100_200 = Static28.parse("Loaded world list data");

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Lclient!na;")
	public static JagString aClass100_203 = null;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!ck", name = "eb", descriptor = "Z")
	public static boolean verifyIdChanged = false;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!va;Lclient!ve;Lclient!ve;Lclient!ve;)Z")
	public static boolean method876(@OriginalArg(1) MidiPcmStream arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static210.aClass153_87 = arg1;
		Static78.aClass153_32 = arg3;
		Static252.aClass153_103 = arg2;
		Static172.aClass3_Sub3_Sub4_2 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)Lclient!eg;")
	public static SpotAnimType method877(@OriginalArg(1) int arg0) {
		@Pc(10) SpotAnimType local10 = (SpotAnimType) Static279.aClass99_38.method3106((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static132.aClass153_48.method4495(Static206.method3681(arg0), Static133.method4010(arg0));
		local10 = new SpotAnimType();
		local10.anInt1751 = arg0;
		if (local26 != null) {
			local10.method1316(new Buffer(local26));
		}
		Static279.aClass99_38.method3095(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!fe;I)V")
	public static void method879(@OriginalArg(0) PathingEntity arg0) {
		arg0.aBoolean171 = false;
		@Pc(18) SeqType local18;
		if (arg0.anInt3366 != -1) {
			local18 = Static36.method941(arg0.anInt3366);
			if (local18 == null || local18.anIntArray473 == null) {
				arg0.anInt3366 = -1;
			} else {
				arg0.anInt3396++;
				if (local18.anIntArray473.length > arg0.anInt3407 && arg0.anInt3396 > local18.anIntArray474[arg0.anInt3407]) {
					arg0.anInt3396 = 1;
					arg0.anInt3407++;
					arg0.anInt3388++;
					Static152.method2836(arg0.anInt3421, local18, arg0.anInt3412, arg0 == Static173.self, arg0.anInt3407);
				}
				if (arg0.anInt3407 >= local18.anIntArray473.length) {
					arg0.anInt3407 = 0;
					arg0.anInt3396 = 0;
					Static152.method2836(arg0.anInt3421, local18, arg0.anInt3412, Static173.self == arg0, arg0.anInt3407);
				}
				arg0.anInt3388 = arg0.anInt3407 + 1;
				if (arg0.anInt3388 >= local18.anIntArray473.length) {
					arg0.anInt3388 = 0;
				}
			}
		}
		@Pc(156) int local156;
		if (arg0.anInt3432 != -1 && Static83.anInt372 >= arg0.anInt3359) {
			local156 = method877(arg0.anInt3432).anInt1754;
			if (local156 == -1) {
				arg0.anInt3432 = -1;
			} else {
				@Pc(165) SeqType local165 = Static36.method941(local156);
				if (local165 == null || local165.anIntArray473 == null) {
					arg0.anInt3432 = -1;
				} else {
					if (arg0.anInt3399 < 0) {
						arg0.anInt3399 = 0;
						Static152.method2836(arg0.anInt3421, local165, arg0.anInt3412, Static173.self == arg0, 0);
					}
					arg0.anInt3361++;
					if (arg0.anInt3399 < local165.anIntArray473.length && local165.anIntArray474[arg0.anInt3399] < arg0.anInt3361) {
						arg0.anInt3399++;
						arg0.anInt3361 = 1;
						Static152.method2836(arg0.anInt3421, local165, arg0.anInt3412, Static173.self == arg0, arg0.anInt3399);
					}
					if (arg0.anInt3399 >= local165.anIntArray473.length) {
						arg0.anInt3432 = -1;
					}
					arg0.anInt3418 = arg0.anInt3399 + 1;
					if (local165.anIntArray473.length <= arg0.anInt3418) {
						arg0.anInt3418 = -1;
					}
				}
			}
		}
		if (arg0.anInt3369 != -1 && arg0.anInt3420 <= 1) {
			local18 = Static36.method941(arg0.anInt3369);
			if (local18.anInt5363 == 1 && arg0.anInt3405 > 0 && Static83.anInt372 >= arg0.anInt3395 && Static83.anInt372 > arg0.anInt3386) {
				arg0.anInt3420 = 1;
				return;
			}
		}
		if (arg0.anInt3369 != -1 && arg0.anInt3420 == 0) {
			local18 = Static36.method941(arg0.anInt3369);
			if (local18 == null || local18.anIntArray473 == null) {
				arg0.anInt3369 = -1;
			} else {
				arg0.anInt3360++;
				if (arg0.anInt3425 < local18.anIntArray473.length && arg0.anInt3360 > local18.anIntArray474[arg0.anInt3425]) {
					arg0.anInt3360 = 1;
					arg0.anInt3425++;
					Static152.method2836(arg0.anInt3421, local18, arg0.anInt3412, arg0 == Static173.self, arg0.anInt3425);
				}
				if (local18.anIntArray473.length <= arg0.anInt3425) {
					arg0.anInt3425 -= local18.anInt5362;
					arg0.anInt3371++;
					if (arg0.anInt3371 >= local18.anInt5357) {
						arg0.anInt3369 = -1;
					} else if (arg0.anInt3425 >= 0 && local18.anIntArray473.length > arg0.anInt3425) {
						Static152.method2836(arg0.anInt3421, local18, arg0.anInt3412, Static173.self == arg0, arg0.anInt3425);
					} else {
						arg0.anInt3369 = -1;
					}
				}
				arg0.anInt3373 = arg0.anInt3425 + 1;
				if (arg0.anInt3373 >= local18.anIntArray473.length) {
					arg0.anInt3373 -= local18.anInt5362;
					if (local18.anInt5357 <= arg0.anInt3371 + 1) {
						arg0.anInt3373 = -1;
					} else if (arg0.anInt3373 < 0 || arg0.anInt3373 >= local18.anIntArray473.length) {
						arg0.anInt3373 = -1;
					}
				}
				arg0.aBoolean171 = local18.aBoolean279;
			}
		}
		if (arg0.anInt3420 > 0) {
			arg0.anInt3420--;
		}
		for (local156 = 0; local156 < arg0.aClass147Array3.length; local156++) {
			@Pc(545) Class147 local545 = arg0.aClass147Array3[local156];
			if (local545 != null) {
				if (local545.anInt5408 > 0) {
					local545.anInt5408--;
				} else {
					@Pc(570) SeqType local570 = Static36.method941(local545.anInt5396);
					if (local570 == null || local570.anIntArray473 == null) {
						arg0.aClass147Array3[local156] = null;
					} else {
						local545.anInt5404++;
						if (local545.anInt5399 < local570.anIntArray473.length && local545.anInt5404 > local570.anIntArray474[local545.anInt5399]) {
							local545.anInt5399++;
							local545.anInt5404 = 1;
							Static152.method2836(arg0.anInt3421, local570, arg0.anInt3412, arg0 == Static173.self, local545.anInt5399);
						}
						if (local570.anIntArray473.length <= local545.anInt5399) {
							local545.anInt5400++;
							local545.anInt5399 -= local570.anInt5362;
							if (local570.anInt5357 <= local545.anInt5400) {
								arg0.aClass147Array3[local156] = null;
							} else if (local545.anInt5399 >= 0 && local545.anInt5399 < local570.anIntArray473.length) {
								Static152.method2836(arg0.anInt3421, local570, arg0.anInt3412, Static173.self == arg0, local545.anInt5399);
							} else {
								arg0.aClass147Array3[local156] = null;
							}
						}
						local545.anInt5398 = local545.anInt5399 + 1;
						if (local570.anIntArray473.length <= local545.anInt5398) {
							local545.anInt5398 -= local570.anInt5362;
							if (local545.anInt5400 + 1 >= local570.anInt5357) {
								local545.anInt5398 = -1;
							} else if (local545.anInt5398 < 0 || local570.anIntArray473.length <= local545.anInt5398) {
								local545.anInt5398 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([Lclient!na;B)Lclient!na;")
	public static JagString method882(@OriginalArg(0) JagString[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static118.method2355(0, arg0.length, arg0);
	}
}
