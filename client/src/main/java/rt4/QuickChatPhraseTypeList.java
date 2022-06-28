package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class QuickChatPhraseTypeList {
	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Lclient!gn;")
	public static final LruHashTable types = new LruHashTable(64);
	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Lclient!ve;")
	public static Js5 archive2;
	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!of;")
	public static QuickChatCommandDecoder decoder = null;
	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!ve;")
	public static Js5 archive1;
	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt3490 = 0;
	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ve;ILclient!ve;Lclient!of;)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) QuickChatCommandDecoder arg2) {
		archive2 = arg0;
		decoder = arg2;
		archive1 = arg1;
		if (archive1 != null) {
			anInt3490 = archive1.getGroupCapacity(1);
		}
		if (archive2 != null) {
			anInt1047 = archive2.getGroupCapacity(1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lclient!cb;")
	public static QuickChatPhraseType get(@OriginalArg(1) int arg0) {
		@Pc(10) QuickChatPhraseType local10 = (QuickChatPhraseType) types.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = archive1.fetchFile(1, arg0);
		} else {
			local27 = archive2.fetchFile(1, arg0 & 0x7FFF);
		}
		local10 = new QuickChatPhraseType();
		if (local27 != null) {
			local10.decode(new Buffer(local27));
		}
		if (arg0 >= 32768) {
			local10.method763();
		}
		types.put(local10, arg0);
		return local10;
	}
}
