package javax.media.opengl;

public interface GLDrawable {

	GLContext createContext(GLContext arg0);

	void setRealized(boolean arg0);

	void swapBuffers() throws GLException;
}
