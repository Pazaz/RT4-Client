package plugin.api;

import plugin.PluginRepository;
import rt4.*;
import rt4.DisplayMode;
import rt4.Font;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import static rt4.MathUtils.clamp;
import static rt4.Player.plane;

/**
 * API used for writing plugins, so dozens of plugins don't break when we rename shit :)
 * @author ceikry
 */
public class API {
    public static Runnable[] miniMenuCustomActions = new Runnable[10];
    public static int customMiniMenuIndex = 0;

    public static void DrawText(FontType fontType, FontColor color, TextModifier mod, String text, int screenX, int screenY) {
        JagString js = JagString.of(text);

        Font font;
        switch (fontType) {
            case SMALL:
                font = Fonts.p11Full;
                break;
            case LARGE:
                font = Fonts.p12Full;
                break;
            case BOLD:
                font = Fonts.b12Full;
                break;
            default:
                return;
        }

        switch (mod) {
            case CENTER:
                font.renderCenter(js, screenX, screenY, color.colorCode, -1);
                break;
            case LEFT:
                font.renderLeft(js, screenX, screenY, color.colorCode, -1);
                break;
            case RIGHT:
                font.renderRight(js, screenX, screenY, color.colorCode, -1);
                break;
            case SHAKE:
                font.renderShake(js, screenX, screenY, color.colorCode, -1, 100);
                break;
            case WAVE:
                font.renderWave(js, screenX, screenY, color.colorCode, -1);
                break;
            case WAVE_2:
                font.renderWave2(js, screenX, screenY, color.colorCode, -1);
                break;
        }
    }

    public static boolean PlayerHasPrivilege(Privileges privilege) {
        return LoginManager.staffModLevel >= privilege.ordinal();
    }

    public static boolean IsHD() {
        return GlRenderer.enabled;
    }

    public static Sprite GetSprite(int spriteId) {
        Sprite rawSprite = null;

        if (client.js5Archive8.isFileReady(spriteId)) {
            rawSprite = SpriteLoader.loadSprites(spriteId, client.js5Archive8);
        }

        return rawSprite;
    }

    public static Sprite GetObjSprite(int objId, int qty, boolean drawText, int outlineType, int shadowIntensity) {
        return Inv.getObjectSprite(outlineType, objId, drawText, qty, shadowIntensity);
    }

    public static WindowMode GetWindowMode() {
        int mode = DisplayMode.getWindowMode();
        switch(mode) {
            case 2:
                return WindowMode.RESIZABLE;
            case 3:
                return WindowMode.FULLSCREEN;
            default:
                return WindowMode.FIXED;
        }
    }

    public static Dimension GetWindowDimensions() {
        return new Dimension(GameShell.canvasWidth, GameShell.canvasHeight);
    }

    public static void FillRect(int x, int y, int width, int height, int color, int alpha) {
        if (IsHD()) {
            if (alpha != 0)
                GlRaster.fillRectAlpha(x,y,width,height,color,alpha);
            else
                GlRaster.fillRect(x,y,width,height,color);
        } else {
            if (alpha != 0)
                SoftwareRaster.fillRectAlpha(x,y,width,height,color,alpha);
            else
                SoftwareRaster.fillRect(x,y,width,height,color);
        }
    }

    public static void DrawRect(int x, int y, int width, int height, int color) {
        if (IsHD()) {
           GlRaster.drawRect(x, y, width, height, color);
        } else {
           SoftwareRaster.drawRect(x, y, width, height, color);
        }
    }

    public static void ClipRect(int x, int y, int width, int height) {
        if (IsHD()) {
            GlRaster.setClip(x,y,width,height);
        } else {
            SoftwareRaster.setClip(x,y,width,height);
        }
    }

    public static void AddMouseListener(MouseAdapter m) {
        GameShell.canvas.addMouseListener(m);
        GameShell.canvas.addMouseMotionListener(m);
    }

    public static void AddMouseWheelListener(MouseWheelListener mw) {
        GameShell.canvas.addMouseWheelListener(mw);
    }

    public static void AddKeyboardListener(KeyAdapter k) {
        GameShell.canvas.addKeyListener(k);
    }

    public static void SetCameraYaw(double targetYaw) {
        Camera.yawTarget = targetYaw;
        Camera.clampCameraAngle();
    }

    public static void UpdateCameraYaw(double yawDiff) {
        Camera.yawTarget += yawDiff;
        Camera.clampCameraAngle();
    }

    public static double GetCameraYaw() {
        return Camera.yawTarget;
    }

    public static void SetCameraPitch(double targetPitch) {
        Camera.pitchTarget = targetPitch;
        Camera.clampCameraAngle();
    }

    public static void UpdateCameraPitch(double pitchDiff) {
        Camera.pitchTarget += pitchDiff;
        Camera.clampCameraAngle();
    }

    public static double GetCameraPitch() {
        return Camera.pitchTarget;
    }

    public static void UpdateCameraZoom(int zoomDiff) {
        Camera.ZOOM = clamp(200, 1200, Camera.ZOOM + (zoomDiff >= 0 ? 50 : -50));
    }

    public static void SetCameraZoom(int zoomTarget) {
        Camera.ZOOM = clamp(200, 1200, zoomTarget);
    }

    public static int GetCameraZoom() {
        return Camera.ZOOM;
    }

    public static int GetMouseWheelRotation() {
        return ((JavaMouseWheel) client.mouseWheel).currentRotation;
    }

