package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt5230;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array7 = new AnimFrameset[14];

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public static int anInt5235 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V")
	public static void method4012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < InterfaceList.rectangles; local12++) {
			if (InterfaceList.rectangleWidth[local12] + InterfaceList.rectangleX[local12] > arg0 && arg1 + arg0 > InterfaceList.rectangleX[local12] && arg2 < InterfaceList.rectangleHeight[local12] + InterfaceList.rectangleY[local12] && InterfaceList.rectangleY[local12] < arg2 + arg3) {
				Static186.aBooleanArray100[local12] = true;
			}
		}
	}
}
