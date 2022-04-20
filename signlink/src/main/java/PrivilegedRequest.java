import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("signlink!im")
public final class PrivilegedRequest {

	@OriginalMember(owner = "signlink!im", name = "e", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "signlink!im", name = "f", descriptor = "I")
	public int anInt5924;

	@OriginalMember(owner = "signlink!im", name = "b", descriptor = "Lsignlink!im;")
	public PrivilegedRequest aClass212_6;

	@OriginalMember(owner = "signlink!im", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject7;

	@OriginalMember(owner = "signlink!im", name = "a", descriptor = "I")
	public int anInt5926;

	@OriginalMember(owner = "signlink!im", name = "g", descriptor = "I")
	public int anInt5927;

	@OriginalMember(owner = "signlink!im", name = "d", descriptor = "I")
	public volatile int status = 0;
}
