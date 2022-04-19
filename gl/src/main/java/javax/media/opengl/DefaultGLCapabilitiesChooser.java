package javax.media.opengl;

public class DefaultGLCapabilitiesChooser implements GLCapabilitiesChooser {

	public int chooseCapabilities(GLCapabilities arg0, GLCapabilities[] arg1, int arg2) {
		if (arg2 >= 0 && arg2 < arg1.length && arg1[arg2] != null) {
			return arg2;
		}
		int[] var4 = new int[arg1.length];
		int var5 = -9999999;
		short var6 = 1000;
		short var7 = 500;
		byte var8 = 36;
		byte var9 = 6;
		byte var10 = 1;
		byte var11 = 3;
		int var12;
		for (var12 = 0; var12 < var4.length; var12++) {
			var4[var12] = var5;
		}
		int var20;
		for (var12 = 0; var12 < var4.length; var12++) {
			GLCapabilities var13 = arg1[var12];
			if (var13 != null && arg0.getStereo() == var13.getStereo()) {
				byte var14 = 0;
				var20 = var14 + var8 * (var13.getRedBits() + var13.getGreenBits() + var13.getBlueBits() + var13.getAlphaBits() - arg0.getRedBits() - arg0.getGreenBits() - arg0.getBlueBits() - arg0.getAlphaBits());
				int var21 = var20 + var9 * sign(var20) * Math.abs(var13.getDepthBits() - arg0.getDepthBits());
				int var22 = var21 + var10 * sign(var21) * Math.abs(var13.getAccumRedBits() + var13.getAccumGreenBits() + var13.getAccumBlueBits() + var13.getAccumAlphaBits() - arg0.getAccumRedBits() - arg0.getAccumGreenBits() - arg0.getAccumBlueBits() - arg0.getAccumAlphaBits());
				var20 = var22 + var11 * sign(var22) * (var13.getStencilBits() - arg0.getStencilBits());
				if (var13.getDoubleBuffered() != arg0.getDoubleBuffered()) {
					var20 += sign(var20) * var6;
				}
				if (arg0.getStencilBits() > 0 && var13.getStencilBits() == 0) {
					var20 += sign(var20) * var7;
				}
				var4[var12] = var20;
			}
		}
		boolean var18 = false;
		int var19 = 0;
		int var15;
		GLCapabilities var16;
		int var17;
		for (var20 = 0; var20 < var4.length; var20++) {
			var15 = var4[var20];
			if (var15 != var5) {
				var16 = arg1[var20];
				if (var16.getHardwareAccelerated()) {
					var17 = Math.abs(var15);
					if (!var18 || var17 > var19) {
						var18 = true;
						var19 = var17;
					}
				}
			}
		}
		if (var18) {
			for (var20 = 0; var20 < var4.length; var20++) {
				var15 = var4[var20];
				if (var15 != var5) {
					var16 = arg1[var20];
					if (!var16.getHardwareAccelerated()) {
						if (var15 <= 0) {
							var15 -= var19;
						} else if (var15 > 0) {
							var15 += var19;
						}
						var4[var20] = var15;
					}
				}
			}
		}
		var20 = var5;
		var15 = -1;
		for (int var23 = 0; var23 < var4.length; var23++) {
			var17 = var4[var23];
			if (var17 != var5 && (var20 == var5 || Math.abs(var17) < Math.abs(var20) && (sign(var20) < 0 || sign(var17) > 0))) {
				var20 = var17;
				var15 = var23;
			}
		}
		if (var15 < 0) {
			throw new GLException("Unable to select one of the provided GLCapabilities");
		}
		return var15;
	}

	private static int sign(int arg0) {
		return arg0 < 0 ? -1 : 1;
	}
}
