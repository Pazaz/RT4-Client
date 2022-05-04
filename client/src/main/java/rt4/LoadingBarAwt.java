package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.awt.Font;

public class LoadingBarAwt {
    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics aFontMetrics1;
    @OriginalMember(owner = "client!lj", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image anImage3;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Color;ZZLclient!na;I)V")
    public static void render(@OriginalArg(0) Color arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) JagString arg2, @OriginalArg(4) int arg3) {
        try {
            @Pc(6) Graphics local6 = GameShell.canvas.getGraphics();
            if (Static222.aFont1 == null) {
                Static222.aFont1 = new Font("Helvetica", 1, 13);
                aFontMetrics1 = GameShell.canvas.getFontMetrics(Static222.aFont1);
            }
            if (arg1) {
                local6.setColor(Color.black);
                local6.fillRect(0, 0, GameShell.canvasWidth, GameShell.canvasHeight);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (anImage3 == null) {
                    anImage3 = GameShell.canvas.createImage(304, 34);
                }
                @Pc(56) Graphics local56 = anImage3.getGraphics();
                local56.setColor(arg0);
                local56.drawRect(0, 0, 303, 33);
                local56.fillRect(2, 2, arg3 * 3, 30);
                local56.setColor(Color.black);
                local56.drawRect(1, 1, 301, 31);
                local56.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                local56.setFont(Static222.aFont1);
                local56.setColor(Color.white);
                arg2.method3112(22, (304 - arg2.method3155(aFontMetrics1)) / 2, local56);
                local6.drawImage(anImage3, GameShell.canvasWidth / 2 - 152, GameShell.canvasHeight / 2 + -18, null);
            } catch (@Pc(134) Exception local134) {
                @Pc(140) int local140 = GameShell.canvasWidth / 2 - 152;
                @Pc(146) int local146 = GameShell.canvasHeight / 2 - 18;
                local6.setColor(arg0);
                local6.drawRect(local140, local146, 303, 33);
                local6.fillRect(local140 + 2, local146 + 2, arg3 * 3, 30);
                local6.setColor(Color.black);
                local6.drawRect(local140 + 1, local146 - -1, 301, 31);
                local6.fillRect(arg3 * 3 + local140 + 2, local146 + 2, 300 - arg3 * 3, 30);
                local6.setFont(Static222.aFont1);
                local6.setColor(Color.white);
                arg2.method3112(local146 + 22, local140 + (-arg2.method3155(aFontMetrics1) + 304) / 2, local6);
            }
            if (client.mainLoadPrimaryText != null) {
                local6.setFont(Static222.aFont1);
                local6.setColor(Color.white);
                client.mainLoadPrimaryText.method3112(GameShell.canvasHeight / 2 - 26, GameShell.canvasWidth / 2 - client.mainLoadPrimaryText.method3155(aFontMetrics1) / 2, local6);
            }
        } catch (@Pc(252) Exception local252) {
            GameShell.canvas.repaint();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void clear() {
        aFontMetrics1 = null;
        Static222.aFont1 = null;
        anImage3 = null;
    }
}
