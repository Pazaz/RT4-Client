import org.openrs2.deob.annotation.OriginalMember;

import java.math.BigInteger;

public class GlobalConfig {

    //region 2009scape-compatibility Configuration
    // RSA public key
    public static final BigInteger RSA_MODULUS = new BigInteger("96982303379631821170939875058071478695026608406924780574168393250855797534862289546229721580153879336741968220328805101128831071152160922518190059946555203865621183480223212969502122536662721687753974815205744569357388338433981424032996046420057284324856368815997832596174397728134370577184183004453899764051");
    public static final BigInteger RSA_EXPONENT = new BigInteger("65537");

    // Server IP
    public static String DEFAULT_HOSTNAME = "play.2009scape.org";

    // Jagex had this at 40000+id
    public static int DEFAULT_PORT = 43594;

    // Jagex had this at 50000+id/443
    public static int ALTERNATE_PORT = 43593;

    // If this isn't set, the world server will need to send a default
    public static boolean SELECT_DEFAULT_WORLD = true;

    // Packet opcode encryption
    public static boolean USE_ISAAC = false;
    //endregion

}
