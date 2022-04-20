import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class FluType {

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public int anInt4149;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public int anInt4154;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	public int anInt4158;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	public int anInt4161;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	private int anInt4147 = 0;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public int anInt4155 = -1;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public int anInt4156 = 128;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
	public boolean aBoolean198 = true;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
	private void method3216(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local8;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		if (local21 < local8) {
			local23 = local21;
		}
		if (local30 < local23) {
			local23 = local30;
		}
		@Pc(44) double local44 = local8;
		@Pc(54) double local54 = 0.0D;
		if (local21 > local8) {
			local44 = local21;
		}
		if (local30 > local44) {
			local44 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local44 + local23) / 2.0D;
		if (local23 != local44) {
			if (local74 < 0.5D) {
				local68 = (local44 - local23) / (local44 + local23);
			}
			if (local44 == local8) {
				local54 = (local21 - local30) / (-local23 + local44);
			} else if (local21 == local44) {
				local54 = (local30 - local8) / (local44 - local23) + 2.0D;
			} else if (local30 == local44) {
				local54 = (local8 - local21) / (-local23 + local44) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local44 - local23) / ((2.0D - local44) - local23);
			}
		}
		if (local74 > 0.5D) {
			this.anInt4161 = (int) (local68 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt4161 = (int) (local68 * local74 * 512.0D);
		}
		if (this.anInt4161 < 1) {
			this.anInt4161 = 1;
		}
		this.anInt4149 = (int) (local68 * 256.0D);
		this.anInt4158 = (int) (local74 * 256.0D);
		if (this.anInt4158 < 0) {
			this.anInt4158 = 0;
		} else if (this.anInt4158 > 255) {
			this.anInt4158 = 255;
		}
		local54 /= 6.0D;
		this.anInt4154 = (int) ((double) this.anInt4161 * local54);
		if (this.anInt4149 < 0) {
			this.anInt4149 = 0;
		} else if (this.anInt4149 > 255) {
			this.anInt4149 = 255;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!wa;I)V")
	public final void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.g1();
			if (local7 == 0) {
				return;
			}
			this.method3220(local7, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILclient!wa;I)V")
	private void method3220(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4147 = arg1.g3();
			this.method3216(this.anInt4147);
		} else if (arg0 == 2) {
			this.anInt4155 = arg1.g2();
			if (this.anInt4155 == 65535) {
				this.anInt4155 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4156 = arg1.g2();
		} else if (arg0 == 4) {
			this.aBoolean198 = false;
		}
	}
}
