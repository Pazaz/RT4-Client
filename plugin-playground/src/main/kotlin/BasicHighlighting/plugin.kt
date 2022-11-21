package BasicHighlighting


import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.*
import rt4.Fonts
import rt4.Keyboard
import rt4.Npc
import rt4.NpcList
import java.awt.Color


@PluginMeta(
    author = "Chisato",
    description = "Provides basic tagging of NPCS",
    version = 1.0
)
open class plugin : Plugin() {

    val npcIDs = mutableListOf<Int>()

    override fun Update() {
        API.StoreData("tagged_npcs", npcIDs)
    }

    override fun Init() {
        (API.GetData("tagged_npcs") as Collection<Int>?)?.let { npcIDs.addAll(it) }
    }

    override fun NPCOverheadDraw(npc: Npc, screenX: Int, screenY: Int) {
        if (!npcIDs.contains(npc.type.id)) return
        val width = Fonts.p11Full.getStringWidth(npc.type.name) + 6
        API.FillRect(
            screenX - width / 2,
            screenY - 12,
            width,
            14,
            FontColor.fromColor(Color.BLACK).colorCode,
            84
        )
        API.DrawText(
            FontType.SMALL,
            FontColor.fromColor(Color.CYAN),
            TextModifier.CENTER,
            npc.type.name.toString(),
            screenX,
            screenY
        )
    }

    override fun OnMiniMenuCreate(currentEntries: Array<out MiniMenuEntry>) {
        if (!API.IsKeyPressed(Keyboard.KEY_SHIFT)) {
            return
        }
        var isNPC = false
        var npcID = 0L
        for (entry in currentEntries) {
            if (entry.type == MiniMenuType.NPC) {
                isNPC = true
                npcID = entry.subjectIndex
            }
        }
        if (isNPC) {
            val id = npcID
            val npc = NpcList.npcs[id.toInt()]
            val type = npc.type
            if (!npcIDs.contains(type.id)) {
                API.InsertMiniMenuEntry("Tag <col=ffff00>" + type.name, "") {
                    npcIDs.add(type.id)
                }
            } else {
                API.InsertMiniMenuEntry("Untag <col=ffff00>" + type.name, "") {
                    npcIDs.remove(type.id)
                }
            }
        }
    }

}