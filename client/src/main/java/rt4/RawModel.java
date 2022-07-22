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

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "Z")
	public static boolean allowInput = false;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "[B")
	public byte[] triangleAlpha;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "S")
	private short maxY;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
	public byte[] textureRotationY;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[S")
	public short[] textureFacesM;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
	public int[] triangleBones;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "S")
	private short minX;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "[S")
	public short[] texturesScaleZ;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "S")
	private short minY;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "[S")
	public short[] triangleSources;

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
	public byte[] triangleTextureIndex;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "[S")
	public short[] triangleColors;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "[Lclient!hd;")
	public VertexNormal[] vertexNormals;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "S")
	private short maxX;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "S")
	private short maxZ;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "S")
	public short aShort18;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[I")
	public int[] triangleVertexB;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "S")
	public short aShort19;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "S")
	private short minZ;

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
	public short[] vertexSources;

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
	public RawModel(@OriginalArg(0) int vertexCount, @OriginalArg(1) int triangleCount, @OriginalArg(2) int arg2) {
		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];
		this.vertexBones = new int[vertexCount];
		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];
		this.triangleInfo = new byte[triangleCount];
		this.trianglePriorities = new byte[triangleCount];
		this.triangleAlpha = new byte[triangleCount];
		this.triangleColors = new short[triangleCount];
		this.triangleTextures = new short[triangleCount];
		this.triangleTextureIndex = new byte[triangleCount];
		this.triangleBones = new int[triangleCount];
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([Lclient!gb;I)V")
	public RawModel(@OriginalArg(0) RawModel[] models, @OriginalArg(1) int count) {
		@Pc(15) boolean keepInfo = false;
		@Pc(17) boolean keepPriorities = false;
		@Pc(19) boolean keepAlpha = false;
		@Pc(21) boolean keepBones = false;
		@Pc(23) boolean keepTextures = false;
		@Pc(25) boolean keepTextureIndex = false;

		this.vertexCount = 0;
		this.triangleCount = 0;
		this.texturedCount = 0;
		this.priority = -1;

		@Pc(43) int i;
		for (i = 0; i < count; i++) {
			@Pc(50) RawModel local50 = models[i];
			if (local50 != null) {
				this.vertexCount += local50.vertexCount;
				this.triangleCount += local50.triangleCount;
				this.texturedCount += local50.texturedCount;
				if (local50.trianglePriorities == null) {
					if (this.priority == -1) {
						this.priority = local50.priority;
					}
					if (this.priority != local50.priority) {
						keepPriorities = true;
					}
				} else {
					keepPriorities = true;
				}
				keepInfo |= local50.triangleInfo != null;
				keepAlpha |= local50.triangleAlpha != null;
				keepBones |= local50.triangleBones != null;
				keepTextures |= local50.triangleTextures != null;
				keepTextureIndex |= local50.triangleTextureIndex != null;
			}
		}

		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];

		this.vertexBones = new int[this.vertexCount];
		this.vertexSources = new short[this.vertexCount];

		this.triangleVertexA = new int[this.triangleCount];
		this.triangleVertexB = new int[this.triangleCount];
		this.triangleVertexC = new int[this.triangleCount];

		if (keepInfo) {
			this.triangleInfo = new byte[this.triangleCount];
		}

		if (keepPriorities) {
			this.trianglePriorities = new byte[this.triangleCount];
		}

		if (keepAlpha) {
			this.triangleAlpha = new byte[this.triangleCount];
		}

		if (keepBones) {
			this.triangleBones = new int[this.triangleCount];
		}

		if (keepTextures) {
			this.triangleTextures = new short[this.triangleCount];
		}

		if (keepTextureIndex) {
			this.triangleTextureIndex = new byte[this.triangleCount];
		}

		this.triangleColors = new short[this.triangleCount];
		this.triangleSources = new short[this.triangleCount];

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

		for (i = 0; i < count; i++) {
			@Pc(323) short local323 = (short) (0x1 << i);
			@Pc(327) RawModel other = models[i];

			if (other != null) {
				@Pc(331) int t;
				for (t = 0; t < other.triangleCount; t++) {
					if (keepInfo && other.triangleInfo != null) {
						this.triangleInfo[this.triangleCount] = other.triangleInfo[t];
					}

					if (keepPriorities) {
						if (other.trianglePriorities == null) {
							this.trianglePriorities[this.triangleCount] = other.priority;
						} else {
							this.trianglePriorities[this.triangleCount] = other.trianglePriorities[t];
						}
					}

					if (keepAlpha && other.triangleAlpha != null) {
						this.triangleAlpha[this.triangleCount] = other.triangleAlpha[t];
					}

					if (keepBones && other.triangleBones != null) {
						this.triangleBones[this.triangleCount] = other.triangleBones[t];
					}

					if (keepTextures) {
						if (other.triangleTextures == null) {
							this.triangleTextures[this.triangleCount] = -1;
						} else {
							this.triangleTextures[this.triangleCount] = other.triangleTextures[t];
						}
					}

					if (keepTextureIndex) {
						if (other.triangleTextureIndex == null || other.triangleTextureIndex[t] == -1) {
							this.triangleTextureIndex[this.triangleCount] = -1;
						} else {
							this.triangleTextureIndex[this.triangleCount] = (byte) (other.triangleTextureIndex[t] + this.texturedCount);
						}
					}

					this.triangleColors[this.triangleCount] = other.triangleColors[t];
					this.triangleSources[this.triangleCount] = local323;
					this.triangleVertexA[this.triangleCount] = this.addVertex(other, other.triangleVertexA[t], local323);
					this.triangleVertexB[this.triangleCount] = this.addVertex(other, other.triangleVertexB[t], local323);
					this.triangleVertexC[this.triangleCount] = this.addVertex(other, other.triangleVertexC[t], local323);
					this.triangleCount++;
				}

				for (t = 0; t < other.texturedCount; t++) {
					@Pc(530) byte type = this.textureTypes[this.texturedCount] = other.textureTypes[t];
					if (type == 0) {
						this.textureFacesP[this.texturedCount] = (short) this.addVertex(other, other.textureFacesP[t], local323);
						this.textureFacesM[this.texturedCount] = (short) this.addVertex(other, other.textureFacesM[t], local323);
						this.textureFacesN[this.texturedCount] = (short) this.addVertex(other, other.textureFacesN[t], local323);
					} else if (type >= 1 && type <= 3) {
						this.textureFacesP[this.texturedCount] = other.textureFacesP[t];
						this.textureFacesM[this.texturedCount] = other.textureFacesM[t];
						this.textureFacesN[this.texturedCount] = other.textureFacesN[t];
						this.texturesScaleX[this.texturedCount] = other.texturesScaleX[t];
						this.texturesScaleY[this.texturedCount] = other.texturesScaleY[t];
						this.texturesScaleZ[this.texturedCount] = other.texturesScaleZ[t];
						this.textureRotationY[this.texturedCount] = other.textureRotationY[t];
						this.aByteArray32[this.texturedCount] = other.aByteArray32[t];
						this.aByteArray34[this.texturedCount] = other.aByteArray34[t];
					} else if (type == 2) {
						this.aByteArray28[this.texturedCount] = other.aByteArray28[t];
						this.aByteArray33[this.texturedCount] = other.aByteArray33[t];
					}
					this.texturedCount++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!gb;ZZZZ)V")
	public RawModel(@OriginalArg(0) RawModel other, @OriginalArg(1) boolean reuseVertices, @OriginalArg(2) boolean reuseColors, @OriginalArg(3) boolean reuseTextures, @OriginalArg(4) boolean arg4) {
		this.vertexCount = other.vertexCount;
		this.triangleCount = other.triangleCount;
		this.texturedCount = other.texturedCount;

		if (reuseVertices) {
			this.vertexX = other.vertexX;
			this.vertexY = other.vertexY;
			this.vertexZ = other.vertexZ;
		} else {
			// otherwise, copy them

			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];

			System.arraycopy(other.vertexX, 0, this.vertexX, 0, this.vertexCount);
			System.arraycopy(other.vertexY, 0, this.vertexY, 0, this.vertexCount);
			System.arraycopy(other.vertexZ, 0, this.vertexZ, 0, this.vertexCount);
		}

		if (reuseColors) {
			this.triangleColors = other.triangleColors;
		} else {
			this.triangleColors = new short[this.triangleCount];
			System.arraycopy(other.triangleColors, 0, this.triangleColors, 0, this.triangleCount);
		}

		if (reuseTextures || other.triangleTextures == null) {
			this.triangleTextures = other.triangleTextures;
		} else {
			this.triangleTextures = new short[this.triangleCount];
			System.arraycopy(other.triangleTextures, 0, this.triangleTextures, 0, this.triangleCount);
		}

		this.triangleAlpha = other.triangleAlpha;
		this.triangleVertexA = other.triangleVertexA;
		this.triangleVertexB = other.triangleVertexB;
		this.triangleVertexC = other.triangleVertexC;
		this.triangleInfo = other.triangleInfo;
		this.trianglePriorities = other.trianglePriorities;
		this.triangleTextureIndex = other.triangleTextureIndex;
		this.priority = other.priority;
		this.textureTypes = other.textureTypes;
		this.textureFacesP = other.textureFacesP;
		this.textureFacesM = other.textureFacesM;
		this.textureFacesN = other.textureFacesN;
		this.texturesScaleX = other.texturesScaleX;
		this.texturesScaleY = other.texturesScaleY;
		this.texturesScaleZ = other.texturesScaleZ;
		this.textureRotationY = other.textureRotationY;
		this.aByteArray32 = other.aByteArray32;
		this.aByteArray34 = other.aByteArray34;
		this.aByteArray28 = other.aByteArray28;
		this.aByteArray33 = other.aByteArray33;
		this.vertexBones = other.vertexBones;
		this.triangleBones = other.triangleBones;
		this.boneVertices = other.boneVertices;
		this.boneTriangles = other.boneTriangles;
		this.vertexNormals = other.vertexNormals;
		this.triangleNormals = other.triangleNormals;
		this.aClass57Array2 = other.aClass57Array2;
		this.aShort19 = other.aShort19;
		this.aShort18 = other.aShort18;
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
	public static RawModel create(@OriginalArg(0) Js5 archive, @OriginalArg(1) int id) {
		@Pc(5) byte[] data = archive.fetchFile(id, 0);
		return data == null ? null : new RawModel(data);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	public final void negateXz() {
		for (@Pc(1) int v = 0; v < this.vertexCount; v++) {
			this.vertexX[v] = -this.vertexX[v];
			this.vertexZ[v] = -this.vertexZ[v];
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()V")
	public final void swapXz() {
		for (@Pc(1) int local1 = 0; local1 < this.vertexCount; local1++) {
			@Pc(10) int temp = this.vertexX[local1];
			this.vertexX[local1] = this.vertexZ[local1];
			this.vertexZ[local1] = -temp;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	private void rotate(@OriginalArg(0) int theta) {
		@Pc(3) int sin = SIN[theta];
		@Pc(7) int cos = COS[theta];
		for (@Pc(9) int v = 0; v < this.vertexCount; v++) {
			@Pc(29) int temp = this.vertexY[v] * sin + this.vertexX[v] * cos >> 16;
			this.vertexY[v] = this.vertexY[v] * cos - this.vertexX[v] * sin >> 16;
			this.vertexX[v] = temp;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "()V")
	private void calculateBounds() {
		if (this.boundsValid) {
			return;
		}

		this.boundsValid = true;

		@Pc(8) int minX = 32767;
		@Pc(10) int minY = 32767;
		@Pc(12) int minZ = 32767;
		@Pc(14) int maxX = -32768;
		@Pc(16) int maxY = -32768;
		@Pc(18) int maxZ = -32768;

		for (@Pc(20) int v = 0; v < this.vertexCount; v++) {
			@Pc(29) int x = this.vertexX[v];
			@Pc(34) int y = this.vertexY[v];
			@Pc(39) int z = this.vertexZ[v];

			if (x < minX) {
				minX = x;
			}

			if (x > maxX) {
				maxX = x;
			}

			if (y < minY) {
				minY = y;
			}

			if (y > maxY) {
				maxY = y;
			}

			if (z < minZ) {
				minZ = z;
			}

			if (z > maxZ) {
				maxZ = z;
			}
		}

		this.minX = (short) minX;
		this.maxX = (short) maxX;
		this.minY = (short) minY;
		this.maxY = (short) maxY;
		this.minZ = (short) minZ;
		this.maxZ = (short) maxZ;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V")
	public final void resize(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		for (@Pc(1) int v = 0; v < this.vertexCount; v++) {
			this.vertexX[v] = this.vertexX[v] * x / 128;
			this.vertexY[v] = this.vertexY[v] * y / 128;
			this.vertexZ[v] = this.vertexZ[v] * z / 128;
		}
		this.invalidate();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Lclient!th;")
	@Override
	public final Entity createModel() {
		return this.createModel(this.aShort19, this.aShort18, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!gb;IS)I")
	private int addVertex(@OriginalArg(0) RawModel m, @OriginalArg(1) int vertex, @OriginalArg(2) short source) {
		@Pc(4) int x = m.vertexX[vertex];
		@Pc(9) int y = m.vertexY[vertex];
		@Pc(14) int z = m.vertexZ[vertex];

		for (@Pc(16) int i = 0; i < this.vertexCount; i++) {
			if (x == this.vertexX[i] && y == this.vertexY[i] && z == this.vertexZ[i]) {
				this.vertexSources[i] |= source;
				return i;
			}
		}

		this.vertexX[this.vertexCount] = x;
		this.vertexY[this.vertexCount] = y;
		this.vertexZ[this.vertexCount] = z;
		this.vertexSources[this.vertexCount] = source;

		if (m.vertexBones != null) {
			this.vertexBones[this.vertexCount] = m.vertexBones[vertex];
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
			@Pc(120) int local120 = (int) (Math.atan2(local84 - local91, arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method1677(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2(local105 - local98, arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.rotate(local140);
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

			@Pc(174) int local174 = (int) Math.sqrt(local112 * local112 + local120 * local120 + local128 * local128);
			if (local174 <= 0) {
				local174 = 1;
			}

			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;

			@Pc(201) byte info;
			if (this.triangleInfo == null) {
				info = 0;
			} else {
				info = this.triangleInfo[local10];
			}

			if (info == 0) {
				@Pc(214) VertexNormal n1 = this.vertexNormals[local34];
				n1.x += local112;
				n1.y += local120;
				n1.z += local128;
				n1.magnitude++;
				@Pc(243) VertexNormal n2 = this.vertexNormals[local39];
				n2.x += local112;
				n2.y += local120;
				n2.z += local128;
				n2.magnitude++;
				@Pc(272) VertexNormal n3 = this.vertexNormals[local44];
				n3.x += local112;
				n3.y += local120;
				n3.z += local128;
				n3.magnitude++;
			} else if (info == 1) {
				if (this.triangleNormals == null) {
					this.triangleNormals = new TriangleNormal[this.triangleCount];
				}

				@Pc(317) TriangleNormal n = this.triangleNormals[local10] = new TriangleNormal();
				n.anInt4769 = local112;
				n.anInt4770 = local120;
				n.anInt4767 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(SS)V")
	public final void retexture(@OriginalArg(0) short src, @OriginalArg(1) short dest) {
		if (this.triangleTextures == null) {
			return;
		}

		for (@Pc(5) int i = 0; i < this.triangleCount; i++) {
			if (this.triangleTextures[i] == src) {
				this.triangleTextures[i] = dest;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!gb;")
	public final RawModel method1670(@OriginalArg(0) int orientation, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.calculateBounds();
		@Pc(6) int local6 = arg4 + this.minX;
		@Pc(11) int local11 = arg4 + this.maxX;
		@Pc(16) int local16 = arg6 + this.minZ;
		@Pc(21) int local21 = arg6 + this.maxZ;
		if ((orientation == 1 || orientation == 2 || orientation == 3 || orientation == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (orientation == 4 || orientation == 5) {
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

		@Pc(147) RawModel m = new RawModel();
		m.vertexCount = this.vertexCount;
		m.triangleCount = this.triangleCount;
		m.texturedCount = this.texturedCount;
		m.triangleVertexA = this.triangleVertexA;
		m.triangleVertexB = this.triangleVertexB;
		m.triangleVertexC = this.triangleVertexC;
		m.triangleInfo = this.triangleInfo;
		m.trianglePriorities = this.trianglePriorities;
		m.triangleAlpha = this.triangleAlpha;
		m.triangleTextureIndex = this.triangleTextureIndex;
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
		m.aShort19 = this.aShort19;
		m.aShort18 = this.aShort18;
		m.vertexNormals = this.vertexNormals;
		m.triangleNormals = this.triangleNormals;
		m.aClass57Array2 = this.aClass57Array2;
		if (orientation == 3) {
			m.vertexX = ArrayUtils.copyOfNullable(this.vertexX);
			m.vertexY = ArrayUtils.copyOfNullable(this.vertexY);
			m.vertexZ = ArrayUtils.copyOfNullable(this.vertexZ);
		} else {
			m.vertexX = this.vertexX;
			m.vertexY = new int[m.vertexCount];
			m.vertexZ = this.vertexZ;
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
		if (orientation == 1) {
			for (local326 = 0; local326 < m.vertexCount; local326++) {
				local337 = this.vertexX[local326] + arg4;
				local344 = this.vertexZ[local326] + arg6;
				local348 = local337 & 0x7F;
				local352 = local344 & 0x7F;
				local356 = local337 >> 7;
				local360 = local344 >> 7;
				local382 = arg2[local356][local360] * (128 - local348) + arg2[local356 + 1][local360] * local348 >> 7;
				local408 = arg2[local356][local360 + 1] * (128 - local348) + arg2[local356 + 1][local360 + 1] * local348 >> 7;
				local420 = local382 * (128 - local352) + local408 * local352 >> 7;
				m.vertexY[local326] = this.vertexY[local326] + local420 - arg5;
			}
		} else {
			@Pc(547) int local547;
			if (orientation == 2) {
				for (local326 = 0; local326 < m.vertexCount; local326++) {
					local337 = (this.vertexY[local326] << 16) / this.minY;
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
						m.vertexY[local326] = this.vertexY[local326] + (local547 - arg5) * (arg1 - local337) / arg1;
					} else {
						m.vertexY[local326] = this.vertexY[local326];
					}
				}
			} else if (orientation == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local337 = (arg1 >> 8 & 0xFF) * 4;
				this.method1667(arg2, arg4, arg5, arg6, local326, local337);
			} else if (orientation == 4) {
				local326 = this.maxY - this.minY;
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
					m.vertexY[local337] = this.vertexY[local337] + local547 + local326 - arg5;
				}
			} else if (orientation == 5) {
				local326 = this.maxY - this.minY;
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
					m.vertexY[local337] = ((this.vertexY[local337] << 8) / local326 * local894 >> 8) - (arg5 - local547);
				}
			}
		}
		this.boundsValid = false;
		return m;
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
	public final void translate(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		for (@Pc(1) int v = 0; v < this.vertexCount; v++) {
			this.vertexX[v] += x;
			this.vertexY[v] += y;
			this.vertexZ[v] += z;
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
		// originally Jagex had obhead, obface1-5, obpoint1-5, obvertex1-2, and obaxis... might be possibly to simplify
		// these buffer names to that again. But they've also consolidated some

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
		@Pc(74) boolean hasParticleEmitters = (hasInfo & 0x2) == 2; // not used in 530

		@Pc(78) int priority = buffer1.g1();
		@Pc(82) int hasAlpha = buffer1.g1();
		@Pc(86) int hasTriangleBones = buffer1.g1();
		@Pc(90) int hasTextures = buffer1.g1();
		@Pc(94) int hasVertexBones = buffer1.g1();

		@Pc(98) int dxDataLength = buffer1.g2();
		@Pc(102) int dyDataLength = buffer1.g2();
		@Pc(106) int dzDataLength = buffer1.g2();
		@Pc(110) int vertexIndexDataLength = buffer1.g2();
		@Pc(114) int triangleTextureDataLength = buffer1.g2();

		@Pc(116) int simpleTextureFaceCount = 0;
		@Pc(118) int complexTextureFaceCount = 0;
		@Pc(120) int cubeTextureFaceCount = 0;

		if (texturedCount > 0) {
			this.textureTypes = new byte[texturedCount];
			buffer1.offset = 0;

			for (int i = 0; i < texturedCount; i++) {
				@Pc(143) byte type = this.textureTypes[i] = buffer1.g1b();
				if (type == 0) {
					simpleTextureFaceCount++;
				} else if (type >= 1 && type <= 3) {
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

		@Pc(177) int triangleTypeDataOffset = offset;
		offset += triangleCount;

		@Pc(183) int trianglePriorityDataOffset = offset;
		if (priority == 255) {
			offset += triangleCount;
		}

		@Pc(192) int triangleBonesDataOffset = offset;
		if (hasTriangleBones == 1) {
			offset += triangleCount;
		}

		@Pc(201) int vertexBonesDataOffset = offset;
		if (hasVertexBones == 1) {
			offset += vertexCount;
		}

		@Pc(210) int triangleAlphaDataOffset = offset;
		if (hasAlpha == 1) {
			offset += triangleCount;
		}

		@Pc(219) int vertexIndexDataOffset = offset;
		offset += vertexIndexDataLength;

		@Pc(225) int triangleTexturesDataOffset = offset;
		if (hasTextures == 1) {
			offset += triangleCount * 2;
		}

		@Pc(236) int triangleTextureIndexDataOffset = offset;
		offset += triangleTextureDataLength;

		@Pc(242) int triangleColorDataOffset = offset;
		offset += triangleCount * 2;

		@Pc(250) int dxDataOffset = offset;
		offset += dxDataLength;

		@Pc(256) int dyDataOffset = offset;
		offset += dyDataLength;

		@Pc(262) int dzDataOffset = offset;
		offset += dzDataLength;

		@Pc(268) int simplePmnDataOffset = offset;
		offset += simpleTextureFaceCount * 6;

		@Pc(276) int complexPmnDataOffset = offset;
		offset += complexTextureFaceCount * 6;

		@Pc(284) int complexScaleDataOffset = offset;
		offset += complexTextureFaceCount * 6;

		@Pc(292) int complexRotationDataOffset = offset;
		offset += complexTextureFaceCount;

		@Pc(298) int cube1DataOffset = offset;
		offset += complexTextureFaceCount;

		@Pc(304) int cube2DataOffset = offset;
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
			this.triangleTextureIndex = new byte[triangleCount];
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
		buffer2.offset = dxDataOffset;
		buffer3.offset = dyDataOffset;
		buffer4.offset = dzDataOffset;
		buffer5.offset = vertexBonesDataOffset;

		@Pc(473) int prevVertexX = 0;
		@Pc(475) int prevVertexY = 0;
		@Pc(477) int prevVertexZ = 0;

		for (int v = 0; v < vertexCount; v++) {
			int flags = buffer1.g1();

			int dx = 0;
			if ((flags & 0x1) != 0) {
				dx = buffer2.gsmart();
			}

			int dy = 0;
			if ((flags & 0x2) != 0) {
				dy = buffer3.gsmart();
			}

			int dz = 0;
			if ((flags & 0x4) != 0) {
				dz = buffer4.gsmart();
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
				this.triangleInfo[t] = buffer2.g1b();
			}

			if (priority == 255) {
				this.trianglePriorities[t] = buffer3.g1b();
			}

			if (hasAlpha == 1) {
				this.triangleAlpha[t] = buffer4.g1b();
			}

			if (hasTriangleBones == 1) {
				this.triangleBones[t] = buffer5.g1();
			}

			if (hasTextures == 1) {
				this.triangleTextures[t] = (short) (buffer6.g2() - 1);
			}

			if (this.triangleTextureIndex != null) {
				if (this.triangleTextures[t] == -1) {
					this.triangleTextureIndex[t] = -1;
				} else {
					this.triangleTextureIndex[t] = (byte) (buffer7.g1() - 1);
				}
			}
		}

		buffer1.offset = vertexIndexDataOffset;
		buffer2.offset = triangleTypeDataOffset;

		int a = 0;
		int b = 0;
		int c = 0;
		int last = 0;

		for (int t = 0; t < triangleCount; t++) {
			int type = buffer2.g1();
			if (type == 1) {
				a = buffer1.gsmart() + last;
				b = buffer1.gsmart() + a;
				c = buffer1.gsmart() + b;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b;
				this.triangleVertexC[t] = c;
			} else if (type == 2) {
				b = c;
				c = buffer1.gsmart() + last;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b;
				this.triangleVertexC[t] = c;
			} else if (type == 3) {
				a = c;
				c = buffer1.gsmart() + last;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b;
				this.triangleVertexC[t] = c;
			} else if (type == 4) {
				@Pc(803) int b0 = a;
				a = b;
				b = b0;
				c = buffer1.gsmart() + last;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b0;
				this.triangleVertexC[t] = c;
			}
		}

		buffer1.offset = simplePmnDataOffset;
		buffer2.offset = complexPmnDataOffset;
		buffer3.offset = complexScaleDataOffset;
		buffer4.offset = complexRotationDataOffset;
		buffer5.offset = cube1DataOffset;
		buffer6.offset = cube2DataOffset;

		for (int t = 0; t < texturedCount; t++) {
			int type = this.textureTypes[t] & 0xFF;
			if (type == 0) {
				this.textureFacesP[t] = (short) buffer1.g2();
				this.textureFacesM[t] = (short) buffer1.g2();
				this.textureFacesN[t] = (short) buffer1.g2();
			} else if (type == 1) {
				this.textureFacesP[t] = (short) buffer2.g2();
				this.textureFacesM[t] = (short) buffer2.g2();
				this.textureFacesN[t] = (short) buffer2.g2();
				this.texturesScaleX[t] = (short) buffer3.g2();
				this.texturesScaleY[t] = (short) buffer3.g2();
				this.texturesScaleZ[t] = (short) buffer3.g2();
				this.textureRotationY[t] = buffer4.g1b();
				this.aByteArray32[t] = buffer5.g1b();
				this.aByteArray34[t] = buffer6.g1b();
			} else if (type == 2) {
				this.textureFacesP[t] = (short) buffer2.g2();
				this.textureFacesM[t] = (short) buffer2.g2();
				this.textureFacesN[t] = (short) buffer2.g2();
				this.texturesScaleX[t] = (short) buffer3.g2();
				this.texturesScaleY[t] = (short) buffer3.g2();
				this.texturesScaleZ[t] = (short) buffer3.g2();
				this.textureRotationY[t] = buffer4.g1b();
				this.aByteArray32[t] = buffer5.g1b();
				this.aByteArray34[t] = buffer6.g1b();
				this.aByteArray28[t] = buffer6.g1b();
				this.aByteArray33[t] = buffer6.g1b();
			} else if (type == 3) {
				this.textureFacesP[t] = (short) buffer2.g2();
				this.textureFacesM[t] = (short) buffer2.g2();
				this.textureFacesN[t] = (short) buffer2.g2();
				this.texturesScaleX[t] = (short) buffer3.g2();
				this.texturesScaleY[t] = (short) buffer3.g2();
				this.texturesScaleZ[t] = (short) buffer3.g2();
				this.textureRotationY[t] = buffer4.g1b();
				this.aByteArray32[t] = buffer5.g1b();
				this.aByteArray34[t] = buffer6.g1b();
			}
		}

		if (hasParticleEmitters) {
			buffer1.offset = offset;

			int particleEmittersLen = buffer1.g1();
			if (particleEmittersLen > 0) {
				buffer1.offset += particleEmittersLen * 4;
			}

			int particleEffectorsLen = buffer1.g1();
			if (particleEffectorsLen > 0) {
				buffer1.offset += particleEffectorsLen * 4;
			}
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
		m.triangleTextureIndex = this.triangleTextureIndex;
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
		this.triangleTextureIndex[this.triangleCount] = -1;
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
	public final int getMinY() {
		if (!this.boundsValid) {
			this.calculateBounds();
		}

		return this.minY;
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "()V")
	public final void resetBones() {
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
			if (local29.magnitude != 0) {
				@Pc(40) int local40 = this.vertexY[local20] - arg2;
				if (local40 >= m.minY && local40 <= m.maxY) {
					@Pc(56) int local56 = this.vertexX[local20] - arg1;
					if (local56 >= m.minX && local56 <= m.maxX) {
						@Pc(72) int local72 = this.vertexZ[local20] - arg3;
						if (local72 >= m.minZ && local72 <= m.maxZ) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) VertexNormal local91 = m.vertexNormals[local83];
								if (local56 == local15[local83] && local72 == m.vertexZ[local83] && local40 == m.vertexY[local83] && local91.magnitude != 0) {
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
									local131.magnitude += local91.magnitude;
									local148.x += local29.x;
									local148.y += local29.y;
									local148.z += local29.z;
									local148.magnitude += local29.magnitude;
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
	public final void recolor(@OriginalArg(0) short src, @OriginalArg(1) short dest) {
		for (@Pc(1) int i = 0; i < this.triangleCount; i++) {
			if (this.triangleColors[i] == src) {
				this.triangleColors[i] = dest;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "([B)V")
	private void decodeOld(@OriginalArg(0) byte[] src) {
		@Pc(1) boolean hasTriangleInfo = false;
		@Pc(3) boolean hasTextures = false;

		@Pc(8) Buffer buffer1 = new Buffer(src);
		@Pc(13) Buffer buffer2 = new Buffer(src);
		@Pc(18) Buffer buffer3 = new Buffer(src);
		@Pc(23) Buffer buffer4 = new Buffer(src);
		@Pc(28) Buffer buffer5 = new Buffer(src);
		buffer1.offset = src.length - 18;

		@Pc(38) int vertexCount = buffer1.g2();
		@Pc(42) int triangleCount = buffer1.g2();
		@Pc(46) int texturedCount = buffer1.g1();

		@Pc(50) int hasInfo = buffer1.g1();
		@Pc(54) int hasPriorities = buffer1.g1();
		@Pc(58) int hasAlpha = buffer1.g1();
		@Pc(62) int hasTriangleBones = buffer1.g1();
		@Pc(66) int hasVertexBones = buffer1.g1();

		@Pc(70) int dxDataLength = buffer1.g2();
		@Pc(74) int dyDataLength = buffer1.g2();
		@Pc(78) int dzDataLength = buffer1.g2();
		@Pc(82) int vertexIndexDataLength = buffer1.g2();

		@Pc(90) int offset = vertexCount;

		@Pc(92) int triangleTypeDataOffset = offset;
		offset += triangleCount;

		@Pc(98) int trianglePriorityDataOffset = offset;
		if (hasPriorities == 255) {
			offset += triangleCount;
		}

		@Pc(107) int triangleBonesDataOffset = offset;
		if (hasTriangleBones == 1) {
			offset += triangleCount;
		}

		@Pc(116) int triangleInfoDataOffset = offset;
		if (hasInfo == 1) {
			offset += triangleCount;
		}

		@Pc(125) int vertexBonesOffset = offset;
		if (hasVertexBones == 1) {
			offset += vertexCount;
		}

		@Pc(134) int triangleAlphaDataOffset = offset;
		if (hasAlpha == 1) {
			offset += triangleCount;
		}

		@Pc(143) int vertexIndexDataOffset = offset;
		offset += vertexIndexDataLength;

		@Pc(149) int triangleColorDataOffset = offset;
		offset += triangleCount * 2;

		@Pc(157) int pmnDataOffset = offset;
		offset += texturedCount * 6;

		@Pc(165) int dxDataOffset = offset;
		offset += dxDataLength;

		@Pc(171) int dyDataOffset = offset;
		offset += dyDataLength;

		@Pc(171) int dzDataOffset = offset;
		// offset += dzDataLength;

		this.vertexCount = vertexCount;
		this.triangleCount = triangleCount;
		this.texturedCount = texturedCount;

		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];

		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];

		if (texturedCount > 0) {
			this.textureTypes = new byte[texturedCount];
			this.textureFacesP = new short[texturedCount];
			this.textureFacesM = new short[texturedCount];
			this.textureFacesN = new short[texturedCount];
		}

		if (hasVertexBones == 1) {
			this.vertexBones = new int[vertexCount];
		}

		if (hasInfo == 1) {
			this.triangleInfo = new byte[triangleCount];
			this.triangleTextureIndex = new byte[triangleCount];
			this.triangleTextures = new short[triangleCount];
		}

		if (hasPriorities == 255) {
			this.trianglePriorities = new byte[triangleCount];
		} else {
			this.priority = (byte) hasPriorities;
		}

		if (hasAlpha == 1) {
			this.triangleAlpha = new byte[triangleCount];
		}

		if (hasTriangleBones == 1) {
			this.triangleBones = new int[triangleCount];
		}

		this.triangleColors = new short[triangleCount];

		buffer1.offset = 0;
		buffer2.offset = dxDataOffset;
		buffer3.offset = dyDataOffset;
		buffer4.offset = dzDataOffset;
		buffer5.offset = vertexBonesOffset;

		@Pc(301) int prevVertexX = 0;
		@Pc(303) int prevVertexY = 0;
		@Pc(305) int prevVertexZ = 0;

		for (int v = 0; v < vertexCount; v++) {
			int flags = buffer1.g1();

			int dx = 0;
			if ((flags & 0x1) != 0) {
				dx = buffer2.gsmart();
			}

			int dy = 0;
			if ((flags & 0x2) != 0) {
				dy = buffer3.gsmart();
			}

			int dz = 0;
			if ((flags & 0x4) != 0) {
				dz = buffer4.gsmart();
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

		for (int t = 0; t < triangleCount; t++) {
			this.triangleColors[t] = (short) buffer1.g2();

			if (hasInfo == 1) {
				int flags = buffer2.g1();
				if ((flags & 0x1) == 1) {
					this.triangleInfo[t] = 1;
					hasTriangleInfo = true;
				} else {
					this.triangleInfo[t] = 0;
				}

				if ((flags & 0x2) == 2) {
					this.triangleTextureIndex[t] = (byte) (flags >> 2);
					this.triangleTextures[t] = this.triangleColors[t];
					this.triangleColors[t] = 127;
					if (this.triangleTextures[t] != -1) {
						hasTextures = true;
					}
				} else {
					this.triangleTextureIndex[t] = -1;
					this.triangleTextures[t] = -1;
				}
			}

			if (hasPriorities == 255) {
				this.trianglePriorities[t] = buffer3.g1b();
			}

			if (hasAlpha == 1) {
				this.triangleAlpha[t] = buffer4.g1b();
			}

			if (hasTriangleBones == 1) {
				this.triangleBones[t] = buffer5.g1();
			}
		}

		buffer1.offset = vertexIndexDataOffset;
		buffer2.offset = triangleTypeDataOffset;

		int a = 0;
		int b = 0;
		int c = 0;
		int last = 0;

		for (int t = 0; t < triangleCount; t++) {
			int type = buffer2.g1();
			if (type == 1) {
				a = buffer1.gsmart() + last;
				b = buffer1.gsmart() + a;
				c = buffer1.gsmart() + b;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b;
				this.triangleVertexC[t] = c;
			} else if (type == 2) {
				b = c;
				c = buffer1.gsmart() + last;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b;
				this.triangleVertexC[t] = c;
			} else if (type == 3) {
				a = c;
				c = buffer1.gsmart() + last;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b;
				this.triangleVertexC[t] = c;
			} else if (type == 4) {
				int b0 = a;
				a = b;
				b = b0;
				c = buffer1.gsmart() + last;
				last = c;
				this.triangleVertexA[t] = a;
				this.triangleVertexB[t] = b0;
				this.triangleVertexC[t] = c;
			}
		}

		buffer1.offset = pmnDataOffset;

		for (int t = 0; t < texturedCount; t++) {
			this.textureTypes[t] = 0;
			this.textureFacesP[t] = (short) buffer1.g2();
			this.textureFacesM[t] = (short) buffer1.g2();
			this.textureFacesN[t] = (short) buffer1.g2();
		}

		if (this.triangleTextureIndex != null) {
			@Pc(721) boolean hasFaceTextures = false;
			for (int i = 0; i < triangleCount; i++) {
				int index = this.triangleTextureIndex[i] & 0xFF;
				if (index != 255) {
					if ((this.textureFacesP[index] & 0xFFFF) == this.triangleVertexA[i] && (this.textureFacesM[index] & 0xFFFF) == this.triangleVertexB[i] && (this.textureFacesN[index] & 0xFFFF) == this.triangleVertexC[i]) {
						this.triangleTextureIndex[i] = -1;
					} else {
						hasFaceTextures = true;
					}
				}
			}

			if (!hasFaceTextures) {
				this.triangleTextureIndex = null;
			}
		}

		if (!hasTextures) {
			this.triangleTextures = null;
		}

		if (!hasTriangleInfo) {
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
