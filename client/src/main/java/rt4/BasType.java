package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class BasType {

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!ck;")
	public static final BasType DEFAULT = new BasType();

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[[I")
	public int[][] modelRotateTranslate;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public int standingCCWTurn = -1;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
	public int idleAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	public int runCCWTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public int pitchTargetAngle = 0;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
	public int slowWalkFullTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public int yawMaxSpeed = 0;

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
	public int anInt1050 = 0;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	public int slowWalkCWTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
	public int runFullTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	public int rollAcceleration = 0;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	public int walkCWTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
	public int walkFullTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public int movementAcceleration = -1;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
	public int walkAnimation = -1;

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
	public int anInt1059 = 0;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	public int runCWTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	public int yawAcceleration = 0;

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
	public int pitchAcceleration = 0;

	@OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
	public int slowWalkAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
	public int rollMaxSpeed = 0;

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	public int runAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
	public int slowWalkCCWTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
	public int pitchMaxSpeed = 0;

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
	public int walkCCWTurnAnimationId = -1;

	@OriginalMember(owner = "client!ck", name = "jb", descriptor = "I")
	public int standingCWTurn = -1;

	@OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
	public int rollTargetAngle = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public final void method878() {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!wa;)V")
	public final void decode(@OriginalArg(1) Buffer buffer) {
		while (true) {
			@Pc(16) int opcode = buffer.g1();
			if (opcode == 0) {
				return;
			}
			this.decode(opcode, buffer);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBLclient!wa;)V")
	private void decode(@OriginalArg(0) int opcode, @OriginalArg(2) Buffer buffer) {
		if (opcode == 1) {
			this.idleAnimationId = buffer.g2();
			this.walkAnimation = buffer.g2();
			if (this.walkAnimation == 65535) {
				this.walkAnimation = -1;
			}
			if (this.idleAnimationId == 65535) {
				this.idleAnimationId = -1;
			}
		} else if (opcode == 2) {
			this.slowWalkAnimationId = buffer.g2();
		} else if (opcode == 3) {
			this.slowWalkFullTurnAnimationId = buffer.g2();
		} else if (opcode == 4) {
			this.slowWalkCCWTurnAnimationId = buffer.g2();
		} else if (opcode == 5) {
			this.slowWalkCWTurnAnimationId = buffer.g2();
		} else if (opcode == 6) {
			this.runAnimationId = buffer.g2();
		} else if (opcode == 7) {
			this.runFullTurnAnimationId = buffer.g2();
		} else if (opcode == 8) {
			this.runCCWTurnAnimationId = buffer.g2();
		} else if (opcode == 9) {
			this.runCWTurnAnimationId = buffer.g2();
		} else if (opcode == 26) {
			this.anInt1059 = (short) (buffer.g1() * 4);
			this.anInt1050 = (short) (buffer.g1() * 4);
		} else if (opcode == 27) {
			if (this.modelRotateTranslate == null) {
				this.modelRotateTranslate = new int[12][];
			}
			@Pc(306) int bodyId = buffer.g1();
			this.modelRotateTranslate[bodyId] = new int[6];
			for (@Pc(314) int type = 0; type < 6; type++) {
				/*
				 * 0 -Rotate X
				 * 1 - Rotate Y
				 * 2 - Rotate Z
				 * 3 - Translate X
				 * 4 - Translate Y
				 * 5 - Translate Z
				 */
				this.modelRotateTranslate[bodyId][type] = buffer.g2b();
			}
		} else if (opcode == 29) {
			this.yawAcceleration = buffer.g1();
		} else if (opcode == 30) {
			this.yawMaxSpeed = buffer.g2();
		} else if (opcode == 31) {
			this.rollAcceleration = buffer.g1();
		} else if (opcode == 32) {
			this.rollMaxSpeed = buffer.g2();
		} else if (opcode == 33) {
			this.rollTargetAngle = buffer.g2b();
		} else if (opcode == 34) {
			this.pitchAcceleration = buffer.g1();
		} else if (opcode == 35) {
			this.pitchMaxSpeed = buffer.g2();
		} else if (opcode == 36) {
			this.pitchTargetAngle = buffer.g2b();
		} else if (opcode == 37) {
			this.movementAcceleration = buffer.g1();
		} else if (opcode == 38) {
			this.standingCCWTurn = buffer.g2();
		} else if (opcode == 39) {
			this.standingCWTurn = buffer.g2();
		} else if (opcode == 40) {
			this.walkFullTurnAnimationId = buffer.g2();
		} else if (opcode == 41) {
			this.walkCCWTurnAnimationId = buffer.g2();
		} else if (opcode == 42) {
			this.walkCWTurnAnimationId = buffer.g2();
		} else if (opcode == 43) {
			buffer.g2();
		} else if (opcode == 44) {
			buffer.g2();
		} else if (opcode == 45) {
			buffer.g2();
		}
	}
}
