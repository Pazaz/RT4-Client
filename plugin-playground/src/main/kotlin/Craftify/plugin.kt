package Craftify

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import plugin.api.FontColor
import plugin.api.FontType
import plugin.api.TextModifier
import rt4.Fonts
import rt4.Player
import java.awt.Color


@PluginMeta(
    author = "bushtail",
    description = "Reupload of the old plugin I lost the source for.",
    version = 1.0
)
class plugin : Plugin() {

    override fun PlayerOverheadDraw(player: Player?, screenX: Int, screenY: Int) {
        if(player == null) return
        val width = Fonts.p11Full.getStringWidth(player.username)
        API.FillRect(screenX - width / 2, screenY - 12, width, 14, FontColor.fromColor(Color.BLACK).colorCode, 84)
        API.DrawText(FontType.SMALL, FontColor.fromColor(Color.WHITE), TextModifier.CENTER, player.username.toString(), screenX, screenY)
    }
}
