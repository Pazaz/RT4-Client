package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.GLDrawableImpl;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLException;

public abstract class MacOSXGLDrawable extends GLDrawableImpl {

	protected GLCapabilities capabilities;

	protected GLCapabilitiesChooser chooser;

	public MacOSXGLDrawable(GLCapabilities arg0, GLCapabilitiesChooser arg1) {
		this.capabilities = (GLCapabilities) arg0.clone();
		this.chooser = arg1;
	}

	public abstract void setRealized(boolean arg0);

	public abstract void swapBuffers();

	public abstract long getView();

	public GLCapabilities getCapabilities() {
		byte var1 = 1;
		GLCapabilities[] var2 = new GLCapabilities[var1];
		var2[0] = this.capabilities;
		int var3 = this.chooser.chooseCapabilities(this.capabilities, var2, 0);
		if (var3 < 0 || var3 >= var1) {
			throw new GLException("Invalid result " + var3 + " from GLCapabilitiesChooser (should be between 0 and " + (var1 - 1) + ")");
		}
		return var2[var3];
	}
}
