import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Keyboard implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass149_1 == null) {
			return;
		}
		Static229.anInt5140 = 0;
		@Pc(7) int local7 = arg0.getKeyCode();
		if (local7 >= 0 && Static196.anIntArray407.length > local7) {
			local7 = Static196.anIntArray407[local7];
			if ((local7 & 0x80) != 0) {
				local7 = -1;
			}
		} else {
			local7 = -1;
		}
		if (Static114.anInt5844 >= 0 && local7 >= 0) {
			Static17.anIntArray53[Static114.anInt5844] = local7;
			Static114.anInt5844 = Static114.anInt5844 + 1 & 0x7F;
			if (Static114.anInt5844 == Static227.anInt5087) {
				Static114.anInt5844 = -1;
			}
		}
		@Pc(68) int local68;
		if (local7 >= 0) {
			local68 = Static53.anInt1708 + 1 & 0x7F;
			if (local68 != Static102.anInt2678) {
				Static221.anIntArray375[Static53.anInt1708] = local7;
				Static264.anIntArray413[Static53.anInt1708] = -1;
				Static53.anInt1708 = local68;
			}
		}
		local68 = arg0.getModifiers();
		if ((local68 & 0xA) != 0 || local7 == 85 || local7 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass149_1 != null) {
			@Pc(9) int local9 = Static136.method2650(arg0);
			if (local9 >= 0) {
				@Pc(21) int local21 = Static53.anInt1708 + 1 & 0x7F;
				if (Static102.anInt2678 != local21) {
					Static221.anIntArray375[Static53.anInt1708] = -1;
					Static264.anIntArray413[Static53.anInt1708] = local9;
					Static53.anInt1708 = local21;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static10.aClass149_1 != null) {
			Static114.anInt5844 = -1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static10.aClass149_1 != null) {
			Static229.anInt5140 = 0;
			@Pc(11) int local11 = arg0.getKeyCode();
			if (local11 >= 0 && Static196.anIntArray407.length > local11) {
				local11 = Static196.anIntArray407[local11] & 0xFFFFFF7F;
			} else {
				local11 = -1;
			}
			if (Static114.anInt5844 >= 0 && local11 >= 0) {
				Static17.anIntArray53[Static114.anInt5844] = ~local11;
				Static114.anInt5844 = Static114.anInt5844 + 1 & 0x7F;
				if (Static227.anInt5087 == Static114.anInt5844) {
					Static114.anInt5844 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
