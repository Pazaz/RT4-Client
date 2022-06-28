package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class GlBoundingBox {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "S")
	public short minY;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "S")
	public short maxY;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "S")
	public short cylinderRadius;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "S")
	public short maxX;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "S")
	public short minX;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "S")
	public short maxZ;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "S")
	public short minZ;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
	public boolean valid = false;
}
