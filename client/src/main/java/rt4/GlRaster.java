package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.IntBuffer;

public final class GlRaster {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int clipTop = 0;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public static int clipLeft = 0;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	private static int clipRight = 0;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int clipBottom = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
	public static void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		GlRenderer.method4162();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) GlRenderer.canvasHeight - (float) arg1 - 0.3F;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_LINES);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIII)V")
	public static void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		GlRenderer.method4162();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) GlRenderer.canvasHeight - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_LINES);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "()V")
	public static void method1177() {
		clipLeft = 0;
		clipTop = 0;
		clipRight = GlRenderer.canvasWidth;
		clipBottom = GlRenderer.canvasHeight;
		@Pc(9) GL2 local9 = GlRenderer.gl;
		local9.glDisable(GL2.GL_SCISSOR_TEST);
		GlFont.method1173();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([IIIII)V")
	public static void drawPixels(@OriginalArg(0) int[] arg0, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height) {
		GlRenderer.method4162();
		@Pc(2) GL2 gl = GlRenderer.gl;
		gl.glRasterPos2i(x, GlRenderer.canvasHeight - y);
		gl.glPixelZoom((float) GameShell.canvasScale, (float) -GameShell.canvasScale);
		gl.glDisable(GL2.GL_BLEND);
		gl.glDisable(GL2.GL_ALPHA_TEST);
		gl.glDrawPixels(width, height, GL2.GL_BGRA, GlRenderer.bigEndian ? GL2.GL_UNSIGNED_INT_8_8_8_8_REV : GL2.GL_UNSIGNED_BYTE, IntBuffer.wrap(arg0));
		gl.glPixelZoom(1.0F, 1.0F);
		gl.glEnable(GL2.GL_ALPHA_TEST);
		gl.glEnable(GL2.GL_BLEND);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void drawRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		GlRenderer.method4162();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) GlRenderer.canvasHeight - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL2 local29 = GlRenderer.gl;
		local29.glBegin(GL2.GL_LINE_LOOP);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
	public static void method1180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		GlRenderer.method4162();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) GlRenderer.canvasHeight - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL2 local29 = GlRenderer.gl;
		local29.glBegin(GL2.GL_LINE_LOOP);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIIII)V")
	public static void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		@Pc(14) int local14 = local3 >= 0 ? local3 : -local3;
		@Pc(21) int local21 = local7 >= 0 ? local7 : -local7;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (local3 << 16) / local23;
		@Pc(43) int local43 = (local7 << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = arg5 * local43 >> 17;
		@Pc(67) int local67 = arg5 * local43 + 1 >> 17;
		@Pc(73) int local73 = arg5 * local37 >> 17;
		@Pc(81) int local81 = arg5 * local37 + 1 >> 17;
		@Pc(85) int local85 = arg0 + local59;
		@Pc(89) int local89 = arg0 - local67;
		@Pc(95) int local95 = arg0 + local3 - local67;
		@Pc(101) int local101 = arg0 + local3 + local59;
		@Pc(105) int local105 = arg1 + local73;
		@Pc(109) int local109 = arg1 - local81;
		@Pc(115) int local115 = arg1 + local7 - local81;
		@Pc(121) int local121 = arg1 + local7 + local73;
		GlRenderer.method4162();
		@Pc(124) GL2 local124 = GlRenderer.gl;
		local124.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local124.glBegin(GL2.GL_TRIANGLE_FAN);
		if (local43 <= local37) {
			local124.glVertex2f((float) local101, (float) (GlRenderer.canvasHeight - local121));
			local124.glVertex2f((float) local95, (float) (GlRenderer.canvasHeight - local115));
			local124.glVertex2f((float) local89, (float) (GlRenderer.canvasHeight - local109));
			local124.glVertex2f((float) local85, (float) (GlRenderer.canvasHeight - local105));
		} else {
			local124.glVertex2f((float) local85, (float) (GlRenderer.canvasHeight - local105));
			local124.glVertex2f((float) local89, (float) (GlRenderer.canvasHeight - local109));
			local124.glVertex2f((float) local95, (float) (GlRenderer.canvasHeight - local115));
			local124.glVertex2f((float) local101, (float) (GlRenderer.canvasHeight - local121));
		}
		local124.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIIIII)V")
	public static void fillRectAlpha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		GlRenderer.method4162();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_TRIANGLE_FAN);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIII)V")
	public static void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (clipLeft < arg0) {
			clipLeft = arg0;
		}
		if (clipTop < arg1) {
			clipTop = arg1;
		}
		if (clipRight > arg2) {
			clipRight = arg2;
		}
		if (clipBottom > arg3) {
			clipBottom = arg3;
		}
		@Pc(21) GL2 gl = GlRenderer.gl;
		gl.glEnable(GL2.GL_SCISSOR_TEST);
		if (clipLeft <= clipRight && clipTop <= clipBottom) {
			gl.glScissor((int) (clipLeft * GameShell.canvasScale + GameShell.subpixelX), (int) ((GlRenderer.canvasHeight - clipBottom) * GameShell.canvasScale + GameShell.subpixelY), (int) ((clipRight - clipLeft) * GameShell.canvasScale + GameShell.subpixelX), (int) ((clipBottom - clipTop) * GameShell.canvasScale + GameShell.subpixelY));
		} else {
			gl.glScissor(0, 0, 0, 0);
		}
		GlFont.method1173();
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "()V")
	public static void clear() {
		GlRenderer.gl.glClear(GL2.GL_DEPTH_BUFFER_BIT | GL2.GL_COLOR_BUFFER_BIT);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIII)V")
	public static void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		GlRenderer.method4162();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) GlRenderer.canvasHeight - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) GlRenderer.canvasHeight - (float) arg3 - 0.3F;
		@Pc(28) GL2 local28 = GlRenderer.gl;
		local28.glBegin(GL2.GL_LINE_LOOP);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIIII)V")
	public static void fillRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		GlRenderer.method4162();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (GlRenderer.canvasHeight - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_TRIANGLE_FAN);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(IIII)V")
	public static void setClip(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > GlRenderer.canvasWidth) {
			arg2 = GlRenderer.canvasWidth;
		}
		if (arg3 > GlRenderer.canvasHeight) {
			arg3 = GlRenderer.canvasHeight;
		}
		clipLeft = arg0;
		clipTop = arg1;
		clipRight = arg2;
		clipBottom = arg3;
		@Pc(27) GL2 local27 = GlRenderer.gl;
		local27.glEnable(GL2.GL_SCISSOR_TEST);
		if (clipLeft <= clipRight && clipTop <= clipBottom) {
			local27.glScissor((int) (clipLeft * GameShell.canvasScale + GameShell.subpixelX), (int) ((GlRenderer.canvasHeight - clipBottom) * GameShell.canvasScale + GameShell.subpixelY), (int) ((clipRight - clipLeft) * GameShell.canvasScale + GameShell.subpixelX), (int) ((clipBottom - clipTop) * GameShell.canvasScale + GameShell.subpixelY));
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		GlFont.method1173();
	}

}
