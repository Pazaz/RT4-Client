import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class IdkType {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "[S")
	private short[] recolorDestination;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "[S")
	private short[] recolorSource;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "[S")
	private short[] retextureDestination;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "[S")
	private short[] retextureSource;

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "[I")
	private int[] bodyModels;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "[I")
	private final int[] headModels = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	public int feature = -1;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "Z")
	public boolean aBoolean85 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Lclient!gb;")
	public final RawModel getHeadModel() {
		@Pc(13) int local13 = 0;
		@Pc(16) RawModel[] local16 = new RawModel[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.headModels[local18] != -1) {
				local16[local13++] = Static77.create(IdkTypeList.modelsArchive, this.headModels[local18]);
			}
		}
		@Pc(52) RawModel local52 = new RawModel(local16, local13);
		@Pc(58) int local58;
		if (this.recolorSource != null) {
			for (local58 = 0; local58 < this.recolorSource.length; local58++) {
				local52.recolor(this.recolorSource[local58], this.recolorDestination[local58]);
			}
		}
		if (this.retextureSource != null) {
			for (local58 = 0; local58 < this.retextureSource.length; local58++) {
				local52.retexture(this.retextureSource[local58], this.retextureDestination[local58]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
	public final boolean isBodyModelReady() {
		if (this.bodyModels == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.bodyModels.length; local22++) {
			if (!IdkTypeList.modelsArchive.isFileReady(0, this.bodyModels[local22])) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!wa;I)V")
	private void decode(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.feature = arg0.g1();
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.g1();
			this.bodyModels = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.bodyModels[local28] = arg0.g2();
			}
		} else if (arg1 == 3) {
			this.aBoolean85 = true;
		} else if (arg1 == 40) {
			local22 = arg0.g1();
			this.recolorDestination = new short[local22];
			this.recolorSource = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.recolorSource[local28] = (short) arg0.g2();
				this.recolorDestination[local28] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			local22 = arg0.g1();
			this.retextureSource = new short[local22];
			this.retextureDestination = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.retextureSource[local28] = (short) arg0.g2();
				this.retextureDestination[local28] = (short) arg0.g2();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.headModels[arg1 - 60] = arg0.g2();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Lclient!gb;")
	public final RawModel getBodyModel() {
		if (this.bodyModels == null) {
			return null;
		}
		@Pc(16) RawModel[] local16 = new RawModel[this.bodyModels.length];
		for (@Pc(18) int local18 = 0; local18 < this.bodyModels.length; local18++) {
			local16[local18] = Static77.create(IdkTypeList.modelsArchive, this.bodyModels[local18]);
		}
		@Pc(56) RawModel local56;
		if (local16.length == 1) {
			local56 = local16[0];
		} else {
			local56 = new RawModel(local16, local16.length);
		}
		@Pc(70) int local70;
		if (this.recolorSource != null) {
			for (local70 = 0; local70 < this.recolorSource.length; local70++) {
				local56.recolor(this.recolorSource[local70], this.recolorDestination[local70]);
			}
		}
		if (this.retextureSource != null) {
			for (local70 = 0; local70 < this.retextureSource.length; local70++) {
				local56.retexture(this.retextureSource[local70], this.retextureDestination[local70]);
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)Z")
	public final boolean isHeadModelReady() {
		@Pc(3) boolean local3 = true;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.headModels[local12] != -1 && !IdkTypeList.modelsArchive.isFileReady(0, this.headModels[local12])) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.g1();
			if (local13 == 0) {
				return;
			}
			this.decode(arg0, local13);
		}
	}
}
