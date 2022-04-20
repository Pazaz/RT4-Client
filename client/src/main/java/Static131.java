import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
	public static int anInt3252;

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
	public static int anInt3255;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
	public static int anInt3261;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array5 = new AnimFrameset[14];

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
	public static int anInt3251 = 0;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
	public static final int anInt3254 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
	public static int anInt3259 = 0;

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "I")
	public static int anInt3260 = -1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)V")
	public static void method2576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(14) int local14 = arg2 - 1;
		@Pc(17) int local17 = local14 - 7;
		while (local17 > arg1) {
			@Pc(22) int local22 = arg1 + 1;
			arg0[local22] = arg3;
			@Pc(27) int local27 = local22 + 1;
			arg0[local27] = arg3;
			@Pc(32) int local32 = local27 + 1;
			arg0[local32] = arg3;
			@Pc(37) int local37 = local32 + 1;
			arg0[local37] = arg3;
			@Pc(42) int local42 = local37 + 1;
			arg0[local42] = arg3;
			@Pc(47) int local47 = local42 + 1;
			arg0[local47] = arg3;
			@Pc(52) int local52 = local47 + 1;
			arg0[local52] = arg3;
			arg1 = local52 + 1;
			arg0[arg1] = arg3;
		}
		while (local14 > arg1) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2577(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([[F[[II[[FI[ILclient!fj;BLclient!gi;[[FI)V")
	public static void method2578(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class45 arg6, @OriginalArg(8) Light arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int[] local7 = new int[arg5.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local7.length; local13++) {
			@Pc(27) int local27 = arg5[local13 + local13];
			@Pc(35) int local35 = arg5[local13 + local13 + 1];
			@Pc(53) int local53;
			if (arg9 == 1) {
				local53 = local27;
				local27 = local35;
				local35 = 128 - local53;
			} else if (arg9 == 2) {
				local35 = 128 - local35;
				local27 = 128 - local27;
			} else if (arg9 == 3) {
				local53 = local27;
				local27 = 128 - local35;
				local35 = local53;
			}
			@Pc(123) float local123;
			@Pc(107) float local107;
			@Pc(115) float local115;
			if (local27 == 0 && local35 == 0) {
				local123 = arg3[arg2][arg4];
				local115 = arg8[arg2][arg4];
				local107 = arg0[arg2][arg4];
			} else if (local27 == 128 && local35 == 0) {
				local107 = arg0[arg2 + 1][arg4];
				local115 = arg8[arg2 + 1][arg4];
				local123 = arg3[arg2 + 1][arg4];
			} else if (local27 == 128 && local35 == 128) {
				local123 = arg3[arg2 + 1][arg4 + 1];
				local115 = arg8[arg2 + 1][arg4 + 1];
				local107 = arg0[arg2 + 1][arg4 + 1];
			} else if (local27 == 0 && local35 == 128) {
				local107 = arg0[arg2][arg4 + 1];
				local123 = arg3[arg2][arg4 + 1];
				local115 = arg8[arg2][arg4 + 1];
			} else {
				local115 = arg8[arg2][arg4];
				local107 = arg0[arg2][arg4];
				@Pc(187) float local187 = (float) local27 / 128.0F;
				local123 = arg3[arg2][arg4];
				@Pc(208) float local208 = local123 + (arg3[arg2 + 1][arg4] - local123) * local187;
				@Pc(222) float local222 = local107 + local187 * (arg0[arg2 + 1][arg4] - local107);
				@Pc(237) float local237 = local115 + (arg8[arg2 + 1][arg4] - local115) * local187;
				@Pc(245) float local245 = arg8[arg2][arg4 + 1];
				@Pc(261) float local261 = local245 + (arg8[arg2 + 1][arg4 + 1] - local245) * local187;
				@Pc(269) float local269 = arg3[arg2][arg4 + 1];
				@Pc(274) float local274 = (float) local35 / 128.0F;
				local115 = local237 + (local261 - local237) * local274;
				@Pc(291) float local291 = arg0[arg2][arg4 + 1];
				@Pc(307) float local307 = local291 + (arg0[arg2 + 1][arg4 + 1] - local291) * local187;
				@Pc(324) float local324 = local269 + (arg3[arg2 + 1][arg4 + 1] - local269) * local187;
				local123 = local208 + (local324 - local208) * local274;
				local107 = local222 + (local307 - local222) * local274;
			}
			@Pc(393) int local393 = (arg2 << 7) + local27;
			@Pc(400) int local400 = (arg4 << 7) + local35;
			@Pc(408) int local408 = Static182.method3361(local27, arg4, arg1, arg2, local35);
			local7[local13] = arg6.method1553(arg7, local393, local408, local400, local115, local123, local107);
		}
		arg6.method1557(local7);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZLjava/awt/Component;)Lclient!vk;")
	public static FrameBuffer method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("BufferedImageFrameBuffer");
			@Pc(16) FrameBuffer local16 = (FrameBuffer) local12.getDeclaredConstructor().newInstance();
			local16.method4192(arg0, arg1, arg2);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) ImageProducerFrameBuffer local29 = new ImageProducerFrameBuffer();
			local29.method4192(arg0, arg1, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!ve;)[Lclient!qf;")
	public static Sprite[] method2580(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		return Static234.method4016(arg1, 0, arg0) ? Static33.method870() : null;
	}
}
