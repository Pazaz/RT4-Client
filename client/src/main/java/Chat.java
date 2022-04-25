import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Chat {
    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "[I")
	public static final int[] anIntArray67 = new int[100];
    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lclient!na;")
    public static final JagString[] aClass100Array62 = new JagString[100];
    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[Lclient!na;")
    public static final JagString[] aClass100Array158 = new JagString[100];
    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    public static final int[] anIntArray521 = new int[100];
    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array112 = new JagString[100];
    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int transmitAt = 0;
    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int anInt1941 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!na;Lclient!na;BLclient!na;)V")
    public static void add(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString arg2, @OriginalArg(3) JagString arg3, @OriginalArg(5) JagString arg4) {
        for (@Pc(14) int local14 = 99; local14 > 0; local14--) {
            anIntArray67[local14] = anIntArray67[local14 - 1];
            aClass100Array112[local14] = aClass100Array112[local14 - 1];
            aClass100Array158[local14] = aClass100Array158[local14 - 1];
            aClass100Array62[local14] = aClass100Array62[local14 - 1];
            anIntArray521[local14] = anIntArray521[local14 - 1];
        }
        anInt1941++;
        anIntArray67[0] = arg1;
        aClass100Array112[0] = arg4;
        transmitAt = InterfaceList.transmitTimer;
        anIntArray521[0] = arg0;
        aClass100Array158[0] = arg2;
        aClass100Array62[0] = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!na;ILclient!na;I)V")
    public static void add(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString arg2) {
        add(-1, arg1, arg2, null, arg0);
    }
}
