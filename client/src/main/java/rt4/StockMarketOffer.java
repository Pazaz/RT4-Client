package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class StockMarketOffer {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "B")
	private byte statusAndType;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public int completedCount;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public int count;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public int completedGold;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public int item;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public int price;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public StockMarketOffer() {
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!wa;)V")
	public StockMarketOffer(@OriginalArg(0) Buffer arg0) {
		this.statusAndType = arg0.g1b();
		this.item = arg0.g2();
		this.price = arg0.g4();
		this.count = arg0.g4();
		this.completedCount = arg0.g4();
		this.completedGold = arg0.g4();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I")
	public final int getStatus() {
		return this.statusAndType & 0x7;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I")
	public final int getType() {
		return (this.statusAndType & 0x8) == 8 ? 1 : 0;
	}
}
