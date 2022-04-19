package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

class JAWT_X11DrawingSurfaceInfo64 extends JAWT_X11DrawingSurfaceInfo implements JAWT_PlatformInfo {

	public static int size() {
		return 48;
	}

	JAWT_X11DrawingSurfaceInfo64(ByteBuffer arg0) {
		super(arg0);
	}

	public long drawable() {
		return this.accessor.getLongAt(0);
	}

	public long display() {
		return this.accessor.getLongAt(1);
	}

	public long visualID() {
		return this.accessor.getLongAt(2);
	}
}
