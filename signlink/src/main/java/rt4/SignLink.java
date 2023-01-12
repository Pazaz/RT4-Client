package rt4;

import com.jogamp.opengl.GLProfile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.applet.Applet;
import java.awt.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Hashtable;

@OriginalClass("signlink!ll")
public final class SignLink implements Runnable {

	@OriginalMember(owner = "signlink!ll", name = "o", descriptor = "Ljava/lang/String;")
	public static String javaVersion;

	@OriginalMember(owner = "signlink!ll", name = "n", descriptor = "Ljava/lang/String;")
	public static String osName;

	@OriginalMember(owner = "signlink!ll", name = "l", descriptor = "Ljava/lang/String;")
	private static String osNameRaw;

	@OriginalMember(owner = "signlink!ll", name = "v", descriptor = "Ljava/lang/String;")
	private static String homeDir;

	@OriginalMember(owner = "signlink!ll", name = "j", descriptor = "Ljava/lang/String;")
	private static String osVersion;

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "Ljava/lang/String;")
	public static String javaVendor;

	@OriginalMember(owner = "signlink!ll", name = "b", descriptor = "Ljava/lang/String;")
	private static String osArch;

	@OriginalMember(owner = "signlink!ll", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusCycleRoot;

	@OriginalMember(owner = "signlink!ll", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method setFocusTraversalKeysEnabled;

	@OriginalMember(owner = "signlink!ll", name = "e", descriptor = "I")
	public static final int anInt5928 = 1;

	@OriginalMember(owner = "signlink!ll", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable fileCache = new Hashtable(16);

	@OriginalMember(owner = "signlink!ll", name = "q", descriptor = "J")
	private static volatile long breakConnectionsUntil = 0L;

	@OriginalMember(owner = "signlink!ll", name = "A", descriptor = "Lsignlink!ai;")
	private AudioSource audioSource;

	@OriginalMember(owner = "signlink!ll", name = "g", descriptor = "Lsignlink!qm;")
	public FileOnDisk cacheData;

	@OriginalMember(owner = "signlink!ll", name = "p", descriptor = "Lsignlink!im;")
	private PrivilegedRequest requestQueueTail = null;

	@OriginalMember(owner = "signlink!ll", name = "f", descriptor = "Z")
	private boolean stop;

	@OriginalMember(owner = "signlink!ll", name = "h", descriptor = "Lsignlink!qm;")
	public FileOnDisk cacheMasterIndex;

	@OriginalMember(owner = "signlink!ll", name = "d", descriptor = "Lsignlink!qm;")
	public FileOnDisk uid;

	@OriginalMember(owner = "signlink!ll", name = "y", descriptor = "Lsignlink!im;")
	private PrivilegedRequest requestQueueHead = null;

	@OriginalMember(owner = "signlink!ll", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet applet;

	@OriginalMember(owner = "signlink!ll", name = "x", descriptor = "Ljava/lang/String;")
	private final String cacheSubDir;

	@OriginalMember(owner = "signlink!ll", name = "z", descriptor = "I")
	private final int cacheId;

	@OriginalMember(owner = "signlink!ll", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue eventQueue;

	@OriginalMember(owner = "signlink!ll", name = "c", descriptor = "[Lsignlink!qm;")
	public FileOnDisk[] cacheIndexes;

	@OriginalMember(owner = "signlink!ll", name = "t", descriptor = "Lsignlink!e;")
	private FullScreenManager fullScreenManager;

	@OriginalMember(owner = "signlink!ll", name = "s", descriptor = "Lsignlink!g;")
	private CursorManager cursorManager;

	@OriginalMember(owner = "signlink!ll", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread thread;

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ZLjava/lang/String;)Lsignlink!qm;")
	private static FileOnDisk openPreferencesInternal(@OriginalArg(1) String cacheSubDir) {
		@Pc(41) String[] cacheLocations = new String[]{"c:/rscache/", "/rscache/", homeDir, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
		for (@Pc(43) int i = 0; i < cacheLocations.length; i++) {
			@Pc(51) String cacheLocation = cacheLocations[i];
			if (cacheLocation.length() <= 0 || (new File(cacheLocation)).exists()) {
				try {
					return new FileOnDisk(new File(cacheLocation, "jagex_" + cacheSubDir + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(84) Exception ex) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)Ljava/io/File;")
	public static File getFile(@OriginalArg(0) String cacheSubDir, @OriginalArg(1) int storeId, @OriginalArg(3) String name) {
		@Pc(4) File cachedFile = (File) fileCache.get(name);
		if (cachedFile != null) {
			return cachedFile;
		}
		@Pc(53) String[] cacheLocations = new String[]{homeDir, "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
		@Pc(78) String[] cacheDirs = new String[]{"cache", ".runite_rs", ".530file_store_" + storeId, ".jagex_cache_" + storeId, ".file_store_" + storeId};
		for (@Pc(80) int attempt = 0; attempt < 2; attempt++) {
			for (@Pc(87) int i = 0; i < cacheDirs.length; i++) {
				for (@Pc(93) int j = 0; j < cacheLocations.length; j++) {
					@Pc(128) String path = cacheLocations[j] + cacheDirs[i] + "/" + (cacheSubDir == null ? "" : cacheSubDir + "/") + name;
					@Pc(130) RandomAccessFile randomAccessFile = null;
					try {
						@Pc(135) File file = new File(path);
						if (attempt != 0 || file.exists()) {
							@Pc(145) String cacheLocation = cacheLocations[j];
							if (attempt != 1 || cacheLocation.length() <= 0 || (new File(cacheLocation)).exists()) {
								(new File(cacheLocations[j] + cacheDirs[i])).mkdir();
								if (cacheSubDir != null) {
									(new File(cacheLocations[j] + cacheDirs[i] + "/" + cacheSubDir)).mkdir();
								}
								randomAccessFile = new RandomAccessFile(file, "rw");
								@Pc(210) int firstByte = randomAccessFile.read();
								randomAccessFile.seek(0L);
								randomAccessFile.write(firstByte);
								randomAccessFile.seek(0L);
								randomAccessFile.close();
								fileCache.put(name, file);
								return file;
							}
						}
					} catch (@Pc(229) Exception ex) {
						try {
							if (randomAccessFile != null) {
								randomAccessFile.close();
							}
						} catch (@Pc(239) Exception ex2) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "signlink!ll", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public SignLink(@OriginalArg(0) Applet applet, @OriginalArg(1) int cacheId, @OriginalArg(2) String cacheSubDir, @OriginalArg(3) int archiveCount) throws Exception {
		javaVersion = "1.1";
		this.cacheSubDir = cacheSubDir;
		this.cacheId = cacheId;
		this.applet = applet;
		javaVendor = "Unknown";
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			osNameRaw = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			osNameRaw = "Unknown";
		}
		osName = osNameRaw.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			osVersion = "";
		}

		String homeDirOverride = System.getProperty("clientHomeOverride");
		if (homeDirOverride != null) {
			homeDir = homeDirOverride;
 		} else {
			try {
				if (homeDir == null)
					homeDir = System.getProperty("user.home") + File.separatorChar;

				if (osName.startsWith("linux")) {
					String xdgHome = System.getenv("XDG_DATA_HOME");

					if (xdgHome != null) {
						homeDir = xdgHome + "/2009scape/";
					} else {
						homeDir += ".local/share/2009scape/";
					}
				} else if (osName.startsWith("mac")) {
					homeDir += "Library/Application Support/2009scape/";
				} else if (osName.startsWith("windows")) {
					homeDir += "2009scape\\";
				}
			} catch (@Pc(86) Exception ex) {
			}
		}

		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable ex) {
		}
		try {
			if (applet == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = applet.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception ex) {
		}
		try {
			if (applet == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = applet.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception ex) {
		}
		this.uid = new FileOnDisk(getFile(null, this.cacheId, "random.dat"), "rw", 25L);
		this.cacheData = new FileOnDisk(getFile(this.cacheSubDir, this.cacheId, "main_file_cache.dat2"), "rw", 104857600L);
		this.cacheMasterIndex = new FileOnDisk(getFile(this.cacheSubDir, this.cacheId, "main_file_cache.idx255"), "rw", 1048576L);
		this.cacheIndexes = new FileOnDisk[archiveCount];
		for (@Pc(200) int i = 0; i < archiveCount; i++) {
			this.cacheIndexes[i] = new FileOnDisk(getFile(this.cacheSubDir, this.cacheId, "main_file_cache.idx" + i), "rw", 1048576L);
		}
		try {
			this.fullScreenManager = new FullScreenManager();
		} catch (@Pc(239) Throwable ex) {
		}
		try {
			this.cursorManager = new CursorManager();
		} catch (@Pc(246) Throwable ex) {
		}
		@Pc(249) ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
		for (@Pc(252) ThreadGroup group = rootGroup.getParent(); group != null; group = group.getParent()) {
			rootGroup = group;
		}
		@Pc(263) Thread[] threads = new Thread[1000];
		rootGroup.enumerate(threads);
		for (@Pc(269) int i = 0; i < threads.length; i++) {
			if (threads[i] != null && threads[i].getName().startsWith("AWT")) {
				threads[i].setPriority(1);
			}
		}
		this.stop = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(I)V")
	public final void breakConnection() {
		breakConnectionsUntil = MonotonicClock.currentTimeMillis() + 5000L;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Z)Z")
	public final boolean isFullScreenSupported() {
		return this.fullScreenManager != null;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/String;I)Lsignlink!im;")
	public final PrivilegedRequest openPreferences(@OriginalArg(0) String cacheSubDir) {
		return this.enqueue(12, 0, cacheSubDir, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lsignlink!im;")
	public final PrivilegedRequest setCursor(@OriginalArg(0) int[] pixels, @OriginalArg(2) int width, @OriginalArg(3) Component component, @OriginalArg(4) Point hotSpot, @OriginalArg(5) int height) {
		return this.enqueue(17, height, new Object[]{component, pixels, hotSpot}, width);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(IILjava/lang/Object;II)Lsignlink!im;")
	private PrivilegedRequest enqueue(@OriginalArg(0) int type, @OriginalArg(1) int intArg1, @OriginalArg(2) Object objectArg, @OriginalArg(3) int intArg2) {
		@Pc(3) PrivilegedRequest request = new PrivilegedRequest();
		request.intArg1 = intArg1;
		request.intArg2 = intArg2;
		request.type = type;
		request.objectArg = objectArg;
		synchronized (this) {
			if (this.requestQueueTail == null) {
				this.requestQueueTail = this.requestQueueHead = request;
			} else {
				this.requestQueueTail.next = request;
				this.requestQueueTail = request;
			}
			this.notify();
			return request;
		}
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/awt/Frame;I)Lsignlink!im;")
	public final PrivilegedRequest exitFullScreen(@OriginalArg(0) Frame frame) {
		return this.enqueue(7, 0, frame, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ZLjava/net/URL;)Lsignlink!im;")
	public final PrivilegedRequest openUrlStream(@OriginalArg(1) URL url) {
		return this.enqueue(4, 0, url, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(BLjava/lang/String;I)Lsignlink!im;")
	public final PrivilegedRequest openSocket(@OriginalArg(1) String hostname, @OriginalArg(2) int port) {
		System.out.println("openSocket(" + hostname + ":" + port + ")");
		return this.enqueue(1, 0, hostname, port);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/Class;I)Lsignlink!im;")
	public final PrivilegedRequest unloadGlNatives(@OriginalArg(0) Class targetClass) {
		return this.enqueue(11, 0, targetClass, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lsignlink!im;")
	public final PrivilegedRequest getDeclaredMethod(@OriginalArg(0) Class targetClass, @OriginalArg(1) Class[] parameterTypes, @OriginalArg(3) String name) {
		return this.enqueue(8, 0, new Object[]{targetClass, name, parameterTypes}, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (true) {
			@Pc(16) PrivilegedRequest request;
			synchronized (this) {
				while (true) {
					if (this.stop) {
						return;
					}
					if (this.requestQueueHead != null) {
						request = this.requestQueueHead;
						this.requestQueueHead = this.requestQueueHead.next;
						if (this.requestQueueHead == null) {
							this.requestQueueTail = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException ex) {
					}
				}
			}
			try {
				@Pc(45) int type = request.type;
				@Pc(687) Object[] args;
				if (type == 1) {
					if (breakConnectionsUntil > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					request.result = new Socket(InetAddress.getByName((String) request.objectArg), request.intArg2);
				} else if (type == 2) {
					@Pc(813) Thread thread = new Thread((Runnable) request.objectArg);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(request.intArg2);
					request.result = thread;
				} else if (type == 3) {
					if (MonotonicClock.currentTimeMillis() < breakConnectionsUntil) {
						throw new IOException();
					}
					@Pc(147) String ip = (request.intArg2 >> 24 & 0xFF) + "." + (request.intArg2 >> 16 & 0xFF) + "." + (request.intArg2 >> 8 & 0xFF) + "." + (request.intArg2 & 0xFF);
					request.result = InetAddress.getByName(ip).getHostName();
				} else if (type == 4) {
					if (breakConnectionsUntil > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					request.result = new DataInputStream(((URL) request.objectArg).openStream());
				} else if (type == 5) {
					request.result = this.fullScreenManager.getDisplayModes();
				} else if (type == 6) {
					@Pc(168) Frame frame = new Frame("Jagex Full Screen");
					request.result = frame;
					frame.setResizable(false);
					frame.setBackground(Color.black);
					this.fullScreenManager.enter(request.intArg1 & 0xFFFF, request.intArg1 >> 16, request.intArg2 & 0xFFFF, frame, request.intArg2 >>> 16);
				} else if (type == 7) {
					this.fullScreenManager.exit();
				} else if (type == 8) {
					args = (Object[]) request.objectArg;
					if (((Class) args[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					request.result = ((Class) args[0]).getDeclaredMethod((String) args[1], (Class[]) args[2]);
				} else if (type == 9) {
					args = (Object[]) request.objectArg;
					if (((Class) args[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					request.result = ((Class) args[0]).getDeclaredField((String) args[1]);
				} else if (type == 10) {
					GLProfile.initSingleton();
				} else if (type == 11) {
					GLProfile.shutdown();
				} else if (type == 12) {
					String cacheSubDir = (String) request.objectArg;
					@Pc(558) FileOnDisk preferences = openPreferencesInternal(cacheSubDir);
					request.result = preferences;
				} else if (type == 14) {
					@Pc(570) int x = request.intArg1;
					@Pc(573) int y = request.intArg2;
					this.cursorManager.setPosition(y, x);
				} else if (type == 15) {
					@Pc(591) boolean reset = request.intArg2 != 0;
					@Pc(595) Component component = (Component) request.objectArg;
					this.cursorManager.setComponent(component, reset);
				} else if (type == 17) {
					args = (Object[]) request.objectArg;
					this.cursorManager.setCursor((Point) args[2], request.intArg2, (Component) args[0], request.intArg1, (int[]) args[1]);
				} else if (type == 16) {
					try {
						if (!osName.startsWith("win")) {
							throw new Exception();
						}
						String url = (String) request.objectArg;
						if (!url.startsWith("http://") && !url.startsWith("https://")) {
							throw new Exception();
						}
						@Pc(636) String safeChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
						for (@Pc(490) int i = 0; i < url.length(); i++) {
							if (safeChars.indexOf(url.charAt(i)) == -1) {
								throw new Exception();
							}
						}
						Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
						request.result = null;
					} catch (@Pc(674) Exception ex) {
						request.result = ex;
					}
				} else {
					throw new Exception();
				}
				request.status = 1;
			} catch (@Pc(830) ThreadDeath ex) {
				throw ex;
			} catch (@Pc(833) Throwable ex) {
				request.status = 2;
			}
		}
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ILjava/lang/Class;)Lsignlink!im;")
	public final PrivilegedRequest loadGlNatives(@OriginalArg(1) Class targetClass) {
		return this.enqueue(10, 0, targetClass, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "b", descriptor = "(I)V")
	public final void stop() {
		synchronized (this) {
			this.stop = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (@Pc(21) InterruptedException ex) {
		}
		if (this.cacheData != null) {
			try {
				this.cacheData.close();
			} catch (@Pc(39) IOException ex) {
			}
		}
		if (this.cacheMasterIndex != null) {
			try {
				this.cacheMasterIndex.close();
			} catch (@Pc(49) IOException ex) {
			}
		}
		if (this.cacheIndexes != null) {
			for (@Pc(55) int i = 0; i < this.cacheIndexes.length; i++) {
				if (this.cacheIndexes[i] != null) {
					try {
						this.cacheIndexes[i].close();
					} catch (@Pc(79) IOException ex) {
					}
				}
			}
		}
		if (this.uid != null) {
			try {
				this.uid.close();
			} catch (@Pc(93) IOException ex) {
			}
		}
	}

	@OriginalMember(owner = "signlink!ll", name = "b", descriptor = "(B)Lsignlink!ai;")
	public final AudioSource getAudioSource() {
		return this.audioSource;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lsignlink!im;")
	public final PrivilegedRequest getDeclaredField(@OriginalArg(1) String name, @OriginalArg(2) Class targetClass) {
		return this.enqueue(9, 0, new Object[]{targetClass, name}, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(II)Lsignlink!im;")
	public final PrivilegedRequest getReverseDns(@OriginalArg(1) int ip) {
		return this.enqueue(3, 0, null, ip);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(IIIII)Lsignlink!im;")
	public final PrivilegedRequest enterFullScreen(@OriginalArg(1) int bitDepth, @OriginalArg(2) int height, @OriginalArg(3) int width) {
		return this.enqueue(6, bitDepth << 16, null, (width << 16) + height);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(IILjava/lang/Runnable;)Lsignlink!im;")
	public final PrivilegedRequest startThread(@OriginalArg(1) int priority, @OriginalArg(2) Runnable runnable) {
		return this.enqueue(2, 0, runnable, priority);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/String;Z)Lsignlink!im;")
	public final PrivilegedRequest openUrl(@OriginalArg(0) String url) {
		return this.enqueue(16, 0, url, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(B)Lsignlink!im;")
	public final PrivilegedRequest getDisplayModes() {
		return this.enqueue(5, 0, null, 0);
	}
}
