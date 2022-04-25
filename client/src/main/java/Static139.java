import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_21 = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!na;")
	public static final JagString aClass100_659 = Static28.parse(")4j");

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_22 = new SoftLruHashTable(4);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)J")
	public static long method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Tile local7 = Static130.aClass3_Sub5ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass24_1 == null ? 0L : local7.aClass24_1.key;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method2704() {
		@Pc(7) int local7 = GameShell.topMargin;
		@Pc(9) int local9 = GameShell.leftMargin;
		@Pc(16) int local16 = GameShell.frameHeight - GameShell.canvasHeight - local7;
		@Pc(23) int local23 = GameShell.frameWidth - local9 - GameShell.canvasWidth;
		if (local9 <= 0 && local23 <= 0 && local7 <= 0 && local16 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (GameShell.fullScreenFrame != null) {
				local46 = GameShell.fullScreenFrame;
			} else if (GameShell.frame == null) {
				local46 = GameShell.signLink.applet;
			} else {
				local46 = GameShell.frame;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (GameShell.frame == local46) {
				@Pc(68) Insets local68 = GameShell.frame.getInsets();
				local61 = local68.left;
				local59 = local68.top;
			}
			@Pc(77) Graphics local77 = local46.getGraphics();
			local77.setColor(Color.black);
			if (local9 > 0) {
				local77.fillRect(local61, local59, local9, GameShell.frameHeight);
			}
			if (local7 > 0) {
				local77.fillRect(local61, local59, GameShell.frameWidth, local7);
			}
			if (local23 > 0) {
				local77.fillRect(local61 + GameShell.frameWidth - local23, local59, local23, GameShell.frameHeight);
			}
			if (local16 > 0) {
				local77.fillRect(local61, local59 + GameShell.frameHeight - local16, GameShell.frameWidth, local16);
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
