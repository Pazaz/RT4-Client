package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.NativeLibrary;
import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class DRIHack {

	private static boolean driHackNeeded;

	private static NativeLibrary oglLib;

	public static void begin() {
		AccessController.doPrivileged(new PrivilegedAction() {

			public Object run() {
				String var1 = System.getProperty("os.name").toLowerCase();
				DRIHack.driHackNeeded = var1.startsWith("linux") || (new File("/usr/lib/dri")).exists() || (new File("/usr/X11R6/lib/modules/dri")).exists();
				if (System.getProperty("jogl.drihack.disable") != null) {
					DRIHack.driHackNeeded = false;
				}
				return null;
			}
		});
		if (driHackNeeded) {
			oglLib = NativeLibrary.open("libGL.so.1", null);
			if (oglLib == null) {
				oglLib = NativeLibrary.open("/usr/lib/libGL.so.1", null);
			}
		}
	}

	public static void end() {
		if (oglLib != null) {
			oglLib.close();
			oglLib = null;
		}
	}
}