    public static int GetPreviousMouseWheelRotation() {
        return ((JavaMouseWheel) client.mouseWheel).previousRotation;
    }

    public static int GetMouseX() {
        return Mouse.currentMouseX;
    }

    public static int GetMouseY() {
        return Mouse.currentMouseY;
    }

    /**
     * Very simple wrapper around the already rename Keyboard checks.
     * @param keycode the keycode to use. Keyboard class has named constants for these
     */
    public static boolean IsKeyPressed(int keycode) {
        return Keyboard.pressedKeys[keycode];
    }

    public static MiniMenuEntry[] GetMiniMenuEntries() {
        ArrayList<MiniMenuEntry> entries = new ArrayList<>();
        for (int i = 0; i < MiniMenu.size; i++) {
            if (MiniMenu.opBases[i] == null) continue;
            entries.add(new MiniMenuEntry(i));
        }
        return entries.toArray(new MiniMenuEntry[]{});
    }

    public static MiniMenuEntry InsertMiniMenuEntry(String verb, String subject, Runnable onClick) {
        if (customMiniMenuIndex == 10) {
            return null;
        }

        MiniMenuEntry entry = new MiniMenuEntry(MiniMenu.size);
        entry.setVerb(verb);
        entry.setSubject(subject);
        MiniMenu.actions[MiniMenu.size] = (short) (9990 + customMiniMenuIndex);
        miniMenuCustomActions[customMiniMenuIndex++] = onClick;
        MiniMenu.size++;
        return entry;
    }

    public static boolean IsLoggedIn() {
        return client.gameState == 30;
    }

    public static void StoreData(String key, Object value) {
        PluginRepository.pluginStorage.put(key, value);
    }

    public static Object GetData(String key) {
        return PluginRepository.pluginStorage.get(key);
    }

    public static void SetVarcStr(int varcId, String str) {
        VarcDomain.varcstrs[varcId] = JagString.of(str);
        VarcDomain.updatedVarcstrs[VarcDomain.updatedVarcstrsWriterIndex++] = varcId;
    }

    public static void SetVarc(int varcId, int value) {
        VarcDomain.varcs[varcId] = value;
        VarcDomain.updatedVarcs[VarcDomain.updatedVarcsWriterIndex++] = varcId;
    }

    public static void SetVarp(int varpId, int value) {
        VarpDomain.setVarbit(varpId, value);
    }

    public static void SetVarbit(int varbitId, int value) {
        VarpDomain.setVarbitClient(varbitId, value);
    }

    public static void DispatchCommand(String command) {
        Cheat.sendCheatPacket(JagString.of(command));
    }

    public static void PlaySound(int volume, int trackId, int delay) {
        SoundPlayer.play(volume, trackId, delay);
    }

    public static void PlayMusic(int volume, int trackId) {
        MidiPlayer.playFadeOut(trackId, client.js5Archive6, volume);
    }

    public static void PlayJingle(int jingleId) {
        MusicPlayer.playJingle(-1, jingleId);
    }

    public static void SetMusicVolume(int volume) {
        Preferences.musicVolume = volume;
    }

    public static int GetMusicVolume() {
        return Preferences.musicVolume;
    }

    public static void SetSoundVolume(int volume) {
        Preferences.soundEffectVolume = volume;
    }

    public static int GetSoundVolume() {
        return Preferences.soundEffectVolume;
    }

    public static void SetAmbientVolume(int volume) {
        Preferences.ambientSoundsVolume = volume;
    }

    public static int GetAmbientVolume() {
        return Preferences.ambientSoundsVolume;
    }

    public static boolean IsMusicPlaying() {
        return MidiPlayer.isPlaying();
    }

    public static boolean IsSoundPlaying() {
        return SoundPlayer.size != 0;
    }

    public static void SendMessage(String message) {
        Chat.add(JagString.EMPTY, 0, JagString.of(message));
    }

    public static void RequestNewSong() {
        SoundPlayer.sendTrackEndPacket();
    }
    public static JagString getHexFromRGB(int red, int green, int blue) {
        String hexFromRGB = String.format("%02X%02X%02X", red, green, blue);
        return JagString.parse("<col=" + hexFromRGB + ">");
    }
    public static void calcEntityScreenPos(int i, int j, int l) {
        if (i < 128 || l < 128 || i > 13056 || l > 13056) {
            ScriptRunner.spriteDrawX = -1;
            ScriptRunner.spriteDrawY = -1;
            return;
        }
        int i1 = SceneGraph.getTileHeight(plane, l, i) - j;
        i -= Camera.renderX;
        i1 -= Camera.anInt40;
        l -= Camera.renderZ;
        int j1 = MathUtils.sin[Camera.cameraPitch];
        int k1 = MathUtils.cos[Camera.cameraPitch];
        int l1 = MathUtils.sin[Camera.cameraYaw];
        int i2 = MathUtils.cos[Camera.cameraYaw];
        int j2 = l * l1 + i * i2 >> 16;
        l = l * i2 - i * l1 >> 16;
        i = j2;
        j2 = i1 * k1 - l * j1 >> 16;
        l = i1 * j1 + l * k1 >> 16;
        i1 = j2;
        // TODO: Add support for HD
        if (l >= 50) {
            ScriptRunner.spriteDrawX = Rasteriser.width / 2 + (i << 9) / l;
            ScriptRunner.spriteDrawY = Rasteriser.height / 2 + (i1 << 9) / l;
        } else {
            ScriptRunner.spriteDrawX = -1;
            ScriptRunner.spriteDrawY = -1;
        }
    }
}
