import org.openrs2.deob.annotation.OriginalMember;

public class VarpDomain {
    @OriginalMember(owner = "client!gj", name = "q", descriptor = "[I")
    public static final int[] updatedVarps = new int[32];
    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int updatedVarpsWriterIndex = 0;
}
