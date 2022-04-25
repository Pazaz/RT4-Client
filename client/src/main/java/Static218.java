import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "Lclient!na;")
	public static final JagString TAG_GT = JagString.parse("gt");

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "Lclient!na;")
	public static final JagString TAG_LT = JagString.parse("lt");

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "Lclient!na;")
	public static final JagString TAG_SHAD1 = JagString.parse("shad=");

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "Lclient!na;")
	public static final JagString TAB_SHY = JagString.parse("shy");

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "Lclient!na;")
	public static final JagString TAG_TRANS1 = JagString.parse("trans=");

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "Lclient!na;")
	public static final JagString TAG_U1 = JagString.parse("u=");

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lclient!na;")
	public static final JagString TAG_STR1 = JagString.parse("str=");

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "Lclient!na;")
	public static final JagString TAB_EURO = JagString.parse("euro");

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "Lclient!na;")
	public static final JagString TAG_COL2 = JagString.parse(")4col");

	@OriginalMember(owner = "client!rk", name = "X", descriptor = "Lclient!na;")
	public static final JagString TAG_SHAD3 = JagString.parse(")4shad");

	@OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lclient!na;")
	public static final JagString TAG_COL1 = JagString.parse("col=");

	@OriginalMember(owner = "client!rk", name = "Z", descriptor = "Lclient!na;")
	private static final JagString aClass100_706 = JagString.parse("<gt>");

	@OriginalMember(owner = "client!rk", name = "bb", descriptor = "Lclient!na;")
	public static final JagString TAG_U2 = JagString.parse("u");

	@OriginalMember(owner = "client!rk", name = "cb", descriptor = "Lclient!na;")
	public static final JagString TAB_TIMES = JagString.parse("times");

	@OriginalMember(owner = "client!rk", name = "eb", descriptor = "Lclient!na;")
	public static final JagString TAG_TRANS2 = JagString.parse(")4trans");

	@OriginalMember(owner = "client!rk", name = "fb", descriptor = "Lclient!na;")
	public static final JagString TAG_NBSP = JagString.parse("nbsp");

	@OriginalMember(owner = "client!rk", name = "hb", descriptor = "Lclient!na;")
	private static final JagString aClass100_711 = JagString.parse("<lt>");

	@OriginalMember(owner = "client!rk", name = "ib", descriptor = "Lclient!na;")
	public static final JagString TAG_U3 = JagString.parse(")4u");

	@OriginalMember(owner = "client!rk", name = "kb", descriptor = "Lclient!na;")
	public static final JagString TAG_BR = JagString.parse("br");

	@OriginalMember(owner = "client!rk", name = "lb", descriptor = "Lclient!na;")
	public static final JagString TAG_SHAD2 = JagString.parse("shad");

	@OriginalMember(owner = "client!rk", name = "mb", descriptor = "Lclient!na;")
	public static final JagString TAG_IMG = JagString.parse("img=");

	@OriginalMember(owner = "client!rk", name = "ob", descriptor = "Lclient!na;")
	public static final JagString TAB_COPY = JagString.parse("copy");

	@OriginalMember(owner = "client!rk", name = "pb", descriptor = "Lclient!na;")
	public static final JagString TAG_STR3 = JagString.parse(")4str");

	@OriginalMember(owner = "client!rk", name = "qb", descriptor = "Lclient!na;")
	public static final JagString TAG_REG = JagString.parse("reg");

	@OriginalMember(owner = "client!rk", name = "rb", descriptor = "Lclient!na;")
	public static final JagString TAG_STR2 = JagString.parse("str");

	@OriginalMember(owner = "client!rk", name = "sb", descriptor = "Lclient!na;")
	public static final JagString buffer = Static87.allocate(100);

	@OriginalMember(owner = "client!rk", name = "tb", descriptor = "I")
	public static int strikethroughColor = -1;

	@OriginalMember(owner = "client!rk", name = "ub", descriptor = "I")
	public static int underlineColor = -1;

	@OriginalMember(owner = "client!rk", name = "vb", descriptor = "I")
	public static int anInt3629 = 0;

	@OriginalMember(owner = "client!rk", name = "wb", descriptor = "I")
	public static int color = 0;

	@OriginalMember(owner = "client!rk", name = "xb", descriptor = "I")
	public static int alphaOverride = 256;

	@OriginalMember(owner = "client!rk", name = "yb", descriptor = "I")
	public static int alpha = 256;

	@OriginalMember(owner = "client!rk", name = "zb", descriptor = "I")
	public static int shadowColor = -1;

	@OriginalMember(owner = "client!rk", name = "Ab", descriptor = "[Lclient!na;")
	public static final JagString[] lines = new JagString[100];

	@OriginalMember(owner = "client!rk", name = "Bb", descriptor = "I")
	public static int shadowColorOverride = -1;

	@OriginalMember(owner = "client!rk", name = "Cb", descriptor = "I")
	public static int colorOverride = 0;

	@OriginalMember(owner = "client!rk", name = "Db", descriptor = "I")
	public static int spaceWidth = 0;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(Lclient!na;)Lclient!na;")
	public static JagString escape(@OriginalArg(0) JagString arg0) {
		@Pc(3) int local3 = arg0.length();
		@Pc(5) int local5 = 0;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			local15 = arg0.charAt(local7);
			if (local15 == 60 || local15 == 62) {
				local5 += 3;
			}
		}
		@Pc(30) JagString local30 = Static87.allocate(local3 + local5);
		for (local15 = 0; local15 < local3; local15++) {
			@Pc(40) int local40 = arg0.charAt(local15);
			if (local40 == 60) {
				local30.method3113(aClass100_711);
			} else if (local40 == 62) {
				local30.method3113(aClass100_706);
			} else {
				local30.append(local40);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2870(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(77) int local77 = local50[local58++] + local54[local62++];
			if (local77 < local37) {
				local37 = local77;
			}
		}
		return -local37;
	}
}
