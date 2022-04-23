import java.awt.Component;
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

	public static final int KEY_CTRL = 80;
	public static final int KEY_SHIFT = 81;
	public static final int KEY_ALT = 86;
	public static final int KEY_LEFT = 96;
	public static final int KEY_RIGHT = 97;
	public static final int KEY_UP = 98;
	public static final int KEY_DOWN = 99;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[I")
	public static final int[] eventQueue = new int[128];

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[I")
	public static final int[] CODE_MAP = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
	public static final int[] typedCodeQueue = new int[128];

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[I")
	public static final int[] typedCharQueue = new int[128];

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "[Z")
	public static final boolean[] pressedKeys = new boolean[112];

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	public static int eventQueueWriterIndex = 0;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static int eventQueueReaderIndex = 0;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int typedQueueWriterIndex = 0;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
	public static int typedQueueReaderIndex = 0;

	@OriginalMember(owner = "client!an", name = "ab", descriptor = "Lclient!uf;")
	public static Keyboard instance = new Keyboard();

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
	public static volatile int idleLoops = 0;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public static int prevTypedQueueWriterIndex = 0;

	@OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
	public static int keyCode;

	@OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
	public static int keyChar;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void stop(@OriginalArg(0) Component component) {
		component.removeKeyListener(instance);
		component.removeFocusListener(instance);
		eventQueueWriterIndex = -1;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void loop() {
		@Pc(12) Keyboard keyboard = instance;
		synchronized (instance) {
			typedQueueReaderIndex = prevTypedQueueWriterIndex;
			idleLoops++;
			@Pc(23) int key;
			if (eventQueueWriterIndex < 0) {
				for (key = 0; key < 112; key++) {
					pressedKeys[key] = false;
				}
				eventQueueWriterIndex = eventQueueReaderIndex;
			} else {
				while (eventQueueWriterIndex != eventQueueReaderIndex) {
					key = eventQueue[eventQueueReaderIndex];
					eventQueueReaderIndex = eventQueueReaderIndex + 1 & 0x7F;
					if (key >= 0) {
						pressedKeys[key] = true;
					} else {
						pressedKeys[~key] = false;
					}
				}
			}
			prevTypedQueueWriterIndex = typedQueueWriterIndex;
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
	public static boolean nextKey() {
		@Pc(6) Keyboard local6 = instance;
		synchronized (instance) {
			if (prevTypedQueueWriterIndex == typedQueueReaderIndex) {
				return false;
			} else {
				keyCode = typedCodeQueue[typedQueueReaderIndex];
				keyChar = typedCharQueue[typedQueueReaderIndex];
				typedQueueReaderIndex = typedQueueReaderIndex + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
	public static int getKeyChar(@OriginalArg(1) KeyEvent event) {
		@Pc(6) int c = event.getKeyChar();
		if (c == 8364) {
			return 128;
		} else {
			if (c <= 0 || c >= 256) {
				c = -1;
			}
			return c;
		}
	}

	@OriginalMember(owner = "client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyPressed(@OriginalArg(0) KeyEvent event) {
		if (instance == null) {
			return;
		}

		idleLoops = 0;
		@Pc(7) int code = event.getKeyCode();
		if (code >= 0 && CODE_MAP.length > code) {
			code = CODE_MAP[code];
			if ((code & 0x80) != 0) {
				code = -1;
			}
		} else {
			code = -1;
		}
		if (eventQueueWriterIndex >= 0 && code >= 0) {
			eventQueue[eventQueueWriterIndex] = code;
			eventQueueWriterIndex = eventQueueWriterIndex + 1 & 0x7F;
			if (eventQueueWriterIndex == eventQueueReaderIndex) {
				eventQueueWriterIndex = -1;
			}
		}
		if (code >= 0) {
			@Pc(68) int index = typedQueueWriterIndex + 1 & 0x7F;
			if (index != typedQueueReaderIndex) {
				typedCodeQueue[typedQueueWriterIndex] = code;
				typedCharQueue[typedQueueWriterIndex] = -1;
				typedQueueWriterIndex = index;
			}
		}
		int modifiers = event.getModifiers();
		if ((modifiers & 0xA) != 0 || code == 85 || code == 10) {
			event.consume();
		}
	}

	@OriginalMember(owner = "client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final void keyTyped(@OriginalArg(0) KeyEvent event) {
		if (instance != null) {
			@Pc(9) int c = getKeyChar(event);
			if (c >= 0) {
				@Pc(21) int index = typedQueueWriterIndex + 1 & 0x7F;
				if (typedQueueReaderIndex != index) {
					typedCodeQueue[typedQueueWriterIndex] = -1;
					typedCharQueue[typedQueueWriterIndex] = c;
					typedQueueWriterIndex = index;
				}
			}
		}
		event.consume();
	}

	@OriginalMember(owner = "client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent event) {
		if (instance != null) {
			eventQueueWriterIndex = -1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public final synchronized void keyReleased(@OriginalArg(0) KeyEvent event) {
		if (instance != null) {
			idleLoops = 0;
			@Pc(11) int c = event.getKeyCode();
			if (c >= 0 && CODE_MAP.length > c) {
				c = CODE_MAP[c] & 0xFFFFFF7F;
			} else {
				c = -1;
			}
			if (eventQueueWriterIndex >= 0 && c >= 0) {
				eventQueue[eventQueueWriterIndex] = ~c;
				eventQueueWriterIndex = eventQueueWriterIndex + 1 & 0x7F;
				if (eventQueueReaderIndex == eventQueueWriterIndex) {
					eventQueueWriterIndex = -1;
				}
			}
		}
		event.consume();
	}

	@OriginalMember(owner = "client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent event) {
	}
}
