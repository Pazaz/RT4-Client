package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "Lclient!ih;")
	public static LinkedList sceneryList = new LinkedList();

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!na;")
	public static final JagString aClass100_160 = Static165.method3165();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
	public static void method743(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = Static273.mapFilesBuffer.length;
		@Pc(19) byte[][] local19;
		if (GlRenderer.enabled && arg0) {
			local19 = Static19.underWaterLocationsMapFilesBuffer;
		} else {
			local19 = Static156.locationMapFilesBuffer;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			@Pc(32) byte[] local32 = local19[local25];
			if (local32 != null) {
				@Pc(45) int local45 = (Static238.regionBitPacked[local25] >> 8) * 64 - Camera.originX;
				@Pc(56) int local56 = (Static238.regionBitPacked[local25] & 0xFF) * 64 - Camera.originZ;
				client.audioLoop();
				Static124.method2437(local45, arg0, local32, local56, PathFinder.collisionMaps);
			}
		}
	}

}
