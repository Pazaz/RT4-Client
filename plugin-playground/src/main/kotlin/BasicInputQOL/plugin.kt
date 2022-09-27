package BasicInputQOL

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.*
import rt4.Keyboard
import java.awt.event.*
import javax.swing.SwingUtilities

@PluginMeta(
   author = "Ceikry",
   description = "Provides some basic input QOL like scroll zoom, middle click panning, etc.",
   version = 1.0
)
class plugin : Plugin() {
    private var cameraDebugEnabled = false
    private var mouseDebugEnabled = false

    companion object {
        private var lastMouseWheelX = 0
        private var lastMouseWheelY = 0
        private val defaultCameraPYZ = Triple(128.0, 0.0, 600)
    }

    override fun Init() {
        API.AddMouseListener(MouseCallbacks)
        API.AddMouseWheelListener(MouseWheelCallbacks)
    }

    override fun ProcessCommand(commandStr: String?, args: Array<out String>?) {
        commandStr ?: return
        if (API.PlayerHasPrivilege(Privileges.JMOD)) {
            when(commandStr) {
                "::mousedebug" -> mouseDebugEnabled = !mouseDebugEnabled
                "::cameradebug" -> cameraDebugEnabled = !cameraDebugEnabled
            }
        }
    }

    override fun Draw(timeDelta: Long) {
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

    object MouseWheelCallbacks : MouseWheelListener {
        override fun mouseWheelMoved(e: MouseWheelEvent?) {
            e ?: return
            if (API.IsKeyPressed(Keyboard.KEY_SHIFT)) {
                val previous = API.GetPreviousMouseWheelRotation()
                val current = API.GetMouseWheelRotation()
                val diff = current - previous
                API.UpdateCameraZoom(diff)
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