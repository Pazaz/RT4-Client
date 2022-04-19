package com.sun.opengl.impl.x11;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class X11SunJDKReflection {

	private static Class x11GraphicsDeviceClass;

	private static Method x11GraphicsDeviceGetScreenMethod;

	private static Class x11GraphicsConfigClass;

	private static Method x11GraphicsConfigGetVisualMethod;

	private static boolean initted;

	public static int graphicsDeviceGetScreen(GraphicsDevice arg0) {
		if (!initted) {
			return 0;
		}
		try {
			return (Integer) x11GraphicsDeviceGetScreenMethod.invoke(arg0);
		} catch (Exception var2) {
			return 0;
		}
	}

	public static int graphicsConfigurationGetVisualID(GraphicsConfiguration arg0) {
		if (!initted) {
			return 0;
		}
		try {
			return (Integer) x11GraphicsConfigGetVisualMethod.invoke(arg0);
		} catch (Exception var2) {
			return 0;
		}
	}

	static {
		AccessController.doPrivileged(new PrivilegedAction() {

			public Object run() {
				try {
					X11SunJDKReflection.x11GraphicsDeviceClass = Class.forName("sun.awt.X11GraphicsDevice");
					X11SunJDKReflection.x11GraphicsDeviceGetScreenMethod = X11SunJDKReflection.x11GraphicsDeviceClass.getDeclaredMethod("getScreen");
					X11SunJDKReflection.x11GraphicsDeviceGetScreenMethod.setAccessible(true);
					X11SunJDKReflection.x11GraphicsConfigClass = Class.forName("sun.awt.X11GraphicsConfig");
					X11SunJDKReflection.x11GraphicsConfigGetVisualMethod = X11SunJDKReflection.x11GraphicsConfigClass.getDeclaredMethod("getVisual");
					X11SunJDKReflection.x11GraphicsConfigGetVisualMethod.setAccessible(true);
					X11SunJDKReflection.initted = true;
				} catch (Exception var2) {
				}
				return null;
			}
		});
	}
}
