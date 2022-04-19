package com.sun.gluegen.runtime;

public class CPU {

	private static boolean is32Bit;

	public static boolean is32Bit() {
		return is32Bit;
	}

	static {
		String var0 = System.getProperty("os.name").toLowerCase();
		String var1 = System.getProperty("os.arch").toLowerCase();
		if (var0.startsWith("windows") && var1.equals("x86") || !(!var0.startsWith("linux") || !var1.equals("i386")) || var0.startsWith("linux") && var1.equals("x86") || var0.startsWith("mac os") && var1.equals("ppc") || var0.startsWith("mac os") && var1.equals("i386") || var0.startsWith("sunos") && var1.equals("sparc") || var0.startsWith("sunos") && var1.equals("x86") || var0.startsWith("freebsd") && var1.equals("i386") || var0.startsWith("hp-ux") && var1.equals("pa_risc2.0")) {
			is32Bit = true;
		} else if ((!var0.startsWith("windows") || !var1.equals("amd64")) && (!var0.startsWith("linux") || !var1.equals("amd64")) && (!var0.startsWith("linux") || !var1.equals("x86_64")) && (!var0.startsWith("linux") || !var1.equals("ia64")) && (!var0.startsWith("mac os") || !var1.equals("x86_64")) && (!var0.startsWith("sunos") || !var1.equals("sparcv9")) && (!var0.startsWith("sunos") || !var1.equals("amd64"))) {
			throw new RuntimeException("Please port CPU detection (32/64 bit) to your platform (" + var0 + "/" + var1 + ")");
		}
	}
}
