package com.sun.opengl.impl;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLDrawable;

public abstract class GLDrawableImpl implements GLDrawable {

	private GLCapabilities chosenCapabilities;

	public static String toHexString(long arg0) {
		return GLContextImpl.toHexString(arg0);
	}

	public GLCapabilities getChosenGLCapabilities() {
		return this.chosenCapabilities == null ? null : (GLCapabilities) this.chosenCapabilities.clone();
	}

	public void setChosenGLCapabilities(GLCapabilities arg0) {
		this.chosenCapabilities = arg0;
	}
}
