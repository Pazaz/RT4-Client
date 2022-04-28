package rt4;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lsignlink!im;")
	public static PrivilegedRequest openUrlRequest;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
	public static final int[] anIntArray79 = new int[32768];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!pb;ZIIII)Z")
	public static boolean method867(@OriginalArg(0) int arg0, @OriginalArg(1) LocType arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) MsiType local10 = MsiTypeList.get(arg1.mapSceneId);
		if (local10.spriteId == -1) {
			return true;
		}
		if (arg1.mapSceneRotated) {
			@Pc(24) int local24 = arg3 + arg1.mapSceneAngleOffset;
			arg3 = local24 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(42) SoftwareIndexedSprite local42 = local10.getSprite(arg3);
		if (local42 == null) {
			return false;
		}
		@Pc(49) int local49 = arg1.width;
		@Pc(52) int local52 = arg1.length;
		if ((arg3 & 0x1) == 1) {
			local49 = arg1.length;
			local52 = arg1.width;
		}
		@Pc(66) int local66 = local42.innerWidth;
		@Pc(69) int local69 = local42.innerHeight;
		if (local10.aBoolean2) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (local10.anInt11 == 0) {
			local42.method1398(arg0 * 4 + 48, (-local52 + -arg2 + 104) * 4 + 48, local66, local69);
		} else {
			local42.method1390(arg0 * 4 + 48, (-local52 + -arg2 + 104) * 4 + 48, local66, local69, local10.anInt11);
		}
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method869(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static84.aBoolean127) {
			try {
				@Pc(27) ByteArray local27 = new DirectByteArray();
				local27.set(arg0);
				return local27;
			} catch (@Pc(34) Throwable local34) {
				Static84.aBoolean127 = true;
			}
		}
		return arg0;
	}

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)Lclient!na;")
	public static JagString method873(@OriginalArg(0) long arg0) {
		Static35.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static35.aCalendar1.get(7);
		@Pc(17) int local17 = Static35.aCalendar1.get(5);
		@Pc(21) int local21 = Static35.aCalendar1.get(2);
		@Pc(32) int local32 = Static35.aCalendar1.get(1);
		@Pc(36) int local36 = Static35.aCalendar1.get(11);
		@Pc(40) int local40 = Static35.aCalendar1.get(12);
		@Pc(44) int local44 = Static35.aCalendar1.get(13);
		return JagString.concatenate(new JagString[] { Static219.aClass100Array149[local13 - 1], Static74.aClass100_461, Static123.parseInt(local17 / 10), Static123.parseInt(local17 % 10), Static270.aClass100_1089, Static138.aClass100Array102[local21], Static270.aClass100_1089, Static123.parseInt(local32), Static49.aClass100_351, Static123.parseInt(local36 / 10), Static123.parseInt(local36 % 10), Static264.COLON, Static123.parseInt(local40 / 10), Static123.parseInt(local40 % 10), Static264.COLON, Static123.parseInt(local44 / 10), Static123.parseInt(local44 % 10), Static55.aClass100_376 });
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIIIIIIFB)[[I")
	public static int[][] method874(@OriginalArg(7) float arg0) {
		@Pc(15) int[][] local15 = new int[256][64];
		@Pc(19) TextureOp4 local19 = new TextureOp4();
		local19.anInt648 = (int) (arg0 * 4096.0F);
		local19.anInt642 = 3;
		local19.anInt641 = 4;
		local19.aBoolean44 = false;
		local19.anInt646 = 8;
		local19.method4630();
		Static10.method348(256, 64);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local19.method584(local46, local15[local46]);
		}
		return local15;
	}
}
