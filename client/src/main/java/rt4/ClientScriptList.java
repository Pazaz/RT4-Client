package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ClientScriptList {
    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!gn;")
    public static final LruHashTable scripts = new LruHashTable(128);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lclient!qc;")
    public static ClientScript get(@OriginalArg(0) int id) {
        @Pc(12) ClientScript local12 = (ClientScript) scripts.get((long) id);
        if (local12 != null) {
            return local12;
        }
        @Pc(22) byte[] local22 = client.js5Archive12.fetchFile(id, 0);
        if (local22 == null) {
            return null;
        }
        local12 = new ClientScript();
        @Pc(42) Buffer local42 = new Buffer(local22);
        local42.offset = local42.data.length - 2;
        @Pc(53) int local53 = local42.g2();
        @Pc(63) int local63 = local42.data.length - local53 - 12 - 2;
        local42.offset = local63;
        @Pc(70) int local70 = local42.g4();
        local12.anInt4667 = local42.g2();
        local12.anInt4671 = local42.g2();
        local12.anInt4665 = local42.g2();
        local12.anInt4669 = local42.g2();
        @Pc(98) int local98 = local42.g1();
        @Pc(107) int local107;
        @Pc(114) int local114;
        if (local98 > 0) {
            local12.aClass133Array1 = new HashTable[local98];
            for (local107 = 0; local107 < local98; local107++) {
                local114 = local42.g2();
                @Pc(121) HashTable local121 = new HashTable(IntUtils.clp2(local114));
                local12.aClass133Array1[local107] = local121;
                while (local114-- > 0) {
                    @Pc(136) int local136 = local42.g4();
                    @Pc(140) int local140 = local42.g4();
                    local121.put(new IntNode(local140), (long) local136);
                }
            }
        }
        local42.offset = 0;
        local12.name = local42.fastgjstr();
        local12.opcodes = new int[local70];
        local12.stringOperands = new JagString[local70];
        local107 = 0;
        local12.intOperands = new int[local70];
        while (local63 > local42.offset) {
            local114 = local42.g2();
            if (local114 == 3) {
                local12.stringOperands[local107] = local42.gjstr();
            } else if (local114 >= 100 || local114 == 21 || local114 == 38 || local114 == 39) {
                local12.intOperands[local107] = local42.g1();
            } else {
                local12.intOperands[local107] = local42.g4();
            }
            local12.opcodes[local107++] = local114;
        }
        scripts.put(local12, (long) id);
        return local12;
    }
}
