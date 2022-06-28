package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MsiTypeList {
	@OriginalMember(owner = "client!sk", name = "hb", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!rl", name = "P", descriptor = "Lclient!n;")
	public static final SoftLruHashTable sprites = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!ve;")
	public static Js5 archive;
	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!ve;")
	public static Js5 spritesArchive;
	@OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
	public static int blueDelta;
	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	public static int greenDelta;
	@OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
	public static int redDelta;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Lclient!aa;")
	public static MsiType get(@OriginalArg(0) int arg0) {
		@Pc(10) MsiType local10 = (MsiType) types.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = archive.fetchFile(34, arg0);
		local10 = new MsiType();
		if (local20 != null) {
			local10.decode(new Buffer(local20), arg0);
		}
		types.put(local10, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ve;Lclient!ve;B)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		spritesArchive = arg1;
		@Pc(12) int local12 = (int) (Math.random() * 21.0D) - 10;
		archive = arg0;
		@Pc(21) int local21 = (int) (Math.random() * 21.0D) - 10;
		archive.getGroupCapacity(34);
		@Pc(33) int local33 = (int) (Math.random() * 21.0D) - 10;
		@Pc(40) int local40 = (int) (Math.random() * 41.0D) - 20;
		blueDelta = local40 + local21;
		greenDelta = local12 + local40;
		redDelta = local40 + local33;
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
	public static void clear() {
		types.clear();
		sprites.clear();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		sprites.removeSoft();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		sprites.clean(5);
	}
}
