package plugin;

import plugin.api.MiniMenuEntry;
import rt4.Component;
import rt4.Npc;
import rt4.Player;
import rt4.Tile;

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
     * @param skill - the skill ID being updated
     * @param xp - the new total XP for the skill.
     */
    public void OnXPUpdate(int skill, int xp) {}

    /**
     * Update() is called once every 1000 client loops.
     * This should be used for things that do need to update occasionally during runtime,
     * but don't need to update super often.
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

    /**
     * ProcessCommand is called when a user types and sends a message prefixed with ::
     * @param commandStr the command the user used - should include :: in comparisons, eg <pre>commandStr.equals("::command")</pre>
     * @param args any other tokens included with the initial message. Tokens are determined by spaces.
     */
    public void ProcessCommand(String commandStr, String[] args) {}

    /**
     * ComponentDraw is called when an interface component is being rendered by the client.
     * @param componentIndex the index of the component in its parent interface.
     * @param component the component itself
     * @param screenX the screen X coordinate of this component
     * @param screenY the screen Y coordinate of this component
     */
    public void ComponentDraw(int componentIndex, Component component, int screenX, int screenY) {}

    /**
     * OnVarpUpdate is called when varps are updated by the server sending packets.
     * @param id the ID of the varp
     * @param value the value the varp is being set to.
     */
    public void OnVarpUpdate(int id, int value) {}

    /**
     * OnLogin is called when the client processes a login.
     */
    public void OnLogin() {}

    /**
     * OnLogout is called when the client logs out. This should be used to clear player-relevant plugin state.
     */
    public void OnLogout() {}

    /**
     * DrawMiniMenu is called when a MiniMenu entry has been created.
     * @param entry the entry
     */
    public void DrawMiniMenu(MiniMenuEntry entry) {}

    /**
     * Called by the client code when we generate the MiniMenu
     * @param currentEntries
     */
    public void OnMiniMenuCreate(MiniMenuEntry[] currentEntries) {}
}
