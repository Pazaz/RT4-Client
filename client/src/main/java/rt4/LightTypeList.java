package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class LightTypeList {
	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void init(@OriginalArg(0) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!ic;")
	public static LightType get(@OriginalArg(1) int arg0) {
		@Pc(10) LightType local10 = (LightType) types.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = archive.fetchFile(31, arg0);
		local10 = new LightType();
		if (local26 != null) {
			local10.decode(new Buffer(local26), arg0);
		}
		types.put(local10, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}
}
