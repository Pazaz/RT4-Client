package rt4;

import org.openrs2.deob.annotation.OriginalMember;

public class StockMarketManager {
	@OriginalMember(owner = "client!si", name = "X", descriptor = "[Lclient!sg;")
	public static final StockMarketOffer[] offers = new StockMarketOffer[6];
	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public static int transmitAt = 0;
}
