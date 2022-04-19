package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.JAWT;
import com.sun.opengl.impl.JAWT_DrawingSurface;
import com.sun.opengl.impl.JAWT_DrawingSurfaceInfo;
import java.awt.Component;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;

public class MacOSXOnscreenGLDrawable extends MacOSXGLDrawable {

	private Component component;

	protected long nsView;

	JAWT_DrawingSurface ds;

	JAWT_DrawingSurfaceInfo dsi;

	protected boolean realized;

	private boolean firstLock = true;

	public MacOSXOnscreenGLDrawable(Component arg0, GLCapabilities arg1, GLCapabilitiesChooser arg2) {
		super(arg1, arg2);
		this.component = arg0;
	}

	public GLContext createContext(GLContext arg0) {
		return new MacOSXOnscreenGLContext(this);
	}

	public void setRealized(boolean arg0) {
		this.realized = arg0;
		this.setChosenGLCapabilities(null);
	}

	public void swapBuffers() throws GLException {
		((MacOSXOnscreenGLContext) GLContext.getCurrent()).swapBuffers();
	}

	public long getView() {
		return this.nsView;
	}

	public int lockSurface() throws GLException {
		if (this.nsView != 0L) {
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
			if (this.firstLock) {
				AccessController.doPrivileged(new PrivilegedAction() {

					public Object run() {
						MacOSXOnscreenGLDrawable.this.dsi = MacOSXOnscreenGLDrawable.this.ds.GetDrawingSurfaceInfo();
						return null;
					}
				});
				this.firstLock = false;
			} else {
				this.dsi = this.ds.GetDrawingSurfaceInfo();
			}
			if (this.dsi == null) {
				this.ds.Unlock();
				JAWT.getJAWT().FreeDrawingSurface(this.ds);
				this.ds = null;
				return 1;
			}
			JAWT_MacOSXDrawingSurfaceInfo var2 = (JAWT_MacOSXDrawingSurfaceInfo) this.dsi.platformInfo();
			if (var2 != null) {
				this.nsView = var2.cocoaViewRef();
			}
			if (this.nsView == 0L) {
				this.ds.FreeDrawingSurfaceInfo(this.dsi);
				this.ds.Unlock();
				JAWT.getJAWT().FreeDrawingSurface(this.ds);
				this.ds = null;
				this.dsi = null;
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

	public void unlockSurface() throws GLException {
		if (this.nsView == 0L) {
			return;
		}
		this.ds.FreeDrawingSurfaceInfo(this.dsi);
		this.ds.Unlock();
		JAWT.getJAWT().FreeDrawingSurface(this.ds);
		this.ds = null;
		this.dsi = null;
		this.nsView = 0L;
	}
}
