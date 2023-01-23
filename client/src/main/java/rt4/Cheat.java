package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import plugin.PluginRepository;

public class Cheat {
	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!na;")
	public static final JagString JS5DROP = JagString.parse("::serverjs5drop");
	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!na;")
	public static final JagString CLIENTDROP = JagString.parse("::clientdrop");
	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_333 = JagString.parse("Shift)2click ENABLED(Q");
	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "Lclient!na;")
	public static final JagString COMMAND_FPS = JagString.parse("::fps ");
	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!na;")
	public static final JagString BREAKCON = JagString.parse("::breakcon");
	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_943 = JagString.parse("Forced tweening disabled)3");
	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!na;")
	public static final JagString ERROR_TEST = JagString.parse("::errortest");
	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_1093 = JagString.parse("Memory after cleanup=");
	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!na;")
	public static final JagString PARTICLES = JagString.parse("::setparticles");
	@OriginalMember(owner = "client!rc", name = "K", descriptor = "Lclient!na;")
	public static final JagString RECT_DEBUG = JagString.parse("::rect_debug");
	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_521 = JagString.parse("::tele ");
	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!na;")
	public static final JagString WM0 = JagString.parse("::wm0");
	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!na;")
	public static final JagString PCACHESIZE = JagString.parse("::pcachesize");
	@OriginalMember(owner = "client!fh", name = "ab", descriptor = "Lclient!na;")
	public static final JagString NOCLIP = JagString.parse("::noclip");
	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!na;")
	public static final JagString FPSOFF = JagString.parse("::fpsoff");
	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!na;")
	public static final JagString DEBUG_FPS = JagString.parse("FPS: ");
	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!na;")
	public static final JagString DEBUG_MEMORY = JagString.parse("RAM: ");
	@OriginalMember(owner = "client!bi", name = "W", descriptor = "Lclient!na;")
	public static final JagString DEBUG_MEMORY_UNIT = JagString.parse(" MB");
	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!na;")
	public static final JagString DEBUG_CAHE = JagString.parse("Cache: ");
	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "Lclient!na;")
	public static final JagString DEBUG_FPS2 = JagString.parse("FPS: ");
	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!na;")
	public static final JagString DEBUG_MEM = JagString.parse("RAM: ");
	@OriginalMember(owner = "client!bg", name = "z", descriptor = "Lclient!na;")
	public static final JagString DEBUG_MEM_UNIT = JagString.parse(" MB");
	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!na;")
	public static final JagString DEBUG_CARD = JagString.parse("GPU: ");
	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!na;")
	public static final JagString QA_OP_TEST = JagString.parse("::qa_op_test");
	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Lclient!na;")
	public static final JagString TWEENING = JagString.parse("::tween");
	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!na;")
	public static final JagString SHIFTCLICK = JagString.parse("::shiftclick");
	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!na;")
	public static final JagString CARDMEM = JagString.parse("::cardmem");
	@OriginalMember(owner = "client!e", name = "Ac", descriptor = "Lclient!na;")
	public static final JagString aClass100_362 = JagString.parse("Forced tweening ENABLED(Q");
	@OriginalMember(owner = "client!md", name = "T", descriptor = "Lclient!na;")
	public static final JagString aClass100_736 = JagString.parse("Shift)2click disabled)3");
	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!na;")
	public static final JagString RECT_DEBUG_EQUALS = JagString.parse("rect_debug=");
	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_335 = JagString.parse("Number of player models in cache:");
	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!na;")
	public static final JagString aClass100_893 = JagString.parse("Memory before cleanup=");
	@OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_892 = JagString.parse("mem=");
	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lclient!na;")
	public static final JagString aClass100_476 = JagString.parse("::gc");
	@OriginalMember(owner = "client!wk", name = "u", descriptor = "Lclient!na;")
	public static final JagString CLIENTJS5DROP = JagString.parse("::clientjs5drop");
	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!na;")
	public static final JagString FPSON = JagString.parse("::fpson");
	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Lclient!na;")
	public static final JagString MM = JagString.parse("::mm");
	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!na;")
	public static final JagString REPLACECANVAS = JagString.parse("::replacecanvas");
	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!na;")
	public static final JagString REBUILD = JagString.parse("::rebuild");
	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!na;")
	public static final JagString WM1 = JagString.parse("::wm1");
	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!na;")
	public static final JagString WM2 = JagString.parse("::wm2");
	@OriginalMember(owner = "client!hk", name = "db", descriptor = "Lclient!na;")
	public static final JagString WM3 = JagString.parse("::wm3");
	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
	public static boolean displayFps = false;
	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Z")
	public static boolean shiftClick = GlobalConfig.USE_SHIFT_CLICK;
	@OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
	public static int rectDebug = 0;
	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
	public static boolean qaOpTest = false;
	public static final JagString RELOADPLUGINS = JagString.parse("::reloadplugins");

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIB)V")
	public static void teleport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(66) JagString local66 = JagString.concatenate(new JagString[]{aClass100_521, JagString.parseInt(arg2), JagString.aClass100_760, JagString.parseInt(arg0 >> 6), JagString.aClass100_760, JagString.parseInt(arg1 >> 6), JagString.aClass100_760, JagString.parseInt(arg0 & 0x3F), JagString.aClass100_760, JagString.parseInt(arg1 & 0x3F)});
		local66.print();
		execute(local66);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!na;Z)V")
	public static void execute(@OriginalArg(0) JagString arg0) {
		PluginRepository.ProcessCommand(arg0);
		// if (LoginManager.staffModLevel >= 2) {
			@Pc(18) int local18;
			@Pc(38) int local38;
			@Pc(29) Runtime local29;
			if (arg0.equalsIgnoreCase(aClass100_476)) {
				client.unloadSoft();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Chat.add(null, 0, JagString.concatenate(new JagString[]{aClass100_892, JagString.parseInt(local38), DEBUG_MEM_UNIT}));
			}
			@Pc(117) int local117;
			if (arg0.equalsIgnoreCase(MM)) {
				client.unloadSoft();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Chat.add(null, 0, JagString.concatenate(new JagString[]{aClass100_893, JagString.parseInt(local38), DEBUG_MEM_UNIT}));
				Player.method501();
				client.unloadSoft();
				for (local117 = 0; local117 < 10; local117++) {
					System.gc();
				}
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Chat.add(null, 0, JagString.concatenate(new JagString[]{aClass100_1093, JagString.parseInt(local38), DEBUG_MEM_UNIT}));
			}
			if (arg0.equalsIgnoreCase(PCACHESIZE)) {
				Chat.add(null, 0, JagString.concatenate(new JagString[]{aClass100_335, JagString.parseInt(PlayerAppearance.getModelCacheSize())}));
			}
			if (GlRenderer.enabled && arg0.equalsIgnoreCase(CARDMEM)) {
				System.out.println("oncard_geometry:" + GlCleaner.onCardGeometry);
				System.out.println("oncard_2d:" + GlCleaner.onCard2d);
				System.out.println("oncard_texture:" + GlCleaner.onCardTexture);
			}
			if (arg0.equalsIgnoreCase(CLIENTDROP)) {
				Protocol.method3279();
			}
			if (arg0.equalsIgnoreCase(CLIENTJS5DROP)) {
				client.js5NetQueue.quit();
			}
			if (arg0.equalsIgnoreCase(JS5DROP)) {
				client.js5NetQueue.drop();
			}
			if (arg0.equalsIgnoreCase(BREAKCON)) {
				GameShell.signLink.breakConnection();
				Protocol.socket.breakConnection();
				client.js5NetQueue.breakConnection();
			}
			if (arg0.equalsIgnoreCase(REPLACECANVAS)) {
				GameShell.replaceCanvas = true;
			}
			if (arg0.equalsIgnoreCase(REBUILD)) {
				client.setGameState(25);
			}
			if (arg0.equalsIgnoreCase(FPSON)) {
				displayFps = true;
			}
			if (arg0.equalsIgnoreCase(FPSOFF)) {
				displayFps = false;
			}
			if (arg0.equalsIgnoreCase(WM0)) {
				DisplayMode.setWindowMode(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase(WM1)) {
				DisplayMode.setWindowMode(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase(WM2)) {
				DisplayMode.setWindowMode(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase(WM3)) {
				DisplayMode.setWindowMode(false, 3, 1024, 768);
			}
			if (arg0.equalsIgnoreCase(NOCLIP)) {
				for (local18 = 0; local18 < 4; local18++) {
					for (local38 = 1; local38 < 103; local38++) {
						for (local117 = 1; local117 < 103; local117++) {
							PathFinder.collisionMaps[local18].flags[local38][local117] = 0;
						}
					}
				}
			}
			if (arg0.startsWith(PARTICLES)) {
				Preferences.setParticles(arg0.substring(15).parseInt());
				Preferences.write(GameShell.signLink);
				Preferences.sentToServer = false;
			}
			if (arg0.startsWith(COMMAND_FPS) && client.modeWhere != 0) {
				GameShell.setFpsTarget(arg0.substring(6).parseInt());
			}
			if (arg0.equalsIgnoreCase(ERROR_TEST)) {
				throw new RuntimeException();
			}
			if (arg0.startsWith(RECT_DEBUG)) {
				rectDebug = arg0.substring(12).trim().parseInt();
				Chat.add(null, 0, JagString.concatenate(new JagString[]{RECT_DEBUG_EQUALS, JagString.parseInt(rectDebug)}));
			}
			if (arg0.equalsIgnoreCase(QA_OP_TEST)) {
				qaOpTest = true;
			}
			if (arg0.equalsIgnoreCase(TWEENING)) {
				if (SeqType.applyTweening) {
					SeqType.applyTweening = false;
					Chat.add(null, 0, aClass100_943);
				} else {
					SeqType.applyTweening = true;
					Chat.add(null, 0, aClass100_362);
				}
			}
			if (arg0.equalsIgnoreCase(SHIFTCLICK)) {
				if (shiftClick) {
					aClass100_736.print();
					shiftClick = false;
				} else {
					aClass100_333.print();
					shiftClick = true;
				}
			}
		if (arg0.equalsIgnoreCase(RELOADPLUGINS)) {
			PluginRepository.reloadPlugins();
		}
		//}
		sendCheatPacket(arg0);
	}

	public static void sendCheatPacket(JagString commandLine) {
		Protocol.outboundBuffer.p1isaac(ClientProt.CLIENT_CHEAT);
		Protocol.outboundBuffer.p1(commandLine.length() - 1);
		Protocol.outboundBuffer.pjstr(commandLine.substring(2));
	}

}
