package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class TextureOp29SubOp3 extends TextureOp29SubOp {

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	private final int anInt4850;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	private final int anInt4853;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	private final int anInt4849;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private final int anInt4846;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	private final int anInt4842;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	private final int anInt4845;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	private final int anInt4841;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	private final int anInt4854;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public TextureOp29SubOp3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4850 = arg1;
		this.anInt4853 = arg6;
		this.anInt4849 = arg4;
		this.anInt4846 = arg0;
		this.anInt4842 = arg7;
		this.anInt4845 = arg5;
		this.anInt4841 = arg3;
		this.anInt4854 = arg2;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!wa;)Lclient!re;")
	public static TextureOp29SubOp3 create(@OriginalArg(1) Buffer arg0) {
		return new TextureOp29SubOp3(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg5 >= TextureOp29.anInt4164 && arg5 <= TextureOp29.anInt5063 && arg0 >= TextureOp29.anInt4164 && arg0 <= TextureOp29.anInt5063 && arg6 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= arg6 && TextureOp29.anInt4164 <= arg1 && arg1 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg4 && arg4 <= TextureOp29.anInt2869 && arg7 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg7 && arg2 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg2 && arg3 >= TextureOp29.anInt5773 && arg3 <= TextureOp29.anInt2869) {
			method962(arg2, arg8, arg7, arg6, arg1, arg3, arg4, arg0, arg5);
		} else {
			method3162(arg5, arg0, arg7, arg8, arg3, arg2, arg1, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg7 && arg2 == arg6 && arg4 == arg3 && arg0 == arg5) {
			TextureOp29SubOp4.method4547(arg1, arg5, arg6, arg4, arg8);
			return;
		}
		@Pc(37) int local37 = arg6;
		@Pc(39) int local39 = arg8;
		@Pc(43) int local43 = arg8 * 3;
		@Pc(47) int local47 = arg6 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg2 * 3;
		@Pc(59) int local59 = arg3 * 3;
		@Pc(63) int local63 = arg0 * 3;
		@Pc(73) int local73 = arg4 + local51 - local59 - arg8;
		@Pc(83) int local83 = arg5 + local55 - arg6 - local63;
		@Pc(93) int local93 = local43 + local59 - local51 - local51;
		@Pc(103) int local103 = local47 + local63 - local55 - local55;
		@Pc(108) int local108 = local51 - local43;
		@Pc(113) int local113 = local55 - local47;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(126) int local126 = local115 * local115 >> 12;
			@Pc(132) int local132 = local115 * local126 >> 12;
			@Pc(136) int local136 = local83 * local132;
			@Pc(140) int local140 = local126 * local93;
			@Pc(144) int local144 = local73 * local132;
			@Pc(148) int local148 = local126 * local103;
			@Pc(152) int local152 = local108 * local115;
			@Pc(156) int local156 = local113 * local115;
			@Pc(167) int local167 = (local152 + local144 + local140 >> 12) + arg8;
			@Pc(177) int local177 = arg6 + (local156 + local136 + local148 >> 12);
			TextureOp29SubOp4.method4547(arg1, local177, local37, local167, local39);
			local39 = local167;
			local37 = local177;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg8 == arg2 && arg7 == arg6 && arg4 == arg5) {
			TextureOp29.method3982(arg3, arg4, arg0, arg8, arg6);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(36) int local36 = arg8 * 3;
		@Pc(40) int local40 = arg0 * 3;
		@Pc(42) int local42 = arg8;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(66) int local66 = local46 + arg6 - local54 - arg0;
		@Pc(76) int local76 = local54 + local40 - local46 - local46;
		@Pc(85) int local85 = local50 + arg4 - local58 - arg8;
		@Pc(95) int local95 = local36 + local58 - local50 - local50;
		@Pc(100) int local100 = local46 - local40;
		@Pc(105) int local105 = local50 - local36;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(118) int local118 = local107 * local107 >> 12;
			@Pc(124) int local124 = local107 * local118 >> 12;
			@Pc(128) int local128 = local95 * local118;
			@Pc(132) int local132 = local124 * local85;
			@Pc(136) int local136 = local118 * local76;
			@Pc(140) int local140 = local66 * local124;
			@Pc(144) int local144 = local100 * local107;
			@Pc(156) int local156 = arg0 + (local136 + local140 + local144 >> 12);
			@Pc(160) int local160 = local107 * local105;
			@Pc(172) int local172 = arg8 + (local160 + local132 + local128 >> 12);
			TextureOp29.method3982(arg3, local172, local32, local42, local156);
			local32 = local156;
			local42 = local172;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
	@Override
	public final void method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt4846 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4854 >> 12;
		@Pc(24) int local24 = this.anInt4841 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt4850 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt4849 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt4845 >> 12;
		@Pc(52) int local52 = this.anInt4853 * arg1 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt4842 >> 12;
		method3340(local17, local52, local45, local65, local31, local6, local38, local24, this.anInt5229);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(III)V")
	@Override
	public final void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	@Override
	public final void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
