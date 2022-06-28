package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.io.IOException;
import java.io.OutputStream;

@OriginalClass("client!vg")
public final class BrokenOutputStream extends OutputStream {

	@OriginalMember(owner = "client!vg", name = "write", descriptor = "(I)V")
	@Override
	public final void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
