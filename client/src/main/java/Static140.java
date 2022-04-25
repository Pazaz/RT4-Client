import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!e;)I")
	public static int getSound(@OriginalArg(1) Player arg0) {
		@Pc(14) int local14 = arg0.anInt1654;
		@Pc(18) BasType local18 = arg0.method2681();
		if (local18.idleAnimationId == arg0.anInt3366) {
			local14 = arg0.anInt1648;
		} else if (local18.runAnimationId == arg0.anInt3366 || arg0.anInt3366 == local18.runAnimationId2 || arg0.anInt3366 == local18.runAnimationId4 || local18.runAnimationId3 == arg0.anInt3366) {
			local14 = arg0.anInt1670;
		} else if (arg0.anInt3366 == local18.anInt1062 || arg0.anInt3366 == local18.anInt1042 || arg0.anInt3366 == local18.anInt1048 || arg0.anInt3366 == local18.anInt1066) {
			local14 = arg0.anInt1658;
		}
		return local14;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)V")
	public static void method2707(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static35.anInt1093 >= 100) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.IGNORELISTFULL);
			return;
		}
		@Pc(34) JagString local34 = Base37.decodeLowerCase(arg0).method3125();
		@Pc(36) int local36;
		for (local36 = 0; local36 < Static35.anInt1093; local36++) {
			if (IgnoreList.encodedUsernames[local36] == arg0) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { local34, LocalizedText.IGNORELISTDUPE}));
				return;
			}
		}
		for (local36 = 0; local36 < Static9.anInt178; local36++) {
			if (Static92.aLongArray3[local36] == arg0) {
				Chat.add(JagString.EMPTY, 0, JagString.concatenate(new JagString[] { LocalizedText.REMOVESOCIAL2, local34, LocalizedText.REMOVEFRIEND}));
				return;
			}
		}
		if (local34.strEquals(PlayerList.self.username)) {
			Chat.add(JagString.EMPTY, 0, LocalizedText.IGNORECANTADDSELF);
			return;
		}
		IgnoreList.encodedUsernames[Static35.anInt1093] = arg0;
		Static193.aClass100Array134[Static35.anInt1093++] = Base37.decodeLowerCase(arg0);
		FriendsList.transmitAt = InterfaceList.transmitTimer;
		Protocol.outboundBuffer.p1isaac(34);
		Protocol.outboundBuffer.p8(arg0);
	}

}
