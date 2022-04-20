import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
	public static int anInt636;

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!bi", name = "W", descriptor = "Lclient!na;")
	public static final JagString aClass100_112 = Static28.parse("k");

	@OriginalMember(owner = "client!bi", name = "jb", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
	public static void method586() {
		Static262.aClass99_34.method3102(5);
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
	public static void loop() {
		@Pc(11) int local11;
		for (local11 = -1; local11 < Static267.anInt5774; local11++) {
			@Pc(22) int local22;
			if (local11 == -1) {
				local22 = 2047;
			} else {
				local22 = Static105.anIntArray256[local11];
			}
			@Pc(30) Player local30 = Static159.aClass8_Sub4_Sub1Array1[local22];
			if (local30 != null && local30.anInt3408 > 0) {
				local30.anInt3408--;
				if (local30.anInt3408 == 0) {
					local30.aClass100_640 = null;
				}
			}
		}
		for (local11 = 0; local11 < Static272.anInt5214; local11++) {
			@Pc(68) int local68 = Static33.anIntArray79[local11];
			@Pc(72) Npc local72 = Static175.aClass8_Sub4_Sub2Array1[local68];
			if (local72 != null && local72.anInt3408 > 0) {
				local72.anInt3408--;
				if (local72.anInt3408 == 0) {
					local72.aClass100_640 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I")
	public static int method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = Rasteriser.anIntArray220[Static268.method4585(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(31) int local31 = Rasteriser.anInterface1_2.method3238(arg0 & 0xFFFF);
			@Pc(49) int local49;
			@Pc(73) int local73;
			if (local31 != 0) {
				if (arg2 < 0) {
					local49 = 0;
				} else if (arg2 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg2 * 131586;
				}
				if (local31 == 256) {
					local19 = local49;
				} else {
					local73 = 256 - local31;
					local19 = ((local49 & 0xFF00) * local31 + local73 * (local19 & 0xFF00) & 0xFF0000) + (local31 * (local49 & 0xFF00FF) + ((local19 & 0xFF00FF) * local73) & 0xFF00FF00) >> 8;
				}
			}
			local49 = Rasteriser.anInterface1_2.method3229(arg0 & 0xFFFF);
			if (local49 != 0) {
				local49 += 256;
				@Pc(125) int local125 = (local19 >> 16 & 0xFF) * local49;
				if (local125 > 65535) {
					local125 = 65535;
				}
				local73 = (local19 >> 8 & 0xFF) * local49;
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(150) int local150 = local49 * (local19 & 0xFF);
				if (local150 > 65535) {
					local150 = 65535;
				}
				local19 = (local150 >> 8) + (local73 & 0xFF00) + (local125 << 8 & 0xFF001F);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void start(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = SignLink.aMethod6;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(25) Throwable local25) {
			}
		}
		arg0.addKeyListener(Static10.aClass149_1);
		arg0.addFocusListener(Static10.aClass149_1);
	}
}
