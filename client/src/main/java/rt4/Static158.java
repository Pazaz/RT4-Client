package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
	public static int anInt3851 = -1;
    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int anInt3811 = 0;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(B)V")
	public static void decodeNpcFiles() {
		@Pc(10) int local10 = LoginManager.npcSpawnsFilesBuffer.length;
		for (@Pc(16) int local16 = 0; local16 < local10; local16++) {
			if (LoginManager.npcSpawnsFilesBuffer[local16] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < anInt3811; local27++) {
					if (Static217.anIntArray434[local27] == LoginManager.regionBitPacked[local16]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					Static217.anIntArray434[anInt3811] = LoginManager.regionBitPacked[local16];
					local25 = anInt3811++;
				}
				@Pc(67) int local67 = 0;
				@Pc(74) Buffer local74 = new Buffer(LoginManager.npcSpawnsFilesBuffer[local16]);
				while (local74.offset < LoginManager.npcSpawnsFilesBuffer[local16].length && local67 < 511) {
					@Pc(97) int local97 = local67++ << 6 | local25;
					@Pc(103) int local103 = local74.g2();
					@Pc(107) int local107 = local103 >> 14;
					@Pc(113) int local113 = local103 >> 7 & 0x3F;
					@Pc(125) int local125 = local113 + (LoginManager.regionBitPacked[local16] >> 8) * 64 - Camera.originX;
					@Pc(129) int local129 = local103 & 0x3F;
					@Pc(142) int local142 = local129 + (LoginManager.regionBitPacked[local16] & 0xFF) * 64 - Camera.originZ;
					@Pc(148) NpcType local148 = NpcTypeList.get(local74.g2());
					if (NpcList.npcs[local97] == null && (local148.aByte10 & 0x1) > 0 && local107 == LoginManager.centralPlane && local125 >= 0 && local148.size + local125 < 104 && local142 >= 0 && local142 + local148.size < 104) {
						NpcList.npcs[local97] = new Npc();
						@Pc(198) Npc local198 = NpcList.npcs[local97];
						NpcList.ids[NpcList.size++] = local97;
						local198.lastSeenLoop = client.loop;
						local198.setNpcType(local148);
						local198.method2692(local198.type.size);
						local198.anInt3400 = local198.anInt3381 = PathingEntity.ANGLES[local198.type.aByte11];
						local198.anInt3376 = local198.type.anInt3733;
						if (local198.anInt3376 == 0) {
							local198.anInt3381 = 0;
						}
						local198.anInt3365 = local198.type.basId;
						local198.method2683(local198.getSize(), local125, local142, true);
					}
				}
			}
		}
	}
}
