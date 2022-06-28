package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Js5GlTextureProvider implements TextureProvider {

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "Z")
	private boolean lowDetail = false;

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
	private int capacity = 50;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!ve;")
	private final Js5 aClass153_72;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!ve;")
	private final Js5 aClass153_73;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "Lclient!gn;")
	private LruHashTable glTextures;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "Lclient!gn;")
	private LruHashTable solidColorSprites;

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[B")
	private final byte[] aByteArray60;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "[S")
	private final short[] aShortArray59;

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray91;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray89;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "[Z")
	private final boolean[] aBooleanArray90;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "[Z")
	private final boolean[] aBooleanArray92;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "[Z")
	private final boolean[] aBooleanArray93;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;Lclient!ve;IZ)V")
	public Js5GlTextureProvider(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass153_72 = arg2;
		this.lowDetail = arg4;
		this.capacity = arg3;
		this.aClass153_73 = arg0;
		this.glTextures = new LruHashTable(this.capacity);
		if (GlRenderer.enabled) {
			this.solidColorSprites = new LruHashTable(this.capacity);
		} else {
			this.solidColorSprites = null;
		}

		@Pc(51) Buffer local51 = new Buffer(arg1.fetchFile(0, 0));
		@Pc(55) int local55 = local51.g2();
		this.aByteArray61 = new byte[local55];
		this.aByteArray60 = new byte[local55];
		this.aByteArray59 = new byte[local55];
		this.aShortArray59 = new short[local55];
		this.aByteArray62 = new byte[local55];
		this.aBooleanArray91 = new boolean[local55];
		this.aBooleanArray89 = new boolean[local55];
		this.aBooleanArray90 = new boolean[local55];
		this.aBooleanArray92 = new boolean[local55];
		this.aBooleanArray93 = new boolean[local55];
		@Pc(97) int local97;
		for (local97 = 0; local97 < local55; local97++) {
			this.aBooleanArray92[local97] = local51.g1() == 1;
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aBooleanArray90[local97] = local51.g1() == 1;
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aBooleanArray91[local97] = local51.g1() == 1;
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aBooleanArray89[local97] = local51.g1() == 1;
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aBooleanArray93[local97] = local51.g1() == 1;
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aByteArray59[local97] = local51.g1b();
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aByteArray60[local97] = local51.g1b();
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aByteArray62[local97] = local51.g1b();
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aByteArray61[local97] = local51.g1b();
			}
		}
		for (local97 = 0; local97 < local55; local97++) {
			if (this.aBooleanArray92[local97]) {
				this.aShortArray59[local97] = (short) local51.g2();
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V")
	public final void method3239(@OriginalArg(1) int arg0) {
		for (@Pc(19) GlTexture local19 = (GlTexture) this.glTextures.method1808(); local19 != null; local19 = (GlTexture) this.glTextures.next()) {
			if (local19.aBoolean287) {
				local19.method4300(arg0);
				local19.aBoolean287 = false;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)[I")
	@Override
	public final int[] getPixels(@OriginalArg(1) int arg0) {
		@Pc(16) GlTexture local16 = this.method3242(arg0);
		return local16 == null ? null : local16.method4297(this.lowDetail || this.aBooleanArray89[arg0], this, this.aClass153_72);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method3227(@OriginalArg(0) int arg0) {
		MaterialManager.setMaterial(this.aByteArray61[arg0] & 0xFF, this.aByteArray62[arg0] & 0xFF);
		@Pc(23) boolean local23 = false;
		@Pc(28) GlTexture local28 = this.method3242(arg0);
		if (local28 != null) {
			local23 = local28.method4296(this.aClass153_72, this, this.lowDetail || this.aBooleanArray89[arg0]);
		}
		if (!local23) {
			@Pc(56) GlSolidColorTexture local56 = this.method3244(arg0);
			local56.method3887();
		}
	}

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "(II)Lclient!uh;")
	private GlTexture method3242(@OriginalArg(0) int arg0) {
		@Pc(14) GlTexture local14 = (GlTexture) this.glTextures.get(arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = this.aClass153_73.fetchFile(arg0, 0);
		if (local30 == null) {
			return null;
		} else {
			@Pc(41) Buffer local41 = new Buffer(local30);
			local14 = new GlTexture(local41);
			this.glTextures.put(local14, arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)I")
	@Override
	public final int method3228(@OriginalArg(0) int arg0) {
		return this.aByteArray61[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "(II)I")
	@Override
	public final int getMaterialType(@OriginalArg(0) int arg0) {
		return this.aByteArray62[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
	@Override
	public final int method3229(@OriginalArg(1) int arg0) {
		return this.aByteArray59[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)Z")
	@Override
	public final boolean isOpaque(@OriginalArg(1) int arg0) {
		return this.aBooleanArray91[arg0];
	}

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "(II)Lclient!sd;")
	private GlSolidColorTexture method3244(@OriginalArg(1) int arg0) {
		@Pc(19) GlSolidColorTexture local19 = (GlSolidColorTexture) this.solidColorSprites.get(arg0);
		if (local19 == null) {
			local19 = new GlSolidColorTexture(this.aShortArray59[arg0] & 0xFFFF);
			this.solidColorSprites.put(local19, arg0);
			return local19;
		} else {
			return local19;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Z")
	@Override
	public final boolean method3230(@OriginalArg(1) int arg0) {
		@Pc(15) GlTexture local15 = this.method3242(arg0);
		return local15 != null && local15.method4299(this, this.aClass153_72);
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(ZI)V")
	public final void method3245(@OriginalArg(0) boolean arg0) {
		this.lowDetail = arg0;
		this.clear();
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Z")
	@Override
	public final boolean method3231(@OriginalArg(0) int arg0) {
		return this.aBooleanArray93[arg0];
	}

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "(II)I")
	@Override
	public final int method3238(@OriginalArg(1) int arg0) {
		return this.aByteArray60[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public final void clear() {
		this.glTextures.clear();
		if (this.solidColorSprites != null) {
			this.solidColorSprites.clear();
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)I")
	@Override
	public final int getAverageColor(@OriginalArg(0) int arg0) {
		return this.aShortArray59[arg0] & 0xFFFF;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(BI)Z")
	@Override
	public final boolean isLowDetail(@OriginalArg(1) int arg0) {
		return this.lowDetail || this.aBooleanArray89[arg0];
	}

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "(II)V")
	public final void method3248(@OriginalArg(0) int arg0) {
		this.capacity = arg0;
		this.glTextures = new LruHashTable(this.capacity);
		if (GlRenderer.enabled) {
			this.solidColorSprites = new LruHashTable(this.capacity);
		} else {
			this.solidColorSprites = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(II)Z")
	@Override
	public final boolean method3236(@OriginalArg(0) int arg0) {
		return this.aBooleanArray90[arg0];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZF)[I")
	@Override
	public final int[] method3232(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(8) GlTexture local8 = this.method3242(arg0);
		if (local8 == null) {
			return null;
		} else {
			local8.aBoolean287 = true;
			return local8.method4295(this, arg1, this.aClass153_72, this.lowDetail || this.aBooleanArray89[arg0]);
		}
	}
}
