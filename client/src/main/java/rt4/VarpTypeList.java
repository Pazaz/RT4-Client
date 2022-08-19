package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarpTypeList {
	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "Lclient!ve;")
	public static Js5 archive;
	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void init(@OriginalArg(0) Js5 arg0) {
		archive = arg0;
		anInt4043 = archive.getGroupCapacity(16);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!eh;")
	public static VarpType get(@OriginalArg(1) int id) {
		@Pc(10) VarpType varp = (VarpType) types.get(id);
		if (varp != null) {
			return varp;
		}
		@Pc(20) byte[] data = archive.fetchFile(16, id);
		varp = new VarpType();
		if (data != null) {
			varp.decode(new Buffer(data));
		}
		types.put(varp, id);
		return varp;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
	}
}
