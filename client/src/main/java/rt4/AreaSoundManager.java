package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class AreaSoundManager {
	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!sc;")
	public static final HashTable playerSounds = new HashTable(16);

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!ih;")
	public static final LinkedList locSounds = new LinkedList();

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!ih;")
	public static final LinkedList npcSounds = new LinkedList();

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!e;I)V")
	public static void remove(@OriginalArg(0) Player player) {
		@Pc(10) AreaSound areaSound = (AreaSound) playerSounds.get(player.username.encode37());
		if (areaSound == null) {
			return;
		}
		if (areaSound.primaryStream != null) {
			client.soundStream.removeSubStream(areaSound.primaryStream);
			areaSound.primaryStream = null;
		}
		areaSound.unlink();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLclient!pb;ILclient!km;IILclient!e;)V")
	public static void add(@OriginalArg(0) int z, @OriginalArg(2) LocType loc, @OriginalArg(3) int arg2, @OriginalArg(4) Npc npc, @OriginalArg(5) int x, @OriginalArg(6) int level, @OriginalArg(7) Player player) {
		@Pc(13) AreaSound sound = new AreaSound();
		sound.minZFine = z * 128;
		sound.minXFine = x * 128;
		sound.level = level;
		if (loc != null) {
			sound.sounds = loc.bgsounds;
			sound.radius = loc.bgsoundrange * 128;
			sound.maxInterval = loc.bgsoundmax;
			sound.locType = loc;
			sound.sound = loc.bgsound;
			sound.minInterval = loc.bgsoundmin;
			@Pc(57) int local57 = loc.width;
			@Pc(60) int local60 = loc.length;
			if (arg2 == 1 || arg2 == 3) {
				local57 = loc.length;
				local60 = loc.width;
			}
			sound.maxZFine = (local60 + z) * 128;
			sound.maxXFine = (x + local57) * 128;
			if (loc.multiLocs != null) {
				sound.multiLocOrNpc = true;
				sound.update();
			}
			if (sound.sounds != null) {
				sound.remainingLoops = sound.minInterval + (int) (Math.random() * (double) (sound.maxInterval - sound.minInterval));
			}
			locSounds.addTail(sound);
		} else if (npc != null) {
			sound.npc = npc;
			@Pc(138) NpcType npcType = npc.type;
			if (npcType.multiNpcs != null) {
				sound.multiLocOrNpc = true;
				npcType = npcType.getMultiNpc();
			}
			if (npcType != null) {
				sound.maxZFine = (npcType.size + z) * 128;
				sound.maxXFine = (npcType.size + x) * 128;
				sound.sound = Npc.getSound(npc);
				sound.radius = npcType.soundRadius * 128;
			}
			npcSounds.addTail(sound);
		} else if (player != null) {
			sound.player = player;
			sound.maxXFine = (player.getSize() + x) * 128;
			sound.maxZFine = (player.getSize() + z) * 128;
			sound.sound = Player.getSound(player);
			sound.radius = player.soundRadius * 128;
			playerSounds.put(sound, player.username.encode37());
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!km;Z)V")
	public static void remove(@OriginalArg(0) Npc npc) {
		for (@Pc(13) AreaSound areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			if (npc == areaSound.npc) {
				if (areaSound.primaryStream != null) {
					client.soundStream.removeSubStream(areaSound.primaryStream);
					areaSound.primaryStream = null;
				}
				areaSound.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
	public static void redraw(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) AreaSound areaSound;
		for (areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			redraw(arg1, areaSound, arg3, arg0, arg2);
		}
		@Pc(37) byte movementSpeed;
		@Pc(42) BasType basType;
		@Pc(141) int sound;
		for (areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			movementSpeed = 1;
			basType = areaSound.npc.getBasType();
			if (basType.idleAnimationId == areaSound.npc.movementSeqId) {
				movementSpeed = 0;
			} else if (basType.runAnimationId == areaSound.npc.movementSeqId || basType.runFullTurnAnimationId == areaSound.npc.movementSeqId || basType.runCWTurnAnimationId == areaSound.npc.movementSeqId || basType.runCCWTurnAnimationId == areaSound.npc.movementSeqId) {
				movementSpeed = 2;
			} else if (basType.slowWalkAnimationId == areaSound.npc.movementSeqId || basType.slowWalkFullTurnAnimationId == areaSound.npc.movementSeqId || areaSound.npc.movementSeqId == basType.slowWalkCWTurnAnimationId || basType.slowWalkCCWTurnAnimationId == areaSound.npc.movementSeqId) {
				movementSpeed = 3;
			}
			if (areaSound.movementSpeed != movementSpeed) {
				sound = Npc.getSound(areaSound.npc);
				if (sound != areaSound.sound) {
					if (areaSound.primaryStream != null) {
						client.soundStream.removeSubStream(areaSound.primaryStream);
						areaSound.primaryStream = null;
					}
					areaSound.sound = sound;
				}
				areaSound.movementSpeed = movementSpeed;
			}
			areaSound.minXFine = areaSound.npc.xFine;
			areaSound.maxXFine = areaSound.npc.xFine + areaSound.npc.getSize() * 64;
			areaSound.minZFine = areaSound.npc.zFine;
			areaSound.maxZFine = areaSound.npc.zFine + areaSound.npc.getSize() * 64;
			redraw(arg1, areaSound, arg3, arg0, arg2);
		}
		for (areaSound = (AreaSound) playerSounds.head(); areaSound != null; areaSound = (AreaSound) playerSounds.next()) {
			movementSpeed = 1;
			basType = areaSound.player.getBasType();
			if (areaSound.player.movementSeqId == basType.idleAnimationId) {
				movementSpeed = 0;
			} else if (areaSound.player.movementSeqId == basType.runAnimationId || areaSound.player.movementSeqId == basType.runFullTurnAnimationId || areaSound.player.movementSeqId == basType.runCWTurnAnimationId || basType.runCCWTurnAnimationId == areaSound.player.movementSeqId) {
				movementSpeed = 2;
			} else if (basType.slowWalkAnimationId == areaSound.player.movementSeqId || areaSound.player.movementSeqId == basType.slowWalkFullTurnAnimationId || areaSound.player.movementSeqId == basType.slowWalkCWTurnAnimationId || areaSound.player.movementSeqId == basType.slowWalkCCWTurnAnimationId) {
				movementSpeed = 3;
			}
			if (areaSound.movementSpeed != movementSpeed) {
				sound = Player.getSound(areaSound.player);
				if (areaSound.sound != sound) {
					if (areaSound.primaryStream != null) {
						client.soundStream.removeSubStream(areaSound.primaryStream);
						areaSound.primaryStream = null;
					}
					areaSound.sound = sound;
				}
				areaSound.movementSpeed = movementSpeed;
			}
			areaSound.minXFine = areaSound.player.xFine;
			areaSound.maxXFine = areaSound.player.xFine + areaSound.player.getSize() * 64;
			areaSound.minZFine = areaSound.player.zFine;
			areaSound.maxZFine = areaSound.player.zFine + areaSound.player.getSize() * 64;
			redraw(arg1, areaSound, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(I)V")
	public static void updateMulti() {
		@Pc(6) AreaSound areaSound;
		for (areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			if (areaSound.multiLocOrNpc) {
				areaSound.update();
			}
		}
		for (areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			if (areaSound.multiLocOrNpc) {
				areaSound.update();
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!pb;BII)V")
	public static void remove(@OriginalArg(0) int x, @OriginalArg(1) LocType locType, @OriginalArg(3) int z, @OriginalArg(4) int level) {
		for (@Pc(10) AreaSound areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			if (level == areaSound.level && areaSound.minXFine == x * 128 && areaSound.minZFine == z * 128 && locType.id == areaSound.locType.id) {
				if (areaSound.primaryStream != null) {
					client.soundStream.removeSubStream(areaSound.primaryStream);
					areaSound.primaryStream = null;
				}
				if (areaSound.secondaryStream != null) {
					client.soundStream.removeSubStream(areaSound.secondaryStream);
					areaSound.secondaryStream = null;
				}
				areaSound.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZ)V")
	public static void clear(@OriginalArg(1) boolean pathingEntities) {
		@Pc(14) AreaSound areaSound;
		for (areaSound = (AreaSound) locSounds.head(); areaSound != null; areaSound = (AreaSound) locSounds.next()) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			if (areaSound.secondaryStream != null) {
				client.soundStream.removeSubStream(areaSound.secondaryStream);
				areaSound.secondaryStream = null;
			}
			areaSound.unlink();
		}
		if (!pathingEntities) {
			return;
		}
		for (areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			areaSound.unlink();
		}
		for (areaSound = (AreaSound) playerSounds.head(); areaSound != null; areaSound = (AreaSound) playerSounds.next()) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			areaSound.unlink();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!fl;IIII)V")
	public static void redraw(@OriginalArg(0) int x, @OriginalArg(1) AreaSound areaSound, @OriginalArg(2) int level, @OriginalArg(3) int loops, @OriginalArg(4) int z) {
		if (areaSound.sound == -1 && areaSound.sounds == null) {
			return;
		}
		@Pc(20) int distance = 0;
		if (areaSound.maxXFine < x) {
			distance = x - areaSound.maxXFine;
		} else if (areaSound.minXFine > x) {
			distance = areaSound.minXFine - x;
		}
		if (areaSound.maxZFine < z) {
			distance += z - areaSound.maxZFine;
		} else if (z < areaSound.minZFine) {
			distance += areaSound.minZFine - z;
		}
		if (areaSound.radius == 0 || areaSound.radius < distance - 64 || Preferences.ambientSoundsVolume == 0 || level != areaSound.level) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			if (areaSound.secondaryStream != null) {
				client.soundStream.removeSubStream(areaSound.secondaryStream);
				areaSound.secondaryStream = null;
			}
			return;
		}
		distance -= 64;
		if (distance < 0) {
			distance = 0;
		}
		@Pc(134) int volume = (areaSound.radius - distance) * Preferences.ambientSoundsVolume / areaSound.radius;
		if (areaSound.primaryStream != null) {
			areaSound.primaryStream.setVolume(volume);
		} else if (areaSound.sound >= 0) {
			@Pc(150) SynthSound synthSound = SynthSound.create(client.js5Archive4, areaSound.sound, 0);
			if (synthSound != null) {
				@Pc(158) PcmSound pcmSound = synthSound.toPcmSound().resample(client.resampler);
				@Pc(163) SoundPcmStream stream = SoundPcmStream.create(pcmSound, volume);
				stream.setLoops(-1);
				client.soundStream.addSubStream(stream);
				areaSound.primaryStream = stream;
			}
		}
		if (areaSound.secondaryStream != null) {
			areaSound.secondaryStream.setVolume(volume);
			if (!areaSound.secondaryStream.isLinked()) {
				areaSound.secondaryStream = null;
			}
		} else if (areaSound.sounds != null && (areaSound.remainingLoops -= loops) <= 0) {
			@Pc(219) int index = (int) ((double) areaSound.sounds.length * Math.random());
			@Pc(227) SynthSound synthSound = SynthSound.create(client.js5Archive4, areaSound.sounds[index], 0);
			if (synthSound != null) {
				@Pc(236) PcmSound pcmSound = synthSound.toPcmSound().resample(client.resampler);
				@Pc(241) SoundPcmStream stream = SoundPcmStream.create(pcmSound, volume);
				stream.setLoops(0);
				client.soundStream.addSubStream(stream);
				areaSound.remainingLoops = (int) ((double) (areaSound.maxInterval - areaSound.minInterval) * Math.random()) + areaSound.minInterval;
				areaSound.secondaryStream = stream;
			}
		}
	}
}
