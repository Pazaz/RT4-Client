package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class WaterfallMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	private int anInt4236;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[F")
	private final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public WaterfallMaterialRenderer() {
		this.method3307();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()I")
	@Override
	public final int getFlags() {
		return 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public final void setArgument(@OriginalArg(0) int arg0) {
		@Pc(7) GL2 local7 = GlRenderer.gl;
		@Pc(18) float local18 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
		@Pc(27) float local27 = -0.01F * (float) ((arg0 & 0x3) + 1);
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(47) boolean local47 = (arg0 & 0x80) != 0;
		if (local47) {
			this.aFloatArray21[0] = local36;
			this.aFloatArray21[1] = 0.0F;
			this.aFloatArray21[2] = 0.0F;
			this.aFloatArray21[3] = 0.0F;
		} else {
			this.aFloatArray21[2] = local36;
			this.aFloatArray21[1] = 0.0F;
			this.aFloatArray21[3] = 0.0F;
			this.aFloatArray21[0] = 0.0F;
		}
		local7.glActiveTexture(GL2.GL_TEXTURE1);
		local7.glMatrixMode(GL2.GL_MODELVIEW);
		local7.glPushMatrix();
		local7.glLoadIdentity();
		local7.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) MaterialManager.anInt5559 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		local7.glRotatef((float) MaterialManager.anInt1815 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		local7.glTranslatef((float) -MaterialManager.anInt406, (float) -MaterialManager.anInt4675, (float) -MaterialManager.anInt5158);
		local7.glTexGenfv(GL2.GL_S, GL2.GL_EYE_PLANE, this.aFloatArray21, 0);
		this.aFloatArray21[3] = local27 * (float) GlRenderer.anInt5323;
		this.aFloatArray21[0] = 0.0F;
		this.aFloatArray21[2] = 0.0F;
		this.aFloatArray21[1] = local36;
		local7.glTexGenfv(GL2.GL_T, GL2.GL_EYE_PLANE, this.aFloatArray21, 0);
		local7.glPopMatrix();
		if (MaterialManager.allows3DTextureMapping) {
			this.aFloatArray21[3] = (float) GlRenderer.anInt5323 * local18;
			this.aFloatArray21[1] = 0.0F;
			this.aFloatArray21[0] = 0.0F;
			this.aFloatArray21[2] = 0.0F;
			local7.glTexGenfv(GL2.GL_R, GL2.GL_OBJECT_PLANE, this.aFloatArray21, 0);
		} else {
			@Pc(189) int local189 = (int) ((float) GlRenderer.anInt5323 * local18 * 64.0F);
			local7.glBindTexture(GL2.GL_TEXTURE_2D, MaterialManager.waterfallTextures[local189 % 64]);
		}
		local7.glActiveTexture(GL2.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	@Override
	public final void unbind() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glCallList(this.anInt4236 + 1);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	@Override
	public final void bind() {
		@Pc(5) GL2 local5 = GlRenderer.gl;
		local5.glCallList(this.anInt4236);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	private void method3307() {
		@Pc(3) GL2 local3 = GlRenderer.gl;
		this.anInt4236 = local3.glGenLists(2);
		local3.glNewList(this.anInt4236, GL2.GL_COMPILE);
		local3.glActiveTexture(GL2.GL_TEXTURE1);
		if (MaterialManager.allows3DTextureMapping) {
			local3.glBindTexture(GL2.GL_TEXTURE_3D, MaterialManager.waterfallTextureId);
			local3.glTexGeni(GL2.GL_R, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_OBJECT_LINEAR);
			local3.glEnable(GL2.GL_TEXTURE_GEN_R);
			local3.glEnable(GL2.GL_TEXTURE_3D);
		} else {
			local3.glEnable(GL2.GL_TEXTURE_2D);
		}
		local3.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
		local3.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_EYE_LINEAR);
		local3.glEnable(GL2.GL_TEXTURE_GEN_S);
		local3.glEnable(GL2.GL_TEXTURE_GEN_T);
		local3.glActiveTexture(GL2.GL_TEXTURE0);
		local3.glEndList();
		local3.glNewList(this.anInt4236 + 1, GL2.GL_COMPILE);
		local3.glActiveTexture(GL2.GL_TEXTURE1);
		if (MaterialManager.allows3DTextureMapping) {
			local3.glDisable(GL2.GL_TEXTURE_3D);
			local3.glDisable(GL2.GL_TEXTURE_GEN_R);
		} else {
			local3.glDisable(GL2.GL_TEXTURE_2D);
		}
		local3.glDisable(GL2.GL_TEXTURE_GEN_S);
		local3.glDisable(GL2.GL_TEXTURE_GEN_T);
		local3.glActiveTexture(GL2.GL_TEXTURE0);
		local3.glEndList();
	}
}
