package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class TitleScreen {
    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lclient!na;")
    public static final JagString aClass100_165 = JagString.parse("titlebg");

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ve;B)V")
    public static void load(@OriginalArg(0) Js5 archive) {
        if (Static18.loaded) {
            return;
        }

        if (GlRenderer.enabled) {
            Static46.clear();
        } else {
            SoftwareRaster.clear();
        }

        @Pc(20) int height = GameShell.canvasHeight;
        @Pc(26) int width = height * 956 / 503;
        Static78.titleBg = Static130.loadSpriteAutoDetect(archive, Static262.bgId);
        Static78.titleBg.renderResizedTransparent((GameShell.canvasWidth - width) / 2, 0, width, height);
        Static243.logo = Static40.loadIndexedSpriteAutoDetect(Static136.logoId, archive);
        Static243.logo.renderTransparent(GameShell.canvasWidth / 2 - Static243.logo.width / 2, 18);
        Static18.loaded = true;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V")
    public static void clear() {
        if (Static18.loaded) {
            Static243.logo = null;
            Static18.loaded = false;
            Static78.titleBg = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!ve;)V")
    public static void init(@OriginalArg(1) Js5 arg0) {
        Static262.bgId = arg0.getGroupId(aClass100_165);
        Static136.logoId = arg0.getGroupId(Static165.aClass100_776);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ve;)I")
    public static int getReady(@OriginalArg(1) Js5 archive) {
        @Pc(1) int ready = 0;
        if (archive.isFileReady(Static262.bgId)) {
            ready++;
        }
        if (archive.isFileReady(Static136.logoId)) {
            ready++;
        }
        return ready;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
    public static int getTotal() {
        return 2;
    }
}
