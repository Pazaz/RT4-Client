package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class PlayerAppearance {

	@OriginalMember(owner = "client!md", name = "V", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_BODY_COLORS = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_SKIN_COLORS = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};

	@OriginalMember(owner = "client!pk", name = "V", descriptor = "[S")
	public static final short[] GAME0_SOURCE_SKIN_COLORS = new short[]{-10304, 9104, -1, -1, -1};

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "[S")
	public static final short[] GAME0_SOURCE_BODY_COLORS = new short[]{6798, 8741, 25238, 4626, 4550};

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "[S")
	public static final short[] GAME1_SOURCE_SKIN_COLORS = new short[]{-4160, -4163, -8256, -8259, 22461};

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[S")
	public static final short[] GAME1_SOURCE_BODY_COLORS = new short[]{960, 957, -21568, -21571, 22464};

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "[[S")
	public static final short[][] GAME1_DESTINATION_SKIN_COLORS = new short[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904}};

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[[S")
	public static final short[][] GAME1_DESTINATION_BODY_COLORS = new short[][]{{10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898}, {10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898}, {4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898}};

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
	public static final int[] BASE_PART_MAP = new int[]{8, 11, 4, 6, 9, 7, 10, 0};

	@OriginalMember(owner = "client!r", name = "b", descriptor = "[Lclient!tk;")
	public static final SeqType[] aClass144Array2 = new SeqType[14];

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "[I")
	public static final int[] anIntArray187 = new int[14];

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!n;")
	public static final SoftLruHashTable bodyModels = new SoftLruHashTable(260);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!n;")
	public static final SoftLruHashTable headModels = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
	public static final int[] MALE_FEATURES = new int[]{0, 1, 2, 3, 4, 5, 6, 14};

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!hh;")
	public static final PlayerAppearance DEFAULT = new PlayerAppearance();

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "[I")
	public static final int[] FEMALE_FEATURES = new int[]{7, 8, 9, 10, 11, 12, 13, 15};

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array8 = new AnimFrameset[14];

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
	public static final int[] anIntArray515 = new int[14];

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[Lclient!cl;")
	public static final AnimFrameset[] aClass3_Sub2_Sub7Array7 = new AnimFrameset[14];

	@OriginalMember(owner = "client!fm", name = "fb", descriptor = "[I")
	public static final int[] anIntArray183 = new int[14];
	@OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
	public static final int[] anIntArray520 = new int[14];

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[[S")
	public static short[][] destinationBodyColors;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "[[S")
	public static short[][] destinationSkinColors;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[S")
	public static short[] aShortArray65;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "[S")
	public static short[] aShortArray41;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public int npcId;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "J")
	private long prevChecksum;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
	private int[] identikit;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	private int basId;

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "J")
	private long checksum;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "[I")
	private int[] colors;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Z")
	public boolean gender;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V")
	public static void clean() {
		bodyModels.clean(5);
		headModels.clean(5);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public static void removeSoft() {
		bodyModels.removeSoft();
		headModels.removeSoft();
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
	public static void clear() {
		bodyModels.clear();
		headModels.clear();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)I")
	public static int getModelCacheSize() {
		return bodyModels.size();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILclient!tk;III)Lclient!ak;")
	public final Model method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) SeqType arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) long local24 = (long) arg2 | ((long) arg6 << 16) | (long) arg1 << 32;
		@Pc(30) Model local30 = (Model) headModels.get(local24);
		if (local30 == null) {
			@Pc(36) RawModel[] local36 = new RawModel[3];
			@Pc(38) int local38 = 0;
			if (!IdkTypeList.get(arg2).isHeadModelReady() || !IdkTypeList.get(arg6).isHeadModelReady() || !IdkTypeList.get(arg1).isHeadModelReady()) {
				return null;
			}
			@Pc(66) RawModel local66 = IdkTypeList.get(arg2).getHeadModel();
			if (local66 != null) {
				local38++;
				local36[0] = local66;
			}
			local66 = IdkTypeList.get(arg6).getHeadModel();
			if (local66 != null) {
				local36[local38++] = local66;
			}
			local66 = IdkTypeList.get(arg1).getHeadModel();
			if (local66 != null) {
				local36[local38++] = local66;
			}
			local66 = new RawModel(local36, local38);
			for (@Pc(110) int local110 = 0; local110 < 5; local110++) {
				if (this.colors[local110] < destinationBodyColors[local110].length) {
					local66.recolor(aShortArray65[local110], destinationBodyColors[local110][this.colors[local110]]);
				}
				if (destinationSkinColors[local110].length > this.colors[local110]) {
					local66.recolor(aShortArray41[local110], destinationSkinColors[local110][this.colors[local110]]);
				}
			}
			local30 = local66.createModel(64, 768, -50, -10, -50);
			headModels.put(local30, local24);
		}
		if (arg4 != null) {
			local30 = arg4.method4215(local30, arg0, arg3, arg5);
		}
		return local30;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	private void updateChecksum() {
		@Pc(8) long previousChecksum = this.checksum;
		this.checksum = -1L;
		@Pc(13) long[] CRC64_TABLE = Buffer.CRC64_TABLE;
		this.checksum = CRC64_TABLE[(int) (((long) (this.basId >> 8) ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
		this.checksum = CRC64_TABLE[(int) ((this.checksum ^ (long) this.basId) & 0xFFL)] ^ this.checksum >>> 8;
		for (int body = 0; body < 12; body++) {
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.identikit[body] >> 24)) & 0xFFL)];
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) (this.identikit[body] >> 16)) & 0xFFL)];
			this.checksum = CRC64_TABLE[(int) (((long) (this.identikit[body] >> 8) ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
			this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) ((this.checksum ^ (long) this.identikit[body]) & 0xFFL)];
		}
		for (int color = 0; color < 5; color++) {
			this.checksum = CRC64_TABLE[(int) (((long) this.colors[color] ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
		}
		this.checksum = CRC64_TABLE[(int) (((long) (this.gender ? 1 : 0) ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
		if (previousChecksum != 0L && this.checksum != previousChecksum) {
			bodyModels.remove(previousChecksum);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
	public final void setGender(@OriginalArg(0) boolean female) {
		this.gender = female;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([IIZI[II)V")
	public final void set(@OriginalArg(0) int[] colors, @OriginalArg(1) int npcId, @OriginalArg(2) boolean female, @OriginalArg(4) int[] identikit, @OriginalArg(5) int arg4) {
		if (arg4 != this.basId) {
			this.basId = arg4;
			this.anIntArrayArray19 = null;
		}
		if (identikit == null) {
			identikit = new int[12];
			for (@Pc(24) int i = 0; i < 8; i++) {
				for (@Pc(31) int id = 0; id < IdkTypeList.count; id++) {
					@Pc(38) IdkType type = IdkTypeList.get(id);
					if (type != null && !type.disable && type.feature == (female ? FEMALE_FEATURES[i] : MALE_FEATURES[i])) {
						identikit[BASE_PART_MAP[i]] = Integer.MIN_VALUE | id;
						break;
					}
				}
			}
		}
		this.npcId = npcId;
		this.gender = female;
		this.colors = colors;
		this.identikit = identikit;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI)V")
	public final void setColor(@OriginalArg(0) int i, @OriginalArg(2) int color) {
		this.colors[i] = color;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)I")
	public final int method1952() {
		return this.npcId == -1 ? (this.identikit[8] << 10) + ((this.colors[0] << 25) + (this.colors[4] << 20)) + (this.identikit[0] << 15) + (this.identikit[11] << 5) + this.identikit[1] : NpcTypeList.get(this.npcId).id + 305419896;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public final void setIdentikit(@OriginalArg(0) int arg0, @OriginalArg(1) int identikit) {
		@Pc(7) int part = BASE_PART_MAP[arg0];
		if (0 != this.identikit[part] && IdkTypeList.get(identikit) != null) {
			this.identikit[part] = identikit | Integer.MIN_VALUE;
			this.updateChecksum();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lclient!ub;ILclient!tk;Lclient!tk;IIIIZII)Lclient!ak;")
	public final Model method1954(@OriginalArg(0) PathingEntity_Class147[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) SeqType arg2, @OriginalArg(3) SeqType arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (this.npcId != -1) {
			return NpcTypeList.get(this.npcId).getBodyModel(arg0, arg5, arg8, arg1, arg6, arg7, arg2, arg4, arg3);
		}
		@Pc(38) int[] local38 = this.identikit;
		@Pc(41) long local41 = this.checksum;
		if (arg3 != null && (arg3.mainhand >= 0 || arg3.offhand >= 0)) {
			local38 = new int[12];
			for (@Pc(61) int local61 = 0; local61 < 12; local61++) {
				local38[local61] = this.identikit[local61];
			}
			if (arg3.mainhand >= 0) {
				if (arg3.mainhand == 65535) {
					local41 ^= 0xFFFFFFFF00000000L;
					local38[5] = 0;
				} else {
					local38[5] = arg3.mainhand | 0x40000000;
					local41 ^= (long) local38[5] << 32;
				}
			}
			if (arg3.offhand >= 0) {
				if (arg3.offhand == 65535) {
					local38[3] = 0;
					local41 ^= 0xFFFFFFFFL;
				} else {
					local38[3] = arg3.offhand | 0x40000000;
					local41 ^= local38[3];
				}
			}
		}
		@Pc(154) Model local154 = (Model) bodyModels.get(local41);
		@Pc(158) boolean local158;
		@Pc(353) int local353;
		@Pc(360) int local360;
		@Pc(374) int local374;
		@Pc(367) int local367;
		@Pc(381) int local381;
		@Pc(451) int local451;
		@Pc(457) int local457;
		@Pc(475) int local475;
		@Pc(481) int local481;
		@Pc(598) int local598;
		@Pc(346) int local346;
		if (local154 == null) {
			local158 = false;
			@Pc(169) int local169;
			for (@Pc(160) int local160 = 0; local160 < 12; local160++) {
				local169 = local38[local160];
				if ((local169 & 0x40000000) == 0) {
					if ((local169 & Integer.MIN_VALUE) != 0 && !IdkTypeList.get(local169 & 0x3FFFFFFF).isBodyModelReady()) {
						local158 = true;
					}
				} else if (!ObjTypeList.get(local169 & 0x3FFFFFFF).isWearModelReady(this.gender)) {
					local158 = true;
				}
			}
			if (local158) {
				if (this.prevChecksum != -1L) {
					local154 = (Model) bodyModels.get(this.prevChecksum);
				}
				if (local154 == null) {
					return null;
				}
			}
			if (local154 == null) {
				@Pc(239) RawModel[] local239 = new RawModel[12];
				@Pc(250) int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = local38[local169];
					@Pc(272) RawModel local272;
					if ((local250 & 0x40000000) != 0) {
						local272 = ObjTypeList.get(local250 & 0x3FFFFFFF).getBodyModel(this.gender);
						if (local272 != null) {
							local239[local169] = local272;
						}
					} else if ((Integer.MIN_VALUE & local250) != 0) {
						local272 = IdkTypeList.get(local250 & 0x3FFFFFFF).getBodyModel();
						if (local272 != null) {
							local239[local169] = local272;
						}
					}
				}
				@Pc(303) BasType local303 = null;
				if (this.basId != -1) {
					local303 = BasTypeList.get(this.basId);
				}
				if (local303 != null && local303.modelRotateTranslate != null) {
					for (local250 = 0; local250 < local303.modelRotateTranslate.length; local250++) {
						if (local303.modelRotateTranslate[local250] != null && local239[local250] != null) {
							local346 = local303.modelRotateTranslate[local250][0];
							local353 = local303.modelRotateTranslate[local250][1];
							local360 = local303.modelRotateTranslate[local250][2];
							local367 = local303.modelRotateTranslate[local250][4];
							local374 = local303.modelRotateTranslate[local250][3];
							local381 = local303.modelRotateTranslate[local250][5];
							if (this.anIntArrayArray19 == null) {
								this.anIntArrayArray19 = new int[local303.modelRotateTranslate.length][];
							}
							if (this.anIntArrayArray19[local250] == null) {
								@Pc(404) int[] local404 = this.anIntArrayArray19[local250] = new int[15];
								if (local374 == 0 && local367 == 0 && local381 == 0) {
									local404[12] = -local346;
									local404[13] = -local353;
									local404[0] = local404[4] = local404[8] = 32768;
									local404[14] = -local360;
								} else {
									local451 = MathUtils.cos[local374] >> 1;
									local457 = MathUtils.sin[local374] >> 1;
									@Pc(463) int local463 = MathUtils.cos[local367] >> 1;
									@Pc(469) int local469 = MathUtils.sin[local367] >> 1;
									local475 = MathUtils.cos[local381] >> 1;
									local481 = MathUtils.sin[local381] >> 1;
									local404[4] = local451 * local475 + 16384 >> 15;
									local404[5] = -local457;
									local404[3] = local481 * local451 + 16384 >> 15;
									local404[2] = local451 * local469 + 16384 >> 15;
									local404[8] = local463 * local451 + 16384 >> 15;
									@Pc(534) int local534 = local481 * local457 + 16384 >> 15;
									local404[0] = local469 * local534 + local475 * local463 + 16384 >> 15;
									local404[14] = local404[8] * -local360 + -local353 * local404[5] + local404[2] * -local346 + 16384 >> 15;
									local404[6] = local463 * local534 + local475 * -local469 + 16384 >> 15;
									local598 = local475 * local457 + 16384 >> 15;
									local404[7] = -local481 * -local469 + local598 * local463 + 16384 >> 15;
									local404[1] = local469 * local598 + local463 * -local481 + 16384 >> 15;
									local404[12] = -local353 * local404[3] + local404[0] * -local346 + -local360 * local404[6] + 16384 >> 15;
									local404[13] = -local353 * local404[4] + local404[1] * -local346 + -local360 * local404[7] + 16384 >> 15;
								}
								local404[9] = local346;
								local404[11] = local360;
								local404[10] = local353;
							}
							if (local374 != 0 || local367 != 0 || local381 != 0) {
								local239[local250].method1684(local374, local367, local381);
							}
							if (local346 != 0 || local353 != 0 || local360 != 0) {
								local239[local250].translate(local346, local353, local360);
							}
						}
					}
				}
				@Pc(740) RawModel local740 = new RawModel(local239, local239.length);
				for (local346 = 0; local346 < 5; local346++) {
					if (destinationBodyColors[local346].length > this.colors[local346]) {
						local740.recolor(aShortArray65[local346], destinationBodyColors[local346][this.colors[local346]]);
					}
					if (destinationSkinColors[local346].length > this.colors[local346]) {
						local740.recolor(aShortArray41[local346], destinationSkinColors[local346][this.colors[local346]]);
					}
				}
				local154 = local740.createModel(64, 850, -30, -50, -30);
				if (GlRenderer.enabled) {
					((GlModel) local154).method4111(false, false, true, false, false, true);
				}
				bodyModels.put(local154, local41);
				this.prevChecksum = local41;
			}
		}
		local158 = false;
		@Pc(827) boolean local827 = false;
		local346 = arg0 == null ? 0 : arg0.length;
		@Pc(836) boolean local836 = false;
		@Pc(838) boolean local838 = false;
		@Pc(979) int local979;
		for (local353 = 0; local353 < local346; local353++) {
			if (arg0[local353] != null) {
				@Pc(858) SeqType local858 = SeqTypeList.get(arg0[local353].anInt5396);
				if (local858.frames != null) {
					local158 = true;
					aClass144Array2[local353] = local858;
					local374 = arg0[local353].anInt5399;
					local367 = arg0[local353].anInt5398;
					local381 = local858.frames[local374];
					aClass3_Sub2_Sub7Array8[local353] = SeqTypeList.getAnimFrameset(local381 >>> 16);
					local381 &= 0xFFFF;
					anIntArray520[local353] = local381;
					if (aClass3_Sub2_Sub7Array8[local353] != null) {
						local836 |= aClass3_Sub2_Sub7Array8[local353].isColorTransformed(local381);
						local827 |= aClass3_Sub2_Sub7Array8[local353].isAlphaTransformed(local381);
						local838 |= local858.aBoolean278;
					}
					if ((local858.tween || SeqType.applyTweening) && local367 != -1 && local367 < local858.frames.length) {
						anIntArray515[local353] = local858.frameDelay[local374];
						anIntArray183[local353] = arg0[local353].anInt5404;
						local979 = local858.frames[local367];
						aClass3_Sub2_Sub7Array7[local353] = SeqTypeList.getAnimFrameset(local979 >>> 16);
						@Pc(991) int local991 = local979 & 0xFFFF;
						anIntArray187[local353] = local991;
						if (aClass3_Sub2_Sub7Array7[local353] != null) {
							local836 |= aClass3_Sub2_Sub7Array7[local353].isColorTransformed(local991);
							local827 |= aClass3_Sub2_Sub7Array7[local353].isAlphaTransformed(local991);
						}
					} else {
						anIntArray515[local353] = 0;
						anIntArray183[local353] = 0;
						aClass3_Sub2_Sub7Array7[local353] = null;
						anIntArray187[local353] = -1;
					}
				}
			}
		}
		if (!local158 && arg3 == null && arg2 == null) {
			return local154;
		}
		local353 = -1;
		local360 = -1;
		local374 = 0;
		@Pc(1040) AnimFrameset local1040 = null;
		@Pc(1042) AnimFrameset local1042 = null;
		if (arg3 != null) {
			local353 = arg3.frames[arg7];
			local979 = local353 >>> 16;
			local1042 = SeqTypeList.getAnimFrameset(local979);
			local353 &= 0xFFFF;
			if (local1042 != null) {
				local836 |= local1042.isColorTransformed(local353);
				local827 |= local1042.isAlphaTransformed(local353);
				local838 |= arg3.aBoolean278;
			}
			if ((arg3.tween || SeqType.applyTweening) && arg1 != -1 && arg3.frames.length > arg1) {
				local360 = arg3.frames[arg1];
				local451 = local360 >>> 16;
				local360 &= 0xFFFF;
				local374 = arg3.frameDelay[arg7];
				if (local979 == local451) {
					local1040 = local1042;
				} else {
					local1040 = SeqTypeList.getAnimFrameset(local360 >>> 16);
				}
				if (local1040 != null) {
					local836 |= local1040.isColorTransformed(local360);
					local827 |= local1040.isAlphaTransformed(local360);
				}
			}
		}
		local979 = -1;
		local451 = -1;
		@Pc(1154) AnimFrameset local1154 = null;
		@Pc(1156) AnimFrameset local1156 = null;
		local457 = 0;
		if (arg2 != null) {
			local979 = arg2.frames[arg8];
			local475 = local979 >>> 16;
			local979 &= 0xFFFF;
			local1154 = SeqTypeList.getAnimFrameset(local475);
			if (local1154 != null) {
				local836 |= local1154.isColorTransformed(local979);
				local827 |= local1154.isAlphaTransformed(local979);
				local838 |= arg2.aBoolean278;
			}
			if ((arg2.tween || SeqType.applyTweening) && arg5 != -1 && arg2.frames.length > arg5) {
				local457 = arg2.frameDelay[arg8];
				local451 = arg2.frames[arg5];
				local481 = local451 >>> 16;
				local451 &= 0xFFFF;
				if (local475 == local481) {
					local1156 = local1154;
				} else {
					local1156 = SeqTypeList.getAnimFrameset(local451 >>> 16);
				}
				if (local1156 != null) {
					local836 |= local1156.isColorTransformed(local451);
					local827 |= local1156.isAlphaTransformed(local451);
				}
			}
		}
		@Pc(1284) Model local1284 = local154.method4572(!local827, !local836, !local838);
		local481 = 0;
		local598 = 1;
		while (local481 < local346) {
			if (aClass3_Sub2_Sub7Array8[local481] != null) {
				local1284.method4565(aClass3_Sub2_Sub7Array8[local481], anIntArray520[local481], aClass3_Sub2_Sub7Array7[local481], anIntArray187[local481], anIntArray183[local481] - 1, anIntArray515[local481], local598, aClass144Array2[local481].aBoolean278, this.anIntArrayArray19[local481]);
			}
			local481++;
			local598 <<= 0x1;
		}
		if (local1042 != null && local1154 != null) {
			local1284.method4570(local1042, local353, local1040, local360, arg6 - 1, local374, local1154, local979, local1156, local451, arg4 - 1, local457, arg3.framegroup, arg3.aBoolean278 | arg2.aBoolean278);
		} else if (local1042 != null) {
			local1284.method4558(local1042, local353, local1040, local360, arg6 - 1, local374, arg3.aBoolean278);
		} else if (local1154 != null) {
			local1284.method4558(local1154, local979, local1156, local451, arg4 - 1, local457, arg2.aBoolean278);
		}
		for (local481 = 0; local481 < local346; local481++) {
			aClass3_Sub2_Sub7Array8[local481] = null;
			aClass3_Sub2_Sub7Array7[local481] = null;
			aClass144Array2[local481] = null;
		}
		return local1284;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLclient!tk;II)Lclient!ak;")
	public final Model method1956(@OriginalArg(0) int arg0, @OriginalArg(2) SeqType arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.npcId != -1) {
			return NpcTypeList.get(this.npcId).getHeadModel(arg1, arg0, arg3, arg2);
		}
		@Pc(30) Model local30 = (Model) headModels.get(this.checksum);
		if (local30 == null) {
			@Pc(42) boolean local42 = false;
			@Pc(52) int local52;
			for (@Pc(44) int local44 = 0; local44 < 12; local44++) {
				local52 = this.identikit[local44];
				if ((local52 & 0x40000000) == 0) {
					if ((local52 & Integer.MIN_VALUE) != 0 && !IdkTypeList.get(local52 & 0x3FFFFFFF).isHeadModelReady()) {
						local42 = true;
					}
				} else if (!ObjTypeList.get(local52 & 0x3FFFFFFF).isHeadModelReady(this.gender)) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(100) RawModel[] local100 = new RawModel[12];
			local52 = 0;
			@Pc(114) int local114;
			for (@Pc(104) int local104 = 0; local104 < 12; local104++) {
				local114 = this.identikit[local104];
				@Pc(134) RawModel local134;
				if ((local114 & 0x40000000) != 0) {
					local134 = ObjTypeList.get(local114 & 0x3FFFFFFF).getHeadModel(this.gender);
					if (local134 != null) {
						local100[local52++] = local134;
					}
				} else if ((Integer.MIN_VALUE & local114) != 0) {
					local134 = IdkTypeList.get(local114 & 0x3FFFFFFF).getHeadModel();
					if (local134 != null) {
						local100[local52++] = local134;
					}
				}
			}
			@Pc(171) RawModel local171 = new RawModel(local100, local52);
			for (local114 = 0; local114 < 5; local114++) {
				if (destinationBodyColors[local114].length > this.colors[local114]) {
					local171.recolor(aShortArray65[local114], destinationBodyColors[local114][this.colors[local114]]);
				}
				if (destinationSkinColors[local114].length > this.colors[local114]) {
					local171.recolor(aShortArray41[local114], destinationSkinColors[local114][this.colors[local114]]);
				}
			}
			local30 = local171.createModel(64, 768, -50, -10, -50);
			headModels.put(local30, this.checksum);
		}
		if (arg1 != null) {
			local30 = arg1.method4215(local30, arg3, arg0, arg2);
		}
		return local30;
	}
}
