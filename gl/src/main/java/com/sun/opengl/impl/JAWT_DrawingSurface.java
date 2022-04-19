package com.sun.opengl.impl;

import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class JAWT_DrawingSurface {

	StructAccessor accessor;

	public static JAWT_DrawingSurface create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new JAWT_DrawingSurface32(arg0) : new JAWT_DrawingSurface64(arg0);
	}

	JAWT_DrawingSurface(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public ByteBuffer getBuffer() {
		return this.accessor.getBuffer();
	}

	public int Lock() {
		return this.Lock0(this.getBuffer());
	}

	private native int Lock0(ByteBuffer arg0);

	public JAWT_DrawingSurfaceInfo GetDrawingSurfaceInfo() {
		ByteBuffer var1 = this.GetDrawingSurfaceInfo0(this.getBuffer());
		return var1 == null ? null : JAWT_DrawingSurfaceInfo.create(var1.order(ByteOrder.nativeOrder()));
	}

	private native ByteBuffer GetDrawingSurfaceInfo0(ByteBuffer arg0);

	public void FreeDrawingSurfaceInfo(JAWT_DrawingSurfaceInfo arg0) {
		this.FreeDrawingSurfaceInfo0(this.getBuffer(), arg0 == null ? null : arg0.getBuffer());
	}

	private native void FreeDrawingSurfaceInfo0(ByteBuffer arg0, ByteBuffer arg1);

	public void Unlock() {
		this.Unlock0(this.getBuffer());
	}

	private native void Unlock0(ByteBuffer arg0);
}
