package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarbitTypeList {
	@OriginalMember(owner = "client!jl", name = "G", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void init(@OriginalArg(0) Js5 arg0) {
		archive = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)Lclient!kk;")
	public static VarbitType get(@OriginalArg(0) int id) {
		@Pc(10) VarbitType varbit = (VarbitType) types.get(id);
		if (varbit != null) {
			return varbit;
		}
		@Pc(31) byte[] data = archive.fetchFile(getGroupId(id), getFileId(id));
		varbit = new VarbitType();
		if (data != null) {
			varbit.decode(new Buffer(data));
		}
		types.put(varbit, id);
		return varbit;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(BI)V")
	public static void clean() {
		types.clean(5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void clear() {
		types.clear();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
	public static int getFileId(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	public static int getGroupId(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
