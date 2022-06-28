package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.awt.*;

@OriginalClass("signlink!ai")
public interface AudioSource {

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(II)V")
	void close(@OriginalArg(0) int channel);

	@OriginalMember(owner = "signlink!ai", name = "b", descriptor = "(BI)I")
	int getBufferSize(@OriginalArg(1) int channel);

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(III)V")
	void open(@OriginalArg(0) int channel, @OriginalArg(2) int bufferCapacity) throws Exception;

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(BI)V")
	void flush(@OriginalArg(1) int channel);

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
	void init(@OriginalArg(0) int sampleRate, @OriginalArg(2) Component component, @OriginalArg(3) boolean stereo) throws Exception;

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(I[I)V")
	void write(@OriginalArg(0) int channel, @OriginalArg(1) int[] samples);
}
