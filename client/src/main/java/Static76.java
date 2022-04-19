import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	private static int anInt2126 = 2;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public static void method1642() {
		@Pc(1) GL local1 = Static239.aGL1;
		if (local1.isExtensionAvailable("GL_ARB_point_parameters")) {
			@Pc(20) float[] local20 = new float[] { 1.0F, 0.0F, 5.0E-4F };
			local1.glPointParameterfvARB(GL.GL_POINT_DISTANCE_ATTENUATION, local20, 0);
			@Pc(28) FloatBuffer local28 = FloatBuffer.allocate(1);
			local1.glGetFloatv(GL.GL_POINT_SIZE_MAX, local28);
			@Pc(36) float local36 = local28.get(0);
			if (local36 > 1024.0F) {
				local36 = 1024.0F;
			}
			local1.glPointParameterfARB(GL.GL_POINT_SIZE_MIN, 1.0F);
			local1.glPointParameterfARB(GL.GL_POINT_SIZE_MAX, local36);
		}
		if (local1.isExtensionAvailable("GL_ARB_point_sprite")) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
	public static void method1643() {
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()I")
	public static int method1644() {
		return anInt2126;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method1645(@OriginalArg(0) int arg0) {
		anInt2126 = arg0;
	}
}
