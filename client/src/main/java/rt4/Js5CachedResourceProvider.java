package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.zip.CRC32;

@OriginalClass("client!bg")
public final class Js5CachedResourceProvider extends Js5ResourceProvider {

	@OriginalMember(owner = "client!fn", name = "X", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 crc32 = new CRC32();

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!ii;")
	private Js5Index index;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "[B")
	private byte[] groupStatus;

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "Z")
	private boolean prefetchAll;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	private int verifiedGroups = 0;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!sc;")
	private final HashTable requests = new HashTable(16);

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	private int group = 0;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "Lclient!ih;")
	private final LinkedList prefetchQueue = new LinkedList();

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "J")
	private long orphanCheckTime = 0L;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!ge;")
	private final Cache cache;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "Z")
	private boolean verifyAll;

	@OriginalMember(owner = "client!bg", name = "U", descriptor = "Lclient!ih;")
	private LinkedList groupQueue;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "Lclient!k;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	private final int expectedChecksum;

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "Z")
	private final boolean discardOrphans;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!ge;")
	private final Cache masterCache;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!jb;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	private final int expectedVersion;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Lclient!il;")
	private Js5Request indexRequest;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ILclient!ge;Lclient!ge;Lclient!jb;Lclient!k;IIZ)V")
	public Js5CachedResourceProvider(@OriginalArg(0) int archive, @OriginalArg(1) Cache cache, @OriginalArg(2) Cache masterCache, @OriginalArg(3) Js5NetQueue netQueue, @OriginalArg(4) Js5CacheQueue cacheQueue, @OriginalArg(5) int expectedChecksum, @OriginalArg(6) int expectedVersion, @OriginalArg(7) boolean discardOrphans) {
		this.archive = archive;
		this.cache = cache;
		if (this.cache == null) {
			this.verifyAll = false;
		} else {
			this.verifyAll = true;
			this.groupQueue = new LinkedList();
		}
		this.cacheQueue = cacheQueue;
		this.expectedChecksum = expectedChecksum;
		this.discardOrphans = discardOrphans;
		this.masterCache = masterCache;
		this.netQueue = netQueue;
		this.expectedVersion = expectedVersion;
		if (this.masterCache != null) {
			this.indexRequest = this.cacheQueue.readSynchronous(this.masterCache, this.archive);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	@Override
	public final void prefetchGroup(@OriginalArg(0) int arg0) {
		if (this.cache == null) {
			return;
		}
		@Pc(15) Node node;
		for (node = this.prefetchQueue.head(); node != null; node = this.prefetchQueue.next()) {
			if (node.key == (long) arg0) {
				return;
			}
		}
		node = new Node();
		node.key = arg0;
		this.prefetchQueue.addTail(node);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lclient!ii;")
	@Override
	public final Js5Index fetchIndex() {
		if (this.index != null) {
			return this.index;
		}
		if (this.indexRequest == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return null;
			}
			this.indexRequest = this.netQueue.read(255, (byte) 0, this.archive, true);
		}
		if (this.indexRequest.incomplete) {
			return null;
		}
		@Pc(52) byte[] local52 = this.indexRequest.getData();
		if (this.indexRequest instanceof Js5CacheRequest) {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(local52, this.expectedChecksum);
				if (this.expectedVersion != this.index.version) {
					throw new RuntimeException();
				}
			} catch (@Pc(88) RuntimeException local88) {
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, (byte) 0, this.archive, true);
				}
				return null;
			}
		} else {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5Index(local52, this.expectedChecksum);
			} catch (@Pc(131) RuntimeException ignored) {
				this.netQueue.rekey();
				this.index = null;
				if (this.netQueue.isUrgentRequestQueueFull()) {
					this.indexRequest = null;
				} else {
					this.indexRequest = this.netQueue.read(255, (byte) 0, this.archive, true);
				}
				return null;
			}
			if (this.masterCache != null) {
				this.cacheQueue.write(this.masterCache, local52, this.archive);
			}
		}
		if (this.cache != null) {
			this.groupStatus = new byte[this.index.capacity];
			this.verifiedGroups = 0;
		}
		this.indexRequest = null;
		return this.index;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public final void prefetchAll() {
		if (this.cache != null) {
			this.prefetchAll = true;
			if (this.groupQueue == null) {
				this.groupQueue = new LinkedList();
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)I")
	public final int getVerifiedGroups() {
		return this.verifiedGroups;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
	public final int getTotalVerifiedGroups() {
		if (this.index == null) {
			return 0;
		} else if (this.verifyAll) {
			@Pc(25) Node node = this.groupQueue.head();
			return node == null ? 0 : (int) node.key;
		} else {
			return this.index.size;
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V")
	public final void loop() {
		if (this.groupQueue != null) {
			if (this.fetchIndex() == null) {
				return;
			}
			@Pc(32) boolean local32;
			@Pc(37) Node local37;
			@Pc(43) int local43;
			if (this.verifyAll) {
				local32 = true;
				for (local37 = this.groupQueue.head(); local37 != null; local37 = this.groupQueue.next()) {
					local43 = (int) local37.key;
					if (this.groupStatus[local43] == 0) {
						this.fetchGroupInner(1, local43);
					}
					if (this.groupStatus[local43] == 0) {
						local32 = false;
					} else {
						local37.unlink();
					}
				}
				while (this.index.groupSizes.length > this.group) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.cacheQueue.size >= 250) {
							local32 = false;
							break;
						}
						if (this.groupStatus[this.group] == 0) {
							this.fetchGroupInner(1, this.group);
						}
						if (this.groupStatus[this.group] == 0) {
							local32 = false;
							local37 = new Node();
							local37.key = this.group;
							this.groupQueue.addTail(local37);
						}
						this.group++;
					}
				}
				if (local32) {
					this.verifyAll = false;
					this.group = 0;
				}
			} else if (this.prefetchAll) {
				local32 = true;
				for (local37 = this.groupQueue.head(); local37 != null; local37 = this.groupQueue.next()) {
					local43 = (int) local37.key;
					if (this.groupStatus[local43] != 1) {
						this.fetchGroupInner(2, local43);
					}
					if (this.groupStatus[local43] == 1) {
						local37.unlink();
					} else {
						local32 = false;
					}
				}
				while (this.index.groupSizes.length > this.group) {
					if (this.index.groupSizes[this.group] == 0) {
						this.group++;
					} else {
						if (this.netQueue.isPrefetchRequestQueueFull()) {
							local32 = false;
							break;
						}
						if (this.groupStatus[this.group] != 1) {
							this.fetchGroupInner(2, this.group);
						}
						if (this.groupStatus[this.group] != 1) {
							local37 = new Node();
							local37.key = this.group;
							this.groupQueue.addTail(local37);
							local32 = false;
						}
						this.group++;
					}
				}
				if (local32) {
					this.group = 0;
					this.prefetchAll = false;
				}
			} else {
				this.groupQueue = null;
			}
		}
		if (!this.discardOrphans || this.orphanCheckTime > MonotonicClock.currentTimeMillis()) {
			return;
		}
		for (@Pc(331) Js5Request request = (Js5Request) this.requests.head(); request != null; request = (Js5Request) this.requests.next()) {
			if (!request.incomplete) {
				if (request.orphan) {
					if (!request.urgent) {
						throw new RuntimeException();
					}
					request.unlink();
				} else {
					request.orphan = true;
				}
			}
		}
		this.orphanCheckTime = MonotonicClock.currentTimeMillis() + 1000L;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)I")
	@Override
	public final int getPercentageComplete(@OriginalArg(0) int arg0) {
		@Pc(15) Js5Request request = (Js5Request) this.requests.get(arg0);
		return request == null ? 0 : request.getPercentageComplete();
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	public final int getIndexSize() {
		return this.index == null ? 0 : this.index.size;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lclient!il;")
	private Js5Request fetchGroupInner(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Js5Request local13 = (Js5Request) this.requests.get(arg1);
		if (local13 != null && arg0 == 0 && !local13.urgent && local13.incomplete) {
			local13.unlink();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.cache == null || this.groupStatus[arg1] == -1) {
					if (this.netQueue.isUrgentRequestQueueFull()) {
						return null;
					}
					local13 = this.netQueue.read(this.archive, (byte) 2, arg1, true);
				} else {
					local13 = this.cacheQueue.readSynchronous(this.cache, arg1);
				}
			} else if (arg0 == 1) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				local13 = this.cacheQueue.read(arg1, this.cache);
			} else if (arg0 == 2) {
				if (this.cache == null) {
					throw new RuntimeException();
				}
				if (this.groupStatus[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.netQueue.isPrefetchRequestQueueFull()) {
					return null;
				}
				local13 = this.netQueue.read(this.archive, (byte) 2, arg1, false);
			} else {
				throw new RuntimeException();
			}
			this.requests.put(local13, arg1);
		}
		if (local13.incomplete) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.getData();
		@Pc(199) int local199;
		@Pc(252) Js5NetRequest local252;
		if (!(local13 instanceof Js5CacheRequest)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				crc32.reset();
				crc32.update(local161, 0, local161.length - 2);
				local199 = (int) crc32.getValue();
				if (this.index.groupChecksums[arg1] != local199) {
					throw new RuntimeException();
				}
				this.netQueue.errors = 0;
				this.netQueue.response = 0;
			} catch (@Pc(225) RuntimeException local225) {
				this.netQueue.rekey();
				local13.unlink();
				if (local13.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
					local252 = this.netQueue.read(this.archive, (byte) 2, arg1, true);
					this.requests.put(local252, arg1);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.index.groupVersions[arg1] >>> 8);
			local161[local161.length - 1] = (byte) this.index.groupVersions[arg1];
			if (this.cache != null) {
				this.cacheQueue.write(this.cache, local161, arg1);
				if (this.groupStatus[arg1] != 1) {
					this.verifiedGroups++;
					this.groupStatus[arg1] = 1;
				}
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			crc32.reset();
			crc32.update(local161, 0, local161.length - 2);
			local199 = (int) crc32.getValue();
			if (this.index.groupChecksums[arg1] != local199) {
				throw new RuntimeException();
			}
			@Pc(385) int local385 = ((local161[local161.length - 2] & 0xFF) << 8) + (local161[local161.length - 1] & 0xFF);
			if (local385 != (this.index.groupVersions[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.groupStatus[arg1] != 1) {
				if (this.groupStatus[arg1] != 0) {
				}
				this.verifiedGroups++;
				this.groupStatus[arg1] = 1;
			}
			if (!local13.urgent) {
				local13.unlink();
			}
			return local13;
		} catch (@Pc(437) Exception local437) {
			this.groupStatus[arg1] = -1;
			local13.unlink();
			if (local13.urgent && !this.netQueue.isUrgentRequestQueueFull()) {
				local252 = this.netQueue.read(this.archive, (byte) 2, arg1, true);
				this.requests.put(local252, arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
	public final void processPrefetchQueue() {
		if (this.groupQueue == null || this.fetchIndex() == null) {
			return;
		}
		for (@Pc(21) Node local21 = this.prefetchQueue.head(); local21 != null; local21 = this.prefetchQueue.next()) {
			@Pc(28) int local28 = (int) local21.key;
			if (local28 < 0 || this.index.capacity <= local28 || this.index.groupSizes[local28] == 0) {
				local21.unlink();
			} else {
				if (this.groupStatus[local28] == 0) {
					this.fetchGroupInner(1, local28);
				}
				if (this.groupStatus[local28] == -1) {
					this.fetchGroupInner(2, local28);
				}
				if (this.groupStatus[local28] == 1) {
					local21.unlink();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
	public final int getIndexPercentageComplete() {
		if (this.fetchIndex() == null) {
			return this.indexRequest == null ? 0 : this.indexRequest.getPercentageComplete();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)[B")
	@Override
	public final byte[] fetchGroup(@OriginalArg(0) int arg0) {
		@Pc(9) Js5Request local9 = this.fetchGroupInner(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.getData();
			local9.unlink();
			return local17;
		}
	}
}
