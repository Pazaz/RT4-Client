import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_120 = new LinkedList();

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public static int anInt5101 = 0;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!na;")
	public static final JagString aClass100_967 = Static28.parse("");

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public static int anInt5103 = -1;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public static int anInt5105 = 0;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_968 = Static28.parse("headicons_prayer");

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
	public static final boolean aBoolean248 = false;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] allocate(@OriginalArg(1) int arg0) {
		@Pc(22) byte[] local22;
		if (arg0 == 100 && Static115.anInt2937 > 0) {
			local22 = Static277.aByteArrayArray16[--Static115.anInt2937];
			Static277.aByteArrayArray16[Static115.anInt2937] = null;
			return local22;
		} else if (arg0 == 5000 && Static251.anInt5459 > 0) {
			local22 = Static12.aByteArrayArray2[--Static251.anInt5459];
			Static12.aByteArrayArray2[Static251.anInt5459] = null;
			return local22;
		} else if (arg0 == 30000 && Static224.anInt5064 > 0) {
			local22 = Static41.aByteArrayArray6[--Static224.anInt5064];
			Static41.aByteArrayArray6[Static224.anInt5064] = null;
			return local22;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZBIZ)V")
	public static void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static79.method1697(arg0, arg2, Static101.aClass10_Sub1Array1.length - 1, arg3, 0, arg1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[JII[Ljava/lang/Object;)V")
	public static void method3909(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(16) int local16 = arg2;
		@Pc(23) int local23 = (arg2 + arg0) / 2;
		@Pc(27) long local27 = arg1[local23];
		arg1[local23] = arg1[arg0];
		arg1[arg0] = local27;
		@Pc(41) Object local41 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local41;
		for (@Pc(53) int local53 = arg2; local53 < arg0; local53++) {
			if (local27 + (long) (local53 & 0x1) > arg1[local53]) {
				@Pc(72) long local72 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local72;
				@Pc(86) Object local86 = arg3[local53];
				arg3[local53] = arg3[local16];
				arg3[local16++] = local86;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local27;
		arg3[arg0] = arg3[local16];
		arg3[local16] = local41;
		method3909(local16 - 1, arg1, arg2, arg3);
		method3909(arg0, arg1, local16 + 1, arg3);
	}
}
