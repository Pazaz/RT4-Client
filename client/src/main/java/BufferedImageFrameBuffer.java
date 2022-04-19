import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class BufferedImageFrameBuffer extends FrameBuffer {

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public final void method4186(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	@Override
	public final void method4192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray472 = new int[arg1 * arg0 + 1];
		this.anInt5339 = arg0;
		this.anInt5341 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray472, this.anIntArray472.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt5341, this.anInt5339), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method4189();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public final void method4191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg1, arg4, arg0, arg2);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}
}
