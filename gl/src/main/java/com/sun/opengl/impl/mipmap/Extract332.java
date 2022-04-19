package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public class Extract332 implements Extract {

	public void extract(boolean arg0, ByteBuffer arg1, float[] arg2) {
		byte var4 = arg1.get();
		arg2[0] = (float) (var4 >> 5 & 0x7) / 7.0F;
		arg2[1] = (float) (var4 >> 2 & 0x7) / 7.0F;
		arg2[2] = (float) (var4 & 0x3) / 3.0F;
	}

	public void shove(float[] arg0, int arg1, ByteBuffer arg2) {
		assert arg0[0] >= 0.0F && arg0[0] <= 1.0F;
		assert arg0[1] >= 0.0F && arg0[1] <= 1.0F;
		assert arg0[2] >= 0.0F && arg0[2] <= 1.0F;
		byte var4 = (byte) (((int) (arg0[0] * 7.0F + 0.5F) & 0x7) << 5);
		byte var5 = (byte) (var4 | (byte) (((int) (arg0[1] * 7.0F + 0.5F) & 0x7) << 2));
		byte var6 = (byte) (var5 | (byte) ((int) (arg0[2] * 3.0F + 0.5F) & 0x3));
		arg2.put(arg1, var6);
	}
}
