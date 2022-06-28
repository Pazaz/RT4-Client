package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class FogManager {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[[Lclient!li;")
	public static final Environment[][] chunksAtmosphere = new Environment[13][13];

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int lightX;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	public static int lightZ;
	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt2883;
	@OriginalMember(owner = "client!jm", name = "s", descriptor = "F")
	public static float aFloat13;
	@OriginalMember(owner = "client!ui", name = "mb", descriptor = "F")
	public static float aFloat37;
	@OriginalMember(owner = "client!ej", name = "bb", descriptor = "F")
	public static float aFloat6;
	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public static int anInt4623;
	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static int anInt4153;
	@OriginalMember(owner = "client!be", name = "Vb", descriptor = "F")
	public static float aFloat4;
	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt5868 = 0;
	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public static int anInt5080;
	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
	public static int anInt3255;
	@OriginalMember(owner = "client!aj", name = "X", descriptor = "F")
	public static float aFloat1;
	@OriginalMember(owner = "client!p", name = "g", descriptor = "F")
	public static float aFloat23;
	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static int anInt4044;
	@OriginalMember(owner = "client!bm", name = "a", descriptor = "F")
	public static float aFloat5;
	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt5731;
	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	public static int anInt3709;
	@OriginalMember(owner = "client!ui", name = "T", descriptor = "F")
	public static float aFloat36;
	@OriginalMember(owner = "client!en", name = "z", descriptor = "F")
	public static float aFloat7;
	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt2161;
	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Z")
	public static boolean instantScreenFade = true;
	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public static int currentLightZ;
	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
	public static int currentLightY;
	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public static int currentLightX;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "F")
	private static float lightModelAmbient;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "[F")
	public static final float[] light0Position = new float[4];

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	private static int lightColor = -1;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	public static int defaulFogColorRgb = 13156520;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "F")
	private static float light0Diffuse = -1.0F;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "F")
	private static float light1Diffuse = -1.0F;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[F")
	public static final float[] fogColor = new float[4];

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "[F")
	private static final float[] light1Position = new float[4];

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public static int defaultLightColorRgb = 16777215;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	private static int fogOffset = -1;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	private static int fogColorRGB = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	public static void applyLightPosition() {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, light0Position, 0);
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_POSITION, light1Position, 0);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "()F")
	public static float getLight0Diffuse() {
		return light0Diffuse;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IFFF)V")
	public static void setLightParams(@OriginalArg(0) int color, @OriginalArg(1) float ambientMod, @OriginalArg(2) float l0Diffuse, @OriginalArg(3) float l1Diffuse) {
		if (lightColor == color && lightModelAmbient == ambientMod && light0Diffuse == l0Diffuse && light1Diffuse == l1Diffuse) {
			return;
		}
		lightColor = color;
		lightModelAmbient = ambientMod;
		light0Diffuse = l0Diffuse;
		light1Diffuse = l1Diffuse;
		@Pc(25) GL2 gl = GlRenderer.gl;
		@Pc(34) float red = (float) (color >> 16 & 0xFF) / 255.0F;
		@Pc(43) float green = (float) (color >> 8 & 0xFF) / 255.0F;
		@Pc(50) float blue = (float) (color & 0xFF) / 255.0F;
		@Pc(75) float[] lightModelAmbientParams = new float[]{ambientMod * red, ambientMod * green, ambientMod * blue, 1.0F};
		gl.glLightModelfv(GL2.GL_LIGHT_MODEL_AMBIENT, lightModelAmbientParams, 0);
		@Pc(105) float[] light0Params = new float[]{l0Diffuse * red, l0Diffuse * green, l0Diffuse * blue, 1.0F};
		gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, light0Params, 0);
		@Pc(139) float[] light1Params = new float[]{-l1Diffuse * red, -l1Diffuse * green, -l1Diffuse * blue, 1.0F};
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, light1Params, 0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void setFogParams(@OriginalArg(0) int color, @OriginalArg(1) int offset) {
		if (fogColorRGB == color && fogOffset == offset) {
			return;
		}
		fogColorRGB = color;
		fogOffset = offset;
		@Pc(12) GL2 gl = GlRenderer.gl;
		fogColor[0] = (float) (color >> 16 & 0xFF) / 255.0F;
		fogColor[1] = (float) (color >> 8 & 0xFF) / 255.0F;
		fogColor[2] = (float) (color & 0xFF) / 255.0F;
		gl.glFogi(GL2.GL_FOG_MODE, GL2.GL_LINEAR);
		gl.glFogf(GL2.GL_FOG_DENSITY, 0.95F);
		gl.glHint(GL2.GL_FOG_HINT, GL2.GL_FASTEST);
		int fogEnd = GlobalConfig.VIEW_DISTANCE;
		@Pc(65) int fogStart = fogEnd - (int) (GlobalConfig.VIEW_FADE_DISTANCE * 2.0f) - offset;
		if (fogStart < 50) {
			fogStart = 50;
		}
		gl.glFogf(GL2.GL_FOG_START, (float) fogStart);
		gl.glFogf(GL2.GL_FOG_END, (float) fogEnd - GlobalConfig.VIEW_FADE_DISTANCE);
		gl.glFogfv(GL2.GL_FOG_COLOR, fogColor, 0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(FFF)V")
	public static void setLightPosition(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z) {
		if (light0Position[0] == x && light0Position[1] == y && light0Position[2] == z) {
			return;
		}
		light0Position[0] = x;
		light0Position[1] = y;
		light0Position[2] = z;
		light1Position[0] = -x;
		light1Position[1] = -y;
		light1Position[2] = -z;
		lightX = (int) (x * 256.0F / y);
		lightZ = (int) (z * 256.0F / y);
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "()I")
	public static int getLightColor() {
		return lightColor;
	}

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "()V")
	public static void setup() {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glColorMaterial(GL2.GL_FRONT, GL2.GL_AMBIENT_AND_DIFFUSE);
		gl.glEnable(GL2.GL_COLOR_MATERIAL);
		@Pc(27) float[] light0Params = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
		gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, light0Params, 0);
		gl.glEnable(GL2.GL_LIGHT0);
		@Pc(55) float[] light1Params = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_AMBIENT, light1Params, 0);
		gl.glEnable(GL2.GL_LIGHT1);
		lightColor = -1;
		fogColorRGB = -1;
		initDefaults();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([F)V")
	public static void setFogColor(@OriginalArg(0) float[] params) {
		if (params == null) {
			params = fogColor;
		}
		@Pc(5) GL2 gl = GlRenderer.gl;
		gl.glFogfv(GL2.GL_FOG_COLOR, params, 0);
	}

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "()V")
	private static void initDefaults() {
		setLightParams(defaultLightColorRgb, 1.1523438F, 0.69921875F, 1.2F);
		setLightPosition(-50.0F, -60.0F, -50.0F);
		setFogParams(defaulFogColorRgb, 0);
	}

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "()F")
	public static float getLightingModelAmbient() {
		return lightModelAmbient;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public static void init(@OriginalArg(0) int arg0) {
		setLightParams(defaultLightColorRgb, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		setLightPosition(-50.0F, -60.0F, -50.0F);
		setFogParams(defaulFogColorRgb, 0);
		applyLightPosition();
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)I")
	public static int method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (instantScreenFade) {
			arg0 = 1000000;
			instantScreenFade = false;
		}
		@Pc(15) Environment local15 = chunksAtmosphere[arg3][arg1];
		@Pc(25) float local25 = ((float) arg2 * 0.1F + 0.7F) * local15.lightModelAmbient;
		@Pc(28) float local28 = local15.light0Diffuse;
		@Pc(31) int local31 = local15.screenColorRgb;
		@Pc(34) int local34 = local15.fogDepth;
		@Pc(37) int local37 = local15.fogColorRgb;
		if (!Preferences.fogEnabled) {
			local34 = 0;
		}
		@Pc(44) float local44 = local15.light1Diffuse;
		if (local31 != anInt2883 || aFloat13 != local25 || aFloat1 != local28 || local44 != aFloat4 || anInt4044 != local37 || anInt5080 != local34) {
			aFloat13 = local25;
			aFloat37 = aFloat36;
			aFloat6 = aFloat7;
			anInt2883 = local31;
			anInt4623 = anInt3709;
			anInt4153 = anInt2161;
			aFloat4 = local44;
			anInt5868 = 0;
			anInt3255 = anInt5731;
			anInt5080 = local34;
			aFloat1 = local28;
			anInt4044 = local37;
			aFloat23 = aFloat5;
		}
		if (anInt5868 < 65536) {
			anInt5868 += arg0 * 250;
			if (anInt5868 >= 65536) {
				anInt5868 = 65536;
			}
			@Pc(114) float local114 = (float) anInt5868 / 65536.0F;
			@Pc(118) int local118 = anInt5868 >> 8;
			@Pc(125) int local125 = 65536 - anInt5868 >> 8;
			anInt3709 = (local118 * (anInt4044 & 0xFF00FF) + (anInt4623 & 0xFF00FF) * local125 & 0xFF00FF00) + (local125 * (anInt4623 & 0xFF00) + (anInt4044 & 0xFF00) * local118 & 0xFF0000) >> 8;
			@Pc(162) float local162 = (float) (65536 - anInt5868) / 65536.0F;
			aFloat7 = local162 * aFloat6 + local114 * aFloat13;
			aFloat36 = aFloat37 * local162 + local114 * aFloat1;
			aFloat5 = local114 * aFloat4 + local162 * aFloat23;
			anInt5731 = ((anInt2883 & 0xFF00) * local118 + local125 * (anInt3255 & 0xFF00) & 0xFF0000) + ((anInt3255 & 0xFF00FF) * local125 + ((anInt2883 & 0xFF00FF) * local118) & 0xFF00FF00) >> 8;
			anInt2161 = local118 * anInt5080 + local125 * anInt4153 >> 8;
		}
		setLightParams(anInt5731, aFloat7, aFloat36, aFloat5);
		setFogParams(anInt3709, anInt2161);
		setLightPosition((float) currentLightX, (float) currentLightY, (float) currentLightZ);
		applyLightPosition();
		return anInt3709;
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public static void setInstantFade() {
		instantScreenFade = true;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V")
	public static void setLightPosition(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		currentLightX = chunksAtmosphere[arg1][arg0].lightX;
		currentLightY = chunksAtmosphere[arg1][arg0].lightY;
		currentLightZ = chunksAtmosphere[arg1][arg0].lightZ;
		setLightPosition((float) currentLightX, (float) currentLightY, (float) currentLightZ);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void setDefaultChunksAtmosphere() {
		@Pc(9) Environment local9 = new Environment();
		for (@Pc(18) int local18 = 0; local18 < 13; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
				chunksAtmosphere[local18][local25] = local9;
			}
		}
	}
}
