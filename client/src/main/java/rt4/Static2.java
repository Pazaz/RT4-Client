package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public static int anInt15;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt7 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(SI)Z")
	public static boolean method5(@OriginalArg(0) short arg0) {
		if (arg0 == 47 || arg0 == 5 || arg0 == 43 || arg0 == 35 || arg0 == 58 || arg0 == 22 || arg0 == 40 || arg0 == 3) {
			return true;
		} else if (arg0 == 9 || arg0 == 12 || arg0 == 1006 || arg0 == 1003) {
			return true;
		} else if (arg0 == 25 || arg0 == 23 || arg0 == 48 || arg0 == 7 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 32 || arg0 == 28 || arg0 == 59 || arg0 == 51 || arg0 == 41;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lclient!be;ZI)V")
	public static void method7(@OriginalArg(0) Component[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Component local23 = arg0[local11];
			if (local23 != null) {
				if (local23.type == 0) {
					if (local23.createdComponents != null) {
						method7(local23.createdComponents, arg1);
					}
					@Pc(49) ComponentPointer local49 = (ComponentPointer) InterfaceList.openInterfaces.get((long) local23.id);
					if (local49 != null) {
						Static54.runScripts(arg1, local49.anInt5878);
					}
				}
				@Pc(72) HookRequest local72;
				if (arg1 == 0 && local23.onDialogAbort != null) {
					local72 = new HookRequest();
					local72.arguments = local23.onDialogAbort;
					local72.source = local23;
					ScriptRunner.run(local72);
				}
				if (arg1 == 1 && local23.onWidgetsOpenClose != null) {
					if (local23.createdComponentId >= 0) {
						@Pc(103) Component local103 = InterfaceList.getComponent(local23.id);
						if (local103 == null || local103.createdComponents == null || local23.createdComponentId >= local103.createdComponents.length || local103.createdComponents[local23.createdComponentId] != local23) {
							continue;
						}
					}
					local72 = new HookRequest();
					local72.arguments = local23.onWidgetsOpenClose;
					local72.source = local23;
					ScriptRunner.run(local72);
				}
			}
		}
	}

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!be;)V")
	public static void method13(@OriginalArg(1) Component arg0) {
		@Pc(16) int local16 = arg0.anInt453;
		if (local16 == 324) {
			if (Static158.anInt3851 == -1) {
				Static158.anInt3851 = arg0.spriteId;
				Static145.anInt3502 = arg0.anInt519;
			}
			if (PlayerAppearance.DEFAULT.gender) {
				arg0.spriteId = Static158.anInt3851;
			} else {
				arg0.spriteId = Static145.anInt3502;
			}
		} else if (local16 == 325) {
			if (Static158.anInt3851 == -1) {
				Static145.anInt3502 = arg0.anInt519;
				Static158.anInt3851 = arg0.spriteId;
			}
			if (PlayerAppearance.DEFAULT.gender) {
				arg0.spriteId = Static145.anInt3502;
			} else {
				arg0.spriteId = Static158.anInt3851;
			}
		} else if (local16 == 327) {
			arg0.modelXAngle = 150;
			arg0.modelYAngle = (int) (Math.sin((double) client.loop / 40.0D) * 256.0D) & 0x7FF;
			arg0.modelType = 5;
			arg0.modelId = -1;
		} else if (local16 == 328) {
			if (PlayerList.self.username == null) {
				arg0.modelId = 0;
			} else {
				arg0.modelXAngle = 150;
				arg0.modelYAngle = (int) (Math.sin((double) client.loop / 40.0D) * 256.0D) & 0x7FF;
				arg0.modelType = 5;
				arg0.modelId = ((int) PlayerList.self.username.encode37() << 11) + 2047;
				arg0.anInt496 = PlayerList.self.anInt3388;
				arg0.anInt500 = 0;
				arg0.modelSeqId = PlayerList.self.movementSeqId;
				arg0.anInt510 = PlayerList.self.anInt3407;
			}
		}
	}
}
