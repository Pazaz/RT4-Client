package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public class Type_Widget {

	ByteBuffer buffer = ByteBuffer.allocate(4);

	public void setUB0(byte arg0) {
		this.buffer.position(0);
		this.buffer.put(arg0);
	}

	public void setUB1(byte arg0) {
		this.buffer.position(1);
		this.buffer.put(arg0);
	}

	public void setUB2(byte arg0) {
		this.buffer.position(2);
		this.buffer.put(arg0);
	}

	public void setUB3(byte arg0) {
		this.buffer.position(3);
		this.buffer.put(arg0);
	}

	public short getUS0() {
		this.buffer.position(0);
		return this.buffer.getShort();
	}

	public int getUI() {
		this.buffer.position(0);
		return this.buffer.getInt();
	}

	public short getS0() {
		this.buffer.position(0);
		return this.buffer.getShort();
	}

	public int getI() {
		this.buffer.position(0);
		return this.buffer.getInt();
	}

	public float getF() {
		this.buffer.position(0);
		return this.buffer.getFloat();
	}
}
