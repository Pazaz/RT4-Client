package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ShadowModelList {
	@OriginalMember(owner = "client!di", name = "I", descriptor = "Lclient!n;")
	public static final SoftLruHashTable SHADOWS = new SoftLruHashTable(32);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void clean() {
		SHADOWS.clean(5);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	public static void removeSoft() {
		SHADOWS.removeSoft();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLclient!tk;IIIIILclient!ak;IIIIB)Lclient!ak;")
	public static Model method1043(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) SeqType arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Model arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(23) long local23 = ((long) arg4 << 48) + (long) (arg7 + (arg0 << 16) + (arg12 << 24)) + ((long) arg6 << 32);
		@Pc(33) Model local33 = (Model) SHADOWS.get(local23);
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(162) int local162;
		if (local33 == null) {
			@Pc(41) byte local41;
			if (arg7 == 1) {
				local41 = 9;
			} else if (arg7 == 2) {
				local41 = 12;
			} else if (arg7 == 3) {
				local41 = 15;
			} else if (arg7 == 4) {
				local41 = 18;
			} else {
				local41 = 21;
			}
			@Pc(83) int[] local83 = new int[]{64, 96, 128};
			@Pc(103) RawModel local103 = new RawModel(local41 * 3 + 1, -local41 + local41 * 3 * 2, 0);
			local109 = local103.method1685(0, 0);
			@Pc(113) int[][] local113 = new int[3][local41];
			for (local115 = 0; local115 < 3; local115++) {
				local126 = local83[local115];
				local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
					@Pc(141) int local141 = (local132 << 11) / local41;
					@Pc(152) int local152 = arg5 + MathUtils.cos[local141] * local130 >> 16;
					local162 = arg3 + MathUtils.sin[local141] * local126 >> 16;
					local113[local115][local132] = local103.method1685(local162, local152);
				}
			}
			for (local115 = 0; local115 < 3; local115++) {
				local126 = (local115 * 256 + 128) / 3;
				local130 = 256 - local126;
				@Pc(207) byte local207 = (byte) (arg12 * local126 + arg0 * local130 >> 8);
				@Pc(252) short local252 = (short) (((arg6 & 0x7F) * local130 + (arg4 & 0x7F) * local126 & 0x7F00) + (local130 * (arg6 & 0x380) + local126 * (arg4 & 0x380) & 0x38000) + (local126 * (arg4 & 0xFC00) + (arg6 & 0xFC00) * local130 & 0xFC0000) >> 8);
				for (local162 = 0; local162 < local41; local162++) {
					if (local115 == 0) {
						local103.addTriangle(local109, local113[0][(local162 + 1) % local41], local113[0][local162], local252, local207);
					} else {
						local103.addTriangle(local113[local115 - 1][local162], local113[local115 - 1][(local162 + 1) % local41], local113[local115][(local162 + 1) % local41], local252, local207);
						local103.addTriangle(local113[local115 - 1][local162], local113[local115][(local162 + 1) % local41], local113[local115][local162], local252, local207);
					}
				}
			}
			local33 = local103.createModel(64, 768, -50, -10, -50);
			SHADOWS.put(local33, local23);
		}
		@Pc(367) int local367 = arg7 * 64 - 1;
		@Pc(376) int local376 = -local367;
		@Pc(379) int local379 = -local367;
		@Pc(381) int local381 = local367;
		@Pc(384) int local384 = arg8.getMinX();
		@Pc(386) AnimFrameset local386 = null;
		local115 = arg8.getMaxX();
		local126 = arg8.getMinZ();
		local130 = arg8.getMaxZ();
		if (arg2 != null) {
			@Pc(403) int local403 = arg2.frames[arg10];
			local386 = SeqTypeList.getAnimFrameset(local403 >> 16);
			arg10 = local403 & 0xFFFF;
		}
		local109 = local367;
		if (arg1) {
			if (arg9 > 1664 || arg9 < 384) {
				local379 -= 128;
			}
			if (arg9 > 1152 && arg9 < 1920) {
				local381 = local367 + 128;
			}
			if (arg9 > 640 && arg9 < 1408) {
				local109 = local367 + 128;
			}
			if (arg9 > 128 && arg9 < 896) {
				local376 -= 128;
			}
		}
		if (local109 < local130) {
			local130 = local109;
		}
		if (local376 > local384) {
			local384 = local376;
		}
		if (local126 < local379) {
			local126 = local379;
		}
		if (local381 < local115) {
			local115 = local381;
		}
		if (local386 == null) {
			local33 = local33.method4560(true, true, true);
			local33.resize((local115 - local384) / 2, 128, (local130 - local126) / 2);
			local33.translate((local384 + local115) / 2, 0, (local126 + local130) / 2);
		} else {
			local33 = local33.method4560(!local386.isAlphaTransformed(arg10), !local386.isColorTransformed(arg10), true);
			local33.resize((local115 - local384) / 2, 128, (local130 - local126) / 2);
			local33.translate((local384 + local115) / 2, 0, (local126 + local130) / 2);
			local33.method4555(local386, arg10);
		}
		if (arg9 != 0) {
			local33.rotateY(arg9);
		}
		if (GlRenderer.enabled) {
			@Pc(650) GlModel local650 = (GlModel) local33;
			if (SceneGraph.getTileHeight(Player.plane, arg3 + local384, local126 + arg5) != arg11 || SceneGraph.getTileHeight(Player.plane, local115 + arg3, arg5 - -local130) != arg11) {
				for (local162 = 0; local162 < local650.vertexCount; local162++) {
					local650.vertexY[local162] += SceneGraph.getTileHeight(Player.plane, local650.vertexX[local162] + arg3, arg5 + local650.vertexZ[local162]) - arg11;
				}
				local650.bounds.valid = false;
				local650.vertexBuffer.valid = false;
			}
		} else {
			@Pc(574) SoftwareModel local574 = (SoftwareModel) local33;
			if (SceneGraph.getTileHeight(Player.plane, arg3 + local384, arg5 - -local126) != arg11 || arg11 != SceneGraph.getTileHeight(Player.plane, arg3 + local115, arg5 - -local130)) {
				for (local162 = 0; local162 < local574.vertexCount; local162++) {
					local574.vertexY[local162] += SceneGraph.getTileHeight(Player.plane, arg3 + local574.vertexX[local162], arg5 + local574.vertexZ[local162]) - arg11;
				}
				local574.boundsValid = false;
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void clear() {
		SHADOWS.clear();
	}
}
