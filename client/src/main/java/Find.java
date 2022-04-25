import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Find {
    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[S")
    public static short[] results;
    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int size;
    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public static int index;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BZLclient!na;)V")
    public static void findQuickChatPhrases(@OriginalArg(1) boolean arg0, @OriginalArg(2) JagString arg1) {
        @Pc(9) JagString local9 = arg1.toLowerCase();
        @Pc(11) int local11 = 0;
        @Pc(22) short[] local22 = new short[16];
        @Pc(28) int local28 = arg0 ? 32768 : 0;
        @Pc(36) int local36 = (arg0 ? QuickChatPhraseTypeList.anInt1047 : QuickChatPhraseTypeList.anInt3490) + local28;
        for (@Pc(38) int local38 = local28; local38 < local36; local38++) {
            @Pc(45) QuickChatPhraseType local45 = QuickChatPhraseTypeList.get(local38);
            if (local45.aBoolean60 && local45.getText().toLowerCase().indexOf(local9) != -1) {
                if (local11 >= 50) {
                    index = -1;
                    results = null;
                    return;
                }
                if (local11 >= local22.length) {
                    @Pc(79) short[] local79 = new short[local22.length * 2];
                    for (@Pc(81) int local81 = 0; local81 < local11; local81++) {
                        local79[local81] = local22[local81];
                    }
                    local22 = local79;
                }
                local22[local11++] = (short) local38;
            }
        }
        results = local22;
        index = local11;
        size = 0;
        @Pc(113) JagString[] local113 = new JagString[index];
        for (@Pc(115) int local115 = 0; local115 < index; local115++) {
            local113[local115] = QuickChatPhraseTypeList.get(local22[local115]).getText();
        }
        Static202.method3656(local113, results);
    }
}
