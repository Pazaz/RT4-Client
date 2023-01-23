package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class IgnoreList {
	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[J")
	public static final long[] encodedUsernames = new long[100];
	@OriginalMember(owner = "client!pi", name = "V", descriptor = "[Lclient!na;")
	public static final JagString[] usernames = new JagString[100];
	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Lclient!na;I)Z")
	public static boolean contains(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < size; local11++) {
			if (arg0.equalsIgnoreCase(usernames[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)V")
	public static void add(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (size >= 100) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.IGNORELISTFULL);
			return;
		}
		@Pc(34) JagString local34 = Base37.decode37(arg0).toTitleCase();
		@Pc(36) int local36;
		for (local36 = 0; local36 < size; local36++) {
			if (encodedUsernames[local36] == arg0) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[]{local34, LocalizedText.IGNORELISTDUPE}));
				return;
			}
		}
		for (local36 = 0; local36 < FriendsList.size; local36++) {
			if (FriendsList.encodedUsernames[local36] == arg0) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[]{LocalizedText.REMOVESOCIAL2, local34, LocalizedText.REMOVEFRIEND}));
				return;
			}
		}
		if (local34.strEquals(PlayerList.self.username)) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.IGNORECANTADDSELF);
			return;
		}
		encodedUsernames[size] = arg0;
		usernames[size++] = Base37.decode37(arg0);
		FriendsList.transmitAt = InterfaceList.transmitTimer;
		Protocol.outboundBuffer.p1isaac(ClientProt.IGNORELIST_ADD);
		Protocol.outboundBuffer.p8(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)V")
	public static void remove(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < size; local12++) {
			if (encodedUsernames[local12] == arg0) {
				size--;
				for (@Pc(36) int local36 = local12; local36 < size; local36++) {
					encodedUsernames[local36] = encodedUsernames[local36 + 1];
					usernames[local36] = usernames[local36 + 1];
				}
				FriendsList.transmitAt = InterfaceList.transmitTimer;
				Protocol.outboundBuffer.p1isaac(ClientProt.IGNORELIST_DEL);
				Protocol.outboundBuffer.p8(arg0);
				break;
			}
		}
	}
}
