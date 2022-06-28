package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Environment {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public final int screenColorRgb;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "F")
	public final float light1Diffuse;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public final int lightZ;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "F")
	public final float lightModelAmbient;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public final int fogColorRgb;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public final int lightY;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "F")
	public final float light0Diffuse;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public final int fogDepth;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public final int lightX;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Environment() {
		this.screenColorRgb = FogManager.defaultLightColorRgb;
		this.light1Diffuse = 1.2F;
		this.lightZ = -50;
		this.lightModelAmbient = 1.1523438F;
		this.fogColorRgb = FogManager.defaulFogColorRgb;
		this.lightY = -60;
		this.light0Diffuse = 0.69921875F;
		this.fogDepth = 0;
		this.lightX = -50;
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Environment(@OriginalArg(0) Buffer buffer) {
		@Pc(7) int flag = buffer.g1();
		if ((flag & 0x1) == 0) {
			this.screenColorRgb = FogManager.defaultLightColorRgb;
		} else {
			this.screenColorRgb = buffer.g4();
		}
		if ((flag & 0x2) == 0) {
			this.lightModelAmbient = 1.1523438F;
		} else {
			this.lightModelAmbient = (float) buffer.g2() / 256.0F;
		}
		if ((flag & 0x4) == 0) {
			this.light0Diffuse = 0.69921875F;
		} else {
			this.light0Diffuse = (float) buffer.g2() / 256.0F;
		}
		if ((flag & 0x8) == 0) {
			this.light1Diffuse = 1.2F;
		} else {
			this.light1Diffuse = (float) buffer.g2() / 256.0F;
		}
		if ((flag & 0x10) == 0) {
			this.lightZ = -50;
			this.lightX = -50;
			this.lightY = -60;
		} else {
			this.lightX = buffer.g2b();
			this.lightY = buffer.g2b();
			this.lightZ = buffer.g2b();
		}
		if ((flag & 0x20) == 0) {
			this.fogColorRgb = FogManager.defaulFogColorRgb;
		} else {
			this.fogColorRgb = buffer.g4();
		}
		if ((flag & 0x40) == 0) {
			this.fogDepth = 0;
		} else {
			this.fogDepth = buffer.g2();
		}
	}

}
