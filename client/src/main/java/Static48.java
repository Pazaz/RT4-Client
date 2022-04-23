import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public static int anInt1449;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(17) int local17 = arg3 - arg7;
		@Pc(26) int local26 = (arg0 - arg1 << 16) / local13;
		@Pc(35) int local35 = (arg4 - arg5 << 16) / local17;
		Static232.method3991(arg1, arg3, arg2, local35, arg6, local26, arg7, arg5);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lclient!wa;")
	public static Buffer method1196() {
		@Pc(4) Buffer local4 = new Buffer(34);
		local4.p1(11);
		local4.p1(Static113.brightness);
		local4.p1(Static162.aBoolean190 ? 1 : 0);
		local4.p1(Static80.removeRoofsSelectively ? 1 : 0);
		local4.p1(Static250.showGroundDecorations ? 1 : 0);
		local4.p1(Static53.highDetailTextures ? 1 : 0);
		local4.p1(Static15.manyIdleAnimations ? 1 : 0);
		local4.p1(Static11.flickeringEffectsOn ? 1 : 0);
		local4.p1(Static159.manyGroundTextures ? 1 : 0);
		local4.p1(Static209.characterShadowsOn ? 1 : 0);
		local4.p1(Static139.sceneryShadowsType);
		local4.p1(Static178.highDetailLighting ? 1 : 0);
		local4.p1(Static220.highWaterDetail ? 1 : 0);
		local4.p1(Static71.fogEnabled ? 1 : 0);
		local4.p1(Static102.windowMode);
		local4.p1(Static99.stereo ? 1 : 0);
		local4.p1(Static125.soundEffectVolume);
		local4.p1(Static12.musicVolume);
		local4.p1(Static30.ambientSoundsVolume);
		local4.p2(Static114.anInt5831);
		local4.p2(Static22.anInt729);
		local4.p1(Static76.getParticleSetting());
		local4.p4(Static164.lastWorldId);
		local4.p1(Static214.windowMode);
		local4.p1(Static164.safeMode ? 1 : 0);
		local4.p1(Static33.aBoolean63 ? 1 : 0);
		local4.p1(Static141.buildArea);
		local4.p1(Static127.aBoolean159 ? 1 : 0);
		local4.p1(Static64.cursorsEnabled ? 1 : 0);
		return local4;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public static void setIdleLoops(@OriginalArg(1) int arg0) {
		@Pc(10) Mouse local10 = Static93.instance;
		synchronized (Static93.instance) {
			Static93.anInt2467 = arg0;
		}
	}
}
