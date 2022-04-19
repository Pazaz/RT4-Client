package com.sun.opengl.impl.windows;

import com.sun.gluegen.runtime.BufferFactory;
import com.sun.gluegen.runtime.CPU;
import com.sun.gluegen.runtime.StructAccessor;
import java.nio.ByteBuffer;

public abstract class PIXELFORMATDESCRIPTOR {

	StructAccessor accessor;

	public static int size() {
		return CPU.is32Bit() ? PIXELFORMATDESCRIPTOR32.size() : PIXELFORMATDESCRIPTOR64.size();
	}

	public static PIXELFORMATDESCRIPTOR create() {
		return create(BufferFactory.newDirectByteBuffer(size()));
	}

	public static PIXELFORMATDESCRIPTOR create(ByteBuffer arg0) {
		return CPU.is32Bit() ? new PIXELFORMATDESCRIPTOR32(arg0) : new PIXELFORMATDESCRIPTOR64(arg0);
	}

	PIXELFORMATDESCRIPTOR(ByteBuffer arg0) {
		this.accessor = new StructAccessor(arg0);
	}

	public ByteBuffer getBuffer() {
		return this.accessor.getBuffer();
	}

	public abstract PIXELFORMATDESCRIPTOR nSize(short arg0);

	public abstract PIXELFORMATDESCRIPTOR nVersion(short arg0);

	public abstract PIXELFORMATDESCRIPTOR dwFlags(int arg0);

	public abstract int dwFlags();

	public abstract PIXELFORMATDESCRIPTOR iPixelType(byte arg0);

	public abstract PIXELFORMATDESCRIPTOR cColorBits(byte arg0);

	public abstract PIXELFORMATDESCRIPTOR cRedBits(byte arg0);

	public abstract byte cRedBits();

	public abstract PIXELFORMATDESCRIPTOR cGreenBits(byte arg0);

	public abstract byte cGreenBits();

	public abstract PIXELFORMATDESCRIPTOR cBlueBits(byte arg0);

	public abstract byte cBlueBits();

	public abstract PIXELFORMATDESCRIPTOR cAlphaBits(byte arg0);

	public abstract byte cAlphaBits();

	public abstract PIXELFORMATDESCRIPTOR cAccumBits(byte arg0);

	public abstract PIXELFORMATDESCRIPTOR cAccumRedBits(byte arg0);

	public abstract byte cAccumRedBits();

	public abstract PIXELFORMATDESCRIPTOR cAccumGreenBits(byte arg0);

	public abstract byte cAccumGreenBits();

	public abstract PIXELFORMATDESCRIPTOR cAccumBlueBits(byte arg0);

	public abstract byte cAccumBlueBits();

	public abstract PIXELFORMATDESCRIPTOR cAccumAlphaBits(byte arg0);

	public abstract byte cAccumAlphaBits();

	public abstract PIXELFORMATDESCRIPTOR cDepthBits(byte arg0);

	public abstract byte cDepthBits();

	public abstract PIXELFORMATDESCRIPTOR cStencilBits(byte arg0);

	public abstract byte cStencilBits();

	public abstract PIXELFORMATDESCRIPTOR iLayerType(byte arg0);
}
