import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class3_Sub2_Sub5_Sub2 extends Class3_Sub2_Sub5 {

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "B")
	public byte aByte16;

	@OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
	public int anInt4617;

	@OriginalMember(owner = "client!pm", name = "bb", descriptor = "Lclient!wa;")
	public Class3_Sub15 aClass3_Sub15_7;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)I")
	@Override
	public final int method3553() {
		return this.aClass3_Sub15_7 == null ? 0 : this.aClass3_Sub15_7.anInt2792 * 100 / (this.aClass3_Sub15_7.aByteArray40.length - this.aByte16);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)[B")
	@Override
	public final byte[] method3554() {
		if (this.aBoolean226 || this.aClass3_Sub15_7.anInt2792 < this.aClass3_Sub15_7.aByteArray40.length - this.aByte16) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub15_7.aByteArray40;
	}
}
