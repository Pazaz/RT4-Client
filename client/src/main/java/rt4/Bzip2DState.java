package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Bzip2DState {

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "B")
	public byte stateOutCh;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "[B")
	public byte[] strmNextOut;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public int saveNblock;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	public int strmAvailOut;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[B")
	public byte[] strmNextIn;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public int bsLive;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public int k0;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	public int nblockused;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	public int tPos;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
	public int origPtr;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	public int nInUse;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
	public int bsBuff;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	public int strmTotalOutLo32;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	public int blockSize100k;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	public int stateOutLen;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	public int strmTotalInLo32;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[B")
	public final byte[] mfta = new byte[4096];

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[Z")
	public final boolean[] inUse = new boolean[256];

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "[[I")
	public final int[][] perm = new int[6][258];

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[B")
	public final byte[] seqToUnseq = new byte[256];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "[[I")
	public final int[][] base = new int[6][258];

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int strmNextOutPtr = 0;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[[I")
	public final int[][] limit = new int[6][258];

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int strmNextInPtr = 0;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
	public final int[] unfztab = new int[256];

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
	public final int[] cftab = new int[257];

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[B")
	public final byte[] selector = new byte[18002];

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "[Z")
	public final boolean[] inUse16 = new boolean[16];

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
	public final int[] mtfbase = new int[16];

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "[B")
	public final byte[] selectorMtf = new byte[18002];

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "[I")
	public final int[] minLens = new int[6];

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "[[B")
	public final byte[][] len = new byte[6][258];
}
