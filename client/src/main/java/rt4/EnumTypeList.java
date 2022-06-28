package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class EnumTypeList {
	@OriginalMember(owner = "client!lj", name = "p", descriptor = "Lclient!gn;")
	public static final LruHashTable types = new LruHashTable(128);
	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void init(@OriginalArg(0) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Lclient!ml;")
	public static EnumType get(@OriginalArg(0) int arg0) {
		@Pc(10) EnumType local10 = (EnumType) types.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = archive.fetchFile(getGroupId(arg0), getFileId(arg0));
		local10 = new EnumType();
		if (local24 != null) {
			local10.decode(new Buffer(local24));
		}
		types.put(local10, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(BI)I")
	public static int getFileId(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
	public static int getGroupId(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
