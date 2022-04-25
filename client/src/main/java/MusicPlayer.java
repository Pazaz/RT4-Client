import org.openrs2.deob.annotation.OriginalMember;

public class MusicPlayer {
    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int groupId = -1;
    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int titleSong;
}
