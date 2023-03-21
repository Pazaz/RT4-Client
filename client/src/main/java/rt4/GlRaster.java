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
	public static void drawHorizontalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int length, @OriginalArg(3) int color) {
		GlRenderer.setupBlankMaterial();
		@Pc(5) float local5 = (float) x + 0.3F;
		@Pc(10) float local10 = local5 + (float) length;
		@Pc(18) float local18 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_LINES);
		local20.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIII)V")
	public static void drawVerticalLine(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int length, @OriginalArg(3) int color) {
		GlRenderer.setupBlankMaterial();
		@Pc(5) float local5 = (float) x + 0.3F;
		@Pc(13) float local13 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(18) float local18 = local13 - (float) length;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_LINES);
		local20.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "()V")
	public static void setFullClip() {
		clipLeft = 0;
		clipTop = 0;
		clipRight = GlRenderer.canvasWidth;
		clipBottom = GlRenderer.canvasHeight;
		@Pc(9) GL2 local9 = GlRenderer.gl;
		local9.glDisable(GL2.GL_SCISSOR_TEST);
		GlFont.method1173();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([IIIII)V")
	public static void drawPixels(@OriginalArg(0) int[] colors, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int width, @OriginalArg(4) int height) {
		GlRenderer.setupBlankMaterial();
		@Pc(2) GL2 gl = GlRenderer.gl;
		gl.glRasterPos2i(x, GlRenderer.canvasHeight - y);
		gl.glPixelZoom((float) GameShell.canvasScale, (float) -GameShell.canvasScale);
		gl.glDisable(GL2.GL_BLEND);
		gl.glDisable(GL2.GL_ALPHA_TEST);
		gl.glDrawPixels(width, height, GL2.GL_BGRA, GlRenderer.bigEndian ? GL2.GL_UNSIGNED_INT_8_8_8_8_REV : GL2.GL_UNSIGNED_BYTE, IntBuffer.wrap(colors));
		gl.glPixelZoom(1.0F, 1.0F);
		gl.glEnable(GL2.GL_ALPHA_TEST);
		gl.glEnable(GL2.GL_BLEND);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void drawRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		GlRenderer.setupBlankMaterial();
		@Pc(5) float local5 = (float) x + 0.3F;
		@Pc(12) float local12 = local5 + (float) (width - 1);
		@Pc(20) float local20 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(27) float local27 = local20 - (float) (height - 1);
		@Pc(29) GL2 local29 = GlRenderer.gl;
		local29.glBegin(GL2.GL_LINE_LOOP);
		local29.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
	public static void drawRectAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color, @OriginalArg(5) int alpha) {
		GlRenderer.setupBlankMaterial();
		@Pc(5) float local5 = (float) x + 0.3F;
		@Pc(12) float local12 = local5 + (float) (width - 1);
		@Pc(20) float local20 = (float) GlRenderer.canvasHeight - (float) y - 0.3F;
		@Pc(27) float local27 = local20 - (float) (height - 1);
		@Pc(29) GL2 local29 = GlRenderer.gl;
		local29.glBegin(GL2.GL_LINE_LOOP);
		local29.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIIII)V")
	public static void renderLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y1, @OriginalArg(4) int color, @OriginalArg(5) int lineWidth) {
		@Pc(3) int local3 = x1 - x0;
		@Pc(7) int local7 = y1 - y0;
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
		@Pc(59) int local59 = lineWidth * local43 >> 17;
		@Pc(67) int local67 = lineWidth * local43 + 1 >> 17;
		@Pc(73) int local73 = lineWidth * local37 >> 17;
		@Pc(81) int local81 = lineWidth * local37 + 1 >> 17;
		@Pc(85) int local85 = x0 + local59;
		@Pc(89) int local89 = x0 - local67;
		@Pc(95) int local95 = x0 + local3 - local67;
		@Pc(101) int local101 = x0 + local3 + local59;
		@Pc(105) int local105 = y0 + local73;
		@Pc(109) int local109 = y0 - local81;
		@Pc(115) int local115 = y0 + local7 - local81;
		@Pc(121) int local121 = y0 + local7 + local73;
		GlRenderer.setupBlankMaterial();
		@Pc(124) GL2 local124 = GlRenderer.gl;
		local124.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
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
	public static void fillRectAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color, @OriginalArg(5) int alpha) {
		GlRenderer.setupBlankMaterial();
		@Pc(3) float local3 = (float) x;
		@Pc(8) float local8 = local3 + (float) width;
		@Pc(13) float local13 = (float) (GlRenderer.canvasHeight - y);
		@Pc(18) float local18 = local13 - (float) height;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_TRIANGLE_FAN);
		local20.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, alpha > 255 ? -1 : (byte) alpha);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIII)V")
	public static void shrinkClip(@OriginalArg(0) int left, @OriginalArg(1) int top, @OriginalArg(2) int right, @OriginalArg(3) int bottom) {
		if (clipLeft < left) {
			clipLeft = left;
		}
		if (clipTop < top) {
			clipTop = top;
		}
		if (clipRight > right) {
			clipRight = right;
		}
		if (clipBottom > bottom) {
			clipBottom = bottom;
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
	public static void renderLine(@OriginalArg(0) int x0, @OriginalArg(1) int y0, @OriginalArg(2) int x1, @OriginalArg(3) int y2, @OriginalArg(4) int color) {
		GlRenderer.setupBlankMaterial();
		@Pc(5) float local5 = (float) x0 + 0.3F;
		@Pc(10) float local10 = (float) x1 + 0.3F;
		@Pc(18) float local18 = (float) GlRenderer.canvasHeight - (float) y0 - 0.3F;
		@Pc(26) float local26 = (float) GlRenderer.canvasHeight - (float) y2 - 0.3F;
		@Pc(28) GL2 local28 = GlRenderer.gl;
		local28.glBegin(GL2.GL_LINE_LOOP);
		local28.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(IIIII)V")
	public static void fillRect(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int color) {
		GlRenderer.setupBlankMaterial();
		@Pc(3) float local3 = (float) x;
		@Pc(8) float local8 = local3 + (float) width;
		@Pc(13) float local13 = (float) (GlRenderer.canvasHeight - y);
		@Pc(18) float local18 = local13 - (float) height;
		@Pc(20) GL2 local20 = GlRenderer.gl;
		local20.glBegin(GL2.GL_TRIANGLE_FAN);
		local20.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(IIII)V")
	public static void setClip(@OriginalArg(0) int left, @OriginalArg(1) int top, @OriginalArg(2) int right, @OriginalArg(3) int bottom) {
		if (left < 0) {
			left = 0;
		}
		if (top < 0) {
			top = 0;
		}
		if (right > GlRenderer.canvasWidth) {
			right = GlRenderer.canvasWidth;
		}
		if (bottom > GlRenderer.canvasHeight) {
			bottom = GlRenderer.canvasHeight;
		}
		clipLeft = left;
		clipTop = top;
		clipRight = right;
		clipBottom = bottom;
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
