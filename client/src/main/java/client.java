import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				arg0 = new String[4];
				arg0[0] = "1";
				arg0[1] = "live";
				arg0[2] = "english";
				arg0[3] = "game0";
				// Static131.method2577("argument count");
			}
			@Pc(15) int local15 = -1;
			Static187.worldListId = Integer.parseInt(arg0[0]);
			Static83.modeWhere = 2;
			if (arg0[1].equals("live")) {
				Static81.modeWhat = 0;
			} else if (arg0[1].equals("rc")) {
				Static81.modeWhat = 1;
			} else if (arg0[1].equals("wip")) {
				Static81.modeWhat = 2;
			} else {
				Static131.method2577("modewhat");
			}
			Static249.aBoolean282 = false;
			try {
				@Pc(63) byte[] local63 = arg0[2].getBytes("ISO-8859-1");
				local15 = Static101.method2053(Static10.decodeString(local63, local63.length, 0));
			} catch (@Pc(74) Exception local74) {
			}
			if (local15 != -1) {
				Static141.anInt3470 = local15;
			} else if (arg0[2].equals("english")) {
				Static141.anInt3470 = 0;
			} else if (arg0[2].equals("german")) {
				Static141.anInt3470 = 1;
			} else {
				Static131.method2577("language");
			}
			Static3.method4659(Static141.anInt3470);
			Static233.aBoolean254 = false;
			Static150.aBoolean175 = false;
			if (arg0[3].equals("game0")) {
				Static266.game = 0;
			} else if (arg0[3].equals("game1")) {
				Static266.game = 1;
			} else {
				Static131.method2577("game");
			}
			Static279.anInt5880 = 0;
			Static178.aBoolean203 = false;
			Static204.anInt4760 = 0;
			Static47.aClass100_991 = Static186.EMPTY_FILE;
			@Pc(146) client local146 = new client();
			Static215.aClient1 = local146;
			local146.startApplication(Static81.modeWhat + 32, "runescape");
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(167) Exception local167) {
			Static89.report(null, local167);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected final void mainRedraw() {
		if (Static244.gameState == 1000) {
			return;
		}
		@Pc(15) boolean local15 = Static138.method2699();
		if (local15 && Static144.aBoolean173 && Static11.musicChannel != null) {
			Static11.musicChannel.method3570();
		}
		if ((Static244.gameState == 30 || Static244.gameState == 10) && (GameShell.replaceCanvas || Static97.aLong89 != 0L && Static97.aLong89 < MonotonicClock.currentTimeMillis())) {
			Static241.setWindowMode(GameShell.replaceCanvas, Static144.method2736(), Static114.anInt5831, Static22.anInt729);
		}
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (GameShell.fullScreenFrame == null) {
			@Pc(65) Container local65;
			if (GameShell.fullScreenFrame != null) {
				local65 = GameShell.fullScreenFrame;
			} else if (GameShell.frame == null) {
				local65 = GameShell.signLink.applet;
			} else {
				local65 = GameShell.frame;
			}
			local80 = local65.getSize().width;
			local84 = local65.getSize().height;
			if (local65 == GameShell.frame) {
				@Pc(90) Insets local90 = GameShell.frame.getInsets();
				local80 -= local90.right + local90.left;
				local84 -= local90.top + local90.bottom;
			}
			if (local80 != GameShell.frameWidth || local84 != GameShell.frameHeight) {
				Static203.method3662();
				Static97.aLong89 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (GameShell.fullScreenFrame != null && !GameShell.focus && (Static244.gameState == 30 || Static244.gameState == 10)) {
			Static241.setWindowMode(false, Static214.windowMode, -1, -1);
		}
		@Pc(158) boolean local158 = false;
		if (GameShell.fullRedraw) {
			local158 = true;
			GameShell.fullRedraw = false;
		}
		if (local158) {
			Static139.method2704();
		}
		if (GlRenderer.enabled) {
			for (local80 = 0; local80 < 100; local80++) {
				Static186.aBooleanArray100[local80] = true;
			}
		}
		if (Static244.gameState == 0) {
			Static13.method473(null, local158, Static126.mainLoadSecondaryText, Static199.mainLoadPercentage);
		} else if (Static244.gameState == 5) {
			Static182.method3359(false, Static280.aClass3_Sub2_Sub9_43);
		} else if (Static244.gameState == 10) {
			Static126.method2460();
		} else if (Static244.gameState == 25 || Static244.gameState == 28) {
			if (Static233.loadingScreenState == 1) {
				if (Static230.anInt5150 < Static175.mapFilesMissingCount) {
					Static230.anInt5150 = Static175.mapFilesMissingCount;
				}
				local80 = (Static230.anInt5150 - Static175.mapFilesMissingCount) * 50 / Static230.anInt5150;
				Static114.drawTextOnScreen(false, Static34.concatenate(new JagString[] { LocalizedText.LOADING, Static229.aClass100_974, Static123.parseInt(local80), Static14.aClass100_80 }));
			} else if (Static233.loadingScreenState == 2) {
				if (Static38.anInt1196 < Static271.anInt5804) {
					Static38.anInt1196 = Static271.anInt5804;
				}
				local80 = (Static38.anInt1196 - Static271.anInt5804) * 50 / Static38.anInt1196 + 50;
				Static114.drawTextOnScreen(false, Static34.concatenate(new JagString[] { LocalizedText.LOADING, Static229.aClass100_974, Static123.parseInt(local80), Static14.aClass100_80 }));
			} else {
				Static114.drawTextOnScreen(false, LocalizedText.LOADING);
			}
		} else if (Static244.gameState == 30) {
			Static89.method1841();
		} else if (Static244.gameState == 40) {
			Static114.drawTextOnScreen(false, Static34.concatenate(new JagString[] { LocalizedText.CONLOST, Static269.aClass100_556, LocalizedText.ATTEMPT_TO_REESTABLISH}));
		}
		if (GlRenderer.enabled && Static244.gameState != 0) {
			GlRenderer.method4153();
			for (local80 = 0; local80 < Static24.anInt766; local80++) {
				Static31.aBooleanArray29[local80] = false;
			}
		} else {
			@Pc(388) Graphics local388;
			if ((Static244.gameState == 30 || Static244.gameState == 10) && Static199.anInt4672 == 0 && !local158) {
				try {
					local388 = GameShell.canvas.getGraphics();
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						if (Static31.aBooleanArray29[local84]) {
							Static260.frameBuffer.drawAt(Static224.anIntArray443[local84], Static264.anIntArray410[local84], Static67.anIntArray320[local84], local388, Static50.anIntArray133[local84]);
							Static31.aBooleanArray29[local84] = false;
						}
					}
				} catch (@Pc(423) Exception local423) {
					GameShell.canvas.repaint();
				}
			} else if (Static244.gameState != 0) {
				try {
					local388 = GameShell.canvas.getGraphics();
					Static260.frameBuffer.draw(local388);
					for (local84 = 0; local84 < Static24.anInt766; local84++) {
						Static31.aBooleanArray29[local84] = false;
					}
				} catch (@Pc(453) Exception local453) {
					GameShell.canvas.repaint();
				}
			}
		}
		if (Static107.clean) {
			Static213.method3729();
		}
		if (Static164.safeMode && Static244.gameState == 10 && Static154.topLevelInterface != -1) {
			Static164.safeMode = false;
			Static203.write(GameShell.signLink);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected final void mainQuit() {
		if (GlRenderer.enabled) {
			GlRenderer.quit();
		}
		if (GameShell.fullScreenFrame != null) {
			Static25.method714(GameShell.fullScreenFrame, GameShell.signLink);
			GameShell.fullScreenFrame = null;
		}
		if (GameShell.signLink != null) {
			GameShell.signLink.unloadGlNatives(this.getClass());
		}
		if (Static178.instance != null) {
			Static178.instance.aBoolean151 = false;
		}
		Static178.instance = null;
		if (Static124.socket != null) {
			Static124.socket.close();
			Static124.socket = null;
		}
		Static31.method847(GameShell.canvas);
		Static223.method3866(GameShell.canvas);
		if (Static71.mouseWheel != null) {
			Static71.mouseWheel.method3291(GameShell.canvas);
		}
		Static6.method82();
		Static251.method4277();
		Static71.mouseWheel = null;
		if (Static11.musicChannel != null) {
			Static11.musicChannel.method3575();
		}
		if (Static147.soundChannel != null) {
			Static147.soundChannel.method3575();
		}
		Static107.js5NetQueue.method2329();
		Static86.js5CacheQueue.method2466();
		try {
			if (Static172.cacheData != null) {
				Static172.cacheData.method1455();
			}
			if (Static47.cacheIndexes != null) {
				for (@Pc(95) int local95 = 0; local95 < Static47.cacheIndexes.length; local95++) {
					if (Static47.cacheIndexes[local95] != null) {
						Static47.cacheIndexes[local95].method1455();
					}
				}
			}
			if (Static190.cacheMasterIndex != null) {
				Static190.cacheMasterIndex.method1455();
			}
			if (Static121.uid != null) {
				Static121.uid.method1455();
			}
		} catch (@Pc(129) IOException local129) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		if (!this.isHostnameValid()) {
			return;
		}
		Static187.worldListId = Integer.parseInt(this.getParameter("worldid"));
		Static83.modeWhere = Integer.parseInt(this.getParameter("modewhere"));
		if (Static83.modeWhere < 0 || Static83.modeWhere > 1) {
			Static83.modeWhere = 0;
		}
		Static81.modeWhat = Integer.parseInt(this.getParameter("modewhat"));
		if (Static81.modeWhat < 0 || Static81.modeWhat > 2) {
			Static81.modeWhat = 0;
		}
		@Pc(50) String local50 = this.getParameter("advertsuppressed");
		if (local50 != null && local50.equals("1")) {
			Static249.aBoolean282 = true;
		} else {
			Static249.aBoolean282 = false;
		}
		try {
			Static141.anInt3470 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(69) Exception local69) {
			Static141.anInt3470 = 0;
		}
		Static3.method4659(Static141.anInt3470);
		@Pc(78) String local78 = this.getParameter("objecttag");
		if (local78 != null && local78.equals("1")) {
			Static233.aBoolean254 = true;
		} else {
			Static233.aBoolean254 = false;
		}
		@Pc(94) String local94 = this.getParameter("js");
		if (local94 != null && local94.equals("1")) {
			Static150.aBoolean175 = true;
		} else {
			Static150.aBoolean175 = false;
		}
		@Pc(111) String local111 = this.getParameter("game");
		if (local111 != null && local111.equals("1")) {
			Static266.game = 1;
		} else {
			Static266.game = 0;
		}
		try {
			Static204.anInt4760 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static204.anInt4760 = 0;
		}
		Static47.aClass100_991 = Static227.aClass100_966.method3153(this);
		if (Static47.aClass100_991 == null) {
			Static47.aClass100_991 = Static186.EMPTY_FILE;
		}
		@Pc(146) String local146 = this.getParameter("country");
		if (local146 != null) {
			try {
				Static279.anInt5880 = Integer.parseInt(local146);
			} catch (@Pc(153) Exception local153) {
				Static279.anInt5880 = 0;
			}
		}
		@Pc(159) String local159 = this.getParameter("haveie6");
		if (local159 != null && local159.equals("1")) {
			Static178.aBoolean203 = true;
		} else {
			Static178.aBoolean203 = false;
		}
		Static215.aClient1 = this;
		this.startApplet(Static81.modeWhat + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected final void mainInit() {
		Static203.method3662();
		Static86.js5CacheQueue = new Js5CacheQueue();
		Static107.js5NetQueue = new Js5NetQueue();
		if (Static81.modeWhat != 0) {
			Static51.aByteArrayArray8 = new byte[50][];
		}
		Static80.read(GameShell.signLink); // preferences
		if (Static83.modeWhere == 0) {
			Static143.worldListHostname = GlobalConfig.DEFAULT_HOSTNAME; // this.getCodeBase().getHost();
			Static97.worldListAlternatePort = GlobalConfig.ALTERNATE_PORT + 1;
			Static249.worldListDefaultPort = GlobalConfig.DEFAULT_PORT + 1;
		} else if (Static83.modeWhere == 1) {
			Static143.worldListHostname = GlobalConfig.DEFAULT_HOSTNAME; // this.getCodeBase().getHost();
			Static97.worldListAlternatePort = GlobalConfig.ALTERNATE_PORT + Static187.worldListId;
			Static249.worldListDefaultPort = GlobalConfig.DEFAULT_PORT + Static187.worldListId;
		} else if (Static83.modeWhere == 2) {
			Static143.worldListHostname = GlobalConfig.DEFAULT_HOSTNAME; // "127.0.0.1";
			Static97.worldListAlternatePort = GlobalConfig.ALTERNATE_PORT + Static187.worldListId;
			Static249.worldListDefaultPort = GlobalConfig.DEFAULT_PORT + Static187.worldListId;
		}
		if (Static266.game == 1) {
			Static172.shiftClick = true;
			Static161.anInt3923 = 16777215;
			Static161.anInt3922 = 0;
			Static33.aShortArrayArray2 = Static198.aShortArrayArray4;
			Static172.aShortArrayArray7 = Static32.aShortArrayArray1;
			Static200.aShortArray65 = Static2.aShortArray1;
			Static160.aShortArray41 = Static20.aShortArray5;
		} else {
			Static33.aShortArrayArray2 = Static154.aShortArrayArray6;
			Static160.aShortArray41 = Static195.aShortArray64;
			Static172.aShortArrayArray7 = Static43.aShortArrayArray5;
			Static200.aShortArray65 = Static260.aShortArray71;
		}
		Static55.alternatePort = Static97.worldListAlternatePort;
		Static271.defaultPort = Static249.worldListDefaultPort;
		Static60.hostname = Static143.worldListHostname;
		Static208.worldListPort = Static249.worldListDefaultPort;
		Static259.aShortArray88 = Static62.aShortArray19 = Static232.aShortArray74 = Static259.aShortArray87 = new short[256];
		Static209.port = Static208.worldListPort;
		if ((SignLink.anInt5928 == 3 && Static83.modeWhere != 2) || GlobalConfig.SELECT_DEFAULT_WORLD) {
			Static125.worldId = Static187.worldListId;
		}
		Static156.init(); // keyboard
		Static19.start(GameShell.canvas); // keyboard
		Static88.start(GameShell.canvas); // mouse
		Static71.mouseWheel = Static44.create();
		if (Static71.mouseWheel != null) {
			Static71.mouseWheel.start(GameShell.canvas);
		}
		Static7.anInt986 = SignLink.anInt5928;
		try {
			if (GameShell.signLink.cacheData != null) {
				Static172.cacheData = new BufferedFile(GameShell.signLink.cacheData, 5200, 0);
				for (@Pc(162) int i = 0; i < 28; i++) {
					Static47.cacheIndexes[i] = new BufferedFile(GameShell.signLink.cacheIndexes[i], 6000, 0);
				}
				Static190.cacheMasterIndex = new BufferedFile(GameShell.signLink.cacheMasterIndex, 6000, 0);
				Static148.masterCache = new Cache(255, Static172.cacheData, Static190.cacheMasterIndex, 500000);
				Static121.uid = new BufferedFile(GameShell.signLink.uid, 24, 0);
				GameShell.signLink.cacheIndexes = null;
				GameShell.signLink.cacheMasterIndex = null;
				GameShell.signLink.uid = null;
				GameShell.signLink.cacheData = null;
			}
		} catch (@Pc(220) IOException ex) {
			Static121.uid = null;
			Static172.cacheData = null;
			Static190.cacheMasterIndex = null;
			Static148.masterCache = null;
		}
		Static278.mainLoadPrimaryText = LocalizedText.GAME0_LOADING;
		if (Static83.modeWhere != 0) {
			Static43.displayFps = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected final void reset() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void setJs5Response(@OriginalArg(1) int arg0) {
		Static107.js5NetQueue.errors++;
		Static37.js5SocketRequest = null;
		Static107.js5NetQueue.response = arg0;
		Static206.js5Socket = null;
		Static4.js5ConnectState = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method943() {
		for (Static182.keyQueueSize = 0; Static25.nextKey() && Static182.keyQueueSize < 128; Static182.keyQueueSize++) {
			Static227.keyCodes[Static182.keyQueueSize] = Static102.keyCode;
			Static205.keyChars[Static182.keyQueueSize] = Static193.keyChar;
		}
		Static178.anInt4247++;
		if (Static154.topLevelInterface != -1) {
			Static57.method1320(0, 0, 0, GameShell.canvasWidth, Static154.topLevelInterface, 0, GameShell.canvasHeight);
		}
		Static119.transmitTimer++;
		if (GlRenderer.enabled) {
			label191: for (@Pc(57) int local57 = 0; local57 < 32768; local57++) {
				@Pc(66) Npc local66 = Static175.aClass8_Sub4_Sub2Array1[local57];
				if (local66 != null) {
					@Pc(73) byte local73 = local66.aClass96_1.aByte10;
					if ((local73 & 0x2) > 0 && local66.anInt3409 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local66.aByteArray48[0] = 1;
							local66.movementQueueX[0] = local98 + (local66.anInt3412 >> 7);
							local66.movementQueueZ[0] = local106 + (local66.anInt3421 >> 7);
							Static148.collisionMaps[Static55.level].method3056(local66.anInt3412 >> 7, local66.method2693(), false, 0, local66.method2693(), local66.anInt3421 >> 7);
							if (local66.movementQueueX[0] >= 0 && local66.movementQueueX[0] <= 104 - local66.method2693() && local66.movementQueueZ[0] >= 0 && local66.movementQueueZ[0] <= 104 - local66.method2693() && Static148.collisionMaps[Static55.level].method3054(local66.anInt3421 >> 7, local66.movementQueueZ[0], local66.movementQueueX[0], local66.anInt3412 >> 7)) {
								if (local66.method2693() > 1) {
									for (@Pc(226) int local226 = local66.movementQueueX[0]; local66.movementQueueX[0] + local66.method2693() > local226; local226++) {
										for (@Pc(246) int local246 = local66.movementQueueZ[0]; local66.movementQueueZ[0] + local66.method2693() > local246; local246++) {
											if ((Static148.collisionMaps[Static55.level].anIntArrayArray30[local226][local246] & 0x12401FF) != 0) {
												continue label191;
											}
										}
									}
								}
								local66.anInt3409 = 1;
							}
						}
					}
					Static104.method2247(local66);
					Static37.method949(local66);
					Static34.method879(local66);
					Static148.collisionMaps[Static55.level].method3043(local66.anInt3412 >> 7, false, local66.anInt3421 >> 7, local66.method2693(), local66.method2693());
				}
			}
		}
		if (!GlRenderer.enabled) {
			Static269.method2170();
		} else if (Static184.loginStep == 0 && Static179.accountCreationStep == 0) {
			if (Static227.cameraType == 2) {
				Static125.updateLockedCamera();
			} else {
				Static40.updateLoginScreenCamera();
			}
			if (Static138.renderX >> 7 < 14 || Static138.renderX >> 7 >= 90 || Static134.renderZ >> 7 < 14 || Static134.renderZ >> 7 >= 90) {
				Static26.setupLoadingScreenRegion();
			}
		}
		while (true) {
			@Pc(374) HookRequest priorityRequest;
			@Pc(379) Component prioritySource;
			@Pc(387) Component priorityComponent;
			do {
				priorityRequest = (HookRequest) Static4.highPriorityRequests.removeHead();
				if (priorityRequest == null) {
					while (true) {
						do {
							priorityRequest = (HookRequest) Static115.mediumPriorityRequests.removeHead();
							if (priorityRequest == null) {
								while (true) {
									do {
										priorityRequest = (HookRequest) Static185.lowPriorityRequests.removeHead();
										if (priorityRequest == null) {
											if (Static105.aClass13_14 != null) {
												Static4.method28();
											}
											if (Static33.openUrlRequest != null && Static33.openUrlRequest.status == 1) {
												if (Static33.openUrlRequest.result != null) {
													Static169.openUrl(Static175.url, Static164.newTab);
												}
												Static164.newTab = false;
												Static175.url = null;
												Static33.openUrlRequest = null;
											}
											if (Static83.loop % 1500 == 0) {
												Static123.topBannerRefresh();
											}
											return;
										}
										prioritySource = priorityRequest.source;
										if (prioritySource.componentId < 0) {
											break;
										}
										priorityComponent = Static5.getComponent(prioritySource.layer);
									} while (priorityComponent == null || priorityComponent.createdComponents == null || priorityComponent.createdComponents.length <= prioritySource.componentId || prioritySource != priorityComponent.createdComponents[prioritySource.componentId]);
									Static82.method1767(priorityRequest);
								}
							}
							prioritySource = priorityRequest.source;
							if (prioritySource.componentId < 0) {
								break;
							}
							priorityComponent = Static5.getComponent(prioritySource.layer);
						} while (priorityComponent == null || priorityComponent.createdComponents == null || prioritySource.componentId >= priorityComponent.createdComponents.length || prioritySource != priorityComponent.createdComponents[prioritySource.componentId]);
						Static82.method1767(priorityRequest);
					}
				}
				prioritySource = priorityRequest.source;
				if (prioritySource.componentId < 0) {
					break;
				}
				priorityComponent = Static5.getComponent(prioritySource.layer);
			} while (priorityComponent == null || priorityComponent.createdComponents == null || priorityComponent.createdComponents.length <= prioritySource.componentId || prioritySource != priorityComponent.createdComponents[prioritySource.componentId]);
			Static82.method1767(priorityRequest);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void js5NetworkLoop() {
		@Pc(3) boolean idle = Static107.js5NetQueue.loop();
		if (!idle) {
			this.js5Connect();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void js5Connect() {
		if (Static233.js5PrevErrors < Static107.js5NetQueue.errors) {
			Static22.js5ConnectDelay = 5 * 50 * (Static107.js5NetQueue.errors - 1);
			if (Static271.defaultPort == Static209.port) {
				Static209.port = Static55.alternatePort;
			} else {
				Static209.port = Static271.defaultPort;
			}
			if (Static22.js5ConnectDelay > 3000) {
				Static22.js5ConnectDelay = 3000;
			}
			if (Static107.js5NetQueue.errors >= 2 && Static107.js5NetQueue.response == 6) {
				this.error("js5connect_outofdate");
				Static244.gameState = 1000;
				return;
			}
			if (Static107.js5NetQueue.errors >= 4 && Static107.js5NetQueue.response == -1) {
				this.error("js5crc");
				Static244.gameState = 1000;
				return;
			}
			if (Static107.js5NetQueue.errors >= 4 && (Static244.gameState == 0 || Static244.gameState == 5)) {
				if (Static107.js5NetQueue.response == 7 || Static107.js5NetQueue.response == 9) {
					this.error("js5connect_full");
				} else if (Static107.js5NetQueue.response > 0) {
					this.error("js5connect");
				} else {
					this.error("js5io");
				}
				Static244.gameState = 1000;
				return;
			}
		}
		Static233.js5PrevErrors = Static107.js5NetQueue.errors;
		if (Static22.js5ConnectDelay > 0) {
			Static22.js5ConnectDelay--;
			return;
		}
		try {
			if (Static4.js5ConnectState == 0) {
				Static37.js5SocketRequest = GameShell.signLink.openSocket(Static60.hostname, Static209.port);
				Static4.js5ConnectState++;
			}
			if (Static4.js5ConnectState == 1) {
				if (Static37.js5SocketRequest.status == 2) {
					this.setJs5Response(1000);
					return;
				}
				if (Static37.js5SocketRequest.status == 1) {
					Static4.js5ConnectState++;
				}
			}
			if (Static4.js5ConnectState == 2) {
				Static206.js5Socket = new BufferedSocket((Socket) Static37.js5SocketRequest.result, GameShell.signLink);
				@Pc(194) Buffer buffer = new Buffer(5);
				buffer.p1(15);
				buffer.p4(530);
				Static206.js5Socket.write(buffer.data, 5);
				Static4.js5ConnectState++;
				Static217.js5ConnectTime = MonotonicClock.currentTimeMillis();
			}
			if (Static4.js5ConnectState == 3) {
				if (Static244.gameState == 0 || Static244.gameState == 5 || Static206.js5Socket.available() > 0) {
					@Pc(258) int response = Static206.js5Socket.read();
					if (response != 0) {
						this.setJs5Response(response);
						return;
					}
					Static4.js5ConnectState++;
				} else if (MonotonicClock.currentTimeMillis() - Static217.js5ConnectTime > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (Static4.js5ConnectState == 4) {
				@Pc(296) boolean loggedOut = Static244.gameState == 5 || Static244.gameState == 10 || Static244.gameState == 28;
				Static107.js5NetQueue.loggedOut(!loggedOut, Static206.js5Socket);
				Static206.js5Socket = null;
				Static37.js5SocketRequest = null;
				Static4.js5ConnectState = 0;
			}
		} catch (@Pc(315) IOException ex) {
			this.setJs5Response(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void mainLoad() {
		if (!Static164.safeMode) {
			noSafeMode: while (true) {
				do {
					if (!Static25.nextKey()) {
						break noSafeMode;
					}
				} while (Static193.keyChar != 115 && Static193.keyChar != 83);
				Static164.safeMode = true;
			}
		}

		@Pc(43) int i;
		if (Static166.mainLoadState == 0) {
			@Pc(34) Runtime runtime = Runtime.getRuntime();
			i = (int) (0L / 1024L);
			@Pc(46) long now = MonotonicClock.currentTimeMillis();
			if (Static175.firstGc == 0L) {
				Static175.firstGc = now;
			}
			if (i > 16384 && now - Static175.firstGc < 5000L) {
				if (now - Static160.prevGc > 1000L) {
					System.gc();
					Static160.prevGc = now;
				}
				Static199.mainLoadPercentage = 5;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD0;
			} else {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD0B;
				Static166.mainLoadState = 10;
				Static199.mainLoadPercentage = 5;
			}
			return;
		}
		@Pc(98) int percentage;
		if (Static166.mainLoadState == 10) {
			Static120.method2392();
			for (percentage = 0; percentage < 4; percentage++) {
				Static148.collisionMaps[percentage] = new CollisionMap(104, 104);
			}
			Static199.mainLoadPercentage = 10;
			Static166.mainLoadState = 30;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD10B;
		} else if (Static166.mainLoadState == 30) {
			if (Static257.js5MasterIndex == null) {
				Static257.js5MasterIndex = new Js5MasterIndex(Static107.js5NetQueue, Static86.js5CacheQueue);
			}
			if (Static257.js5MasterIndex.method178()) {
				Static213.js5Archive0 = Static9.createJs5(false, true, true, 0);
				Static249.js5Archive1 = Static9.createJs5(false, true, true, 1);
				Static274.js5Archive2 = Static9.createJs5(true, true, false, 2);
				Static41.js5Archive3 = Static9.createJs5(false, true, true, 3);
				Static248.js5Archive4 = Static9.createJs5(false, true, true, 4);
				Static26.js5Archive5 = Static9.createJs5(true, true, true, 5);
				Static130.js5Archive6 = Static9.createJs5(true, false, true, 6);
				Static267.js5Archive7 = Static9.createJs5(false, true, true, 7);
				Static209.js5Archive8 = Static9.createJs5(false, true, true, 8);
				Static195.js5Archive9 = Static9.createJs5(false, true, true, 9);
				Static184.js5Archive10 = Static9.createJs5(false, true, true, 10);
				Static214.js5Archive11 = Static9.createJs5(false, true, true, 11);
				Static16.js5Archive12 = Static9.createJs5(false, true, true, 12);
				Static261.js5Archive13 = Static9.createJs5(false, true, true, 13);
				Static137.js5Archive14 = Static9.createJs5(false, false, true, 14);
				Static138.js5Archive15 = Static9.createJs5(false, true, true, 15);
				Static280.js5Archive16 = Static9.createJs5(false, true, true, 16);
				Static138.js5Archive17 = Static9.createJs5(false, true, true, 17);
				Static172.js5Archive18 = Static9.createJs5(false, true, true, 18);
				Static171.js5Archive19 = Static9.createJs5(false, true, true, 19);
				Static253.js5Archive20 = Static9.createJs5(false, true, true, 20);
				Static122.js5Archive21 = Static9.createJs5(false, true, true, 21);
				Static156.js5Archive22 = Static9.createJs5(false, true, true, 22);
				Static227.js5Archive23 = Static9.createJs5(true, true, true, 23);
				Static254.js5Archive24 = Static9.createJs5(false, true, true, 24);
				Static28.js5Archive25 = Static9.createJs5(false, true, true, 25);
				Static167.js5Archive26 = Static9.createJs5(true, true, true, 26);
				Static226.js5Archive27 = Static9.createJs5(false, true, true, 27);
				Static199.mainLoadPercentage = 15;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD30B;
				Static166.mainLoadState = 40;
			} else {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD30;
				Static199.mainLoadPercentage = 12;
			}
		} else if (Static166.mainLoadState == 40) {
			percentage = 0;
			for (i = 0; i < 28; i++) {
				percentage += Static269.js5Providers[i].getIndexPercentageComplete() * Static170.JS5_ARCHIVE_WEIGHTS[i] / 100;
			}
			if (percentage == 100) {
				Static199.mainLoadPercentage = 20;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD40B;
				Static75.init(Static209.js5Archive8);
				Static167.init(Static209.js5Archive8);
				Static81.init(Static209.js5Archive8);
				Static166.mainLoadState = 45;
			} else {
				if (percentage != 0) {
					Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.CHECKING_FOR_UPDATES, Static123.parseInt(percentage), Static49.PERCENT_SIGN});
				}
				Static199.mainLoadPercentage = 20;
			}
		} else if (Static166.mainLoadState == 45) {
			AudioChannel.init(Static99.stereo);
			Static148.musicStream = new MidiPcmStream();
			Static148.musicStream.init();
			Static11.musicChannel = AudioChannel.create(22050, GameShell.signLink, GameShell.canvas, 0);
			Static11.musicChannel.setStream(Static148.musicStream);
			Static34.init(Static148.musicStream, Static138.js5Archive15, Static137.js5Archive14, Static248.js5Archive4);
			Static147.soundChannel = AudioChannel.create(2048, GameShell.signLink, GameShell.canvas, 1);
			Static204.soundStream = new MixerPcmStream();
			Static147.soundChannel.setStream(Static204.soundStream);
			Static56.resampler = new Resampler(22050, Static44.sampleRate);
			Static250.titleSong = Static130.js5Archive6.getGroupId(Static1.TITLE_SONG);
			Static199.mainLoadPercentage = 30;
			Static166.mainLoadState = 50;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD45B;
		} else if (Static166.mainLoadState == 50) {
			percentage = Static74.getReady(Static209.js5Archive8, Static261.js5Archive13);
			i = Static143.getTotal();
			if (percentage >= i) {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD50B;
				Static199.mainLoadPercentage = 35;
				Static166.mainLoadState = 60;
			} else {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD50, Static123.parseInt(percentage * 100 / i), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 35;
			}
		} else if (Static166.mainLoadState == 60) {
			percentage = Static150.getReady(Static209.js5Archive8);
			i = Static104.getTotal();
			if (i <= percentage) {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD60B;
				Static166.mainLoadState = 65;
				Static199.mainLoadPercentage = 40;
			} else {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD60, Static123.parseInt(percentage * 100 / i), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 40;
			}
		} else if (Static166.mainLoadState == 65) {
			Static102.load(Static261.js5Archive13, Static209.js5Archive8);
			Static199.mainLoadPercentage = 45;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD65B;
			Static196.setGameState(5);
			Static166.mainLoadState = 70;
		} else if (Static166.mainLoadState == 70) {
			Static274.js5Archive2.fetchAll();
			percentage = Static274.js5Archive2.getPercentageComplete();
			Static280.js5Archive16.fetchAll();
			percentage += Static280.js5Archive16.getPercentageComplete();
			Static138.js5Archive17.fetchAll();
			percentage += Static138.js5Archive17.getPercentageComplete();
			Static172.js5Archive18.fetchAll();
			percentage += Static172.js5Archive18.getPercentageComplete();
			Static171.js5Archive19.fetchAll();
			percentage += Static171.js5Archive19.getPercentageComplete();
			Static253.js5Archive20.fetchAll();
			percentage += Static253.js5Archive20.getPercentageComplete();
			Static122.js5Archive21.fetchAll();
			percentage += Static122.js5Archive21.getPercentageComplete();
			Static156.js5Archive22.fetchAll();
			percentage += Static156.js5Archive22.getPercentageComplete();
			Static254.js5Archive24.fetchAll();
			percentage += Static254.js5Archive24.getPercentageComplete();
			Static28.js5Archive25.fetchAll();
			percentage += Static28.js5Archive25.getPercentageComplete();
			Static226.js5Archive27.fetchAll();
			percentage += Static226.js5Archive27.getPercentageComplete();
			if (percentage >= 1100) {
				Static226.init(Static274.js5Archive2);
				Static199.init(Static274.js5Archive2);
				Static91.init(Static274.js5Archive2);
				Static125.init(Static267.js5Archive7, Static274.js5Archive2);
				Static181.init(Static280.js5Archive16, Static267.js5Archive7);
				Static88.init(Static267.js5Archive7, Static172.js5Archive18);
				Static241.init(Static171.js5Archive19, Static265.p11FullSoftware, Static267.js5Archive7);
				Static58.init(Static274.js5Archive2);
				Static141.init(Static249.js5Archive1, Static253.js5Archive20, Static213.js5Archive0);
				Static79.init(Static274.js5Archive2);
				Static266.init(Static267.js5Archive7, Static122.js5Archive21);
				Static180.init(Static156.js5Archive22);
				Static230.init(Static274.js5Archive2);
				Static3.init(Static261.js5Archive13, Static209.js5Archive8, Static41.js5Archive3, Static267.js5Archive7);
				Static119.init(Static274.js5Archive2);
				Static85.init(Static138.js5Archive17);
				Static59.init(Static28.js5Archive25, Static254.js5Archive24, new Js5QuickChatCommandDecoder());
				Static115.init(Static28.js5Archive25, Static254.js5Archive24);
				Static107.init(Static274.js5Archive2);
				Static246.init(Static274.js5Archive2, Static209.js5Archive8);
				Static180.init(Static274.js5Archive2, Static209.js5Archive8);
				Static199.mainLoadPercentage = 50;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD70B;
				Static58.init();
				Static166.mainLoadState = 80;
			} else {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD70, Static123.parseInt(percentage / 11), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 50;
			}
		} else if (Static166.mainLoadState == 80) {
			percentage = Static28.getReady(Static209.js5Archive8);
			i = Static62.total();
			if (i > percentage) {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD80, Static123.parseInt(percentage * 100 / i), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 60;
			} else {
				Static30.load(Static209.js5Archive8);
				Static166.mainLoadState = 90;
				Static199.mainLoadPercentage = 60;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD80B;
			}
		} else if (Static166.mainLoadState == 90) {
			if (Static167.js5Archive26.fetchAll()) {
				@Pc(951) Js5GlTextureProvider textureProvider = new Js5GlTextureProvider(Static195.js5Archive9, Static167.js5Archive26, Static209.js5Archive8, 20, !Static53.highDetailTextures);
				Rasteriser.unpackTextures(textureProvider);
				if (Static113.brightness == 1) {
					Rasteriser.setBrightness(0.9F);
				}
				if (Static113.brightness == 2) {
					Rasteriser.setBrightness(0.8F);
				}
				if (Static113.brightness == 3) {
					Rasteriser.setBrightness(0.7F);
				}
				if (Static113.brightness == 4) {
					Rasteriser.setBrightness(0.6F);
				}
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD90B;
				Static166.mainLoadState = 100;
				Static199.mainLoadPercentage = 70;
			} else {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD90, Static123.parseInt(Static167.js5Archive26.getPercentageComplete()), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 70;
			}
		} else if (Static166.mainLoadState == 100) {
			if (Static231.isReady(Static209.js5Archive8)) {
				Static166.mainLoadState = 110;
			}
		} else if (Static166.mainLoadState == 110) {
			Static178.instance = new MouseRecorder();
			GameShell.signLink.startThread(10, Static178.instance);
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD110B;
			Static199.mainLoadPercentage = 75;
			Static166.mainLoadState = 120;
		} else if (Static166.mainLoadState == 120) {
			if (Static184.js5Archive10.isFileReady(Static186.EMPTY_FILE, Static252.HUFFMAN_GROUP)) {
				@Pc(1060) HuffmanCodec codec = new HuffmanCodec(Static184.js5Archive10.fetchFile(Static186.EMPTY_FILE, Static252.HUFFMAN_GROUP));
				Static1.method1(codec);
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD120B;
				Static166.mainLoadState = 130;
				Static199.mainLoadPercentage = 80;
			} else {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD120, Static206.aClass100_899 });
				Static199.mainLoadPercentage = 80;
			}
		} else if (Static166.mainLoadState == 130) {
			if (!Static41.js5Archive3.fetchAll()) {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD130, Static123.parseInt(Static41.js5Archive3.getPercentageComplete() * 3 / 4), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 85;
			} else if (!Static16.js5Archive12.fetchAll()) {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD130, Static123.parseInt(Static16.js5Archive12.getPercentageComplete() / 10 + 75), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 85;
			} else if (!Static261.js5Archive13.fetchAll()) {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD130, Static123.parseInt(Static261.js5Archive13.getPercentageComplete() / 20 + 85), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 85;
			} else if (Static227.js5Archive23.allFilesComplete(Static165.DETAILS)) {
				Static234.method4018(Static173.aClass3_Sub2_Sub1_Sub1Array9, Static227.js5Archive23);
				Static199.mainLoadPercentage = 95;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD130B;
				Static166.mainLoadState = 135;
			} else {
				Static126.mainLoadSecondaryText = Static34.concatenate(new JagString[] { LocalizedText.MAINLOAD130, Static123.parseInt(Static227.js5Archive23.method4478(Static165.DETAILS) / 10 + 90), Static49.PERCENT_SIGN});
				Static199.mainLoadPercentage = 85;
			}
		} else if (Static166.mainLoadState == 135) {
			percentage = Static207.fetch();
			if (percentage == -1) {
				Static199.mainLoadPercentage = 95;
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD135;
			} else if (percentage == 7 || percentage == 9) {
				this.error("worldlistfull");
				Static196.setGameState(1000);
			} else if (Static61.aBoolean109) {
				Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD135B;
				Static166.mainLoadState = 140;
				Static199.mainLoadPercentage = 96;
			} else {
				this.error("worldlistio_" + percentage);
				Static196.setGameState(1000);
			}
		} else if (Static166.mainLoadState == 140) {
			Static156.loginScreenId = Static41.js5Archive3.getGroupId(Static138.LOGINSCREEN);
			Static26.js5Archive5.discardNames(false);
			Static130.js5Archive6.discardNames(true);
			Static209.js5Archive8.discardNames(true);
			Static261.js5Archive13.discardNames(true);
			Static184.js5Archive10.discardNames(true);
			Static41.js5Archive3.discardNames(true);
			Static199.mainLoadPercentage = 97;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD140;
			Static166.mainLoadState = 150;
			Static107.clean = true;
		} else if (Static166.mainLoadState == 150) {
			Static151.method2807();
			if (Static164.safeMode) {
				Static102.windowMode = 0;
				Static186.antiAliasingMode = 0;
				Static214.windowMode = 0;
				Static141.buildArea = 0;
			}
			Static164.safeMode = true;
			Static203.write(GameShell.signLink);
			Static241.setWindowMode(false, Static214.windowMode, -1, -1);
			Static199.mainLoadPercentage = 100;
			Static166.mainLoadState = 160;
			Static126.mainLoadSecondaryText = LocalizedText.MAINLOAD150B;
		} else if (Static166.mainLoadState == 160) {
			Static73.method1596(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected final void mainLoop() {
		if (Static244.gameState == 1000) {
			return;
		}
		Static83.loop++;
		if (Static83.loop % 1000 == 1) {
			@Pc(24) GregorianCalendar gregorianCalendar = new GregorianCalendar();
			Static60.gregorianDateSeed = gregorianCalendar.get(Calendar.HOUR_OF_DAY) * 600 + gregorianCalendar.get(Calendar.MINUTE) * 10 + gregorianCalendar.get(Calendar.SECOND) / 6;
			Static39.aRandom1.setSeed(Static60.gregorianDateSeed);
		}
		this.js5NetworkLoop();
		if (Static257.js5MasterIndex != null) {
			Static257.js5MasterIndex.method179();
		}
		Static230.method3948();
		Static107.method2261();
		Static65.handleKeyboard();
		Static111.handleMouse();
		if (GlRenderer.enabled) {
			Static63.process();
		}
		if (Static71.mouseWheel != null) {
			@Pc(75) int wheelRotation = Static71.mouseWheel.getRotation();
			Static58.wheelRotation = wheelRotation;
		}
		if (Static244.gameState == 0) {
			this.mainLoad();
			Static234.method4020();
		} else if (Static244.gameState == 5) {
			this.mainLoad();
			Static234.method4020();
		} else if (Static244.gameState == 25 || Static244.gameState == 28) {
			Static78.rebuildMap();
		}
		if (Static244.gameState == 10) {
			this.method943();
			Static158.handleAccountCreation();
			Static31.method848();
			Static216.handleLogin();
		} else if (Static244.gameState == 30) {
			Static81.method1756();
		} else if (Static244.gameState == 40) {
			Static216.handleLogin();
			if (Static266.returnCode != -3) {
				if (Static266.returnCode == 15) {
					Static44.method1146();
				} else if (Static266.returnCode != 2) {
					Static278.processLogout();
				}
			}
		}
	}
}
