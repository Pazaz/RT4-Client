package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.JAWT;
import com.sun.opengl.impl.JAWT_DrawingSurface;
import com.sun.opengl.impl.JAWT_DrawingSurfaceInfo;
import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

public class WindowsOnscreenGLDrawable extends WindowsGLDrawable {

	private Component component;

	private JAWT_DrawingSurface ds;

	private JAWT_DrawingSurfaceInfo dsi;

	protected boolean realized;

	public WindowsOnscreenGLDrawable(Component arg0, GLCapabilities arg1, GLCapabilitiesChooser arg2) {
		super(arg1, arg2);
		this.component = arg0;
	}

	public GLContext createContext(GLContext arg0) {
		return new WindowsOnscreenGLContext(this);
	}

	public void setRealized(boolean arg0) {
		this.realized = arg0;
		if (!arg0) {
			this.setChosenGLCapabilities(null);
			this.pixelFormatChosen = false;
		}
	}

	public void swapBuffers() throws GLException {
		int var1 = this.lockSurface();
		if (var1 == 1) {
			return;
		}
		try {
			if (!WGL.SwapBuffers(this.hdc) && WGL.GetLastError() != 0) {
				throw new GLException("Error swapping buffers");
			}
		} finally {
			this.unlockSurface(false);
		}
	}

	public int lockSurface() {
		if (this.hdc != 0L) {
			return 3;
		} else if (this.realized) {
			this.ds = JAWT.getJAWT().GetDrawingSurface(this.component);
			if (this.ds == null) {
				return 1;
			}
			int var1 = this.ds.Lock();
			if ((var1 & 0x1) != 0) {
				JAWT.getJAWT().FreeDrawingSurface(this.ds);
				this.ds = null;
				return 1;
			}
			this.dsi = this.ds.GetDrawingSurfaceInfo();
			if (this.dsi == null) {
				this.ds.Unlock();
				JAWT.getJAWT().FreeDrawingSurface(this.ds);
				this.ds = null;
				return 1;
			}
			this.hdc = ((JAWT_Win32DrawingSurfaceInfo) this.dsi.platformInfo()).hdc();
			if (this.hdc == 0L) {
				this.ds.FreeDrawingSurfaceInfo(this.dsi);
				this.ds.Unlock();
				JAWT.getJAWT().FreeDrawingSurface(this.ds);
				this.ds = null;
				this.dsi = null;
				return 1;
			}
			if (!this.pixelFormatChosen) {
				try {
					this.choosePixelFormat(true);
				} catch (RuntimeException var3) {
					this.unlockSurface(true);
					return 1;
				}
			}
			return (var1 & 0x8) == 0 ? 3 : 2;
		} else {
			return 1;
		}
	}

	public void unlockSurface(boolean arg0) {
		if (!arg0 || this.hdc == 0L) {
			return;
		}
		this.ds.FreeDrawingSurfaceInfo(this.dsi);
		this.ds.Unlock();
		JAWT.getJAWT().FreeDrawingSurface(this.ds);
		this.ds = null;
		this.dsi = null;
		this.hdc = 0L;
	}
}
