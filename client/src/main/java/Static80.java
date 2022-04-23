import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
	public static int anInt4696;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "[[[I")
	public static int[][][] underWaterTileHeightMap;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public static int anInt4701;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
	public static int anInt4702;

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!na;")
	public static final JagString aClass100_886 = Static28.parse(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "Z")
	public static boolean removeRoofsSelectively = true;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ve;IIB)Lclient!mm;")
	public static SoftwareSprite loadSoftwareAlphaSprite(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1) {
		return Static234.method4016(arg0, 0, arg1) ? Static102.method2071() : null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lsignlink!ll;I)V")
	public static void read(@OriginalArg(0) SignLink arg0) {
		Static113.brightness = 3;
		Static53.setAllVisibleLevels(true);
		removeRoofsSelectively = true;
		Static99.stereo = true;
		Static220.highWaterDetail = true;
		Static102.windowMode = 0;
		Static22.anInt729 = 0;
		Static250.showGroundDecorations = true;
		Static11.flickeringEffectsOn = true;
		Static15.manyIdleAnimations = true;
		Static30.ambientSoundsVolume = 127;
		Static71.fogEnabled = true;
		Static209.characterShadowsOn = true;
		Static114.anInt5831 = 0;
		Static139.sceneryShadowsType = 2;
		Static159.manyGroundTextures = true;
		Static178.highDetailLighting = true;
		Static12.musicVolume = 255;
		Static53.highDetailTextures = true;
		Static186.antiAliasingMode = 0;
		@Pc(48) FileOnDisk local48 = null;
		Static125.soundEffectVolume = 127;
		if (GameShell.maxMemory >= 96) {
			Static76.setParticles(2);
		} else {
			Static76.setParticles(0);
		}
		Static164.lastWorldId = 0;
		Static141.buildArea = 0;
		Static33.aBoolean63 = false;
		Static64.cursorsEnabled = true;
		Static164.safeMode = false;
		Static127.aBoolean159 = false;
		Static214.windowMode = 0;
		try {
			@Pc(78) PrivilegedRequest local78 = arg0.openPreferences("runescape");
			while (local78.status == 0) {
				Static231.sleep(1L);
			}
			if (local78.status == 1) {
				local48 = (FileOnDisk) local78.result;
				@Pc(106) byte[] local106 = new byte[(int) local48.length()];
				@Pc(128) int local128;
				for (@Pc(108) int local108 = 0; local108 < local106.length; local108 += local128) {
					local128 = local48.read(local108, local106.length - local108, local106);
					if (local128 == -1) {
						throw new IOException("EOF");
					}
				}
				Static136.method2654(new Buffer(local106));
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

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)V")
	public static void method3616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static142.anInt3482 = arg0 - Static158.anInt3846;
		@Pc(24) int local24 = Static142.anInt3482 - (int) ((float) Static24.component.anInt445 / Static83.aFloat3);
		@Pc(33) int local33 = Static142.anInt3482 + (int) ((float) Static24.component.anInt445 / Static83.aFloat3);
		if (local24 < 0) {
			Static142.anInt3482 = (int) ((float) Static24.component.anInt445 / Static83.aFloat3);
		}
		Static217.anInt4901 = Static181.anInt4296 + Static2.anInt13 - arg1 - 1;
		@Pc(61) int local61 = (int) ((float) Static24.component.anInt459 / Static83.aFloat3) + Static217.anInt4901;
		@Pc(70) int local70 = Static217.anInt4901 - (int) ((float) Static24.component.anInt459 / Static83.aFloat3);
		if (local33 > Static48.anInt1449) {
			Static142.anInt3482 = Static48.anInt1449 - (int) ((float) Static24.component.anInt445 / Static83.aFloat3);
		}
		if (local70 < 0) {
			Static217.anInt4901 = (int) ((float) Static24.component.anInt459 / Static83.aFloat3);
		}
		if (Static181.anInt4296 < local61) {
			Static217.anInt4901 = Static181.anInt4296 - (int) ((float) Static24.component.anInt459 / Static83.aFloat3);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!na;II)V")
	public static void method3617(@OriginalArg(0) JagString arg0, @OriginalArg(2) int arg1) {
		@Pc(6) DelayedStateChange local6 = Static238.method4143(3, arg1);
		local6.pushServer();
		local6.stringArg = arg0;
	}
}
