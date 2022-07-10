package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!cf")
public class GlSprite extends Sprite {

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
	public int powerOfTwoWidth;

	@OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
	public int powerOfTwoHeight;

	@OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
	protected int anInt1869 = 0;

	@OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
	public int textureId = -1;

	@OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
	private int anInt1871 = -1;

	@OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
	private int anInt1873 = 0;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII[I)V")
	public GlSprite(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt1860 = arg0;
		this.anInt1866 = arg1;
		this.anInt1863 = arg2;
		this.anInt1861 = arg3;
		this.width = arg4;
		this.height = arg5;
		this.method1430(arg6);
		this.method1431();
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!mm;)V")
	public GlSprite(@OriginalArg(0) SoftwareSprite arg0) {
		this.anInt1860 = arg0.anInt1860;
		this.anInt1866 = arg0.anInt1866;
		this.anInt1863 = arg0.anInt1863;
		this.anInt1861 = arg0.anInt1861;
		this.width = arg0.width;
		this.height = arg0.height;
		this.method1430(arg0.pixels);
		this.method1431();
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	private void method1424(@OriginalArg(0) int arg0) {
		if (this.anInt1873 == arg0) {
			return;
		}
		this.anInt1873 = arg0;
		@Pc(9) GL2 local9 = GlRenderer.gl;
		if (arg0 == 2) {
			local9.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
			local9.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
		} else {
			local9.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_NEAREST);
			local9.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!cf;)V")
	public final void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlSprite arg2) {
		if (arg2 == null) {
			return;
		}
		GlRenderer.method4149();
		GlRenderer.setTextureId(arg2.textureId);
		arg2.method1424(1);
		@Pc(11) GL2 local11 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		local11.glActiveTexture(GL2.GL_TEXTURE1);
		local11.glEnable(GL2.GL_TEXTURE_2D);
		local11.glBindTexture(GL2.GL_TEXTURE_2D, arg2.textureId);
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_REPLACE);
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_PREVIOUS);
		@Pc(47) float local47 = (float) (arg0 - GlRaster.clipLeft) / (float) arg2.powerOfTwoWidth;
		@Pc(56) float local56 = (float) (arg1 - GlRaster.clipTop) / (float) arg2.powerOfTwoHeight;
		@Pc(68) float local68 = (float) (arg0 + this.width - GlRaster.clipLeft) / (float) arg2.powerOfTwoWidth;
		@Pc(80) float local80 = (float) (arg1 + this.height - GlRaster.clipTop) / (float) arg2.powerOfTwoHeight;
		@Pc(85) int local85 = arg0 + this.anInt1863;
		@Pc(90) int local90 = arg1 + this.anInt1861;
		local11.glBegin(GL2.GL_TRIANGLE_FAN);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(115) float local115 = (float) this.height / (float) this.powerOfTwoHeight;
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.width), (float) (GlRenderer.canvasHeight - local90));
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (GlRenderer.canvasHeight - local90));
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (GlRenderer.canvasHeight - local90 - this.height));
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.width), (float) (GlRenderer.canvasHeight - local90 - this.height));
		local11.glEnd();
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		local11.glDisable(GL2.GL_TEXTURE_2D);
		local11.glActiveTexture(GL2.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIIII)V")
	public final void method1426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		GlRenderer.method4155();
		@Pc(2) GL2 local2 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(16) float local16 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(24) float local24 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(29) float local29 = local16 * (float) arg3;
		@Pc(34) float local34 = local24 * (float) arg4;
		@Pc(39) int local39 = arg0 + this.anInt1863;
		@Pc(46) int local46 = local39 + this.width * arg3;
		@Pc(53) int local53 = GlRenderer.canvasHeight - arg1 - this.anInt1861;
		@Pc(60) int local60 = local53 - this.height * arg4;
		@Pc(65) float local65 = (float) arg2 / 256.0F;
		local2.glBegin(GL2.GL_TRIANGLE_FAN);
		local2.glColor4f(1.0F, 1.0F, 1.0F, local65);
		local2.glTexCoord2f(local29, 0.0F);
		local2.glVertex2f((float) local46, (float) local53);
		local2.glTexCoord2f(0.0F, 0.0F);
		local2.glVertex2f((float) local39, (float) local53);
		local2.glTexCoord2f(0.0F, local34);
		local2.glVertex2f((float) local39, (float) local60);
		local2.glTexCoord2f(local29, local34);
		local2.glVertex2f((float) local46, (float) local60);
		local2.glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIILclient!cf;)V")
	public final void renderRotatedTransparent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) GlSprite arg8) {
		if (arg8 == null) {
			return;
		}
		GlRenderer.method4149();
		GlRenderer.setTextureId(arg8.textureId);
		arg8.method1424(1);
		@Pc(11) GL2 local11 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		if (GlobalConfig.BILINEAR_MINIMAP) {
			this.method1424(2);
		} else {
			this.method1424(1);
		}
		local11.glActiveTexture(GL2.GL_TEXTURE1);
		local11.glEnable(GL2.GL_TEXTURE_2D);
		local11.glBindTexture(GL2.GL_TEXTURE_2D, arg8.textureId);
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_REPLACE);
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_PREVIOUS);
		@Pc(43) int local43 = -arg2 / 2;
		@Pc(48) int local48 = -arg3 / 2;
		@Pc(51) int local51 = -local43;
		@Pc(54) int local54 = -local48;
		@Pc(63) int local63 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
		@Pc(72) int local72 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
		@Pc(78) int local78 = local63 * arg7 >> 8;
		@Pc(84) int local84 = local72 * arg7 >> 8;
		@Pc(96) int local96 = (arg4 << 16) + local48 * local78 + local43 * local84;
		@Pc(108) int local108 = (arg5 << 16) + (local48 * local84 - local43 * local78);
		@Pc(120) int local120 = (arg4 << 16) + local48 * local78 + local51 * local84;
		@Pc(132) int local132 = (arg5 << 16) + (local48 * local84 - local51 * local78);
		@Pc(144) int local144 = (arg4 << 16) + local54 * local78 + local43 * local84;
		@Pc(156) int local156 = (arg5 << 16) + (local54 * local84 - local43 * local78);
		@Pc(168) int local168 = (arg4 << 16) + local54 * local78 + local51 * local84;
		@Pc(180) int local180 = (arg5 << 16) + (local54 * local84 - local51 * local78);
		@Pc(188) float local188 = (float) arg8.width / (float) arg8.powerOfTwoWidth;
		@Pc(196) float local196 = (float) arg8.height / (float) arg8.powerOfTwoHeight;
		local11.glBegin(GL2.GL_TRIANGLE_FAN);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.powerOfTwoWidth * 65536.0F;
		@Pc(217) float local217 = (float) (this.powerOfTwoHeight * 65536);
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, local188, 0.0F);
		local11.glTexCoord2f((float) local120 / local211, (float) local132 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (GlRenderer.canvasHeight - arg1));
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, 0.0F, 0.0F);
		local11.glTexCoord2f((float) local96 / local211, (float) local108 / local217);
		local11.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1));
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, 0.0F, local196);
		local11.glTexCoord2f((float) local144 / local211, (float) local156 / local217);
		local11.glVertex2f((float) arg0, (float) (GlRenderer.canvasHeight - arg1 - arg3));
		local11.glMultiTexCoord2f(GL2.GL_TEXTURE1, local188, local196);
		local11.glTexCoord2f((float) local168 / local211, (float) local180 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (GlRenderer.canvasHeight - arg1 - arg3));
		local11.glEnd();
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_COMBINE_RGB, GL2.GL_MODULATE);
		local11.glTexEnvi(GL2.GL_TEXTURE_ENV, GL2.GL_SRC0_RGB, GL2.GL_TEXTURE);
		local11.glDisable(GL2.GL_TEXTURE_2D);
		local11.glActiveTexture(GL2.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(II)V")
	@Override
	public final void renderHorizontalFlip(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method4149();
		@Pc(5) int local5 = arg0 + this.anInt1863;
		@Pc(10) int local10 = arg1 + this.anInt1861;
		@Pc(12) GL2 local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		local12.glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		@Pc(35) float local35 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(43) float local43 = (float) this.height / (float) this.powerOfTwoHeight;
		local12.glBegin(GL2.GL_TRIANGLE_FAN);
		local12.glTexCoord2f(0.0F, 0.0F);
		local12.glVertex2f((float) this.width, 0.0F);
		local12.glTexCoord2f(local35, 0.0F);
		local12.glVertex2f(0.0F, 0.0F);
		local12.glTexCoord2f(local35, local43);
		local12.glVertex2f(0.0F, (float) -this.height);
		local12.glTexCoord2f(0.0F, local43);
		local12.glVertex2f((float) this.width, (float) -this.height);
		local12.glEnd();
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(II)V")
	@Override
	public final void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method4149();
		@Pc(5) int local5 = arg0 + this.anInt1863;
		@Pc(10) int local10 = arg1 + this.anInt1861;
		@Pc(12) GL2 local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		local12.glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		local12.glCallList(this.anInt1871);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIIII)V")
	public final void method1428(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		GlRenderer.method4149();
		@Pc(2) GL2 local2 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(2);
		@Pc(15) int local15 = 240 - (this.anInt1863 << 4);
		@Pc(22) int local22 = 240 - (this.anInt1861 << 4);
		local2.glTranslatef((float) arg0 / 16.0F, (float) GlRenderer.canvasHeight - (float) arg1 / 16.0F, 0.0F);
		local2.glRotatef((float) -arg2 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt1871);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
	@Override
	public final void renderResized(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		GlRenderer.method4149();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt1860;
		@Pc(21) int local21 = this.anInt1866;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.anInt1863 > 0) {
			local47 = ((this.anInt1863 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt1863 << 16);
		}
		if (this.anInt1861 > 0) {
			local47 = ((this.anInt1861 << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.anInt1861 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL2 local123 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(2);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(163) float local163 = (float) this.height / (float) this.powerOfTwoHeight;
		local123.glBegin(GL2.GL_TRIANGLE_FAN);
		local123.glTexCoord2f(local155, 0.0F);
		local123.glVertex2f(local137, local142);
		local123.glTexCoord2f(0.0F, 0.0F);
		local123.glVertex2f(local132, local142);
		local123.glTexCoord2f(0.0F, local163);
		local123.glVertex2f(local132, local147);
		local123.glTexCoord2f(local155, local163);
		local123.glVertex2f(local137, local147);
		local123.glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)V")
	@Override
	public final void drawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		GlRenderer.method4149();
		@Pc(5) int local5 = arg0 + this.anInt1863;
		@Pc(10) int local10 = arg1 + this.anInt1861;
		@Pc(12) GL2 local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		local12.glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		local12.glCallList(this.anInt1871);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture2d(this.textureId, this.anInt1869, this.anInt1875);
			this.textureId = -1;
			this.anInt1869 = 0;
		}
		if (this.anInt1871 != -1) {
			GlCleaner.deleteList(this.anInt1871, this.anInt1875);
			this.anInt1871 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		GlRenderer.method4149();
		@Pc(2) GL2 local2 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(15) int local15 = arg0 - (this.anInt1863 << 4);
		@Pc(22) int local22 = arg1 - (this.anInt1861 << 4);
		local2.glTranslatef((float) arg2 / 16.0F, (float) GlRenderer.canvasHeight - (float) arg3 / 16.0F, 0.0F);
		local2.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (arg5 != 4096) {
			local2.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
		}
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt1871);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIII)V")
	@Override
	public final void renderAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		GlRenderer.method4155();
		@Pc(8) int local8 = this.width;
		@Pc(11) int local11 = this.height;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt1860;
		@Pc(21) int local21 = this.anInt1866;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.anInt1863 > 0) {
			local47 = ((this.anInt1863 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt1863 << 16);
		}
		if (this.anInt1861 > 0) {
			local47 = ((this.anInt1861 << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.anInt1861 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL2 local123 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(163) float local163 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(168) float local168 = (float) arg4 / 256.0F;
		local123.glBegin(GL2.GL_TRIANGLE_FAN);
		local123.glColor4f(1.0F, 1.0F, 1.0F, local168);
		local123.glTexCoord2f(local155, 0.0F);
		local123.glVertex2f(local137, local142);
		local123.glTexCoord2f(0.0F, 0.0F);
		local123.glVertex2f(local132, local142);
		local123.glTexCoord2f(0.0F, local163);
		local123.glVertex2f(local132, local147);
		local123.glTexCoord2f(local155, local163);
		local123.glVertex2f(local137, local147);
		local123.glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIII)V")
	public final void method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		GlRenderer.method4149();
		@Pc(2) GL2 local2 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		@Pc(16) float local16 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(24) float local24 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(29) float local29 = local16 * (float) arg2;
		@Pc(34) float local34 = local24 * (float) arg3;
		@Pc(39) int local39 = arg0 + this.anInt1863;
		@Pc(46) int local46 = local39 + this.width * arg2;
		@Pc(53) int local53 = GlRenderer.canvasHeight - arg1 - this.anInt1861;
		@Pc(60) int local60 = local53 - this.height * arg3;
		local2.glBegin(GL2.GL_TRIANGLE_FAN);
		local2.glTexCoord2f(local29, 0.0F);
		local2.glVertex2f((float) local46, (float) local53);
		local2.glTexCoord2f(0.0F, 0.0F);
		local2.glVertex2f((float) local39, (float) local53);
		local2.glTexCoord2f(0.0F, local34);
		local2.glVertex2f((float) local39, (float) local60);
		local2.glTexCoord2f(local29, local34);
		local2.glVertex2f((float) local46, (float) local60);
		local2.glEnd();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V")
	protected void method1430(@OriginalArg(0) int[] arg0) {
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
					local20[local22++] = -1;
				}
			}
			local22 += local32;
		}
		@Pc(91) ByteBuffer local91 = ByteBuffer.wrap(local20);
		@Pc(93) GL2 local93 = GlRenderer.gl;
		if (this.textureId == -1) {
			@Pc(100) int[] local100 = new int[1];
			local93.glGenTextures(1, local100, 0);
			this.textureId = local100[0];
			this.anInt1875 = GlCleaner.contextId;
		}
		GlRenderer.setTextureId(this.textureId);
		local93.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_RGBA, this.powerOfTwoWidth, this.powerOfTwoHeight, 0, GL2.GL_RGBA, GL2.GL_UNSIGNED_BYTE, local91);
		GlCleaner.onCard2d += local91.limit() - this.anInt1869;
		this.anInt1869 = local91.limit();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public final void renderAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		GlRenderer.method4155();
		@Pc(5) int local5 = arg0 + this.anInt1863;
		@Pc(10) int local10 = arg1 + this.anInt1861;
		@Pc(12) GL2 local12 = GlRenderer.gl;
		GlRenderer.setTextureId(this.textureId);
		this.method1424(1);
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (GlRenderer.canvasHeight - local10), 0.0F);
		local12.glCallList(this.anInt1871);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	private void method1431() {
		@Pc(7) float local7 = (float) this.width / (float) this.powerOfTwoWidth;
		@Pc(15) float local15 = (float) this.height / (float) this.powerOfTwoHeight;
		@Pc(17) GL2 local17 = GlRenderer.gl;
		if (this.anInt1871 == -1) {
			this.anInt1871 = local17.glGenLists(1);
			this.anInt1875 = GlCleaner.contextId;
		}
		local17.glNewList(this.anInt1871, GL2.GL_COMPILE);
		local17.glBegin(GL2.GL_TRIANGLE_FAN);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.width, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.height);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.width, (float) -this.height);
		local17.glEnd();
		local17.glEndList();
	}
}
