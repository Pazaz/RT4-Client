package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class InvTypeList {
	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!gn;")
	public static final LruHashTable types = new LruHashTable(64);
	@OriginalMember(owner = "client!al", name = "q", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!md;")
	public static InvType get(@OriginalArg(0) int id) {
		@Pc(16) InvType invType = (InvType) types.get(id);
		if (invType != null) {
			return invType;
		}
		@Pc(27) byte[] data = archive.fetchFile(5, id);
		invType = new InvType();
		if (data != null) {
			invType.decode(new Buffer(data));
		}
		types.put(invType, id);
		return invType;
	}
}
