package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MaterialManager {
    public static final int WATER = 4;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int currentType = 0;
    @OriginalMember(owner = "client!je", name = "R", descriptor = "Z")
    public static boolean renderingUnderwater = false;
    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[Lclient!pc;")
    public static MaterialRenderer[] renderers;
    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int currentArg = 0;
    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int anInt5158;
    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    public static int anInt1815;
    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
	public static int anInt5559;
    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int anInt406;
    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int anInt4675;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    public static void setMaterial(@OriginalArg(1) int arg, @OriginalArg(2) int type) {
        if (type == 4 && !Preferences.highWaterDetail) {
            type = 2;
            arg = 2;
        }
        if (currentType != type) {
            if (renderingUnderwater) {
                return;
            }
            if (currentType != 0) {
                renderers[currentType].unbind();
            }
            if (type != 0) {
                @Pc(61) MaterialRenderer renderer = renderers[type];
                renderer.bind();
                renderer.setArgument(arg);
            }
            currentType = type;
            currentArg = arg;
        } else if (type != 0 && arg != currentArg) {
            renderers[type].setArgument(arg);
            currentArg = arg;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    public static void resetArgument(@OriginalArg(1) int arg0) {
        if (arg0 == currentType) {
            @Pc(12) MaterialRenderer local12 = renderers[arg0];
            local12.setArgument(currentArg);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)I")
    public static int getFlags() {
        return currentType == 0 ? 0 : renderers[currentType].getFlags();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void quit() {
        renderers = null;
        Static151.method2808();
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void init() {
        Static151.method2809();
        renderers = new MaterialRenderer[7];
        renderers[1] = new SpecularMaterialRenderer();
        renderers[2] = new LiquidMaterialRenderer();
        renderers[3] = new UnderwaterMaterialRenderer();
        renderers[4] = new WaterMaterialRenderer();
        renderers[5] = new WaterfallMaterialRenderer();
        renderers[6] = new UnlitMaterialRenderer();
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZI)V")
    public static void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
        anInt5158 = arg1;
        anInt1815 = arg4;
        anInt5559 = arg0;
        anInt406 = arg3;
        anInt4675 = arg2;
    }
}
