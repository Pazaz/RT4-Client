package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ClanChat {
	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public static int transmitAt = 0;
	@OriginalMember(owner = "client!mj", name = "u", descriptor = "B")
	public static byte rank;
	@OriginalMember(owner = "client!e", name = "rc", descriptor = "B")
	public static byte minKick;
	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!na;")
	public static JagString owner = null;
	@OriginalMember(owner = "client!be", name = "ac", descriptor = "Lclient!na;")
	public static JagString name = null;
	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	public static int size;
	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "[Lclient!kl;")
	public static ClanMember[] members;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public static void leave() {
		Protocol.outboundBuffer.p1isaac(ClientProt.CLAN_JOINCHAT_LEAVECHAT);
		Protocol.outboundBuffer.p8(0L);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)V")
	public static void join(@OriginalArg(0) long arg0) {
		if ((long) 0 != arg0) {
			Protocol.outboundBuffer.p1isaac(ClientProt.CLAN_JOINCHAT_LEAVECHAT);
			Protocol.outboundBuffer.p8(arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!na;)V")
	public static void kick(@OriginalArg(1) JagString arg0) {
		if (members == null) {
			return;
		}
		@Pc(22) long local22 = arg0.encode37();
		@Pc(24) int local24 = 0;
		if (local22 == 0L) {
			return;
		}
		while (members.length > local24 && members[local24].key != local22) {
			local24++;
		}
		if (local24 < members.length && members[local24] != null) {
			Protocol.outboundBuffer.p1isaac(ClientProt.CLAN_KICKUSER);
			Protocol.outboundBuffer.p8(members[local24].key);
		}
	}
}
