package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class LightingManager {
	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[F")
	private static final float[] aFloatArray17 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int lightCount = 0;
	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lclient!gi;")
	public static Light[] lights;
	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public static int maximumVisibleZ;
	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public static int maximumVisibleX;
	@OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
	public static int minimumVisibleZ;
	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public static int minimumVisibleX;
	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt2875 = -1;
	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	private static int[] anIntArray283;
	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	private static int anInt3029;
	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	private static int anInt3030;
	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[Z")
	private static boolean[] enabledLights;
	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[[[I")
	private static int[][][] anIntArrayArrayArray11;
	@OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
	private static int[] anIntArray284;
	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	private static int anInt3031;
	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	private static int levels;
	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	private static int anInt3033;
	@OriginalMember(owner = "client!jf", name = "m", descriptor = "[Z")
	private static boolean[] aBooleanArray66;
	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	private static int anInt3035;
	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	private static int length;
	@OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
	private static int width;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!Preferences.highDetailLighting) {
			return;
		}
		if (arg0 == 1 && arg5 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
		} else if (arg0 == 4 && arg5 < width - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
		} else if (arg0 == 8 && arg6 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
		} else if (arg0 == 2 && arg6 < length - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
		} else if (arg0 == 16 && arg5 > 0 && arg6 < length - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
		} else if (arg0 == 32 && arg5 < width - 1 && arg6 < length - 1) {
			method2393(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
		} else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
		} else if (arg0 == 64 && arg5 < width - 1 && arg6 > 0) {
			method2393(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!gi;)V")
	public static void method2389(@OriginalArg(0) Light arg0) {
		if (lightCount >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			lights[lightCount++] = arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	public static void method2390() {
		for (@Pc(1) int local1 = 0; local1 < 4; local1++) {
			anIntArray284[local1] = -1;
			disableLight(local1);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Preferences.highDetailLighting || anInt3031 == arg3 && anInt3033 == arg4 && anInt3029 == arg5 && anInt3035 == arg6 && anInt3030 == arg7) {
			return;
		}
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			aBooleanArray66[local20] = false;
		}
		local20 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35;
		@Pc(40) int local40;
		label112:
		for (local35 = arg4; local35 <= arg6; local35++) {
			label110:
			for (local40 = arg5; local40 <= arg7; local40++) {
				@Pc(51) int local51 = anIntArrayArrayArray11[arg3][local35][local40];
				while (true) {
					while (true) {
						label96:
						while (true) {
							if (local51 == 0) {
								continue label110;
							}
							@Pc(59) int local59 = (local51 & 0xFF) - 1;
							local51 >>>= 0x8;
							@Pc(65) int local65;
							for (local65 = 0; local65 < local33; local65++) {
								if (local59 == anIntArray283[local65]) {
									continue label96;
								}
							}
							for (local65 = 0; local65 < 4; local65++) {
								if (local59 == anIntArray284[local65]) {
									if (!aBooleanArray66[local65]) {
										aBooleanArray66[local65] = true;
										local20++;
										if (local20 == 4) {
											break label112;
										}
									}
									continue label96;
								}
							}
							anIntArray283[local33++] = local59;
							local20++;
							if (local20 == 4) {
								break label112;
							}
						}
					}
				}
			}
		}
		for (local35 = 0; local35 < local33; local35++) {
			for (local40 = 0; local40 < 4; local40++) {
				if (!aBooleanArray66[local40]) {
					anIntArray284[local40] = anIntArray283[local35];
					aBooleanArray66[local40] = true;
					method2403(local40, lights[anIntArray283[local35]], arg0, arg1, arg2);
					break;
				}
			}
		}
		for (local35 = 0; local35 < 4; local35++) {
			if (!aBooleanArray66[local35]) {
				anIntArray284[local35] = -1;
				disableLight(local35);
			}
		}
		anInt3031 = arg3;
		anInt3033 = arg4;
		anInt3029 = arg5;
		anInt3035 = arg6;
		anInt3030 = arg7;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public static void setSize() {
		levels = 4;
		width = 104;
		length = 104;
		anIntArrayArrayArray11 = new int[levels][width][length];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
	public static void method2393(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z, @OriginalArg(3) int level, @OriginalArg(4) int nodeX, @OriginalArg(5) int nodeY) {
		if (!Preferences.highDetailLighting || anInt3031 == level && anInt3033 == nodeX && anInt3029 == nodeY && anInt3035 == nodeX && anInt3030 == nodeY) {
			return;
		}
		@Pc(20) int i;
		for (i = 0; i < 4; i++) {
			aBooleanArray66[i] = false;
		}
		i = 0;
		@Pc(39) int local39 = anIntArrayArrayArray11[level][nodeX][nodeY];
		while (true) {
			@Pc(47) int local47;
			@Pc(53) int local53;
			label72:
			while (local39 != 0) {
				local47 = (local39 & 0xFF) - 1;
				local39 >>>= 0x8;
				for (local53 = 0; local53 < 4; local53++) {
					if (local47 == anIntArray284[local53]) {
						aBooleanArray66[local53] = true;
						continue label72;
					}
				}
				anIntArray283[i++] = local47;
			}
			for (local47 = 0; local47 < i; local47++) {
				for (local53 = 0; local53 < 4; local53++) {
					if (!aBooleanArray66[local53]) {
						anIntArray284[local53] = anIntArray283[local47];
						aBooleanArray66[local53] = true;
						method2403(local53, lights[anIntArray283[local47]], x, y, z);
						break;
					}
				}
			}
			for (local47 = 0; local47 < 4; local47++) {
				if (!aBooleanArray66[local47]) {
					anIntArray284[local47] = -1;
					disableLight(local47);
				}
			}
			anInt3031 = level;
			anInt3033 = nodeX;
			anInt3029 = nodeY;
			anInt3035 = nodeX;
			anInt3030 = nodeY;
			return;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public static void method2394(@OriginalArg(0) int time, @OriginalArg(1) boolean arg1) {
		for (@Pc(1) int i = 0; i < lightCount; i++) {
			lights[i].method1765(arg1, time);
		}
		anInt3031 = -1;
		anInt3033 = -1;
		anInt3029 = -1;
		anInt3035 = -1;
		anInt3030 = -1;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
	public static void calculateLightRadiuses() {
		for (@Pc(1) int i = 0; i < lightCount; i++) {
			@Pc(8) Light light = lights[i];
			@Pc(11) int minLevel = light.level;
			if (light.shineOnLowerLevels) {
				minLevel = 0;
			}
			@Pc(19) int maxLevel = light.level;
			if (light.shineOnHigherLevels) {
				maxLevel = 3;
			}
			for (@Pc(26) int level = minLevel; level <= maxLevel; level++) {
				@Pc(31) int local31 = 0;
				@Pc(39) int local39 = (light.z >> 7) - light.radius;
				if (local39 < 0) {
					local31 = -local39;
					local39 = 0;
				}
				@Pc(55) int local55 = (light.z >> 7) + light.radius;
				if (local55 > length - 1) {
					local55 = length - 1;
				}
				for (@Pc(66) int local66 = local39; local66 <= local55; local66++) {
					@Pc(75) short local75 = light.aShortArray30[local31++];
					@Pc(87) int local87 = (light.x >> 7) + (local75 >> 8) - light.radius;
					@Pc(95) int local95 = local87 + (local75 & 0xFF) - 1;
					if (local87 < 0) {
						local87 = 0;
					}
					if (local95 > width - 1) {
						local95 = width - 1;
					}
					for (@Pc(110) int local110 = local87; local110 <= local95; local110++) {
						@Pc(121) int local121 = anIntArrayArrayArray11[level][local110][local66];
						if ((local121 & 0xFF) == 0) {
							anIntArrayArrayArray11[level][local110][local66] = local121 | i + 1;
						} else if ((local121 & 0xFF00) == 0) {
							anIntArrayArrayArray11[level][local110][local66] = local121 | i + 1 << 8;
						} else if ((local121 & 0xFF0000) == 0) {
							anIntArrayArrayArray11[level][local110][local66] = local121 | i + 1 << 16;
						} else if ((local121 & 0xFF000000) == 0) {
							anIntArrayArrayArray11[level][local110][local66] = local121 | i + 1 << 24;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	private static void disableLight(@OriginalArg(0) int i) {
		if (enabledLights[i]) {
			enabledLights[i] = false;
			@Pc(14) int light = i + 16384 + 4;
			@Pc(16) GL2 gl = GlRenderer.gl;
			gl.glDisable(light);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
	public static void method2397(@OriginalArg(0) int level, @OriginalArg(1) int tileX, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int tileZ) {
		if (!Preferences.highDetailLighting) {
			return;
		}
		label43:
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (anIntArray284[local4] != -1) {
				@Pc(20) int local20 = anIntArrayArrayArray11[level][tileX][arg2];
				@Pc(28) int local28;
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray284[local4]) {
						continue label43;
					}
				}
				local20 = anIntArrayArrayArray11[level][arg3][tileZ];
				while (local20 != 0) {
					local28 = (local20 & 0xFF) - 1;
					local20 >>>= 0x8;
					if (local28 == anIntArray284[local4]) {
						continue label43;
					}
				}
			}
			anIntArray284[local4] = -1;
			disableLight(local4);
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()V")
	public static void clear() {
		lights = null;
		anIntArray284 = null;
		enabledLights = null;
		anIntArray283 = null;
		aBooleanArray66 = null;
		anIntArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "()V")
	public static void method2400() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		@Pc(3) int local3;
		for (local3 = 0; local3 < 4; local3++) {
			@Pc(10) int local10 = local3 + 16388;
			local1.glLightfv(local10, GL2.GL_AMBIENT, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
			local1.glLightf(local10, GL2.GL_LINEAR_ATTENUATION, 0.0F);
			local1.glLightf(local10, GL2.GL_CONSTANT_ATTENUATION, 0.0F);
		}
		for (local3 = 0; local3 < 4; local3++) {
			anIntArray284[local3] = -1;
			disableLight(local3);
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "()V")
	public static void init() {
		lights = new Light[255];
		anIntArray284 = new int[4];
		enabledLights = new boolean[4];
		anIntArray283 = new int[4];
		aBooleanArray66 = new boolean[4];
		anIntArrayArrayArray11 = new int[levels][width][length];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[[[Lclient!bj;)V")
	public static void method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Tile[][][] arg2) {
		if (!Preferences.highDetailLighting) {
			return;
		}
		@Pc(4) GL2 gl = GlRenderer.gl;
		MaterialManager.setMaterial(0, 0);
		GlRenderer.setTextureCombineRgbMode(0);
		GlRenderer.resetTextureMatrix();
		GlRenderer.setTextureId(GlRenderer.anInt5328);
		gl.glDepthMask(false);
		GlRenderer.setLightingEnabled(false);
		gl.glBlendFunc(GL2.GL_DST_COLOR, GL2.GL_ONE);
		gl.glFogfv(GL2.GL_FOG_COLOR, new float[]{0.0F, 0.0F, 0.0F, 0.0F}, 0);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_CONSTANT);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_ALPHA);
		label71:
		for (@Pc(56) int i = 0; i < lightCount; i++) {
			@Pc(63) Light light = lights[i];
			@Pc(66) int lightLevel = light.level;
			if (light.aBoolean125) {
				lightLevel--;
			}
			if (light.aClass45_1 != null) {
				@Pc(76) int difference = 0;
				@Pc(84) int negativeRadiusEdge = (light.z >> 7) - light.radius;
				@Pc(92) int positiveRadiusEdge = (light.z >> 7) + light.radius;
				if (positiveRadiusEdge >= maximumVisibleZ) {
					positiveRadiusEdge = maximumVisibleZ - 1;
				}
				if (negativeRadiusEdge < minimumVisibleZ) {
					difference = minimumVisibleZ - negativeRadiusEdge;
					negativeRadiusEdge = minimumVisibleZ;
				}
				for (@Pc(112) int zD = negativeRadiusEdge; zD <= positiveRadiusEdge; zD++) {
					@Pc(121) short local121 = light.aShortArray30[difference++];
					@Pc(133) int radiusLeftEdge = (light.x >> 7) + (local121 >> 8) - light.radius;
					@Pc(141) int radiusRightEdge = radiusLeftEdge + (local121 & 0xFF) - 1;
					if (radiusLeftEdge < minimumVisibleX) {
						radiusLeftEdge = minimumVisibleX;
					}
					if (radiusRightEdge >= maximumVisibleX) {
						radiusRightEdge = maximumVisibleX - 1;
					}
					for (@Pc(155) int xD = radiusLeftEdge; xD <= radiusRightEdge; xD++) {
						@Pc(160) Tile tile = null;
						if (lightLevel >= 0) {
							tile = arg2[lightLevel][xD][zD];
						}
						if (lightLevel < 0 || tile != null && tile.aBoolean45) {
							GlRenderer.method4159(201.5F - (float) light.level * 50.0F - 1.5F);
							gl.glTexEnvfv(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_COLOR, new float[]{0.0F, 0.0F, 0.0F, light.alpha}, 0);
							light.aClass45_1.method1556();
							continue label71;
						}
					}
				}
			}
		}
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		gl.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glDepthMask(true);
		gl.glFogfv(GL2.GL_FOG_COLOR, FogManager.fogColor, 0);
		gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
		GlRenderer.restoreLighting();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!gi;III)V")
	private static void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) Light arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 16384 + 4;
		@Pc(7) GL2 gl = GlRenderer.gl;
		if (!enabledLights[arg0]) {
			gl.glEnable(local5);
			enabledLights[arg0] = true;
		}
		gl.glLightf(local5, GL2.GL_QUADRATIC_ATTENUATION, arg1.aFloat9);
		gl.glLightfv(local5, GL2.GL_DIFFUSE, arg1.diffuse, 0);
		aFloatArray17[0] = arg1.x - arg2;
		aFloatArray17[1] = arg1.y - arg3;
		aFloatArray17[2] = arg1.z - arg4;
		gl.glLightfv(local5, GL2.GL_POSITION, aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "()V")
	public static void method2404() {
		lightCount = 0;
		for (@Pc(3) int level = 0; level < levels; level++) {
			for (@Pc(8) int x = 0; x < width; x++) {
				for (@Pc(13) int z = 0; z < length; z++) {
					anIntArrayArrayArray11[level][x][z] = 0;
				}
			}
		}
	}

}
