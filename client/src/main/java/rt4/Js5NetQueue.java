package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!jb")
public final class Js5NetQueue {

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "J")
	private long previousLoop;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!ma;")
	private BufferedSocket socket;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private int latency;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!pm;")
	private Js5NetRequest current;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList pendingUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList inFlightUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList pendingPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Lclient!ce;")
	private final SecondaryLinkedList inFlightPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Lclient!wa;")
	private final Buffer outBuffer = new Buffer(4);

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "B")
	private byte encryptionKey = 0;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public volatile int errors = 0;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public volatile int response = 0;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Lclient!wa;")
	private final Buffer inBuffer = new Buffer(8);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	public final boolean isPrefetchRequestQueueFull() {
		return this.getPrefetchRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
	public final boolean loop() {
		@Pc(19) int local19;
		if (this.socket != null) {
			@Pc(12) long local12 = MonotonicClock.currentTimeMillis();
			local19 = (int) (local12 - this.previousLoop);
			this.previousLoop = local12;
			if (local19 > 200) {
				local19 = 200;
			}
			this.latency += local19;
			if (this.latency > 30000) {
				try {
					this.socket.close();
				} catch (@Pc(43) Exception local43) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
		try {
			this.socket.checkError();
			@Pc(75) Js5NetRequest local75;
			for (local75 = (Js5NetRequest) this.pendingUrgentRequests.head(); local75 != null; local75 = (Js5NetRequest) this.pendingUrgentRequests.next()) {
				this.outBuffer.offset = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p3((int) local75.secondaryKey);
				this.socket.write(this.outBuffer.data, 4);
				this.inFlightUrgentRequests.addTail(local75);
			}
			for (local75 = (Js5NetRequest) this.pendingPrefetchRequests.head(); local75 != null; local75 = (Js5NetRequest) this.pendingPrefetchRequests.next()) {
				this.outBuffer.offset = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p3((int) local75.secondaryKey);
				this.socket.write(this.outBuffer.data, 4);
				this.inFlightPrefetchRequests.addTail(local75);
			}
			for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
				local19 = this.socket.available();
				if (local19 < 0) {
					throw new IOException();
				}
				if (local19 == 0) {
					break;
				}
				this.latency = 0;
				@Pc(196) byte local196 = 0;
				if (this.current == null) {
					local196 = 8;
				} else if (this.current.blockPosition == 0) {
					local196 = 1;
				}
				@Pc(228) int local228;
				@Pc(235) int local235;
				@Pc(283) int local283;
				if (local196 <= 0) {
					local228 = this.current.buffer.data.length - this.current.trailerLen;
					local235 = 512 - this.current.blockPosition;
					if (local235 > local228 - this.current.buffer.offset) {
						local235 = local228 - this.current.buffer.offset;
					}
					if (local235 > local19) {
						local235 = local19;
					}
					this.socket.read(this.current.buffer.offset, local235, this.current.buffer.data);
					if (this.encryptionKey != 0) {
						for (local283 = 0; local283 < local235; local283++) {
							this.current.buffer.data[this.current.buffer.offset + local283] = (byte) (this.current.buffer.data[this.current.buffer.offset + local283] ^ this.encryptionKey);
						}
					}
					this.current.blockPosition += local235;
					this.current.buffer.offset += local235;
					if (this.current.buffer.offset == local228) {
						this.current.unlinkSecondary();
						this.current.incomplete = false;
						this.current = null;
					} else if (this.current.blockPosition == 512) {
						this.current.blockPosition = 0;
					}
				} else {
					local228 = local196 - this.inBuffer.offset;
					if (local19 < local228) {
						local228 = local19;
					}
					this.socket.read(this.inBuffer.offset, local228, this.inBuffer.data);
					if (this.encryptionKey != 0) {
						for (local235 = 0; local235 < local228; local235++) {
							this.inBuffer.data[local235 + this.inBuffer.offset] ^= this.encryptionKey;
						}
					}
					this.inBuffer.offset += local228;
					if (this.inBuffer.offset >= local196) {
						if (this.current == null) {
							this.inBuffer.offset = 0;
							local235 = this.inBuffer.g1();
							local283 = this.inBuffer.g2();
							@Pc(471) int local471 = this.inBuffer.g1();
							@Pc(476) int local476 = this.inBuffer.g4();
							@Pc(480) int local480 = local471 & 0x7F;
							@Pc(491) boolean local491 = (local471 & 0x80) != 0;
							@Pc(501) long local501 = (local235 << 16) + local283;
							@Pc(509) Js5NetRequest local509;
							if (local491) {
								for (local509 = (Js5NetRequest) this.inFlightPrefetchRequests.head(); local509 != null && local509.secondaryKey != local501; local509 = (Js5NetRequest) this.inFlightPrefetchRequests.next()) {
								}
							} else {
								for (local509 = (Js5NetRequest) this.inFlightUrgentRequests.head(); local509 != null && local501 != local509.secondaryKey; local509 = (Js5NetRequest) this.inFlightUrgentRequests.next()) {
								}
							}
							if (local509 == null) {
								throw new IOException();
							}
							@Pc(568) int local568 = local480 == 0 ? 5 : 9;
							this.current = local509;
							this.current.buffer = new Buffer(local476 + local568 + this.current.trailerLen);
							this.current.buffer.p1(local480);
							this.current.buffer.p4(local476);
							this.current.blockPosition = 8;
							this.inBuffer.offset = 0;
						} else if (this.current.blockPosition != 0) {
							throw new IOException();
						} else if (this.inBuffer.data[0] == -1) {
							this.current.blockPosition = 1;
							this.inBuffer.offset = 0;
						} else {
							this.current = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(644) IOException local644) {
			try {
				this.socket.close();
			} catch (@Pc(650) Exception ignored) {
			}
			this.response = -2;
			this.errors++;
			this.socket = null;
			return this.getUrgentRequestCount() == 0 && this.getPrefetchRequestCount() == 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public final void drop() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(7);
			this.outBuffer.p3(0);
			this.socket.write(this.outBuffer.data, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.socket.close();
			} catch (@Pc(45) Exception local45) {
			}
			this.errors++;
			this.response = -2;
			this.socket = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	private int getPrefetchRequestCount() {
		return this.pendingPrefetchRequests.size() + this.inFlightPrefetchRequests.size();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V")
	public final void writeLoggedIn(@OriginalArg(0) boolean arg0) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(arg0 ? 2 : 3);
			this.outBuffer.p3(0);
			this.socket.write(this.outBuffer.data, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.socket.close();
			} catch (@Pc(48) Exception local48) {
			}
			this.errors++;
			this.response = -2;
			this.socket = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public final void breakConnection() {
		if (this.socket != null) {
			this.socket.breakConnection();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!ma;I)V")
	public final void start(@OriginalArg(0) boolean arg0, @OriginalArg(1) BufferedSocket arg1) {
		if (this.socket != null) {
			try {
				this.socket.close();
			} catch (@Pc(14) Exception local14) {
			}
			this.socket = null;
		}
		this.socket = arg1;
		this.method2331();
		this.writeLoggedIn(arg0);
		this.inBuffer.offset = 0;
		this.current = null;
		while (true) {
			@Pc(44) Js5NetRequest local44 = (Js5NetRequest) this.inFlightUrgentRequests.removeHead();
			if (local44 == null) {
				while (true) {
					local44 = (Js5NetRequest) this.inFlightPrefetchRequests.removeHead();
					if (local44 == null) {
						if (this.encryptionKey != 0) {
							try {
								this.outBuffer.offset = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.encryptionKey);
								this.outBuffer.p2(0);
								this.socket.write(this.outBuffer.data, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.socket.close();
								} catch (@Pc(113) Exception local113) {
								}
								this.response = -2;
								this.errors++;
								this.socket = null;
							}
						}
						this.latency = 0;
						this.previousLoop = MonotonicClock.currentTimeMillis();
						return;
					}
					this.pendingPrefetchRequests.addTail(local44);
				}
			}
			this.pendingUrgentRequests.addTail(local44);
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Z")
	public final boolean isUrgentRequestQueueFull() {
		return this.getUrgentRequestCount() >= 20;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	public final void rekey() {
		try {
			this.socket.close();
		} catch (@Pc(17) Exception local17) {
		}
		this.response = -1;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
		this.socket = null;
		this.errors++;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I")
	public final int getUrgentRequestCount() {
		return this.pendingUrgentRequests.size() + this.inFlightUrgentRequests.size();
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public final void quit() {
		if (this.socket != null) {
			this.socket.close();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBIZ)Lclient!pm;")
	public final Js5NetRequest read(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Js5NetRequest local7 = new Js5NetRequest();
		@Pc(14) long local14 = arg2 + ((long) arg0 << 16);
		local7.urgent = arg3;
		local7.secondaryKey = local14;
		local7.trailerLen = arg1;
		if (arg3) {
			if (this.getUrgentRequestCount() >= 20) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local7);
		} else if (this.getPrefetchRequestCount() < 20) {
			this.pendingPrefetchRequests.addTail(local7);
		} else {
			throw new RuntimeException();
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	private void method2331() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.offset = 0;
			this.outBuffer.p1(6);
			this.outBuffer.p3(3);
			this.socket.write(this.outBuffer.data, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.socket.close();
			} catch (@Pc(43) Exception ignored) {
			}
			this.errors++;
			this.socket = null;
			this.response = -2;
		}
	}
}
