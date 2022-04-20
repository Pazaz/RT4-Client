import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!ll")
public final class SignLink implements Runnable {

	@OriginalMember(owner = "signlink!ll", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "signlink!ll", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "signlink!ll", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString16;

	@OriginalMember(owner = "signlink!ll", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString17;

	@OriginalMember(owner = "signlink!ll", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString18;

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "signlink!ll", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString21;

	@OriginalMember(owner = "signlink!ll", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod5;

	@OriginalMember(owner = "signlink!ll", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod6;

	@OriginalMember(owner = "signlink!ll", name = "e", descriptor = "I")
	public static final int anInt5928 = 1;

	@OriginalMember(owner = "signlink!ll", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "signlink!ll", name = "q", descriptor = "J")
	private static volatile long aLong1314 = 0L;

	@OriginalMember(owner = "signlink!ll", name = "A", descriptor = "Lsignlink!ai;")
	private AudioSource anInterface10_2;

	@OriginalMember(owner = "signlink!ll", name = "g", descriptor = "Lsignlink!qm;")
	public FileOnDisk cacheData = null;

	@OriginalMember(owner = "signlink!ll", name = "p", descriptor = "Lsignlink!im;")
	private PrivilegedRequest aClass212_7 = null;

	@OriginalMember(owner = "signlink!ll", name = "f", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "signlink!ll", name = "h", descriptor = "Lsignlink!qm;")
	public FileOnDisk cacheMasterIndex = null;

	@OriginalMember(owner = "signlink!ll", name = "d", descriptor = "Lsignlink!qm;")
	public FileOnDisk uid = null;

	@OriginalMember(owner = "signlink!ll", name = "y", descriptor = "Lsignlink!im;")
	private PrivilegedRequest aClass212_8 = null;

	@OriginalMember(owner = "signlink!ll", name = "i", descriptor = "Ljava/applet/Applet;")
	public Applet anApplet2 = null;

	@OriginalMember(owner = "signlink!ll", name = "x", descriptor = "Ljava/lang/String;")
	private final String aString19;

	@OriginalMember(owner = "signlink!ll", name = "z", descriptor = "I")
	private final int anInt5929;

	@OriginalMember(owner = "signlink!ll", name = "k", descriptor = "Ljava/awt/EventQueue;")
	public EventQueue anEventQueue1;

	@OriginalMember(owner = "signlink!ll", name = "c", descriptor = "[Lsignlink!qm;")
	public FileOnDisk[] cacheIndexes;

	@OriginalMember(owner = "signlink!ll", name = "t", descriptor = "Lsignlink!e;")
	private FullScreenManager aClass210_1;

	@OriginalMember(owner = "signlink!ll", name = "s", descriptor = "Lsignlink!g;")
	private CursorManager aClass211_1;

	@OriginalMember(owner = "signlink!ll", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ZLjava/lang/String;)Lsignlink!qm;")
	private static FileOnDisk method5117(@OriginalArg(1) String arg0) {
		@Pc(41) String[] local41 = new String[] { "c:/rscache/", "/rscache/", aString17, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
			@Pc(51) String local51 = local41[local43];
			if (local51.length() <= 0 || (new File(local51)).exists()) {
				try {
					return new FileOnDisk(new File(local51, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(84) Exception local84) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)Ljava/io/File;")
	public static File method5127(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString17, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(87) int local87 = 0; local87 < local78.length; local87++) {
				for (@Pc(93) int local93 = 0; local93 < local53.length; local93++) {
					@Pc(128) String local128 = local53[local93] + local78[local87] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local80 != 0 || local135.exists()) {
							@Pc(145) String local145 = local53[local93];
							if (local80 != 1 || local145.length() <= 0 || (new File(local145)).exists()) {
								(new File(local53[local93] + local78[local87])).mkdir();
								if (arg0 != null) {
									(new File(local53[local93] + local78[local87] + "/" + arg0)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(210) int local210 = local130.read();
								local130.seek(0L);
								local130.write(local210);
								local130.seek(0L);
								local130.close();
								aHashtable2.put(arg2, local135);
								return local135;
							}
						}
					} catch (@Pc(229) Exception local229) {
						try {
							if (local130 != null) {
								local130.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "signlink!ll", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public SignLink(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString14 = "1.1";
		this.aString19 = arg2;
		this.anInt5929 = arg1;
		this.anApplet2 = arg0;
		aString20 = "Unknown";
		try {
			aString20 = System.getProperty("java.vendor");
			aString14 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString16 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString16 = "Unknown";
		}
		aString15 = aString16.toLowerCase();
		try {
			aString21 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString21 = "";
		}
		try {
			aString18 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString18 = "";
		}
		try {
			aString17 = System.getProperty("user.home");
			if (aString17 != null) {
				aString17 = aString17 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString17 == null) {
			aString17 = "~/";
		}
		try {
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod6 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod5 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod5 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.uid = new FileOnDisk(method5127(null, this.anInt5929, "random.dat"), "rw", 25L);
		this.cacheData = new FileOnDisk(method5127(this.aString19, this.anInt5929, "main_file_cache.dat2"), "rw", 104857600L);
		this.cacheMasterIndex = new FileOnDisk(method5127(this.aString19, this.anInt5929, "main_file_cache.idx255"), "rw", 1048576L);
		this.cacheIndexes = new FileOnDisk[arg3];
		for (@Pc(200) int local200 = 0; local200 < arg3; local200++) {
			this.cacheIndexes[local200] = new FileOnDisk(method5127(this.aString19, this.anInt5929, "main_file_cache.idx" + local200), "rw", 1048576L);
		}
		try {
			this.aClass210_1 = new FullScreenManager();
		} catch (@Pc(239) Throwable local239) {
		}
		try {
			this.aClass211_1 = new CursorManager();
		} catch (@Pc(246) Throwable local246) {
		}
		@Pc(249) ThreadGroup local249 = Thread.currentThread().getThreadGroup();
		for (@Pc(252) ThreadGroup local252 = local249.getParent(); local252 != null; local252 = local252.getParent()) {
			local249 = local252;
		}
		@Pc(263) Thread[] local263 = new Thread[1000];
		local249.enumerate(local263);
		for (@Pc(269) int local269 = 0; local269 < local263.length; local269++) {
			if (local263[local269] != null && local263[local269].getName().startsWith("AWT")) {
				local263[local269].setPriority(1);
			}
		}
		this.aBoolean360 = false;
		this.aThread3 = new Thread(this);
		this.aThread3.setPriority(10);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(I)V")
	public final void method5110() {
		aLong1314 = MonotonicClock.currentTimeMillis() + 5000L;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Z)Z")
	public final boolean method5111() {
		return this.aClass210_1 != null;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/String;I)Lsignlink!im;")
	public final PrivilegedRequest method5112(@OriginalArg(0) String arg0) {
		return this.method5114(12, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lsignlink!im;")
	public final PrivilegedRequest method5113(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) int arg4) {
		return this.method5114(17, arg4, new Object[] { arg2, arg0, arg3 }, arg1);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(IILjava/lang/Object;II)Lsignlink!im;")
	private PrivilegedRequest method5114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3) {
		@Pc(3) PrivilegedRequest local3 = new PrivilegedRequest();
		local3.anInt5927 = arg1;
		local3.anInt5926 = arg3;
		local3.anInt5924 = arg0;
		local3.anObject7 = arg2;
		synchronized (this) {
			if (this.aClass212_7 == null) {
				this.aClass212_7 = this.aClass212_8 = local3;
			} else {
				this.aClass212_7.aClass212_6 = local3;
				this.aClass212_7 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/awt/Frame;I)Lsignlink!im;")
	public final PrivilegedRequest method5115(@OriginalArg(0) Frame arg0) {
		return this.method5114(7, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ZLjava/net/URL;)Lsignlink!im;")
	public final PrivilegedRequest method5118(@OriginalArg(1) URL arg0) {
		return this.method5114(4, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(BLjava/lang/String;I)Lsignlink!im;")
	public final PrivilegedRequest openSocket(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		return this.method5114(1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/Class;I)Lsignlink!im;")
	public final PrivilegedRequest method5121(@OriginalArg(0) Class arg0) {
		return this.method5114(11, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lsignlink!im;")
	public final PrivilegedRequest method5122(@OriginalArg(0) Class arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(3) String arg2) {
		return this.method5114(8, 0, new Object[] { arg0, arg2, arg1 }, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (true) {
			@Pc(16) PrivilegedRequest local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean360) {
						return;
					}
					if (this.aClass212_8 != null) {
						local16 = this.aClass212_8;
						this.aClass212_8 = this.aClass212_8.aClass212_6;
						if (this.aClass212_8 == null) {
							this.aClass212_7 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt5924;
				if (local45 == 1) {
					if (aLong1314 > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					local16.result = new Socket(InetAddress.getByName((String) local16.anObject7), local16.anInt5926);
				} else if (local45 == 2) {
					@Pc(813) Thread local813 = new Thread((Runnable) local16.anObject7);
					local813.setDaemon(true);
					local813.start();
					local813.setPriority(local16.anInt5926);
					local16.result = local813;
				} else if (local45 == 4) {
					if (aLong1314 > MonotonicClock.currentTimeMillis()) {
						throw new IOException();
					}
					local16.result = new DataInputStream(((URL) local16.anObject7).openStream());
				} else {
					@Pc(687) Object[] local687;
					if (local45 == 8) {
						local687 = (Object[]) local16.anObject7;
						if (((Class) local687[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.result = ((Class) local687[0]).getDeclaredMethod((String) local687[1], (Class[]) local687[2]);
					} else if (local45 == 9) {
						local687 = (Object[]) local16.anObject7;
						if (((Class) local687[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.result = ((Class) local687[0]).getDeclaredField((String) local687[1]);
					} else {
						@Pc(147) String local147;
						if (local45 == 3) {
							if (MonotonicClock.currentTimeMillis() < aLong1314) {
								throw new IOException();
							}
							local147 = (local16.anInt5926 >> 24 & 0xFF) + "." + (local16.anInt5926 >> 16 & 0xFF) + "." + (local16.anInt5926 >> 8 & 0xFF) + "." + (local16.anInt5926 & 0xFF);
							local16.result = InetAddress.getByName(local147).getHostName();
						} else if (local45 == 5) {
							local16.result = this.aClass210_1.method5105();
						} else if (local45 == 6) {
							@Pc(168) Frame local168 = new Frame("Jagex Full Screen");
							local16.result = local168;
							local168.setResizable(false);
							this.aClass210_1.method5104(local16.anInt5927 & 0xFFFF, local16.anInt5927 >> 16, local16.anInt5926 & 0xFFFF, local168, local16.anInt5926 >>> 16);
						} else if (local45 == 7) {
							this.aClass210_1.method5106();
						} else if (local45 == 10) {
                            GLProfile.initSingleton();
						} else {
							@Pc(490) int local490;
							if (local45 == 11) {
								GLProfile.shutdown();
							} else if (local45 == 12) {
								local147 = (String) local16.anObject7;
								@Pc(558) FileOnDisk local558 = method5117(local147);
								local16.result = local558;
							} else if (local45 == 14) {
								@Pc(570) int local570 = local16.anInt5927;
								@Pc(573) int local573 = local16.anInt5926;
								this.aClass211_1.method5108(local573, local570);
							} else if (local45 == 15) {
								@Pc(591) boolean local591 = local16.anInt5926 != 0;
								@Pc(595) Component local595 = (Component) local16.anObject7;
								this.aClass211_1.method5109(local595, local591);
							} else if (local45 == 17) {
								local687 = (Object[]) local16.anObject7;
								this.aClass211_1.method5107((Point) local687[2], local16.anInt5926, (Component) local687[0], local16.anInt5927, (int[]) local687[1]);
							} else if (local45 == 16) {
								try {
									if (!aString15.startsWith("win")) {
										throw new Exception();
									}
									local147 = (String) local16.anObject7;
									if (!local147.startsWith("http://") && !local147.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(636) String local636 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local490 = 0; local490 < local147.length(); local490++) {
										if (local636.indexOf(local147.charAt(local490)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local147 + "\"");
									local16.result = null;
								} catch (@Pc(674) Exception local674) {
									local16.result = local674;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local16.status = 1;
			} catch (@Pc(830) ThreadDeath local830) {
				throw local830;
			} catch (@Pc(833) Throwable local833) {
				local16.status = 2;
			}
		}
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ILjava/lang/Class;)Lsignlink!im;")
	public final PrivilegedRequest method5123(@OriginalArg(1) Class arg0) {
		return this.method5114(10, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "b", descriptor = "(I)V")
	public final void method5124() {
		synchronized (this) {
			this.aBoolean360 = true;
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.cacheData != null) {
			try {
				this.cacheData.method5136();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.cacheMasterIndex != null) {
			try {
				this.cacheMasterIndex.method5136();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.cacheIndexes != null) {
			for (@Pc(55) int local55 = 0; local55 < this.cacheIndexes.length; local55++) {
				if (this.cacheIndexes[local55] != null) {
					try {
						this.cacheIndexes[local55].method5136();
					} catch (@Pc(79) IOException local79) {
					}
				}
			}
		}
		if (this.uid != null) {
			try {
				this.uid.method5136();
			} catch (@Pc(93) IOException local93) {
			}
		}
	}

	@OriginalMember(owner = "signlink!ll", name = "b", descriptor = "(B)Lsignlink!ai;")
	public final AudioSource method5125() {
		return this.anInterface10_2;
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lsignlink!im;")
	public final PrivilegedRequest method5126(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		return this.method5114(9, 0, new Object[] { arg1, arg0 }, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(II)Lsignlink!im;")
	public final PrivilegedRequest method5128(@OriginalArg(1) int arg0) {
		return this.method5114(3, 0, null, arg0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(IIIII)Lsignlink!im;")
	public final PrivilegedRequest method5129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method5114(6, arg0 << 16, null, (arg2 << 16) + arg1);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(IILjava/lang/Runnable;)Lsignlink!im;")
	public final PrivilegedRequest method5130(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method5114(2, 0, arg1, arg0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(Ljava/lang/String;Z)Lsignlink!im;")
	public final PrivilegedRequest method5131(@OriginalArg(0) String arg0) {
		return this.method5114(16, 0, arg0, 0);
	}

	@OriginalMember(owner = "signlink!ll", name = "a", descriptor = "(B)Lsignlink!im;")
	public final PrivilegedRequest method5132() {
		return this.method5114(5, 0, null, 0);
	}
}
