package com.sun.opengl.impl;

import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;

public abstract class JAWT_DrawingSurfaceInfo {

	StructAccessor accessor;

	private static Method platformInfoFactoryMethod;

	public static JAWT_DrawingSurfaceInfo create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new JAWT_DrawingSurfaceInfo32(arg0) : new JAWT_DrawingSurfaceInfo64(arg0);
	}

	JAWT_DrawingSurfaceInfo(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public ByteBuffer getBuffer() {
		return this.accessor.getBuffer();
	}

	public JAWT_PlatformInfo platformInfo() {
		return newPlatformInfo(this.platformInfo0(this.getBuffer()));
	}

	private native ByteBuffer platformInfo0(Buffer arg0);

	private static JAWT_PlatformInfo newPlatformInfo(ByteBuffer arg0) {
		if (platformInfoFactoryMethod == null) {
			String var1 = (String) AccessController.doPrivileged(new PrivilegedAction() {

				public Object run() {
					return System.getProperty("os.name").toLowerCase();
				}
			});
			try {
				Class var2;
				if (var1.startsWith("wind")) {
					var2 = Class.forName("com.sun.opengl.impl.windows.JAWT_Win32DrawingSurfaceInfo");
				} else if (var1.startsWith("mac os x")) {
					var2 = Class.forName("com.sun.opengl.impl.macosx.JAWT_MacOSXDrawingSurfaceInfo");
				} else {
					var2 = Class.forName("com.sun.opengl.impl.x11.JAWT_X11DrawingSurfaceInfo");
				}
				platformInfoFactoryMethod = var2.getMethod("create", ByteBuffer.class);
			} catch (Exception var4) {
				throw new RuntimeException(var4);
			}
		}
		try {
			return (JAWT_PlatformInfo) platformInfoFactoryMethod.invoke(null, arg0);
		} catch (Exception var3) {
			throw new RuntimeException(var3);
		}
	}
}
