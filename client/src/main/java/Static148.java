import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!ge;")
	public static Cache masterCache;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public static int anInt3534;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Lclient!va;")
	public static MidiPcmStream aClass3_Sub3_Sub4_1;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!sc;")
	public static HashTable aClass133_13;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public static int anInt3535;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "[Lclient!mj;")
	public static final CollisionMap[] aClass97Array1 = new CollisionMap[4];

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_677 = Static28.parse("::rebuild");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	public static void method2765(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static144.aBoolean173) {
			Static241.method4548();
		} else if (arg0 != -1 && (Static221.anInt4363 != arg0 || !Static136.method2655()) && Static12.anInt391 != 0 && !Static144.aBoolean173) {
			Static257.method526(arg0, Static130.aClass153_47, Static12.anInt391);
		}
		Static221.anInt4363 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method2766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static7.anIntArray75[arg0] = arg1;
		@Pc(21) LongNode local21 = (LongNode) Static199.aClass133_20.method3863((long) arg0);
		if (local21 == null) {
			local21 = new LongNode(MonotonicClock.currentTimeMillis() + 500L);
			Static199.aClass133_20.method3862(local21, (long) arg0);
		} else {
			local21.aLong55 = MonotonicClock.currentTimeMillis() + 500L;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lclient!dd;")
	public static SoftwareFont method2768(@OriginalArg(1) int arg0) {
		@Pc(16) SoftwareFont local16 = (SoftwareFont) Static139.aClass99_22.method3106((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static261.aClass153_107.method4495(arg0, 0);
		local16 = new SoftwareFont(local26);
		local16.method2873(Static159.aClass36Array12, null);
		Static139.aClass99_22.method3095(local16, (long) arg0);
		return local16;
	}
}
