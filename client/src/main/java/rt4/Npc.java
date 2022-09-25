package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Npc extends PathingEntity {

	@OriginalMember(owner = "client!km", name = "rc", descriptor = "Lclient!me;")
	public NpcType type;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!km;I)I")
	public static int getSound(@OriginalArg(0) Npc npc) {
		@Pc(13) NpcType npcType = npc.type;
		if (npcType.multiNpcs != null) {
			npcType = npcType.getMultiNpc();
			if (npcType == null) {
				return -1;
			}
		}
		@Pc(29) int sound = npcType.walkSound;
		@Pc(33) BasType npcBas = npc.getBasType();
		if (npcBas.idleAnimationId == npc.movementSeqId) {
			sound = npcType.idleSound;
		} else if (npc.movementSeqId == npcBas.runAnimationId || npcBas.runFullTurnAnimationId == npc.movementSeqId || npc.movementSeqId == npcBas.runCWTurnAnimationId || npc.movementSeqId == npcBas.runCCWTurnAnimationId) {
			sound = npcType.runSound;
		} else if (npcBas.slowWalkAnimationId == npc.movementSeqId || npc.movementSeqId == npcBas.slowWalkFullTurnAnimationId || npc.movementSeqId == npcBas.slowWalkCWTurnAnimationId || npc.movementSeqId == npcBas.slowWalkCCWTurnAnimationId) {
			sound = npcType.crawlSound;
		}
		return sound;
	}

	@OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()I")
	@Override
	public final int getMinY() {
		return this.minY;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void render(@OriginalArg(0) int orientation, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int x, @OriginalArg(6) int z, @OriginalArg(7) int y, @OriginalArg(8) long key, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (this.type == null) {
			return;
		}

		@Pc(29) SeqType local29 = this.seqId != -1 && this.anInt3420 == 0 ? SeqTypeList.get(this.seqId) : null;
		@Pc(53) SeqType local53 = this.movementSeqId == -1 || this.movementSeqId == this.getBasType().idleAnimationId && local29 != null ? null : SeqTypeList.get(this.movementSeqId);
		@Pc(74) Model body = this.type.getBodyModel(this.aClass147Array3, this.anInt3388, this.anInt3407, this.anInt3373, this.anInt3360, this.anInt3425, local53, this.anInt3396, local29);
		if (body == null) {
			return;
		}

		this.minY = body.getMinY();
		@Pc(84) NpcType local84 = this.type;
		if (local84.multiNpcs != null) {
			local84 = local84.getMultiNpc();
		}

		@Pc(140) Model model;
		if (Preferences.characterShadowsOn && local84.hasshadow) {
			model = ShadowModelList.method1043(this.type.shadowcolormodifier1, this.aBoolean171, local53 == null ? local29 : local53, this.xFine, this.type.shadowcolor2, this.zFine, this.type.shadowcolor1, this.type.size, body, orientation, local53 == null ? this.anInt3425 : this.anInt3407, this.anInt3424, this.type.shadowcolormodifier2);
			if (GlRenderer.enabled) {
				@Pc(144) float local144 = GlRenderer.method4179();
				@Pc(146) float local146 = GlRenderer.method4166();
				GlRenderer.disableDepthMask();
				GlRenderer.method4152(local144, local146 - 150.0F);
				model.render(0, arg1, arg2, arg3, arg4, x, z, y, -1L, arg9, this.particleSystem);
				GlRenderer.enableDepthMask();
				GlRenderer.method4152(local144, local146);
			} else {
				model.render(0, arg1, arg2, arg3, arg4, x, z, y, -1L, arg9, this.particleSystem);
			}
		}

		this.method2687(body);
		this.method2685(body, orientation);

		model = null;
		if (this.spotAnimId != -1 && this.anInt3399 != -1) {
			@Pc(211) SpotAnimType spotAnimType = SpotAnimTypeList.get(this.spotAnimId);
			model = spotAnimType.constructModel(this.anInt3418, this.anInt3399, this.anInt3361);
			if (model != null) {
				model.translate(0, -this.spotAnimY, 0);

				if (spotAnimType.aBoolean100) {
					if (PathingEntity.anInt2640 != 0) {
						model.rotateX(PathingEntity.anInt2640);
					}
					if (PathingEntity.anInt2680 != 0) {
						model.rotateZ(PathingEntity.anInt2680);
					}
					if (PathingEntity.anInt1938 != 0) {
						model.translate(0, PathingEntity.anInt1938, 0);
					}
				}
			}
		}

		if (!GlRenderer.enabled) {
			if (model != null) {
				body = ((SoftwareModel) body).method4588(model);
			}

			if (this.type.size == 1) {
				body.pickable = true;
			}

			body.render(orientation, arg1, arg2, arg3, arg4, x, z, y, key, arg9, this.particleSystem);
			return;
		}

		if (this.type.size == 1) {
			body.pickable = true;
		}

		body.render(orientation, arg1, arg2, arg3, arg4, x, z, y, key, arg9, this.particleSystem);
		if (model != null) {
			if (this.type.size == 1) {
				model.pickable = true;
			}

			model.render(orientation, arg1, arg2, arg3, arg4, x, z, y, key, arg9, this.particleSystem);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	@Override
	public final int getBasId() {
		if (client.game != 0 && this.type.multiNpcs != null) {
			@Pc(17) NpcType local17 = this.type.getMultiNpc();
			if (local17 != null && local17.bastypeid != -1) {
				return local17.bastypeid;
			}
		}
		return this.anInt3365;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.type == null) {
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean isVisible() {
		return this.type != null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!me;)V")
	public final void setNpcType(@OriginalArg(1) NpcType arg0) {
		this.type = arg0;
		if (this.particleSystem != null) {
			this.particleSystem.method1646();
		}
	}
}
