package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.net.URL;

@OriginalClass("client!rc")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "[J")
	public static final long[] logicTimes = new long[32];

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[J")
	public static final long[] redrawTimes = new long[32];

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lsignlink!ll;")
	public static SignLink signLink;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "Ljava/awt/Frame;")
	public static Frame frame;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Z")
	public static volatile boolean focusIn = true;

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "Z")
	public static volatile boolean fullRedraw = true;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Ljava/awt/Canvas;")
	public static Canvas canvas;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "Ljava/awt/Frame;")
	public static Frame fullScreenFrame;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public static int canvasWidth;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
	public static int canvasHeight;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int leftMargin = 0;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	public static int topMargin = 0;

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "Z")
	public static boolean focus;

	@OriginalMember(owner = "client!cl", name = "bb", descriptor = "Z")
	public static volatile boolean replaceCanvas = false;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "J")
	public static volatile long lastCanvasReplace = 0L;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "Lclient!rc;")
	public static GameShell instance = null;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Z")
	public static boolean shutdown = false;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int logicTimePointer;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	public static int frameHeight;

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
	public static int clientBuild;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
	public static int frameWidth;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
	public static boolean isJava5OrLater = false;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public static int minimumDelay = 1;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	public static double VARIABLE_RENDER_RATE = 20.0d;
	public static long VARIABLE_RENDER_RATE_NS = (long) (VARIABLE_RENDER_RATE * 1_000_000.0d);

	public static final double FIXED_UPDATE_RATE = 20.0d;
	public static final long FIXED_UPDATE_RATE_NS = (long) (FIXED_UPDATE_RATE * 1_000_000.0d);

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "Ljava/lang/Thread;")
	public static Thread thread;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "J")
	public static long killTime = 0L;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Z")
	public static boolean openWindowJavaScript;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	public static int instances = 0;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Lclient!s;")
	public static Timer timer;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public static int logicCycles;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public static int redrawTimePointer;

	@OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
	public static int partialRedraws = 500;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	public static double framesPerSecond = 0;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	public static int maxMemory = 64;
	@OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lsignlink!ll;")
	public static SignLink signLink2;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
	private boolean error = false;

	public static double canvasScale = 1.0d;

	public static double subpixelX = 0.5d;

	public static double subpixelY = 0.5d;

	public static long updateDelta = 0;

	public static long renderDelta = 0;

	@OriginalMember(owner = "client!rc", name = "providesignlink", descriptor = "(Lsignlink!ll;)V")
	public static void providesignlink(@OriginalArg(0) SignLink signLink) {
		GameShell.signLink = signLink;
		signLink2 = signLink;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void getMaxMemory() {
		maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lsignlink!ll;Ljava/lang/Object;I)V")
	public static void flush(@OriginalArg(0) SignLink signLink, @OriginalArg(1) Object source) {
		if (signLink.eventQueue == null) {
			return;
		}

		for (@Pc(19) int i = 0; i < 50 && signLink.eventQueue.peekEvent() != null; i++) {
			ThreadUtils.sleep(1L);
		}
		if (source != null) {
			signLink.eventQueue.postEvent(new ActionEvent(source, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void resetTimer() {
		timer.reset();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			redrawTimes[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			logicTimes[local10] = 0L;
		}
		logicCycles = 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public static void setFpsTarget(@OriginalArg(0) int fps) {
		VARIABLE_RENDER_RATE = 1000.0d / (double) fps;
		VARIABLE_RENDER_RATE_NS = (int) (VARIABLE_RENDER_RATE * 1_000_000.0d);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method3662() {
		@Pc(8) Container local8;
		if (fullScreenFrame != null) {
			local8 = fullScreenFrame;
		} else if (frame == null) {
			local8 = signLink.applet;
		} else {
			local8 = frame;
		}
		frameWidth = local8.getSize().width;
		frameHeight = local8.getSize().height;
		@Pc(35) Insets local35;
		if (local8 == frame) {
			local35 = frame.getInsets();
			frameHeight -= local35.bottom + local35.top;
			frameWidth -= local35.right + local35.left;
		}
		if (DisplayMode.getWindowMode() >= 2) {
			canvasWidth = frameWidth;
			leftMargin = 0;
			topMargin = 0;
			canvasHeight = frameHeight;
		} else {
			topMargin = 0;
			leftMargin = (frameWidth - 765) / 2;
			canvasHeight = 503;
			canvasWidth = 765;
		}
		if (GlRenderer.enabled) {
			GlRenderer.setCanvasSize(canvasWidth, canvasHeight);
		}
		canvas.setSize(canvasWidth, canvasHeight);
		if (local8 == frame) {
			local35 = frame.getInsets();
			canvas.setLocation(local35.left + leftMargin, topMargin + local35.top);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		if (InterfaceList.topLevelInterface != -1) {
			InterfaceList.method3712(true);
		}
		method2704();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method2704() {
		@Pc(7) int local7 = topMargin;
		@Pc(9) int local9 = leftMargin;
		@Pc(16) int local16 = frameHeight - canvasHeight - local7;
		@Pc(23) int local23 = frameWidth - local9 - canvasWidth;
		if (local9 <= 0 && local23 <= 0 && local7 <= 0 && local16 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (fullScreenFrame != null) {
				local46 = fullScreenFrame;
			} else if (frame == null) {
				local46 = signLink.applet;
			} else {
				local46 = frame;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (frame == local46) {
				@Pc(68) Insets local68 = frame.getInsets();
				local61 = local68.left;
				local59 = local68.top;
			}
			@Pc(77) Graphics local77 = local46.getGraphics();
			local77.setColor(Color.black);
			if (local9 > 0) {
				local77.fillRect(local61, local59, local9, frameHeight);
			}
			if (local7 > 0) {
				local77.fillRect(local61, local59, frameWidth, local7);
			}
			if (local23 > 0) {
				local77.fillRect(local61 + frameWidth - local23, local59, local23, frameHeight);
			}
			if (local16 > 0) {
				local77.fillRect(local61, local59 + frameHeight - local16, frameWidth, local16);
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent event) {
		focusIn = false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	protected abstract void mainLoop();

	@OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent event) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getAppletContext() : signLink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent event) {
		focusIn = true;
		fullRedraw = true;
	}

	@OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z")
	protected final boolean isHostnameValid() {
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public final synchronized void addCanvas() {
		if (canvas != null) {
			canvas.removeFocusListener(this);
			canvas.getParent().remove(canvas);
		}
		@Pc(19) Container container;
		if (fullScreenFrame != null) {
			container = fullScreenFrame;
		} else if (frame == null) {
			container = signLink.applet;
		} else {
			container = frame;
		}
		container.setLayout(null);
		canvas = new GameCanvas(this);
		container.add(canvas);
		canvas.setSize(canvasWidth, canvasHeight);
		canvas.setVisible(true);
		if (container == frame) {
			@Pc(66) Insets insets = frame.getInsets();
			canvas.setLocation(leftMargin + insets.left, insets.top + topMargin);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		focusIn = true;
		fullRedraw = true;
		focus = true;
		replaceCanvas = false;
		lastCanvasReplace = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (instance == this && !shutdown) {
			killTime = MonotonicClock.currentTimeMillis();
			ThreadUtils.sleep(5000L);
			signLink2 = null;
			this.shutdown(false);
		}
	}

	@OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics graphics) {
		this.paint(graphics);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void error(@OriginalArg(0) String error) {
		if (this.error) {
			return;
		}
		this.error = true;
		System.out.println("error_game_" + error);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + error + ".ws"), "_top");
		} catch (@Pc(47) Exception ex) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	protected abstract void mainQuit();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	protected abstract void reset();

	@OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getDocumentBase() : signLink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics graphics) {
		if (instance != this || shutdown) {
			return;
		}
		fullRedraw = true;
		if (isJava5OrLater && !GlRenderer.enabled && MonotonicClock.currentTimeMillis() - lastCanvasReplace > 1000L) {
			@Pc(29) Rectangle clipBounds = graphics.getClipBounds();
			if (clipBounds == null || clipBounds.width >= frameWidth && frameHeight <= clipBounds.height) {
				replaceCanvas = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
	private void shutdown(@OriginalArg(1) boolean clean) {
		synchronized (this) {
			if (shutdown) {
				return;
			}
			shutdown = true;
		}
		if (signLink.applet != null) {
			signLink.applet.destroy();
		}
		try {
			this.mainQuit();
		} catch (@Pc(34) Exception ex) {
		}
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (@Pc(45) Exception ex) {
			}
		}
		if (signLink != null) {
			try {
				signLink.stop();
			} catch (@Pc(53) Exception ex) {
			}
		}
		this.reset();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(77) Throwable ex) {
			}
		}
		System.out.println("Shutdown complete - clean:" + clean);
	}

	@OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	private void mainLoopWrapper() {
		synchronized (this) {
			focus = focusIn;
		}
		this.mainLoop();
	}

	public static GraphicsDevice getCurrentDevice() {
		GraphicsConfiguration config = frame.getGraphicsConfiguration();
		GraphicsDevice myScreen = config.getDevice();
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] allScreens = env.getScreenDevices();
		for (int i = 0; i < allScreens.length; i++) {
			if (allScreens[i].equals(myScreen)) {
				return allScreens[i];
			}
		}
		return null;
	}

	long lastFpsUpdate = 0;
	double[] lastFps = new double[5];
	int lastFpsIndex = 0;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	private void mainRedrawWrapper() {
		long now = System.currentTimeMillis();
		if (now - lastFpsUpdate > 1000) {
			lastFps[lastFpsIndex++] = 1_000_000_000.0d / (double) renderDelta;
			double total = 0.0d;
			for (int i = 0; i < lastFps.length; ++i) {
				total += lastFps[i];
			}
			if (lastFpsIndex >= 5) {
				lastFpsIndex = 0;
			}
			framesPerSecond = Math.ceil(total / 5);
			lastFpsUpdate = now;
		}

		if (partialRedraws++ > 50) {
			fullRedraw = true;
			partialRedraws -= 50;
			canvas.setSize(canvasWidth, canvasHeight);
			canvas.setVisible(true);
			canvasScale = getCurrentDevice().getDefaultConfiguration().getDefaultTransform().getScaleX();
			if (frame != null && fullScreenFrame == null) {
				@Pc(84) Insets insets = frame.getInsets();
				canvas.setLocation(insets.left + leftMargin, topMargin + insets.top);
			} else {
				canvas.setLocation(leftMargin, topMargin);
			}
		}
		this.mainRedraw();
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	protected abstract void mainRedraw();

	@OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getCodeBase() : signLink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	public double calcUpdateDelta(double value) {
		return value / 1_000_000_000.0d * (double) updateDelta * value;
	}

	public double calcRenderDelta(double value) {
		return value / 1_000_000_000.0d * (double) renderDelta * value;
	}

	public void mainInputLoop() {
		if (Keyboard.pressedKeys[Keyboard.KEY_UP] || Keyboard.pressedKeys[Keyboard.KEY_DOWN] || Keyboard.pressedKeys[Keyboard.KEY_LEFT] || Keyboard.pressedKeys[Keyboard.KEY_RIGHT]) {
			double vertical = calcRenderDelta(18.0d);
			if (Keyboard.pressedKeys[Keyboard.KEY_UP]) {
				Camera.pitchTarget += vertical;
			} else if (Keyboard.pressedKeys[Keyboard.KEY_DOWN]) {
				Camera.pitchTarget -= vertical;
			}

			double horizontal = calcRenderDelta(24.0d);
			if (Keyboard.pressedKeys[Keyboard.KEY_LEFT]) {
				Camera.yawTarget -= horizontal;
			} else if (Keyboard.pressedKeys[Keyboard.KEY_RIGHT]) {
				Camera.yawTarget += horizontal;
			}

			Camera.clampCameraAngle();
		}
	}

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (SignLink.javaVendor != null) {
				@Pc(12) String javaVendor = SignLink.javaVendor.toLowerCase();
				if (javaVendor.contains("sun") || javaVendor.contains("apple")) {
					@Pc(24) String javaVersion = SignLink.javaVersion;
					if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
					minimumDelay = 5;
				} else if (javaVendor.contains("ibm") && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			@Pc(76) int i;
			if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.")) {
				i = 2;
				@Pc(78) int minorVersion = 0;
				while (i < SignLink.javaVersion.length()) {
					@Pc(90) char c = SignLink.javaVersion.charAt(i);
					if (c < '0' || c > '9') {
						break;
					}
					minorVersion = minorVersion * 10 + c - '0';
					i++;
				}
				if (minorVersion >= 5) {
					isJava5OrLater = true;
				}
			}
			if (signLink.applet != null) {
				@Pc(125) Method setFocusCycleRoot = SignLink.setFocusCycleRoot;
				if (setFocusCycleRoot != null) {
					try {
						setFocusCycleRoot.invoke(signLink.applet, Boolean.TRUE);
					} catch (@Pc(142) Throwable ex) {
					}
				}
			}
			getMaxMemory();
			this.addCanvas();
			SoftwareRaster.frameBuffer = FrameBuffer.create(canvasHeight, canvasWidth, canvas);
			this.mainInit();
			timer = Timer.create();

			long lastUpdateTime = 0;
			long lastDrawTime = 0;
			while (killTime == 0L) {
				if (GameShell.killTime > MonotonicClock.currentTimeMillis()) {
					break;
				}

				long currentTime = System.nanoTime();

				updateDelta = currentTime - lastUpdateTime;
				if (updateDelta >= FIXED_UPDATE_RATE_NS) {
					logicCycles = timer.count(minimumDelay, (int) FIXED_UPDATE_RATE);
					for (int cycle = 0; cycle < logicCycles; ++cycle) {
						this.mainLoopWrapper();
					}
					lastUpdateTime = currentTime;
					flush(signLink, canvas);
				}

				renderDelta = currentTime - lastDrawTime;
				if (renderDelta >= VARIABLE_RENDER_RATE_NS) {
					this.mainInputLoop();
					this.mainRedrawWrapper();
					lastDrawTime = currentTime;
					Thread.yield();
				}
			}
		} catch (@Pc(198) Exception ex) {
			TracingException.report(null, ex);
			this.error("crash");
		}
		this.shutdown(true);
	}

	@OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String name) {
		if (frame == null) {
			return signLink == null || signLink.applet == this ? super.getParameter(name) : signLink.applet.getParameter(name);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	protected abstract void mainInit();

	@OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (instance == this && !shutdown) {
			killTime = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZILjava/lang/String;III)V")
	protected final void startApplication(@OriginalArg(0) int cacheId, @OriginalArg(4) String cacheSubDir) {
		try {
			leftMargin = 0;
			clientBuild = 530;
			frameWidth = 1024;
			frameHeight = 768;
			canvasWidth = frameWidth;
			canvasHeight = frameHeight;
			topMargin = 0;
			instance = this;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.setBackground(Color.black);
			frame.toFront();
			@Pc(44) Insets insets = frame.getInsets();
			frame.setSize(insets.left + frameWidth + insets.right, insets.top + frameHeight + insets.bottom);
			GameShell.setFpsTarget(getCurrentDevice().getDisplayMode().getRefreshRate());
			signLink2 = signLink = new SignLink(null, cacheId, cacheSubDir, 28);
			@Pc(76) PrivilegedRequest request = signLink.startThread(1, this);
			while (request.status == 0) {
				ThreadUtils.sleep(10L);
			}
			thread = (Thread) request.result;
		} catch (@Pc(91) Exception ex) {
			TracingException.report(null, ex);
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent event) {
	}

	@OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (instance == this && !shutdown) {
			killTime = 0L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIIII)V")
	protected final void startApplet(@OriginalArg(2) int cacheId) {
		try {
			if (instance != null) {
				instances++;
				if (instances >= 3) {
					this.error("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			instance = this;
			topMargin = 0;
			clientBuild = 1530;
			canvasWidth = 765;
			frameWidth = 765;
			leftMargin = 0;
			canvasHeight = 503;
			frameHeight = 503;
			@Pc(54) String openWindowJavaScriptStr = this.getParameter("openwinjs");
			openWindowJavaScript = openWindowJavaScriptStr != null && openWindowJavaScriptStr.equals("1");
			if (signLink == null) {
				signLink2 = signLink = new SignLink(this, cacheId, null, 0);
			}
			@Pc(86) PrivilegedRequest request = signLink.startThread(1, this);
			while (request.status == 0) {
				ThreadUtils.sleep(10L);
			}
			thread = (Thread) request.result;
		} catch (@Pc(103) Exception ex) {
			TracingException.report(null, ex);
			this.error("crash");
		}
	}
}
