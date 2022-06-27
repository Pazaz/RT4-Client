package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray116 = new boolean[100];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILclient!km;)V")
	public static void animateNpc(@OriginalArg(0) int arg0, @OriginalArg(1) int animationId, @OriginalArg(3) Npc npc) {
		if (npc.seqId == animationId && animationId != -1) {
			@Pc(10) SeqType seqType = SeqTypeList.get(animationId);
			@Pc(13) int local13 = seqType.anInt5347;
			if (local13 == 1) {
				npc.anInt3373 = 1;
				npc.anInt3425 = 0;
				npc.anInt3360 = 0;
				npc.anInt3371 = 0;
				npc.anInt3420 = arg0;
				SoundPlayer.playSeqSound(npc.zFine, seqType, npc.xFine, false, npc.anInt3425);
			}
			if (local13 == 2) {
				npc.anInt3371 = 0;
			}
		} else if (animationId == -1 || npc.seqId == -1 || SeqTypeList.get(animationId).forcedPriority >= SeqTypeList.get(npc.seqId).forcedPriority) {
			npc.anInt3360 = 0;
			npc.seqId = animationId;
			npc.anInt3373 = 1;
			npc.anInt3371 = 0;
			npc.anInt3420 = arg0;
			npc.anInt3405 = npc.movementQueueSize;
			npc.anInt3425 = 0;
			if (npc.seqId != -1) {
				SoundPlayer.playSeqSound(npc.zFine, SeqTypeList.get(npc.seqId), npc.xFine, false, npc.anInt3425);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public static void method3858() {
		for (@Pc(1) int local1 = 0; local1 < SceneGraph.sceneryLen; local1++) {
			@Pc(8) Scenery local8 = SceneGraph.scenery[local1];
			SceneGraph.removeScenery(local8);
			SceneGraph.scenery[local1] = null;
		}
		SceneGraph.sceneryLen = 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lclient!j;")
	public static TextureOp method3860(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new TextureOp20();
		} else if (arg0 == 1) {
			return new TextureOpColorFill();
		} else if (arg0 == 2) {
			return new TextureOp27();
		} else if (arg0 == 3) {
			return new TextureOp25();
		} else if (arg0 == 4) {
			return new TextureOp17();
		} else if (arg0 == 5) {
			return new TextureOp21();
		} else if (arg0 == 6) {
			return new TextureOp2();
		} else if (arg0 == 7) {
			return new TextureOpCombine();
		} else if (arg0 == 8) {
			return new TextureOpCurve();
		} else if (arg0 == 9) {
			return new TextureOp7();
		} else if (arg0 == 10) {
			return new TextureOpColorGradient();
		} else if (arg0 == 11) {
			return new TextureOp18();
		} else if (arg0 == 12) {
			return new TextureOp1();
		} else if (arg0 == 13) {
			return new TextureOp26();
		} else if (arg0 == 14) {
			return new TextureOp28();
		} else if (arg0 == 15) {
			return new TextureOp14();
		} else if (arg0 == 16) {
			return new TextureOp8();
		} else if (arg0 == 17) {
			return new TextureOp13();
		} else if (arg0 == 18) {
			return new TextureOpTiledSprite();
		} else if (arg0 == 19) {
			return new TextureOp16();
		} else if (arg0 == 20) {
			return new TextureOp11();
		} else if (arg0 == 21) {
			return new TextureOp5();
		} else if (arg0 == 22) {
			return new TextureOp31();
		} else if (arg0 == 23) {
			return new TextureOp15();
		} else if (arg0 == 24) {
			return new TextureOp10();
		} else if (arg0 == 25) {
			return new TextureOp30();
		} else if (arg0 == 26) {
			return new TextureOpBinary();
		} else if (arg0 == 27) {
			return new TextureOp6();
		} else if (arg0 == 28) {
			return new TextureOp22();
		} else if (arg0 == 29) {
			return new TextureOp29();
		} else if (arg0 == 30) {
			return new TextureOp9();
		} else if (arg0 == 31) {
			return new TextureOp12();
		} else if (arg0 == 32) {
			return new TextureOp24();
		} else if (arg0 == 33) {
			return new TextureOp3();
		} else if (arg0 == 34) {
			return new TextureOp4();
		} else if (arg0 == 35) {
			return new TextureOp23();
		} else if (arg0 == 36) {
			return new TextureOp32();
		} else if (arg0 == 37) {
			return new TextureOp19();
		} else if (arg0 == 38) {
			return new TextureOp33();
		} else if (arg0 == 39) {
			return new TextureOpSprite();
		} else {
			return null;
		}
	}

}
