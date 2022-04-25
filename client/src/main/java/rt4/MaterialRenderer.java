package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public interface MaterialRenderer {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
	void unbind();

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
	void bind();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	void setArgument(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
	int getFlags();
}
