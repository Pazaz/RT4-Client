package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class QuickChatPhraseType extends SecondaryNode {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
	public static final int[] DYNAMIC_COMMAND_ENCODE_BYTES = new int[]{2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0};
	@OriginalMember(owner = "client!rc", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_231 = JagString.parse(")3)3)3");
	@OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
	public static final int[] anIntArray51 = new int[]{2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1};
	@OriginalMember(owner = "client!qg", name = "U", descriptor = "Lclient!na;")
	public static final JagString aClass100_891 = JagString.parse("");
	@OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
	public static final int[] anIntArray412 = new int[]{1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0};
	@OriginalMember(owner = "client!cb", name = "L", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "[I")
	public int[] automaticResponses;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[Lclient!na;")
	private JagString[] aClass100Array35;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "Z")
	public boolean aBoolean60 = true;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!wa;)Lclient!bd;")
	public static QuickChatPhrase method3568(@OriginalArg(1) Buffer arg0) {
		@Pc(3) QuickChatPhrase local3 = new QuickChatPhrase();
		local3.id = arg0.g2();
		local3.type = QuickChatPhraseTypeList.get(local3.id);
		return local3;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wa;[IZ)V")
	public final void encodeMessage(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray71 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; this.anIntArray71.length > local14 && local14 < arg1.length; local14++) {
			@Pc(38) int local38 = DYNAMIC_COMMAND_ENCODE_BYTES[this.getDynamicCommand(local14)];
			if (local38 > 0) {
				arg0.pVarLong(local38, arg1[local14]);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wa;I)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(9) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	public final void method763() {
		if (this.automaticResponses != null) {
			for (@Pc(7) int local7 = 0; local7 < this.automaticResponses.length; local7++) {
				this.automaticResponses[local7] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
	public final int getDynamicCommandParam(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray71 == null || arg1 < 0 || arg1 > this.anIntArray71.length) {
			return -1;
		} else if (this.anIntArrayArray5[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray5[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray5[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)I")
	public final int getDynamicCommand(@OriginalArg(1) int arg0) {
		return this.anIntArray71 == null || arg0 < 0 || arg0 > this.anIntArray71.length ? -1 : this.anIntArray71[arg0];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I")
	public final int getDynamicCommandCount() {
		return this.anIntArray71 == null ? 0 : this.anIntArray71.length;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(1) int opcode) {
		if (opcode == 1) {
			this.aClass100Array35 = buffer.gjstr().split(60);
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (opcode == 2) {
			local32 = buffer.g1();
			this.automaticResponses = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.automaticResponses[local42] = buffer.g2();
			}
		} else if (opcode == 3) {
			local32 = buffer.g1();
			this.anIntArray71 = new int[local32];
			this.anIntArrayArray5 = new int[local32][];
			for (local42 = 0; local42 < local32; local42++) {
				@Pc(49) int local49 = buffer.g2();
				this.anIntArray71[local42] = local49;
				this.anIntArrayArray5[local42] = new int[anIntArray412[local49]];
				for (@Pc(64) int local64 = 0; local64 < anIntArray412[local49]; local64++) {
					this.anIntArrayArray5[local42][local64] = buffer.g2();
				}
			}
		} else if (opcode == 4) {
			this.aBoolean60 = false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Lclient!na;")
	public final JagString getText() {
		@Pc(15) JagString local15 = JagString.allocate(80);
		if (this.aClass100Array35 == null) {
			return aClass100_891;
		}
		local15.method3113(this.aClass100Array35[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aClass100Array35.length; local31++) {
			local15.method3113(aClass100_231);
			local15.method3113(this.aClass100Array35[local31]);
		}
		return local15.method3156();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!wa;)Lclient!na;")
	public final JagString decodeMessage(@OriginalArg(1) Buffer arg0) {
		@Pc(17) JagString local17 = JagString.allocate(80);
		if (this.anIntArray71 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray71.length; local22++) {
				local17.method3113(this.aClass100Array35[local22]);
				local17.method3113(QuickChatPhraseTypeList.method1838(this.anIntArrayArray5[local22], arg0.gVarLong(anIntArray51[this.anIntArray71[local22]]), this.anIntArray71[local22]));
			}
		}
		local17.method3113(this.aClass100Array35[this.aClass100Array35.length - 1]);
		return local17.method3156();
	}
}
