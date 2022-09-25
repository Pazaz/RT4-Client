package InterfaceDebugPlugin;

import plugin.Plugin;
import plugin.annotations.PluginMeta;
import plugin.api.*;
import rt4.Component;
import rt4.GameShell;

import java.util.ArrayList;
import java.util.Arrays;

@PluginMeta(
        author = "Ceikry",
        description = "Aids in identifying interface components/varps/model IDs.",
        version = 1.2
)
public class plugin extends Plugin {
    private boolean isEnabled;
    private boolean isVerbose;

    private final ArrayList<Integer> activeVarps = new ArrayList<>();

    @Override
    public void ComponentDraw(int componentIndex, Component component, int screenX, int screenY) {
        if (!isEnabled) return;

        FontColor color = new FontColor((((component.type * 50) << 16) | 255 << 8 | Math.min(component.type * 50, 255)));

        if (!isVerbose) {
            if
            (
                component.type != 0
                && component.type != 9
                && (component.type != 5
                        || (component.onOptionClick != null
                        || component.onMouseOver != null
                        || component.onHold != null
                        || component.varpTriggers != null
                        || component.onVarcstrTransmit != null
                        || component.onVarcTransmit != null
                        || component.cs1ComparisonOpcodes != null))
                || component.hidden
            ) return;
        }

        API.DrawText(
                FontType.SMALL,
                color,
                TextModifier.LEFT,
                componentIndex + "" + (component.modelId != 0 ? " (" +  component.modelId + ")" : ""),
                screenX,
                screenY
        );

        if (component.varpTriggers != null) {
            Arrays.stream(component.varpTriggers).forEach(varp -> { if(!activeVarps.contains(varp)) activeVarps.add(varp); });
        }
    }

    @Override
    public void Draw(long timeDelta) {
       if (!isEnabled) return;

       StringBuilder sb = new StringBuilder();
       sb.append("Varps: [");

       for (int varp : activeVarps) sb.append(varp).append(" ");

       sb.append("]");

       API.DrawText(
               FontType.SMALL,
               FontColor.YELLOW,
               TextModifier.CENTER,
               sb.toString(),
               GameShell.canvasWidth / 2 - 100,
               20
       );
    }

    @Override
    public void ProcessCommand(String commandStr, String[] args) {
        if (!API.PlayerHasPrivilege(Privileges.JMOD)) return;

        if (commandStr.equalsIgnoreCase("::debug_iface")){
            isEnabled = !isEnabled;
        }

        if (commandStr.equalsIgnoreCase("::debug_iface_verbose")) {
            isVerbose = !isVerbose;
        }

        if (commandStr.equalsIgnoreCase("::clear_iface_varps")) {
            activeVarps.clear();
        }
    }
}
