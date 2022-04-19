package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;

class PIXELFORMATDESCRIPTOR64 extends PIXELFORMATDESCRIPTOR {

	public static int size() {
		return 40;
	}

	PIXELFORMATDESCRIPTOR64(ByteBuffer arg0) {
		super(arg0);
	}

	public PIXELFORMATDESCRIPTOR nSize(short arg0) {
		this.accessor.setShortAt(0, arg0);
		return this;
	}

	public PIXELFORMATDESCRIPTOR nVersion(short arg0) {
		this.accessor.setShortAt(1, arg0);
		return this;
	}

	public PIXELFORMATDESCRIPTOR dwFlags(int arg0) {
		this.accessor.setIntAt(1, arg0);
		return this;
	}

	public int dwFlags() {
		return this.accessor.getIntAt(1);
	}

	public PIXELFORMATDESCRIPTOR iPixelType(byte arg0) {
		this.accessor.setByteAt(8, arg0);
		return this;
	}

	public PIXELFORMATDESCRIPTOR cColorBits(byte arg0) {
		this.accessor.setByteAt(9, arg0);
		return this;
	}

	public PIXELFORMATDESCRIPTOR cRedBits(byte arg0) {
		this.accessor.setByteAt(10, arg0);
		return this;
	}

	public byte cRedBits() {
		return this.accessor.getByteAt(10);
	}

	public PIXELFORMATDESCRIPTOR cGreenBits(byte arg0) {
		this.accessor.setByteAt(12, arg0);
		return this;
	}

	public byte cGreenBits() {
		return this.accessor.getByteAt(12);
	}

	public PIXELFORMATDESCRIPTOR cBlueBits(byte arg0) {
		this.accessor.setByteAt(14, arg0);
		return this;
	}

	public byte cBlueBits() {
		return this.accessor.getByteAt(14);
	}

	public PIXELFORMATDESCRIPTOR cAlphaBits(byte arg0) {
		this.accessor.setByteAt(16, arg0);
		return this;
	}

	public byte cAlphaBits() {
		return this.accessor.getByteAt(16);
	}

	public PIXELFORMATDESCRIPTOR cAccumBits(byte arg0) {
		this.accessor.setByteAt(18, arg0);
		return this;
	}

	public PIXELFORMATDESCRIPTOR cAccumRedBits(byte arg0) {
		this.accessor.setByteAt(19, arg0);
		return this;
	}

	public byte cAccumRedBits() {
		return this.accessor.getByteAt(19);
	}

	public PIXELFORMATDESCRIPTOR cAccumGreenBits(byte arg0) {
		this.accessor.setByteAt(20, arg0);
		return this;
	}

	public byte cAccumGreenBits() {
		return this.accessor.getByteAt(20);
	}

	public PIXELFORMATDESCRIPTOR cAccumBlueBits(byte arg0) {
		this.accessor.setByteAt(21, arg0);
		return this;
	}

	public byte cAccumBlueBits() {
		return this.accessor.getByteAt(21);
	}

	public PIXELFORMATDESCRIPTOR cAccumAlphaBits(byte arg0) {
		this.accessor.setByteAt(22, arg0);
		return this;
	}

	public byte cAccumAlphaBits() {
		return this.accessor.getByteAt(22);
	}

	public PIXELFORMATDESCRIPTOR cDepthBits(byte arg0) {
		this.accessor.setByteAt(23, arg0);
		return this;
	}

	public byte cDepthBits() {
		return this.accessor.getByteAt(23);
	}

	public PIXELFORMATDESCRIPTOR cStencilBits(byte arg0) {
		this.accessor.setByteAt(24, arg0);
		return this;
	}

	public byte cStencilBits() {
		return this.accessor.getByteAt(24);
	}

	public PIXELFORMATDESCRIPTOR iLayerType(byte arg0) {
		this.accessor.setByteAt(26, arg0);
		return this;
	}
}
