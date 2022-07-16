package VarpLogPlugin;
    
import plugin.Plugin;
import plugin.annotations.PluginMeta;
import plugin.api.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@PluginMeta(
        author = "Ceikry",
        description = "Adds a simple log of varp changes drawn directly to the screen.",
        version = 1.0
)
public class plugin extends Plugin {
    boolean isEnabled = false;

    int MAX_VISIBLE_UPDATES = 5;

    ArrayList<String> varpUpdates = new ArrayList<>();
    ArrayList<String> updateCreationTime = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void Init() {
       if (API.IsHD()) MAX_VISIBLE_UPDATES = 10;
    }

    @Override
    public void OnVarpUpdate(int id, int value) {
        if (!isEnabled) return;

        if (varpUpdates.size() == MAX_VISIBLE_UPDATES) {
            varpUpdates.remove(0);
            updateCreationTime.remove(0);
        }
        varpUpdates.add(id + " =<gt> " + value);
        String formattedTime = sdf.format(new Date());
        updateCreationTime.add(formattedTime);
        System.out.println("[VARP Update]" +  formattedTime + " " + id + "->" + value);
    }

    @Override
    public void Draw(long timeDelta) {
        if (!isEnabled) return;

        int startX = 10;
        int startY = 30;

        API.DrawText(FontType.SMALL, FontColor.YELLOW, TextModifier.LEFT, "Varp Updates:", startX, startY);

        for (int i = 0; i < varpUpdates.size(); i++){
            String update = varpUpdates.get(i);
            String time = updateCreationTime.get(i);

            API.DrawText(
                    FontType.SMALL,
                    FontColor.YELLOW,
                    TextModifier.LEFT,
                    "[" + time + "] " + update,
                    startX,
                    startY + (i + 1) * 15
            );
        }
    }

    @Override
    public void ProcessCommand(String commandStr, String[] args) {
        if (!API.PlayerHasPrivilege(Privileges.JMOD)) return;

        if (commandStr.equalsIgnoreCase("::varplog")) {
            isEnabled = !isEnabled;
        }
    }
}
