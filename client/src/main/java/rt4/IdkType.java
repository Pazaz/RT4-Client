package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class IdkType {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "[I")
	private int[] model;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "[I")
	private final int[] head = new int[]{-1, -1, -1, -1, -1};

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	public int feature = -1;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "Z")
	public boolean disable = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Lclient!gb;")
	public RawModel getHeadModel() {
		@Pc(13) int modelCount = 0;
		@Pc(16) RawModel[] models = new RawModel[5];
		for (@Pc(18) int i = 0; i < 5; i++) {
			if (this.head[i] != -1) {
				models[modelCount++] = RawModel.create(IdkTypeList.modelsArchive, this.head[i]);
			}
		}
		@Pc(52) RawModel model = new RawModel(models, modelCount);
		@Pc(58) int i;
		if (this.recol_s != null) {
			for (i = 0; i < this.recol_s.length; i++) {
				model.recolor(this.recol_s[i], this.recol_d[i]);
			}
		}
		if (this.retex_s != null) {
			for (i = 0; i < this.retex_s.length; i++) {
				model.retexture(this.retex_s[i], this.retex_d[i]);
			}
		}
		return model;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
	public boolean isBodyModelReady() {
		if (this.model == null) {
			return true;
		}
		@Pc(13) boolean ready = true;
		for (@Pc(22) int i = 0; i < this.model.length; i++) {
			if (!IdkTypeList.modelsArchive.isFileReady(0, this.model[i])) {
				ready = false;
			}
		}
		return ready;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!wa;I)V")
	private void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.feature = buffer.g1();
			return;
		}

		@Pc(22) int count;
		@Pc(28) int i;
		if (opcode == 2) {
			count = buffer.g1();
			this.model = new int[count];
			for (i = 0; i < count; i++) {
				this.model[i] = buffer.g2();
			}
		} else if (opcode == 3) {
			this.disable = true;
		} else if (opcode == 40) {
			count = buffer.g1();
			this.recol_d = new short[count];
			this.recol_s = new short[count];
			for (i = 0; i < count; i++) {
				this.recol_s[i] = (short) buffer.g2();
				this.recol_d[i] = (short) buffer.g2();
			}
		} else if (opcode == 41) {
			count = buffer.g1();
			this.retex_s = new short[count];
			this.retex_d = new short[count];
			for (i = 0; i < count; i++) {
				this.retex_s[i] = (short) buffer.g2();
				this.retex_d[i] = (short) buffer.g2();
			}
		} else if (opcode >= 60 && opcode < 70) {
			this.head[opcode - 60] = buffer.g2();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lclient!gb;")
	public RawModel getBodyModel() {
		if (this.model == null) {
			return null;
		}
		@Pc(16) RawModel[] models = new RawModel[this.model.length];
		for (@Pc(18) int i = 0; i < this.model.length; i++) {
			models[i] = RawModel.create(IdkTypeList.modelsArchive, this.model[i]);
		}
		@Pc(56) RawModel model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new RawModel(models, models.length);
		}
		@Pc(70) int i;
		if (this.recol_s != null) {
			for (i = 0; i < this.recol_s.length; i++) {
				model.recolor(this.recol_s[i], this.recol_d[i]);
			}
		}
		if (this.retex_s != null) {
			for (i = 0; i < this.retex_s.length; i++) {
				model.retexture(this.retex_s[i], this.retex_d[i]);
			}
		}
		return model;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)Z")
	public boolean isHeadModelReady() {
		@Pc(3) boolean ready = true;
		for (@Pc(12) int i = 0; i < 5; i++) {
			if (this.head[i] != -1 && !IdkTypeList.modelsArchive.isFileReady(0, this.head[i])) {
				ready = false;
			}
		}
		return ready;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!wa;)V")
	public void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(13) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}
}
