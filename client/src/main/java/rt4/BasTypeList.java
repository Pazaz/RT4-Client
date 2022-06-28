package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class BasTypeList {
	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Lclient!ck;")
	public static BasType get(@OriginalArg(1) int arg0) {
		@Pc(10) BasType local10 = (BasType) types.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = archive.fetchFile(32, arg0);
		local10 = new BasType();
		if (local21 != null) {
			local10.decode(new Buffer(local21));
		}
		local10.method878();
		types.put(local10, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}
}
