import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class165 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!vi;")
	private Class155 aClass155_6;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!vi;")
	private Class155 aClass155_7;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "Z")
	public boolean aBoolean313 = true;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	private int anInt5902 = -1;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	private final int anInt5901;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class165() {
		@Pc(9) GL local9 = Static239.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenTextures(1, local12, 0);
		this.anInt5901 = local12[0];
		Static63.anInt1942 += 16384;
		Static239.method4177(this.anInt5901);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
		local9.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([[III)V")
	public final void method4676(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub15 local4 = new Class3_Sub15(1620);
		@Pc(11) int local11;
		for (@Pc(6) int local6 = 0; local6 <= 8; local6++) {
			for (local11 = 0; local11 <= 8; local11++) {
				if (Static239.aBoolean263) {
					local4.method2227((float) local11 / 8.0F);
					local4.method2227((float) local6 / 8.0F);
					local4.method2227((float) (local11 * 128));
					local4.method2227((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2227((float) (local6 * 128));
				} else {
					local4.method2188((float) local11 / 8.0F);
					local4.method2188((float) local6 / 8.0F);
					local4.method2188((float) (local11 * 128));
					local4.method2188((float) arg0[local11 + arg1][local6 + arg2]);
					local4.method2188((float) (local6 * 128));
				}
			}
		}
		if (Static239.aBoolean271) {
			@Pc(112) ByteBuffer local112 = ByteBuffer.wrap(local4.aByteArray40, 0, local4.anInt2792);
			this.aClass155_7 = new Class155();
			this.aClass155_7.method4519(local112);
		} else {
			this.aByteBuffer12 = ByteBuffer.allocateDirect(local4.anInt2792).order(ByteOrder.nativeOrder());
			this.aByteBuffer12.put(local4.aByteArray40, 0, local4.anInt2792);
			this.aByteBuffer12.flip();
		}
		@Pc(147) Class3_Sub15 local147 = new Class3_Sub15(1536);
		for (local11 = 0; local11 < 8; local11++) {
			for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
				if (Static239.aBoolean263) {
					local147.method2164(local154 + (local11 + 1) * 9);
					local147.method2164(local154 + local11 * 9);
					local147.method2164(local154 + local11 * 9 + 1);
					local147.method2164(local154 + (local11 + 1) * 9);
					local147.method2164(local154 + local11 * 9 + 1);
					local147.method2164(local154 + (local11 + 1) * 9 + 1);
				} else {
					local147.method2183(local154 + (local11 + 1) * 9);
					local147.method2183(local154 + local11 * 9);
					local147.method2183(local154 + local11 * 9 + 1);
					local147.method2183(local154 + (local11 + 1) * 9);
					local147.method2183(local154 + local11 * 9 + 1);
					local147.method2183(local154 + (local11 + 1) * 9 + 1);
				}
			}
		}
		if (Static239.aBoolean271) {
			@Pc(293) ByteBuffer local293 = ByteBuffer.wrap(local147.aByteArray40, 0, local147.anInt2792);
			this.aClass155_6 = new Class155();
			this.aClass155_6.method4517(local293);
		} else {
			this.aByteBuffer11 = ByteBuffer.allocateDirect(local147.anInt2792).order(ByteOrder.nativeOrder());
			this.aByteBuffer11.put(local147.aByteArray40, 0, local147.anInt2792);
			this.aByteBuffer11.flip();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ek;II)Z")
	public final boolean method4677(@OriginalArg(0) Class36_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) byte[] local2 = arg0.aByteArray18;
		@Pc(5) int local5 = arg0.anInt4270;
		@Pc(19) int local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23;
		@Pc(33) int local33;
		for (local23 = -128; local23 < 0; local23++) {
			local21 = (local21 << 8) - local21;
			for (local33 = -128; local33 < 0; local33++) {
				if (local2[local19++] != 0) {
					local21++;
				}
			}
			local19 += local5 - 128;
		}
		if (local21 == this.anInt5902) {
			return false;
		}
		this.anInt5902 = local21;
		local19 = arg1 * 128 + (arg2 * 128 + 1) * local5 + 1;
		local23 = 0;
		for (local33 = -128; local33 < 0; local33++) {
			for (@Pc(82) int local82 = -128; local82 < 0; local82++) {
				if (local2[local19] == 0) {
					@Pc(96) int local96 = 0;
					if (local2[local19 - 1] != 0) {
						local96++;
					}
					if (local2[local19 + 1] != 0) {
						local96++;
					}
					if (local2[local19 - local5] != 0) {
						local96++;
					}
					if (local2[local19 + local5] != 0) {
						local96++;
					}
					Static281.aByteArray82[local23++] = (byte) (local96 * 17);
				} else {
					Static281.aByteArray82[local23++] = 68;
				}
				local19++;
			}
			local19 += local5 - 128;
		}
		@Pc(145) GL local145 = Static239.aGL1;
		@Pc(148) ByteBuffer local148 = ByteBuffer.wrap(Static281.aByteArray82);
		local148.limit(16384);
		Static239.method4177(this.anInt5901);
		local145.glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_ALPHA, 128, 128, 0, GL.GL_ALPHA, GL.GL_UNSIGNED_BYTE, local148);
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
	public final void method4679() {
		@Pc(1) GL local1 = Static239.aGL1;
		Static239.method4177(this.anInt5901);
		if (this.aClass155_7 == null) {
			if (Static239.aBoolean271) {
				local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, 0);
			}
			local1.glInterleavedArrays(GL.GL_T2F_V3F, 20, this.aByteBuffer12);
			Static239.aBoolean265 = false;
		} else {
			this.aClass155_7.method4516();
			local1.glInterleavedArrays(GL.GL_T2F_V3F, 20, 0L);
			Static239.aBoolean265 = false;
		}
		if (this.aClass155_6 == null) {
			if (Static239.aBoolean271) {
				local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, 0);
			}
			local1.glDrawElements(GL.GL_TRIANGLES, 384, GL.GL_UNSIGNED_INT, this.aByteBuffer11);
		} else {
			this.aClass155_6.method4518();
			local1.glDrawElements(GL.GL_TRIANGLES, 384, GL.GL_UNSIGNED_INT, 0L);
		}
	}
}
