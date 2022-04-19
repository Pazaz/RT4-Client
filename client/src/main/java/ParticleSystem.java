import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class ParticleSystem extends ParticleNode {

	static {
		new SecondaryHashTable(8);
		new Buffer(131056);
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "()V")
	public final void method1646() {
	}
}
