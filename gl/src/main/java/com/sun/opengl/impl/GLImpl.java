package com.sun.opengl.impl;

import com.sun.gluegen.runtime.BufferFactory;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GL;
import javax.media.opengl.GLException;

public class GLImpl implements GL {

	private boolean inBeginEndPair;

	private GLContextImpl _context;

	private boolean bufferObjectExtensionsInitialized = false;

	private boolean haveARBPixelBufferObject;

	private boolean haveEXTPixelBufferObject;

	private boolean haveGL15;

	private boolean haveGL21;

	private boolean haveARBVertexBufferObject;

	private Map arbVBOCache = new HashMap();

	public void glActiveTexture(int arg0) {
		long var2 = this._context.getGLProcAddressTable()._addressof_glActiveTexture;
		if (var2 == 0L) {
			var2 = this._context.getGLProcAddressTable()._addressof_glActiveTextureARB;
			if (var2 == 0L) {
				throw new GLException("Method \"glActiveTexture\" not available");
			}
		}
		this.dispatch_glActiveTexture0(arg0, var2);
	}

	public native void dispatch_glActiveTexture0(int arg0, long arg1);

	public native void glAlphaFunc(int arg0, float arg1);

	public void glBegin(int arg0) {
		this.inBeginEndPair = true;
		this.glBegin0(arg0);
	}

	private native void glBegin0(int arg0);

	public void glBindBufferARB(int arg0, int arg1) {
		long var3 = this._context.getGLProcAddressTable()._addressof_glBindBufferARB;
		if (var3 == 0L) {
			throw new GLException("Method \"glBindBufferARB\" not available");
		}
		this.dispatch_glBindBufferARB0(arg0, arg1, var3);
	}

	public native void dispatch_glBindBufferARB0(int arg0, int arg1, long arg2);

	public void glBindProgramARB(int arg0, int arg1) {
		long var3 = this._context.getGLProcAddressTable()._addressof_glBindProgramARB;
		if (var3 == 0L) {
			throw new GLException("Method \"glBindProgramARB\" not available");
		}
		this.dispatch_glBindProgramARB0(arg0, arg1, var3);
	}

	public native void dispatch_glBindProgramARB0(int arg0, int arg1, long arg2);

	public native void glBindTexture(int arg0, int arg1);

	public native void glBlendFunc(int arg0, int arg1);

	public void glBufferDataARB(int arg0, int arg1, Buffer arg2, int arg3) {
		boolean var5 = BufferFactory.isDirect(arg2);
		long var6 = this._context.getGLProcAddressTable()._addressof_glBufferDataARB;
		if (var6 == 0L) {
			throw new GLException("Method \"glBufferDataARB\" not available");
		} else if (var5) {
			this.dispatch_glBufferDataARB0(arg0, arg1, arg2, BufferFactory.getDirectBufferByteOffset(arg2), arg3, var6);
		} else {
			this.dispatch_glBufferDataARB1(arg0, arg1, BufferFactory.getArray(arg2), BufferFactory.getIndirectBufferByteOffset(arg2), arg3, var6);
		}
	}

	private native void dispatch_glBufferDataARB0(int arg0, int arg1, Object arg2, int arg3, int arg4, long arg5);

	private native void dispatch_glBufferDataARB1(int arg0, int arg1, Object arg2, int arg3, int arg4, long arg5);

	public void glBufferSubDataARB(int arg0, int arg1, int arg2, Buffer arg3) {
		boolean var5 = BufferFactory.isDirect(arg3);
		long var6 = this._context.getGLProcAddressTable()._addressof_glBufferSubDataARB;
		if (var6 == 0L) {
			throw new GLException("Method \"glBufferSubDataARB\" not available");
		} else if (var5) {
			this.dispatch_glBufferSubDataARB0(arg0, arg1, arg2, arg3, BufferFactory.getDirectBufferByteOffset(arg3), var6);
		} else {
			this.dispatch_glBufferSubDataARB1(arg0, arg1, arg2, BufferFactory.getArray(arg3), BufferFactory.getIndirectBufferByteOffset(arg3), var6);
		}
	}

	private native void dispatch_glBufferSubDataARB0(int arg0, int arg1, int arg2, Object arg3, int arg4, long arg5);

	private native void dispatch_glBufferSubDataARB1(int arg0, int arg1, int arg2, Object arg3, int arg4, long arg5);

	public native void glCallList(int arg0);

