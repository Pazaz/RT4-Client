package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.io.InputStream;

@OriginalClass("client!qk")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "client!qk", name = "read", descriptor = "()I")
	@Override
	public final int read() {
		ThreadUtils.sleep(30000L);
		return -1;
	}
}
