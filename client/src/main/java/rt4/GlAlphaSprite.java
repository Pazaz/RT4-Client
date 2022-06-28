package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!el")
public final class GlAlphaSprite extends GlSprite {

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIII[I)V")
	public GlAlphaSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!mm;)V")
	public GlAlphaSprite(@OriginalArg(0) SoftwareSprite arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([I)V")
	@Override
	protected final void method1430(@OriginalArg(0) int[] arg0) {
		this.powerOfTwoWidth = IntUtils.clp2(this.width);
		this.powerOfTwoHeight = IntUtils.clp2(this.height);
		@Pc(20) byte[] local20 = new byte[this.powerOfTwoWidth * this.powerOfTwoHeight * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.powerOfTwoWidth - this.width) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.height; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.width; local40++) {
				@Pc(49) int local49 = arg0[local24++];
				if (local49 == 0) {
					local22 += 4;
				} else {
					local20[local22++] = (byte) (local49 >> 16);
					local20[local22++] = (byte) (local49 >> 8);
					local20[local22++] = (byte) local49;
					local20[local22++] = (byte) (local49 >> 24);
				}
			}
			local22 += local32;
		}
		@Pc(94) ByteBuffer local94 = ByteBuffer.wrap(local20);
		@Pc(96) GL2 local96 = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(103) int[] local103 = new int[1];
			local96.glGenTextures(1, local103, 0);
			this.textureId = local103[0];
		}
		GlRenderer.setTextureId(this.textureId);
		local96.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, 0, GL2.GL_RGBA, GL2.GL_UNSIGNED_BYTE, local94);
		GlCleaner.onCard2d += local94.limit() - this.anInt1869;
		this.anInt1869 = local94.limit();
	}
}
