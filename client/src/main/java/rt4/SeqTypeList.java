package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SeqTypeList {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!n;")
	public static final SoftLruHashTable animFramesets = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ve;")
	public static Js5 basesArchive;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!ve;")
	public static Js5 animsArchive;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lclient!tk;")
	public static SeqType get(@OriginalArg(0) int id) {
		@Pc(17) SeqType sequence = (SeqType) types.get(id);
		if (sequence != null) {
			return sequence;
		}
		@Pc(32) byte[] data = archive.fetchFile(getGroupId(id), getFileId(id));
		sequence = new SeqType();
		sequence.id = id;
		if (data != null) {
			sequence.decode(new Buffer(data));
		}
		sequence.postDecode();
		types.put(sequence, id);
		return sequence;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
	public static int getGroupId(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	public static int getFileId(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ve;Lclient!ve;ILclient!ve;)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(3) Js5 arg2) {
		archive = arg1;
		basesArchive = arg0;
		animsArchive = arg2;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	public static void clear() {
		types.clear();
		animFramesets.clear();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void removeSoft() {
		types.removeSoft();
		animFramesets.removeSoft();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public static void clean() {
		types.clean(5);
		animFramesets.clean(5);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!cl;")
	public static AnimFrameset getAnimFrameset(@OriginalArg(0) int id) {
		@Pc(19) AnimFrameset frameset = (AnimFrameset) animFramesets.get(id);
		if (frameset != null) {
			return frameset;
		}
		frameset = AnimFrameset.create(animsArchive, basesArchive, id);
		if (frameset != null) {
			animFramesets.put(frameset, id);
		}
		return frameset;
	}
}
