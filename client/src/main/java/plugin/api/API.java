package plugin.api;

import rt4.Font;
import rt4.Fonts;
import rt4.JagString;

public class API {
    public static void DrawText(FontType fontType, FontColor color, TextModifier mod, String text, int screenX, int screenY) {
        JagString js = JagString.parse(text);

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
}
