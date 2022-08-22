package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ParamTypeList {
	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!gn;")
	public static final LruHashTable types = new LruHashTable(64);
	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lclient!hn;")
	public static ParamType get(@OriginalArg(1) int id) {
		@Pc(6) ParamType paramType = (ParamType) types.get(id);
		if (paramType != null) {
			return paramType;
		}
		@Pc(30) byte[] data = archive.fetchFile(11, id);
		paramType = new ParamType();
		if (data != null) {
			paramType.decode(new Buffer(data));
		}
		types.put(paramType, id);
		return paramType;
	}
}
