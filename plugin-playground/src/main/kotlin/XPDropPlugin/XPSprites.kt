package XPDropPlugin

import plugin.api.API
import rt4.Sprite

object XPSprites {
    fun getSpriteForSkill(skillId: Int) : Sprite? {
        return API.GetSprite(getSpriteId(skillId))
    }

    private fun getSpriteId(skillId: Int) : Int {
        return when (skillId) {
            0 -> 197
            1 -> 199
            2 -> 198
            3 -> 203
            4 -> 200
            5 -> 201
            6 -> 202
            7 -> 212
            8 -> 214
            9 -> 208
            10 -> 211
            11 -> 213
            12 -> 207
            13 -> 210
            14 -> 209
            15 -> 205
            16 -> 204
            17 -> 206
            18 -> 216
            19 -> 217
            20 -> 215
            21 -> 220
            22 -> 221
            23 -> 222
            else -> 222
        }
    }
}