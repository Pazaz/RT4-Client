package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class LocalizedText {
	//region English Translations
	@OriginalMember(owner = "client!ui", name = "ob", descriptor = "Lclient!na;")
	private static final JagString ENG_ATTACK = JagString.parse("Attack");

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!na;")
	private static final JagString ENG_ATTEMPT_TO_REESTABLISH = JagString.parse("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!na;")
	private static final JagString ENG_CANCEL = JagString.parse("Cancel");

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL0 = JagString.parse("yellow:");

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL1 = JagString.parse("red:");

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL2 = JagString.parse("green:");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL3 = JagString.parse("cyan:");

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL4 = JagString.parse("purple:");

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL5 = JagString.parse("white:");

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL6 = JagString.parse("flash1:");

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL7 = JagString.parse("flash2:");

	@OriginalMember(owner = "client!km", name = "Cc", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL8 = JagString.parse("flash3:");

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL9 = JagString.parse("glow1:");

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL10 = JagString.parse("glow2:");

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATCOL11 = JagString.parse("glow3:");

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATEFFECT1 = JagString.parse("wave:");

	@OriginalMember(owner = "client!pg", name = "ib", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATEFFECT2 = JagString.parse("wave2:");

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATEFFECT3 = JagString.parse("shake:");

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATEFFECT4 = JagString.parse("scroll:");

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Lclient!na;")
	private static final JagString ENG_CHATEFFECT5 = JagString.parse("slide:");

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "Lclient!na;")
	private static final JagString ENG_CHECKING_FOR_UPDATES = JagString.parse("Checking for updates )2 ");

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!na;")
	private static final JagString ENG_CHOOSE_OPTION = JagString.parse("Choose Option");

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Lclient!na;")
	private static final JagString ENG_CLOSE = JagString.parse("Close");

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!na;")
	private static final JagString ENG_CONLOST = JagString.parse("Connection lost)3");

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!na;")
	private static final JagString ENG_CONTINUE = JagString.parse("Continue");

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!na;")
	private static final JagString ENG_DROP = JagString.parse("Drop");

	@OriginalMember(owner = "client!li", name = "u", descriptor = "Lclient!na;")
	private static final JagString ENG_EXAMINE = JagString.parse("Examine");

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "Lclient!na;")
	private static final JagString ENG_FACEHERE = JagString.parse("Face here");

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!na;")
	private static final JagString ENG_FRIENDCANTADDSELF = JagString.parse("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!lk", name = "S", descriptor = "Lclient!na;")
	private static final JagString ENG_FRIENDLISTDUPE = JagString.parse(" is already on your friend list)3");

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Lclient!na;")
	private static final JagString ENG_FRIENDLISTFULL = JagString.parse("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!c", name = "W", descriptor = "Lclient!na;")
	private static final JagString ENG_FRIENDLOGIN = JagString.parse(" has logged in)3");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!na;")
	private static final JagString ENG_FRIENDLOGOUT = JagString.parse(" has logged out)3");

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Lclient!na;")
	private static final JagString ENG_GAME0_LOADING = JagString.parse("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!an", name = "Z", descriptor = "Lclient!na;")
	private static final JagString ENG_HIDDEN = JagString.parse("Hidden");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_IGNORECANTADDSELF = JagString.parse("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!ol", name = "X", descriptor = "Lclient!na;")
	private static final JagString ENG_IGNORELISTDUPE = JagString.parse(" is already on your ignore list)3");

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!na;")
	private static final JagString ENG_IGNORELISTFULL = JagString.parse("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_LENT_ITEM_RETURN = JagString.parse("Discard");

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Lclient!na;")
	private static final JagString ENG_LEVEL = JagString.parse("level: ");

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lclient!na;")
	private static final JagString ENG_LOADING = JagString.parse("Loading )2 please wait)3");

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "Lclient!na;")
	private static final JagString ENG_LOADINGDOTDOTDOT = JagString.parse("Loading)3)3)3");

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD0 = JagString.parse("Allocating memory");

	@OriginalMember(owner = "client!na", name = "ob", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD0B = JagString.parse("Allocated memory");

	@OriginalMember(owner = "client!il", name = "J", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD10B = JagString.parse("Created gameworld");

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD30 = JagString.parse("Connecting to update server");

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD30B = JagString.parse("Connected to update server");

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD40B = JagString.parse("Loaded update list");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD45B = JagString.parse("Prepared sound engine");

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD50 = JagString.parse("Loading fonts )2 ");

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD50B = JagString.parse("Loaded fonts");

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD60 = JagString.parse("Loading title screen )2 ");

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD60B = JagString.parse("Loaded title screen");

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD65B = JagString.parse("Opened title screen");

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD70 = JagString.parse("Loading config )2 ");

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD70B = JagString.parse("Loaded config");

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD80 = JagString.parse("Loading sprites )2 ");

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD80B = JagString.parse("Loaded sprites");

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD90 = JagString.parse("Loading textures )2 ");

	@OriginalMember(owner = "client!gm", name = "fb", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD90B = JagString.parse("Loaded textures");

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD110B = JagString.parse("Loaded input handler");

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD120 = JagString.parse("Loading wordpack )2 ");

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD120B = JagString.parse("Loaded wordpack");

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD130 = JagString.parse("Loading interfaces )2 ");

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD130B = JagString.parse("Loaded interfaces");

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD135 = JagString.parse("Loading world list data");

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD135B = JagString.parse("Loaded world list data");

	@OriginalMember(owner = "client!cn", name = "J", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD140 = JagString.parse("Starting 3d Library");

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!na;")
	private static final JagString ENG_MAINLOAD150B = JagString.parse("Started 3d Library");

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "Lclient!na;")
	private static final JagString ENG_MEMBERS_OBJECT = JagString.parse("Members object");

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "Lclient!na;")
	private static final JagString ENG_MILLION_SUFFIX = JagString.parse("M");

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!na;")
	private static final JagString ENG_MINISEPARATOR = JagString.parse(" ");

	@OriginalMember(owner = "client!ui", name = "ab", descriptor = "Lclient!na;")
	private static final JagString ENG_MOREOPTIONS = JagString.parse(" more options");

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!na;")
	private static final JagString ENG_OK = JagString.parse("Ok");

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "Lclient!na;")
	private static final JagString ENG_PLEASEWAIT = JagString.parse("Please wait)3)3)3");

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "Lclient!na;")
	private static final JagString ENG_RATING = JagString.parse("rating: ");

	@OriginalMember(owner = "client!pm", name = "gb", descriptor = "Lclient!na;")
	private static final JagString ENG_REMOVEFRIEND = JagString.parse(" from your friend list first)3");

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Lclient!na;")
	private static final JagString ENG_REMOVEIGNORE = JagString.parse(" from your ignore list first)3");

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!na;")
	private static final JagString ENG_REMOVESOCIAL = JagString.parse("Please remove ");

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!na;")
	private static final JagString ENG_SELECT = JagString.parse("Select");

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!na;")
	private static final JagString ENG_SKILL = JagString.parse("skill: ");

	@OriginalMember(owner = "client!si", name = "hb", descriptor = "Lclient!na;")
	private static final JagString ENG_TAKE = JagString.parse("Take");

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "Lclient!na;")
	private static final JagString ENG_THOUSAND_SUFFIX = JagString.parse("K");

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!na;")
	private static final JagString ENG_TRADEREQ = JagString.parse("wishes to trade with you)3");

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!na;")
	private static final JagString ENG_UNABLETOFIND = JagString.parse("Unable to find ");

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!na;")
	private static final JagString ENG_USE = JagString.parse("Use");

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!na;")
	private static final JagString ENG_WALKHERE = JagString.parse("Walk here");
	//endregion

	//region Stable Translations (chat effects/colors)
	@OriginalMember(owner = "client!bk", name = "R", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL0 = ENG_CHATCOL0;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL1 = ENG_CHATCOL1;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL2 = ENG_CHATCOL2;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL3 = ENG_CHATCOL3;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL4 = ENG_CHATCOL4;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL5 = ENG_CHATCOL5;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL6 = ENG_CHATCOL6;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL7 = ENG_CHATCOL7;

	@OriginalMember(owner = "client!km", name = "wc", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL8 = ENG_CHATCOL8;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL9 = ENG_CHATCOL9;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL10 = ENG_CHATCOL10;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATCOL11 = ENG_CHATCOL11;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATEFFECT1 = ENG_CHATEFFECT1;

	@OriginalMember(owner = "client!pg", name = "X", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATEFFECT2 = ENG_CHATEFFECT2;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATEFFECT3 = ENG_CHATEFFECT3;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATEFFECT4 = ENG_CHATEFFECT4;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "Lclient!na;")
	public static final JagString STABLE_CHATEFFECTC5 = ENG_CHATEFFECT5;
	//endregion

	// TODO: unsorted
	//region Active
	@OriginalMember(owner = "client!vj", name = "b", descriptor = "Lclient!na;")
	public static JagString MAINLOAD30 = ENG_MAINLOAD30;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!na;")
	public static JagString CHATCOL1 = ENG_CHATCOL1;

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "Lclient!na;")
	public static JagString FACEHERE = ENG_FACEHERE;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lclient!na;")
	public static JagString MAINLOAD80 = ENG_MAINLOAD80;

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "Lclient!na;")
	public static JagString RATING = ENG_RATING;

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "Lclient!na;")
	public static JagString MEMBERS_OBJECT = ENG_MEMBERS_OBJECT;

	@OriginalMember(owner = "client!si", name = "db", descriptor = "Lclient!na;")
	public static JagString TAKE = ENG_TAKE;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!na;")
	public static JagString MAINLOAD110B = ENG_MAINLOAD110B;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!na;")
	public static JagString WALKHERE = ENG_WALKHERE;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!na;")
	public static JagString MINISEPARATOR = ENG_MINISEPARATOR;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!na;")
	public static JagString UNABLETOFIND = ENG_UNABLETOFIND;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!na;")
	public static JagString IGNORECANTADDSELF = ENG_IGNORECANTADDSELF;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!na;")
	public static JagString OK = ENG_OK;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "Lclient!na;")
	public static JagString MAINLOAD150B = ENG_MAINLOAD150B;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!na;")
	public static JagString REMOVEIGNORE = ENG_REMOVEIGNORE;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!na;")
	public static JagString CHATCOL7 = ENG_CHATCOL7;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!na;")
	public static JagString CHOOSE_OPTION = ENG_CHOOSE_OPTION;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!na;")
	public static JagString CHATCOL10 = ENG_CHATCOL10;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!na;")
	public static JagString ATTEMPT_TO_REESTABLISH = ENG_ATTEMPT_TO_REESTABLISH;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!na;")
	public static JagString CONTINUE = ENG_CONTINUE;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!na;")
	public static JagString MAINLOAD80B = ENG_MAINLOAD80B;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!na;")
	public static JagString MAINLOAD135 = ENG_MAINLOAD135;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "Lclient!na;")
	public static JagString USE = ENG_USE;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!na;")
	public static JagString MAINLOAD90 = ENG_MAINLOAD90;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!na;")
	public static JagString CHATCOL4 = ENG_CHATCOL4;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!na;")
	public static JagString FRIENDLOGOUT = ENG_FRIENDLOGOUT;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "Lclient!na;")
	public static JagString LOADING = ENG_LOADING;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "Lclient!na;")
	public static JagString CHATCOL2 = ENG_CHATCOL2;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lclient!na;")
	public static JagString MAINLOAD130B = ENG_MAINLOAD130B;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!na;")
	public static JagString IGNORELISTFULL = ENG_IGNORELISTFULL;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!na;")
	public static JagString CONLOST = ENG_CONLOST;

	@OriginalMember(owner = "client!il", name = "M", descriptor = "Lclient!na;")
	public static JagString MAINLOAD10B = ENG_MAINLOAD10B;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!na;")
	public static JagString CANCEL = ENG_CANCEL;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "Lclient!na;")
	public static JagString FRIENDLISTFULL = ENG_FRIENDLISTFULL;

	@OriginalMember(owner = "client!km", name = "Dc", descriptor = "Lclient!na;")
	public static JagString CHATCOL8 = ENG_CHATCOL8;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "Lclient!na;")
	public static JagString CHATCOL6 = ENG_CHATCOL6;

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!na;")
	public static JagString MAINLOAD0 = ENG_MAINLOAD0;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!na;")
	public static JagString CHATEFFECT3 = ENG_CHATEFFECT3;

	@OriginalMember(owner = "client!pm", name = "fb", descriptor = "Lclient!na;")
	public static JagString REMOVEFRIEND = ENG_REMOVEFRIEND;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!na;")
	public static JagString MAINLOAD50B = ENG_MAINLOAD50B;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Lclient!na;")
	public static JagString MAINLOAD60 = ENG_MAINLOAD60;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!na;")
	public static JagString MAINLOAD45B = ENG_MAINLOAD45B;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!na;")
	public static JagString SELECT = ENG_SELECT;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!na;")
	public static JagString MAINLOAD120 = ENG_MAINLOAD120;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!na;")
	public static JagString EXAMINE = ENG_EXAMINE;

	@OriginalMember(owner = "client!gm", name = "cb", descriptor = "Lclient!na;")
	public static JagString MAINLOAD90B = ENG_MAINLOAD90B;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Lclient!na;")
	public static JagString FRIENDCANTADDSELF = ENG_FRIENDCANTADDSELF;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!na;")
	public static JagString MAINLOAD120B = ENG_MAINLOAD120B;

	@OriginalMember(owner = "client!ol", name = "db", descriptor = "Lclient!na;")
	public static JagString IGNORELISTDUPE = ENG_IGNORELISTDUPE;

	@OriginalMember(owner = "client!lk", name = "X", descriptor = "Lclient!na;")
	public static JagString MAINLOAD50 = ENG_MAINLOAD50;

	@OriginalMember(owner = "client!lk", name = "ab", descriptor = "Lclient!na;")
	public static JagString FRIENDLISTDUPE = ENG_FRIENDLISTDUPE;

	@OriginalMember(owner = "client!pg", name = "hb", descriptor = "Lclient!na;")
	public static JagString CHATEFFECT2 = ENG_CHATEFFECT2;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!na;")
	public static JagString MAINLOAD30B = ENG_MAINLOAD30B;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Lclient!na;")
	public static JagString MAINLOAD0B = ENG_MAINLOAD0B;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!na;")
	public static JagString REMOVESOCIAL1 = ENG_REMOVESOCIAL;

	@OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lclient!na;")
	public static JagString ATTACK = ENG_ATTACK;

	@OriginalMember(owner = "client!ui", name = "V", descriptor = "Lclient!na;")
	public static JagString MOREOPTIONS = ENG_MOREOPTIONS;

	@OriginalMember(owner = "client!fn", name = "R", descriptor = "Lclient!na;")
	public static JagString MAINLOAD70B = ENG_MAINLOAD70B;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!na;")
	public static JagString REMOVESOCIAL2 = ENG_REMOVESOCIAL;

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "Lclient!na;")
	public static JagString MILLION_SHORT = ENG_MILLION_SUFFIX;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "Lclient!na;")
	public static JagString MILLION = ENG_MILLION_SUFFIX;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "Lclient!na;")
	public static JagString CHATEFFECT5 = ENG_CHATEFFECT5;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!na;")
	public static JagString LEVEL = ENG_LEVEL;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!na;")
	public static JagString SKILL = ENG_SKILL;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!na;")
	public static JagString CHATEFFECT4 = ENG_CHATEFFECT4;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!na;")
	public static JagString GAME0_LOADING = ENG_GAME0_LOADING;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!na;")
	public static JagString TRADEREQ = ENG_TRADEREQ;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!na;")
	public static JagString LOADINGDOTDOTDOT = ENG_LOADINGDOTDOTDOT;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Lclient!na;")
	public static JagString MAINLOAD65B = ENG_MAINLOAD65B;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lclient!na;")
	public static JagString CHATEFFECT1 = ENG_CHATEFFECT1;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "Lclient!na;")
	public static JagString DROP = ENG_DROP;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "Lclient!na;")
	public static JagString CLOSE = ENG_CLOSE;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "Lclient!na;")
	public static JagString MAINLOAD140 = ENG_MAINLOAD140;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!na;")
	public static JagString CHATCOL3 = ENG_CHATCOL3;

	@OriginalMember(owner = "client!cl", name = "T", descriptor = "Lclient!na;")
	public static JagString THOUSAND_SHORT = ENG_THOUSAND_SUFFIX;

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "Lclient!na;")
	public static JagString THOUSAND = ENG_THOUSAND_SUFFIX;

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Lclient!na;")
	public static JagString MAINLOAD135B = ENG_MAINLOAD135B;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Lclient!na;")
	public static JagString LENT_ITEM_RETURN = ENG_LENT_ITEM_RETURN;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "Lclient!na;")
	public static JagString MAINLOAD60B = ENG_MAINLOAD60B;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "Lclient!na;")
	public static JagString FRIENDLOGIN = ENG_FRIENDLOGIN;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "Lclient!na;")
	public static JagString CHECKING_FOR_UPDATES = ENG_CHECKING_FOR_UPDATES;

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "Lclient!na;")
	public static JagString CHATCOL0 = ENG_CHATCOL0;

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "Lclient!na;")
	public static JagString MAINLOAD70 = ENG_MAINLOAD70;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "Lclient!na;")
	public static JagString PLEASEWAIT = ENG_PLEASEWAIT;

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "Lclient!na;")
	public static JagString MAINLOAD130 = ENG_MAINLOAD130;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Lclient!na;")
	public static JagString CHATCOL5 = ENG_CHATCOL5;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!na;")
	public static JagString MAINLOAD40B = ENG_MAINLOAD40B;

	@OriginalMember(owner = "client!an", name = "cb", descriptor = "Lclient!na;")
	public static JagString HIDDEN = ENG_HIDDEN;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!na;")
	public static JagString CHATCOL11 = ENG_CHATCOL11;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!na;")
	public static JagString CHATCOL9 = ENG_CHATCOL9;
	//endregion

	// TODO: unsorted
	//region German Translations
	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD135 = JagString.parse("Lade Liste der Welten");

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD80B = JagString.parse("Sprites geladen)3");

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!na;")
	public static final JagString GER_TRADEREQ = JagString.parse("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!na;")
	public static final JagString GER_REMOVEFRIEND = JagString.parse(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD120B = JagString.parse("Wordpack geladen)3");

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL6 = JagString.parse("blinken1:");

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!na;")
	public static final JagString GER_REMOVESOCIAL = JagString.parse("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD70 = JagString.parse("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!na;")
	public static final JagString GER_CONLOST = JagString.parse("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL4 = JagString.parse("lila:");

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL1 = JagString.parse("rot:");

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!na;")
	public static final JagString GER_CHECKING_FOR_UPDATES = JagString.parse("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD120 = JagString.parse("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD90 = JagString.parse("Lade Texturen )2 ");

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!na;")
	public static final JagString GER_LENT_ITEM_RETURN = JagString.parse("Ablegen");

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD70B = JagString.parse("Konfig geladen)3");

	@OriginalMember(owner = "client!bj", name = "U", descriptor = "Lclient!na;")
	public static final JagString GER_CHATEFFECT2 = JagString.parse("welle2:");

	@OriginalMember(owner = "client!bk", name = "P", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD0 = JagString.parse("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!na;")
	public static final JagString GER_SELECT = JagString.parse("Ausw-=hlen");

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL0 = JagString.parse("gelb:");

	@OriginalMember(owner = "client!an", name = "eb", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD50 = JagString.parse("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Lclient!na;")
	public static final JagString GER_LEVEL = JagString.parse("Stufe: ");

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!na;")
	public static final JagString GER_MEMBERS_OBJECT = JagString.parse("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!be", name = "Zc", descriptor = "Lclient!na;")
	public static final JagString GER_TAKE = JagString.parse("Nehmen");

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD110B = JagString.parse("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!gm", name = "eb", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD80 = JagString.parse("Lade Sprites )2 ");

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD90B = JagString.parse("Texturen geladen)3");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!na;")
	public static final JagString GER_HIDDEN = JagString.parse("Versteckt");

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "Lclient!na;")
	public static final JagString GER_FRIENDLISTDUPE = JagString.parse(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD65B = JagString.parse("Titelbild ge-Offnet)3");

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "Lclient!na;")
	public static final JagString GER_CLOSE = JagString.parse("Schlie-8en");

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!na;")
	public static final JagString GER_FRIENDCANTADDSELF = JagString.parse("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL11 = JagString.parse("leuchten3:");

	@OriginalMember(owner = "client!pg", name = "W", descriptor = "Lclient!na;")
	public static final JagString GER_FRIENDLOGIN = JagString.parse(" loggt sich ein)3");

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL9 = JagString.parse("leuchten1:");

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!na;")
	public static final JagString GER_FRIENDLISTFULL = JagString.parse("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!ui", name = "hb", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD50B = JagString.parse("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!na;")
	public static final JagString GER_ATTEMPT_TO_REESTABLISH = JagString.parse("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD130 = JagString.parse("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!em", name = "A", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL8 = JagString.parse("blinken3:");

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD30B = JagString.parse("Verbindung zum Update)2Server hergestellt)3");

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL3 = JagString.parse("blaugr-Un:");

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD150B = JagString.parse("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!na;")
	public static final JagString GER_LOADING = JagString.parse("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD0B = JagString.parse("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!na;")
	public static final JagString GER_FACEHERE = JagString.parse("Hierhin drehen");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL7 = JagString.parse("blinken2:");

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "Lclient!na;")
	public static final JagString GER_REMOVEIGNORE = JagString.parse(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "Lclient!na;")
	public static final JagString GER_LOADINGDOTDOTDOT = JagString.parse("Lade)3)3)3");

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "Lclient!na;")
	public static final JagString GER_CHATEFFECT3 = JagString.parse("sch-Utteln:");

	@OriginalMember(owner = "client!pi", name = "bb", descriptor = "Lclient!na;")
	public static final JagString GER_IGNORECANTADDSELF = JagString.parse("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL5 = JagString.parse("weiss:");

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!na;")
	public static final JagString GER_RATING = JagString.parse("Kampfstufe: ");

	@OriginalMember(owner = "client!pk", name = "eb", descriptor = "Lclient!na;")
	public static final JagString GER_ATTACK = JagString.parse("Angreifen");

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!na;")
	public static final JagString GER_MOREOPTIONS = JagString.parse(" weitere Optionen");

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!na;")
	public static final JagString GER_IGNORELISTDUPE = JagString.parse(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD60B = JagString.parse("Titelbild geladen)3");

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL2 = JagString.parse("gr-Un:");

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!na;")
	public static final JagString GER_CANCEL = JagString.parse("Abbrechen");

	@OriginalMember(owner = "client!uh", name = "fb", descriptor = "Lclient!na;")
	public static final JagString GER_GAME0_LOADING = JagString.parse("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!na;")
	public static final JagString GER_MILLION_SUFFIX = JagString.parse("M");

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Lclient!na;")
	public static final JagString GER_PLEASEWAIT = JagString.parse("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "Lclient!na;")
	public static final JagString GER_DROP = JagString.parse("Fallen lassen");

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD130B = JagString.parse("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!na;")
	public static final JagString GER_MINISEPARATOR = JagString.parse(": ");

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!na;")
	public static final JagString GER_CHATEFFECT1 = JagString.parse("welle:");

	@OriginalMember(owner = "client!si", name = "ib", descriptor = "Lclient!na;")
	public static final JagString GER_CONTINUE = JagString.parse("Weiter");

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!na;")
	public static final JagString GER_IGNORELISTFULL = JagString.parse("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD140 = JagString.parse("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Lclient!na;")
	public static final JagString GER_CHATEFFECT4 = JagString.parse("scrollen:");

	@OriginalMember(owner = "client!sk", name = "cb", descriptor = "Lclient!na;")
	public static final JagString GER_EXAMINE = JagString.parse("Untersuchen");

	@OriginalMember(owner = "client!sk", name = "eb", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD45B = JagString.parse("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD135B = JagString.parse("Liste der Welten geladen");

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD30 = JagString.parse("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!na;")
	public static final JagString GER_WALKHERE = JagString.parse("Hierhin gehen");

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "Lclient!na;")
	public static final JagString GER_CHOOSE_OPTION = JagString.parse("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "Lclient!na;")
	public static final JagString GER_USE = JagString.parse("Benutzen");

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Lclient!na;")
	public static final JagString GER_CHATEFFECT5 = JagString.parse("gleiten:");

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD60 = JagString.parse("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!na;")
	public static final JagString GER_CHATCOL10 = JagString.parse("leuchten2:");

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!na;")
	public static final JagString GER_UNABLETOFIND = JagString.parse("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!na;")
	public static final JagString GER_FRIENDLOGOUT = JagString.parse(" loggt sich aus)3");

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "Lclient!na;")
	public static final JagString GER_THOUSAND_SUFFIX = JagString.parse("T");

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD10B = JagString.parse("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!na;")
	public static final JagString GER_OK = JagString.parse("Okay");

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!na;")
	public static final JagString GER_SKILL = JagString.parse("Fertigkeit: ");

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!na;")
	public static final JagString GER_MAINLOAD40B = JagString.parse("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	public static void switchToGerman() {
		CHATEFFECT1 = GER_CHATEFFECT1;
		MOREOPTIONS = GER_MOREOPTIONS;
		REMOVESOCIAL1 = GER_REMOVESOCIAL;
		MAINLOAD70B = GER_MAINLOAD70B;
		MAINLOAD50B = GER_MAINLOAD50B;
		REMOVEFRIEND = GER_REMOVEFRIEND;
		TRADEREQ = GER_TRADEREQ;
		CHATCOL8 = GER_CHATCOL8;
		FRIENDLISTFULL = GER_FRIENDLISTFULL;
		IGNORECANTADDSELF = GER_IGNORECANTADDSELF;
		CHECKING_FOR_UPDATES = GER_CHECKING_FOR_UPDATES;
		CHATCOL5 = GER_CHATCOL5;
		DROP = GER_DROP;
		FRIENDLOGIN = GER_FRIENDLOGIN;
		RATING = GER_RATING;
		THOUSAND_SHORT = GER_THOUSAND_SUFFIX;
		MAINLOAD135 = GER_MAINLOAD135;
		MINISEPARATOR = GER_MINISEPARATOR;
		CHATCOL2 = GER_CHATCOL2;
		CHATCOL9 = GER_CHATCOL9;
		MAINLOAD110B = GER_MAINLOAD110B;
		CHATCOL1 = GER_CHATCOL1;
		OK = GER_OK;
		GAME0_LOADING = GER_GAME0_LOADING;
		CHATCOL4 = GER_CHATCOL4;
		MAINLOAD10B = GER_MAINLOAD10B;
		REMOVESOCIAL2 = GER_REMOVESOCIAL;
		MAINLOAD50 = GER_MAINLOAD50;
		CANCEL = GER_CANCEL;
		CHATEFFECT3 = GER_CHATEFFECT3;
		IGNORELISTFULL = GER_IGNORELISTFULL;
		CONTINUE = GER_CONTINUE;
		LOADING = GER_LOADING;
		ATTACK = GER_ATTACK;
		MAINLOAD80B = GER_MAINLOAD80B;
		MAINLOAD90 = GER_MAINLOAD90;
		CHATCOL3 = GER_CHATCOL3;
		EXAMINE = GER_EXAMINE;
		CONLOST = GER_CONLOST;
		SKILL = GER_SKILL;
		MEMBERS_OBJECT = GER_MEMBERS_OBJECT;
		MAINLOAD135B = GER_MAINLOAD135B;
		REMOVEIGNORE = GER_REMOVEIGNORE;
		PLEASEWAIT = GER_PLEASEWAIT;
		FRIENDLOGOUT = GER_FRIENDLOGOUT;
		MAINLOAD140 = GER_MAINLOAD140;
		THOUSAND = GER_THOUSAND_SUFFIX;
		SELECT = GER_SELECT;
		CHATCOL10 = GER_CHATCOL10;
		TAKE = GER_TAKE;
		UNABLETOFIND = GER_UNABLETOFIND;
		MAINLOAD60 = GER_MAINLOAD60;
		MAINLOAD30 = GER_MAINLOAD30;
		WALKHERE = GER_WALKHERE;
		FACEHERE = GER_FACEHERE;
		MAINLOAD80 = GER_MAINLOAD80;
		MILLION_SHORT = GER_MILLION_SUFFIX;
		CHOOSE_OPTION = GER_CHOOSE_OPTION;
		MAINLOAD150B = GER_MAINLOAD150B;
		USE = GER_USE;
		MAINLOAD0 = GER_MAINLOAD0;
		ATTEMPT_TO_REESTABLISH = GER_ATTEMPT_TO_REESTABLISH;
		MAINLOAD130B = GER_MAINLOAD130B;
		CHATEFFECT5 = GER_CHATEFFECT5;
		MAINLOAD40B = GER_MAINLOAD40B;
		CHATCOL0 = GER_CHATCOL0;
		CHATCOL7 = GER_CHATCOL7;
		CHATCOL6 = GER_CHATCOL6;
		LOADINGDOTDOTDOT = GER_LOADINGDOTDOTDOT;
		MILLION = GER_MILLION_SUFFIX;
		MAINLOAD70 = GER_MAINLOAD70;
		MAINLOAD0B = GER_MAINLOAD0B;
		MAINLOAD60B = GER_MAINLOAD60B;
		CHATCOL11 = GER_CHATCOL11;
		FRIENDCANTADDSELF = GER_FRIENDCANTADDSELF;
		MAINLOAD120B = GER_MAINLOAD120B;
		IGNORELISTDUPE = GER_IGNORELISTDUPE;
		MAINLOAD30B = GER_MAINLOAD30B;
		LENT_ITEM_RETURN = GER_LENT_ITEM_RETURN;
		HIDDEN = GER_HIDDEN;
		CHATEFFECT2 = GER_CHATEFFECT2;
		MAINLOAD130 = GER_MAINLOAD130;
		FRIENDLISTDUPE = GER_FRIENDLISTDUPE;
		MAINLOAD65B = GER_MAINLOAD65B;
		CLOSE = GER_CLOSE;
		CHATEFFECT4 = GER_CHATEFFECT4;
		MAINLOAD90B = GER_MAINLOAD90B;
		MAINLOAD120 = GER_MAINLOAD120;
		MAINLOAD45B = GER_MAINLOAD45B;
		LEVEL = GER_LEVEL;
	}
	//endregion

	// TODO: unsorted
	//region French Translations
	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!na;")
	public static final JagString FR_THOUSAND_SUFFIX = JagString.parse("K");

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL1 = JagString.parse("rouge:");

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!na;")
	public static final JagString FR_GAME0_LOADING = JagString.parse("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD130B = JagString.parse("Interfaces charg-Bes");

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!na;")
	public static final JagString FR_RATING = JagString.parse("classement ");

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "Lclient!na;")
	public static final JagString FR_CONLOST = JagString.parse("Connexion perdue)3");

	@OriginalMember(owner = "client!ui", name = "nb", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL0 = JagString.parse("jaune:");

	@OriginalMember(owner = "client!fm", name = "T", descriptor = "Lclient!na;")
	public static final JagString FR_MINISEPARATOR = JagString.parse(" ");

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!na;")
	public static final JagString FR_CHECKING_FOR_UPDATES = JagString.parse("V-Brification des mises -9 jour )2 ");

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!na;")
	public static final JagString FR_CHATEFFECT2 = JagString.parse("ondulation2:");

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL2 = JagString.parse("vert:");

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!na;")
	public static final JagString FR_USE = JagString.parse("Utiliser");

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!na;")
	public static final JagString FR_MEMBERS_OBJECT = JagString.parse("Objet d(Wabonn-Bs");

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!na;")
	public static final JagString FR_REMOVESOCIAL = JagString.parse("Veuillez commencer par supprimer ");

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL10 = JagString.parse("brillant2:");

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!na;")
	public static final JagString FR_FRIENDLISTFULL = JagString.parse("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD60B = JagString.parse(",Mcran)2titre charg-B");

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "Lclient!na;")
	public static final JagString FR_EXAMINE = JagString.parse("Examiner");

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Lclient!na;")
	public static final JagString FR_WALKHERE = JagString.parse("Atteindre");

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL5 = JagString.parse("blanc:");

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL11 = JagString.parse("brillant3:");

	@OriginalMember(owner = "client!cl", name = "R", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD65B = JagString.parse(",Mcran)2titre ouvert");

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!na;")
	public static final JagString FR_FRIENDCANTADDSELF = JagString.parse("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Lclient!na;")
	public static final JagString FR_SKILL = JagString.parse("comp-Btence ");

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "Lclient!na;")
	public static final JagString FR_IGNORECANTADDSELF = JagString.parse("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

	@OriginalMember(owner = "client!e", name = "vc", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD110B = JagString.parse("Gestionnaire de saisie charg-B");

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD130 = JagString.parse("Chargement des interfaces )2 ");

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Lclient!na;")
	public static final JagString FR_LENT_ITEM_RETURN = JagString.parse("Jeter");

	@OriginalMember(owner = "client!ej", name = "cb", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL7 = JagString.parse("clignotant2:");

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!na;")
	public static final JagString FR_MILLION_SUFFIX = JagString.parse("M");

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!na;")
	public static final JagString FR_FRIENDLOGOUT = JagString.parse(" s(West d-Bconnect-B)3");

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!na;")
	public static final JagString FR_CANCEL = JagString.parse("Annuler");

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "Lclient!na;")
	public static final JagString FR_CHATEFFECT4 = JagString.parse("d-Broulement:");

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD50B = JagString.parse("Polices charg-Bes");

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD90B = JagString.parse("Textures charg-Bes");

	@OriginalMember(owner = "client!il", name = "R", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD135B = JagString.parse("Liste des serveurs charg-Be");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD150B = JagString.parse("Librairie 3D d-Bmarr-Be");

	@OriginalMember(owner = "client!kd", name = "tb", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD30B = JagString.parse("Connect-B au serveur de mise -9 jour");

	@OriginalMember(owner = "client!mg", name = "Y", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD0B = JagString.parse("M-Bmoire attribu-Be");

	@OriginalMember(owner = "client!km", name = "Ic", descriptor = "Lclient!na;")
	public static final JagString FR_CHATEFFECT1 = JagString.parse("ondulation:");

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "Lclient!na;")
	public static final JagString FR_CHATEFFECT3 = JagString.parse("tremblement:");

	@OriginalMember(owner = "client!gm", name = "hb", descriptor = "Lclient!na;")
	public static final JagString FR_FACEHERE = JagString.parse("Regarder dans cette direction");

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!na;")
	public static final JagString FR_PLEASEWAIT = JagString.parse("Veuillez patienter)3)3)3");

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD135 = JagString.parse("Chargement de la liste des serveurs");

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD120B = JagString.parse("Module texte charg-B");

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Lclient!na;")
	public static final JagString FR_CHOOSE_OPTION = JagString.parse("Choisir une option");

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD90 = JagString.parse("Chargement des textures )2 ");

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lclient!na;")
	public static final JagString FR_LOADING = JagString.parse("Chargement en cours)3 Veuillez patienter)3");

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL8 = JagString.parse("clignotant3:");

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!na;")
	public static final JagString FR_HIDDEN = JagString.parse("Cach-B");

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD50 = JagString.parse("Chargement des polices )2 ");

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD10B = JagString.parse("Monde de jeu cr-B-B");

	@OriginalMember(owner = "client!me", name = "T", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL4 = JagString.parse("violet:");

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "Lclient!na;")
	public static final JagString FR_IGNORELISTFULL = JagString.parse("Votre liste noire est pleine (X100 noms maximum(Y)3");

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "Lclient!na;")
	public static final JagString FR_LOADINGDOTDOTDOT = JagString.parse("Chargement en cours)3)3)3");

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL6 = JagString.parse("clignotant1:");

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!na;")
	public static final JagString FR_TRADEREQ = JagString.parse("voudrait faire un -Bchange avec vous)3");

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!na;")
	public static final JagString FR_FRIENDSLISTDUPE = JagString.parse(" est d-Bj-9 dans votre liste d(Wamis)3");

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!na;")
	public static final JagString FR_SELECT = JagString.parse("S-Blectionner");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!na;")
	public static final JagString FR_LEVEL = JagString.parse("niveau ");

	@OriginalMember(owner = "client!md", name = "X", descriptor = "Lclient!na;")
	public static final JagString FR_UNABLETOFIND = JagString.parse("Impossible de trouver ");

	@OriginalMember(owner = "client!md", name = "J", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD140 = JagString.parse("D-Bmarrage de la librairie 3D");

	@OriginalMember(owner = "client!md", name = "O", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD70B = JagString.parse("Fichiers config charg-Bs");

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!na;")
	public static final JagString FR_CLOSE = JagString.parse("Fermer");

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD70 = JagString.parse("Chargement des fichiers config )2 ");

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Lclient!na;")
	public static final JagString FR_ATTEMPT_TO_REESTABLISH = JagString.parse("Veuillez patienter )2 tentative de r-Btablissement)3");

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL9 = JagString.parse("brillant1:");

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD80 = JagString.parse("Chargement des sprites )2 ");

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!na;")
	public static final JagString FR_REMOVEIGNORE = JagString.parse(" de votre liste noire)3");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD40B = JagString.parse("Liste des mises -9 jour charg-Be");

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD80B = JagString.parse("Sprites charg-Bs");

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "Lclient!na;")
	public static final JagString FR_DROP = JagString.parse("Poser");

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!na;")
	public static final JagString FR_OK = JagString.parse("OK");

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!na;")
	public static final JagString FR_CHATEFFECT5 = JagString.parse("glissement:");

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!na;")
	public static final JagString FR_ATTACK = JagString.parse("Attaquer");

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!na;")
	public static final JagString FR_TAKE = JagString.parse("Prendre");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!na;")
	public static final JagString FR_REMOVEFRIEND = JagString.parse(" de votre liste d(Wamis)3");

	@OriginalMember(owner = "client!hm", name = "lb", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD45B = JagString.parse("Moteur son pr-Bpar-B");

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD0 = JagString.parse("M-Bmoire en cours d(Wattribution");

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "Lclient!na;")
	public static final JagString FR_CONTINUE = JagString.parse("Continuer");

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!na;")
	public static final JagString FR_CHATCOL3 = JagString.parse("cyan:");

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD30 = JagString.parse("Connexion au serveur de mise -9 jour en cours");

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOLAD120 = JagString.parse("Chargement du module texte )2 ");

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!na;")
	public static final JagString FR_MAINLOAD60 = JagString.parse("Chargement de l(W-Bcran)2titre )2 ");

	@OriginalMember(owner = "client!gg", name = "jb", descriptor = "Lclient!na;")
	public static final JagString FR_IGNORELISTDUPE = JagString.parse(" est d-Bj-9 dans votre liste noire)3");

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!na;")
	public static final JagString FR_MOREOPTIONS = JagString.parse(" autres options");

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lclient!na;")
	public static final JagString FR_FRIENDLOGIN = JagString.parse(" s(West connect-B)3");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void switchToFrench() {
		MAINLOAD70B = FR_MAINLOAD70B;
		MAINLOAD70 = FR_MAINLOAD70;
		CHATCOL4 = FR_CHATCOL4;
		CONTINUE = FR_CONTINUE;
		SKILL = FR_SKILL;
		EXAMINE = FR_EXAMINE;
		MAINLOAD120 = FR_MAINLOLAD120;
		CHATCOL10 = FR_CHATCOL10;
		MILLION_SHORT = FR_MILLION_SUFFIX;
		CHATCOL7 = FR_CHATCOL7;
		CHATEFFECT2 = FR_CHATEFFECT2;
		ATTACK = FR_ATTACK;
		FRIENDLISTFULL = FR_FRIENDLISTFULL;
		IGNORELISTDUPE = FR_IGNORELISTDUPE;
		MAINLOAD135B = FR_MAINLOAD135B;
		MAINLOAD110B = FR_MAINLOAD110B;
		CHATCOL1 = FR_CHATCOL1;
		CHATEFFECT1 = FR_CHATEFFECT1;
		MAINLOAD30 = FR_MAINLOAD30;
		FRIENDLISTDUPE = FR_FRIENDSLISTDUPE;
		CHATEFFECT3 = FR_CHATEFFECT3;
		MAINLOAD60 = FR_MAINLOAD60;
		MOREOPTIONS = FR_MOREOPTIONS;
		MAINLOAD65B = FR_MAINLOAD65B;
		MAINLOAD150B = FR_MAINLOAD150B;
		PLEASEWAIT = FR_PLEASEWAIT;
		FACEHERE = FR_FACEHERE;
		MILLION = FR_MILLION_SUFFIX;
		FRIENDLOGIN = FR_FRIENDLOGIN;
		CHATCOL3 = FR_CHATCOL3;
		MAINLOAD50 = FR_MAINLOAD50;
		CHATCOL8 = FR_CHATCOL8;
		OK = FR_OK;
		IGNORECANTADDSELF = FR_IGNORECANTADDSELF;
		MAINLOAD90B = FR_MAINLOAD90B;
		CHATCOL11 = FR_CHATCOL11;
		MAINLOAD140 = FR_MAINLOAD140;
		CHECKING_FOR_UPDATES = FR_CHECKING_FOR_UPDATES;
		ATTEMPT_TO_REESTABLISH = FR_ATTEMPT_TO_REESTABLISH;
		CHATEFFECT5 = FR_CHATEFFECT5;
		MAINLOAD0 = FR_MAINLOAD0;
		MAINLOAD45B = FR_MAINLOAD45B;
		MAINLOAD0B = FR_MAINLOAD0B;
		DROP = FR_DROP;
		MINISEPARATOR = FR_MINISEPARATOR;
		WALKHERE = FR_WALKHERE;
		UNABLETOFIND = FR_UNABLETOFIND;
		MAINLOAD60B = FR_MAINLOAD60B;
		REMOVEFRIEND = FR_REMOVEFRIEND;
		MAINLOAD80 = FR_MAINLOAD80;
		MEMBERS_OBJECT = FR_MEMBERS_OBJECT;
		MAINLOAD40B = FR_MAINLOAD40B;
		MAINLOAD50B = FR_MAINLOAD50B;
		TAKE = FR_TAKE;
		RATING = FR_RATING;
		LENT_ITEM_RETURN = FR_LENT_ITEM_RETURN;
		CLOSE = FR_CLOSE;
		TRADEREQ = FR_TRADEREQ;
		CHATCOL0 = FR_CHATCOL0;
		REMOVEIGNORE = FR_REMOVEIGNORE;
		CHATCOL9 = FR_CHATCOL9;
		CHOOSE_OPTION = FR_CHOOSE_OPTION;
		LOADINGDOTDOTDOT = FR_LOADINGDOTDOTDOT;
		CHATCOL5 = FR_CHATCOL5;
		MAINLOAD80B = FR_MAINLOAD80B;
		MAINLOAD130 = FR_MAINLOAD130;
		FRIENDCANTADDSELF = FR_FRIENDCANTADDSELF;
		REMOVESOCIAL1 = FR_REMOVESOCIAL;
		CANCEL = FR_CANCEL;
		MAINLOAD120B = FR_MAINLOAD120B;
		MAINLOAD10B = FR_MAINLOAD10B;
		THOUSAND = FR_THOUSAND_SUFFIX;
		LEVEL = FR_LEVEL;
		THOUSAND_SHORT = FR_THOUSAND_SUFFIX;
		SELECT = FR_SELECT;
		CONLOST = FR_CONLOST;
		IGNORELISTFULL = FR_IGNORELISTFULL;
		MAINLOAD130B = FR_MAINLOAD130B;
		GAME0_LOADING = FR_GAME0_LOADING;
		CHATCOL6 = FR_CHATCOL6;
		REMOVESOCIAL2 = FR_REMOVESOCIAL;
		CHATCOL2 = FR_CHATCOL2;
		HIDDEN = FR_HIDDEN;
		LOADING = FR_LOADING;
		MAINLOAD30B = FR_MAINLOAD30B;
		FRIENDLOGOUT = FR_FRIENDLOGOUT;
		MAINLOAD90 = FR_MAINLOAD90;
		USE = FR_USE;
		CHATEFFECT4 = FR_CHATEFFECT4;
		MAINLOAD135 = FR_MAINLOAD135;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public static void setLanguage(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			switchToGerman();
		} else if (arg0 == 2) {
			switchToFrench();
		} else {
			throw new RuntimeException();
		}
	}
	//endregion
}
