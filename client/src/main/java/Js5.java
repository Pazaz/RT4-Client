import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Js5 {

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!ii;")
	private Js5Index aClass70_2 = null;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!v;")
	private final Js5ResourceProvider aClass14_1;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
	private final boolean aBoolean297;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!v;ZZ)V")
	public Js5(@OriginalArg(0) Js5ResourceProvider arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aClass14_1 = arg0;
		this.aBoolean296 = arg1;
		this.aBoolean297 = arg2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
	public final boolean method4475() {
		if (!this.method4484()) {
			return false;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass70_2.anIntArray269.length; local22++) {
			@Pc(38) int local38 = this.aClass70_2.anIntArray269[local22];
			if (this.anObjectArray32[local38] == null) {
				this.method4496(local38);
				if (this.anObjectArray32[local38] == null) {
					local20 = false;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	private int method4476(@OriginalArg(0) int arg0) {
		if (this.method4492(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass14_1.method524(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZZ)V")
	public final void method4477(@OriginalArg(1) boolean arg0) {
		if (!this.method4484()) {
			return;
		}
		if (arg0) {
			this.aClass70_2.anIntArray271 = null;
			this.aClass70_2.aClass76_1 = null;
		}
		this.aClass70_2.aClass76Array1 = null;
		this.aClass70_2.anIntArrayArray21 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!na;)I")
	public final int method4478(@OriginalArg(1) JagString arg0) {
		if (this.method4484()) {
			@Pc(15) JagString local15 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass70_2.aClass76_1.method2405(local15.method3154());
			return this.method4476(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
	public final boolean method4479(@OriginalArg(1) int arg0) {
		if (!this.method4492(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method4496(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)I")
	public final int method4480() {
		if (!this.method4484()) {
			throw new IllegalStateException("");
		}
		return this.aClass70_2.anInt2911;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!na;B)I")
	public final int method4482(@OriginalArg(0) JagString arg0) {
		if (this.method4484()) {
			@Pc(16) JagString local16 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass70_2.aClass76_1.method2405(local16.method3154());
			return this.method4492(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
	public final int method4483() {
		return this.method4484() ? this.aClass70_2.anIntArray270.length : -1;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Z")
	private boolean method4484() {
		if (this.aClass70_2 == null) {
			this.aClass70_2 = this.aClass14_1.method521();
			if (this.aClass70_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass70_2.anInt2907][];
			this.anObjectArray32 = new Object[this.aClass70_2.anInt2907];
		}
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!na;Lclient!na;)[B")
	public final byte[] method4485(@OriginalArg(1) JagString arg0, @OriginalArg(2) JagString arg1) {
		if (!this.method4484()) {
			return null;
		}
		@Pc(15) JagString local15 = arg1.toLowerCase();
		@Pc(19) JagString local19 = arg0.toLowerCase();
		@Pc(28) int local28 = this.aClass70_2.aClass76_1.method2405(local15.method3154());
		if (this.method4492(local28)) {
			@Pc(53) int local53 = this.aClass70_2.aClass76Array1[local28].method2405(local19.method3154());
			return this.method4495(local28, local53);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILclient!na;)V")
	public final void method4486(@OriginalArg(1) JagString arg0) {
		if (this.method4484()) {
			@Pc(13) JagString local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass70_2.aClass76_1.method2405(local13.method3154());
			this.method4493(local22);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!na;BLclient!na;)Z")
	public final boolean method4487(@OriginalArg(0) JagString arg0, @OriginalArg(2) JagString arg1) {
		if (!this.method4484()) {
			return false;
		}
		@Pc(17) JagString local17 = arg1.toLowerCase();
		@Pc(21) JagString local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass70_2.aClass76_1.method2405(local17.method3154());
		if (this.method4492(local30)) {
			@Pc(49) int local49 = this.aClass70_2.aClass76Array1[local30].method2405(local21.method3154());
			return this.method4491(local49, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[III)[B")
	public final byte[] method4488(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4501(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method4494(arg0, arg1);
			if (!local30) {
				this.method4496(arg0);
				local30 = this.method4494(arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static138.method2696(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.aBoolean297) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass70_2.anIntArray270[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!na;)Z")
	public final boolean method4489(@OriginalArg(1) JagString arg0) {
		if (this.method4484()) {
			@Pc(14) JagString local14 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass70_2.aClass76_1.method2405(local14.method3154());
			return this.method4479(local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
	public final void method4490(@OriginalArg(1) int arg0) {
		if (this.method4492(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)Z")
	public final boolean method4491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4501(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method4496(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
	private boolean method4492(@OriginalArg(1) int arg0) {
		if (!this.method4484()) {
			return false;
		} else if (arg0 >= 0 && this.aClass70_2.anIntArray270.length > arg0 && this.aClass70_2.anIntArray270[arg0] != 0) {
			return true;
		} else if (Static228.aBoolean248) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)V")
	private void method4493(@OriginalArg(1) int arg0) {
		this.aClass14_1.method522(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ[I)Z")
	private boolean method4494(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method4492(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(25) int[] local25 = this.aClass70_2.anIntArrayArray22[arg0];
			@Pc(31) int local31 = this.aClass70_2.anIntArray272[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass70_2.anIntArray270[arg0]];
			}
			@Pc(48) boolean local48 = true;
			@Pc(53) Object[] local53 = this.anObjectArrayArray1[arg0];
			for (@Pc(55) int local55 = 0; local55 < local31; local55++) {
				@Pc(62) int local62;
				if (local25 == null) {
					local62 = local55;
				} else {
					local62 = local25[local55];
				}
				if (local53[local62] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(114) byte[] local114;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local114 = Static138.method2696(this.anObjectArray32[arg0], false);
			} else {
				local114 = Static138.method2696(this.anObjectArray32[arg0], true);
				@Pc(128) Buffer local128 = new Buffer(local114);
				local128.decryptXtea(arg1, local128.data.length);
			}
			@Pc(140) byte[] local140;
			try {
				local140 = Static162.method3092(local114);
			} catch (@Pc(142) RuntimeException local142) {
				System.out.println("T3 - " + (arg1 != null) + "," + arg0 + "," + local114.length + "," + Static71.method1442(local114, local114.length) + "," + Static71.method1442(local114, local114.length - 2) + "," + this.aClass70_2.anIntArray268[arg0] + "," + this.aClass70_2.anInt2911);
				local140 = new byte[] { 0 };
			}
			if (this.aBoolean296) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(213) int local213;
			if (local31 > 1) {
				local213 = local140.length;
				@Pc(216) int local216 = local213 - 1;
				@Pc(220) int local220 = local140[local216] & 0xFF;
				@Pc(228) int local228 = local216 - local31 * local220 * 4;
				@Pc(233) Buffer local233 = new Buffer(local140);
				local233.offset = local228;
				@Pc(239) int[] local239 = new int[local31];
				@Pc(250) int local250;
				@Pc(252) int local252;
				for (@Pc(241) int local241 = 0; local241 < local220; local241++) {
					local250 = 0;
					for (local252 = 0; local252 < local31; local252++) {
						local250 += local233.g4();
						if (local25 == null) {
						}
						local239[local252] += local250;
					}
				}
				@Pc(282) byte[][] local282 = new byte[local31][];
				for (local250 = 0; local250 < local31; local250++) {
					local282[local250] = new byte[local239[local250]];
					local239[local250] = 0;
				}
				local233.offset = local228;
				local250 = 0;
				@Pc(320) int local320;
				for (local252 = 0; local252 < local220; local252++) {
					local320 = 0;
					for (@Pc(322) int local322 = 0; local322 < local31; local322++) {
						local320 += local233.g4();
						Static289.method2612(local140, local250, local282[local322], local239[local322], local320);
						local250 += local320;
						local239[local322] += local320;
					}
				}
				for (local252 = 0; local252 < local31; local252++) {
					if (local25 == null) {
						local320 = local252;
					} else {
						local320 = local25[local252];
					}
					if (this.aBoolean297) {
						local53[local320] = local282[local252];
					} else {
						local53[local320] = Static33.method869(local282[local252]);
					}
				}
			} else {
				if (local25 == null) {
					local213 = 0;
				} else {
					local213 = local25[0];
				}
				if (this.aBoolean297) {
					local53[local213] = local140;
				} else {
					local53[local213] = Static33.method869(local140);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)[B")
	public final byte[] method4495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4488(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ZI)V")
	private void method4496(@OriginalArg(1) int arg0) {
		if (this.aBoolean296) {
			this.anObjectArray32[arg0] = this.aClass14_1.method525(arg0);
		} else {
			this.anObjectArray32[arg0] = Static33.method869(this.aClass14_1.method525(arg0));
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!na;I)Z")
	public final boolean method4497(@OriginalArg(0) JagString arg0) {
		if (this.method4484()) {
			@Pc(19) JagString local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass70_2.aClass76_1.method2405(local19.method3154());
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)I")
	public final int method4498() {
		if (!this.method4484()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray32.length; local22++) {
			if (this.aClass70_2.anIntArray272[local22] > 0) {
				local18 += 100;
				local20 += this.method4476(local22);
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
	public final void method4499() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArrayArray1.length; local17++) {
				this.anObjectArrayArray1[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)[B")
	public final byte[] method4500(@OriginalArg(0) int arg0) {
		if (!this.method4484()) {
			return null;
		} else if (this.aClass70_2.anIntArray270.length == 1) {
			return this.method4495(0, arg0);
		} else if (!this.method4492(arg0)) {
			return null;
		} else if (this.aClass70_2.anIntArray270[arg0] == 1) {
			return this.method4495(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
	private boolean method4501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4484()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass70_2.anIntArray270.length > arg0 && this.aClass70_2.anIntArray270[arg0] > arg1) {
			return true;
		} else if (Static228.aBoolean248) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)[B")
	public final byte[] method4502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4501(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(34) boolean local34 = this.method4494(arg1, null);
			if (!local34) {
				this.method4496(arg1);
				local34 = this.method4494(arg1, null);
				if (!local34) {
					return null;
				}
			}
		}
		return Static138.method2696(this.anObjectArrayArray1[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[I")
	public final int[] method4503(@OriginalArg(1) int arg0) {
		if (!this.method4492(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass70_2.anIntArrayArray22[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass70_2.anIntArray272[arg0]];
			@Pc(34) int local34 = 0;
			while (local22.length > local34) {
				local22[local34] = local34++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
	public final int method4504(@OriginalArg(0) int arg0) {
		return this.method4492(arg0) ? this.aClass70_2.anIntArray270[arg0] : 0;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(II)Z")
	public final boolean method4506(@OriginalArg(1) int arg0) {
		if (!this.method4484()) {
			return false;
		} else if (this.aClass70_2.anIntArray270.length == 1) {
			return this.method4491(arg0, 0);
		} else if (!this.method4492(arg0)) {
			return false;
		} else if (this.aClass70_2.anIntArray270[arg0] == 1) {
			return this.method4491(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
