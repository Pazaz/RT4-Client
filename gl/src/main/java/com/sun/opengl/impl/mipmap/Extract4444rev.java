package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public class Extract4444rev implements Extract {

	public void extract(boolean arg0, ByteBuffer arg1, float[] arg2) {
		boolean var4 = false;
		int var5;
		if (arg0) {
			var5 = Mipmap.GLU_SWAP_2_BYTES(arg1.getShort()) & 0xFFFF;
		} else {
			var5 = arg1.getShort() & 0xFFFF;
		}
		arg2[0] = (float) (var5 & 0xF) / 15.0F;
		arg2[1] = (float) (var5 >> 4 & 0xF) / 15.0F;
		arg2[2] = (float) (var5 >> 8 & 0xF) / 15.0F;
		arg2[3] = (float) (var5 >> 12 & 0xF) / 15.0F;
	}

	public void shove(float[] arg0, int arg1, ByteBuffer arg2) {
		assert arg0[0] >= 0.0F && arg0[0] <= 1.0F;
		assert arg0[1] >= 0.0F && arg0[1] <= 1.0F;
		assert arg0[2] >= 0.0F && arg0[2] <= 1.0F;
		assert arg0[3] >= 0.0F && arg0[3] <= 1.0F;
		int var4 = (int) (arg0[0] * 15.0F + 0.5F) & 0xF;
		int var5 = var4 | ((int) (arg0[1] * 15.0F + 0.5F) & 0xF) << 4;
		int var6 = var5 | ((int) (arg0[2] * 15.0F + 0.5F) & 0xF) << 8;
		int var7 = var6 | ((int) (arg0[3] * 15.0F + 0.5F) & 0xF) << 12;
		arg2.asShortBuffer().put(arg1, (short) var7);
	}
}
