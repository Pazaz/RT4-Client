package RememberMyLogin

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import rt4.Component
import rt4.JagString
import rt4.Player

@PluginMeta (
    author = "Ceikry",
    description = "Stores your last used login for automatic reuse",
    version = 1.0
)
class plugin : Plugin() {
    var hasRan = false
    var username = ""
    var password = ""

    override fun Init() {
        username = API.GetData("login-user") as? String ?: ""
        password = API.GetData("login-pass") as? String ?: ""
    }

    override fun ComponentDraw(componentIndex: Int, component: Component?, screenX: Int, screenY: Int) {
        if (hasRan || API.IsLoggedIn()) return
        if (component!!.text == JagString.of("Please Log In")) {
            API.SetVarcStr(32, username)
            API.SetVarcStr(33, password)
            hasRan = true
        }
    }

    override fun OnLogin() {
        username = String(Player.usernameInput.chars)
        password = String(Player.password.chars)
        API.StoreData("login-user", username)
        API.StoreData("login-pass", password)
    }

    override fun OnLogout() {
        hasRan = false
    }
}