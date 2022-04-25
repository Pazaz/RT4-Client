import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "F")
	public static float aFloat10;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
	public static final int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLclient!e;)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Player arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(24) int local24;
		if ((arg0 & 0x80) != 0) {
			local13 = Protocol.inboundBuffer.g2le();
			local17 = Protocol.inboundBuffer.g1();
			@Pc(21) int local21 = Protocol.inboundBuffer.g1();
			local24 = Protocol.inboundBuffer.offset;
			@Pc(35) boolean local35 = (local13 & 0x8000) != 0;
			if (arg2.aClass100_364 != null && arg2.appearance != null) {
				@Pc(48) long local48 = arg2.aClass100_364.encode37();
				@Pc(50) boolean local50 = false;
				if (local17 <= 1) {
					if (!local35 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
						local50 = true;
					} else {
						for (@Pc(69) int local69 = 0; local69 < Static35.anInt1093; local69++) {
							if (Static190.aLongArray6[local69] == local48) {
								local50 = true;
								break;
							}
						}
					}
				}
				if (!local50 && Static11.anInt384 == 0) {
					Protocol.chatBuffer.offset = 0;
					Protocol.inboundBuffer.gBytesRev(local21, Protocol.chatBuffer.data);
					Protocol.chatBuffer.offset = 0;
					@Pc(106) int local106 = -1;
					@Pc(127) JagString local127;
					if (local35) {
						@Pc(112) QuickChatPhrase local112 = Static264.method3568(Protocol.chatBuffer);
						local13 &= 0x7FFF;
						local106 = local112.anInt439;
						local127 = local112.aClass3_Sub2_Sub6_1.method770(Protocol.chatBuffer);
					} else {
						local127 = Static218.method2862(Static65.method1497(Protocol.chatBuffer).method3116());
					}
					arg2.aClass100_640 = local127.method3144();
					arg2.anInt3352 = local13 & 0xFF;
					arg2.anInt3408 = 150;
					arg2.anInt3429 = local13 >> 8;
					if (local17 == 2) {
						Static154.method2928(local106, local35 ? 17 : 1, local127, null, JagString.concatenate(new JagString[] { Static44.aClass100_336, arg2.method1264() }));
					} else if (local17 == 1) {
						Static154.method2928(local106, local35 ? 17 : 1, local127, null, JagString.concatenate(new JagString[] { Static65.aClass100_435, arg2.method1264() }));
					} else {
						Static154.method2928(local106, local35 ? 17 : 2, local127, null, arg2.method1264());
					}
				}
			}
			Protocol.inboundBuffer.offset = local24 + local21;
		}
		if ((arg0 & 0x1) != 0) {
			local13 = Protocol.inboundBuffer.gSmart1or2();
			local17 = Protocol.inboundBuffer.g1add();
			arg2.method2686(local17, Static83.loop, local13);
			arg2.anInt3378 = Static83.loop + 300;
			arg2.anInt3372 = Protocol.inboundBuffer.g1ssub();
		}
		if ((arg0 & 0x8) != 0) {
			local13 = Protocol.inboundBuffer.g2();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Protocol.inboundBuffer.g1();
			Player.animate(local17, local13, arg2);
		}
		if ((arg0 & 0x4) != 0) {
			local13 = Protocol.inboundBuffer.g1add();
			@Pc(309) byte[] local309 = new byte[local13];
			@Pc(314) Buffer local314 = new Buffer(local309);
			Protocol.inboundBuffer.gBytes(local13, local309);
			Static115.aClass3_Sub15Array1[arg1] = local314;
			arg2.method1262(local314);
		}
		if ((arg0 & 0x2) != 0) {
			arg2.anInt3370 = Protocol.inboundBuffer.g2sub();
			if (arg2.anInt3370 == 65535) {
				arg2.anInt3370 = -1;
			}
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt3380 = Protocol.inboundBuffer.p1neg();
			arg2.anInt3428 = Protocol.inboundBuffer.g1();
			arg2.anInt3416 = Protocol.inboundBuffer.g1add();
			arg2.anInt3392 = Protocol.inboundBuffer.g1();
			arg2.anInt3395 = Protocol.inboundBuffer.g2le() + Static83.loop;
			arg2.anInt3386 = Protocol.inboundBuffer.g2le() + Static83.loop;
			arg2.anInt3431 = Protocol.inboundBuffer.p1neg();
			arg2.movementQueueSize = 1;
			arg2.anInt3405 = 0;
		}
		if ((arg0 & 0x20) != 0) {
			arg2.aClass100_640 = Protocol.inboundBuffer.gjstr();
			if (arg2.aClass100_640.charAt(0) == 126) {
				arg2.aClass100_640 = arg2.aClass100_640.substring(1);
				Static103.method2231(arg2.method1264(), 2, arg2.aClass100_640);
			} else if (arg2 == PlayerList.self) {
				Static103.method2231(arg2.method1264(), 2, arg2.aClass100_640);
			}
			arg2.anInt3352 = 0;
			arg2.anInt3429 = 0;
			arg2.anInt3408 = 150;
		}
		if ((arg0 & 0x200) != 0) {
			local13 = Protocol.inboundBuffer.gSmart1or2();
			local17 = Protocol.inboundBuffer.g1ssub();
			arg2.method2686(local17, Static83.loop, local13);
		}
		if ((arg0 & 0x800) != 0) {
			local13 = Protocol.inboundBuffer.p1neg();
			@Pc(502) int[] local502 = new int[local13];
			@Pc(505) int[] local505 = new int[local13];
			@Pc(508) int[] local508 = new int[local13];
			for (@Pc(510) int local510 = 0; local510 < local13; local510++) {
				@Pc(521) int local521 = Protocol.inboundBuffer.g2le();
				if (local521 == 65535) {
					local521 = -1;
				}
				local502[local510] = local521;
				local505[local510] = Protocol.inboundBuffer.g1add();
				local508[local510] = Protocol.inboundBuffer.g2();
			}
			Static32.method865(local505, local502, arg2, local508);
		}
		if ((arg0 & 0x100) != 0) {
			local13 = Protocol.inboundBuffer.g2le();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Protocol.inboundBuffer.p4rme();
			@Pc(573) boolean local573 = true;
			if (local13 != -1 && arg2.anInt3432 != -1 && SeqTypeList.get(SpotAnimTypeList.get(local13).seqId).anInt5355 < SeqTypeList.get(SpotAnimTypeList.get(arg2.anInt3432).seqId).anInt5355) {
				local573 = false;
			}
			if (local573) {
				arg2.anInt3359 = (local17 & 0xFFFF) + Static83.loop;
				arg2.anInt3361 = 0;
				arg2.anInt3399 = 0;
				arg2.anInt3432 = local13;
				if (arg2.anInt3359 > Static83.loop) {
					arg2.anInt3399 = -1;
				}
				arg2.anInt3394 = local17 >> 16;
				arg2.anInt3418 = 1;
				if (arg2.anInt3432 != -1 && Static83.loop == arg2.anInt3359) {
					local24 = SpotAnimTypeList.get(arg2.anInt3432).seqId;
					if (local24 != -1) {
						@Pc(663) SeqType local663 = SeqTypeList.get(local24);
						if (local663 != null && local663.frames != null) {
							SoundPlayer.playSeqSound(arg2.zFine, local663, arg2.xFine, arg2 == PlayerList.self, 0);
						}
					}
				}
			}
		}
		if ((arg0 & 0x40) != 0) {
			arg2.anInt3382 = Protocol.inboundBuffer.g2();
			arg2.anInt3363 = Protocol.inboundBuffer.g2leadd();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method1771() {
		Static62.anIntArray150 = Static206.method3679(0.4F);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rg;Lclient!rg;B)V")
	public static void method1772(@OriginalArg(0) SecondaryNode arg0, @OriginalArg(1) SecondaryNode arg1) {
		if (arg1.aClass3_Sub2_66 != null) {
			arg1.method4365();
		}
		arg1.aClass3_Sub2_66 = arg0;
		arg1.aClass3_Sub2_67 = arg0.aClass3_Sub2_67;
		arg1.aClass3_Sub2_66.aClass3_Sub2_67 = arg1;
		arg1.aClass3_Sub2_67.aClass3_Sub2_66 = arg1;
	}
}
