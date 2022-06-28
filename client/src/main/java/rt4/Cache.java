package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.IOException;

@OriginalClass("client!ge")
public final class Cache {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[B")
	public static final byte[] buffer = new byte[520];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!en;")
	private BufferedFile data = null;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!en;")
	private BufferedFile index = null;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	private int maxLen = 65000;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	private final int archive;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILclient!en;Lclient!en;I)V")
	public Cache(@OriginalArg(0) int arg0, @OriginalArg(1) BufferedFile arg1, @OriginalArg(2) BufferedFile arg2, @OriginalArg(3) int arg3) {
		this.maxLen = arg3;
		this.index = arg2;
		this.archive = arg0;
		this.data = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		return "Cache:" + this.archive;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BB)Z")
	public final boolean write(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) BufferedFile local7 = this.data;
		synchronized (this.data) {
			if (arg1 < 0 || arg1 > this.maxLen) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.write(arg1, arg0, arg2, true);
			if (!local35) {
				local35 = this.write(arg1, arg0, arg2, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[B")
	public final byte[] read(@OriginalArg(0) int group) {
		@Pc(9) BufferedFile local9 = this.data;
		synchronized (this.data) {
			try {
				@Pc(27) Object local27;
				if (this.index.length() < (long) (group * 6 + 6)) {
					local27 = null;
					return (byte[]) local27;
				}
				this.index.seek(group * 6);
				this.index.read(0, buffer, 6);
				@Pc(69) int local69 = ((buffer[3] & 0xFF) << 16) - (-((buffer[4] & 0xFF) << 8) - (buffer[5] & 0xFF));
				@Pc(99) int local99 = (buffer[2] & 0xFF) + ((buffer[1] & 0xFF) << 8) + ((buffer[0] & 0xFF) << 16);
				if (local99 < 0 || this.maxLen < local99) {
					local27 = null;
					return (byte[]) local27;
				} else if (local69 <= 0 || (long) local69 > this.data.length() / 520L) {
					local27 = null;
					return (byte[]) local27;
				} else {
					@Pc(134) byte[] local134 = new byte[local99];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local136 < local99) {
						if (local69 == 0) {
							local27 = null;
							return (byte[]) local27;
						}
						@Pc(157) int local157 = local99 - local136;
						this.data.seek(local69 * 520);
						if (local157 > 512) {
							local157 = 512;
						}
						this.data.read(0, buffer, local157 + 8);
						@Pc(197) int local197 = ((buffer[0] & 0xFF) << 8) + (buffer[1] & 0xFF);
						@Pc(211) int local211 = (buffer[3] & 0xFF) + ((buffer[2] & 0xFF) << 8);
						@Pc(217) int local217 = buffer[7] & 0xFF;
						@Pc(239) int local239 = (buffer[6] & 0xFF) + ((buffer[5] & 0xFF) << 8) + ((buffer[4] & 0xFF) << 16);
						if (group != local197 || local138 != local211 || this.archive != local217) {
							local27 = null;
							return (byte[]) local27;
						}
						if (local239 < 0 || (long) local239 > this.data.length() / 520L) {
							local27 = null;
							return (byte[]) local27;
						}
						for (@Pc(272) int local272 = 0; local272 < local157; local272++) {
							local134[local136++] = buffer[local272 + 8];
						}
						local138++;
						local69 = local239;
					}
					@Pc(297) byte[] local297 = local134;
					return local297;
				}
			} catch (@Pc(301) IOException ex) {
				ex.printStackTrace();
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII[BZ)Z")
	private boolean write(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) BufferedFile local9 = this.data;
		synchronized (this.data) {
			try {
				@Pc(67) int local67;
				@Pc(27) boolean local27;
				if (arg3) {
					if (this.index.length() < (long) (arg1 * 6 + 6)) {
						local27 = false;
						return local27;
					}
					this.index.seek(arg1 * 6);
					this.index.read(0, buffer, 6);
					local67 = ((buffer[3] & 0xFF) << 16) + (buffer[4] << 8 & 0xFF00) + (buffer[5] & 0xFF);
					if (local67 <= 0 || this.data.length() / 520L < (long) local67) {
						local27 = false;
						return local27;
					}
				} else {
					local67 = (int) ((this.data.length() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				buffer[0] = (byte) (arg0 >> 16);
				buffer[4] = (byte) (local67 >> 8);
				@Pc(125) int local125 = 0;
				buffer[5] = (byte) local67;
				buffer[2] = (byte) arg0;
				buffer[3] = (byte) (local67 >> 16);
				@Pc(156) int local156 = 0;
				buffer[1] = (byte) (arg0 >> 8);
				this.index.seek(arg1 * 6);
				this.index.write(buffer, 0, 6);
				while (true) {
					if (local125 < arg0) {
						label134:
						{
							@Pc(189) int local189 = 0;
							@Pc(248) int local248;
							if (arg3) {
								this.data.seek(local67 * 520);
								try {
									this.data.read(0, buffer, 8);
								} catch (@Pc(209) EOFException local209) {
									break label134;
								}
								local189 = ((buffer[4] & 0xFF) << 16) + ((buffer[5] & 0xFF) << 8) + (buffer[6] & 0xFF);
								local248 = (buffer[1] & 0xFF) + ((buffer[0] & 0xFF) << 8);
								@Pc(254) int local254 = buffer[7] & 0xFF;
								@Pc(268) int local268 = (buffer[3] & 0xFF) + ((buffer[2] & 0xFF) << 8);
								if (local248 != arg1 || local156 != local268 || this.archive != local254) {
									local27 = false;
									return local27;
								}
								if (local189 < 0 || (long) local189 > this.data.length() / 520L) {
									local27 = false;
									return local27;
								}
							}
							local248 = arg0 - local125;
							if (local189 == 0) {
								arg3 = false;
								local189 = (int) ((this.data.length() + 519L) / 520L);
								if (local189 == 0) {
									local189++;
								}
								if (local189 == local67) {
									local189++;
								}
							}
							buffer[7] = (byte) this.archive;
							buffer[0] = (byte) (arg1 >> 8);
							if (arg0 - local125 <= 512) {
								local189 = 0;
							}
							buffer[4] = (byte) (local189 >> 16);
							if (local248 > 512) {
								local248 = 512;
							}
							buffer[1] = (byte) arg1;
							buffer[6] = (byte) local189;
							buffer[2] = (byte) (local156 >> 8);
							buffer[3] = (byte) local156;
							local156++;
							buffer[5] = (byte) (local189 >> 8);
							this.data.seek(local67 * 520);
							local67 = local189;
							this.data.write(buffer, 0, 8);
							this.data.write(arg2, local125, local248);
							local125 += local248;
							continue;
						}
					}
					local27 = true;
					return local27;
				}
			} catch (@Pc(453) IOException local453) {
				return false;
			}
		}
	}
}
