package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class SceneGraph_Class120 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public int anInt4444;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public int anInt4445;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public int anInt4446;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public int anInt4447;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public int anInt4448;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	public int anInt4449;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public int anInt4450;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt4452;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public int anInt4453;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public int anInt4456;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public int anInt4458;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public int anInt4459;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public int anInt4460;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	public int anInt4461;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public int anInt4462;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public int anInt4463;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
	public int anInt4464;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) SceneGraph_Class120 local3 = new SceneGraph_Class120();
		local3.anInt4452 = arg1 / 128;
		local3.anInt4446 = arg2 / 128;
		local3.anInt4461 = arg3 / 128;
		local3.anInt4464 = arg4 / 128;
		local3.anInt4453 = arg0;
		local3.anInt4460 = arg1;
		local3.anInt4445 = arg2;
		local3.anInt4458 = arg3;
		local3.anInt4449 = arg4;
		local3.anInt4444 = arg5;
		local3.anInt4447 = arg6;
		SceneGraph.aClass120Array1[SceneGraph.anInt917++] = local3;
	}
}
