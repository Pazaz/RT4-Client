package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class GlCleaner {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int onCardTexture = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_48 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int contextId = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "J")
	private static long aLong71 = 0L;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int onCard2d = 0;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int onCardGeometry = 0;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_49 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_50 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ih;")
	private static final LinkedList aClass69_51 = new LinkedList();

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
	private static final int[] anIntArray151 = new int[1000];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static synchronized void deleteTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == contextId) {
			@Pc(8) IntNode local8 = new IntNode(arg1);
			local8.key = arg0;
			aClass69_50.addTail(local8);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static synchronized void deleteList(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == contextId) {
			@Pc(7) IntNode local7 = new IntNode();
			local7.key = arg0;
			aClass69_51.addTail(local7);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()V")
	public static synchronized void clear() {
		contextId++;
		aClass69_48.clear();
		aClass69_49.clear();
		aClass69_50.clear();
		aClass69_51.clear();
		onCardGeometry = 0;
		onCard2d = 0;
		onCardTexture = 0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
	public static synchronized void deleteBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == contextId) {
			@Pc(8) IntNode local8 = new IntNode(arg1);
			local8.key = arg0;
			aClass69_48.addTail(local8);
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
	public static synchronized void process() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		@Pc(3) int local3 = 0;
		while (true) {
			@Pc(8) IntNode local8 = (IntNode) aClass69_48.removeHead();
			if (local8 == null) {
				if (local3 > 0) {
					local1.glDeleteBuffers(local3, anIntArray151, 0);
					local3 = 0;
				}
				while (true) {
					local8 = (IntNode) aClass69_49.removeHead();
					if (local8 == null) {
						while (true) {
							local8 = (IntNode) aClass69_50.removeHead();
							if (local8 == null) {
								if (local3 > 0) {
									local1.glDeleteTextures(local3, anIntArray151, 0);
								}
								while (true) {
									local8 = (IntNode) aClass69_51.removeHead();
									if (local8 == null) {
										if (onCardGeometry + onCard2d + onCardTexture > 100663296 && MonotonicClock.currentTimeMillis() > aLong71 + 60000L) {
											System.gc();
											aLong71 = MonotonicClock.currentTimeMillis();
										}
										return;
									}
									@Pc(126) int local126 = (int) local8.key;
									local1.glDeleteLists(local126, 1);
								}
							}
							anIntArray151[local3++] = (int) local8.key;
							onCardTexture -= local8.value;
							if (local3 == 1000) {
								local1.glDeleteTextures(local3, anIntArray151, 0);
								local3 = 0;
							}
						}
					}
					anIntArray151[local3++] = (int) local8.key;
					onCard2d -= local8.value;
					if (local3 == 1000) {
						local1.glDeleteTextures(local3, anIntArray151, 0);
						local3 = 0;
					}
				}
			}
			anIntArray151[local3++] = (int) local8.key;
			onCardGeometry -= local8.value;
			if (local3 == 1000) {
				local1.glDeleteBuffers(local3, anIntArray151, 0);
				local3 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)V")
	public static synchronized void deleteTexture2d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == contextId) {
			@Pc(8) IntNode local8 = new IntNode(arg1);
			local8.key = arg0;
			aClass69_49.addTail(local8);
		}
	}
}
