package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class HalveImage {

	public static void halveImage(int arg0, int arg1, int arg2, ShortBuffer arg3, ShortBuffer arg4) {
		int var11 = 0;
		boolean var12 = false;
		int var8 = arg1 / 2;
		int var9 = arg2 / 2;
		int var10 = arg1 * arg0;
		for (int var5 = 0; var5 < var9; var5++) {
			for (int var6 = 0; var6 < var8; var6++) {
				for (int var7 = 0; var7 < arg0; var7++) {
					arg3.position(var11);
					short var13 = arg3.get();
					arg3.position(var11 + arg0);
					short var14 = (short) (var13 + arg3.get());
					arg3.position(var11 + var10);
					short var15 = (short) (var14 + arg3.get());
					arg3.position(var11 + var10 + arg0);
					short var16 = (short) (var15 + arg3.get());
					short var17 = (short) (var16 + 2);
					short var18 = (short) (var17 / 4);
					arg4.put(var18);
					var11++;
				}
				var11 += arg0;
			}
			var11 += var10;
		}
	}

	public static void halveImage_ubyte(int arg0, int arg1, int arg2, ByteBuffer arg3, ByteBuffer arg4, int arg5, int arg6, int arg7) {
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_ubyte(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		int var11 = arg1 / 2;
		int var12 = arg2 / 2;
		boolean var13 = false;
		int var14 = 0;
		boolean var15 = false;
		for (int var8 = 0; var8 < var12; var8++) {
			for (int var9 = 0; var9 < var11; var9++) {
				for (int var10 = 0; var10 < arg0; var10++) {
					arg3.position(var14);
					int var16 = arg3.get() & 0xFF;
					arg3.position(var14 + arg7);
					int var17 = var16 + (arg3.get() & 0xFF);
					arg3.position(var14 + arg6);
					int var18 = var17 + (arg3.get() & 0xFF);
					arg3.position(var14 + arg6 + arg7);
					int var19 = var18 + (arg3.get() & 0xFF) + 2;
					arg4.put((byte) (var19 / 4));
					var14 += arg5;
				}
				var14 += arg7;
			}
			var14 += arg6;
		}
	}

	public static void halve1Dimage_ubyte(int arg0, int arg1, int arg2, ByteBuffer arg3, ByteBuffer arg4, int arg5, int arg6, int arg7) {
		int var8 = arg1 / 2;
		int var9 = arg2 / 2;
		int var10 = 0;
		int var11 = 0;
		boolean var13 = false;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var12;
		int var14;
		int var16;
		if (arg2 == 1) {
			assert arg1 != 1;
			var9 = 1;
			for (var12 = 0; var12 < var8; var12++) {
				for (var14 = 0; var14 < arg0; var14++) {
					arg3.position(var10);
					var16 = arg3.get() & 0xFF;
					arg3.position(var10 + arg7);
					int var17 = var16 + (arg3.get() & 0xFF);
					int var18 = var17 / 2;
					arg4.put((byte) var18);
					var10 += arg5;
					var11++;
				}
				var10 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			var10 += var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var8 = 1;
			for (var12 = 0; var12 < var9; var12++) {
				for (int var15 = 0; var15 < arg0; var15++) {
					arg3.position(var10);
					var16 = arg3.get() & 0xFF;
					arg3.position(var10 + arg6);
					var16 += arg3.get() & 0xFF;
					var16 /= 2;
					arg4.put((byte) var16);
					var10 += arg5;
					var11++;
				}
				var10 += var14;
				var10 += arg6;
			}
		}
		assert var10 == arg6 * arg2;
		assert var11 == arg0 * arg5 * var8 * var9;
	}

	public static void halveImage_byte(int arg0, int arg1, int arg2, ByteBuffer arg3, ByteBuffer arg4, int arg5, int arg6, int arg7) {
		boolean var13 = false;
		int var14 = 0;
		boolean var15 = false;
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_byte(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			return;
		}
		int var11 = arg1 / 2;
		int var12 = arg2 / 2;
		for (int var8 = 0; var8 < var12; var8++) {
			for (int var9 = 0; var9 < var11; var9++) {
				for (int var10 = 0; var10 < arg0; var10++) {
					arg3.position(var14);
					byte var16 = arg3.get();
					arg3.position(var14 + arg7);
					byte var17 = (byte) (var16 + arg3.get());
					arg3.position(var14 + arg6);
					byte var18 = (byte) (var17 + arg3.get());
					arg3.position(var14 + arg6 + arg7);
					byte var19 = (byte) (var18 + arg3.get());
					byte var20 = (byte) (var19 + 2);
					byte var21 = (byte) (var20 / 4);
					arg4.put(var21);
					var14 += arg5;
				}
				var14 += arg7;
			}
			var14 += arg6;
		}
	}

	public static void halve1Dimage_byte(int arg0, int arg1, int arg2, ByteBuffer arg3, ByteBuffer arg4, int arg5, int arg6, int arg7) {
		int var8 = arg1 / 2;
		int var9 = arg1 / 2;
		int var10 = 0;
		int var11 = 0;
		boolean var13 = false;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var12;
		int var14;
		byte var16;
		if (arg2 == 1) {
			assert arg1 != 1;
			var9 = 1;
			for (var12 = 0; var12 < var8; var12++) {
				for (var14 = 0; var14 < arg0; var14++) {
					arg3.position(var10);
					var16 = arg3.get();
					arg3.position(var10 + arg7);
					byte var17 = (byte) (var16 + arg3.get());
					byte var18 = (byte) (var17 / 2);
					arg4.put(var18);
					var10 += arg5;
					var11++;
				}
				var10 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			int var10000 = var10 + var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var8 = 1;
			for (var12 = 0; var12 < var9; var12++) {
				for (int var15 = 0; var15 < arg0; var15++) {
					arg3.position(var10);
					var16 = arg3.get();
					arg3.position(var10 + arg6);
					var16 += arg3.get();
					var16 = (byte) (var16 / 2);
					var10 += arg5;
					var11++;
				}
				var10 += var14;
				var10 += arg6;
			}
			assert var10 == arg6 * arg2;
		}
		assert var11 == arg0 * arg5 * var8 * var9;
	}

	public static void halveImage_ushort(int arg0, int arg1, int arg2, ByteBuffer arg3, ShortBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		boolean var15 = false;
		int var16 = 0;
		boolean var17 = false;
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_ushort(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			return;
		}
		int var13 = arg1 / 2;
		int var14 = arg2 / 2;
		int var9;
		int var10;
		int var11;
		int var18;
		if (!arg8) {
			for (var9 = 0; var9 < var14; var9++) {
				for (var10 = 0; var10 < var13; var10++) {
					for (var11 = 0; var11 < arg0; var11++) {
						arg3.position(var16);
						var18 = arg3.getShort() & 0xFFFF;
						arg3.position(var16 + arg7);
						int var19 = var18 + (arg3.getShort() & 0xFFFF);
						arg3.position(var16 + arg6);
						int var20 = var19 + (arg3.getShort() & 0xFFFF);
						arg3.position(var16 + arg6 + arg7);
						int var21 = var20 + (arg3.getShort() & 0xFFFF);
						arg4.put((short) ((var21 + 2) / 4));
						var16 += arg5;
					}
					var16 += arg7;
				}
				var16 += arg6;
			}
			return;
		}
		for (var9 = 0; var9 < var14; var9++) {
			for (var10 = 0; var10 < var13; var10++) {
				for (var11 = 0; var11 < arg0; var11++) {
					arg3.position(var16);
					var18 = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
					arg3.position(var16 + arg7);
					var18 += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
					arg3.position(var16 + arg6);
					var18 += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
					arg3.position(var16 + arg6 + arg7);
					var18 += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
					arg4.put((short) ((var18 + 2) / 4));
					var16 += arg5;
				}
				var16 += arg7;
			}
			var16 += arg6;
		}
	}

	public static void halve1Dimage_ushort(int arg0, int arg1, int arg2, ByteBuffer arg3, ShortBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9 = arg1 / 2;
		int var10 = arg2 / 2;
		int var11 = 0;
		int var12 = 0;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var13;
		int var14;
		if (arg2 == 1) {
			assert arg1 != 1;
			var10 = 1;
			for (var13 = 0; var13 < var9; var13++) {
				for (var14 = 0; var14 < var10; var14++) {
					int[] var15 = new int[2];
					if (arg8) {
						arg3.position(var11);
						var15[0] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
						arg3.position(var11 + arg7);
						var15[1] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
					} else {
						arg3.position(var11);
						var15[0] = arg3.getShort() & 0xFFFF;
						arg3.position(var11 + arg7);
						var15[1] = arg3.getShort() & 0xFFFF;
					}
					arg4.put((short) ((var15[0] + var15[1]) / 2));
					var11 += arg5;
					var12 += 2;
				}
				var11 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			int var10000 = var11 + var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var9 = 1;
			for (var13 = 0; var13 < var10; var13++) {
				for (int var17 = 0; var17 < arg0; var17++) {
					int[] var16 = new int[2];
					if (arg8) {
						arg3.position(var11);
						var16[0] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
						arg3.position(var11 + arg6);
						var16[0] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
					} else {
						arg3.position(var11);
						var16[0] = arg3.getShort() & 0xFFFF;
						arg3.position(var11 + arg6);
						var16[1] = arg3.getShort() & 0xFFFF;
					}
					arg4.put((short) ((var16[0] + var16[1]) / 2));
					var11 += arg5;
					var12 += 2;
				}
				var11 += var14;
				var11 += arg6;
			}
			assert var11 == arg6 * arg2;
		}
		assert var12 == arg0 * arg5 * var9 * var10;
	}

	public static void halveImage_short(int arg0, int arg1, int arg2, ByteBuffer arg3, ShortBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		boolean var15 = false;
		int var16 = 0;
		boolean var17 = false;
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_short(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			return;
		}
		int var13 = arg1 / 2;
		int var14 = arg2 / 2;
		int var9;
		int var10;
		int var11;
		short var20;
		if (!arg8) {
			for (var9 = 0; var9 < var14; var9++) {
				for (var10 = 0; var10 < var13; var10++) {
					for (var11 = 0; var11 < arg0; var11++) {
						arg3.position(var16);
						var20 = arg3.getShort();
						arg3.position(var16 + arg7);
						short var21 = (short) (var20 + arg3.getShort());
						arg3.position(var16 + arg6);
						short var22 = (short) (var21 + arg3.getShort());
						arg3.position(var16 + arg6 + arg7);
						short var23 = (short) (var22 + arg3.getShort());
						short var24 = (short) (var23 + 2);
						short var25 = (short) (var24 / 4);
						arg4.put(var25);
						var16 += arg5;
					}
					var16 += arg7;
				}
				var16 += arg6;
			}
			return;
		}
		for (var9 = 0; var9 < var14; var9++) {
			for (var10 = 0; var10 < var13; var10++) {
				for (var11 = 0; var11 < arg0; var11++) {
					arg3.position(var16);
					var20 = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
					arg3.position(var16 + arg7);
					var20 += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
					arg3.position(var16 + arg6);
					var20 += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
					arg3.position(var16 + arg6 + arg7);
					var20 += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
					var20 = (short) (var20 + 2);
					var20 = (short) (var20 / 4);
					arg4.put(var20);
					var16 += arg5;
				}
				var16 += arg7;
			}
			var16 += arg6;
		}
	}

	public static void halve1Dimage_short(int arg0, int arg1, int arg2, ByteBuffer arg3, ShortBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9 = arg1 / 2;
		int var10 = arg2 / 2;
		int var11 = 0;
		int var12 = 0;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var13;
		int var14;
		if (arg2 == 1) {
			assert arg1 != 1;
			var10 = 1;
			for (var13 = 0; var13 < var9; var13++) {
				for (var14 = 0; var14 < arg0; var14++) {
					short[] var15 = new short[2];
					if (arg8) {
						arg3.position(var11);
						var15[0] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
						arg3.position(var11 + arg7);
						var15[1] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
					} else {
						arg3.position(var11);
						var15[0] = arg3.getShort();
						arg3.position(var11 + arg7);
						var15[1] = arg3.getShort();
					}
					arg4.put((short) ((var15[0] + var15[1]) / 2));
					var11 += arg5;
					var12 += 2;
				}
				var11 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			int var10000 = var11 + var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var9 = 1;
			for (var13 = 0; var13 < var10; var13++) {
				for (int var17 = 0; var17 < arg0; var17++) {
					short[] var16 = new short[2];
					if (arg8) {
						arg3.position(var11);
						var16[0] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
						arg3.position(var11 + arg6);
						var16[1] = Mipmap.GLU_SWAP_2_BYTES(arg3.getShort());
					} else {
						arg3.position(var11);
						var16[0] = arg3.getShort();
						arg3.position(var11 + arg6);
						var16[1] = arg3.getShort();
					}
					arg4.put((short) ((var16[0] + var16[1]) / 2));
					var11 += arg5;
					var12 += 2;
				}
				var11 += var14;
				var11 += arg6;
			}
			assert var11 == arg6 * arg2;
		}
		assert var12 == arg0 * arg5 * var9 * var10;
	}

	public static void halveImage_uint(int arg0, int arg1, int arg2, ByteBuffer arg3, IntBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		boolean var15 = false;
		int var16 = 0;
		double var17 = 0.0D;
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_uint(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			return;
		}
		int var13 = arg1 / 2;
		int var14 = arg2 / 2;
		int var9;
		int var10;
		int var11;
		if (!arg8) {
			for (var9 = 0; var9 < var14; var9++) {
				for (var10 = 0; var10 < var13; var10++) {
					for (var11 = 0; var11 < arg0; var11++) {
						arg3.position(var16);
						var17 = (long) arg3.getInt() & 0x7FFFFFFFL;
						arg3.position(var16 + arg7);
						var17 += (long) arg3.getInt() & 0x7FFFFFFFL;
						arg3.position(var16 + arg6);
						var17 += (long) arg3.getInt() & 0x7FFFFFFFL;
						arg3.position(var16 + arg6 + arg7);
						var17 += (long) arg3.getInt() & 0x7FFFFFFFL;
						arg4.put((int) (var17 / 4.0D + 0.5D));
						var16 += arg5;
					}
					var16 += arg7;
				}
				var16 += arg6;
			}
			return;
		}
		for (var9 = 0; var9 < var14; var9++) {
			for (var10 = 0; var10 < var13; var10++) {
				for (var11 = 0; var11 < arg0; var11++) {
					arg3.position(var16);
					double var19 = (double) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					arg3.position(var16 + arg7);
					double var21 = var19 + (double) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					arg3.position(var16 + arg6);
					double var22 = var21 + (double) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					arg3.position(var16 + arg6 + arg7);
					double var10000 = var22 + (double) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					var17 /= 4.0D;
					var17 += 0.5D;
					arg4.put((int) var17);
					var16 += arg5;
				}
				var16 += arg7;
			}
			var16 += arg6;
		}
	}

	public static void halve1Dimage_uint(int arg0, int arg1, int arg2, ByteBuffer arg3, IntBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9 = arg1 / 2;
		int var10 = arg2 / 2;
		int var11 = 0;
		int var12 = 0;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var13;
		int var14;
		if (arg2 == 1) {
			assert arg1 != 1;
			var10 = 1;
			for (var13 = 0; var13 < var9; var13++) {
				for (var14 = 0; var14 < var10; var14++) {
					long[] var15 = new long[2];
					if (arg8) {
						arg3.position(var11);
						var15[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
						arg3.position(var11 + arg7);
						var15[1] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
					} else {
						arg3.position(var11);
						var15[0] = arg3.getInt() & 0xFFFFFFFF;
						arg3.position(var11 + arg7);
						var15[1] = arg3.getInt() & 0xFFFFFFFF;
					}
					arg4.put((int) ((double) (var15[0] + var15[1]) / 2.0D));
					var11 += arg5;
					var12 += 4;
				}
				var11 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			int var10000 = var11 + var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var9 = 1;
			for (var13 = 0; var13 < var10; var13++) {
				for (int var17 = 0; var17 < arg0; var17++) {
					long[] var16 = new long[2];
					if (arg8) {
						arg3.position(var11);
						var16[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
						arg3.position(var11 + arg7);
						var16[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
					} else {
						arg3.position(var11);
						var16[0] = arg3.getInt() & 0xFFFFFFFF;
						arg3.position(var11 + arg6);
						var16[1] = arg3.getInt() & 0xFFFFFFFF;
					}
					arg4.put((int) ((double) (var16[0] + var16[1]) / 2.0D));
					var11 += arg5;
					var12 += 4;
				}
				var11 += var14;
				var11 += arg6;
			}
			assert var11 == arg6 * arg2;
		}
		assert var12 == arg0 * arg5 * var9 * var10;
	}

	public static void halveImage_int(int arg0, int arg1, int arg2, ByteBuffer arg3, IntBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		boolean var15 = false;
		int var16 = 0;
		boolean var17 = false;
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_int(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			return;
		}
		int var13 = arg1 / 2;
		int var14 = arg2 / 2;
		int var9;
		int var10;
		int var11;
		if (!arg8) {
			for (var9 = 0; var9 < var14; var9++) {
				for (var10 = 0; var10 < var13; var10++) {
					for (var11 = 0; var11 < arg0; var11++) {
						arg3.position(var16);
						int var21 = arg3.getInt();
						arg3.position(var16 + arg7);
						int var22 = var21 + arg3.getInt();
						arg3.position(var16 + arg6);
						int var23 = var22 + arg3.getInt();
						arg3.position(var16 + arg6 + arg7);
						int var25 = var23 + arg3.getInt();
						int var27 = (int) ((float) var25 / 4.0F + 0.5F);
						arg4.put(var27);
						var16 += arg5;
					}
					var16 += arg7;
				}
				var16 += arg6;
			}
			return;
		}
		for (var9 = 0; var9 < var14; var9++) {
			for (var10 = 0; var10 < var13; var10++) {
				for (var11 = 0; var11 < arg0; var11++) {
					arg3.position(var16);
					long var18 = (long) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					float var20 = (float) var18;
					arg3.position(var16 + arg7);
					long var24 = (long) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					float var29 = var20 + (float) var24;
					arg3.position(var16 + arg6);
					long var26 = (long) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					float var30 = var29 + (float) var26;
					arg3.position(var16 + arg6 + arg7);
					long var28 = (long) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF);
					float var31 = var30 + (float) var28;
					arg4.put((int) (var31 / 4.0F + 0.5F));
					var16 += arg5;
				}
				var16 += arg7;
			}
			var16 += arg6;
		}
	}

	public static void halve1Dimage_int(int arg0, int arg1, int arg2, ByteBuffer arg3, IntBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9 = arg1 / 2;
		int var10 = arg2 / 2;
		int var11 = 0;
		int var12 = 0;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var13;
		int var14;
		if (arg2 == 1) {
			assert arg1 != 1;
			var10 = 1;
			for (var13 = 0; var13 < var9; var13++) {
				for (var14 = 0; var14 < arg0; var14++) {
					long[] var15 = new long[2];
					if (arg8) {
						arg3.position(var11);
						var15[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
						arg3.position(var11 + arg7);
						var15[1] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
					} else {
						arg3.position(var11);
						var15[0] = arg3.getInt() & 0xFFFFFFFF;
						arg3.position(var11 + arg7);
						var15[1] = arg3.getInt() & 0xFFFFFFFF;
					}
					arg4.put((int) (((float) var15[0] + (float) var15[1]) / 2.0F));
					var11 += arg5;
					var12 += 4;
				}
				var11 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			int var10000 = var11 + var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var9 = 1;
			for (var13 = 0; var13 < var10; var13++) {
				for (int var17 = 0; var17 < arg0; var17++) {
					long[] var16 = new long[2];
					if (arg8) {
						arg3.position(var11);
						var16[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
						arg3.position(var11 + arg6);
						var16[1] = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
					} else {
						arg3.position(var11);
						var16[0] = arg3.getInt() & 0xFFFFFFFF;
						arg3.position(var11 + arg6);
						var16[1] = arg3.getInt() & 0xFFFFFFFF;
					}
					arg4.put((int) (((float) var16[0] + (float) var16[1]) / 2.0F));
					var11 += arg5;
					var12 += 4;
				}
				var11 += var14;
				var11 += arg6;
			}
			assert var11 == arg6 * arg2;
		}
		assert var12 == arg0 * arg5 * var9 * var10;
	}

	public static void halveImage_float(int arg0, int arg1, int arg2, ByteBuffer arg3, FloatBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		boolean var15 = false;
		int var16 = 0;
		float var17 = 0.0F;
		if (arg1 == 1 || arg2 == 1) {
			assert arg1 != 1 || arg2 != 1;
			halve1Dimage_float(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			return;
		}
		int var13 = arg1 / 2;
		int var14 = arg2 / 2;
		int var9;
		int var10;
		int var11;
		if (!arg8) {
			for (var9 = 0; var9 < var14; var9++) {
				for (var10 = 0; var10 < var13; var10++) {
					for (var11 = 0; var11 < arg0; var11++) {
						arg3.position(var16);
						var17 = arg3.getFloat();
						arg3.position(var16 + arg7);
						var17 += arg3.getFloat();
						arg3.position(var16 + arg6);
						var17 += arg3.getFloat();
						arg3.position(var16 + arg6 + arg7);
						var17 /= 4.0F;
						arg4.put(var17);
						var16 += arg5;
					}
					var16 += arg7;
				}
				var16 += arg6;
			}
			return;
		}
		for (var9 = 0; var9 < var14; var9++) {
			for (var10 = 0; var10 < var13; var10++) {
				for (var11 = 0; var11 < arg0; var11++) {
					arg3.position(var16);
					float var18 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
					arg3.position(var16 + arg7);
					float var19 = var18 + Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
					arg3.position(var16 + arg6);
					float var20 = var19 + Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
					arg3.position(var16 + arg6 + arg7);
					float var21 = var20 + Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
					arg4.put(var21 / 4.0F);
					var16 += arg5;
				}
				var16 += arg7;
			}
			var16 += arg6;
		}
	}

	public static void halve1Dimage_float(int arg0, int arg1, int arg2, ByteBuffer arg3, FloatBuffer arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9 = arg1 / 2;
		int var10 = arg2 / 2;
		int var11 = 0;
		int var12 = 0;
		assert arg1 == 1 || arg2 == 1;
		assert arg1 != arg2;
		int var13;
		int var14;
		if (arg2 == 1) {
			assert arg1 != 1;
			var10 = 1;
			for (var13 = 0; var13 < var9; var13++) {
				for (var14 = 0; var14 < arg0; var14++) {
					float[] var15 = new float[2];
					if (arg8) {
						arg3.position(var11);
						var15[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
						arg3.position(var11 + arg7);
						var15[1] = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
					} else {
						arg3.position(var11);
						var15[0] = arg3.getFloat();
						arg3.position(var11 + arg7);
						var15[1] = arg3.getFloat();
					}
					arg4.put((var15[0] + var15[1]) / 2.0F);
					var11 += arg5;
					var12 += 4;
				}
				var11 += arg7;
			}
			var14 = arg6 - arg1 * arg7;
			int var10000 = var11 + var14;
		} else if (arg1 == 1) {
			var14 = arg6 - arg1 * arg7;
			assert arg2 != 1;
			var9 = 1;
			for (var13 = 0; var13 < var10; var13++) {
				for (int var17 = 0; var17 < arg0; var17++) {
					float[] var16 = new float[2];
					if (arg8) {
						arg3.position(var11);
						var16[0] = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
						arg3.position(var11 + arg6);
						var16[1] = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
					} else {
						arg3.position(var11);
						var16[0] = arg3.getFloat();
						arg3.position(var11 + arg6);
						var16[1] = arg3.getFloat();
					}
					arg4.put((var16[0] + var16[1]) / 2.0F);
					var11 += arg5;
					var12 += 4;
				}
				var11 += var14;
				var11 += arg6;
			}
			assert var11 == arg6 * arg2;
		}
		assert var12 == arg0 * arg5 * var9 * var10;
	}

	public static void halveImagePackedPixel(int arg0, Extract arg1, int arg2, int arg3, ByteBuffer arg4, ByteBuffer arg5, int arg6, int arg7, boolean arg8) {
		if (arg2 == 1 || arg3 == 1) {
			assert arg2 != 1 || arg3 != 1;
			halve1DimagePackedPixel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			return;
		}
		int var11 = arg2 / 2;
		int var12 = arg3 / 2;
		int var13 = 0;
		int var14 = arg7 - arg2 * arg6;
		int var15 = 0;
		for (int var9 = 0; var9 < var12; var9++) {
			for (int var10 = 0; var10 < var11; var10++) {
				float[] var16 = new float[4];
				float[][] var17 = new float[4][4];
				arg4.position(var13);
				arg1.extract(arg8, arg4, var17[0]);
				arg4.position(var13 + arg6);
				arg1.extract(arg8, arg4, var17[1]);
				arg4.position(var13 + arg7);
				arg1.extract(arg8, arg4, var17[2]);
				arg4.position(var13 + arg7 + arg6);
				arg1.extract(arg8, arg4, var17[3]);
				for (int var18 = 0; var18 < arg0; var18++) {
					boolean var19 = false;
					var16[var18] = 0.0F;
					for (int var20 = 0; var20 < 4; var20++) {
						var16[var18] += var17[var20][var18];
					}
					var16[var18] /= 4.0F;
				}
				arg1.shove(var16, var15, arg5);
				var15++;
				var13 += arg6 + arg6;
			}
			var13 += var14;
			var13 += arg7;
		}
		assert var13 == arg7 * arg3;
		assert var15 == var11 * var12;
	}

	public static void halve1DimagePackedPixel(int arg0, Extract arg1, int arg2, int arg3, ByteBuffer arg4, ByteBuffer arg5, int arg6, int arg7, boolean arg8) {
		int var9 = arg2 / 2;
		int var10 = arg3 / 2;
		int var11 = 0;
		assert arg2 == 1 || arg3 == 1;
		assert arg2 != arg3;
		int var12;
		int var13;
		float[] var14;
		float[][] var15;
		int var16;
		boolean var17;
		int var21;
		if (arg3 == 1) {
			var13 = 0;
			assert arg2 != 1;
			byte var19 = 1;
			for (var12 = 0; var12 < var9; var12++) {
				var14 = new float[4];
				var15 = new float[2][4];
				arg4.position(var11);
				arg1.extract(arg8, arg4, var15[0]);
				arg4.position(var11 + arg6);
				arg1.extract(arg8, arg4, var15[1]);
				for (var16 = 0; var16 < arg0; var16++) {
					var17 = false;
					var14[var16] = 0.0F;
					for (var21 = 0; var21 < 2; var21++) {
						var14[var16] += var15[var21][var16];
					}
					var14[var16] /= 2.0F;
				}
				arg1.shove(var14, var13, arg5);
				var13++;
				var11 += arg6 + arg6;
			}
			int var20 = arg7 - arg2 * arg6;
			var11 += var20;
			assert var11 == arg7;
			assert var13 == var9 * var19;
		} else if (arg2 == 1) {
			var13 = 0;
			assert arg3 != 1;
			byte var18 = 1;
			for (var12 = 0; var12 < var10; var12++) {
				var14 = new float[4];
				var15 = new float[2][4];
				arg4.position(var11);
				arg1.extract(arg8, arg4, var15[0]);
				arg4.position(var11 + arg7);
				arg1.extract(arg8, arg4, var15[1]);
				for (var16 = 0; var16 < arg0; var16++) {
					var17 = false;
					var14[var16] = 0.0F;
					for (var21 = 0; var21 < 2; var21++) {
						var14[var16] += var15[var21][var16];
					}
					var14[var16] /= 2.0F;
				}
				arg1.shove(var14, var13, arg5);
				var13++;
				var11 += arg7 + arg7;
			}
			assert var11 == arg7;
			assert var13 == var18 * var10;
		}
	}
}
