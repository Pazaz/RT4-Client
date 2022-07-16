package OverheadDebugPlugin;

import plugin.Plugin;
import plugin.annotations.PluginMeta;
import plugin.api.*;
import rt4.*;

@PluginMeta(
        author = "Ceikry",
        description = "Draws helpful overhead debug information.",
        version = 1.3
)
public class plugin extends Plugin {
    private boolean isEnabled = false;

    @Override
    public void PlayerOverheadDraw(Player player, int screenX, int screenY) {
        if (!isEnabled) return;

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
        if (!isEnabled) return;

        String npcSb =
                (npc.type.name.strEquals(JagString.parse("null"))
                        ? npc.type.getMultiNpc() != null
                            ? "Wrapper [" + npc.type.getMultiNpc().name + "]"
                            : "Wrapper"
                        : npc.type.name) +
                " [G: " +
                npc.spotAnimId +
                "] [R: " + npc.getBasId() +
                "] [A: " + npc.seqId +
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

    @Override
    public void ProcessCommand(String commandStr, String[] args) {
        if (!API.PlayerHasPrivilege(Privileges.JMOD)) return;

        if (commandStr.equalsIgnoreCase("::npcdebug")) {
            isEnabled = !isEnabled;
        }
    }
}
