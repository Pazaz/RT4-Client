package LeftClickAttack

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.MiniMenuEntry

@PluginMeta(
    author = "bushtail",
    description = "Provides left-click attack for level > 128 combat.",
    version = 1.0
)
class plugin : Plugin() {
    override fun OnMiniMenuCreate(currentEntries: Array<out MiniMenuEntry>?) {
        if (currentEntries == null) return
        for (entry in currentEntries) {
            if(entry.verb.toLowerCase() == "attack" && entry.isStrictlySecondary)
                entry.toggleStrictlySecondary()
        }
    }
}