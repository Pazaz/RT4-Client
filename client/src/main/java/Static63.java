import com.jogamp.opengl.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt1942 = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_48 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "J")
	private static long aLong71 = 0L;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int anInt1944 = 0;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1945 = 0;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_49 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_50 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_51 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
	private static final int[] anIntArray151 = new int[1000];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static synchronized void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1943) {
			@Pc(8) IntNode local8 = new IntNode(arg1);
			local8.aLong192 = arg0;
			aClass69_50.method2282(local8);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static synchronized void method1486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == anInt1943) {
			@Pc(7) IntNode local7 = new IntNode();
			local7.aLong192 = arg0;
			aClass69_51.method2282(local7);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()V")
	public static synchronized void clear() {
		anInt1943++;
		aClass69_48.method2278();
		aClass69_49.method2278();
		aClass69_50.method2278();
		aClass69_51.method2278();
		anInt1945 = 0;
		anInt1944 = 0;
		anInt1942 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
	public static synchronized void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1943) {
			@Pc(8) IntNode local8 = new IntNode(arg1);
			local8.aLong192 = arg0;
			aClass69_48.method2282(local8);
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
	public static synchronized void method1490() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) IntNode local8 = (IntNode) aClass69_48.method2287();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffers(local3, anIntArray151, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (IntNode) aClass69_49.method2287();
					if (local8 == null) {
						while (true) {
							local8 = (IntNode) aClass69_50.method2287();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray151, 0);
								}
								while (true) {
									local8 = (IntNode) aClass69_51.method2287();
									if (local8 == null) {
										if (anInt1945 + anInt1944 + anInt1942 > 100663296 && MonotonicClock.currentTimeMillis() > aLong71 + 60000L) {
											System.gc();
											aLong71 = MonotonicClock.currentTimeMillis();
										}
										return;
									}
									@Pc(126) int local126 = (int) local8.aLong192;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray151[local3++] = (int) local8.aLong192;
							anInt1942 -= local8.anInt3141;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray151, 0);
								local3 = 0;
							}
						}
					}
					anIntArray151[local3++] = (int) local8.aLong192;
					anInt1944 -= local8.anInt3141;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray151, 0);
						local3 = 0;
					}
				}
			}
			anIntArray151[local3++] = (int) local8.aLong192;
			anInt1945 -= local8.anInt3141;
			if (local3 == 1000) {
				local1.glDeleteBuffers(local3, anIntArray151, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)V")
	public static synchronized void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == anInt1943) {
			@Pc(8) IntNode local8 = new IntNode(arg1);
			local8.aLong192 = arg0;
			aClass69_49.method2282(local8);
		}
	}
}
