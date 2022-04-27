package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Cheat {
    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!na;")
    public static final JagString JS5DROP = JagString.parse("::serverjs5drop");
    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!na;")
    public static final JagString CLIENTDROP = JagString.parse("::clientdrop");
    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!na;")
    public static final JagString aClass100_333 = JagString.parse("Shift)2click ENABLED(Q");
    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "Lclient!na;")
    public static final JagString aClass100_623 = JagString.parse("::fps ");
    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!na;")
    public static final JagString aClass100_775 = JagString.parse("::breakcon");
    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!na;")
    public static final JagString aClass100_943 = JagString.parse("Forced tweening disabled)3");
    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!na;")
    public static final JagString aClass100_990 = JagString.parse("::errortest");
    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!na;")
    public static final JagString aClass100_1093 = JagString.parse("Memory after cleanup=");
    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!na;")
    public static final JagString aClass100_1088 = JagString.parse("::setparticles");
    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Lclient!na;")
    public static final JagString aClass100_232 = JagString.parse("::rect_debug");
    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!na;")
    public static final JagString aClass100_521 = JagString.parse("::tele ");
    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!na;")
    public static final JagString aClass100_522 = JagString.parse("::wm0");
    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_1009 = JagString.parse("::pcachesize");
    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "Lclient!na;")
    public static final JagString aClass100_443 = JagString.parse("::noclip");
    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!na;")
    public static final JagString aClass100_422 = JagString.parse("::fpsoff");
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
    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
    public static boolean displayFps = false;
    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Z")
	public static boolean shiftClick = GlobalConfig.USE_SHIFT_CLICK;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIB)V")
	public static void teleport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(66) JagString local66 = JagString.concatenate(new JagString[] { aClass100_521, Static123.parseInt(arg2), Static159.aClass100_760, Static123.parseInt(arg0 >> 6), Static159.aClass100_760, Static123.parseInt(arg1 >> 6), Static159.aClass100_760, Static123.parseInt(arg0 & 0x3F), Static159.aClass100_760, Static123.parseInt(arg1 & 0x3F) });
		local66.print();
		execute(local66);
	}

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!na;Z)V")
    public static void execute(@OriginalArg(0) JagString arg0) {
        if (LoginManager.staffModLevel >= 2) {
            @Pc(18) int local18;
            @Pc(38) int local38;
            @Pc(29) Runtime local29;
            if (arg0.equalsIgnoreCase(Static81.aClass100_476)) {
                client.method2380();
                for (local18 = 0; local18 < 10; local18++) {
                    System.gc();
                }
                local29 = Runtime.getRuntime();
                local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
                Chat.add(null, 0, JagString.concatenate(new JagString[] { Static202.aClass100_892, Static123.parseInt(local38), DEBUG_MEM_UNIT}));
            }
            @Pc(117) int local117;
            if (arg0.equalsIgnoreCase(Static154.aClass100_735)) {
                client.method2380();
                for (local18 = 0; local18 < 10; local18++) {
                    System.gc();
                }
                local29 = Runtime.getRuntime();
                local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
                Chat.add(null, 0, JagString.concatenate(new JagString[] { Static203.aClass100_893, Static123.parseInt(local38), DEBUG_MEM_UNIT}));
                Static16.method501();
                client.method2380();
                for (local117 = 0; local117 < 10; local117++) {
                    System.gc();
                }
                local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
                Chat.add(null, 0, JagString.concatenate(new JagString[] {aClass100_1093, Static123.parseInt(local38), DEBUG_MEM_UNIT}));
            }
            if (arg0.equalsIgnoreCase(aClass100_1009)) {
                Chat.add(null, 0, JagString.concatenate(new JagString[] { Static44.aClass100_335, Static123.parseInt(Static198.method1029()) }));
            }
            if (GlRenderer.enabled && arg0.equalsIgnoreCase(Static201.aClass100_406)) {
                System.out.println("oncard_geometry:" + GlCleaner.anInt1945);
                System.out.println("oncard_2d:" + GlCleaner.onCard2d);
                System.out.println("oncard_texture:" + GlCleaner.onCardTexture);
            }
            if (arg0.equalsIgnoreCase(CLIENTDROP)) {
                Static175.method3279();
            }
            if (arg0.equalsIgnoreCase(Static279.aClass100_1106)) {
                client.js5NetQueue.quit();
            }
            if (arg0.equalsIgnoreCase(JS5DROP)) {
                client.js5NetQueue.method2319();
            }
            if (arg0.equalsIgnoreCase(aClass100_775)) {
                GameShell.signLink.breakConnection();
                Protocol.socket.breakConnection();
                client.js5NetQueue.method2323();
            }
            if (arg0.equalsIgnoreCase(Static114.aClass100_1100)) {
                GameShell.replaceCanvas = true;
            }
            if (arg0.equalsIgnoreCase(Static148.aClass100_677)) {
                client.setGameState(25);
            }
            if (arg0.equalsIgnoreCase(Static107.aClass100_566)) {
                displayFps = true;
            }
            if (arg0.equalsIgnoreCase(aClass100_422)) {
                displayFps = false;
            }
            if (arg0.equalsIgnoreCase(aClass100_522)) {
                Static241.setWindowMode(false, 0, -1, -1);
            }
            if (arg0.equalsIgnoreCase(Static181.aClass100_811)) {
                Static241.setWindowMode(false, 1, -1, -1);
            }
            if (arg0.equalsIgnoreCase(Static207.aClass100_904)) {
                Static241.setWindowMode(false, 2, -1, -1);
            }
            if (arg0.equalsIgnoreCase(Static99.aClass100_529)) {
                Static241.setWindowMode(false, 3, 1024, 768);
            }
            if (arg0.equalsIgnoreCase(aClass100_443)) {
                for (local18 = 0; local18 < 4; local18++) {
                    for (local38 = 1; local38 < 103; local38++) {
                        for (local117 = 1; local117 < 103; local117++) {
                            PathFinder.collisionMaps[local18].anIntArrayArray30[local38][local117] = 0;
                        }
                    }
                }
            }
            if (arg0.startsWith(aClass100_1088)) {
                Preferences.setParticles(arg0.substring(15).parseInt());
                Preferences.write(GameShell.signLink);
                Preferences.sentToServer = false;
            }
            if (arg0.startsWith(aClass100_623) && client.modeWhere != 0) {
                GameShell.setFpsTarget(arg0.substring(6).parseInt());
            }
            if (arg0.equalsIgnoreCase(aClass100_990)) {
                throw new RuntimeException();
            }
            if (arg0.startsWith(aClass100_232)) {
                Static199.rectDebug = arg0.substring(12).trim().parseInt();
                Chat.add(null, 0, JagString.concatenate(new JagString[] { Static276.aClass100_1096, Static123.parseInt(Static199.rectDebug) }));
            }
            if (arg0.equalsIgnoreCase(Static181.aClass100_810)) {
                Static121.aBoolean154 = true;
            }
            if (arg0.equalsIgnoreCase(Static124.aClass100_596)) {
                if (client.applyTweening) {
                    client.applyTweening = false;
                    Chat.add(null, 0, aClass100_943);
                } else {
                    client.applyTweening = true;
                    Chat.add(null, 0, Static50.aClass100_362);
                }
            }
            if (arg0.equalsIgnoreCase(Static114.aClass100_1099)) {
                if (shiftClick) {
                    Static154.aClass100_736.print();
                    shiftClick = false;
                } else {
                    aClass100_333.print();
                    shiftClick = true;
                }
            }
        }
        Protocol.outboundBuffer.p1isaac(44);
        Protocol.outboundBuffer.p1(arg0.length() - 1);
        Protocol.outboundBuffer.pjstr(arg0.substring(2));
    }
}
