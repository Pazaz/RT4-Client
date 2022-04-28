package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Timer {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Lclient!s;")
	public static Timer create() {
		try {
			return new NanoTimer();
		} catch (@Pc(15) Throwable ex) {
			return new MillisTimer();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public abstract int sleep(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public abstract void reset();

	public abstract int count(int arg0, int arg1);
}
