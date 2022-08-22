package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class SpotAnimType {

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	private int modelId;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	private int resizeY = 128;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	private int resizeXZ = 128;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private int angle = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;B)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(17) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int opcode) {
		if (opcode == 1) {
			this.modelId = buffer.g2();
		} else if (opcode == 2) {
			this.seqId = buffer.g2();
		} else if (opcode == 4) {
			this.resizeXZ = buffer.g2();
		} else if (opcode == 5) {
			this.resizeY = buffer.g2();
		} else if (opcode == 6) {
			this.angle = buffer.g2();
		} else if (opcode == 7) {
			this.ambient = buffer.g1();
		} else if (opcode == 8) {
			this.contrast = buffer.g1();
		} else if (opcode == 9) {
			this.aBoolean100 = true;
		} else {
			@Pc(78) int size;
			@Pc(88) int count;
			if (opcode == 40) {
				size = buffer.g1();
				this.recol_s = new short[size];
				this.recol_d = new short[size];
				for (count = 0; count < size; count++) {
					this.recol_s[count] = (short) buffer.g2();
					this.recol_d[count] = (short) buffer.g2();
				}
			} else if (opcode == 41) {
				size = buffer.g1();
				this.retex_s = new short[size];
				this.retex_d = new short[size];
				for (count = 0; count < size; count++) {
					this.retex_s[count] = (short) buffer.g2();
					this.retex_d[count] = (short) buffer.g2();
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
			if (this.recol_s != null) {
				for (local40 = 0; local40 < this.recol_s.length; local40++) {
					local28.recolor(this.recol_s[local40], this.recol_d[local40]);
				}
			}
			if (this.retex_s != null) {
				for (local40 = 0; local40 < this.retex_s.length; local40++) {
					local28.retexture(this.retex_s[local40], this.retex_d[local40]);
				}
			}
			local13 = local28.createModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
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
				local118.rotateCounterClockwise();
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
