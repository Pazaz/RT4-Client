import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class TextureOp3 extends TextureOp {

	@OriginalMember(owner = "client!an", name = "R", descriptor = "I")
	private int anInt316 = 4096;

	@OriginalMember(owner = "client!an", name = "bb", descriptor = "Z")
	private boolean aBoolean11 = true;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public TextureOp3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt316 = arg1.g2();
		} else if (arg0 == 1) {
			this.aBoolean11 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195) {
			@Pc(25) int[] local25 = this.method4624(0, Static141.anInt3473 & arg0 - 1);
			@Pc(31) int[] local31 = this.method4624(0, arg0);
			@Pc(41) int[] local41 = this.method4624(0, arg0 + 1 & Static141.anInt3473);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static189.anInt4457; local55++) {
				@Pc(70) int local70 = this.anInt316 * (local41[local55] - local25[local55]);
				@Pc(90) int local90 = this.anInt316 * (local31[local55 + 1 & Static34.anInt1060] - local31[Static34.anInt1060 & local55 - 1]);
				@Pc(94) int local94 = local70 >> 12;
				@Pc(98) int local98 = local90 >> 12;
				@Pc(104) int local104 = local94 * local94 >> 12;
				@Pc(110) int local110 = local98 * local98 >> 12;
				@Pc(124) int local124 = (int) (Math.sqrt((double) ((float) (local110 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131;
				@Pc(133) int local133;
				@Pc(129) int local129;
				if (local124 == 0) {
					local129 = 0;
					local131 = 0;
					local133 = 0;
				} else {
					local129 = 16777216 / local124;
					local133 = local70 / local124;
					local131 = local90 / local124;
				}
				if (this.aBoolean11) {
					local133 = (local133 >> 1) + 2048;
					local129 = (local129 >> 1) + 2048;
					local131 = (local131 >> 1) + 2048;
				}
				local45[local55] = local131;
				local49[local55] = local133;
				local53[local55] = local129;
			}
		}
		return local11;
	}
}
