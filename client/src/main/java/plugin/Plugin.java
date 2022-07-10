package plugin;

import rt4.Npc;
import rt4.Player;

/**
 * The base plugin class which is meant to be extended by plugins.
 * Contains callbacks to many parts of the internal client code.
 * @author ceikry
 */
public abstract class Plugin {
    long timeOfLastDraw;

    void _init() {
        Init();
    }

    void _draw() {
        long nowTime = System.currentTimeMillis();
        Draw(nowTime - timeOfLastDraw);
        timeOfLastDraw = nowTime;
    }

    /**
     * Draw() is called by the client rendering loop so that plugins can draw information onto the screen.
     * This will be called once per frame, meaning it is framerate bound.
     * @param timeDelta the time (ms) elapsed since the last draw call.
     */
    public void Draw(long timeDelta) {}

    /**
     * Init() is called when the plugin is first loaded
     */
    public void Init() {}

    /**
     * OnXPUpdate() is called when the client receives an XP update packet. This includes at login.
     */
    public void OnXPUpdate() {}

    /**
     * Update() is called once per tick, aka once every 600ms.
     */
    public void Update() {}

    /**
     * PlayerOverheadDraw() is called once per frame, for every player on the screen. :) Expensive.
     * @param screenX the X coordinate on the screen for overhead drawing
     * @param screenY the Y coordinate on the screen for overhead drawing
     */
    public void PlayerOverheadDraw(Player player, int screenX, int screenY) {}

    /**
     * NPCOverheadDraw() is called once per frame, for every NPC on the screen. :) Expensive.
     * @param screenX the X coordinate on the screen for overhead drawing
     * @param screenY the Y coordinate on the screen for overhead drawing
     */
    public void NPCOverheadDraw(Npc npc, int screenX, int screenY) {}

    public void ProcessCommand(String commandStr, String[] args) {}
}
