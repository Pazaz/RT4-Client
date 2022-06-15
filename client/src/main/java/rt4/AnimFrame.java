package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class AnimFrame {

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[S")
	public static final short[] tempIndices = new short[500];

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[S")
	public static final short[] tempX = new short[500];

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[S")
	public static final short[] tempY = new short[500];

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[S")
	public static final short[] tempZ = new short[500];

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[B")
	public static final byte[] tempFlags = new byte[500];

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[S")
	public static final short[] tempPrevOriginIndices = new short[500];

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!jm;")
	public AnimBase base = null;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public int length = -1;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
	public boolean transformsAlpha = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Z")
	public boolean transformsColor = false;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[S")
	public final short[] indices;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[S")
	public final short[] x;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[S")
	public final short[] y;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[S")
	public final short[] z;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
	public final short[] prevOriginIndices;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[B")
	public final byte[] flags;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([BLclient!jm;)V")
	public AnimFrame(@OriginalArg(0) byte[] bytes, @OriginalArg(1) AnimBase base) {
		this.base = base;
		@Pc(21) Buffer headerBuffer = new Buffer(bytes);
		@Pc(26) Buffer buffer = new Buffer(bytes);
		headerBuffer.offset = 2;
		@Pc(33) int headerLen = headerBuffer.g1();
		@Pc(35) int len = 0;
		@Pc(37) int prevOriginIndex = -1;
		@Pc(39) int prevUsedOriginIndex = -1;
		buffer.offset = headerBuffer.offset + headerLen;
		@Pc(47) int i;
		for (i = 0; i < headerLen; i++) {
			@Pc(56) int type = this.base.types[i];
			if (type == 0) {
				prevOriginIndex = i;
			}
			@Pc(64) int attributes = headerBuffer.g1();
			if (attributes > 0) {
				if (type == 0) {
					prevUsedOriginIndex = i;
				}
				tempIndices[len] = (short) i;
				@Pc(77) short defaultValue = 0;
				if (type == 3) {
					defaultValue = 128;
				}
				if ((attributes & 0x1) == 0) {
					tempX[len] = defaultValue;
				} else {
					tempX[len] = (short) buffer.gsmart();
				}
				if ((attributes & 0x2) == 0) {
					tempY[len] = defaultValue;
				} else {
					tempY[len] = (short) buffer.gsmart();
				}
				if ((attributes & 0x4) == 0) {
					tempZ[len] = defaultValue;
				} else {
					tempZ[len] = (short) buffer.gsmart();
				}
				tempFlags[len] = (byte) (attributes >>> 3 & 0x3);
				if (type == 2) {
					tempX[len] = (short) (((tempX[len] & 0xFF) << 3) + (tempX[len] >> 8 & 0x7));
					tempY[len] = (short) (((tempY[len] & 0xFF) << 3) + (tempY[len] >> 8 & 0x7));
					tempZ[len] = (short) (((tempZ[len] & 0xFF) << 3) + (tempZ[len] >> 8 & 0x7));
				}
				tempPrevOriginIndices[len] = -1;
				if (type == 1 || type == 2 || type == 3) {
					if (prevOriginIndex > prevUsedOriginIndex) {
						tempPrevOriginIndices[len] = (short) prevOriginIndex;
						prevUsedOriginIndex = prevOriginIndex;
					}
				} else if (type == 5) {
					this.transformsAlpha = true;
				} else if (type == 7) {
					this.transformsColor = true;
				}
				len++;
			}
		}
		if (buffer.offset != bytes.length) {
			throw new RuntimeException();
		}
		this.length = len;
		this.indices = new short[len];
		this.x = new short[len];
		this.y = new short[len];
		this.z = new short[len];
		this.prevOriginIndices = new short[len];
		this.flags = new byte[len];
		for (i = 0; i < len; i++) {
			this.indices[i] = tempIndices[i];
			this.x[i] = tempX[i];
			this.y[i] = tempY[i];
			this.z[i] = tempZ[i];
			this.prevOriginIndices[i] = tempPrevOriginIndices[i];
			this.flags[i] = tempFlags[i];
		}
	}
}
