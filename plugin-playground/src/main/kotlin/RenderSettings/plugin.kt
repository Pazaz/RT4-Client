package RenderSettings

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import rt4.GlobalConfig

@PluginMeta(
    author = "Enova",
    description = "Provides configuration for various parts of the game's rendering like render distance.",
    version = 1.0
)
class plugin : Plugin() {
    private var viewDistanceKey = "view-distance"

    override fun Init() {
        GlobalConfig.TILE_DISTANCE = API.GetData(viewDistanceKey) as? Int ?: return;
        GlobalConfig.VIEW_DISTANCE = GlobalConfig.TILE_DISTANCE * 128
        GlobalConfig.VIEW_FADE_DISTANCE = GlobalConfig.TILE_DISTANCE.toFloat() / 28.0f * 256.0f
    }

    override fun ProcessCommand(commandStr: String?, args: Array<out String>?) {
        when(commandStr) {
            "::viewDistance" -> {
                args?: return
                val distanceArg = args[0].toInt();
                if (distanceArg > 0) {
                    API.StoreData(viewDistanceKey, distanceArg)
                    printRestartWarning()
                }
            }
        }
    }

    private fun printRestartWarning() {
        API.SendMessage("Configuration updated. Changes won't apply until you restart the game.")
    }
}
