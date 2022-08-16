package com.itspazaz.rt4;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLContext;
import com.jogamp.opengl.util.GLBuffers;
import rt4.DisplayMode;
import rt4.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.KeyEvent;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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

		Preferences.characterShadowsOn = false;
		Preferences.highDetailLighting = false;
	}

	public int percentage = 0;
	public int state = 0;

	public NpcType npcType;
	public Npc npc;

	public void stateLoop() {
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
				percentage += js5Providers[i].getIndexPercentageComplete() * client.JS5_ARCHIVE_WEIGHTS[i] / 100;
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
			LoadingBarAwt.render(null, true, JagString.parse("Loading configs"), 1);
//            percentage = 0;
//            for (int i = 0; i < 28; ++i) {
//                archives[i].fetchAll();
//                percentage += archives[i].getPercentageComplete();
//            }
//            if (percentage > 2700) {
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
//            }
		} else if (state == 6) {
			LoadingBarAwt.render(null, true, JagString.parse("Loading sprites"), 1);
			int ready = Sprites.getReady(archives[8]);
			int total = Sprites.total();
			if (ready >= total) {
				Sprites.load(archives[8]);
				state++;
			}
		} else if (state == 7) {
			if (useGl) {
				initGl();
			}
			state++;
		} else if (state == 8) {
			Js5GlTextureProvider textureProvider = new Js5GlTextureProvider(archives[9], archives[26], archives[8], 20, false);
			Rasteriser.unpackTextures(textureProvider);
			Rasteriser.setBrightness(0.8F);
			Rasteriser.setBounds(GameShell.canvasWidth, GameShell.canvasHeight);
			Rasteriser.prepare();
			Rasteriser.prepareOffsets();
			loadItem(995, 10000);
			try {
				//loadNpc(exportCounter);
			} catch (Exception ex) {
				npc = null;
				npcType = null;
			}
			state++;
		}
	}

	Sprite sprite;

	public void loadItem(int id, int count) {
		sprite = Inv.getObjectSprite(0, id, false, count, 0);

		try {
			Files.write(
				Paths.get("items.csv"),
				"id,name,cost\n".getBytes(),
				StandardOpenOption.CREATE_NEW);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		;
		for (int i = 0; i < 14657; ++i) {
			try {
				ObjType obj = ObjTypeList.get(i);
				if (obj == null) {
					break;
				}
				Files.write(
					Paths.get("items.csv"),
					(i + "," + obj.name + "," + obj.cost + "\n").getBytes(),
					StandardOpenOption.APPEND);
			} catch (Exception ex) {
				break;
			}
		}
	}

	public void loadNpc(int id) {
		npcType = NpcTypeList.get(id);
		npc = new Npc();
		BasType basType = BasTypeList.get(npcType.bastypeid);
		npc.seqId = basType.idleAnimationId;
		npc.setNpcType(npcType);
		GameShell.frame.setTitle(npcType.name + " - " + id);
	}

	float yaw = 0.4f;
	float pitch = -0.4f;
	int zoom2d = 471;
	int zoom3d = 471;

	public void initGl() {
		GlRenderer.init(GameShell.canvas, 0);
		if (GlRenderer.enabled) {
			GlRenderer.setCanvasSize(GameShell.canvasWidth, GameShell.canvasHeight);
			GlRenderer.restoreLighting();
			float yaw1 = yaw * 360.0F / 6.2831855F;
			float pitch1 = pitch * 360.0F / 6.2831855F;
			GlRenderer.method4171(0, 0, GameShell.canvasWidth, GameShell.canvasHeight, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2, yaw1, pitch1, zoom2d, zoom3d);
			GlRenderer.setViewportBounds(0, 0, GameShell.canvasWidth, GameShell.canvasHeight);
			GlRenderer.setDepthTestEnabled(true);
			GlRenderer.enableDepthMask();
			GlRenderer.setFogEnabled(true);
			DisplayMode.setWindowMode(false, 2, GameShell.canvasWidth, GameShell.canvasHeight);
			orientation = 292;
			x = 100;
			z = 218;
			y = 236;
			if (GameShell.canvasWidth >= 2500) {
				x = 56;
				z = 176;
				y = 120;
				orientation = 128;
			}
		}
	}

	public static boolean useGl = false;

	private void exportGlImage(String filename) {
		GL2 gl = GLContext.getCurrentGL().getGL2();
		ByteBuffer buffer = GLBuffers.newDirectByteBuffer(GameShell.canvasWidth * GameShell.canvasHeight * 4);

		gl.glReadBuffer(GL2.GL_BACK);
		gl.glReadPixels(0, 0, GameShell.canvasWidth, GameShell.canvasHeight, GL2.GL_BGRA, GL2.GL_UNSIGNED_BYTE, buffer);

		int[] pixels = new int[GameShell.canvasWidth * GameShell.canvasHeight];
		for (int y = GameShell.canvasHeight - 1; y > 0; --y) {
			for (int x = 0; x < GameShell.canvasWidth; ++x) {
				int r = buffer.get() & 0xFF;
				int g = buffer.get() & 0xFF;
				int b = buffer.get() & 0xFF;
				buffer.get();
				int a = 0xFF;
				if (r == 0x33 && g == 0x33 && b == 0x33) {
					a = 0x7F;
				}
				pixels[x + y * GameShell.canvasWidth] = r | (g << 8) | (b << 16) | (a << 24);
			}
		}
		// erase first line (black)
		for (int x = 0; x < GameShell.canvasWidth; ++x) {
			pixels[x] = 0x7F000000;
		}

		exportImage(pixels, filename);
	}

	private void exportImage(int[] pixels, String filename) {
		byte[] raw = new byte[pixels.length * 4];
		int offset = 0;
		for (int rgb : pixels) {
			raw[offset++] = (byte) (rgb >> 16); // red
			raw[offset++] = (byte) (rgb >> 8); // green
			raw[offset++] = (byte) (rgb); // blue

			// set transparency for background color
			if (rgb >> 24 == 0x7F) {
				raw[offset++] = (byte) 0;
			} else {
				raw[offset++] = (byte) 0xFF;
			}
		}

		try {
			DataBuffer buffer = new DataBufferByte(raw, raw.length);
			int samplesPerPixel = 4;
			int[] bandOffsets = {0, 1, 2, 3};
			ColorModel colorModel = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_sRGB), true, false, Transparency.TRANSLUCENT, DataBuffer.TYPE_BYTE);
			WritableRaster raster = Raster.createInterleavedRaster(buffer, GameShell.canvasWidth, GameShell.canvasHeight, samplesPerPixel * GameShell.canvasWidth, samplesPerPixel, bandOffsets, null);
			BufferedImage image = new BufferedImage(colorModel, raster, colorModel.isAlphaPremultiplied(), null);
			ImageIO.write(image, "PNG", new File(filename + ".png"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

    /*  NPC_NORMAL.xan2d = 96;
        NPC_NORMAL.yan2d = 128;

        CHATHEAD.zoom2d = 796;
        CHATHEAD.zoom3d = 512;
        CHATHEAD.xan2d = 40;
        CHATHEAD.yan2d = 1882;*/

	int exportCounter = 8105;
	int orientation = 378;
	int x = 112;
	int z = 180;
	int y = 116;
	int modifier = 2;
	int chatheadOrientation = 1882;
	int chatheadX = -34;
	int chatheadZ = 97;
	int chatheadY = 592;

	boolean renderHead = false;
	boolean perspectiveChanged = false;

	long lastInputTime = 0;

	public void inputLoop() {
		if (Keyboard.getKey(KeyEvent.VK_W)) {
			y += modifier;
		} else if (Keyboard.getKey(KeyEvent.VK_S)) {
			y -= modifier;
		}

		if (Keyboard.getKey(KeyEvent.VK_Q)) {
			z += modifier;
		} else if (Keyboard.getKey(KeyEvent.VK_E)) {
			z -= modifier;
		}

		if (Keyboard.getKey(KeyEvent.VK_SHIFT) && Keyboard.getKey(KeyEvent.VK_A)) {
			orientation += modifier;
			orientation &= 2047;
		} else if (Keyboard.getKey(KeyEvent.VK_SHIFT) && Keyboard.getKey(KeyEvent.VK_D)) {
			orientation -= modifier;
			orientation &= 2047;
		} else if (Keyboard.getKey(KeyEvent.VK_A)) {
			x -= modifier;
		} else if (Keyboard.getKey(KeyEvent.VK_D)) {
			x += modifier;
		}

		if (Keyboard.getKey(KeyEvent.VK_UP)) {
			yaw -= 0.01f;
			perspectiveChanged = true;
		} else if (Keyboard.getKey(KeyEvent.VK_DOWN)) {
			yaw += 0.01f;
			perspectiveChanged = true;
		}

		if (Keyboard.getKey(KeyEvent.VK_LEFT)) {
			pitch += 0.01f;
			perspectiveChanged = true;
		} else if (Keyboard.getKey(KeyEvent.VK_RIGHT)) {
			pitch -= 0.01f;
			perspectiveChanged = true;
		}

		if (Keyboard.getKey(KeyEvent.VK_F)) {
			zoom2d -= modifier;
			perspectiveChanged = true;
		} else if (Keyboard.getKey(KeyEvent.VK_G)) {
			zoom2d += modifier;
			perspectiveChanged = true;
		}

		if (Keyboard.getKey(KeyEvent.VK_OPEN_BRACKET)) {
			modifier--;
		} else if (Keyboard.getKey(KeyEvent.VK_CLOSE_BRACKET)) {
			modifier++;
		}

		// rate limited input events
		long currentTime = System.currentTimeMillis();
		if (currentTime - lastInputTime < 100) {
			return;
		}
		lastInputTime = currentTime;

		if (Keyboard.getKey(KeyEvent.VK_H)) {
			renderHead = !renderHead;
			if (renderHead) {
				x = chatheadX;
				z = chatheadZ;
				y = chatheadY;
				orientation = chatheadOrientation;
				yaw = 0.17f;
				pitch = 0.09f;
				perspectiveChanged = true;
				zoom2d = 796;
				zoom3d = 512;
			} else {
				x = 56;
				z = 176;
				y = 120;
				orientation = 128;
				yaw = 0.4f;
				pitch = -0.4f;
				perspectiveChanged = true;
				zoom2d = 471;
				zoom3d = 471;
			}
		}

		if (Keyboard.getKey(KeyEvent.VK_BACK_SLASH)) {
			if (GlRenderer.enabled) {
				exportGlImage("dump/" + exportCounter++);
			} else {
				exportImage(SoftwareRaster.pixels, "dump/" + exportCounter++);
			}
		}

		if (Keyboard.getKey(KeyEvent.VK_1)) {
			exportCounter--;
		} else if (Keyboard.getKey(KeyEvent.VK_2)) {
			exportCounter++;
		}

		if (Keyboard.getKey(KeyEvent.VK_P)) {
			System.out.println("cam: " + orientation + ", " + x + ", " + z + ", " + y);
			System.out.println("per: " + yaw + ", " + pitch);
			System.out.println("zoom: " + zoom2d + ", " + zoom3d);
			System.out.println();
		}
	}

	int lastExportCounter = -1;

	@Override
	protected void mainLoop() {
		Keyboard.loop();
		Mouse.loop();

		js5NetLoop();
		stateLoop();
		inputLoop();

		if (state == 9) {
			if (lastExportCounter != exportCounter) {
				try {
					//loadNpc(exportCounter);
				} catch (Exception ex) {
					npc = null;
					npcType = null;
				}
			}
		}
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
		try {
			if (state == 9) {
				if (!GlRenderer.enabled) {
					SoftwareRaster.clear(0x7F666666);
				} else {
					GlRenderer.clearColorAndDepthBuffers(0x333333);
				}

				if (perspectiveChanged) {
					float yaw1 = yaw * 360.0F / 6.2831855F;
					float pitch1 = pitch * 360.0F / 6.2831855F;
					GlRenderer.method4171(0, 0, GameShell.canvasWidth, GameShell.canvasHeight, GameShell.canvasWidth / 2, GameShell.canvasHeight / 2, yaw1, pitch1, zoom2d, zoom2d);
					perspectiveChanged = false;
				}

				if (npc != null) {
					SeqType seqType = SeqTypeList.get(9804);
					Model head = npcType.getHeadModel(seqType, 0, 0, 0);
					if (renderHead && head != null) {
						head.render(orientation, 25079, 60547, -44308, 48222, x, z, y, 0L, 0, null);
					} else {
						npc.render(orientation, 25079, 60547, -44308, 48222, x, z, y, 0L, 0, null);
					}
				}

				if (sprite != null) {
					sprite.render(canvasWidth / 2 - 144, canvasHeight / 2 - 128);
				}

				if (!GlRenderer.enabled) {
					SoftwareRaster.frameBuffer.draw(GameShell.canvas.getGraphics());
				} else {
					GlRenderer.draw();
					GlRenderer.swapBuffers();
				}

				if (lastExportCounter != exportCounter) {
					//                exportGlImage("dump/" + exportCounter);
					lastExportCounter = exportCounter;
					//                exportCounter++;
				}
			}
		} catch (Exception ex) {
		}
	}

	@Override
	protected void mainQuit() {
		Keyboard.stop(GameShell.canvas);
		Mouse.stop(GameShell.canvas);
		Keyboard.quit();
		Mouse.quit();

		if (GlRenderer.enabled) {
			GlRenderer.quit();
		}

		if (GameShell.signLink != null) {
			GameShell.signLink.unloadGlNatives(this.getClass());
		}
	}

	@Override
	protected void reset() {
	}
}
