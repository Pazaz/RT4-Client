package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!vi")
public final class GlVertexBufferObject {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	private int id;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	private int size;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Z")
	private final boolean stream;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public GlVertexBufferObject() {
		this(false);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Z)V")
	public GlVertexBufferObject(@OriginalArg(0) boolean stream) {
		this.id = -1;
		this.size = 0;
		@Pc(9) GL2 gl = GlRenderer.gl;
		@Pc(12) int[] temp = new int[1];
		gl.glGenBuffers(1, temp, 0);
		this.stream = stream;
		this.id = temp[0];
		this.contextId = GlCleaner.contextId;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void updateArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		if (buffer.limit() <= this.size) {
			@Pc(6) GL2 gl = GlRenderer.gl;
			gl.glBindBuffer(GL2.GL_ARRAY_BUFFER, this.id);
			gl.glBufferSubData(GL2.GL_ARRAY_BUFFER, 0, buffer.limit(), buffer);
		} else {
			this.setArrayBuffer(buffer);
		}
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.id != -1) {
			GlCleaner.deleteBuffer(this.id, this.size, this.contextId);
			this.id = -1;
			this.size = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public final void bindArray() {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glBindBuffer(GL2.GL_ARRAY_BUFFER, this.id);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void setElementArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glBindBuffer(GL2.GL_ELEMENT_ARRAY_BUFFER, this.id);
		gl.glBufferData(GL2.GL_ELEMENT_ARRAY_BUFFER, buffer.limit(), buffer, this.stream ? GL2.GL_STREAM_DRAW : GL2.GL_STATIC_DRAW);
		GlCleaner.onCardGeometry += buffer.limit() - this.size;
		this.size = buffer.limit();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	public final void bindElementArray() {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glBindBuffer(GL2.GL_ELEMENT_ARRAY_BUFFER, this.id);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public final void setArrayBuffer(@OriginalArg(0) ByteBuffer buffer) {
		@Pc(1) GL2 gl = GlRenderer.gl;
		gl.glBindBuffer(GL2.GL_ARRAY_BUFFER, this.id);
		gl.glBufferData(GL2.GL_ARRAY_BUFFER, buffer.limit(), buffer, this.stream ? GL2.GL_STREAM_DRAW : GL2.GL_STATIC_DRAW);
		GlCleaner.onCardGeometry += buffer.limit() - this.size;
		this.size = buffer.limit();
	}
}
