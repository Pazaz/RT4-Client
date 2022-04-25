import org.openrs2.deob.annotation.OriginalMember;

public class LightingManager {
    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int lightCount = 0;
    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lclient!gi;")
    public static Light[] lights;
}
