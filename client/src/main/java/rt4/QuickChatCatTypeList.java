package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class QuickChatCatTypeList {
	@OriginalMember(owner = "client!fm", name = "db", descriptor = "Lclient!gn;")
	public static final LruHashTable types = new LruHashTable(64);
	@OriginalMember(owner = "client!gn", name = "t", descriptor = "Lclient!ve;")
	public static Js5 archive1;
	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ve;")
	public static Js5 archive2;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ve;Lclient!ve;I)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		archive1 = arg1;
		archive2 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)Lclient!bc;")
	public static QuickChatCatType get(@OriginalArg(0) int id) {
		@Pc(10) QuickChatCatType quickChatCat = (QuickChatCatType) types.get(id);
		if (quickChatCat != null) {
			return quickChatCat;
		}
		@Pc(24) byte[] data;
		if (id < 32768) {
			data = archive1.fetchFile(0, id);
		} else {
			data = archive2.fetchFile(0, id & 0x7FFF);
		}
		quickChatCat = new QuickChatCatType();
		if (data != null) {
			quickChatCat.decode(new Buffer(data));
		}
		if (id >= 32768) {
			quickChatCat.method465();
		}
		types.put(quickChatCat, id);
		return quickChatCat;
	}
}
