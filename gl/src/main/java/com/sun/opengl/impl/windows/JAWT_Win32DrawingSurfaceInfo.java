package com.sun.opengl.impl.windows;

import com.sun.gluegen.runtime.BufferFactory;
import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import com.sun.opengl.impl.JAWT_PlatformInfo;
import java.nio.ByteBuffer;

public abstract class JAWT_Win32DrawingSurfaceInfo implements JAWT_PlatformInfo {

	StructAccessor accessor;

	public static int size() {
		return CPU.is32Bit() ? JAWT_Win32DrawingSurfaceInfo32.size() : JAWT_Win32DrawingSurfaceInfo64.size();
	}

	public static JAWT_Win32DrawingSurfaceInfo create() {
		return create(BufferFactory.newDirectByteBuffer(size()));
	}

	public static JAWT_Win32DrawingSurfaceInfo create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new JAWT_Win32DrawingSurfaceInfo32(arg0) : new JAWT_Win32DrawingSurfaceInfo64(arg0);
	}

	JAWT_Win32DrawingSurfaceInfo(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public abstract long hdc();
}
