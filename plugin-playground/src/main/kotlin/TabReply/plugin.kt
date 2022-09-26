package TabReply

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent

@PluginMeta (
    author = "Ceikry",
    description = "Allows you to press tab to reply to DMs.",
    version = 1.0
)
class plugin : Plugin() {
    override fun Init() {
        API.AddKeyboardListener(object : KeyAdapter() {
            override fun keyPressed(e: KeyEvent) {
                if (e.keyCode == KeyEvent.VK_TAB)
                    API.DispatchCommand("::reply")
            }
        })
    }
}