package plugin.api;

import rt4.JagString;
import rt4.MiniMenu;

/**
 * Convenience wrapper for mini menu entries
 * @author ceikry
 */
public class MiniMenuEntry {
    int index;
    public MiniMenuEntry(int index) {
        this.index = index;
    }

    public String getSubject() {
        return MiniMenu.opBases[index].toString();
    }

    public void setSubject(String name) {
        MiniMenu.opBases[index] = JagString.of(name);
    }

    public long getSubjectIndex() {
        return MiniMenu.keys[index];
    }

    public MiniMenuType getType() {
        if (getSubject().length() < 11) return MiniMenuType.TILE;

        String color = getSubject().substring(5,11);
        if (color.equals("00ffff")) return MiniMenuType.LOCATION;
        if (color.equals("ffff00")) return MiniMenuType.NPC;
        if (color.equals("ffffff")) return MiniMenuType.PLAYER;
        if (color.equals("ff9040")) return MiniMenuType.OBJ;
        else return MiniMenuType.CUSTOM;
    }

    public String getVerb() {
        return MiniMenu.ops[index].toString();
    }

    public void setVerb(String verb) {
       MiniMenu.ops[index] = JagString.of(verb);
    }

    public int getIntArg1() {
        return MiniMenu.intArgs1[index];
    }

    public int getIntArg2() {
        return MiniMenu.intArgs2[index];
    }

    public int getCursor() {
        return MiniMenu.cursors[index];
    }

    public MiniMenuAction getAction() {
        int actionCode = MiniMenu.actions[index];
        if (isStrictlySecondary()) actionCode -= 2000;
        return MiniMenuAction.forActionCode((short) actionCode);
    }

    public short getActionCode() {
        return MiniMenu.actions[index];
    }

    public void setAction(MiniMenuAction action) {
        MiniMenu.actions[index] = action.actionCode;
    }

    public void toggleStrictlySecondary() {
        if (isStrictlySecondary()) MiniMenu.actions[index] -= 2000;
        else MiniMenu.actions[index] += 2000;
    }

    public boolean isStrictlySecondary() {
        return MiniMenu.actions[index] >= 2000;
    }
}
