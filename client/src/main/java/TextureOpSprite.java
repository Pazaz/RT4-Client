import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public class TextureOpSprite extends TextureOp {

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	protected int anInt3239;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
	protected int anInt3240;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "[I")
	protected int[] anIntArray305;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	private int anInt3235 = -1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public TextureOpSprite() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)Z")
	protected final boolean method2573() {
		if (this.anIntArray305 != null) {
			return true;
		} else if (this.anInt3235 < 0) {
			return false;
		} else {
			@Pc(43) SoftwareSprite local43 = Static215.anInt4868 < 0 ? Static164.method3117(Static176.aClass153_76, this.anInt3235) : Static78.method1693(this.anInt3235, Static176.aClass153_76, Static215.anInt4868);
			local43.method311();
			this.anInt3240 = local43.anInt1859;
			this.anInt3239 = local43.anInt1867;
			this.anIntArray305 = local43.anIntArray20;
			return true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I")
	@Override
	public final int method4631() {
		return this.anInt3235;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4638(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass103_41.method3173(arg0);
		if (this.aClass103_41.aBoolean195 && this.method2573()) {
			@Pc(31) int[] local31 = local18[0];
			@Pc(35) int[] local35 = local18[1];
			@Pc(39) int[] local39 = local18[2];
			@Pc(59) int local59 = (this.anInt3240 == Static172.anInt4165 ? arg0 : this.anInt3240 * arg0 / Static172.anInt4165) * this.anInt3239;
			@Pc(65) int local65;
			@Pc(78) int local78;
			if (Static189.anInt4457 == this.anInt3239) {
				for (local65 = 0; local65 < Static189.anInt4457; local65++) {
					local78 = this.anIntArray305[local59++];
					local39[local65] = (local78 & 0xFF) << 4;
					local35[local65] = local78 >> 4 & 0xFF0;
					local31[local65] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static189.anInt4457; local65++) {
					local78 = this.anInt3239 * local65 / Static189.anInt4457;
					@Pc(127) int local127 = this.anIntArray305[local59 + local78];
					local39[local65] = (local127 & 0xFF) << 4;
					local35[local65] = local127 >> 4 & 0xFF0;
					local31[local65] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3235 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V")
	@Override
	public final void method4633() {
		super.method4633();
		this.anIntArray305 = null;
	}
}
