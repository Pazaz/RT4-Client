package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

class JAWT_Win32DrawingSurfaceInfo32 extends JAWT_Win32DrawingSurfaceInfo implements JAWT_PlatformInfo {

	public static int size() {
		return 12;
	}

	JAWT_Win32DrawingSurfaceInfo32(ByteBuffer arg0) {
		super(arg0);
	}

	public long hdc() {
		return (long) this.accessor.getIntAt(1);
	}
}
