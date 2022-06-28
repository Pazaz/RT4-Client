package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class MapElementList {

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[Lclient!na;")
	public final JagString[] aClass100Array153;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[S")
	public final short[] aShortArray72;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public final int[] anIntArray444;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[S")
	public final short[] aShortArray73;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V")
	public MapElementList(@OriginalArg(0) int arg0) {
		this.anInt5074 = arg0;
		this.aClass100Array153 = new JagString[this.anInt5074];
		this.aShortArray72 = new short[this.anInt5074];
		this.anIntArray444 = new int[this.anInt5074];
		this.aByteArray69 = new byte[this.anInt5074];
		this.aShortArray73 = new short[this.anInt5074];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!na;Lclient!ve;)Lclient!se;")
	public static MapElementList create(@OriginalArg(1) JagString arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(10) int local10 = arg1.getGroupId(arg0);
		if (local10 == -1) {
			return new MapElementList(0);
		}
		@Pc(29) int[] local29 = arg1.getFileIds(local10);
		@Pc(35) MapElementList local35 = new MapElementList(local29.length);
		for (@Pc(37) int local37 = 0; local37 < local35.anInt5074; local37++) {
			@Pc(56) Buffer local56 = new Buffer(arg1.fetchFile(local10, local29[local37]));
			local35.aClass100Array153[local37] = local56.gjstr();
			local35.aByteArray69[local37] = local56.g1b();
			local35.aShortArray73[local37] = (short) local56.g2();
			local35.aShortArray72[local37] = (short) local56.g2();
			local35.anIntArray444[local37] = local56.g4();
		}
		return local35;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Z")
	public final boolean method3890(@OriginalArg(0) int arg0) {
		return (this.aByteArray69[arg0] & 0x8) != 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
	public final boolean method3892(@OriginalArg(0) int arg0) {
		return (this.aByteArray69[arg0] & 0x4) != 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)I")
	public final int method3894(@OriginalArg(0) int arg0) {
		return this.aByteArray69[arg0] & 0x3;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Z")
	public final boolean method3897(@OriginalArg(0) int arg0) {
		return (this.aByteArray69[arg0] & 0x10) == 0;
	}
}
