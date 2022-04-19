package com.sun.opengl.impl.macosx;

import com.sun.gluegen.runtime.BufferFactory;
import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

public abstract class JAWT_MacOSXDrawingSurfaceInfo implements JAWT_PlatformInfo {

	StructAccessor accessor;

	public static int size() {
		return CPU.is32Bit() ? JAWT_MacOSXDrawingSurfaceInfo32.size() : JAWT_MacOSXDrawingSurfaceInfo64.size();
	}

	public static JAWT_MacOSXDrawingSurfaceInfo create() {
		return create(BufferFactory.newDirectByteBuffer(size()));
	}

	public static JAWT_MacOSXDrawingSurfaceInfo create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new JAWT_MacOSXDrawingSurfaceInfo32(arg0) : new JAWT_MacOSXDrawingSurfaceInfo64(arg0);
	}

	JAWT_MacOSXDrawingSurfaceInfo(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public abstract long cocoaViewRef();
}
