import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
	private int anInt4543 = 6;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub27() {
		super(2, false);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I")
	@Override
	public final int[] method4626(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass121_41.method3445(arg0);
		if (this.aClass121_41.aBoolean221) {
			@Pc(22) int[] local22 = this.method4624(0, arg0);
			@Pc(28) int[] local28 = this.method4624(1, arg0);
			@Pc(31) int local31 = this.anInt4543;
			if (local31 == 1) {
				for (local31 = 0; local31 < Static189.anInt4457; local31++) {
					local11[local31] = local28[local31] + local22[local31];
				}
			} else if (local31 == 2) {
				for (local31 = 0; local31 < Static189.anInt4457; local31++) {
					local11[local31] = local22[local31] - local28[local31];
				}
			} else if (local31 == 3) {
				for (local31 = 0; local31 < Static189.anInt4457; local31++) {
					local11[local31] = local28[local31] * local22[local31] >> 12;
				}
			} else {
				@Pc(180) int local180;
				if (local31 == 4) {
					for (local31 = 0; local31 < Static189.anInt4457; local31++) {
						local180 = local28[local31];
						local11[local31] = local180 == 0 ? 4096 : (local22[local31] << 12) / local180;
					}
				} else if (local31 == 5) {
					for (local31 = 0; local31 < Static189.anInt4457; local31++) {
						local11[local31] = 4096 - ((4096 - local22[local31]) * (-local28[local31] + 4096) >> 12);
					}
				} else if (local31 == 6) {
					for (local31 = 0; local31 < Static189.anInt4457; local31++) {
						local180 = local28[local31];
						local11[local31] = local180 >= 2048 ? 4096 - ((4096 - local22[local31]) * (-local180 + 4096) >> 11) : local180 * local22[local31] >> 11;
					}
				} else {
					@Pc(295) int local295;
					if (local31 == 7) {
						for (local31 = 0; local31 < Static189.anInt4457; local31++) {
							local295 = local22[local31];
							local11[local31] = local295 == 4096 ? 4096 : (local28[local31] << 12) / (4096 - local295);
						}
					} else if (local31 == 8) {
						for (local31 = 0; local31 < Static189.anInt4457; local31++) {
							local295 = local22[local31];
							local11[local31] = local295 == 0 ? 0 : 4096 - (4096 - local28[local31] << 12) / local295;
						}
					} else if (local31 == 9) {
						for (local31 = 0; local31 < Static189.anInt4457; local31++) {
							local180 = local28[local31];
							local295 = local22[local31];
							local11[local31] = local295 < local180 ? local295 : local180;
						}
					} else if (local31 == 10) {
						for (local31 = 0; local31 < Static189.anInt4457; local31++) {
							local180 = local28[local31];
							local295 = local22[local31];
							local11[local31] = local295 > local180 ? local295 : local180;
						}
					} else if (local31 == 11) {
						for (local31 = 0; local31 < Static189.anInt4457; local31++) {
							local295 = local22[local31];
							local180 = local28[local31];
							local11[local31] = local180 < local295 ? local295 - local180 : local180 - local295;
						}
					} else if (local31 == 12) {
						for (local31 = 0; local31 < Static189.anInt4457; local31++) {
							local295 = local22[local31];
							local180 = local28[local31];
							local11[local31] = local180 + local295 - (local295 * local180 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195) {
			@Pc(30) int[][] local30 = this.method4634(arg0, 0);
			@Pc(36) int[][] local36 = this.method4634(arg0, 1);
			@Pc(40) int[] local40 = local20[0];
			@Pc(44) int[] local44 = local20[1];
			@Pc(48) int[] local48 = local20[2];
			@Pc(52) int[] local52 = local30[0];
			@Pc(56) int[] local56 = local30[1];
			@Pc(60) int[] local60 = local30[2];
			@Pc(64) int[] local64 = local36[0];
			@Pc(68) int[] local68 = local36[1];
			@Pc(72) int[] local72 = local36[2];
			@Pc(75) int local75 = this.anInt4543;
			if (local75 == 1) {
				for (local75 = 0; local75 < Static189.anInt4457; local75++) {
					local40[local75] = local64[local75] + local52[local75];
					local44[local75] = local68[local75] + local56[local75];
					local48[local75] = local60[local75] + local72[local75];
				}
			} else if (local75 == 2) {
				for (local75 = 0; local75 < Static189.anInt4457; local75++) {
					local40[local75] = local52[local75] - local64[local75];
					local44[local75] = local56[local75] - local68[local75];
					local48[local75] = local60[local75] - local72[local75];
				}
			} else if (local75 == 3) {
				for (local75 = 0; local75 < Static189.anInt4457; local75++) {
					local40[local75] = local64[local75] * local52[local75] >> 12;
					local44[local75] = local56[local75] * local68[local75] >> 12;
					local48[local75] = local72[local75] * local60[local75] >> 12;
				}
			} else {
				@Pc(286) int local286;
				@Pc(282) int local282;
				@Pc(278) int local278;
				if (local75 == 4) {
					for (local75 = 0; local75 < Static189.anInt4457; local75++) {
						local278 = local72[local75];
						local282 = local68[local75];
						local286 = local64[local75];
						local40[local75] = local286 == 0 ? 4096 : (local52[local75] << 12) / local286;
						local44[local75] = local282 == 0 ? 4096 : (local56[local75] << 12) / local282;
						local48[local75] = local278 == 0 ? 4096 : (local60[local75] << 12) / local278;
					}
				} else if (local75 == 5) {
					for (local75 = 0; local75 < Static189.anInt4457; local75++) {
						local40[local75] = 4096 - ((4096 - local64[local75]) * (4096 - local52[local75]) >> 12);
						local44[local75] = 4096 - ((4096 - local68[local75]) * (-local56[local75] + 4096) >> 12);
						local48[local75] = 4096 - ((4096 - local72[local75]) * (-local60[local75] + 4096) >> 12);
					}
				} else if (local75 == 6) {
					for (local75 = 0; local75 < Static189.anInt4457; local75++) {
						local278 = local72[local75];
						local286 = local64[local75];
						local282 = local68[local75];
						local40[local75] = local286 >= 2048 ? 4096 - ((4096 - local286) * (-local52[local75] + 4096) >> 11) : local286 * local52[local75] >> 11;
						local44[local75] = local282 < 2048 ? local282 * local56[local75] >> 11 : 4096 - ((4096 - local282) * (-local56[local75] + 4096) >> 11);
						local48[local75] = local278 >= 2048 ? 4096 - ((4096 - local278) * (-local60[local75] + 4096) >> 11) : local60[local75] * local278 >> 11;
					}
				} else {
					@Pc(539) int local539;
					@Pc(543) int local543;
					@Pc(535) int local535;
					if (local75 == 7) {
						for (local75 = 0; local75 < Static189.anInt4457; local75++) {
							local535 = local60[local75];
							local539 = local52[local75];
							local543 = local56[local75];
							local40[local75] = local539 == 4096 ? 4096 : (local64[local75] << 12) / (4096 - local539);
							local44[local75] = local543 == 4096 ? 4096 : (local68[local75] << 12) / (4096 - local543);
							local48[local75] = local535 == 4096 ? 4096 : (local72[local75] << 12) / (4096 - local535);
						}
					} else if (local75 == 8) {
						for (local75 = 0; local75 < Static189.anInt4457; local75++) {
							local539 = local52[local75];
							local543 = local56[local75];
							local535 = local60[local75];
							local40[local75] = local539 == 0 ? 0 : 4096 - (4096 - local64[local75] << 12) / local539;
							local44[local75] = local543 == 0 ? 0 : 4096 - (4096 - local68[local75] << 12) / local543;
							local48[local75] = local535 == 0 ? 0 : 4096 - (4096 - local72[local75] << 12) / local535;
						}
					} else if (local75 == 9) {
						for (local75 = 0; local75 < Static189.anInt4457; local75++) {
							local535 = local60[local75];
							local278 = local72[local75];
							local282 = local68[local75];
							local543 = local56[local75];
							local286 = local64[local75];
							local539 = local52[local75];
							local40[local75] = local539 >= local286 ? local286 : local539;
							local44[local75] = local543 >= local282 ? local282 : local543;
							local48[local75] = local535 < local278 ? local535 : local278;
						}
					} else if (local75 == 10) {
						for (local75 = 0; local75 < Static189.anInt4457; local75++) {
							local278 = local72[local75];
							local535 = local60[local75];
							local282 = local68[local75];
							local539 = local52[local75];
							local543 = local56[local75];
							local286 = local64[local75];
							local40[local75] = local286 < local539 ? local539 : local286;
							local44[local75] = local543 > local282 ? local543 : local282;
							local48[local75] = local278 < local535 ? local535 : local278;
						}
					} else if (local75 == 11) {
						for (local75 = 0; local75 < Static189.anInt4457; local75++) {
							local282 = local68[local75];
							local286 = local64[local75];
							local543 = local56[local75];
							local539 = local52[local75];
							local535 = local60[local75];
							local278 = local72[local75];
							local40[local75] = local539 > local286 ? local539 - local286 : -local539 + local286;
							local44[local75] = local543 > local282 ? local543 - local282 : -local543 + local282;
							local48[local75] = local278 < local535 ? local535 - local278 : -local535 + local278;
						}
					} else if (local75 == 12) {
						for (local75 = 0; local75 < Static189.anInt4457; local75++) {
							local539 = local52[local75];
							local278 = local72[local75];
							local286 = local64[local75];
							local282 = local68[local75];
							local535 = local60[local75];
							local543 = local56[local75];
							local40[local75] = local286 + local539 - (local286 * local539 >> 11);
							local44[local75] = local282 + local543 - (local543 * local282 >> 11);
							local48[local75] = local278 + local535 - (local535 * local278 >> 11);
						}
					}
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4543 = arg1.method2229();
		} else if (arg0 == 1) {
			this.aBoolean309 = arg1.method2229() == 1;
		}
	}
}