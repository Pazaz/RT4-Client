package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

class JAWT_MacOSXDrawingSurfaceInfo32 extends JAWT_MacOSXDrawingSurfaceInfo implements JAWT_PlatformInfo {

	public static int size() {
		return 4;
	}

	JAWT_MacOSXDrawingSurfaceInfo32(ByteBuffer arg0) {
		super(arg0);
	}

	public long cocoaViewRef() {
		return (long) this.accessor.getIntAt(0);
	}
}
