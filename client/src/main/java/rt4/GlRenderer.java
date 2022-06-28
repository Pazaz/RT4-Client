package rt4;

import com.jogamp.nativewindow.awt.AWTGraphicsConfiguration;
import com.jogamp.nativewindow.awt.JAWTWindow;
import com.jogamp.opengl.*;
import jogamp.newt.awt.NewtFactoryAWT;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;

public final class GlRenderer {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Ljava/lang/String;")
	private static String vendor;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Ljava/lang/String;")
	private static String renderer;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "F")
	private static float aFloat30;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int maxTextureUnits;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
	public static boolean bigEndian;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "F")
	private static float aFloat32;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext context;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public static boolean extTexture3dSupported;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL2 gl;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	private static int maxTextureImageUnits;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
	public static boolean arbMultisampleSupported;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
	public static int canvasHeight;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	private static int version;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
	public static boolean arbVboSupported;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
	private static int maxTextureCoords;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable drawable;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
	public static boolean arbVertexProgramSupported;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
	public static int canvasWidth;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
	public static boolean arbTextureCubeMapSupported;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
	private static boolean textureMatrixModified = false;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt5323 = 0;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	private static int textureCombineAlphaMode = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	private static int textureCombineRgbMode = 0;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "F")
	private static float aFloat31 = 0.0F;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
	private static boolean lightingEnabled = true;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "F")
	private static float aFloat33 = 0.0F;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
	public static boolean normalArrayEnabled = true;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
	private static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "F")
	private static final float aFloat34 = 0.09765625F;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	private static int textureId = -1;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Z")
	private static boolean depthTestEnabled = true;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Z")
	public static boolean enabled = false;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[F")
	private static final float[] matrix = new float[16];

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
	private static boolean fogEnabled = true;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Lclient!na;")
	private static final JagString RADEON = JagString.parse("radeon");

	private static JAWTWindow window;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Lclient!na;")
	private static JagString method4147(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3;
		local3 = arg0.getBytes(StandardCharsets.ISO_8859_1);
		return JagString.decodeString(local3, local3.length, 0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4171(0, 0, canvasWidth, canvasHeight, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	public static void method4149() {
		MaterialManager.setMaterial(0, 0);
		method4163();
		setTextureCombineRgbMode(1);
		setTextureCombineAlphaMode(1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()V")
	public static void resetTextureMatrix() {
		if (textureMatrixModified) {
			gl.glMatrixMode(GL2.GL_TEXTURE);
			gl.glLoadIdentity();
			gl.glMatrixMode(GL2.GL_MODELVIEW);
			textureMatrixModified = false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
	public static void method4151() {
		MaterialManager.setMaterial(0, 0); // MaterialManager
		method4163();
		setTextureCombineRgbMode(0);
		setTextureCombineAlphaMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FF)V")
	public static void method4152(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean266 || arg0 == aFloat33 && arg1 == aFloat31) {
			return;
		}
		aFloat33 = arg0;
		aFloat31 = arg1;
		if (arg1 == 0.0F) {
			matrix[10] = aFloat30;
			matrix[14] = aFloat32;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat32 * (1.0F - local25) * (1.0F - local25) / arg1;
			matrix[10] = aFloat30 + local42;
			matrix[14] = aFloat32 * local29;
		}
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadMatrixf(matrix, 0);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()V")
	public static void swapBuffers() {
		try {
			drawable.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public static void setFogEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == fogEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnable(GL2.GL_FOG);
		} else {
			gl.glDisable(GL2.GL_FOG);
		}
		fogEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "()V")
	public static void method4155() {
		MaterialManager.setMaterial(0, 0);
		method4163();
		setTextureCombineRgbMode(0);
		setTextureCombineAlphaMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "()V")
	private static void method4156() {
		aBoolean266 = false;
		gl.glDisable(GL2.GL_TEXTURE_2D);
		textureId = -1;
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_COMBINE);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		textureCombineRgbMode = 0;
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
		textureCombineAlphaMode = 0;
		gl.glEnable(GL2.GL_LIGHTING);
		gl.glEnable(GL2.GL_FOG);
		gl.glEnable(GL2.GL_DEPTH_TEST);
		lightingEnabled = true;
		depthTestEnabled = true;
		fogEnabled = true;
		resetMaterial();
		gl.glActiveTexture(GL2.GL_TEXTURE1);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_COMBINE);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
		gl.glActiveTexture(GL2.GL_TEXTURE0);
		gl.setSwapInterval(0);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		gl.glShadeModel(GL2.GL_SMOOTH);
		gl.glClearDepth(1.0D);
		gl.glDepthFunc(GL2.GL_LEQUAL);
		enableDepthMask();
		gl.glMatrixMode(GL2.GL_TEXTURE);
		gl.glLoadIdentity();
		gl.glPolygonMode(GL2.GL_FRONT, GL2.GL_FILL);
		gl.glEnable(GL2.GL_CULL_FACE);
		gl.glCullFace(GL2.GL_BACK);
		gl.glEnable(GL2.GL_BLEND);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL2.GL_ALPHA_TEST);
		gl.glAlphaFunc(GL2.GL_GREATER, 0.0F);
		gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
		gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
		normalArrayEnabled = true;
		gl.glEnableClientState(GL2.GL_COLOR_ARRAY);
		gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		FogManager.setup();
		LightingManager.method2400();
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()V")
	public static void enableDepthMask() {
		gl.glDepthMask(true);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public static void setDepthTestEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == depthTestEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnable(GL2.GL_DEPTH_TEST);
		} else {
			gl.glDisable(GL2.GL_DEPTH_TEST);
		}
		depthTestEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(F)V")
	public static void method4159(@OriginalArg(0) float arg0) {
		method4152(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "()V")
	public static void draw() {
		@Pc(2) int[] local2 = new int[2];
		gl.glGetIntegerv(GL2.GL_DRAW_BUFFER, local2, 0);
		gl.glGetIntegerv(GL2.GL_READ_BUFFER, local2, 1);
		gl.glDrawBuffer(GL2.GL_BACK_LEFT);
		gl.glReadBuffer(GL2.GL_FRONT_LEFT);
		setTextureId(-1);
		gl.glPushAttrib(GL2.GL_ENABLE_BIT);
		gl.glDisable(GL2.GL_FOG);
		gl.glDisable(GL2.GL_BLEND);
		gl.glDisable(GL2.GL_DEPTH_TEST);
		gl.glDisable(GL2.GL_ALPHA_TEST);
		gl.glRasterPos2i(0, 0);
		gl.glCopyPixels(0, 0, canvasWidth, canvasHeight, GL2.GL_COLOR);
		gl.glPopAttrib();
		gl.glDrawBuffer(local2[0]);
		gl.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void createAndDestroyContext(@OriginalArg(0) Canvas canvas) {
		try {
			if (!canvas.isDisplayable()) {
				return;
			}
			GLProfile profile = GLProfile.getDefault();

			GLCapabilities glCaps = new GLCapabilities(profile);
			AWTGraphicsConfiguration config = AWTGraphicsConfiguration.create(canvas.getGraphicsConfiguration(), glCaps, glCaps);
			JAWTWindow jawtWindow = NewtFactoryAWT.getNativeWindow(canvas, config);
			@Pc(5) GLDrawableFactory glDrawableFactory = GLDrawableFactory.getFactory(profile);
			@Pc(11) GLDrawable glDrawable = glDrawableFactory.createGLDrawable(jawtWindow);

			glDrawable.setRealized(true);
			@Pc(18) GLContext glContext = glDrawable.createContext(null);
			glContext.makeCurrent();
			glContext.release();
			glContext.destroy();
			glDrawable.setRealized(false);
		} catch (@Pc(30) Throwable ex) {
		}
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()V")
	public static void method4162() {
		MaterialManager.setMaterial(0, 0);
		method4163();
		setTextureId(-1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "()V")
	private static void method4163() {
		if (aBoolean266) {
			return;
		}
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho(0, canvasWidth, 0, canvasHeight, -1.0D, 1.0D);
		setViewportBounds(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		aBoolean266 = true;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V")
	public static void setLightingEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == lightingEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnable(GL2.GL_LIGHTING);
		} else {
			gl.glDisable(GL2.GL_LIGHTING);
		}
		lightingEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()F")
	public static float method4166() {
		return aFloat31;
	}

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "()I")
	private static int checkContext() {
		@Pc(1) int result = 0;
		vendor = gl.glGetString(GL2.GL_VENDOR);
		renderer = gl.glGetString(GL2.GL_RENDERER);
		@Pc(12) String vendor = GlRenderer.vendor.toLowerCase();
		if (vendor.contains("microsoft")) {
			result = 1;
		}
		if (vendor.contains("brian paul") || vendor.contains("mesa")) {
			result |= 0x1;
		}
		@Pc(39) String version = gl.glGetString(GL2.GL_VERSION);
		@Pc(43) String[] versionParts = version.split("[. ]");
		if (versionParts.length >= 2) {
			try {
				@Pc(52) int major = Integer.parseInt(versionParts[0]);
				@Pc(57) int minor = Integer.parseInt(versionParts[1]);
				GlRenderer.version = major * 10 + minor;
			} catch (@Pc(65) NumberFormatException ex) {
				result |= 0x4;
			}
		} else {
			result |= 0x4;
		}
		if (GlRenderer.version < 12) {
			result |= 0x2;
		}
		if (!gl.isExtensionAvailable("GL_ARB_multitexture")) {
			result |= 0x8;
		}
		if (!gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			result |= 0x20;
		}
		@Pc(100) int[] data = new int[1];
		gl.glGetIntegerv(GL2.GL_MAX_TEXTURE_UNITS, data, 0);
		maxTextureUnits = data[0];
		gl.glGetIntegerv(GL2.GL_MAX_TEXTURE_COORDS, data, 0);
		maxTextureCoords = data[0];
		gl.glGetIntegerv(GL2.GL_MAX_TEXTURE_IMAGE_UNITS, data, 0);
		maxTextureImageUnits = data[0];
		if (maxTextureUnits < 2 || maxTextureCoords < 2 || maxTextureImageUnits < 2) {
			result |= 0x10;
		}
		if (result != 0) {
			return result;
		}
		bigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		arbVboSupported = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		arbMultisampleSupported = gl.isExtensionAvailable("GL_ARB_multisample");
		arbTextureCubeMapSupported = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
		arbVertexProgramSupported = gl.isExtensionAvailable("GL_ARB_vertex_program");
		extTexture3dSupported = gl.isExtensionAvailable("GL_EXT_texture3D");
		@Pc(176) JagString renderer = method4147(GlRenderer.renderer).toLowerCase();
		if (renderer.indexOf(RADEON) != -1) {
			@Pc(184) int v = 0;
			@Pc(193) JagString[] rendererParts = renderer.replaceSlashWithSpace().split(32);
			for (@Pc(195) int i = 0; i < rendererParts.length; i++) {
				@Pc(203) JagString part = rendererParts[i];
				if (part.length() >= 4 && part.substring(4, 0).isInt()) {
					v = part.substring(4, 0).parseInt();
					break;
				}
			}
			if (v >= 7000 && v <= 7999) {
				arbVboSupported = false;
			}
			if (v >= 7000 && v <= 9250) {
				extTexture3dSupported = false;
			}
			GlModel.arbVboSupported = arbVboSupported;
		}
		if (arbVboSupported) {
			try {
				@Pc(250) int[] temp = new int[1];
				gl.glGenBuffers(1, temp, 0);
			} catch (@Pc(257) Throwable ex) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "()V")
	public static void clearDepthBuffer() {
		gl.glClear(GL2.GL_DEPTH_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "()V")
	public static void quit() {
		if (gl != null) {
			try {
				MaterialManager.quit(); // MaterialManager
			} catch (@Pc(5) Throwable local5) {
			}
		}

		if (window != null) {
			if (!window.getLock().isLocked()) {
				window.lockSurface();
			}

			if (context != null) {
				GlCleaner.clear(); // GlCleaner
				try {
					if (GLContext.getCurrent() == context) {
						context.release();
					}
				} catch (@Pc(17) Throwable ex) {
				}
				try {
					context.destroy();
				} catch (@Pc(21) Throwable ex) {
				}
			}
		}

		if (drawable != null) {
			try {
				drawable.setRealized(false);
			} catch (@Pc(30) Throwable ex) {
			}
		}
		window = null;
		gl = null;
		context = null;
		drawable = null;
		LightingManager.method2398(); // LightingManager
		enabled = false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFF)V")
	public static void translateTextureMatrix(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z) {
		gl.glMatrixMode(GL2.GL_TEXTURE);
		if (textureMatrixModified) {
			gl.glLoadIdentity();
		}
		gl.glTranslatef(x, y, z);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		textureMatrixModified = true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		method4175((float) local7 * aFloat34, (float) local17 * aFloat34, (float) -local35 * aFloat34, (float) -local25 * aFloat34, 50.0F, (float) GlobalConfig.VIEW_DISTANCE);
		setViewportBounds(arg0, canvasHeight - arg1 - arg3, arg2, arg3);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			gl.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			gl.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean266 = false;
		Rasteriser.screenLowerX = local7;
		Rasteriser.screenUpperX = local17;
		Rasteriser.screenLowerY = local25;
		Rasteriser.screenUpperY = local35;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(Z)V")
	private static void setNormalArrayEnabled(@OriginalArg(0) boolean enabled) {
		if (enabled == normalArrayEnabled) {
			return;
		}
		if (enabled) {
			gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
		} else {
			gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
		}
		normalArrayEnabled = enabled;
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "()V")
	public static void restoreLighting() {
		if (Preferences.highDetailLighting) {
			setLightingEnabled(true);
			setNormalArrayEnabled(true);
		} else {
			setLightingEnabled(false);
			setNormalArrayEnabled(false);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void setTextureCombineAlphaMode(@OriginalArg(0) int mode) {
		if (mode == textureCombineAlphaMode) {
			return;
		}
		if (mode == 0) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
		}
		if (mode == 1) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_REPLACE);
		}
		if (mode == 2) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_ADD);
		}
		textureCombineAlphaMode = mode;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFF)V")
	private static void method4175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		matrix[0] = local3 / (arg1 - arg0);
		matrix[1] = 0.0F;
		matrix[2] = 0.0F;
		matrix[3] = 0.0F;
		matrix[4] = 0.0F;
		matrix[5] = local3 / (arg3 - arg2);
		matrix[6] = 0.0F;
		matrix[7] = 0.0F;
		matrix[8] = (arg1 + arg0) / (arg1 - arg0);
		matrix[9] = (arg3 + arg2) / (arg3 - arg2);
		matrix[10] = aFloat30 = -(arg5 + arg4) / (arg5 - arg4);
		matrix[11] = -1.0F;
		matrix[12] = 0.0F;
		matrix[13] = 0.0F;
		matrix[14] = aFloat32 = -(local3 * arg5) / (arg5 - arg4);
		matrix[15] = 0.0F;
		gl.glLoadMatrixf(matrix, 0);
		aFloat33 = 0.0F;
		aFloat31 = 0.0F;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void clearColorAndDepthBuffers(@OriginalArg(0) int rgb) {
		gl.glClearColor((float) (rgb >> 16 & 0xFF) / 255.0F, (float) (rgb >> 8 & 0xFF) / 255.0F, (float) (rgb & 0xFF) / 255.0F, 0.0F);
		gl.glClear(GL2.GL_DEPTH_BUFFER_BIT | GL2.GL_COLOR_BUFFER_BIT);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public static void setTextureId(@OriginalArg(0) int id) {
		if (id == textureId) {
			return;
		}
		if (id == -1) {
			gl.glDisable(GL2.GL_TEXTURE_2D);
		} else {
			if (textureId == -1) {
				gl.glEnable(GL2.GL_TEXTURE_2D);
			}
			gl.glBindTexture(GL2.GL_TEXTURE_2D, id);
		}
		textureId = id;
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "()V")
	public static void disableDepthMask() {
		gl.glDepthMask(false);
	}

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "()F")
	public static float method4179() {
		return aFloat33;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int init(@OriginalArg(0) Canvas canvas, @OriginalArg(1) int numSamples) {
		try {
			if (!canvas.isDisplayable()) {
				return -1;
			}
			GLProfile profile = GLProfile.get(GLProfile.GL3bc);
			@Pc(8) GLCapabilities capabilities = new GLCapabilities(profile);
			if (numSamples > 0) {
				capabilities.setSampleBuffers(true);
				capabilities.setNumSamples(numSamples * 4);
			}
			@Pc(18) GLDrawableFactory factory = GLDrawableFactory.getFactory(profile);
			AWTGraphicsConfiguration config = AWTGraphicsConfiguration.create(canvas.getGraphicsConfiguration(), capabilities, capabilities);
			window = NewtFactoryAWT.getNativeWindow(canvas, config);
			if (!window.getLock().isLocked()) {
				window.lockSurface();
			}
			try {
				drawable = factory.createGLDrawable(window);
				drawable.setRealized(true);
			} finally {
				window.unlockSurface();
			}
			@Pc(29) int swapBuffersAttempts = 0;
			@Pc(36) int result;
			while (true) {
				context = drawable.createContext(null);
				try {
					result = context.makeCurrent();
					if (result != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (swapBuffersAttempts++ > 5) {
					return -2;
				}
				ThreadUtils.sleep(1000L);
			}
			if (window.getLock().isLocked()) {
				window.unlockSurface();
			}
			gl = GLContext.getCurrentGL().getGL2();
			gl.glLineWidth((float) GameShell.canvasScale);
			enabled = true;
			canvasWidth = canvas.getSize().width;
			canvasHeight = canvas.getSize().height;
			result = checkContext();
			if (result != 0) {
				quit();
				return result;
			}
			method4184();
			method4156();
			gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
			swapBuffersAttempts = 0;
			while (true) {
				try {
					drawable.swapBuffers();
					break;
				} catch (@Pc(86) Exception ex) {
					if (swapBuffersAttempts++ > 5) {
						quit();
						return -3;
					}
					ThreadUtils.sleep(100L);
				}
			}
			gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
			return 0;
		} catch (@Pc(103) Throwable ex) {
			quit();
			return -5;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public static void setCanvasSize(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		canvasWidth = width;
		canvasHeight = height;
		aBoolean266 = false;
	}

	public static int leftMargin;

	public static int topMargin;

	public static int viewportWidth;

	public static int viewportHeight;

	public static void setViewportBounds(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height) {
		leftMargin = x;
		topMargin = y;
		viewportWidth = width;
		viewportHeight = height;
		resizeViewport();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	private static void resizeViewport() {
		gl.glViewport((int) (leftMargin * GameShell.canvasScale + GameShell.subpixelX), (int) (topMargin * GameShell.canvasScale + GameShell.subpixelY),
			(int) (viewportWidth * GameShell.canvasScale + GameShell.subpixelX), (int) (viewportHeight * GameShell.canvasScale + GameShell.subpixelY));
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V")
	public static void method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = canvasWidth - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = canvasHeight - arg1;
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		gl.glOrtho((float) local2 * local30, (float) local6 * local30, (float) -local13 * local37, (float) -local9 * local37, 50 - arg3, GlobalConfig.VIEW_DISTANCE - arg3);
		setViewportBounds(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean266 = false;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	public static void setTextureCombineRgbMode(@OriginalArg(0) int mode) {
		if (mode == textureCombineRgbMode) {
			return;
		}
		if (mode == 0) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		}
		if (mode == 1) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_REPLACE);
		}
		if (mode == 2) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_ADD);
		}
		if (mode == 3) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_SUBTRACT);
		}
		if (mode == 4) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_ADD_SIGNED);
		}
		if (mode == 5) {
			gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_INTERPOLATE);
		}
		textureCombineRgbMode = mode;
	}

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "()V")
	private static void method4184() {
		@Pc(2) int[] local2 = new int[1];
		gl.glGenTextures(1, local2, 0);
		anInt5328 = local2[0];
		gl.glBindTexture(GL2.GL_TEXTURE_2D, anInt5328);
		gl.glTexImage2D(GL2.GL_TEXTURE_2D, 0, 4, 1, 1, 0, GL2.GL_RGBA, GL2.GL_UNSIGNED_BYTE, IntBuffer.wrap(new int[]{-1}));
		LightingManager.method2401();
		MaterialManager.init();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public static void resetMaterial() {
		MaterialManager.setMaterial(0, 0);
	}
}
