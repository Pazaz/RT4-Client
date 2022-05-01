package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	public static int anInt1275;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!na;")
	public static final JagString aClass100_253 = JagString.parse("(U0a )2 via: ");

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public static void updateLoginScreenCamera() {
		if (Static155.anInt3718 == -1 || Static52.anInt1694 == -1) {
			return;
		}
		@Pc(27) int local27 = (Static233.anInt5224 * (Static114.anInt5843 - Static228.anInt5101) >> 16) + Static228.anInt5101;
		@Pc(30) float[] renderCoordinates = new float[3];
		Static233.anInt5224 += local27;
		if (Static233.anInt5224 >= 65535) {
			Static233.anInt5224 = 65535;
			if (Static186.aBoolean205) {
				Static13.aBoolean16 = false;
			} else {
				Static13.aBoolean16 = true;
			}
			Static186.aBoolean205 = true;
		} else {
			Static186.aBoolean205 = false;
			Static13.aBoolean16 = false;
		}
		@Pc(66) float local66 = (float) Static233.anInt5224 / 65535.0F;
		@Pc(70) int local70 = Static127.anInt3125 * 2;
		@Pc(141) int local141;
		@Pc(131) int local131;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(146) int local146;
		@Pc(155) int local155;
		@Pc(173) int local173;
		for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
			local111 = (Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 2][local72] + Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 2][local72] - Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 3][local72]) * 3;
			local119 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70][local72];
			local131 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 1][local72] * 3;
			local141 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70][local72] * 3;
			local146 = local131 - local141;
			local155 = local111 + local141 - local131 * 2;
			local173 = Static107.anIntArrayArrayArray9[Static155.anInt3718][local70 + 2][local72] + local131 - local119 - local111;
			renderCoordinates[local72] = (float) local119 + (((float) local173 * local66 + (float) local155) * local66 + (float) local146) * local66;
		}
		Static5.anInt40 = (int) renderCoordinates[1] * -1;
		Static138.renderX = (int) renderCoordinates[0] - Static225.originX * 128;
		Static134.renderZ = (int) renderCoordinates[2] - Static142.originZ * 128;
		@Pc(226) float[] local226 = new float[3];
		local141 = Static75.anInt2119 * 2;
		for (local131 = 0; local131 < 3; local131++) {
			local111 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141][local131] * 3;
			local146 = (Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 2][local131] + Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 2][local131] - Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 3][local131]) * 3;
			local155 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141][local131];
			local119 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 1][local131] * 3;
			local173 = local119 - local111;
			@Pc(313) int local313 = local146 + local111 - local119 * 2;
			@Pc(331) int local331 = Static107.anIntArrayArrayArray9[Static52.anInt1694][local141 + 2][local131] + local119 - local146 - local155;
			local226[local131] = (float) local155 + local66 * (local66 * (local66 * (float) local331 + (float) local313) + (float) local173);
		}
		@Pc(363) float local363 = local226[0] - renderCoordinates[0];
		@Pc(371) float local371 = local226[2] - renderCoordinates[2];
		@Pc(382) float local382 = (local226[1] - renderCoordinates[1]) * -1.0F;
		@Pc(392) double local392 = Math.sqrt((double) (local371 * local371 + local363 * local363));
		Static146.aFloat15 = (float) Math.atan2((double) local382, local392);
		Static84.aFloat10 = -((float) Math.atan2((double) local363, (double) local371));
		Static240.cameraPitch = (int) ((double) Static146.aFloat15 * 325.949D) & 0x7FF;
		Static184.cameraYaw = (int) ((double) Static84.aFloat10 * 325.949D) & 0x7FF;
	}

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1014(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, local5 + arg1.length())) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!be;)V")
	public static void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		if (Static105.aClass13_14 != null || Static60.aBoolean108 || (arg2 == null || Static89.method1836(arg2) == null)) {
			return;
		}
		Static105.aClass13_14 = arg2;
		Static4.aClass13_1 = Static89.method1836(arg2);
		Static246.anInt5388 = arg1;
		Static138.aBoolean172 = false;
		Static213.anInt4851 = 0;
		Static165.anInt4035 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!na;JI)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) JagString password, @OriginalArg(5) long name, @OriginalArg(6) int arg5) {
		@Pc(8) Buffer local8 = new Buffer(GlobalConfig.LOGIN_USE_STRINGS ? 129 : 128);
		local8.p1(10);
		local8.p2((int) (Math.random() * 99999.0D));
		local8.p2(530);
		if (GlobalConfig.LOGIN_USE_STRINGS) {
			local8.pjstr(Base37.decode37(name));
		} else {
			local8.p8(name);
		}
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.pjstr(password);
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.p2(client.affiliate);
		local8.p1(arg0);
		local8.p1(arg2);
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.p2(arg5);
		local8.p2(arg1);
		local8.p4((int) (Math.random() * 9.9999999E7D));
		local8.encryptRsa(GlobalConfig.RSA_EXPONENT, GlobalConfig.RSA_MODULUS);
		Protocol.outboundBuffer.offset = 0;
		Protocol.outboundBuffer.p1(36);
		Protocol.outboundBuffer.p1(local8.offset);
		Protocol.outboundBuffer.pBytes(local8.data, local8.offset);
		CreateManager.reply = -3;
		CreateManager.step = 1;
		CreateManager.loops = 0;
		CreateManager.errors = 0;
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(B)V")
	public static void method1019() {
		Component.sprites.method3103();
		Component.models.method3103();
		Component.fonts.method3103();
	}
}
