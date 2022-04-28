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
	public AnimBase(@OriginalArg(0) int id, @OriginalArg(1) byte[] bytes) {
		this.id = id;
		@Pc(9) Buffer buffer = new Buffer(bytes);
		this.transforms = buffer.g1();
		this.bones = new int[this.transforms][];
		this.types = new int[this.transforms];
		this.shadow = new boolean[this.transforms];
		this.parts = new int[this.transforms];
		@Pc(36) int i;
		for (i = 0; i < this.transforms; i++) {
			this.types[i] = buffer.g1();
		}
		for (i = 0; i < this.transforms; i++) {
			this.shadow[i] = buffer.g1() == 1;
		}
		for (i = 0; i < this.transforms; i++) {
			this.parts[i] = buffer.g2();
		}
		for (i = 0; i < this.transforms; i++) {
			this.bones[i] = new int[buffer.g1()];
		}
		for (i = 0; i < this.transforms; i++) {
			for (@Pc(118) int j = 0; j < this.bones[i].length; j++) {
				this.bones[i][j] = buffer.g1();
			}
		}
	}
}
