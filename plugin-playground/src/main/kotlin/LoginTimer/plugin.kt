package LoginTimer

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import plugin.api.MiniMenuEntry
import rt4.Component
import rt4.JagString
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

/**
 * Timer/SysTime that goes over the report abuse button
 * @author Woah
 */
@PluginMeta(
    author = "Woahscam, Ceikry",
    description = "Displays the session time played, system time, or no time over the \"Report Abuse\" button.",
    version = 1.2
)
class plugin : Plugin() {

    private val COMPONENT_REPORT_ABUSE = 49217565
    private val DEFAULT_TIME_MODE = 0
    private val PLAY_TIME_TIME_MODE = 1
    private val LOCAL_TIME_TIME_MODE = 2
    private val TIME_MODE_EMPTY = 3
    private val TIME_MODE_INITIALIZATION = 4

    private var timeMode = TIME_MODE_INITIALIZATION
    private var initTime: Long = 0
    private var displayMessageCounter = 0

    private var component: Component? = null

    override fun Init() {
        timeMode = TIME_MODE_INITIALIZATION
        initTime = System.currentTimeMillis()
        displayMessageCounter = 0
    }

    override fun Draw(timeDelta: Long) {
        if (component == null)
            return
        when (timeMode) {
            DEFAULT_TIME_MODE -> {
                if (component != null) {
                    if (component?.id == COMPONENT_REPORT_ABUSE) {
                        component?.text = JagString.parse("Report Abuse")
                        timeMode = TIME_MODE_EMPTY
                    }
                }
            }
            PLAY_TIME_TIME_MODE -> {
                val passedTime = System.currentTimeMillis() - initTime
                val hrs = TimeUnit.MILLISECONDS.toHours(passedTime).toInt() % 24
                val min = TimeUnit.MILLISECONDS.toMinutes(passedTime).toInt() % 60
                val sec = TimeUnit.MILLISECONDS.toSeconds(passedTime).toInt() % 60
                val timeInHHMMSS = String.format("%02d:%02d:%02d", hrs, min, sec);
                if (component != null) {
                    if (component?.id == COMPONENT_REPORT_ABUSE) {
                        component?.text = JagString.parse(timeInHHMMSS)
                    }
                }
            }
            LOCAL_TIME_TIME_MODE -> {
                val now = LocalDateTime.now()
                val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
                val formattedTime = now.format(formatter)
                if (component != null) {
                    if (component?.id == COMPONENT_REPORT_ABUSE) {
                        component?.text = JagString.parse(formattedTime)
                    }
                }
            }
            TIME_MODE_EMPTY -> { /*Nothing*/ }
            TIME_MODE_INITIALIZATION -> {
                val now = LocalDateTime.now()
                val formatter = DateTimeFormatter.ofPattern("HH")
                val formattedTime = now.format(formatter)
                if (component != null) {
                    if (component?.id == COMPONENT_REPORT_ABUSE) {
                        val hour = formattedTime.toInt()
                        val welcomeString = when (hour) {
                            in 0..11 -> "Good morning!"
                            in 12..17 -> "Good afternoon!"
                            in 17..23 -> "Good evening!"
                            else -> { "Hello!" }
                        }
                        component?.text = JagString.parse(welcomeString)
                        if (displayMessageCounter in 0..400) {
                            displayMessageCounter++
                        }
                        if (displayMessageCounter > 400 && displayMessageCounter != -1) {
                            displayMessageCounter = -1
                            timeMode = PLAY_TIME_TIME_MODE
                        }
                    }
                }
            }
            else -> {
                timeMode = DEFAULT_TIME_MODE
            }
        }
    }

    // This is done in the main component draw so the users who plain in SD will have their time updated
    // Without having to interact with the interface
    override fun ComponentDraw(componentIndex: Int, component: Component?, screenX: Int, screenY: Int) {
        if (component?.id == COMPONENT_REPORT_ABUSE)
            this.component = component
    }

    override fun ProcessCommand(commandStr: String, args: Array<String?>?) {
        if (commandStr.equals("::playedtime", ignoreCase = true)) {
            timeMode = 1
        } else if (commandStr.equals("::systime", ignoreCase = true)) {
            timeMode = 2
        } else if (commandStr.equals("::notime", ignoreCase = true)) {
            timeMode = 0
        }
    }

    override fun OnMiniMenuCreate(currentEntries: Array<out MiniMenuEntry>) {
        var hasReportAbuse = false
        for (entry in currentEntries) {
            if (entry.verb == "Report Abuse")
                hasReportAbuse = true
        }

        if (hasReportAbuse) {
            API.InsertMiniMenuEntry("Play Time", "") {
                timeMode = PLAY_TIME_TIME_MODE
            }
            API.InsertMiniMenuEntry("Local Time", "") {
                timeMode = LOCAL_TIME_TIME_MODE
            }
            API.InsertMiniMenuEntry("Disable Timer", "") {
                timeMode = DEFAULT_TIME_MODE
            }
        }
    }
}