package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class IdkTypeList {

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Lclient!ve;")
	public static Js5 modelsArchive;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public static int count;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ve;Lclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		modelsArchive = arg0;
		archive = arg1;
		count = archive.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Lclient!dm;")
	public static IdkType get(@OriginalArg(0) int id) {
		@Pc(10) IdkType type = (IdkType) types.get(id);
		if (type != null) {
			return type;
		}
		@Pc(21) byte[] src = archive.fetchFile(3, id);
		type = new IdkType();
		if (src != null) {
			type.decode(new Buffer(src));
		}
		types.put(type, id);
		return type;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	public static void clean() {
		types.clean(5);
	}
}
