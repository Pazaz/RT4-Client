package rt4;

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
		method3656(local113, results);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!na;I)V")
	public static void search(@OriginalArg(0) boolean arg0, @OriginalArg(1) JagString arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(12) JagString local12 = arg1.toLowerCase();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < ObjTypeList.capacity; local16++) {
			@Pc(27) ObjType local27 = ObjTypeList.get(local16);
			if ((!arg0 || local27.stockMarket) && local27.certtemplate == -1 && local27.lentTemplate == -1 && local27.dummyItem == 0 && local27.name.toLowerCase().indexOf(local12) != -1) {
				if (local14 >= 250) {
					results = null;
					index = -1;
					return;
				}
				if (local14 >= local8.length) {
					@Pc(83) short[] local83 = new short[local8.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local14; local85++) {
						local83[local85] = local8[local85];
					}
					local8 = local83;
				}
				local8[local14++] = (short) local16;
			}
		}
		results = local8;
		size = 0;
		index = local14;
		@Pc(117) JagString[] local117 = new JagString[index];
		for (@Pc(119) int local119 = 0; local119 < index; local119++) {
			local117[local119] = ObjTypeList.get(local8[local119]).name;
		}
		method3656(local117, results);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lclient!na;[SI)V")
	public static void method3656(@OriginalArg(0) JagString[] arg0, @OriginalArg(1) short[] arg1) {
		method1307(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([SI[Lclient!na;II)V")
	public static void method1307(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = arg3;
		@Pc(21) int local21 = (arg3 + arg1) / 2;
		@Pc(25) JagString local25 = arg2[local21];
		arg2[local21] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) short local39 = arg0[local21];
		arg0[local21] = arg0[arg1];
		arg0[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (local25 == null || arg2[local51] != null && arg2[local51].method3139(local25) < (local51 & 0x1)) {
				@Pc(80) JagString local80 = arg2[local51];
				arg2[local51] = arg2[local14];
				arg2[local14] = local80;
				@Pc(94) short local94 = arg0[local51];
				arg0[local51] = arg0[local14];
				arg0[local14++] = local94;
			}
		}
		arg2[arg1] = arg2[local14];
		arg2[local14] = local25;
		arg0[arg1] = arg0[local14];
		arg0[local14] = local39;
		method1307(arg0, local14 - 1, arg2, arg3);
		method1307(arg0, arg1, arg2, local14 + 1);
	}
}
