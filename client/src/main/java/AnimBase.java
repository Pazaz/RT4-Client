import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class AnimBase extends Node {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public final int anInt3113;

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
	public final int anInt3116;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "[I")
	public final int[] anIntArray291;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "[Z")
	public final boolean[] aBooleanArray70;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "[I")
	public final int[] anIntArray290;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I[B)V")
	public AnimBase(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3113 = arg0;
		@Pc(9) Buffer local9 = new Buffer(arg1);
		this.anInt3116 = local9.g1();
		this.anIntArrayArray23 = new int[this.anInt3116][];
		this.anIntArray291 = new int[this.anInt3116];
		this.aBooleanArray70 = new boolean[this.anInt3116];
		this.anIntArray290 = new int[this.anInt3116];
		@Pc(36) int local36;
		for (local36 = 0; local36 < this.anInt3116; local36++) {
			this.anIntArray291[local36] = local9.g1();
		}
		for (local36 = 0; local36 < this.anInt3116; local36++) {
			this.aBooleanArray70[local36] = local9.g1() == 1;
		}
		for (local36 = 0; local36 < this.anInt3116; local36++) {
			this.anIntArray290[local36] = local9.g2();
		}
		for (local36 = 0; local36 < this.anInt3116; local36++) {
			this.anIntArrayArray23[local36] = new int[local9.g1()];
		}
		for (local36 = 0; local36 < this.anInt3116; local36++) {
			for (@Pc(118) int local118 = 0; local118 < this.anIntArrayArray23[local36].length; local118++) {
				this.anIntArrayArray23[local36][local118] = local9.g1();
			}
		}
	}
}
