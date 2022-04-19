package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.GLDrawableFactoryImpl;
import java.awt.Component;
import javax.media.opengl.DefaultGLCapabilitiesChooser;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLDrawable;

public class MacOSXGLDrawableFactory extends GLDrawableFactoryImpl {

	public GLDrawable getGLDrawable(Object arg0, GLCapabilities arg1, GLCapabilitiesChooser arg2) {
		if (arg0 == null) {
			throw new IllegalArgumentException("Null target");
		} else if (arg0 instanceof Component) {
			if (arg1 == null) {
				arg1 = new GLCapabilities();
			}
			if (arg2 == null) {
				arg2 = new DefaultGLCapabilitiesChooser();
			}
			return new MacOSXOnscreenGLDrawable((Component) arg0, arg1, arg2);
		} else {
			throw new IllegalArgumentException("GLDrawables not supported for objects of type " + arg0.getClass().getName() + " (only Components are supported in this implementation)");
		}
	}

	public long dynamicLookupFunction(String arg0) {
		return CGL.getProcAddress(arg0);
	}
}
