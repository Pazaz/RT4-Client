import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink!ai")
public interface AudioSource {

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(II)V")
	void method5097(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "signlink!ai", name = "b", descriptor = "(BI)I")
	int method5098(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(III)V")
	void method5099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(BI)V")
	void method5100(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
	void method5101(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "signlink!ai", name = "a", descriptor = "(I[I)V")
	void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
