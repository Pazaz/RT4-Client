package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class QuickChatPhrase {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!cb;")
	public QuickChatPhraseType type;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
	public int[] values;
}
