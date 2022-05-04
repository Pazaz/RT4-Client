package rt4;

import java.util.Calendar;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "Lclient!na;")
	public static JagString aClass100_545 = null;

    @OriginalMember(owner = "client!hn", name = "Y", descriptor = "I")
	public static int anInt2680 = 0;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Lclient!mm;")
	public static SoftwareSprite method2071() {
		@Pc(13) int local13 = SpriteLoader.innerHeights[0] * SpriteLoader.innerWidths[0];
		@Pc(17) byte[] local17 = SpriteLoader.pixels[0];
		@Pc(78) SoftwareSprite local78;
		if (SpriteLoader.hasAlpha[0]) {
			@Pc(30) byte[] local30 = SpriteLoader.alpha[0];
			@Pc(33) int[] local33 = new int[local13];
			for (@Pc(35) int local35 = 0; local35 < local13; local35++) {
				local33[local35] = (local30[local35] & 0xFF) << 24 | SpriteLoader.palette[local17[local35] & 0xFF];
			}
			local78 = new SoftwareAlphaSprite(SpriteLoader.width, SpriteLoader.height, SpriteLoader.xOffsets[0], SpriteLoader.yOffsets[0], SpriteLoader.innerWidths[0], SpriteLoader.innerHeights[0], local33);
		} else {
			@Pc(83) int[] local83 = new int[local13];
			for (@Pc(85) int local85 = 0; local85 < local13; local85++) {
				local83[local85] = SpriteLoader.palette[local17[local85] & 0xFF];
			}
			local78 = new SoftwareSprite(SpriteLoader.width, SpriteLoader.height, SpriteLoader.xOffsets[0], SpriteLoader.yOffsets[0], SpriteLoader.innerWidths[0], SpriteLoader.innerHeights[0], local83);
		}
		SpriteLoader.clear();
		return local78;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(B)V")
	public static void method2073() {
		Static20.objectContainerCache = new HashTable(32);
	}

}
