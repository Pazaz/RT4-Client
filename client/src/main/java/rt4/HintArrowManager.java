package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class HintArrowManager {
	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!n;")
	public static final SoftLruHashTable models = new SoftLruHashTable(4);

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public static void clean() {
		models.clean(5);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void removeSoft() {
		models.removeSoft();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void clear() {
		models.clear();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIIILclient!ak;I)Lclient!ak;")
	public static Model getModel(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Model arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = arg2;
		@Pc(10) Model model = (Model) models.get(local4);
		if (model == null) {
			@Pc(22) RawModel local22 = RawModel.create(client.js5Archive7, arg2);
			if (local22 == null) {
				return null;
			}
			model = local22.createModel(64, 768, -50, -10, -50);
			models.put(model, local4);
		}
		@Pc(42) int minX = arg4.getMinX();
		@Pc(45) int maxX = arg4.getMaxX();
		@Pc(48) int minZ = arg4.getMinZ();
		@Pc(51) int maxZ = arg4.getMaxZ();
		model = model.method4560(true, true, true);
		if (arg0 != 0) {
			model.rotateY(arg0);
		}
		@Pc(94) int local94;
		if (GlRenderer.enabled) {
			@Pc(68) GlModel local68 = (GlModel) model;
			if (arg5 != SceneGraph.getTileHeight(Player.plane, arg3 + minX, arg1 + minZ) || arg5 != SceneGraph.getTileHeight(Player.plane, arg3 + maxX, maxZ + arg1)) {
				for (local94 = 0; local94 < local68.vertexCount; local94++) {
					local68.vertexY[local94] += SceneGraph.getTileHeight(Player.plane, local68.vertexX[local94] + arg3, local68.vertexZ[local94] + arg1) - arg5;
				}
				local68.vertexBuffer.valid = false;
				local68.bounds.valid = false;
			}
		} else {
			@Pc(142) SoftwareModel local142 = (SoftwareModel) model;
			if (arg5 != SceneGraph.getTileHeight(Player.plane, minX + arg3, minZ + arg1) || arg5 != SceneGraph.getTileHeight(Player.plane, arg3 + maxX, maxZ + arg1)) {
				for (local94 = 0; local94 < local142.vertexCount; local94++) {
					local142.vertexY[local94] += SceneGraph.getTileHeight(Player.plane, arg3 + local142.vertexX[local94], local142.vertexZ[local94] + arg1) - arg5;
				}
				local142.boundsValid = false;
			}
		}
		return model;
	}
}
