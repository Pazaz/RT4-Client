package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

public class Preferences {
	@OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
	public static int antiAliasingMode = 0;
	@OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
	public static boolean safeMode = false;
	@OriginalMember(owner = "client!il", name = "I", descriptor = "I")
	public static int brightness = 3;
	@OriginalMember(owner = "client!gf", name = "N", descriptor = "Z")
	public static boolean removeRoofsSelectively = true;
	@OriginalMember(owner = "client!hk", name = "eb", descriptor = "Z")
	public static boolean stereo = true;
	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Z")
	public static boolean highWaterDetail = true;
	@OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
	public static int windowMode = 0;
	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	public static int fullScreenHeight = 0;
	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
	public static boolean showGroundDecorations = true;
	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Z")
	public static boolean flickeringEffectsOn = true;
	@OriginalMember(owner = "client!be", name = "Kb", descriptor = "Z")
	public static boolean manyIdleAnimations = true;
	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int ambientSoundsVolume = 127;
	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Z")
	public static boolean fogEnabled = true;
	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Z")
	public static boolean characterShadowsOn = true;
	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public static int fullScreenWidth = 0;
	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public static int sceneryShadowsType = 2;
	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "Z")
	public static boolean manyGroundTextures = true;
	@OriginalMember(owner = "client!od", name = "c", descriptor = "Z")
	public static boolean highDetailLighting = true;
	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int musicVolume = 255;
	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
	public static boolean highDetailTextures = true;
	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	public static int soundEffectVolume = 127;
	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public static int lastWorldId = 0;
	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public static int buildArea = 0;
	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "Z")
	public static boolean allLevelsVisible = true;
	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Z")
	public static boolean aBoolean63;
	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
	public static boolean cursorsEnabled = true;
	@OriginalMember(owner = "client!k", name = "c", descriptor = "Z")
	public static boolean hdr = false;
	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public static int favoriteWorlds = 0;
	@OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
	public static boolean sentToServer = true;
	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	static int particles = 2;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsignlink!ll;B)V")
	public static void write(@OriginalArg(0) SignLink arg0) {
		@Pc(11) FileOnDisk local11 = null;
		try {
			@Pc(16) PrivilegedRequest local16 = arg0.openPreferences("runescape");
			while (local16.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local16.status == 1) {
				local11 = (FileOnDisk) local16.result;
				@Pc(39) Buffer local39 = encode();
				local11.write(local39.data, local39.offset, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local11 != null) {
				local11.close();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lsignlink!ll;I)V")
	public static void read(@OriginalArg(0) SignLink arg0) {
		brightness = 3;
		setAllVisibleLevels(true);
		removeRoofsSelectively = true;
		stereo = true;
		highWaterDetail = true;
		windowMode = 0;
		fullScreenHeight = 0;
		showGroundDecorations = true;
		flickeringEffectsOn = true;
		manyIdleAnimations = true;
		ambientSoundsVolume = 127;
		fogEnabled = true;
		characterShadowsOn = true;
		fullScreenWidth = 0;
		sceneryShadowsType = 2;
		manyGroundTextures = true;
		highDetailLighting = true;
		musicVolume = 255;
		highDetailTextures = true;
		antiAliasingMode = 0;
		@Pc(48) FileOnDisk local48 = null;
		soundEffectVolume = 127;
		if (GameShell.maxMemory >= 96) {
			setParticles(2);
		} else {
			setParticles(0);
		}
		lastWorldId = 0;
		buildArea = 0;
		aBoolean63 = false;
		cursorsEnabled = true;
		safeMode = false;
		hdr = false;
		favoriteWorlds = 0;
		try {
			@Pc(78) PrivilegedRequest request = arg0.openPreferences("runescape");
			while (request.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (request.status == 1) {
				local48 = (FileOnDisk) request.result;
				@Pc(106) byte[] local106 = new byte[(int) local48.length()];
				@Pc(128) int local128;
				for (@Pc(108) int local108 = 0; local108 < local106.length; local108 += local128) {
					local128 = local48.read(local108, local106.length - local108, local106);
					if (local128 == -1) {
						throw new IOException("EOF");
					}
				}
				decode(new Buffer(local106));
			}
		} catch (@Pc(151) Exception local151) {
		}
		try {
			if (local48 != null) {
				local48.close();
			}
		} catch (@Pc(158) Exception local158) {
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
	public static void setAllVisibleLevels(@OriginalArg(1) boolean arg0) {
		allLevelsVisible = arg0;
		SceneGraph.aBoolean130 = !SceneGraph.allLevelsAreVisible();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void setParticles(@OriginalArg(0) int arg0) {
		particles = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()I")
	public static int getParticleSetting() {
		return particles;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lclient!wa;I)V")
	public static void decode(@OriginalArg(0) Buffer buffer) {
		if (buffer.data.length - buffer.offset < 1) {
			return;
		}
		@Pc(21) int version = buffer.g1();
		if (version < 0 || version > 11) {
			return;
		}
		@Pc(34) byte len;
		if (version == 11) {
			len = 33;
		} else if (version == 10) {
			len = 32;
		} else if (version == 9) {
			len = 31;
		} else if (version == 8) {
			len = 30;
		} else if (version == 7) {
			len = 29;
		} else if (version == 6) {
			len = 28;
		} else if (version == 5) {
			len = 28;
		} else if (version == 4) {
			len = 24;
		} else if (version == 3) {
			len = 23;
		} else if (version == 2) {
			len = 22;
		} else if (version == 1) {
			len = 23;
		} else {
			len = 19;
		}
		if (buffer.data.length - buffer.offset < len) {
			return;
		}
		brightness = buffer.g1();
		if (brightness < 1) {
			brightness = 1;
		} else if (brightness > 4) {
			brightness = 4;
		}
		setAllVisibleLevels(buffer.g1() == 1);
		removeRoofsSelectively = buffer.g1() == 1;
		showGroundDecorations = buffer.g1() == 1;
		highDetailTextures = buffer.g1() == 1;
		manyIdleAnimations = buffer.g1() == 1;
		flickeringEffectsOn = buffer.g1() == 1;
		manyGroundTextures = buffer.g1() == 1;
		characterShadowsOn = buffer.g1() == 1;
		sceneryShadowsType = buffer.g1();
		if (sceneryShadowsType > 2) {
			sceneryShadowsType = 2;
		}
		if (version < 2) {
			highDetailLighting = buffer.g1() == 1;
			buffer.g1();
		} else {
			highDetailLighting = buffer.g1() == 1;
		}
		highWaterDetail = buffer.g1() == 1;
		fogEnabled = buffer.g1() == 1;
		windowMode = buffer.g1();
		if (windowMode > 2) {
			windowMode = 2;
		}
		antiAliasingMode = windowMode;
		stereo = buffer.g1() == 1;
		soundEffectVolume = buffer.g1();
		if (soundEffectVolume > 127) {
			soundEffectVolume = 127;
		}
		musicVolume = buffer.g1();
		ambientSoundsVolume = buffer.g1();
		if (ambientSoundsVolume > 127) {
			ambientSoundsVolume = 127;
		}
		if (version >= 1) {
			fullScreenWidth = buffer.g2();
			fullScreenHeight = buffer.g2();
		}
		if (version >= 3 && version < 6) {
			buffer.g1();
		}
		if (version >= 4) {
			@Pc(386) int particles = buffer.g1();
			if (GameShell.maxMemory < 96) {
				particles = 0;
			}
			setParticles(particles);
		}
		if (version >= 5) {
			lastWorldId = buffer.g4();
		}
		if (version >= 6) {
			favoriteWorlds = buffer.g1();
		}
		if (version >= 7) {
			safeMode = buffer.g1() == 1;
		}
		if (version >= 8) {
			aBoolean63 = buffer.g1() == 1;
		}
		if (version >= 9) {
			buildArea = buffer.g1();
		}
		if (version >= 10) {
			hdr = buffer.g1() != 0;
		}
		if (version >= 11) {
			cursorsEnabled = buffer.g1() != 0;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lclient!wa;")
	public static Buffer encode() {
		@Pc(4) Buffer local4 = new Buffer(34);
		local4.p1(11);
		local4.p1(brightness);
		local4.p1(allLevelsVisible ? 1 : 0);
		local4.p1(removeRoofsSelectively ? 1 : 0);
		local4.p1(showGroundDecorations ? 1 : 0);
		local4.p1(highDetailTextures ? 1 : 0);
		local4.p1(manyIdleAnimations ? 1 : 0);
		local4.p1(flickeringEffectsOn ? 1 : 0);
		local4.p1(manyGroundTextures ? 1 : 0);
		local4.p1(characterShadowsOn ? 1 : 0);
		local4.p1(sceneryShadowsType);
		local4.p1(highDetailLighting ? 1 : 0);
		local4.p1(highWaterDetail ? 1 : 0);
		local4.p1(fogEnabled ? 1 : 0);
		local4.p1(windowMode);
		local4.p1(stereo ? 1 : 0);
		local4.p1(soundEffectVolume);
		local4.p1(musicVolume);
		local4.p1(ambientSoundsVolume);
		local4.p2(fullScreenWidth);
		local4.p2(fullScreenHeight);
		local4.p1(getParticleSetting());
		local4.p4(lastWorldId);
		local4.p1(favoriteWorlds);
		local4.p1(safeMode ? 1 : 0);
		local4.p1(aBoolean63 ? 1 : 0);
		local4.p1(buildArea);
		local4.p1(hdr ? 1 : 0);
		local4.p1(cursorsEnabled ? 1 : 0);
		return local4;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
	public static int toInt() {
		return ((stereo ? 1 : 0) << 19) + (((fogEnabled ? 1 : 0) << 16) + ((highWaterDetail ? 1 : 0) << 15) + ((highDetailLighting ? 1 : 0) << 13) + ((characterShadowsOn ? 1 : 0) << 10) + ((manyGroundTextures ? 1 : 0) << 9) + ((manyIdleAnimations ? 1 : 0) << 7) + ((highDetailTextures ? 1 : 0) << 6) + ((showGroundDecorations ? 1 : 0) << 5) + (((allLevelsVisible ? 1 : 0) << 3) + (brightness & 0x7) - (-((removeRoofsSelectively ? 1 : 0) << 4) + -((flickeringEffectsOn ? 1 : 0) << 8)) - (-((sceneryShadowsType & 0x3) << 11) + -((soundEffectVolume == 0 ? 0 : 1) << 20) - (((musicVolume == 0 ? 0 : 1) << 21) + ((ambientSoundsVolume == 0 ? 0 : 1) << 22)))) + (getParticleSetting() << 23));
	}
}
