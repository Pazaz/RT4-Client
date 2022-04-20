import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Bzip2Decompressor {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!bb;")
	private static final Bzip2DState aClass11_1 = new Bzip2DState();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!bb;)I")
	private static int method3309(@OriginalArg(0) int arg0, @OriginalArg(1) Bzip2DState arg1) {
		while (arg1.anInt395 < arg0) {
			arg1.anInt402 = arg1.anInt402 << 8 | arg1.aByteArray4[arg1.anInt389] & 0xFF;
			arg1.anInt395 += 8;
			arg1.anInt389++;
			arg1.anInt407++;
			if (arg1.anInt407 == 0) {
			}
		}
		@Pc(17) int local17 = arg1.anInt402 >> arg1.anInt395 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt395 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!bb;)V")
	private static void method3310(@OriginalArg(0) Bzip2DState arg0) {
		@Pc(2) byte local2 = arg0.aByte1;
		@Pc(5) int local5 = arg0.anInt405;
		@Pc(8) int local8 = arg0.anInt397;
		@Pc(11) int local11 = arg0.anInt396;
		@Pc(13) int[] local13 = Static221.anIntArray374;
		@Pc(16) int local16 = arg0.anInt398;
		@Pc(19) byte[] local19 = arg0.aByteArray3;
		@Pc(22) int local22 = arg0.anInt390;
		@Pc(25) int local25 = arg0.anInt394;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt392 + 1;
		label67: while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label67;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label67;
						}
						local19[local22] = local2;
						local22++;
						local25--;
						break;
					}
					local19[local22] = local2;
					local5--;
					local22++;
					local25--;
				}
			}
			@Pc(62) boolean local62 = true;
			@Pc(84) byte local84;
			while (local62) {
				local62 = false;
				if (local8 == local32) {
					local5 = 0;
					break label67;
				}
				local2 = (byte) local11;
				local16 = local13[local16];
				local84 = (byte) (local16 & 0xFF);
				local16 >>= 0x8;
				local8++;
				if (local84 != local11) {
					local11 = local84;
					if (local25 == 0) {
						local5 = 1;
						break label67;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local62 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label67;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local62 = true;
				}
			}
			local5 = 2;
			local16 = local13[local16];
			local84 = (byte) (local16 & 0xFF);
			local16 >>= 0x8;
			local8++;
			if (local8 != local32) {
				if (local84 == local11) {
					local5 = 3;
					local16 = local13[local16];
					local84 = (byte) (local16 & 0xFF);
					local16 >>= 0x8;
					local8++;
					if (local8 != local32) {
						if (local84 == local11) {
							local16 = local13[local16];
							local84 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
							local5 = (local84 & 0xFF) + 4;
							local16 = local13[local16];
							local11 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
						} else {
							local11 = local84;
						}
					}
				} else {
					local11 = local84;
				}
			}
		}
		@Pc(215) int local215 = arg0.anInt403;
		arg0.anInt403 += local27 - local25;
		if (arg0.anInt403 < local215) {
		}
		arg0.aByte1 = local2;
		arg0.anInt405 = local5;
		arg0.anInt397 = local8;
		arg0.anInt396 = local11;
		Static221.anIntArray374 = local13;
		arg0.anInt398 = local16;
		arg0.aByteArray3 = local19;
		arg0.anInt390 = local22;
		arg0.anInt394 = local25;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method3311(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!bb;)V")
	private static void method3312(@OriginalArg(0) Bzip2DState arg0) {
		arg0.anInt401 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray13[local4]) {
				arg0.aByteArray2[arg0.anInt401] = (byte) local4;
				arg0.anInt401++;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!bb;)B")
	private static byte method3313(@OriginalArg(0) Bzip2DState arg0) {
		return (byte) method3309(8, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(Lclient!bb;)V")
	private static void method3314(@OriginalArg(0) Bzip2DState arg0) {
		arg0.anInt404 = 1;
		if (Static221.anIntArray374 == null) {
			Static221.anIntArray374 = new int[arg0.anInt404 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method3313(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3313(arg0);
				local61 = method3315(arg0);
				if (local61 != 0) {
				}
				arg0.anInt399 = 0;
				local61 = method3313(arg0);
				arg0.anInt399 = arg0.anInt399 << 8 | local61 & 0xFF;
				local61 = method3313(arg0);
				arg0.anInt399 = arg0.anInt399 << 8 | local61 & 0xFF;
				local61 = method3313(arg0);
				arg0.anInt399 = arg0.anInt399 << 8 | local61 & 0xFF;
				@Pc(141) int local141;
				for (local141 = 0; local141 < 16; local141++) {
					local61 = method3315(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray14[local141] = true;
					} else {
						arg0.aBooleanArray14[local141] = false;
					}
				}
				for (local141 = 0; local141 < 256; local141++) {
					arg0.aBooleanArray13[local141] = false;
				}
				@Pc(187) int local187;
				for (local141 = 0; local141 < 16; local141++) {
					if (arg0.aBooleanArray14[local141]) {
						for (local187 = 0; local187 < 16; local187++) {
							local61 = method3315(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray13[local141 * 16 + local187] = true;
							}
						}
					}
				}
				method3312(arg0);
				@Pc(216) int local216 = arg0.anInt401 + 2;
				@Pc(220) int local220 = method3309(3, arg0);
				@Pc(224) int local224 = method3309(15, arg0);
				for (local141 = 0; local141 < local224; local141++) {
					local187 = 0;
					while (true) {
						local61 = method3315(arg0);
						if (local61 == 0) {
							arg0.aByteArray6[local141] = (byte) local187;
							break;
						}
						local187++;
					}
				}
				@Pc(250) byte[] local250 = new byte[6];
				@Pc(252) byte local252 = 0;
				while (local252 < local220) {
					local250[local252] = local252++;
				}
				for (local141 = 0; local141 < local224; local141++) {
					local252 = arg0.aByteArray6[local141];
					@Pc(279) byte local279 = local250[local252];
					while (local252 > 0) {
						local250[local252] = local250[local252 - 1];
						local252--;
					}
					local250[0] = local279;
					arg0.aByteArray5[local141] = local279;
				}
				@Pc(308) int local308;
				for (local308 = 0; local308 < local220; local308++) {
					@Pc(315) int local315 = method3309(5, arg0);
					for (local141 = 0; local141 < local216; local141++) {
						while (true) {
							local61 = method3315(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray3[local308][local141] = (byte) local315;
								break;
							}
							local61 = method3315(arg0);
							if (local61 == 0) {
								local315++;
							} else {
								local315--;
							}
						}
					}
				}
				for (local308 = 0; local308 < local220; local308++) {
					@Pc(354) byte local354 = 32;
					@Pc(356) byte local356 = 0;
					for (local141 = 0; local141 < local216; local141++) {
						if (arg0.aByteArrayArray3[local308][local141] > local356) {
							local356 = arg0.aByteArrayArray3[local308][local141];
						}
						if (arg0.aByteArrayArray3[local308][local141] < local354) {
							local354 = arg0.aByteArrayArray3[local308][local141];
						}
					}
					method3311(arg0.anIntArrayArray3[local308], arg0.anIntArrayArray1[local308], arg0.anIntArrayArray2[local308], arg0.aByteArrayArray3[local308], local354, local356, local216);
					arg0.anIntArray27[local308] = local354;
				}
				@Pc(425) int local425 = arg0.anInt401 + 1;
				@Pc(427) byte local427 = -1;
				for (local141 = 0; local141 <= 255; local141++) {
					arg0.anIntArray26[local141] = 0;
				}
				@Pc(443) int local443 = 4095;
				@Pc(445) int local445;
				@Pc(449) int local449;
				for (local445 = 15; local445 >= 0; local445--) {
					for (local449 = 15; local449 >= 0; local449--) {
						arg0.aByteArray1[local443] = (byte) (local445 * 16 + local449);
						local443--;
					}
					arg0.anIntArray25[local445] = local443 + 1;
				}
				@Pc(475) int local475 = 0;
				@Pc(478) int local478 = local427 + 1;
				@Pc(480) byte local480 = 50;
				@Pc(485) byte local485 = arg0.aByteArray5[0];
				@Pc(490) int local490 = arg0.anIntArray27[local485];
				@Pc(495) int[] local495 = arg0.anIntArrayArray3[local485];
				@Pc(500) int[] local500 = arg0.anIntArrayArray2[local485];
				@Pc(505) int[] local505 = arg0.anIntArrayArray1[local485];
				@Pc(506) int local506 = local480 - 1;
				@Pc(508) int local508 = local490;
				@Pc(512) int local512;
				@Pc(522) byte local522;
				for (local512 = method3309(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
					local508++;
					local522 = method3315(arg0);
				}
				@Pc(537) int local537 = local500[local512 - local505[local508]];
				while (true) {
					while (local537 != local425) {
						if (local537 == 0 || local537 == 1) {
							@Pc(548) int local548 = -1;
							@Pc(550) int local550 = 1;
							do {
								if (local537 == 0) {
									local548 += local550;
								} else if (local537 == 1) {
									local548 += local550 * 2;
								}
								local550 *= 2;
								if (local506 == 0) {
									local478++;
									local506 = 50;
									local485 = arg0.aByteArray5[local478];
									local490 = arg0.anIntArray27[local485];
									local495 = arg0.anIntArrayArray3[local485];
									local500 = arg0.anIntArrayArray2[local485];
									local505 = arg0.anIntArrayArray1[local485];
								}
								local506--;
								local508 = local490;
								for (local512 = method3309(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
									local508++;
									local522 = method3315(arg0);
								}
								local537 = local500[local512 - local505[local508]];
							} while (local537 == 0 || local537 == 1);
							local548++;
							local61 = arg0.aByteArray2[arg0.aByteArray1[arg0.anIntArray25[0]] & 0xFF];
							arg0.anIntArray26[local61 & 0xFF] += local548;
							while (local548 > 0) {
								Static221.anIntArray374[local475] = local61 & 0xFF;
								local475++;
								local548--;
							}
						} else {
							@Pc(678) int local678 = local537 - 1;
							@Pc(686) int local686;
							if (local678 < 16) {
								local686 = arg0.anIntArray25[0];
								local61 = arg0.aByteArray1[local686 + local678];
								while (local678 > 3) {
									@Pc(700) int local700 = local686 + local678;
									arg0.aByteArray1[local700] = arg0.aByteArray1[local700 - 1];
									arg0.aByteArray1[local700 - 1] = arg0.aByteArray1[local700 - 2];
									arg0.aByteArray1[local700 - 2] = arg0.aByteArray1[local700 - 3];
									arg0.aByteArray1[local700 - 3] = arg0.aByteArray1[local700 - 4];
									local678 -= 4;
								}
								while (local678 > 0) {
									arg0.aByteArray1[local686 + local678] = arg0.aByteArray1[local686 + local678 - 1];
									local678--;
								}
								arg0.aByteArray1[local686] = local61;
							} else {
								@Pc(776) int local776 = local678 / 16;
								@Pc(780) int local780 = local678 % 16;
								local686 = arg0.anIntArray25[local776] + local780;
								local61 = arg0.aByteArray1[local686];
								while (local686 > arg0.anIntArray25[local776]) {
									arg0.aByteArray1[local686] = arg0.aByteArray1[local686 - 1];
									local686--;
								}
								@Pc(815) int local815 = arg0.anIntArray25[local776]++;
								while (local776 > 0) {
									local815 = arg0.anIntArray25[local776]--;
									arg0.aByteArray1[arg0.anIntArray25[local776]] = arg0.aByteArray1[arg0.anIntArray25[local776 - 1] + 16 - 1];
									local776--;
								}
								local815 = arg0.anIntArray25[0]--;
								arg0.aByteArray1[arg0.anIntArray25[0]] = local61;
								if (arg0.anIntArray25[0] == 0) {
									local443 = 4095;
									for (local445 = 15; local445 >= 0; local445--) {
										for (local449 = 15; local449 >= 0; local449--) {
											arg0.aByteArray1[local443] = arg0.aByteArray1[arg0.anIntArray25[local445] + local449];
											local443--;
										}
										arg0.anIntArray25[local445] = local443 + 1;
									}
								}
							}
							arg0.anIntArray26[arg0.aByteArray2[local61 & 0xFF] & 0xFF]++;
							Static221.anIntArray374[local475] = arg0.aByteArray2[local61 & 0xFF] & 0xFF;
							local475++;
							if (local506 == 0) {
								local478++;
								local506 = 50;
								local485 = arg0.aByteArray5[local478];
								local490 = arg0.anIntArray27[local485];
								local495 = arg0.anIntArrayArray3[local485];
								local500 = arg0.anIntArrayArray2[local485];
								local505 = arg0.anIntArrayArray1[local485];
							}
							local506--;
							local508 = local490;
							for (local512 = method3309(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
								local508++;
								local522 = method3315(arg0);
							}
							local537 = local500[local512 - local505[local508]];
						}
					}
					arg0.anInt405 = 0;
					arg0.aByte1 = 0;
					arg0.anIntArray24[0] = 0;
					for (local141 = 1; local141 <= 256; local141++) {
						arg0.anIntArray24[local141] = arg0.anIntArray26[local141 - 1];
					}
					for (local141 = 1; local141 <= 256; local141++) {
						arg0.anIntArray24[local141] += arg0.anIntArray24[local141 - 1];
					}
					for (local141 = 0; local141 < local475; local141++) {
						local61 = (byte) (Static221.anIntArray374[local141] & 0xFF);
						Static221.anIntArray374[arg0.anIntArray24[local61 & 0xFF]] |= local141 << 8;
						arg0.anIntArray24[local61 & 0xFF]++;
					}
					arg0.anInt398 = Static221.anIntArray374[arg0.anInt399] >> 8;
					arg0.anInt397 = 0;
					arg0.anInt398 = Static221.anIntArray374[arg0.anInt398];
					arg0.anInt396 = (byte) (arg0.anInt398 & 0xFF);
					arg0.anInt398 >>= 0x8;
					arg0.anInt397++;
					arg0.anInt392 = local475;
					method3310(arg0);
					if (arg0.anInt397 == arg0.anInt392 + 1 && arg0.anInt405 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(Lclient!bb;)B")
	private static byte method3315(@OriginalArg(0) Bzip2DState arg0) {
		return (byte) method3309(1, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BI[BII)I")
	public static int method3316(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Bzip2DState local2 = aClass11_1;
		synchronized (aClass11_1) {
			aClass11_1.aByteArray4 = arg2;
			aClass11_1.anInt389 = 9;
			aClass11_1.aByteArray3 = arg0;
			aClass11_1.anInt390 = 0;
			aClass11_1.anInt394 = arg1;
			aClass11_1.anInt395 = 0;
			aClass11_1.anInt402 = 0;
			aClass11_1.anInt407 = 0;
			aClass11_1.anInt403 = 0;
			method3314(aClass11_1);
			@Pc(37) int local37 = arg1 - aClass11_1.anInt394;
			aClass11_1.aByteArray4 = null;
			aClass11_1.aByteArray3 = null;
			return local37;
		}
	}
}
