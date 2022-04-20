import java.nio.ByteBuffer;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class SpecularMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	private int anInt5777 = -1;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "[I")
	private int[] anIntArray519 = null;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public SpecularMaterialRenderer() {
		if (GlRenderer.arbTextureCubeMapSupported && GlRenderer.maxTextureUnits >= 2) {
			this.method4536();
			@Pc(19) GL2 local19 = GlRenderer.gl;
			local19.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[0]);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_R, GL2.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_S, GL2.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_T, GL2.GL_CLAMP_TO_EDGE);
			local19.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[1]);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_R, GL2.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_S, GL2.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_T, GL2.GL_CLAMP_TO_EDGE);
			local19.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[2]);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_R, GL2.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_S, GL2.GL_CLAMP_TO_EDGE);
			local19.glTexParameteri(GL2.GL_TEXTURE_CUBE_MAP, GL2.GL_TEXTURE_WRAP_T, GL2.GL_CLAMP_TO_EDGE);
			this.aBoolean301 = GlRenderer.maxTextureUnits < 3;
		}
		this.method4535();
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "()V")
	private void method4535() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		this.anInt5777 = local1.glGenLists(2);
		local1.glNewList(this.anInt5777, GL2.GL_COMPILE);
		if (this.anIntArray519 == null) {
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PRIMARY_COLOR);
		} else {
			local1.glActiveTexture(GL2.GL_TEXTURE1);
			local1.glTexGeni(GL2.GL_S, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_NORMAL_MAP);
			local1.glTexGeni(GL2.GL_T, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_NORMAL_MAP);
			local1.glTexGeni(GL2.GL_R, GL2.GL_TEXTURE_GEN_MODE, GL2.GL_NORMAL_MAP);
			local1.glEnable(GL2.GL_TEXTURE_GEN_S);
			local1.glEnable(GL2.GL_TEXTURE_GEN_T);
			local1.glEnable(GL2.GL_TEXTURE_GEN_R);
			local1.glEnable(GL2.GL_TEXTURE_CUBE_MAP);
			local1.glMatrixMode(GL2.GL_TEXTURE);
			local1.glLoadIdentity();
			local1.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			local1.glMatrixMode(GL2.GL_MODELVIEW);
			if (this.aBoolean301) {
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_ADD);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_ALPHA);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_REPLACE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PRIMARY_COLOR);
			} else {
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_REPLACE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_PREVIOUS);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
				local1.glActiveTexture(GL2.GL_TEXTURE2);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_COMBINE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_ADD);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_PREVIOUS);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC1_RGB, GL2.GL_PREVIOUS);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND1_RGB, GL2.GL_SRC_ALPHA);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_REPLACE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PRIMARY_COLOR);
				local1.glBindTexture(GL2.GL_TEXTURE_2D, GlRenderer.anInt5328);
				local1.glEnable(GL2.GL_TEXTURE_2D);
			}
			local1.glActiveTexture(GL2.GL_TEXTURE0);
		}
		local1.glEndList();
		local1.glNewList(this.anInt5777 + 1, GL2.GL_COMPILE);
		if (this.anIntArray519 == null) {
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
		} else {
			local1.glActiveTexture(GL2.GL_TEXTURE1);
			local1.glDisable(GL2.GL_TEXTURE_GEN_S);
			local1.glDisable(GL2.GL_TEXTURE_GEN_T);
			local1.glDisable(GL2.GL_TEXTURE_GEN_R);
			local1.glDisable(GL2.GL_TEXTURE_CUBE_MAP);
			local1.glMatrixMode(GL2.GL_TEXTURE);
			local1.glLoadIdentity();
			local1.glMatrixMode(GL2.GL_MODELVIEW);
			if (this.aBoolean301) {
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND0_RGB, GL2.GL_SRC_COLOR);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
			} else {
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
				local1.glActiveTexture(GL2.GL_TEXTURE2);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_TEXTURE_ENV_MODE, GL2.GL_MODULATE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_OPERAND1_RGB, GL2.GL_SRC_COLOR);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_ALPHA, GL2.GL_MODULATE);
				local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
				local1.glDisable(GL2.GL_TEXTURE_2D);
			}
			local1.glActiveTexture(GL2.GL_TEXTURE0);
		}
		local1.glEndList();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	@Override
	public final void method4602() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (Static178.highDetailLighting) {
			local1.glCallList(this.anInt5777 + 1);
		} else {
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_TEXTURE);
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "()I")
	@Override
	public final int method4605() {
		return 4;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "()V")
	@Override
	public final void method4603() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		GlRenderer.setTextureCombineAlphaMode(1);
		if (Static178.highDetailLighting) {
			local1.glCallList(this.anInt5777);
		} else {
			local1.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_ALPHA, GL2.GL_PRIMARY_COLOR);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	@Override
	public final void method4604(@OriginalArg(0) int arg0) {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (Static178.highDetailLighting && this.anIntArray519 != null) {
			local1.glActiveTexture(GL2.GL_TEXTURE1);
			local1.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[arg0 - 1]);
			local1.glActiveTexture(GL2.GL_TEXTURE0);
		}
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "()V")
	private void method4536() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (this.anIntArray519 == null) {
			this.anIntArray519 = new int[3];
			local1.glGenTextures(3, this.anIntArray519, 0);
		}
		@Pc(19) byte[] local19 = new byte[4096];
		@Pc(22) byte[] local22 = new byte[4096];
		@Pc(25) byte[] local25 = new byte[4096];
		for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < 64; local34++) {
				for (@Pc(39) int local39 = 0; local39 < 64; local39++) {
					@Pc(51) float local51 = (float) local39 * 2.0F / 64.0F - 1.0F;
					@Pc(60) float local60 = (float) local34 * 2.0F / 64.0F - 1.0F;
					@Pc(75) float local75 = (float) (1.0D / Math.sqrt((double) (local51 * local51 + local60 * local60 + 1.0F)));
					@Pc(79) float local79 = local51 * local75;
					@Pc(83) float local83 = local60 * local75;
					@Pc(88) float local88;
					if (local27 == 0) {
						local88 = -local79;
					} else if (local27 == 1) {
						local88 = local79;
					} else if (local27 == 2) {
						local88 = local83;
					} else if (local27 == 3) {
						local88 = -local83;
					} else if (local27 == 4) {
						local88 = local75;
					} else {
						local88 = -local75;
					}
					@Pc(129) int local129;
					@Pc(137) int local137;
					@Pc(145) int local145;
					if (local88 > 0.0F) {
						local129 = (int) (Math.pow((double) local88, 96.0D) * 255.0D);
						local137 = (int) (Math.pow((double) local88, 36.0D) * 255.0D);
						local145 = (int) (Math.pow((double) local88, 12.0D) * 255.0D);
					} else {
						local145 = 0;
						local137 = 0;
						local129 = 0;
					}
					if (GlRenderer.maxTextureUnits < 3) {
						local129 /= 5;
						local137 /= 5;
						local145 /= 5;
					} else {
						local129 /= 2;
						local137 /= 2;
						local145 /= 2;
					}
					local22[local32] = (byte) local129;
					local25[local32] = (byte) local137;
					local19[local32] = (byte) local145;
					local32++;
				}
			}
			local1.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[0]);
			local1.glTexImage2D(local27 + GL2.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, GL2.GL_ALPHA, 64, 64, 0, GL2.GL_ALPHA, GL2.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local22));
			local1.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[1]);
			local1.glTexImage2D(local27 + GL2.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, GL2.GL_ALPHA, 64, 64, 0, GL2.GL_ALPHA, GL2.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local25));
			local1.glBindTexture(GL2.GL_TEXTURE_CUBE_MAP, this.anIntArray519[2]);
			local1.glTexImage2D(local27 + GL2.GL_TEXTURE_CUBE_MAP_POSITIVE_X, 0, GL2.GL_ALPHA, 64, 64, 0, GL2.GL_ALPHA, GL2.GL_UNSIGNED_BYTE, ByteBuffer.wrap(local19));
			Static63.anInt1942 += 12288;
		}
	}
}
