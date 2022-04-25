package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt5868 = 0;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray135 = new boolean[200];

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!ih;")
	public static final LinkedList aClass69_135 = new LinkedList();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method4656(@OriginalArg(0) JagString arg0) {
		@Pc(9) int local9 = Static171.method3218(arg0);
		if (local9 != -1) {
			Static80.method3616(WorldMap.labels.aShortArray73[local9], WorldMap.labels.aShortArray72[local9]);
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)[Lclient!od;")
	public static Class114[] method4660() {
		if (Static105.aClass114Array1 == null) {
			@Pc(16) Class114[] local16 = Static197.method3558(GameShell.signLink);
			@Pc(20) Class114[] local20 = new Class114[local16.length];
			@Pc(22) int local22 = 0;
			label52: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(32) Class114 local32 = local16[local24];
				if ((local32.anInt4251 <= 0 || local32.anInt4251 >= 24) && local32.anInt4248 >= 800 && local32.anInt4250 >= 600) {
					for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
						@Pc(59) Class114 local59 = local20[local52];
						if (local32.anInt4248 == local59.anInt4248 && local59.anInt4250 == local32.anInt4250) {
							if (local32.anInt4251 > local59.anInt4251) {
								local20[local52] = local32;
							}
							continue label52;
						}
					}
					local20[local22] = local32;
					local22++;
				}
			}
			Static105.aClass114Array1 = new Class114[local22];
			Static289.method2617(local20, 0, Static105.aClass114Array1, 0, local22);
			@Pc(112) int[] local112 = new int[Static105.aClass114Array1.length];
			for (@Pc(114) int local114 = 0; local114 < Static105.aClass114Array1.length; local114++) {
				@Pc(122) Class114 local122 = Static105.aClass114Array1[local114];
				local112[local114] = local122.anInt4250 * local122.anInt4248;
			}
			Static181.method3346(local112, Static105.aClass114Array1);
		}
		return Static105.aClass114Array1;
	}

}
