package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SpotAnimTypeList {
	@OriginalMember(owner = "client!wk", name = "t", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!n;")
	public static final SoftLruHashTable models = new SoftLruHashTable(30);
	@OriginalMember(owner = "client!he", name = "cb", descriptor = "Lclient!ve;")
	public static Js5 modelsArchive;
	@OriginalMember(owner = "client!ke", name = "R", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ve;Lclient!ve;I)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		modelsArchive = arg0;
		archive = arg1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)Lclient!eg;")
	public static SpotAnimType get(@OriginalArg(1) int arg0) {
		@Pc(10) SpotAnimType local10 = (SpotAnimType) types.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = archive.fetchFile(method3681(arg0), method4010(arg0));
		local10 = new SpotAnimType();
		local10.id = arg0;
		if (local26 != null) {
			local10.decode(new Buffer(local26));
		}
		types.put(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)I")
	public static int method3681(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
	public static int method4010(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public static void method4249() {
		types.clear();
		models.clear();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method1441() {
		types.method3103();
		models.method3103();
	}
}
