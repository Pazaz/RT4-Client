package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class CursorType {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int hotSpotY;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public int hotSpotX;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	private int spriteId;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Lclient!mm;")
	public final SoftwareSprite getSprite() {
		@Pc(7) SoftwareSprite local7 = (SoftwareSprite) CursorTypeList.sprites.get(this.spriteId);
		if (local7 != null) {
			return local7;
		}
		local7 = SoftwareSprite.loadSoftwareAlphaSprite(CursorTypeList.spritesArchive, this.spriteId);
		if (local7 != null) {
			CursorTypeList.sprites.put(local7, this.spriteId);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wa;IB)V")
	public final void decode(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.g1();
			if (local18 == 0) {
				return;
			}
			this.decode(arg1, local18, arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!wa;)V")
	private void decode(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		if (arg1 == 1) {
			this.spriteId = arg2.g2();
		} else if (arg1 == 2) {
			this.hotSpotX = arg2.g1();
			this.hotSpotY = arg2.g1();
		}
	}
}
