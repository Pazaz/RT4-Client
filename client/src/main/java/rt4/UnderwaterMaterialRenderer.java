package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!wg")
public final class UnderwaterMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	public static boolean aBoolean308 = false;
	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	public static int anInt3241 = 128;
	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	private int anInt5805 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[F")
	private final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	private int anInt5806 = -1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public UnderwaterMaterialRenderer() {
		if (GlRenderer.maxTextureUnits >= 2) {
			@Pc(17) int[] local17 = new int[1];
			@Pc(20) byte[] local20 = new byte[8];
			@Pc(22) int local22 = 0;
			while (local22 < 8) {
				local20[local22++] = (byte) (local22 * 159 / 8 + 96);
			}
			@Pc(40) GL2 local40 = GlRenderer.gl;
			local40.glGenTextures(1, local17, 0);
			local40.glBindTexture(GL2.GL_TEXTURE_1D, local17[0]);
			local40.glTexImage1D(GL2.GL_TEXTURE_1D, 0, GL2.GL_ALPHA, 8, 0, GL2.GL_ALPHA, GL2.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local20));
			local40.glTexParameteri(GL2.GL_TEXTURE_1D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local40.glTexParameteri(GL2.GL_TEXTURE_1D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			local40.glTexParameteri(GL2.GL_TEXTURE_1D, GL2.GL_TEXTURE_WRAP_S, GL2.GL_CLAMP_TO_EDGE);
			this.anInt5805 = local17[0];
			aBoolean308 = GlRenderer.maxTextureUnits > 2 && GlRenderer.extTexture3dSupported;
			this.method4606();
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "()I")
	public static int method4607() {
		return aBoolean308 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "()V")
	public static void method4608() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glClientActiveTexture(method4607());
		local1.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL2.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "()V")
	public static void method4609() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glClientActiveTexture(method4607());
		local1.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL2.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	public static void applyFogFade() {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glDisableClientState(GL2.GL_COLOR_ARRAY);
		GlRenderer.setLightingEnabled(false);
		gl.glDisable(GL2.GL_DEPTH_TEST);
		gl.glPushAttrib(GL2.GL_FOG_BIT);
		gl.glFogf(GL2.GL_FOG_START, (float) GlobalConfig.VIEW_DISTANCE - (GlobalConfig.VIEW_FADE_DISTANCE * 2.0f));
		GlRenderer.disableDepthMask();
		try {
			for (@Pc(19) int i = 0; i < SceneGraph.surfaceHdTiles[0].length; i++) {
				@Pc(31) GlTile tile = SceneGraph.surfaceHdTiles[0][i];
				if (tile.texture >= 0 && Rasteriser.textureProvider.getMaterialType(tile.texture) == MaterialManager.WATER) {
					gl.glColor4fv(ColorUtils.getRgbFloat(tile.underwaterColor), 0);
					@Pc(57) float f = 201.5F - (tile.blend ? 1.0F : 0.5F);
					tile.method1944(SceneGraph.tiles, f, true);
				}
			}
		} catch (Exception ignored) {
		}
		gl.glEnableClientState(GL2.GL_COLOR_ARRAY);
		GlRenderer.restoreLighting();
		gl.glEnable(GL2.GL_DEPTH_TEST);
		gl.glPopAttrib();
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()V")
	private void method4606() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		this.anInt5806 = local1.glGenLists(2);
		local1.glNewList(this.anInt5806, GL2.GL_COMPILE);
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		if (aBoolean308) {
			local1.glBindTexture(GL2.GL_TEXTURE_3D, MaterialManager.texture3D);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_ADD);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_REPLACE);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PREVIOUS);
			local1.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
			local1.glTexGeni(GL2.GL_R, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
			local1.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
			local1.glTexGeni(GL2.GL_Q, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			local1.glTexGenfv(GL2.GL_Q, GL2.GL_OBJECT_PLANE, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
			local1.glEnable(GL2.GL_TEXTURE_GEN_S);
			local1.glEnable(GL2.GL_TEXTURE_GEN_T);
			local1.glEnable(GL2.GL_TEXTURE_GEN_R);
			local1.glEnable(GL2.GL_TEXTURE_GEN_Q);
			local1.glEnable(GL2.GL_TEXTURE_3D);
			local1.glActiveTexture(GL2.GL_TEXTURE2);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_COMBINE);
		}
		local1.glBindTexture(GL2.GL_TEXTURE_1D, this.anInt5805);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_INTERPOLATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_CONSTANT);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC2_RGB, GL2.GL_TEXTURE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_REPLACE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PREVIOUS);
		local1.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
		local1.glEnable(GL2.GL_TEXTURE_1D);
		local1.glEnable(GL2.GL_TEXTURE_GEN_S);
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		local1.glEndList();
		local1.glNewList(this.anInt5806 + 1, GL2.GL_COMPILE);
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		if (aBoolean308) {
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
			local1.glDisable(GL2.GL_TEXTURE_GEN_S);
			local1.glDisable(GL2.GL_TEXTURE_GEN_T);
			local1.glDisable(GL2.GL_TEXTURE_GEN_R);
			local1.glDisable(GL2.GL_TEXTURE_GEN_Q);
			local1.glDisable(GL2.GL_TEXTURE_3D);
			local1.glActiveTexture(GL2.GL_TEXTURE2);
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_MODULATE);
		}
		local1.glTexEnvfv(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_COLOR, new float[]{0.0F, 1.0F, 0.0F, 1.0F}, 0);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC2_RGB, GL2.GL_CONSTANT);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
		local1.glDisable(GL2.GL_TEXTURE_1D);
		local1.glDisable(GL2.GL_TEXTURE_GEN_S);
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		local1.glEndList();
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glCallList(this.anInt5806);
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glCallList(this.anInt5806 + 1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg0) {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		if (aBoolean308 || arg0 >= 0) {
			local1.glPushMatrix();
			local1.glLoadIdentity();
			local1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) MaterialManager.anInt5559 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			local1.glRotatef((float) MaterialManager.anInt1815 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			local1.glTranslatef((float) -MaterialManager.anInt406, (float) -MaterialManager.anInt4675, (float) -MaterialManager.anInt5158);
			if (aBoolean308) {
				this.aFloatArray29[0] = 0.001F;
				this.aFloatArray29[1] = 9.0E-4F;
				this.aFloatArray29[2] = 0.0F;
				this.aFloatArray29[3] = 0.0F;
				local1.glTexGenfv(GL2.GL_S, GL2.GL_EYE_PLANE, this.aFloatArray29, 0);
				this.aFloatArray29[0] = 0.0F;
				this.aFloatArray29[1] = 9.0E-4F;
				this.aFloatArray29[2] = 0.001F;
				this.aFloatArray29[3] = 0.0F;
				local1.glTexGenfv(GL2.GL_T, GL2.GL_EYE_PLANE, this.aFloatArray29, 0);
				this.aFloatArray29[0] = 0.0F;
				this.aFloatArray29[1] = 0.0F;
				this.aFloatArray29[2] = 0.0F;
				this.aFloatArray29[3] = (float) GlRenderer.anInt5323 * 0.005F;
				local1.glTexGenfv(GL2.GL_R, GL2.GL_EYE_PLANE, this.aFloatArray29, 0);
				local1.glActiveTexture(GL2.GL_TEXTURE2);
			}
			local1.glTexEnvfv(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_COLOR, WaterMaterialRenderer.method2422(), 0);
			if (arg0 >= 0) {
				this.aFloatArray29[0] = 0.0F;
				this.aFloatArray29[1] = 1.0F / (float) anInt3241;
				this.aFloatArray29[2] = 0.0F;
				this.aFloatArray29[3] = (float) arg0 * 1.0F / (float) anInt3241;
				local1.glTexGenfv(GL2.GL_S, GL2.GL_EYE_PLANE, this.aFloatArray29, 0);
				local1.glEnable(GL2.GL_TEXTURE_GEN_S);
			} else {
				local1.glDisable(GL2.GL_TEXTURE_GEN_S);
			}
			local1.glPopMatrix();
		} else {
			local1.glDisable(GL2.GL_TEXTURE_GEN_S);
		}
		local1.glActiveTexture(GL2.GL_TEXTURE0);
	}
}
