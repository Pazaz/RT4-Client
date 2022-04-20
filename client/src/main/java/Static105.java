import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[Lclient!od;")
	public static Class114[] aClass114Array1;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!qi;")
	public static final ColorImageCacheEntry aClass3_Sub28_1 = new ColorImageCacheEntry(0, 0);

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!gn;")
	public static final LruHashTable aClass54_9 = new LruHashTable(128);

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!be;")
	public static Component aClass13_14 = null;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
	public static final int[] anIntArray256 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_559 = Static28.parse("<col=ffff00>");

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!na;")
	public static final JagString aClass100_561 = Static28.parse(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public static int anInt2863 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
	public static int method2253(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = 0.0D;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = local10;
		@Pc(37) double local37 = (double) 0;
		@Pc(39) double local39 = local10;
		if (local10 > local19) {
			local34 = local19;
		}
		if (local32 < local34) {
			local34 = local32;
		}
		if (local19 > local10) {
			local39 = local19;
		}
		if (local32 > local39) {
			local39 = local32;
		}
		@Pc(72) double local72 = (local34 + local39) / 2.0D;
		if (local34 != local39) {
			if (local72 < 0.5D) {
				local37 = (local39 - local34) / (local34 + local39);
			}
			if (local72 >= 0.5D) {
				local37 = (local39 - local34) / (2.0D - local39 - local34);
			}
			if (local39 == local10) {
				local25 = (local19 - local32) / (local39 - local34);
			} else if (local19 == local39) {
				local25 = (local32 - local10) / (local39 - local34) + 2.0D;
			} else if (local39 == local32) {
				local25 = (local10 - local19) / (-local34 + local39) + 4.0D;
			}
		}
		@Pc(159) int local159 = (int) (local37 * 256.0D);
		@Pc(164) int local164 = (int) (local72 * 256.0D);
		local25 /= 6.0D;
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(188) int local188 = (int) (local25 * 256.0D);
		if (local159 < 0) {
			local159 = 0;
		} else if (local159 > 255) {
			local159 = 255;
		}
		if (local164 > 243) {
			local159 >>= 0x4;
		} else if (local164 > 217) {
			local159 >>= 0x3;
		} else if (local164 > 192) {
			local159 >>= 0x2;
		} else if (local164 > 179) {
			local159 >>= 0x1;
		}
		return (local188 >> 2 << 10) + (local159 >> 5 << 7) + (local164 >> 1);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method2255() {
		Static251.anIntArray479 = null;
		Static60.anIntArrayArrayArray6 = null;
		Static128.anIntArray293 = null;
		Static163.aByteArrayArrayArray11 = null;
		Static4.aByteArrayArrayArray1 = null;
		Static118.aByteArrayArrayArray9 = null;
		Static240.aByteArrayArrayArray14 = null;
		Static253.aByteArrayArrayArray16 = null;
		Static139.anIntArray325 = null;
		Static221.anIntArray376 = null;
		Static279.anIntArray568 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIILclient!th;IZJ)Z")
	public static boolean method2256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Entity arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static83.anIntArrayArrayArray4 == Static80.anIntArrayArrayArray19;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static152.anInt3594 || local17 >= Static99.anInt2550) {
					return false;
				}
				@Pc(42) Tile local42 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt662 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Scenery local58 = new Scenery();
		local58.aLong56 = arg11;
		local58.anInt1709 = arg0;
		local58.anInt1699 = arg5;
		local58.anInt1703 = arg6;
		local58.anInt1706 = arg7;
		local58.aClass8_4 = arg8;
		local58.anInt1714 = arg9;
		local58.anInt1701 = arg1;
		local58.anInt1696 = arg2;
		local58.anInt1713 = arg1 + arg3 - 1;
		local58.anInt1698 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static130.aClass3_Sub5ArrayArrayArray1[local141][local17][local108] == null) {
						Static130.aClass3_Sub5ArrayArrayArray1[local141][local17][local108] = new Tile(local141, local17, local108);
					}
				}
				@Pc(174) Tile local174 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][local17][local108];
				local174.aClass31Array1[local174.anInt662] = local58;
				local174.anIntArray59[local174.anInt662] = local115;
				local174.anInt664 |= local115;
				local174.anInt662++;
				if (local6 && Static62.anIntArrayArray11[local17][local108] != 0) {
					local8 = Static62.anIntArrayArray11[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static62.anIntArrayArray11[local17][local108] == 0) {
						Static62.anIntArrayArray11[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static243.aClass31Array3[Static22.anInt726++] = local58;
		}
		return true;
	}
}
