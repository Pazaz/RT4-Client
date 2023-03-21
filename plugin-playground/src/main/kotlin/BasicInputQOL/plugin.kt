package BasicInputQOL

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.*
import rt4.Keyboard
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseWheelEvent
import java.awt.event.MouseWheelListener
import javax.swing.SwingUtilities

@PluginMeta(
   author = "Ceikry, Enova",
   description = "Provides some basic input QOL like scroll zoom, middle click panning, etc.",
   version = 1.1
)
class plugin : Plugin() {
    private var cameraDebugEnabled = false
    private var mouseDebugEnabled = false
    private var minZoomKey = "min-zoom";
    private var maxZoomKey = "max-zoom";
    private var defaultZoomKey = "default-zoom";

    companion object {
        private var lastMouseWheelX = 0
        private var lastMouseWheelY = 0
        private var minZoom = 200;
        private var maxZoom = 1200;
        private val defaultCameraPYZ = Triple(128.0, 0.0, 600)
    }

    override fun Init() {
        minZoom = API.GetData(minZoomKey) as? Int ?: minZoom
        maxZoom = API.GetData(maxZoomKey) as? Int ?: maxZoom
        API.AddMouseListener(MouseCallbacks)
        API.AddMouseWheelListener(MouseWheelCallbacks)
    }

    override fun ProcessCommand(commandStr: String?, args: Array<out String>?) {
        commandStr ?: return

        when(commandStr) {
            "::minZoom" -> {
                args ?: return
                minZoom = args[0].toInt()
                API.StoreData(minZoomKey, minZoom)
            }
            "::maxZoom" -> {
                args ?: return
                maxZoom = args[0].toInt()
                API.StoreData(maxZoomKey, maxZoom)
            }
        }

        if (API.PlayerHasPrivilege(Privileges.JMOD)) {
            when(commandStr) {
                "::mousedebug" -> mouseDebugEnabled = !mouseDebugEnabled
                "::cameradebug" -> cameraDebugEnabled = !cameraDebugEnabled
            }
        }
    }

    override fun Tick() {
        if (!API.IsLoggedIn())
            return;

        storeDefaultZoom()
    }

    private fun storeDefaultZoom() {
        API.StoreData(defaultZoomKey, API.GetCameraZoom())
    }

    private fun loadDefaultZoom() {
        val zoom: Int = API.GetData(defaultZoomKey) as? Int ?: return

        API.SetCameraZoom(zoom, minZoom, maxZoom)
    }

    override fun Draw() {
        if (mouseDebugEnabled) {
            API.DrawText(
                FontType.SMALL,
                FontColor.YELLOW,
                TextModifier.LEFT,
                "Mouse Coords: (${API.GetMouseX()}, ${API.GetMouseY()})",
                10,
                40
            )
        }
        if (cameraDebugEnabled) {
            API.DrawText(
                FontType.SMALL,
                FontColor.YELLOW,
                TextModifier.LEFT,
                "Camera: [P=${API.GetCameraPitch()}, Y=${API.GetCameraYaw()}, Z=${API.GetCameraZoom()}]",
                10,
                50
            )
        }
    }

    override fun OnLogin() {
        loadDefaultZoom()
    }

    override fun OnLogout() {
        storeDefaultZoom()
    }

    object MouseWheelCallbacks : MouseWheelListener {
        override fun mouseWheelMoved(e: MouseWheelEvent?) {
            e ?: return
            if (API.IsKeyPressed(Keyboard.KEY_SHIFT)) {
                val previous = API.GetPreviousMouseWheelRotation()
                val current = API.GetMouseWheelRotation()
                val diff = current - previous
                API.UpdateCameraZoom(diff, minZoom, maxZoom)
            }
        }
    }

    object MouseCallbacks : MouseAdapter() {
        override fun mouseDragged(e: MouseEvent?) {
           e ?: return
           if (SwingUtilities.isMiddleMouseButton(e)) {
               val x = e.x
               val y = e.y
               val accelX = lastMouseWheelX - x
               val accelY = lastMouseWheelY - y
               lastMouseWheelX = x
               lastMouseWheelY = y
               API.UpdateCameraYaw(accelX * 2.0)
               API.UpdateCameraPitch(-accelY * 2.0)
           }
        }

        override fun mouseClicked(e: MouseEvent?) {
            e ?: return

/*            val width = API.GetWindowDimensions().width;
            val compassBordersX = intArrayOf(width - 165, width - 125)
            val compassBordersY = intArrayOf(0, 45)

            if (
                e.x in compassBordersX[0]..compassBordersX[1]
                && e.y in compassBordersY[0]..compassBordersY[1]
            )
            {
                API.SetCameraPitch(defaultCameraPYZ.first)
                API.SetCameraYaw(defaultCameraPYZ.second)
            }*/
        }

        override fun mousePressed(e: MouseEvent?) {
            e ?: return
            if (SwingUtilities.isMiddleMouseButton(e)) {
                lastMouseWheelX = e.x
                lastMouseWheelY = e.y
            }
        }
    }
}