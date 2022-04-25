import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int sampleRate;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_335 = JagString.parse("Number of player models in cache:");

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!na;")
	public static final JagString aClass100_336 = JagString.parse("<img=1>");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public static void method1146() {
		Protocol.outboundBuffer.offset = 0;
		Static5.opcode3 = -1;
		Static60.aBoolean108 = false;
		Protocol.length = 0;
		Static115.anInt2939 = 0;
		Static231.anInt5204 = 0;
		Static230.opcode2 = -1;
		Static270.anInt5795 = 0;
		Player.rebootTimer = 0;
		Static49.opcode4 = -1;
		Protocol.inboundBuffer.offset = 0;
		Static201.anInt1862 = 0;
		Protocol.opcode = -1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < PlayerList.players.length; local35++) {
			if (PlayerList.players[local35] != null) {
				PlayerList.players[local35].faceEntity = -1;
			}
		}
		for (local35 = 0; local35 < NpcList.npcs.length; local35++) {
			if (NpcList.npcs[local35] != null) {
				NpcList.npcs[local35].faceEntity = -1;
			}
		}
		Static102.method2073();
		Static227.cameraType = 1;
		client.setGameState(30);
		for (local35 = 0; local35 < 100; local35++) {
			Static186.aBooleanArray100[local35] = true;
		}
		Static59.method1373();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lclient!q;")
	public static ReferenceNodeFactory method1147() {
		try {
			return (ReferenceNodeFactory) Class.forName("SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)Lclient!wk;")
	public static Class3_Sub31 method1148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub31 local9 = new Class3_Sub31();
		local9.anInt5879 = arg2;
		local9.anInt5878 = arg0;
		Static119.aClass133_9.put(local9, (long) arg1);
		Static81.method1753(arg0);
		@Pc(28) Component local28 = InterfaceList.getComponent(arg1);
		if (local28 != null) {
			Static43.redraw(local28);
		}
		if (Static39.aClass13_10 != null) {
			Static43.redraw(Static39.aClass13_10);
			Static39.aClass13_10 = null;
		}
		@Pc(45) int local45 = Static231.anInt5204;
		@Pc(53) int local53;
		for (local53 = 0; local53 < local45; local53++) {
			if (Static2.method5(Static39.aShortArray6[local53])) {
				Static200.method3628(local53);
			}
		}
		if (Static231.anInt5204 == 1) {
			Static60.aBoolean108 = false;
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
		} else {
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
			local53 = Fonts.b12Full.getStringWidth(LocalizedText.CHOOSE_OPTION);
			for (@Pc(95) int local95 = 0; local95 < Static231.anInt5204; local95++) {
				@Pc(104) int local104 = Fonts.b12Full.getStringWidth(Static269.method2228(local95));
				if (local104 > local53) {
					local53 = local104;
				}
			}
			Static24.anInt761 = local53 + 8;
			Static13.anInt436 = Static231.anInt5204 * 15 + (Static261.aBoolean298 ? 26 : 22);
		}
		if (local28 != null) {
			Static17.method531(local28, false);
		}
		Static74.method1626(arg0);
		if (InterfaceList.topLevelInterface != -1) {
			Static54.method1304(1, InterfaceList.topLevelInterface);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1149(@OriginalArg(0) JagString arg0) {
		@Pc(7) int local7 = Static91.method1879(arg0);
		if (local7 != -1) {
			Static80.method3616(WorldMap.labels.aShortArray73[local7], WorldMap.labels.aShortArray72[local7]);
		}
	}

}
