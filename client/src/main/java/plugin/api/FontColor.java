package plugin.api;

import java.awt.*;

public class FontColor {
    public static FontColor YELLOW = new FontColor(16776960);

    public final int colorCode;

    public FontColor(int colorCode) {
        this.colorCode = colorCode;
    }

    public static FontColor fromColor(Color color) {
        return new FontColor((color.getRed() << 16) + (color.getGreen() << 8) + color.getBlue());
    }
}
