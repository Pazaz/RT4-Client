package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.JAWT;
import com.sun.opengl.impl.JAWT_DrawingSurface;
import com.sun.opengl.impl.JAWT_DrawingSurfaceInfo;
import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

public class X11OnscreenGLDrawable extends X11GLDrawable {

	private Component component;

	private JAWT_DrawingSurface ds;

	private JAWT_DrawingSurfaceInfo dsi;

	protected boolean realized;

	public X11OnscreenGLDrawable(Component arg0) {
		super((GLCapabilities) null, (GLCapabilitiesChooser) null);
		this.component = arg0;
	}

	public GLContext createContext(GLContext arg0) {
		return new X11OnscreenGLContext(this);
	}

	public void setRealized(boolean arg0) {
		this.realized = arg0;
	}

	public void swapBuffers() throws GLException {
		this.lockToolkit();
		try {
			int var1 = this.lockSurface();
			if (var1 == 1) {
				return;
			}
			try {
				GLX.glXSwapBuffers(this.display, this.drawable);
			} finally {
				this.unlockSurface();
			}
		} finally {
			this.unlockToolkit();
		}
	}

	public int lockSurface() throws GLException {
		if (this.drawable != 0L) {
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
			JAWT_X11DrawingSurfaceInfo var2 = (JAWT_X11DrawingSurfaceInfo) this.dsi.platformInfo();
			this.display = var2.display();
			this.drawable = var2.drawable();
			this.visualID = var2.visualID();
			if (this.display == 0L || this.drawable == 0L) {
				this.ds.FreeDrawingSurfaceInfo(this.dsi);
				this.ds.Unlock();
				JAWT.getJAWT().FreeDrawingSurface(this.ds);
				this.ds = null;
				this.dsi = null;
				this.display = 0L;
				this.drawable = 0L;
				this.visualID = 0L;
				return 1;
			} else if ((var1 & 0x8) == 0) {
				return 3;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	public void unlockSurface() {
		if (this.drawable == 0L) {
			return;
		}
		this.ds.FreeDrawingSurfaceInfo(this.dsi);
		this.ds.Unlock();
		JAWT.getJAWT().FreeDrawingSurface(this.ds);
		this.ds = null;
		this.dsi = null;
		this.display = 0L;
		this.drawable = 0L;
		this.visualID = 0L;
	}
}
