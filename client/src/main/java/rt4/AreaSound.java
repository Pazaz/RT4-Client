package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class AreaSound extends Node {

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt2028;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt2032;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Lclient!b;")
	public SoundPcmStream primaryStream;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
	public int anInt2033;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Lclient!b;")
	public SoundPcmStream secondaryStream;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "Lclient!pb;")
	public LocType locType;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Lclient!km;")
	public Npc npc;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	public int anInt2040;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
	public int anInt2041;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "Lclient!e;")
	public Player player;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public int radius;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "Z")
	public boolean multiLocOrNpc;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
	public int sound;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "[I")
	public int[] sounds;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	public int anInt2038 = 0;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public final void update() {
		@Pc(8) int local8 = this.sound;
		if (this.locType != null) {
			@Pc(17) LocType local17 = this.locType.getMultiLoc();
			if (local17 == null) {
				this.sound = -1;
				this.sounds = null;
				this.anInt2040 = 0;
				this.radius = 0;
				this.anInt2032 = 0;
			} else {
				this.anInt2040 = local17.anInt4414;
				this.sound = local17.sound;
				this.anInt2032 = local17.anInt4419;
				this.radius = local17.soundRadius * 128;
				this.sounds = local17.anIntArray381;
			}
		} else if (this.npc != null) {
			@Pc(92) int local92 = Static112.getSound(this.npc);
			if (local8 != local92) {
				@Pc(100) NpcType local100 = this.npc.type;
				this.sound = local92;
				if (local100.multiNpcs != null) {
					local100 = local100.getMultiNpc();
				}
				if (local100 == null) {
					this.radius = 0;
				} else {
					this.radius = local100.soundRadius * 128;
				}
			}
		} else if (this.player != null) {
			this.sound = Static140.getSound(this.player);
			this.radius = this.player.soundRadius * 128;
		}
		if (this.sound != local8 && this.primaryStream != null) {
			client.soundStream.removeSubStream(this.primaryStream);
			this.primaryStream = null;
		}
	}
}
