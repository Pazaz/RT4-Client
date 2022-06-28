package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class FloTypeList {
	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public static int capacity;
	@OriginalMember(owner = "client!cl", name = "J", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0) {
		archive = arg0;
		capacity = archive.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Lclient!wl;")
	public static FloType method4395(@OriginalArg(1) int arg0) {
		@Pc(6) FloType local6 = (FloType) types.get(arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(30) byte[] local30 = archive.fetchFile(4, arg0);
		local6 = new FloType();
		if (local30 != null) {
			local6.decode(new Buffer(local30), arg0);
		}
		types.put(local6, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}
}
