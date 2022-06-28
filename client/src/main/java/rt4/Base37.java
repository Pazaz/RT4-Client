package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Base37 {
	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[]{95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lclient!na;")
	public static JagString decode37(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(48) byte[] local48 = new byte[local32];
			while (arg0 != 0L) {
				@Pc(65) long local65 = arg0;
				arg0 /= 37L;
				local32--;
				local48[local32] = aByteArray12[(int) (local65 - arg0 * 37L)];
			}
			@Pc(88) JagString local88 = new JagString();
			local88.chars = local48;
			local88.length = local48.length;
			return local88;
		}
	}
}
