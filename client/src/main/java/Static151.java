import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
	public static boolean aBoolean176;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "[I")
	public static int[] anIntArray340 = null;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
	public static int[] anIntArray341 = null;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt3587 = -1;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public static int anInt3588 = -1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	public static void method2807() {
		@Pc(11) byte[] local11;
		if (aByteBuffer7 == null) {
			@Pc(5) Class106_Sub1_Sub1 local5 = new Class106_Sub1_Sub1();
			local11 = local5.method3215();
			aByteBuffer7 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer7.position(0);
			aByteBuffer7.put(local11);
			aByteBuffer7.flip();
		}
		if (aByteBuffer6 != null) {
			return;
		}
		@Pc(32) Class106_Sub2_Sub1 local32 = new Class106_Sub2_Sub1();
		local11 = local32.method3854();
		aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer6.position(0);
		aByteBuffer6.put(local11);
		aByteBuffer6.flip();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	public static void method2808() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt3587 != -1) {
			local4 = Static239.aGL1;
			local11 = new int[] { anInt3587 };
			local4.glDeleteTextures(1, local11, 0);
			anInt3587 = -1;
			Static63.anInt1942 -= aByteBuffer7.limit() * 2;
		}
		if (anIntArray341 != null) {
			local4 = Static239.aGL1;
			local4.glDeleteTextures(64, anIntArray341, 0);
			anIntArray341 = null;
			Static63.anInt1942 -= aByteBuffer7.limit() * 2;
		}
		if (anInt3588 != -1) {
			local4 = Static239.aGL1;
			local11 = new int[] { anInt3588 };
			local4.glDeleteTextures(1, local11, 0);
			anInt3588 = -1;
			Static63.anInt1942 -= aByteBuffer6.limit() * 2;
		}
		if (anIntArray340 != null) {
			local4 = Static239.aGL1;
			local4.glDeleteTextures(64, anIntArray340, 0);
			anIntArray340 = null;
			Static63.anInt1942 -= aByteBuffer6.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()V")
	public static void method2809() {
		aBoolean176 = Static239.aBoolean267;
		method2807();
		method2811();
		method2812();
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "()V")
	private static void method2811() {
		@Pc(1) GL local1 = Static239.aGL1;
		if (aBoolean176) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(GL.GL_TEXTURE_3D, local6[0]);
			aByteBuffer7.position(0);
			local1.glTexImage3D(GL.GL_TEXTURE_3D, 0, GL.GL_LUMINANCE_ALPHA, 64, 64, 64, 0, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, aByteBuffer7);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			anInt3587 = local6[0];
			Static63.anInt1942 += aByteBuffer7.limit() * 2;
			return;
		}
		anIntArray341 = new int[64];
		local1.glGenTextures(64, anIntArray341, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static239.method4177(anIntArray341[local65]);
			aByteBuffer7.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_LUMINANCE_ALPHA, 64, 64, 0, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, aByteBuffer7);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		Static63.anInt1942 += aByteBuffer7.limit() * 2;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "()V")
	private static void method2812() {
		@Pc(1) GL local1 = Static239.aGL1;
		if (aBoolean176) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(GL.GL_TEXTURE_3D, local6[0]);
			aByteBuffer6.position(0);
			local1.glTexImage3D(GL.GL_TEXTURE_3D, 0, GL.GL_LUMINANCE_ALPHA, 64, 64, 64, 0, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, aByteBuffer6);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_3D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
			anInt3588 = local6[0];
			Static63.anInt1942 += aByteBuffer6.limit() * 2;
			return;
		}
		anIntArray340 = new int[64];
		local1.glGenTextures(64, anIntArray340, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static239.method4177(anIntArray340[local65]);
			aByteBuffer6.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_LUMINANCE_ALPHA, 64, 64, 0, GL.GL_LUMINANCE_ALPHA, GL.GL_UNSIGNED_BYTE, aByteBuffer6);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
			local1.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		}
		Static63.anInt1942 += aByteBuffer6.limit() * 2;
	}
}
