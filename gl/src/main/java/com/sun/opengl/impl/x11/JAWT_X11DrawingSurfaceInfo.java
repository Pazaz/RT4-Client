package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.BufferFactory;
import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

public abstract class JAWT_X11DrawingSurfaceInfo implements JAWT_PlatformInfo {

	StructAccessor accessor;

	public static int size() {
		return CPU.is32Bit() ? JAWT_X11DrawingSurfaceInfo32.size() : JAWT_X11DrawingSurfaceInfo64.size();
	}

	public static JAWT_X11DrawingSurfaceInfo create() {
		return create(BufferFactory.newDirectByteBuffer(size()));
	}

	public static JAWT_X11DrawingSurfaceInfo create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new JAWT_X11DrawingSurfaceInfo32(arg0) : new JAWT_X11DrawingSurfaceInfo64(arg0);
	}

	JAWT_X11DrawingSurfaceInfo(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public abstract long drawable();

	public abstract long display();

	public abstract long visualID();
}
