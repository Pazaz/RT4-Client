package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.BufferFactory;
import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import java.nio.ByteBuffer;

public abstract class XVisualInfo {

	StructAccessor accessor;

	public static int size() {
		return CPU.is32Bit() ? XVisualInfo32.size() : XVisualInfo64.size();
	}

	public static XVisualInfo create() {
		return create(BufferFactory.newDirectByteBuffer(size()));
	}

	public static XVisualInfo create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new XVisualInfo32(arg0) : new XVisualInfo64(arg0);
	}

	XVisualInfo(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public ByteBuffer getBuffer() {
		return this.accessor.getBuffer();
	}

	public abstract XVisualInfo visualid(long arg0);

	public abstract XVisualInfo screen(int arg0);
}
