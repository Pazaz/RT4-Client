import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class SoftwareFont extends Font {

	@OriginalMember(owner = "client!dd", name = "Eb", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V")
	public SoftwareFont(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public SoftwareFont(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray7 = arg5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected final void method2855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static129.anInt3144;
		@Pc(9) int local9 = Static129.anInt3144 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static129.anInt3147) {
			local20 = Static129.anInt3147 - arg2;
			arg4 -= local20;
			arg2 = Static129.anInt3147;
			local13 = local20 * arg3;
			local5 += local20 * Static129.anInt3144;
		}
		if (arg2 + arg4 > Static129.anInt3149) {
			arg4 -= arg2 + arg4 - Static129.anInt3149;
		}
		if (arg1 < Static129.anInt3145) {
			local20 = Static129.anInt3145 - arg1;
			arg3 -= local20;
			arg1 = Static129.anInt3145;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static129.anInt3148) {
			local20 = arg1 + arg3 - Static129.anInt3148;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static285.method1139(Static129.anIntArray297, this.aByteArrayArray7[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected final void method2854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static129.anInt3144;
		@Pc(9) int local9 = Static129.anInt3144 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static129.anInt3147) {
			local20 = Static129.anInt3147 - arg2;
			arg4 -= local20;
			arg2 = Static129.anInt3147;
			local13 = local20 * arg3;
			local5 += local20 * Static129.anInt3144;
		}
		if (arg2 + arg4 > Static129.anInt3149) {
			arg4 -= arg2 + arg4 - Static129.anInt3149;
		}
		if (arg1 < Static129.anInt3145) {
			local20 = Static129.anInt3145 - arg1;
			arg3 -= local20;
			arg1 = Static129.anInt3145;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static129.anInt3148) {
			local20 = arg1 + arg3 - Static129.anInt3148;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static129.anIntArray295 == null) {
			Static285.method1137(Static129.anIntArray297, this.aByteArrayArray7[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static285.method1138(Static129.anIntArray297, this.aByteArrayArray7[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static129.anIntArray295, Static129.anIntArray296);
		}
	}
}
