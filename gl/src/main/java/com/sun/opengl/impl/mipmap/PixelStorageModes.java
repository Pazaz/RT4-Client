package com.sun.opengl.impl.mipmap;

public class PixelStorageModes {

	private int packAlignment;

	private int packRowLength;

	private int packSkipRows;

	private int packSkipPixels;

	private boolean packLsbFirst;

	private boolean packSwapBytes;

	private int unpackAlignment;

	private int unpackRowLength;

	private int unpackSkipRows;

	private int unpackSkipPixels;

	private boolean unpackLsbFirst;

	private boolean unpackSwapBytes;

	public void setPackAlignment(int arg0) {
		this.packAlignment = arg0;
	}

	public void setPackRowLength(int arg0) {
		this.packRowLength = arg0;
	}

	public void setPackSkipRows(int arg0) {
		this.packSkipRows = arg0;
	}

	public void setPackSkipPixels(int arg0) {
		this.packSkipPixels = arg0;
	}

	public void setPackLsbFirst(boolean arg0) {
		this.packLsbFirst = arg0;
	}

	public void setPackSwapBytes(boolean arg0) {
		this.packSwapBytes = arg0;
	}

	public int getUnpackAlignment() {
		return this.unpackAlignment;
	}

	public void setUnpackAlignment(int arg0) {
		this.unpackAlignment = arg0;
	}

	public int getUnpackRowLength() {
		return this.unpackRowLength;
	}

	public void setUnpackRowLength(int arg0) {
		this.unpackRowLength = arg0;
	}

	public int getUnpackSkipRows() {
		return this.unpackSkipRows;
	}

	public void setUnpackSkipRows(int arg0) {
		this.unpackSkipRows = arg0;
	}

	public int getUnpackSkipPixels() {
		return this.unpackSkipPixels;
	}

	public void setUnpackSkipPixels(int arg0) {
		this.unpackSkipPixels = arg0;
	}

	public boolean getUnpackLsbFirst() {
		return this.unpackLsbFirst;
	}

	public void setUnpackLsbFirst(boolean arg0) {
		this.unpackLsbFirst = arg0;
	}

	public boolean getUnpackSwapBytes() {
		return this.unpackSwapBytes;
	}

	public void setUnpackSwapBytes(boolean arg0) {
		this.unpackSwapBytes = arg0;
	}
}
