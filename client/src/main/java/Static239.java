import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString5;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString6;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "F")
	private static float aFloat30;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int anInt5322;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
	public static boolean aBoolean263;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "F")
	private static float aFloat32;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public static boolean aBoolean267;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	private static int anInt5327;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
	public static boolean aBoolean270;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
	public static int anInt5329;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	private static int anInt5330;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
	public static boolean aBoolean271;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
	private static int anInt5331;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "Z")
	public static boolean aBoolean273;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
	public static boolean aBoolean274;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
	public static int anInt5332;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
	public static boolean aBoolean275;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
	private static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt5323 = 0;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	private static int anInt5324 = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	private static int anInt5325 = 0;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "F")
	private static float aFloat31 = 0.0F;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
	private static boolean aBoolean264 = true;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "F")
	private static float aFloat33 = 0.0F;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
	public static boolean aBoolean265 = true;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
	private static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "F")
	private static final float aFloat34 = 0.09765625F;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	private static int anInt5326 = -1;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Z")
	private static boolean aBoolean268 = true;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[F")
	private static final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
	private static boolean aBoolean272 = true;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Lclient!na;")
	private static final JagString aClass100_1007 = Static28.parse("radeon");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Lclient!na;")
	private static JagString method4147(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3;
		try {
			local3 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(5) UnsupportedEncodingException local5) {
			local3 = arg0.getBytes();
		}
		return Static10.decodeString(local3, local3.length, 0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4171(0, 0, anInt5332, anInt5329, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	public static void method4149() {
		Static27.method766(0, 0);
		method4163();
		method4183(1);
		method4174(1);
		method4164(false);
		method4158(false);
		method4154(false);
		method4150();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()V")
	public static void method4150() {
		if (aBoolean262) {
			aGL1.glMatrixMode(GL.GL_TEXTURE);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(GL.GL_MODELVIEW);
			aBoolean262 = false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
	public static void method4151() {
		Static27.method766(0, 0);
		method4163();
		method4183(0);
		method4174(0);
		method4164(false);
		method4158(false);
		method4154(false);
		method4150();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FF)V")
	public static void method4152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean266 || arg0 == aFloat33 && arg1 == aFloat31) {
			return;
		}
		aFloat33 = arg0;
		aFloat31 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray27[10] = aFloat30;
			aFloatArray27[14] = aFloat32;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat32 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray27[10] = aFloat30 + local42;
			aFloatArray27[14] = aFloat32 * local29;
		}
		aGL1.glMatrixMode(GL.GL_PROJECTION);
		aGL1.glLoadMatrixf(aFloatArray27, 0);
		aGL1.glMatrixMode(GL.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()V")
	public static void method4153() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public static void method4154(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean272) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(GL.GL_FOG);
		} else {
			aGL1.glDisable(GL.GL_FOG);
		}
		aBoolean272 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "()V")
	public static void method4155() {
		Static27.method766(0, 0);
		method4163();
		method4183(0);
		method4174(0);
		method4164(false);
		method4158(false);
		method4154(false);
		method4150();
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "()V")
	private static void method4156() {
		aBoolean266 = false;
		aGL1.glDisable(GL.GL_TEXTURE_2D);
		anInt5326 = -1;
		aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		anInt5325 = 0;
		aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		anInt5324 = 0;
		aGL1.glEnable(GL.GL_LIGHTING);
		aGL1.glEnable(GL.GL_FOG);
		aGL1.glEnable(GL.GL_DEPTH_TEST);
		aBoolean264 = true;
		aBoolean268 = true;
		aBoolean272 = true;
		Static83.method440();
		aGL1.glActiveTexture(GL.GL_TEXTURE1);
		aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_COMBINE);
		aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		aGL1.glActiveTexture(GL.GL_TEXTURE0);
		aGL1.setSwapInterval(0);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL1.glShadeModel(GL.GL_SMOOTH);
		aGL1.glClearDepth(1.0D);
		aGL1.glDepthFunc(GL.GL_LEQUAL);
		method4157();
		aGL1.glMatrixMode(GL.GL_TEXTURE);
		aGL1.glLoadIdentity();
		aGL1.glPolygonMode(GL.GL_FRONT, GL.GL_FILL);
		aGL1.glEnable(GL.GL_CULL_FACE);
		aGL1.glCullFace(GL.GL_BACK);
		aGL1.glEnable(GL.GL_BLEND);
		aGL1.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		aGL1.glEnable(GL.GL_ALPHA_TEST);
		aGL1.glAlphaFunc(GL.GL_GREATER, 0.0F);
		aGL1.glEnableClientState(GL.GL_VERTEX_ARRAY);
		aGL1.glEnableClientState(GL.GL_NORMAL_ARRAY);
		aBoolean265 = true;
		aGL1.glEnableClientState(GL.GL_COLOR_ARRAY);
		aGL1.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		aGL1.glMatrixMode(GL.GL_MODELVIEW);
		aGL1.glLoadIdentity();
		Static161.method3065();
		Static120.method2400();
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()V")
	public static void method4157() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public static void method4158(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean268) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(GL.GL_DEPTH_TEST);
		} else {
			aGL1.glDisable(GL.GL_DEPTH_TEST);
		}
		aBoolean268 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(F)V")
	public static void method4159(@OriginalArg(0) float arg0) {
		method4152(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "()V")
	public static void method4160() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(GL.GL_DRAW_BUFFER, local2, 0);
		aGL1.glGetIntegerv(GL.GL_READ_BUFFER, local2, 1);
		aGL1.glDrawBuffer(GL.GL_BACK_LEFT);
		aGL1.glReadBuffer(GL.GL_FRONT_LEFT);
		method4177(-1);
		aGL1.glPushAttrib(GL.GL_ENABLE_BIT);
		aGL1.glDisable(GL.GL_FOG);
		aGL1.glDisable(GL.GL_BLEND);
		aGL1.glDisable(GL.GL_DEPTH_TEST);
		aGL1.glDisable(GL.GL_ALPHA_TEST);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt5332, anInt5329, GL.GL_COLOR);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method4161(@OriginalArg(0) Canvas arg0) {
		try {
			if (!arg0.isDisplayable()) {
				return;
			}
			@Pc(5) GLDrawableFactory local5 = GLDrawableFactory.getFactory();
			@Pc(11) GLDrawable local11 = local5.getGLDrawable(arg0, null, null);
			local11.setRealized(true);
			@Pc(18) GLContext local18 = local11.createContext(null);
			local18.makeCurrent();
			local18.release();
			local18.destroy();
			local11.setRealized(false);
		} catch (@Pc(30) Throwable local30) {
		}
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()V")
	public static void method4162() {
		Static27.method766(0, 0);
		method4163();
		method4177(-1);
		method4164(false);
		method4158(false);
		method4154(false);
		method4150();
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "()V")
	private static void method4163() {
		if (aBoolean266) {
			return;
		}
		aGL1.glMatrixMode(GL.GL_PROJECTION);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt5332, 0.0D, (double) anInt5329, -1.0D, 1.0D);
		aGL1.glViewport(0, 0, anInt5332, anInt5329);
		aGL1.glMatrixMode(GL.GL_MODELVIEW);
		aGL1.glLoadIdentity();
		aBoolean266 = true;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V")
	public static void method4164(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean264) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(GL.GL_LIGHTING);
		} else {
			aGL1.glDisable(GL.GL_LIGHTING);
		}
		aBoolean264 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()F")
	public static float method4166() {
		return aFloat31;
	}

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "()I")
	private static int method4167() {
		@Pc(1) int local1 = 0;
		aString5 = aGL1.glGetString(GL.GL_VENDOR);
		aString6 = aGL1.glGetString(GL.GL_RENDERER);
		@Pc(12) String local12 = aString5.toLowerCase();
		if (local12.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local12.indexOf("brian paul") != -1 || local12.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(39) String local39 = aGL1.glGetString(GL.GL_VERSION);
		@Pc(43) String[] local43 = local39.split("[. ]");
		if (local43.length >= 2) {
			try {
				@Pc(52) int local52 = Integer.parseInt(local43[0]);
				@Pc(57) int local57 = Integer.parseInt(local43[1]);
				anInt5330 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt5330 < 12) {
			local1 |= 0x2;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(100) int[] local100 = new int[1];
		aGL1.glGetIntegerv(GL.GL_MAX_TEXTURE_UNITS, local100, 0);
		anInt5322 = local100[0];
		aGL1.glGetIntegerv(GL.GL_MAX_TEXTURE_COORDS, local100, 0);
		anInt5331 = local100[0];
		aGL1.glGetIntegerv(GL.GL_MAX_TEXTURE_IMAGE_UNITS, local100, 0);
		anInt5327 = local100[0];
		if (anInt5322 < 2 || anInt5331 < 2 || anInt5327 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean263 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean271 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean270 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean275 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean274 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean267 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		@Pc(176) JagString local176 = method4147(aString6).method3114();
		if (local176.method3131(aClass100_1007) != -1) {
			@Pc(184) int local184 = 0;
			@Pc(193) JagString[] local193 = local176.method3145().method3147(32);
			for (@Pc(195) int local195 = 0; local195 < local193.length; local195++) {
				@Pc(203) JagString local203 = local193[local195];
				if (local203.length() >= 4 && local203.method3137(4, 0).method3123()) {
					local184 = local203.method3137(4, 0).method3132();
					break;
				}
			}
			if (local184 >= 7000 && local184 <= 7999) {
				aBoolean271 = false;
			}
			if (local184 >= 7000 && local184 <= 9250) {
				aBoolean267 = false;
			}
			aBoolean273 = aBoolean271;
		}
		if (aBoolean271) {
			try {
				@Pc(250) int[] local250 = new int[1];
				aGL1.glGenBuffersARB(1, local250, 0);
			} catch (@Pc(257) Throwable local257) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "()V")
	public static void method4168() {
		aGL1.glClear(GL.GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "()V")
	public static void method4169() {
		if (aGL1 != null) {
			try {
				Static172.method3225();
			} catch (@Pc(5) Throwable local5) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static63.method1488();
			try {
				if (GLContext.getCurrent() == aGLContext1) {
					aGLContext1.release();
				}
			} catch (@Pc(17) Throwable local17) {
			}
			try {
				aGLContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			aGLContext1 = null;
		}
		if (aGLDrawable1 != null) {
			try {
				aGLDrawable1.setRealized(false);
			} catch (@Pc(30) Throwable local30) {
			}
			aGLDrawable1 = null;
		}
		Static120.method2398();
		aBoolean269 = false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFF)V")
	public static void method4170(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(GL.GL_TEXTURE);
		if (aBoolean262) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(GL.GL_MODELVIEW);
		aBoolean262 = true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(GL.GL_PROJECTION);
		aGL1.glLoadIdentity();
		method4175((float) local7 * aFloat34, (float) local17 * aFloat34, (float) -local35 * aFloat34, (float) -local25 * aFloat34, 50.0F, 3584.0F);
		aGL1.glViewport(arg0, anInt5329 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(GL.GL_MODELVIEW);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean266 = false;
		Static240.anInt5334 = local7;
		Static247.anInt5405 = local17;
		Static1.anInt4 = local25;
		Static148.anInt3535 = local35;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(Z)V")
	private static void method4172(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean265) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(GL.GL_NORMAL_ARRAY);
		} else {
			aGL1.glDisableClientState(GL.GL_NORMAL_ARRAY);
		}
		aBoolean265 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "()V")
	public static void method4173() {
		if (Static178.aBoolean202) {
			method4164(true);
			method4172(true);
		} else {
			method4164(false);
			method4172(false);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method4174(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5324) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_MODULATE);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_REPLACE);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_ALPHA, GL.GL_ADD);
		}
		anInt5324 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFF)V")
	private static void method4175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray27[0] = local3 / (arg1 - arg0);
		aFloatArray27[1] = 0.0F;
		aFloatArray27[2] = 0.0F;
		aFloatArray27[3] = 0.0F;
		aFloatArray27[4] = 0.0F;
		aFloatArray27[5] = local3 / (arg3 - arg2);
		aFloatArray27[6] = 0.0F;
		aFloatArray27[7] = 0.0F;
		aFloatArray27[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray27[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray27[10] = aFloat30 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray27[11] = -1.0F;
		aFloatArray27[12] = 0.0F;
		aFloatArray27[13] = 0.0F;
		aFloatArray27[14] = aFloat32 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray27[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray27, 0);
		aFloat33 = 0.0F;
		aFloat31 = 0.0F;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method4176(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(GL.GL_DEPTH_BUFFER_BIT | GL.GL_COLOR_BUFFER_BIT);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void method4177(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5326) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(GL.GL_TEXTURE_2D);
		} else {
			if (anInt5326 == -1) {
				aGL1.glEnable(GL.GL_TEXTURE_2D);
			}
			aGL1.glBindTexture(GL.GL_TEXTURE_2D, arg0);
		}
		anInt5326 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "()V")
	public static void method4178() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "()F")
	public static float method4179() {
		return aFloat33;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method4180(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0.isDisplayable()) {
				return -1;
			}
			@Pc(8) GLCapabilities local8 = new GLCapabilities();
			if (arg1 > 0) {
				local8.setSampleBuffers(true);
				local8.setNumSamples(arg1);
			}
			@Pc(18) GLDrawableFactory local18 = GLDrawableFactory.getFactory();
			aGLDrawable1 = local18.getGLDrawable(arg0, local8, null);
			aGLDrawable1.setRealized(true);
			@Pc(29) int local29 = 0;
			@Pc(36) int var5;
			while (true) {
				aGLContext1 = aGLDrawable1.createContext(null);
				try {
					var5 = aGLContext1.makeCurrent();
					if (var5 != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (local29++ > 5) {
					return -2;
				}
				Static231.method3983(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean269 = true;
			anInt5332 = arg0.getSize().width;
			anInt5329 = arg0.getSize().height;
			var5 = method4167();
			if (var5 != 0) {
				method4169();
				return var5;
			}
			method4184();
			method4156();
			aGL1.glClear(GL.GL_COLOR_BUFFER_BIT);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method4169();
						return -3;
					}
					Static231.method3983(100L);
				}
			}
			aGL1.glClear(GL.GL_COLOR_BUFFER_BIT);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method4169();
			return -5;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public static void method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5332 = arg0;
		anInt5329 = arg1;
		aBoolean266 = false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V")
	public static void method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt5332 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt5329 - arg1;
		aGL1.glMatrixMode(GL.GL_PROJECTION);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		aGL1.glViewport(0, 0, anInt5332, anInt5329);
		aGL1.glMatrixMode(GL.GL_MODELVIEW);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean266 = false;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	public static void method4183(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5325) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_MODULATE);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_REPLACE);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD);
		}
		if (arg0 == 3) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_SUBTRACT);
		}
		if (arg0 == 4) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_ADD_SIGNED);
		}
		if (arg0 == 5) {
			aGL1.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_COMBINE_RGB, GL.GL_INTERPOLATE);
		}
		anInt5325 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "()V")
	private static void method4184() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt5328 = local2[0];
		aGL1.glBindTexture(GL.GL_TEXTURE_2D, anInt5328);
		aGL1.glTexImage2D(GL.GL_TEXTURE_2D, 0, 4, 1, 1, 0, GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, IntBuffer.wrap(new int[] { -1 }));
		Static120.method2401();
		Static238.method4145();
	}
}
