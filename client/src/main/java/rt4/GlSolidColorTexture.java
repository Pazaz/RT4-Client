package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!sd")
public final class GlSolidColorTexture extends SecondaryNode {

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
	private int textureSize = 0;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	private int textureId = -1;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	private final int contextId;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
	public GlSolidColorTexture(@OriginalArg(0) int hsl) {
		@Pc(9) GL2 gl = GlRenderer.gl;
		@Pc(12) int[] temp = new int[1];
		gl.glGenTextures(1, temp, 0);
		this.textureId = temp[0];
		this.contextId = GlCleaner.contextId;
		GlRenderer.setTextureId(this.textureId);
		@Pc(32) int rgb = Rasteriser.palette[hsl];
		@Pc(58) byte[] bytes = new byte[]{(byte) (rgb >> 16), (byte) (rgb >> 8), (byte) rgb, -1};
		@Pc(61) ByteBuffer buffer = ByteBuffer.wrap(bytes);
		gl.glTexImage2D(GL2.GL_TEXTURE_2D, 0, GL2.GL_RGBA, 1, 1, 0, GL2.GL_RGBA, GL2.GL_UNSIGNED_BYTE, buffer);
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_LINEAR);
		gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_LINEAR);
		GlCleaner.onCardTexture += buffer.limit() - this.textureSize;
		this.textureSize = buffer.limit();
	}

	@OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.textureId != -1) {
			GlCleaner.deleteTexture(this.textureId, this.textureSize, this.contextId);
			this.textureId = -1;
			this.textureSize = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V")
	public final void method3887() {
		@Pc(8) int flags = MaterialManager.getFlags();
		if ((flags & 0x1) == 0) {
			GlRenderer.setTextureId(this.textureId);
		}
		if ((flags & 0x2) == 0) {
			GlRenderer.setTextureCombineRgbMode(0);
		}
		if ((flags & 0x4) == 0) {
			GlRenderer.setTextureCombineAlphaMode(0);
		}
	}
}
