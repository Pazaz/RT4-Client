package com.sun.gluegen.runtime;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class StructAccessor {

	private ByteBuffer bb;

	private IntBuffer ib;

	private LongBuffer lb;

	private ShortBuffer sb;

	public StructAccessor(ByteBuffer arg0) {
		this.bb = arg0.order(ByteOrder.nativeOrder());
	}

	public ByteBuffer getBuffer() {
		return this.bb;
	}

	public byte getByteAt(int arg0) {
		return this.bb.get(arg0);
	}

	public void setByteAt(int arg0, byte arg1) {
		this.bb.put(arg0, arg1);
	}

	public int getIntAt(int arg0) {
		return this.intBuffer().get(arg0);
	}

	public void setIntAt(int arg0, int arg1) {
		this.intBuffer().put(arg0, arg1);
	}

	public long getLongAt(int arg0) {
		return this.longBuffer().get(arg0);
	}

	public void setLongAt(int arg0, long arg1) {
		this.longBuffer().put(arg0, arg1);
	}

	public void setShortAt(int arg0, short arg1) {
		this.shortBuffer().put(arg0, arg1);
	}

	private IntBuffer intBuffer() {
		if (this.ib == null) {
			this.ib = this.bb.asIntBuffer();
		}
		return this.ib;
	}

	private LongBuffer longBuffer() {
		if (this.lb == null) {
			this.lb = this.bb.asLongBuffer();
		}
		return this.lb;
	}

	private ShortBuffer shortBuffer() {
		if (this.sb == null) {
			this.sb = this.bb.asShortBuffer();
		}
		return this.sb;
	}
}
