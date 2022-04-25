package com.itspazaz.rt4;

import rt4.*;

import java.awt.image.Raster;
import java.io.IOException;
import java.net.Socket;

public class Playground extends GameShell {
    public static Playground instance;

    public static BufferedFile cacheMasterIndex;
    public static BufferedFile cacheData;
    public static BufferedFile uid;
    public static BufferedFile[] cacheIndexes = new BufferedFile[28];

    public static Cache[] cacheArchives = new Cache[28];
    public static Cache masterCache;

    public static Js5MasterIndex js5MasterIndex;
    public static Js5CachedResourceProvider[] js5Providers = new Js5CachedResourceProvider[28];
    public static Js5[] archives = new Js5[28];
    public static Js5NetQueue js5NetQueue;
    public static Js5CacheQueue js5CacheQueue;
    private static PrivilegedRequest js5SocketRequest;
    private static BufferedSocket js5Socket;
    private static long js5ConnectTime;

    public static void main(String[] args) {
        instance = new Playground();
        instance.startApplication(32, "runescape");
        GameShell.frame.setLocation(40, 40);
    }

    @Override
    public void init() {
        instance = this;
        this.startApplet(32);
    }

    @Override
    protected void mainInit() {
        Keyboard.init();
        Keyboard.start(GameShell.canvas);
        Mouse.start(GameShell.canvas);
        SoftwareRaster.frameBuffer.makeTarget();

        try {
            if (GameShell.signLink.cacheData != null) {
                cacheData = new BufferedFile(GameShell.signLink.cacheData, 5200, 0);
                for (int i = 0; i < 28; i++) {
                    cacheIndexes[i] = new BufferedFile(GameShell.signLink.cacheIndexes[i], 6000, 0);
                    cacheArchives[i] = new Cache(i, cacheData, cacheIndexes[i], 1000000);
                }
                cacheMasterIndex = new BufferedFile(GameShell.signLink.cacheMasterIndex, 6000, 0);
                masterCache = new Cache(255, cacheData, cacheMasterIndex, 500000);
                uid = new BufferedFile(GameShell.signLink.uid, 24, 0);
                GameShell.signLink.cacheIndexes = null;
                GameShell.signLink.cacheMasterIndex = null;
                GameShell.signLink.uid = null;
                GameShell.signLink.cacheData = null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }

        js5NetQueue = new Js5NetQueue();
        js5CacheQueue = new Js5CacheQueue();
    }

    public int percentage = 0;
    public int state = 0;

    public NpcType npcType;
    public Npc npc;

    @Override
    protected void mainLoop() {
        Keyboard.loop();
        Mouse.loop();

        js5NetLoop();

        if (state == 0) {
            LoadingBarAwt.render(null, true, JagString.parse("Connecting to update server"), 1);

            if (js5MasterIndex == null) {
                js5MasterIndex = new Js5MasterIndex(js5NetQueue, js5CacheQueue);
            }

            if (js5MasterIndex.isReady()) {
                for (int i = 0; i < 28; i++) {
                    js5Providers[i] = js5MasterIndex.getResourceProvider(i, masterCache, cacheArchives[i]);
                    archives[i] = new Js5(js5Providers[i], false, false);
                }
                state++;
            }
        } else if (state == 1) {
            LoadingBarAwt.render(null, true, JagString.parse("Initializing sprites"), 1);
            percentage = 0;
            for (int i = 0; i < 28; i++) {
                percentage += js5Providers[i].getIndexPercentageComplete() * Static170.JS5_ARCHIVE_WEIGHTS[i] / 100;
            }
            if (percentage == 100) {
                Sprites.init(archives[8]);
                TitleScreen.init(archives[8]);
                Flames.init(archives[8]);
                state++;
            }
        } else if (state == 2) {
            LoadingBarAwt.render(null, true, JagString.parse("Preparing fonts"), 1);
            int ready = Fonts.getReady(archives[8], archives[13]);
            int total = Fonts.getTotal();
            if (ready >= total) {
                state++;
            }
        } else if (state == 3) {
            LoadingBarAwt.render(null, true, JagString.parse("Preparing title screen"), 1);
            int ready = TitleScreen.getReady(archives[8]);
            int total = TitleScreen.getTotal();
            if (ready >= total) {
                state++;
            }
        } else if (state == 4) {
            LoadingBarAwt.render(null, true, JagString.parse("Loading fonts"), 1);
            Fonts.load(archives[13], archives[8]);
            state++;
        } else if (state == 5) {
            LoadingBarAwt.render(null, true, JagString.parse("Prefetching"), 1);
            percentage = 0;
            for (int i = 0; i < 28; ++i) {
                archives[i].fetchAll();
                percentage += archives[i].getPercentageComplete();
            }
            if (percentage > 2700) {
                ParamTypeList.init(archives[2]);
                FloTypeList.init(archives[2]);
                FluTypeList.init(archives[2]);
                IdkTypeList.init(archives[7], archives[2]);
                LocTypeList.init(archives[16], archives[7]);
                NpcTypeList.init(archives[7], archives[18]);
                ObjTypeList.init(archives[19], Fonts.p11FullSoftware, archives[7]);
                StructTypeList.init(archives[2]);
                SeqTypeList.init(archives[1], archives[20], archives[0]);
                BasTypeList.init(archives[2]);
                SpotAnimTypeList.init(archives[7], archives[21]);
                VarbitTypeList.init(archives[22]);
                VarpTypeList.init(archives[2]);
                InterfaceList.init(archives[13], archives[8], archives[3], archives[7]);
                InvTypeList.init(archives[2]);
                EnumTypeList.init(archives[17]);
                QuickChatPhraseTypeList.init(archives[25], archives[24], new Js5QuickChatCommandDecoder());
                QuickChatCatTypeList.init(archives[25], archives[24]);
                LightTypeList.init(archives[2]);
                CursorTypeList.init(archives[2], archives[8]);
                MsiTypeList.init(archives[2], archives[8]);
                Equipment.init();
                state++;
            }
        } else if (state == 6) {
            LoadingBarAwt.render(null, true, JagString.parse("Loading sprites"), 1);
            int ready = Sprites.getReady(archives[8]);
            int total = Sprites.total();
            if (ready >= total) {
                Sprites.load(archives[8]);
                state++;
            }
        }else if (state == 7) {
            LoadingBarAwt.render(null, true, JagString.parse("Preparing to draw model"), 1);
            Js5GlTextureProvider textureProvider = new Js5GlTextureProvider(archives[9], archives[26], archives[8], 20, false);
            LoadingBarAwt.clear();
            SoftwareRaster.clear();
            Rasteriser.unpackTextures(textureProvider);
            Rasteriser.setBrightness(0.8F);
            Rasteriser.setBounds(GameShell.canvasWidth, GameShell.canvasHeight);
            Rasteriser.prepare();
            Rasteriser.prepareOffsets();
            npcType = NpcTypeList.get(0);
            npcType.name.print();
            npc = new Npc();
            npc.setNpcType(npcType);
            state++;
        }

        GameShell.frame.setTitle(state + "");
    }

    public int js5ConnectState = 0;

    public void js5NetLoop() {
        boolean idle = js5NetQueue.loop();
        if (!idle) {
            js5Connect();
        }
    }

    public void js5Connect() {
        try {
            if (js5ConnectState == 0) {
                js5SocketRequest = GameShell.signLink.openSocket(GlobalConfig.DEFAULT_HOSTNAME, GlobalConfig.DEFAULT_PORT + 1);
                js5ConnectState++;
            }
            if (js5ConnectState == 1) {
                if (js5SocketRequest.status == 2) {
                    setJs5Response(1000);
                    return;
                }
                if (js5SocketRequest.status == 1) {
                    js5ConnectState++;
                }
            }
            if (js5ConnectState == 2) {
                js5Socket = new BufferedSocket((Socket) js5SocketRequest.result, GameShell.signLink);
                Buffer buffer = new Buffer(5);
                buffer.p1(15);
                buffer.p4(530);
                js5Socket.write(buffer.data, 5);
                js5ConnectState++;
                js5ConnectTime = MonotonicClock.currentTimeMillis();
            }
            if (js5ConnectState == 3) {
                if (js5Socket.available() > 0) {
                    int response = js5Socket.read();
                    if (response != 0) {
                        setJs5Response(response);
                        return;
                    }
                    js5ConnectState++;
                } else if (MonotonicClock.currentTimeMillis() - js5ConnectTime > GlobalConfig.JS5_RESPONSE_TIMEOUT) {
                    setJs5Response(1001);
                    return;
                }
            }
            if (js5ConnectState == 4) {
                js5NetQueue.start(true, js5Socket);
                js5SocketRequest = null;
                js5ConnectState = 0;
                js5Socket = null;
            }
        } catch (IOException ex) {
            setJs5Response(1002);
        }
    }

    private void setJs5Response(int response) {
        js5NetQueue.response = response;
        js5Socket = null;
        js5NetQueue.errors++;
        js5ConnectState = 0;
        js5SocketRequest = null;
    }

    @Override
    protected void mainRedraw() {
        if (state == 8) {
            SoftwareRaster.clear();

            if (npc != null) {
                int orientation = 512;
                int x = 256;
                int z = 256;
                int y = 256;
                npc.render(orientation, 25079, 60547, -44308, 48222, x, z, y, 0L, 0, null);
            }

            SoftwareRaster.frameBuffer.draw(GameShell.canvas.getGraphics());
        }
    }

    @Override
    protected void mainQuit() {
        Keyboard.stop(GameShell.canvas);
        Mouse.stop(GameShell.canvas);
        Keyboard.quit();
        Mouse.quit();
    }

    @Override
    protected void reset() {
    }
}
