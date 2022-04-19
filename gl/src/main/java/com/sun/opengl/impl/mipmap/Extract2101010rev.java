package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public class Extract2101010rev implements Extract {

	public void extract(boolean arg0, ByteBuffer arg1, float[] arg2) {
		long var4 = 0L;
		if (arg0) {
			var4 = Mipmap.GLU_SWAP_4_BYTES(arg1.getInt()) & 0xFFFFFFFF;
		} else {
			var4 = arg1.getInt() & 0xFFFFFFFF;
		}
		arg2[0] = (float) (var4 & 0x3FFL) / 1023.0F;
		arg2[1] = (float) (var4 >> 10 & 0x3FFL) / 1023.0F;
		arg2[2] = (float) (var4 >> 20 & 0x3FFL) / 1023.0F;
		arg2[3] = (float) (var4 >> 30 & 0xFFFFFFFFFFFFFFFFL) / 3.0F;
	}

	public void shove(float[] arg0, int arg1, ByteBuffer arg2) {
		assert arg0[0] >= 0.0F && arg0[0] <= 1.0F;
		assert arg0[1] >= 0.0F && arg0[1] <= 1.0F;
		assert arg0[2] >= 0.0F && arg0[2] <= 1.0F;
		assert arg0[3] >= 0.0F && arg0[3] <= 1.0F;
		long var4 = (long) ((int) (arg0[0] * 1023.0F + 0.5F) & 0x3FF);
		long var6 = var4 | (long) (((int) (arg0[1] * 1023.0F + 0.5F) & 0x3FF) << 10);
		long var7 = var6 | (long) (((int) (arg0[2] * 1023.0F + 0.5F) & 0x3FF) << 20);
		long var8 = var7 | (long) (((int) (arg0[3] * 3.0F + 0.5F) & 0x3) << 30);
		arg2.asIntBuffer().put(arg1, (int) var8);
	}
}
