package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class PathFinder {
	@OriginalMember(owner = "client!li", name = "h", descriptor = "[Lclient!mj;")
	public static final CollisionMap[] collisionMaps = new CollisionMap[4];
	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[[I")
	public static final int[][] parents = new int[104][104];
	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[[I")
	public static final int[][] costs = new int[104][104];
	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "[I")
	public static final int[] queueX = new int[4096];
	@OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
	public static final int[] queueZ = new int[4096];
	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public static int anInt4364 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZIIIIIIII)Z")
	public static boolean findPath(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (PlayerList.self.getSize() == 2) {
			return findPath2(arg6, arg7, arg4, arg0, arg9, arg3, arg2, arg1, arg5, arg8, arg10);
		} else if (PlayerList.self.getSize() <= 2) {
			return findPathN(arg5, arg4, arg10, arg9, arg8, arg2, arg1, arg3, arg7, arg0, arg6);
		} else {
			return findPath1(arg9, arg6, arg8, arg1, PlayerList.self.getSize(), arg5, arg7, arg4, arg10, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	public static boolean findPath2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(3) int x;
		@Pc(8) int z;
		for (x = 0; x < 104; x++) {
			for (z = 0; z < 104; z++) {
				parents[x][z] = 0;
				costs[x][z] = 99999999;
			}
		}
		parents[arg10][arg3] = 99;
		costs[arg10][arg3] = 0;
		z = arg3;
		x = arg10;
		@Pc(53) byte local53 = 0;
		queueX[0] = arg10;
		@Pc(59) boolean local59 = false;
		@Pc(61) int local61 = 0;
		@Pc(64) int queueWriterIndex = local53 + 1;
		queueZ[0] = arg3;
		@Pc(71) int[][] flags = collisionMaps[Player.plane].flags;
		@Pc(193) int cost;
		while (local61 != queueWriterIndex) {
			x = queueX[local61];
			z = queueZ[local61];
			local61 = local61 + 1 & 0xFFF;
			if (arg8 == x && arg4 == z) {
				local59 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && collisionMaps[Player.plane].isAtWall(arg4, x, z, arg8, arg1 - 1, 2, arg7)) {
					local59 = true;
					break;
				}
				if (arg1 < 10 && collisionMaps[Player.plane].isAtWallDecor(arg4, arg1 - 1, arg8, z, 2, arg7, x)) {
					local59 = true;
					break;
				}
			}
			if (arg0 != 0 && arg6 != 0 && collisionMaps[Player.plane].isInsideOrOutsideRect(arg8, z, x, 2, arg0, arg2, arg4, arg6)) {
				local59 = true;
				break;
			}
			cost = costs[x][z] + 1;
			if (x > 0 && parents[x - 1][z] == 0 && (flags[x - 1][z] & 0x12C010E) == 0 && (flags[x - 1][z + 1] & 0x12C0138) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x - 1][z] = 2;
				costs[x - 1][z] = cost;
			}
			if (x < 102 && parents[x + 1][z] == 0 && (flags[x + 2][z] & 0x12C0183) == 0 && (flags[x + 2][z + 1] & 0x12C01E0) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z] = 8;
				costs[x + 1][z] = cost;
			}
			if (z > 0 && parents[x][z - 1] == 0 && (flags[x][z - 1] & 0x12C010E) == 0 && (flags[x + 1][z - 1] & 0x12C0183) == 0) {
				queueX[queueWriterIndex] = x;
				queueZ[queueWriterIndex] = z - 1;
				parents[x][z - 1] = 1;
				costs[x][z - 1] = cost;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
			}
			if (z < 102 && parents[x][z + 1] == 0 && (flags[x][z + 2] & 0x12C0138) == 0 && (flags[x + 1][z + 2] & 0x12C01E0) == 0) {
				queueX[queueWriterIndex] = x;
				queueZ[queueWriterIndex] = z + 1;
				parents[x][z + 1] = 4;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				costs[x][z + 1] = cost;
			}
			if (x > 0 && z > 0 && parents[x - 1][z - 1] == 0 && (flags[x - 1][z] & 0x12C0138) == 0 && (flags[x - 1][z - 1] & 0x12C010E) == 0 && (flags[x][z - 1] & 0x12C0183) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z - 1;
				parents[x - 1][z - 1] = 3;
				costs[x - 1][z - 1] = cost;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
			}
			if (x < 102 && z > 0 && parents[x + 1][z - 1] == 0 && (flags[x + 1][z - 1] & 0x12C010E) == 0 && (flags[x + 2][z - 1] & 0x12C0183) == 0 && (flags[x + 2][z] & 0x12C01E0) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z - 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z - 1] = 9;
				costs[x + 1][z - 1] = cost;
			}
			if (x > 0 && z < 102 && parents[x - 1][z + 1] == 0 && (flags[x - 1][z + 1] & 0x12C010E) == 0 && (flags[x - 1][z + 2] & 0x12C0138) == 0 && (flags[x][z + 2] & 0x12C01E0) == 0) {
				queueX[queueWriterIndex] = x - 1;
				queueZ[queueWriterIndex] = z + 1;
				parents[x - 1][z + 1] = 6;
				costs[x - 1][z + 1] = cost;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
			}
			if (x < 102 && z < 102 && parents[x + 1][z + 1] == 0 && (flags[x + 1][z + 2] & 0x12C0138) == 0 && (flags[x + 2][z + 2] & 0x12C01E0) == 0 && (flags[x + 2][z + 1] & 0x12C0183) == 0) {
				queueX[queueWriterIndex] = x + 1;
				queueZ[queueWriterIndex] = z + 1;
				queueWriterIndex = queueWriterIndex + 1 & 0xFFF;
				parents[x + 1][z + 1] = 12;
				costs[x + 1][z + 1] = cost;
			}
		}
		anInt4364 = 0;
		@Pc(921) int local921;
		if (!local59) {
			if (!arg5) {
				return false;
			}
			cost = 1000;
			local921 = 100;
			for (@Pc(928) int local928 = arg8 - 10; local928 <= arg8 + 10; local928++) {
				for (@Pc(942) int local942 = arg4 - 10; local942 <= arg4 + 10; local942++) {
					if (local928 >= 0 && local942 >= 0 && local928 < 104 && local942 < 104 && costs[local928][local942] < 100) {
						@Pc(978) int local978 = 0;
						@Pc(980) int local980 = 0;
						if (local928 < arg8) {
							local978 = arg8 - local928;
						} else if (local928 > arg0 + arg8 - 1) {
							local978 = local928 + 1 - arg0 - arg8;
						}
						if (arg4 > local942) {
							local980 = arg4 - local942;
						} else if (local942 > arg4 + arg6 - 1) {
							local980 = local942 + 1 - arg4 - arg6;
						}
						@Pc(1057) int local1057 = local978 * local978 + local980 * local980;
						if (local1057 < cost || cost == local1057 && costs[local928][local942] < local921) {
							z = local942;
							local921 = costs[local928][local942];
							cost = local1057;
							x = local928;
						}
					}
				}
			}
			if (cost == 1000) {
				return false;
			}
			if (arg10 == x && z == arg3) {
				return false;
			}
			anInt4364 = 1;
		}
		@Pc(1121) byte local1121 = 0;
		queueX[0] = x;
		local61 = local1121 + 1;
		queueZ[0] = z;
		cost = local921 = parents[x][z];
		while (arg10 != x || arg3 != z) {
			if (local921 != cost) {
				queueX[local61] = x;
				queueZ[local61++] = z;
				local921 = cost;
			}
			if ((cost & 0x2) != 0) {
				x++;
			} else if ((cost & 0x8) != 0) {
				x--;
			}
			if ((cost & 0x1) != 0) {
				z++;
			} else if ((cost & 0x4) != 0) {
				z--;
			}
			cost = parents[x][z];
		}
		if (local61 > 0) {
			ClientProt.method3502(local61, arg9);
			return true;
		} else return arg9 != 1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	public static boolean findPathN(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = 0; local3 < 104; local3++) {
			for (local10 = 0; local10 < 104; local10++) {
				parents[local3][local10] = 0;
				costs[local3][local10] = 99999999;
			}
		}
		local3 = arg2;
		parents[arg2][arg9] = 99;
		local10 = arg9;
		costs[arg2][arg9] = 0;
		@Pc(51) byte local51 = 0;
		@Pc(53) boolean local53 = false;
		@Pc(64) int local64 = 0;
		queueX[0] = arg2;
		@Pc(71) int local71 = local51 + 1;
		queueZ[0] = arg9;
		@Pc(78) int[][] local78 = collisionMaps[Player.plane].flags;
		@Pc(198) int local198;
		while (local71 != local64) {
			local10 = queueZ[local64];
			local3 = queueX[local64];
			local64 = local64 + 1 & 0xFFF;
			if (local3 == arg0 && local10 == arg3) {
				local53 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && collisionMaps[Player.plane].isAtWall(arg3, local3, local10, arg0, arg8 - 1, 1, arg6)) {
					local53 = true;
					break;
				}
				if (arg8 < 10 && collisionMaps[Player.plane].isAtWallDecor(arg3, arg8 - 1, arg0, local10, 1, arg6, local3)) {
					local53 = true;
					break;
				}
			}
			if (arg10 != 0 && arg5 != 0 && collisionMaps[Player.plane].isInsideOrOutsideRect(arg0, local10, local3, 1, arg10, arg1, arg3, arg5)) {
				local53 = true;
				break;
			}
			local198 = costs[local3][local10] + 1;
			if (local3 > 0 && parents[local3 - 1][local10] == 0 && (local78[local3 - 1][local10] & 0x12C0108) == 0) {
				queueX[local71] = local3 - 1;
				queueZ[local71] = local10;
				local71 = local71 + 1 & 0xFFF;
				parents[local3 - 1][local10] = 2;
				costs[local3 - 1][local10] = local198;
			}
			if (local3 < 103 && parents[local3 + 1][local10] == 0 && (local78[local3 + 1][local10] & 0x12C0180) == 0) {
				queueX[local71] = local3 + 1;
				queueZ[local71] = local10;
				local71 = local71 + 1 & 0xFFF;
				parents[local3 + 1][local10] = 8;
				costs[local3 + 1][local10] = local198;
			}
			if (local10 > 0 && parents[local3][local10 - 1] == 0 && (local78[local3][local10 - 1] & 0x12C0102) == 0) {
				queueX[local71] = local3;
				queueZ[local71] = local10 - 1;
				parents[local3][local10 - 1] = 1;
				local71 = local71 + 1 & 0xFFF;
				costs[local3][local10 - 1] = local198;
			}
			if (local10 < 103 && parents[local3][local10 + 1] == 0 && (local78[local3][local10 + 1] & 0x12C0120) == 0) {
				queueX[local71] = local3;
				queueZ[local71] = local10 + 1;
				local71 = local71 + 1 & 0xFFF;
				parents[local3][local10 + 1] = 4;
				costs[local3][local10 + 1] = local198;
			}
			if (local3 > 0 && local10 > 0 && parents[local3 - 1][local10 - 1] == 0 && (local78[local3 - 1][local10 - 1] & 0x12C010E) == 0 && (local78[local3 - 1][local10] & 0x12C0108) == 0 && (local78[local3][local10 - 1] & 0x12C0102) == 0) {
				queueX[local71] = local3 - 1;
				queueZ[local71] = local10 - 1;
				local71 = local71 + 1 & 0xFFF;
				parents[local3 - 1][local10 - 1] = 3;
				costs[local3 - 1][local10 - 1] = local198;
			}
			if (local3 < 103 && local10 > 0 && parents[local3 + 1][local10 - 1] == 0 && (local78[local3 + 1][local10 - 1] & 0x12C0183) == 0 && (local78[local3 + 1][local10] & 0x12C0180) == 0 && (local78[local3][local10 - 1] & 0x12C0102) == 0) {
				queueX[local71] = local3 + 1;
				queueZ[local71] = local10 - 1;
				local71 = local71 + 1 & 0xFFF;
				parents[local3 + 1][local10 - 1] = 9;
				costs[local3 + 1][local10 - 1] = local198;
			}
			if (local3 > 0 && local10 < 103 && parents[local3 - 1][local10 + 1] == 0 && (local78[local3 - 1][local10 + 1] & 0x12C0138) == 0 && (local78[local3 - 1][local10] & 0x12C0108) == 0 && (local78[local3][local10 + 1] & 0x12C0120) == 0) {
				queueX[local71] = local3 - 1;
				queueZ[local71] = local10 + 1;
				parents[local3 - 1][local10 + 1] = 6;
				local71 = local71 + 1 & 0xFFF;
				costs[local3 - 1][local10 + 1] = local198;
			}
			if (local3 < 103 && local10 < 103 && parents[local3 + 1][local10 + 1] == 0 && (local78[local3 + 1][local10 + 1] & 0x12C01E0) == 0 && (local78[local3 + 1][local10] & 0x12C0180) == 0 && (local78[local3][local10 + 1] & 0x12C0120) == 0) {
				queueX[local71] = local3 + 1;
				queueZ[local71] = local10 + 1;
				parents[local3 + 1][local10 + 1] = 12;
				local71 = local71 + 1 & 0xFFF;
				costs[local3 + 1][local10 + 1] = local198;
			}
		}
		anInt4364 = 0;
		@Pc(839) int local839;
		if (!local53) {
			if (!arg7) {
				return false;
			}
			local198 = 1000;
			local839 = 100;
			for (@Pc(846) int local846 = arg0 - 10; local846 <= arg0 + 10; local846++) {
				for (@Pc(856) int local856 = arg3 - 10; local856 <= arg3 + 10; local856++) {
					if (local846 >= 0 && local856 >= 0 && local846 < 104 && local856 < 104 && costs[local846][local856] < 100) {
						@Pc(894) int local894 = 0;
						if (local856 < arg3) {
							local894 = arg3 - local856;
						} else if (arg5 + arg3 - 1 < local856) {
							local894 = local856 + 1 - arg3 - arg5;
						}
						@Pc(927) int local927 = 0;
						if (local846 < arg0) {
							local927 = arg0 - local846;
						} else if (local846 > arg10 + arg0 - 1) {
							local927 = local846 + 1 - arg10 - arg0;
						}
						@Pc(968) int local968 = local894 * local894 + local927 * local927;
						if (local968 < local198 || local968 == local198 && costs[local846][local856] < local839) {
							local10 = local856;
							local198 = local968;
							local3 = local846;
							local839 = costs[local846][local856];
						}
					}
				}
			}
			if (local198 == 1000) {
				return false;
			}
			if (arg2 == local3 && local10 == arg9) {
				return false;
			}
			anInt4364 = 1;
		}
		@Pc(1032) byte local1032 = 0;
		queueX[0] = local3;
		local64 = local1032 + 1;
		queueZ[0] = local10;
		local198 = local839 = parents[local3][local10];
		while (arg2 != local3 || local10 != arg9) {
			if (local839 != local198) {
				local839 = local198;
				queueX[local64] = local3;
				queueZ[local64++] = local10;
			}
			if ((local198 & 0x2) != 0) {
				local3++;
			} else if ((local198 & 0x8) != 0) {
				local3--;
			}
			if ((local198 & 0x1) != 0) {
				local10++;
			} else if ((local198 & 0x4) != 0) {
				local10--;
			}
			local198 = parents[local3][local10];
		}
		if (local64 > 0) {
			ClientProt.method3502(local64, arg4);
			return true;
		} else return arg4 != 1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBIIIIIIIIIZI)Z")
	public static boolean findPath1(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = 0; local3 < 104; local3++) {
			for (local10 = 0; local10 < 104; local10++) {
				parents[local3][local10] = 0;
				costs[local3][local10] = 99999999;
			}
		}
		local3 = arg8;
		local10 = arg11;
		parents[arg8][arg11] = 99;
		costs[arg8][arg11] = 0;
		@Pc(53) byte local53 = 0;
		queueX[0] = arg8;
		@Pc(65) int local65 = local53 + 1;
		queueZ[0] = arg11;
		@Pc(69) int local69 = 0;
		@Pc(71) boolean local71 = false;
		@Pc(76) int[][] local76 = collisionMaps[Player.plane].flags;
		@Pc(201) int local201;
		@Pc(242) int local242;
		label397:
		while (local69 != local65) {
			local3 = queueX[local69];
			local10 = queueZ[local69];
			local69 = local69 + 1 & 0xFFF;
			if (arg5 == local3 && local10 == arg0) {
				local71 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && collisionMaps[Player.plane].isAtWall(arg0, local3, local10, arg5, arg6 - 1, arg4, arg3)) {
					local71 = true;
					break;
				}
				if (arg6 < 10 && collisionMaps[Player.plane].isAtWallDecor(arg0, arg6 - 1, arg5, local10, arg4, arg3, local3)) {
					local71 = true;
					break;
				}
			}
			if (arg1 != 0 && arg9 != 0 && collisionMaps[Player.plane].isInsideOrOutsideRect(arg5, local10, local3, arg4, arg1, arg7, arg0, arg9)) {
				local71 = true;
				break;
			}
			local201 = costs[local3][local10] + 1;
			if (local3 > 0 && parents[local3 - 1][local10] == 0 && (local76[local3 - 1][local10] & 0x12C010E) == 0 && (local76[local3 - 1][arg4 + local10 - 1] & 0x12C0138) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						queueX[local65] = local3 - 1;
						queueZ[local65] = local10;
						parents[local3 - 1][local10] = 2;
						local65 = local65 + 1 & 0xFFF;
						costs[local3 - 1][local10] = local201;
						break;
					}
					if ((local76[local3 - 1][local10 + local242] & 0x12C013E) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 < 102 && parents[local3 + 1][local10] == 0 && (local76[local3 + arg4][local10] & 0x12C0183) == 0 && (local76[arg4 + local3][local10 + arg4 - 1] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (local242 >= arg4 - 1) {
						queueX[local65] = local3 + 1;
						queueZ[local65] = local10;
						parents[local3 + 1][local10] = 8;
						costs[local3 + 1][local10] = local201;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[arg4 + local3][local10 + local242] & 0x12C01E3) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local10 > 0 && parents[local3][local10 - 1] == 0 && (local76[local3][local10 - 1] & 0x12C010E) == 0 && (local76[arg4 + local3 - 1][local10 - 1] & 0x12C0183) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						queueX[local65] = local3;
						queueZ[local65] = local10 - 1;
						parents[local3][local10 - 1] = 1;
						local65 = local65 + 1 & 0xFFF;
						costs[local3][local10 - 1] = local201;
						break;
					}
					if ((local76[local3 + local242][local10 - 1] & 0x12C018F) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local10 < 102 && parents[local3][local10 + 1] == 0 && (local76[local3][local10 + arg4] & 0x12C0138) == 0 && (local76[local3 + arg4 - 1][arg4 + local10] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (local242 >= arg4 - 1) {
						queueX[local65] = local3;
						queueZ[local65] = local10 + 1;
						parents[local3][local10 + 1] = 4;
						costs[local3][local10 + 1] = local201;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local76[local3 + local242][arg4 + local10] & 0x12C01F8) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 > 0 && local10 > 0 && parents[local3 - 1][local10 - 1] == 0 && (local76[local3 - 1][arg4 + local10 - 1 - 1] & 0x12C0138) == 0 && (local76[local3 - 1][local10 - 1] & 0x12C010E) == 0 && (local76[arg4 + local3 - 1 - 1][local10 - 1] & 0x12C0183) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						queueX[local65] = local3 - 1;
						queueZ[local65] = local10 - 1;
						local65 = local65 + 1 & 0xFFF;
						parents[local3 - 1][local10 - 1] = 3;
						costs[local3 - 1][local10 - 1] = local201;
						break;
					}
					if ((local76[local3 - 1][local10 + local242 - 1] & 0x12C013E) != 0 || (local76[local242 + local3 - 1][local10 - 1] & 0x12C018F) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 < 102 && local10 > 0 && parents[local3 + 1][local10 - 1] == 0 && (local76[local3 + 1][local10 - 1] & 0x12C010E) == 0 && (local76[arg4 + local3][local10 - 1] & 0x12C0183) == 0 && (local76[local3 + arg4][local10 + arg4 - 1 - 1] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (local242 >= arg4 - 1) {
						queueX[local65] = local3 + 1;
						queueZ[local65] = local10 - 1;
						local65 = local65 + 1 & 0xFFF;
						parents[local3 + 1][local10 - 1] = 9;
						costs[local3 + 1][local10 - 1] = local201;
						break;
					}
					if ((local76[local3 + arg4][local10 + local242 - 1] & 0x12C01E3) != 0 || (local76[local242 + local3 + 1][local10 - 1] & 0x12C018F) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 > 0 && local10 < 102 && parents[local3 - 1][local10 + 1] == 0 && (local76[local3 - 1][local10 + 1] & 0x12C010E) == 0 && (local76[local3 - 1][local10 + arg4] & 0x12C0138) == 0 && (local76[local3][local10 + arg4] & 0x12C01E0) == 0) {
				local242 = 1;
				while (true) {
					if (arg4 - 1 <= local242) {
						queueX[local65] = local3 - 1;
						queueZ[local65] = local10 + 1;
						local65 = local65 + 1 & 0xFFF;
						parents[local3 - 1][local10 + 1] = 6;
						costs[local3 - 1][local10 + 1] = local201;
						break;
					}
					if ((local76[local3 - 1][local10 + local242 + 1] & 0x12C013E) != 0 || (local76[local242 + local3 - 1][arg4 + local10] & 0x12C01F8) != 0) {
						break;
					}
					local242++;
				}
			}
			if (local3 < 102 && local10 < 102 && parents[local3 + 1][local10 + 1] == 0 && (local76[local3 + 1][local10 + arg4] & 0x12C0138) == 0 && (local76[local3 + arg4][local10 + arg4] & 0x12C01E0) == 0 && (local76[arg4 + local3][local10 + 1] & 0x12C0183) == 0) {
				for (local242 = 1; local242 < arg4 - 1; local242++) {
					if ((local76[local242 + local3 + 1][local10 + arg4] & 0x12C01F8) != 0 || (local76[arg4 + local3][local242 + local10 + 1] & 0x12C01E3) != 0) {
						continue label397;
					}
				}
				queueX[local65] = local3 + 1;
				queueZ[local65] = local10 + 1;
				parents[local3 + 1][local10 + 1] = 12;
				costs[local3 + 1][local10 + 1] = local201;
				local65 = local65 + 1 & 0xFFF;
			}
		}
		anInt4364 = 0;
		if (!local71) {
			if (!arg10) {
				return false;
			}
			local201 = 1000;
			local242 = 100;
			for (@Pc(1247) int local1247 = arg5 - 10; local1247 <= arg5 + 10; local1247++) {
				for (@Pc(1257) int local1257 = arg0 - 10; local1257 <= arg0 + 10; local1257++) {
					if (local1247 >= 0 && local1257 >= 0 && local1247 < 104 && local1257 < 104 && costs[local1247][local1257] < 100) {
						@Pc(1295) int local1295 = 0;
						if (arg5 > local1247) {
							local1295 = arg5 - local1247;
						} else if (arg5 + arg1 - 1 < local1247) {
							local1295 = local1247 + 1 - arg1 - arg5;
						}
						@Pc(1334) int local1334 = 0;
						if (local1257 < arg0) {
							local1334 = arg0 - local1257;
						} else if (arg0 + arg9 - 1 < local1257) {
							local1334 = local1257 + 1 - arg0 - arg9;
						}
						@Pc(1377) int local1377 = local1295 * local1295 + local1334 * local1334;
						if (local1377 < local201 || local1377 == local201 && local242 > costs[local1247][local1257]) {
							local242 = costs[local1247][local1257];
							local3 = local1247;
							local201 = local1377;
							local10 = local1257;
						}
					}
				}
			}
			if (local201 == 1000) {
				return false;
			}
			if (local3 == arg8 && arg11 == local10) {
				return false;
			}
			anInt4364 = 1;
		}
		@Pc(1438) byte local1438 = 0;
		queueX[0] = local3;
		local69 = local1438 + 1;
		queueZ[0] = local10;
		local201 = local242 = parents[local3][local10];
		while (local3 != arg8 || arg11 != local10) {
			if (local242 != local201) {
				queueX[local69] = local3;
				local242 = local201;
				queueZ[local69++] = local10;
			}
			if ((local201 & 0x2) != 0) {
				local3++;
			} else if ((local201 & 0x8) != 0) {
				local3--;
			}
			if ((local201 & 0x1) != 0) {
				local10++;
			} else if ((local201 & 0x4) != 0) {
				local10--;
			}
			local201 = parents[local3][local10];
		}
		if (local69 > 0) {
			ClientProt.method3502(local69, arg2);
			return true;
		} else return arg2 != 1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BJII)Z")
	public static boolean findPathToLoc(@OriginalArg(1) long key, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int shape = (int) key >> 14 & 0x1F;
		@Pc(24) int angle = (int) key >> 20 & 0x3;
		@Pc(31) int id = (int) (key >>> 32) & Integer.MAX_VALUE;
		if (shape == 10 || shape == 11 || shape == 22) {
			@Pc(46) LocType local46 = LocTypeList.get(id);
			@Pc(62) int local62;
			@Pc(59) int local59;
			if (angle == 0 || angle == 2) {
				local59 = local46.length;
				local62 = local46.width;
			} else {
				local59 = local46.width;
				local62 = local46.length;
			}
			@Pc(73) int local73 = local46.blocksides;
			if (angle != 0) {
				local73 = (local73 << angle & 0xF) + (local73 >> 4 - angle);
			}
			findPath(PlayerList.self.movementQueueZ[0], 0, local59, true, local73, arg2, local62, 0, 2, arg1, PlayerList.self.movementQueueX[0]);
		} else {
			findPath(PlayerList.self.movementQueueZ[0], angle, 0, true, 0, arg2, 0, shape + 1, 2, arg1, PlayerList.self.movementQueueX[0]);
		}
		Cross.y = Mouse.clickY;
		Cross.milliseconds = 0;
		Cross.type = 2;
		Cross.x = Mouse.clickX;
		return true;
	}
}
