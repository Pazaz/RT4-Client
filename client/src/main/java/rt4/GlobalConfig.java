package rt4;

import org.openrs2.deob.annotation.OriginalMember;

import java.math.BigInteger;

public class GlobalConfig {
	// Jagex's RSA key:
	// public static final BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	// public static final BigInteger RSA_EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	//region 2009scape-compatibility Configuration
	@OriginalMember(owner = "client!um", name = "V", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger RSA_MODULUS = new BigInteger("96982303379631821170939875058071478695026608406924780574168393250855797534862289546229721580153879336741968220328805101128831071152160922518190059946555203865621183480223212969502122536662721687753974815205744569357388338433981424032996046420057284324856368815997832596174397728134370577184183004453899764051");

	@OriginalMember(owner = "client!gm", name = "X", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger RSA_EXPONENT = new BigInteger("65537");

	public static String EXTENDED_CONFIG_PATH = "config.json";

	// Server IP
	public static String DEFAULT_HOSTNAME = "test.2009scape.org";

	// Jagex had this at 40000+id
	public static int DEFAULT_PORT = 43594;

	// Jagex had this at 50000+id/443
	public static int ALTERNATE_PORT = 43593;

	// If this isn't set, the world server will need to send a default
	public static boolean SELECT_DEFAULT_WORLD = true;

	// Send strings instead of base37 for login/registration packets
	public static boolean LOGIN_USE_STRINGS = true;

	// Send additional information like user/serial/mac address
	public static boolean LOGIN_EXTRA_INFO = true;

	// Send an additional empty CRC for idx28 (not in this revision originally)
	public static boolean LOGIN_FAKE_IDX28 = true;

	// Packet opcode encryption
	public static boolean USE_ISAAC = false;
	//endregion

	// default distance is 28
	public static int TILE_DISTANCE = 56;
	public static int VIEW_DISTANCE = TILE_DISTANCE * 128;
	public static float VIEW_FADE_DISTANCE = ((float) TILE_DISTANCE / 28.0f) * 256.0f;

	public static boolean USE_SHIFT_CLICK = true;
	public static boolean USE_TWEENING = true;
	public static boolean BILINEAR_MINIMAP = true;
	public static boolean MOUSEWHEEL_ZOOM = true;

	public static int JS5_RESPONSE_TIMEOUT = 5000;

}
