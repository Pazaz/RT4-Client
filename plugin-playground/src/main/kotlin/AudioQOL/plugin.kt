package AudioQOL

import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import plugin.api.FontColor
import plugin.api.FontType
import plugin.api.TextModifier
import rt4.Keyboard
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent

@PluginMeta(
    author = "Ceikry",
    description = "Provides some QOL for audio, including better settings persistence",
    version = 1.0
)
class plugin : Plugin() {
    var isMute = false
    var lastVolumes: Triple<Int,Int,Int>? = null

    override fun Update() {
        if (isMute) return
        API.StoreData("sound-vol", API.GetSoundVolume())
        API.StoreData("music-vol", API.GetMusicVolume())
        API.StoreData("amb-vol", API.GetAmbientVolume())
    }

    override fun Init() {
        val soundVol = API.GetData("sound-vol") as? Int ?: 255
        val musicVol = API.GetData("music-vol") as? Int ?: 127
        val ambVol = API.GetData("amb-vol") as? Int ?: 127
        API.SetMusicVolume(soundVol)
        API.SetAmbientVolume(musicVol)
        API.SetSoundVolume(ambVol)

        API.AddKeyboardListener(object : KeyAdapter() {
            override fun keyPressed(e: KeyEvent) {
                if (API.IsKeyPressed(Keyboard.KEY_CTRL) && e.keyCode == KeyEvent.VK_M) {
                    toggleMute()
                }
            }
        })
    }

    private fun toggleMute() {
        isMute = !isMute
        if (isMute) {
            lastVolumes = Triple(API.GetMusicVolume(), API.GetSoundVolume(), API.GetAmbientVolume())
            API.SetMusicVolume(0)
            API.SetSoundVolume(0)
            API.SetAmbientVolume(0)
            API.SendMessage("Audio Muted.")
            if (API.IsMusicPlaying()) {
                API.PlayMusic(0, -1)
            }
        } else {
            API.SetMusicVolume(lastVolumes?.first ?: 255)
            API.SetSoundVolume(lastVolumes?.second ?: 127)
            API.SetAmbientVolume(lastVolumes?.third ?: 127)
            API.SendMessage("Audio Unmuted.")
            if ((lastVolumes?.first ?: 255) > 0) {
                API.RequestNewSong()
            }
        }
    }
}