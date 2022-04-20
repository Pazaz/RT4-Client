import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Lclient!na;")
	public static JagString aClass100_991 = null;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[Lclient!en;")
	public static final BufferedFile[] cacheIndexes = new BufferedFile[28];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lclient!ec;")
	public static Scenery method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt662; local13++) {
			@Pc(22) Scenery local22 = local7.aClass31Array1[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1701 == arg1 && local22.anInt1696 == arg2) {
				Static266.method4193(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!wa;Z)V")
	public static void method3998(@OriginalArg(0) Buffer arg0) {
		label87: while (true) {
			if (arg0.offset < arg0.data.length) {
				@Pc(22) int local22 = 0;
				@Pc(24) boolean local24 = false;
				@Pc(26) int local26 = 0;
				if (arg0.g1() == 1) {
					local24 = true;
					local22 = arg0.g1();
					local26 = arg0.g1();
				}
				@Pc(46) int local46 = arg0.g1();
				@Pc(50) int local50 = arg0.g1();
				@Pc(62) int local62 = Static2.anInt13 + Static181.anInt4296 - local50 * 64 - 1;
				@Pc(69) int local69 = local46 * 64 - Static158.anInt3846;
				@Pc(147) byte local147;
				@Pc(91) int local91;
				if (local69 >= 0 && local62 - 63 >= 0 && local69 + 63 < Static48.anInt1449 && local62 < Static181.anInt4296) {
					local91 = local69 >> 6;
					@Pc(95) int local95 = local62 >> 6;
					@Pc(97) int local97 = 0;
					while (true) {
						if (local97 >= 64) {
							continue label87;
						}
						for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
							if (!local24 || local97 >= local22 * 8 && local97 < local22 * 8 + 8 && local104 >= local26 * 8 && local104 < local26 * 8 + 8) {
								local147 = arg0.g1s();
								if (local147 != 0) {
									if (Static34.aByteArrayArrayArray3[local91][local95] == null) {
										Static34.aByteArrayArrayArray3[local91][local95] = new byte[4096];
									}
									Static34.aByteArrayArrayArray3[local91][local95][local97 + (63 - local104 << 6)] = local147;
									@Pc(186) byte local186 = arg0.g1s();
									if (Static90.aByteArrayArrayArray8[local91][local95] == null) {
										Static90.aByteArrayArrayArray8[local91][local95] = new byte[4096];
									}
									Static90.aByteArrayArrayArray8[local91][local95][local97 + (63 - local104 << 6)] = local186;
								}
							}
						}
						local97++;
					}
				}
				local91 = 0;
				while (true) {
					if ((local24 ? 64 : 4096) <= local91) {
						continue label87;
					}
					local147 = arg0.g1s();
					if (local147 != 0) {
						arg0.offset++;
					}
					local91++;
				}
			}
			return;
		}
	}
}
