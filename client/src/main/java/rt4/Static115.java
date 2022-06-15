package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!ih;")
	public static final LinkedList mediumPriorityRequests = new LinkedList();

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt2941 = -1;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!na;")
	public static final JagString HTTP_PROTOCOL = JagString.parse("http:)4)4");
	@OriginalMember(owner = "client!od", name = "g", descriptor = "S")
	public static short aShort25 = 256;
	@OriginalMember(owner = "client!an", name = "db", descriptor = "S")
	public static short aShort9 = 205;
	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "S")
	public static short aShort22 = 1;
	@OriginalMember(owner = "client!ac", name = "k", descriptor = "S")
	public static short aShort1 = 32767;
	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static int anInt4055 = 0;
	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public static int anInt5377 = 0;
	@OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
	public static int anInt773 = 0;
	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt983 = 0;
	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static int anInt5029 = 0;
	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "S")
	public static short aShort21 = 32767;
	@OriginalMember(owner = "client!ee", name = "f", descriptor = "S")
	public static short aShort12 = 1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIB)V")
	public static void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Cross.type == 1) {
			Sprites.crosses[Cross.milliseconds / 100].render(Cross.x - 8, Cross.y + -8);
		}
		if (Cross.type == 2) {
			Sprites.crosses[Cross.milliseconds / 100 + 4].render(Cross.x - 8, Cross.y + -8);
		}
		Player.setTutorialIsland();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (GlRenderer.enabled) {
			@Pc(25) int local25 = arg2 - 334;
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 100) {
				local25 = 100;
			}
			@Pc(51) int local51 = local25 * (aShort9 - aShort25) / 100 + aShort25;
			if (aShort22 > local51) {
				local51 = aShort22;
			} else if (aShort1 < local51) {
				local51 = aShort1;
			}
			@Pc(73) int local73 = local51 * arg2 * 512 / (arg0 * 334);
			@Pc(115) int local115;
			@Pc(122) int local122;
			@Pc(86) short local86;
			if (local73 < aShort12) {
				local86 = aShort12;
				local51 = arg0 * 334 * local86 / (arg2 * 512);
				if (aShort1 < local51) {
					local51 = aShort1;
					local115 = arg2 * 512 * local51 / (local86 * 334);
					local122 = (arg0 - local115) / 2;
					if (arg4) {
						GlRaster.method1177();
						GlRaster.method1186(arg3, arg1, local122, arg2, 0);
						GlRaster.method1186(arg0 + arg3 - local122, arg1, local122, arg2, 0);
					}
					arg3 += local122;
					arg0 -= local122 * 2;
				}
			} else if (aShort21 < local73) {
				local86 = aShort21;
				local51 = local86 * arg0 * 334 / (arg2 * 512);
				if (aShort22 > local51) {
					local51 = aShort22;
					local115 = local86 * arg0 * 334 / (local51 * 512);
					local122 = (arg2 - local115) / 2;
					if (arg4) {
						GlRaster.method1177();
						GlRaster.method1186(arg3, arg1, arg0, local122, 0);
						GlRaster.method1186(arg3, arg1 + arg2 - local122, arg0, local122, 0);
					}
					arg2 -= local122 * 2;
					arg1 += local122;
				}
			}
			anInt5029 = local51 * arg2 / 334;
		}
		anInt4055 = (short) arg0;
		anInt5377 = (short) arg2;
		anInt773 = arg1;
		anInt983 = arg3;
	}

}
