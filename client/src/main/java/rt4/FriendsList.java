package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class FriendsList {
	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[J")
	public static final long[] encodedUsernames = new long[200];
	@OriginalMember(owner = "client!rg", name = "r", descriptor = "[Lclient!na;")
	public static final JagString[] worldNames = new JagString[200];
	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
	public static final int[] ranks = new int[200];
	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	public static final int[] worlds = new int[200];
	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[Lclient!na;")
	public static final JagString[] usernames = new JagString[200];
	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[Z")
	public static final boolean[] sameGame = new boolean[200];
	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static int transmitAt = 0;
	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int state = 0;
	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!na;B)Z")
	public static boolean contains(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < size; local12++) {
			if (arg0.equalsIgnoreCase(usernames[local12])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(PlayerList.self.username);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JB)V")
	public static void add(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (size >= 100 && !LoginManager.playerMember || size >= 200) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.FRIENDLISTFULL);
			return;
		}
		@Pc(35) JagString local35 = Base37.decode37(arg0).toTitleCase();
		@Pc(42) int local42;
		for (local42 = 0; local42 < size; local42++) {
			if (encodedUsernames[local42] == arg0) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[]{local35, LocalizedText.FRIENDLISTDUPE}));
				return;
			}
		}
		for (local42 = 0; local42 < IgnoreList.size; local42++) {
			if (arg0 == IgnoreList.encodedUsernames[local42]) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[]{LocalizedText.REMOVESOCIAL1, local35, LocalizedText.REMOVEIGNORE}));
				return;
			}
		}
		if (local35.strEquals(PlayerList.self.username)) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.FRIENDCANTADDSELF);
			return;
		}
		usernames[size] = local35;
		encodedUsernames[size] = arg0;
		worlds[size] = 0;
		worldNames[size] = JagString.EMPTY;
		ranks[size] = 0;
		sameGame[size] = false;
		size++;
		transmitAt = InterfaceList.transmitTimer;
		Protocol.outboundBuffer.p1isaac(ClientProt.FRIENDLIST_ADD);
		Protocol.outboundBuffer.p8(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(JI)V")
	public static void remove(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < size; local13++) {
			if (encodedUsernames[local13] == arg0) {
				size--;
				for (@Pc(41) int local41 = local13; local41 < size; local41++) {
					usernames[local41] = usernames[local41 + 1];
					worlds[local41] = worlds[local41 + 1];
					worldNames[local41] = worldNames[local41 + 1];
					encodedUsernames[local41] = encodedUsernames[local41 + 1];
					ranks[local41] = ranks[local41 + 1];
					sameGame[local41] = sameGame[local41 + 1];
				}
				transmitAt = InterfaceList.transmitTimer;
				Protocol.outboundBuffer.p1isaac(ClientProt.FRIENDLIST_DEL);
				Protocol.outboundBuffer.p8(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!na;I)V")
	public static void setRank(@OriginalArg(1) JagString arg0, @OriginalArg(2) int arg1) {
		Protocol.outboundBuffer.p1isaac(ClientProt.FRIEND_SETRANK);
		Protocol.outboundBuffer.p1add(arg1);
		Protocol.outboundBuffer.p8(arg0.encode37());
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!na;I)I")
	public static int indexOf(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < size; local20++) {
			if (arg0.equalsIgnoreCase(usernames[local20])) {
				return local20;
			}
		}
		return -1;
	}
}
