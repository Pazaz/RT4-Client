import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "()I")
	public static int method4607() {
		return aBoolean308 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "()V")
	public static void method4608() {
		@Pc(1) GL local1 = Static239.aGL1;
		local1.glClientActiveTexture(method4607());
		local1.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL.GL_TEXTURE0);
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "()V")
	public static void method4609() {
		@Pc(1) GL local1 = Static239.aGL1;
		local1.glClientActiveTexture(method4607());
		local1.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
		local1.glClientActiveTexture(GL.GL_TEXTURE0);
	}
}