	public native void glClear(int arg0);

	public native void glClearColor(float arg0, float arg1, float arg2, float arg3);

	public native void glClearDepth(double arg0);

	public void glClientActiveTexture(int arg0) {
		long var2 = this._context.getGLProcAddressTable()._addressof_glClientActiveTexture;
		if (var2 == 0L) {
			var2 = this._context.getGLProcAddressTable()._addressof_glClientActiveTextureARB;
			if (var2 == 0L) {
				throw new GLException("Method \"glClientActiveTexture\" not available");
			}
		}
		this.dispatch_glClientActiveTexture0(arg0, var2);
	}

	public native void dispatch_glClientActiveTexture0(int arg0, long arg1);

	public native void glColor3ub(byte arg0, byte arg1, byte arg2);

	public native void glColor4f(float arg0, float arg1, float arg2, float arg3);

	private native void glColor4fv1(Object arg0, int arg1);

	public void glColor4fv(float[] arg0, int arg1) {
		if (arg0 != null && arg0.length <= arg1) {
			throw new GLException("array offset argument \"v_offset\" (" + arg1 + ") equals or exceeds array length (" + arg0.length + ")");
		}
		this.glColor4fv1(arg0, arg1 * 4);
	}

	public native void glColor4ub(byte arg0, byte arg1, byte arg2, byte arg3);

	public native void glColorMaterial(int arg0, int arg1);

