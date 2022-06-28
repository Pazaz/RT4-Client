package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import java.util.Arrays;

@OriginalClass("client!uf")
public final class Keyboard implements KeyListener, FocusListener {

	public static final int KEY_SHIFT = 81;
	public static final int KEY_CTRL = 82;
	public static final int KEY_ENTER = 84;
	public static final int KEY_BACK_SPACE = 85;
	public static final int KEY_ALT = 86;
	public static final int KEY_LEFT = 96;
	public static final int KEY_RIGHT = 97;
	public static final int KEY_UP = 98;
	public static final int KEY_DOWN = 99;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[I")
	public static final int[] eventQueue = new int[128];

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[I")
	public static final int[] CODE_MAP = new int[521];

	static {
		Arrays.fill(CODE_MAP, -1);
		CODE_MAP[KeyEvent.VK_BACK_SPACE] = 85;
		CODE_MAP[KeyEvent.VK_TAB] = 80;
		CODE_MAP[KeyEvent.VK_ENTER] = 84;
		//
		CODE_MAP[KeyEvent.VK_CLEAR] = 91;
		//
		CODE_MAP[KeyEvent.VK_SHIFT] = 81;
		CODE_MAP[KeyEvent.VK_CONTROL] = 82;
		CODE_MAP[KeyEvent.VK_ALT] = 86;
		//
		CODE_MAP[KeyEvent.VK_ESCAPE] = 13;
		//
		CODE_MAP[KeyEvent.VK_SPACE] = 83;
		CODE_MAP[KeyEvent.VK_PAGE_UP] = 104;
		CODE_MAP[KeyEvent.VK_PAGE_DOWN] = 105;
		CODE_MAP[KeyEvent.VK_END] = 103;
		CODE_MAP[KeyEvent.VK_HOME] = 102;
		CODE_MAP[KeyEvent.VK_LEFT] = 96;
		CODE_MAP[KeyEvent.VK_UP] = 98;
		CODE_MAP[KeyEvent.VK_RIGHT] = 97;
		CODE_MAP[KeyEvent.VK_DOWN] = 99;
		//
		CODE_MAP[KeyEvent.VK_0] = 25;
		CODE_MAP[KeyEvent.VK_1] = 16;
		CODE_MAP[KeyEvent.VK_2] = 17;
		CODE_MAP[KeyEvent.VK_3] = 18;
		CODE_MAP[KeyEvent.VK_4] = 19;
		CODE_MAP[KeyEvent.VK_5] = 20;
		CODE_MAP[KeyEvent.VK_6] = 21;
		CODE_MAP[KeyEvent.VK_7] = 22;
		CODE_MAP[KeyEvent.VK_8] = 23;
		CODE_MAP[KeyEvent.VK_9] = 24;
		//
		CODE_MAP[KeyEvent.VK_A] = 48;
		CODE_MAP[KeyEvent.VK_B] = 68;
		CODE_MAP[KeyEvent.VK_C] = 66;
		CODE_MAP[KeyEvent.VK_D] = 50;
		CODE_MAP[KeyEvent.VK_E] = 34;
		CODE_MAP[KeyEvent.VK_F] = 51;
		CODE_MAP[KeyEvent.VK_G] = 52;
		CODE_MAP[KeyEvent.VK_H] = 53;
		CODE_MAP[KeyEvent.VK_I] = 39;
		CODE_MAP[KeyEvent.VK_J] = 54;
		CODE_MAP[KeyEvent.VK_K] = 55;
		CODE_MAP[KeyEvent.VK_L] = 56;
		CODE_MAP[KeyEvent.VK_M] = 70;
		CODE_MAP[KeyEvent.VK_N] = 69;
		CODE_MAP[KeyEvent.VK_O] = 40;
		CODE_MAP[KeyEvent.VK_P] = 41;
		CODE_MAP[KeyEvent.VK_Q] = 32;
		CODE_MAP[KeyEvent.VK_R] = 35;
		CODE_MAP[KeyEvent.VK_S] = 49;
		CODE_MAP[KeyEvent.VK_T] = 36;
		CODE_MAP[KeyEvent.VK_U] = 38;
		CODE_MAP[KeyEvent.VK_V] = 67;
		CODE_MAP[KeyEvent.VK_W] = 33;
		CODE_MAP[KeyEvent.VK_X] = 65;
		CODE_MAP[KeyEvent.VK_Y] = 37;
		CODE_MAP[KeyEvent.VK_Z] = 64;
		//
		CODE_MAP[KeyEvent.VK_NUMPAD0] = 228;
		CODE_MAP[KeyEvent.VK_NUMPAD1] = 231;
		CODE_MAP[KeyEvent.VK_NUMPAD2] = 227;
		CODE_MAP[KeyEvent.VK_NUMPAD3] = 233;
		CODE_MAP[KeyEvent.VK_NUMPAD4] = 224;
		CODE_MAP[KeyEvent.VK_NUMPAD5] = 219;
		CODE_MAP[KeyEvent.VK_NUMPAD6] = 225;
		CODE_MAP[KeyEvent.VK_NUMPAD7] = 230;
		CODE_MAP[KeyEvent.VK_NUMPAD8] = 226;
		CODE_MAP[KeyEvent.VK_NUMPAD9] = 232;
		CODE_MAP[KeyEvent.VK_MULTIPLY] = 89;
		CODE_MAP[KeyEvent.VK_ADD] = 87;
		//
		CODE_MAP[KeyEvent.VK_SUBTRACT] = 88;
		CODE_MAP[KeyEvent.VK_DECIMAL] = 229;
		CODE_MAP[KeyEvent.VK_DIVIDE] = 90;
		CODE_MAP[KeyEvent.VK_F1] = 1;
		CODE_MAP[KeyEvent.VK_F2] = 2;
		CODE_MAP[KeyEvent.VK_F3] = 3;
		CODE_MAP[KeyEvent.VK_F4] = 4;
		CODE_MAP[KeyEvent.VK_F5] = 5;
		CODE_MAP[KeyEvent.VK_F6] = 6;
		CODE_MAP[KeyEvent.VK_F7] = 7;
		CODE_MAP[KeyEvent.VK_F8] = 8;
		CODE_MAP[KeyEvent.VK_F9] = 9;
		CODE_MAP[KeyEvent.VK_F10] = 10;
		CODE_MAP[KeyEvent.VK_F11] = 11;
		CODE_MAP[KeyEvent.VK_F12] = 12;
		//
		CODE_MAP[KeyEvent.VK_DELETE] = 101;
		//
		CODE_MAP[KeyEvent.VK_INSERT] = 100;
	}

	public static boolean getKey(int key) {
		return pressedKeys[CODE_MAP[key]];
	}

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
		@Pc(6) Keyboard keyboard = instance;
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

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	public static void init() {
		if (SignLink.javaVendor.toLowerCase().contains("microsoft")) {
			CODE_MAP[187] = 27;
			CODE_MAP[223] = 28;
			CODE_MAP[221] = 43;
			CODE_MAP[188] = 71;
			CODE_MAP[222] = 59;
			CODE_MAP[192] = 58;
			CODE_MAP[191] = 73;
			CODE_MAP[219] = 42;
			CODE_MAP[190] = 72;
			CODE_MAP[186] = 57;
			CODE_MAP[220] = 74;
			CODE_MAP[189] = 26;
			return;
		}

		if (SignLink.setFocusTraversalKeysEnabled == null) {
			CODE_MAP[KeyEvent.VK_BACK_QUOTE] = 58;
			CODE_MAP[KeyEvent.VK_QUOTE] = 59;
		} else {
			CODE_MAP[KeyEvent.VK_QUOTE] = 58;
			CODE_MAP[KeyEvent.VK_BACK_QUOTE] = 28;
			CODE_MAP[520] = 59;
		}

		CODE_MAP[KeyEvent.VK_MINUS] = 26;
		CODE_MAP[KeyEvent.VK_EQUALS] = 27;
		CODE_MAP[KeyEvent.VK_OPEN_BRACKET] = 42;
		CODE_MAP[KeyEvent.VK_SEMICOLON] = 57;
		CODE_MAP[KeyEvent.VK_CLOSE_BRACKET] = 43;
		CODE_MAP[KeyEvent.VK_COMMA] = 71;
		CODE_MAP[KeyEvent.VK_BACK_SLASH] = 74;
		CODE_MAP[KeyEvent.VK_PERIOD] = 72;
		CODE_MAP[KeyEvent.VK_SLASH] = 73;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void start(@OriginalArg(1) Component component) {
		@Pc(10) Method method = SignLink.setFocusTraversalKeysEnabled;
		if (method != null) {
			try {
				method.invoke(component, Boolean.FALSE);
			} catch (@Pc(25) Throwable ex) {
			}
		}
		component.addKeyListener(instance);
		component.addFocusListener(instance);
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
	public static void quit() {
		if (instance != null) {
			@Pc(4) Keyboard local4 = instance;
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(B)I")
	public static int getIdleLoops() {
		return idleLoops;
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

		int modifiers = event.getModifiersEx();
		if ((modifiers & 0xA) != 0 || code == KEY_BACK_SPACE || code == KEY_ENTER) {
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
