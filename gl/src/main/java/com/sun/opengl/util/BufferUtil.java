package com.sun.opengl.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class BufferUtil {

	public static ByteBuffer newByteBuffer(int arg0) {
		ByteBuffer var1 = ByteBuffer.allocateDirect(arg0);
		var1.order(ByteOrder.nativeOrder());
		return var1;
	}

	public static ByteBuffer copyByteBuffer(ByteBuffer arg0) {
		ByteBuffer var1 = newByteBuffer(arg0.remaining());
		arg0.mark();
		var1.put(arg0);
		arg0.reset();
		var1.rewind();
		return var1;
	}

	public static ByteBuffer copyFloatBufferAsByteBuffer(FloatBuffer arg0) {
		ByteBuffer var1 = newByteBuffer(arg0.remaining() * 4);
		arg0.mark();
		var1.asFloatBuffer().put(arg0);
		arg0.reset();
		var1.rewind();
		return var1;
	}

	public static ByteBuffer copyIntBufferAsByteBuffer(IntBuffer arg0) {
		ByteBuffer var1 = newByteBuffer(arg0.remaining() * 4);
		arg0.mark();
		var1.asIntBuffer().put(arg0);
		arg0.reset();
		var1.rewind();
		return var1;
	}

	public static ByteBuffer copyShortBufferAsByteBuffer(ShortBuffer arg0) {
		ByteBuffer var1 = newByteBuffer(arg0.remaining() * 2);
		arg0.mark();
		var1.asShortBuffer().put(arg0);
		arg0.reset();
		var1.rewind();
		return var1;
	}
}
