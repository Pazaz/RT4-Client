import java.nio.ByteBuffer;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class GlIndexedSprite extends IndexedSprite {

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	private int anInt4285;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	private int anInt4286;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	private int anInt4287;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	private int anInt4281 = -1;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	private int anInt4283 = 0;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	private int anInt4282 = -1;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	private int anInt4284 = 0;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public GlIndexedSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4279 = arg0;
		this.anInt4276 = arg1;
		this.anInt4280 = arg2;
		this.anInt4273 = arg3;
		this.anInt4270 = arg4;
		this.anInt4278 = arg5;
		this.method3337(arg6, arg7);
		this.method3339();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([B[I)V")
	private void method3337(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1) {
		this.anInt4287 = Static165.method3164(this.anInt4270);
		this.anInt4286 = Static165.method3164(this.anInt4278);
		@Pc(20) byte[] local20 = new byte[this.anInt4287 * this.anInt4286 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt4278; local26++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt4270; local32++) {
				@Pc(41) byte local41 = arg0[local24++];
				if (local41 == 0) {
					local22 += 4;
				} else {
					@Pc(47) int local47 = arg1[local41];
					local20[local22++] = (byte) (local47 >> 16);
					local20[local22++] = (byte) (local47 >> 8);
					local20[local22++] = (byte) local47;
					local20[local22++] = -1;
				}
			}
			local22 += (this.anInt4287 - this.anInt4270) * 4;
		}
		@Pc(93) ByteBuffer local93 = ByteBuffer.wrap(local20);
		@Pc(95) GL2 local95 = GlRenderer.gl;
		if (this.anInt4281 == -1) {
			@Pc(102) int[] local102 = new int[1];
			local95.glGenTextures(1, local102, 0);
			this.anInt4281 = local102[0];
			this.anInt4285 = Static63.anInt1943;
		}
		GlRenderer.setTextureId(this.anInt4281);
		local95.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_RGBA, this.anInt4287, this.anInt4286, 0, GL2.GL_RGBA, GL2.GL_UNSIGNED_BYTE, local93);
		Static63.anInt1944 += local93.limit() - this.anInt4284;
		this.anInt4284 = local93.limit();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
	@Override
	public final void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		GlRenderer.method4155();
		@Pc(5) int local5 = arg0 + this.anInt4280;
		@Pc(10) int local10 = arg1 + this.anInt4273;
		@Pc(12) GL2 local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.anInt4281);
		this.method3338();
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		local12.glCallList(this.anInt4282);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	private void method3338() {
		if (this.anInt4283 != 1) {
			this.anInt4283 = 1;
			@Pc(9) GL2 local9 = GlRenderer.gl;
			local9.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_NEAREST);
			local9.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	@Override
	public final void method3336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method4149();
		@Pc(5) int local5 = arg0 + this.anInt4280;
		@Pc(10) int local10 = arg1 + this.anInt4273;
		@Pc(12) GL2 local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.anInt4281);
		this.method3338();
		local12.glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		local12.glCallList(this.anInt4282);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt4281 != -1) {
			Static63.method1491(this.anInt4281, this.anInt4284, this.anInt4285);
			this.anInt4281 = -1;
			this.anInt4284 = 0;
		}
		if (this.anInt4282 != -1) {
			Static63.method1486(this.anInt4282, this.anInt4285);
			this.anInt4282 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	private void method3339() {
		@Pc(7) float local7 = (float) this.anInt4270 / (float) this.anInt4287;
		@Pc(15) float local15 = (float) this.anInt4278 / (float) this.anInt4286;
		@Pc(17) GL2 local17 = GlRenderer.gl;
		if (this.anInt4282 == -1) {
			this.anInt4282 = local17.glGenLists(1);
			this.anInt4285 = Static63.anInt1943;
		}
		local17.glNewList(this.anInt4282, GL2.GL_COMPILE);
		local17.glBegin(GL2.GL_TRIANGLE_FAN);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt4270, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt4278);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt4270, (float) -this.anInt4278);
		local17.glEnd();
		local17.glEndList();
	}
}
