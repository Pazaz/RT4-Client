import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class3_Sub30 extends Node {

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "Lclient!na;")
	public JagString aClass100_980;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class3_Sub30() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class3_Sub30(@OriginalArg(0) JagString arg0) {
		this.aClass100_980 = arg0;
	}
}
