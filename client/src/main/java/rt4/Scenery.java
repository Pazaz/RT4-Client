package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Scenery {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public int zMin;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!th;")
	public Entity entity;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public int zMax;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public int anInt1699;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public int xMin;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	public int anInt1703;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	public int anInt1705;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	public int anInt1706;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public int anInt1707;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public int xMax;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public int anInt1714;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "J")
	public long key = 0L;
}
