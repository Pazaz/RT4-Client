package BetterShiftDrop

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import plugin.api.MiniMenuEntry
import rt4.Cheat
import rt4.Keyboard

@PluginMeta(
    author = "bushtail",
    description = "Better dropping and destroying while holding shift.",
    version = 1.0
)
class plugin : Plugin() {
    override fun Init() {
        Cheat.shiftClick = false
    }
    override fun OnMiniMenuCreate(currentEntries: Array<out MiniMenuEntry>?) {
        if(currentEntries == null) return
        if(API.IsKeyPressed(Keyboard.KEY_SHIFT)) {
            for(entry in currentEntries) {
                if(entry.verb.toLowerCase() == "drop" || entry.verb.toLowerCase() == "destroy") continue
                if(!entry.isStrictlySecondary) entry.toggleStrictlySecondary()
            }
        }
    }
}