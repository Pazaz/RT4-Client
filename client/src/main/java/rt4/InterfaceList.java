package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class InterfaceList {
    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!ih;")
    public static final LinkedList lowPriorityRequests = new LinkedList();
    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[Z")
    public static final boolean[] rectangleRedraw = new boolean[100];
    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
    public static final int[] keyChars = new int[128];
    @OriginalMember(owner = "client!sg", name = "q", descriptor = "[I")
    public static final int[] keyCodes = new int[128];
    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!sc;")
    public static final HashTable properties = new HashTable(512);
    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
	public static final int[] rectangleX = new int[100];
    @OriginalMember(owner = "client!e", name = "sc", descriptor = "[I")
    public static final int[] rectangleY = new int[100];
    @OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
    public static final int[] rectangleWidth = new int[100];
    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "[I")
	public static final int[] rectangleHeight = new int[100];
    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    public static int rectangles = 0;
    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int topLevelInterface = -1;
    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!ve;")
    public static Js5 aClass153_12;
    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!ve;")
	public static Js5 aClass153_64;
    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lclient!ve;")
    public static Js5 aClass153_84;
    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!ve;")
    public static Js5 aClass153_85;
    @OriginalMember(owner = "client!th", name = "j", descriptor = "[[Lclient!be;")
    public static Component[][] components;
    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[Z")
    public static boolean[] aBooleanArray115;
    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int keyQueueSize = 0;
    @OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
    public static int transmitTimer = 1;
    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int miscTransmitAt = 0;
    @OriginalMember(owner = "client!je", name = "T", descriptor = "Lclient!sc;")
    public static HashTable openInterfaces = new HashTable(8);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLclient!ve;Lclient!ve;Lclient!ve;Lclient!ve;)V")
    public static void init(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
        aClass153_12 = arg1;
        aClass153_64 = arg0;
        aClass153_84 = arg2;
        aClass153_85 = arg3;
        components = new Component[aClass153_84.capacity()][];
        aBooleanArray115 = new boolean[aClass153_84.capacity()];
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V")
    public static void method2275(@OriginalArg(1) int arg0) {
        if (arg0 == -1 || !aBooleanArray115[arg0]) {
            return;
        }
        aClass153_84.discardUnpacked(arg0);
        if (components[arg0] == null) {
            return;
        }
        @Pc(27) boolean local27 = true;
        for (@Pc(29) int local29 = 0; local29 < components[arg0].length; local29++) {
            if (components[arg0][local29] != null) {
                if (components[arg0][local29].type == 2) {
                    local27 = false;
                } else {
                    components[arg0][local29] = null;
                }
            }
        }
        if (local27) {
            components[arg0] = null;
        }
        aBooleanArray115[arg0] = false;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)Z")
    public static boolean load(@OriginalArg(0) int arg0) {
        if (aBooleanArray115[arg0]) {
            return true;
        }

        if (aClass153_84.isGroupReady(arg0)) {
            @Pc(25) int local25 = aClass153_84.getGroupCapacity(arg0);
            if (local25 == 0) {
                aBooleanArray115[arg0] = true;
                return true;
            }
            if (components[arg0] == null) {
                components[arg0] = new Component[local25];
            }
            for (@Pc(46) int local46 = 0; local46 < local25; local46++) {
                if (components[arg0][local46] == null) {
                    @Pc(62) byte[] local62 = aClass153_84.fetchFile(arg0, local46);
                    if (local62 != null) {
                        @Pc(74) Component local74 = components[arg0][local46] = new Component();
                        local74.id = local46 + (arg0 << 16);
                        if (local62[0] == -1) {
                            local74.decodeScriptFormat(new Buffer(local62));
                        } else {
                            local74.decodeNoScripts(new Buffer(local62));
                        }
                    }
                }
            }
            aBooleanArray115[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static void method1287() {
        components = new Component[aClass153_84.capacity()][];
        aBooleanArray115 = new boolean[aClass153_84.capacity()];
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(Z)V")
    public static void redrawActiveInterfaces() {
        for (@Pc(6) ComponentPointer local6 = (ComponentPointer) openInterfaces.head(); local6 != null; local6 = (ComponentPointer) openInterfaces.next()) {
            @Pc(14) int local14 = local6.anInt5878;
            if (load(local14)) {
                @Pc(21) boolean local21 = true;
                @Pc(25) Component[] local25 = components[local14];
                @Pc(27) int local27;
                for (local27 = 0; local27 < local25.length; local27++) {
                    if (local25[local27] != null) {
                        local21 = local25[local27].if3;
                        break;
                    }
                }
                if (!local21) {
                    local27 = (int) local6.key;
                    @Pc(60) Component local60 = getComponent(local27);
                    if (local60 != null) {
                        redraw(local60);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lclient!be;")
    public static Component getComponent(@OriginalArg(1) int id) {
        try {
            @Pc(7) int parent = id >> 16;
            @Pc(18) int child = id & 0xFFFF;
            if (components.length <= parent || parent < 0) {
                return null;
            }
            if (components[parent] == null || components[parent].length <= child || components[parent][child] == null) {
                @Pc(33) boolean success = load(parent);
                if (!success) {
                    return null;
                }
            }
            if (components[parent].length <= child) {
                return null;
            }
            return components[parent][child];
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!be;)Lclient!bf;")
    public static ServerActiveProperties getServerActiveProperties(@OriginalArg(0) Component arg0) {
        @Pc(13) ServerActiveProperties local13 = (ServerActiveProperties) properties.get(((long) arg0.id << 32) + (long) arg0.createdComponentId);
        return local13 == null ? arg0.properties : local13;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!be;)V")
    public static void redraw(@OriginalArg(1) Component arg0) {
        if (Static182.anInt4311 == arg0.rectangleLoop) {
            Static186.aBooleanArray100[arg0.rectangle] = true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!be;BI)Lclient!na;")
    public static JagString getOp(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1) {
        if (!getServerActiveProperties(arg0).method503(arg1) && arg0.onOptionClick == null) {
            return null;
        } else if (arg0.ops == null || arg0.ops.length <= arg1 || arg0.ops[arg1] == null || arg0.ops[arg1].trim().length() == 0) {
            return Static121.qaOpTest ? JagString.concatenate(new JagString[] { Static207.aClass100_903, JagString.parseInt(arg1) }) : null;
        } else {
            return arg0.ops[arg1];
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)Lclient!be;")
    public static Component method1418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(7) Component local7 = getComponent(arg0);
        if (arg1 == -1) {
            return local7;
        } else if (local7 == null || local7.createdComponents == null || local7.createdComponents.length <= arg1) {
            return null;
        } else {
            return local7.createdComponents[arg1];
        }
    }
}
