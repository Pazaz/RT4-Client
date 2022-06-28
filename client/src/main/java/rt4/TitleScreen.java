package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class TitleScreen {
	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lclient!na;")
	public static final JagString TITLEBG = JagString.parse("titlebg");
	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Lclient!na;")
	public static final JagString LOGO = JagString.parse("logo");

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "Z")
	public static boolean loaded;
	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!qf;")
	public static Sprite titleBg;
	@OriginalMember(owner = "client!tk", name = "o", descriptor = "Lclient!ok;")
	public static IndexedSprite logo;
	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public static int bgId = -1;
	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	public static int logoId = -1;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void load(@OriginalArg(0) Js5 archive) {
		if (loaded) {
			return;
		}

		if (GlRenderer.enabled) {
			GlRaster.clear();
		} else {
			SoftwareRaster.clear();
		}

		@Pc(20) int height = GameShell.canvasHeight;
		@Pc(26) int width = height * 956 / 503;
		titleBg = SpriteLoader.loadSpriteAutoDetect(archive, bgId);
		titleBg.renderResized((GameShell.canvasWidth - width) / 2, 0, width, height);
		logo = SpriteLoader.loadIndexedSpriteAutoDetect(logoId, archive);
		logo.renderTransparent(GameShell.canvasWidth / 2 - logo.width / 2, 18);
		loaded = true;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V")
	public static void clear() {
		if (loaded) {
			logo = null;
			loaded = false;
			titleBg = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		bgId = archive.getGroupId(TITLEBG);
		logoId = archive.getGroupId(LOGO);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!ve;)I")
	public static int getReady(@OriginalArg(1) Js5 archive) {
		@Pc(1) int ready = 0;
		if (archive.isFileReady(bgId)) {
			ready++;
		}
		if (archive.isFileReady(logoId)) {
			ready++;
		}
		return ready;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
	public static int getTotal() {
		return 2;
	}
}
