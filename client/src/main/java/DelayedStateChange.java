import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class DelayedStateChange extends SecondaryNode {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!sc;")
	public static final HashTable changes = new HashTable(16);
	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!ce;")
	public static final SecondaryLinkedList clientQueue = new SecondaryLinkedList();
	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!ce;")
	public static final SecondaryLinkedList serverQueue = new SecondaryLinkedList();
	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	public int intArg3;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "Lclient!na;")
	public JagString stringArg;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
	public DelayedStateChange(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.key = (long) arg0 << 32 | (long) arg1;
	}

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V")
    public static void clear() {
        changes.clear();
        clientQueue.clear();
        serverQueue.clear();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public final void pushClient() {
		this.secondaryKey = MonotonicClock.currentTimeMillis() + 500L | Long.MIN_VALUE & this.secondaryKey;
		clientQueue.addTail(this);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)J")
	public final long getTime() {
		return this.secondaryKey & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I")
	public final int getType() {
		return (int) (this.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(B)I")
	public final int getId() {
		return (int) this.key;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(B)V")
	public final void pushServer() {
		this.secondaryKey |= Long.MIN_VALUE;
		if (this.getTime() == 0L) {
			serverQueue.addTail(this);
		}
	}
}
