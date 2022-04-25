package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!hg;)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(1) GlTile[] arg1) {
		Static182.aClass3_Sub14ArrayArray2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	public static void method2281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) AreaSound local6;
		for (local6 = (AreaSound) Static3.aClass69_135.method2289(); local6 != null; local6 = (AreaSound) Static3.aClass69_135.method2288()) {
			Static150.method2804(arg1, local6, arg3, arg0, arg2);
		}
		@Pc(37) byte local37;
		@Pc(42) BasType local42;
		@Pc(141) int local141;
		for (local6 = (AreaSound) Static152.aClass69_87.method2289(); local6 != null; local6 = (AreaSound) Static152.aClass69_87.method2288()) {
			local37 = 1;
			local42 = local6.npc.method2681();
			if (local42.idleAnimationId == local6.npc.anInt3366) {
				local37 = 0;
			} else if (local42.runAnimationId == local6.npc.anInt3366 || local42.runAnimationId2 == local6.npc.anInt3366 || local42.runAnimationId4 == local6.npc.anInt3366 || local42.runAnimationId3 == local6.npc.anInt3366) {
				local37 = 2;
			} else if (local42.anInt1062 == local6.npc.anInt3366 || local42.anInt1042 == local6.npc.anInt3366 || local6.npc.anInt3366 == local42.anInt1048 || local42.anInt1066 == local6.npc.anInt3366) {
				local37 = 3;
			}
			if (local6.anInt2038 != local37) {
				local141 = Static112.getSound(local6.npc);
				if (local141 != local6.sound) {
					if (local6.primaryStream != null) {
						client.soundStream.removeSubStream(local6.primaryStream);
						local6.primaryStream = null;
					}
					local6.sound = local141;
				}
				local6.anInt2038 = local37;
			}
			local6.anInt2041 = local6.npc.xFine;
			local6.anInt2037 = local6.npc.xFine + local6.npc.getSize() * 64;
			local6.anInt2029 = local6.npc.zFine;
			local6.anInt2028 = local6.npc.zFine + local6.npc.getSize() * 64;
			Static150.method2804(arg1, local6, arg3, arg0, arg2);
		}
		for (local6 = (AreaSound) AreaSoundManager.aClass133_7.head(); local6 != null; local6 = (AreaSound) AreaSoundManager.aClass133_7.next()) {
			local37 = 1;
			local42 = local6.player.method2681();
			if (local6.player.anInt3366 == local42.idleAnimationId) {
				local37 = 0;
			} else if (local6.player.anInt3366 == local42.runAnimationId || local6.player.anInt3366 == local42.runAnimationId2 || local6.player.anInt3366 == local42.runAnimationId4 || local42.runAnimationId3 == local6.player.anInt3366) {
				local37 = 2;
			} else if (local42.anInt1062 == local6.player.anInt3366 || local6.player.anInt3366 == local42.anInt1042 || local6.player.anInt3366 == local42.anInt1048 || local6.player.anInt3366 == local42.anInt1066) {
				local37 = 3;
			}
			if (local6.anInt2038 != local37) {
				local141 = Static140.getSound(local6.player);
				if (local6.sound != local141) {
					if (local6.primaryStream != null) {
						client.soundStream.removeSubStream(local6.primaryStream);
						local6.primaryStream = null;
					}
					local6.sound = local141;
				}
				local6.anInt2038 = local37;
			}
			local6.anInt2041 = local6.player.xFine;
			local6.anInt2037 = local6.player.xFine + local6.player.getSize() * 64;
			local6.anInt2029 = local6.player.zFine;
			local6.anInt2028 = local6.player.zFine + local6.player.getSize() * 64;
			Static150.method2804(arg1, local6, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZII)Lclient!na;")
	public static JagString method2285(@OriginalArg(2) int arg0) {
		return Static198.method1025(true, arg0);
	}
}
