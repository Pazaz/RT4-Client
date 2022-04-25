import org.openrs2.deob.annotation.OriginalMember;

public class VarcDomain {
    @OriginalMember(owner = "client!t", name = "E", descriptor = "[I")
    public static final int[] updatedVarcstrs = new int[32];
    @OriginalMember(owner = "client!km", name = "Bc", descriptor = "[I")
    public static final int[] updatedVarcs = new int[32];
    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int updatedVarcstrsWriterIndex = 0;
    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int updatedVarcsWriterIndex = 0;
}
