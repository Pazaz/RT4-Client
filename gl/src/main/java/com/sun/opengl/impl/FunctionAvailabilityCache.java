package com.sun.opengl.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.media.opengl.GL;

public final class FunctionAvailabilityCache {

	private HashMap availabilityCache = new HashMap(50);

	private HashSet availableExtensionCache = new HashSet(50);

	private GLContextImpl context;

	FunctionAvailabilityCache(GLContextImpl arg0) {
		this.context = arg0;
	}

	public void flush() {
		this.availabilityCache.clear();
		this.availableExtensionCache.clear();
	}

	public boolean isExtensionAvailable(String arg0) {
		this.initAvailableExtensions();
		return this.availableExtensionCache.contains(mapGLExtensionName(arg0));
	}

	protected void initAvailableExtensions() {
		if (!this.availableExtensionCache.isEmpty()) {
			return;
		}
		GL var1 = this.context.getGL();
		String var2 = var1.glGetString(GL.GL_EXTENSIONS) + " " + this.context.getPlatformExtensionsString();
		StringTokenizer var3 = new StringTokenizer(var2);
		while (var3.hasMoreTokens()) {
			String var4 = var3.nextToken().trim();
			String var7 = var4.intern();
			this.availableExtensionCache.add(var7);
		}
		FunctionAvailabilityCache.Version var8 = new FunctionAvailabilityCache.Version(var1.glGetString(GL.GL_VERSION));
		int var5 = var8.getMajor();
		int var6 = var8.getMinor();
		while (var5 > 0) {
			while (var6 >= 0) {
				this.availableExtensionCache.add("GL_VERSION_" + var5 + "_" + var6);
				var6--;
			}
			switch(var5) {
				case 2:
					var6 = 5;
				case 1:
				default:
					var5--;
			}
		}
		this.availableExtensionCache.add("<INTERNAL_DUMMY_PLACEHOLDER>");
	}

	private static String mapGLExtensionName(String arg0) {
		return arg0 != null && (arg0.equals("WGL_NV_vertex_array_range") || arg0.equals("GLX_NV_vertex_array_range")) ? "GL_NV_vertex_array_range" : arg0;
	}

	private static class Version implements Comparable {

		private int major;

		private int minor;

		private int sub;

		public Version(String arg0) {
			try {
				StringTokenizer var2;
				if (arg0.startsWith("GL_VERSION_")) {
					var2 = new StringTokenizer(arg0, "_");
					var2.nextToken();
					var2.nextToken();
					if (!var2.hasMoreTokens()) {
						this.major = 0;
						return;
					}
					this.major = Integer.valueOf(var2.nextToken());
					if (!var2.hasMoreTokens()) {
						this.minor = 0;
						return;
					}
					this.minor = Integer.valueOf(var2.nextToken());
					if (!var2.hasMoreTokens()) {
						this.sub = 0;
						return;
					}
					this.sub = Integer.valueOf(var2.nextToken());
				} else {
					var2 = new StringTokenizer(arg0, ". ");
					this.major = Integer.valueOf(var2.nextToken());
					this.minor = Integer.valueOf(var2.nextToken());
					var2 = new StringTokenizer(arg0, " ");
					if (var2.hasMoreTokens()) {
						var2.nextToken();
						if (var2.hasMoreTokens()) {
							Pattern var3 = Pattern.compile("\\D*(\\d+)\\.(\\d+)\\.?(\\d*).*");
							Matcher var4 = var3.matcher(var2.nextToken());
							if (var4.matches()) {
								int var5 = Integer.valueOf(var4.group(1));
								int var6 = Integer.valueOf(var4.group(2));
								if (var5 == this.major && var6 > this.minor || var5 == this.major + 1) {
									this.major = var5;
									this.minor = var6;
								}
							}
						}
					}
				}
			} catch (Exception var7) {
				throw (IllegalArgumentException) (new IllegalArgumentException("Illegally formatted version identifier: \"" + arg0 + "\"")).initCause(var7);
			}
		}

		public int compareTo(Object arg0) {
			FunctionAvailabilityCache.Version var2 = (FunctionAvailabilityCache.Version) arg0;
			if (this.major > var2.major) {
				return 1;
			} else if (this.major < var2.major) {
				return -1;
			} else if (this.minor > var2.minor) {
				return 1;
			} else if (this.minor < var2.minor) {
				return -1;
			} else if (this.sub > var2.sub) {
				return 1;
			} else if (this.sub < var2.sub) {
				return -1;
			} else {
				return 0;
			}
		}

		public int getMajor() {
			return this.major;
		}

		public int getMinor() {
			return this.minor;
		}
	}
}
