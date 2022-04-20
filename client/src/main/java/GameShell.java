import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lsignlink!ll;)V")
	public static void providesignlink(@OriginalArg(0) SignLink arg0) {
		Static71.signLink = arg0;
		Static69.aClass213_4 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static233.aBoolean253 = false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	protected abstract void method921();

	@OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static39.aFrame1 == null) {
			return Static71.signLink == null || Static71.signLink.anApplet2 == this ? super.getAppletContext() : Static71.signLink.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static233.aBoolean253 = true;
		Static69.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z")
	protected final boolean method925() {
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public final synchronized void method926() {
		if (Static154.canvas != null) {
			Static154.canvas.removeFocusListener(this);
			Static154.canvas.getParent().remove(Static154.canvas);
		}
		@Pc(19) Container local19;
		if (Static69.aFrame2 != null) {
			local19 = Static69.aFrame2;
		} else if (Static39.aFrame1 == null) {
			local19 = Static71.signLink.anApplet2;
		} else {
			local19 = Static39.aFrame1;
		}
		local19.setLayout(null);
		Static154.canvas = new GameCanvas(this);
		local19.add(Static154.canvas);
		Static154.canvas.setSize(Static48.anInt1448, Static254.anInt5554);
		Static154.canvas.setVisible(true);
		if (local19 == Static39.aFrame1) {
			@Pc(66) Insets local66 = Static39.aFrame1.getInsets();
			Static154.canvas.setLocation(Static145.anInt3497 + local66.left, local66.top + Static178.anInt4246);
		} else {
			Static154.canvas.setLocation(Static145.anInt3497, Static178.anInt4246);
		}
		Static154.canvas.addFocusListener(this);
		Static154.canvas.requestFocus();
		Static233.aBoolean253 = true;
		Static69.aBoolean115 = true;
		Static26.focus = true;
		Static35.aBoolean66 = false;
		Static243.aLong178 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static230.anApplet_Sub1_1 == this && !Static58.aBoolean101) {
			Static72.aLong74 = MonotonicClock.currentTimeMillis();
			Static231.sleep(5000L);
			Static69.aClass213_4 = null;
			this.method931(false);
		}
	}

	@OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method927(@OriginalArg(0) String arg0) {
		if (this.aBoolean71) {
			return;
		}
		this.aBoolean71 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	protected abstract void method928();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	protected abstract void method929();

	@OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static39.aFrame1 == null) {
			return Static71.signLink == null || Static71.signLink.anApplet2 == this ? super.getDocumentBase() : Static71.signLink.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static230.anApplet_Sub1_1 != this || Static58.aBoolean101) {
			return;
		}
		Static69.aBoolean115 = true;
		if (Static236.aBoolean256 && !GlRenderer.enabled && MonotonicClock.currentTimeMillis() - Static243.aLong178 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || local29.width >= Static72.anInt2046 && Static122.anInt3045 <= local29.height) {
				Static35.aBoolean66 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
	private void method931(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static58.aBoolean101) {
				return;
			}
			Static58.aBoolean101 = true;
		}
		if (Static71.signLink.anApplet2 != null) {
			Static71.signLink.anApplet2.destroy();
		}
		try {
			this.method928();
		} catch (@Pc(34) Exception local34) {
		}
		if (Static154.canvas != null) {
			try {
				Static154.canvas.removeFocusListener(this);
				Static154.canvas.getParent().remove(Static154.canvas);
			} catch (@Pc(45) Exception local45) {
			}
		}
		if (Static71.signLink != null) {
			try {
				Static71.signLink.method5124();
			} catch (@Pc(53) Exception local53) {
			}
		}
		this.method929();
		if (Static39.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(77) Throwable local77) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	private void method932() {
		@Pc(6) long local6 = MonotonicClock.currentTimeMillis();
		@Pc(10) long local10 = Static228.aLongArray8[Static261.anInt5741];
		Static228.aLongArray8[Static261.anInt5741] = local6;
		Static261.anInt5741 = Static261.anInt5741 + 1 & 0x1F;
		synchronized (this) {
			Static26.focus = Static233.aBoolean253;
		}
		this.method921();
		if (local10 != 0L && local6 <= local10) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	private void method933() {
		@Pc(2) long local2 = MonotonicClock.currentTimeMillis();
		@Pc(6) long local6 = Static7.aLongArray2[Static111.anInt2903];
		Static7.aLongArray2[Static111.anInt2903] = local2;
		Static111.anInt2903 = Static111.anInt2903 + 1 & 0x1F;
		if (local6 != 0L && local2 > local6) {
			@Pc(41) int local41 = (int) (local2 - local6);
			Static243.anInt5359 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static184.anInt4355++ > 50) {
			Static69.aBoolean115 = true;
			Static184.anInt4355 -= 50;
			Static154.canvas.setSize(Static48.anInt1448, Static254.anInt5554);
			Static154.canvas.setVisible(true);
			if (Static39.aFrame1 != null && Static69.aFrame2 == null) {
				@Pc(84) Insets local84 = Static39.aFrame1.getInsets();
				Static154.canvas.setLocation(local84.left + Static145.anInt3497, Static178.anInt4246 + local84.top);
			} else {
				Static154.canvas.setLocation(Static145.anInt3497, Static178.anInt4246);
			}
		}
		this.method934();
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	protected abstract void method934();

	@OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static39.aFrame1 == null) {
			return Static71.signLink == null || Static71.signLink.anApplet2 == this ? super.getCodeBase() : Static71.signLink.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (SignLink.aString20 != null) {
				@Pc(12) String local12 = SignLink.aString20.toLowerCase();
				if (local12.indexOf("sun") != -1 || local12.indexOf("apple") != -1) {
					@Pc(24) String local24 = SignLink.aString14;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method927("wrongjava");
						return;
					}
					Static226.anInt5081 = 5;
				} else if (local12.indexOf("ibm") != -1 && (SignLink.aString14 == null || SignLink.aString14.equals("1.4.2"))) {
					this.method927("wrongjava");
					return;
				}
			}
			@Pc(76) int local76;
			if (SignLink.aString14 != null && SignLink.aString14.startsWith("1.")) {
				local76 = 2;
				@Pc(78) int local78 = 0;
				while (local76 < SignLink.aString14.length()) {
					@Pc(90) char local90 = SignLink.aString14.charAt(local76);
					if (local90 < '0' || local90 > '9') {
						break;
					}
					local78 = local78 * 10 + local90 - 48;
					local76++;
				}
				if (local78 >= 5) {
					Static236.aBoolean256 = true;
				}
			}
			if (Static71.signLink.anApplet2 != null) {
				@Pc(125) Method local125 = SignLink.aMethod5;
				if (local125 != null) {
					try {
						local125.invoke(Static71.signLink.anApplet2, Boolean.TRUE);
					} catch (@Pc(142) Throwable local142) {
					}
				}
			}
			Static224.method3888();
			this.method926();
			Static260.aClass27_2 = Static131.method2579(Static254.anInt5554, Static48.anInt1448, Static154.canvas);
			this.method935();
			Static200.aClass93_1 = Static70.method1547();
			while (Static72.aLong74 == 0L || Static72.aLong74 > MonotonicClock.currentTimeMillis()) {
				Static227.anInt5097 = Static200.aClass93_1.method3391(Static226.anInt5081, Static11.anInt386);
				for (local76 = 0; local76 < Static227.anInt5097; local76++) {
					this.method932();
				}
				this.method933();
				Static140.method2708(Static71.signLink, Static154.canvas);
			}
		} catch (@Pc(198) Exception local198) {
			Static89.method1839(null, local198);
			this.method927("crash");
		}
		this.method931(true);
	}

	@OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static39.aFrame1 == null) {
			return Static71.signLink == null || Static71.signLink.anApplet2 == this ? super.getParameter(arg0) : Static71.signLink.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	protected abstract void method935();

	@OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static230.anApplet_Sub1_1 == this && !Static58.aBoolean101) {
			Static72.aLong74 = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZILjava/lang/String;III)V")
	protected final void method936(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static254.anInt5554 = 768;
			Static122.anInt3045 = 768;
			Static145.anInt3497 = 0;
			Static131.anInt3252 = 530;
			Static48.anInt1448 = 1024;
			Static72.anInt2046 = 1024;
			Static178.anInt4246 = 0;
			Static230.anApplet_Sub1_1 = this;
			Static39.aFrame1 = new Frame();
			Static39.aFrame1.setTitle("Jagex");
			Static39.aFrame1.setResizable(true);
			Static39.aFrame1.addWindowListener(this);
			Static39.aFrame1.setVisible(true);
			Static39.aFrame1.toFront();
			@Pc(44) Insets local44 = Static39.aFrame1.getInsets();
			Static39.aFrame1.setSize(local44.left + Static72.anInt2046 + local44.right, local44.top + Static122.anInt3045 + local44.bottom);
			Static69.aClass213_4 = Static71.signLink = new SignLink(null, arg0, arg1, 28);
			@Pc(76) PrivilegedRequest local76 = Static71.signLink.method5130(1, this);
			while (local76.status == 0) {
				Static231.sleep(10L);
			}
			Static37.aThread1 = (Thread) local76.result;
		} catch (@Pc(91) Exception local91) {
			Static89.method1839(null, local91);
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static230.anApplet_Sub1_1 == this && !Static58.aBoolean101) {
			Static72.aLong74 = 0L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIIII)V")
	protected final void method937(@OriginalArg(2) int arg0) {
		try {
			if (Static230.anApplet_Sub1_1 != null) {
				Static70.anInt2014++;
				if (Static70.anInt2014 >= 3) {
					this.method927("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static230.anApplet_Sub1_1 = this;
			Static178.anInt4246 = 0;
			Static131.anInt3252 = 1530;
			Static48.anInt1448 = 765;
			Static72.anInt2046 = 765;
			Static145.anInt3497 = 0;
			Static254.anInt5554 = 503;
			Static122.anInt3045 = 503;
			@Pc(54) String local54 = this.getParameter("openwinjs");
			if (local54 != null && local54.equals("1")) {
				Static40.aBoolean78 = true;
			} else {
				Static40.aBoolean78 = false;
			}
			if (Static71.signLink == null) {
				Static69.aClass213_4 = Static71.signLink = new SignLink(this, arg0, null, 0);
			}
			@Pc(86) PrivilegedRequest local86 = Static71.signLink.method5130(1, this);
			while (local86.status == 0) {
				Static231.sleep(10L);
			}
			Static37.aThread1 = (Thread) local86.result;
		} catch (@Pc(103) Exception local103) {
			Static89.method1839(null, local103);
			this.method927("crash");
		}
	}
}
