import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class ImageProducerFrameBuffer extends FrameBuffer implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!di", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!di", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt5341, this.anInt5339);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIBI)V")
	private synchronized void method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg0, arg1, this.aColorModel1, this.anIntArray472, arg3 * this.anInt5341 + arg2, this.anInt5341);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!di", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public final void method4191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method1168(arg0, arg2, arg1, arg4);
		@Pc(17) Shape local17 = arg3.getClip();
		arg3.clipRect(arg1, arg4, arg0, arg2);
		arg3.drawImage(this.anImage4, 0, 0, this);
		arg3.setClip(local17);
	}

	@OriginalMember(owner = "client!di", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
	private synchronized void method1170() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt5341, this.anInt5339, this.aColorModel1, this.anIntArray472, 0, this.anInt5341);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!di", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public final synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public final void method4186(@OriginalArg(2) Graphics arg0) {
		this.method1170();
		arg0.drawImage(this.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	@Override
	public final void method4192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt5339 = arg0;
		this.anIntArray472 = new int[arg1 * arg0 + 1];
		this.anInt5341 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = arg2.createImage(this);
		this.method1170();
		arg2.prepareImage(this.anImage4, this);
		this.method1170();
		arg2.prepareImage(this.anImage4, this);
		this.method1170();
		arg2.prepareImage(this.anImage4, this);
		this.method4189();
	}

	@OriginalMember(owner = "client!di", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public final boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!di", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
