import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt2503 = -1;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
	public static int method1959(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIILclient!be;Z)V")
	public static void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Component arg5) {
		@Pc(13) int local13 = arg3 * arg3 + arg4 * arg4;
		if (local13 > 360000) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg5.anInt445 / 2, arg5.anInt459 / 2);
		if (local30 * local30 >= local13) {
			Static60.method1446(arg5, Sprites.mapmarkhints[arg0], arg4, arg3, arg1, arg2);
			return;
		}
		local30 -= 10;
		@Pc(58) int local58 = Static59.anInt1814 + (int)Camera.yawTarget & 0x7FF;
		@Pc(62) int local62 = MathUtils.cos[local58];
		@Pc(66) int local66 = MathUtils.sin[local58];
		@Pc(74) int local74 = local66 * 256 / (Static273.anInt4130 + 256);
		@Pc(82) int local82 = local62 * 256 / (Static273.anInt4130 + 256);
		@Pc(93) int local93 = arg4 * local74 + local82 * arg3 >> 16;
		@Pc(104) int local104 = arg4 * local82 - local74 * arg3 >> 16;
		@Pc(110) double local110 = Math.atan2((double) local93, (double) local104);
		@Pc(117) int local117 = (int) (Math.sin(local110) * (double) local30);
		@Pc(124) int local124 = (int) (Math.cos(local110) * (double) local30);
		if (GlRenderer.enabled) {
			((GlSprite) Static277.hintMapEdge[arg0]).method1428((arg5.anInt445 / 2 + arg2 + local117) * 16, (arg5.anInt459 / 2 + arg1 - local124) * 16, (int) (local110 * 10430.378D));
		} else {
			((SoftwareSprite) Static277.hintMapEdge[arg0]).method306(local117 + arg5.anInt445 / 2 + arg2 - 10, arg5.anInt459 / 2 + -10 + arg1 + -local124, local110);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1961(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof TracingException) {
			@Pc(11) TracingException local11 = (TracingException) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString3 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local24 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(79) String local79;
			if (local65 == -1) {
				local79 = local59;
			} else {
				local79 = local59.substring(0, local65);
			}
			local79 = local79.trim();
			local79 = local79.substring(local79.lastIndexOf(32) + 1);
			local79 = local79.substring(local79.lastIndexOf(9) + 1);
			local24 = local24 + local79;
			if (local65 != -1 && local72 != -1) {
				@Pc(126) int local126 = local59.indexOf(".java:", local65);
				if (local126 >= 0) {
					local24 = local24 + local59.substring(local126 + 5, local72);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!be;B)Lclient!na;")
	public static JagString method1963(@OriginalArg(0) Component arg0) {
		if (InterfaceList.getServerActiveProperties(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.aClass100_86 == null || arg0.aClass100_86.trim().length() == 0) {
			return Static121.aBoolean154 ? Static143.aClass100_668 : null;
		} else {
			return arg0.aClass100_86;
		}
	}
}
