package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ObjTypeList {
	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "Lclient!n;")
	public static final SoftLruHashTable types = new SoftLruHashTable(64);
	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!n;")
	public static final SoftLruHashTable models = new SoftLruHashTable(50);
	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!n;")
	public static final SoftLruHashTable objectSpriteCache = new SoftLruHashTable(100);
	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Z")
	public static boolean aBoolean276;
	@OriginalMember(owner = "client!sj", name = "r", descriptor = "Lclient!ve;")
	public static Js5 modelsArchive;
	@OriginalMember(owner = "client!um", name = "U", descriptor = "Lclient!dd;")
	public static SoftwareFont font;
	@OriginalMember(owner = "client!wa", name = "X", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array87 = null;
	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[Lclient!na;")
	public static JagString[] aClass100Array104 = null;
	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
	public static int capacity;
	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!ve;")
	public static Js5 archive;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZBLclient!ve;Lclient!dd;Lclient!ve;)V")
	public static void init(@OriginalArg(2) Js5 arg0, @OriginalArg(3) SoftwareFont arg1, @OriginalArg(4) Js5 arg2) {
		aBoolean276 = true;
		modelsArchive = arg2;
		archive = arg0;
		@Pc(23) int local23 = archive.capacity() - 1;
		capacity = archive.getGroupCapacity(local23) + local23 * 256;
		aClass100Array104 = new JagString[]{null, null, null, null, LocalizedText.DROP};
		aClass100Array87 = new JagString[]{null, null, LocalizedText.TAKE, null, null};
		font = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lclient!h;")
	public static ObjType get(@OriginalArg(0) int arg0) {
		@Pc(6) ObjType local6 = (ObjType) types.get(arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = archive.fetchFile(method554(arg0), method4247(arg0));
		local6 = new ObjType();
		local6.id = arg0;
		if (local25 != null) {
			local6.decode(new Buffer(local25));
		}
		local6.postDecode();
		if (local6.certtemplate != -1) {
			local6.generateCertificate(get(local6.certlink), get(local6.certtemplate));
		}
		if (local6.lentTemplate != -1) {
			local6.generateLent(get(local6.lentLink), get(local6.lentTemplate));
		}
		if (!aBoolean276 && local6.members) {
			local6.name = LocalizedText.MEMBERS_OBJECT;
			local6.team = 0;
			local6.iops = aClass100Array104;
			local6.stockMarket = false;
			local6.ops = aClass100Array87;
		}
		types.put(local6, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(I)V")
	public static void removeSoft() {
		types.removeSoft();
		models.removeSoft();
		objectSpriteCache.removeSoft();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void clear() {
		types.clear();
		models.clear();
		objectSpriteCache.clear();
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	public static void clean() {
		types.clean(5);
		models.clean(5);
		objectSpriteCache.clean(5);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
	public static void setAllowMembers(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean276) {
			aBoolean276 = arg0;
			clear();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void clearModels() {
		models.clear();
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
	public static void clearSprites() {
		objectSpriteCache.clear();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public static int method4247(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)I")
	public static int method554(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
