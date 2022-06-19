import org.openrs2.deob.annotation.OriginalMember;

import java.math.BigInteger;

public class GlobalConfig {

    //region 2009scape-compatibility Configuration
    // Server IP
    public static String DEFAULT_HOSTNAME = "test.2009scape.org";

    // Jagex had this at 40000+id
    public static int DEFAULT_PORT = 43594;

    // Jagex had this at 50000+id/443
    public static int ALTERNATE_PORT = 43593;
    //endregion

}
