import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class155 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	private int anInt5760;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	private final int anInt5761;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	private int anInt5762;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Z")
	private final boolean aBoolean300;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class155() {
		this(false);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Z)V")
	public Class155(@OriginalArg(0) boolean arg0) {
		this.anInt5760 = -1;
		this.anInt5762 = 0;
		@Pc(9) GL local9 = Static239.aGL1;
		@Pc(12) int[] local12 = new int[1];
		local9.glGenBuffersARB(1, local12, 0);
		this.aBoolean300 = arg0;
		this.anInt5760 = local12[0];
		this.anInt5761 = Static63.anInt1943;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void method4515(@OriginalArg(0) ByteBuffer arg0) {
		if (arg0.limit() <= this.anInt5762) {
			@Pc(6) GL local6 = Static239.aGL1;
			local6.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.anInt5760);
			local6.glBufferSubDataARB(GL.GL_ARRAY_BUFFER, 0, arg0.limit(), arg0);
		} else {
			this.method4519(arg0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt5760 != -1) {
			Static63.method1489(this.anInt5760, this.anInt5762, this.anInt5761);
			this.anInt5760 = -1;
			this.anInt5762 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public final void method4516() {
		@Pc(1) GL local1 = Static239.aGL1;
		local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.anInt5760);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void method4517(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static239.aGL1;
		local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, this.anInt5760);
		local1.glBufferDataARB(GL.GL_ELEMENT_ARRAY_BUFFER, arg0.limit(), arg0, this.aBoolean300 ? GL.GL_STREAM_DRAW : GL.GL_STATIC_DRAW);
		Static63.anInt1945 += arg0.limit() - this.anInt5762;
		this.anInt5762 = arg0.limit();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	public final void method4518() {
		@Pc(1) GL local1 = Static239.aGL1;
		local1.glBindBufferARB(GL.GL_ELEMENT_ARRAY_BUFFER, this.anInt5760);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void method4519(@OriginalArg(0) ByteBuffer arg0) {
		@Pc(1) GL local1 = Static239.aGL1;
		local1.glBindBufferARB(GL.GL_ARRAY_BUFFER, this.anInt5760);
		local1.glBufferDataARB(GL.GL_ARRAY_BUFFER, arg0.limit(), arg0, this.aBoolean300 ? GL.GL_STREAM_DRAW : GL.GL_STATIC_DRAW);
		Static63.anInt1945 += arg0.limit() - this.anInt5762;
		this.anInt5762 = arg0.limit();
	}
}
