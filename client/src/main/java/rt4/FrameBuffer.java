package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;
import java.awt.*;

@OriginalClass("client!vk")
public abstract class FrameBuffer {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	protected int[] pixels;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Ljava/awt/Image;")
	protected Image image;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZLjava/awt/Component;)Lclient!vk;")
	public static FrameBuffer create(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(16) FrameBuffer local16 = new BufferedImageFrameBuffer();
			local16.init(arg0, arg1, arg2);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) ImageProducerFrameBuffer local29 = new ImageProducerFrameBuffer();
			local29.init(arg0, arg1, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void draw(@OriginalArg(2) Graphics graphics);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public final void makeTarget() {
		SoftwareRaster.setSize(this.pixels, this.width, this.height);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void drawAt(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics graphics, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	public abstract void init(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component component);
}
