import java.nio.ByteBuffer;
import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class GlModel extends Model {

	@OriginalMember(owner = "client!td", name = "t", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "Lclient!vi;")
	private GlVertexBufferObject aClass155_5;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Lclient!ql;")
	private GlBuffer aClass127_1;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "Lclient!ql;")
	private GlBuffer aClass127_2;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "Lclient!ql;")
	private GlBuffer aClass127_3;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!td", name = "L", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!ae;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Lclient!ql;")
	public GlBuffer aClass127_4;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Lclient!de;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "[I")
	public int[] anIntArray465;

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "Lclient!ql;")
	private GlBuffer aClass127_5;

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public int anInt5295 = 0;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	private int anInt5296 = 0;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
	private int anInt5297 = 0;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public GlModel() {
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!gb;IIZ)V")
	public GlModel(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(23) int[] local23 = new int[arg0.anInt2136];
		this.anIntArray462 = new int[arg0.anInt2139 + 1];
		for (@Pc(32) int local32 = 0; local32 < arg0.anInt2136; local32++) {
			if ((arg0.aByteArray30 == null || arg0.aByteArray30[local32] != 2) && (arg0.aShortArray23 == null || arg0.aShortArray23[local32] == -1 || !Rasteriser.anInterface1_2.method3231(arg0.aShortArray23[local32] & 0xFFFF))) {
				local23[this.anInt5297++] = local32;
				this.anIntArray462[arg0.anIntArray197[local32]]++;
				this.anIntArray462[arg0.anIntArray200[local32]]++;
				this.anIntArray462[arg0.anIntArray196[local32]]++;
			}
		}
		@Pc(115) long[] local115 = new long[this.anInt5297];
		@Pc(117) int local117;
		@Pc(125) int local125;
		@Pc(127) int local127;
		@Pc(226) int local226;
		for (local117 = 0; local117 < this.anInt5297; local117++) {
			local125 = local23[local117];
			local127 = 0;
			@Pc(129) byte local129 = 0;
			@Pc(131) int local131 = 0;
			@Pc(133) int local133 = 0;
			@Pc(135) short local135 = -1;
			if (arg0.aShortArray23 != null) {
				local135 = arg0.aShortArray23[local125];
				if (local135 != -1) {
					local131 = Rasteriser.anInterface1_2.method3237(local135 & 0xFFFF);
					local133 = Rasteriser.anInterface1_2.method3228(local135 & 0xFFFF);
				}
			}
			@Pc(182) boolean local182 = arg0.aByteArray26 != null && arg0.aByteArray26[local125] != 0 || local135 != -1 && !Rasteriser.anInterface1_2.method3226(local135 & 0xFFFF);
			if ((arg3 || local182) && arg0.aByteArray35 != null) {
				local127 += arg0.aByteArray35[local125] << 17;
			}
			if (local182) {
				local127 += 65536;
			}
			local127 += (local131 & 0xFF) << 8;
			local127 += local133 & 0xFF;
			local226 = local129 + ((local135 & 0xFFFF) << 16);
			@Pc(232) int local232 = local226 + (local117 & 0xFFFF);
			local115[local117] = ((long) local127 << 32) + (long) local232;
		}
		Static173.method3243(local115, local23);
		this.anInt5295 = arg0.anInt2139;
		this.anIntArray461 = arg0.anIntArray202;
		this.anIntArray465 = arg0.anIntArray201;
		this.anIntArray466 = arg0.anIntArray203;
		this.anIntArray464 = arg0.anIntArray193;
		this.aShortArray84 = arg0.aShortArray29;
		local117 = this.anInt5297 * 3;
		this.aShortArray76 = new short[local117];
		this.aShortArray79 = new short[local117];
		this.aShortArray85 = new short[local117];
		this.aShortArray86 = new short[local117];
		this.aFloatArray25 = new float[local117];
		this.aFloatArray26 = new float[local117];
		this.aShortArray75 = new short[this.anInt5297];
		this.aByteArray71 = new byte[this.anInt5297];
		this.aShortArray77 = new short[this.anInt5297];
		this.aShortArray82 = new short[this.anInt5297];
		this.aShortArray83 = new short[this.anInt5297];
		this.aShortArray80 = new short[this.anInt5297];
		if (arg0.anIntArray192 != null) {
			this.aByteArray72 = new byte[this.anInt5297];
		}
		if (arg0.aShortArray22 != null) {
			this.aShortArray78 = new short[this.anInt5297];
		}
		this.aClass5_1 = new Class5();
		this.aClass127_4 = new GlBuffer();
		this.aClass127_1 = new GlBuffer();
		if (Static178.highDetailLighting) {
			this.aClass127_2 = new GlBuffer();
		}
		this.aClass127_3 = new GlBuffer();
		this.aClass127_5 = new GlBuffer();
		this.aShort29 = (short) arg1;
		this.aShort28 = (short) arg2;
		this.aShortArray81 = new short[local117];
		Static237.aLongArray10 = new long[local117];
		local125 = 0;
		for (local127 = 0; local127 < arg0.anInt2139; local127++) {
			local226 = this.anIntArray462[local127];
			this.anIntArray462[local127] = local125;
			local125 += local226;
		}
		this.anIntArray462[arg0.anInt2139] = local125;
		@Pc(426) int[] local426 = null;
		@Pc(428) int[] local428 = null;
		@Pc(430) int[] local430 = null;
		@Pc(433) float[][] local433 = null;
		@Pc(553) int local553;
		@Pc(439) int local439;
		@Pc(683) float local683;
		@Pc(714) float local714;
		@Pc(685) float local685;
		if (arg0.aByteArray31 != null) {
			local439 = arg0.anInt2137;
			@Pc(442) int[] local442 = new int[local439];
			@Pc(445) int[] local445 = new int[local439];
			@Pc(448) int[] local448 = new int[local439];
			@Pc(451) int[] local451 = new int[local439];
			@Pc(454) int[] local454 = new int[local439];
			@Pc(457) int[] local457 = new int[local439];
			@Pc(459) int local459;
			for (local459 = 0; local459 < local439; local459++) {
				local442[local459] = Integer.MAX_VALUE;
				local445[local459] = -2147483647;
				local448[local459] = Integer.MAX_VALUE;
				local451[local459] = -2147483647;
				local454[local459] = Integer.MAX_VALUE;
				local457[local459] = -2147483647;
			}
			for (local459 = 0; local459 < this.anInt5297; local459++) {
				@Pc(498) int local498 = local23[local459];
				if (arg0.aByteArray31[local498] != -1) {
					@Pc(511) int local511 = arg0.aByteArray31[local498] & 0xFF;
					for (@Pc(513) int local513 = 0; local513 < 3; local513++) {
						@Pc(523) int local523;
						if (local513 == 0) {
							local523 = arg0.anIntArray197[local498];
						} else if (local513 == 1) {
							local523 = arg0.anIntArray200[local498];
						} else {
							local523 = arg0.anIntArray196[local498];
						}
						@Pc(543) int local543 = arg0.anIntArray202[local523];
						@Pc(548) int local548 = arg0.anIntArray201[local523];
						local553 = arg0.anIntArray203[local523];
						if (local543 < local442[local511]) {
							local442[local511] = local543;
						}
						if (local543 > local445[local511]) {
							local445[local511] = local543;
						}
						if (local548 < local448[local511]) {
							local448[local511] = local548;
						}
						if (local548 > local451[local511]) {
							local451[local511] = local548;
						}
						if (local553 < local454[local511]) {
							local454[local511] = local553;
						}
						if (local553 > local457[local511]) {
							local457[local511] = local553;
						}
					}
				}
			}
			local426 = new int[local439];
			local428 = new int[local439];
			local430 = new int[local439];
			local433 = new float[local439][];
			for (local459 = 0; local459 < local439; local459++) {
				@Pc(633) byte local633 = arg0.aByteArray29[local459];
				if (local633 > 0) {
					local426[local459] = (local442[local459] + local445[local459]) / 2;
					local428[local459] = (local448[local459] + local451[local459]) / 2;
					local430[local459] = (local454[local459] + local457[local459]) / 2;
					if (local633 == 1) {
						@Pc(679) short local679 = arg0.aShortArray27[local459];
						if (local679 == 0) {
							local683 = 1.0F;
							local685 = 1.0F;
						} else if (local679 > 0) {
							local683 = 1.0F;
							local685 = (float) local679 / 1024.0F;
						} else {
							local685 = 1.0F;
							local683 = (float) -local679 / 1024.0F;
						}
						local714 = 64.0F / (float) (arg0.aShortArray25[local459] & 0xFFFF);
					} else if (local633 == 2) {
						local683 = 64.0F / (float) (arg0.aShortArray27[local459] & 0xFFFF);
						local714 = 64.0F / (float) (arg0.aShortArray25[local459] & 0xFFFF);
						local685 = 64.0F / (float) (arg0.aShortArray21[local459] & 0xFFFF);
					} else {
						local683 = (float) arg0.aShortArray27[local459] / 1024.0F;
						local714 = (float) arg0.aShortArray25[local459] / 1024.0F;
						local685 = (float) arg0.aShortArray21[local459] / 1024.0F;
					}
					local433[local459] = Static237.method4097(arg0.aShortArray26[local459], arg0.aShortArray20[local459], arg0.aShortArray28[local459], arg0.aByteArray27[local459] & 0xFF, local683, local714, local685);
				}
			}
		}
		@Pc(817) int local817;
		@Pc(822) short local822;
		for (local439 = 0; local439 < this.anInt5297; local439++) {
			@Pc(810) int local810 = local23[local439];
			local817 = arg0.aShortArray24[local810] & 0xFFFF;
			if (arg0.aShortArray23 == null) {
				local822 = -1;
			} else {
				local822 = arg0.aShortArray23[local810];
			}
			@Pc(833) int local833;
			if (arg0.aByteArray31 == null) {
				local833 = -1;
			} else {
				local833 = arg0.aByteArray31[local810];
			}
			@Pc(844) int local844;
			if (arg0.aByteArray26 == null) {
				local844 = 0;
			} else {
				local844 = arg0.aByteArray26[local810] & 0xFF;
			}
			@Pc(854) float local854 = 0.0F;
			@Pc(856) float local856 = 0.0F;
			@Pc(858) float local858 = 0.0F;
			local683 = 0.0F;
			local714 = 0.0F;
			local685 = 0.0F;
			@Pc(866) byte local866 = 0;
			@Pc(868) byte local868 = 0;
			local553 = 0;
			@Pc(902) byte local902;
			@Pc(919) int local919;
			@Pc(1280) int local1280;
			if (local822 != -1) {
				if (local833 == -1) {
					local854 = 0.0F;
					local856 = 1.0F;
					local858 = 1.0F;
					local683 = 1.0F;
					local866 = 1;
					local714 = 0.0F;
					local685 = 0.0F;
					local868 = 2;
				} else {
					local833 &= 0xFF;
					local902 = arg0.aByteArray29[local833];
					@Pc(909) int local909;
					@Pc(914) int local914;
					@Pc(952) float local952;
					@Pc(960) float local960;
					@Pc(968) float local968;
					@Pc(1048) float local1048;
					@Pc(1056) float local1056;
					@Pc(1064) float local1064;
					@Pc(1072) float local1072;
					@Pc(1080) float local1080;
					@Pc(1088) float local1088;
					if (local902 == 0) {
						local909 = arg0.anIntArray197[local810];
						local914 = arg0.anIntArray200[local810];
						local919 = arg0.anIntArray196[local810];
						@Pc(924) short local924 = arg0.aShortArray26[local833];
						@Pc(929) short local929 = arg0.aShortArray20[local833];
						@Pc(934) short local934 = arg0.aShortArray28[local833];
						@Pc(940) float local940 = (float) arg0.anIntArray202[local924];
						@Pc(946) float local946 = (float) arg0.anIntArray201[local924];
						local952 = arg0.anIntArray203[local924];
						local960 = (float) arg0.anIntArray202[local929] - local940;
						local968 = (float) arg0.anIntArray201[local929] - local946;
						@Pc(976) float local976 = (float) arg0.anIntArray203[local929] - local952;
						@Pc(984) float local984 = (float) arg0.anIntArray202[local934] - local940;
						@Pc(992) float local992 = (float) arg0.anIntArray201[local934] - local946;
						@Pc(1000) float local1000 = (float) arg0.anIntArray203[local934] - local952;
						@Pc(1008) float local1008 = (float) arg0.anIntArray202[local909] - local940;
						@Pc(1016) float local1016 = (float) arg0.anIntArray201[local909] - local946;
						@Pc(1024) float local1024 = (float) arg0.anIntArray203[local909] - local952;
						@Pc(1032) float local1032 = (float) arg0.anIntArray202[local914] - local940;
						@Pc(1040) float local1040 = (float) arg0.anIntArray201[local914] - local946;
						local1048 = (float) arg0.anIntArray203[local914] - local952;
						local1056 = (float) arg0.anIntArray202[local919] - local940;
						local1064 = (float) arg0.anIntArray201[local919] - local946;
						local1072 = (float) arg0.anIntArray203[local919] - local952;
						local1080 = local968 * local1000 - local976 * local992;
						local1088 = local976 * local984 - local960 * local1000;
						@Pc(1096) float local1096 = local960 * local992 - local968 * local984;
						@Pc(1104) float local1104 = local992 * local1096 - local1000 * local1088;
						@Pc(1112) float local1112 = local1000 * local1080 - local984 * local1096;
						@Pc(1120) float local1120 = local984 * local1088 - local992 * local1080;
						@Pc(1134) float local1134 = 1.0F / (local1104 * local960 + local1112 * local968 + local1120 * local976);
						local854 = (local1104 * local1008 + local1112 * local1016 + local1120 * local1024) * local1134;
						local858 = (local1104 * local1032 + local1112 * local1040 + local1120 * local1048) * local1134;
						local714 = (local1104 * local1056 + local1112 * local1064 + local1120 * local1072) * local1134;
						@Pc(1184) float local1184 = local968 * local1096 - local976 * local1088;
						@Pc(1192) float local1192 = local976 * local1080 - local960 * local1096;
						@Pc(1200) float local1200 = local960 * local1088 - local968 * local1080;
						@Pc(1214) float local1214 = 1.0F / (local1184 * local984 + local1192 * local992 + local1200 * local1000);
						local856 = (local1184 * local1008 + local1192 * local1016 + local1200 * local1024) * local1214;
						local683 = (local1184 * local1032 + local1192 * local1040 + local1200 * local1048) * local1214;
						local685 = (local1184 * local1056 + local1192 * local1064 + local1200 * local1072) * local1214;
					} else {
						local909 = arg0.anIntArray197[local810];
						local914 = arg0.anIntArray200[local810];
						local919 = arg0.anIntArray196[local810];
						@Pc(1276) int local1276 = local426[local833];
						local1280 = local428[local833];
						@Pc(1284) int local1284 = local430[local833];
						@Pc(1288) float[] local1288 = local433[local833];
						@Pc(1293) byte local1293 = arg0.aByteArray32[local833];
						local952 = (float) arg0.aByteArray34[local833] / 256.0F;
						if (local902 == 1) {
							local960 = (float) (arg0.aShortArray21[local833] & 0xFFFF) / 1024.0F;
							Static237.method4095(arg0.anIntArray202[local909], arg0.anIntArray201[local909], arg0.anIntArray203[local909], local1276, local1280, local1284, local1288, local960, local1293, local952);
							local854 = Static237.aFloat26;
							local856 = Static237.aFloat28;
							Static237.method4095(arg0.anIntArray202[local914], arg0.anIntArray201[local914], arg0.anIntArray203[local914], local1276, local1280, local1284, local1288, local960, local1293, local952);
							local858 = Static237.aFloat26;
							local683 = Static237.aFloat28;
							Static237.method4095(arg0.anIntArray202[local919], arg0.anIntArray201[local919], arg0.anIntArray203[local919], local1276, local1280, local1284, local1288, local960, local1293, local952);
							local714 = Static237.aFloat26;
							local685 = Static237.aFloat28;
							local968 = local960 / 2.0F;
							if ((local1293 & 0x1) == 0) {
								if (local858 - local854 > local968) {
									local858 -= local960;
									local866 = 1;
								} else if (local854 - local858 > local968) {
									local858 += local960;
									local866 = 2;
								}
								if (local714 - local854 > local968) {
									local714 -= local960;
									local868 = 1;
								} else if (local854 - local714 > local968) {
									local714 += local960;
									local868 = 2;
								}
							} else {
								if (local683 - local856 > local968) {
									local683 -= local960;
									local866 = 1;
								} else if (local856 - local683 > local968) {
									local683 += local960;
									local866 = 2;
								}
								if (local685 - local856 > local968) {
									local685 -= local960;
									local868 = 1;
								} else if (local856 - local685 > local968) {
									local685 += local960;
									local868 = 2;
								}
							}
						} else if (local902 == 2) {
							local960 = (float) arg0.aByteArray28[local833] / 256.0F;
							local968 = (float) arg0.aByteArray33[local833] / 256.0F;
							@Pc(1525) int local1525 = arg0.anIntArray202[local914] - arg0.anIntArray202[local909];
							@Pc(1535) int local1535 = arg0.anIntArray201[local914] - arg0.anIntArray201[local909];
							@Pc(1545) int local1545 = arg0.anIntArray203[local914] - arg0.anIntArray203[local909];
							@Pc(1555) int local1555 = arg0.anIntArray202[local919] - arg0.anIntArray202[local909];
							@Pc(1565) int local1565 = arg0.anIntArray201[local919] - arg0.anIntArray201[local909];
							@Pc(1575) int local1575 = arg0.anIntArray203[local919] - arg0.anIntArray203[local909];
							@Pc(1583) int local1583 = local1535 * local1575 - local1565 * local1545;
							@Pc(1591) int local1591 = local1545 * local1555 - local1575 * local1525;
							@Pc(1599) int local1599 = local1525 * local1565 - local1555 * local1535;
							local1048 = 64.0F / (float) (arg0.aShortArray27[local833] & 0xFFFF);
							local1056 = 64.0F / (float) (arg0.aShortArray25[local833] & 0xFFFF);
							local1064 = 64.0F / (float) (arg0.aShortArray21[local833] & 0xFFFF);
							local1072 = ((float) local1583 * local1288[0] + (float) local1591 * local1288[1] + (float) local1599 * local1288[2]) / local1048;
							local1080 = ((float) local1583 * local1288[3] + (float) local1591 * local1288[4] + (float) local1599 * local1288[5]) / local1056;
							local1088 = ((float) local1583 * local1288[6] + (float) local1591 * local1288[7] + (float) local1599 * local1288[8]) / local1064;
							local553 = Static237.method4092(local1072, local1080, local1088);
							Static237.method4104(arg0.anIntArray202[local909], arg0.anIntArray201[local909], arg0.anIntArray203[local909], local1276, local1280, local1284, local553, local1288, local1293, local952, local960, local968);
							local854 = Static237.aFloat27;
							local856 = Static237.aFloat24;
							Static237.method4104(arg0.anIntArray202[local914], arg0.anIntArray201[local914], arg0.anIntArray203[local914], local1276, local1280, local1284, local553, local1288, local1293, local952, local960, local968);
							local858 = Static237.aFloat27;
							local683 = Static237.aFloat24;
							Static237.method4104(arg0.anIntArray202[local919], arg0.anIntArray201[local919], arg0.anIntArray203[local919], local1276, local1280, local1284, local553, local1288, local1293, local952, local960, local968);
							local714 = Static237.aFloat27;
							local685 = Static237.aFloat24;
						} else if (local902 == 3) {
							Static237.method4101(arg0.anIntArray202[local909], arg0.anIntArray201[local909], arg0.anIntArray203[local909], local1276, local1280, local1284, local1288, local1293, local952);
							local854 = Static237.aFloat29;
							local856 = Static237.aFloat25;
							Static237.method4101(arg0.anIntArray202[local914], arg0.anIntArray201[local914], arg0.anIntArray203[local914], local1276, local1280, local1284, local1288, local1293, local952);
							local858 = Static237.aFloat29;
							local683 = Static237.aFloat25;
							Static237.method4101(arg0.anIntArray202[local919], arg0.anIntArray201[local919], arg0.anIntArray203[local919], local1276, local1280, local1284, local1288, local1293, local952);
							local714 = Static237.aFloat29;
							local685 = Static237.aFloat25;
							if ((local1293 & 0x1) == 0) {
								if (local858 - local854 > 0.5F) {
									local858--;
									local866 = 1;
								} else if (local854 - local858 > 0.5F) {
									local858++;
									local866 = 2;
								}
								if (local714 - local854 > 0.5F) {
									local714--;
									local868 = 1;
								} else if (local854 - local714 > 0.5F) {
									local714++;
									local868 = 2;
								}
							} else {
								if (local683 - local856 > 0.5F) {
									local683--;
									local866 = 1;
								} else if (local856 - local683 > 0.5F) {
									local683++;
									local866 = 2;
								}
								if (local685 - local856 > 0.5F) {
									local685--;
									local868 = 1;
								} else if (local856 - local685 > 0.5F) {
									local685++;
									local868 = 2;
								}
							}
						}
					}
				}
			}
			arg0.method1668();
			if (arg0.aByteArray30 == null) {
				local902 = 0;
			} else {
				local902 = arg0.aByteArray30[local810];
			}
			if (local902 == 0) {
				@Pc(1994) long local1994 = (long) (local833 << 2) + ((long) (local553 << 24) + (long) (local817 << 8) + (long) local844 << 32);
				local919 = arg0.anIntArray197[local810];
				@Pc(2004) Class57 local2004 = arg0.aClass57Array1[local919];
				this.aShortArray77[local439] = this.method4098(arg0, local919, local1994, local2004.anInt2437, local2004.anInt2431, local2004.anInt2436, local2004.anInt2432, local854, local856);
				local1280 = arg0.anIntArray200[local810];
				@Pc(2033) Class57 local2033 = arg0.aClass57Array1[local1280];
				this.aShortArray82[local439] = this.method4098(arg0, local1280, local1994 + (long) local866, local2033.anInt2437, local2033.anInt2431, local2033.anInt2436, local2033.anInt2432, local858, local683);
				@Pc(2060) int local2060 = arg0.anIntArray196[local810];
				@Pc(2065) Class57 local2065 = arg0.aClass57Array1[local2060];
				this.aShortArray83[local439] = this.method4098(arg0, local2060, local1994 + (long) local868, local2065.anInt2437, local2065.anInt2431, local2065.anInt2436, local2065.anInt2432, local714, local685);
			} else if (local902 == 1) {
				@Pc(2096) TriangleNormal local2096 = arg0.aClass126Array1[local810];
				@Pc(2137) long local2137 = (long) ((local833 << 2) + (local2096.anInt4769 > 0 ? 1024 : 2048) + (local2096.anInt4770 + 256 << 12) + (local2096.anInt4767 + 256 << 22)) + ((long) (local553 << 24) + (long) (local817 << 8) + (long) local844 << 32);
				this.aShortArray77[local439] = this.method4098(arg0, arg0.anIntArray197[local810], local2137, local2096.anInt4769, local2096.anInt4770, local2096.anInt4767, 0, local854, local856);
				this.aShortArray82[local439] = this.method4098(arg0, arg0.anIntArray200[local810], local2137 + (long) local866, local2096.anInt4769, local2096.anInt4770, local2096.anInt4767, 0, local858, local683);
				this.aShortArray83[local439] = this.method4098(arg0, arg0.anIntArray196[local810], local2137 + (long) local868, local2096.anInt4769, local2096.anInt4770, local2096.anInt4767, 0, local714, local685);
			}
			if (arg0.aShortArray23 == null) {
				this.aShortArray80[local439] = -1;
			} else {
				this.aShortArray80[local439] = arg0.aShortArray23[local810];
			}
			if (this.aByteArray72 != null) {
				this.aByteArray72[local439] = (byte) arg0.anIntArray192[local810];
			}
			this.aShortArray75[local439] = arg0.aShortArray24[local810];
			if (arg0.aByteArray26 != null) {
				this.aByteArray71[local439] = arg0.aByteArray26[local810];
			}
			if (arg0.aShortArray22 != null) {
				this.aShortArray78[local439] = arg0.aShortArray22[local810];
			}
		}
		local439 = 0;
		@Pc(2271) short local2271 = -10000;
		for (local817 = 0; local817 < this.anInt5297; local817++) {
			local822 = this.aShortArray80[local817];
			if (local822 != local2271) {
				local439++;
				local2271 = local822;
			}
		}
		this.anIntArray463 = new int[local439 + 1];
		local439 = 0;
		local2271 = -10000;
		for (local817 = 0; local817 < this.anInt5297; local817++) {
			local822 = this.aShortArray80[local817];
			if (local822 != local2271) {
				this.anIntArray463[local439++] = local817;
				local2271 = local822;
			}
		}
		this.anIntArray463[local439] = this.anInt5297;
		Static237.aLongArray10 = null;
		this.aShortArray76 = Static237.method4119(this.aShortArray76, this.anInt5296);
		this.aShortArray79 = Static237.method4119(this.aShortArray79, this.anInt5296);
		this.aShortArray85 = Static237.method4119(this.aShortArray85, this.anInt5296);
		this.aShortArray86 = Static237.method4119(this.aShortArray86, this.anInt5296);
		this.aFloatArray25 = Static237.method4112(this.aFloatArray25, this.anInt5296);
		this.aFloatArray26 = Static237.method4112(this.aFloatArray26, this.anInt5296);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZ)Lclient!ak;")
	@Override
	public final Model method4560(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method4114(arg0, arg1, arg2, Static237.aClass8_Sub1_Sub1_4, Static237.aClass8_Sub1_Sub1_3);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
		if (this.anInt5296 == 0) {
			return;
		}
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		@Pc(13) short local13 = this.aClass5_1.aShort4;
		@Pc(17) short local17 = this.aClass5_1.aShort2;
		@Pc(21) short local21 = this.aClass5_1.aShort3;
		@Pc(31) int local31 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(41) int local41 = arg6 * arg1 + local31 * arg2 >> 16;
		@Pc(53) int local53 = local41 + (local13 * arg2 + local21 * arg1 >> 16);
		if (local53 <= 50) {
			return;
		}
		@Pc(70) int local70 = local41 + (-local13 * arg2 + local17 * arg1 >> 16);
		if (local70 >= 3584) {
			return;
		}
		@Pc(84) int local84 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(90) int local90 = local84 + local13 << 9;
		if (local90 / local53 <= Static240.anInt5334) {
			return;
		}
		@Pc(102) int local102 = local84 - local13 << 9;
		if (local102 / local53 >= Static247.anInt5405) {
			return;
		}
		@Pc(118) int local118 = arg6 * arg2 - local31 * arg1 >> 16;
		@Pc(132) int local132 = local118 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local132 / local53 <= Static1.anInt4) {
			return;
		}
		@Pc(153) int local153 = local118 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local153 / local53 >= Static148.anInt3535) {
			return;
		}
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 0;
		if (arg0 != 0) {
			local161 = MathUtils.anIntArray223[arg0];
			local163 = MathUtils.anIntArray225[arg0];
		}
		if (arg8 > 0L && Static39.aBoolean77 && local70 > 0) {
			@Pc(187) int local187;
			@Pc(191) int local191;
			if (local84 > 0) {
				local187 = local102 / local53;
				local191 = local90 / local70;
			} else {
				local187 = local102 / local70;
				local191 = local90 / local53;
			}
			@Pc(206) int local206;
			@Pc(210) int local210;
			if (local118 > 0) {
				local206 = local153 / local53;
				local210 = local132 / local70;
			} else {
				local206 = local153 / local70;
				local210 = local132 / local53;
			}
			if (Static150.anInt3582 >= local187 && Static150.anInt3582 <= local191 && Static34.anInt1053 >= local206 && Static34.anInt1053 <= local210) {
				local187 = 999999;
				local191 = -999999;
				local206 = 999999;
				local210 = -999999;
				@Pc(243) short local243 = this.aClass5_1.aShort6;
				@Pc(247) short local247 = this.aClass5_1.aShort5;
				@Pc(251) short local251 = this.aClass5_1.aShort8;
				@Pc(255) short local255 = this.aClass5_1.aShort7;
				@Pc(290) int[] local290 = new int[] { local243, local247, local243, local247, local243, local247, local243, local247 };
				@Pc(325) int[] local325 = new int[] { local251, local251, local255, local255, local251, local251, local255, local255 };
				@Pc(360) int[] local360 = new int[] { local17, local17, local17, local17, local21, local21, local21, local21 };
				@Pc(362) int local362;
				@Pc(369) int local369;
				@Pc(373) int local373;
				@Pc(377) int local377;
				@Pc(389) int local389;
				@Pc(465) int local465;
				@Pc(471) int local471;
				for (local362 = 0; local362 < 8; local362++) {
					local369 = local290[local362];
					local373 = local360[local362];
					local377 = local325[local362];
					if (arg0 != 0) {
						local389 = local377 * local161 + local369 * local163 >> 16;
						local377 = local377 * local163 - local369 * local161 >> 16;
						local369 = local389;
					}
					local369 += arg5;
					local373 += arg6;
					local377 += arg7;
					local389 = local377 * arg3 + local369 * arg4 >> 16;
					local377 = local377 * arg4 - local369 * arg3 >> 16;
					local369 = local389;
					local389 = local373 * arg2 - local377 * arg1 >> 16;
					local377 = local373 * arg1 + local377 * arg2 >> 16;
					if (local377 > 0) {
						local465 = (local369 << 9) / local377;
						local471 = (local389 << 9) / local377;
						if (local465 < local187) {
							local187 = local465;
						}
						if (local465 > local191) {
							local191 = local465;
						}
						if (local471 < local206) {
							local206 = local471;
						}
						if (local471 > local210) {
							local210 = local471;
						}
					}
				}
				if (Static150.anInt3582 >= local187 && Static150.anInt3582 <= local191 && Static34.anInt1053 >= local206 && Static34.anInt1053 <= local210) {
					if (this.aBoolean303) {
						Static259.aLongArray11[Static2.anInt7++] = arg8;
					} else {
						if (Static237.anIntArray468.length < this.anInt5296) {
							Static237.anIntArray468 = new int[this.anInt5296];
							Static237.anIntArray467 = new int[this.anInt5296];
						}
						local362 = 0;
						label118: while (true) {
							if (local362 >= this.anInt5295) {
								local362 = 0;
								while (true) {
									if (local362 >= this.anInt5297) {
										break label118;
									}
									@Pc(698) short local698 = this.aShortArray77[local362];
									@Pc(703) short local703 = this.aShortArray82[local362];
									@Pc(708) short local708 = this.aShortArray83[local362];
									if (this.method4118(Static150.anInt3582, Static34.anInt1053, Static237.anIntArray467[local698], Static237.anIntArray467[local703], Static237.anIntArray467[local708], Static237.anIntArray468[local698], Static237.anIntArray468[local703], Static237.anIntArray468[local708])) {
										Static259.aLongArray11[Static2.anInt7++] = arg8;
										break label118;
									}
									local362++;
								}
							}
							local369 = this.anIntArray461[local362];
							local373 = this.anIntArray465[local362];
							local377 = this.anIntArray466[local362];
							if (arg0 != 0) {
								local389 = local377 * local161 + local369 * local163 >> 16;
								local377 = local377 * local163 - local369 * local161 >> 16;
								local369 = local389;
							}
							local369 += arg5;
							local373 += arg6;
							local377 += arg7;
							local389 = local377 * arg3 + local369 * arg4 >> 16;
							local377 = local377 * arg4 - local369 * arg3 >> 16;
							local369 = local389;
							local389 = local373 * arg2 - local377 * arg1 >> 16;
							local377 = local373 * arg1 + local377 * arg2 >> 16;
							if (local377 < 50) {
								break;
							}
							local465 = (local369 << 9) / local377;
							local471 = (local389 << 9) / local377;
							@Pc(652) int local652 = this.anIntArray462[local362];
							@Pc(659) int local659 = this.anIntArray462[local362 + 1];
							for (@Pc(661) int local661 = local652; local661 < local659; local661++) {
								@Pc(671) int local671 = this.aShortArray81[local661] - 1;
								if (local671 == -1) {
									break;
								}
								Static237.anIntArray468[local671] = local465;
								Static237.anIntArray467[local671] = local471;
							}
							local362++;
						}
					}
				}
			}
		}
		@Pc(744) GL2 local744 = GlRenderer.gl;
		local744.glPushMatrix();
		local744.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local744.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method4121();
		local744.glRotatef((float) -arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		local744.glTranslatef((float) -arg5, (float) -arg6, (float) -arg7);
		local744.glPopMatrix();
	}

	@OriginalMember(owner = "client!td", name = "m", descriptor = "()V")
	public final void method4093() {
		if (this.aShortArray76 == null) {
			this.method4578();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5295; local7++) {
			@Pc(16) int local16 = this.anIntArray466[local7];
			this.anIntArray466[local7] = this.anIntArray461[local7];
			this.anIntArray461[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt5296; local7++) {
			@Pc(43) short local43 = this.aShortArray85[local7];
			this.aShortArray85[local7] = this.aShortArray76[local7];
			this.aShortArray76[local7] = (short) -local43;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
		if (this.aClass127_2 != null) {
			this.aClass127_2.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "n", descriptor = "()I")
	public final int method4094() {
		return this.aShort29;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	@Override
	public final void method4564(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.anIntArray223[arg0];
		@Pc(7) int local7 = MathUtils.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5295; local9++) {
			@Pc(29) int local29 = this.anIntArray465[local9] * local3 + this.anIntArray461[local9] * local7 >> 16;
			this.anIntArray465[local9] = this.anIntArray465[local9] * local7 - this.anIntArray461[local9] * local3 >> 16;
			this.anIntArray461[local9] = local29;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()I")
	@Override
	public final int method4561() {
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		return this.aClass5_1.aShort5;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
	@Override
	public final int method4550() {
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		return this.aClass5_1.aShort7;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()Z")
	@Override
	public final boolean method4543() {
		return this.aBoolean259 && this.anIntArray461 != null && this.aShortArray76 != null;
	}

	@OriginalMember(owner = "client!td", name = "k", descriptor = "()I")
	@Override
	public final int method4576() {
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		return this.aClass5_1.aShort8;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
	@Override
	public final void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5295; local1++) {
			this.anIntArray461[local1] += arg0;
			this.anIntArray465[local1] += arg1;
			this.anIntArray466[local1] += arg2;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZZZ)Lclient!ak;")
	@Override
	public final Model method4568(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method4114(arg0, arg1, arg2, Static237.aClass8_Sub1_Sub1_6, Static237.aClass8_Sub1_Sub1_5);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!th;IIIZ)V")
	@Override
	public final void method4544(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) GlModel local2 = (GlModel) arg0;
		if (this.anInt5297 == 0 || local2.anInt5297 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt5295;
		@Pc(15) int[] local15 = local2.anIntArray461;
		@Pc(18) int[] local18 = local2.anIntArray465;
		@Pc(21) int[] local21 = local2.anIntArray466;
		@Pc(24) short[] local24 = local2.aShortArray76;
		@Pc(27) short[] local27 = local2.aShortArray79;
		@Pc(30) short[] local30 = local2.aShortArray85;
		@Pc(33) short[] local33 = local2.aShortArray86;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass23_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass23_1.aShortArray8;
			local44 = this.aClass23_1.aShortArray10;
			local48 = this.aClass23_1.aShortArray9;
			local52 = this.aClass23_1.aShortArray7;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass23_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass23_1.aShortArray8;
			local72 = local2.aClass23_1.aShortArray10;
			local76 = local2.aClass23_1.aShortArray9;
			local80 = local2.aClass23_1.aShortArray7;
		}
		@Pc(92) int[] local92 = local2.anIntArray462;
		@Pc(95) short[] local95 = local2.aShortArray81;
		if (!local2.aClass5_1.aBoolean3) {
			local2.method4108();
		}
		@Pc(105) short local105 = local2.aClass5_1.aShort2;
		@Pc(109) short local109 = local2.aClass5_1.aShort3;
		@Pc(113) short local113 = local2.aClass5_1.aShort6;
		@Pc(117) short local117 = local2.aClass5_1.aShort5;
		@Pc(121) short local121 = local2.aClass5_1.aShort8;
		@Pc(125) short local125 = local2.aClass5_1.aShort7;
		for (@Pc(127) int local127 = 0; local127 < this.anInt5295; local127++) {
			@Pc(138) int local138 = this.anIntArray465[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray461[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray466[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray462[local127];
						@Pc(187) int local187 = this.anIntArray462[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray81[local189] - 1;
							if (local175 == -1 || this.aShortArray86[local175] != 0) {
								break;
							}
						}
						if (local175 != -1) {
							for (local189 = 0; local189 < local12; local189++) {
								if (local152 == local15[local189] && local166 == local21[local189] && local138 == local18[local189]) {
									@Pc(237) int local237 = -1;
									local180 = local92[local189];
									local187 = local92[local189 + 1];
									for (@Pc(249) int local249 = local180; local249 < local187; local249++) {
										local237 = local95[local249] - 1;
										if (local237 == -1 || local33[local237] != 0) {
											break;
										}
									}
									if (local237 != -1) {
										if (local40 == null) {
											this.aClass23_1 = new Class23();
											local40 = this.aClass23_1.aShortArray8 = Static263.method4511(this.aShortArray76);
											local44 = this.aClass23_1.aShortArray10 = Static263.method4511(this.aShortArray79);
											local48 = this.aClass23_1.aShortArray9 = Static263.method4511(this.aShortArray85);
											local52 = this.aClass23_1.aShortArray7 = Static263.method4511(this.aShortArray86);
										}
										if (local68 == null) {
											@Pc(325) Class23 local325 = local2.aClass23_1 = new Class23();
											local68 = local325.aShortArray8 = Static263.method4511(local24);
											local72 = local325.aShortArray10 = Static263.method4511(local27);
											local76 = local325.aShortArray9 = Static263.method4511(local30);
											local80 = local325.aShortArray7 = Static263.method4511(local33);
										}
										@Pc(358) short local358 = this.aShortArray76[local175];
										@Pc(363) short local363 = this.aShortArray79[local175];
										@Pc(368) short local368 = this.aShortArray85[local175];
										@Pc(373) short local373 = this.aShortArray86[local175];
										local180 = local92[local189];
										local187 = local92[local189 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local180; local385 < local187; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local237];
										local363 = local27[local237];
										local368 = local30[local237];
										local373 = local33[local237];
										local180 = this.anIntArray462[local127];
										local187 = this.anIntArray462[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray81[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public final void method4571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt5296 == 0) {
			return;
		}
		@Pc(5) GL2 local5 = GlRenderer.gl;
		local5.glPushMatrix();
		if (arg2 != 0) {
			local5.glRotatef((float) arg2 * 0.17578125F, 1.0F, 0.0F, 0.0F);
		}
		local5.glTranslatef((float) arg3, (float) arg4, (float) arg5);
		if (arg0 != 0) {
			local5.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		}
		if (arg1 != 0) {
			local5.glRotatef((float) -arg1 * 0.17578125F, 0.0F, 0.0F, 1.0F);
		}
		this.method4121();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!gb;IJIIIIFF)S")
	private short method4098(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray462[arg1];
		@Pc(11) int local11 = this.anIntArray462[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray81[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static237.aLongArray10[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray81[local13] = (short) (this.anInt5296 + 1);
		Static237.aLongArray10[local13] = arg2;
		this.aShortArray76[this.anInt5296] = (short) arg3;
		this.aShortArray79[this.anInt5296] = (short) arg4;
		this.aShortArray85[this.anInt5296] = (short) arg5;
		this.aShortArray86[this.anInt5296] = (short) arg6;
		this.aFloatArray25[this.anInt5296] = arg7;
		this.aFloatArray26[this.anInt5296] = arg8;
		return (short) this.anInt5296++;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public final void method4554(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.anIntArray223[arg0];
		@Pc(7) int local7 = MathUtils.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5295; local9++) {
			@Pc(29) int local29 = this.anIntArray466[local9] * local3 + this.anIntArray461[local9] * local7 >> 16;
			this.anIntArray466[local9] = this.anIntArray466[local9] * local7 - this.anIntArray461[local9] * local3 >> 16;
			this.anIntArray461[local9] = local29;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected final void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(33) int local33;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			Static237.anInt5298 = 0;
			Static237.anInt5300 = 0;
			Static237.anInt5299 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray36.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray36[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local53]) != 0) {
							Static237.anInt5298 += this.anIntArray461[local53];
							Static237.anInt5300 += this.anIntArray465[local53];
							Static237.anInt5299 += this.anIntArray466[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static237.anInt5298 = Static237.anInt5298 / local18 + arg2;
				Static237.anInt5300 = Static237.anInt5300 / local18 + arg3;
				Static237.anInt5299 = Static237.anInt5299 / local18 + arg4;
				Static237.aBoolean260 = true;
			} else {
				Static237.anInt5298 = arg2;
				Static237.anInt5300 = arg3;
				Static237.anInt5299 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray36.length) {
					local228 = this.anIntArrayArray36[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local45]) != 0) {
							this.anIntArray461[local45] += arg2;
							this.anIntArray465[local45] += arg3;
							this.anIntArray466[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(428) int local428;
		@Pc(434) int local434;
		@Pc(440) int local440;
		@Pc(446) int local446;
		@Pc(454) int local454;
		@Pc(462) int local462;
		@Pc(615) int local615;
		@Pc(640) int local640;
		@Pc(644) int local644;
		@Pc(652) int local652;
		@Pc(657) int local657;
		@Pc(662) int local662;
		@Pc(667) int local667;
		@Pc(789) int[] local789;
		@Pc(791) int local791;
		@Pc(796) int local796;
		@Pc(801) int local801;
		@Pc(803) int local803;
		@Pc(929) int local929;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray36.length) {
						local228 = this.anIntArrayArray36[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local45]) != 0) {
								this.anIntArray461[local45] -= Static237.anInt5298;
								this.anIntArray465[local45] -= Static237.anInt5300;
								this.anIntArray466[local45] -= Static237.anInt5299;
								if (arg4 != 0) {
									local53 = MathUtils.anIntArray223[arg4];
									local343 = MathUtils.anIntArray225[arg4];
									local365 = this.anIntArray465[local45] * local53 + this.anIntArray461[local45] * local343 + 32767 >> 16;
									this.anIntArray465[local45] = this.anIntArray465[local45] * local343 + 32767 - this.anIntArray461[local45] * local53 >> 16;
									this.anIntArray461[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = MathUtils.anIntArray223[arg2];
									local343 = MathUtils.anIntArray225[arg2];
									local365 = this.anIntArray465[local45] * local343 + 32767 - this.anIntArray466[local45] * local53 >> 16;
									this.anIntArray466[local45] = this.anIntArray465[local45] * local53 + this.anIntArray466[local45] * local343 + 32767 >> 16;
									this.anIntArray465[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = MathUtils.anIntArray223[arg3];
									local343 = MathUtils.anIntArray225[arg3];
									local365 = this.anIntArray466[local45] * local53 + this.anIntArray461[local45] * local343 + 32767 >> 16;
									this.anIntArray466[local45] = this.anIntArray466[local45] * local343 + 32767 - this.anIntArray461[local45] * local53 >> 16;
									this.anIntArray461[local45] = local365;
								}
								this.anIntArray461[local45] += Static237.anInt5298;
								this.anIntArray465[local45] += Static237.anInt5300;
								this.anIntArray466[local45] += Static237.anInt5299;
							}
						}
					}
				}
				if (arg5 && this.aShortArray76 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray36.length) {
							local228 = this.anIntArrayArray36[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local45]) != 0) {
									local53 = this.anIntArray462[local45];
									local343 = this.anIntArray462[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray81[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = MathUtils.anIntArray223[arg4];
											local434 = MathUtils.anIntArray225[arg4];
											local440 = this.aShortArray79[local387] * local428 + this.aShortArray76[local387] * local434 + 32767 >> 16;
											this.aShortArray79[local387] = (short) (this.aShortArray79[local387] * local434 + 32767 - this.aShortArray76[local387] * local428 >> 16);
											this.aShortArray76[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = MathUtils.anIntArray223[arg2];
											local434 = MathUtils.anIntArray225[arg2];
											local440 = this.aShortArray79[local387] * local434 + 32767 - this.aShortArray85[local387] * local428 >> 16;
											this.aShortArray85[local387] = (short) (this.aShortArray79[local387] * local428 + this.aShortArray85[local387] * local434 + 32767 >> 16);
											this.aShortArray79[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = MathUtils.anIntArray223[arg3];
											local434 = MathUtils.anIntArray225[arg3];
											local440 = this.aShortArray85[local387] * local428 + this.aShortArray76[local387] * local434 + 32767 >> 16;
											this.aShortArray85[local387] = (short) (this.aShortArray85[local387] * local434 + 32767 - this.aShortArray76[local387] * local428 >> 16);
											this.aShortArray76[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass127_2 != null) {
						this.aClass127_2.aBoolean235 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static237.aBoolean260) {
					local343 = arg7[0] * Static237.anInt5298 + arg7[3] * Static237.anInt5300 + arg7[6] * Static237.anInt5299 + 16384 >> 15;
					local365 = arg7[1] * Static237.anInt5298 + arg7[4] * Static237.anInt5300 + arg7[7] * Static237.anInt5299 + 16384 >> 15;
					local387 = arg7[2] * Static237.anInt5298 + arg7[5] * Static237.anInt5300 + arg7[8] * Static237.anInt5299 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static237.anInt5298 = local343;
					Static237.anInt5300 = local365;
					Static237.anInt5299 = local387;
					Static237.aBoolean260 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = MathUtils.anIntArray225[arg2] >> 1;
				local387 = MathUtils.anIntArray223[arg2] >> 1;
				local428 = MathUtils.anIntArray225[arg3] >> 1;
				local434 = MathUtils.anIntArray223[arg3] >> 1;
				local440 = MathUtils.anIntArray225[arg4] >> 1;
				local446 = MathUtils.anIntArray223[arg4] >> 1;
				local454 = local387 * local440 + 16384 >> 15;
				local462 = local387 * local446 + 16384 >> 15;
				local410[0] = local428 * local440 + local434 * local462 + 16384 >> 15;
				local410[1] = -local428 * local446 + local434 * local454 + 16384 >> 15;
				local410[2] = local434 * local365 + 16384 >> 15;
				local410[3] = local365 * local446 + 16384 >> 15;
				local410[4] = local365 * local440 + 16384 >> 15;
				local410[5] = -local387;
				local410[6] = -local434 * local440 + local428 * local462 + 16384 >> 15;
				local410[7] = local434 * local446 + local428 * local454 + 16384 >> 15;
				local410[8] = local428 * local365 + 16384 >> 15;
				@Pc(590) int local590 = local410[0] * -Static237.anInt5298 + local410[1] * -Static237.anInt5300 + local410[2] * -Static237.anInt5299 + 16384 >> 15;
				local615 = local410[3] * -Static237.anInt5298 + local410[4] * -Static237.anInt5300 + local410[5] * -Static237.anInt5299 + 16384 >> 15;
				local640 = local410[6] * -Static237.anInt5298 + local410[7] * -Static237.anInt5300 + local410[8] * -Static237.anInt5299 + 16384 >> 15;
				local644 = local590 + Static237.anInt5298;
				@Pc(648) int local648 = local615 + Static237.anInt5300;
				local652 = local640 + Static237.anInt5299;
				@Pc(655) int[] local655 = new int[9];
				for (local657 = 0; local657 < 3; local657++) {
					for (local662 = 0; local662 < 3; local662++) {
						local667 = 0;
						for (@Pc(669) int local669 = 0; local669 < 3; local669++) {
							local667 += local410[local657 * 3 + local669] * arg7[local662 * 3 + local669];
						}
						local655[local657 * 3 + local662] = local667 + 16384 >> 15;
					}
				}
				local657 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 16384 >> 15;
				local662 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 16384 >> 15;
				local667 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 16384 >> 15;
				local657 += local644;
				local662 += local648;
				local667 += local652;
				local789 = new int[9];
				for (local791 = 0; local791 < 3; local791++) {
					for (local796 = 0; local796 < 3; local796++) {
						local801 = 0;
						for (local803 = 0; local803 < 3; local803++) {
							local801 += arg7[local791 * 3 + local803] * local655[local796 + local803 * 3];
						}
						local789[local791 * 3 + local796] = local801 + 16384 >> 15;
					}
				}
				local791 = arg7[0] * local657 + arg7[1] * local662 + arg7[2] * local667 + 16384 >> 15;
				local796 = arg7[3] * local657 + arg7[4] * local662 + arg7[5] * local667 + 16384 >> 15;
				local801 = arg7[6] * local657 + arg7[7] * local662 + arg7[8] * local667 + 16384 >> 15;
				local791 += local18;
				local796 += local26;
				local801 += local33;
				for (local803 = 0; local803 < local2; local803++) {
					local929 = arg1[local803];
					if (local929 < this.anIntArrayArray36.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray36[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray461[local949] + local789[1] * this.anIntArray465[local949] + local789[2] * this.anIntArray466[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray461[local949] + local789[4] * this.anIntArray465[local949] + local789[5] * this.anIntArray466[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray461[local949] + local789[7] * this.anIntArray465[local949] + local789[8] * this.anIntArray466[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray461[local949] = local1057;
								this.anIntArray465[local949] = local1061;
								this.anIntArray466[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray36.length) {
						local228 = this.anIntArrayArray36[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local45]) != 0) {
								this.anIntArray461[local45] -= Static237.anInt5298;
								this.anIntArray465[local45] -= Static237.anInt5300;
								this.anIntArray466[local45] -= Static237.anInt5299;
								this.anIntArray461[local45] = this.anIntArray461[local45] * arg2 >> 7;
								this.anIntArray465[local45] = this.anIntArray465[local45] * arg3 >> 7;
								this.anIntArray466[local45] = this.anIntArray466[local45] * arg4 >> 7;
								this.anIntArray461[local45] += Static237.anInt5298;
								this.anIntArray465[local45] += Static237.anInt5300;
								this.anIntArray466[local45] += Static237.anInt5299;
							}
						}
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static237.aBoolean260) {
					local343 = arg7[0] * Static237.anInt5298 + arg7[3] * Static237.anInt5300 + arg7[6] * Static237.anInt5299 + 16384 >> 15;
					local365 = arg7[1] * Static237.anInt5298 + arg7[4] * Static237.anInt5300 + arg7[7] * Static237.anInt5299 + 16384 >> 15;
					local387 = arg7[2] * Static237.anInt5298 + arg7[5] * Static237.anInt5300 + arg7[8] * Static237.anInt5299 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static237.anInt5298 = local343;
					Static237.anInt5300 = local365;
					Static237.anInt5299 = local387;
					Static237.aBoolean260 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static237.anInt5298 + 16384 >> 15;
				local434 = local365 * -Static237.anInt5300 + 16384 >> 15;
				local440 = local387 * -Static237.anInt5299 + 16384 >> 15;
				local446 = local428 + Static237.anInt5298;
				local454 = local434 + Static237.anInt5300;
				local462 = local440 + Static237.anInt5299;
				@Pc(1783) int[] local1783 = new int[] { local343 * arg7[0] + 16384 >> 15, local343 * arg7[3] + 16384 >> 15, local343 * arg7[6] + 16384 >> 15, local365 * arg7[1] + 16384 >> 15, local365 * arg7[4] + 16384 >> 15, local365 * arg7[7] + 16384 >> 15, local387 * arg7[2] + 16384 >> 15, local387 * arg7[5] + 16384 >> 15, local387 * arg7[8] + 16384 >> 15 };
				local615 = local343 * local230 + 16384 >> 15;
				local640 = local365 * local45 + 16384 >> 15;
				local644 = local387 * local53 + 16384 >> 15;
				@Pc(1919) int local1919 = local615 + local446;
				@Pc(1923) int local1923 = local640 + local454;
				@Pc(1927) int local1927 = local644 + local462;
				@Pc(1930) int[] local1930 = new int[9];
				@Pc(1937) int local1937;
				for (local652 = 0; local652 < 3; local652++) {
					for (local1937 = 0; local1937 < 3; local1937++) {
						local657 = 0;
						for (local662 = 0; local662 < 3; local662++) {
							local657 += arg7[local652 * 3 + local662] * local1783[local1937 + local662 * 3];
						}
						local1930[local652 * 3 + local1937] = local657 + 16384 >> 15;
					}
				}
				local652 = arg7[0] * local1919 + arg7[1] * local1923 + arg7[2] * local1927 + 16384 >> 15;
				local1937 = arg7[3] * local1919 + arg7[4] * local1923 + arg7[5] * local1927 + 16384 >> 15;
				local657 = arg7[6] * local1919 + arg7[7] * local1923 + arg7[8] * local1927 + 16384 >> 15;
				local652 += local18;
				local1937 += local26;
				local657 += local33;
				for (local662 = 0; local662 < local2; local662++) {
					local667 = arg1[local662];
					if (local667 < this.anIntArrayArray36.length) {
						local789 = this.anIntArrayArray36[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray461[local796] + local1930[1] * this.anIntArray465[local796] + local1930[2] * this.anIntArray466[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray461[local796] + local1930[4] * this.anIntArray465[local796] + local1930[5] * this.anIntArray466[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray461[local796] + local1930[7] * this.anIntArray465[local796] + local1930[8] * this.anIntArray466[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray461[local796] = local2198;
								this.anIntArray465[local796] = local2202;
								this.anIntArray466[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray37 != null && this.aByteArray71 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray37.length) {
						local228 = this.anIntArrayArray37[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local45]) != 0) {
								local53 = (this.aByteArray71[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray71[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass127_1.aBoolean235 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray37 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray37.length) {
					local228 = this.anIntArrayArray37[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local45]) != 0) {
							local53 = this.aShortArray75[local45] & 0xFFFF;
							local343 = local53 >> 10 & 0x3F;
							local365 = local53 >> 7 & 0x7;
							local387 = local53 & 0x7F;
							@Pc(2518) int local2518 = local343 + arg2 & 0x3F;
							local365 += arg3 / 4;
							if (local365 < 0) {
								local365 = 0;
							} else if (local365 > 7) {
								local365 = 7;
							}
							local387 += arg4;
							if (local387 < 0) {
								local387 = 0;
							} else if (local387 > 127) {
								local387 = 127;
							}
							this.aShortArray75[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass127_1.aBoolean235 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
	@Override
	public final int method4549() {
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		return this.aClass5_1.aShort2;
	}

	@OriginalMember(owner = "client!td", name = "o", descriptor = "()V")
	public final void method4099() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray464 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt5295; local9++) {
				local20 = this.anIntArray464[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray36 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray36[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt5295) {
				local20 = this.anIntArray464[local9] & 0xFF;
				this.anIntArrayArray36[local20][local5[local20]++] = local9++;
			}
			this.anIntArray464 = null;
		}
		if (this.aByteArray72 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt5297; local9++) {
			local20 = this.aByteArray72[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray37 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray37[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt5297) {
			local20 = this.aByteArray72[local9] & 0xFF;
			this.anIntArrayArray37[local20][local5[local20]++] = local9++;
		}
		this.aByteArray72 = null;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public final void method4100(@OriginalArg(0) int arg0) {
		this.aShort28 = (short) arg0;
		if (this.aClass127_2 != null) {
			this.aClass127_2.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "p", descriptor = "()V")
	public final void method4102() {
		if (this.aShortArray76 == null) {
			this.method4552();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5295; local7++) {
			this.anIntArray461[local7] = -this.anIntArray461[local7];
			this.anIntArray466[local7] = -this.anIntArray466[local7];
		}
		for (local7 = 0; local7 < this.anInt5296; local7++) {
			this.aShortArray76[local7] = (short) -this.aShortArray76[local7];
			this.aShortArray85[local7] = (short) -this.aShortArray85[local7];
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
		if (this.aClass127_2 != null) {
			this.aClass127_2.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
	@Override
	public final void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5295; local1++) {
			this.anIntArray461[local1] = this.anIntArray461[local1] * arg0 >> 7;
			this.anIntArray465[local1] = this.anIntArray465[local1] * arg1 >> 7;
			this.anIntArray466[local1] = this.anIntArray466[local1] * arg2 >> 7;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(ZZZ)Lclient!ak;")
	@Override
	public final Model method4572(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method4114(arg0, arg1, arg2, Static237.aClass8_Sub1_Sub1_2, Static237.aClass8_Sub1_Sub1_1);
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
	@Override
	public final void method4552() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5295; local1++) {
			this.anIntArray461[local1] = -this.anIntArray461[local1];
			this.anIntArray466[local1] = -this.anIntArray466[local1];
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "q", descriptor = "()V")
	private void method4103() {
		if (Static237.aClass3_Sub15_8.data.length < this.anInt5296 * 12) {
			Static237.aClass3_Sub15_8 = new Buffer((this.anInt5296 + 100) * 12);
		} else {
			Static237.aClass3_Sub15_8.offset = 0;
		}
		@Pc(25) int local25;
		if (GlRenderer.bigEndian) {
			for (local25 = 0; local25 < this.anInt5297; local25++) {
				Static237.aClass3_Sub15_8.p4(this.aShortArray77[local25]);
				Static237.aClass3_Sub15_8.p4(this.aShortArray82[local25]);
				Static237.aClass3_Sub15_8.p4(this.aShortArray83[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt5297; local25++) {
				Static237.aClass3_Sub15_8.p4le(this.aShortArray77[local25]);
				Static237.aClass3_Sub15_8.p4le(this.aShortArray82[local25]);
				Static237.aClass3_Sub15_8.p4le(this.aShortArray83[local25]);
			}
		}
		if (!GlRenderer.arbVboSupported) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static237.aClass3_Sub15_8.offset);
			local115.put(Static237.aClass3_Sub15_8.data, 0, Static237.aClass3_Sub15_8.offset);
			local115.flip();
			this.aClass127_5.aBoolean235 = true;
			this.aClass127_5.aByteBuffer8 = local115;
			this.aClass127_5.aClass155_4 = null;
			return;
		}
		@Pc(88) GlVertexBufferObject local88 = new GlVertexBufferObject();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static237.aClass3_Sub15_8.data, 0, Static237.aClass3_Sub15_8.offset);
		local88.method4519(local95);
		this.aClass127_5.aBoolean235 = true;
		this.aClass127_5.aByteBuffer8 = null;
		this.aClass127_5.aClass155_4 = local88;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public final void method4105(@OriginalArg(0) int arg0) {
		this.aShort29 = (short) arg0;
		this.aClass127_1.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()Z")
	@Override
	protected final boolean method4551() {
		if (this.anIntArrayArray36 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt5295; local6++) {
			this.anIntArray461[local6] <<= 0x4;
			this.anIntArray465[local6] <<= 0x4;
			this.anIntArray466[local6] <<= 0x4;
		}
		Static237.anInt5298 = 0;
		Static237.anInt5300 = 0;
		Static237.anInt5299 = 0;
		return true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(SS)V")
	public final void method4107(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5297; local1++) {
			if (this.aShortArray80[local1] == arg0) {
				this.aShortArray80[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Rasteriser.anInterface1_2.method3238(arg0 & 0xFFFF);
			local22 = Rasteriser.anInterface1_2.method3229(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Rasteriser.anInterface1_2.method3238(arg1 & 0xFFFF);
			local43 = Rasteriser.anInterface1_2.method3229(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass127_1.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "s", descriptor = "()V")
	private void method4108() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5295; local17++) {
			@Pc(26) int local26 = this.anIntArray461[local17];
			@Pc(31) int local31 = this.anIntArray465[local17];
			@Pc(36) int local36 = this.anIntArray466[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aClass5_1.aShort6 = (short) local1;
		this.aClass5_1.aShort5 = (short) local7;
		this.aClass5_1.aShort2 = (short) local3;
		this.aClass5_1.aShort3 = (short) local9;
		this.aClass5_1.aShort8 = (short) local5;
		this.aClass5_1.aShort7 = (short) local11;
		this.aClass5_1.aShort4 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass5_1.aBoolean3 = true;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(SS)V")
	public final void method4109(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5297; local1++) {
			if (this.aShortArray75[local1] == arg0) {
				this.aShortArray75[local1] = arg1;
			}
		}
		this.aClass127_1.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!td;[[I[[IIII)V")
	public final void method4110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GlModel arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass5_1.aBoolean3) {
			arg2.method4108();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass5_1.aShort6;
		@Pc(17) int local17 = arg5 + arg2.aClass5_1.aShort5;
		@Pc(23) int local23 = arg7 + arg2.aClass5_1.aShort8;
		@Pc(29) int local29 = arg7 + arg2.aClass5_1.aShort7;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local11 < 0 || local17 + 128 >> 7 >= arg3.length || local23 < 0 || local29 + 128 >> 7 >= arg3[0].length)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg4 == null) {
				return;
			}
			if (local11 < 0 || local17 + 128 >> 7 >= arg4.length || local23 < 0 || local29 + 128 >> 7 >= arg4[0].length) {
				return;
			}
		} else {
			local11 >>= 0x7;
			local17 = local17 + 127 >> 7;
			local23 >>= 0x7;
			local29 = local29 + 127 >> 7;
			if (arg3[local11][local23] == arg6 && arg3[local17][local23] == arg6 && arg3[local11][local29] == arg6 && arg3[local17][local29] == arg6) {
				return;
			}
		}
		@Pc(150) int local150;
		@Pc(161) int local161;
		@Pc(168) int local168;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(206) int local206;
		@Pc(232) int local232;
		@Pc(244) int local244;
		if (arg0 == 1) {
			for (local150 = 0; local150 < this.anInt5295; local150++) {
				local161 = this.anIntArray461[local150] + arg5;
				local168 = this.anIntArray466[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray465[local150] = this.anIntArray465[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass5_1.aShort2;
				for (local161 = 0; local161 < this.anInt5295; local161++) {
					local168 = (this.anIntArray465[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray461[local161] + arg5;
						local176 = this.anIntArray466[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray465[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method4573(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass5_1.aShort3 - arg2.aClass5_1.aShort2;
				for (local161 = 0; local161 < this.anInt5295; local161++) {
					local168 = this.anIntArray461[local161] + arg5;
					local172 = this.anIntArray466[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray465[local161] = this.anIntArray465[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass5_1.aShort3 - arg2.aClass5_1.aShort2;
				for (local161 = 0; local161 < this.anInt5295; local161++) {
					local168 = this.anIntArray461[local161] + arg5;
					local172 = this.anIntArray466[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg3[local184][local206] * (128 - local176) + arg3[local184 + 1][local206] * local176 >> 7;
					local244 = arg3[local184][local206 + 1] * (128 - local176) + arg3[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local374 = local232 * (128 - local180) + local244 * local180 >> 7;
					@Pc(716) int local716 = local362 - local374;
					this.anIntArray465[local161] = ((this.anIntArray465[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass127_4.aBoolean235 = false;
		this.aClass5_1.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZZZZZ)V")
	public final void method4111(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte18 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt5296 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass127_1.aBoolean235 && (arg1 || arg2 && !Static178.highDetailLighting);
				this.method4113(false, !this.aClass127_4.aBoolean235 && arg0, local26, this.aClass127_2 != null && !this.aClass127_2.aBoolean235 && arg2, !this.aClass127_3.aBoolean235);
				if (!this.aClass127_5.aBoolean235 && arg3 && arg1) {
					this.method4103();
				}
			}
			if (arg0) {
				if (this.aClass127_4.aBoolean235) {
					if (!this.aClass5_1.aBoolean3) {
						this.method4108();
					}
					this.anIntArray461 = null;
					this.anIntArray465 = null;
					this.anIntArray466 = null;
					this.aShortArray81 = null;
					this.anIntArray462 = null;
				} else {
					this.aByte19 = (byte) (this.aByte19 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass127_1.aBoolean235) {
					this.aShortArray75 = null;
					this.aByteArray71 = null;
				} else {
					this.aByte19 = (byte) (this.aByte19 | 0x2);
				}
			}
			if (arg2 && Static178.highDetailLighting) {
				if (this.aClass127_2.aBoolean235) {
					this.aShortArray76 = null;
					this.aShortArray79 = null;
					this.aShortArray85 = null;
					this.aShortArray86 = null;
				} else {
					this.aByte19 = (byte) (this.aByte19 | 0x4);
				}
			}
			if (this.aClass127_3.aBoolean235) {
				this.aFloatArray25 = null;
				this.aFloatArray26 = null;
			} else {
				this.aByte19 = (byte) (this.aByte19 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass127_5.aBoolean235 && this.aClass127_1.aBoolean235) {
					this.aShortArray77 = null;
					this.aShortArray82 = null;
					this.aShortArray83 = null;
				} else {
					this.aByte19 = (byte) (this.aByte19 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray464 = null;
				this.aByteArray72 = null;
				this.anIntArrayArray36 = null;
				this.anIntArrayArray37 = null;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZZZ)V")
	private void method4113(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass127_4.anInt4777 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass127_1.anInt4777 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass127_2.anInt4777 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass127_3.anInt4777 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static237.aClass3_Sub15_8.data.length < this.anInt5296 * local1) {
			Static237.aClass3_Sub15_8 = new Buffer((this.anInt5296 + 100) * local1);
		} else {
			Static237.aClass3_Sub15_8.offset = 0;
		}
		@Pc(60) int local60;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(85) int local85;
		@Pc(90) int local90;
		@Pc(97) int local97;
		@Pc(99) int local99;
		if (arg1) {
			@Pc(109) int local109;
			if (GlRenderer.bigEndian) {
				for (local60 = 0; local60 < this.anInt5295; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray461[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray465[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray466[local60]);
					local90 = this.anIntArray462[local60];
					local97 = this.anIntArray462[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray81[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static237.aClass3_Sub15_8.offset = local109 * local1;
						Static237.aClass3_Sub15_8.p4(local71);
						Static237.aClass3_Sub15_8.p4(local78);
						Static237.aClass3_Sub15_8.p4(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt5295; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray461[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray465[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray466[local60]);
					local90 = this.anIntArray462[local60];
					local97 = this.anIntArray462[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray81[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static237.aClass3_Sub15_8.offset = local109 * local1;
						Static237.aClass3_Sub15_8.p4le(local71);
						Static237.aClass3_Sub15_8.p4le(local78);
						Static237.aClass3_Sub15_8.p4le(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static178.highDetailLighting) {
				for (local60 = 0; local60 < this.anInt5297; local60++) {
					local71 = Static237.method4096(this.aShortArray75[local60], this.aShortArray80[local60], this.aShort29, this.aByteArray71[local60]);
					Static237.aClass3_Sub15_8.offset = this.aClass127_1.anInt4777 + this.aShortArray77[local60] * local1;
					Static237.aClass3_Sub15_8.p4(local71);
					Static237.aClass3_Sub15_8.offset = this.aClass127_1.anInt4777 + this.aShortArray82[local60] * local1;
					Static237.aClass3_Sub15_8.p4(local71);
					Static237.aClass3_Sub15_8.offset = this.aClass127_1.anInt4777 + this.aShortArray83[local60] * local1;
					Static237.aClass3_Sub15_8.p4(local71);
				}
			} else {
				local60 = (int) Static161.aFloatArray18[0];
				local71 = (int) Static161.aFloatArray18[1];
				local78 = (int) Static161.aFloatArray18[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort29 * 1.3F);
				local97 = this.aShort28 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt5297; local99++) {
					@Pc(270) short local270 = this.aShortArray77[local99];
					@Pc(275) short local275 = this.aShortArray86[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray76[local270] + local71 * this.aShortArray79[local270] + local78 * this.aShortArray85[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray76[local270] + local71 * this.aShortArray79[local270] + local78 * this.aShortArray85[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray86[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray82[local99];
					@Pc(369) short local369 = this.aShortArray86[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray76[local364] + local71 * this.aShortArray79[local364] + local78 * this.aShortArray85[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray76[local364] + local71 * this.aShortArray79[local364] + local78 * this.aShortArray85[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray86[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray83[local99];
					@Pc(463) short local463 = this.aShortArray86[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray76[local458] + local71 * this.aShortArray79[local458] + local78 * this.aShortArray85[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray76[local458] + local71 * this.aShortArray79[local458] + local78 * this.aShortArray85[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray86[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static237.method4096(this.aShortArray75[local99], this.aShortArray80[local99], local281, this.aByteArray71[local99]);
					@Pc(577) int local577 = Static237.method4096(this.aShortArray75[local99], this.aShortArray80[local99], local375, this.aByteArray71[local99]);
					@Pc(592) int local592 = Static237.method4096(this.aShortArray75[local99], this.aShortArray80[local99], local469, this.aByteArray71[local99]);
					Static237.aClass3_Sub15_8.offset = this.aClass127_1.anInt4777 + local270 * local1;
					Static237.aClass3_Sub15_8.p4(local562);
					Static237.aClass3_Sub15_8.offset = this.aClass127_1.anInt4777 + local364 * local1;
					Static237.aClass3_Sub15_8.p4(local577);
					Static237.aClass3_Sub15_8.offset = this.aClass127_1.anInt4777 + local458 * local1;
					Static237.aClass3_Sub15_8.p4(local592);
				}
				this.aShortArray76 = null;
				this.aShortArray79 = null;
				this.aShortArray85 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort28;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort28 + this.aShort28 / 2);
			Static237.aClass3_Sub15_8.offset = this.aClass127_2.anInt4777;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (GlRenderer.bigEndian) {
				for (local78 = 0; local78 < this.anInt5296; local78++) {
					local752 = this.aShortArray86[local78];
					if (local752 == 0) {
						Static237.aClass3_Sub15_8.pFloat((float) this.aShortArray76[local78] * local734);
						Static237.aClass3_Sub15_8.pFloat((float) this.aShortArray79[local78] * local734);
						Static237.aClass3_Sub15_8.pFloat((float) this.aShortArray85[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static237.aClass3_Sub15_8.pFloat((float) this.aShortArray76[local78] * local790);
						Static237.aClass3_Sub15_8.pFloat((float) this.aShortArray79[local78] * local790);
						Static237.aClass3_Sub15_8.pFloat((float) this.aShortArray85[local78] * local790);
					}
					Static237.aClass3_Sub15_8.offset += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt5296; local78++) {
					local752 = this.aShortArray86[local78];
					if (local752 == 0) {
						Static237.aClass3_Sub15_8.gFloat((float) this.aShortArray76[local78] * local734);
						Static237.aClass3_Sub15_8.gFloat((float) this.aShortArray79[local78] * local734);
						Static237.aClass3_Sub15_8.gFloat((float) this.aShortArray85[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static237.aClass3_Sub15_8.gFloat((float) this.aShortArray76[local78] * local790);
						Static237.aClass3_Sub15_8.gFloat((float) this.aShortArray79[local78] * local790);
						Static237.aClass3_Sub15_8.gFloat((float) this.aShortArray85[local78] * local790);
					}
					Static237.aClass3_Sub15_8.offset += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static237.aClass3_Sub15_8.offset = this.aClass127_3.anInt4777;
			if (GlRenderer.bigEndian) {
				for (local60 = 0; local60 < this.anInt5296; local60++) {
					Static237.aClass3_Sub15_8.pFloat(this.aFloatArray25[local60]);
					Static237.aClass3_Sub15_8.pFloat(this.aFloatArray26[local60]);
					Static237.aClass3_Sub15_8.offset += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt5296; local60++) {
					Static237.aClass3_Sub15_8.gFloat(this.aFloatArray25[local60]);
					Static237.aClass3_Sub15_8.gFloat(this.aFloatArray26[local60]);
					Static237.aClass3_Sub15_8.offset += local1 - 8;
				}
			}
		}
		Static237.aClass3_Sub15_8.offset = local1 * this.anInt5296;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (GlRenderer.aBoolean273) {
				local1007 = ByteBuffer.wrap(Static237.aClass3_Sub15_8.data, 0, Static237.aClass3_Sub15_8.offset);
				if (this.aClass155_5 == null) {
					this.aClass155_5 = new GlVertexBufferObject(true);
					this.aClass155_5.method4519(local1007);
				} else {
					this.aClass155_5.method4515(local1007);
				}
				if (arg1) {
					this.aClass127_4.aBoolean235 = true;
					this.aClass127_4.aByteBuffer8 = null;
					this.aClass127_4.aClass155_4 = this.aClass155_5;
					this.aClass127_4.anInt4782 = local1;
				}
				if (arg2) {
					this.aClass127_1.aBoolean235 = true;
					this.aClass127_1.aByteBuffer8 = null;
					this.aClass127_1.aClass155_4 = this.aClass155_5;
					this.aClass127_1.anInt4782 = local1;
				}
				if (arg3) {
					this.aClass127_2.aBoolean235 = true;
					this.aClass127_2.aByteBuffer8 = null;
					this.aClass127_2.aClass155_4 = this.aClass155_5;
					this.aClass127_2.anInt4782 = local1;
				}
				if (arg4) {
					this.aClass127_3.aBoolean235 = true;
					this.aClass127_3.aByteBuffer8 = null;
					this.aClass127_3.aClass155_4 = this.aClass155_5;
					this.aClass127_3.anInt4782 = local1;
				}
			} else {
				if (Static237.aByteBuffer9 == null || Static237.aByteBuffer9.capacity() < Static237.aClass3_Sub15_8.offset) {
					Static237.aByteBuffer9 = ByteBuffer.allocateDirect(Static237.aClass3_Sub15_8.offset + local1 * 100);
				} else {
					Static237.aByteBuffer9.clear();
				}
				Static237.aByteBuffer9.put(Static237.aClass3_Sub15_8.data, 0, Static237.aClass3_Sub15_8.offset);
				Static237.aByteBuffer9.flip();
				if (arg1) {
					this.aClass127_4.aBoolean235 = true;
					this.aClass127_4.aByteBuffer8 = Static237.aByteBuffer9;
					this.aClass127_4.aClass155_4 = null;
					this.aClass127_4.anInt4782 = local1;
				}
				if (arg2) {
					this.aClass127_1.aBoolean235 = true;
					this.aClass127_1.aByteBuffer8 = Static237.aByteBuffer9;
					this.aClass127_4.aClass155_4 = null;
					this.aClass127_1.anInt4782 = local1;
				}
				if (arg3) {
					this.aClass127_2.aBoolean235 = true;
					this.aClass127_2.aByteBuffer8 = Static237.aByteBuffer9;
					this.aClass127_2.aClass155_4 = null;
					this.aClass127_2.anInt4782 = local1;
				}
				if (arg4) {
					this.aClass127_3.aBoolean235 = true;
					this.aClass127_3.aByteBuffer8 = Static237.aByteBuffer9;
					this.aClass127_3.aClass155_4 = null;
					this.aClass127_3.anInt4782 = local1;
				}
			}
		} else if (GlRenderer.arbVboSupported) {
			@Pc(1211) GlVertexBufferObject local1211 = new GlVertexBufferObject();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static237.aClass3_Sub15_8.data, 0, Static237.aClass3_Sub15_8.offset);
			local1211.method4519(local1218);
			if (arg1) {
				this.aClass127_4.aBoolean235 = true;
				this.aClass127_4.aByteBuffer8 = null;
				this.aClass127_4.aClass155_4 = local1211;
				this.aClass127_4.anInt4782 = local1;
			}
			if (arg2) {
				this.aClass127_1.aBoolean235 = true;
				this.aClass127_1.aByteBuffer8 = null;
				this.aClass127_1.aClass155_4 = local1211;
				this.aClass127_1.anInt4782 = local1;
			}
			if (arg3) {
				this.aClass127_2.aBoolean235 = true;
				this.aClass127_2.aByteBuffer8 = null;
				this.aClass127_2.aClass155_4 = local1211;
				this.aClass127_2.anInt4782 = local1;
			}
			if (arg4) {
				this.aClass127_3.aBoolean235 = true;
				this.aClass127_3.aByteBuffer8 = null;
				this.aClass127_3.aClass155_4 = local1211;
				this.aClass127_3.anInt4782 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static237.aClass3_Sub15_8.offset);
			local1007.put(Static237.aClass3_Sub15_8.data, 0, Static237.aClass3_Sub15_8.offset);
			local1007.flip();
			if (arg1) {
				this.aClass127_4.aBoolean235 = true;
				this.aClass127_4.aByteBuffer8 = local1007;
				this.aClass127_4.aClass155_4 = null;
				this.aClass127_4.anInt4782 = local1;
			}
			if (arg2) {
				this.aClass127_1.aBoolean235 = true;
				this.aClass127_1.aByteBuffer8 = local1007;
				this.aClass127_4.aClass155_4 = null;
				this.aClass127_1.anInt4782 = local1;
			}
			if (arg3) {
				this.aClass127_2.aBoolean235 = true;
				this.aClass127_2.aByteBuffer8 = local1007;
				this.aClass127_2.aClass155_4 = null;
				this.aClass127_2.anInt4782 = local1;
			}
			if (arg4) {
				this.aClass127_3.aBoolean235 = true;
				this.aClass127_3.aByteBuffer8 = local1007;
				this.aClass127_3.aClass155_4 = null;
				this.aClass127_3.anInt4782 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZLclient!td;Lclient!td;)Lclient!ak;")
	private Model method4114(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) GlModel arg3, @OriginalArg(4) GlModel arg4) {
		arg3.anInt5295 = this.anInt5295;
		arg3.anInt5296 = this.anInt5296;
		arg3.anInt5297 = this.anInt5297;
		arg3.aShort29 = this.aShort29;
		arg3.aShort28 = this.aShort28;
		arg3.aByte18 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray461 == null || arg3.anIntArray461.length < this.anInt5295) {
			arg3.anIntArray461 = new int[this.anInt5295 + 100];
			arg3.anIntArray465 = new int[this.anInt5295 + 100];
			arg3.anIntArray466 = new int[this.anInt5295 + 100];
		}
		@Pc(69) int local69;
		for (local69 = 0; local69 < this.anInt5295; local69++) {
			arg3.anIntArray461[local69] = this.anIntArray461[local69];
			arg3.anIntArray465[local69] = this.anIntArray465[local69];
			arg3.anIntArray466[local69] = this.anIntArray466[local69];
		}
		if (arg3.aClass127_4 == null) {
			arg3.aClass127_4 = new GlBuffer();
		}
		arg3.aClass127_4.aBoolean235 = false;
		if (arg3.aClass5_1 == null) {
			arg3.aClass5_1 = new Class5();
		}
		arg3.aClass5_1.aBoolean3 = false;
		if (arg0) {
			arg3.aByteArray71 = this.aByteArray71;
		} else {
			if (arg4.aByteArray71 == null || arg4.aByteArray71.length < this.anInt5297) {
				arg4.aByteArray71 = new byte[this.anInt5297 + 100];
			}
			arg3.aByteArray71 = arg4.aByteArray71;
			for (local69 = 0; local69 < this.anInt5297; local69++) {
				arg3.aByteArray71[local69] = this.aByteArray71[local69];
			}
		}
		if (arg1) {
			arg3.aShortArray75 = this.aShortArray75;
		} else {
			if (arg4.aShortArray75 == null || arg4.aShortArray75.length < this.anInt5297) {
				arg4.aShortArray75 = new short[this.anInt5297 + 100];
			}
			arg3.aShortArray75 = arg4.aShortArray75;
			for (local69 = 0; local69 < this.anInt5297; local69++) {
				arg3.aShortArray75[local69] = this.aShortArray75[local69];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass127_1 = this.aClass127_1;
		} else {
			if (arg4.aClass127_1 == null) {
				arg4.aClass127_1 = new GlBuffer();
			}
			arg3.aClass127_1 = arg4.aClass127_1;
			arg3.aClass127_1.aBoolean235 = false;
		}
		if (arg2 || this.aShortArray76 == null) {
			arg3.aShortArray76 = this.aShortArray76;
			arg3.aShortArray79 = this.aShortArray79;
			arg3.aShortArray85 = this.aShortArray85;
			arg3.aShortArray86 = this.aShortArray86;
			arg3.aClass127_2 = this.aClass127_2;
		} else {
			if (arg4.aShortArray76 == null || arg4.aShortArray76.length < this.anInt5296) {
				arg4.aShortArray76 = new short[this.anInt5296 + 100];
				arg4.aShortArray79 = new short[this.anInt5296 + 100];
				arg4.aShortArray85 = new short[this.anInt5296 + 100];
				arg4.aShortArray86 = new short[this.anInt5296 + 100];
			}
			arg3.aShortArray76 = arg4.aShortArray76;
			arg3.aShortArray79 = arg4.aShortArray79;
			arg3.aShortArray85 = arg4.aShortArray85;
			arg3.aShortArray86 = arg4.aShortArray86;
			for (local69 = 0; local69 < this.anInt5296; local69++) {
				arg3.aShortArray76[local69] = this.aShortArray76[local69];
				arg3.aShortArray79[local69] = this.aShortArray79[local69];
				arg3.aShortArray85[local69] = this.aShortArray85[local69];
				arg3.aShortArray86[local69] = this.aShortArray86[local69];
			}
			if (Static178.highDetailLighting) {
				if (arg4.aClass127_2 == null) {
					arg4.aClass127_2 = new GlBuffer();
				}
				arg3.aClass127_2 = arg4.aClass127_2;
				arg3.aClass127_2.aBoolean235 = false;
			} else {
				arg3.aClass127_2 = null;
			}
		}
		arg3.aFloatArray25 = this.aFloatArray25;
		arg3.aFloatArray26 = this.aFloatArray26;
		arg3.anIntArray464 = this.anIntArray464;
		arg3.anIntArrayArray36 = this.anIntArrayArray36;
		arg3.aShortArray77 = this.aShortArray77;
		arg3.aShortArray82 = this.aShortArray82;
		arg3.aShortArray83 = this.aShortArray83;
		arg3.aShortArray80 = this.aShortArray80;
		arg3.aByteArray72 = this.aByteArray72;
		arg3.anIntArrayArray37 = this.anIntArrayArray37;
		arg3.aClass127_3 = this.aClass127_3;
		arg3.aClass127_5 = this.aClass127_5;
		arg3.anIntArray463 = this.anIntArray463;
		arg3.aShortArray81 = this.aShortArray81;
		arg3.anIntArray462 = this.anIntArray462;
		arg3.aBoolean303 = this.aBoolean303;
		arg3.aShortArray84 = this.aShortArray84;
		arg3.aShortArray78 = this.aShortArray78;
		return arg3;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Lclient!th;")
	@Override
	public final Entity method4539() {
		this.aBoolean259 = false;
		if (this.aClass23_1 != null) {
			this.aShortArray76 = this.aClass23_1.aShortArray8;
			this.aShortArray79 = this.aClass23_1.aShortArray10;
			this.aShortArray85 = this.aClass23_1.aShortArray9;
			this.aShortArray86 = this.aClass23_1.aShortArray7;
			this.aClass23_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!td", name = "t", descriptor = "()I")
	public final int method4115() {
		return this.aShort28;
	}

	@OriginalMember(owner = "client!td", name = "u", descriptor = "()V")
	public final void method4116() {
		if (this.aShortArray76 == null) {
			this.method4563();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5295; local7++) {
			@Pc(16) int local16 = this.anIntArray461[local7];
			this.anIntArray461[local7] = this.anIntArray466[local7];
			this.anIntArray466[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt5296; local7++) {
			@Pc(43) short local43 = this.aShortArray76[local7];
			this.aShortArray76[local7] = this.aShortArray85[local7];
			this.aShortArray85[local7] = (short) -local43;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
		if (this.aClass127_2 != null) {
			this.aClass127_2.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!td;")
	public final GlModel method4117(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) GlModel local3 = new GlModel();
		local3.anInt5295 = this.anInt5295;
		local3.anInt5296 = this.anInt5296;
		local3.anInt5297 = this.anInt5297;
		if (arg0) {
			local3.anIntArray461 = this.anIntArray461;
			local3.anIntArray466 = this.anIntArray466;
		} else {
			local3.anIntArray461 = Static115.method2308(this.anIntArray461);
			local3.anIntArray466 = Static115.method2308(this.anIntArray466);
		}
		if (arg1) {
			local3.anIntArray465 = this.anIntArray465;
		} else {
			local3.anIntArray465 = Static115.method2308(this.anIntArray465);
		}
		if (arg0 && arg1) {
			local3.aClass127_4 = this.aClass127_4;
			local3.aClass5_1 = this.aClass5_1;
		} else {
			local3.aClass127_4 = new GlBuffer();
			local3.aClass5_1 = new Class5();
		}
		if (arg2) {
			local3.aShortArray75 = this.aShortArray75;
		} else {
			local3.aShortArray75 = Static263.method4511(this.aShortArray75);
		}
		local3.aByteArray71 = this.aByteArray71;
		if (arg2 && arg3 && (arg6 && arg4 || Static178.highDetailLighting)) {
			local3.aClass127_1 = this.aClass127_1;
		} else {
			local3.aClass127_1 = new GlBuffer();
		}
		if (arg4) {
			local3.aShortArray76 = this.aShortArray76;
			local3.aShortArray79 = this.aShortArray79;
			local3.aShortArray85 = this.aShortArray85;
			local3.aShortArray86 = this.aShortArray86;
		} else {
			local3.aShortArray76 = Static263.method4511(this.aShortArray76);
			local3.aShortArray79 = Static263.method4511(this.aShortArray79);
			local3.aShortArray85 = Static263.method4511(this.aShortArray85);
			local3.aShortArray86 = Static263.method4511(this.aShortArray86);
		}
		if (!Static178.highDetailLighting) {
			local3.aClass127_2 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass127_2 = this.aClass127_2;
		} else {
			local3.aClass127_2 = new GlBuffer();
		}
		local3.aFloatArray25 = this.aFloatArray25;
		local3.aFloatArray26 = this.aFloatArray26;
		local3.aClass127_3 = this.aClass127_3;
		if (arg7) {
			local3.aShortArray77 = this.aShortArray77;
			local3.aShortArray82 = this.aShortArray82;
			local3.aShortArray83 = this.aShortArray83;
			local3.aClass127_5 = this.aClass127_5;
		} else {
			local3.aShortArray77 = Static263.method4511(this.aShortArray77);
			local3.aShortArray82 = Static263.method4511(this.aShortArray82);
			local3.aShortArray83 = Static263.method4511(this.aShortArray83);
			local3.aClass127_5 = new GlBuffer();
		}
		if (arg8) {
			local3.aShortArray80 = this.aShortArray80;
		} else {
			local3.aShortArray80 = Static263.method4511(this.aShortArray80);
		}
		local3.anIntArray464 = this.anIntArray464;
		local3.anIntArrayArray36 = this.anIntArrayArray36;
		local3.aByteArray72 = this.aByteArray72;
		local3.anIntArrayArray37 = this.anIntArrayArray37;
		local3.anIntArray463 = this.anIntArray463;
		local3.aShortArray81 = this.aShortArray81;
		local3.anIntArray462 = this.anIntArray462;
		local3.aShort29 = this.aShort29;
		local3.aShort28 = this.aShort28;
		local3.aShortArray84 = this.aShortArray84;
		local3.aShortArray78 = this.aShortArray78;
		return local3;
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "()V")
	@Override
	public final void method4563() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5295; local1++) {
			@Pc(10) int local10 = this.anIntArray461[local1];
			this.anIntArray461[local1] = this.anIntArray466[local1];
			this.anIntArray466[local1] = -local10;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method4118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "()I")
	@Override
	public final int method4566() {
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		return this.aClass5_1.aShort4;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected final void method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			Static237.anInt5298 = 0;
			Static237.anInt5300 = 0;
			Static237.anInt5299 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray36.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray36[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static237.anInt5298 += this.anIntArray461[local53];
						Static237.anInt5300 += this.anIntArray465[local53];
						Static237.anInt5299 += this.anIntArray466[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static237.anInt5298 = Static237.anInt5298 / local18 + local8;
				Static237.anInt5300 = Static237.anInt5300 / local18 + local12;
				Static237.anInt5299 = Static237.anInt5299 / local18 + local16;
			} else {
				Static237.anInt5298 = local8;
				Static237.anInt5300 = local12;
				Static237.anInt5299 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray36.length) {
					local141 = this.anIntArrayArray36[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray461[local45] += local8;
						this.anIntArray465[local45] += local12;
						this.anIntArray466[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(246) int local246;
		@Pc(264) int local264;
		@Pc(484) int local484;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray36.length) {
					local141 = this.anIntArrayArray36[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray461[local45] -= Static237.anInt5298;
						this.anIntArray465[local45] -= Static237.anInt5300;
						this.anIntArray466[local45] -= Static237.anInt5299;
						if (arg4 != 0) {
							local53 = MathUtils.anIntArray223[arg4];
							local246 = MathUtils.anIntArray225[arg4];
							local264 = this.anIntArray465[local45] * local53 + this.anIntArray461[local45] * local246 + 32767 >> 16;
							this.anIntArray465[local45] = this.anIntArray465[local45] * local246 + 32767 - this.anIntArray461[local45] * local53 >> 16;
							this.anIntArray461[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = MathUtils.anIntArray223[arg2];
							local246 = MathUtils.anIntArray225[arg2];
							local264 = this.anIntArray465[local45] * local246 + 32767 - this.anIntArray466[local45] * local53 >> 16;
							this.anIntArray466[local45] = this.anIntArray465[local45] * local53 + this.anIntArray466[local45] * local246 + 32767 >> 16;
							this.anIntArray465[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = MathUtils.anIntArray223[arg3];
							local246 = MathUtils.anIntArray225[arg3];
							local264 = this.anIntArray466[local45] * local53 + this.anIntArray461[local45] * local246 + 32767 >> 16;
							this.anIntArray466[local45] = this.anIntArray466[local45] * local246 + 32767 - this.anIntArray461[local45] * local53 >> 16;
							this.anIntArray461[local45] = local264;
						}
						this.anIntArray461[local45] += Static237.anInt5298;
						this.anIntArray465[local45] += Static237.anInt5300;
						this.anIntArray466[local45] += Static237.anInt5299;
					}
				}
			}
			if (arg5 && this.aShortArray76 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray36.length) {
						local141 = this.anIntArrayArray36[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray462[local45];
							local246 = this.anIntArray462[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray81[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = MathUtils.anIntArray223[arg4];
									local498 = MathUtils.anIntArray225[arg4];
									local516 = this.aShortArray79[local484] * local494 + this.aShortArray76[local484] * local498 + 32767 >> 16;
									this.aShortArray79[local484] = (short) (this.aShortArray79[local484] * local498 + 32767 - this.aShortArray76[local484] * local494 >> 16);
									this.aShortArray76[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = MathUtils.anIntArray223[arg2];
									local498 = MathUtils.anIntArray225[arg2];
									local516 = this.aShortArray79[local484] * local498 + 32767 - this.aShortArray85[local484] * local494 >> 16;
									this.aShortArray85[local484] = (short) (this.aShortArray79[local484] * local494 + this.aShortArray85[local484] * local498 + 32767 >> 16);
									this.aShortArray79[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = MathUtils.anIntArray223[arg3];
									local498 = MathUtils.anIntArray225[arg3];
									local516 = this.aShortArray85[local484] * local494 + this.aShortArray76[local484] * local498 + 32767 >> 16;
									this.aShortArray85[local484] = (short) (this.aShortArray85[local484] * local498 + 32767 - this.aShortArray76[local484] * local494 >> 16);
									this.aShortArray76[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass127_2 != null) {
					this.aClass127_2.aBoolean235 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray36.length) {
					local141 = this.anIntArrayArray36[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray461[local45] -= Static237.anInt5298;
						this.anIntArray465[local45] -= Static237.anInt5300;
						this.anIntArray466[local45] -= Static237.anInt5299;
						this.anIntArray461[local45] = this.anIntArray461[local45] * arg2 >> 7;
						this.anIntArray465[local45] = this.anIntArray465[local45] * arg3 >> 7;
						this.anIntArray466[local45] = this.anIntArray466[local45] * arg4 >> 7;
						this.anIntArray461[local45] += Static237.anInt5298;
						this.anIntArray465[local45] += Static237.anInt5300;
						this.anIntArray466[local45] += Static237.anInt5299;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray37 != null && this.aByteArray71 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray37.length) {
						local141 = this.anIntArrayArray37[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray71[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray71[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass127_1.aBoolean235 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray37 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray37.length) {
					local141 = this.anIntArrayArray37[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray75[local45] & 0xFFFF;
						local246 = local53 >> 10 & 0x3F;
						local264 = local53 >> 7 & 0x7;
						local484 = local53 & 0x7F;
						@Pc(932) int local932 = local246 + arg2 & 0x3F;
						local264 += arg3 / 4;
						if (local264 < 0) {
							local264 = 0;
						} else if (local264 > 7) {
							local264 = 7;
						}
						local484 += arg4;
						if (local484 < 0) {
							local484 = 0;
						} else if (local484 > 127) {
							local484 = 127;
						}
						this.aShortArray75[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass127_1.aBoolean235 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V")
	@Override
	protected final void method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static237.anInt5298 = 0;
			Static237.anInt5300 = 0;
			Static237.anInt5299 = 0;
			for (local11 = 0; local11 < this.anInt5295; local11++) {
				Static237.anInt5298 += this.anIntArray461[local11];
				Static237.anInt5300 += this.anIntArray465[local11];
				Static237.anInt5299 += this.anIntArray466[local11];
				local3++;
			}
			if (local3 > 0) {
				Static237.anInt5298 = Static237.anInt5298 / local3 + arg1;
				Static237.anInt5300 = Static237.anInt5300 / local3 + arg2;
				Static237.anInt5299 = Static237.anInt5299 / local3 + arg3;
			} else {
				Static237.anInt5298 = arg1;
				Static237.anInt5300 = arg2;
				Static237.anInt5299 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt5295; local3++) {
				this.anIntArray461[local3] += arg1;
				this.anIntArray465[local3] += arg2;
				this.anIntArray466[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt5295; local3++) {
					this.anIntArray461[local3] -= Static237.anInt5298;
					this.anIntArray465[local3] -= Static237.anInt5300;
					this.anIntArray466[local3] -= Static237.anInt5299;
					if (arg3 != 0) {
						local11 = MathUtils.anIntArray223[arg3];
						local146 = MathUtils.anIntArray225[arg3];
						local164 = this.anIntArray465[local3] * local11 + this.anIntArray461[local3] * local146 + 32767 >> 16;
						this.anIntArray465[local3] = this.anIntArray465[local3] * local146 + 32767 - this.anIntArray461[local3] * local11 >> 16;
						this.anIntArray461[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = MathUtils.anIntArray223[arg1];
						local146 = MathUtils.anIntArray225[arg1];
						local164 = this.anIntArray465[local3] * local146 + 32767 - this.anIntArray466[local3] * local11 >> 16;
						this.anIntArray466[local3] = this.anIntArray465[local3] * local11 + this.anIntArray466[local3] * local146 + 32767 >> 16;
						this.anIntArray465[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = MathUtils.anIntArray223[arg2];
						local146 = MathUtils.anIntArray225[arg2];
						local164 = this.anIntArray466[local3] * local11 + this.anIntArray461[local3] * local146 + 32767 >> 16;
						this.anIntArray466[local3] = this.anIntArray466[local3] * local146 + 32767 - this.anIntArray461[local3] * local11 >> 16;
						this.anIntArray461[local3] = local164;
					}
					this.anIntArray461[local3] += Static237.anInt5298;
					this.anIntArray465[local3] += Static237.anInt5300;
					this.anIntArray466[local3] += Static237.anInt5299;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt5295; local3++) {
					this.anIntArray461[local3] -= Static237.anInt5298;
					this.anIntArray465[local3] -= Static237.anInt5300;
					this.anIntArray466[local3] -= Static237.anInt5299;
					this.anIntArray461[local3] = this.anIntArray461[local3] * arg1 / 128;
					this.anIntArray465[local3] = this.anIntArray465[local3] * arg2 / 128;
					this.anIntArray466[local3] = this.anIntArray466[local3] * arg3 / 128;
					this.anIntArray461[local3] += Static237.anInt5298;
					this.anIntArray465[local3] += Static237.anInt5300;
					this.anIntArray466[local3] += Static237.anInt5299;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt5297; local3++) {
					local11 = (this.aByteArray71[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray71[local3] = (byte) local11;
				}
				this.aClass127_1.aBoolean235 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt5297; local3++) {
					local11 = this.aShortArray75[local3] & 0xFFFF;
					local146 = local11 >> 10 & 0x3F;
					local164 = local11 >> 7 & 0x7;
					@Pc(496) int local496 = local11 & 0x7F;
					@Pc(502) int local502 = local146 + arg1 & 0x3F;
					local164 += arg2 / 4;
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 7) {
						local164 = 7;
					}
					local496 += arg3;
					if (local496 < 0) {
						local496 = 0;
					} else if (local496 > 127) {
						local496 = 127;
					}
					this.aShortArray75[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass127_1.aBoolean235 = false;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "()I")
	@Override
	public final int method4562() {
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		return this.aClass5_1.aShort6;
	}

	@OriginalMember(owner = "client!td", name = "w", descriptor = "()V")
	private void method4121() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		if (this.anInt5297 == 0) {
			return;
		}
		if (this.aByte18 != 0) {
			this.method4113(true, !this.aClass127_4.aBoolean235 && (this.aByte18 & 0x1) != 0, !this.aClass127_1.aBoolean235 && (this.aByte18 & 0x2) != 0, this.aClass127_2 != null && !this.aClass127_2.aBoolean235 && (this.aByte18 & 0x4) != 0, false);
		}
		this.method4113(false, !this.aClass127_4.aBoolean235, !this.aClass127_1.aBoolean235, this.aClass127_2 != null && !this.aClass127_2.aBoolean235, !this.aClass127_3.aBoolean235);
		if (!this.aClass127_5.aBoolean235) {
			this.method4103();
		}
		if (this.aByte19 != 0) {
			if ((this.aByte19 & 0x1) != 0) {
				this.anIntArray461 = null;
				this.anIntArray465 = null;
				this.anIntArray466 = null;
				this.aShortArray81 = null;
				this.anIntArray462 = null;
			}
			if ((this.aByte19 & 0x2) != 0) {
				this.aShortArray75 = null;
				this.aByteArray71 = null;
			}
			if ((this.aByte19 & 0x4) != 0) {
				this.aShortArray76 = null;
				this.aShortArray79 = null;
				this.aShortArray85 = null;
				this.aShortArray86 = null;
			}
			if ((this.aByte19 & 0x8) != 0) {
				this.aFloatArray25 = null;
				this.aFloatArray26 = null;
			}
			if ((this.aByte19 & 0x10) != 0) {
				this.aShortArray77 = null;
				this.aShortArray82 = null;
				this.aShortArray83 = null;
			}
			this.aByte19 = 0;
		}
		@Pc(172) GlVertexBufferObject local172 = null;
		if (this.aClass127_4.aClass155_4 != null) {
			this.aClass127_4.aClass155_4.method4516();
			local172 = this.aClass127_4.aClass155_4;
			local1.glVertexPointer(3, GL2.GL_FLOAT, this.aClass127_4.anInt4782, (long) this.aClass127_4.anInt4777);
		}
		if (this.aClass127_1.aClass155_4 != null) {
			if (local172 != this.aClass127_1.aClass155_4) {
				this.aClass127_1.aClass155_4.method4516();
				local172 = this.aClass127_1.aClass155_4;
			}
			local1.glColorPointer(4, GL2.GL_UNSIGNED_BYTE, this.aClass127_1.anInt4782, (long) this.aClass127_1.anInt4777);
		}
		if (Static178.highDetailLighting && this.aClass127_2.aClass155_4 != null) {
			if (local172 != this.aClass127_2.aClass155_4) {
				this.aClass127_2.aClass155_4.method4516();
				local172 = this.aClass127_2.aClass155_4;
			}
			local1.glNormalPointer(GL2.GL_FLOAT, this.aClass127_2.anInt4782, (long) this.aClass127_2.anInt4777);
		}
		if (this.aClass127_3.aClass155_4 != null) {
			if (local172 != this.aClass127_3.aClass155_4) {
				this.aClass127_3.aClass155_4.method4516();
				local172 = this.aClass127_3.aClass155_4;
			}
			local1.glTexCoordPointer(2, GL2.GL_FLOAT, this.aClass127_3.anInt4782, (long) this.aClass127_3.anInt4777);
		}
		if (this.aClass127_5.aClass155_4 != null) {
			this.aClass127_5.aClass155_4.method4518();
		}
		if (this.aClass127_4.aClass155_4 == null || this.aClass127_1.aClass155_4 == null || Static178.highDetailLighting && this.aClass127_2.aClass155_4 == null || this.aClass127_3.aClass155_4 == null) {
			if (GlRenderer.arbVboSupported) {
				local1.glBindBuffer(GL2.GL_ARRAY_BUFFER, 0);
			}
			if (this.aClass127_4.aClass155_4 == null) {
				this.aClass127_4.aByteBuffer8.position(this.aClass127_4.anInt4777);
				local1.glVertexPointer(3, GL2.GL_FLOAT, this.aClass127_4.anInt4782, this.aClass127_4.aByteBuffer8);
			}
			if (this.aClass127_1.aClass155_4 == null) {
				this.aClass127_1.aByteBuffer8.position(this.aClass127_1.anInt4777);
				local1.glColorPointer(4, GL2.GL_UNSIGNED_BYTE, this.aClass127_1.anInt4782, this.aClass127_1.aByteBuffer8);
			}
			if (Static178.highDetailLighting && this.aClass127_2.aClass155_4 == null) {
				this.aClass127_2.aByteBuffer8.position(this.aClass127_2.anInt4777);
				local1.glNormalPointer(GL2.GL_FLOAT, this.aClass127_2.anInt4782, this.aClass127_2.aByteBuffer8);
			}
			if (this.aClass127_3.aClass155_4 == null) {
				this.aClass127_3.aByteBuffer8.position(this.aClass127_3.anInt4777);
				local1.glTexCoordPointer(2, GL2.GL_FLOAT, this.aClass127_3.anInt4782, this.aClass127_3.aByteBuffer8);
			}
		}
		if (this.aClass127_5.aClass155_4 == null && GlRenderer.arbVboSupported) {
			local1.glBindBuffer(GL2.GL_ELEMENT_ARRAY_BUFFER, 0);
		}
		@Pc(417) int local417 = this.anIntArray463.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray463[local419];
			@Pc(434) int local434 = this.anIntArray463[local419 + 1];
			@Pc(439) short local439 = this.aShortArray80[local427];
			if (local439 == -1) {
				GlRenderer.setTextureId(-1);
				Static27.setMaterial(0, 0);
			} else {
				Rasteriser.anInterface1_2.method3227(local439 & 0xFFFF);
			}
			if (this.aClass127_5.aClass155_4 == null) {
				this.aClass127_5.aByteBuffer8.position(local427 * 12);
				local1.glDrawElements(GL2.GL_TRIANGLES, (local434 - local427) * 3, GL2.GL_UNSIGNED_INT, this.aClass127_5.aByteBuffer8);
			} else {
				local1.glDrawElements(GL2.GL_TRIANGLES, (local434 - local427) * 3, GL2.GL_UNSIGNED_INT, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
	@Override
	protected final void method4557() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5295; local1++) {
			this.anIntArray461[local1] = this.anIntArray461[local1] + 7 >> 4;
			this.anIntArray465[local1] = this.anIntArray465[local1] + 7 >> 4;
			this.anIntArray466[local1] = this.anIntArray466[local1] + 7 >> 4;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "x", descriptor = "()V")
	public final void method4122() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5295; local1++) {
			this.anIntArray466[local1] = -this.anIntArray466[local1];
		}
		if (this.aShortArray85 != null) {
			for (local1 = 0; local1 < this.anInt5296; local1++) {
				this.aShortArray85[local1] = (short) -this.aShortArray85[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt5297; local1++) {
			@Pc(48) short local48 = this.aShortArray77[local1];
			this.aShortArray77[local1] = this.aShortArray83[local1];
			this.aShortArray83[local1] = local48;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
		if (this.aClass127_2 != null) {
			this.aClass127_2.aBoolean235 = false;
		}
		this.aClass127_5.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	@Override
	public final void method4574(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = MathUtils.anIntArray223[arg0];
		@Pc(7) int local7 = MathUtils.anIntArray225[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5295; local9++) {
			@Pc(29) int local29 = this.anIntArray465[local9] * local7 - this.anIntArray466[local9] * local3 >> 16;
			this.anIntArray466[local9] = this.anIntArray465[local9] * local3 + this.anIntArray466[local9] * local7 >> 16;
			this.anIntArray465[local9] = local29;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public final void method4123() {
		if (this.aShortArray76 == null) {
			this.method4554(256);
			return;
		}
		@Pc(10) int local10 = MathUtils.anIntArray223[256];
		@Pc(14) int local14 = MathUtils.anIntArray225[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt5295; local16++) {
			local36 = this.anIntArray466[local16] * local10 + this.anIntArray461[local16] * local14 >> 16;
			this.anIntArray466[local16] = this.anIntArray466[local16] * local14 - this.anIntArray461[local16] * local10 >> 16;
			this.anIntArray461[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt5296; local16++) {
			local36 = this.aShortArray85[local16] * local10 + this.aShortArray76[local16] * local14 >> 16;
			this.aShortArray85[local16] = (short) (this.aShortArray85[local16] * local14 - this.aShortArray76[local16] * local10 >> 16);
			this.aShortArray76[local16] = (short) local36;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
		if (this.aClass127_2 != null) {
			this.aClass127_2.aBoolean235 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ek;)Lclient!ek;")
	public final SoftwareIndexedSprite method4124(@OriginalArg(0) SoftwareIndexedSprite arg0) {
		if (this.anInt5296 == 0) {
			return null;
		}
		if (!this.aClass5_1.aBoolean3) {
			this.method4108();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static161.anInt3920 > 0) {
			local26 = this.aClass5_1.aShort6 - (this.aClass5_1.aShort3 * Static161.anInt3920 >> 8) >> 3;
			local40 = this.aClass5_1.aShort5 - (this.aClass5_1.aShort2 * Static161.anInt3920 >> 8) >> 3;
		} else {
			local26 = this.aClass5_1.aShort6 - (this.aClass5_1.aShort2 * Static161.anInt3920 >> 8) >> 3;
			local40 = this.aClass5_1.aShort5 - (this.aClass5_1.aShort3 * Static161.anInt3920 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static161.anInt3921 > 0) {
			local85 = this.aClass5_1.aShort8 - (this.aClass5_1.aShort3 * Static161.anInt3921 >> 8) >> 3;
			local99 = this.aClass5_1.aShort7 - (this.aClass5_1.aShort2 * Static161.anInt3921 >> 8) >> 3;
		} else {
			local85 = this.aClass5_1.aShort8 - (this.aClass5_1.aShort2 * Static161.anInt3921 >> 8) >> 3;
			local99 = this.aClass5_1.aShort7 - (this.aClass5_1.aShort3 * Static161.anInt3921 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) SoftwareIndexedSprite local151;
		if (arg0 == null || arg0.aByteArray18.length < local134 * local140) {
			local151 = new SoftwareIndexedSprite(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt4279 = arg0.anInt4270 = local134;
			arg0.anInt4276 = arg0.anInt4278 = local140;
			arg0.method1392();
		}
		local151.anInt4280 = local26;
		local151.anInt4273 = local85;
		if (Static237.anIntArray468.length < this.anInt5296) {
			Static237.anIntArray468 = new int[this.anInt5296];
			Static237.anIntArray467 = new int[this.anInt5296];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt5295; local194++) {
			@Pc(216) int local216 = (this.anIntArray461[local194] - (this.anIntArray465[local194] * Static161.anInt3920 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray466[local194] - (this.anIntArray465[local194] * Static161.anInt3921 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray462[local194];
			local246 = this.anIntArray462[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray81[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static237.anIntArray468[local258] = local216;
				Static237.anIntArray467[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt5297; local194++) {
			if (this.aByteArray71[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray77[local194];
				@Pc(297) short local297 = this.aShortArray82[local194];
				@Pc(302) short local302 = this.aShortArray83[local194];
				local246 = Static237.anIntArray468[local292];
				local248 = Static237.anIntArray468[local297];
				local258 = Static237.anIntArray468[local302];
				@Pc(318) int local318 = Static237.anIntArray467[local292];
				@Pc(322) int local322 = Static237.anIntArray467[local297];
				@Pc(326) int local326 = Static237.anIntArray467[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Rasteriser.method1921(local151.aByteArray18, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!td", name = "l", descriptor = "()V")
	@Override
	public final void method4578() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5295; local1++) {
			@Pc(10) int local10 = this.anIntArray466[local1];
			this.anIntArray466[local1] = this.anIntArray461[local1];
			this.anIntArray461[local1] = -local10;
		}
		this.aClass5_1.aBoolean3 = false;
		this.aClass127_4.aBoolean235 = false;
	}
}
