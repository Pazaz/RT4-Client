package SlayerTrackerPlugin
    
import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import plugin.api.FontColor
import plugin.api.FontType
import plugin.api.TextModifier
import rt4.Sprite
import java.awt.Color
import java.lang.Exception

@PluginMeta(
    author = "Ceikry",
    description = "Draws a simple slayer task tracker onto the screen if one is active.",
    version = 1.0
)
class plugin : Plugin() {
    val boxColor = 6116423
    val posX = 5
    val posY = 30
    val boxWidth = 90
    val boxHeight = 30
    val boxOpacity = 160
    val textX = 65
    val textY = 50
    val spriteX = 7
    val spriteY = 30

    var slayerTaskID = -1
    var slayerTaskAmount = 0
    var curSprite: Sprite? = null

    override fun Draw(deltaTime: Long) {
        if (slayerTaskAmount == 0 || slayerTaskID == -1) return

        API.FillRect(posX, posY, boxWidth, boxHeight, boxColor, boxOpacity)
        curSprite?.render(spriteX, spriteY)
        API.DrawText(
            FontType.SMALL,
            FontColor.fromColor(Color.WHITE),
            TextModifier.LEFT,
            slayerTaskAmount.toString(),
            textX,
            textY
        )
    }

    override fun OnVarpUpdate(id: Int, value: Int) {
        if (id == 2502) {
            slayerTaskID = value and 0x7F
            slayerTaskAmount = (value shr 7) and 0xFF
            setSprite()
        }
    }

    override fun OnLogout() {
        slayerTaskID = -1
        slayerTaskAmount = 0
        curSprite = null
    }

    private fun setSprite() {
        try {
            val itemId: Int = when (slayerTaskID) {
                0 -> 4144
                1 -> 4149
                2 -> 560
                3 -> 10176
                4 -> 4135
                5 -> 4139
                6 -> 14072
                7 -> 948
                8 -> 12189
                9 -> 3098
                10 -> 1747
                11 -> 4141
                12 -> 1751
                13 -> 11047
                14 -> 2349
                15 -> 9008
                16 -> 4521
                17 -> 4134
                18 -> 8900
                19 -> 4520
                20 -> 4137
                21 -> 1739
                22 -> 7982
                23 -> 10149
                24 -> 532
                25 -> 8141
                26 -> 6637
                27 -> 6695
                28 -> 8132
                29 -> 4145
                30 -> 7500
                31 -> 1422
                32 -> 1387
                33 -> 9011
                34 -> 4147
                35 -> 552
                36 -> 6722
                37 -> 10998
                38 -> 9016
                39 -> 2402
                40 -> 1753
                41 -> 7050
                42 -> 8137
                43 -> 12570
                44 -> 8133
                45 -> 4671
                46 -> 4671
                47 -> 1159
                48 -> 4140
                49 -> 2351
                50 -> 4142
                51 -> 7778
                52 -> 8139
                53 -> 4146
                54 -> 2402
                55 -> 2359
                56 -> 12079
                57 -> 12201
                58 -> 12570
                59 -> 4148
                60 -> 4818
                61 -> 6107
                62 -> 4138
                63 -> 14074
                64 -> 4136
                65 -> 6297
                66 -> 10634
                67 -> 553
                68 -> 8135
                69 -> 11732
                70 -> 10284
                71 -> 13923
                72 -> 2353
                73 -> 8136
                74 -> 4143
                75 -> 6528
                76 -> 10109
                77 -> 1403
                78 -> 2952
                79 -> 958
                80 -> 7594
                89 -> 6811
                else -> -1
            }

            val sprite = API.GetObjSprite(itemId, 1, false, 1, 1)

            curSprite = sprite
        } catch (ignored: Exception){}
    }

    //Check the source of plugin.Plugin for more methods you can override! Happy hacking! <3
    //There are also many methods to aid in plugin development in plugin.api.API
}
