package plugin.api;

import rt4.*;
import rt4.DisplayMode;
import rt4.Font;

import java.awt.*;

/**
 * API used for writing plugins, so dozens of plugins don't break when we rename shit :)
 * @author ceikry
 */
public class API {
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
}
