package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!fj")
public final class Light_Class45 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!vi;")
	private GlVertexBufferObject aClass155_1;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!vi;")
	private GlVertexBufferObject aClass155_2;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	public int anInt2016;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	public int anInt2017;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public int anInt2018;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "Lclient!sc;")
	private HashTable aClass133_4;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	public int anInt2019;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!gi;IIIFFF)I")
	public final int method1553(@OriginalArg(0) Light arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) long local1 = 0L;
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local1 = arg1 + (arg3 << 16);
			@Pc(23) IntNode local23 = (IntNode) this.aClass133_4.get(local1);
			if (local23 != null) {
				return local23.value;
			}
		}
		@Pc(31) int local31 = arg0.color;
		@Pc(37) float local37 = (float) (arg0.x - arg1);
		@Pc(43) float local43 = (float) (arg0.y - arg2);
		@Pc(49) float local49 = (float) (arg0.z - arg3);
		@Pc(64) float local64 = (float) Math.sqrt(local37 * local37 + local43 * local43 + local49 * local49);
		@Pc(68) float local68 = 1.0F / local64;
		@Pc(72) float local72 = local37 * local68;
		@Pc(76) float local76 = local43 * local68;
		@Pc(80) float local80 = local49 * local68;
		@Pc(90) float local90 = local64 / (float) ((arg0.radius << 7) + 64);
		@Pc(96) float local96 = 1.0F - local90 * local90;
		if (local96 < 0.0F) {
			local96 = 0.0F;
		}
		@Pc(114) float local114 = local72 * arg4 + local76 * arg5 + local80 * arg6;
		if (local114 < 0.0F) {
			local114 = 0.0F;
		}
		@Pc(126) float local126 = local114 * local96 * 2.0F;
		if (local126 > 1.0F) {
			local126 = 1.0F;
		}
		@Pc(142) int local142 = (int) (local126 * (float) (local31 >> 16 & 0xFF));
		if (local142 > 255) {
			local142 = 255;
		}
		@Pc(157) int local157 = (int) (local126 * (float) (local31 >> 8 & 0xFF));
		if (local157 > 255) {
			local157 = 255;
		}
		@Pc(170) int local170 = (int) (local126 * (float) (local31 & 0xFF));
		if (local170 > 255) {
			local170 = 255;
		}
		this.aByteArray25[this.anInt2017] = (byte) local142;
		this.aByteArray23[this.anInt2017] = (byte) local157;
		this.aByteArray24[this.anInt2017] = (byte) local170;
		this.anIntArray178[this.anInt2017] = arg1;
		this.anIntArray180[this.anInt2017] = arg2;
		this.anIntArray179[this.anInt2017] = arg3;
		this.aClass133_4.put(new IntNode(this.anInt2017), local1);
		return this.anInt2017++;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
	public final void method1554() {
		@Pc(7) Buffer local7 = new Buffer(this.anInt2018 * 4);
		@Pc(15) Buffer local15 = new Buffer(this.anInt2017 * 16);
		@Pc(19) int local19;
		if (GlRenderer.bigEndian) {
			for (local19 = 0; local19 < this.anInt2017; local19++) {
				local15.p1(this.aByteArray25[local19]);
				local15.p1(this.aByteArray23[local19]);
				local15.p1(this.aByteArray24[local19]);
				local15.p1(255);
				local15.pFloat((float) this.anIntArray178[local19]);
				local15.pFloat((float) this.anIntArray180[local19]);
				local15.pFloat((float) this.anIntArray179[local19]);
			}
			for (local19 = 0; local19 < this.anInt2018; local19++) {
				local7.p4(this.anIntArray177[local19]);
			}
		} else {
			for (local19 = 0; local19 < this.anInt2017; local19++) {
				local15.p1(this.aByteArray25[local19]);
				local15.p1(this.aByteArray23[local19]);
				local15.p1(this.aByteArray24[local19]);
				local15.p1(255);
				local15.gFloat((float) this.anIntArray178[local19]);
				local15.gFloat((float) this.anIntArray180[local19]);
				local15.gFloat((float) this.anIntArray179[local19]);
			}
			for (local19 = 0; local19 < this.anInt2018; local19++) {
				local7.ip4(this.anIntArray177[local19]);
			}
		}
		if (GlRenderer.arbVboSupported) {
			this.aClass155_1 = new GlVertexBufferObject();
			@Pc(173) ByteBuffer local173 = ByteBuffer.wrap(local15.data);
			this.aClass155_1.setArrayBuffer(local173);
			this.aClass155_2 = new GlVertexBufferObject();
			@Pc(186) ByteBuffer local186 = ByteBuffer.wrap(local7.data);
			this.aClass155_2.setElementArrayBuffer(local186);
		} else {
			this.aByteBuffer1 = ByteBuffer.allocateDirect(local15.offset);
			this.aByteBuffer1.put(local15.data);
			this.aByteBuffer1.flip();
			this.aByteBuffer2 = ByteBuffer.allocateDirect(local7.offset);
			this.aByteBuffer2.put(local7.data);
			this.aByteBuffer2.flip();
		}
		this.anIntArray178 = null;
		this.anIntArray180 = null;
		this.anIntArray179 = null;
		this.aByteArray25 = null;
		this.aByteArray23 = null;
		this.aByteArray24 = null;
		this.anIntArray177 = null;
		this.aClass133_4 = null;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "()V")
	public final void method1555() {
		this.anIntArray177 = new int[this.anInt2016];
		this.anIntArray178 = new int[this.anInt2019];
		this.anIntArray180 = new int[this.anInt2019];
		this.anIntArray179 = new int[this.anInt2019];
		this.aByteArray25 = new byte[this.anInt2019];
		this.aByteArray23 = new byte[this.anInt2019];
		this.aByteArray24 = new byte[this.anInt2019];
		this.aClass133_4 = new HashTable(IntUtils.clp2(this.anInt2019));
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "()V")
	public final void method1556() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (GlRenderer.arbVboSupported) {
			this.aClass155_1.bindArray();
			local1.glInterleavedArrays(GL2.GL_C4UB_V3F, 16, 0L);
			GlRenderer.normalArrayEnabled = false;
			this.aClass155_2.bindElementArray();
			local1.glDrawElements(GL2.GL_TRIANGLES, this.anInt2018, GL2.GL_UNSIGNED_INT, 0L);
			return;
		}
		if (GlRenderer.arbVboSupported) {
			local1.glBindBuffer(GL2.GL_ARRAY_BUFFER, 0);
			local1.glBindBuffer(GL2.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		local1.glInterleavedArrays(GL2.GL_C4UB_V3F, 16, this.aByteBuffer1);
		GlRenderer.normalArrayEnabled = false;
		local1.glDrawElements(GL2.GL_TRIANGLES, this.anInt2018, GL2.GL_UNSIGNED_INT, this.aByteBuffer2);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([I)V")
	public final void method1557(@OriginalArg(0) int[] arg0) {
		for (@Pc(1) int local1 = 1; local1 < arg0.length - 1; local1++) {
			this.anIntArray177[this.anInt2018++] = arg0[0];
			this.anIntArray177[this.anInt2018++] = arg0[local1];
			this.anIntArray177[this.anInt2018++] = arg0[local1 + 1];
		}
	}
}
