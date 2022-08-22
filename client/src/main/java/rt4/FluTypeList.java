package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class FluTypeList {
	@OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!oj", name = "x", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lclient!ni;")
	public static FluType get(@OriginalArg(1) int id) {
		@Pc(10) FluType floorUnderlay = (FluType) types.get(id);
		if (floorUnderlay != null) {
			return floorUnderlay;
		}
		@Pc(27) byte[] data = archive.fetchFile(1, id);
		floorUnderlay = new FluType();
		if (data != null) {
			floorUnderlay.decode(id, new Buffer(data));
		}
		types.put(floorUnderlay, id);
		return floorUnderlay;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void init(@OriginalArg(0) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(IB)V")
	public static void clean() {
		types.clean(5);
	}
}
