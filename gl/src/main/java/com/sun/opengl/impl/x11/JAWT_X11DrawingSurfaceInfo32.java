package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

class JAWT_X11DrawingSurfaceInfo32 extends JAWT_X11DrawingSurfaceInfo implements JAWT_PlatformInfo {

	public static int size() {
		return 24;
	}

	JAWT_X11DrawingSurfaceInfo32(ByteBuffer arg0) {
		super(arg0);
	}

	public long drawable() {
		return (long) this.accessor.getIntAt(0);
	}

	public long display() {
		return (long) this.accessor.getIntAt(1);
	}

	public long visualID() {
		return (long) this.accessor.getIntAt(2);
	}
}
