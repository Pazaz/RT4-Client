import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_583 = JagString.parse("(Y<)4col>");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public static int anInt2952 = 0;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt2954 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ve;I)Lclient!jk;")
	public static MidiInstrument method2320(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4500(arg1);
		return local9 == null ? null : new MidiInstrument(local9);
	}

}
