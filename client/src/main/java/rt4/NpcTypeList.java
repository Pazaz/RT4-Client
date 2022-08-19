package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class NpcTypeList {
	@OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!jl", name = "x", descriptor = "Lclient!n;")
	public static final SoftLruHashTable models = new SoftLruHashTable(50);
	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!n;")
	public static final SoftLruHashTable headModels = new SoftLruHashTable(5);
	@OriginalMember(owner = "client!gm", name = "ib", descriptor = "Lclient!ve;")
	public static Js5 modelsArchive;
	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Z)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		modelsArchive = arg0;
		archive = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lclient!me;")
	public static NpcType get(@OriginalArg(0) int id) {
		@Pc(10) NpcType npc = (NpcType) types.get(id);
		if (npc != null) {
			return npc;
		}
		@Pc(26) byte[] data = archive.fetchFile(getGroupId(id), getFileId(id));
		npc = new NpcType();
		npc.id = id;
		if (data != null) {
			npc.decode(new Buffer(data));
		}
		npc.method2942();
		types.put(npc, id);
		return npc;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
		models.removeSoft();
		headModels.removeSoft();
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
	public static void clear() {
		types.clear();
		models.clear();
		headModels.clear();
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(BI)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
		headModels.clean(5);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I")
	public static int getGroupId(@OriginalArg(0) int id) {
		return id >>> 7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I")
	public static int getFileId(@OriginalArg(0) int id) {
		return id & 0x7F;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public static void clearModels() {
		models.clear();
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void clearHeadModels() {
		headModels.clear();
	}
}
