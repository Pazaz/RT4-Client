package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

public class MaterialManager {
	public static final int WATER = 4;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public static int currentType = 0;
	@OriginalMember(owner = "client!je", name = "R", descriptor = "Z")
	public static boolean renderingUnderwater = false;
	@OriginalMember(owner = "client!aa", name = "t", descriptor = "[Lclient!pc;")
	public static MaterialRenderer[] renderers;
	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
	public static int currentArg = 0;
	@OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
	public static int anInt5158;
	@OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
	public static int anInt1815;
	@OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
	public static int anInt5559;
	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public static int anInt406;
	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public static int anInt4675;
	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
	public static boolean allows3DTextureMapping;
	@OriginalMember(owner = "client!lm", name = "a", descriptor = "[I")
	public static int[] waterfallTextures = null;
	@OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
	public static int[] anIntArray341 = null;
	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int texture3D = -1;
	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public static int waterfallTextureId = -1;
	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer6;
	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer textureBuffer;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
	public static void setMaterial(@OriginalArg(1) int arg, @OriginalArg(2) int type) {
		if (type == 4 && !Preferences.highWaterDetail) {
			type = 2;
			arg = 2;
		}
		if (currentType != type) {
			if (renderingUnderwater) {
				return;
			}
			if (currentType != 0) {
				renderers[currentType].unbind();
			}
			if (type != 0) {
				@Pc(61) MaterialRenderer renderer = renderers[type];
				renderer.bind();
				renderer.setArgument(arg);
			}
			currentType = type;
			currentArg = arg;
		} else if (type != 0 && arg != currentArg) {
			renderers[type].setArgument(arg);
			currentArg = arg;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public static void resetArgument(@OriginalArg(1) int arg0) {
		if (arg0 == currentType) {
			@Pc(12) MaterialRenderer local12 = renderers[arg0];
			local12.setArgument(currentArg);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)I")
	public static int getFlags() {
		return currentType == 0 ? 0 : renderers[currentType].getFlags();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void quit() {
		renderers = null;
		method2808();
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public static void init() {
		method2809();
		renderers = new MaterialRenderer[7];
		renderers[1] = new SpecularMaterialRenderer();
		renderers[2] = new LiquidMaterialRenderer();
		renderers[3] = new UnderwaterMaterialRenderer();
		renderers[4] = new WaterMaterialRenderer();
		renderers[5] = new WaterfallMaterialRenderer();
		renderers[6] = new UnlitMaterialRenderer();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZI)V")
	public static void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		anInt5158 = arg1;
		anInt1815 = arg4;
		anInt5559 = arg0;
		anInt406 = arg3;
		anInt4675 = arg2;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	public static void method2807() {
		@Pc(11) byte[] local11;
		if (textureBuffer == null) {
			@Pc(5) MaterialManager_Class106_Sub1_Sub1 local5 = new MaterialManager_Class106_Sub1_Sub1();
			local11 = local5.method3215();
			textureBuffer = ByteBuffer.allocateDirect(local11.length);
			textureBuffer.position(0);
			textureBuffer.put(local11);
			textureBuffer.flip();
		}
		if (aByteBuffer6 == null) {
			@Pc(32) MaterialManager_Class106_Sub2_Sub1 local32 = new MaterialManager_Class106_Sub2_Sub1();
			local11 = local32.method3854();
			aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer6.position(0);
			aByteBuffer6.put(local11);
			aByteBuffer6.flip();
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	public static void method2808() {
		@Pc(4) GL2 local4;
		@Pc(11) int[] local11;
		if (texture3D != -1) {
			local4 = GlRenderer.gl;
			local11 = new int[]{texture3D};
			local4.glDeleteTextures(1, local11, 0);
			texture3D = -1;
			GlCleaner.onCardTexture -= textureBuffer.limit() * 2;
		}
		if (anIntArray341 != null) {
			local4 = GlRenderer.gl;
			local4.glDeleteTextures(64, anIntArray341, 0);
			anIntArray341 = null;
			GlCleaner.onCardTexture -= textureBuffer.limit() * 2;
		}
		if (waterfallTextureId != -1) {
			local4 = GlRenderer.gl;
			local11 = new int[]{waterfallTextureId};
			local4.glDeleteTextures(1, local11, 0);
			waterfallTextureId = -1;
			GlCleaner.onCardTexture -= aByteBuffer6.limit() * 2;
		}
		if (waterfallTextures != null) {
			local4 = GlRenderer.gl;
			local4.glDeleteTextures(64, waterfallTextures, 0);
			waterfallTextures = null;
			GlCleaner.onCardTexture -= aByteBuffer6.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()V")
	public static void method2809() {
		allows3DTextureMapping = GlRenderer.extTexture3dSupported;
		method2807();
		method2811();
		method2812();
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "()V")
	private static void method2811() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (allows3DTextureMapping) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(GL2.GL_TEXTURE_3D, local6[0]);
			textureBuffer.position(0);
			local1.glTexImage3D(GL2.GL_TEXTURE_3D, 0, GL2.GL_LUMINANCE_ALPHA, 64, 64, 64, 0, GL2.GL_LUMINANCE_ALPHA, GL2.GL_UNSIGNED_BYTE, textureBuffer);
			local1.glTexParameteri(GL2.GL_TEXTURE_3D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local1.glTexParameteri(GL2.GL_TEXTURE_3D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			texture3D = local6[0];
			GlCleaner.onCardTexture += textureBuffer.limit() * 2;
		} else {
			anIntArray341 = new int[64];
			local1.glGenTextures(64, anIntArray341, 0);
			for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
				GlRenderer.setTextureId(anIntArray341[local65]);
				textureBuffer.position(local65 * 64 * 64 * 2);
				local1.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_LUMINANCE_ALPHA, 64, 64, 0, GL2.GL_LUMINANCE_ALPHA, GL2.GL_UNSIGNED_BYTE, textureBuffer);
				local1.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
				local1.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			}
			GlCleaner.onCardTexture += textureBuffer.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "()V")
	private static void method2812() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (allows3DTextureMapping) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(GL2.GL_TEXTURE_3D, local6[0]);
			aByteBuffer6.position(0);
			local1.glTexImage3D(GL2.GL_TEXTURE_3D, 0, GL2.GL_LUMINANCE_ALPHA, 64, 64, 64, 0, GL2.GL_LUMINANCE_ALPHA, GL2.GL_UNSIGNED_BYTE, aByteBuffer6);
			local1.glTexParameteri(GL2.GL_TEXTURE_3D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local1.glTexParameteri(GL2.GL_TEXTURE_3D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			waterfallTextureId = local6[0];
			GlCleaner.onCardTexture += aByteBuffer6.limit() * 2;
			return;
		}
		waterfallTextures = new int[64];
		local1.glGenTextures(64, waterfallTextures, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			GlRenderer.setTextureId(waterfallTextures[local65]);
			aByteBuffer6.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_LUMINANCE_ALPHA, 64, 64, 0, GL2.GL_LUMINANCE_ALPHA, GL2.GL_UNSIGNED_BYTE, aByteBuffer6);
			local1.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local1.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
		}
		GlCleaner.onCardTexture += aByteBuffer6.limit() * 2;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	public static void method2761(@OriginalArg(0) int arg0) {
		UnderwaterMaterialRenderer.anInt3241 = arg0;
		resetArgument(3);
		resetArgument(4);
	}
}
