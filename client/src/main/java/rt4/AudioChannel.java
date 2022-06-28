package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;

@OriginalClass("client!vh")
public class AudioChannel {

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
	public static boolean stereo;
	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	public static int threadPriority;
	@OriginalMember(owner = "client!em", name = "x", descriptor = "Lclient!cj;")
	public static AudioThread thread;
	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int sampleRate;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!qb;")
	private PcmStream stream;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
	public int[] samples;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
	public int sampleRate2;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	public int bufferCapacity;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	private final int anInt4621 = 32;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "J")
	private long time = MonotonicClock.currentTimeMillis();

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lclient!qb;")
	private final PcmStream[] aClass3_Sub3Array5 = new PcmStream[8];

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
	private int consumedSamples = 0;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "J")
	private long calculateConsumptionAt = 0L;

	@OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
	private int anInt4638 = 0;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "Z")
	private boolean skipConsumptionCheck = true;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "[Lclient!qb;")
	private final PcmStream[] aClass3_Sub3Array6 = new PcmStream[8];

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "J")
	private long closeUntil = 0L;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
	private int prevConsumedSamples = 0;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	private int prevBufferSize = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIZ)V")
	public static void init(@OriginalArg(3) boolean stereo) {
		threadPriority = 2;
		AudioChannel.stereo = stereo;
		sampleRate = 22050;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILsignlink!ll;Ljava/awt/Component;II)Lclient!vh;")
	public static AudioChannel create(@OriginalArg(0) int arg0, @OriginalArg(1) SignLink arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (sampleRate == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) AudioChannel audioChannel = new JavaAudioChannel();
			audioChannel.sampleRate2 = arg0;
			audioChannel.samples = new int[(stereo ? 2 : 1) * 256];
			audioChannel.init(arg2);
			audioChannel.bufferCapacity = (arg0 & -1024) + 1024;
			if (audioChannel.bufferCapacity > 16384) {
				audioChannel.bufferCapacity = 16384;
			}
			audioChannel.open(audioChannel.bufferCapacity);
			if (threadPriority > 0 && thread == null) {
				thread = new AudioThread();
				thread.signLink = arg1;
				arg1.startThread(threadPriority, thread);
			}
			if (thread != null) {
				if (thread.channels[arg3] != null) {
					throw new IllegalArgumentException();
				}
				thread.channels[arg3] = audioChannel;
			}
			return audioChannel;
		} catch (@Pc(109) Throwable ex1) {
			ex1.printStackTrace();
			try {
				@Pc(120) SignLinkAudioChannel local120 = new SignLinkAudioChannel(arg1, arg3);
				local120.samples = new int[(stereo ? 2 : 1) * 256];
				local120.sampleRate2 = arg0;
				local120.init(arg2);
				local120.bufferCapacity = 16384;
				local120.open(local120.bufferCapacity);
				if (threadPriority > 0 && thread == null) {
					thread = new AudioThread();
					thread.signLink = arg1;
					arg1.startThread(threadPriority, thread);
				}
				if (thread != null) {
					if (thread.channels[arg3] != null) {
						throw new IllegalArgumentException();
					}
					thread.channels[arg3] = local120;
				}
				return local120;
			} catch (@Pc(186) Throwable ex2) {
				ex2.printStackTrace();
				return new AudioChannel();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!qb;)V")
	public static void setInactive(@OriginalArg(1) PcmStream arg0) {
		if (arg0.sound != null) {
			arg0.sound.position = 0;
		}
		arg0.active = false;
		for (@Pc(14) PcmStream local14 = arg0.firstSubStream(); local14 != null; local14 = arg0.nextSubStream()) {
			setInactive(local14);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	protected void write() throws Exception {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public void open(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()V")
	protected void close() throws Exception {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([II)V")
	private void read(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (stereo) {
			local1 = 512;
		}
		ArrayUtils.clear(arg0, 0, local1);
		this.anInt4638 -= 256;
		if (this.stream != null && this.anInt4638 <= 0) {
			this.anInt4638 += sampleRate >> 4;
			setInactive(this.stream);
			this.method3567(this.stream, this.stream.method4407());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106:
			while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) PcmStream local91 = null;
						@Pc(96) PcmStream local96 = this.aClass3_Sub3Array5[local57];
						label100:
						while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Sound local101 = local96.sound;
								if (local101 == null || local101.position <= local62) {
									local96.active = true;
									@Pc(125) int local125 = local96.method4404();
									local45 += local125;
									if (local101 != null) {
										local101.position += local125;
									}
									if (local45 >= this.anInt4621) {
										break label106;
									}
									@Pc(145) PcmStream local145 = local96.firstSubStream();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5626;
										while (local145 != null) {
											this.method3567(local145, local150 * local145.method4407() >> 8);
											local145 = local96.nextSubStream();
										}
									}
									@Pc(169) PcmStream local169 = local96.aClass3_Sub3_8;
									local96.aClass3_Sub3_8 = null;
									if (local91 == null) {
										this.aClass3_Sub3Array5[local57] = local169;
									} else {
										local91.aClass3_Sub3_8 = local169;
									}
									if (local169 == null) {
										this.aClass3_Sub3Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass3_Sub3_8;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) PcmStream local212 = this.aClass3_Sub3Array5[local49];
				this.aClass3_Sub3Array5[local49] = this.aClass3_Sub3Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) PcmStream local227 = local212.aClass3_Sub3_8;
					local212.aClass3_Sub3_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt4638 < 0) {
			this.anInt4638 = 0;
		}
		if (this.stream != null) {
			this.stream.read(arg0, 0, 256);
		}
		this.time = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public final synchronized void loop() {
		if (this.samples == null) {
			return;
		}
		@Pc(14) long now = MonotonicClock.currentTimeMillis();
		try {
			if (this.closeUntil != 0L) {
				if (now < this.closeUntil) {
					return;
				}
				this.open(this.bufferCapacity);
				this.skipConsumptionCheck = true;
				this.closeUntil = 0L;
			}
			@Pc(38) int local38 = this.getBufferSize();
			if (this.consumedSamples < this.prevBufferSize - local38) {
				this.consumedSamples = this.prevBufferSize - local38;
			}
			@Pc(65) int local65 = this.sampleRate2 + this.anInt4637;
			if (local65 + 256 > 16384) {
				local65 = 16128;
			}
			if (this.bufferCapacity < local65 + 256) {
				this.bufferCapacity += 1024;
				if (this.bufferCapacity > 16384) {
					this.bufferCapacity = 16384;
				}
				this.flush();
				local38 = 0;
				this.open(this.bufferCapacity);
				if (this.bufferCapacity < local65 + 256) {
					local65 = this.bufferCapacity - 256;
					this.anInt4637 = local65 - this.sampleRate2;
				}
				this.skipConsumptionCheck = true;
			}
			while (local65 > local38) {
				local38 += 256;
				this.read(this.samples);
				this.write();
			}
			if (now > this.calculateConsumptionAt) {
				if (this.skipConsumptionCheck) {
					this.skipConsumptionCheck = false;
				} else if (this.consumedSamples == 0 && this.prevConsumedSamples == 0) {
					this.flush();
					this.closeUntil = now + 2000L;
					return;
				} else {
					this.anInt4637 = Math.min(this.prevConsumedSamples, this.consumedSamples);
					this.prevConsumedSamples = this.consumedSamples;
				}
				this.calculateConsumptionAt = now + 2000L;
				this.consumedSamples = 0;
			}
			this.prevBufferSize = local38;
		} catch (@Pc(202) Exception ex) {
			ex.printStackTrace();
			this.flush();
			this.closeUntil = now + 2000L;
		}
		try {
			if (now > this.time + 500000L) {
				now = this.time;
			}
			while (now > this.time + 5000L) {
				this.skip();
				this.time += 256000 / sampleRate;
			}
		} catch (@Pc(247) Exception ex) {
			ex.printStackTrace();
			this.time = now;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!qb;)V")
	public final synchronized void setStream(@OriginalArg(1) PcmStream arg0) {
		this.stream = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!qb;IB)V")
	private void method3567(@OriginalArg(0) PcmStream arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 >> 5;
		@Pc(21) PcmStream local21 = this.aClass3_Sub3Array6[local16];
		if (local21 == null) {
			this.aClass3_Sub3Array5[local16] = arg0;
		} else {
			local21.aClass3_Sub3_8 = arg0;
		}
		this.aClass3_Sub3Array6[local16] = arg0;
		arg0.anInt5626 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "()I")
	protected int getBufferSize() throws Exception {
		return this.bufferCapacity;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	public final synchronized void method3570() {
		this.skipConsumptionCheck = true;
		try {
			this.close();
		} catch (@Pc(10) Exception ex) {
			ex.printStackTrace();
			this.flush();
			this.closeUntil = MonotonicClock.currentTimeMillis() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public final void method3571() {
		this.skipConsumptionCheck = true;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "()V")
	protected void flush() {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	private void skip() {
		this.anInt4638 -= 256;
		if (this.anInt4638 < 0) {
			this.anInt4638 = 0;
		}
		if (this.stream != null) {
			this.stream.skip(256);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public final synchronized void quit() {
		if (thread != null) {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				if (thread.channels[local8] == this) {
					thread.channels[local8] = null;
				}
				if (thread.channels[local8] != null) {
					local6 = false;
				}
			}
			if (local6) {
				thread.stop = true;
				while (thread.running) {
					ThreadUtils.sleep(50L);
				}
				thread = null;
			}
		}
		this.flush();
		this.samples = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void init(@OriginalArg(0) Component arg0) throws Exception {
	}
}
