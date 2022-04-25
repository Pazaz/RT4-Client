import org.openrs2.deob.annotation.OriginalMember;

public class SceneGraph {
    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)Z")
    public static boolean allLevelsAreVisible() {
        return GlRenderer.enabled ? true : Preferences.allLevelsVisible;
    }
}
