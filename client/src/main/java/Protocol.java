import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Protocol {
    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!i;")
	public static final Packet inboundBuffer = new Packet(65536);
    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!wa;")
    public static final Buffer chatBuffer = new Buffer(new byte[5000]);
    @OriginalMember(owner = "client!ag", name = "P", descriptor = "Lclient!i;")
    public static final Packet outboundBuffer = new Packet(5000);
    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!ma;")
    public static BufferedSocket socket;
    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Lsignlink!im;")
    public static PrivilegedRequest socketRequest;
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int verifyId = 0;
    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static int opcode = 0;
    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int length = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V")
    public static void readRebuildPacket(@OriginalArg(1) boolean arg0) {
        Static230.dynamicMapRegion = arg0;
        @Pc(13) int local13;
        @Pc(20) int local20;
        @Pc(26) int local26;
        @Pc(31) int local31;
        @Pc(60) int local60;
        @Pc(64) int local64;
        @Pc(138) int local138;
        @Pc(151) int local151;
        @Pc(169) int local169;
        if (!Static230.dynamicMapRegion) {
            local13 = inboundBuffer.g2sub();
            local20 = (length - inboundBuffer.offset) / 16;
            Static72.regionsXteaKeys = new int[local20][4];
            for (local26 = 0; local26 < local20; local26++) {
                for (local31 = 0; local31 < 4; local31++) {
                    Static72.regionsXteaKeys[local26][local31] = inboundBuffer.p4rme();
                }
            }
            local26 = inboundBuffer.g1ssub();
            local31 = inboundBuffer.g2();
            local60 = inboundBuffer.g2sub();
            local64 = inboundBuffer.g2sub();
            Static238.regionBitPacked = new int[local20];
            Static273.mapFilesBuffer = new byte[local20][];
            Static191.npcSpawnsFilesBuffer = null;
            Static99.underWaterMapFileIds = new int[local20];
            Static156.locationMapFilesBuffer = new byte[local20][];
            Static19.underWaterLocationsMapFilesBuffer = new byte[local20][];
            Static175.npcSpawnsFileIds = null;
            Static36.mapFileIds = new int[local20];
            Static186.underWaterMapFilesBuffer = new byte[local20][];
            Static172.locationsMapFileIds = new int[local20];
            Static35.underWaterLocationsMapFileIds = new int[local20];
            local20 = 0;
            @Pc(100) boolean local100 = false;
            if ((local31 / 8 == 48 || local31 / 8 == 49) && local60 / 8 == 48) {
                local100 = true;
            }
            if (local31 / 8 == 48 && local60 / 8 == 148) {
                local100 = true;
            }
            for (local138 = (local31 - 6) / 8; local138 <= (local31 + 6) / 8; local138++) {
                for (local151 = (local60 - 6) / 8; local151 <= (local60 + 6) / 8; local151++) {
                    local169 = (local138 << 8) + local151;
                    if (local100 && (local151 == 49 || local151 == 149 || local151 == 147 || local138 == 50 || local138 == 49 && local151 == 47)) {
                        Static238.regionBitPacked[local20] = local169;
                        Static36.mapFileIds[local20] = -1;
                        Static172.locationsMapFileIds[local20] = -1;
                        Static99.underWaterMapFileIds[local20] = -1;
                        Static35.underWaterLocationsMapFileIds[local20] = -1;
                    } else {
                        Static238.regionBitPacked[local20] = local169;
                        Static36.mapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                        Static172.locationsMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                        Static99.underWaterMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static165.aClass100_772, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                        Static35.underWaterLocationsMapFileIds[local20] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static278.aClass100_1103, Static123.parseInt(local138), Static86.aClass100_488, Static123.parseInt(local151) }));
                    }
                    local20++;
                }
            }
            Static127.method2463(local26, local60, local31, local64, false, local13);
            return;
        }
        local13 = inboundBuffer.g2leadd();
        local20 = inboundBuffer.g2leadd();
        local26 = inboundBuffer.g1ssub();
        local31 = inboundBuffer.g2leadd();
        inboundBuffer.method2233();
        @Pc(391) int local391;
        for (local60 = 0; local60 < 4; local60++) {
            for (local64 = 0; local64 < 13; local64++) {
                for (local391 = 0; local391 < 13; local391++) {
                    local138 = inboundBuffer.method2238(1);
                    if (local138 == 1) {
                        Static187.anIntArrayArrayArray18[local60][local64][local391] = inboundBuffer.method2238(26);
                    } else {
                        Static187.anIntArrayArrayArray18[local60][local64][local391] = -1;
                    }
                }
            }
        }
        inboundBuffer.method2244();
        local60 = (length - inboundBuffer.offset) / 16;
        Static72.regionsXteaKeys = new int[local60][4];
        for (local64 = 0; local64 < local60; local64++) {
            for (local391 = 0; local391 < 4; local391++) {
                Static72.regionsXteaKeys[local64][local391] = inboundBuffer.p4rme();
            }
        }
        local64 = inboundBuffer.g2();
        Static35.underWaterLocationsMapFileIds = new int[local60];
        Static172.locationsMapFileIds = new int[local60];
        Static36.mapFileIds = new int[local60];
        Static19.underWaterLocationsMapFilesBuffer = new byte[local60][];
        Static175.npcSpawnsFileIds = null;
        Static99.underWaterMapFileIds = new int[local60];
        Static156.locationMapFilesBuffer = new byte[local60][];
        Static273.mapFilesBuffer = new byte[local60][];
        Static238.regionBitPacked = new int[local60];
        Static191.npcSpawnsFilesBuffer = null;
        Static186.underWaterMapFilesBuffer = new byte[local60][];
        local60 = 0;
        for (local391 = 0; local391 < 4; local391++) {
            for (local138 = 0; local138 < 13; local138++) {
                for (local151 = 0; local151 < 13; local151++) {
                    local169 = Static187.anIntArrayArrayArray18[local391][local138][local151];
                    if (local169 != -1) {
                        @Pc(555) int local555 = local169 >> 14 & 0x3FF;
                        @Pc(561) int local561 = local169 >> 3 & 0x7FF;
                        @Pc(571) int local571 = local561 / 8 + (local555 / 8 << 8);
                        @Pc(573) int local573;
                        for (local573 = 0; local573 < local60; local573++) {
                            if (local571 == Static238.regionBitPacked[local573]) {
                                local571 = -1;
                                break;
                            }
                        }
                        if (local571 != -1) {
                            Static238.regionBitPacked[local60] = local571;
                            @Pc(609) int local609 = local571 & 0xFF;
                            local573 = local571 >> 8 & 0xFF;
                            Static36.mapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static103.aClass100_558, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            Static172.locationsMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static270.aClass100_1090, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            Static99.underWaterMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static165.aClass100_772, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            Static35.underWaterLocationsMapFileIds[local60] = client.js5Archive5.getGroupId(JagString.concatenate(new JagString[] { Static278.aClass100_1103, Static123.parseInt(local573), Static86.aClass100_488, Static123.parseInt(local609) }));
                            local60++;
                        }
                    }
                }
            }
        }
        Static127.method2463(local26, local64, local20, local31, false, local13);
    }
}
