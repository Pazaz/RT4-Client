import java.nio.ByteBuffer;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class WaterMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	private int anInt4440 = -1;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	private int anInt4441 = -1;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	private int anInt4442 = -1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public WaterMaterialRenderer() {
		this.method3435();
		this.method3437();
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()V")
	private void method3435() {
		@Pc(2) byte[] local2 = new byte[] { 0, -1 };
		@Pc(12) GL2 local12 = GlRenderer.gl;
		@Pc(15) int[] local15 = new int[1];
		local12.glGenTextures(1, local15, 0);
		local12.glBindTexture(GL2.GL_TEXTURE_1D, local15[0]);
		local12.glTexImage1D(GL2.GL_TEXTURE_1D, 0, GL2.GL_ALPHA, 2, 0, GL2.GL_ALPHA, GL2.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local2));
		local12.glTexParameteri(GL2.GL_TEXTURE_1D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
		local12.glTexParameteri(GL2.GL_TEXTURE_1D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
		local12.glTexParameteri(GL2.GL_TEXTURE_1D, GL2.GL_TEXTURE_WRAP_S, GL2.GL_CLAMP_TO_EDGE);
		this.anInt4441 = local15[0];
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "()V")
	private void method3437() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		this.anInt4440 = local1.glGenLists(2);
		local1.glNewList(this.anInt4440, GL2.GL_COMPILE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC1_RGB, GL2.GL_CONSTANT);
		local1.glTexEnvf(GL2.GL_TEXTURE_ENV, GL2.GL_RGB_SCALE, 2.0F);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2GL3.GL_SRC1_ALPHA, GL2.GL_CONSTANT);
		local1.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		local1.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
		local1.glTexGenfv(GL2.GL_S, GL2.GL_OBJECT_PLANE, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
		local1.glTexGenfv(GL2.GL_T, GL2.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
		local1.glEnable(GL2.GL_TEXTURE_GEN_S);
		local1.glEnable(GL2.GL_TEXTURE_GEN_T);
		if (Static151.aBoolean176) {
			local1.glBindTexture(GL2.GL_TEXTURE_3D, Static151.anInt3587);
			local1.glTexGeni(GL2.GL_R, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			local1.glTexGeni(GL2.GL_Q, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			local1.glTexGenfv(GL2.GL_Q, GL2.GL_OBJECT_PLANE, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local1.glEnable(GL2.GL_TEXTURE_GEN_R);
			local1.glEnable(GL2.GL_TEXTURE_GEN_Q);
			local1.glEnable(GL2.GL_TEXTURE_3D);
		}
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		local1.glEnable(GL2.GL_TEXTURE_1D);
		local1.glBindTexture(GL2.GL_TEXTURE_1D, this.anInt4441);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_INTERPOLATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_CONSTANT);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC2_RGB, GL2.GL_TEXTURE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_INTERPOLATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_CONSTANT);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC2_ALPHA, GL2.GL_TEXTURE);
		local1.glEnable(GL2.GL_TEXTURE_GEN_S);
		local1.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glEndList();
		local1.glNewList(this.anInt4440 + 1, GL2.GL_COMPILE);
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		local1.glDisable(GL2.GL_TEXTURE_1D);
		local1.glDisable(GL2.GL_TEXTURE_GEN_S);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC2_RGB, GL2.GL_CONSTANT);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC2_ALPHA, GL2.GL_CONSTANT);
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC1_RGB, GL2.GL_PREVIOUS);
		local1.glTexEnvf(GL2.GL_TEXTURE_ENV, GL2.GL_RGB_SCALE, 1.0F);
		local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2GL3.GL_SRC1_ALPHA, GL2.GL_PREVIOUS);
		local1.glDisable(GL2.GL_TEXTURE_GEN_S);
		local1.glDisable(GL2.GL_TEXTURE_GEN_T);
		if (Static151.aBoolean176) {
			local1.glDisable(GL2.GL_TEXTURE_GEN_R);
			local1.glDisable(GL2.GL_TEXTURE_GEN_Q);
			local1.glDisable(GL2.GL_TEXTURE_3D);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	@Override
	public final void method4602() {
		GlRenderer.gl.glCallList(this.anInt4440 + 1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public final void method4604(@OriginalArg(0) int arg0) {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glActiveTexture(GL2.GL_TEXTURE1);
		local1.glTexEnvfv(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_COLOR, Static257.aFloatArray2, 0);
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		if ((arg0 & 0x1) == 1) {
			if (!Static151.aBoolean176) {
				GlRenderer.setTextureId(Static151.anIntArray341[GlRenderer.anInt5323 * 64 / 100 % 64]);
			} else if (this.anInt4442 != GlRenderer.anInt5323) {
				this.aFloatArray23[0] = 0.0F;
				this.aFloatArray23[1] = 0.0F;
				this.aFloatArray23[2] = 0.0F;
				this.aFloatArray23[3] = (float) GlRenderer.anInt5323 * 0.005F;
				local1.glTexGenfv(GL2.GL_R, GL2.GL_OBJECT_PLANE, this.aFloatArray23, 0);
				this.anInt4442 = GlRenderer.anInt5323;
			}
		} else if (Static151.aBoolean176) {
			this.aFloatArray23[0] = 0.0F;
			this.aFloatArray23[1] = 0.0F;
			this.aFloatArray23[2] = 0.0F;
			this.aFloatArray23[3] = 0.0F;
			local1.glTexGenfv(GL2.GL_R, GL2.GL_OBJECT_PLANE, this.aFloatArray23, 0);
		} else {
			GlRenderer.setTextureId(Static151.anIntArray341[0]);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	@Override
	public final void method4603() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		GlRenderer.setTextureCombineRgbMode(2);
		GlRenderer.setTextureCombineAlphaMode(2);
		GlRenderer.resetTextureMatrix();
		local1.glCallList(this.anInt4440);
		@Pc(12) float local12 = 2662.4001F;
		local12 += (float) (Static254.anInt5559 - 128) * 0.5F;
		if (local12 >= 3328.0F) {
			local12 = 3327.0F;
		}
		this.aFloatArray23[0] = 0.0F;
		this.aFloatArray23[1] = 0.0F;
		this.aFloatArray23[2] = 1.0F / (local12 - 3328.0F);
		this.aFloatArray23[3] = local12 / (local12 - 3328.0F);
		local1.glTexGenfv(GL2.GL_S, GL2.GL_EYE_PLANE, this.aFloatArray23, 0);
		local1.glPopMatrix();
		local1.glActiveTexture(GL2.GL_TEXTURE0);
		local1.glTexEnvfv(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_COLOR, Static188.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	@Override
	public final int method4605() {
		return 15;
	}
}
