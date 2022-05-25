package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class HintArrowManager {
    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!n;")
    public static final SoftLruHashTable HINT_ARROWS = new SoftLruHashTable(4);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
    public static void clean() {
        HINT_ARROWS.clean(5);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method3329() {
        HINT_ARROWS.method3103();
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static void clear() {
        HINT_ARROWS.clear();
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIIILclient!ak;I)Lclient!ak;")
    public static Model getModel(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Model arg4, @OriginalArg(6) int arg5) {
        @Pc(4) long local4 = (long) arg2;
        @Pc(10) Model local10 = (Model) HINT_ARROWS.get(local4);
        if (local10 == null) {
            @Pc(22) RawModel local22 = RawModel.create(client.js5Archive7, arg2);
            if (local22 == null) {
                return null;
            }
            local10 = local22.createModel(64, 768, -50, -10, -50);
            HINT_ARROWS.put(local10, local4);
        }
        @Pc(42) int local42 = arg4.method4562();
        @Pc(45) int local45 = arg4.method4561();
        @Pc(48) int local48 = arg4.method4576();
        @Pc(51) int local51 = arg4.method4550();
        local10 = local10.method4560(true, true, true);
        if (arg0 != 0) {
            local10.method4554(arg0);
        }
        @Pc(94) int local94;
        if (GlRenderer.enabled) {
            @Pc(68) GlModel local68 = (GlModel) local10;
            if (arg5 != SceneGraph.getTileHeight(Player.level, arg3 + local42, arg1 + local48) || arg5 != SceneGraph.getTileHeight(Player.level, arg3 + local45, local51 + arg1)) {
                for (local94 = 0; local94 < local68.vertexCount; local94++) {
                    local68.anIntArray465[local94] += SceneGraph.getTileHeight(Player.level, local68.anIntArray461[local94] + arg3, local68.anIntArray466[local94] + arg1) - arg5;
                }
                local68.bounds.valid = false;
                local68.vertexBuffer.valid = false;
            }
        } else {
            @Pc(142) SoftwareModel local142 = (SoftwareModel) local10;
            if (arg5 != SceneGraph.getTileHeight(Player.level, local42 + arg3, local48 + arg1) || arg5 != SceneGraph.getTileHeight(Player.level, arg3 + local45, local51 + arg1)) {
                for (local94 = 0; local94 < local142.vertexCount; local94++) {
                    local142.anIntArray527[local94] += SceneGraph.getTileHeight(Player.level, arg3 + local142.anIntArray528[local94], local142.anIntArray531[local94] + arg1) - arg5;
                }
                local142.boundsValid = false;
            }
        }
        return local10;
    }
}
