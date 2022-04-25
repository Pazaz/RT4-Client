import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class WordPack {
    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!na;")
    public static final JagString CABBAGE = JagString.parse("Cabbage");
    @OriginalMember(owner = "client!f", name = "W", descriptor = "Lclient!fi;")
    public static HuffmanCodec codec;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fi;I)V")
    public static void init(@OriginalArg(0) HuffmanCodec arg0) {
        codec = arg0;
    }
}
