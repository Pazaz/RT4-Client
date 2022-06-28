package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class SpotAnimType {

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	private int modelId;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	private int anInt1748 = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	private int anInt1749 = 0;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	private int resizeXZ = 128;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private int angle = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;B)V")
	public final void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.g1();
			if (local17 == 0) {
				return;
			}
			this.decode(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.modelId = arg0.g2();
		} else if (arg1 == 2) {
			this.seqId = arg0.g2();
		} else if (arg1 == 4) {
			this.resizeXZ = arg0.g2();
		} else if (arg1 == 5) {
			this.resizeY = arg0.g2();
		} else if (arg1 == 6) {
			this.angle = arg0.g2();
		} else if (arg1 == 7) {
			this.anInt1749 = arg0.g1();
		} else if (arg1 == 8) {
			this.anInt1748 = arg0.g1();
		} else if (arg1 == 9) {
			this.aBoolean100 = true;
		} else {
			@Pc(78) int local78;
			@Pc(88) int local88;
			if (arg1 == 40) {
				local78 = arg0.g1();
				this.recolorSource = new short[local78];
				this.recolorDestination = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.recolorSource[local88] = (short) arg0.g2();
					this.recolorDestination[local88] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				local78 = arg0.g1();
				this.retextureSource = new short[local78];
				this.retextureDestination = new short[local78];
				for (local88 = 0; local88 < local78; local88++) {
					this.retextureSource[local88] = (short) arg0.g2();
					this.retextureDestination[local88] = (short) arg0.g2();
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBII)Lclient!ak;")
	public final Model constructModel(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Model local13 = (Model) SpotAnimTypeList.models.get(this.id);
		if (local13 == null) {
			@Pc(28) RawModel local28 = RawModel.create(SpotAnimTypeList.modelsArchive, this.modelId);
			if (local28 == null) {
				return null;
			}
			@Pc(40) int local40;
			if (this.recolorSource != null) {
				for (local40 = 0; local40 < this.recolorSource.length; local40++) {
					local28.recolor(this.recolorSource[local40], this.recolorDestination[local40]);
				}
			}
			if (this.retextureSource != null) {
				for (local40 = 0; local40 < this.retextureSource.length; local40++) {
					local28.retexture(this.retextureSource[local40], this.retextureDestination[local40]);
				}
			}
			local13 = local28.createModel(this.anInt1749 + 64, this.anInt1748 + 850, -30, -50, -30);
			SpotAnimTypeList.models.put(local13, this.id);
		}
		@Pc(118) Model local118;
		if (this.seqId == -1 || arg1 == -1) {
			local118 = local13.method4560(true, true, true);
		} else {
			local118 = SeqTypeList.get(this.seqId).method4219(arg0, arg2, arg1, local13);
		}
		if (this.resizeXZ != 128 || this.resizeY != 128) {
			local118.resize(this.resizeXZ, this.resizeY, this.resizeXZ);
		}
		if (this.angle != 0) {
			if (this.angle == 90) {
				local118.method4563();
			}
			if (this.angle == 180) {
				local118.method4552();
			}
			if (this.angle == 270) {
				local118.method4578();
			}
		}
		return local118;
	}
}
