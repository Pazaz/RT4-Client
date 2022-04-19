import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static131.method2577("argument count");
			}
			@Pc(15) int local15 = -1;
			Static187.anInt4413 = Integer.parseInt(arg0[0]);
			Static83.anInt370 = 2;
			if (arg0[1].equals("live")) {
				Static81.anInt2219 = 0;
			} else if (arg0[1].equals("rc")) {
				Static81.anInt2219 = 1;
			} else if (arg0[1].equals("wip")) {
				Static81.anInt2219 = 2;
			} else {
				Static131.method2577("modewhat");
			}
			Static249.aBoolean282 = false;
			try {
				@Pc(63) byte[] local63 = arg0[2].getBytes("ISO-8859-1");
				local15 = Static101.method2053(Static10.method346(local63, local63.length, 0));
			} catch (@Pc(74) Exception local74) {
			}
			if (local15 != -1) {
				Static141.anInt3470 = local15;
			} else if (arg0[2].equals("english")) {
				Static141.anInt3470 = 0;
			} else if (arg0[2].equals("german")) {
				Static141.anInt3470 = 1;
			} else {
				Static131.method2577("language");
			}
			Static3.method4659(Static141.anInt3470);
			Static233.aBoolean254 = false;
			Static150.aBoolean175 = false;
			if (arg0[3].equals("game0")) {
				Static266.anInt5343 = 0;
			} else if (arg0[3].equals("game1")) {
				Static266.anInt5343 = 1;
			} else {
				Static131.method2577("game");
			}
			Static279.anInt5880 = 0;
			Static178.aBoolean203 = false;
			Static204.anInt4760 = 0;
			Static47.aClass100_991 = Static186.aClass100_827;
			@Pc(146) client local146 = new client();
			Static215.aClient1 = local146;
			local146.method936(Static81.anInt2219 + 32, "runescape");
			Static39.aFrame1.setLocation(40, 40);
		} catch (@Pc(167) Exception local167) {
			Static89.method1839(null, local167);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected final void method934() {
		if (Static244.anInt5370 == 1000) {
			return;
		}
		@Pc(15) boolean local15 = Static138.method2699();
		if (local15 && Static144.aBoolean173 && Static11.aClass62_1 != null) {
			Static11.aClass62_1.method3570();
		}
		if ((Static244.anInt5370 == 30 || Static244.anInt5370 == 10) && (Static35.aBoolean66 || Static97.aLong89 != 0L && Static97.aLong89 < Class209.method5096())) {
			Static241.method4540(Static35.aBoolean66, Static144.method2736(), Static114.anInt5831, Static22.anInt729);
		}
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (Static69.aFrame2 == null) {
			@Pc(65) Container local65;
			if (Static69.aFrame2 != null) {
				local65 = Static69.aFrame2;
			} else if (Static39.aFrame1 == null) {
				local65 = Static71.aClass213_3.anApplet2;
			} else {
				local65 = Static39.aFrame1;
			}
			local80 = local65.getSize().width;
			local84 = local65.getSize().height;
			if (local65 == Static39.aFrame1) {
				@Pc(90) Insets local90 = Static39.aFrame1.getInsets();
				local80 -= local90.right + local90.left;
				local84 -= local90.top + local90.bottom;
			}
			if (local80 != Static72.anInt2046 || local84 != Static122.anInt3045) {
				Static203.method3662();
				Static97.aLong89 = Class209.method5096() + 500L;
			}
		}
		if (Static69.aFrame2 != null && !Static26.aBoolean59 && (Static244.anInt5370 == 30 || Static244.anInt5370 == 10)) {
			Static241.method4540(false, Static214.anInt5581, -1, -1);
		}
		@Pc(158) boolean local158 = false;
		if (Static69.aBoolean115) {
			local158 = true;
			Static69.aBoolean115 = false;
		}
		if (local158) {
			Static139.method2704();
		}
		if (Static239.aBoolean269) {
			for (local80 = 0; local80 < 100; local80++) {
				Static186.aBooleanArray100[local80] = true;
			}
		}
		if (Static244.anInt5370 == 0) {
			Static13.method473(null, local158, Static126.aClass100_602, Static199.anInt4670);
		} else if (Static244.anInt5370 == 5) {
			Static182.method3359(false, Static280.aClass3_Sub2_Sub9_43);
		} else if (Static244.anInt5370 == 10) {
			Static126.method2460();
		} else if (Static244.anInt5370 == 25 || Static244.anInt5370 == 28) {
			if (Static233.anInt5223 == 1) {
				if (Static230.anInt5150 < Static175.anInt4220) {
					Static230.anInt5150 = Static175.anInt4220;
				}
				local80 = (Static230.anInt5150 - Static175.anInt4220) * 50 / Static230.anInt5150;
				Static114.method4636(false, Static34.method882(new Class100[] { Static170.aClass100_621, Static229.aClass100_974, Static123.method2423(local80), Static14.aClass100_80 }));
			} else if (Static233.anInt5223 == 2) {
				if (Static38.anInt1196 < Static271.anInt5804) {
					Static38.anInt1196 = Static271.anInt5804;
				}
				local80 = (Static38.anInt1196 - Static271.anInt5804) * 50 / Static38.anInt1196 + 50;
				Static114.method4636(false, Static34.method882(new Class100[] { Static170.aClass100_621, Static229.aClass100_974, Static123.method2423(local80), Static14.aClass100_80 }));
			} else {
				Static114.method4636(false, Static170.aClass100_621);
			}
		} else if (Static244.anInt5370 == 30) {
			Static89.method1841();
		} else if (Static244.anInt5370 == 40) {
			Static114.method4636(false, Static34.method882(new Class100[] { Static232.aClass100_986, Static269.aClass100_556, Static262.aClass100_1077 }));
		}
		if (Static239.aBoolean269 && Static244.anInt5370 != 0) {
			Static239.method4153();
			for (local80 = 0; local80 < Static24.anInt766; local80++) {
				Static31.aBooleanArray29[local80] = false;
			}
		} else {
			@Pc(388) Graphics local388;
			if ((Static244.anInt5370 == 30 || Static244.anInt5370 == 10) && Static199.anInt4672 == 0 && !local158) {
				try {
					local388 = Static154.aCanvas1.getGraphics();
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						if (Static31.aBooleanArray29[local84]) {
							Static260.aClass27_2.method4191(Static224.anIntArray443[local84], Static264.anIntArray410[local84], Static67.anIntArray320[local84], local388, Static50.anIntArray133[local84]);
							Static31.aBooleanArray29[local84] = false;
						}
					}
				} catch (@Pc(423) Exception local423) {
					Static154.aCanvas1.repaint();
				}
			} else if (Static244.anInt5370 != 0) {
				try {
					local388 = Static154.aCanvas1.getGraphics();
					Static260.aClass27_2.method4186(local388);
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						Static31.aBooleanArray29[local84] = false;
					}
				} catch (@Pc(453) Exception local453) {
					Static154.aCanvas1.repaint();
				}
			}
		}
		if (Static107.aBoolean147) {
			Static213.method3729();
		}
		if (Static164.aBoolean191 && Static244.anInt5370 == 10 && Static154.anInt3711 != -1) {
			Static164.aBoolean191 = false;
			Static203.method3663(Static71.aClass213_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected final void method928() {
		if (Static239.aBoolean269) {
			Static239.method4169();
		}
		if (Static69.aFrame2 != null) {
			Static25.method714(Static69.aFrame2, Static71.aClass213_3);
			Static69.aFrame2 = null;
		}
		if (Static71.aClass213_3 != null) {
			Static71.aClass213_3.method5121(this.getClass());
		}
		if (Static178.aClass74_1 != null) {
			Static178.aClass74_1.aBoolean151 = false;
		}
		Static178.aClass74_1 = null;
		if (Static124.aClass95_2 != null) {
			Static124.aClass95_2.method2834();
			Static124.aClass95_2 = null;
		}
		Static31.method847(Static154.aCanvas1);
		Static223.method3866(Static154.aCanvas1);
		if (Static71.aClass111_2 != null) {
			Static71.aClass111_2.method3291(Static154.aCanvas1);
		}
		Static6.method82();
		Static251.method4277();
		Static71.aClass111_2 = null;
		if (Static11.aClass62_1 != null) {
			Static11.aClass62_1.method3575();
		}
		if (Static147.aClass62_2 != null) {
			Static147.aClass62_2.method3575();
		}
		Static107.aClass73_3.method2329();
		Static86.aClass80_3.method2466();
		try {
			if (Static172.aClass38_4 != null) {
				Static172.aClass38_4.method1455();
			}
			if (Static47.aClass38Array2 != null) {
				for (@Pc(95) int local95 = 0; local95 < Static47.aClass38Array2.length; local95++) {
					if (Static47.aClass38Array2[local95] != null) {
						Static47.aClass38Array2[local95].method1455();
					}
				}
			}
			if (Static190.aClass38_5 != null) {
				Static190.aClass38_5.method1455();
			}
			if (Static121.aClass38_3 != null) {
				Static121.aClass38_3.method1455();
			}
		} catch (@Pc(129) IOException local129) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		if (!this.method925()) {
			return;
		}
		Static187.anInt4413 = Integer.parseInt(this.getParameter("worldid"));
		Static83.anInt370 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static83.anInt370 < 0 || Static83.anInt370 > 1) {
			Static83.anInt370 = 0;
		}
		Static81.anInt2219 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static81.anInt2219 < 0 || Static81.anInt2219 > 2) {
			Static81.anInt2219 = 0;
		}
		@Pc(50) String local50 = this.getParameter("advertsuppressed");
		if (local50 != null && local50.equals("1")) {
			Static249.aBoolean282 = true;
		} else {
			Static249.aBoolean282 = false;
		}
		try {
			Static141.anInt3470 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(69) Exception local69) {
			Static141.anInt3470 = 0;
		}
		Static3.method4659(Static141.anInt3470);
		@Pc(78) String local78 = this.getParameter("objecttag");
		if (local78 != null && local78.equals("1")) {
			Static233.aBoolean254 = true;
		} else {
			Static233.aBoolean254 = false;
		}
		@Pc(94) String local94 = this.getParameter("js");
		if (local94 != null && local94.equals("1")) {
			Static150.aBoolean175 = true;
		} else {
			Static150.aBoolean175 = false;
		}
		@Pc(111) String local111 = this.getParameter("game");
		if (local111 != null && local111.equals("1")) {
			Static266.anInt5343 = 1;
		} else {
			Static266.anInt5343 = 0;
		}
		try {
			Static204.anInt4760 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static204.anInt4760 = 0;
		}
		Static47.aClass100_991 = Static227.aClass100_966.method3153(this);
		if (Static47.aClass100_991 == null) {
			Static47.aClass100_991 = Static186.aClass100_827;
		}
		@Pc(146) String local146 = this.getParameter("country");
		if (local146 != null) {
			try {
				Static279.anInt5880 = Integer.parseInt(local146);
			} catch (@Pc(153) Exception local153) {
				Static279.anInt5880 = 0;
			}
		}
		@Pc(159) String local159 = this.getParameter("haveie6");
		if (local159 != null && local159.equals("1")) {
			Static178.aBoolean203 = true;
		} else {
			Static178.aBoolean203 = false;
		}
		Static215.aClient1 = this;
		this.method937(Static81.anInt2219 + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected final void method935() {
		Static203.method3662();
		Static86.aClass80_3 = new Class80();
		Static107.aClass73_3 = new Class73();
		if (Static81.anInt2219 != 0) {
			Static51.aByteArrayArray8 = new byte[50][];
		}
		Static80.method3615(Static71.aClass213_3);
		if (Static83.anInt370 == 0) {
			Static143.aString4 = this.getCodeBase().getHost();
			Static97.anInt2508 = 443;
			Static249.anInt5428 = 43594;
		} else if (Static83.anInt370 == 1) {
			Static143.aString4 = this.getCodeBase().getHost();
			Static97.anInt2508 = Static187.anInt4413 + 50000;
			Static249.anInt5428 = Static187.anInt4413 + 40000;
		} else if (Static83.anInt370 == 2) {
			Static143.aString4 = "127.0.0.1";
			Static97.anInt2508 = Static187.anInt4413 + 50000;
			Static249.anInt5428 = Static187.anInt4413 + 40000;
		}
		if (Static266.anInt5343 == 1) {
			Static172.aBoolean199 = true;
			Static161.anInt3923 = 16777215;
			Static161.anInt3922 = 0;
			Static33.aShortArrayArray2 = Static198.aShortArrayArray4;
			Static172.aShortArrayArray7 = Static32.aShortArrayArray1;
			Static200.aShortArray65 = Static2.aShortArray1;
			Static160.aShortArray41 = Static20.aShortArray5;
		} else {
			Static33.aShortArrayArray2 = Static154.aShortArrayArray6;
			Static160.aShortArray41 = Static195.aShortArray64;
			Static172.aShortArrayArray7 = Static43.aShortArrayArray5;
			Static200.aShortArray65 = Static260.aShortArray71;
		}
		Static55.anInt1738 = Static97.anInt2508;
		Static271.anInt5800 = Static249.anInt5428;
		Static60.aString1 = Static143.aString4;
		Static208.anInt4784 = Static249.anInt5428;
		Static259.aShortArray88 = Static62.aShortArray19 = Static232.aShortArray74 = Static259.aShortArray87 = new short[256];
		Static209.anInt4794 = Static208.anInt4784;
		if (Class213.anInt5928 == 3 && Static83.anInt370 != 2) {
			Static125.anInt3103 = Static187.anInt4413;
		}
		Static156.method2958();
		Static19.method591(Static154.aCanvas1);
		Static88.method1833(Static154.aCanvas1);
		Static71.aClass111_2 = Static44.method1150();
		if (Static71.aClass111_2 != null) {
			Static71.aClass111_2.method3293(Static154.aCanvas1);
		}
		Static7.anInt986 = Class213.anInt5928;
		try {
			if (Static71.aClass213_3.aClass214_2 != null) {
				Static172.aClass38_4 = new Class38(Static71.aClass213_3.aClass214_2, 5200, 0);
				for (@Pc(162) int local162 = 0; local162 < 28; local162++) {
					Static47.aClass38Array2[local162] = new Class38(Static71.aClass213_3.aClass214Array1[local162], 6000, 0);
				}
				Static190.aClass38_5 = new Class38(Static71.aClass213_3.aClass214_3, 6000, 0);
				Static148.aClass49_4 = new Class49(255, Static172.aClass38_4, Static190.aClass38_5, 500000);
				Static121.aClass38_3 = new Class38(Static71.aClass213_3.aClass214_4, 24, 0);
				Static71.aClass213_3.aClass214Array1 = null;
				Static71.aClass213_3.aClass214_3 = null;
				Static71.aClass213_3.aClass214_4 = null;
				Static71.aClass213_3.aClass214_2 = null;
			}
		} catch (@Pc(220) IOException local220) {
			Static121.aClass38_3 = null;
			Static172.aClass38_4 = null;
			Static190.aClass38_5 = null;
			Static148.aClass49_4 = null;
		}
		Static278.aClass100_1102 = Static53.aClass100_370;
		if (Static83.anInt370 != 0) {
			Static43.aBoolean82 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected final void method929() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method942(@OriginalArg(1) int arg0) {
		Static107.aClass73_3.anInt2964++;
		Static37.aClass212_2 = null;
		Static107.aClass73_3.anInt2963 = arg0;
		Static206.aClass95_3 = null;
		Static4.anInt30 = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method943() {
		for (Static182.anInt4313 = 0; Static25.method712() && Static182.anInt4313 < 128; Static182.anInt4313++) {
			Static227.anIntArray447[Static182.anInt4313] = Static102.anInt2681;
			Static205.anIntArray426[Static182.anInt4313] = Static193.anInt4542;
		}
		Static178.anInt4247++;
		if (Static154.anInt3711 != -1) {
			Static57.method1320(0, 0, 0, Static48.anInt1448, Static154.anInt3711, 0, Static254.anInt5554);
		}
		Static119.anInt3028++;
		if (Static239.aBoolean269) {
			label191: for (@Pc(57) int local57 = 0; local57 < 32768; local57++) {
				@Pc(66) Class8_Sub4_Sub2 local66 = Static175.aClass8_Sub4_Sub2Array1[local57];
				if (local66 != null) {
					@Pc(73) byte local73 = local66.aClass96_1.aByte10;
					if ((local73 & 0x2) > 0 && local66.anInt3409 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local66.aByteArray48[0] = 1;
							local66.anIntArray318[0] = local98 + (local66.anInt3412 >> 7);
							local66.anIntArray317[0] = local106 + (local66.anInt3421 >> 7);
							Static148.aClass97Array1[Static55.anInt1735].method3056(local66.anInt3412 >> 7, local66.method2693(), false, 0, local66.method2693(), local66.anInt3421 >> 7);
							if (local66.anIntArray318[0] >= 0 && local66.anIntArray318[0] <= 104 - local66.method2693() && local66.anIntArray317[0] >= 0 && local66.anIntArray317[0] <= 104 - local66.method2693() && Static148.aClass97Array1[Static55.anInt1735].method3054(local66.anInt3421 >> 7, local66.anIntArray317[0], local66.anIntArray318[0], local66.anInt3412 >> 7)) {
								if (local66.method2693() > 1) {
									for (@Pc(226) int local226 = local66.anIntArray318[0]; local66.anIntArray318[0] + local66.method2693() > local226; local226++) {
										for (@Pc(246) int local246 = local66.anIntArray317[0]; local66.anIntArray317[0] + local66.method2693() > local246; local246++) {
											if ((Static148.aClass97Array1[Static55.anInt1735].anIntArrayArray30[local226][local246] & 0x12401FF) != 0) {
												continue label191;
											}
										}
									}
								}
								local66.anInt3409 = 1;
							}
						}
					}
					Static104.method2247(local66);
					Static37.method949(local66);
					Static34.method879(local66);
					Static148.aClass97Array1[Static55.anInt1735].method3043(local66.anInt3412 >> 7, false, local66.anInt3421 >> 7, local66.method2693(), local66.method2693());
				}
			}
		}
		if (!Static239.aBoolean269) {
			Static269.method2170();
		} else if (Static184.anInt4348 == 0 && Static179.anInt4261 == 0) {
			if (Static227.anInt5096 == 2) {
				Static125.method2450();
			} else {
				Static40.method1008();
			}
			if (Static138.anInt3439 >> 7 < 14 || Static138.anInt3439 >> 7 >= 90 || Static134.anInt3302 >> 7 < 14 || Static134.anInt3302 >> 7 >= 90) {
				Static26.method740();
			}
		}
		while (true) {
			@Pc(374) Class3_Sub19 local374;
			@Pc(379) Class13 local379;
			@Pc(387) Class13 local387;
			do {
				local374 = (Class3_Sub19) Static4.aClass69_2.method2287();
				if (local374 == null) {
					while (true) {
						do {
							local374 = (Class3_Sub19) Static115.aClass69_70.method2287();
							if (local374 == null) {
								while (true) {
									do {
										local374 = (Class3_Sub19) Static185.aClass69_101.method2287();
										if (local374 == null) {
											if (Static105.aClass13_14 != null) {
												Static4.method28();
											}
											if (Static33.aClass212_1 != null && Static33.aClass212_1.anInt5925 == 1) {
												if (Static33.aClass212_1.anObject6 != null) {
													Static169.method3175(Static175.aClass100_797, Static164.aBoolean194);
												}
												Static164.aBoolean194 = false;
												Static175.aClass100_797 = null;
												Static33.aClass212_1 = null;
											}
											if (Static83.anInt372 % 1500 == 0) {
												Static123.method2418();
											}
											return;
										}
										local379 = local374.aClass13_17;
										if (local379.anInt457 < 0) {
											break;
										}
										local387 = Static5.method32(local379.anInt456);
									} while (local387 == null || local387.aClass13Array3 == null || local387.aClass13Array3.length <= local379.anInt457 || local379 != local387.aClass13Array3[local379.anInt457]);
									Static82.method1767(local374);
								}
							}
							local379 = local374.aClass13_17;
							if (local379.anInt457 < 0) {
								break;
							}
							local387 = Static5.method32(local379.anInt456);
						} while (local387 == null || local387.aClass13Array3 == null || local379.anInt457 >= local387.aClass13Array3.length || local379 != local387.aClass13Array3[local379.anInt457]);
						Static82.method1767(local374);
					}
				}
				local379 = local374.aClass13_17;
				if (local379.anInt457 < 0) {
					break;
				}
				local387 = Static5.method32(local379.anInt456);
			} while (local387 == null || local387.aClass13Array3 == null || local387.aClass13Array3.length <= local379.anInt457 || local379 != local387.aClass13Array3[local379.anInt457]);
			Static82.method1767(local374);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method944() {
		@Pc(3) boolean local3 = Static107.aClass73_3.method2318();
		if (!local3) {
			this.method945();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method945() {
		if (Static233.anInt5226 < Static107.aClass73_3.anInt2964) {
			Static22.anInt722 = 5 * 50 * (Static107.aClass73_3.anInt2964 - 1);
			if (Static271.anInt5800 == Static209.anInt4794) {
				Static209.anInt4794 = Static55.anInt1738;
			} else {
				Static209.anInt4794 = Static271.anInt5800;
			}
			if (Static22.anInt722 > 3000) {
				Static22.anInt722 = 3000;
			}
			if (Static107.aClass73_3.anInt2964 >= 2 && Static107.aClass73_3.anInt2963 == 6) {
				this.method927("js5connect_outofdate");
				Static244.anInt5370 = 1000;
				return;
			}
			if (Static107.aClass73_3.anInt2964 >= 4 && Static107.aClass73_3.anInt2963 == -1) {
				this.method927("js5crc");
				Static244.anInt5370 = 1000;
				return;
			}
			if (Static107.aClass73_3.anInt2964 >= 4 && (Static244.anInt5370 == 0 || Static244.anInt5370 == 5)) {
				if (Static107.aClass73_3.anInt2963 == 7 || Static107.aClass73_3.anInt2963 == 9) {
					this.method927("js5connect_full");
				} else if (Static107.aClass73_3.anInt2963 > 0) {
					this.method927("js5connect");
				} else {
					this.method927("js5io");
				}
				Static244.anInt5370 = 1000;
				return;
			}
		}
		Static233.anInt5226 = Static107.aClass73_3.anInt2964;
		if (Static22.anInt722 > 0) {
			Static22.anInt722--;
			return;
		}
		try {
			if (Static4.anInt30 == 0) {
				Static37.aClass212_2 = Static71.aClass213_3.method5120(Static60.aString1, Static209.anInt4794);
				Static4.anInt30++;
			}
			if (Static4.anInt30 == 1) {
				if (Static37.aClass212_2.anInt5925 == 2) {
					this.method942(1000);
					return;
				}
				if (Static37.aClass212_2.anInt5925 == 1) {
					Static4.anInt30++;
				}
			}
			if (Static4.anInt30 == 2) {
				Static206.aClass95_3 = new Class95((Socket) Static37.aClass212_2.anObject6, Static71.aClass213_3);
				@Pc(194) Buffer local194 = new Buffer(5);
				local194.method2178(15);
				local194.method2164(530);
				Static206.aClass95_3.method2830(local194.aByteArray40, 5);
				Static4.anInt30++;
				Static217.aLong165 = Class209.method5096();
			}
			if (Static4.anInt30 == 3) {
				if (Static244.anInt5370 == 0 || Static244.anInt5370 == 5 || Static206.aClass95_3.method2831() > 0) {
					@Pc(258) int local258 = Static206.aClass95_3.method2828();
					if (local258 != 0) {
						this.method942(local258);
						return;
					}
					Static4.anInt30++;
				} else if (Class209.method5096() - Static217.aLong165 > 30000L) {
					this.method942(1001);
					return;
				}
			}
			if (Static4.anInt30 == 4) {
				@Pc(296) boolean local296 = Static244.anInt5370 == 5 || Static244.anInt5370 == 10 || Static244.anInt5370 == 28;
				Static107.aClass73_3.method2324(!local296, Static206.aClass95_3);
				Static206.aClass95_3 = null;
				Static37.aClass212_2 = null;
				Static4.anInt30 = 0;
			}
		} catch (@Pc(315) IOException local315) {
			this.method942(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method948() {
		if (!Static164.aBoolean191) {
			label252: while (true) {
				do {
					if (!Static25.method712()) {
						break label252;
					}
				} while (Static193.anInt4542 != 115 && Static193.anInt4542 != 83);
				Static164.aBoolean191 = true;
			}
		}
		@Pc(43) int local43;
		if (Static166.anInt4051 == 0) {
			@Pc(34) Runtime local34 = Runtime.getRuntime();
			local43 = (int) (0L / 1024L);
			@Pc(46) long local46 = Class209.method5096();
			if (Static175.aLong138 == 0L) {
				Static175.aLong138 = local46;
			}
			if (local43 > 16384 && local46 - Static175.aLong138 < 5000L) {
				if (local46 - Static160.aLong134 > 1000L) {
					System.gc();
					Static160.aLong134 = local46;
				}
				Static199.anInt4670 = 5;
				Static126.aClass100_602 = Static131.aClass100_626;
			} else {
				Static126.aClass100_602 = Static164.aClass100_769;
				Static166.anInt4051 = 10;
				Static199.anInt4670 = 5;
			}
			return;
		}
		@Pc(98) int local98;
		if (Static166.anInt4051 == 10) {
			Static120.method2392();
			for (local98 = 0; local98 < 4; local98++) {
				Static148.aClass97Array1[local98] = new Class97(104, 104);
			}
			Static199.anInt4670 = 10;
			Static166.anInt4051 = 30;
			Static126.aClass100_602 = Static113.aClass100_869;
		} else if (Static166.anInt4051 == 30) {
			if (Static257.aClass9_2 == null) {
				Static257.aClass9_2 = new Class9(Static107.aClass73_3, Static86.aClass80_3);
			}
			if (Static257.aClass9_2.method178()) {
				Static213.aClass153_88 = Static9.method183(false, true, true, 0);
				Static249.aClass153_100 = Static9.method183(false, true, true, 1);
				Static274.aClass153_90 = Static9.method183(true, true, false, 2);
				Static41.aClass153_25 = Static9.method183(false, true, true, 3);
				Static248.aClass153_75 = Static9.method183(false, true, true, 4);
				Static26.aClass153_16 = Static9.method183(true, true, true, 5);
				Static130.aClass153_47 = Static9.method183(true, false, true, 6);
				Static267.aClass153_109 = Static9.method183(false, true, true, 7);
				Static209.aClass153_86 = Static9.method183(false, true, true, 8);
				Static195.aClass153_80 = Static9.method183(false, true, true, 9);
				Static184.aClass153_78 = Static9.method183(false, true, true, 10);
				Static214.aClass153_106 = Static9.method183(false, true, true, 11);
				Static16.aClass153_9 = Static9.method183(false, true, true, 12);
				Static261.aClass153_107 = Static9.method183(false, true, true, 13);
				Static137.aClass153_49 = Static9.method183(false, false, true, 14);
				Static138.aClass153_51 = Static9.method183(false, true, true, 15);
				Static280.aClass153_110 = Static9.method183(false, true, true, 16);
				Static138.aClass153_50 = Static9.method183(false, true, true, 17);
				Static172.aClass153_71 = Static9.method183(false, true, true, 18);
				Static171.aClass153_68 = Static9.method183(false, true, true, 19);
				Static253.aClass153_104 = Static9.method183(false, true, true, 20);
				Static122.aClass153_46 = Static9.method183(false, true, true, 21);
				Static156.aClass153_59 = Static9.method183(false, true, true, 22);
				Static227.aClass153_94 = Static9.method183(true, true, true, 23);
				Static254.aClass153_105 = Static9.method183(false, true, true, 24);
				Static28.aClass153_18 = Static9.method183(false, true, true, 25);
				Static167.aClass153_63 = Static9.method183(true, true, true, 26);
				Static226.aClass153_93 = Static9.method183(false, true, true, 27);
				Static199.anInt4670 = 15;
				Static126.aClass100_602 = Static178.aClass100_804;
				Static166.anInt4051 = 40;
			} else {
				Static126.aClass100_602 = Static265.aClass100_1083;
				Static199.anInt4670 = 12;
			}
		} else if (Static166.anInt4051 == 40) {
			local98 = 0;
			for (local43 = 0; local43 < 28; local43++) {
				local98 += Static269.aClass14_Sub1Array3[local43].method538() * Static170.anIntArray306[local43] / 100;
			}
			if (local98 == 100) {
				Static199.anInt4670 = 20;
				Static126.aClass100_602 = Static11.aClass100_70;
				Static75.method1635(Static209.aClass153_86);
				Static167.method3172(Static209.aClass153_86);
				Static81.method1754(Static209.aClass153_86);
				Static166.anInt4051 = 45;
			} else {
				if (local98 != 0) {
					Static126.aClass100_602 = Static34.method882(new Class100[] { Static23.aClass100_132, Static123.method2423(local98), Static49.aClass100_352 });
				}
				Static199.anInt4670 = 20;
			}
		} else if (Static166.anInt4051 == 45) {
			Static41.method1045(Static99.aBoolean143);
			Static148.aClass3_Sub3_Sub4_1 = new MidiPcmStream();
			Static148.aClass3_Sub3_Sub4_1.method4420();
			Static11.aClass62_1 = Static107.method2262(22050, Static71.aClass213_3, Static154.aCanvas1, 0);
			Static11.aClass62_1.method3566(Static148.aClass3_Sub3_Sub4_1);
			Static34.method876(Static148.aClass3_Sub3_Sub4_1, Static138.aClass153_51, Static137.aClass153_49, Static248.aClass153_75);
			Static147.aClass62_2 = Static107.method2262(2048, Static71.aClass213_3, Static154.aCanvas1, 1);
			Static204.aClass3_Sub3_Sub2_1 = new Class3_Sub3_Sub2();
			Static147.aClass62_2.method3566(Static204.aClass3_Sub3_Sub2_1);
			Static56.aClass156_1 = new Class156(22050, Static44.anInt1404);
			Static250.anInt5441 = Static130.aClass153_47.method4482(Static1.aClass100_1);
			Static199.anInt4670 = 30;
			Static166.anInt4051 = 50;
			Static126.aClass100_602 = Static225.aClass100_964;
		} else if (Static166.anInt4051 == 50) {
			local98 = Static74.method1628(Static209.aClass153_86, Static261.aClass153_107);
			local43 = Static143.method2732();
			if (local98 >= local43) {
				Static126.aClass100_602 = Static244.aClass100_1016;
				Static199.anInt4670 = 35;
				Static166.anInt4051 = 60;
			} else {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static150.aClass100_690, Static123.method2423(local98 * 100 / local43), Static49.aClass100_352 });
				Static199.anInt4670 = 35;
			}
		} else if (Static166.anInt4051 == 60) {
			local98 = Static150.method2797(Static209.aClass153_86);
			local43 = Static104.method2252();
			if (local43 <= local98) {
				Static126.aClass100_602 = Static27.aClass100_166;
				Static166.anInt4051 = 65;
				Static199.anInt4670 = 40;
			} else {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static49.aClass100_348, Static123.method2423(local98 * 100 / local43), Static49.aClass100_352 });
				Static199.anInt4670 = 40;
			}
		} else if (Static166.anInt4051 == 65) {
			Static102.method2074(Static261.aClass153_107, Static209.aClass153_86);
			Static199.anInt4670 = 45;
			Static126.aClass100_602 = Static48.aClass100_347;
			Static196.method3534(5);
			Static166.anInt4051 = 70;
		} else if (Static166.anInt4051 == 70) {
			Static274.aClass153_90.method4475();
			local98 = Static274.aClass153_90.method4498();
			Static280.aClass153_110.method4475();
			local98 += Static280.aClass153_110.method4498();
			Static138.aClass153_50.method4475();
			local98 += Static138.aClass153_50.method4498();
			Static172.aClass153_71.method4475();
			local98 += Static172.aClass153_71.method4498();
			Static171.aClass153_68.method4475();
			local98 += Static171.aClass153_68.method4498();
			Static253.aClass153_104.method4475();
			local98 += Static253.aClass153_104.method4498();
			Static122.aClass153_46.method4475();
			local98 += Static122.aClass153_46.method4498();
			Static156.aClass153_59.method4475();
			local98 += Static156.aClass153_59.method4498();
			Static254.aClass153_105.method4475();
			local98 += Static254.aClass153_105.method4498();
			Static28.aClass153_18.method4475();
			local98 += Static28.aClass153_18.method4498();
			Static226.aClass153_93.method4475();
			local98 += Static226.aClass153_93.method4498();
			if (local98 >= 1100) {
				Static226.method3899(Static274.aClass153_90);
				Static199.method3595(Static274.aClass153_90);
				Static91.method1878(Static274.aClass153_90);
				Static125.method2446(Static267.aClass153_109, Static274.aClass153_90);
				Static181.method3349(Static280.aClass153_110, Static267.aClass153_109);
				Static88.method1817(Static267.aClass153_109, Static172.aClass153_71);
				Static241.method4542(Static171.aClass153_68, Static265.aClass3_Sub2_Sub9_Sub1_2, Static267.aClass153_109);
				Static58.method1322(Static274.aClass153_90);
				Static141.method2724(Static249.aClass153_100, Static253.aClass153_104, Static213.aClass153_88);
				Static79.method1703(Static274.aClass153_90);
				Static266.method4187(Static267.aClass153_109, Static122.aClass153_46);
				Static180.method3327(Static156.aClass153_59);
				Static230.method3951(Static274.aClass153_90);
				Static3.method4661(Static261.aClass153_107, Static209.aClass153_86, Static41.aClass153_25, Static267.aClass153_109);
				Static119.method2384(Static274.aClass153_90);
				Static85.method1774(Static138.aClass153_50);
				Static59.method1374(Static28.aClass153_18, Static254.aClass153_105, new Class6());
				Static115.method2311(Static28.aClass153_18, Static254.aClass153_105);
				Static107.method2264(Static274.aClass153_90);
				Static246.method4237(Static274.aClass153_90, Static209.aClass153_86);
				Static180.method3324(Static274.aClass153_90, Static209.aClass153_86);
				Static199.anInt4670 = 50;
				Static126.aClass100_602 = Static74.aClass100_460;
				Static58.method1321();
				Static166.anInt4051 = 80;
			} else {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static21.aClass100_124, Static123.method2423(local98 / 11), Static49.aClass100_352 });
				Static199.anInt4670 = 50;
			}
		} else if (Static166.anInt4051 == 80) {
			local98 = Static28.method789(Static209.aClass153_86);
			local43 = Static62.method1483();
			if (local43 > local98) {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static259.aClass100_1073, Static123.method2423(local98 * 100 / local43), Static49.aClass100_352 });
				Static199.anInt4670 = 60;
			} else {
				Static30.method839(Static209.aClass153_86);
				Static166.anInt4051 = 90;
				Static199.anInt4670 = 60;
				Static126.aClass100_602 = Static223.aClass100_949;
			}
		} else if (Static166.anInt4051 == 90) {
			if (Static167.aClass153_63.method4475()) {
				@Pc(951) Class109 local951 = new Class109(Static195.aClass153_80, Static167.aClass153_63, Static209.aClass153_86, 20, !Static53.aBoolean99);
				Static94.method1914(local951);
				if (Static113.anInt4609 == 1) {
					Static94.method1911(0.9F);
				}
				if (Static113.anInt4609 == 2) {
					Static94.method1911(0.8F);
				}
				if (Static113.anInt4609 == 3) {
					Static94.method1911(0.7F);
				}
				if (Static113.anInt4609 == 4) {
					Static94.method1911(0.6F);
				}
				Static126.aClass100_602 = Static86.aClass100_489;
				Static166.anInt4051 = 100;
				Static199.anInt4670 = 70;
			} else {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static247.aClass100_1032, Static123.method2423(Static167.aClass153_63.method4498()), Static49.aClass100_352 });
				Static199.anInt4670 = 70;
			}
		} else if (Static166.anInt4051 == 100) {
			if (Static231.method3986(Static209.aClass153_86)) {
				Static166.anInt4051 = 110;
			}
		} else if (Static166.anInt4051 == 110) {
			Static178.aClass74_1 = new Class74();
			Static71.aClass213_3.method5130(10, Static178.aClass74_1);
			Static126.aClass100_602 = Static171.aClass100_790;
			Static199.anInt4670 = 75;
			Static166.anInt4051 = 120;
		} else if (Static166.anInt4051 == 120) {
			if (Static184.aClass153_78.method4487(Static186.aClass100_827, Static252.aClass100_1049)) {
				@Pc(1060) Class44 local1060 = new Class44(Static184.aClass153_78.method4485(Static186.aClass100_827, Static252.aClass100_1049));
				Static1.method1(local1060);
				Static126.aClass100_602 = Static196.aClass100_864;
				Static166.anInt4051 = 130;
				Static199.anInt4670 = 80;
			} else {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static148.aClass100_676, Static206.aClass100_899 });
				Static199.anInt4670 = 80;
			}
		} else if (Static166.anInt4051 == 130) {
			if (!Static41.aClass153_25.method4475()) {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static17.aClass100_104, Static123.method2423(Static41.aClass153_25.method4498() * 3 / 4), Static49.aClass100_352 });
				Static199.anInt4670 = 85;
			} else if (!Static16.aClass153_9.method4475()) {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static17.aClass100_104, Static123.method2423(Static16.aClass153_9.method4498() / 10 + 75), Static49.aClass100_352 });
				Static199.anInt4670 = 85;
			} else if (!Static261.aClass153_107.method4475()) {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static17.aClass100_104, Static123.method2423(Static261.aClass153_107.method4498() / 20 + 85), Static49.aClass100_352 });
				Static199.anInt4670 = 85;
			} else if (Static227.aClass153_94.method4489(Static165.aClass100_777)) {
				Static234.method4018(Static173.aClass3_Sub2_Sub1_Sub1Array9, Static227.aClass153_94);
				Static199.anInt4670 = 95;
				Static126.aClass100_602 = Static269.aClass100_555;
				Static166.anInt4051 = 135;
			} else {
				Static126.aClass100_602 = Static34.method882(new Class100[] { Static17.aClass100_104, Static123.method2423(Static227.aClass153_94.method4478(Static165.aClass100_777) / 10 + 90), Static49.aClass100_352 });
				Static199.anInt4670 = 85;
			}
		} else if (Static166.anInt4051 == 135) {
			local98 = Static207.method3684();
			if (local98 == -1) {
				Static199.anInt4670 = 95;
				Static126.aClass100_602 = Static208.aClass100_906;
			} else if (local98 == 7 || local98 == 9) {
				this.method927("worldlistfull");
				Static196.method3534(1000);
			} else if (Static61.aBoolean109) {
				Static126.aClass100_602 = Static34.aClass100_201;
				Static166.anInt4051 = 140;
				Static199.anInt4670 = 96;
			} else {
				this.method927("worldlistio_" + local98);
				Static196.method3534(1000);
			}
		} else if (Static166.anInt4051 == 140) {
			Static156.anInt3783 = Static41.aClass153_25.method4482(Static138.aClass100_652);
			Static26.aClass153_16.method4477(false);
			Static130.aClass153_47.method4477(true);
			Static209.aClass153_86.method4477(true);
			Static261.aClass153_107.method4477(true);
			Static184.aClass153_78.method4477(true);
			Static41.aClass153_25.method4477(true);
			Static199.anInt4670 = 97;
			Static126.aClass100_602 = Static38.aClass100_240;
			Static166.anInt4051 = 150;
			Static107.aBoolean147 = true;
		} else if (Static166.anInt4051 == 150) {
			Static151.method2807();
			if (Static164.aBoolean191) {
				Static102.anInt2679 = 0;
				Static186.anInt4392 = 0;
				Static214.anInt5581 = 0;
				Static141.anInt3474 = 0;
			}
			Static164.aBoolean191 = true;
			Static203.method3663(Static71.aClass213_3);
			Static241.method4540(false, Static214.anInt5581, -1, -1);
			Static199.anInt4670 = 100;
			Static166.anInt4051 = 160;
			Static126.aClass100_602 = Static214.aClass100_1064;
		} else if (Static166.anInt4051 == 160) {
			Static73.method1596(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected final void method921() {
		if (Static244.anInt5370 == 1000) {
			return;
		}
		Static83.anInt372++;
		if (Static83.anInt372 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static60.anInt1895 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static39.aRandom1.setSeed((long) Static60.anInt1895);
		}
		this.method944();
		if (Static257.aClass9_2 != null) {
			Static257.aClass9_2.method179();
		}
		Static230.method3948();
		Static107.method2261();
		Static65.method1501();
		Static111.method2292();
		if (Static239.aBoolean269) {
			Static63.method1490();
		}
		if (Static71.aClass111_2 != null) {
			@Pc(75) int local75 = Static71.aClass111_2.method3287();
			Static58.anInt1766 = local75;
		}
		if (Static244.anInt5370 == 0) {
			this.method948();
			Static234.method4020();
		} else if (Static244.anInt5370 == 5) {
			this.method948();
			Static234.method4020();
		} else if (Static244.anInt5370 == 25 || Static244.anInt5370 == 28) {
			Static78.method1696();
		}
		if (Static244.anInt5370 == 10) {
			this.method943();
			Static158.method3008();
			Static31.method848();
			Static216.method1639();
		} else if (Static244.anInt5370 == 30) {
			Static81.method1756();
		} else if (Static244.anInt5370 == 40) {
			Static216.method1639();
			if (Static266.anInt5336 != -3) {
				if (Static266.anInt5336 == 15) {
					Static44.method1146();
				} else if (Static266.anInt5336 != 2) {
					Static278.method4653();
				}
			}
		}
	}
}
