import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!se;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!fd;")
	public static WorldMapFont aClass41_8;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lclient!ee;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ve;")
	public static Js5 aClass153_85;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_893 = Static28.parse("Memory before cleanup=");

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_894 = Static28.parse("Mem:");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method3662() {
		@Pc(8) Container local8;
		if (Static69.aFrame2 != null) {
			local8 = Static69.aFrame2;
		} else if (Static39.aFrame1 == null) {
			local8 = Static71.signLink.anApplet2;
		} else {
			local8 = Static39.aFrame1;
		}
		Static72.anInt2046 = local8.getSize().width;
		Static122.anInt3045 = local8.getSize().height;
		@Pc(35) Insets local35;
		if (local8 == Static39.aFrame1) {
			local35 = Static39.aFrame1.getInsets();
			Static122.anInt3045 -= local35.bottom + local35.top;
			Static72.anInt2046 -= local35.right + local35.left;
		}
		if (Static144.method2736() >= 2) {
			Static48.anInt1448 = Static72.anInt2046;
			Static145.anInt3497 = 0;
			Static178.anInt4246 = 0;
			Static254.anInt5554 = Static122.anInt3045;
		} else {
			Static178.anInt4246 = 0;
			Static145.anInt3497 = (Static72.anInt2046 - 765) / 2;
			Static254.anInt5554 = 503;
			Static48.anInt1448 = 765;
		}
		if (GlRenderer.enabled) {
			GlRenderer.setCanvasSize(Static48.anInt1448, Static254.anInt5554);
		}
		Static154.canvas.setSize(Static48.anInt1448, Static254.anInt5554);
		if (local8 == Static39.aFrame1) {
			local35 = Static39.aFrame1.getInsets();
			Static154.canvas.setLocation(local35.left + Static145.anInt3497, Static178.anInt4246 + local35.top);
		} else {
			Static154.canvas.setLocation(Static145.anInt3497, Static178.anInt4246);
		}
		if (Static154.topLevelInterace != -1) {
			Static210.method3712(true);
		}
		Static139.method2704();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsignlink!ll;B)V")
	public static void method3663(@OriginalArg(0) SignLink arg0) {
		@Pc(11) FileOnDisk local11 = null;
		try {
			@Pc(16) PrivilegedRequest local16 = arg0.method5112("runescape");
			while (local16.status == 0) {
				Static231.sleep(1L);
			}
			if (local16.status == 1) {
				local11 = (FileOnDisk) local16.result;
				@Pc(39) Buffer local39 = Static48.method1196();
				local11.method5134(local39.data, local39.offset, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local11 != null) {
				local11.method5136();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}
}
