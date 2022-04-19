import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public interface MaterialRenderer {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
	void method4602();

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
	void method4603();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	void method4604(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
	int method4605();
}
