import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_80 = JagString.parse("(U(Y");

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int anInt441 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
	public static void method475(@OriginalArg(1) int arg0) {
		@Pc(8) Inv local8 = (Inv) Static20.objectContainerCache.get((long) arg0);
		if (local8 != null) {
			for (@Pc(24) int local24 = 0; local24 < local8.objectIds.length; local24++) {
				local8.objectIds[local24] = -1;
				local8.anIntArray422[local24] = 0;
			}
		}
	}
}
