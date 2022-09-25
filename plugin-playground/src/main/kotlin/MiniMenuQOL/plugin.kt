package MiniMenuQOL

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.*
import rt4.NpcList
import rt4.NpcType
import rt4.ObjType
import rt4.ObjTypeList

@PluginMeta(
    author = "Ceikry",
    description = "Provides debug and some basic QOL for the MiniMenu",
    version = 1.0
)
class plugin : Plugin() {
    private var debugEnabled = false

    override fun ProcessCommand(commandStr: String?, args: Array<out String>?) {
        when (commandStr) {
            "::mmdebug" -> debugEnabled = !debugEnabled
        }
    }

    override fun Draw(timeDelta: Long) {
        if (!debugEnabled) return
        val sb = StringBuilder()
        val entries = API.GetMiniMenuEntries()
        val strings = ArrayList<String>()

        for (entry in entries) {
            sb.append(entry.subject)
            sb.append(" - ")
            sb.append(entry.verb)
            sb.append("(")
            sb.append(entry.actionCode)
            sb.append(")")
            strings.add(sb.toString())
            sb.clear()
        }

        if (debugEnabled) {
            var screenY = 50
            for (string in strings) {
                API.DrawText(
                    FontType.SMALL,
                    FontColor.YELLOW,
                    TextModifier.LEFT,
                    string,
                    10,
                    screenY
                )
                screenY += 10
            }
        }
    }

    override fun DrawMiniMenu(entry: MiniMenuEntry) {
        when (entry.type) {
            MiniMenuType.NPC -> {
                val index = entry.subjectIndex
                val npc = NpcList.npcs[index.toInt()]
                val type = npc.type
                if (debugEnabled && entry.verb.equals("examine", true))
                    entry.subject = entry.subject + "(I:${entry.subjectIndex},ID:${type.id})"
                if (entry.isStrictlySecondary)
                    entry.toggleStrictlySecondary()
            }

            MiniMenuType.LOCATION -> {
                if (debugEnabled && entry.verb.equals("examine", true))
                    entry.subject = entry.subject + "(ID:${entry.subjectIndex})"
            }

            MiniMenuType.PLAYER -> {
                if (debugEnabled && entry.verb.equals("follow", true))
                    entry.subject = entry.subject + "(I:${entry.subjectIndex})"
            }

            MiniMenuType.OBJ -> {
                val def = ObjTypeList.get(entry.subjectIndex.toInt())
                if (debugEnabled)
                    entry.subject = entry.subject + "(ID:${entry.subjectIndex})"
                if (def.cost >= 1000)
                    entry.subject = "<col=cdd162>" + entry.subject.substring(12)
            }
        }
    }
}