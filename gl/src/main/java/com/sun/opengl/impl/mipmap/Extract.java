package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;

public interface Extract {

	void extract(boolean arg0, ByteBuffer arg1, float[] arg2);

	void shove(float[] arg0, int arg1, ByteBuffer arg2);
}
