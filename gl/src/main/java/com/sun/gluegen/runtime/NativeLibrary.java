package com.sun.gluegen.runtime;

import java.io.File;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class NativeLibrary {

	private static boolean DEBUG;

	private static int platform;

	private static DynamicLinker dynLink;

	private static String[] prefixes;

	private static String[] suffixes;

	private long libraryHandle;

	private String libraryPath;

	private static boolean initializedFindLibraryMethod;

	private static Method findLibraryMethod;

	private NativeLibrary(long arg0, String arg1) {
		this.libraryHandle = arg0;
		this.libraryPath = arg1;
	}

	public static NativeLibrary open(String arg0, ClassLoader arg1) {
		return open(arg0, arg0, arg0, true, arg1);
	}

	public static NativeLibrary open(String arg0, String arg1, String arg2, boolean arg3, ClassLoader arg4) {
		List var5 = enumerateLibraryPaths(arg0, arg1, arg2, arg3, arg4);
		Iterator var6 = var5.iterator();
		String var7;
		long var8;
		do {
			if (!var6.hasNext()) {
				if (DEBUG) {
					System.out.println("Did not succeed in loading (" + arg0 + ", " + arg1 + ", " + arg2 + ")");
				}
				return null;
			}
			var7 = (String) var6.next();
			if (DEBUG) {
				System.out.println("Trying to load " + var7);
			}
			var8 = dynLink.openLibrary(var7);
		} while (var8 == 0L);
		if (DEBUG) {
			System.out.println("Successfully loaded " + var7 + ": res = 0x" + Long.toHexString(var8));
		}
		return new NativeLibrary(var8, var7);
	}

	public void close() {
		if (this.libraryHandle == 0L) {
			throw new RuntimeException("Library already closed");
		}
		long var1 = this.libraryHandle;
		this.libraryHandle = 0L;
		dynLink.closeLibrary(var1);
	}

	private static List enumerateLibraryPaths(String arg0, String arg1, String arg2, boolean arg3, ClassLoader arg4) {
		ArrayList var5 = new ArrayList();
		String var6 = selectName(arg0, arg1, arg2);
		if (var6 == null) {
			return var5;
		}
		File var7 = new File(var6);
		if (var7.isAbsolute()) {
			var5.add(var6);
			return var5;
		}
		String[] var8 = buildNames(var6);
		if (arg3) {
			for (int var9 = 0; var9 < var8.length; var9++) {
				var5.add(var8[var9]);
			}
		}
		String var13 = getPathFromClassLoader(var6, arg4);
		if (DEBUG) {
			System.out.println("Class loader path to " + var6 + ": " + var13);
		}
		if (var13 != null) {
			var5.add(var13);
		}
		String var10 = (String) AccessController.doPrivileged(new PrivilegedAction() {

			public Object run() {
				return System.getProperty("java.library.path");
			}
		});
		if (var10 != null) {
			StringTokenizer var11 = new StringTokenizer(var10, File.pathSeparator);
			while (var11.hasMoreTokens()) {
				addPaths(var11.nextToken(), var8, var5);
			}
		}
		String var14 = (String) AccessController.doPrivileged(new PrivilegedAction() {

			public Object run() {
				return System.getProperty("user.dir");
			}
		});
		addPaths(var14, var8, var5);
		if (platform == 3) {
			addPaths("/Library/Frameworks/" + var6 + ".Framework", var8, var5);
			addPaths("/System/Library/Frameworks/" + var6 + ".Framework", var8, var5);
		}
		if (!arg3) {
			for (int var12 = 0; var12 < var8.length; var12++) {
				var5.add(var8[var12]);
			}
		}
		return var5;
	}

	private static String selectName(String arg0, String arg1, String arg2) {
		switch(platform) {
			case 1:
				return arg0;
			case 2:
				return arg1;
			case 3:
				return arg2;
			default:
				throw new InternalError();
		}
	}

	private static String[] buildNames(String arg0) {
		int var3;
		if (arg0.startsWith(prefixes[0])) {
			if (arg0.endsWith(suffixes[0])) {
				return new String[] { arg0 };
			}
			int var1 = arg0.indexOf(suffixes[0]);
			boolean var2 = true;
			if (var1 >= 0) {
				for (var3 = var1 + suffixes[0].length(); var3 < arg0.length(); var3++) {
					char var4 = arg0.charAt(var3);
					if (var4 != '.' && (var4 < '0' || var4 > '9')) {
						var2 = false;
						break;
					}
				}
				if (var2) {
					return new String[] { arg0 };
				}
			}
		}
		String[] var5 = new String[prefixes.length * suffixes.length];
		int var6 = 0;
		for (var3 = 0; var3 < prefixes.length; var3++) {
			for (int var7 = 0; var7 < suffixes.length; var7++) {
				var5[var6++] = prefixes[var3] + arg0 + suffixes[var7];
			}
		}
		return var5;
	}

	private static void addPaths(String arg0, String[] arg1, List arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			arg2.add(arg0 + File.separator + arg1[var3]);
		}
	}

	private static String getPathFromClassLoader(final String arg0, final ClassLoader arg1) {
		if (arg1 == null) {
			return null;
		}
		if (!initializedFindLibraryMethod) {
			AccessController.doPrivileged(new PrivilegedAction() {

				public Object run() {
					try {
						NativeLibrary.findLibraryMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
						NativeLibrary.findLibraryMethod.setAccessible(true);
					} catch (Exception var2) {
					}
					NativeLibrary.initializedFindLibraryMethod = true;
					return null;
				}
			});
		}
		if (findLibraryMethod != null) {
			try {
				return (String) AccessController.doPrivileged(new PrivilegedAction() {

					public Object run() {
						try {
							return NativeLibrary.findLibraryMethod.invoke(arg1, arg0);
						} catch (Exception var2) {
							throw new RuntimeException(var2);
						}
					}
				});
			} catch (Exception var3) {
				if (DEBUG) {
					var3.printStackTrace();
				}
			}
		}
		return null;
	}

	static {
		AccessController.doPrivileged(new PrivilegedAction() {

			public Object run() {
				String var1 = System.getProperty("os.name").toLowerCase();
				if (var1.startsWith("wind")) {
					NativeLibrary.platform = 1;
				} else if (var1.startsWith("mac os x")) {
					NativeLibrary.platform = 3;
				} else {
					NativeLibrary.platform = 2;
				}
				NativeLibrary.DEBUG = System.getProperty("gluegen.debug.NativeLibrary") != null;
				return null;
			}
		});
		switch(platform) {
			case 1:
				dynLink = new WindowsDynamicLinkerImpl();
				prefixes = new String[] { "" };
				suffixes = new String[] { ".dll" };
				break;
			case 2:
				dynLink = new UnixDynamicLinkerImpl();
				prefixes = new String[] { "lib" };
				suffixes = new String[] { ".so" };
				break;
			case 3:
				dynLink = new MacOSXDynamicLinkerImpl();
				prefixes = new String[] { "lib", "" };
				suffixes = new String[] { ".dylib", ".jnilib", "" };
				break;
			default:
				throw new InternalError("Platform not initialized properly");
		}
		initializedFindLibraryMethod = false;
		findLibraryMethod = null;
	}
}
