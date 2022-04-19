import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class MidiNote extends Node {

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
	public int anInt3763;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
	public int anInt3764;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public int anInt3765;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Lclient!wh;")
	public Class162 aClass162_1;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
	public int anInt3767;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "Lclient!b;")
	public SoundPcmStream aClass3_Sub3_Sub1_3;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
	public int anInt3768;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "Lclient!kj;")
	public PcmSound aClass3_Sub16_Sub1_1;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
	public int anInt3769;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	public int anInt3770;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
	public int anInt3772;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
	public int anInt3773;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
	public int anInt3774;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
	public int anInt3775;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
	public int anInt3776;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
	public int anInt3777;

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "Lclient!jk;")
	public MidiInstrument aClass3_Sub18_1;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	public final void method2957() {
		this.aClass162_1 = null;
		this.aClass3_Sub16_Sub1_1 = null;
		this.aClass3_Sub3_Sub1_3 = null;
		this.aClass3_Sub18_1 = null;
	}
}
