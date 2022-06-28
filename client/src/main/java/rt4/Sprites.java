package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Sprites {
	@OriginalMember(owner = "client!bh", name = "s", descriptor = "Lclient!na;")
	public static final JagString P11_FULL = JagString.parse("p11_full");

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!na;")
	public static final JagString P12_FULL = JagString.parse("p12_full");

	@OriginalMember(owner = "client!fm", name = "eb", descriptor = "Lclient!na;")
	public static final JagString B12_FULL = JagString.parse("b12_full");

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "Lclient!na;")
	public static final JagString MAPFUNCTION = JagString.parse("mapfunction");

	@OriginalMember(owner = "client!rl", name = "S", descriptor = "Lclient!na;")
	public static final JagString HITMARKS = JagString.parse("hitmarks");

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!na;")
	public static final JagString HITBAR_DEFAULT = JagString.parse("hitbar_default");

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!na;")
	public static final JagString HEADICONS_PK = JagString.parse("headicons_pk");

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!na;")
	public static final JagString HEADICONS_PRAYER = JagString.parse("headicons_prayer");

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!na;")
	public static final JagString HINT_HEADICONS = JagString.parse("hint_headicons");

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!na;")
	public static final JagString HINT_MAPMARKERS = JagString.parse("hint_mapmarkers");

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lclient!na;")
	public static final JagString MAPFLAG = JagString.parse("mapflag");

	@OriginalMember(owner = "client!gm", name = "db", descriptor = "Lclient!na;")
	public static final JagString CROSS = JagString.parse("cross");

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!na;")
	public static final JagString MAPDOTS = JagString.parse("mapdots");

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!na;")
	public static final JagString SCROLLBAR = JagString.parse("scrollbar");

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lclient!na;")
	public static final JagString NAME_ICONS = JagString.parse("name_icons");

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!na;")
	public static final JagString FLOORSHADOWS = JagString.parse("floorshadows");

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Lclient!na;")
	public static final JagString COMPASS = JagString.parse("compass");

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!na;")
	public static final JagString HINT_MAPEDGE = JagString.parse("hint_mapedge");

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int p11FullId;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	public static int p12FullId;

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	public static int b12FullId;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public static int mapfunctionId;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
	public static int hitmarksId;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int hitbarId;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public static int headiconsPkId;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	public static int headiconsPrayerId;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
	public static int hintHeadId;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
	public static int hintMapMarkId;

	@OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
	public static int mapflagId;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
	public static int crossId;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public static int mapdotsId;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	public static int scrollbarId;

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
	public static int nameIconsId;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	public static int floorShadowsId;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	public static int compassId;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static int hintMapEdgeId;
	@OriginalMember(owner = "client!tj", name = "d", descriptor = "[Lclient!ek;")
	public static SoftwareIndexedSprite[] floorShadows;
	@OriginalMember(owner = "client!nk", name = "L", descriptor = "[Lclient!mm;")
	public static SoftwareSprite[] mapfunctions;
	@OriginalMember(owner = "client!re", name = "w", descriptor = "[Lclient!qf;")
	public static Sprite[] hitmarks;
	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lclient!qf;")
	public static Sprite[] hitbars;
	@OriginalMember(owner = "client!rl", name = "V", descriptor = "[Lclient!qf;")
	public static Sprite[] headiconPks;
	@OriginalMember(owner = "client!km", name = "sc", descriptor = "[Lclient!qf;")
	public static Sprite[] headiconPrayers;
	@OriginalMember(owner = "client!wh", name = "l", descriptor = "[Lclient!qf;")
	public static Sprite[] headhints;
	@OriginalMember(owner = "client!lj", name = "t", descriptor = "[Lclient!qf;")
	public static Sprite[] mapmarkhints;
	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[Lclient!qf;")
	public static Sprite[] crosses;
	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!qf;")
	public static Sprite mapflags;
	@OriginalMember(owner = "client!l", name = "j", descriptor = "[Lclient!qf;")
	public static Sprite[] mapdots;
	@OriginalMember(owner = "client!mi", name = "T", descriptor = "[Lclient!ok;")
	public static IndexedSprite[] nameIcons;
	@OriginalMember(owner = "client!th", name = "f", descriptor = "[Lclient!ok;")
	public static IndexedSprite[] scrollbars;
	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!qf;")
	public static Sprite compass;
	@OriginalMember(owner = "client!wi", name = "R", descriptor = "[Lclient!qf;")
	public static Sprite[] hintMapEdge;
	@OriginalMember(owner = "client!fe", name = "lc", descriptor = "[Lclient!qf;")
	public static Sprite[] mapfuncs;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		p11FullId = archive.getGroupId(P11_FULL);
		p12FullId = archive.getGroupId(P12_FULL);
		b12FullId = archive.getGroupId(B12_FULL);
		mapfunctionId = archive.getGroupId(MAPFUNCTION);
		hitmarksId = archive.getGroupId(HITMARKS);
		hitbarId = archive.getGroupId(HITBAR_DEFAULT);
		headiconsPkId = archive.getGroupId(HEADICONS_PK);
		headiconsPrayerId = archive.getGroupId(HEADICONS_PRAYER);
		hintHeadId = archive.getGroupId(HINT_HEADICONS);
		hintMapMarkId = archive.getGroupId(HINT_MAPMARKERS);
		mapflagId = archive.getGroupId(MAPFLAG);
		crossId = archive.getGroupId(CROSS);
		mapdotsId = archive.getGroupId(MAPDOTS);
		scrollbarId = archive.getGroupId(SCROLLBAR);
		nameIconsId = archive.getGroupId(NAME_ICONS);
		floorShadowsId = archive.getGroupId(FLOORSHADOWS);
		compassId = archive.getGroupId(COMPASS);
		hintMapEdgeId = archive.getGroupId(HINT_MAPEDGE);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ve;B)I")
	public static int getReady(@OriginalArg(0) Js5 archive) {
		@Pc(5) int ready = 0;
		if (archive.isFileReady(mapfunctionId)) {
			ready++;
		}
		if (archive.isFileReady(hitmarksId)) {
			ready++;
		}
		if (archive.isFileReady(hitbarId)) {
			ready++;
		}
		if (archive.isFileReady(headiconsPkId)) {
			ready++;
		}
		if (archive.isFileReady(headiconsPrayerId)) {
			ready++;
		}
		if (archive.isFileReady(hintHeadId)) {
			ready++;
		}
		if (archive.isFileReady(hintMapMarkId)) {
			ready++;
		}
		if (archive.isFileReady(mapflagId)) {
			ready++;
		}
		if (archive.isFileReady(crossId)) {
			ready++;
		}
		if (archive.isFileReady(mapdotsId)) {
			ready++;
		}
		if (archive.isFileReady(scrollbarId)) {
			ready++;
		}
		if (archive.isFileReady(nameIconsId)) {
			ready++;
		}
		if (archive.isFileReady(floorShadowsId)) {
			ready++;
		}
		if (archive.isFileReady(compassId)) {
			ready++;
		}
		if (archive.isFileReady(hintMapEdgeId)) {
			ready++;
		}
		return ready;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!ve;)V")
	public static void load(@OriginalArg(1) Js5 archive) {
		mapfunctions = SpriteLoader.loadSoftwareSprites(mapfunctionId, archive);
		hitmarks = SpriteLoader.loadAlphaSprites(hitmarksId, archive);
		hitbars = SpriteLoader.loadAlphaSprites(hitbarId, archive);
		headiconPks = SpriteLoader.loadAlphaSprites(headiconsPkId, archive);
		headiconPrayers = SpriteLoader.loadAlphaSprites(headiconsPrayerId, archive);
		headhints = SpriteLoader.loadAlphaSprites(hintHeadId, archive);
		mapmarkhints = SpriteLoader.loadAlphaSprites(hintMapMarkId, archive);
		mapflags = SpriteLoader.loadSprites(mapflagId, archive);
		crosses = SpriteLoader.method2580(crossId, archive);
		mapdots = SpriteLoader.method2580(mapdotsId, archive);
		scrollbars = SpriteLoader.loadIndexedSprites(archive, scrollbarId);
		nameIcons = SpriteLoader.loadIndexedSprites(archive, nameIconsId);
		Fonts.p11Full.setNameIcons(nameIcons, null);
		Fonts.p12Full.setNameIcons(nameIcons, null);
		Fonts.b12Full.setNameIcons(nameIcons, null);
		if (GlRenderer.enabled) {
			floorShadows = SpriteLoader.loadSoftwareIndexedSprites(floorShadowsId, archive);
			for (@Pc(101) int local101 = 0; local101 < floorShadows.length; local101++) {
				floorShadows[local101].trim();
			}
		}
		@Pc(124) SoftwareSprite newCompass = SpriteLoader.loadSoftwareSprite(0, archive, compassId);
		newCompass.trim();
		if (GlRenderer.enabled) {
			compass = new GlSprite(newCompass);
		} else {
			compass = newCompass;
		}
		@Pc(143) SoftwareSprite[] local143 = SpriteLoader.loadSoftwareSprites(hintMapEdgeId, archive);
		@Pc(145) int local145;
		for (local145 = 0; local145 < local143.length; local145++) {
			local143[local145].trim();
		}
		if (GlRenderer.enabled) {
			hintMapEdge = new Sprite[local143.length];
			for (local145 = 0; local145 < local143.length; local145++) {
				hintMapEdge[local145] = new GlSprite(local143[local145]);
			}
		} else {
			hintMapEdge = local143;
		}
		@Pc(196) int local196 = (int) ((double) 21 * Math.random()) - 10;
		local145 = (int) (Math.random() * 21.0D) - 10;
		@Pc(210) int local210 = (int) (Math.random() * 21.0D) - 10;
		@Pc(217) int local217 = (int) (Math.random() * 41.0D) - 20;
		@Pc(219) int local219;
		for (local219 = 0; local219 < mapfunctions.length; local219++) {
			mapfunctions[local219].method315(local145 + local217, local217 + local196, local217 + local210);
		}
		if (GlRenderer.enabled) {
			mapfuncs = new Sprite[mapfunctions.length];
			for (local219 = 0; local219 < mapfunctions.length; local219++) {
				mapfuncs[local219] = new GlSprite(mapfunctions[local219]);
			}
		} else {
			mapfuncs = mapfunctions;
		}
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(I)I")
	public static int total() {
		return 15;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void clear() {
		Fonts.p12Full = null;
		hitmarks = null;
		crosses = null;
		nameIcons = null;
		Fonts.p11FullSoftware = null;
		mapfunctions = null;
		mapfuncs = null;
		mapmarkhints = null;
		headiconPrayers = null;
		Fonts.b12Full = null;
		compass = null;
		mapdots = null;
		Fonts.p11Full = null;
		mapflags = null;
		hitbars = null;
		hintMapEdge = null;
		headhints = null;
		headiconPks = null;
		scrollbars = null;
	}
}
