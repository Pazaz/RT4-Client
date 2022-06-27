package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class TextureOpColorFill extends TextureOp {

	@OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
	private int red;

	@OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
	private int green;

	@OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
	private int blue;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V")
	private TextureOpColorFill(@OriginalArg(0) int arg0) {
		super(0, false);
		this.setColor(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public TextureOpColorFill() {
		this(0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)V")
	private void setColor(@OriginalArg(1) int arg0) {
		this.green = arg0 >> 4 & 0xFF0;
		this.blue = (arg0 & 0xFF) << 4;
		this.red = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[[I")
	@Override
	public final int[][] getColorOutput(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = this.colorImageCache.get(arg0);
		if (this.colorImageCache.invalid) {
			@Pc(31) int[] local31 = local22[0];
			@Pc(35) int[] local35 = local22[1];
			@Pc(39) int[] local39 = local22[2];
			for (@Pc(41) int local41 = 0; local41 < Texture.width; local41++) {
				local31[local41] = this.red;
				local35[local41] = this.green;
				local39[local41] = this.blue;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!wa;Z)V")
	@Override
	public final void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.setColor(arg1.g3());
		}
	}
}
