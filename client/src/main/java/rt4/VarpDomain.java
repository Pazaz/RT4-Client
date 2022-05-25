package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarpDomain {
    @OriginalMember(owner = "client!gj", name = "q", descriptor = "[I")
    public static final int[] updatedVarps = new int[32];
    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	public static final int[] varp = new int[3500];
    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    public static final int[] activeVarps = new int[3500];
    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Lclient!na;")
	public static final JagString aClass100_1061 = JagString.parse("null");
    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int updatedVarpsWriterIndex = 0;
    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lclient!sc;")
    public static HashTable aClass133_20 = new HashTable(16);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V")
    public static void set(@OriginalArg(1) int value, @OriginalArg(2) int id) {
        varp[id] = value;
        @Pc(20) LongNode local20 = (LongNode) aClass133_20.get((long) id);
        if (local20 == null) {
            local20 = new LongNode(4611686018427387905L);
            aClass133_20.put(local20, (long) id);
        } else if (local20.value != 4611686018427387905L) {
            local20.value = MonotonicClock.currentTimeMillis() + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V")
    public static void reset() {
        for (@Pc(3) int local3 = 0; local3 < VarpTypeList.anInt4043; local3++) {
            @Pc(19) VarpType local19 = VarpTypeList.get(local3);
            if (local19 != null && local19.clientCode == 0) {
                varp[local3] = 0;
                activeVarps[local3] = 0;
            }
        }
        aClass133_20 = new HashTable(16);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method2766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		activeVarps[arg0] = arg1;
		@Pc(21) LongNode local21 = (LongNode) aClass133_20.get((long) arg0);
		if (local21 == null) {
			local21 = new LongNode(MonotonicClock.currentTimeMillis() + 500L);
			aClass133_20.put(local21, (long) arg0);
		} else {
			local21.value = MonotonicClock.currentTimeMillis() + 500L;
		}
	}

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public static int getVarbit(@OriginalArg(1) int arg0) {
		@Pc(13) VarbitType local13 = VarbitTypeList.get(arg0);
		@Pc(16) int local16 = local13.baseVar;
		@Pc(19) int local19 = local13.endBit;
		@Pc(22) int local22 = local13.startBit;
		@Pc(29) int local29 = Song_Class3_Sub9.anIntArray135[local19 - local22];
		return activeVarps[local16] >> local22 & local29;
	}

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)V")
    public static void setVarbitClient(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        @Pc(7) VarbitType local7 = VarbitTypeList.get(arg0);
        @Pc(10) int local10 = local7.endBit;
        @Pc(16) int local16 = local7.startBit;
        @Pc(19) int local19 = local7.baseVar;
        @Pc(25) int local25 = Song_Class3_Sub9.anIntArray135[local10 - local16];
        if (arg1 < 0 || arg1 > local25) {
            arg1 = 0;
        }
        local25 <<= local16;
        method2766(local19, local25 & arg1 << local16 | activeVarps[local19] & ~local25);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public static void setVarbit(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) VarbitType local14 = VarbitTypeList.get(arg1);
		@Pc(17) int local17 = local14.baseVar;
		@Pc(20) int local20 = local14.endBit;
		@Pc(23) int local23 = local14.startBit;
		@Pc(29) int local29 = Song_Class3_Sub9.anIntArray135[local20 - local23];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local23;
		set(arg0 << local23 & local29 | ~local29 & varp[local17], local17);
	}

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public static void refreshMagicVarp(@OriginalArg(1) int arg0) {
		InterfaceList.redrawActiveInterfaces();
		AreaSoundManager.updateMulti();
		@Pc(17) int local17 = VarpTypeList.get(arg0).clientCode;
		if (local17 == 0) {
			return;
		}
		@Pc(25) int local25 = activeVarps[arg0];
		if (local17 == 6) {
			Static79.anInt2157 = local25;
		}
		if (local17 == 5) {
			Static116.anInt2952 = local25;
		}
		if (local17 == 9) {
			Static179.anInt4254 = local25;
		}
	}
}
