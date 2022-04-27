package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!pb;BII)V")
	public static void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) AreaSound local10 = (AreaSound) Static3.aClass69_135.start(); local10 != null; local10 = (AreaSound) Static3.aClass69_135.next()) {
			if (arg3 == local10.anInt2033 && local10.anInt2041 == arg0 * 128 && local10.anInt2029 == arg2 * 128 && arg1.id == local10.locType.id) {
				if (local10.primaryStream != null) {
					client.soundStream.removeSubStream(local10.primaryStream);
					local10.primaryStream = null;
				}
				if (local10.secondaryStream != null) {
					client.soundStream.removeSubStream(local10.secondaryStream);
					local10.secondaryStream = null;
				}
				local10.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z")
	public static boolean method3702(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)V")
	public static void method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) DelayedStateChange local12 = Static238.method4143(9, arg0);
		local12.pushServer();
		local12.intArg1 = arg2;
		local12.intArg3 = arg1;
	}

}
