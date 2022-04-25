package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class AreaSoundManager {
    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!sc;")
    public static final HashTable aClass133_7 = new HashTable(16);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!e;I)V")
    public static void remove(@OriginalArg(0) Player arg0) {
        @Pc(10) AreaSound local10 = (AreaSound) aClass133_7.get(arg0.username.encode37());
        if (local10 == null) {
            return;
        }
        if (local10.primaryStream != null) {
            client.soundStream.removeSubStream(local10.primaryStream);
            local10.primaryStream = null;
        }
        local10.unlink();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLclient!pb;ILclient!km;IILclient!e;)V")
    public static void add(@OriginalArg(0) int arg0, @OriginalArg(2) LocType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Npc arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Player arg6) {
        @Pc(13) AreaSound local13 = new AreaSound();
        local13.anInt2029 = arg0 * 128;
        local13.anInt2041 = arg4 * 128;
        local13.anInt2033 = arg5;
        if (arg1 != null) {
            local13.sounds = arg1.anIntArray381;
            local13.radius = arg1.soundRadius * 128;
            local13.anInt2040 = arg1.anInt4414;
            local13.locType = arg1;
            local13.sound = arg1.sound;
            local13.anInt2032 = arg1.anInt4419;
            @Pc(57) int local57 = arg1.width;
            @Pc(60) int local60 = arg1.length;
            if (arg2 == 1 || arg2 == 3) {
                local57 = arg1.length;
                local60 = arg1.width;
            }
            local13.anInt2028 = (local60 + arg0) * 128;
            local13.anInt2037 = (arg4 + local57) * 128;
            if (arg1.multiLocs != null) {
                local13.multiLocOrNpc = true;
                local13.update();
            }
            if (local13.sounds != null) {
                local13.anInt2034 = local13.anInt2032 + (int) (Math.random() * (double) (local13.anInt2040 - local13.anInt2032));
            }
            Static3.aClass69_135.addTail(local13);
        } else if (arg3 != null) {
            local13.npc = arg3;
            @Pc(138) NpcType local138 = arg3.type;
            if (local138.multiNpcs != null) {
                local13.multiLocOrNpc = true;
                local138 = local138.getMultiNpc();
            }
            if (local138 != null) {
                local13.anInt2028 = (local138.soze + arg0) * 128;
                local13.anInt2037 = (arg4 + local138.soze) * 128;
                local13.sound = Static112.getSound(arg3);
                local13.radius = local138.soundRadius * 128;
            }
            Static152.aClass69_87.addTail(local13);
        } else if (arg6 != null) {
            local13.player = arg6;
            local13.anInt2037 = (arg6.getSize() + arg4) * 128;
            local13.anInt2028 = (arg6.getSize() + arg0) * 128;
            local13.sound = Static140.getSound(arg6);
            local13.radius = arg6.soundRadius * 128;
            aClass133_7.put(local13, arg6.username.encode37());
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!km;Z)V")
    public static void remove(@OriginalArg(0) Npc arg0) {
        for (@Pc(13) AreaSound local13 = (AreaSound) Static152.aClass69_87.method2289(); local13 != null; local13 = (AreaSound) Static152.aClass69_87.method2288()) {
            if (arg0 == local13.npc) {
                if (local13.primaryStream != null) {
                    client.soundStream.removeSubStream(local13.primaryStream);
                    local13.primaryStream = null;
                }
                local13.unlink();
                return;
            }
        }
    }
}
