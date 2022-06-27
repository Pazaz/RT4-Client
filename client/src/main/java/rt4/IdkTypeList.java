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
	public static int anInt1716;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ve;Lclient!ve;)V")
	public static void init(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		modelsArchive = arg0;
		archive = arg1;
		anInt1716 = archive.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Lclient!dm;")
	public static IdkType get(@OriginalArg(0) int arg0) {
		@Pc(10) IdkType local10 = (IdkType) types.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = archive.fetchFile(3, arg0);
		local10 = new IdkType();
		if (local21 != null) {
			local10.decode(new Buffer(local21));
		}
		types.put(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method3342() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method3999() {
		types.clear();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	public static void clean() {
		types.clean(5);
	}
}
