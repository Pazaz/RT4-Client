package javax.media.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;

public interface GL {

	int GL_POINTS = 0x0;

	int GL_ONE = 0x1;

	int GL_LINES = 0x1;

	int GL_LINE_LOOP = 0x2;

	int GL_TRIANGLES = 0x4;

	int GL_TRIANGLE_FAN = 0x6;

	int GL_FOG_BIT = 0x80;

	int GL_DEPTH_BUFFER_BIT = 0x100;

	int GL_ADD = 0x104;

	int GL_LEQUAL = 0x203;

	int GL_GREATER = 0x204;

	int GL_SRC_COLOR = 0x300;

	int GL_SRC_ALPHA = 0x302;

	int GL_ONE_MINUS_SRC_ALPHA = 0x303;

	int GL_DST_COLOR = 0x306;

	int GL_FRONT_LEFT = 0x400;

	int GL_BACK_LEFT = 0x402;

	int GL_FRONT = 0x404;

	int GL_BACK = 0x405;

	int GL_CULL_FACE = 0xB44;

	int GL_LIGHTING = 0xB50;

	int GL_LIGHT_MODEL_AMBIENT = 0xB53;

	int GL_COLOR_MATERIAL = 0xB57;

	int GL_FOG = 0xB60;

	int GL_FOG_DENSITY = 0xB62;

	int GL_FOG_START = 0xB63;

	int GL_FOG_END = 0xB64;

	int GL_FOG_MODE = 0xB65;

	int GL_FOG_COLOR = 0xB66;

	int GL_DEPTH_TEST = 0xB71;

	int GL_ALPHA_TEST = 0xBC0;

	int GL_BLEND = 0xBE2;

	int GL_DRAW_BUFFER = 0xC01;

	int GL_READ_BUFFER = 0xC02;

	int GL_SCISSOR_TEST = 0xC11;

	int GL_FOG_HINT = 0xC54;

	int GL_TEXTURE_GEN_S = 0xC60;

	int GL_TEXTURE_GEN_T = 0xC61;

	int GL_TEXTURE_GEN_R = 0xC62;

	int GL_TEXTURE_GEN_Q = 0xC63;

	int GL_UNPACK_SWAP_BYTES = 0xCF0;

	int GL_UNPACK_LSB_FIRST = 0xCF1;

	int GL_UNPACK_ROW_LENGTH = 0xCF2;

	int GL_UNPACK_SKIP_ROWS = 0xCF3;

	int GL_UNPACK_SKIP_PIXELS = 0xCF4;

	int GL_UNPACK_ALIGNMENT = 0xCF5;

	int GL_PACK_SWAP_BYTES = 0xD00;

	int GL_PACK_LSB_FIRST = 0xD01;

	int GL_PACK_ROW_LENGTH = 0xD02;

	int GL_PACK_SKIP_ROWS = 0xD03;

	int GL_PACK_SKIP_PIXELS = 0xD04;

	int GL_PACK_ALIGNMENT = 0xD05;

	int GL_MAX_TEXTURE_SIZE = 0xD33;

	int GL_TEXTURE_1D = 0xDE0;

	int GL_TEXTURE_2D = 0xDE1;

	int GL_TEXTURE_WIDTH = 0x1000;

	int GL_FASTEST = 0x1101;

	int GL_AMBIENT = 0x1200;

	int GL_DIFFUSE = 0x1201;

	int GL_POSITION = 0x1203;

	int GL_CONSTANT_ATTENUATION = 0x1207;

	int GL_LINEAR_ATTENUATION = 0x1208;

	int GL_QUADRATIC_ATTENUATION = 0x1209;

	int GL_COMPILE = 0x1300;

	int GL_UNSIGNED_BYTE = 0x1401;

	int GL_UNSIGNED_SHORT = 0x1403;

	int GL_UNSIGNED_INT = 0x1405;

	int GL_FLOAT = 0x1406;

	int GL_AMBIENT_AND_DIFFUSE = 0x1602;

	int GL_MODELVIEW = 0x1700;

	int GL_PROJECTION = 0x1701;

	int GL_TEXTURE = 0x1702;

	int GL_COLOR = 0x1800;

	int GL_ALPHA = 0x1906;

	int GL_RGBA = 0x1908;

	int GL_LUMINANCE_ALPHA = 0x190A;

	int GL_FILL = 0x1B02;

	int GL_SMOOTH = 0x1D01;

	int GL_REPLACE = 0x1E01;

	int GL_VENDOR = 0x1F00;

	int GL_RENDERER = 0x1F01;

	int GL_VERSION = 0x1F02;

