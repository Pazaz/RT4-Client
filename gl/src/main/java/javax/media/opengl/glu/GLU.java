package javax.media.opengl.glu;

import com.sun.opengl.impl.mipmap.Mipmap;
import com.sun.opengl.util.BufferUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

public class GLU {

	public static GL getCurrentGL() throws GLException {
		GLContext var0 = GLContext.getCurrent();
		if (var0 == null) {
			throw new GLException("No OpenGL context current on this thread");
		}
		return var0.getGL();
	}

	private ByteBuffer copyToByteBuffer(Buffer arg0) {
		if (arg0 instanceof ByteBuffer) {
			return arg0.position() == 0 ? (ByteBuffer) arg0 : BufferUtil.copyByteBuffer((ByteBuffer) arg0);
		} else if (arg0 instanceof ShortBuffer) {
			return BufferUtil.copyShortBufferAsByteBuffer((ShortBuffer) arg0);
		} else if (arg0 instanceof IntBuffer) {
			return BufferUtil.copyIntBufferAsByteBuffer((IntBuffer) arg0);
		} else if (arg0 instanceof FloatBuffer) {
			return BufferUtil.copyFloatBufferAsByteBuffer((FloatBuffer) arg0);
		} else {
			throw new IllegalArgumentException("Unsupported buffer type (must be one of byte, short, int, or float)");
		}
	}

	public int gluBuild2DMipmaps(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Buffer arg6) {
		ByteBuffer var8 = this.copyToByteBuffer(arg6);
		return Mipmap.gluBuild2DMipmaps(getCurrentGL(), arg0, arg1, arg2, arg3, arg4, arg5, var8);
	}
}
