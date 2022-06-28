package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.lang.reflect.Field;

@OriginalClass("signlink!e")
public final class FullScreenManager {

	@OriginalMember(owner = "signlink!e", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode previousDisplayMode;

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice device;

	@OriginalMember(owner = "signlink!e", name = "<init>", descriptor = "()V")
	public FullScreenManager() throws Exception {
		@Pc(3) GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.device = env.getDefaultScreenDevice();
		if (!this.device.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] devices = env.getScreenDevices();
			for (@Pc(19) int i = 0; i < devices.length; i++) {
				@Pc(27) GraphicsDevice d = devices[i];
				if (d != null && d.isFullScreenSupported()) {
					this.device = d;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void setFullScreenWindow(@OriginalArg(0) Frame frame) {
		@Pc(1) boolean wasValid = false;
		try {
			@Pc(6) Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			valid.setAccessible(true);
			@Pc(16) boolean v = (Boolean) valid.get(this.device);
			if (v) {
				valid.set(this.device, Boolean.FALSE);
				wasValid = true;
			}
		} catch (@Pc(27) Throwable ex) {
		}
		try {
			this.device.setFullScreenWindow(frame);
		} finally {
			if (wasValid) {
				try {
					@Pc(66) Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					valid.set(this.device, Boolean.TRUE);
				} catch (@Pc(73) Throwable ex) {
				}
			}
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public final void enter(@OriginalArg(1) int refreshRate, @OriginalArg(2) int bitDepth, @OriginalArg(3) int height, @OriginalArg(4) Frame frame, @OriginalArg(5) int width) {
		this.previousDisplayMode = this.device.getDisplayMode();
		if (this.previousDisplayMode == null) {
			throw new NullPointerException();
		}
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		this.setFullScreenWindow(frame);
		if (refreshRate == 0) {
			@Pc(37) int previousRefreshRate = this.previousDisplayMode.getRefreshRate();
			@Pc(41) DisplayMode[] displayModes = this.device.getDisplayModes();
			@Pc(43) boolean foundMode = false;
			for (@Pc(45) int i = 0; i < displayModes.length; i++) {
				if (displayModes[i].getWidth() == width && displayModes[i].getHeight() == height && bitDepth == displayModes[i].getBitDepth()) {
					@Pc(77) int r = displayModes[i].getRefreshRate();
					if (!foundMode || Math.abs(r - previousRefreshRate) < Math.abs(refreshRate - previousRefreshRate)) {
						foundMode = true;
						refreshRate = r;
					}
				}
			}
			if (!foundMode) {
				refreshRate = previousRefreshRate;
			}
		}
		this.device.setDisplayMode(new DisplayMode(width, height, bitDepth, refreshRate));
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(Z)[I")
	public final int[] getDisplayModes() {
		@Pc(9) DisplayMode[] displayModes = this.device.getDisplayModes();
		@Pc(15) int[] result = new int[displayModes.length << 2];
		for (@Pc(17) int i = 0; i < displayModes.length; i++) {
			result[i << 2] = displayModes[i].getWidth();
			result[(i << 2) + 1] = displayModes[i].getHeight();
			result[(i << 2) + 2] = displayModes[i].getBitDepth();
			result[(i << 2) + 3] = displayModes[i].getRefreshRate();
		}
		return result;
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(I)V")
	public final void exit() {
		if (this.previousDisplayMode != null) {
			this.device.setDisplayMode(this.previousDisplayMode);
			if (!this.device.getDisplayMode().equals(this.previousDisplayMode)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.previousDisplayMode = null;
		}
		this.setFullScreenWindow(null);
	}
}