	int GL_EXTENSIONS = 0x1F03;

	int GL_S = 0x2000;

	int GL_ENABLE_BIT = 0x2000;

	int GL_T = 0x2001;

	int GL_R = 0x2002;

	int GL_Q = 0x2003;

	int GL_MODULATE = 0x2100;

	int GL_TEXTURE_ENV_MODE = 0x2200;

	int GL_TEXTURE_ENV_COLOR = 0x2201;

	int GL_TEXTURE_ENV = 0x2300;

	int GL_EYE_LINEAR = 0x2400;

	int GL_OBJECT_LINEAR = 0x2401;

	int GL_TEXTURE_GEN_MODE = 0x2500;

	int GL_OBJECT_PLANE = 0x2501;

	int GL_EYE_PLANE = 0x2502;

	int GL_NEAREST = 0x2600;

	int GL_LINEAR = 0x2601;

	int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

	int GL_TEXTURE_MAG_FILTER = 0x2800;

	int GL_TEXTURE_MIN_FILTER = 0x2801;

	int GL_TEXTURE_WRAP_S = 0x2802;

	int GL_TEXTURE_WRAP_T = 0x2803;

	int GL_REPEAT = 0x2901;

	int GL_C4UB_V3F = 0x2A23;

	int GL_T2F_V3F = 0x2A27;

	int GL_LIGHT0 = 0x4000;

	int GL_COLOR_BUFFER_BIT = 0x4000;

	int GL_LIGHT1 = 0x4001;

	int GL_TEXTURE_3D = 0x806F;

	int GL_TEXTURE_WRAP_R = 0x8072;

	int GL_VERTEX_ARRAY = 0x8074;

	int GL_NORMAL_ARRAY = 0x8075;

	int GL_COLOR_ARRAY = 0x8076;

	int GL_TEXTURE_COORD_ARRAY = 0x8078;

	int GL_BGRA = 0x80E1;

	int GL_POINT_SIZE_MIN = 0x8126;

	int GL_POINT_SIZE_MAX = 0x8127;

	int GL_POINT_DISTANCE_ATTENUATION = 0x8129;

	int GL_CLAMP_TO_EDGE = 0x812F;

	int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;

	int GL_TEXTURE0 = 0x84C0;

	int GL_TEXTURE1 = 0x84C1;

	int GL_TEXTURE2 = 0x84C2;

	int GL_MAX_TEXTURE_UNITS = 0x84E2;

	int GL_SUBTRACT = 0x84E7;

	int GL_NORMAL_MAP = 0x8511;

	int GL_TEXTURE_CUBE_MAP = 0x8513;

	int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

	int GL_COMBINE = 0x8570;

	int GL_COMBINE_RGB = 0x8571;

	int GL_COMBINE_ALPHA = 0x8572;

	int GL_RGB_SCALE = 0x8573;

	int GL_ADD_SIGNED = 0x8574;

	int GL_INTERPOLATE = 0x8575;

	int GL_CONSTANT = 0x8576;

	int GL_PRIMARY_COLOR = 0x8577;

	int GL_PREVIOUS = 0x8578;

	int GL_SRC0_RGB = 0x8580;

	int GL_SRC1_RGB = 0x8581;

	int GL_SRC2_RGB = 0x8582;

	int GL_SRC0_ALPHA = 0x8588;

	int GL_SRC1_ALPHA = 0x8589;

	int GL_SRC2_ALPHA = 0x858A;

	int GL_OPERAND0_RGB = 0x8590;

	int GL_OPERAND1_RGB = 0x8591;

	int GL_VERTEX_PROGRAM_ARB = 0x8620;

	int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;

	int GL_FRAGMENT_PROGRAM_ARB = 0x8804;

	int GL_MAX_TEXTURE_COORDS = 0x8871;

	int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

	int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

	int GL_ARRAY_BUFFER = 0x8892;

	int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	int GL_STREAM_DRAW = 0x88E0;

	int GL_STATIC_DRAW = 0x88E4;

	void glActiveTexture(int texture);

	void glAlphaFunc(int func, float ref);

	void glBegin(int mode);

	void glBindBufferARB(int target, int buffer);

	void glBindProgramARB(int target, int program);

	void glBindTexture(int target, int texture);

	void glBlendFunc(int sfactor, int dfactor);

	void glBufferDataARB(int target, int size, Buffer data, int usage);

	void glBufferSubDataARB(int target, int offset, int size, Buffer data);

	void glCallList(int list);

	void glClear(int mask);

	void glClearColor(float red, float green, float blue, float alpha);

	void glClearDepth(double depth);

	void glClientActiveTexture(int texture);

