import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("signlink!e")
public final class FullScreenManager {

	@OriginalMember(owner = "signlink!e", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "signlink!e", name = "<init>", descriptor = "()V")
	public FullScreenManager() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method5103(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(66) Field local66 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local66.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(73) Throwable local73) {
				}
			}
		}
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public final void method5104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method5103(arg3);
		if (arg0 == 0) {
			@Pc(37) int local37 = this.aDisplayMode1.getRefreshRate();
			@Pc(41) DisplayMode[] local41 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < local41.length; local45++) {
				if (local41[local45].getWidth() == arg4 && local41[local45].getHeight() == arg2 && arg1 == local41[local45].getBitDepth()) {
					@Pc(77) int local77 = local41[local45].getRefreshRate();
					if (!local43 || Math.abs(local77 - local37) < Math.abs(arg0 - local37)) {
						local43 = true;
						arg0 = local77;
					}
				}
			}
			if (!local43) {
				arg0 = local37;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg2, arg1, arg0));
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(Z)[I")
	public final int[] method5105() {
		@Pc(9) DisplayMode[] local9 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local9.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
			local15[local17 << 2] = local9[local17].getWidth();
			local15[(local17 << 2) + 1] = local9[local17].getHeight();
			local15[(local17 << 2) + 2] = local9[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local9[local17].getRefreshRate();
		}
		return local15;
	}

	@OriginalMember(owner = "signlink!e", name = "a", descriptor = "(I)V")
	public final void method5106() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5103(null);
	}
}
