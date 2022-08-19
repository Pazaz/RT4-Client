package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class QuickChatCatType extends SecondaryNode {

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
	public int[] phraseShortcuts;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
	public int[] subcategories;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "[I")
	public int[] subcategoryShortcuts;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lclient!na;")
	public JagString description;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "[I")
	public int[] phrases;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZB)I")
	public static int method3933(@OriginalArg(1) byte arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public final void method465() {
		@Pc(8) int local8;
		if (this.phrases != null) {
			for (local8 = 0; local8 < this.phrases.length; local8++) {
				this.phrases[local8] |= 0x8000;
			}
		}
		if (this.subcategories != null) {
			for (local8 = 0; local8 < this.subcategories.length; local8++) {
				this.subcategories[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)I")
	public final int getPhraseByShortcut(@OriginalArg(0) int arg0) {
		if (this.phrases == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.phrases.length; local13++) {
			if (arg0 == this.phraseShortcuts[local13]) {
				return this.phrases[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wa;II)V")
	private void decode(@OriginalArg(0) Buffer buffer, @OriginalArg(2) int opcode) {
		if (opcode == 1) {
			this.description = buffer.gjstr();
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (opcode == 2) {
			local28 = buffer.g1();
			this.subcategories = new int[local28];
			this.subcategoryShortcuts = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.subcategories[local38] = buffer.g2();
				this.subcategoryShortcuts[local38] = method3933(buffer.g1b());
			}
		} else if (opcode == 3) {
			local28 = buffer.g1();
			this.phrases = new int[local28];
			this.phraseShortcuts = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.phrases[local38] = buffer.g2();
				this.phraseShortcuts[local38] = method3933(buffer.g1b());
			}
		} else if (opcode == 4) {
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)I")
	public final int getSubcategoryByShortcut(@OriginalArg(1) int arg0) {
		if (this.subcategories == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.subcategories.length; local21++) {
			if (this.subcategoryShortcuts[local21] == arg0) {
				return this.subcategories[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wa;B)V")
	public final void decode(@OriginalArg(0) Buffer buffer) {
		while (true) {
			@Pc(12) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(buffer, opcode);
		}
	}
}
