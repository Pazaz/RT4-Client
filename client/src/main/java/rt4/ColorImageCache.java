package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class ColorImageCache {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!qi;")
	public static final ColorImageCacheEntry VALID = new ColorImageCacheEntry(0, 0);
	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ih;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lclient!qi;")
	private ColorImageCacheEntry[] entries;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[[I")
	private int[][] pixels;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(III)V")
	public ColorImageCache(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int width) {
		this.height = arg1;
		this.entries = new ColorImageCacheEntry[this.height];
		this.capacity = arg0;
		this.pixels = new int[this.capacity][width];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public final void clear() {
		for (@Pc(3) int i = 0; i < this.capacity; i++) {
			this.pixels[i] = null;
		}
		this.pixels = null;
		this.entries = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[I")
	public final int[] get(@OriginalArg(1) int row) {
		if (this.height == this.capacity) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = this.singleRow != row;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(29) ColorImageCacheEntry local29 = this.entries[row];
			if (local29 == null) {
				this.invalid = true;
				if (this.size < this.capacity) {
					local29 = new ColorImageCacheEntry(row, this.size);
					this.size++;
				} else {
					@Pc(66) ColorImageCacheEntry local66 = (ColorImageCacheEntry) this.recentlyUsed.tail();
					local29 = new ColorImageCacheEntry(row, local66.index);
					this.entries[local66.row] = null;
					local66.unlink();
				}
				this.entries[row] = local29;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(local29);
			return this.pixels[local29.index];
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)[[I")
	public final int[][] method3446() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.capacity; local24++) {
			this.entries[local24] = VALID;
		}
		return this.pixels;
	}
}
