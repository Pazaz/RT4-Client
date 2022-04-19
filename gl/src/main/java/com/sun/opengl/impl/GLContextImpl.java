package com.sun.opengl.impl;

import com.sun.gluegen.runtime.ProcAddressHelper;
import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

public abstract class GLContextImpl extends GLContext {

	protected FunctionAvailabilityCache functionAvailability = new FunctionAvailabilityCache(this);

	private GLProcAddressTable glProcAddressTable;

	protected GL gl;

	public GLContextImpl() {
		this.setGL(this.createGL());
	}

	public int makeCurrent() throws GLException {
		GLContext var1 = getCurrent();
		if (var1 == this) {
			this.update();
			return 1;
		}
		if (var1 != null) {
			var1.release();
		}
		int var2 = this.makeCurrentImpl();
		if (var2 != 0) {
			setCurrent(this);
		}
		return var2;
	}

	protected abstract int makeCurrentImpl() throws GLException;

	public void release() throws GLException {
		setCurrent(null);
		this.releaseImpl();
	}

	protected abstract void releaseImpl() throws GLException;

	public void destroy() {
		this.destroyImpl();
	}

	protected abstract void destroyImpl() throws GLException;

	protected void update() throws GLException {
	}

	public GL getGL() {
		return this.gl;
	}

	public void setGL(GL arg0) {
		this.gl = arg0;
	}

	protected GL createGL() {
		return new GLImpl(this);
	}

	public GLProcAddressTable getGLProcAddressTable() {
		if (this.glProcAddressTable == null) {
			this.glProcAddressTable = new GLProcAddressTable();
		}
		return this.glProcAddressTable;
	}

	public abstract void setSwapInterval(int arg0);

	protected abstract String mapToRealGLExtensionName(String arg0);

	public abstract String getPlatformExtensionsString();

	protected void resetProcAddressTable(Object arg0) {
		ProcAddressHelper.resetProcAddressTable(arg0, GLDrawableFactoryImpl.getFactoryImpl());
	}

	protected void resetGLFunctionAvailability() {
		this.setGL(this.createGL());
		this.functionAvailability.flush();
		this.resetProcAddressTable(this.getGLProcAddressTable());
	}

	public boolean isExtensionAvailable(String arg0) {
		return this.functionAvailability.isExtensionAvailable(this.mapToRealGLExtensionName(arg0));
	}

	public static String toHexString(long arg0) {
		return "0x" + Long.toHexString(arg0);
	}
}
