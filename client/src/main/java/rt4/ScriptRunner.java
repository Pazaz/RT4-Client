package rt4;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ScriptRunner {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[Lclient!na;")
	public static final JagString[] stringStack = new JagString[1000];
	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	public static final int[] intStack = new int[1000];
	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lclient!na;")
	public static final JagString EMPTY_STRING = JagString.parse("");
	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!na;")
	public static final JagString aClass100_74 = JagString.parse("::");
	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Lclient!na;")
	public static final JagString EVENT_OPBASE = JagString.parse("event_opbase");
	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!na;")
	public static final JagString aClass100_253 = JagString.parse("(U0a )2 via: ");
    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!na;")
	public static final JagString aClass100_446 = JagString.parse("<img=0>");
	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_780 = JagString.parse("Clientscript error in: ");
	@OriginalMember(owner = "client!hm", name = "R", descriptor = "Lclient!na;")
	public static final JagString aClass100_537 = JagString.parse("<img=1>");
	@OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();
	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Lclient!na;")
	public static final JagString CS_ERROR = JagString.parse("Clientscript error )2 check log for details");
	@OriginalMember(owner = "client!fe", name = "nc", descriptor = "[Lclient!hj;")
	public static final GoSubFrame[] callStack = new GoSubFrame[50];
	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
	public static final int[] anIntArray140 = new int[5];
	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[5][5000];
	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!bd;")
	public static QuickChatPhrase activePhrase;
	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!be;")
	public static Component staticActiveComponent1;
	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!be;")
	public static Component staticActiveComponent2;
	@OriginalMember(owner = "client!og", name = "g", descriptor = "[Lclient!na;")
	public static JagString[] stringLocals;
	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
	public static int[] intLocals;
	@OriginalMember(owner = "client!km", name = "ad", descriptor = "I")
	public static int fp = 0;

	public static class Cs2Opcodes {
		// Component setters
		public static final int setPosition = 1000;
		public static final int setSize = 1001;
		public static final int setHidden = 1003;
		public static final int setAspect = 1004;
		public static final int setNoClickThrough = 1005;

		public static final int setScrollPos = 1100;
		public static final int setTrans = 1103;
		public static final int setLineWid = 1104;
		public static final int setSprite = 1105;
		public static final int set2DAngle = 1106;
		public static final int setSpriteTiling = 1107;
		public static final int setModel = 1108;
		public static final int set3DRotation = 1109;
		public static final int setAnimation = 1110;
		public static final int setModelOrthog = 1111;
		public static final int setText = 1112;
		public static final int setFont = 1113;
		public static final int setTextAlignment = 1114;
		public static final int setTextAntiMacro = 1115;
		public static final int setOutlineThickness = 1116;
		public static final int setShadowColor = 1117;
		public static final int setVFlip = 1118;
		public static final int setHFlip = 1119;
		public static final int setScrollMax = 1120;
		public static final int setAlpha = 1122;
		public static final int set3DViewDistance = 1123;

		public static final int setItem = 1200;
		public static final int setNpcHead = 1201;
		public static final int setPlayerHead = 1202;
		public static final int setPlayerFull = 1204;
		public static final int setItemNoNum = 1205;

		// Component properties
		public static final int getX = 1500;
		public static final int getY = 1501;
		public static final int getWidth = 1502;
		public static final int getHeight = 1503;
		public static final int getHidden = 1504;
		public static final int getLayer = 1505;

		// Bit utilities
		public static final int addPercent = 4007;
		public static final int flagBit = 4008;
		public static final int unflagBit = 4009;
		public static final int isBitFlagged = 4010;
		public static final int mod = 4011;
		public static final int pow = 4012;
		public static final int root = 4013;
		public static final int bitAnd = 4014;
		public static final int bitOr = 4015;
		public static final int min = 4016;
		public static final int max = 4017;
		public static final int multiplyDivide = 4018;

		// String utilities
		public static final int concatInt = 4100;
		public static final int concatString = 4101;
		public static final int concatSignedInt = 4102;
		public static final int toLowerStr = 4103;
		public static final int timeToStr = 4104;
		public static final int strForGender = 4105;
		public static final int parseInt = 4106;
		public static final int compare = 4107;
		public static final int getLineCount = 4108;
		public static final int getMaxLineWidth = 4109;
		public static final int chooseString = 4110;
		public static final int escape = 4111;
		public static final int concatChar = 4112;
		public static final int isValidChar = 4113;
		public static final int isAlphaNumeric = 4114;
		public static final int isLetter = 4115;
		public static final int isDigit = 4116;
		public static final int length = 4117;
		public static final int substr = 4118;
		public static final int removeTags = 4119;
		public static final int indexOfChar = 4120;
		public static final int indexOfStr = 4121;
		public static final int toLower = 4122;
		public static final int toUpper = 4123;
		public static final int formatNumber = 4124;

		// Objs
		public static final int itemIsMembers = 4207;
		public static final int itemAttribute = 4208;
		public static final int searchItem = 4210;

		// Privacy
		public static final int getPublicChatSetting = 5000;
		public static final int setChatSettings = 5001;
		public static final int getPrivateChatSetting = 5005;

		// Ads
		public static final int canShowVideoAd = 6405;
		public static final int isShowingVideoAd = 6406;

		// Worlds
		public static final int getFirstWorldData = 6501;
		public static final int getNextWorldData = 6502;
		public static final int setWorldHost = 6503;
		public static final int setChild = 200;
		public static final int setChild2 = 201;
		public static final int setBaseIdkit = 403;
		public static final int setBaseColor = 404;
		public static final int setFemale = 410;
		public static final int setRGB = 1101;
		public static final int setFilled = 1102;
		public static final int setContextMenuOption = 1300;
		public static final int setDraggable = 1301;
		public static final int setDragRenderBehaviour = 1302;
		public static final int setDragDeadZone = 1303;
		public static final int setDragDeadTime = 1304;
		public static final int setOptionBase = 1305;
		public static final int setTargetVerb = 1306;
		public static final int hookMousePress = 1400;
		public static final int hookDraggedOver = 1401;
		public static final int hookMouseRelease = 1402;
		public static final int hookMouseEnter = 1403;
		public static final int hookMouseExit = 1404;
		public static final int hookDragStart = 1405;
		public static final int hookUseWith = 1406;
		public static final int hookVARP = 1407;
		public static final int hookFrame = 1408;
		public static final int hookOptionClick = 1409;
		public static final int hookDragRelease = 1410;
		public static final int hookDrag = 1411;
		public static final int hookMouseHover = 1412;
		public static final int hookContainer = 1414;
		public static final int hookSkill = 1415;
		public static final int hookOnUse = 1416;
		public static final int hookScroll = 1417;
		public static final int hookMsg = 1418;
		public static final int hookKey = 1419;
		public static final int hookFriendList = 1420;
		public static final int hookClanList = 1421;
		public static final int hookMiscData = 1422;
		public static final int hookDialogAbort = 1423;
		public static final int hookWidgetsOpenClose = 1424;
		public static final int hookGEUpdate = 1425;
		public static final int hookMinimapUnlock = 1426;
		public static final int hookResize = 1427;
		public static final int hookVARC = 1428;
		public static final int hookSTRING = 1429;
		public static final int getScrollX = 1600;
		public static final int getScrollY = 1601;
		public static final int getText = 1602;
		public static final int getScrollMaxH = 1603;
		public static final int getScrollMaxV = 1604;
		public static final int get3DDistance = 1605;
		public static final int getRotateX = 1606;
		public static final int getRotateZ = 1607;
		public static final int getRotateY = 1608;
		public static final int getAlpha = 1609;
		public static final int getModelXOffset = 1610;
		public static final int getModelYOffset = 1611;
		public static final int getSpriteId = 1612;
		public static final int getItemId = 1700;
		public static final int getItemAmt = 1701;
		public static final int getChildId = 1702;
		public static final int getTargetMask = 1800;
		public static final int getOption = 1801;
		public static final int getOptionBase = 1802;
		public static final int getX2 = 2500;
		public static final int getY2 = 2501;
		public static final int getWidth2 = 2502;
		public static final int getHeight2 = 2503;
		public static final int isHidden2 = 2504;
		public static final int getLayer2 = 2505;
		public static final int getScrollX2 = 2600;
		public static final int getScrollY2 = 2601;
		public static final int getText2 = 2602;
		public static final int getScrollMaxH2 = 2603;
		public static final int getScrollMaxV2 = 2604;
		public static final int get3DDistance2 = 2605;
		public static final int getRotateX2 = 2606;
		public static final int getRotateZ2 = 2607;
		public static final int getRotateY2 = 2608;
		public static final int getAlpha2 = 2609;
		public static final int getModelXOffset2 = 2610;
		public static final int getModelYOffset2 = 2611;
		public static final int getSpriteId2 = 2612;
		public static final int getItemId2 = 2700;
		public static final int getItemAmt2 = 2701;
		public static final int hasChild = 2702;
		public static final int nextChild = 2703;
		public static final int hasChildModal = 2704;
		public static final int hasChildOverlay = 2705;
		public static final int getTargetMask2 = 2800;
		public static final int getOption2 = 2801;
		public static final int getOptionBase2 = 2802;
		public static final int msg = 3100;
		public static final int animateSelf = 3101;
		public static final int sendIntegerInput = 3104;
		public static final int sendNameInput = 3105;
		public static final int sendStringInput = 3106;
		public static final int clickPlayerOption = 3107;
		public static final int playSoundEffect = 3200;
		public static final int playMusic = 3201;
		public static final int playMusicEffect = 3202;
		public static final int getClientCycle = 3300;
		public static final int getItemIdInSlot = 3301;
		public static final int getItemAmtInSlot = 3302;
		public static final int getItemAmtInContainer = 3303;
		public static final int getItemContainerLength = 3304;
		public static final int getSkillCurrentLvl = 3305;
		public static final int getSkillActualLvl = 3306;
		public static final int getSkillXp = 3307;
		public static final int getMyLocation = 3308;
		public static final int x = 3309;
		public static final int z = 3310;
		public static final int y = 3311;
		public static final int isMember = 3312;
		public static final int getItemIdInInpsectingSlot = 3313;
		public static final int getItemAmtInInspectingSlot = 3314;
		public static final int getItemAmtInInspectingContainer = 3315;
		public static final int getClientRights = 3316;
		public static final int getSystemUpdateTimer = 3317;
		public static final int getWorldId = 3318;
		public static final int getRunEnergy = 3321;
		public static final int getPlayerWeight = 3322;
		public static final int hasMoreThen5Blackmarks = 3323;
		public static final int getBlackmarks = 3324;
		public static final int isSiteSettingsMembers = 3325;
		public static final int getMyCombat = 3326;
		public static final int IsFemale = 3327;
		public static final int mapQuickchat = 3329;
		public static final int getContainerFreeSlots = 3330;
		public static final int getContainerIntAttrCountIgnoreStacks = 3331;
		public static final int getContainerIntAttrCount = 3332;
		public static final int getLoginTypeRelatedMethod3333 = 3333;
		public static final int getLanguage = 3335;
		public static final int moveCoord = 3336;
		public static final int getAffid = 3337;
		public static final int datamap = 3400;
		public static final int datamap2 = 3408;
		public static final int datamapContainsValue = 3409;
		public static final int datamapContainsValue2 = 3410;
		public static final int datamapSize = 3411;
		public static final int getFriendCount = 3600;
		public static final int getFriendName = 3601;
		public static final int getFriendWorld = 3602;
		public static final int getFriendRank = 3603;
		public static final int isFriend = 3609;
		public static final int getFriendWorldName = 3610;
		public static final int clanChatDisplayName = 3611;
		public static final int clanGetChatCount = 3612;
		public static final int clanChatUsername = 3613;
		public static final int clanChatUserWorld = 3614;
		public static final int clanChatUserRank = 3615;
		public static final int getIgnoreCount = 3621;
		public static final int getIgnoreName = 3622;
		public static final int getGEIsSelling = 3903;
		public static final int getGEItem = 3904;
		public static final int getGEItemPrice = 3905;
		public static final int getGEItemAmt = 3906;
		public static final int getGEItemAmtTransfered = 3907;
		public static final int getGECashTransfered = 3908;
		public static final int getGENotStarted = 3910;
		public static final int getGEIsStatus2 = 3911;
		public static final int getGEIsDone = 3912;
		public static final int getGEIsStatus1 = 3913;
		public static final int add = 4000;
		public static final int subtract = 4001;
		public static final int multiply = 4002;
		public static final int divide = 4003;
		public static final int rndExcl = 4004;
		public static final int rnd = 4005;
		public static final int getItemName = 4200;
		public static final int getItemGroundOption = 4201;
		public static final int getItemOption = 4202;
		public static final int getItemValue = 4203;
		public static final int itemIsStackable = 4204;
		public static final int getNotedItem = 4205;
		public static final int getRealItem = 4206;
		public static final int nextSearchResult = 4211;
		public static final int getNpcAttribute = 4300;
		public static final int getTradeSetting = 5016;
		public static final int isHoldingAlt = 5100;
		public static final int isHoldingCtrl = 5101;
		public static final int isHoldingShift = 5102;
		public static final int setWorldmapZoom = 5200;
		public static final int getWorldmapZoom = 5201;
		public static final int loadDungeonmap = 5205;
		public static final int getDungeonmap = 5206;
		public static final int getDungeonMapName = 5207;
		public static final int getDungeonmapCenter = 5210;
		public static final int setPositionInMap = 5214;
		public static final int dungeonmapContains = 5215;
		public static final int getMapDefaultZoom = 5218;
		public static final int getDisplayMode = 5306;
		public static final int getLastIp5419 = 5419;
		public static final int cameraMoveTo = 5500;
		public static final int cameraPointAt = 5501;
		public static final int cameraUnlock = 5503;
		public static final int cameraGetVrot = 5505;
		public static final int cameraGetHrot = 5506;
		public static final int directlogin = 5600;
		public static final int sendRequestAccount = 5604;
		public static final int sendCreateAccount = 5605;
		public static final int getGameloginRc = 5607;
		public static final int getWorldswitchTimer = 5608;
		public static final int getAccountCreateRC = 5609;
		public static final int getDetailedRC = 5611;
		public static final int getMinute = 6300;
		public static final int getCurrentDaysSinceLaunch = 6301;
		public static final int getDaysSinceLaunch = 6302;
		public static final int getYear = 6303;
		public static final int isLeapYear = 6304;
		public static final int setNoOptions = 1307;
		public static final int sendCloseWidgetPacket = 3103;
		public static final int skipLoginstage10 = 5601;
		public static final int resetRCs = 5602;
		public static final int resetAccountCreateRC = 5606;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!jl;)V")
	public static void run(@OriginalArg(1) int maxCycles, @OriginalArg(2) HookRequest request) {
		@Pc(4) Object[] local4 = request.arguments;
		@Pc(10) int sid = (Integer) local4[0];
		@Pc(14) ClientScript script = ClientScriptList.get(sid);
		if (script == null) {
			return;
		}
		fp = 0;
		@Pc(26) int ssp = 0;
		@Pc(28) int isp = 0;
		@Pc(30) int pc = -1;
		@Pc(33) int[] intOperands = script.intOperands;
		@Pc(36) int[] opcodes = script.opcodes;
		@Pc(44) byte op = -1;
		@Pc(58) int cycles;
		try {
			intLocals = new int[script.anInt4667];
			@Pc(50) int intLocalIndex = 0;
			stringLocals = new JagString[script.anInt4671];
			@Pc(56) int stringLocalIndex = 0;
			@Pc(77) int id;
			@Pc(194) JagString value;
			for (cycles = 1; cycles < local4.length; cycles++) {
				if (local4[cycles] instanceof Integer) {
					id = (Integer) local4[cycles];
					if (id == 0x80000001) {
						id = request.mouseX;
					}
					if (id == 0x80000002) {
						id = request.mouseY;
					}
					if (id == 0x80000003) {
						id = request.source == null ? -1 : request.source.id;
					}
					if (id == 0x80000004) {
						id = request.op;
					}
					if (id == 0x80000005) {
						id = request.source == null ? -1 : request.source.createdComponentId;
					}
					if (id == 0x80000006) {
						id = request.target == null ? -1 : request.target.id;
					}
					if (id == 0x80000007) {
						id = request.target == null ? -1 : request.target.createdComponentId;
					}
					if (id == 0x80000008) {
						id = request.keyCode;
					}
					if (id == 0x80000009) {
						id = request.keyChar;
					}
					intLocals[intLocalIndex++] = id;
				} else if (local4[cycles] instanceof JagString) {
					value = (JagString) local4[cycles];
					if (value.strEquals(EVENT_OPBASE)) {
						value = request.opBase;
					}
					stringLocals[stringLocalIndex++] = value;
				}
			}
			cycles = 0;
			nextOp: while (true) {
				cycles++;
				if (maxCycles < cycles) {
					throw new RuntimeException("slow");
				}
				pc++;
				@Pc(226) int opcode = opcodes[pc];
				@Pc(803) int int3;
				@Pc(652) int local652;
				@Pc(809) int int1;
				@Pc(609) JagString string;
				if (opcode < 100) {
					if (opcode == 0) {
						intStack[isp++] = intOperands[pc];
						continue;
					}
					if (opcode == 1) {
						id = intOperands[pc];
						intStack[isp++] = VarpDomain.activeVarps[id];
						continue;
					}
					if (opcode == 2) {
						id = intOperands[pc];
						isp--;
						VarpDomain.method2766(id, intStack[isp]);
						continue;
					}
					if (opcode == 3) {
						stringStack[ssp++] = script.stringOperands[pc];
						continue;
					}
					if (opcode == 6) {
						pc += intOperands[pc];
						continue;
					}
					if (opcode == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 8) {
						isp -= 2;
						if (intStack[isp + 1] == intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 10) {
						isp -= 2;
						if (intStack[isp + 1] < intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 21) {
						if (fp == 0) {
							return;
						}
						@Pc(423) GoSubFrame frame = callStack[--fp];
						script = frame.script;
						intLocals = frame.intLocals;
						opcodes = script.opcodes;
						pc = frame.pc;
						stringLocals = frame.stringLocals;
						intOperands = script.intOperands;
						continue;
					}
					if (opcode == 25) {
						id = intOperands[pc];
						intStack[isp++] = VarpDomain.getVarbit(id);
						continue;
					}
					if (opcode == 27) {
						id = intOperands[pc];
						isp--;
						VarpDomain.setVarbitClient(id, intStack[isp]);
						continue;
					}
					if (opcode == 31) {
						isp -= 2;
						if (intStack[isp + 1] >= intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 32) {
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 33) {
						intStack[isp++] = intLocals[intOperands[pc]];
						continue;
					}
					@Pc(555) int local;
					if (opcode == 34) {
						local = intOperands[pc];
						isp--;
						intLocals[local] = intStack[isp];
						continue;
					}
					if (opcode == 35) {
						stringStack[ssp++] = stringLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 36) {
						local = intOperands[pc];
						ssp--;
						stringLocals[local] = stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						id = intOperands[pc];
						ssp -= id;
						string = JagString.method2355(ssp, id, stringStack);
						stringStack[ssp++] = string;
						continue;
					}
					if (opcode == 38) {
						isp--;
						continue;
					}
					if (opcode == 39) {
						ssp--;
						continue;
					}
					if (opcode == 40) {
						id = intOperands[pc];
						@Pc(642) ClientScript local642 = ClientScriptList.get(id);
						@Pc(646) int[] local646 = new int[local642.anInt4667];
						@Pc(650) JagString[] local650 = new JagString[local642.anInt4671];
						for (local652 = 0; local652 < local642.anInt4665; local652++) {
							local646[local652] = intStack[local652 + isp - local642.anInt4665];
						}
						for (local652 = 0; local652 < local642.anInt4669; local652++) {
							local650[local652] = stringStack[local652 + ssp - local642.anInt4669];
						}
						isp -= local642.anInt4665;
						ssp -= local642.anInt4669;
						@Pc(705) GoSubFrame local705 = new GoSubFrame();
						local705.stringLocals = stringLocals;
						local705.intLocals = intLocals;
						local705.pc = pc;
						local705.script = script;
						if (fp >= callStack.length) {
							throw new RuntimeException();
						}
						script = local642;
						pc = -1;
						callStack[fp++] = local705;
						intLocals = local646;
						intOperands = local642.intOperands;
						opcodes = local642.opcodes;
						stringLocals = local650;
						continue;
					}
					if (opcode == 42) {
						intStack[isp++] = VarcDomain.varcs[intOperands[pc]];
						continue;
					}
					if (opcode == 43) {
						id = intOperands[pc];
						isp--;
						VarcDomain.varcs[id] = intStack[isp];
						DelayedStateChange.method24(id);
						continue;
					}
					if (opcode == 44) {
						id = intOperands[pc] >> 16;
						isp--;
						int3 = intStack[isp];
						int1 = intOperands[pc] & 0xFFFF;
						if (int3 >= 0 && int3 <= 5000) {
							anIntArray140[id] = int3;
							@Pc(828) byte local828 = -1;
							if (int1 == 105) {
								local828 = 0;
							}
							local652 = 0;
							while (true) {
								if (int3 <= local652) {
									continue nextOp;
								}
								anIntArrayArray33[id][local652] = local828;
								local652++;
							}
						}
						throw new RuntimeException();
					}
					if (opcode == 45) {
						id = intOperands[pc];
						isp--;
						int1 = intStack[isp];
						if (int1 >= 0 && int1 < anIntArray140[id]) {
							intStack[isp++] = anIntArrayArray33[id][int1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						id = intOperands[pc];
						isp -= 2;
						int1 = intStack[isp];
						if (int1 >= 0 && int1 < anIntArray140[id]) {
							anIntArrayArray33[id][int1] = intStack[isp + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						value = VarcDomain.varcstrs[intOperands[pc]];
						if (value == null) {
							value = VarpDomain.aClass100_1061;
						}
						stringStack[ssp++] = value;
						continue;
					}
					if (opcode == 48) {
						id = intOperands[pc];
						ssp--;
						VarcDomain.varcstrs[id] = stringStack[ssp];
						DelayedStateChange.method1840(id);
						continue;
					}
					if (opcode == 51) {
						@Pc(992) HashTable local992 = script.aClass133Array1[intOperands[pc]];
						isp--;
						@Pc(1002) IntNode local1002 = (IntNode) local992.get((long) intStack[isp]);
						if (local1002 != null) {
							pc += local1002.value;
						}
						continue;
					}
				}
				@Pc(1020) boolean local1020;
				if (intOperands[pc] == 1) {
					local1020 = true;
				} else {
					local1020 = false;
				}
				@Pc(1182) Component component;
				@Pc(1052) int int2;
				@Pc(1063) Component local1063;
				@Pc(1087) int local1087;
				@Pc(1256) Component local1256;
				if (opcode < 300) {
					if (opcode == 100) {
						isp -= 3;
						int1 = intStack[isp];
						int3 = intStack[isp + 1];
						int2 = intStack[isp + 2];
						if (int3 != 0) {
							local1063 = InterfaceList.getComponent(int1);
							if (local1063.createdComponents == null) {
								local1063.createdComponents = new Component[int2 + 1];
							}
							if (int2 >= local1063.createdComponents.length) {
								@Pc(1085) Component[] local1085 = new Component[int2 + 1];
								for (local1087 = 0; local1087 < local1063.createdComponents.length; local1087++) {
									local1085[local1087] = local1063.createdComponents[local1087];
								}
								local1063.createdComponents = local1085;
							}
							if (int2 > 0 && local1063.createdComponents[int2 - 1] == null) {
								throw new RuntimeException("Gap at:" + (int2 - 1));
							}
							@Pc(1137) Component local1137 = new Component();
							local1137.if3 = true;
							local1137.createdComponentId = int2;
							local1137.layer = local1137.id = local1063.id;
							local1137.type = int3;
							local1063.createdComponents[int2] = local1137;
							if (local1020) {
								staticActiveComponent1 = local1137;
							} else {
								staticActiveComponent2 = local1137;
							}
							InterfaceList.redraw(local1063);
							continue;
						}
						throw new RuntimeException();
					}
					@Pc(1204) Component local1204;
					if (opcode == 101) {
						component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
						if (component.createdComponentId == -1) {
							if (!local1020) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1204 = InterfaceList.getComponent(component.id);
						local1204.createdComponents[component.createdComponentId] = null;
						InterfaceList.redraw(local1204);
						continue;
					}
					if (opcode == 102) {
						isp--;
						component = InterfaceList.getComponent(intStack[isp]);
						component.createdComponents = null;
						InterfaceList.redraw(component);
						continue;
					}
					if (opcode == Cs2Opcodes.setChild) {
						isp -= 2;
						int1 = intStack[isp];
						int3 = intStack[isp + 1];
						local1256 = InterfaceList.method1418(int1, int3);
						if (local1256 != null && int3 != -1) {
							intStack[isp++] = 1;
							if (local1020) {
								staticActiveComponent1 = local1256;
							} else {
								staticActiveComponent2 = local1256;
							}
							continue;
						}
						intStack[isp++] = 0;
						continue;
					}
					if (opcode == Cs2Opcodes.setChild2) {
						isp--;
						int1 = intStack[isp];
						local1204 = InterfaceList.getComponent(int1);
						if (local1204 == null) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
							if (local1020) {
								staticActiveComponent1 = local1204;
							} else {
								staticActiveComponent2 = local1204;
							}
						}
						continue;
					}
				} else {
					@Pc(12388) boolean local12388;
					if (opcode < 500) {
						if (opcode == Cs2Opcodes.setBaseIdkit) {
							isp -= 2;
							int3 = intStack[isp + 1];
							int1 = intStack[isp];
							for (int2 = 0; int2 < PlayerAppearance.MALE_FEATURES.length; int2++) {
								if (int1 == PlayerAppearance.MALE_FEATURES[int2]) {
									PlayerList.self.appearance.method1953(int2, int3);
									continue nextOp;
								}
							}
							int2 = 0;
							while (true) {
								if (int2 >= PlayerAppearance.FEMALE_FEATURES.length) {
									continue nextOp;
								}
								if (int1 == PlayerAppearance.FEMALE_FEATURES[int2]) {
									PlayerList.self.appearance.method1953(int2, int3);
									continue nextOp;
								}
								int2++;
							}
						}
						if (opcode == Cs2Opcodes.setBaseColor) {
							isp -= 2;
							int1 = intStack[isp];
							int3 = intStack[isp + 1];
							PlayerList.self.appearance.setBaseColor(int1, int3);
							continue;
						}
						if (opcode == Cs2Opcodes.setFemale) {
							isp--;
							local12388 = intStack[isp] != 0;
							PlayerList.self.appearance.setFemale(local12388);
							continue;
						}
					} else {
						@Pc(1552) boolean local1552;
						if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
							@Pc(2522) JagString str1;
							if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
								if (opcode < 2000) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								} else {
									opcode -= 1000;
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
								}
								if (opcode == Cs2Opcodes.setScrollPos) {
									isp -= 2;
									component.scrollX = intStack[isp];
									if (component.scrollX > component.scrollMaxH - component.width) {
										component.scrollX = component.scrollMaxH - component.width;
									}
									if (component.scrollX < 0) {
										component.scrollX = 0;
									}
									component.scrollY = intStack[isp + 1];
									if (component.scrollY > component.scrollMaxV - component.height) {
										component.scrollY = component.scrollMaxV - component.height;
									}
									if (component.scrollY < 0) {
										component.scrollY = 0;
									}
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method2353(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setRGB) {
									isp--;
									component.color = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4224(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setFilled) {
									isp--;
									component.filled = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setTrans) {
									isp--;
									component.alpha = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setLineWid) {
									isp--;
									component.lineWidth = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setSprite) {
									isp--;
									component.spriteId = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.set2DAngle) {
									isp--;
									component.angle2d = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setSpriteTiling) {
									isp--;
									component.spriteTiling = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setModel) {
									component.modelType = 1;
									isp--;
									component.modelId = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.set3DRotation) {
									isp -= 6;
									component.modelXOffset = intStack[isp];
									component.modelZOffset = intStack[isp + 1];
									component.modelXAngle = intStack[isp + 2];
									component.modelYAngle = intStack[isp + 3];
									component.modelYOffset = intStack[isp + 4];
									component.modelZoom = intStack[isp + 5];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentModelAngleClient(component.id);
										DelayedStateChange.setComponentModelOffsetClient(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setAnimation) {
									isp--;
									int3 = intStack[isp];
									if (component.modelSeqId != int3) {
										component.modelSeqId = int3;
										component.anInt510 = 0;
										component.anInt500 = 0;
										component.anInt496 = 1;
										InterfaceList.redraw(component);
									}
									if (component.createdComponentId == -1) {
										DelayedStateChange.method3345(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setModelOrthog) {
									isp--;
									component.modelOrtho = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setText) {
									ssp--;
									str1 = stringStack[ssp];
									if (!str1.strEquals(component.text)) {
										component.text = str1;
										InterfaceList.redraw(component);
									}
									if (component.createdComponentId == -1) {
										DelayedStateChange.method3096(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setFont) {
									isp--;
									component.font = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setTextAlignment) {
									isp -= 3;
									component.anInt460 = intStack[isp];
									component.anInt478 = intStack[isp + 1];
									component.anInt467 = intStack[isp + 2];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setTextAntiMacro) {
									isp--;
									component.textAntiMacro = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setOutlineThickness) {
									isp--;
									component.outlineThickness = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setShadowColor) {
									isp--;
									component.shadowColor = intStack[isp];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setVFlip) {
									isp--;
									component.vFlip = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setHFlip) {
									isp--;
									component.hFlip = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setScrollMax) {
									isp -= 2;
									component.scrollMaxH = intStack[isp];
									component.scrollMaxV = intStack[isp + 1];
									InterfaceList.redraw(component);
									if (component.type == 0) {
										Static17.method531(component, false);
									}
									continue;
								}
								if (opcode == 1121) {
									isp -= 2;
									component.aShort11 = (short) intStack[isp];
									component.aShort10 = (short) intStack[isp + 1];
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.setAlpha) {
									isp--;
									component.hasAlpha = intStack[isp] == 1;
									InterfaceList.redraw(component);
									continue;
								}
								if (opcode == Cs2Opcodes.set3DViewDistance) {
									isp--;
									component.modelZoom = intStack[isp];
									InterfaceList.redraw(component);
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentModelAngleClient(component.id);
									}
									continue;
								}
							} else if (opcode >= 1200 && opcode < 1300 || !(opcode < 2200 || opcode >= 2300)) {
								if (opcode < 2000) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								} else {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									opcode -= 1000;
								}
								InterfaceList.redraw(component);
								if (opcode == Cs2Opcodes.setItem || opcode == Cs2Opcodes.setItemNoNum) {
									isp -= 2;
									int2 = intStack[isp + 1];
									int3 = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.setComponentObjClient(component.id);
										DelayedStateChange.setComponentModelAngleClient(component.id);
										DelayedStateChange.setComponentModelOffsetClient(component.id);
									}
									if (int3 == -1) {
										component.modelId = -1;
										component.modelType = 1;
										component.objId = -1;
									} else {
										component.objId = int3;
										component.objCount = int2;
										@Pc(13416) ObjType local13416 = ObjTypeList.get(int3);
										component.modelYOffset = local13416.zAngle2d;
										component.modelXOffset = local13416.xOffset2d;
										component.modelXAngle = local13416.xAngle2d;
										component.modelZOffset = local13416.yOffset2d;
										component.modelYAngle = local13416.yAngle2d;
										component.modelZoom = local13416.zoom2d;
										if (component.anInt451 > 0) {
											component.modelZoom = component.modelZoom * 32 / component.anInt451;
										} else if (component.baseWidth > 0) {
											component.modelZoom = component.modelZoom * 32 / component.baseWidth;
										}
										if (opcode == Cs2Opcodes.setItemNoNum) {
											component.objDrawText = false;
										} else {
											component.objDrawText = true;
										}
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setNpcHead) {
									component.modelType = 2;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == 1202) {
									component.modelType = 3;
									component.modelId = PlayerList.self.appearance.method1952();
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setPlayerHead) {
									component.modelType = 6;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
								if (opcode == Cs2Opcodes.setPlayerFull) {
									component.modelType = 5;
									isp--;
									component.modelId = intStack[isp];
									if (component.createdComponentId == -1) {
										DelayedStateChange.method4600(component.id);
									}
									continue;
								}
							} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
								if (opcode >= 2000) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									opcode -= 1000;
								} else {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
								}
								if (opcode == Cs2Opcodes.setContextMenuOption) {
									isp--;
									int3 = intStack[isp] - 1;
									if (int3 >= 0 && int3 <= 9) {
										ssp--;
										component.method480(stringStack[ssp], int3);
										continue;
									}
									ssp--;
									continue;
								}
								if (opcode == Cs2Opcodes.setDraggable) {
									isp -= 2;
									int2 = intStack[isp + 1];
									int3 = intStack[isp];
									component.aClass13_5 = InterfaceList.method1418(int3, int2);
									continue;
								}
								if (opcode == Cs2Opcodes.setDragRenderBehaviour) {
									isp--;
									component.dragRenderBehavior = intStack[isp] == 1;
									continue;
								}
								if (opcode == Cs2Opcodes.setDragDeadZone) {
									isp--;
									component.dragDeadzone = intStack[isp];
									continue;
								}
								if (opcode == Cs2Opcodes.setDragDeadTime) {
									isp--;
									component.dragDeadtime = intStack[isp];
									continue;
								}
								if (opcode == Cs2Opcodes.setOptionBase) {
									ssp--;
									component.optionBase = stringStack[ssp];
									continue;
								}
								if (opcode == Cs2Opcodes.setTargetVerb) {
									ssp--;
									component.targetVerb = stringStack[ssp];
									continue;
								}
								if (opcode == Cs2Opcodes.setNoOptions) {
									component.ops = null;
									continue;
								}
								if (opcode == 1308) {
									isp--;
									component.anInt484 = intStack[isp];
									isp--;
									component.anInt499 = intStack[isp];
									continue;
								}
								if (opcode == 1309) {
									isp--;
									int3 = intStack[isp];
									isp--;
									int2 = intStack[isp];
									if (int2 >= 1 && int2 <= 10) {
										component.method477(int2 - 1, int3);
									}
									continue;
								}
							} else {
								@Pc(4859) int c;
								if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
									if (opcode < 2000) {
										component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									} else {
										opcode -= 1000;
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
									}
									@Pc(12937) int[] local12937 = null;
									ssp--;
									str1 = stringStack[ssp];
									if (str1.length() > 0 && str1.charAt(str1.length() - 1) == 89) {
										isp--;
										local652 = intStack[isp];
										if (local652 > 0) {
											local12937 = new int[local652];
											while (local652-- > 0) {
												isp--;
												local12937[local652] = intStack[isp];
											}
										}
										str1 = str1.substring(str1.length() - 1, 0);
									}
									@Pc(13000) Object[] local13000 = new Object[str1.length() + 1];
									for (c = local13000.length - 1; c >= 1; c--) {
										if (str1.charAt(c - 1) == 115) {
											ssp--;
											local13000[c] = stringStack[ssp];
										} else {
											isp--;
											local13000[c] = intStack[isp];
										}
									}
									isp--;
									c = intStack[isp];
									if (c == -1) {
										local13000 = null;
									} else {
										local13000[0] = c;
									}
									component.aBoolean25 = true;
									if (opcode == Cs2Opcodes.hookMousePress) {
										component.onClickRepeat = local13000;
									} else if (opcode == Cs2Opcodes.hookDraggedOver) {
										component.onHold = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseRelease) {
										component.onRelease = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseEnter) {
										component.onMouseOver = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseExit) {
										component.onMouseLeave = local13000;
									} else if (opcode == Cs2Opcodes.hookDragStart) {
										component.onDragStart = local13000;
									} else if (opcode == Cs2Opcodes.hookUseWith) {
										component.onUseWith = local13000;
									} else if (opcode == Cs2Opcodes.hookVARP) {
										component.varpTriggers = local12937;
										component.onVarpTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookFrame) {
										component.onTimer = local13000;
									} else if (opcode == Cs2Opcodes.hookOptionClick) {
										component.onOptionClick = local13000;
									} else if (opcode == Cs2Opcodes.hookDragRelease) {
										component.onDragRelease = local13000;
									} else if (opcode == Cs2Opcodes.hookDrag) {
										component.onDrag = local13000;
									} else if (opcode == Cs2Opcodes.hookMouseHover) {
										component.onMouseRepeat = local13000;
									} else if (opcode == Cs2Opcodes.hookContainer) {
										component.inventoryTriggers = local12937;
										component.onInvTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookSkill) {
										component.statTriggers = local12937;
										component.onStatTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookOnUse) {
										component.onUse = local13000;
									} else if (opcode == Cs2Opcodes.hookScroll) {
										component.onScroll = local13000;
									} else if (opcode == Cs2Opcodes.hookMsg) {
										component.onMsg = local13000;
									} else if (opcode == Cs2Opcodes.hookKey) {
										component.onKey = local13000;
									} else if (opcode == Cs2Opcodes.hookFriendList) {
										component.onFriendTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookClanList) {
										component.onClanTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookMiscData) {
										component.onMiscTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookDialogAbort) {
										component.onDialogAbort = local13000;
									} else if (opcode == Cs2Opcodes.hookWidgetsOpenClose) {
										component.onWidgetsOpenClose = local13000;
									} else if (opcode == Cs2Opcodes.hookGEUpdate) { // if_setonstocktransmit
										component.onStockTransmit = local13000;
									} else if (opcode == Cs2Opcodes.hookMinimapUnlock) {
										component.onMinimapUnlock = local13000;
									} else if (opcode == Cs2Opcodes.hookResize) {
										component.onResize = local13000;
									} else if (opcode == Cs2Opcodes.hookVARC) {
										component.onVarcTransmit = local13000;
										component.varcTriggers = local12937;
									} else if (opcode == Cs2Opcodes.hookSTRING) {
										component.varcstrTriggers = local12937;
										component.onVarcstrTransmit = local13000;
									}
									continue;
								}
								if (opcode < 1600) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getX) {
										intStack[isp++] = component.x;
										continue;
									}
									if (opcode == Cs2Opcodes.getY) {
										intStack[isp++] = component.y;
										continue;
									}
									if (opcode == Cs2Opcodes.getWidth) {
										intStack[isp++] = component.width;
										continue;
									}
									if (opcode == Cs2Opcodes.getHeight) {
										intStack[isp++] = component.height;
										continue;
									}
									if (opcode == Cs2Opcodes.getHidden) {
										intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getLayer) {
										intStack[isp++] = component.layer;
										continue;
									}
								} else if (opcode < 1700) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getScrollX) {
										intStack[isp++] = component.scrollX;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollY) {
										intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == Cs2Opcodes.getText) {
										stringStack[ssp++] = component.text;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxH) {
										intStack[isp++] = component.scrollMaxH;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxV) {
										intStack[isp++] = component.scrollMaxV;
										continue;
									}
									if (opcode == Cs2Opcodes.get3DDistance) {
										intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateX) {
										intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateZ) {
										intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateY) {
										intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getAlpha) {
										intStack[isp++] = component.alpha;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelXOffset) {
										intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelYOffset) {
										intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getSpriteId) {
										intStack[isp++] = component.spriteId;
										continue;
									}
								} else if (opcode < 1800) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getItemId) {
										intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmt) {
										if (component.objId == -1) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getChildId) {
										intStack[isp++] = component.createdComponentId;
										continue;
									}
								} else if (opcode < 1900) {
									component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
									if (opcode == Cs2Opcodes.getTargetMask) {
										intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
										continue;
									}
									if (opcode == Cs2Opcodes.getOption) {
										isp--;
										int3 = intStack[isp];
										int3--;
										if (component.ops != null && int3 < component.ops.length && component.ops[int3] != null) {
											stringStack[ssp++] = component.ops[int3];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.getOptionBase) {
										if (component.optionBase == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = component.optionBase;
										}
										continue;
									}
								} else if (opcode < 2600) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == Cs2Opcodes.getX2) {
										intStack[isp++] = component.x;
										continue;
									}
									if (opcode == Cs2Opcodes.getY2) {
										intStack[isp++] = component.y;
										continue;
									}
									if (opcode == Cs2Opcodes.getWidth2) {
										intStack[isp++] = component.width;
										continue;
									}
									if (opcode == Cs2Opcodes.getHeight2) {
										intStack[isp++] = component.height;
										continue;
									}
									if (opcode == Cs2Opcodes.isHidden2) {
										intStack[isp++] = component.hidden ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getLayer2) {
										intStack[isp++] = component.layer;
										continue;
									}
								} else if (opcode < 2700) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == Cs2Opcodes.getScrollX2) {
										intStack[isp++] = component.scrollX;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollY2) {
										intStack[isp++] = component.scrollY;
										continue;
									}
									if (opcode == Cs2Opcodes.getText2) {
										stringStack[ssp++] = component.text;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxH2) {
										intStack[isp++] = component.scrollMaxH;
										continue;
									}
									if (opcode == Cs2Opcodes.getScrollMaxV2) {
										intStack[isp++] = component.scrollMaxV;
										continue;
									}
									if (opcode == Cs2Opcodes.get3DDistance2) {
										intStack[isp++] = component.modelZoom;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateX2) {
										intStack[isp++] = component.modelXAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateZ2) {
										intStack[isp++] = component.modelYOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getRotateY2) {
										intStack[isp++] = component.modelYAngle;
										continue;
									}
									if (opcode == Cs2Opcodes.getAlpha2) {
										intStack[isp++] = component.alpha;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelXOffset2) {
										intStack[isp++] = component.modelXOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getModelYOffset2) {
										intStack[isp++] = component.modelZOffset;
										continue;
									}
									if (opcode == Cs2Opcodes.getSpriteId2) {
										intStack[isp++] = component.spriteId;
										continue;
									}
								} else if (opcode < 2800) {
									if (opcode == Cs2Opcodes.getItemId2) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										intStack[isp++] = component.objId;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmt2) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										if (component.objId == -1) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = component.objCount;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.hasChild) {
										isp--;
										int1 = intStack[isp];
										@Pc(12566) ComponentPointer local12566 = (ComponentPointer) InterfaceList.openInterfaces.get((long) int1);
										if (local12566 == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = 1;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.nextChild) {
										isp--;
										component = InterfaceList.getComponent(intStack[isp]);
										if (component.createdComponents == null) {
											intStack[isp++] = 0;
											continue;
										}
										int3 = component.createdComponents.length;
										for (int2 = 0; int2 < component.createdComponents.length; int2++) {
											if (component.createdComponents[int2] == null) {
												int3 = int2;
												break;
											}
										}
										intStack[isp++] = int3;
										continue;
									}
									if (opcode == Cs2Opcodes.hasChildModal || opcode == Cs2Opcodes.hasChildOverlay) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										@Pc(12663) ComponentPointer local12663 = (ComponentPointer) InterfaceList.openInterfaces.get((long) int1);
										if (local12663 != null && local12663.anInt5878 == int3) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
								} else if (opcode < 2900) {
									isp--;
									component = InterfaceList.getComponent(intStack[isp]);
									if (opcode == Cs2Opcodes.getTargetMask2) {
										intStack[isp++] = InterfaceList.getServerActiveProperties(component).getTargetMask();
										continue;
									}
									if (opcode == Cs2Opcodes.getOption2) {
										isp--;
										int3 = intStack[isp];
										int3--;
										if (component.ops != null && component.ops.length > int3 && component.ops[int3] != null) {
											stringStack[ssp++] = component.ops[int3];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.getOptionBase2) {
										if (component.optionBase == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = component.optionBase;
										}
										continue;
									}
								} else if (opcode < 3200) {
									if (opcode == Cs2Opcodes.msg) {
										ssp--;
										string = stringStack[ssp];
										Chat.add(EMPTY_STRING, 0, string);
										continue;
									}
									if (opcode == Cs2Opcodes.animateSelf) {
										isp -= 2;
										Player.animate(intStack[isp + 1], intStack[isp], PlayerList.self);
										continue;
									}
									if (opcode == Cs2Opcodes.sendCloseWidgetPacket) {
										ClientProt.closeWidget();
										continue;
									}
									if (opcode == Cs2Opcodes.sendIntegerInput) {
										ssp--;
										string = stringStack[ssp];
										int3 = 0;
										if (string.isInt()) {
											int3 = string.parseInt();
										}
										Protocol.outboundBuffer.p1isaac(23);
										Protocol.outboundBuffer.p4(int3);
										continue;
									}
									if (opcode == Cs2Opcodes.sendNameInput) {
										ssp--;
										string = stringStack[ssp];
										Protocol.outboundBuffer.p1isaac(244);
										Protocol.outboundBuffer.p8(string.encode37());
										continue;
									}
									if (opcode == Cs2Opcodes.sendStringInput) {
										ssp--;
										string = stringStack[ssp];
										Protocol.outboundBuffer.p1isaac(65);
										Protocol.outboundBuffer.p1(string.length() + 1);
										Protocol.outboundBuffer.pjstr(string);
										continue;
									}
									if (opcode == Cs2Opcodes.clickPlayerOption) {
										isp--;
										int1 = intStack[isp];
										ssp--;
										str1 = stringStack[ssp];
										ClientProt.clickPlayerOption(int1, str1);
										continue;
									}
									if (opcode == 3108) {
										isp -= 3;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										int2 = intStack[isp + 2];
										local1063 = InterfaceList.getComponent(int2);
										Static40.method1015(int3, int1, local1063);
										continue;
									}
									if (opcode == 3109) {
										isp -= 2;
										int1 = intStack[isp];
										local1256 = local1020 ? staticActiveComponent1 : staticActiveComponent2;
										int3 = intStack[isp + 1];
										Static40.method1015(int3, int1, local1256);
										continue;
									}
									if (opcode == 3110) {
										isp--;
										int1 = intStack[isp];
										Protocol.outboundBuffer.p1isaac(111);
										Protocol.outboundBuffer.p2(int1);
										continue;
									}
								} else if (opcode < 3300) {
									if (opcode == Cs2Opcodes.playSoundEffect) {
										isp -= 3;
										SoundPlayer.play(intStack[isp + 1], intStack[isp], intStack[isp + 2]);
										continue;
									}
									if (opcode == Cs2Opcodes.playMusic) {
										isp--;
										MusicPlayer.playSong(intStack[isp]);
										continue;
									}
									if (opcode == Cs2Opcodes.playMusicEffect) {
										isp -= 2;
										MusicPlayer.playJingle(intStack[isp + 1], intStack[isp]);
										continue;
									}
								} else if (opcode < 3400) {
									if (opcode == Cs2Opcodes.getClientCycle) {
										intStack[isp++] = client.loop;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemIdInSlot) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemType(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInSlot) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getItemCount(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInContainer) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getSlotTotal(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemContainerLength) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = InvTypeList.get(int1).size;
										continue;
									}
									if (opcode == Cs2Opcodes.getSkillCurrentLvl) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.boostedLevels[int1];
										continue;
									}
									if (opcode == Cs2Opcodes.getSkillActualLvl) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.baseLevels[int1];
										continue;
									}
									if (opcode == Cs2Opcodes.getSkillXp) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = PlayerSkillXpTable.experience[int1];
										continue;
									}
									if (opcode == Cs2Opcodes.getMyLocation) {
										int1 = Player.level;
										int3 = Camera.originX + (PlayerList.self.xFine >> 7);
										int2 = (PlayerList.self.zFine >> 7) + Camera.originZ;
										intStack[isp++] = (int1 << 28) - (-(int3 << 14) - int2);
										continue;
									}
									if (opcode == Cs2Opcodes.x) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 >> 14 & 0x3FFF;
										continue;
									}
									if (opcode == Cs2Opcodes.z) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 >> 28;
										continue;
									}
									if (opcode == Cs2Opcodes.y) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = int1 & 0x3FFF;
										continue;
									}
									if (opcode == Cs2Opcodes.isMember) {
										intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getItemIdInInpsectingSlot) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemType(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInInspectingSlot) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getItemCount(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getItemAmtInInspectingContainer) {
										isp -= 2;
										int1 = intStack[isp] + 32768;
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getSlotTotal(int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getClientRights) {
										if (LoginManager.staffModLevel < 2) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = LoginManager.staffModLevel;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getSystemUpdateTimer) {
										intStack[isp++] = Player.rebootTimer;
										continue;
									}
									if (opcode == Cs2Opcodes.getWorldId) {
										intStack[isp++] = Player.worldId;
										continue;
									}
									if (opcode == Cs2Opcodes.getRunEnergy) {
										intStack[isp++] = Player.runEnergy;
										continue;
									}
									if (opcode == Cs2Opcodes.getPlayerWeight) {
										intStack[isp++] = Player.weight;
										continue;
									}
									if (opcode == Cs2Opcodes.hasMoreThen5Blackmarks) {
										if (LoginManager.blackmarks >= 5 && LoginManager.blackmarks <= 9) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getBlackmarks) {
										if (LoginManager.blackmarks >= 5 && LoginManager.blackmarks <= 9) {
											intStack[isp++] = LoginManager.blackmarks;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isSiteSettingsMembers) {
										intStack[isp++] = LoginManager.playerMember ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getMyCombat) {
										intStack[isp++] = PlayerList.self.combatLevel;
										continue;
									}
									if (opcode == Cs2Opcodes.IsFemale) {
										intStack[isp++] = PlayerList.self.appearance.gender ? 1 : 0;
										continue;
									}
									if (opcode == 3328) {
										intStack[isp++] = LoginManager.playerUnderage && !LoginManager.parentalChatConsent ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.mapQuickchat) {
										intStack[isp++] = LoginManager.mapQuickChat ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getContainerFreeSlots) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = Inv.getFreeSpace(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.getContainerIntAttrCountIgnoreStacks) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = Inv.getTotalParam(false, int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getContainerIntAttrCount) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = Inv.getTotalParam(true, int1, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getLoginTypeRelatedMethod3333) {
										intStack[isp++] = LoginManager.anInt39;
										continue;
									}
									if (opcode == Cs2Opcodes.getLanguage) {
										intStack[isp++] = client.language;
										continue;
									}
									if (opcode == Cs2Opcodes.moveCoord) {
										isp -= 4;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										int1 += int3 << 14;
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										int1 += int2 << 28;
										int1 += local652;
										intStack[isp++] = int1;
										continue;
									}
									if (opcode == Cs2Opcodes.getAffid) {
										intStack[isp++] = client.affiliate;
										continue;
									}
								} else if (opcode < 3500) {
									@Pc(3422) EnumType local3422;
									if (opcode == Cs2Opcodes.datamap) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local3422 = EnumTypeList.get(int1);
										if (local3422.valueType == 115) {
										}
										stringStack[ssp++] = local3422.getString(int3);
										continue;
									}
									if (opcode == Cs2Opcodes.datamap2) {
										isp -= 4;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										@Pc(3469) EnumType local3469 = EnumTypeList.get(int2);
										if (local3469.keyType == int1 && local3469.valueType == int3) {
											if (int3 == 115) {
												stringStack[ssp++] = local3469.getString(local652);
											} else {
												intStack[isp++] = local3469.getInt(local652);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (opcode == Cs2Opcodes.datamapContainsValue) {
										isp -= 3;
										int3 = intStack[isp + 1];
										int2 = intStack[isp + 2];
										int1 = intStack[isp];
										if (int3 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3549) EnumType local3549 = EnumTypeList.get(int3);
										if (local3549.valueType != int1) {
											throw new RuntimeException("C3409-1");
										}
										intStack[isp++] = local3549.containsValue(int2) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.datamapContainsValue2) {
										isp--;
										int1 = intStack[isp];
										ssp--;
										str1 = stringStack[ssp];
										if (int1 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3422 = EnumTypeList.get(int1);
										if (local3422.valueType != 115) {
											throw new RuntimeException("C3410-1");
										}
										intStack[isp++] = local3422.containsValue(str1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.datamapSize) {
										isp--;
										int1 = intStack[isp];
										@Pc(3645) EnumType local3645 = EnumTypeList.get(int1);
										intStack[isp++] = local3645.table.size();
										continue;
									}
								} else if (opcode < 3700) {
									if (opcode == Cs2Opcodes.getFriendCount) {
										if (FriendsList.state == 0) {
											intStack[isp++] = -2;
										} else if (FriendsList.state == 1) {
											intStack[isp++] = -1;
										} else {
											intStack[isp++] = FriendsList.size;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendName) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && int1 < FriendsList.size) {
											stringStack[ssp++] = FriendsList.usernames[int1];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendWorld) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											intStack[isp++] = FriendsList.worlds[int1];
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendRank) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											intStack[isp++] = FriendsList.ranks[int1];
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3604) {
										isp--;
										int3 = intStack[isp];
										ssp--;
										string = stringStack[ssp];
										FriendsList.setRank(string, int3);
										continue;
									}
									if (opcode == 3605) {
										ssp--;
										string = stringStack[ssp];
										FriendsList.add(string.encode37());
										continue;
									}
									if (opcode == 3606) {
										ssp--;
										string = stringStack[ssp];
										FriendsList.remove(string.encode37());
										continue;
									}
									if (opcode == 3607) {
										ssp--;
										string = stringStack[ssp];
										IgnoreList.add(string.encode37());
										continue;
									}
									if (opcode == 3608) {
										ssp--;
										string = stringStack[ssp];
										IgnoreList.remove(string.encode37());
										continue;
									}
									if (opcode == Cs2Opcodes.isFriend) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = FriendsList.contains(string) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getFriendWorldName) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && FriendsList.size > int1) {
											stringStack[ssp++] = FriendsList.worldNames[int1];
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatDisplayName) {
										if (ClanChat.name == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = ClanChat.name.toTitleCase();
										}
										continue;
									}
									if (opcode == Cs2Opcodes.clanGetChatCount) {
										if (ClanChat.name == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = ClanChat.size;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatUsername) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											stringStack[ssp++] = ClanChat.members[int1].username.toTitleCase();
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatUserWorld) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && int1 < ClanChat.size) {
											intStack[isp++] = ClanChat.members[int1].world;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == Cs2Opcodes.clanChatUserRank) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											intStack[isp++] = ClanChat.members[int1].rank;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3616) {
										intStack[isp++] = ClanChat.minKick;
										continue;
									}
									if (opcode == 3617) {
										ssp--;
										string = stringStack[ssp];
										ClanChat.kick(string);
										continue;
									}
									if (opcode == 3618) {
										intStack[isp++] = ClanChat.rank;
										continue;
									}
									if (opcode == 3619) {
										ssp--;
										string = stringStack[ssp];
										ClanChat.join(string.encode37());
										continue;
									}
									if (opcode == 3620) {
										ClanChat.leave();
										continue;
									}
									if (opcode == Cs2Opcodes.getIgnoreCount) {
										if (FriendsList.state == 0) {
											intStack[isp++] = -1;
										} else {
											intStack[isp++] = IgnoreList.size;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.getIgnoreName) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state != 0 && IgnoreList.size > int1) {
											stringStack[ssp++] = Base37.decode37(IgnoreList.encodedUsernames[int1]).toTitleCase();
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3623) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = IgnoreList.contains(string) ? 1 : 0;
										continue;
									}
									if (opcode == 3624) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.members != null && ClanChat.size > int1 && ClanChat.members[int1].username.equalsIgnoreCase(PlayerList.self.username)) {
											intStack[isp++] = 1;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3625) {
										if (ClanChat.owner == null) {
											stringStack[ssp++] = EMPTY_STRING;
										} else {
											stringStack[ssp++] = ClanChat.owner.toTitleCase();
										}
										continue;
									}
									if (opcode == 3626) {
										isp--;
										int1 = intStack[isp];
										if (ClanChat.name != null && ClanChat.size > int1) {
											stringStack[ssp++] = ClanChat.members[int1].worldName;
											continue;
										}
										stringStack[ssp++] = EMPTY_STRING;
										continue;
									}
									if (opcode == 3627) {
										isp--;
										int1 = intStack[isp];
										if (FriendsList.state == 2 && int1 >= 0 && int1 < FriendsList.size) {
											intStack[isp++] = FriendsList.aBooleanArray135[int1] ? 1 : 0;
											continue;
										}
										intStack[isp++] = 0;
										continue;
									}
									if (opcode == 3628) {
										ssp--;
										string = stringStack[ssp];
										if (string.startsWith(aClass100_446) || string.startsWith(aClass100_537)) {
											string = string.substring(7);
										}
										intStack[isp++] = FriendsList.method25(string);
										continue;
									}
									if (opcode == 3629) {
										intStack[isp++] = client.country;
										continue;
									}
								} else if (opcode < 4000) {
									if (opcode == Cs2Opcodes.getGEIsSelling) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].getType();
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItem) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].item;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItemPrice) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].price;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItemAmt) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].count;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEItemAmtTransfered) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].completedCount;
										continue;
									}
									if (opcode == Cs2Opcodes.getGECashTransfered) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StockMarketManager.offers[int1].completedGold;
										continue;
									}
									if (opcode == Cs2Opcodes.getGENotStarted) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 0 ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEIsStatus2) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 2 ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEIsDone) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 5 ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.getGEIsStatus1) {
										isp--;
										int1 = intStack[isp];
										int3 = StockMarketManager.offers[int1].getStatus();
										intStack[isp++] = int3 == 1 ? 1 : 0;
										continue;
									}
								} else if (opcode < 4100) {
									if (opcode == Cs2Opcodes.add) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int3 + int1;
										continue;
									}
									if (opcode == Cs2Opcodes.subtract) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 - int3;
										continue;
									}
									if (opcode == Cs2Opcodes.multiply) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int3 * int1;
										continue;
									}
									if (opcode == Cs2Opcodes.divide) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 / int3;
										continue;
									}
									if (opcode == Cs2Opcodes.rndExcl) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = (int) ((double) int1 * Math.random());
										continue;
									}
									if (opcode == Cs2Opcodes.rnd) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = (int) (Math.random() * (double) (int1 + 1));
										continue;
									}
									if (opcode == 4006) {
										isp -= 5;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										local652 = intStack[isp + 3];
										int2 = intStack[isp + 2];
										c = intStack[isp + 4];
										intStack[isp++] = (int3 - int1) * (c + -int2) / (local652 - int2) + int1;
										continue;
									}
									@Pc(4899) long local4899;
									@Pc(4892) long local4892;
									if (opcode == Cs2Opcodes.addPercent) {
										isp -= 2;
										local4892 = intStack[isp];
										local4899 = intStack[isp + 1];
										intStack[isp++] = (int) (local4892 * local4899 / 100L + local4892);
										continue;
									}
									if (opcode == Cs2Opcodes.flagBit) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 | 0x1 << int3;
										continue;
									}
									if (opcode == Cs2Opcodes.unflagBit) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = -(0x1 << int3) - 1 & int1;
										continue;
									}
									if (opcode == Cs2Opcodes.isBitFlagged) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = (int1 & 0x1 << int3) == 0 ? 0 : 1;
										continue;
									}
									if (opcode == Cs2Opcodes.mod) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int1 % int3;
										continue;
									}
									if (opcode == Cs2Opcodes.pow) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										if (int1 == 0) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = (int) Math.pow(int1, int3);
										}
										continue;
									}
									if (opcode == Cs2Opcodes.root) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										if (int1 == 0) {
											intStack[isp++] = 0;
										} else if (int3 == 0) {
											intStack[isp++] = Integer.MAX_VALUE;
										} else {
											intStack[isp++] = (int) Math.pow(int1, 1.0D / (double) int3);
										}
										continue;
									}
									if (opcode == Cs2Opcodes.bitAnd) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int3 & int1;
										continue;
									}
									if (opcode == Cs2Opcodes.bitOr) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 | int3;
										continue;
									}
									if (opcode == Cs2Opcodes.min) {
										isp -= 2;
										int1 = intStack[isp];
										int3 = intStack[isp + 1];
										intStack[isp++] = int1 < int3 ? int1 : int3;
										continue;
									}
									if (opcode == Cs2Opcodes.max) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										intStack[isp++] = int3 >= int1 ? int3 : int1;
										continue;
									}
									if (opcode == Cs2Opcodes.multiplyDivide) {
										isp -= 3;
										local4892 = intStack[isp];
										local4899 = intStack[isp + 1];
										@Pc(5251) long local5251 = (long) intStack[isp + 2];
										intStack[isp++] = (int) (local4892 * local5251 / local4899);
										continue;
									}
								} else if (opcode >= 4200) {
									@Pc(5294) ParamType local5294;
									if (opcode < 4300) {
										if (opcode == Cs2Opcodes.getItemName) {
											isp--;
											int1 = intStack[isp];
											stringStack[ssp++] = ObjTypeList.get(int1).name;
											continue;
										}
										@Pc(11269) ObjType local11269;
										if (opcode == Cs2Opcodes.getItemGroundOption) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local11269 = ObjTypeList.get(int1);
											if (int3 >= 1 && int3 <= 5 && local11269.ops[int3 - 1] != null) {
												stringStack[ssp++] = local11269.ops[int3 - 1];
												continue;
											}
											stringStack[ssp++] = EMPTY_STRING;
											continue;
										}
										if (opcode == Cs2Opcodes.getItemOption) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local11269 = ObjTypeList.get(int1);
											if (int3 >= 1 && int3 <= 5 && local11269.inventoryOps[int3 - 1] != null) {
												stringStack[ssp++] = local11269.inventoryOps[int3 - 1];
												continue;
											}
											stringStack[ssp++] = EMPTY_STRING;
											continue;
										}
										if (opcode == Cs2Opcodes.getItemValue) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).cost;
											continue;
										}
										if (opcode == Cs2Opcodes.itemIsStackable) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).stackable == 1 ? 1 : 0;
											continue;
										}
										@Pc(11417) ObjType local11417;
										if (opcode == Cs2Opcodes.getNotedItem) {
											isp--;
											int1 = intStack[isp];
											local11417 = ObjTypeList.get(int1);
											if (local11417.certificateTemplate == -1 && local11417.certificateLink >= 0) {
												intStack[isp++] = local11417.certificateLink;
												continue;
											}
											intStack[isp++] = int1;
											continue;
										}
										if (opcode == Cs2Opcodes.getRealItem) {
											isp--;
											int1 = intStack[isp];
											local11417 = ObjTypeList.get(int1);
											if (local11417.certificateTemplate >= 0 && local11417.certificateLink >= 0) {
												intStack[isp++] = local11417.certificateLink;
												continue;
											}
											intStack[isp++] = int1;
											continue;
										}
										if (opcode == Cs2Opcodes.itemIsMembers) {
											isp--;
											int1 = intStack[isp];
											intStack[isp++] = ObjTypeList.get(int1).members ? 1 : 0;
											continue;
										}
										if (opcode == Cs2Opcodes.itemAttribute) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = ObjTypeList.get(int1).getParam(local5294.defaultString, int3);
											} else {
												intStack[isp++] = ObjTypeList.get(int1).getParam(local5294.defaultInt, int3);
											}
											continue;
										}
										if (opcode == Cs2Opcodes.searchItem) {
											ssp--;
											string = stringStack[ssp];
											isp--;
											int3 = intStack[isp];
											Find.search(int3 == 1, string);
											intStack[isp++] = Find.index;
											continue;
										}
										if (opcode == Cs2Opcodes.nextSearchResult) {
											if (Find.results != null && Find.size < Find.index) {
												intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
												continue;
											}
											intStack[isp++] = -1;
											continue;
										}
										if (opcode == 4212) {
											Find.size = 0;
											continue;
										}
									} else if (opcode < 4400) {
										if (opcode == Cs2Opcodes.getNpcAttribute) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = NpcTypeList.get(int1).getParam(int3, local5294.defaultString);
											} else {
												intStack[isp++] = NpcTypeList.get(int1).getParam(int3, local5294.defaultInt);
											}
											continue;
										}
									} else if (opcode >= 4500) {
										if (opcode >= 4600) {
											if (opcode < 5100) {
												if (opcode == Cs2Opcodes.getPublicChatSetting) {
													intStack[isp++] = Chat.publicFilter;
													continue;
												}
												if (opcode == Cs2Opcodes.setChatSettings) {
													isp -= 3;
													Chat.publicFilter = intStack[isp];
													Chat.privateFilter = intStack[isp + 1];
													Chat.tradeFilter = intStack[isp + 2];
													Protocol.outboundBuffer.p1isaac(157);
													Protocol.outboundBuffer.p1(Chat.publicFilter);
													Protocol.outboundBuffer.p1(Chat.privateFilter);
													Protocol.outboundBuffer.p1(Chat.tradeFilter);
													continue;
												}
												if (opcode == 5002) {
													ssp--;
													string = stringStack[ssp];
													isp -= 2;
													int3 = intStack[isp];
													int2 = intStack[isp + 1];
													Protocol.outboundBuffer.p1isaac(99);
													Protocol.outboundBuffer.p8(string.encode37());
													Protocol.outboundBuffer.p1(int3 - 1);
													Protocol.outboundBuffer.p1(int2);
													continue;
												}
												if (opcode == 5003) {
													str1 = null;
													isp--;
													int1 = intStack[isp];
													if (int1 < 100) {
														str1 = Chat.messages[int1];
													}
													if (str1 == null) {
														str1 = EMPTY_STRING;
													}
													stringStack[ssp++] = str1;
													continue;
												}
												if (opcode == 5004) {
													isp--;
													int1 = intStack[isp];
													int3 = -1;
													if (int1 < 100 && Chat.messages[int1] != null) {
														int3 = Chat.types[int1];
													}
													intStack[isp++] = int3;
													continue;
												}
												if (opcode == Cs2Opcodes.getPrivateChatSetting) {
													intStack[isp++] = Chat.privateFilter;
													continue;
												}
												if (opcode == 5008) {
													ssp--;
													string = stringStack[ssp];
													if (!string.startsWith(aClass100_74)) {
														if (LoginManager.staffModLevel == 0 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
															continue;
														}
														str1 = string.toLowerCase();
														@Pc(5555) byte local5555 = 0;
														if (str1.startsWith(LocalizedText.STABLE_CHATCOL0)) {
															local5555 = 0;
															string = string.substring(LocalizedText.STABLE_CHATCOL0.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL1)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL1.length());
															local5555 = 1;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL2)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL2.length());
															local5555 = 2;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL3)) {
															local5555 = 3;
															string = string.substring(LocalizedText.STABLE_CHATCOL3.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL4)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL4.length());
															local5555 = 4;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL5)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL5.length());
															local5555 = 5;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL6)) {
															local5555 = 6;
															string = string.substring(LocalizedText.STABLE_CHATCOL6.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL7)) {
															local5555 = 7;
															string = string.substring(LocalizedText.STABLE_CHATCOL7.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL8)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL8.length());
															local5555 = 8;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL9)) {
															local5555 = 9;
															string = string.substring(LocalizedText.STABLE_CHATCOL9.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL10)) {
															local5555 = 10;
															string = string.substring(LocalizedText.STABLE_CHATCOL10.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATCOL11)) {
															string = string.substring(LocalizedText.STABLE_CHATCOL11.length());
															local5555 = 11;
														} else if (client.language != 0) {
															if (str1.startsWith(LocalizedText.CHATCOL0)) {
																local5555 = 0;
																string = string.substring(LocalizedText.CHATCOL0.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL1)) {
																string = string.substring(LocalizedText.CHATCOL1.length());
																local5555 = 1;
															} else if (str1.startsWith(LocalizedText.CHATCOL2)) {
																string = string.substring(LocalizedText.CHATCOL2.length());
																local5555 = 2;
															} else if (str1.startsWith(LocalizedText.CHATCOL3)) {
																string = string.substring(LocalizedText.CHATCOL3.length());
																local5555 = 3;
															} else if (str1.startsWith(LocalizedText.CHATCOL4)) {
																string = string.substring(LocalizedText.CHATCOL4.length());
																local5555 = 4;
															} else if (str1.startsWith(LocalizedText.CHATCOL5)) {
																local5555 = 5;
																string = string.substring(LocalizedText.CHATCOL5.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL6)) {
																string = string.substring(LocalizedText.CHATCOL6.length());
																local5555 = 6;
															} else if (str1.startsWith(LocalizedText.CHATCOL7)) {
																local5555 = 7;
																string = string.substring(LocalizedText.CHATCOL7.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL8)) {
																local5555 = 8;
																string = string.substring(LocalizedText.CHATCOL8.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL9)) {
																local5555 = 9;
																string = string.substring(LocalizedText.CHATCOL9.length());
															} else if (str1.startsWith(LocalizedText.CHATCOL10)) {
																string = string.substring(LocalizedText.CHATCOL10.length());
																local5555 = 10;
															} else if (str1.startsWith(LocalizedText.CHATCOL11)) {
																string = string.substring(LocalizedText.CHATCOL11.length());
																local5555 = 11;
															}
														}
														@Pc(5943) byte local5943 = 0;
														str1 = string.toLowerCase();
														if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT1)) {
															string = string.substring(LocalizedText.STABLE_CHATEFFECT1.length());
															local5943 = 1;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT2)) {
															local5943 = 2;
															string = string.substring(LocalizedText.STABLE_CHATEFFECT2.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT3)) {
															string = string.substring(LocalizedText.STABLE_CHATEFFECT3.length());
															local5943 = 3;
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECT4)) {
															local5943 = 4;
															string = string.substring(LocalizedText.STABLE_CHATEFFECT4.length());
														} else if (str1.startsWith(LocalizedText.STABLE_CHATEFFECTC5)) {
															local5943 = 5;
															string = string.substring(LocalizedText.STABLE_CHATEFFECTC5.length());
														} else if (client.language != 0) {
															if (str1.startsWith(LocalizedText.CHATEFFECT1)) {
																string = string.substring(LocalizedText.CHATEFFECT1.length());
																local5943 = 1;
															} else if (str1.startsWith(LocalizedText.CHATEFFECT2)) {
																local5943 = 2;
																string = string.substring(LocalizedText.CHATEFFECT2.length());
															} else if (str1.startsWith(LocalizedText.CHATEFFECT3)) {
																local5943 = 3;
																string = string.substring(LocalizedText.CHATEFFECT3.length());
															} else if (str1.startsWith(LocalizedText.CHATEFFECT4)) {
																local5943 = 4;
																string = string.substring(LocalizedText.CHATEFFECT4.length());
															} else if (str1.startsWith(LocalizedText.CHATEFFECT5)) {
																string = string.substring(LocalizedText.CHATEFFECT5.length());
																local5943 = 5;
															}
														}
														Protocol.outboundBuffer.p1isaac(237);
														Protocol.outboundBuffer.p1(0);
														c = Protocol.outboundBuffer.offset;
														Protocol.outboundBuffer.p1(local5555);
														Protocol.outboundBuffer.p1(local5943);
														WordPack.encode(Protocol.outboundBuffer, string);
														Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - c);
														continue;
													}
													Cheat.execute(string);
													continue;
												}
												if (opcode == 5009) {
													ssp -= 2;
													str1 = stringStack[ssp + 1];
													string = stringStack[ssp];
													if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
														Protocol.outboundBuffer.p1isaac(201);
														Protocol.outboundBuffer.p1(0);
														int2 = Protocol.outboundBuffer.offset;
														Protocol.outboundBuffer.p8(string.encode37());
														WordPack.encode(Protocol.outboundBuffer, str1);
														Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int2);
													}
													continue;
												}
												if (opcode == 5010) {
													isp--;
													int1 = intStack[isp];
													str1 = null;
													if (int1 < 100) {
														str1 = Chat.names[int1];
													}
													if (str1 == null) {
														str1 = EMPTY_STRING;
													}
													stringStack[ssp++] = str1;
													continue;
												}
												if (opcode == 5011) {
													isp--;
													int1 = intStack[isp];
													str1 = null;
													if (int1 < 100) {
														str1 = Chat.clans[int1];
													}
													if (str1 == null) {
														str1 = EMPTY_STRING;
													}
													stringStack[ssp++] = str1;
													continue;
												}
												if (opcode == 5012) {
													isp--;
													int1 = intStack[isp];
													int3 = -1;
													if (int1 < 100) {
														int3 = Chat.phraseIds[int1];
													}
													intStack[isp++] = int3;
													continue;
												}
												if (opcode == 5015) {
													if (PlayerList.self == null || PlayerList.self.username == null) {
														string = Player.usernameInput;
													} else {
														string = PlayerList.self.getName();
													}
													stringStack[ssp++] = string;
													continue;
												}
												if (opcode == Cs2Opcodes.getTradeSetting) {
													intStack[isp++] = Chat.tradeFilter;
													continue;
												}
												if (opcode == 5017) {
													intStack[isp++] = Chat.size;
													continue;
												}
												if (opcode == 5050) {
													isp--;
													int1 = intStack[isp];
													stringStack[ssp++] = QuickChatCatTypeList.get(int1).description;
													continue;
												}
												@Pc(6378) QuickChatCatType local6378;
												if (opcode == 5051) {
													isp--;
													int1 = intStack[isp];
													local6378 = QuickChatCatTypeList.get(int1);
													if (local6378.subcategories == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6378.subcategories.length;
													}
													continue;
												}
												if (opcode == 5052) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													@Pc(6416) QuickChatCatType local6416 = QuickChatCatTypeList.get(int1);
													local652 = local6416.subcategories[int3];
													intStack[isp++] = local652;
													continue;
												}
												if (opcode == 5053) {
													isp--;
													int1 = intStack[isp];
													local6378 = QuickChatCatTypeList.get(int1);
													if (local6378.phrases == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6378.phrases.length;
													}
													continue;
												}
												if (opcode == 5054) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).phrases[int3];
													continue;
												}
												if (opcode == 5055) {
													isp--;
													int1 = intStack[isp];
													stringStack[ssp++] = QuickChatPhraseTypeList.get(int1).getText();
													continue;
												}
												if (opcode == 5056) {
													isp--;
													int1 = intStack[isp];
													@Pc(6527) QuickChatPhraseType local6527 = QuickChatPhraseTypeList.get(int1);
													if (local6527.automaticResponses == null) {
														intStack[isp++] = 0;
													} else {
														intStack[isp++] = local6527.automaticResponses.length;
													}
													continue;
												}
												if (opcode == 5057) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatPhraseTypeList.get(int1).automaticResponses[int3];
													continue;
												}
												if (opcode == 5058) {
													activePhrase = new QuickChatPhrase();
													isp--;
													activePhrase.id = intStack[isp];
													activePhrase.type = QuickChatPhraseTypeList.get(activePhrase.id);
													activePhrase.values = new int[activePhrase.type.getDynamicCommandCount()];
													continue;
												}
												if (opcode == 5059) {
													Protocol.outboundBuffer.p1isaac(167);
													Protocol.outboundBuffer.p1(0);
													int1 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p1(0);
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int1);
													continue;
												}
												if (opcode == 5060) {
													ssp--;
													string = stringStack[ssp];
													Protocol.outboundBuffer.p1isaac(178);
													Protocol.outboundBuffer.p1(0);
													int3 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p8(string.encode37());
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int3);
													continue;
												}
												if (opcode == 5061) {
													Protocol.outboundBuffer.p1isaac(167);
													Protocol.outboundBuffer.p1(0);
													int1 = Protocol.outboundBuffer.offset;
													Protocol.outboundBuffer.p1(1);
													Protocol.outboundBuffer.p2(activePhrase.id);
													activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
													Protocol.outboundBuffer.p1len(Protocol.outboundBuffer.offset - int1);
													continue;
												}
												if (opcode == 5062) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).subcategoryShortcuts[int3];
													continue;
												}
												if (opcode == 5063) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													intStack[isp++] = QuickChatCatTypeList.get(int1).phraseShortcuts[int3];
													continue;
												}
												if (opcode == 5064) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													if (int3 == -1) {
														intStack[isp++] = -1;
													} else {
														intStack[isp++] = QuickChatCatTypeList.get(int1).getSubcategoryByShortcut(int3);
													}
													continue;
												}
												if (opcode == 5065) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													if (int3 == -1) {
														intStack[isp++] = -1;
													} else {
														intStack[isp++] = QuickChatCatTypeList.get(int1).getPhraseByShortcut(int3);
													}
													continue;
												}
												if (opcode == 5066) {
													isp--;
													int1 = intStack[isp];
													intStack[isp++] = QuickChatPhraseTypeList.get(int1).getDynamicCommandCount();
													continue;
												}
												if (opcode == 5067) {
													isp -= 2;
													int3 = intStack[isp + 1];
													int1 = intStack[isp];
													int2 = QuickChatPhraseTypeList.get(int1).getDynamicCommand(int3);
													intStack[isp++] = int2;
													continue;
												}
												if (opcode == 5068) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													activePhrase.values[int1] = int3;
													continue;
												}
												if (opcode == 5069) {
													isp -= 2;
													int1 = intStack[isp];
													int3 = intStack[isp + 1];
													activePhrase.values[int1] = int3;
													continue;
												}
												if (opcode == 5070) {
													isp -= 3;
													int1 = intStack[isp];
													int2 = intStack[isp + 2];
													int3 = intStack[isp + 1];
													@Pc(6996) QuickChatPhraseType type = QuickChatPhraseTypeList.get(int1);
													if (type.getDynamicCommand(int3) != 0) {
														throw new RuntimeException("bad command");
													}
													intStack[isp++] = type.getDynamicCommandParam(int2, int3);
													continue;
												}
												if (opcode == 5071) {
													ssp--;
													string = stringStack[ssp];
													isp--;
													local1552 = intStack[isp] == 1;
													Find.findQuickChatPhrases(local1552, string);
													intStack[isp++] = Find.index;
													continue;
												}
												if (opcode == 5072) {
													if (Find.results != null && Find.size < Find.index) {
														intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
														continue;
													}
													intStack[isp++] = -1;
													continue;
												}
												if (opcode == 5073) {
													Find.size = 0;
													continue;
												}
											} else if (opcode < 5200) {
												if (opcode == Cs2Opcodes.isHoldingAlt) {
													if (Keyboard.pressedKeys[Keyboard.KEY_ALT]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == Cs2Opcodes.isHoldingCtrl) {
													if (Keyboard.pressedKeys[Keyboard.KEY_CTRL]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
												if (opcode == Cs2Opcodes.isHoldingShift) {
													if (Keyboard.pressedKeys[Keyboard.KEY_SHIFT]) {
														intStack[isp++] = 1;
													} else {
														intStack[isp++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7566) boolean local7566;
												if (opcode < 5300) {
													if (opcode == Cs2Opcodes.setWorldmapZoom) {
														isp--;
														WorldMap.setTargetZoom(intStack[isp]);
														continue;
													}
													if (opcode == Cs2Opcodes.getWorldmapZoom) {
														intStack[isp++] = WorldMap.getTargetZoom();
														continue;
													}
													if (opcode == 5202) {
														isp--;
														WorldMap.method4444(intStack[isp]);
														continue;
													}
													if (opcode == 5203) {
														ssp--;
														WorldMap.method4656(stringStack[ssp]);
														continue;
													}
													if (opcode == 5204) {
														stringStack[ssp - 1] = WorldMap.method923(stringStack[ssp - 1]);
														continue;
													}
													if (opcode == Cs2Opcodes.loadDungeonmap) {
														ssp--;
														WorldMap.method1853(stringStack[ssp]);
														continue;
													}
													if (opcode == Cs2Opcodes.getDungeonmap) {
														isp--;
														int1 = intStack[isp];
														@Pc(7264) Map local7264 = MapList.getContainingSource(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														if (local7264 == null) {
															stringStack[ssp++] = EMPTY_STRING;
														} else {
															stringStack[ssp++] = local7264.group;
														}
														continue;
													}
													@Pc(7293) Map local7293;
													if (opcode == Cs2Opcodes.getDungeonMapName) {
														ssp--;
														local7293 = MapList.get(stringStack[ssp]);
														if (local7293 != null && local7293.aClass100_137 != null) {
															stringStack[ssp++] = local7293.aClass100_137;
															continue;
														}
														stringStack[ssp++] = EMPTY_STRING;
														continue;
													}
													if (opcode == 5208) {
														intStack[isp++] = WorldMap.anInt2387;
														intStack[isp++] = WorldMap.anInt1176;
														continue;
													}
													if (opcode == 5209) {
														intStack[isp++] = WorldMap.originX + WorldMap.anInt435;
														intStack[isp++] = WorldMap.originZ + WorldMap.length - WorldMap.anInt919 - 1;
														continue;
													}
													if (opcode == Cs2Opcodes.getDungeonmapCenter) {
														local7293 = WorldMap.method4361();
														if (local7293 == null) {
															intStack[isp++] = 0;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local7293.anInt769 * 64;
															intStack[isp++] = local7293.anInt764 * 64;
														}
														continue;
													}
													if (opcode == 5211) {
														local7293 = WorldMap.method4361();
														if (local7293 == null) {
															intStack[isp++] = 0;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local7293.anInt770 - local7293.anInt763;
															intStack[isp++] = local7293.anInt758 - local7293.anInt771;
														}
														continue;
													}
													if (opcode == 5212) {
														int1 = WorldMap.method2352();
														int2 = 0;
														if (int1 == -1) {
															str1 = EMPTY_STRING;
														} else {
															str1 = WorldMap.labels.aClass100Array153[int1];
															int2 = WorldMap.labels.method3894(int1);
														}
														str1 = str1.method3140(Static67.aClass100_639, Static5.aClass100_10);
														stringStack[ssp++] = str1;
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == 5213) {
														int2 = 0;
														int1 = WorldMap.method2385();
														if (int1 == -1) {
															str1 = EMPTY_STRING;
														} else {
															str1 = WorldMap.labels.aClass100Array153[int1];
															int2 = WorldMap.labels.method3894(int1);
														}
														str1 = str1.method3140(Static67.aClass100_639, Static5.aClass100_10);
														stringStack[ssp++] = str1;
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == Cs2Opcodes.setPositionInMap) {
														isp--;
														int1 = intStack[isp];
														WorldMap.method3616(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														continue;
													}
													if (opcode == Cs2Opcodes.dungeonmapContains) {
														isp--;
														int1 = intStack[isp];
														ssp--;
														str1 = stringStack[ssp];
														local7566 = false;
														@Pc(7577) SecondaryLinkedList local7577 = Static183.method3333(int1 >> 14 & 0x3FFF, int1 & 0x3FFF);
														for (@Pc(7582) Map local7582 = (Map) local7577.method795(); local7582 != null; local7582 = (Map) local7577.method797()) {
															if (local7582.group.equalsIgnoreCase(str1)) {
																local7566 = true;
																break;
															}
														}
														if (local7566) {
															intStack[isp++] = 1;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 5216) {
														isp--;
														int1 = intStack[isp];
														MapList.method4332(int1);
														continue;
													}
													if (opcode == 5217) {
														isp--;
														int1 = intStack[isp];
														if (MapList.method1855(int1)) {
															intStack[isp++] = 1;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getMapDefaultZoom) {
														local7293 = WorldMap.method4361();
														if (local7293 == null) {
															intStack[isp++] = -1;
														} else {
															intStack[isp++] = local7293.defaultZoom;
														}
														continue;
													}
													if (opcode == 5219) {
														ssp--;
														WorldMap.method1149(stringStack[ssp]);
														continue;
													}
													if (opcode == 5220) {
														intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
														continue;
													}
												} else if (opcode < 5400) {
													if (opcode == 5300) {
														isp -= 2;
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														DisplayMode.setWindowMode(false, 3, int1, int3);
														intStack[isp++] = GameShell.fullScreenFrame == null ? 0 : 1;
														continue;
													}
													if (opcode == 5301) {
														if (GameShell.fullScreenFrame != null) {
															DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														continue;
													}
													if (opcode == 5302) {
														@Pc(7780) DisplayMode[] local7780 = DisplayMode.getDisplayModes();
														intStack[isp++] = local7780.length;
														continue;
													}
													if (opcode == 5303) {
														isp--;
														int1 = intStack[isp];
														@Pc(7800) DisplayMode[] local7800 = DisplayMode.getDisplayModes();
														intStack[isp++] = local7800[int1].width;
														intStack[isp++] = local7800[int1].height;
														continue;
													}
													if (opcode == 5305) {
														int3 = Preferences.fullScreenHeight;
														int1 = Preferences.fullScreenWidth;
														int2 = -1;
														@Pc(7833) DisplayMode[] local7833 = DisplayMode.getDisplayModes();
														for (c = 0; c < local7833.length; c++) {
															@Pc(7843) DisplayMode local7843 = local7833[c];
															if (int1 == local7843.width && local7843.height == int3) {
																int2 = c;
																break;
															}
														}
														intStack[isp++] = int2;
														continue;
													}
													if (opcode == Cs2Opcodes.getDisplayMode) {
														intStack[isp++] = DisplayMode.getWindowMode();
														continue;
													}
													if (opcode == 5307) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														DisplayMode.setWindowMode(false, int1, -1, -1);
														continue;
													}
													if (opcode == 5308) {
														intStack[isp++] = Preferences.favoriteWorlds;
														continue;
													}
													if (opcode == 5309) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.favoriteWorlds = int1;
														Preferences.write(GameShell.signLink);
														continue;
													}
												} else if (opcode < 5500) {
													if (opcode == 5400) {
														ssp -= 2;
														string = stringStack[ssp];
														str1 = stringStack[ssp + 1];
														isp--;
														int2 = intStack[isp];
														Protocol.outboundBuffer.p1isaac(117);
														Protocol.outboundBuffer.p1(Buffer.getStringLength(string) + Buffer.getStringLength(str1) + 1);
														Protocol.outboundBuffer.pjstr(string);
														Protocol.outboundBuffer.pjstr(str1);
														Protocol.outboundBuffer.p1(int2);
														continue;
													}
													if (opcode == 5401) {
														isp -= 2;
														client.aShortArray88[intStack[isp]] = (short) ColorUtils.rgbToHsl(intStack[isp + 1]);
														ObjTypeList.clearModels();
														ObjTypeList.clearSprites();
														NpcTypeList.clearModels();
														NpcTypeList.clearHeadModels();
														Static87.method1807();
														continue;
													}
													if (opcode == 5405) {
														isp -= 2;
														int1 = intStack[isp];
														int3 = intStack[isp + 1];
														if (int1 >= 0 && int1 < 2) {
															Camera.anIntArrayArrayArray9[int1] = new int[int3 << 1][4];
														}
														continue;
													}
													if (opcode == 5406) {
														isp -= 7;
														int1 = intStack[isp];
														int3 = intStack[isp + 1] << 1;
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														c = intStack[isp + 4];
														@Pc(8108) int local8108 = intStack[isp + 6];
														local1087 = intStack[isp + 5];
														if (int1 >= 0 && int1 < 2 && Camera.anIntArrayArrayArray9[int1] != null && int3 >= 0 && Camera.anIntArrayArrayArray9[int1].length > int3) {
															Camera.anIntArrayArrayArray9[int1][int3] = new int[] { (int2 >> 14 & 0x3FFF) * 128, local652, (int2 & 0x3FFF) * 128, local8108 };
															Camera.anIntArrayArrayArray9[int1][int3 + 1] = new int[] { (c >> 14 & 0x3FFF) * 128, local1087, (c & 0x3FFF) * 128 };
														}
														continue;
													}
													if (opcode == 5407) {
														isp--;
														int1 = Camera.anIntArrayArrayArray9[intStack[isp]].length >> 1;
														intStack[isp++] = int1;
														continue;
													}
													if (opcode == 5411) {
														if (GameShell.fullScreenFrame != null) {
															DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														if (GameShell.frame == null) {
															Static169.openUrl(Static15.method479(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getLastIp5419) {
														string = EMPTY_STRING;
														if (Player.lastLogAddress != null) {
															string = JagString.formatIp(Player.lastLogAddress.intArg2);
															if (Player.lastLogAddress.result != null) {
																@Pc(8281) byte[] local8281 = ((String) Player.lastLogAddress.result).getBytes(StandardCharsets.ISO_8859_1);
																string = JagString.decodeString(local8281, local8281.length, 0);
															}
														}
														stringStack[ssp++] = string;
														continue;
													}
													if (opcode == 5420) {
														intStack[isp++] = SignLink.anInt5928 == 3 ? 1 : 0;
														continue;
													}
													if (opcode == 5421) {
														if (GameShell.fullScreenFrame != null) {
															DisplayMode.setWindowMode(false, Preferences.favoriteWorlds, -1, -1);
														}
														isp--;
														local1552 = intStack[isp] == 1;
														ssp--;
														string = stringStack[ssp];
														@Pc(8356) JagString local8356 = JagString.concatenate(new JagString[] { Static15.method479(), string });
														if (GameShell.frame != null || local1552 && SignLink.anInt5928 != 3 && SignLink.osName.startsWith("win") && !client.haveIe6) {
															Static164.newTab = local1552;
															Static175.url = local8356;
															Static33.openUrlRequest = GameShell.signLink.openUrl(new String(local8356.method3148(), StandardCharsets.ISO_8859_1));
															continue;
														}
														Static169.openUrl(local8356, local1552);
														continue;
													}
													if (opcode == 5422) {
														isp--;
														int2 = intStack[isp];
														ssp -= 2;
														str1 = stringStack[ssp + 1];
														string = stringStack[ssp];
														if (string.length() > 0) {
															if (PlayerList.playerNames == null) {
																PlayerList.playerNames = new JagString[PlayerList.anIntArray309[client.game]];
															}
															PlayerList.playerNames[int2] = string;
														}
														if (str1.length() > 0) {
															if (PlayerList.playerNames2 == null) {
																PlayerList.playerNames2 = new JagString[PlayerList.anIntArray309[client.game]];
															}
															PlayerList.playerNames2[int2] = str1;
														}
														continue;
													}
													if (opcode == 5423) {
														ssp--;
														stringStack[ssp].print();
														continue;
													}
													if (opcode == 5424) {
														isp -= 11;
														Static40.anInt1275 = intStack[isp];
														Static40.anInt2910 = intStack[isp + 1];
														Static40.anInt5457 = intStack[isp + 2];
														Static40.anInt5208 = intStack[isp + 3];
														Static40.anInt1736 = intStack[isp + 4];
														Static40.anInt4073 = intStack[isp + 5];
														Static40.anInt2261 = intStack[isp + 6];
														Static40.anInt3324 = intStack[isp + 7];
														Static40.anInt5556 = intStack[isp + 8];
														Static40.anInt4581 = intStack[isp + 9];
														Static40.anInt5752 = intStack[isp + 10];
														client.js5Archive8.isFileReady(Static40.anInt1736);
														client.js5Archive8.isFileReady(Static40.anInt4073);
														client.js5Archive8.isFileReady(Static40.anInt2261);
														client.js5Archive8.isFileReady(Static40.anInt3324);
														client.js5Archive8.isFileReady(Static40.anInt5556);
														Static40.aBoolean298 = true;
														continue;
													}
													if (opcode == 5425) {
														Static40.method4637();
														Static40.aBoolean298 = false;
														continue;
													}
													if (opcode == 5426) {
														isp--;
														Static270.anInt5794 = intStack[isp];
														continue;
													}
													if (opcode == 5427) {
														isp -= 2;
														Static169.anInt4075 = intStack[isp];
														Static225.anInt5073 = intStack[isp + 1];
														continue;
													}
												} else if (opcode < 5600) {
													if (opcode == Cs2Opcodes.cameraMoveTo) {
														isp -= 4;
														int1 = intStack[isp];
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														int3 = intStack[isp + 1];
														Camera.method2722(false, int2, int3, local652, (int1 & 0x3FFF) - Camera.originZ, (int1 >> 14 & 0x3FFF) - Camera.originX);
														continue;
													}
													if (opcode == Cs2Opcodes.cameraPointAt) {
														isp -= 4;
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														local652 = intStack[isp + 3];
														int2 = intStack[isp + 2];
														Camera.method3849(int3, (int1 & 0x3FFF) - Camera.originZ, int2, (int1 >> 14 & 0x3FFF) - Camera.originX, local652);
														continue;
													}
													if (opcode == 5502) {
														isp -= 6;
														int1 = intStack[isp];
														if (int1 >= 2) {
															throw new RuntimeException();
														}
														Camera.anInt3718 = int1;
														int3 = intStack[isp + 1];
														if (Camera.anIntArrayArrayArray9[Camera.anInt3718].length >> 1 <= int3 + 1) {
															throw new RuntimeException();
														}
														Camera.anInt3125 = int3;
														Camera.anInt5224 = 0;
														Camera.anInt5101 = intStack[isp + 2];
														Camera.anInt5843 = intStack[isp + 3];
														int2 = intStack[isp + 4];
														if (int2 >= 2) {
															throw new RuntimeException();
														}
														Camera.anInt1694 = int2;
														local652 = intStack[isp + 5];
														if (Camera.anIntArrayArrayArray9[Camera.anInt1694].length >> 1 <= local652 + 1) {
															throw new RuntimeException();
														}
														Camera.anInt2119 = local652;
														Camera.cameraType = 3;
														continue;
													}
													if (opcode == Cs2Opcodes.cameraUnlock) {
														Camera.resetCameraEffects();
														continue;
													}
													if (opcode == 5504) {
														isp -= 2;
														Camera.pitchTarget = intStack[isp];
														Camera.yawTarget = intStack[isp + 1];
														if (Camera.cameraType == 2) {
															Camera.cameraYaw = (int)Camera.yawTarget;
															Camera.cameraPitch = (int)Camera.pitchTarget;
														}
														Camera.clampCameraAngle();
														continue;
													}
													if (opcode == Cs2Opcodes.cameraGetVrot) {
														intStack[isp++] = (int)Camera.pitchTarget;
														continue;
													}
													if (opcode == Cs2Opcodes.cameraGetHrot) {
														intStack[isp++] = (int)Camera.yawTarget;
														continue;
													}
												} else if (opcode < 5700) {
													if (opcode == Cs2Opcodes.directlogin) {
														ssp -= 2;
														string = stringStack[ssp];
														str1 = stringStack[ssp + 1];
														isp--;
														int2 = intStack[isp];
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															LoginManager.method3896(string, str1, int2);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.skipLoginstage10) {
														LoginManager.method3395();
														continue;
													}
													if (opcode == Cs2Opcodes.resetRCs) {
														if (LoginManager.step == 0) {
															LoginManager.reply = -2;
														}
														continue;
													}
													if (opcode == 5603) {
														isp -= 4;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															CreateManager.method2448(intStack[isp + 2], intStack[isp + 3], intStack[isp], intStack[isp + 1]);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.sendRequestAccount) {
														ssp--;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															CreateManager.method1691(stringStack[ssp].encode37());
														}
														continue;
													}
													if (opcode == Cs2Opcodes.sendCreateAccount) {
														isp -= 4;
														ssp -= 2;
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
															CreateManager.method1016(intStack[isp], intStack[isp + 3], intStack[isp + 1], stringStack[ssp + 1], stringStack[ssp].encode37(), intStack[isp + 2]);
														}
														continue;
													}
													if (opcode == Cs2Opcodes.resetAccountCreateRC) {
														if (CreateManager.step == 0) {
															CreateManager.reply = -2;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getGameloginRc) {
														intStack[isp++] = LoginManager.reply;
														continue;
													}
													if (opcode == Cs2Opcodes.getWorldswitchTimer) {
														intStack[isp++] = LoginManager.hopTime;
														continue;
													}
													if (opcode == Cs2Opcodes.getAccountCreateRC) {
														intStack[isp++] = CreateManager.reply;
														continue;
													}
													if (opcode == 5610) {
														for (int1 = 0; int1 < 5; int1++) {
															stringStack[ssp++] = CreateManager.suggestedNames.length > int1 ? CreateManager.suggestedNames[int1].toTitleCase() : EMPTY_STRING;
														}
														CreateManager.suggestedNames = null;
														continue;
													}
													if (opcode == Cs2Opcodes.getDetailedRC) {
														intStack[isp++] = LoginManager.disallowResult;
														continue;
													}
												} else if (opcode < 6100) {
													if (opcode == 6001) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 1) {
															int1 = 1;
														}
														if (int1 > 4) {
															int1 = 4;
														}
														Preferences.brightness = int1;
														if (!GlRenderer.enabled || !Preferences.highDetailLighting) {
															if (Preferences.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Preferences.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Preferences.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Preferences.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														if (GlRenderer.enabled) {
															Static103.setInstantFade();
															if (!Preferences.highDetailLighting) {
																Static145.method2742();
															}
														}
														ObjTypeList.clearSprites();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6002) {
														isp--;
														Preferences.setAllVisibleLevels(intStack[isp] == 1);
														LocTypeList.clear();
														Static145.method2742();
														Static269.method2218();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6003) {
														isp--;
														Preferences.removeRoofsSelectively = intStack[isp] == 1;
														Static269.method2218();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6005) {
														isp--;
														Preferences.showGroundDecorations = intStack[isp] == 1;
														Static145.method2742();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6006) {
														isp--;
														Preferences.highDetailTextures = intStack[isp] == 1;
														((Js5GlTextureProvider) Rasteriser.textureProvider).method3245(!Preferences.highDetailTextures);
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6007) {
														isp--;
														Preferences.manyIdleAnimations = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6008) {
														isp--;
														Preferences.flickeringEffectsOn = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6009) {
														isp--;
														Preferences.manyGroundTextures = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6010) {
														isp--;
														Preferences.characterShadowsOn = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6011) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.sceneryShadowsType = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6012) {
														if (GlRenderer.enabled) {
															MaterialManager.setMaterial(0, 0);
														}
														isp--;
														Preferences.highDetailLighting = intStack[isp] == 1;
														if (GlRenderer.enabled && Preferences.highDetailLighting) {
															Rasteriser.setBrightness(0.7F);
														} else {
															if (Preferences.brightness == 1) {
																Rasteriser.setBrightness(0.9F);
															}
															if (Preferences.brightness == 2) {
																Rasteriser.setBrightness(0.8F);
															}
															if (Preferences.brightness == 3) {
																Rasteriser.setBrightness(0.7F);
															}
															if (Preferences.brightness == 4) {
																Rasteriser.setBrightness(0.6F);
															}
														}
														Static145.method2742();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6014) {
														isp--;
														Preferences.highWaterDetail = intStack[isp] == 1;
														if (GlRenderer.enabled) {
															Static145.method2742();
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6015) {
														isp--;
														Preferences.fogEnabled = intStack[isp] == 1;
														if (GlRenderer.enabled) {
															Static103.setInstantFade();
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6016) {
														isp--;
														int1 = intStack[isp];
														if (GlRenderer.enabled) {
															GameShell.replaceCanvas = true;
														}
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.antiAliasingMode = int1;
														continue;
													}
													if (opcode == 6017) {
														isp--;
														Preferences.stereo = intStack[isp] == 1;
														client.method930();
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6018) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 127) {
															int1 = 127;
														}
														Preferences.soundEffectVolume = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6019) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 255) {
															int1 = 255;
														}
														if (int1 != Preferences.musicVolume) {
															if (Preferences.musicVolume == 0 && MusicPlayer.groupId != -1) {
																Static122.method2410(client.js5Archive6, MusicPlayer.groupId, int1);
																MidiPlayer.jingle = false;
															} else if (int1 == 0) {
																Static241.method4548();
																MidiPlayer.jingle = false;
															} else {
																Static230.method3956(int1);
															}
															Preferences.musicVolume = int1;
														}
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6020) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 127) {
															int1 = 127;
														}
														Preferences.ambientSoundsVolume = int1;
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														continue;
													}
													if (opcode == 6021) {
														isp--;
														Static127.neverRemoveRoofs = intStack[isp] == 1;
														Static269.method2218();
														continue;
													}
													if (opcode == 6023) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															int1 = 0;
														}
														if (int1 > 2) {
															int1 = 2;
														}
														local1552 = false;
														if (GameShell.maxMemory < 96) {
															local1552 = true;
															int1 = 0;
														}
														Preferences.setParticles(int1);
														Preferences.write(GameShell.signLink);
														Preferences.sentToServer = false;
														intStack[isp++] = local1552 ? 0 : 1;
														continue;
													}
													if (opcode == 6024) {
														isp--;
														int1 = intStack[isp];
														if (int1 < 0 || int1 > 2) {
															int1 = 0;
														}
														Preferences.windowMode = int1;
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6028) {
														isp--;
														Preferences.cursorsEnabled = intStack[isp] != 0;
														Preferences.write(GameShell.signLink);
														continue;
													}
												} else if (opcode < 6200) {
													if (opcode == 6101) {
														intStack[isp++] = Preferences.brightness;
														continue;
													}
													if (opcode == 6102) {
														intStack[isp++] = SceneGraph.allLevelsAreVisible() ? 1 : 0;
														continue;
													}
													if (opcode == 6103) {
														intStack[isp++] = Preferences.removeRoofsSelectively ? 1 : 0;
														continue;
													}
													if (opcode == 6105) {
														intStack[isp++] = Preferences.showGroundDecorations ? 1 : 0;
														continue;
													}
													if (opcode == 6106) {
														intStack[isp++] = Preferences.highDetailTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6107) {
														intStack[isp++] = Preferences.manyIdleAnimations ? 1 : 0;
														continue;
													}
													if (opcode == 6108) {
														intStack[isp++] = Preferences.flickeringEffectsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6109) {
														intStack[isp++] = Preferences.manyGroundTextures ? 1 : 0;
														continue;
													}
													if (opcode == 6110) {
														intStack[isp++] = Preferences.characterShadowsOn ? 1 : 0;
														continue;
													}
													if (opcode == 6111) {
														intStack[isp++] = Preferences.sceneryShadowsType;
														continue;
													}
													if (opcode == 6112) {
														intStack[isp++] = Preferences.highDetailLighting ? 1 : 0;
														continue;
													}
													if (opcode == 6114) {
														intStack[isp++] = Preferences.highWaterDetail ? 1 : 0;
														continue;
													}
													if (opcode == 6115) {
														intStack[isp++] = Preferences.fogEnabled ? 1 : 0;
														continue;
													}
													if (opcode == 6116) {
														intStack[isp++] = Preferences.antiAliasingMode;
														continue;
													}
													if (opcode == 6117) {
														intStack[isp++] = Preferences.stereo ? 1 : 0;
														continue;
													}
													if (opcode == 6118) {
														intStack[isp++] = Preferences.soundEffectVolume;
														continue;
													}
													if (opcode == 6119) {
														intStack[isp++] = Preferences.musicVolume;
														continue;
													}
													if (opcode == 6120) {
														intStack[isp++] = Preferences.ambientSoundsVolume;
														continue;
													}
													if (opcode == 6121) {
														if (GlRenderer.enabled) {
															intStack[isp++] = GlRenderer.arbMultisampleSupported ? 1 : 0;
														} else {
															intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 6123) {
														intStack[isp++] = Preferences.getParticleSetting();
														continue;
													}
													if (opcode == 6124) {
														intStack[isp++] = Preferences.windowMode;
														continue;
													}
													if (opcode == 6128) {
														intStack[isp++] = Preferences.cursorsEnabled ? 1 : 0;
														continue;
													}
												} else if (opcode < 6300) {
													if (opcode == 6200) {
														isp -= 2;
														Static115.aShort25 = (short) intStack[isp];
														if (Static115.aShort25 <= 0) {
															Static115.aShort25 = 256;
														}
														Static115.aShort9 = (short) intStack[isp + 1];
														if (Static115.aShort9 <= 0) {
															Static115.aShort9 = 205;
														}
														continue;
													}
													if (opcode == 6201) {
														isp -= 2;
														Static263.aShort30 = (short) intStack[isp];
														if (Static263.aShort30 <= 0) {
															Static263.aShort30 = 256;
														}
														Static187.aShort27 = (short) intStack[isp + 1];
														if (Static187.aShort27 <= 0) {
															Static187.aShort27 = 320;
														}
														continue;
													}
													if (opcode == 6202) {
														isp -= 4;
														Static115.aShort22 = (short) intStack[isp];
														if (Static115.aShort22 <= 0) {
															Static115.aShort22 = 1;
														}
														Static115.aShort1 = (short) intStack[isp + 1];
														if (Static115.aShort1 <= 0) {
															Static115.aShort1 = 32767;
														} else if (Static115.aShort22 > Static115.aShort1) {
															Static115.aShort1 = Static115.aShort22;
														}
														Static115.aShort12 = (short) intStack[isp + 2];
														if (Static115.aShort12 <= 0) {
															Static115.aShort12 = 1;
														}
														Static115.aShort21 = (short) intStack[isp + 3];
														if (Static115.aShort21 <= 0) {
															Static115.aShort21 = 32767;
														} else if (Static115.aShort21 < Static115.aShort12) {
															Static115.aShort21 = Static115.aShort12;
														}
														continue;
													}
													if (opcode == 6203) {
														Static115.method2314(Static280.aClass13_26.width, 0, Static280.aClass13_26.height, 0, false);
														intStack[isp++] = Static115.anInt4055;
														intStack[isp++] = Static115.anInt5377;
														continue;
													}
													if (opcode == 6204) {
														intStack[isp++] = Static263.aShort30;
														intStack[isp++] = Static187.aShort27;
														continue;
													}
													if (opcode == 6205) {
														intStack[isp++] = Static115.aShort25;
														intStack[isp++] = Static115.aShort9;
														continue;
													}
												} else if (opcode < 6400) {
													if (opcode == Cs2Opcodes.getMinute) {
														intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
														continue;
													}
													if (opcode == Cs2Opcodes.getCurrentDaysSinceLaunch) {
														intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
														continue;
													}
													if (opcode == Cs2Opcodes.getDaysSinceLaunch) {
														isp -= 3;
														int2 = intStack[isp + 2];
														int3 = intStack[isp + 1];
														int1 = intStack[isp];
														aCalendar2.clear();
														aCalendar2.set(Calendar.HOUR_OF_DAY, 12);
														aCalendar2.set(int2, int3, int1);
														intStack[isp++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (opcode == Cs2Opcodes.getYear) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(MonotonicClock.currentTimeMillis()));
														intStack[isp++] = aCalendar2.get(Calendar.YEAR);
														continue;
													}
													if (opcode == Cs2Opcodes.isLeapYear) {
														local1552 = true;
														isp--;
														int1 = intStack[isp];
														if (int1 < 0) {
															local1552 = (int1 + 1) % 4 == 0;
														} else if (int1 < 1582) {
															local1552 = int1 % 4 == 0;
														} else if (int1 % 4 != 0) {
															local1552 = false;
														} else if (int1 % 100 != 0) {
															local1552 = true;
														} else if (int1 % 400 != 0) {
															local1552 = false;
														}
														intStack[isp++] = local1552 ? 1 : 0;
														continue;
													}
												} else if (opcode < 6500) {
													if (opcode == Cs2Opcodes.canShowVideoAd) {
														intStack[isp++] = Static87.showVideoAd() ? 1 : 0;
														continue;
													}
													if (opcode == Cs2Opcodes.isShowingVideoAd) {
														intStack[isp++] = Static267.isShowingVideoAd() ? 1 : 0;
														continue;
													}
												} else if (opcode < 6600) {
													if (opcode == 6500) {
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
															intStack[isp++] = WorldList.fetch() == -1 ? 0 : 1;
															continue;
														}
														intStack[isp++] = 1;
														continue;
													}
													@Pc(10247) WorldInfo local10247;
													@Pc(10191) World world;
													if (opcode == Cs2Opcodes.getFirstWorldData) {
														world = Static18.getFirstWorld();
														if (world == null) {
															intStack[isp++] = -1;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = world.id;
															intStack[isp++] = world.flags;
															stringStack[ssp++] = world.activity;
															local10247 = world.getWorldInfo();
															intStack[isp++] = local10247.flag;
															stringStack[ssp++] = local10247.name;
															intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.getNextWorldData) {
														world = WorldList.getNextWorld();
														if (world == null) {
															intStack[isp++] = -1;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = world.id;
															intStack[isp++] = world.flags;
															stringStack[ssp++] = world.activity;
															local10247 = world.getWorldInfo();
															intStack[isp++] = local10247.flag;
															stringStack[ssp++] = local10247.name;
															intStack[isp++] = world.players;
														}
														continue;
													}
													if (opcode == Cs2Opcodes.setWorldHost) {
														isp--;
														int1 = intStack[isp];
														if (client.gameState == 10 && LoginManager.anInt4937 == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
															intStack[isp++] = Static176.hopWorld(int1) ? 1 : 0;
															continue;
														}
														intStack[isp++] = 0;
														continue;
													}
													if (opcode == 6504) {
														isp--;
														Preferences.lastWorldId = intStack[isp];
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6505) {
														intStack[isp++] = Preferences.lastWorldId;
														continue;
													}
													if (opcode == 6506) {
														isp--;
														int1 = intStack[isp];
														@Pc(10440) World local10440 = Static54.getWorld(int1);
														if (local10440 == null) {
															intStack[isp++] = -1;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
															stringStack[ssp++] = EMPTY_STRING;
															intStack[isp++] = 0;
														} else {
															intStack[isp++] = local10440.flags;
															stringStack[ssp++] = local10440.activity;
															@Pc(10458) WorldInfo local10458 = local10440.getWorldInfo();
															intStack[isp++] = local10458.flag;
															stringStack[ssp++] = local10458.name;
															intStack[isp++] = local10440.players;
														}
														continue;
													}
													if (opcode == 6507) {
														isp -= 4;
														int2 = intStack[isp + 2];
														int1 = intStack[isp];
														local7566 = intStack[isp + 3] == 1;
														local1552 = intStack[isp + 1] == 1;
														Static228.sortWorldList(int2, local1552, int1, local7566);
														continue;
													}
												} else if (opcode < 6700) {
													if (opcode == 6600) {
														isp--;
														Preferences.aBoolean63 = intStack[isp] == 1;
														Preferences.write(GameShell.signLink);
														continue;
													}
													if (opcode == 6601) {
														intStack[isp++] = Preferences.aBoolean63 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (opcode == 4500) {
											isp -= 2;
											int1 = intStack[isp];
											int3 = intStack[isp + 1];
											local5294 = ParamTypeList.get(int3);
											if (local5294.isString()) {
												stringStack[ssp++] = StructTypeList.get(int1).getParam(local5294.defaultString, int3);
											} else {
												intStack[isp++] = StructTypeList.get(int1).getParam(int3, local5294.defaultInt);
											}
											continue;
										}
									} else if (opcode == 4400) {
										isp -= 2;
										int3 = intStack[isp + 1];
										int1 = intStack[isp];
										local5294 = ParamTypeList.get(int3);
										if (local5294.isString()) {
											stringStack[ssp++] = LocTypeList.get(int1).method3430(local5294.defaultString, int3);
										} else {
											intStack[isp++] = LocTypeList.get(int1).getParam(local5294.defaultInt, int3);
										}
										continue;
									}
								} else {
									if (opcode == Cs2Opcodes.concatInt) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = JagString.concatenate(new JagString[] { string, JagString.parseInt(int3) });
										continue;
									}
									if (opcode == Cs2Opcodes.concatString) {
										ssp -= 2;
										str1 = stringStack[ssp + 1];
										string = stringStack[ssp];
										stringStack[ssp++] = JagString.concatenate(new JagString[] { string, str1 });
										continue;
									}
									if (opcode == Cs2Opcodes.concatSignedInt) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = JagString.concatenate(new JagString[] { string, JagString.parseIntTrue(int3) });
										continue;
									}
									if (opcode == Cs2Opcodes.toLowerStr) {
										ssp--;
										string = stringStack[ssp];
										stringStack[ssp++] = string.toLowerCase();
										continue;
									}
									if (opcode == Cs2Opcodes.timeToStr) {
										isp--;
										int1 = intStack[isp];
										@Pc(11770) long local11770 = (long) int1 * 86400000L + 1014768000000L;
										aCalendar2.setTime(new Date(local11770));
										local652 = aCalendar2.get(Calendar.DATE);
										c = aCalendar2.get(Calendar.MONTH);
										local1087 = aCalendar2.get(Calendar.YEAR);
										stringStack[ssp++] = JagString.concatenate(new JagString[] { JagString.parseInt(local652), Static163.aClass100_767, Static34.aClass100Array40[c], Static163.aClass100_767, JagString.parseInt(local1087) });
										continue;
									}
									if (opcode == Cs2Opcodes.strForGender) {
										ssp -= 2;
										str1 = stringStack[ssp + 1];
										string = stringStack[ssp];
										if (PlayerList.self.appearance != null && PlayerList.self.appearance.gender) {
											stringStack[ssp++] = str1;
											continue;
										}
										stringStack[ssp++] = string;
										continue;
									}
									if (opcode == Cs2Opcodes.parseInt) {
										isp--;
										int1 = intStack[isp];
										stringStack[ssp++] = JagString.parseInt(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.compare) {
										ssp -= 2;
										intStack[isp++] = stringStack[ssp].compare(stringStack[ssp + 1]);
										continue;
									}
									if (opcode == Cs2Opcodes.getLineCount) {
										ssp--;
										string = stringStack[ssp];
										isp -= 2;
										int2 = intStack[isp + 1];
										int3 = intStack[isp];
										intStack[isp++] = FontMetricsList.get(int2).getParagraphLineCount(string, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.getMaxLineWidth) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int2 = intStack[isp + 1];
										int3 = intStack[isp];
										intStack[isp++] = FontMetricsList.get(int2).getMaxLineWidth(string, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.chooseString) {
										ssp -= 2;
										string = stringStack[ssp];
										str1 = stringStack[ssp + 1];
										isp--;
										if (intStack[isp] == 1) {
											stringStack[ssp++] = string;
										} else {
											stringStack[ssp++] = str1;
										}
										continue;
									}
									if (opcode == Cs2Opcodes.escape) {
										ssp--;
										string = stringStack[ssp];
										stringStack[ssp++] = Font.escape(string);
										continue;
									}
									if (opcode == Cs2Opcodes.concatChar) {
										ssp--;
										string = stringStack[ssp];
										isp--;
										int3 = intStack[isp];
										if (int3 == -1) {
											throw new RuntimeException("null char");
										}
										stringStack[ssp++] = string.concatChar(int3);
										continue;
									}
									if (opcode == Cs2Opcodes.isValidChar) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StringUtils.isValidChar(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isAlphaNumeric) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StringUtils.isAlphaNumeric(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isLetter) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StringUtils.isLetter(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.isDigit) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StringUtils.isDigit(int1) ? 1 : 0;
										continue;
									}
									if (opcode == Cs2Opcodes.length) {
										ssp--;
										string = stringStack[ssp];
										if (string == null) {
											intStack[isp++] = 0;
										} else {
											intStack[isp++] = string.length();
										}
										continue;
									}
									if (opcode == Cs2Opcodes.substr) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int3 = intStack[isp];
										int2 = intStack[isp + 1];
										stringStack[ssp++] = string.substring(int2, int3);
										continue;
									}
									if (opcode == Cs2Opcodes.removeTags) {
										ssp--;
										string = stringStack[ssp];
										str1 = Static87.allocate(string.length());
										@Pc(12220) boolean local12220 = false;
										for (local652 = 0; local652 < string.length(); local652++) {
											c = string.charAt(local652);
											if (c == 60) {
												local12220 = true;
											} else if (c == 62) {
												local12220 = false;
											} else if (!local12220) {
												str1.append(c);
											}
										}
										str1.method3156();
										stringStack[ssp++] = str1;
										continue;
									}
									if (opcode == Cs2Opcodes.indexOfChar) {
										isp -= 2;
										ssp--;
										string = stringStack[ssp];
										int3 = intStack[isp];
										int2 = intStack[isp + 1];
										intStack[isp++] = string.indexOf(int3, int2);
										continue;
									}
									if (opcode == Cs2Opcodes.indexOfStr) {
										ssp -= 2;
										string = stringStack[ssp];
										str1 = stringStack[ssp + 1];
										isp--;
										int2 = intStack[isp];
										intStack[isp++] = string.indexOf(str1, int2);
										continue;
									}
									if (opcode == Cs2Opcodes.toLower) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StringUtils.toLowerCase(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.toUpper) {
										isp--;
										int1 = intStack[isp];
										intStack[isp++] = StringUtils.toUpperCase(int1);
										continue;
									}
									if (opcode == Cs2Opcodes.formatNumber) {
										isp--;
										local12388 = intStack[isp] != 0;
										isp--;
										int3 = intStack[isp];
										stringStack[ssp++] = StringUtils.formatNumber(client.language, local12388, 0, (long) int3);
										continue;
									}
								}
							}
						} else {
							if (opcode < 2000) {
								component = local1020 ? staticActiveComponent1 : staticActiveComponent2;
							} else {
								isp--;
								component = InterfaceList.getComponent(intStack[isp]);
								opcode -= 1000;
							}
							if (opcode == Cs2Opcodes.setPosition) {
								isp -= 4;
								component.baseX = intStack[isp];
								component.baseY = intStack[isp + 1];
								int2 = intStack[isp + 3];
								if (int2 < 0) {
									int2 = 0;
								} else if (int2 > 5) {
									int2 = 5;
								}
								int3 = intStack[isp + 2];
								if (int3 < 0) {
									int3 = 0;
								} else if (int3 > 5) {
									int3 = 5;
								}
								component.xMode = (byte) int2;
								component.yMode = (byte) int3;
								InterfaceList.redraw(component);
								Static74.update(component);
								if (component.createdComponentId == -1) {
									DelayedStateChange.method4675(component.id);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setSize) {
								isp -= 4;
								component.baseWidth = intStack[isp];
								component.baseHeight = intStack[isp + 1];
								component.anInt451 = 0;
								component.anInt526 = 0;
								int3 = intStack[isp + 2];
								int2 = intStack[isp + 3];
								if (int2 < 0) {
									int2 = 0;
								} else if (int2 > 4) {
									int2 = 4;
								}
								component.dynamicHeightValue = (byte) int2;
								if (int3 < 0) {
									int3 = 0;
								} else if (int3 > 4) {
									int3 = 4;
								}
								component.dynamicWidthValue = (byte) int3;
								InterfaceList.redraw(component);
								Static74.update(component);
								if (component.type == 0) {
									Static17.method531(component, false);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setHidden) {
								isp--;
								local1552 = intStack[isp] == 1;
								if (local1552 != component.hidden) {
									component.hidden = local1552;
									InterfaceList.redraw(component);
								}
								if (component.createdComponentId == -1) {
									DelayedStateChange.method1906(component.id);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setAspect) {
								isp -= 2;
								component.aspectWidth = intStack[isp];
								component.aspectHeight = intStack[isp + 1];
								InterfaceList.redraw(component);
								Static74.update(component);
								if (component.type == 0) {
									Static17.method531(component, false);
								}
								continue;
							}
							if (opcode == Cs2Opcodes.setNoClickThrough) {
								isp--;
								component.noClickThrough = intStack[isp] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14378) Exception ex) {
			if (script.name == null) {
				if (client.modeWhere != 0) {
					Chat.add(EMPTY_STRING, 0, CS_ERROR);
				}
				TracingException.report("CS2 - scr:" + script.key + " op:" + op, ex);
			} else {
				@Pc(14385) JagString str = Static87.allocate(30);
				str.method3113(Static219.aClass100_928).method3113(script.name);
				for (cycles = fp - 1; cycles >= 0; cycles--) {
					str.method3113(aClass100_253).method3113(callStack[cycles].script.name);
				}
				if (op == 40) {
					cycles = intOperands[pc];
					str.method3113(Static176.aClass100_802).method3113(JagString.parseInt(cycles));
				}
				if (client.modeWhere != 0) {
					Chat.add(EMPTY_STRING, 0, JagString.concatenate(new JagString[] { aClass100_780, script.name}));
				}
				TracingException.report("CS2 - scr:" + script.key + " op:" + op + new String(str.method3148()), ex);
			}
		}
	}

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jl;)V")
	public static void run(@OriginalArg(1) HookRequest request) {
		run(200000, request);
	}

}
