import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class TextureOp29 extends TextureOp {

	@OriginalMember(owner = "client!si", name = "U", descriptor = "[Lclient!kf;")
	private TextureOp29SubOp[] aClass18Array1;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public TextureOp29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			this.method3934(this.aClass121_41.method3446());
		}
		return local13;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I[[I)V")
	private void method3934(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static172.anInt4165;
		@Pc(9) int local9 = Static189.anInt4457;
		Static81.method1751(arg0);
		Static107.method2263(Static141.anInt3473, Static34.anInt1060);
		if (this.aClass18Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass18Array1.length; local23++) {
			@Pc(33) TextureOp29SubOp local33 = this.aClass18Array1[local23];
			@Pc(36) int local36 = local33.anInt5228;
			@Pc(39) int local39 = local33.anInt5229;
			if (local36 >= 0) {
				if (local39 < 0) {
					local33.method4013(local9, local7);
				} else {
					local33.method4007(local7, local9);
				}
			} else if (local39 >= 0) {
				local33.method4009(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aClass18Array1 = new TextureOp29SubOp[arg1.g1()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass18Array1.length; local11++) {
				@Pc(24) int local24 = arg1.g1();
				if (local24 == 0) {
					this.aClass18Array1[local11] = Static9.method184(arg1);
				} else if (local24 == 1) {
					this.aClass18Array1[local11] = Static21.method620(arg1);
				} else if (local24 == 2) {
					this.aClass18Array1[local11] = Static156.method2960(arg1);
				} else if (local24 == 3) {
					this.aClass18Array1[local11] = Static137.method2664(arg1);
				}
			}
		} else if (arg0 == 1) {
			this.aBoolean309 = arg1.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(14) int[][] local14 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195) {
			@Pc(20) int local20 = Static189.anInt4457;
			@Pc(22) int local22 = Static172.anInt4165;
			@Pc(26) int[][] local26 = new int[local22][local20];
			@Pc(31) int[][][] local31 = this.aClass103_41.method3168();
			this.method3934(local26);
			for (@Pc(37) int local37 = 0; local37 < Static172.anInt4165; local37++) {
				@Pc(44) int[] local44 = local26[local37];
				@Pc(48) int[][] local48 = local31[local37];
				@Pc(52) int[] local52 = local48[0];
				@Pc(56) int[] local56 = local48[1];
				@Pc(60) int[] local60 = local48[2];
				for (@Pc(62) int local62 = 0; local62 < Static189.anInt4457; local62++) {
					@Pc(73) int local73 = local44[local62];
					local60[local62] = (local73 & 0xFF) << 4;
					local56[local62] = local73 >> 4 & 0xFF0;
					local52[local62] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local14;
	}
}
