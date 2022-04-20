import java.nio.ByteBuffer;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class GlFont extends Font {

	@OriginalMember(owner = "client!mb", name = "Gb", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!mb", name = "Hb", descriptor = "I")
	private int anInt3639;

	@OriginalMember(owner = "client!mb", name = "Ib", descriptor = "I")
	private int anInt3640;

	@OriginalMember(owner = "client!mb", name = "Fb", descriptor = "I")
	private int anInt3638 = -1;

	@OriginalMember(owner = "client!mb", name = "Eb", descriptor = "I")
	private int anInt3637 = 0;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public GlFont(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method2881(arg5);
		this.method2880();
	}

	@OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt3638 != -1) {
			Static63.method1491(this.anInt3638, this.anInt3637, this.anInt3639);
			this.anInt3638 = -1;
			this.anInt3637 = 0;
		}
		if (this.anIntArray349 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray349.length; local21++) {
				Static63.method1486(this.anIntArray349[local21], this.anInt3639);
			}
			this.anIntArray349 = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected final void method2854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL2 local4;
		if (Static46.aClass3_Sub2_Sub1_Sub2_1 == null) {
			GlRenderer.method4151();
			local4 = GlRenderer.gl;
			GlRenderer.setTextureId(this.anInt3638);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (GlRenderer.canvasHeight - arg2), 0.0F);
			local4.glCallList(this.anIntArray349[arg0]);
			local4.glLoadIdentity();
			return;
		}
		GlRenderer.method4151();
		local4 = GlRenderer.gl;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (GlRenderer.canvasHeight - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray343[arg0] / (float) this.anInt3640;
		@Pc(63) float local63 = local39 + (float) this.anIntArray345[arg0] / (float) this.anInt3640;
		GlRenderer.setTextureId(this.anInt3638);
		@Pc(68) GlSprite local68 = Static46.aClass3_Sub2_Sub1_Sub2_1;
		local4.glActiveTexture(GL2.GL_TEXTURE1);
		local4.glEnable(GL2.GL_TEXTURE_2D);
		local4.glBindTexture(GL2.GL_TEXTURE_2D, local68.anInt1872);
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_REPLACE);
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_PREVIOUS);
		@Pc(98) float local98 = (float) (arg1 - Static46.anInt1439) / (float) local68.anInt1870;
		@Pc(107) float local107 = (float) (arg2 - Static46.anInt1438) / (float) local68.anInt1874;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static46.anInt1439) / (float) local68.anInt1870;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static46.anInt1438) / (float) local68.anInt1874;
		local4.glBegin(GL2.GL_TRIANGLE_FAN);
		local4.glMultiTexCoord2f(GL2.GL_TEXTURE1, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray343[arg0], 0.0F);
		local4.glMultiTexCoord2f(GL2.GL_TEXTURE1, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(GL2.GL_TEXTURE1, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray345[arg0]);
		local4.glMultiTexCoord2f(GL2.GL_TEXTURE1, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray343[arg0], (float) -this.anIntArray345[arg0]);
		local4.glEnd();
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		local4.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		local4.glDisable(GL2.GL_TEXTURE_2D);
		local4.glActiveTexture(GL2.GL_TEXTURE0);
		local4.glLoadIdentity();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected final void method2855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		GlRenderer.method4151();
		@Pc(2) GL2 local2 = GlRenderer.gl;
		GlRenderer.setTextureId(this.anInt3638);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (GlRenderer.canvasHeight - arg2), 0.0F);
		local2.glCallList(this.anIntArray349[arg0]);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	private void method2880() {
		if (this.anIntArray349 != null) {
			return;
		}
		this.anIntArray349 = new int[256];
		@Pc(9) GL2 local9 = GlRenderer.gl;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray343[local11] / (float) this.anInt3640;
			@Pc(52) float local52 = local28 + (float) this.anIntArray345[local11] / (float) this.anInt3640;
			this.anIntArray349[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray349[local11], GL2.GL_COMPILE);
			local9.glBegin(GL2.GL_TRIANGLE_FAN);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray343[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray345[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray343[local11], (float) -this.anIntArray345[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt3639 = Static63.anInt1943;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([[B)V")
	private void method2881(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt3638 != -1) {
			return;
		}
		this.anInt3640 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray345[local9] > this.anInt3640) {
				this.anInt3640 = this.anIntArray345[local9];
			}
			if (this.anIntArray343[local9] > this.anInt3640) {
				this.anInt3640 = this.anIntArray343[local9];
			}
		}
		this.anInt3640 *= 16;
		this.anInt3640 = Static165.method3164(this.anInt3640);
		local9 = this.anInt3640 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt3640 * this.anInt3640 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt3640 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray345[local68];
			@Pc(104) int local104 = this.anIntArray343[local68];
			@Pc(108) byte[] local108 = arg0[local68];
			for (@Pc(110) int local110 = 0; local110 < local99; local110++) {
				for (@Pc(115) int local115 = 0; local115 < local104; local115++) {
					if (local108[local94++] == 0) {
						local92 += 2;
					} else {
						local66[local92++] = -1;
						local66[local92++] = -1;
					}
				}
				local92 += (this.anInt3640 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL2 local155 = GlRenderer.gl;
		if (this.anInt3638 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt3638 = local162[0];
			this.anInt3639 = Static63.anInt1943;
		}
		GlRenderer.setTextureId(this.anInt3638);
		local155.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_LUMINANCE_ALPHA, this.anInt3640, this.anInt3640, 0, GL2.GL_LUMINANCE_ALPHA, GL2.GL_UNSIGNED_BYTE, local153);
		Static63.anInt1944 += local153.limit() - this.anInt3637;
		this.anInt3637 = local153.limit();
		local155.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_NEAREST);
		local155.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_NEAREST);
	}
}
