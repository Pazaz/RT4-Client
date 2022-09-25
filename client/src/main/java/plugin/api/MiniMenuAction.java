package plugin.api;

import java.util.HashMap;

public enum MiniMenuAction {
    WALK_HERE(60),
    NPC_1(17),
    NPC_2(16),
    NPC_3(4),
    NPC_4(19),
    NPC_5(2),
    NPC_EXAMINE(1007),
    PLAYER_1(30),
    PLAYER_BLOCK(34),
    PLAYER_TRADE(29),
    PLAYER_REQ_ASSIST(37),
    PLAYER_FOLLOW(31),
    PLAYER_5(57),
    OBJ_1(47),
    OBJ_EQUIP(5),
    OBJ_4(35),
    OBJ_OPERATE(23),
    OBJ_5(58),
    OBJ_EXAMINE(1002),
    OBJSTACK_1(18),
    OBJSTACK_2(20),
    LOC_1(42),
    LOC_2(50),
    LOC_3(49),
    LOC_4(46),
    LOC_5(1001),
    LOC_EXAMINE(1004),
    CUSTOM_1(9990),
    CUSTOM_2(9991),
    CUSTOM_3(9992),
    CUSTOM_4(9993),
    CUSTOM_5(9994),
    CUSTOM_6(9995),
    CUSTOM_7(9996),
    CUSTOM_8(9997),
    CUSTOM_9(9998),
    CUSTOM_10(9999),
    ;

    public final short actionCode;
    public static HashMap<Integer, MiniMenuAction> actionCodeMap = new HashMap<>();

    MiniMenuAction(int actionCode) {
        this.actionCode = (short) actionCode;
    }

    static {
        for (MiniMenuAction a : values()) {
            actionCodeMap.put((int) a.actionCode, a);
        }
    }

    public static MiniMenuAction forActionCode(short actionCode) {
        return actionCodeMap.get((int) actionCode);
    }
}
