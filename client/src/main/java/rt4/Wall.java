package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Wall {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!th;")
	public Entity primary;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!th;")
	public Entity secondary;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public int anInt3049;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
	public int anInt3051;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "J")
	public long key = 0L;
}
