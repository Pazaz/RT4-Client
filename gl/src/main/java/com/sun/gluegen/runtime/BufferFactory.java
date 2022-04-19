package com.sun.gluegen.runtime;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class BufferFactory {

	public static ByteBuffer newDirectByteBuffer(int arg0) {
		ByteBuffer var1 = ByteBuffer.allocateDirect(arg0);
		var1.order(ByteOrder.nativeOrder());
		return var1;
	}

	public static boolean isDirect(Buffer arg0) {
		if (arg0 == null) {
			return true;
		} else if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).isDirect();
		} else if (arg0 instanceof FloatBuffer) {
			return ((FloatBuffer) arg0).isDirect();
		} else if (arg0 instanceof DoubleBuffer) {
			return ((DoubleBuffer) arg0).isDirect();
		} else if (arg0 instanceof CharBuffer) {
			return ((CharBuffer) arg0).isDirect();
		} else if (arg0 instanceof ShortBuffer) {
			return ((ShortBuffer) arg0).isDirect();
		} else if (arg0 instanceof IntBuffer) {
			return ((IntBuffer) arg0).isDirect();
		} else if (arg0 instanceof LongBuffer) {
			return ((LongBuffer) arg0).isDirect();
		} else {
			throw new RuntimeException("Unexpected buffer type " + arg0.getClass().getName());
		}
	}

	public static int getDirectBufferByteOffset(Buffer arg0) {
		if (arg0 == null) {
			return 0;
		} else if (arg0 instanceof ByteBuffer) {
			return arg0.position();
		} else if (arg0 instanceof FloatBuffer) {
			return arg0.position() * 4;
		} else if (arg0 instanceof IntBuffer) {
			return arg0.position() * 4;
		} else if (arg0 instanceof ShortBuffer) {
			return arg0.position() * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			return arg0.position() * 8;
		} else if (arg0 instanceof LongBuffer) {
			return arg0.position() * 8;
		} else if (arg0 instanceof CharBuffer) {
			return arg0.position() * 2;
		} else {
			throw new RuntimeException("Disallowed array backing store type in buffer " + arg0.getClass().getName());
		}
	}

	public static Object getArray(Buffer arg0) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).array();
		} else if (arg0 instanceof FloatBuffer) {
			return ((FloatBuffer) arg0).array();
		} else if (arg0 instanceof IntBuffer) {
			return ((IntBuffer) arg0).array();
		} else if (arg0 instanceof ShortBuffer) {
			return ((ShortBuffer) arg0).array();
		} else if (arg0 instanceof DoubleBuffer) {
			return ((DoubleBuffer) arg0).array();
		} else if (arg0 instanceof LongBuffer) {
			return ((LongBuffer) arg0).array();
		} else if (arg0 instanceof CharBuffer) {
			return ((CharBuffer) arg0).array();
		} else {
			throw new RuntimeException("Disallowed array backing store type in buffer " + arg0.getClass().getName());
		}
	}

	public static int getIndirectBufferByteOffset(Buffer arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var1 = arg0.position();
		if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).arrayOffset() + var1;
		} else if (arg0 instanceof FloatBuffer) {
			return (((FloatBuffer) arg0).arrayOffset() + var1) * 4;
		} else if (arg0 instanceof IntBuffer) {
			return (((IntBuffer) arg0).arrayOffset() + var1) * 4;
		} else if (arg0 instanceof ShortBuffer) {
			return (((ShortBuffer) arg0).arrayOffset() + var1) * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			return (((DoubleBuffer) arg0).arrayOffset() + var1) * 8;
		} else if (arg0 instanceof LongBuffer) {
			return (((LongBuffer) arg0).arrayOffset() + var1) * 8;
		} else if (arg0 instanceof CharBuffer) {
			return (((CharBuffer) arg0).arrayOffset() + var1) * 2;
		} else {
			throw new RuntimeException("Unknown buffer type " + arg0.getClass().getName());
		}
	}

	public static void rangeCheck(int[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length < arg1 + arg2) {
			throw new ArrayIndexOutOfBoundsException("Required " + arg2 + " elements in array, only had " + (arg0.length - arg1));
		}
	}

	public static void rangeCheck(Buffer arg0, int arg1) {
		if (arg0 != null && arg0.remaining() < arg1) {
			throw new IndexOutOfBoundsException("Required " + arg1 + " remaining elements in buffer, only had " + arg0.remaining());
		}
	}

	public static void rangeCheckBytes(Buffer arg0, int arg1) {
		if (arg0 == null) {
			return;
		}
		int var2 = arg0.remaining();
		int var3 = 0;
		if (arg0 instanceof ByteBuffer) {
			var3 = var2;
		} else if (arg0 instanceof FloatBuffer) {
			var3 = var2 * 4;
		} else if (arg0 instanceof IntBuffer) {
			var3 = var2 * 4;
		} else if (arg0 instanceof ShortBuffer) {
			var3 = var2 * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			var3 = var2 * 8;
		} else if (arg0 instanceof LongBuffer) {
			var3 = var2 * 8;
		} else if (arg0 instanceof CharBuffer) {
			var3 = var2 * 2;
		}
		if (var3 < arg1) {
			throw new IndexOutOfBoundsException("Required " + arg1 + " remaining bytes in buffer, only had " + var3);
		}
	}
}
