package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public class Extract233rev implements Extract {

	public void extract(boolean arg0, ByteBuffer arg1, float[] arg2) {
		byte var4 = arg1.get();
		arg2[0] = (float) (var4 & 0x7) / 7.0F;
		arg2[1] = (float) (var4 >> 3 & 0x7) / 7.0F;
		arg2[2] = (float) (var4 >> 6 & 0x3) / 3.0F;
	}

	public void shove(float[] arg0, int arg1, ByteBuffer arg2) {
		assert arg0[0] >= 0.0F && arg0[0] <= 1.0F;
		assert arg0[1] >= 0.0F && arg0[1] <= 1.0F;
		assert arg0[2] >= 0.0F && arg0[2] <= 1.0F;
		byte var4 = (byte) ((int) (arg0[0] * 7.0F + 0.5F) & 0x7);
		byte var5 = (byte) (var4 | (byte) (((int) (arg0[1] * 7.0F + 0.5F) & 0x7) << 3));
		byte var6 = (byte) (var5 | (byte) (((int) (arg0[2] * 3.0F + 0.5F) & 0x3) << 6));
		arg2.position(arg1);
		arg2.put(var6);
	}
}
