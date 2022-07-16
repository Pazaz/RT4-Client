package XPDropPlugin;
    
import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.*
import java.awt.Color
import kotlin.math.ceil

@PluginMeta(
    author = "Ceikry",
    description = "Draws nice and clean experience drops onto the screen.",
    version = 1.2
)
class plugin : Plugin() {
    private val displayTimeout = 10000L // 10 seconds
    private val drawStart = 175
    private val drawPadding = 25
    private val drawClear = 60
    private val lastXp = IntArray(24)
    private var totalXp = 0
    private val activeGains = ArrayList<XPGain>()
    private var lastGain = 0L

    override fun Draw(deltaTime: Long) {
        if (System.currentTimeMillis() - lastGain >= displayTimeout && activeGains.isEmpty())
            return

        drawTotalXPBox()

        val removeList = ArrayList<XPGain>()
        var posX = API.GetWindowDimensions().width / 2

        if (API.GetWindowMode() == WindowMode.FIXED)
            posX += 60

        for(gain in activeGains) {
            gain.currentPos -= ceil(deltaTime / 20.0).toInt()
            if (gain.currentPos <= drawClear) {
                removeList.add(gain)
                totalXp += gain.xp
            } else if (gain.currentPos <= drawStart){
                val sprite = XPSprites.getSpriteForSkill(skillId = gain.skill)
                sprite?.render(posX - 25, gain.currentPos - 20)
                API.DrawText(
                    FontType.SMALL,
                    FontColor.fromColor(Color.WHITE),
                    TextModifier.LEFT,
                    addCommas(gain.xp.toString()),
                    posX,
                    gain.currentPos
                )
            }
        }

        activeGains.removeAll(removeList.toSet())
    }

    override fun OnXPUpdate(skill: Int, xp: Int) {
        if (xp == lastXp[skill]) return

        val gain = xp - lastXp[skill]
        if (gain <= 0) return

        if (lastXp[skill] == 0) {
            lastXp[skill] = xp
            totalXp += xp
            return
        }
        lastXp[skill] = xp

        val currentTail = try {
            activeGains.last().currentPos
        } catch (e: Exception) {
            drawStart - drawPadding
        }

        activeGains.add(XPGain(skill, gain, currentTail + drawPadding))
        lastGain = System.currentTimeMillis()
    }

    override fun OnLogout() {
        lastGain = 0L
        for (i in 0 until 24) lastXp[i] = 0
        totalXp = 0
        activeGains.clear()
    }

    private fun drawTotalXPBox() {
        var posX = API.GetWindowDimensions().width / 2
        val posY = API.GetWindowDimensions().height / 4

        if (API.GetWindowMode() == WindowMode.FIXED)
            posX += 60

        API.ClipRect(0, 0, posX * 2, posY * 4)

        val horizontal = API.GetSprite(822)
        val horizontalTop = API.GetSprite(820)
        val tlCorner = API.GetSprite(824)
        val blCorner = API.GetSprite(826)
        val trCorner = API.GetSprite(825)
        val brCorner = API.GetSprite(827)
        val bg = API.GetSprite(657)

        bg?.render(posX - 77, 10)
        API.FillRect(posX - 75, 5, 140, 30, 0, 64)

        blCorner?.render(posX - 77, 10)
        tlCorner?.render(posX - 77, 5)
        trCorner?.render(posX + 41, 5)
        brCorner?.render(posX + 41, 10)

        horizontalTop?.render(posX - 45, -8)
        horizontal?.render(posX - 45, 22)
        horizontalTop?.render(posX - 15, -8)
        horizontal?.render(posX - 15, 22)
        horizontalTop?.render(posX + 9, -8)
        horizontal?.render(posX + 9, 22)

        API.DrawText(
            FontType.SMALL,
            FontColor.fromColor(Color.WHITE),
            TextModifier.LEFT,
            "Total Xp: ${addCommas(totalXp.toString())}",
            posX - 65,
            28
        )
    }

    data class XPGain(val skill: Int, val xp: Int, var currentPos: Int)

    fun addCommas(num: String): String{
        var newString = ""
        if(num.length > 9){
            return "Lots!"
        }
        var counter = 1
        num.reversed().forEach {
            if(counter % 3 == 0 && counter != num.length){
                newString += "$it,"
            } else {
                newString += it
            }
            counter++
        }
        return newString.reversed()
    }
}
