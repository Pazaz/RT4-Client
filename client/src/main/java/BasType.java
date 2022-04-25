import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class BasType {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[[I")
	public int[][] modelRotateTranslate;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public int anInt1036 = -1;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
	public int idleAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	public int runAnimationId3 = -1;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public int anInt1041 = 0;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
	public int anInt1042 = -1;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public int anInt1031 = 0;

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
	public int anInt1050 = 0;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	public int anInt1048 = -1;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
	public int runAnimationId2 = -1;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	public int anInt1055 = 0;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	public int turnAnimation3 = -1;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
	public int turnAnimation1 = -1;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public int anInt1032 = -1;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
	public int walkAnimation = -1;

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
	public int anInt1059 = 0;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	public int runAnimationId4 = -1;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	public int anInt1038 = 0;

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
	public int anInt1065 = 0;

	@OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
	public int anInt1062 = -1;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
	public int anInt1040 = 0;

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	public int runAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
	public int anInt1066 = -1;

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
	public int anInt1063 = 0;

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
	public int turnAnimation2 = -1;

	@OriginalMember(owner = "client!ck", name = "jb", descriptor = "I")
	public int anInt1067 = -1;

	@OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
	public int anInt1064 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public final void method878() {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.g1();
			if (local16 == 0) {
				return;
			}
			this.method881(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBLclient!wa;)V")
	private void method881(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		if (arg0 == 1) {
			this.idleAnimationId = arg1.g2();
			this.walkAnimation = arg1.g2();
			if (this.walkAnimation == 65535) {
				this.walkAnimation = -1;
			}
			if (this.idleAnimationId == 65535) {
				this.idleAnimationId = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1062 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt1042 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt1066 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt1048 = arg1.g2();
		} else if (arg0 == 6) {
			this.runAnimationId = arg1.g2();
		} else if (arg0 == 7) {
			this.runAnimationId2 = arg1.g2();
		} else if (arg0 == 8) {
			this.runAnimationId3 = arg1.g2();
		} else if (arg0 == 9) {
			this.runAnimationId4 = arg1.g2();
		} else if (arg0 == 26) {
			this.anInt1059 = (short) (arg1.g1() * 4);
			this.anInt1050 = (short) (arg1.g1() * 4);
		} else if (arg0 == 27) {
			if (this.modelRotateTranslate == null) {
				this.modelRotateTranslate = new int[12][];
			}
			@Pc(306) int bodyId = arg1.g1();
			this.modelRotateTranslate[bodyId] = new int[6];
			for (@Pc(314) int type = 0; type < 6; type++) {
				this.modelRotateTranslate[bodyId][type] = arg1.g2s();
			}
		} else if (arg0 == 29) {
			this.anInt1038 = arg1.g1();
		} else if (arg0 == 30) {
			this.anInt1031 = arg1.g2();
		} else if (arg0 == 31) {
			this.anInt1055 = arg1.g1();
		} else if (arg0 == 32) {
			this.anInt1040 = arg1.g2();
		} else if (arg0 == 33) {
			this.anInt1064 = arg1.g2s();
		} else if (arg0 == 34) {
			this.anInt1065 = arg1.g1();
		} else if (arg0 == 35) {
			this.anInt1063 = arg1.g2();
		} else if (arg0 == 36) {
			this.anInt1041 = arg1.g2s();
		} else if (arg0 == 37) {
			this.anInt1032 = arg1.g1();
		} else if (arg0 == 38) {
			this.anInt1036 = arg1.g2();
		} else if (arg0 == 39) {
			this.anInt1067 = arg1.g2();
		} else if (arg0 == 40) {
			this.turnAnimation1 = arg1.g2();
		} else if (arg0 == 41) {
			this.turnAnimation2 = arg1.g2();
		} else if (arg0 == 42) {
			this.turnAnimation3 = arg1.g2();
		} else if (arg0 == 43) {
			arg1.g2();
		} else if (arg0 == 44) {
			arg1.g2();
		} else if (arg0 == 45) {
			arg1.g2();
		}
	}
}
