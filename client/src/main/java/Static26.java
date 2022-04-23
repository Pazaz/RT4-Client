import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lclient!ve;")
	public static Js5 js5Archive5;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "Lclient!ih;")
	public static LinkedList aClass69_27 = new LinkedList();

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!na;")
	public static final JagString aClass100_160 = Static165.method3165();

	@OriginalMember(owner = "client!ca", name = "db", descriptor = "I")
	public static int anInt865 = 0;

	@OriginalMember(owner = "client!ca", name = "eb", descriptor = "[I")
	public static final int[] anIntArray67 = new int[100];

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "[I")
	public static final int[] anIntArray68 = new int[50];

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)V")
	public static void setupLoadingScreenRegion() {
		@Pc(10) int local10 = (Static138.renderX >> 10) + (Static225.originX >> 3);
		@Pc(23) int local23 = (Static134.renderZ >> 10) + (Static142.originZ >> 3);
		Static156.locationMapFilesBuffer = new byte[18][];
		Static35.underWaterLocationsMapFileIds = new int[18];
		Static191.npcSpawnsFilesBuffer = new byte[18][];
		Static36.mapFileIds = new int[18];
		Static72.regionsXteaKeys = new int[18][4];
		Static186.underWaterMapFilesBuffer = new byte[18][];
		Static238.regionBitPacked = new int[18];
		Static273.mapFilesBuffer = new byte[18][];
		Static175.npcSpawnsFileIds = new int[18];
		Static99.underWaterMapFileIds = new int[18];
		Static172.locationsMapFileIds = new int[18];
		Static19.underWaterLocationsMapFilesBuffer = new byte[18][];
		@Pc(74) int local74 = 0;
		@Pc(80) int local80;
		for (local80 = (local10 - 6) / 8; local80 <= (local10 + 6) / 8; local80++) {
			for (@Pc(97) int local97 = (local23 - 6) / 8; local97 <= (local23 + 6) / 8; local97++) {
				@Pc(115) int local115 = (local80 << 8) + local97;
				Static238.regionBitPacked[local74] = local115;
				Static36.mapFileIds[local74] = js5Archive5.getGroupId(Static34.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local80), Static86.aClass100_488, Static123.parseInt(local97) }));
				Static172.locationsMapFileIds[local74] = js5Archive5.getGroupId(Static34.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local80), Static86.aClass100_488, Static123.parseInt(local97) }));
				Static175.npcSpawnsFileIds[local74] = js5Archive5.getGroupId(Static34.concatenate(new JagString[] { Static179.aClass100_807, Static123.parseInt(local80), Static86.aClass100_488, Static123.parseInt(local97) }));
				Static99.underWaterMapFileIds[local74] = js5Archive5.getGroupId(Static34.concatenate(new JagString[] { Static165.aClass100_772, Static123.parseInt(local80), Static86.aClass100_488, Static123.parseInt(local97) }));
				Static35.underWaterLocationsMapFileIds[local74] = js5Archive5.getGroupId(Static34.concatenate(new JagString[] { Static278.aClass100_1103, Static123.parseInt(local80), Static86.aClass100_488, Static123.parseInt(local97) }));
				if (Static175.npcSpawnsFileIds[local74] == -1) {
					Static36.mapFileIds[local74] = -1;
					Static172.locationsMapFileIds[local74] = -1;
					Static99.underWaterMapFileIds[local74] = -1;
					Static35.underWaterLocationsMapFileIds[local74] = -1;
				}
				local74++;
			}
		}
		for (local80 = local74; local80 < Static175.npcSpawnsFileIds.length; local80++) {
			Static175.npcSpawnsFileIds[local80] = -1;
			Static36.mapFileIds[local80] = -1;
			Static172.locationsMapFileIds[local80] = -1;
			Static99.underWaterMapFileIds[local80] = -1;
			Static35.underWaterLocationsMapFileIds[local80] = -1;
		}
		Static127.method2463(0, local23, local10, 8, true, 8);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public static void method741() {
		Static79.aClass99_11.method3103();
		Static7.sprites.method3103();
	}

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
				@Pc(45) int local45 = (Static238.regionBitPacked[local25] >> 8) * 64 - Static225.originX;
				@Pc(56) int local56 = (Static238.regionBitPacked[local25] & 0xFF) * 64 - Static142.originZ;
				Static107.loop();
				Static124.method2437(local45, arg0, local32, local56, Static148.collisionMaps);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	public static void method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static125.soundEffectVolume == 0 || arg0 == 0 || Static189.anInt4451 >= 50 || arg1 == -1) {
			return;
		}
		Static200.anIntArray421[Static189.anInt4451] = arg1;
		Static276.anIntArray563[Static189.anInt4451] = arg0;
		Static164.anIntArray362[Static189.anInt4451] = arg2;
		Static173.aClass138Array1[Static189.anInt4451] = null;
		anIntArray68[Static189.anInt4451] = 0;
		Static189.anInt4451++;
	}
}
