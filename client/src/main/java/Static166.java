import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static int anInt4044;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_779 = Static28.parse("underlay");

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public static int anInt4051 = 0;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int anInt4054 = 0;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method3166(@OriginalArg(1) Buffer arg0) {
		label123: while (true) {
			if (arg0.data.length > arg0.offset) {
				@Pc(17) boolean local17 = false;
				@Pc(19) int local19 = 0;
				@Pc(21) int local21 = 0;
				if (arg0.g1() == 1) {
					local19 = arg0.g1();
					local17 = true;
					local21 = arg0.g1();
				}
				@Pc(42) int local42 = arg0.g1();
				@Pc(46) int local46 = arg0.g1();
				@Pc(53) int local53 = local42 * 64 - Static158.anInt3846;
				@Pc(65) int local65 = Static2.anInt13 + Static181.anInt4296 - local46 * 64 - 1;
				@Pc(84) int local84;
				@Pc(95) int local95;
				if (local53 >= 0 && local65 - 63 >= 0 && Static48.anInt1449 > local53 + 63 && local65 < Static181.anInt4296) {
					local84 = local53 >> 6;
					local95 = local65 >> 6;
					@Pc(150) int local150 = 0;
					while (true) {
						if (local150 >= 64) {
							continue label123;
						}
						for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
							if (!local17 || local19 * 8 <= local150 && local150 < local19 * 8 + 8 && local155 >= local21 * 8 && local155 < local21 * 8 + 8) {
								@Pc(202) int local202 = arg0.g1();
								if (local202 != 0) {
									@Pc(214) int local214;
									if ((local202 & 0x1) == 1) {
										local214 = arg0.g1();
										if (Static70.aByteArrayArrayArray7[local84][local95] == null) {
											Static70.aByteArrayArrayArray7[local84][local95] = new byte[4096];
										}
										Static70.aByteArrayArrayArray7[local84][local95][local150 + (63 - local155 << 6)] = (byte) local214;
									}
									if ((local202 & 0x2) == 2) {
										local214 = arg0.g3();
										if (Static58.anIntArrayArrayArray5[local84][local95] == null) {
											Static58.anIntArrayArrayArray5[local84][local95] = new int[4096];
										}
										Static58.anIntArrayArrayArray5[local84][local95][(63 - local155 << 6) + local150] = local214;
									}
									if ((local202 & 0x4) == 4) {
										local214 = arg0.g3();
										if (Static83.anIntArrayArrayArray3[local84][local95] == null) {
											Static83.anIntArrayArrayArray3[local84][local95] = new int[4096];
										}
										local214--;
										@Pc(312) LocType local312 = Static271.method4601(local214);
										if (local312.anIntArray380 != null) {
											local312 = local312.method3417();
											if (local312 == null || local312.anInt4400 == -1) {
												continue;
											}
										}
										Static83.anIntArrayArrayArray3[local84][local95][(63 - local155 << 6) + local150] = local312.anInt4426 + 1;
										@Pc(353) Class3_Sub26 local353 = new Class3_Sub26();
										local353.anInt4308 = local312.anInt4400;
										local353.anInt4307 = local53;
										local353.anInt4314 = local65;
										Static145.aClass69_84.method2282(local353);
									}
								}
							}
						}
						local150++;
					}
				}
				local84 = 0;
				while (true) {
					if (local84 >= (local17 ? 64 : 4096)) {
						continue label123;
					}
					local95 = arg0.g1();
					if (local95 != 0) {
						if ((local95 & 0x1) == 1) {
							arg0.offset++;
						}
						if ((local95 & 0x2) == 2) {
							arg0.offset += 2;
						}
						if ((local95 & 0x4) == 4) {
							arg0.offset += 3;
						}
					}
					local84++;
				}
			}
			return;
		}
	}
}
