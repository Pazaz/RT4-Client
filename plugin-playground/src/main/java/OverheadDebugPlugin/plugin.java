package OverheadDebugPlugin;

import plugin.Plugin;
import plugin.api.API;
import plugin.api.FontColor;
import plugin.api.FontType;
import plugin.api.TextModifier;
import rt4.*;

public class plugin extends Plugin {
    @Override
    public void PlayerOverheadDraw(Player player, int screenX, int screenY) {
        API.DrawText(
                FontType.SMALL,
                FontColor.YELLOW,
                TextModifier.CENTER,
                player.username.toString(),
                screenX,
                screenY
        );
    }

    @Override
    public void NPCOverheadDraw(Npc npc, int screenX, int screenY) {
        String npcSb =
                (npc.type.name.strEquals(JagString.parse("null"))
                        ? npc.type.getMultiNpc() != null
                            ? "Wrapper [" + npc.type.getMultiNpc().name + " " + npc.type.getMultiNpc().id + "]"
                            : "Wrapper"
                        : npc.type.name) +
                " [Lvl: " +
                npc.type.combatLevel +
                "] [ID: " +
                npc.type.id +
                "] [Vb: " +
                npc.type.multiNpcVarbit + "]";

        API.DrawText(
                FontType.SMALL,
                FontColor.YELLOW,
                TextModifier.CENTER,
                npcSb,
                screenX,
                screenY
        );
    }
}