	void glColor3ub(byte red, byte green, byte blue);

	void glColor4f(float red, float green, float blue, float alpha);

	void glColor4fv(float[] v, int vOffset);

	void glColor4ub(byte red, byte green, byte blue, byte alpha);

	void glColorMaterial(int face, int mode);

	void glColorPointer(int size, int type, int stride, Buffer pointer);

	void glColorPointer(int size, int type, int stride, long pointer);

	void glCopyPixels(int x, int y, int width, int height, int type);

	void glCullFace(int mode);

	void glDeleteBuffersARB(int n, int[] buffers, int buffersOffset);

	void glDeleteLists(int list, int range);

	void glDeleteTextures(int n, int[] textures, int texturesOffset);

	void glDepthFunc(int func);

	void glDepthMask(boolean flag);

	void glDisable(int cap);

	void glDisableClientState(int array);

	void glDrawBuffer(int buf);

	void glDrawElements(int mode, int count, int type, Buffer indices);

	void glDrawElements(int mode, int count, int type, long indices);

	void glDrawPixels(int width, int height, int format, int type, Buffer pixels);

	void glEnable(int cap);

	void glEnableClientState(int array);

	void glEnd();

	void glEndList();

	void glFogf(int pname, float param);

	void glFogfv(int pname, float[] params, int paramsOffset);

	void glFogi(int pname, int param);

	void glGenBuffersARB(int n, int[] buffers, int buffersOffset);

	int glGenLists(int range);

	void glGenProgramsARB(int n, int[] programs, int programsOffset);

	void glGenTextures(int n, int[] textures, int texturesOffset);

	void glGetFloatv(int pname, FloatBuffer data);

	void glGetFloatv(int pname, float[] data, int dataOffset);

	void glGetIntegerv(int pname, int[] data, int dataOffset);

	String glGetString(int name);

	void glGetTexLevelParameteriv(int target, int level, int pname, int[] params, int paramsOffset);

	void glHint(int target, int mode);

	void glInterleavedArrays(int format, int stride, Buffer pointer);

	void glInterleavedArrays(int format, int stride, long pointer);

	void glLightModelfv(int pname, float[] params, int paramsOffset);

	void glLightf(int light, int pname, float param);

	void glLightfv(int light, int pname, float[] params, int paramsOffset);

	void glLoadIdentity();

	void glLoadMatrixf(float[] m, int mOffset);

	void glMatrixMode(int mode);

	void glMultiTexCoord2f(int target, float s, float t);

	void glNewList(int list, int mode);

	void glNormalPointer(int type, int stride, Buffer pointer);

	void glNormalPointer(int type, int stride, long pointer);

	void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar);

	void glPixelStorei(int pname, int param);

	void glPixelZoom(float xfactor, float yfactor);

	void glPointParameterfARB(int pname, float param);

	void glPointParameterfvARB(int pname, float[] params, int paramsOffset);

	void glPolygonMode(int face, int mode);

	void glPopAttrib();

	void glPopMatrix();

	void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w);

	void glProgramLocalParameter4fvARB(int target, int index, FloatBuffer params);

	void glProgramLocalParameter4fvARB(int target, int index, float[] params, int paramsOffset);

	void glProgramStringARB(int target, int format, int len, String string);

	void glPushAttrib(int mask);

	void glPushMatrix();

	void glRasterPos2i(int x, int y);

	void glReadBuffer(int src);

	void glRotatef(float angle, float x, float y, float z);

	void glScalef(float x, float y, float z);

	void glScissor(int x, int y, int width, int height);

	void glShadeModel(int mode);

	void glTexCoord2f(float s, float t);

	void glTexCoordPointer(int size, int type, int stride, Buffer pointer);

	void glTexCoordPointer(int size, int type, int stride, long pointer);

	void glTexEnvf(int target, int pname, float param);

	void glTexEnvfv(int target, int pname, float[] params, int paramsOffset);

	void glTexEnvi(int target, int pname, int param);

	void glTexGenfv(int coord, int pname, float[] params, int paramsOffset);

	void glTexGeni(int coord, int pname, int param);

	void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, Buffer pixels);

	void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer pixels);

	void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Buffer pixels);

	void glTexParameteri(int target, int pname, int param);

	void glTranslatef(float x, float y, float z);

	void glVertex2f(float x, float y);

	void glVertexPointer(int size, int type, int stride, Buffer pointer);

	void glVertexPointer(int size, int type, int stride, long pointer);

	void glViewport(int x, int y, int width, int height);

	boolean isExtensionAvailable(String arg0);

	void setSwapInterval(int arg0);
}
