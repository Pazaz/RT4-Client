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
		@Pc(13) int local13 = LoginManager.mapFilesBuffer.length;
		@Pc(19) byte[][] local19;
		if (GlRenderer.enabled && arg0) {
			local19 = LoginManager.underWaterLocationsMapFilesBuffer;
		} else {
			local19 = LoginManager.locationMapFilesBuffer;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			@Pc(32) byte[] local32 = local19[local25];
			if (local32 != null) {
				@Pc(45) int local45 = (LoginManager.regionBitPacked[local25] >> 8) * 64 - Camera.originX;
				@Pc(56) int local56 = (LoginManager.regionBitPacked[local25] & 0xFF) * 64 - Camera.originZ;
				client.audioLoop();
				method2437(local45, arg0, local32, local56, PathFinder.collisionMaps);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ[BII[Lclient!mj;)V")
	public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) CollisionMap[] arg4) {
		@Pc(10) Buffer local10 = new Buffer(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.gVarSmart();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.gSmart1or2();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(50) int local50 = local27 >> 12;
				@Pc(56) int local56 = local27 >> 6 & 0x3F;
				@Pc(60) int local60 = local10.g1();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = arg0 + local56;
				@Pc(76) int local76 = local46 + arg3;
				if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
					@Pc(90) CollisionMap local90 = null;
					if (!arg1) {
						@Pc(95) int local95 = local50;
						if ((SceneGraph.tileFlags[1][local72][local76] & 0x2) == 2) {
							local95 = local50 - 1;
						}
						if (local95 >= 0) {
							local90 = arg4[local95];
						}
					}
					Static185.method3397(local50, !arg1, local50, arg1, local90, local12, local64, local72, local76, local68);
				}
			}
		}
	}
}
