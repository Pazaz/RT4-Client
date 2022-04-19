package javax.media.opengl;

public abstract class GLContext {

	private static GLContext currentContext;

	public abstract int makeCurrent() throws GLException;

	public abstract void release() throws GLException;

	public static GLContext getCurrent() {
		return currentContext;
	}

	protected static void setCurrent(GLContext arg0) {
		currentContext = arg0;
	}

	public abstract void destroy();

	public abstract GL getGL();
}
