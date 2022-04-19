import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "[[[Lclient!bj;")
	public static Tile[][][] aClass3_Sub5ArrayArrayArray2;

	@OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
	public static int anInt4620;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "Lclient!na;")
	public static final Class100 aClass100_872 = Static28.method790("<br>");

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "Z")
	public static boolean aBoolean228 = true;

	@OriginalMember(owner = "client!pm", name = "gb", descriptor = "Lclient!na;")
	private static final Class100 aClass100_874 = Static28.method790(" from your friend list first)3");

	@OriginalMember(owner = "client!pm", name = "fb", descriptor = "Lclient!na;")
	public static Class100 aClass100_873 = aClass100_874;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILsignlink!ll;)[Lclient!od;")
	public static Class114[] method3558(@OriginalArg(1) Class213 arg0) {
		if (!arg0.method5111()) {
			return new Class114[0];
		}
		@Pc(17) Class212 local17 = arg0.method5132();
		while (local17.anInt5925 == 0) {
			Static231.method3983(10L);
		}
		if (local17.anInt5925 == 2) {
			return new Class114[0];
		}
		@Pc(39) int[] local39 = (int[]) local17.anObject6;
		@Pc(45) Class114[] local45 = new Class114[local39.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
			@Pc(59) Class114 local59 = new Class114();
			local45[local47] = local59;
			local59.anInt4248 = local39[local47 << 2];
			local59.anInt4250 = local39[(local47 << 2) + 1];
			local59.anInt4251 = local39[(local47 << 2) + 2];
			local59.anInt4249 = local39[(local47 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIZIZII)V")
	public static void method3560(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static239.method4169();
		}
		if (Static69.aFrame2 != null && (arg1 != 3 || arg4 != Static114.anInt5831 || arg5 != Static22.anInt729)) {
			Static25.method714(Static69.aFrame2, Static71.aClass213_3);
			Static69.aFrame2 = null;
		}
		if (arg1 == 3 && Static69.aFrame2 == null) {
			Static69.aFrame2 = Static169.method3176(0, arg5, arg4, Static71.aClass213_3);
			if (Static69.aFrame2 != null) {
				Static22.anInt729 = arg5;
				Static114.anInt5831 = arg4;
				Static203.method3663(Static71.aClass213_3);
			}
		}
		if (arg1 == 3 && Static69.aFrame2 == null) {
			method3560(true, Static214.anInt5581, true, arg3, -1, -1);
			return;
		}
		@Pc(85) Container local85;
		if (Static69.aFrame2 != null) {
			local85 = Static69.aFrame2;
		} else if (Static39.aFrame1 == null) {
			local85 = Static71.aClass213_3.anApplet2;
		} else {
			local85 = Static39.aFrame1;
		}
		Static72.anInt2046 = local85.getSize().width;
		Static122.anInt3045 = local85.getSize().height;
		@Pc(109) Insets local109;
		if (Static39.aFrame1 == local85) {
			local109 = Static39.aFrame1.getInsets();
			Static72.anInt2046 -= local109.right + local109.left;
			Static122.anInt3045 -= local109.bottom + local109.top;
		}
		if (arg1 >= 2) {
			Static48.anInt1448 = Static72.anInt2046;
			Static254.anInt5554 = Static122.anInt3045;
			Static145.anInt3497 = 0;
			Static178.anInt4246 = 0;
		} else {
			Static178.anInt4246 = 0;
			Static145.anInt3497 = (Static72.anInt2046 - 765) / 2;
			Static48.anInt1448 = 765;
			Static254.anInt5554 = 503;
		}
		if (arg0) {
			Static31.method847(Static154.aCanvas1);
			Static223.method3866(Static154.aCanvas1);
			if (Static71.aClass111_2 != null) {
				Static71.aClass111_2.method3291(Static154.aCanvas1);
			}
			Static215.aClient1.method926();
			Static19.method591(Static154.aCanvas1);
			Static88.method1833(Static154.aCanvas1);
			if (Static71.aClass111_2 != null) {
				Static71.aClass111_2.method3293(Static154.aCanvas1);
			}
		} else {
			if (Static239.aBoolean269) {
				Static239.method4181(Static48.anInt1448, Static254.anInt5554);
			}
			Static154.aCanvas1.setSize(Static48.anInt1448, Static254.anInt5554);
			if (Static39.aFrame1 == local85) {
				local109 = Static39.aFrame1.getInsets();
				Static154.aCanvas1.setLocation(local109.left + Static145.anInt3497, local109.top + Static178.anInt4246);
			} else {
				Static154.aCanvas1.setLocation(Static145.anInt3497, Static178.anInt4246);
			}
		}
		if (arg1 == 0 && arg3 > 0) {
			Static239.method4161(Static154.aCanvas1);
		}
		if (arg2 && arg1 > 0) {
			Static154.aCanvas1.setIgnoreRepaint(true);
			if (!Static211.aBoolean73) {
				Static65.method1500();
				Static260.aClass27_2 = null;
				Static260.aClass27_2 = Static131.method2579(Static254.anInt5554, Static48.anInt1448, Static154.aCanvas1);
				Static129.method2492();
				if (Static244.anInt5370 == 5) {
					Static182.method3359(true, Static280.aClass3_Sub2_Sub9_43);
				} else {
					Static114.method4636(false, Static170.aClass100_621);
				}
				try {
					@Pc(269) Graphics local269 = Static154.aCanvas1.getGraphics();
					Static260.aClass27_2.method4186(local269);
				} catch (@Pc(277) Exception local277) {
				}
				Static139.method2704();
				if (arg3 == 0) {
					Static260.aClass27_2 = Static131.method2579(503, 765, Static154.aCanvas1);
				} else {
					Static260.aClass27_2 = null;
				}
				@Pc(300) Class212 local300 = Static71.aClass213_3.method5123(Static215.aClient1.getClass());
				while (local300.anInt5925 == 0) {
					Static231.method3983(100L);
				}
				if (local300.anInt5925 == 1) {
					Static211.aBoolean73 = true;
				}
			}
			if (Static211.aBoolean73) {
				Static239.method4180(Static154.aCanvas1, Static186.anInt4392 * 2);
			}
		}
		if (!Static239.aBoolean269 && arg1 > 0) {
			method3560(true, 0, true, arg3, -1, -1);
			return;
		}
		if (arg1 > 0 && arg3 == 0) {
			Static37.aThread1.setPriority(5);
			Static260.aClass27_2 = null;
			Static268.method4580();
			((Class109) Static94.anInterface1_2).method3248(200);
			if (Static178.aBoolean202) {
				Static94.method1911(0.7F);
			}
			Static114.method4637();
		} else if (arg1 == 0 && arg3 > 0) {
			Static37.aThread1.setPriority(1);
			Static260.aClass27_2 = Static131.method2579(503, 765, Static154.aCanvas1);
			Static268.method4583();
			Static76.method1643();
			((Class109) Static94.anInterface1_2).method3248(20);
			if (Static178.aBoolean202) {
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
			}
			Static95.method1939();
			Static114.method4637();
		}
		Static87.aBoolean130 = !Static138.method2697();
		if (arg2) {
			Static141.method2721();
		}
		if (arg1 >= 2) {
			Static124.aBoolean156 = true;
		} else {
			Static124.aBoolean156 = false;
		}
		if (Static154.anInt3711 != -1) {
			Static210.method3712(true);
		}
		if (Static124.aClass95_2 != null && (Static244.anInt5370 == 30 || Static244.anInt5370 == 25)) {
			Static59.method1373();
		}
		for (@Pc(466) int local466 = 0; local466 < 100; local466++) {
			Static186.aBooleanArray100[local466] = true;
		}
		Static69.aBoolean115 = true;
	}
}
