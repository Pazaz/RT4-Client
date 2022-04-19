import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ve;II)Lclient!sl;")
	public static SynthSound method3988(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4495(arg1, arg2);
		return local5 == null ? null : new SynthSound(new Buffer(local5));
	}
}
