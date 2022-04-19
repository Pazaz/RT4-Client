package com.sun.opengl.impl;

import com.sun.gluegen.runtime.DynamicLookupHelper;
import javax.media.opengl.GLDrawableFactory;

public abstract class GLDrawableFactoryImpl extends GLDrawableFactory implements DynamicLookupHelper {

	public abstract long dynamicLookupFunction(String arg0);

	public static GLDrawableFactoryImpl getFactoryImpl() {
		return (GLDrawableFactoryImpl) getFactory();
	}
}
