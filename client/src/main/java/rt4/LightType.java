package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class LightType {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public int alphaMin = 2048;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public int flickerType = 0;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public int alphaMax = 0;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public int anInt2873 = 2048;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!wa;I)V")
	public final void decode(@OriginalArg(1) Buffer buffer, @OriginalArg(2) int arg1) {
		while (true) {
			// Unsure this is type
			@Pc(5) int lightType = buffer.g1();
			if (lightType == 0) {
				return;
			}
			this.decode(lightType, buffer, arg1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!wa;IZ)V")
	private void decode(@OriginalArg(0) int lightType, @OriginalArg(1) Buffer buffer, @OriginalArg(2) int arg2) {
		if (lightType == 1) {
			this.flickerType = buffer.g1();
		} else if (lightType == 2) {
			this.anInt2873 = buffer.g2();
		} else if (lightType == 3) {
			this.alphaMin = buffer.g2();
		} else if (lightType == 4) {
			this.alphaMax = buffer.g2b();
		}
	}
}
