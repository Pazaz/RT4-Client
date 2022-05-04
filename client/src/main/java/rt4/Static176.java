package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_1107 = JagString.parse(")4l=");
    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!na;")
    public static final JagString aClass100_184 = JagString.parse("1");
	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_193 = JagString.parse(":");
	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!na;")
	public static final JagString aClass100_420 = JagString.parse(")1o");
	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_783 = JagString.parse(")4p=");
	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!ve;")
	public static Js5 aClass153_76;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[Z")
	public static final boolean[] customCameraActive = new boolean[5];

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_800 = JagString.parse("");

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!na;")
	private static final JagString aClass100_801 = JagString.parse(")4a=");

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_802 = JagString.parse("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Z")
	public static boolean hopWorld(@OriginalArg(0) int arg0) {
		@Pc(3) World local3 = Static54.getWorld(arg0);
		if (local3 == null) {
			return false;
		} else if (SignLink.anInt5928 == 1 || SignLink.anInt5928 == 2 || client.modeWhere == 2) {
			@Pc(31) byte[] local31 = local3.hostname.method3148();
			client.hostname = new String(local31, 0, local31.length);
			Player.worldId = local3.id;
			if (client.modeWhere != 0) {
				client.defaultPort = Player.worldId + 43594; // 40000;
				client.port = client.defaultPort;
				client.alternatePort = Player.worldId + 43594; // 50000;
			}
			return true;
		} else {
			@Pc(62) JagString local62 = Static211.aClass100_230;
			if (client.modeWhere != 0) {
				local62 = JagString.concatenate(new JagString[] { aClass100_193, JagString.parseInt(local3.id + 7000) });
			}
			@Pc(89) JagString local89 = Static211.aClass100_230;
			if (client.settings != null) {
				local89 = JagString.concatenate(new JagString[] { aClass100_783, client.settings});
			}
			@Pc(182) JagString local182 = JagString.concatenate(new JagString[] { Static115.aClass100_582, local3.hostname, local62, aClass100_1107, JagString.parseInt(client.language), aClass100_801, JagString.parseInt(client.affiliate), local89, Static139.aClass100_659, client.objectTag ? aClass100_184 : Static260.aClass100_945, aClass100_420, client.javaScript ? aClass100_184 : Static260.aClass100_945, Static198.aClass100_260, client.advertSuppressed ? aClass100_184 : Static260.aClass100_945 });
			try {
				client.instance.getAppletContext().showDocument(local182.method3107(), "_self");
				return true;
			} catch (@Pc(191) Exception local191) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) PlainTile local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new PlainTile(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (SceneGraph.tiles[local14][arg1][arg2] == null) {
					SceneGraph.tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			SceneGraph.tiles[arg0][arg1][arg2].plainTile = local12;
		} else if (arg3 == 1) {
			local12 = new PlainTile(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (SceneGraph.tiles[local14][arg1][arg2] == null) {
					SceneGraph.tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			SceneGraph.tiles[arg0][arg1][arg2].plainTile = local12;
		} else {
			@Pc(134) ShapedTile local134 = new ShapedTile(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (SceneGraph.tiles[local14][arg1][arg2] == null) {
					SceneGraph.tiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			SceneGraph.tiles[arg0][arg1][arg2].shapedTile = local134;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public static void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg0; local8++) {
			Static131.method2576(Static71.anIntArrayArray10[local8], arg3, arg1, arg4);
		}
	}
}