	public void glColorPointer(int arg0, int arg1, int arg2, Buffer arg3) {
		this.checkArrayVBODisabled();
		BufferFactory.rangeCheck(arg3, 1);
		if (!BufferFactory.isDirect(arg3)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glColorPointer0(arg0, arg1, arg2, arg3, BufferFactory.getDirectBufferByteOffset(arg3));
	}

	private native void glColorPointer0(int arg0, int arg1, int arg2, Object arg3, int arg4);

	public void glColorPointer(int arg0, int arg1, int arg2, long arg3) {
		this.checkArrayVBOEnabled();
		this.glColorPointer0(arg0, arg1, arg2, arg3);
	}

	private native void glColorPointer0(int arg0, int arg1, int arg2, long arg3);

	public native void glCopyPixels(int arg0, int arg1, int arg2, int arg3, int arg4);

	public native void glCullFace(int arg0);

	private native void dispatch_glDeleteBuffersARB1(int arg0, Object arg1, int arg2, long arg3);

	public void glDeleteBuffersARB(int arg0, int[] arg1, int arg2) {
		BufferFactory.rangeCheck(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		long var4 = this._context.getGLProcAddressTable()._addressof_glDeleteBuffersARB;
		if (var4 == 0L) {
			throw new GLException("Method \"glDeleteBuffersARB\" not available");
		}
		this.dispatch_glDeleteBuffersARB1(arg0, arg1, arg2 * 4, var4);
	}

	public void glDeleteLists(int arg0, int arg1) {
		this.glDeleteLists0(arg0, arg1);
	}

	private native void glDeleteLists0(int arg0, int arg1);

	private native void glDeleteTextures1(int arg0, Object arg1, int arg2);

	public void glDeleteTextures(int arg0, int[] arg1, int arg2) {
		BufferFactory.rangeCheck(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"textures_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glDeleteTextures1(arg0, arg1, arg2 * 4);
	}

	public native void glDepthFunc(int arg0);

	public native void glDepthMask(boolean arg0);

	public native void glDisable(int arg0);

	public native void glDisableClientState(int arg0);

	public native void glDrawBuffer(int arg0);

	public void glDrawElements(int arg0, int arg1, int arg2, Buffer arg3) {
		this.checkElementVBODisabled();
		BufferFactory.rangeCheck(arg3, arg1);
		boolean var5 = BufferFactory.isDirect(arg3);
		if (var5) {
			this.glDrawElements0(arg0, arg1, arg2, arg3, BufferFactory.getDirectBufferByteOffset(arg3));
		} else {
			this.glDrawElements1(arg0, arg1, arg2, BufferFactory.getArray(arg3), BufferFactory.getIndirectBufferByteOffset(arg3));
		}
	}

	private native void glDrawElements0(int arg0, int arg1, int arg2, Object arg3, int arg4);

	private native void glDrawElements1(int arg0, int arg1, int arg2, Object arg3, int arg4);

	public void glDrawElements(int arg0, int arg1, int arg2, long arg3) {
		this.checkElementVBOEnabled();
		this.glDrawElements0(arg0, arg1, arg2, arg3);
	}

	private native void glDrawElements0(int arg0, int arg1, int arg2, long arg3);

	public void glDrawPixels(int arg0, int arg1, int arg2, int arg3, Buffer arg4) {
		this.checkUnpackPBODisabled();
		BufferFactory.rangeCheckBytes(arg4, this.imageSizeInBytes(arg2, arg3, arg0, arg1, 1));
		boolean var6 = BufferFactory.isDirect(arg4);
		if (var6) {
			this.glDrawPixels0(arg0, arg1, arg2, arg3, arg4, BufferFactory.getDirectBufferByteOffset(arg4));
		} else {
			this.glDrawPixels1(arg0, arg1, arg2, arg3, BufferFactory.getArray(arg4), BufferFactory.getIndirectBufferByteOffset(arg4));
		}
	}

	private native void glDrawPixels0(int arg0, int arg1, int arg2, int arg3, Object arg4, int arg5);

	private native void glDrawPixels1(int arg0, int arg1, int arg2, int arg3, Object arg4, int arg5);

	public native void glEnable(int arg0);

	public native void glEnableClientState(int arg0);

	public void glEnd() {
		this.glEnd0();
		this.inBeginEndPair = false;
	}

	private native void glEnd0();

	public native void glEndList();

	public native void glFogf(int arg0, float arg1);

	private native void glFogfv1(int arg0, Object arg1, int arg2);

	public void glFogfv(int arg0, float[] arg1, int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glFogfv1(arg0, arg1, arg2 * 4);
	}

	public native void glFogi(int arg0, int arg1);

	private native void dispatch_glGenBuffersARB1(int arg0, Object arg1, int arg2, long arg3);

	public void glGenBuffersARB(int arg0, int[] arg1, int arg2) {
		BufferFactory.rangeCheck(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		long var4 = this._context.getGLProcAddressTable()._addressof_glGenBuffersARB;
		if (var4 == 0L) {
			throw new GLException("Method \"glGenBuffersARB\" not available");
		}
		this.dispatch_glGenBuffersARB1(arg0, arg1, arg2 * 4, var4);
	}

	public int glGenLists(int arg0) {
		return this.glGenLists0(arg0);
	}

	private native int glGenLists0(int arg0);

	private native void dispatch_glGenProgramsARB1(int arg0, Object arg1, int arg2, long arg3);

	public void glGenProgramsARB(int arg0, int[] arg1, int arg2) {
		BufferFactory.rangeCheck(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"ids_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		long var4 = this._context.getGLProcAddressTable()._addressof_glGenProgramsARB;
		if (var4 == 0L) {
			throw new GLException("Method \"glGenProgramsARB\" not available");
		}
		this.dispatch_glGenProgramsARB1(arg0, arg1, arg2 * 4, var4);
	}

	private native void glGenTextures1(int arg0, Object arg1, int arg2);

	public void glGenTextures(int arg0, int[] arg1, int arg2) {
		BufferFactory.rangeCheck(arg1, arg2, arg0);
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"textures_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glGenTextures1(arg0, arg1, arg2 * 4);
	}

	public void glGetFloatv(int arg0, FloatBuffer arg1) {
		boolean var3 = BufferFactory.isDirect(arg1);
		if (var3) {
			this.glGetFloatv0(arg0, arg1, BufferFactory.getDirectBufferByteOffset(arg1));
		} else {
			this.glGetFloatv1(arg0, BufferFactory.getArray(arg1), BufferFactory.getIndirectBufferByteOffset(arg1));
		}
	}

	private native void glGetFloatv0(int arg0, Object arg1, int arg2);

	private native void glGetFloatv1(int arg0, Object arg1, int arg2);

	public void glGetFloatv(int arg0, float[] arg1, int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glGetFloatv1(arg0, arg1, arg2 * 4);
	}

	private native void glGetIntegerv1(int arg0, Object arg1, int arg2);

	public void glGetIntegerv(int arg0, int[] arg1, int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glGetIntegerv1(arg0, arg1, arg2 * 4);
	}

	public native String glGetString(int arg0);

	private native void glGetTexLevelParameteriv1(int arg0, int arg1, int arg2, Object arg3, int arg4);

	public void glGetTexLevelParameteriv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
		if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"params_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
		this.glGetTexLevelParameteriv1(arg0, arg1, arg2, arg3, arg4 * 4);
	}

	public native void glHint(int arg0, int arg1);

	public void glInterleavedArrays(int arg0, int arg1, Buffer arg2) {
		this.checkArrayVBODisabled();
		BufferFactory.rangeCheck(arg2, 1);
		boolean var4 = BufferFactory.isDirect(arg2);
		if (var4) {
			this.glInterleavedArrays0(arg0, arg1, arg2, BufferFactory.getDirectBufferByteOffset(arg2));
		} else {
			this.glInterleavedArrays1(arg0, arg1, BufferFactory.getArray(arg2), BufferFactory.getIndirectBufferByteOffset(arg2));
		}
	}

	private native void glInterleavedArrays0(int arg0, int arg1, Object arg2, int arg3);

	private native void glInterleavedArrays1(int arg0, int arg1, Object arg2, int arg3);

	public void glInterleavedArrays(int arg0, int arg1, long arg2) {
		this.checkArrayVBOEnabled();
		this.glInterleavedArrays0(arg0, arg1, arg2);
	}

	private native void glInterleavedArrays0(int arg0, int arg1, long arg2);

	private native void glLightModelfv1(int arg0, Object arg1, int arg2);

	public void glLightModelfv(int arg0, float[] arg1, int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"params_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		this.glLightModelfv1(arg0, arg1, arg2 * 4);
	}

	public native void glLightf(int arg0, int arg1, float arg2);

	private native void glLightfv1(int arg0, int arg1, Object arg2, int arg3);

	public void glLightfv(int arg0, int arg1, float[] arg2, int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		this.glLightfv1(arg0, arg1, arg2, arg3 * 4);
	}

	public native void glLoadIdentity();

	private native void glLoadMatrixf1(Object arg0, int arg1);

	public void glLoadMatrixf(float[] arg0, int arg1) {
		if (arg0 != null && arg0.length <= arg1) {
			throw new GLException("array offset argument \"m_offset\" (" + arg1 + ") equals or exceeds array length (" + arg0.length + ")");
		}
		this.glLoadMatrixf1(arg0, arg1 * 4);
	}

	public native void glMatrixMode(int arg0);

	public void glMultiTexCoord2f(int arg0, float arg1, float arg2) {
		long var4 = this._context.getGLProcAddressTable()._addressof_glMultiTexCoord2f;
		if (var4 == 0L) {
			var4 = this._context.getGLProcAddressTable()._addressof_glMultiTexCoord2fARB;
			if (var4 == 0L) {
				throw new GLException("Method \"glMultiTexCoord2f\" not available");
			}
		}
		this.dispatch_glMultiTexCoord2f0(arg0, arg1, arg2, var4);
	}

	public native void dispatch_glMultiTexCoord2f0(int arg0, float arg1, float arg2, long arg3);

	public native void glNewList(int arg0, int arg1);

	public void glNormalPointer(int arg0, int arg1, Buffer arg2) {
		this.checkArrayVBODisabled();
		BufferFactory.rangeCheck(arg2, 1);
		if (!BufferFactory.isDirect(arg2)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glNormalPointer0(arg0, arg1, arg2, BufferFactory.getDirectBufferByteOffset(arg2));
	}

	private native void glNormalPointer0(int arg0, int arg1, Object arg2, int arg3);

	public void glNormalPointer(int arg0, int arg1, long arg2) {
		this.checkArrayVBOEnabled();
		this.glNormalPointer0(arg0, arg1, arg2);
	}

	private native void glNormalPointer0(int arg0, int arg1, long arg2);

	public native void glOrtho(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5);

	public native void glPixelStorei(int arg0, int arg1);

	public native void glPixelZoom(float arg0, float arg1);

	public void glPointParameterfARB(int arg0, float arg1) {
		long var3 = this._context.getGLProcAddressTable()._addressof_glPointParameterfARB;
		if (var3 == 0L) {
			throw new GLException("Method \"glPointParameterfARB\" not available");
		}
		this.dispatch_glPointParameterfARB0(arg0, arg1, var3);
	}

	public native void dispatch_glPointParameterfARB0(int arg0, float arg1, long arg2);

	private native void dispatch_glPointParameterfvARB1(int arg0, Object arg1, int arg2, long arg3);

	public void glPointParameterfvARB(int arg0, float[] arg1, int arg2) {
		if (arg1 != null && arg1.length <= arg2) {
			throw new GLException("array offset argument \"v_offset\" (" + arg2 + ") equals or exceeds array length (" + arg1.length + ")");
		}
		long var4 = this._context.getGLProcAddressTable()._addressof_glPointParameterfvARB;
		if (var4 == 0L) {
			throw new GLException("Method \"glPointParameterfvARB\" not available");
		}
		this.dispatch_glPointParameterfvARB1(arg0, arg1, arg2 * 4, var4);
	}

	public native void glPolygonMode(int arg0, int arg1);

	public native void glPopAttrib();

	public native void glPopMatrix();

	public void glProgramLocalParameter4fARB(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5) {
		long var7 = this._context.getGLProcAddressTable()._addressof_glProgramLocalParameter4fARB;
		if (var7 == 0L) {
			throw new GLException("Method \"glProgramLocalParameter4fARB\" not available");
		}
		this.dispatch_glProgramLocalParameter4fARB0(arg0, arg1, arg2, arg3, arg4, arg5, var7);
	}

	public native void dispatch_glProgramLocalParameter4fARB0(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5, long arg6);

	public void glProgramLocalParameter4fvARB(int arg0, int arg1, FloatBuffer arg2) {
		boolean var4 = BufferFactory.isDirect(arg2);
		long var5 = this._context.getGLProcAddressTable()._addressof_glProgramLocalParameter4fvARB;
		if (var5 == 0L) {
			throw new GLException("Method \"glProgramLocalParameter4fvARB\" not available");
		} else if (var4) {
			this.dispatch_glProgramLocalParameter4fvARB0(arg0, arg1, arg2, BufferFactory.getDirectBufferByteOffset(arg2), var5);
		} else {
			this.dispatch_glProgramLocalParameter4fvARB1(arg0, arg1, BufferFactory.getArray(arg2), BufferFactory.getIndirectBufferByteOffset(arg2), var5);
		}
	}

	private native void dispatch_glProgramLocalParameter4fvARB0(int arg0, int arg1, Object arg2, int arg3, long arg4);

	private native void dispatch_glProgramLocalParameter4fvARB1(int arg0, int arg1, Object arg2, int arg3, long arg4);

	public void glProgramLocalParameter4fvARB(int arg0, int arg1, float[] arg2, int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		long var5 = this._context.getGLProcAddressTable()._addressof_glProgramLocalParameter4fvARB;
		if (var5 == 0L) {
			throw new GLException("Method \"glProgramLocalParameter4fvARB\" not available");
		}
		this.dispatch_glProgramLocalParameter4fvARB1(arg0, arg1, arg2, arg3 * 4, var5);
	}

	public void glProgramStringARB(int arg0, int arg1, int arg2, String arg3) {
		long var5 = this._context.getGLProcAddressTable()._addressof_glProgramStringARB;
		if (var5 == 0L) {
			throw new GLException("Method \"glProgramStringARB\" not available");
		}
		this.dispatch_glProgramStringARB0(arg0, arg1, arg2, arg3, var5);
	}

	public native void dispatch_glProgramStringARB0(int arg0, int arg1, int arg2, String arg3, long arg4);

	public native void glPushAttrib(int arg0);

	public native void glPushMatrix();

	public native void glRasterPos2i(int arg0, int arg1);

	public native void glReadBuffer(int arg0);

	public native void glRotatef(float arg0, float arg1, float arg2, float arg3);

	public native void glScalef(float arg0, float arg1, float arg2);

	public native void glScissor(int arg0, int arg1, int arg2, int arg3);

	public native void glShadeModel(int arg0);

	public native void glTexCoord2f(float arg0, float arg1);

	public void glTexCoordPointer(int arg0, int arg1, int arg2, Buffer arg3) {
		this.checkArrayVBODisabled();
		BufferFactory.rangeCheck(arg3, 1);
		if (!BufferFactory.isDirect(arg3)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glTexCoordPointer0(arg0, arg1, arg2, arg3, BufferFactory.getDirectBufferByteOffset(arg3));
	}

	private native void glTexCoordPointer0(int arg0, int arg1, int arg2, Object arg3, int arg4);

	public void glTexCoordPointer(int arg0, int arg1, int arg2, long arg3) {
		this.checkArrayVBOEnabled();
		this.glTexCoordPointer0(arg0, arg1, arg2, arg3);
	}

	private native void glTexCoordPointer0(int arg0, int arg1, int arg2, long arg3);

	public native void glTexEnvf(int arg0, int arg1, float arg2);

	private native void glTexEnvfv1(int arg0, int arg1, Object arg2, int arg3);

	public void glTexEnvfv(int arg0, int arg1, float[] arg2, int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		this.glTexEnvfv1(arg0, arg1, arg2, arg3 * 4);
	}

	public native void glTexEnvi(int arg0, int arg1, int arg2);

	private native void glTexGenfv1(int arg0, int arg1, Object arg2, int arg3);

	public void glTexGenfv(int arg0, int arg1, float[] arg2, int arg3) {
		if (arg2 != null && arg2.length <= arg3) {
			throw new GLException("array offset argument \"params_offset\" (" + arg3 + ") equals or exceeds array length (" + arg2.length + ")");
		}
		this.glTexGenfv1(arg0, arg1, arg2, arg3 * 4);
	}

	public native void glTexGeni(int arg0, int arg1, int arg2);

	public void glTexImage1D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Buffer arg7) {
		this.checkUnpackPBODisabled();
		BufferFactory.rangeCheckBytes(arg7, this.imageSizeInBytes(arg5, arg6, arg3, 1, 1));
		boolean var9 = BufferFactory.isDirect(arg7);
		if (var9) {
			this.glTexImage1D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, BufferFactory.getDirectBufferByteOffset(arg7));
		} else {
			this.glTexImage1D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, BufferFactory.getArray(arg7), BufferFactory.getIndirectBufferByteOffset(arg7));
		}
	}

	private native void glTexImage1D0(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Object arg7, int arg8);

	private native void glTexImage1D1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Object arg7, int arg8);

	public void glTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Buffer arg8) {
		this.checkUnpackPBODisabled();
		BufferFactory.rangeCheckBytes(arg8, this.imageSizeInBytes(arg6, arg7, arg3, arg4, 1));
		boolean var10 = BufferFactory.isDirect(arg8);
		if (var10) {
			this.glTexImage2D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, BufferFactory.getDirectBufferByteOffset(arg8));
		} else {
			this.glTexImage2D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, BufferFactory.getArray(arg8), BufferFactory.getIndirectBufferByteOffset(arg8));
		}
	}

	private native void glTexImage2D0(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Object arg8, int arg9);

	private native void glTexImage2D1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Object arg8, int arg9);

	public void glTexImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Buffer arg9) {
		this.checkUnpackPBODisabled();
		BufferFactory.rangeCheckBytes(arg9, this.imageSizeInBytes(arg7, arg8, arg3, arg4, arg5));
		boolean var11 = BufferFactory.isDirect(arg9);
		long var12 = this._context.getGLProcAddressTable()._addressof_glTexImage3D;
		if (var12 == 0L) {
			var12 = this._context.getGLProcAddressTable()._addressof_glTexImage3DEXT;
			if (var12 == 0L) {
				throw new GLException("Method \"glTexImage3D\" not available");
			}
		}
		if (var11) {
			this.dispatch_glTexImage3D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, BufferFactory.getDirectBufferByteOffset(arg9), var12);
		} else {
			this.dispatch_glTexImage3D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, BufferFactory.getArray(arg9), BufferFactory.getIndirectBufferByteOffset(arg9), var12);
		}
	}

	private native void dispatch_glTexImage3D0(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Object arg9, int arg10, long arg11);

	private native void dispatch_glTexImage3D1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Object arg9, int arg10, long arg11);

	public native void glTexParameteri(int arg0, int arg1, int arg2);

	public native void glTranslatef(float arg0, float arg1, float arg2);

	public native void glVertex2f(float arg0, float arg1);

	public void glVertexPointer(int arg0, int arg1, int arg2, Buffer arg3) {
		this.checkArrayVBODisabled();
		BufferFactory.rangeCheck(arg3, 1);
		if (!BufferFactory.isDirect(arg3)) {
			throw new GLException("Argument \"ptr\" was not a direct buffer");
		}
		this.glVertexPointer0(arg0, arg1, arg2, arg3, BufferFactory.getDirectBufferByteOffset(arg3));
	}

	private native void glVertexPointer0(int arg0, int arg1, int arg2, Object arg3, int arg4);

	public void glVertexPointer(int arg0, int arg1, int arg2, long arg3) {
		this.checkArrayVBOEnabled();
		this.glVertexPointer0(arg0, arg1, arg2, arg3);
	}

	private native void glVertexPointer0(int arg0, int arg1, int arg2, long arg3);

	public native void glViewport(int arg0, int arg1, int arg2, int arg3);

	public GLImpl(GLContextImpl arg0) {
		this._context = arg0;
	}

	public boolean isExtensionAvailable(String arg0) {
		return this._context.isExtensionAvailable(arg0);
	}

	public void setSwapInterval(int arg0) {
		this._context.setSwapInterval(arg0);
	}

	private int imageSizeInBytes(int arg0, int arg1, int arg2, int arg3, int arg4) {
		boolean var6 = false;
		boolean var7 = false;
		if (arg2 < 0) {
			return 0;
		} else if (arg3 < 0) {
			return 0;
		} else if (arg4 < 0) {
			return 0;
		} else {
			byte var8;
			switch(arg0) {
				case 6400:
				case 6401:
					var8 = 1;
					break;
				case 6402:
				case 6403:
				case 6404:
				case 6405:
				case 6406:
				case 6409:
					var8 = 1;
					break;
				case 6407:
				case 32992:
					var8 = 3;
					break;
				case 6408:
				case 32768:
				case 32993:
					var8 = 4;
					break;
				case 6410:
					var8 = 2;
					break;
				case 34548:
					var8 = 2;
					break;
				default:
					return 0;
			}
			byte var9;
			switch(arg1) {
				case 5120:
				case 5121:
					var9 = 1;
					break;
				case 5122:
				case 5123:
					var9 = 2;
					break;
				case 5124:
				case 5125:
				case 5126:
					var9 = 4;
					break;
				case 6656:
					if (arg0 == 6400) {
						return arg4 * arg3 * ((arg2 + 7) / 8);
					}
					return 0;
				case 32818:
				case 33634:
					var9 = 1;
					var8 = 1;
					break;
				case 32819:
				case 32820:
				case 33635:
				case 33636:
				case 33637:
				case 33638:
					var9 = 2;
					var8 = 1;
					break;
				case 32821:
				case 32822:
				case 33639:
				case 33640:
					var9 = 4;
					var8 = 1;
					break;
				default:
					return 0;
			}
			return var8 * var9 * arg2 * arg3 * arg4;
		}
	}

	private void initBufferObjectExtensionChecks() {
		if (this.bufferObjectExtensionsInitialized) {
			return;
		}
		this.bufferObjectExtensionsInitialized = true;
		this.haveARBPixelBufferObject = this.isExtensionAvailable("GL_ARB_pixel_buffer_object");
		this.haveEXTPixelBufferObject = this.isExtensionAvailable("GL_EXT_pixel_buffer_object");
		this.haveGL15 = this.isExtensionAvailable("GL_VERSION_1_5");
		this.haveGL21 = this.isExtensionAvailable("GL_VERSION_2_1");
		this.haveARBVertexBufferObject = this.isExtensionAvailable("GL_ARB_vertex_buffer_object");
	}

	private void checkBufferObject(boolean arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, String arg5) {
		if (this.inBeginEndPair) {
			throw new GLException("May not call this between glBegin and glEnd");
		}
		boolean var7 = arg0 || arg1 || arg2;
		if (!var7 && arg3) {
			throw new GLException("Required extensions not available to call this function");
		}
	}

	private void checkUnpackPBODisabled() {
		this.initBufferObjectExtensionChecks();
		this.checkBufferObject(this.haveARBPixelBufferObject, this.haveEXTPixelBufferObject, this.haveGL21, false, 35052, "unpack pixel_buffer_object");
	}

	private void checkArrayVBODisabled() {
		this.initBufferObjectExtensionChecks();
		this.checkBufferObject(this.haveGL15, this.haveARBVertexBufferObject, false, false, 34962, "array vertex_buffer_object");
	}

	private void checkArrayVBOEnabled() {
		this.initBufferObjectExtensionChecks();
		this.checkBufferObject(this.haveGL15, this.haveARBVertexBufferObject, false, true, 34962, "array vertex_buffer_object");
	}

	private void checkElementVBODisabled() {
		this.initBufferObjectExtensionChecks();
		this.checkBufferObject(this.haveGL15, this.haveARBVertexBufferObject, false, false, 34963, "element vertex_buffer_object");
	}

	private void checkElementVBOEnabled() {
		this.initBufferObjectExtensionChecks();
		this.checkBufferObject(this.haveGL15, this.haveARBVertexBufferObject, false, true, 34963, "element vertex_buffer_object");
	}
}
