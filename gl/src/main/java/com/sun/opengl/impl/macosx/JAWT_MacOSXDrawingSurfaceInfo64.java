package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

class JAWT_MacOSXDrawingSurfaceInfo64 extends JAWT_MacOSXDrawingSurfaceInfo implements JAWT_PlatformInfo {

	public static int size() {
		return 8;
	}

	JAWT_MacOSXDrawingSurfaceInfo64(ByteBuffer arg0) {
		super(arg0);
	}

	public long cocoaViewRef() {
		return this.accessor.getLongAt(0);
	}
}
