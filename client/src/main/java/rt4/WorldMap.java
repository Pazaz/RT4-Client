package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class WorldMap {
    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!na;")
    public static final JagString UNDERLAY = JagString.parse("underlay");
    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!na;")
    public static final JagString LABELS = JagString.parse("_labels");
    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!na;")
    public static final JagString OVERLAY = JagString.parse("overlay");
    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "Lclient!na;")
    public static final JagString OVERLAY2 = JagString.parse("overlay2");
    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!na;")
    public static final JagString LOC = JagString.parse("loc");
    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static final int anInt5338 = (int) (Math.random() * 33.0D) - 16;
    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    public static final int anInt3254 = (int) (Math.random() * 17.0D) - 8;
    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!ih;")
    public static final LinkedList mapElements = new LinkedList();
    @OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!na;")
    public static final JagString aClass100_517 = JagString.parse("");
    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lclient!bn;")
    public static Map currentMap;
    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int loadPercentage = 0;
    @OriginalMember(owner = "client!gj", name = "r", descriptor = "F")
    public static float zoom;
    @OriginalMember(owner = "client!km", name = "uc", descriptor = "F")
    public static float targetZoom;
    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int originX;
    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int originZ;
    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int length;
    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public static int width;
    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    public static int[] overlayColors;
    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!fd;")
    public static WorldMapFont font26;
    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!fd;")
    public static WorldMapFont font30;
    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Lclient!fd;")
    public static WorldMapFont font22;
    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!fd;")
    public static WorldMapFont font19;
    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lclient!fd;")
    public static WorldMapFont font17;
    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!fd;")
    public static WorldMapFont font14;
    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!fd;")
    public static WorldMapFont font12;
    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!fd;")
    public static WorldMapFont font11;
    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int anInt435;
    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int anInt4901 = -1;
    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int anInt3482 = -1;
    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int anInt919;
    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!se;")
    public static MapElementList labels;
    @OriginalMember(owner = "client!ck", name = "J", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray3;
    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray7;
    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray8;
    @OriginalMember(owner = "client!si", name = "R", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray12;
    @OriginalMember(owner = "client!jl", name = "I", descriptor = "[[[B")
    public static byte[][][] aByteArrayArrayArray10;
    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[[[I")
    public static int[][][] scenery;
    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[[[I")
    public static int[][][] underlayColors;
    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[[[I")
    public static int[][][] anIntArrayArrayArray17;
    @OriginalMember(owner = "client!bn", name = "N", descriptor = "Lclient!be;")
    public static Component component;
    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lclient!na;")
    public static JagString aClass100_724;
    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lclient!qf;")
    public static Sprite aClass3_Sub2_Sub1_2;
    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Lclient!mm;")
    public static SoftwareSprite aClass3_Sub2_Sub1_Sub1_2;
    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int anInt2387;
    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int anInt1176;
    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int anInt5212;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public static void method3413() {
        if (currentMap == null) {
            return;
        }

        if (loadPercentage < 10) {
            if (!MapList.archive.isGroupReady(currentMap.group)) {
                loadPercentage = client.js5Archive23.getPercentageComplete(currentMap.group) / 10;
                return;
            }

            Static6.method84();
            loadPercentage = 10;
        }

        if (loadPercentage == 10) {
            originX = currentMap.anInt763 >> 6 << 6;
            originZ = currentMap.anInt771 >> 6 << 6;
            length = (currentMap.anInt758 >> 6 << 6) + 64 - originZ;
            width = (currentMap.anInt770 >> 6 << 6) + 64 - originX;
            if (currentMap.defaultZoom == 37) {
                zoom = 3.0F;
                targetZoom = 3.0F;
            } else if (currentMap.defaultZoom == 50) {
                zoom = 4.0F;
                targetZoom = 4.0F;
            } else if (currentMap.defaultZoom == 75) {
                zoom = 6.0F;
                targetZoom = 6.0F;
            } else if (currentMap.defaultZoom == 100) {
                zoom = 8.0F;
                targetZoom = 8.0F;
            } else if (currentMap.defaultZoom == 200) {
                zoom = 16.0F;
                targetZoom = 16.0F;
            } else {
                zoom = 8.0F;
                targetZoom = 8.0F;
            }

            @Pc(144) int local144 = (PlayerList.self.xFine >> 7) + Camera.originX - originX;
            @Pc(153) int local153 = local144 + (int) (Math.random() * 10.0D) - 5;
            @Pc(168) int local168 = originZ + length - Camera.originZ - (PlayerList.self.zFine >> 7) - 1;
            @Pc(177) int local177 = local168 + (int) (Math.random() * 10.0D) - 5;
            if (local153 >= 0 && width > local153 && local177 >= 0 && local177 < length) {
                anInt435 = local153;
                anInt919 = local177;
            } else {
                anInt919 = originZ + length - currentMap.anInt764 * 64 - 1;
                anInt435 = currentMap.anInt769 * 64 - originX;
            }

            method965();
            overlayColors = new int[FloTypeList.capacity + 1];
            @Pc(235) int length = WorldMap.length >> 6;
            @Pc(239) int width = WorldMap.width >> 6;
            aByteArrayArrayArray8 = new byte[width][length][];
            @Pc(249) int local249 = Static45.anInt2293 >> 2 << 10;
            aByteArrayArrayArray7 = new byte[width][length][];
            underlayColors = new int[width][length][];
            aByteArrayArrayArray3 = new byte[width][length][];
            anIntArrayArrayArray17 = new int[width][length][];
            aByteArrayArrayArray12 = new byte[width][length][];
            @Pc(273) int local273 = Static183.anInt4272 >> 1;
            aByteArrayArrayArray10 = new byte[width][length][];
            scenery = new int[width][length][];
            Static70.loadOverlayColors(local273, local249);
            loadPercentage = 20;
        } else if (loadPercentage == 20) {
            readUnderlay(new Buffer(MapList.archive.fetchFile(UNDERLAY, currentMap.group)));
            loadPercentage = 30;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 30) {
            readOverlay(new Buffer(MapList.archive.fetchFile(OVERLAY, currentMap.group)));
            loadPercentage = 40;
            GameShell.resetTimer();
        } else if (loadPercentage == 40) {
            readOverlay2(new Buffer(MapList.archive.fetchFile(OVERLAY2, currentMap.group)));
            loadPercentage = 50;
            GameShell.resetTimer();
        } else if (loadPercentage == 50) {
            readLocs(new Buffer(MapList.archive.fetchFile(LOC, currentMap.group)));
            loadPercentage = 60;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 60) {
            if (MapList.archive.isGroupNameValid(JagString.concatenate(new JagString[] { currentMap.group, LABELS}))) {
                if (!MapList.archive.isGroupReady(JagString.concatenate(new JagString[] { currentMap.group, LABELS}))) {
                    return;
                }
                labels = MapElementList.create(JagString.concatenate(new JagString[] { currentMap.group, LABELS}), MapList.archive);
            } else {
                labels = new MapElementList(0);
            }
            loadPercentage = 70;
            GameShell.resetTimer();
        } else if (loadPercentage == 70) {
            font11 = new WorldMapFont(11, true, GameShell.canvas);
            loadPercentage = 73;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 73) {
            font12 = new WorldMapFont(12, true, GameShell.canvas);
            loadPercentage = 76;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 76) {
            font14 = new WorldMapFont(14, true, GameShell.canvas);
            loadPercentage = 79;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 79) {
            font17 = new WorldMapFont(17, true, GameShell.canvas);
            loadPercentage = 82;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 82) {
            font19 = new WorldMapFont(19, true, GameShell.canvas);
            loadPercentage = 85;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 85) {
            font22 = new WorldMapFont(22, true, GameShell.canvas);
            loadPercentage = 88;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else if (loadPercentage == 88) {
            font26 = new WorldMapFont(26, true, GameShell.canvas);
            loadPercentage = 91;
            ClientProt.ping(true);
            GameShell.resetTimer();
        } else {
            font30 = new WorldMapFont(30, true, GameShell.canvas);
            loadPercentage = 100;
            ClientProt.ping(true);
            GameShell.resetTimer();
            System.gc();
        }
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(B)V")
    public static void method965() {
        if (anInt435 < 0) {
            anInt4901 = -1;
            anInt435 = 0;
            anInt3482 = -1;
        }
        if (anInt435 > width) {
            anInt4901 = -1;
            anInt435 = width;
            anInt3482 = -1;
        }
        if (anInt919 < 0) {
            anInt3482 = -1;
            anInt4901 = -1;
            anInt919 = 0;
        }
        if (length < anInt919) {
            anInt919 = length;
            anInt4901 = -1;
            anInt3482 = -1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!wa;)V")
    public static void readUnderlay(@OriginalArg(1) Buffer data) {
        @Pc(13) int local13 = anInt5338 >> 1;
        @Pc(19) int local19 = anInt3254 >> 2 << 10;
        @Pc(23) byte[][] underlays = new byte[width][length];
        @Pc(33) int local33;
        @Pc(102) int local102;
        @Pc(114) int local114;
        while (data.offset < data.data.length) {
            @Pc(31) int local31 = 0;
            local33 = 0;
            @Pc(35) boolean local35 = false;
            if (data.g1() == 1) {
                local33 = data.g1();
                local31 = data.g1();
                local35 = true;
            }
            @Pc(57) int local57 = data.g1();
            @Pc(61) int local61 = data.g1();
            @Pc(68) int local68 = local57 * 64 - originX;
            @Pc(78) int local78 = length + originZ - local61 * 64 - 1;
            if (local68 >= 0 && local78 - 63 >= 0 && width > local68 + 63 && length > local78) {
                for (local102 = 0; local102 < 64; local102++) {
                    @Pc(112) byte[] underlay = underlays[local68 + local102];
                    for (local114 = 0; local114 < 64; local114++) {
                        if (!local35 || local102 >= local33 * 8 && local33 * 8 + 8 > local102 && local114 >= local31 * 8 && local114 < local31 * 8 + 8) {
                            underlay[local78 - local114] = data.g1b();
                        }
                    }
                }
            } else if (local35) {
                data.offset += 64;
            } else {
                data.offset += 4096;
            }
        }
        @Pc(175) int local175 = width;
        local33 = length;
        @Pc(180) int[] local180 = new int[local33];
        @Pc(183) int[] local183 = new int[local33];
        @Pc(186) int[] local186 = new int[local33];
        @Pc(189) int[] local189 = new int[local33];
        @Pc(192) int[] local192 = new int[local33];
        for (local102 = -5; local102 < local175; local102++) {
            @Pc(225) int local225;
            @Pc(293) int local293;
            for (@Pc(203) int local203 = 0; local203 < local33; local203++) {
                local114 = local102 + 5;
                @Pc(272) int local272;
                if (local175 > local114) {
                    local225 = underlays[local114][local203] & 0xFF;
                    if (local225 > 0) {
                        @Pc(236) FluType local236 = FluTypeList.get(local225 - 1);
                        local183[local203] += local236.weightedHue;
                        local180[local203] += local236.saturation;
                        local186[local203] += local236.lightness;
                        local189[local203] += local236.chroma;
                        local272 = local192[local203]++;
                    }
                }
                local225 = local102 - 5;
                if (local225 >= 0) {
                    local293 = underlays[local225][local203] & 0xFF;
                    if (local293 > 0) {
                        @Pc(302) FluType local302 = FluTypeList.get(local293 - 1);
                        local183[local203] -= local302.weightedHue;
                        local180[local203] -= local302.saturation;
                        local186[local203] -= local302.lightness;
                        local189[local203] -= local302.chroma;
                        local272 = local192[local203]--;
                    }
                }
            }
            if (local102 >= 0) {
                @Pc(355) int[][] local355 = anIntArrayArrayArray17[local102 >> 6];
                local114 = 0;
                local225 = 0;
                @Pc(361) int local361 = 0;
                @Pc(363) int local363 = 0;
                local293 = 0;
                for (@Pc(367) int local367 = -5; local367 < local33; local367++) {
                    @Pc(378) int local378 = local367 + 5;
                    if (local33 > local378) {
                        local363 += local192[local378];
                        local225 += local180[local378];
                        local293 += local186[local378];
                        local114 += local183[local378];
                        local361 += local189[local378];
                    }
                    @Pc(415) int local415 = local367 - 5;
                    if (local415 >= 0) {
                        local293 -= local186[local415];
                        local361 -= local189[local415];
                        local114 -= local183[local415];
                        local363 -= local192[local415];
                        local225 -= local180[local415];
                    }
                    if (local367 >= 0 && local363 > 0) {
                        @Pc(462) int[] local462 = local355[local367 >> 6];
                        @Pc(480) int local480 = local361 == 0 ? 0 : Static54.method1309(local293 / local363, local225 / local363, local114 * 256 / local361);
                        if (underlays[local102][local367] != 0) {
                            if (local462 == null) {
                                local462 = local355[local367 >> 6] = new int[4096];
                            }
                            @Pc(519) int local519 = local13 + (local480 & 0x7F);
                            if (local519 < 0) {
                                local519 = 0;
                            } else if (local519 > 127) {
                                local519 = 127;
                            }
                            @Pc(541) int local541 = local519 + (local480 & 0x380) + (local480 + local19 & 0xFC00);
                            local462[((local367 & 0x3F) << 6) + (local102 & 0x3F)] = Rasteriser.palette[Static87.method1814(96, local541)];
                        } else if (local462 != null) {
                            local462[((local367 & 0x3F) << 6) + (local102 & 0x3F)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!wa;Z)V")
    public static void readOverlay(@OriginalArg(0) Buffer arg0) {
        label87: while (true) {
            if (arg0.offset < arg0.data.length) {
                @Pc(22) int local22 = 0;
                @Pc(24) boolean local24 = false;
                @Pc(26) int local26 = 0;
                if (arg0.g1() == 1) {
                    local24 = true;
                    local22 = arg0.g1();
                    local26 = arg0.g1();
                }
                @Pc(46) int local46 = arg0.g1();
                @Pc(50) int local50 = arg0.g1();
                @Pc(62) int local62 = originZ + length - local50 * 64 - 1;
                @Pc(69) int local69 = local46 * 64 - originX;
                @Pc(147) byte local147;
                @Pc(91) int local91;
                if (local69 >= 0 && local62 - 63 >= 0 && local69 + 63 < width && local62 < length) {
                    local91 = local69 >> 6;
                    @Pc(95) int local95 = local62 >> 6;
                    @Pc(97) int local97 = 0;
                    while (true) {
                        if (local97 >= 64) {
                            continue label87;
                        }
                        for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
                            if (!local24 || local97 >= local22 * 8 && local97 < local22 * 8 + 8 && local104 >= local26 * 8 && local104 < local26 * 8 + 8) {
                                local147 = arg0.g1b();
                                if (local147 != 0) {
                                    if (aByteArrayArrayArray3[local91][local95] == null) {
                                        aByteArrayArrayArray3[local91][local95] = new byte[4096];
                                    }
                                    aByteArrayArrayArray3[local91][local95][local97 + (63 - local104 << 6)] = local147;
                                    @Pc(186) byte local186 = arg0.g1b();
                                    if (aByteArrayArrayArray8[local91][local95] == null) {
                                        aByteArrayArrayArray8[local91][local95] = new byte[4096];
                                    }
                                    aByteArrayArrayArray8[local91][local95][local97 + (63 - local104 << 6)] = local186;
                                }
                            }
                        }
                        local97++;
                    }
                }
                local91 = 0;
                while (true) {
                    if ((local24 ? 64 : 4096) <= local91) {
                        continue label87;
                    }
                    local147 = arg0.g1b();
                    if (local147 != 0) {
                        arg0.offset++;
                    }
                    local91++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!wa;)V")
    public static void readOverlay2(@OriginalArg(1) Buffer arg0) {
        label83: while (true) {
            if (arg0.offset < arg0.data.length) {
                @Pc(23) int local23 = 0;
                @Pc(25) boolean local25 = false;
                @Pc(27) int local27 = 0;
                if (arg0.g1() == 1) {
                    local25 = true;
                    local23 = arg0.g1();
                    local27 = arg0.g1();
                }
                @Pc(46) int local46 = arg0.g1();
                @Pc(50) int local50 = arg0.g1();
                @Pc(57) int local57 = local46 * 64 - originX;
                @Pc(68) int local68 = length + originZ - local50 * 64 - 1;
                @Pc(146) byte local146;
                @Pc(96) int local96;
                if (local57 >= 0 && local68 - 63 >= 0 && width > local57 + 63 && local68 < length) {
                    local96 = local57 >> 6;
                    @Pc(100) int local100 = local68 >> 6;
                    @Pc(102) int local102 = 0;
                    while (true) {
                        if (local102 >= 64) {
                            continue label83;
                        }
                        for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
                            if (!local25 || local23 * 8 <= local102 && local23 * 8 + 8 > local102 && local107 >= local27 * 8 && local27 * 8 + 8 > local107) {
                                local146 = arg0.g1b();
                                if (local146 != 0) {
                                    if (aByteArrayArrayArray12[local96][local100] == null) {
                                        aByteArrayArrayArray12[local96][local100] = new byte[4096];
                                    }
                                    aByteArrayArrayArray12[local96][local100][(63 - local107 << 6) + local102] = local146;
                                    @Pc(182) byte local182 = arg0.g1b();
                                    if (aByteArrayArrayArray10[local96][local100] == null) {
                                        aByteArrayArrayArray10[local96][local100] = new byte[4096];
                                    }
                                    aByteArrayArrayArray10[local96][local100][local102 + (63 - local107 << 6)] = local182;
                                }
                            }
                        }
                        local102++;
                    }
                }
                local96 = 0;
                while (true) {
                    if (local96 >= (local25 ? 64 : 4096)) {
                        continue label83;
                    }
                    local146 = arg0.g1b();
                    if (local146 != 0) {
                        arg0.offset++;
                    }
                    local96++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!wa;)V")
    public static void readLocs(@OriginalArg(1) Buffer arg0) {
        label123: while (true) {
            if (arg0.data.length > arg0.offset) {
                @Pc(17) boolean local17 = false;
                @Pc(19) int local19 = 0;
                @Pc(21) int local21 = 0;
                if (arg0.g1() == 1) {
                    local19 = arg0.g1();
                    local17 = true;
                    local21 = arg0.g1();
                }
                @Pc(42) int local42 = arg0.g1();
                @Pc(46) int local46 = arg0.g1();
                @Pc(53) int local53 = local42 * 64 - originX;
                @Pc(65) int local65 = originZ + length - local46 * 64 - 1;
                @Pc(84) int local84;
                @Pc(95) int local95;
                if (local53 >= 0 && local65 - 63 >= 0 && width > local53 + 63 && local65 < length) {
                    local84 = local53 >> 6;
                    local95 = local65 >> 6;
                    @Pc(150) int local150 = 0;
                    while (true) {
                        if (local150 >= 64) {
                            continue label123;
                        }
                        for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
                            if (!local17 || local19 * 8 <= local150 && local150 < local19 * 8 + 8 && local155 >= local21 * 8 && local155 < local21 * 8 + 8) {
                                @Pc(202) int local202 = arg0.g1();
                                if (local202 != 0) {
                                    @Pc(214) int id;
                                    if ((local202 & 0x1) == 1) {
                                        id = arg0.g1();
                                        if (aByteArrayArrayArray7[local84][local95] == null) {
                                            aByteArrayArrayArray7[local84][local95] = new byte[4096];
                                        }
                                        aByteArrayArrayArray7[local84][local95][local150 + (63 - local155 << 6)] = (byte) id;
                                    }
                                    if ((local202 & 0x2) == 2) {
                                        id = arg0.g3();
                                        if (scenery[local84][local95] == null) {
                                            scenery[local84][local95] = new int[4096];
                                        }
                                        scenery[local84][local95][(63 - local155 << 6) + local150] = id;
                                    }
                                    if ((local202 & 0x4) == 4) {
                                        id = arg0.g3();
                                        if (underlayColors[local84][local95] == null) {
                                            underlayColors[local84][local95] = new int[4096];
                                        }
                                        id--;
                                        @Pc(312) LocType local312 = LocTypeList.get(id);
                                        if (local312.multiLocs != null) {
                                            local312 = local312.getMultiLoc();
                                            if (local312 == null || local312.mapElement == -1) {
                                                continue;
                                            }
                                        }
                                        underlayColors[local84][local95][(63 - local155 << 6) + local150] = local312.id + 1;
                                        @Pc(353) MapElement element = new MapElement();
                                        element.id = local312.mapElement;
                                        element.anInt4307 = local53;
                                        element.anInt4314 = local65;
                                        mapElements.addTail(element);
                                    }
                                }
                            }
                        }
                        local150++;
                    }
                }
                local84 = 0;
                while (true) {
                    if (local84 >= (local17 ? 64 : 4096)) {
                        continue label123;
                    }
                    local95 = arg0.g1();
                    if (local95 != 0) {
                        if ((local95 & 0x1) == 1) {
                            arg0.offset++;
                        }
                        if ((local95 & 0x2) == 2) {
                            arg0.offset += 2;
                        }
                        if ((local95 & 0x4) == 4) {
                            arg0.offset += 3;
                        }
                    }
                    local84++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static void method2735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
        @Pc(9) int local9 = arg3 - arg5;
        @Pc(14) int local14 = arg1 - arg2;
        if (width > arg3) {
            local9++;
        }
        if (length > arg1) {
            local14++;
        }
        @Pc(32) int local32;
        @Pc(47) int local47;
        @Pc(57) int local57;
        @Pc(62) int local62;
        @Pc(71) int local71;
        @Pc(104) int local104;
        @Pc(145) int local145;
        @Pc(157) int local157;
        @Pc(162) int local162;
        @Pc(211) int local211;
        @Pc(222) int mapScene;
        @Pc(233) int mapSceneId;
        @Pc(254) int angle;
        @Pc(270) int local270;
        @Pc(276) int local276;
        @Pc(312) int local312;
        @Pc(372) int local372;
        @Pc(185) int[][] local185;
        for (local32 = 0; local32 < local9; local32++) {
            local47 = local32 * arg7 >> 16;
            local57 = (local32 + 1) * arg7 >> 16;
            local62 = local57 - local47;
            if (local62 > 0) {
                local71 = local32 + arg5 >> 6;
                if (local71 >= 0 && anIntArrayArrayArray17.length - 1 >= local71) {
                    local47 += arg4;
                    local185 = anIntArrayArrayArray17[local71];
                    @Pc(189) byte[][] local189 = aByteArrayArrayArray3[local71];
                    @Pc(193) byte[][] local193 = aByteArrayArrayArray8[local71];
                    @Pc(197) byte[][] local197 = aByteArrayArrayArray7[local71];
                    @Pc(201) byte[][] local201 = aByteArrayArrayArray10[local71];
                    local57 += arg4;
                    @Pc(209) byte[][] local209 = aByteArrayArrayArray12[local71];
                    for (local211 = 0; local211 < local14; local211++) {
                        mapScene = arg6 * local211 >> 16;
                        mapSceneId = (local211 + 1) * arg6 >> 16;
                        @Pc(238) int local238 = mapSceneId - mapScene;
                        if (local238 > 0) {
                            mapSceneId += arg0;
                            angle = arg2 + local211 >> 6;
                            @Pc(260) int local260 = arg2 + local211 & 0x3F;
                            mapScene += arg0;
                            local270 = local32 + arg5 & 0x3F;
                            local276 = (local260 << 6) + local270;
                            if (angle < 0 || local185.length - 1 < angle || local185[angle] == null) {
                                if (currentMap.anInt759 != -1) {
                                    local312 = currentMap.anInt759;
                                } else if ((local211 + arg2 & 0x4) == (arg5 + local32 & 0x4)) {
                                    local312 = overlayColors[FloType.anInt865 + 1];
                                } else {
                                    local312 = 4936552;
                                }
                                if (angle < 0 || angle > local185.length - 1) {
                                    if (local312 == 0) {
                                        local312 = 1;
                                    }
                                    SoftwareRaster.fillRect(local47, mapScene, local62, local238, local312);
                                    continue;
                                }
                            } else {
                                local312 = local185[angle][local276];
                            }
                            local372 = local189[angle] == null ? 0 : overlayColors[local189[angle][local276] & 0xFF];
                            if (local312 == 0) {
                                local312 = 1;
                            }
                            @Pc(395) int local395 = local209[angle] == null ? 0 : overlayColors[local209[angle][local276] & 0xFF];
                            @Pc(437) int local437;
                            if (local372 == 0 && local395 == 0) {
                                SoftwareRaster.fillRect(local47, mapScene, local62, local238, local312);
                            } else {
                                @Pc(433) byte local433;
                                if (local372 != 0) {
                                    if (local372 == -1) {
                                        local372 = 1;
                                    }
                                    local433 = local193[angle] == null ? 0 : local193[angle][local276];
                                    local437 = local433 & 0xFC;
                                    if (local437 == 0 || local62 <= 1 || local238 <= 1) {
                                        SoftwareRaster.fillRect(local47, mapScene, local62, local238, local372);
                                    } else {
                                        method4667(SoftwareRaster.pixels, local372, local47, local433 & 0x3, local312, local437 >> 2, local238, local62, mapScene, true);
                                    }
                                }
                                if (local395 != 0) {
                                    if (local395 == -1) {
                                        local395 = local312;
                                    }
                                    local433 = local201[angle][local276];
                                    local437 = local433 & 0xFC;
                                    if (local437 == 0 || local62 <= 1 || local238 <= 1) {
                                        SoftwareRaster.fillRect(local47, mapScene, local62, local238, local395);
                                    }
                                    method4667(SoftwareRaster.pixels, local395, local47, local433 & 0x3, 0, local437 >> 2, local238, local62, mapScene, local372 == 0);
                                }
                            }
                            if (local197[angle] != null) {
                                @Pc(546) int local546 = local197[angle][local276] & 0xFF;
                                if (local546 != 0) {
                                    if (local62 == 1) {
                                        local437 = local47;
                                    } else {
                                        local437 = local57 - 1;
                                    }
                                    @Pc(569) int local569;
                                    if (local238 == 1) {
                                        local569 = mapScene;
                                    } else {
                                        local569 = mapSceneId - 1;
                                    }
                                    @Pc(575) int local575 = 13421772;
                                    if (local546 >= 5 && local546 <= 8 || local546 >= 13 && local546 <= 16 || local546 >= 21 && local546 <= 24 || local546 == 27 || local546 == 28) {
                                        local575 = 13369344;
                                        local546 -= 4;
                                    }
                                    if (local546 == 1) {
                                        SoftwareRaster.drawVerticalLine(local47, mapScene, local238, local575);
                                    } else if (local546 == 2) {
                                        SoftwareRaster.drawHorizontalLine(local47, mapScene, local62, local575);
                                    } else if (local546 == 3) {
                                        SoftwareRaster.drawVerticalLine(local437, mapScene, local238, local575);
                                    } else if (local546 == 4) {
                                        SoftwareRaster.drawHorizontalLine(local47, local569, local62, local575);
                                    } else if (local546 == 9) {
                                        SoftwareRaster.drawVerticalLine(local47, mapScene, local238, 16777215);
                                        SoftwareRaster.drawHorizontalLine(local47, mapScene, local62, local575);
                                    } else if (local546 == 10) {
                                        SoftwareRaster.drawVerticalLine(local437, mapScene, local238, 16777215);
                                        SoftwareRaster.drawHorizontalLine(local47, mapScene, local62, local575);
                                    } else if (local546 == 11) {
                                        SoftwareRaster.drawVerticalLine(local437, mapScene, local238, 16777215);
                                        SoftwareRaster.drawHorizontalLine(local47, local569, local62, local575);
                                    } else if (local546 == 12) {
                                        SoftwareRaster.drawVerticalLine(local47, mapScene, local238, 16777215);
                                        SoftwareRaster.drawHorizontalLine(local47, local569, local62, local575);
                                    } else if (local546 == 17) {
                                        SoftwareRaster.drawHorizontalLine(local47, mapScene, 1, local575);
                                    } else if (local546 == 18) {
                                        SoftwareRaster.drawHorizontalLine(local437, mapScene, 1, local575);
                                    } else if (local546 == 19) {
                                        SoftwareRaster.drawHorizontalLine(local437, local569, 1, local575);
                                    } else if (local546 == 20) {
                                        SoftwareRaster.drawHorizontalLine(local47, local569, 1, local575);
                                    } else {
                                        @Pc(705) int local705;
                                        if (local546 == 25) {
                                            for (local705 = 0; local705 < local238; local705++) {
                                                SoftwareRaster.drawHorizontalLine(local705 + local47, -local705 + local569, 1, local575);
                                            }
                                        } else if (local546 == 26) {
                                            for (local705 = 0; local705 < local238; local705++) {
                                                SoftwareRaster.drawHorizontalLine(local705 + local47, mapScene + local705, 1, local575);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    local47 += arg4;
                    for (@Pc(90) int local90 = 0; local90 < local14; local90++) {
                        if (currentMap.anInt759 != -1) {
                            local104 = currentMap.anInt759;
                        } else if ((local32 + arg5 & 0x4) == (local90 + arg2 & 0x4)) {
                            local104 = overlayColors[FloType.anInt865 + 1];
                        } else {
                            local104 = 0x4b5368;
                        }
                        if (local104 == 0) {
                            local104 = 1;
                        }
                        local145 = (arg6 * local90 >> 16) + arg0;
                        local157 = arg0 + ((local90 + 1) * arg6 >> 16);
                        local162 = local157 - local145;
                        SoftwareRaster.fillRect(local47, local145, local62, local162, local104);
                    }
                }
            }
        }
        for (local32 = -2; local32 < local9 + 2; local32++) {
            local47 = local32 * arg7 >> 16;
            local57 = arg7 * (local32 + 1) >> 16;
            local62 = local57 - local47;
            if (local62 > 0) {
                local47 += arg4;
                local71 = arg5 + local32 >> 6;
                if (local71 >= 0 && scenery.length - 1 >= local71) {
                    local185 = scenery[local71];
                    for (local104 = -2; local104 < local14 + 2; local104++) {
                        local145 = local104 * arg6 >> 16;
                        local157 = (local104 + 1) * arg6 >> 16;
                        local162 = local157 - local145;
                        if (local162 > 0) {
                            local145 += arg0;
                            @Pc(931) int local931 = local104 + arg2 >> 6;
                            if (local931 >= 0 && local931 <= local185.length - 1) {
                                local211 = ((arg2 + local104 & 0x3F) << 6) + (local32 + arg5 & 0x3F);
                                if (local185[local931] != null) {
                                    mapScene = local185[local931][local211];
                                    mapSceneId = mapScene & 0x3FFF;
                                    if (mapSceneId != 0) {
                                        angle = mapScene >> 14 & 0x3;
                                        @Pc(998) MsiType type = MsiTypeList.get(mapSceneId - 1);
                                        @Pc(1003) SoftwareIndexedSprite sprite = type.getSprite(angle);
                                        if (sprite != null) {
                                            local276 = local162 * sprite.height / 4;
                                            local270 = local62 * sprite.width / 4;
                                            if (type.aBoolean2) {
                                                local312 = mapScene >> 16 & 0xF;
                                                local372 = mapScene >> 20 & 0xF;
                                                if ((angle & 0x1) == 1) {
                                                    angle = local312;
                                                    local312 = local372;
                                                    local372 = angle;
                                                }
                                                local270 = local62 * local312;
                                                local276 = local162 * local372;
                                            }
                                            if (local270 != 0 && local276 != 0) {
                                                if (type.anInt11 == 0) {
                                                    sprite.method1398(local47, local145 + local162 - local276, local270, local276);
                                                } else {
                                                    sprite.method1390(local47, local145 + local162 - local276, local270, local276, type.anInt11);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
    public static void clear(@OriginalArg(1) boolean arg0) {
        aByteArrayArrayArray8 = null;
        underlayColors = null;
        component = null;
        aByteArrayArrayArray3 = null;
        overlayColors = null;
        aByteArrayArrayArray10 = null;
        if (arg0 && currentMap != null) {
            aClass100_724 = currentMap.group;
        } else {
            aClass100_724 = null;
        }
        aByteArrayArrayArray7 = null;
        aByteArrayArrayArray12 = null;
        scenery = null;
        anIntArrayArrayArray17 = null;
        loadPercentage = 0;
        currentMap = null;
        mapElements.clear();
        labels = null;
        anInt4901 = -1;
        font22 = null;
        font30 = null;
        font12 = null;
        font26 = null;
        font11 = null;
        font14 = null;
        font17 = null;
        font19 = null;
        aClass3_Sub2_Sub1_2 = null;
        anInt3482 = -1;
        aClass3_Sub2_Sub1_Sub1_2 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
    public static void method2387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
        anInt435 = width * arg2 / arg0;
        anInt919 = length * arg1 / arg3;
        anInt3482 = -1;
        anInt4901 = -1;
        method965();
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(II)V")
    public static void method4641(@OriginalArg(1) int arg0) {
        anInt4901 = -1;
        anInt4901 = -1;
        anInt919 = arg0;
        method965();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public static void method1964(@OriginalArg(0) int arg0) {
        anInt4901 = -1;
        anInt3482 = -1;
        anInt435 = arg0;
        method965();
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I")
    public static int getTargetZoom() {
        if ((double) targetZoom == 3.0D) {
            return 37;
        } else if ((double) targetZoom == 4.0D) {
            return 50;
        } else if ((double) targetZoom == 6.0D) {
            return 75;
        } else if ((double) targetZoom == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!na;I)V")
    public static void method1853(@OriginalArg(0) JagString arg0) {
        clear(false);
        method4011(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method4011(@OriginalArg(0) JagString arg0) {
		for (@Pc(15) Map local15 = (Map) MapList.aClass69_120.head(); local15 != null; local15 = (Map) MapList.aClass69_120.next()) {
			if (local15.group.strEquals(arg0)) {
				currentMap = local15;
				return;
			}
		}
	}

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public static void setTargetZoom(@OriginalArg(0) int arg0) {
		anInt4901 = -1;
		if (arg0 == 37) {
			targetZoom = 3.0F;
		} else if (arg0 == 50) {
			targetZoom = 4.0F;
		} else if (arg0 == 75) {
			targetZoom = 6.0F;
		} else if (arg0 == 100) {
			targetZoom = 8.0F;
		} else if (arg0 == 200) {
			targetZoom = 16.0F;
		}
		anInt4901 = -1;
	}

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void reset() {
        clear(false);
        System.gc();
        client.setGameState(25);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method447() {
        if (zoom < targetZoom) {
            zoom = (float) ((double) zoom + (double) zoom / 30.0D);
            if (targetZoom < zoom) {
                zoom = targetZoom;
            }
            method965();
        } else if (targetZoom < zoom) {
            zoom = (float) ((double) zoom - (double) zoom / 30.0D);
            if (targetZoom > zoom) {
                zoom = targetZoom;
            }
            method965();
        }
        if (anInt3482 == -1 || anInt4901 == -1) {
            return;
        }
        @Pc(60) int local60 = anInt3482 - anInt435;
        if (local60 < 2 || local60 > 2) {
            local60 >>= 0x4;
        }
        @Pc(78) int local78 = anInt4901 - anInt919;
        if (local78 < 2 || local78 > 2) {
            local78 >>= 0x4;
        }
        anInt919 -= -local78;
        anInt435 += local60;
        if (local60 == 0 && local78 == 0) {
            anInt3482 = -1;
            anInt4901 = -1;
        }
        method965();
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
    public static void method2720() {
        if (aClass100_724 != null) {
            method1853(aClass100_724);
            aClass100_724 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(BI)V")
    public static void method4444(@OriginalArg(1) int arg0) {
        Static9.anInt172 = arg0;
        Static91.anInt2428 = 20;
        Static201.anInt1864 = 3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!na;I)V")
    public static void method4656(@OriginalArg(0) JagString arg0) {
        @Pc(9) int local9 = Static171.method3218(arg0);
        if (local9 != -1) {
            method3616(labels.aShortArray73[local9], labels.aShortArray72[local9]);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!na;Z)Lclient!na;")
    public static JagString method923(@OriginalArg(0) JagString arg0) {
        @Pc(12) int local12 = Static171.method3218(arg0);
        return local12 == -1 ? aClass100_517 : labels.aClass100Array153[local12].method3140(Static101.aClass100_538, Static197.aClass100_872);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)Lclient!bn;")
    public static Map method4361() {
        return currentMap;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public static int method2352() {
		anInt5212 = 0;
		return method2385();
	}

    @OriginalMember(owner = "client!je", name = "j", descriptor = "(I)I")
    public static int method2385() {
        if (labels == null) {
            return -1;
        }
        while (anInt5212 < labels.anInt5074) {
            if (labels.method3897(anInt5212)) {
                return anInt5212++;
            }
            anInt5212++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)V")
    public static void method3616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        anInt3482 = arg0 - originX;
        @Pc(24) int local24 = anInt3482 - (int) ((float) component.width / zoom);
        @Pc(33) int local33 = anInt3482 + (int) ((float) component.width / zoom);
        if (local24 < 0) {
            anInt3482 = (int) ((float) component.width / zoom);
        }
        anInt4901 = length + originZ - arg1 - 1;
        @Pc(61) int local61 = (int) ((float) component.height / zoom) + anInt4901;
        @Pc(70) int local70 = anInt4901 - (int) ((float) component.height / zoom);
        if (local33 > width) {
            anInt3482 = width - (int) ((float) component.width / zoom);
        }
        if (local70 < 0) {
            anInt4901 = (int) ((float) component.height / zoom);
        }
        if (length < local61) {
            anInt4901 = length - (int) ((float) component.height / zoom);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!na;I)V")
    public static void method1149(@OriginalArg(0) JagString arg0) {
        @Pc(7) int local7 = method1879(arg0);
        if (local7 != -1) {
            method3616(labels.aShortArray73[local7], labels.aShortArray72[local7]);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!na;Z)I")
	public static int method1879(@OriginalArg(0) JagString arg0) {
		if (labels == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < labels.anInt5074; local20++) {
			if (labels.aClass100Array153[local20].method3140(Static101.aClass100_538, Static197.aClass100_872).strEquals(arg0)) {
				return local20;
			}
		}
		return -1;
	}

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([IIIIIIIIIZB)V")
    public static void method4667(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
        @Pc(7) int local7 = arg2;
        if (SoftwareRaster.clipRight <= arg2) {
            return;
        }
        if (arg2 < SoftwareRaster.clipLeft) {
            local7 = SoftwareRaster.clipLeft;
        }
        @Pc(30) int local30 = arg7 + arg2;
        if (SoftwareRaster.clipLeft >= local30) {
            return;
        }
        if (SoftwareRaster.clipRight < local30) {
            local30 = SoftwareRaster.clipRight;
        }
        @Pc(43) int local43 = arg8;
        if (SoftwareRaster.clipBottom <= arg8) {
            return;
        }
        @Pc(56) int local56 = arg8 + arg6;
        if (arg8 < SoftwareRaster.clipTop) {
            local43 = SoftwareRaster.clipTop;
        }
        if (local56 <= SoftwareRaster.clipTop) {
            return;
        }
        @Pc(79) int local79 = local7 + SoftwareRaster.width * local43;
        if (arg5 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg5 = 1;
        }
        @Pc(99) int local99 = local7 + SoftwareRaster.width - local30;
        local43 -= arg8;
        @Pc(108) int local108 = arg6 - local43;
        if (SoftwareRaster.clipBottom < local56) {
            local56 = SoftwareRaster.clipBottom;
        }
        if (arg5 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg5 = 1;
        }
        local7 -= arg2;
        @Pc(136) int local136 = arg7 - local7;
        if (arg5 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg5 = 8;
        }
        local30 -= arg2;
        @Pc(157) int local157 = arg7 - local30;
        local56 -= arg8;
        @Pc(165) int local165 = arg6 - local56;
        @Pc(175) int local175;
        @Pc(184) int local184;
        if (arg5 == 1) {
            if (arg3 == 0) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local184 <= local175) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 1) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local175 >= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 2) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local184 >= local175) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 3) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local184 >= local175) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            }
        } else if (arg5 == 2) {
            if (arg3 == 0) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local175 >> 1 >= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 1) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local79 >= 0 && local79 < arg0.length) {
                            if (local175 << 1 <= local184) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        } else {
                            local79++;
                        }
                    }
                    local79 += local99;
                }
            } else if (arg3 == 2) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local136 - 1; local184 >= local157; local184--) {
                        if (local175 >> 1 >= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 3) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local136 - 1; local184 >= local157; local184--) {
                        if (local175 << 1 <= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            }
        } else if (arg5 == 3) {
            if (arg3 == 0) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local136 - 1; local184 >= local157; local184--) {
                        if (local175 >> 1 >= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 1) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local184 >= local175 << 1) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 2) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local184 <= local175 >> 1) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 3) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local136 - 1; local184 >= local157; local184--) {
                        if (local175 << 1 <= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            }
        } else if (arg5 == 4) {
            if (arg3 == 0) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local175 >> 1 <= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 1) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local7; local184 < local30; local184++) {
                        if (local175 << 1 >= local184) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 2) {
                for (local175 = local43; local175 < local56; local175++) {
                    for (local184 = local136 - 1; local184 >= local157; local184--) {
                        if (local184 >= local175 >> 1) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            } else if (arg3 == 3) {
                for (local175 = local108 - 1; local175 >= local165; local175--) {
                    for (local184 = local136 - 1; local184 >= local157; local184--) {
                        if (local184 <= local175 << 1) {
                            arg0[local79] = arg1;
                        } else if (arg9) {
                            arg0[local79] = arg4;
                        }
                        local79++;
                    }
                    local79 += local99;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg3 == 0) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local184 <= arg7 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local175 <= arg6 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local184 >= arg7 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local175 >= arg6 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg3 == 0) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local184 <= local175 - arg6 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (local175 = local108 - 1; local175 >= local165; local175--) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local175 - arg6 / 2 >= local184) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (local175 = local108 - 1; local175 >= local165; local175--) {
                        for (local184 = local136 - 1; local184 >= local157; local184--) {
                            if (local184 <= local175 - arg6 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local136 - 1; local184 >= local157; local184--) {
                            if (local175 - arg6 / 2 >= local184) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg3 == 0) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local175 - arg6 / 2 <= local184) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (local175 = local108 - 1; local175 >= local165; local175--) {
                        for (local184 = local7; local184 < local30; local184++) {
                            if (local175 - arg6 / 2 <= local184) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (local175 = local108 - 1; local175 >= local165; local175--) {
                        for (local184 = local136 - 1; local184 >= local157; local184--) {
                            if (local184 >= local175 - arg6 / 2) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (local175 = local43; local175 < local56; local175++) {
                        for (local184 = local136 - 1; local184 >= local157; local184--) {
                            if (local175 - arg6 / 2 <= local184) {
                                arg0[local79] = arg1;
                            } else if (arg9) {
                                arg0[local79] = arg4;
                            }
                            local79++;
                        }
                        local79 += local99;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (local175 = local108 - 1; local175 >= local165; local175--) {
                for (local184 = local136 - 1; local184 >= local157; local184--) {
                    if (local175 >> 1 <= local184) {
                        arg0[local79] = arg1;
                    } else if (arg9) {
                        arg0[local79] = arg4;
                    }
                    local79++;
                }
                local79 += local99;
            }
        } else if (arg3 == 1) {
            for (local175 = local108 - 1; local175 >= local165; local175--) {
                for (local184 = local7; local184 < local30; local184++) {
                    if (local184 <= local175 << 1) {
                        arg0[local79] = arg1;
                    } else if (arg9) {
                        arg0[local79] = arg4;
                    }
                    local79++;
                }
                local79 += local99;
            }
        } else if (arg3 == 2) {
            for (local175 = local43; local175 < local56; local175++) {
                for (local184 = local7; local184 < local30; local184++) {
                    if (local184 >= local175 >> 1) {
                        arg0[local79] = arg1;
                    } else if (arg9) {
                        arg0[local79] = arg4;
                    }
                    local79++;
                }
                local79 += local99;
            }
        } else if (arg3 == 3) {
            for (local175 = local43; local175 < local56; local175++) {
                for (local184 = local136 - 1; local184 >= local157; local184--) {
                    if (local175 << 1 >= local184) {
                        arg0[local79] = arg1;
                    } else if (arg9) {
                        arg0[local79] = arg4;
                    }
                    local79++;
                }
                local79 += local99;
            }
        }
    }
}