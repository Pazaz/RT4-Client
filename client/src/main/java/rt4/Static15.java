package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!na;")
	public static final JagString aClass100_268 = JagString.parse(")4");
	@OriginalMember(owner = "client!he", name = "gb", descriptor = "Lclient!na;")
	public static final JagString aClass100_518 = JagString.parse("www");
	@OriginalMember(owner = "client!e", name = "Tc", descriptor = "Lclient!na;")
	public static final JagString aClass100_365 = JagString.parse("www)2wtqa");
	@OriginalMember(owner = "client!lk", name = "J", descriptor = "Lclient!na;")
	public static final JagString aClass100_687 = JagString.parse(")4p=");
	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!na;")
	public static final JagString aClass100_424 = JagString.parse("http:)4)4");
	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_886 = JagString.parse(")3runescape)3com)4l=");
	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_98 = JagString.parse(")4a=");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)Lclient!na;")
	public static JagString method479() {
		@Pc(8) JagString local8 = aClass100_518;
		@Pc(10) JagString local10 = JagString.EMPTY;
		if (client.modeWhere != 0) {
			local8 = aClass100_365;
		}
		if (client.settings != null) {
			local10 = JagString.concatenate(new JagString[] { aClass100_687, client.settings});
		}
		return JagString.concatenate(new JagString[] { aClass100_424, local8, aClass100_886, JagString.parseInt(client.language), aClass100_98, JagString.parseInt(client.affiliate), local10, aClass100_268 });
	}

}
