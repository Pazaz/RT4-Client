import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Npc extends PathingEntity {

	@OriginalMember(owner = "client!km", name = "rc", descriptor = "Lclient!me;")
	public NpcType aClass96_1;

	@OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		return this.anInt3413;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (this.aClass96_1 == null) {
			return;
		}
		@Pc(29) SeqType local29 = this.anInt3369 != -1 && this.anInt3420 == 0 ? Static36.method941(this.anInt3369) : null;
		@Pc(53) SeqType local53 = this.anInt3366 == -1 || this.anInt3366 == this.method2681().anInt1037 && local29 != null ? null : Static36.method941(this.anInt3366);
		@Pc(74) Model local74 = this.aClass96_1.method2937(this.aClass147Array3, this.anInt3388, this.anInt3407, this.anInt3373, this.anInt3360, this.anInt3425, local53, this.anInt3396, local29);
		if (local74 == null) {
			return;
		}
		this.anInt3413 = local74.method4549();
		@Pc(84) NpcType local84 = this.aClass96_1;
		if (local84.anIntArray357 != null) {
			local84 = local84.method2932();
		}
		@Pc(140) Model local140;
		if (Static209.aBoolean240 && local84.aBoolean180) {
			local140 = Static41.method1043(this.aClass96_1.aByte13, this.aBoolean171, local53 == null ? local29 : local53, this.anInt3412, this.aClass96_1.aShort23, this.anInt3421, this.aClass96_1.aShort24, this.aClass96_1.anInt3713, local74, arg0, local53 == null ? this.anInt3425 : this.anInt3407, this.anInt3424, this.aClass96_1.aByte12);
			if (GlRenderer.enabled) {
				@Pc(144) float local144 = GlRenderer.method4179();
				@Pc(146) float local146 = GlRenderer.method4166();
				GlRenderer.disableDepthMask();
				GlRenderer.method4152(local144, local146 - 150.0F);
				local140.method4546(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass47_Sub1_5);
				GlRenderer.enableDepthMask();
				GlRenderer.method4152(local144, local146);
			} else {
				local140.method4546(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass47_Sub1_5);
			}
		}
		this.method2687(local74);
		this.method2685(local74, arg0);
		local140 = null;
		if (this.anInt3432 != -1 && this.anInt3399 != -1) {
			@Pc(211) SpotAnimType local211 = Static34.method877(this.anInt3432);
			local140 = local211.method1319(this.anInt3418, this.anInt3399, this.anInt3361);
			if (local140 != null) {
				local140.method4575(0, -this.anInt3394, 0);
				if (local211.aBoolean100) {
					if (Static101.anInt2640 != 0) {
						local140.method4574(Static101.anInt2640);
					}
					if (Static102.anInt2680 != 0) {
						local140.method4564(Static102.anInt2680);
					}
					if (Static62.anInt1938 != 0) {
						local140.method4575(0, Static62.anInt1938, 0);
					}
				}
			}
		}
		if (!GlRenderer.enabled) {
			if (local140 != null) {
				local74 = ((SoftwareModel) local74).method4588(local140);
			}
			if (this.aClass96_1.anInt3713 == 1) {
				local74.aBoolean303 = true;
			}
			local74.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_5);
			return;
		}
		if (this.aClass96_1.anInt3713 == 1) {
			local74.aBoolean303 = true;
		}
		local74.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_5);
		if (local140 != null) {
			if (this.aClass96_1.anInt3713 == 1) {
				local140.aBoolean303 = true;
			}
			local140.method4546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_5);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	@Override
	protected final int method2688() {
		if (Static266.game != 0 && this.aClass96_1.anIntArray357 != null) {
			@Pc(17) NpcType local17 = this.aClass96_1.method2932();
			if (local17 != null && local17.anInt3737 != -1) {
				return local17.anInt3737;
			}
		}
		return this.anInt3365;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass96_1 == null) {
			;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method2682() {
		return this.aClass96_1 != null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!me;)V")
	public final void method2698(@OriginalArg(1) NpcType arg0) {
		this.aClass96_1 = arg0;
		if (this.aClass47_Sub1_5 != null) {
			this.aClass47_Sub1_5.method1646();
		}
	}
}
