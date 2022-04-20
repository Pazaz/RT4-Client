import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lclient!le;")
	public static SoundBank aClass89_1;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "[I")
	public static final int[] anIntArray70 = new int[32];

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "Lclient!n;")
	public static final SoftLruHashTable aClass99_4 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!na;")
	public static final JagString aClass100_164 = Static28.parse(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lclient!na;")
	public static final JagString aClass100_165 = Static28.parse("titlebg");

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lclient!na;")
	public static final JagString aClass100_167 = Static28.parse("name_icons");

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lclient!na;")
	public static final JagString aClass100_168 = Static28.parse(": ");

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
	public static void setMaterial(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 4 && !Static220.aBoolean244) {
			arg1 = 2;
			arg0 = 2;
		}
		if (Static48.anInt1447 != arg1) {
			if (Static119.aBoolean153) {
				return;
			}
			if (Static48.anInt1447 != 0) {
				Static2.anInterface4Array1[Static48.anInt1447].method4602();
			}
			if (arg1 != 0) {
				@Pc(61) MaterialRenderer local61 = Static2.anInterface4Array1[arg1];
				local61.method4603();
				local61.method4604(arg0);
			}
			Static48.anInt1447 = arg1;
			Static158.anInt3857 = arg0;
		} else if (arg1 != 0 && arg0 != Static158.anInt3857) {
			Static2.anInterface4Array1[arg1].method4604(arg0);
			Static158.anInt3857 = arg0;
		}
	}
}
