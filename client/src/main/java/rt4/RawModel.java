package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class RawModel extends Entity {

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "[I")
	public static final int[] SIN = MathUtils.sin;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "[I")
	public static final int[] COS = MathUtils.cos;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "[I")
	public static final int[] anIntArray194 = new int[10000];

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "[I")
	public static final int[] anIntArray199 = new int[10000];

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public static int anInt2138 = 0;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "[B")
	public byte[] triangleAlpha;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
	public byte[] textureRotationY;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[S")
	public short[] textureFacesM;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
	public int[] triangleBones;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "[S")
	public short[] texturesScaleZ;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "S")
	private short maxY;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[[I")
	public int[][] boneTriangles;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "[B")
	public byte[] textureTypes;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "[S")
	public short[] triangleTextures;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[B")
	public byte[] triangleInfo;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	public int[] vertexBones;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	public int texturedCount;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "[I")
	public int[] triangleVertexC;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
	public int[] triangleVertexA;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "[B")
	public byte[] faceTextureIndex;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "[S")
	public short[] triangleColors;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "[Lclient!hd;")
	public VertexNormal[] vertexNormals;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "S")
	public short aShort18;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[I")
	public int[] triangleVertexB;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "S")
	public short aShort19;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "[I")
	public int[] vertexY;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "[S")
	public short[] texturesScaleY;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "[Lclient!hd;")
	public VertexNormal[] aClass57Array2;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "[S")
	public short[] textureFacesP;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "[I")
	public int[] vertexX;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "[Lclient!qj;")
	public TriangleNormal[] triangleNormals;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "[S")
	public short[] texturesScaleX;

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "[B")
	public byte[] trianglePriorities;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "[[I")
	public int[][] boneVertices;

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "[S")
	public short[] textureFacesN;

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "[I")
	public int[] vertexZ;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
	private boolean boundsValid = false;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public int triangleCount = 0;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "B")
	public byte priority = 0;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
	public int vertexCount = 0;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private RawModel() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public RawModel(@OriginalArg(0) byte[] src) {
		if (src[src.length - 1] == -1 && src[src.length - 2] == -1) {
			this.decodeNew(src);
		} else {
			this.decodeOld(src);
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V")
	public RawModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.vertexX = new int[arg0];
		this.vertexY = new int[arg0];
		this.vertexZ = new int[arg0];
		this.vertexBones = new int[arg0];
		this.triangleVertexA = new int[arg1];
		this.triangleVertexB = new int[arg1];
		this.triangleVertexC = new int[arg1];
		this.triangleInfo = new byte[arg1];
		this.trianglePriorities = new byte[arg1];
		this.triangleAlpha = new byte[arg1];
		this.triangleColors = new short[arg1];
		this.triangleTextures = new short[arg1];
		this.faceTextureIndex = new byte[arg1];
		this.triangleBones = new int[arg1];
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([Lclient!gb;I)V")
	public RawModel(@OriginalArg(0) RawModel[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.vertexCount = 0;
		this.triangleCount = 0;
		this.texturedCount = 0;
		this.priority = -1;
		@Pc(43) int local43;
		for (local43 = 0; local43 < arg1; local43++) {
			@Pc(50) RawModel local50 = arg0[local43];
			if (local50 != null) {
				this.vertexCount += local50.vertexCount;
				this.triangleCount += local50.triangleCount;
				this.texturedCount += local50.texturedCount;
				if (local50.trianglePriorities == null) {
					if (this.priority == -1) {
						this.priority = local50.priority;
					}
					if (this.priority != local50.priority) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local50.triangleInfo != null;
				local19 |= local50.triangleAlpha != null;
				local21 |= local50.triangleBones != null;
				local23 |= local50.triangleTextures != null;
				local25 |= local50.faceTextureIndex != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.vertexBones = new int[this.vertexCount];
		this.aShortArray29 = new short[this.vertexCount];
		this.triangleVertexA = new int[this.triangleCount];
		this.triangleVertexB = new int[this.triangleCount];
		this.triangleVertexC = new int[this.triangleCount];
		if (local15) {
			this.triangleInfo = new byte[this.triangleCount];
		}
		if (local17) {
			this.trianglePriorities = new byte[this.triangleCount];
		}
		if (local19) {
			this.triangleAlpha = new byte[this.triangleCount];
		}
		if (local21) {
			this.triangleBones = new int[this.triangleCount];
		}
		if (local23) {
			this.triangleTextures = new short[this.triangleCount];
		}
		if (local25) {
			this.faceTextureIndex = new byte[this.triangleCount];
		}
		this.triangleColors = new short[this.triangleCount];
		this.aShortArray22 = new short[this.triangleCount];
		if (this.texturedCount > 0) {
			this.textureTypes = new byte[this.texturedCount];
			this.textureFacesP = new short[this.texturedCount];
			this.textureFacesM = new short[this.texturedCount];
			this.textureFacesN = new short[this.texturedCount];
			this.texturesScaleX = new short[this.texturedCount];
			this.texturesScaleY = new short[this.texturedCount];
			this.texturesScaleZ = new short[this.texturedCount];
			this.textureRotationY = new byte[this.texturedCount];
			this.aByteArray32 = new byte[this.texturedCount];
			this.aByteArray34 = new byte[this.texturedCount];
			this.aByteArray28 = new byte[this.texturedCount];
			this.aByteArray33 = new byte[this.texturedCount];
		}
		this.vertexCount = 0;
		this.triangleCount = 0;
		this.texturedCount = 0;
		for (local43 = 0; local43 < arg1; local43++) {
			@Pc(323) short local323 = (short) (0x1 << local43);
			@Pc(327) RawModel local327 = arg0[local43];
			if (local327 != null) {
				@Pc(331) int local331;
				for (local331 = 0; local331 < local327.triangleCount; local331++) {
					if (local15 && local327.triangleInfo != null) {
						this.triangleInfo[this.triangleCount] = local327.triangleInfo[local331];
					}
					if (local17) {
						if (local327.trianglePriorities == null) {
							this.trianglePriorities[this.triangleCount] = local327.priority;
						} else {
							this.trianglePriorities[this.triangleCount] = local327.trianglePriorities[local331];
						}
					}
					if (local19 && local327.triangleAlpha != null) {
						this.triangleAlpha[this.triangleCount] = local327.triangleAlpha[local331];
					}
					if (local21 && local327.triangleBones != null) {
						this.triangleBones[this.triangleCount] = local327.triangleBones[local331];
					}
					if (local23) {
						if (local327.triangleTextures == null) {
							this.triangleTextures[this.triangleCount] = -1;
						} else {
							this.triangleTextures[this.triangleCount] = local327.triangleTextures[local331];
						}
					}
					if (local25) {
						if (local327.faceTextureIndex == null || local327.faceTextureIndex[local331] == -1) {
							this.faceTextureIndex[this.triangleCount] = -1;
						} else {
							this.faceTextureIndex[this.triangleCount] = (byte) (local327.faceTextureIndex[local331] + this.texturedCount);
						}
					}
					this.triangleColors[this.triangleCount] = local327.triangleColors[local331];
					this.aShortArray22[this.triangleCount] = local323;
					this.triangleVertexA[this.triangleCount] = this.method1666(local327, local327.triangleVertexA[local331], local323);
					this.triangleVertexB[this.triangleCount] = this.method1666(local327, local327.triangleVertexB[local331], local323);
					this.triangleVertexC[this.triangleCount] = this.method1666(local327, local327.triangleVertexC[local331], local323);
					this.triangleCount++;
				}
				for (local331 = 0; local331 < local327.texturedCount; local331++) {
					@Pc(530) byte local530 = this.textureTypes[this.texturedCount] = local327.textureTypes[local331];
					if (local530 == 0) {
						this.textureFacesP[this.texturedCount] = (short) this.method1666(local327, local327.textureFacesP[local331], local323);
						this.textureFacesM[this.texturedCount] = (short) this.method1666(local327, local327.textureFacesM[local331], local323);
						this.textureFacesN[this.texturedCount] = (short) this.method1666(local327, local327.textureFacesN[local331], local323);
					}
					if (local530 >= 1 && local530 <= 3) {
						this.textureFacesP[this.texturedCount] = local327.textureFacesP[local331];
						this.textureFacesM[this.texturedCount] = local327.textureFacesM[local331];
						this.textureFacesN[this.texturedCount] = local327.textureFacesN[local331];
						this.texturesScaleX[this.texturedCount] = local327.texturesScaleX[local331];
						this.texturesScaleY[this.texturedCount] = local327.texturesScaleY[local331];
						this.texturesScaleZ[this.texturedCount] = local327.texturesScaleZ[local331];
						this.textureRotationY[this.texturedCount] = local327.textureRotationY[local331];
						this.aByteArray32[this.texturedCount] = local327.aByteArray32[local331];
						this.aByteArray34[this.texturedCount] = local327.aByteArray34[local331];
					}
					if (local530 == 2) {
						this.aByteArray28[this.texturedCount] = local327.aByteArray28[local331];
						this.aByteArray33[this.texturedCount] = local327.aByteArray33[local331];
					}
					this.texturedCount++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!gb;ZZZZ)V")
	public RawModel(@OriginalArg(0) RawModel arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.vertexCount = arg0.vertexCount;
		this.triangleCount = arg0.triangleCount;
		this.texturedCount = arg0.texturedCount;
		@Pc(57) int local57;
		if (arg1) {
			this.vertexX = arg0.vertexX;
			this.vertexY = arg0.vertexY;
			this.vertexZ = arg0.vertexZ;
		} else {
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];
			for (local57 = 0; local57 < this.vertexCount; local57++) {
				this.vertexX[local57] = arg0.vertexX[local57];
				this.vertexY[local57] = arg0.vertexY[local57];
				this.vertexZ[local57] = arg0.vertexZ[local57];
			}
		}
		if (arg2) {
			this.triangleColors = arg0.triangleColors;
		} else {
			this.triangleColors = new short[this.triangleCount];
			for (local57 = 0; local57 < this.triangleCount; local57++) {
				this.triangleColors[local57] = arg0.triangleColors[local57];
			}
		}
		if (arg3 || arg0.triangleTextures == null) {
			this.triangleTextures = arg0.triangleTextures;
		} else {
			this.triangleTextures = new short[this.triangleCount];
			for (local57 = 0; local57 < this.triangleCount; local57++) {
				this.triangleTextures[local57] = arg0.triangleTextures[local57];
			}
		}
		this.triangleAlpha = arg0.triangleAlpha;
		this.triangleVertexA = arg0.triangleVertexA;
		this.triangleVertexB = arg0.triangleVertexB;
		this.triangleVertexC = arg0.triangleVertexC;
		this.triangleInfo = arg0.triangleInfo;
		this.trianglePriorities = arg0.trianglePriorities;
		this.faceTextureIndex = arg0.faceTextureIndex;
		this.priority = arg0.priority;
		this.textureTypes = arg0.textureTypes;
		this.textureFacesP = arg0.textureFacesP;
		this.textureFacesM = arg0.textureFacesM;
		this.textureFacesN = arg0.textureFacesN;
		this.texturesScaleX = arg0.texturesScaleX;
		this.texturesScaleY = arg0.texturesScaleY;
		this.texturesScaleZ = arg0.texturesScaleZ;
		this.textureRotationY = arg0.textureRotationY;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray33 = arg0.aByteArray33;
		this.vertexBones = arg0.vertexBones;
		this.triangleBones = arg0.triangleBones;
		this.boneVertices = arg0.boneVertices;
		this.boneTriangles = arg0.boneTriangles;
		this.vertexNormals = arg0.vertexNormals;
		this.triangleNormals = arg0.triangleNormals;
		this.aClass57Array2 = arg0.aClass57Array2;
		this.aShort19 = arg0.aShort19;
		this.aShort18 = arg0.aShort18;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([[III)I")
	public static int method1680(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(7) int local7 = arg2 >> 7;
		if (local3 < 0 || local7 < 0 || local3 >= arg0.length || local7 >= arg0[0].length) {
			return 0;
		}
		@Pc(27) int local27 = arg1 & 0x7F;
		@Pc(31) int local31 = arg2 & 0x7F;
		@Pc(53) int local53 = arg0[local3][local7] * (128 - local27) + arg0[local3 + 1][local7] * local27 >> 7;
		@Pc(79) int local79 = arg0[local3][local7 + 1] * (128 - local27) + arg0[local3 + 1][local7 + 1] * local27 >> 7;
		return local53 * (128 - local31) + local79 * local31 >> 7;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ve;II)Lclient!gb;")
	public static RawModel create(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.getFile(arg1, 0);
		return local5 == null ? null : new RawModel(local5);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	public final void method1660() {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			this.vertexX[local1] = -this.vertexX[local1];
			this.vertexZ[local1] = -this.vertexZ[local1];
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()V")
	public final void method1662() {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			@Pc(10) int local10 = this.vertexX[local1];
			this.vertexX[local1] = this.vertexZ[local1];
			this.vertexZ[local1] = -local10;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	private void method1663(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = SIN[arg0];
		@Pc(7) int local7 = COS[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.vertexCount; local9++) {
			@Pc(29) int local29 = this.vertexY[local9] * local3 + this.vertexX[local9] * local7 >> 16;
			this.vertexY[local9] = this.vertexY[local9] * local7 - this.vertexX[local9] * local3 >> 16;
			this.vertexX[local9] = local29;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "()V")
	private void calculateBounds() {
		if (this.boundsValid) {
			return;
		}
		this.boundsValid = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.vertexCount; local20++) {
			@Pc(29) int local29 = this.vertexX[local20];
			@Pc(34) int local34 = this.vertexY[local20];
			@Pc(39) int local39 = this.vertexZ[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort14 = (short) local8;
		this.aShort16 = (short) local14;
		this.maxY = (short) local10;
		this.aShort13 = (short) local16;
		this.aShort20 = (short) local12;
		this.aShort17 = (short) local18;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V")
	public final void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			this.vertexX[local1] = this.vertexX[local1] * arg0 / 128;
			this.vertexY[local1] = this.vertexY[local1] * arg1 / 128;
			this.vertexZ[local1] = this.vertexZ[local1] * arg2 / 128;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Lclient!th;")
	@Override
	public final Entity method4539() {
		return this.createModel(this.aShort19, this.aShort18, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!gb;IS)I")
	private int method1666(@OriginalArg(0) RawModel arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.vertexX[arg1];
		@Pc(9) int local9 = arg0.vertexY[arg1];
		@Pc(14) int local14 = arg0.vertexZ[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.vertexCount; local16++) {
			if (local4 == this.vertexX[local16] && local9 == this.vertexY[local16] && local14 == this.vertexZ[local16]) {
				this.aShortArray29[local16] |= arg2;
				return local16;
			}
		}
		this.vertexX[this.vertexCount] = local4;
		this.vertexY[this.vertexCount] = local9;
		this.vertexZ[this.vertexCount] = local14;
		this.aShortArray29[this.vertexCount] = arg2;
		if (arg0.vertexBones != null) {
			this.vertexBones[this.vertexCount] = arg0.vertexBones[arg1];
		}
		return this.vertexCount++;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IIIIII)V")
	private void method1667(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = method1680(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = method1680(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = method1680(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = method1680(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method1677(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method1663(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.translate(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILclient!ga;)V")
	@Override
	public final void render(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) ParticleSystem arg10) {
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "()V")
	public final void calculateNormals() {
		if (this.vertexNormals != null) {
			return;
		}
		this.vertexNormals = new VertexNormal[this.vertexCount];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.vertexCount; local10++) {
			this.vertexNormals[local10] = new VertexNormal();
		}
		for (local10 = 0; local10 < this.triangleCount; local10++) {
			@Pc(34) int local34 = this.triangleVertexA[local10];
			@Pc(39) int local39 = this.triangleVertexB[local10];
			@Pc(44) int local44 = this.triangleVertexC[local10];
			@Pc(54) int local54 = this.vertexX[local39] - this.vertexX[local34];
			@Pc(64) int local64 = this.vertexY[local39] - this.vertexY[local34];
			@Pc(74) int local74 = this.vertexZ[local39] - this.vertexZ[local34];
			@Pc(84) int local84 = this.vertexX[local44] - this.vertexX[local34];
			@Pc(94) int local94 = this.vertexY[local44] - this.vertexY[local34];
			@Pc(104) int local104 = this.vertexZ[local44] - this.vertexZ[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.triangleInfo == null) {
				local201 = 0;
			} else {
				local201 = this.triangleInfo[local10];
			}
			if (local201 == 0) {
				@Pc(214) VertexNormal local214 = this.vertexNormals[local34];
				local214.x += local112;
				local214.y += local120;
				local214.z += local128;
				local214.triangles++;
				@Pc(243) VertexNormal local243 = this.vertexNormals[local39];
				local243.x += local112;
				local243.y += local120;
				local243.z += local128;
				local243.triangles++;
				@Pc(272) VertexNormal local272 = this.vertexNormals[local44];
				local272.x += local112;
				local272.y += local120;
				local272.z += local128;
				local272.triangles++;
			} else if (local201 == 1) {
				if (this.triangleNormals == null) {
					this.triangleNormals = new TriangleNormal[this.triangleCount];
				}
				@Pc(317) TriangleNormal local317 = this.triangleNormals[local10] = new TriangleNormal();
				local317.anInt4769 = local112;
				local317.anInt4770 = local120;
				local317.anInt4767 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(SS)V")
	public final void retexture(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.triangleTextures == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.triangleCount; local5++) {
			if (this.triangleTextures[local5] == arg0) {
				this.triangleTextures[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!gb;")
	public final RawModel method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.calculateBounds();
		@Pc(6) int local6 = arg4 + this.aShort14;
		@Pc(11) int local11 = arg4 + this.aShort16;
		@Pc(16) int local16 = arg6 + this.aShort20;
		@Pc(21) int local21 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) RawModel local147 = new RawModel();
		local147.vertexCount = this.vertexCount;
		local147.triangleCount = this.triangleCount;
		local147.texturedCount = this.texturedCount;
		local147.triangleVertexA = this.triangleVertexA;
		local147.triangleVertexB = this.triangleVertexB;
		local147.triangleVertexC = this.triangleVertexC;
		local147.triangleInfo = this.triangleInfo;
		local147.trianglePriorities = this.trianglePriorities;
		local147.triangleAlpha = this.triangleAlpha;
		local147.faceTextureIndex = this.faceTextureIndex;
		local147.triangleColors = this.triangleColors;
		local147.triangleTextures = this.triangleTextures;
		local147.priority = this.priority;
		local147.textureTypes = this.textureTypes;
		local147.textureFacesP = this.textureFacesP;
		local147.textureFacesM = this.textureFacesM;
		local147.textureFacesN = this.textureFacesN;
		local147.texturesScaleX = this.texturesScaleX;
		local147.texturesScaleY = this.texturesScaleY;
		local147.texturesScaleZ = this.texturesScaleZ;
		local147.textureRotationY = this.textureRotationY;
		local147.aByteArray32 = this.aByteArray32;
		local147.aByteArray34 = this.aByteArray34;
		local147.aByteArray28 = this.aByteArray28;
		local147.aByteArray33 = this.aByteArray33;
		local147.vertexBones = this.vertexBones;
		local147.triangleBones = this.triangleBones;
		local147.boneVertices = this.boneVertices;
		local147.boneTriangles = this.boneTriangles;
		local147.aShort19 = this.aShort19;
		local147.aShort18 = this.aShort18;
		local147.vertexNormals = this.vertexNormals;
		local147.triangleNormals = this.triangleNormals;
		local147.aClass57Array2 = this.aClass57Array2;
		if (arg0 == 3) {
			local147.vertexX = Static115.method2308(this.vertexX);
			local147.vertexY = Static115.method2308(this.vertexY);
			local147.vertexZ = Static115.method2308(this.vertexZ);
		} else {
			local147.vertexX = this.vertexX;
			local147.vertexY = new int[local147.vertexCount];
			local147.vertexZ = this.vertexZ;
		}
		@Pc(326) int local326;
		@Pc(337) int local337;
		@Pc(344) int local344;
		@Pc(348) int local348;
		@Pc(352) int local352;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(382) int local382;
		@Pc(408) int local408;
		@Pc(420) int local420;
		if (arg0 == 1) {
			for (local326 = 0; local326 < local147.vertexCount; local326++) {
				local337 = this.vertexX[local326] + arg4;
				local344 = this.vertexZ[local326] + arg6;
				local348 = local337 & 0x7F;
				local352 = local344 & 0x7F;
				local356 = local337 >> 7;
				local360 = local344 >> 7;
				local382 = arg2[local356][local360] * (128 - local348) + arg2[local356 + 1][local360] * local348 >> 7;
				local408 = arg2[local356][local360 + 1] * (128 - local348) + arg2[local356 + 1][local360 + 1] * local348 >> 7;
				local420 = local382 * (128 - local352) + local408 * local352 >> 7;
				local147.vertexY[local326] = this.vertexY[local326] + local420 - arg5;
			}
		} else {
			@Pc(547) int local547;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.vertexCount; local326++) {
					local337 = (this.vertexY[local326] << 16) / this.maxY;
					if (local337 < arg1) {
						local344 = this.vertexX[local326] + arg4;
						local348 = this.vertexZ[local326] + arg6;
						local352 = local344 & 0x7F;
						local356 = local348 & 0x7F;
						local360 = local344 >> 7;
						local382 = local348 >> 7;
						local408 = arg2[local360][local382] * (128 - local352) + arg2[local360 + 1][local382] * local352 >> 7;
						local420 = arg2[local360][local382 + 1] * (128 - local352) + arg2[local360 + 1][local382 + 1] * local352 >> 7;
						local547 = local408 * (128 - local356) + local420 * local356 >> 7;
						local147.vertexY[local326] = this.vertexY[local326] + (local547 - arg5) * (arg1 - local337) / arg1;
					} else {
						local147.vertexY[local326] = this.vertexY[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local337 = (arg1 >> 8 & 0xFF) * 4;
				this.method1667(arg2, arg4, arg5, arg6, local326, local337);
			} else if (arg0 == 4) {
				local326 = this.aShort13 - this.maxY;
				for (local337 = 0; local337 < this.vertexCount; local337++) {
					local344 = this.vertexX[local337] + arg4;
					local348 = this.vertexZ[local337] + arg6;
					local352 = local344 & 0x7F;
					local356 = local348 & 0x7F;
					local360 = local344 >> 7;
					local382 = local348 >> 7;
					local408 = arg3[local360][local382] * (128 - local352) + arg3[local360 + 1][local382] * local352 >> 7;
					local420 = arg3[local360][local382 + 1] * (128 - local352) + arg3[local360 + 1][local382 + 1] * local352 >> 7;
					local547 = local408 * (128 - local356) + local420 * local356 >> 7;
					local147.vertexY[local337] = this.vertexY[local337] + local547 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort13 - this.maxY;
				for (local337 = 0; local337 < this.vertexCount; local337++) {
					local344 = this.vertexX[local337] + arg4;
					local348 = this.vertexZ[local337] + arg6;
					local352 = local344 & 0x7F;
					local356 = local348 & 0x7F;
					local360 = local344 >> 7;
					local382 = local348 >> 7;
					local408 = arg2[local360][local382] * (128 - local352) + arg2[local360 + 1][local382] * local352 >> 7;
					local420 = arg2[local360][local382 + 1] * (128 - local352) + arg2[local360 + 1][local382 + 1] * local352 >> 7;
					local547 = local408 * (128 - local356) + local420 * local356 >> 7;
					local408 = arg3[local360][local382] * (128 - local352) + arg3[local360 + 1][local382] * local352 >> 7;
					local420 = arg3[local360][local382 + 1] * (128 - local352) + arg3[local360 + 1][local382 + 1] * local352 >> 7;
					@Pc(890) int local890 = local408 * (128 - local356) + local420 * local356 >> 7;
					@Pc(894) int local894 = local547 - local890;
					local147.vertexY[local337] = ((this.vertexY[local337] << 8) / local326 * local894 >> 8) - (arg5 - local547);
				}
			}
		}
		this.boundsValid = false;
		return local147;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)Lclient!w;")
	public final SoftwareModel createSoftwareModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new SoftwareModel(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V")
	public final void translate(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			this.vertexX[local1] += arg0;
			this.vertexY[local1] += arg1;
			this.vertexZ[local1] += arg2;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "()V")
	public final void method1673() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.vertexCount; local1++) {
			this.vertexZ[local1] = -this.vertexZ[local1];
		}
		for (local1 = 0; local1 < this.triangleCount; local1++) {
			@Pc(27) int local27 = this.triangleVertexA[local1];
			this.triangleVertexA[local1] = this.triangleVertexC[local1];
			this.triangleVertexC[local1] = local27;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z")
	@Override
	public final boolean method4543() {
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V")
	private void decodeNew(@OriginalArg(0) byte[] src) {
		// originally, Jagex had obface, obpoint, and obaxis

		@Pc(4) Buffer buffer1 = new Buffer(src);
		@Pc(9) Buffer buffer2 = new Buffer(src);
		@Pc(14) Buffer buffer3 = new Buffer(src);
		@Pc(19) Buffer buffer4 = new Buffer(src);
		@Pc(24) Buffer buffer5 = new Buffer(src);
		@Pc(29) Buffer buffer6 = new Buffer(src);
		@Pc(34) Buffer buffer7 = new Buffer(src);
		buffer1.offset = src.length - 23;

		@Pc(44) int vertexCount = buffer1.g2();
		@Pc(48) int triangleCount = buffer1.g2();
		@Pc(52) int texturedCount = buffer1.g1();

		@Pc(56) int hasInfo = buffer1.g1();
		@Pc(65) boolean hasTriangleInfo = (hasInfo & 0x1) == 1;
		@Pc(74) boolean local74 = (hasInfo & 0x2) == 2;

		@Pc(78) int priority = buffer1.g1();
		@Pc(82) int hasAlpha = buffer1.g1();
		@Pc(86) int hasTriangleBones = buffer1.g1();
		@Pc(90) int hasTextures = buffer1.g1();
		@Pc(94) int hasVertexBones = buffer1.g1();

		@Pc(98) int local98 = buffer1.g2();
		@Pc(102) int local102 = buffer1.g2();
		@Pc(106) int local106 = buffer1.g2();
		@Pc(110) int local110 = buffer1.g2();
		@Pc(114) int local114 = buffer1.g2();

		@Pc(116) int simpleTextureFaceCount = 0;
		@Pc(118) int complexTextureFaceCount = 0;
		@Pc(120) int cubeTextureFaceCount = 0;

		if (texturedCount > 0) {
			this.textureTypes = new byte[texturedCount];
			buffer1.offset = 0;

			for (int i = 0; i < texturedCount; i++) {
				@Pc(143) byte type = this.textureTypes[i] = buffer1.g1s();
				if (type == 0) {
					simpleTextureFaceCount++;
				}
				if (type >= 1 && type <= 3) {
					complexTextureFaceCount++;
				}
				if (type == 2) {
					cubeTextureFaceCount++;
				}
			}
		}

		int offset = texturedCount + vertexCount;

		@Pc(169) int triangleInfoDataOffset = offset;
		if (hasTriangleInfo) {
			offset += triangleCount;
		}

		@Pc(177) int tri = offset;
		offset += triangleCount;

		@Pc(183) int trianglePriorityDataOffset = offset;
		if (priority == 255) {
			offset += triangleCount;
		}

		@Pc(192) int triangleBonesDataOffset = offset;
		if (hasTriangleBones == 1) {
			offset += triangleCount;
		}

		@Pc(201) int local201 = offset;
		if (hasVertexBones == 1) {
			offset += vertexCount;
		}

		@Pc(210) int triangleAlphaDataOffset = offset;
		if (hasAlpha == 1) {
			offset += triangleCount;
		}

		@Pc(219) int vertexIndexDataOffset = offset;
		offset += local110;
		@Pc(225) int triangleTexturesDataOffset = offset;
		if (hasTextures == 1) {
			offset += triangleCount * 2;
		}

		@Pc(236) int triangleTextureIndexDataOffset = offset;
		offset += local114;

		@Pc(242) int triangleColorDataOffset = offset;
		offset += triangleCount * 2;

		@Pc(250) int local250 = offset;
		offset += local98;

		@Pc(256) int local256 = offset;
		offset += local102;

		@Pc(262) int local262 = offset;
		offset += local106;

		@Pc(268) int local268 = offset;
		offset += simpleTextureFaceCount * 6;

		@Pc(276) int local276 = offset;
		offset += complexTextureFaceCount * 6;

		@Pc(284) int local284 = offset;
		offset += complexTextureFaceCount * 6;

		@Pc(292) int local292 = offset;
		offset += complexTextureFaceCount;

		@Pc(298) int local298 = offset;
		offset += complexTextureFaceCount;

		@Pc(304) int local304 = offset;
		offset += complexTextureFaceCount + cubeTextureFaceCount * 2;

		this.vertexCount = vertexCount;
		this.triangleCount = triangleCount;
		this.texturedCount = texturedCount;

		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];

		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];

		if (hasVertexBones == 1) {
			this.vertexBones = new int[vertexCount];
		}

		if (hasTriangleInfo) {
			this.triangleInfo = new byte[triangleCount];
		}

		if (priority == 255) {
			this.trianglePriorities = new byte[triangleCount];
		} else {
			this.priority = (byte) priority;
		}

		if (hasAlpha == 1) {
			this.triangleAlpha = new byte[triangleCount];
		}

		if (hasTriangleBones == 1) {
			this.triangleBones = new int[triangleCount];
		}

		if (hasTextures == 1) {
			this.triangleTextures = new short[triangleCount];
		}

		if (hasTextures == 1 && texturedCount > 0) {
			this.faceTextureIndex = new byte[triangleCount];
		}

		this.triangleColors = new short[triangleCount];

		if (texturedCount > 0) {
			this.textureFacesP = new short[texturedCount];
			this.textureFacesM = new short[texturedCount];
			this.textureFacesN = new short[texturedCount];

			if (complexTextureFaceCount > 0) {
				this.texturesScaleX = new short[complexTextureFaceCount];
				this.texturesScaleY = new short[complexTextureFaceCount];
				this.texturesScaleZ = new short[complexTextureFaceCount];
				this.textureRotationY = new byte[complexTextureFaceCount];
				this.aByteArray32 = new byte[complexTextureFaceCount];
				this.aByteArray34 = new byte[complexTextureFaceCount];
			}

			if (cubeTextureFaceCount > 0) {
				this.aByteArray28 = new byte[cubeTextureFaceCount];
				this.aByteArray33 = new byte[cubeTextureFaceCount];
			}
		}

		buffer1.offset = texturedCount;
		buffer2.offset = local250;
		buffer3.offset = local256;
		buffer4.offset = local262;
		buffer5.offset = local201;

		@Pc(473) int prevVertexX = 0;
		@Pc(475) int prevVertexY = 0;
		@Pc(477) int prevVertexZ = 0;

		for (int v = 0; v < vertexCount; v++) {
			int flags = buffer1.g1();

			int dx = 0;
			if ((flags & 0x1) != 0) {
				dx = buffer2.gSmart1or2s();
			}

			int dy = 0;
			if ((flags & 0x2) != 0) {
				dy = buffer3.gSmart1or2s();
			}

			int dz = 0;
			if ((flags & 0x4) != 0) {
				dz = buffer4.gSmart1or2s();
			}

			this.vertexX[v] = prevVertexX + dx;
			this.vertexY[v] = prevVertexY + dy;
			this.vertexZ[v] = prevVertexZ + dz;

			prevVertexX = this.vertexX[v];
			prevVertexY = this.vertexY[v];
			prevVertexZ = this.vertexZ[v];

			if (hasVertexBones == 1) {
				this.vertexBones[v] = buffer5.g1();
			}
		}

		buffer1.offset = triangleColorDataOffset;
		buffer2.offset = triangleInfoDataOffset;
		buffer3.offset = trianglePriorityDataOffset;
		buffer4.offset = triangleAlphaDataOffset;
		buffer5.offset = triangleBonesDataOffset;
		buffer6.offset = triangleTexturesDataOffset;
		buffer7.offset = triangleTextureIndexDataOffset;

		for (int t = 0; t < triangleCount; t++) {
			this.triangleColors[t] = (short) buffer1.g2();

			if (hasTriangleInfo) {
				this.triangleInfo[t] = buffer2.g1s();
			}

			if (priority == 255) {
				this.trianglePriorities[t] = buffer3.g1s();
			}

			if (hasAlpha == 1) {
				this.triangleAlpha[t] = buffer4.g1s();
			}

			if (hasTriangleBones == 1) {
				this.triangleBones[t] = buffer5.g1();
			}

			if (hasTextures == 1) {
				this.triangleTextures[t] = (short) (buffer6.g2() - 1);
			}

			if (this.faceTextureIndex != null) {
				if (this.triangleTextures[t] == -1) {
					this.faceTextureIndex[t] = -1;
				} else {
					this.faceTextureIndex[t] = (byte) (buffer7.g1() - 1);
				}
			}
		}

		buffer1.offset = vertexIndexDataOffset;
		buffer2.offset = tri;

		int a = 0;
		int b = 0;
		int c = 0;
		int last = 0;

		for (int n = 0; n < triangleCount; n++) {
			int flags = buffer2.g1();
			if (flags == 1) {
				a = buffer1.gSmart1or2s() + last;
				b = buffer1.gSmart1or2s() + a;
				c = buffer1.gSmart1or2s() + b;
				last = c;
				this.triangleVertexA[n] = a;
				this.triangleVertexB[n] = b;
				this.triangleVertexC[n] = c;
			} else if (flags == 2) {
				b = c;
				c = buffer1.gSmart1or2s() + last;
				last = c;
				this.triangleVertexA[n] = a;
				this.triangleVertexB[n] = b;
				this.triangleVertexC[n] = c;
			} else if (flags == 3) {
				a = c;
				c = buffer1.gSmart1or2s() + last;
				last = c;
				this.triangleVertexA[n] = a;
				this.triangleVertexB[n] = b;
				this.triangleVertexC[n] = c;
			} else if (flags == 4) {
				@Pc(803) int b0 = a;
				a = b;
				b = b0;
				c = buffer1.gSmart1or2s() + last;
				last = c;
				this.triangleVertexA[n] = a;
				this.triangleVertexB[n] = b0;
				this.triangleVertexC[n] = c;
			}
		}

		buffer1.offset = local268;
		buffer2.offset = local276;
		buffer3.offset = local284;
		buffer4.offset = local292;
		buffer5.offset = local298;
		buffer6.offset = local304;

		for (int n = 0; n < texturedCount; n++) {
			int flags = this.textureTypes[n] & 0xFF;
			if (flags == 0) {
				this.textureFacesP[n] = (short) buffer1.g2();
				this.textureFacesM[n] = (short) buffer1.g2();
				this.textureFacesN[n] = (short) buffer1.g2();
			} else if (flags == 1) {
				this.textureFacesP[n] = (short) buffer2.g2();
				this.textureFacesM[n] = (short) buffer2.g2();
				this.textureFacesN[n] = (short) buffer2.g2();
				this.texturesScaleX[n] = (short) buffer3.g2();
				this.texturesScaleY[n] = (short) buffer3.g2();
				this.texturesScaleZ[n] = (short) buffer3.g2();
				this.textureRotationY[n] = buffer4.g1s();
				this.aByteArray32[n] = buffer5.g1s();
				this.aByteArray34[n] = buffer6.g1s();
			} else if (flags == 2) {
				this.textureFacesP[n] = (short) buffer2.g2();
				this.textureFacesM[n] = (short) buffer2.g2();
				this.textureFacesN[n] = (short) buffer2.g2();
				this.texturesScaleX[n] = (short) buffer3.g2();
				this.texturesScaleY[n] = (short) buffer3.g2();
				this.texturesScaleZ[n] = (short) buffer3.g2();
				this.textureRotationY[n] = buffer4.g1s();
				this.aByteArray32[n] = buffer5.g1s();
				this.aByteArray34[n] = buffer6.g1s();
				this.aByteArray28[n] = buffer6.g1s();
				this.aByteArray33[n] = buffer6.g1s();
			} else if (flags == 3) {
				this.textureFacesP[n] = (short) buffer2.g2();
				this.textureFacesM[n] = (short) buffer2.g2();
				this.textureFacesN[n] = (short) buffer2.g2();
				this.texturesScaleX[n] = (short) buffer3.g2();
				this.texturesScaleY[n] = (short) buffer3.g2();
				this.texturesScaleZ[n] = (short) buffer3.g2();
				this.textureRotationY[n] = buffer4.g1s();
				this.aByteArray32[n] = buffer5.g1s();
				this.aByteArray34[n] = buffer6.g1s();
			}
		}

		if (!local74) {
			return;
		}

		buffer1.offset = offset;

		// interestingly, unused in 530 but used by 550

		int particleEmittersLen = buffer1.g1();
		if (particleEmittersLen > 0) {
			buffer1.offset += particleEmittersLen * 4;
		}

		int particleEffectorsLen = buffer1.g1();
		if (particleEffectorsLen > 0) {
			buffer1.offset += particleEffectorsLen * 4;
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "()Lclient!gb;")
	public final RawModel method1675() {
		@Pc(3) RawModel m = new RawModel();
		if (this.triangleInfo != null) {
			m.triangleInfo = new byte[this.triangleCount];
			System.arraycopy(this.triangleInfo, 0, m.triangleInfo, 0, this.triangleCount);
		}

		m.vertexCount = this.vertexCount;
		m.triangleCount = this.triangleCount;
		m.texturedCount = this.texturedCount;
		m.vertexX = this.vertexX;
		m.vertexY = this.vertexY;
		m.vertexZ = this.vertexZ;
		m.triangleVertexA = this.triangleVertexA;
		m.triangleVertexB = this.triangleVertexB;
		m.triangleVertexC = this.triangleVertexC;
		m.trianglePriorities = this.trianglePriorities;
		m.triangleAlpha = this.triangleAlpha;
		m.faceTextureIndex = this.faceTextureIndex;
		m.triangleColors = this.triangleColors;
		m.triangleTextures = this.triangleTextures;
		m.priority = this.priority;
		m.textureTypes = this.textureTypes;
		m.textureFacesP = this.textureFacesP;
		m.textureFacesM = this.textureFacesM;
		m.textureFacesN = this.textureFacesN;
		m.texturesScaleX = this.texturesScaleX;
		m.texturesScaleY = this.texturesScaleY;
		m.texturesScaleZ = this.texturesScaleZ;
		m.textureRotationY = this.textureRotationY;
		m.aByteArray32 = this.aByteArray32;
		m.aByteArray34 = this.aByteArray34;
		m.aByteArray28 = this.aByteArray28;
		m.aByteArray33 = this.aByteArray33;
		m.vertexBones = this.vertexBones;
		m.triangleBones = this.triangleBones;
		m.boneVertices = this.boneVertices;
		m.boneTriangles = this.boneTriangles;
		m.vertexNormals = this.vertexNormals;
		m.triangleNormals = this.triangleNormals;
		m.aShort19 = this.aShort19;
		m.aShort18 = this.aShort18;
		return m;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBSB)I")
	public final int addTriangle(@OriginalArg(0) int vertexA, @OriginalArg(1) int vertexB, @OriginalArg(2) int vertexC, @OriginalArg(4) short color, @OriginalArg(5) byte alpha) {
		this.triangleVertexA[this.triangleCount] = vertexA;
		this.triangleVertexB[this.triangleCount] = vertexB;
		this.triangleVertexC[this.triangleCount] = vertexC;
		this.triangleInfo[this.triangleCount] = 1;
		this.faceTextureIndex[this.triangleCount] = -1;
		this.triangleColors[this.triangleCount] = color;
		this.triangleTextures[this.triangleCount] = -1;
		this.triangleAlpha[this.triangleCount] = alpha;
		return this.triangleCount++;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	private void method1677(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = SIN[arg0];
		@Pc(7) int local7 = COS[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.vertexCount; local9++) {
			@Pc(29) int local29 = this.vertexY[local9] * local7 - this.vertexZ[local9] * local3 >> 16;
			this.vertexZ[local9] = this.vertexY[local9] * local3 + this.vertexZ[local9] * local7 >> 16;
			this.vertexY[local9] = local29;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "()V")
	private void invalidate() {
		this.vertexNormals = null;
		this.aClass57Array2 = null;
		this.triangleNormals = null;
		this.boundsValid = false;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIII)Lclient!ak;")
	public final Model createModel(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (GlRenderer.enabled) {
			@Pc(9) GlModel model = new GlModel(this, arg0, arg1, true);
			model.createBones();
			return model;
		} else {
			return new SoftwareModel(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()I")
	@Override
	public final int getMaxY() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}
		return this.maxY;
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "()V")
	public final void method1681() {
		this.vertexBones = null;
		this.triangleBones = null;
		this.boneVertices = null;
		this.boneTriangles = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!th;IIIZ)V")
	@Override
	public final void method4544(@OriginalArg(0) Entity arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) RawModel m = (RawModel) arg0;
		m.calculateBounds();
		m.calculateNormals();
		anInt2138++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = m.vertexX;
		@Pc(18) int local18 = m.vertexCount;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.vertexCount; local20++) {
			@Pc(29) VertexNormal local29 = this.vertexNormals[local20];
			if (local29.triangles != 0) {
				@Pc(40) int local40 = this.vertexY[local20] - arg2;
				if (local40 >= m.maxY && local40 <= m.aShort13) {
					@Pc(56) int local56 = this.vertexX[local20] - arg1;
					if (local56 >= m.aShort14 && local56 <= m.aShort16) {
						@Pc(72) int local72 = this.vertexZ[local20] - arg3;
						if (local72 >= m.aShort20 && local72 <= m.aShort17) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) VertexNormal local91 = m.vertexNormals[local83];
								if (local56 == local15[local83] && local72 == m.vertexZ[local83] && local40 == m.vertexY[local83] && local91.triangles != 0) {
									if (this.aClass57Array2 == null) {
										this.aClass57Array2 = new VertexNormal[this.vertexCount];
									}
									if (m.aClass57Array2 == null) {
										m.aClass57Array2 = new VertexNormal[local18];
									}
									@Pc(131) VertexNormal local131 = this.aClass57Array2[local20];
									if (local131 == null) {
										local131 = this.aClass57Array2[local20] = new VertexNormal(local29);
									}
									@Pc(148) VertexNormal local148 = m.aClass57Array2[local83];
									if (local148 == null) {
										local148 = m.aClass57Array2[local83] = new VertexNormal(local91);
									}
									local131.x += local91.x;
									local131.y += local91.y;
									local131.z += local91.z;
									local131.triangles += local91.triangles;
									local148.x += local29.x;
									local148.y += local29.y;
									local148.z += local29.z;
									local148.triangles += local29.triangles;
									local12++;
									anIntArray194[local20] = anInt2138;
									anIntArray199[local83] = anInt2138;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (local20 = 0; local20 < this.triangleCount; local20++) {
			if (anIntArray194[this.triangleVertexA[local20]] == anInt2138 && anIntArray194[this.triangleVertexB[local20]] == anInt2138 && anIntArray194[this.triangleVertexC[local20]] == anInt2138) {
				if (this.triangleInfo == null) {
					this.triangleInfo = new byte[this.triangleCount];
				}
				this.triangleInfo[local20] = 2;
			}
		}
		for (local20 = 0; local20 < m.triangleCount; local20++) {
			if (anIntArray199[m.triangleVertexA[local20]] == anInt2138 && anIntArray199[m.triangleVertexB[local20]] == anInt2138 && anIntArray199[m.triangleVertexC[local20]] == anInt2138) {
				if (m.triangleInfo == null) {
					m.triangleInfo = new byte[m.triangleCount];
				}
				m.triangleInfo[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public final void method1682() {
		@Pc(3) int sin = SIN[256];
		@Pc(7) int cos = COS[256];
		for (@Pc(9) int i = 0; i < this.vertexCount; i++) {
			@Pc(29) int y = this.vertexZ[i] * sin + this.vertexX[i] * cos >> 16;
			this.vertexZ[i] = this.vertexZ[i] * cos - this.vertexX[i] * sin >> 16;
			this.vertexX[i] = y;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "()V")
	public final void createBones() {
		@Pc(5) int[] bonesLen;
		@Pc(7) int maxBone;
		@Pc(22) int temp;
		@Pc(9) int i;
		@Pc(18) int bone;
		if (this.vertexBones != null) {
			bonesLen = new int[256];
			maxBone = 0;
			for (i = 0; i < this.vertexCount; i++) {
				bone = this.vertexBones[i];
				temp = bonesLen[bone]++;
				if (bone > maxBone) {
					maxBone = bone;
				}
			}
			this.boneVertices = new int[maxBone + 1][];
			for (i = 0; i <= maxBone; i++) {
				this.boneVertices[i] = new int[bonesLen[i]];
				bonesLen[i] = 0;
			}
			i = 0;
			while (i < this.vertexCount) {
				bone = this.vertexBones[i];
				this.boneVertices[bone][bonesLen[bone]++] = i++;
			}
			this.vertexBones = null;
		}
		if (this.triangleBones == null) {
			return;
		}
		bonesLen = new int[256];
		maxBone = 0;
		for (i = 0; i < this.triangleCount; i++) {
			bone = this.triangleBones[i];
			temp = bonesLen[bone]++;
			if (bone > maxBone) {
				maxBone = bone;
			}
		}
		this.boneTriangles = new int[maxBone + 1][];
		for (i = 0; i <= maxBone; i++) {
			this.boneTriangles[i] = new int[bonesLen[i]];
			bonesLen[i] = 0;
		}
		i = 0;
		while (i < this.triangleCount) {
			bone = this.triangleBones[i];
			this.boneTriangles[bone][bonesLen[bone]++] = i++;
		}
		this.triangleBones = null;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V")
	public final void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = SIN[arg2];
			local9 = COS[arg2];
			for (local11 = 0; local11 < this.vertexCount; local11++) {
				local31 = this.vertexY[local11] * local5 + this.vertexX[local11] * local9 >> 16;
				this.vertexY[local11] = this.vertexY[local11] * local9 - this.vertexX[local11] * local5 >> 16;
				this.vertexX[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = SIN[arg0];
			local9 = COS[arg0];
			for (local11 = 0; local11 < this.vertexCount; local11++) {
				local31 = this.vertexY[local11] * local9 - this.vertexZ[local11] * local5 >> 16;
				this.vertexZ[local11] = this.vertexY[local11] * local5 + this.vertexZ[local11] * local9 >> 16;
				this.vertexY[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = SIN[arg1];
		local9 = COS[arg1];
		for (local11 = 0; local11 < this.vertexCount; local11++) {
			local31 = this.vertexZ[local11] * local5 + this.vertexX[local11] * local9 >> 16;
			this.vertexZ[local11] = this.vertexZ[local11] * local9 - this.vertexX[local11] * local5 >> 16;
			this.vertexX[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(III)I")
	public final int method1685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			if (this.vertexX[local1] == arg0 && this.vertexY[local1] == 0 && this.vertexZ[local1] == arg1) {
				return local1;
			}
		}
		this.vertexX[this.vertexCount] = arg0;
		this.vertexY[this.vertexCount] = 0;
		this.vertexZ[this.vertexCount] = arg1;
		return this.vertexCount++;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(SS)V")
	public final void recolor(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.triangleCount; local1++) {
			if (this.triangleColors[local1] == arg0) {
				this.triangleColors[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "([B)V")
	private void decodeOld(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Buffer local8 = new Buffer(arg0);
		@Pc(13) Buffer local13 = new Buffer(arg0);
		@Pc(18) Buffer local18 = new Buffer(arg0);
		@Pc(23) Buffer local23 = new Buffer(arg0);
		@Pc(28) Buffer local28 = new Buffer(arg0);
		local8.offset = arg0.length - 18;
		@Pc(38) int local38 = local8.g2();
		@Pc(42) int local42 = local8.g2();
		@Pc(46) int local46 = local8.g1();
		@Pc(50) int local50 = local8.g1();
		@Pc(54) int local54 = local8.g1();
		@Pc(58) int local58 = local8.g1();
		@Pc(62) int local62 = local8.g1();
		@Pc(66) int local66 = local8.g1();
		@Pc(70) int local70 = local8.g2();
		@Pc(74) int local74 = local8.g2();
		@Pc(78) int local78 = local8.g2();
		@Pc(82) int local82 = local8.g2();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.vertexCount = local38;
		this.triangleCount = local42;
		this.texturedCount = local46;
		this.vertexX = new int[local38];
		this.vertexY = new int[local38];
		this.vertexZ = new int[local38];
		this.triangleVertexA = new int[local42];
		this.triangleVertexB = new int[local42];
		this.triangleVertexC = new int[local42];
		if (local46 > 0) {
			this.textureTypes = new byte[local46];
			this.textureFacesP = new short[local46];
			this.textureFacesM = new short[local46];
			this.textureFacesN = new short[local46];
		}
		if (local66 == 1) {
			this.vertexBones = new int[local38];
		}
		if (local50 == 1) {
			this.triangleInfo = new byte[local42];
			this.faceTextureIndex = new byte[local42];
			this.triangleTextures = new short[local42];
		}
		if (local54 == 255) {
			this.trianglePriorities = new byte[local42];
		} else {
			this.priority = (byte) local54;
		}
		if (local58 == 1) {
			this.triangleAlpha = new byte[local42];
		}
		if (local62 == 1) {
			this.triangleBones = new int[local42];
		}
		this.triangleColors = new short[local42];
		local8.offset = 0;
		local13.offset = local165;
		local18.offset = local171;
		local23.offset = local90;
		local28.offset = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.g1();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.gSmart1or2s();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.gSmart1or2s();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.gSmart1or2s();
			}
			this.vertexX[local307] = local301 + local316;
			this.vertexY[local307] = local303 + local326;
			this.vertexZ[local307] = local305 + local336;
			local301 = this.vertexX[local307];
			local303 = this.vertexY[local307];
			local305 = this.vertexZ[local307];
			if (local66 == 1) {
				this.vertexBones[local307] = local28.g1();
			}
		}
		local8.offset = local149;
		local13.offset = local116;
		local18.offset = local98;
		local23.offset = local134;
		local28.offset = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.triangleColors[local307] = (short) local8.g2();
			if (local50 == 1) {
				local314 = local13.g1();
				if ((local314 & 0x1) == 1) {
					this.triangleInfo[local307] = 1;
					local1 = true;
				} else {
					this.triangleInfo[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.faceTextureIndex[local307] = (byte) (local314 >> 2);
					this.triangleTextures[local307] = this.triangleColors[local307];
					this.triangleColors[local307] = 127;
					if (this.triangleTextures[local307] != -1) {
						local3 = true;
					}
				} else {
					this.faceTextureIndex[local307] = -1;
					this.triangleTextures[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.trianglePriorities[local307] = local18.g1s();
			}
			if (local58 == 1) {
				this.triangleAlpha[local307] = local23.g1s();
			}
			if (local62 == 1) {
				this.triangleBones[local307] = local28.g1();
			}
		}
		local8.offset = local143;
		local13.offset = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(545) int local545;
		@Pc(648) int local648;
		for (local336 = 0; local336 < local42; local336++) {
			local545 = local13.g1();
			if (local545 == 1) {
				local307 = local8.gSmart1or2s() + local326;
				local314 = local8.gSmart1or2s() + local307;
				local316 = local8.gSmart1or2s() + local314;
				local326 = local316;
				this.triangleVertexA[local336] = local307;
				this.triangleVertexB[local336] = local314;
				this.triangleVertexC[local336] = local316;
			}
			if (local545 == 2) {
				local314 = local316;
				local316 = local8.gSmart1or2s() + local326;
				local326 = local316;
				this.triangleVertexA[local336] = local307;
				this.triangleVertexB[local336] = local314;
				this.triangleVertexC[local336] = local316;
			}
			if (local545 == 3) {
				local307 = local316;
				local316 = local8.gSmart1or2s() + local326;
				local326 = local316;
				this.triangleVertexA[local336] = local307;
				this.triangleVertexB[local336] = local314;
				this.triangleVertexC[local336] = local316;
			}
			if (local545 == 4) {
				local648 = local307;
				local307 = local314;
				local314 = local648;
				local316 = local8.gSmart1or2s() + local326;
				local326 = local316;
				this.triangleVertexA[local336] = local307;
				this.triangleVertexB[local336] = local648;
				this.triangleVertexC[local336] = local316;
			}
		}
		local8.offset = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.textureTypes[local336] = 0;
			this.textureFacesP[local336] = (short) local8.g2();
			this.textureFacesM[local336] = (short) local8.g2();
			this.textureFacesN[local336] = (short) local8.g2();
		}
		if (this.faceTextureIndex != null) {
			@Pc(721) boolean local721 = false;
			for (local545 = 0; local545 < local42; local545++) {
				local648 = this.faceTextureIndex[local545] & 0xFF;
				if (local648 != 255) {
					if ((this.textureFacesP[local648] & 0xFFFF) == this.triangleVertexA[local545] && (this.textureFacesM[local648] & 0xFFFF) == this.triangleVertexB[local545] && (this.textureFacesN[local648] & 0xFFFF) == this.triangleVertexC[local545]) {
						this.faceTextureIndex[local545] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.faceTextureIndex = null;
			}
		}
		if (!local3) {
			this.triangleTextures = null;
		}
		if (!local1) {
			this.triangleInfo = null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "()V")
	public final void method1689() {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			@Pc(10) int local10 = this.vertexZ[local1];
			this.vertexZ[local1] = this.vertexX[local1];
			this.vertexX[local1] = -local10;
		}
		this.invalidate();
	}
}
