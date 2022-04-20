import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "client!qk", name = "read", descriptor = "()I")
	@Override
	public final int read() {
		Static231.sleep(30000L);
		return -1;
	}
}
