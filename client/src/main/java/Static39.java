import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!ve;")
	public static Js5 aClass153_23;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "Lclient!be;")
	public static Component aClass13_10 = null;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!d", name = "db", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[S")
	public static final short[] aShortArray6 = new short[500];

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)I")
	public static int method990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
