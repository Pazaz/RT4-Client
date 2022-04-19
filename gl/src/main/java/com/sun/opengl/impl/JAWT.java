package com.sun.opengl.impl;

import com.sun.gluegen.runtime.BufferFactory;
import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedAction;

public abstract class JAWT {

	StructAccessor accessor;

	private static volatile JAWT jawt;

	public static int size() {
		return CPU.is32Bit() ? JAWT32.size() : JAWT64.size();
	}

	public static JAWT create() {
		return create(BufferFactory.newDirectByteBuffer(size()));
	}

	public static JAWT create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new JAWT32(arg0) : new JAWT64(arg0);
	}

	JAWT(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public ByteBuffer getBuffer() {
		return this.accessor.getBuffer();
	}

	public abstract JAWT version(int arg0);

	public JAWT_DrawingSurface GetDrawingSurface(Object arg0) {
		ByteBuffer var2 = this.GetDrawingSurface0(this.getBuffer(), arg0);
		return var2 == null ? null : JAWT_DrawingSurface.create(var2.order(ByteOrder.nativeOrder()));
	}

	private native ByteBuffer GetDrawingSurface0(ByteBuffer arg0, Object arg1);

	public void FreeDrawingSurface(JAWT_DrawingSurface arg0) {
		this.FreeDrawingSurface0(this.getBuffer(), arg0 == null ? null : arg0.getBuffer());
	}

	private native void FreeDrawingSurface0(ByteBuffer arg0, ByteBuffer arg1);

	public void Lock() {
		this.Lock0(this.getBuffer());
	}

	private native void Lock0(ByteBuffer arg0);

	public void Unlock() {
		this.Unlock0(this.getBuffer());
	}

	private native void Unlock0(ByteBuffer arg0);

	public static JAWT getJAWT() {
		if (jawt == null) {
			synchronized (JAWT.class) {
				if (jawt == null) {
					AccessController.doPrivileged(new PrivilegedAction() {

						public Object run() {
							JAWT var1 = JAWT.create();
							var1.version(65540);
							if (!JAWTFactory.JAWT_GetAWT(var1)) {
								throw new RuntimeException("Unable to initialize JAWT");
							}
							JAWT.jawt = var1;
							return null;
						}
					});
				}
			}
		}
		return jawt;
	}
}
