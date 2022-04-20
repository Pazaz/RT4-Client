import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class UnlitMaterialRenderer implements MaterialRenderer {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
	@Override
	public final void method4603() {
		if (Static178.highDetailLighting) {
			GlRenderer.setLightingEnabled(false);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()I")
	@Override
	public final int method4605() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	@Override
	public final void method4604(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	@Override
	public final void method4602() {
		if (Static178.highDetailLighting) {
			GlRenderer.setLightingEnabled(true);
		}
	}
}
