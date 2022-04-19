package javax.media.opengl;

import com.sun.opengl.impl.macosx.MacOSXGLDrawableFactory;
import com.sun.opengl.impl.windows.WindowsGLDrawableFactory;
import com.sun.opengl.impl.x11.X11GLDrawableFactory;

public abstract class GLDrawableFactory {

	private static GLDrawableFactory factory;

	public static GLDrawableFactory getFactory() {
		if (factory == null) {
			String var0 = System.getProperty("os.name").toLowerCase();
			if (var0.startsWith("win")) {
				factory = new WindowsGLDrawableFactory();
			}
			if (var0.startsWith("mac")) {
				factory = new MacOSXGLDrawableFactory();
			}
			if (var0.startsWith("linux") || var0.startsWith("sunos")) {
				factory = new X11GLDrawableFactory();
			}
		}
		return factory;
	}

	public abstract GLDrawable getGLDrawable(Object arg0, GLCapabilities arg1, GLCapabilitiesChooser arg2) throws IllegalArgumentException, GLException;
}
