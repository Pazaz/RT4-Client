import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Inv extends Node {

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "[I")
    public static final int[] updatedInventories = new int[32];
    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[I")
	public int[] objectIds = new int[] { -1 };

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "[I")
	public int[] anIntArray422 = new int[] { 0 };

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I")
    public static int getFreeSpace(@OriginalArg(0) int arg0) {
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

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZII)I")
    public static int getTotalParam(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        @Pc(19) Inv local19 = (Inv) Static20.objectContainerCache.get((long) arg1);
        if (local19 == null) {
            return 0;
        }
        @Pc(27) int local27 = 0;
        for (@Pc(29) int local29 = 0; local29 < local19.objectIds.length; local29++) {
            if (local19.objectIds[local29] >= 0 && ObjTypeList.anInt3245 > local19.objectIds[local29]) {
                @Pc(56) ObjType local56 = ObjTypeList.get(local19.objectIds[local29]);
                if (local56.params != null) {
                    @Pc(68) IntNode local68 = (IntNode) local56.params.get((long) arg2);
                    if (local68 != null) {
                        if (arg0) {
                            local27 += local19.anIntArray422[local29] * local68.value;
                        } else {
                            local27 += local68.value;
                        }
                    }
                }
            }
        }
        return local27;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)I")
    public static int getSlotTotal(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(8) Inv local8 = (Inv) Static20.objectContainerCache.get((long) arg0);
        if (local8 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            @Pc(25) int local25 = 0;
            for (@Pc(27) int local27 = 0; local27 < local8.anIntArray422.length; local27++) {
                if (arg1 == local8.objectIds[local27]) {
                    local25 += local8.anIntArray422[local27];
                }
            }
            return local25;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
    public static int getItemCount(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(10) Inv local10 = (Inv) Static20.objectContainerCache.get((long) arg0);
        if (local10 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < local10.anIntArray422.length) {
            return local10.anIntArray422[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
    public static int getItemType(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        @Pc(10) Inv local10 = (Inv) Static20.objectContainerCache.get((long) arg0);
        if (local10 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < local10.objectIds.length) {
            return local10.objectIds[arg1];
        } else {
            return -1;
        }
    }
}
