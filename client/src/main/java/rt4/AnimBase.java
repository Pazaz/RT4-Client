package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class AnimBase extends Node {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
	public final int transforms;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "[[I")
	public final int[][] bones;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "[I")
	public final int[] types;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "[Z")
	public final boolean[] shadow;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "[I")
	public final int[] parts;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I[B)V")
	public AnimBase(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.id = arg0;
		@Pc(9) Buffer buffer = new Buffer(arg1);
		this.transforms = buffer.g1();
		this.bones = new int[this.transforms][];
		this.types = new int[this.transforms];
		this.shadow = new boolean[this.transforms];
		this.parts = new int[this.transforms];
		@Pc(36) int local36;
		for (local36 = 0; local36 < this.transforms; local36++) {
			this.types[local36] = buffer.g1();
		}
		for (local36 = 0; local36 < this.transforms; local36++) {
			this.shadow[local36] = buffer.g1() == 1;
		}
		for (local36 = 0; local36 < this.transforms; local36++) {
			this.parts[local36] = buffer.g2();
		}
		for (local36 = 0; local36 < this.transforms; local36++) {
			this.bones[local36] = new int[buffer.g1()];
		}
		for (local36 = 0; local36 < this.transforms; local36++) {
			for (@Pc(118) int local118 = 0; local118 < this.bones[local36].length; local118++) {
				this.bones[local36][local118] = buffer.g1();
			}
		}
	}
}
