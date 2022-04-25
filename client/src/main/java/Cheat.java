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
    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!na;")
    public static final JagString aClass100_334 = JagString.parse("Cache:");
    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!na;")
    public static final JagString aClass100_154 = JagString.parse("Mem:");
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
    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
    public static boolean displayFps = false;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIB)V")
	public static void teleport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(66) JagString local66 = JagString.concatenate(new JagString[] { Static96.aClass100_521, Static123.parseInt(arg2), Static159.aClass100_760, Static123.parseInt(arg0 >> 6), Static159.aClass100_760, Static123.parseInt(arg1 >> 6), Static159.aClass100_760, Static123.parseInt(arg0 & 0x3F), Static159.aClass100_760, Static123.parseInt(arg1 & 0x3F) });
		local66.method3129();
		Static127.method2470(local66);
	}
}
