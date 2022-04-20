import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "Lclient!ve;")
	public static Js5 aClass153_59;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	public static int anInt3783;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "Lclient!ha;")
	public static final GzipDecompressor aClass56_1 = new GzipDecompressor();

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static152.anInt3594 * 128) {
			arg0 = Static152.anInt3594 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static99.anInt2550 * 128) {
			arg2 = Static99.anInt2550 * 128 - 1;
		}
		Static109.anInt2886 = MathUtils.anIntArray223[arg3];
		Static121.anInt3038 = MathUtils.anIntArray225[arg3];
		Static231.anInt5205 = MathUtils.anIntArray223[arg4];
		Static81.anInt2222 = MathUtils.anIntArray225[arg4];
		Static149.anInt3555 = arg0;
		Static162.anInt3947 = arg1;
		Static217.anInt4903 = arg2;
		Static167.anInt4069 = arg0 / 128;
		Static193.anInt4539 = arg2 / 128;
		Static31.anInt987 = Static167.anInt4069 - Static277.anInt5855;
		if (Static31.anInt987 < 0) {
			Static31.anInt987 = 0;
		}
		Static80.anInt4698 = Static193.anInt4539 - Static277.anInt5855;
		if (Static80.anInt4698 < 0) {
			Static80.anInt4698 = 0;
		}
		Static2.anInt15 = Static167.anInt4069 + Static277.anInt5855;
		if (Static2.anInt15 > Static152.anInt3594) {
			Static2.anInt15 = Static152.anInt3594;
		}
		Static215.anInt4866 = Static193.anInt4539 + Static277.anInt5855;
		if (Static215.anInt4866 > Static99.anInt2550) {
			Static215.anInt4866 = Static99.anInt2550;
		}
		@Pc(99) short local99;
		if (GlRenderer.enabled) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static277.anInt5855 + Static277.anInt5855 + 2; local104++) {
			for (local113 = 0; local113 < Static277.anInt5855 + Static277.anInt5855 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static277.anInt5855 << 7) - (Static149.anInt3555 & 0x7F);
				@Pc(140) int local140 = (local113 - Static277.anInt5855 << 7) - (Static217.anInt4903 & 0x7F);
				@Pc(146) int local146 = Static167.anInt4069 + local104 - Static277.anInt5855;
				@Pc(152) int local152 = Static193.anInt4539 + local113 - Static277.anInt5855;
				if (local146 >= 0 && local152 >= 0 && local146 < Static152.anInt3594 && local152 < Static99.anInt2550) {
					@Pc(176) int local176;
					if (Static80.anIntArrayArrayArray19 == null) {
						local176 = Static107.anIntArrayArrayArray10[0][local146][local152] + 128 - Static162.anInt3947;
					} else {
						local176 = Static80.anIntArrayArrayArray19[0][local146][local152] + 128 - Static162.anInt3947;
					}
					@Pc(201) int local201 = Static107.anIntArrayArrayArray10[3][local146][local152] - Static162.anInt3947 - 1000;
					Static89.aBooleanArrayArray3[local104][local113] = Static160.method3049(local130, local201, local176, local140, local99);
				} else {
					Static89.aBooleanArrayArray3[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static277.anInt5855 + Static277.anInt5855 + 1; local104++) {
			for (local113 = 0; local113 < Static277.anInt5855 + Static277.anInt5855 + 1; local113++) {
				Static48.aBooleanArrayArray1[local104][local113] = Static89.aBooleanArrayArray3[local104][local113] || Static89.aBooleanArrayArray3[local104 + 1][local113] || Static89.aBooleanArrayArray3[local104][local113 + 1] || Static89.aBooleanArrayArray3[local104 + 1][local113 + 1];
			}
		}
		Static8.anIntArray8 = arg6;
		Static127.anIntArray292 = arg7;
		Static96.anIntArray234 = arg8;
		Static234.anIntArray454 = arg9;
		Static206.anIntArray427 = arg10;
		Static123.method2419();
		if (Static276.aClass3_Sub5ArrayArrayArray3 != null) {
			Static278.method4648(true);
			Static248.method3292(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (GlRenderer.enabled) {
				Static119.aBoolean153 = false;
				Static27.setMaterial(0, 0);
				Static161.method3066(null);
				Static120.method2390();
			}
			Static278.method4648(false);
		}
		Static248.method3292(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)V")
	public static void method2956(@OriginalArg(0) long arg0) {
		if ((long) 0 != arg0) {
			Static6.outboundBuffer.p1isaac(104);
			Static6.outboundBuffer.p8(arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	public static void init() {
		if (SignLink.aString20.toLowerCase().indexOf("microsoft") != -1) {
			Static196.anIntArray407[187] = 27;
			Static196.anIntArray407[223] = 28;
			Static196.anIntArray407[221] = 43;
			Static196.anIntArray407[188] = 71;
			Static196.anIntArray407[222] = 59;
			Static196.anIntArray407[192] = 58;
			Static196.anIntArray407[191] = 73;
			Static196.anIntArray407[219] = 42;
			Static196.anIntArray407[190] = 72;
			Static196.anIntArray407[186] = 57;
			Static196.anIntArray407[220] = 74;
			Static196.anIntArray407[189] = 26;
			return;
		}
		if (SignLink.aMethod6 == null) {
			Static196.anIntArray407[192] = 58;
			Static196.anIntArray407[222] = 59;
		} else {
			Static196.anIntArray407[222] = 58;
			Static196.anIntArray407[192] = 28;
			Static196.anIntArray407[520] = 59;
		}
		Static196.anIntArray407[45] = 26;
		Static196.anIntArray407[61] = 27;
		Static196.anIntArray407[91] = 42;
		Static196.anIntArray407[59] = 57;
		Static196.anIntArray407[93] = 43;
		Static196.anIntArray407[44] = 71;
		Static196.anIntArray407[92] = 74;
		Static196.anIntArray407[46] = 72;
		Static196.anIntArray407[47] = 73;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	public static void method2959() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glDisableClientState(GL2.GL_COLOR_ARRAY);
		GlRenderer.setLightingEnabled(false);
		local1.glDisable(GL2.GL_DEPTH_TEST);
		local1.glPushAttrib(GL2.GL_FOG_BIT);
		local1.glFogf(GL2.GL_FOG_START, 3072.0F);
		GlRenderer.disableDepthMask();
		for (@Pc(19) int local19 = 0; local19 < Static36.aClass3_Sub14ArrayArray1[0].length; local19++) {
			@Pc(31) Class3_Sub14 local31 = Static36.aClass3_Sub14ArrayArray1[0][local19];
			if (local31.anInt2485 >= 0 && Rasteriser.anInterface1_2.method3237(local31.anInt2485) == 4) {
				local1.glColor4fv(Static190.method3441(local31.anInt2486), 0);
				@Pc(57) float local57 = 201.5F - (local31.aBoolean140 ? 1.0F : 0.5F);
				local31.method1944(Static130.aClass3_Sub5ArrayArrayArray1, local57, true);
			}
		}
		local1.glEnableClientState(GL2.GL_COLOR_ARRAY);
		GlRenderer.method4173();
		local1.glEnable(GL2.GL_DEPTH_TEST);
		local1.glPopAttrib();
		GlRenderer.enableDepthMask();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!wa;)Lclient!ta;")
	public static TextureOp29SubOp4 method2960(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp4(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g3(), arg0.g1());
	}
}
