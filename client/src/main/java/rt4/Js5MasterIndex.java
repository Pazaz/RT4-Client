package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Js5MasterIndex {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!wa;")
	private Buffer buffer;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "[Lclient!bg;")
	private Js5CachedResourceProvider[] resourceProviders;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!k;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!jb;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!pm;")
	private Js5NetRequest request;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!jb;Lclient!k;)V")
	public Js5MasterIndex(@OriginalArg(0) Js5NetQueue arg0, @OriginalArg(1) Js5CacheQueue arg1) {
		this.cacheQueue = arg1;
		this.netQueue = arg0;
		if (!this.netQueue.isUrgentRequestQueueFull()) {
			this.request = this.netQueue.read(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
	public final boolean isReady() {
		if (this.buffer != null) {
			return true;
		}
		if (this.request == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return false;
			}
			this.request = this.netQueue.read(255, (byte) 0, 255, true);
		}
		if (this.request.incomplete) {
			return false;
		} else {
			this.buffer = new Buffer(this.request.getData());
			this.resourceProviders = new Js5CachedResourceProvider[(this.buffer.data.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public final void method179() {
		if (this.resourceProviders == null) {
			return;
		}
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.resourceProviders.length; local13++) {
			if (this.resourceProviders[local13] != null) {
				this.resourceProviders[local13].processPrefetchQueue();
			}
		}
		for (local13 = 0; local13 < this.resourceProviders.length; local13++) {
			if (this.resourceProviders[local13] != null) {
				this.resourceProviders[local13].loop();
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!ge;Lclient!ge;)Lclient!bg;")
	public final Js5CachedResourceProvider getResourceProvider(@OriginalArg(1) int arg0, @OriginalArg(2) Cache arg1, @OriginalArg(3) Cache arg2) {
		return this.method188(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ge;IIZLclient!ge;)Lclient!bg;")
	private Js5CachedResourceProvider method188(@OriginalArg(0) Cache arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Cache arg2) {
		if (this.buffer == null) {
			throw new RuntimeException();
		}
		this.buffer.offset = arg1 * 8 + 5;
		if (this.buffer.data.length <= this.buffer.offset) {
			throw new RuntimeException();
		} else if (this.resourceProviders[arg1] == null) {
			@Pc(56) int local56 = this.buffer.g4();
			@Pc(61) int local61 = this.buffer.g4();
			@Pc(75) Js5CachedResourceProvider local75 = new Js5CachedResourceProvider(arg1, arg0, arg2, this.netQueue, this.cacheQueue, local56, local61, true);
			this.resourceProviders[arg1] = local75;
			return local75;
		} else {
			return this.resourceProviders[arg1];
		}
	}
}
