import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	public static int anInt384 = 0;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method443() {
		NpcTypeList.headModels.clear();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I")
	public static int getFreeSpaces(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Inv local17 = (Inv) Static20.objectContainerCache.get((long) arg0);
		if (local17 == null) {
			return InvTypeList.list(arg0).size;
		}
		@Pc(31) int freeSpaces = 0;
		for (@Pc(33) int id = 0; id < local17.objectIds.length; id++) {
			if (local17.objectIds[id] == -1) {
				freeSpaces++;
			}
		}
		return freeSpaces + InvTypeList.list(arg0).size - local17.objectIds.length;
	}
}
