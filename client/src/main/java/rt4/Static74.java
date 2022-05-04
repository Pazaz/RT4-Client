package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg6) {
			Static152.method2826(arg0, arg2, arg5, arg6, arg1, arg4);
		} else if (arg1 - arg6 >= TextureOp29.anInt4164 && arg6 + arg1 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg2 - arg3 && TextureOp29.anInt2869 >= arg2 + arg3) {
			Static270.method4594(arg5, arg1, arg2, arg4, arg6, arg3, arg0);
		} else {
			Static231.method3981(arg6, arg5, arg4, arg0, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIIII)V")
	public static void method1624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Sprites.scrollbars[0].renderTransparent(arg2, arg3);
		Sprites.scrollbars[1].renderTransparent(arg2, arg4 + arg3 - 16);
		@Pc(35) int local35 = arg4 * (arg4 - 32) / arg1;
		if (local35 < 8) {
			local35 = 8;
		}
		@Pc(54) int local54 = arg0 * (arg4 - local35 - 32) / (arg1 - arg4);
		if (!GlRenderer.enabled) {
			SoftwareRaster.fillRect(arg2, arg3 + 16, 16, arg4 - 32, Static182.anInt4306);
			SoftwareRaster.fillRect(arg2, local54 + arg3 + 16, 16, local35, Static53.anInt1704);
			SoftwareRaster.drawVerticalLine(arg2, local54 + arg3 + 16, local35, Static219.anInt4938);
			SoftwareRaster.drawVerticalLine(arg2 + 1, local54 + 16 + arg3, local35, Static219.anInt4938);
			SoftwareRaster.drawHorizontalLine(arg2, arg3 + local54 + 16, 16, Static219.anInt4938);
			SoftwareRaster.drawHorizontalLine(arg2, arg3 + local54 + 17, 16, Static219.anInt4938);
			SoftwareRaster.drawVerticalLine(arg2 + 15, local54 + 16 + arg3, local35, Static20.anInt671);
			SoftwareRaster.drawVerticalLine(arg2 + 14, arg3 - -17 - -local54, local35 - 1, Static20.anInt671);
			SoftwareRaster.drawHorizontalLine(arg2, local35 + arg3 + local54 + 15, 16, Static20.anInt671);
			SoftwareRaster.drawHorizontalLine(arg2 + 1, local35 + arg3 - (-local54 + -14), 15, Static20.anInt671);
			return;
		}
		GlRaster.method1186(arg2, arg3 + 16, 16, arg4 - 32, Static182.anInt4306);
		GlRaster.method1186(arg2, arg3 + local54 + 16, 16, local35, Static53.anInt1704);
		GlRaster.method1176(arg2, local54 + arg3 + 16, local35, Static219.anInt4938);
		GlRaster.method1176(arg2 + 1, local54 + 16 + arg3, local35, Static219.anInt4938);
		GlRaster.method1174(arg2, local54 + arg3 + 16, 16, Static219.anInt4938);
		GlRaster.method1174(arg2, local54 + arg3 + 17, 16, Static219.anInt4938);
		GlRaster.method1176(arg2 + 15, arg3 + (16 - -local54), local35, Static20.anInt671);
		GlRaster.method1176(arg2 + 14, arg3 - -local54 + 17, local35 - 1, Static20.anInt671);
		GlRaster.method1174(arg2, local35 + arg3 + local54 + 15, 16, Static20.anInt671);
		GlRaster.method1174(arg2 + 1, arg3 + 14 - -local54 + local35, 15, Static20.anInt671);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!be;)V")
	public static void update(@OriginalArg(1) Component arg0) {
		@Pc(7) Component local7 = Static280.method4668(arg0);
		@Pc(19) int local19;
		@Pc(17) int local17;
		if (local7 == null) {
			local17 = GameShell.canvasHeight;
			local19 = GameShell.canvasWidth;
		} else {
			local17 = local7.anInt459;
			local19 = local7.anInt445;
		}
		Static150.method2801(local17, local19, arg0, false);
		Static111.method2291(arg0, local17, local19);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)V")
	public static void method1626(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !InterfaceList.load(arg0)) {
			return;
		}
		@Pc(31) Component[] local31 = InterfaceList.components[arg0];
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			@Pc(41) Component local41 = local31[local33];
			if (local41.anObjectArray3 != null) {
				@Pc(50) HookRequest local50 = new HookRequest();
				local50.arguments = local41.anObjectArray3;
				local50.source = local41;
				ScriptRunner.run(2000000, local50);
			}
		}
	}

}
