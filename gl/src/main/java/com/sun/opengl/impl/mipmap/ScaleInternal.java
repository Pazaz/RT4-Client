package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class ScaleInternal {

	public static void scale_internal(int arg0, int arg1, int arg2, ShortBuffer arg3, int arg4, int arg5, ShortBuffer arg6) {
		float[] var20 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage(arg0, arg1, arg2, arg3, arg6);
			return;
		}
		float var15 = (float) arg2 / (float) arg5;
		float var10 = (float) arg1 / (float) arg4;
		float var11 = var10 / 2.0F;
		float var16 = var15 / 2.0F;
		for (int var22 = 0; var22 < arg5; var22++) {
			float var12 = var15 * ((float) var22 + 0.5F);
			float var13;
			float var14;
			if (arg2 > arg5) {
				var14 = var12 + var16;
				var13 = var12 - var16;
			} else {
				var14 = var12 + 0.5F;
				var13 = var12 - 0.5F;
			}
			for (int var23 = 0; var23 < arg4; var23++) {
				float var7 = var10 * ((float) var23 + 0.5F);
				float var8;
				float var9;
				if (arg1 > arg4) {
					var9 = var7 + var11;
					var8 = var7 - var11;
				} else {
					var9 = var7 + 0.5F;
					var8 = var7 - 0.5F;
				}
				var20[0] = var20[1] = var20[2] = var20[3] = 0.0F;
				float var21 = 0.0F;
				var12 = var13;
				int var25 = (int) Math.floor((double) var13);
				int var24;
				int var29;
				while (var12 < var14) {
					int var28 = (var25 + arg2) % arg2;
					float var18;
					if (var14 < (float) (var25 + 1)) {
						var18 = var14 - var12;
					} else {
						var18 = (float) (var25 + 1) - var12;
					}
					var7 = var8;
					int var26 = (int) Math.floor((double) var8);
					while (var7 < var9) {
						int var27 = (var26 + arg1) % arg1;
						float var17;
						if (var9 < (float) (var26 + 1)) {
							var17 = var9 - var7;
						} else {
							var17 = (float) (var26 + 1) - var7;
						}
						float var19 = var17 * var18;
						var21 += var19;
						var29 = (var27 + var28 * arg1) * arg0;
						for (var24 = 0; var24 < arg0; var24++) {
							var20[var24] += (float) arg3.get(var29 + var24) * var19;
						}
						var26++;
						var7 = var26;
					}
					var25++;
					var12 = var25;
				}
				var29 = (var23 + var22 * arg4) * arg0;
				for (var24 = 0; var24 < arg0; var24++) {
					arg6.put(var29 + var24, (short) ((var20[var24] + 0.5F) / var21));
				}
			}
		}
	}

	public static void scale_internal_ubyte(int arg0, int arg1, int arg2, ByteBuffer arg3, int arg4, int arg5, ByteBuffer arg6, int arg7, int arg8, int arg9) {
		float[] var15 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage_ubyte(arg0, arg1, arg2, arg3, arg6, arg7, arg8, arg9);
			return;
		}
		float var13 = (float) arg2 / (float) arg5;
		float var11 = (float) arg1 / (float) arg4;
		int var37 = (int) Math.floor((double) var13);
		float var35 = var13 - (float) var37;
		int var38 = (int) Math.floor((double) var11);
		float var36 = var11 - (float) var38;
		float var16 = var11 * var13;
		int var27 = 0;
		float var33 = 0.0F;
		int var28 = var37;
		float var34 = var35;
		for (int var17 = 0; var17 < arg5; var17++) {
			if (var28 >= arg2) {
				var28 = arg2 - 1;
			}
			int var25 = 0;
			float var31 = 0.0F;
			int var26 = var38;
			float var32 = var36;
			for (int var18 = 0; var18 < arg4; var18++) {
				var15[0] = var15[1] = var15[2] = var15[3] = 0.0F;
				int var20 = var25 * arg9;
				float var14;
				int var19;
				int var21;
				int var23;
				float var30;
				int var39;
				int var40;
				if (var28 > var27 && var26 > var25) {
					var30 = 1.0F - var33;
					var21 = var20 + var27 * arg8;
					var14 = var30 * (1.0F - var31);
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) (arg3.get() & 0xFF) * var14;
						var19++;
						var23 += arg7;
					}
					int var41 = var21;
					var39 = var25 + 1;
					label175: while (true) {
						if (var39 >= var26) {
							var21 += arg9;
							int var42 = var21;
							var14 = var30 * var32;
							var19 = 0;
							var23 = var21;
							while (var19 < arg0) {
								arg3.position(var23);
								var15[var19] += (float) (arg3.get() & 0xFF) * var14;
								var19++;
								var23 += arg7;
							}
							var30 = var34;
							var14 = var34 * (1.0F - var31);
							var21 = var20 + var28 * arg8;
							var19 = 0;
							var23 = var21;
							while (var19 < arg0) {
								arg3.position(var23);
								var15[var19] += (float) (arg3.get() & 0xFF) * var14;
								var19++;
								var23 += arg7;
							}
							for (var39 = var25 + 1; var39 < var26; var39++) {
								var21 += arg9;
								var19 = 0;
								var23 = var21;
								while (var19 < arg0) {
									arg3.position(var23);
									var15[var19] += (float) (arg3.get() & 0xFF) * var30;
									var19++;
									var23 += arg7;
								}
							}
							var21 += arg9;
							var14 = var30 * var32;
							var19 = 0;
							var23 = var21;
							while (var19 < arg0) {
								arg3.position(var23);
								var15[var19] += (float) (arg3.get() & 0xFF) * var14;
								var19++;
								var23 += arg7;
							}
							var40 = var27 + 1;
							while (true) {
								if (var40 >= var28) {
									break label175;
								}
								var41 += arg8;
								var42 += arg8;
								var19 = 0;
								while (var19 < arg0) {
									float var43 = 0.0F;
									arg3.position(var41);
									float var44 = (float) (arg3.get() & 0xFF) * (1.0F - var31);
									arg3.position(var42);
									float var45 = var44 + (float) (arg3.get() & 0xFF) * var32;
									var15[var19] += var45;
									var19++;
									var41 += arg7;
									var42 += arg7;
								}
								var40++;
							}
						}
						var21 += arg9;
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += (float) (arg3.get() & 0xFF) * var30;
							var19++;
							var23 += arg7;
						}
						var39++;
					}
				} else if (var28 > var27) {
					float var29 = var32 - var31;
					var14 = (1.0F - var33) * var29;
					var21 = var20 + var27 * arg8;
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) (arg3.get() & 0xFF) * var14;
						var19++;
						var23 += arg7;
					}
					var40 = var27 + 1;
					label192: while (true) {
						if (var40 >= var28) {
							var14 = var29 * var34;
							var21 += arg8;
							var19 = 0;
							var23 = var21;
							while (true) {
								if (var19 >= arg0) {
									break label192;
								}
								arg3.position(var23);
								var15[var19] += (float) (arg3.get() & 0xFF) * var14;
								var19++;
								var23 += arg7;
							}
						}
						var21 += arg8;
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += (float) (arg3.get() & 0xFF) * var29;
							var19++;
							var23 += arg7;
						}
						var40++;
					}
				} else if (var26 <= var25) {
					var14 = (var34 - var33) * (var32 - var31);
					var21 = var20 + var27 * arg8;
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) (arg3.get() & 0xFF) * var14;
						var19++;
						var23 += arg7;
					}
				} else {
					var30 = var34 - var33;
					var14 = (1.0F - var31) * var30;
					var21 = var20 + var27 * arg8;
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) (arg3.get() & 0xFF) * var14;
						var19++;
						var23 += arg7;
					}
					var39 = var25 + 1;
					label209: while (true) {
						if (var39 >= var26) {
							var21 += arg9;
							var14 = var30 * var32;
							var19 = 0;
							var23 = var21;
							while (true) {
								if (var19 >= arg0) {
									break label209;
								}
								arg3.position(var23);
								var15[var19] += (float) (arg3.get() & 0xFF) * var14;
								var19++;
								var23 += arg7;
							}
						}
						var21 += arg9;
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += (float) (arg3.get() & 0xFF) * var30;
							var19++;
							var23 += arg7;
						}
						var39++;
					}
				}
				int var22 = var20 + arg9 + (var27 + 1) * arg8;
				for (var40 = var27 + 1; var40 < var28; var40++) {
					var21 = var22;
					for (var39 = var25 + 1; var39 < var26; var39++) {
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += arg3.get() & 0xFF;
							var19++;
							var23 += arg7;
						}
						var21 += arg9;
					}
					var22 += arg8;
				}
				int var24 = (var18 + var17 * arg4) * arg0;
				for (var19 = 0; var19 < arg0; var19++) {
					arg6.position(var24 + var19);
					arg6.put((byte) (var15[var19] / var16));
				}
				var25 = var26;
				var31 = var32;
				var26 += var38;
				var32 += var36;
				if (var32 > 1.0F) {
					var32--;
					var26++;
				}
				if (var26 > arg1 - 1) {
					int var46 = var26 + 1 - arg1;
					var25 -= var46;
					var26 -= var46;
				}
			}
			var27 = var28;
			var33 = var34;
			var28 += var37;
			var34 += var35;
			if (var34 > 1.0F) {
				var34--;
				var28++;
			}
		}
	}

	public static void scale_internal_byte(int arg0, int arg1, int arg2, ByteBuffer arg3, int arg4, int arg5, ByteBuffer arg6, int arg7, int arg8, int arg9) {
		float[] var15 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage_byte(arg0, arg1, arg2, arg3, arg6, arg7, arg8, arg9);
			return;
		}
		float var13 = (float) arg2 / (float) arg5;
		float var11 = (float) arg1 / (float) arg4;
		int var37 = (int) Math.floor((double) var13);
		float var35 = var13 - (float) var37;
		int var38 = (int) Math.floor((double) var11);
		float var36 = var11 - (float) var38;
		float var16 = var11 * var13;
		int var27 = 0;
		float var33 = 0.0F;
		int var28 = var37;
		float var34 = var35;
		for (int var17 = 0; var17 < arg5; var17++) {
			if (var28 >= arg2) {
				var28 = arg2 - 1;
			}
			int var25 = 0;
			float var31 = 0.0F;
			int var26 = var38;
			float var32 = var36;
			for (int var18 = 0; var18 < arg4; var18++) {
				var15[0] = var15[1] = var15[2] = var15[3] = 0.0F;
				int var20 = var25 * arg9;
				float var14;
				int var19;
				int var21;
				int var23;
				float var30;
				int var39;
				int var40;
				if (var28 > var27 && var26 > var25) {
					var30 = 1.0F - var33;
					var21 = var20 + var27 * arg8;
					var14 = var30 * (1.0F - var31);
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) arg3.get() * var14;
						var19++;
						var23 += arg7;
					}
					int var41 = var21;
					var39 = var25 + 1;
					label175: while (true) {
						if (var39 >= var26) {
							var21 += arg9;
							int var42 = var21;
							var14 = var30 * var32;
							var19 = 0;
							var23 = var21;
							while (var19 < arg0) {
								arg3.position(var23);
								var15[var19] += (float) arg3.get() * var14;
								var19++;
								var23 += arg7;
							}
							var30 = var34;
							var14 = var34 * (1.0F - var31);
							var21 = var20 + var28 * arg8;
							var19 = 0;
							var23 = var21;
							while (var19 < arg0) {
								arg3.position(var23);
								var15[var19] += (float) arg3.get() * var14;
								var19++;
								var23 += arg7;
							}
							for (var39 = var25 + 1; var39 < var26; var39++) {
								var21 += arg9;
								var19 = 0;
								var23 = var21;
								while (var19 < arg0) {
									arg3.position(var23);
									var15[var19] += (float) arg3.get() * var30;
									var19++;
									var23 += arg7;
								}
							}
							var21 += arg9;
							var14 = var30 * var32;
							var19 = 0;
							var23 = var21;
							while (var19 < arg0) {
								arg3.position(var23);
								var15[var19] += (float) arg3.get() * var14;
								var19++;
								var23 += arg7;
							}
							var40 = var27 + 1;
							while (true) {
								if (var40 >= var28) {
									break label175;
								}
								var41 += arg8;
								var42 += arg8;
								var19 = 0;
								while (var19 < arg0) {
									float var43 = 0.0F;
									arg3.position(var41);
									float var44 = (float) arg3.get() * (1.0F - var31);
									arg3.position(var42);
									float var45 = var44 + (float) arg3.get() * var32;
									var15[var19] += var45;
									var19++;
									var41 += arg7;
									var42 += arg7;
								}
								var40++;
							}
						}
						var21 += arg9;
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += (float) arg3.get() * var30;
							var19++;
							var23 += arg7;
						}
						var39++;
					}
				} else if (var28 > var27) {
					float var29 = var32 - var31;
					var14 = (1.0F - var33) * var29;
					var21 = var20 + var27 * arg8;
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) arg3.get() * var14;
						var19++;
						var23 += arg7;
					}
					var40 = var27 + 1;
					label192: while (true) {
						if (var40 >= var28) {
							var14 = var29 * var34;
							var21 += arg8;
							var19 = 0;
							var23 = var21;
							while (true) {
								if (var19 >= arg0) {
									break label192;
								}
								arg3.position(var23);
								var15[var19] += (float) arg3.get() * var14;
								var19++;
								var23 += arg7;
							}
						}
						var21 += arg8;
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += (float) arg3.get() * var29;
							var19++;
							var23 += arg7;
						}
						var40++;
					}
				} else if (var26 <= var25) {
					var14 = (var34 - var33) * (var32 - var31);
					var21 = var20 + var27 * arg8;
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) arg3.get() * var14;
						var19++;
						var23 += arg7;
					}
				} else {
					var30 = var34 - var33;
					var14 = (1.0F - var31) * var30;
					var21 = var20 + var27 * arg8;
					var19 = 0;
					var23 = var21;
					while (var19 < arg0) {
						arg3.position(var23);
						var15[var19] += (float) arg3.get() * var14;
						var19++;
						var23 += arg7;
					}
					var39 = var25 + 1;
					label209: while (true) {
						if (var39 >= var26) {
							var21 += arg9;
							var14 = var30 * var32;
							var19 = 0;
							var23 = var21;
							while (true) {
								if (var19 >= arg0) {
									break label209;
								}
								arg3.position(var23);
								var15[var19] += (float) arg3.get() * var14;
								var19++;
								var23 += arg7;
							}
						}
						var21 += arg9;
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += (float) arg3.get() * var30;
							var19++;
							var23 += arg7;
						}
						var39++;
					}
				}
				int var22 = var20 + arg9 + (var27 + 1) * arg8;
				for (var40 = var27 + 1; var40 < var28; var40++) {
					var21 = var22;
					for (var39 = var25 + 1; var39 < var26; var39++) {
						var19 = 0;
						var23 = var21;
						while (var19 < arg0) {
							arg3.position(var23);
							var15[var19] += arg3.get();
							var19++;
							var23 += arg7;
						}
						var21 += arg9;
					}
					var22 += arg8;
				}
				int var24 = (var18 + var17 * arg4) * arg0;
				for (var19 = 0; var19 < arg0; var19++) {
					arg6.position(var24 + var19);
					arg6.put((byte) (var15[var19] / var16));
				}
				var25 = var26;
				var31 = var32;
				var26 += var38;
				var32 += var36;
				if (var32 > 1.0F) {
					var32--;
					var26++;
				}
				if (var26 > arg1 - 1) {
					int var46 = var26 + 1 - arg1;
					var25 -= var46;
					var26 -= var46;
				}
			}
			var27 = var28;
			var33 = var34;
			var28 += var37;
			var34 += var35;
			if (var34 > 1.0F) {
				var34--;
				var28++;
			}
		}
	}

	public static void scale_internal_ushort(int arg0, int arg1, int arg2, ByteBuffer arg3, int arg4, int arg5, ShortBuffer arg6, int arg7, int arg8, int arg9, boolean arg10) {
		float[] var16 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage_ushort(arg0, arg1, arg2, arg3, arg6, arg7, arg8, arg9, arg10);
			return;
		}
		float var14 = (float) arg2 / (float) arg5;
		float var12 = (float) arg1 / (float) arg4;
		int var38 = (int) Math.floor((double) var14);
		float var36 = var14 - (float) var38;
		int var39 = (int) Math.floor((double) var12);
		float var37 = var12 - (float) var39;
		float var17 = var12 * var14;
		int var28 = 0;
		float var34 = 0.0F;
		int var29 = var38;
		float var35 = var36;
		for (int var18 = 0; var18 < arg5; var18++) {
			if (var29 >= arg2) {
				var29 = arg2 - 1;
			}
			int var26 = 0;
			float var32 = 0.0F;
			int var27 = var39;
			float var33 = var37;
			for (int var19 = 0; var19 < arg4; var19++) {
				var16[0] = var16[1] = var16[2] = var16[3] = 0.0F;
				int var21 = var26 * arg9;
				float var15;
				int var20;
				int var22;
				int var24;
				float var31;
				int var40;
				int var41;
				if (var29 > var28 && var27 > var26) {
					var31 = 1.0F - var34;
					var22 = var21 + var28 * arg8;
					var15 = var31 * (1.0F - var32);
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
					int var42 = var22;
					var40 = var26 + 1;
					label250: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							int var43 = var22;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
							var31 = var35;
							var15 = var35 * (1.0F - var32);
							var22 = var21 + var29 * arg8;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
							for (var40 = var26 + 1; var40 < var27; var40++) {
								var22 += arg9;
								var20 = 0;
								var24 = var22;
								while (var20 < arg0) {
									arg3.position(var24);
									if (arg10) {
										var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var31;
									} else {
										var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var31;
									}
									var20++;
									var24 += arg7;
								}
							}
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
							var41 = var28 + 1;
							while (true) {
								if (var41 >= var29) {
									break label250;
								}
								var42 += arg8;
								var43 += arg8;
								var20 = 0;
								while (var20 < arg0) {
									float var44;
									if (arg10) {
										arg3.position(var42);
										var44 = (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * (1.0F - var32);
										arg3.position(var43);
										float var45 = var44 + (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var33;
										var16[var20] += var45;
									} else {
										arg3.position(var42);
										var44 = (float) (arg3.getShort() & 0xFFFF) * (1.0F - var32);
										arg3.position(var43);
										var44 += (float) (arg3.getShort() & 0xFFFF) * var33;
										var16[var20] += var44;
									}
									var20++;
									var42 += arg7;
									var43 += arg7;
								}
								var41++;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var31;
							} else {
								var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				} else if (var29 > var28) {
					float var30 = var33 - var32;
					var15 = (1.0F - var34) * var30;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
					var41 = var28 + 1;
					label267: while (true) {
						if (var41 >= var29) {
							var15 = var30 * var35;
							var22 += arg8;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label267;
								}
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg8;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var30;
							} else {
								var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var30;
							}
							var20++;
							var24 += arg7;
						}
						var41++;
					}
				} else if (var27 <= var26) {
					var15 = (var35 - var34) * (var33 - var32);
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
				} else {
					var31 = var35 - var34;
					var15 = (1.0F - var32) * var31;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
					var40 = var26 + 1;
					label284: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label284;
								}
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += (float) (Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF) * var31;
							} else {
								var16[var20] += (float) (arg3.getShort() & 0xFFFF) * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				}
				int var23 = var21 + arg9 + (var28 + 1) * arg8;
				for (var41 = var28 + 1; var41 < var29; var41++) {
					var22 = var23;
					for (var40 = var26 + 1; var40 < var27; var40++) {
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += Mipmap.GLU_SWAP_2_BYTES(arg3.getShort()) & 0xFFFF;
							} else {
								var16[var20] += arg3.getShort() & 0xFFFF;
							}
							var20++;
							var24 += arg7;
						}
						var22 += arg9;
					}
					var23 += arg8;
				}
				int var25 = (var19 + var18 * arg4) * arg0;
				for (var20 = 0; var20 < arg0; var20++) {
					arg6.position(var25 + var20);
					arg6.put((short) (var16[var20] / var17));
				}
				var26 = var27;
				var32 = var33;
				var27 += var39;
				var33 += var37;
				if (var33 > 1.0F) {
					var33--;
					var27++;
				}
				if (var27 > arg1 - 1) {
					int var46 = var27 + 1 - arg1;
					var26 -= var46;
					var27 -= var46;
				}
			}
			var28 = var29;
			var34 = var35;
			var29 += var38;
			var35 += var36;
			if (var35 > 1.0F) {
				var35--;
				var29++;
			}
		}
	}

	public static void scale_internal_uint(int arg0, int arg1, int arg2, ByteBuffer arg3, int arg4, int arg5, IntBuffer arg6, int arg7, int arg8, int arg9, boolean arg10) {
		float[] var16 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage_uint(arg0, arg1, arg2, arg3, arg6, arg7, arg8, arg9, arg10);
			return;
		}
		float var14 = (float) arg2 / (float) arg5;
		float var12 = (float) arg1 / (float) arg4;
		int var38 = (int) Math.floor((double) var14);
		float var36 = var14 - (float) var38;
		int var39 = (int) Math.floor((double) var12);
		float var37 = var12 - (float) var39;
		float var17 = var12 * var14;
		int var28 = 0;
		float var34 = 0.0F;
		int var29 = var38;
		float var35 = var36;
		for (int var18 = 0; var18 < arg5; var18++) {
			if (var29 >= arg2) {
				var29 = arg2 - 1;
			}
			int var26 = 0;
			float var32 = 0.0F;
			int var27 = var39;
			float var33 = var37;
			for (int var19 = 0; var19 < arg4; var19++) {
				var16[0] = var16[1] = var16[2] = var16[3] = 0.0F;
				int var21 = var26 * arg9;
				float var15;
				int var20;
				int var22;
				int var24;
				float var31;
				int var40;
				int var41;
				if (var29 > var28 && var27 > var26) {
					var31 = 1.0F - var34;
					var22 = var21 + var28 * arg8;
					var15 = var31 * (1.0F - var32);
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
					int var42 = var22;
					var40 = var26 + 1;
					label255: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							int var43 = var22;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
							var31 = var35;
							var15 = var35 * (1.0F - var32);
							var22 = var21 + var29 * arg8;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
							for (var40 = var26 + 1; var40 < var27; var40++) {
								var22 += arg9;
								var20 = 0;
								var24 = var22;
								while (var20 < arg0) {
									arg3.position(var24);
									if (arg10) {
										var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var31;
									} else {
										var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var31;
									}
									var20++;
									var24 += arg7;
								}
							}
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
							var41 = var28 + 1;
							while (true) {
								if (var41 >= var29) {
									break label255;
								}
								var42 += arg8;
								var43 += arg8;
								var20 = 0;
								while (var20 < arg0) {
									if (arg10) {
										arg3.position(var42);
										var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * (1.0F - var32);
										arg3.position(var43);
										var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var33;
									} else {
										arg3.position(var42);
										var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * (1.0F - var32);
										arg3.position(var43);
										var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var33;
									}
									var20++;
									var42 += arg7;
									var43 += arg7;
								}
								var41++;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var31;
							} else {
								var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				} else if (var29 > var28) {
					float var30 = var33 - var32;
					var15 = (1.0F - var34) * var30;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
					var41 = var28 + 1;
					label272: while (true) {
						if (var41 >= var29) {
							var15 = var30 * var35;
							var22 += arg8;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label272;
								}
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg8;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var30;
							} else {
								var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var30;
							}
							var20++;
							var24 += arg7;
						}
						var41++;
					}
				} else if (var27 <= var26) {
					var15 = (var35 - var34) * (var33 - var32);
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						long var44 = (long) arg3.getInt(var24) & 0xFFFFFFFFL;
						arg3.position(var24);
						long var46 = (long) arg3.getInt() & 0xFFFFFFFFL;
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
				} else {
					var31 = var35 - var34;
					var15 = (1.0F - var32) * var31;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
						} else {
							var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
						}
						var20++;
						var24 += arg7;
					}
					var40 = var26 + 1;
					label289: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label289;
								}
								arg3.position(var24);
								if (arg10) {
									var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var15;
								} else {
									var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += (float) (Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF) * var31;
							} else {
								var16[var20] += (float) (arg3.getInt() & 0xFFFFFFFF) * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				}
				int var23 = var21 + arg9 + (var28 + 1) * arg8;
				for (var41 = var28 + 1; var41 < var29; var41++) {
					var22 = var23;
					for (var40 = var26 + 1; var40 < var27; var40++) {
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var16[var20] += Mipmap.GLU_SWAP_4_BYTES(arg3.getInt()) & 0xFFFFFFFF;
							} else {
								var16[var20] += arg3.getInt() & 0xFFFFFFFF;
							}
							var20++;
							var24 += arg7;
						}
						var22 += arg9;
					}
					var23 += arg8;
				}
				int var25 = (var19 + var18 * arg4) * arg0;
				float var48 = 0.0F;
				for (var20 = 0; var20 < arg0; var20++) {
					var48 = var16[var20] / var17;
					arg6.position(var25 + var20);
					if (var48 >= -1.0F) {
						arg6.put((int) var48);
					} else {
						arg6.put((int) (var16[var20] / var17));
					}
				}
				var26 = var27;
				var32 = var33;
				var27 += var39;
				var33 += var37;
				if (var33 > 1.0F) {
					var33--;
					var27++;
				}
				if (var27 > arg1 - 1) {
					int var45 = var27 + 1 - arg1;
					var26 -= var45;
					var27 -= var45;
				}
			}
			var28 = var29;
			var34 = var35;
			var29 += var38;
			var35 += var36;
			if (var35 > 1.0F) {
				var35--;
				var29++;
			}
		}
	}

	public static void scale_internal_int(int arg0, int arg1, int arg2, ByteBuffer arg3, int arg4, int arg5, IntBuffer arg6, int arg7, int arg8, int arg9, boolean arg10) {
		float[] var16 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage_int(arg0, arg1, arg2, arg3, arg6, arg7, arg8, arg9, arg10);
			return;
		}
		float var14 = (float) arg2 / (float) arg5;
		float var12 = (float) arg1 / (float) arg4;
		int var38 = (int) Math.floor((double) var14);
		float var36 = var14 - (float) var38;
		int var39 = (int) Math.floor((double) var12);
		float var37 = var12 - (float) var39;
		float var17 = var12 * var14;
		int var28 = 0;
		float var34 = 0.0F;
		int var29 = var38;
		float var35 = var36;
		for (int var18 = 0; var18 < arg5; var18++) {
			if (var29 >= arg2) {
				var29 = arg2 - 1;
			}
			int var26 = 0;
			float var32 = 0.0F;
			int var27 = var39;
			float var33 = var37;
			for (int var19 = 0; var19 < arg4; var19++) {
				var16[0] = var16[1] = var16[2] = var16[3] = 0.0F;
				int var21 = var26 * arg9;
				float var15;
				int var20;
				int var22;
				int var24;
				float var31;
				int var40;
				int var41;
				long var44;
				if (var29 > var28 && var27 > var26) {
					var31 = 1.0F - var34;
					var22 = var21 + var28 * arg8;
					var15 = var31 * (1.0F - var32);
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
							var16[var20] += (float) var44 * var15;
						} else {
							var16[var20] += (float) arg3.getInt() * var15;
						}
						var20++;
						var24 += arg7;
					}
					int var42 = var22;
					var40 = var26 + 1;
					label250: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							int var43 = var22;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
									var16[var20] += (float) var44 * var15;
								} else {
									var16[var20] += (float) arg3.getInt() * var15;
								}
								var20++;
								var24 += arg7;
							}
							var31 = var35;
							var15 = var35 * (1.0F - var32);
							var22 = var21 + var29 * arg8;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
									var16[var20] += (float) var44 * var15;
								} else {
									var16[var20] += (float) arg3.getInt() * var15;
								}
								var20++;
								var24 += arg7;
							}
							for (var40 = var26 + 1; var40 < var27; var40++) {
								var22 += arg9;
								var20 = 0;
								var24 = var22;
								while (var20 < arg0) {
									arg3.position(var24);
									if (arg10) {
										var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
										var16[var20] += (float) var44 * var31;
									} else {
										var16[var20] += (float) arg3.getInt() * var31;
									}
									var20++;
									var24 += arg7;
								}
							}
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
									var16[var20] += (float) var44 * var15;
								} else {
									var16[var20] += (float) arg3.getInt() * var15;
								}
								var20++;
								var24 += arg7;
							}
							var41 = var28 + 1;
							while (true) {
								if (var41 >= var29) {
									break label250;
								}
								var42 += arg8;
								var43 += arg8;
								var20 = 0;
								while (var20 < arg0) {
									if (arg10) {
										arg3.position(var42);
										var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
										var16[var20] += (float) var44 * (1.0F - var32);
										arg3.position(var43);
										var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
										var16[var20] += (float) var44 * var33;
									} else {
										arg3.position(var42);
										var16[var20] += (float) arg3.getInt() * (1.0F - var32);
										arg3.position(var43);
										var16[var20] += (float) arg3.getInt() * var33;
									}
									var20++;
									var42 += arg7;
									var43 += arg7;
								}
								var41++;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
								var16[var20] += (float) var44 * var31;
							} else {
								var16[var20] += (float) arg3.getInt() * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				} else if (var29 > var28) {
					float var30 = var33 - var32;
					var15 = (1.0F - var34) * var30;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
							var16[var20] += (float) var44 * var15;
						} else {
							var16[var20] += (float) arg3.getInt() * var15;
						}
						var20++;
						var24 += arg7;
					}
					var41 = var28 + 1;
					label267: while (true) {
						if (var41 >= var29) {
							var15 = var30 * var35;
							var22 += arg8;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label267;
								}
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
									var16[var20] += (float) var44 * var15;
								} else {
									var16[var20] += (float) arg3.getInt() * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg8;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
								var16[var20] += (float) var44 * var30;
							} else {
								var16[var20] += (float) arg3.getInt() * var30;
							}
							var20++;
							var24 += arg7;
						}
						var41++;
					}
				} else if (var27 <= var26) {
					var15 = (var35 - var34) * (var33 - var32);
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
							var16[var20] += (float) var44 * var15;
						} else {
							var16[var20] += (float) arg3.getInt() * var15;
						}
						var20++;
						var24 += arg7;
					}
				} else {
					var31 = var35 - var34;
					var15 = (1.0F - var32) * var31;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
							var16[var20] += (float) var44 * var15;
						} else {
							var16[var20] += (float) arg3.getInt() * var15;
						}
						var20++;
						var24 += arg7;
					}
					var40 = var26 + 1;
					label284: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label284;
								}
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
									var16[var20] += (float) var44 * var15;
								} else {
									var16[var20] += (float) arg3.getInt() * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
								var16[var20] += (float) var44 * var31;
							} else {
								var16[var20] += (float) arg3.getInt() * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				}
				int var23 = var21 + arg9 + (var28 + 1) * arg8;
				for (var41 = var28 + 1; var41 < var29; var41++) {
					var22 = var23;
					for (var40 = var26 + 1; var40 < var27; var40++) {
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getInt());
								var16[var20] += var44;
							} else {
								var16[var20] += arg3.getInt();
							}
							var20++;
							var24 += arg7;
						}
						var22 += arg9;
					}
					var23 += arg8;
				}
				int var25 = (var19 + var18 * arg4) * arg0;
				for (var20 = 0; var20 < arg0; var20++) {
					arg6.position(var25 + var20);
					arg6.put((int) (var16[var20] / var17));
				}
				var26 = var27;
				var32 = var33;
				var27 += var39;
				var33 += var37;
				if (var33 > 1.0F) {
					var33--;
					var27++;
				}
				if (var27 > arg1 - 1) {
					int var46 = var27 + 1 - arg1;
					var26 -= var46;
					var27 -= var46;
				}
			}
			var28 = var29;
			var34 = var35;
			var29 += var38;
			var35 += var36;
			if (var35 > 1.0F) {
				var35--;
				var29++;
			}
		}
	}

	public static void scale_internal_float(int arg0, int arg1, int arg2, ByteBuffer arg3, int arg4, int arg5, FloatBuffer arg6, int arg7, int arg8, int arg9, boolean arg10) {
		float[] var16 = new float[4];
		if (arg1 == arg4 * 2 && arg2 == arg5 * 2) {
			HalveImage.halveImage_float(arg0, arg1, arg2, arg3, arg6, arg7, arg8, arg9, arg10);
			return;
		}
		float var14 = (float) arg2 / (float) arg5;
		float var12 = (float) arg1 / (float) arg4;
		int var38 = (int) Math.floor((double) var14);
		float var36 = var14 - (float) var38;
		int var39 = (int) Math.floor((double) var12);
		float var37 = var12 - (float) var39;
		float var17 = var12 * var14;
		int var28 = 0;
		float var34 = 0.0F;
		int var29 = var38;
		float var35 = var36;
		for (int var18 = 0; var18 < arg5; var18++) {
			if (var29 >= arg2) {
				var29 = arg2 - 1;
			}
			int var26 = 0;
			float var32 = 0.0F;
			int var27 = var39;
			float var33 = var37;
			for (int var19 = 0; var19 < arg4; var19++) {
				var16[0] = var16[1] = var16[2] = var16[3] = 0.0F;
				int var21 = var26 * arg9;
				float var15;
				int var20;
				int var22;
				int var24;
				float var31;
				int var40;
				int var41;
				float var44;
				if (var29 > var28 && var27 > var26) {
					var31 = 1.0F - var34;
					var22 = var21 + var28 * arg8;
					var15 = var31 * (1.0F - var32);
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
							var16[var20] += var44 * var15;
						} else {
							var16[var20] += arg3.getFloat() * var15;
						}
						var20++;
						var24 += arg7;
					}
					int var42 = var22;
					var40 = var26 + 1;
					label250: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							int var43 = var22;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
									var16[var20] += var44 * var15;
								} else {
									var16[var20] += arg3.getFloat() * var15;
								}
								var20++;
								var24 += arg7;
							}
							var31 = var35;
							var15 = var35 * (1.0F - var32);
							var22 = var21 + var29 * arg8;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
									var16[var20] += var44 * var15;
								} else {
									var16[var20] += arg3.getFloat() * var15;
								}
								var20++;
								var24 += arg7;
							}
							for (var40 = var26 + 1; var40 < var27; var40++) {
								var22 += arg9;
								var20 = 0;
								var24 = var22;
								while (var20 < arg0) {
									arg3.position(var24);
									if (arg10) {
										var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
										var16[var20] += var44 * var31;
									} else {
										var16[var20] += arg3.getFloat() * var31;
									}
									var20++;
									var24 += arg7;
								}
							}
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (var20 < arg0) {
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
									var16[var20] += var44 * var15;
								} else {
									var16[var20] += arg3.getFloat() * var15;
								}
								var20++;
								var24 += arg7;
							}
							var41 = var28 + 1;
							while (true) {
								if (var41 >= var29) {
									break label250;
								}
								var42 += arg8;
								var43 += arg8;
								var20 = 0;
								while (var20 < arg0) {
									if (arg10) {
										arg3.position(var42);
										var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
										var16[var20] += var44 * (1.0F - var32);
										arg3.position(var43);
										var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
										var16[var20] += var44 * var33;
									} else {
										arg3.position(var42);
										var16[var20] += arg3.getFloat() * (1.0F - var32);
										arg3.position(var43);
										var16[var20] += arg3.getFloat() * var33;
									}
									var20++;
									var42 += arg7;
									var43 += arg7;
								}
								var41++;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
								var16[var20] += var44 * var31;
							} else {
								var16[var20] += arg3.getFloat() * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				} else if (var29 > var28) {
					float var30 = var33 - var32;
					var15 = (1.0F - var34) * var30;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
							var16[var20] += var44 * var15;
						} else {
							var16[var20] += arg3.getFloat() * var15;
						}
						var20++;
						var24 += arg7;
					}
					var41 = var28 + 1;
					label267: while (true) {
						if (var41 >= var29) {
							var15 = var30 * var35;
							var22 += arg8;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label267;
								}
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
									var16[var20] += var44 * var15;
								} else {
									var16[var20] += arg3.getFloat() * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg8;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
								var16[var20] += var44 * var30;
							} else {
								var16[var20] += arg3.getFloat() * var30;
							}
							var20++;
							var24 += arg7;
						}
						var41++;
					}
				} else if (var27 <= var26) {
					var15 = (var35 - var34) * (var33 - var32);
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
							var16[var20] += var44 * var15;
						} else {
							var16[var20] += arg3.getFloat() * var15;
						}
						var20++;
						var24 += arg7;
					}
				} else {
					var31 = var35 - var34;
					var15 = (1.0F - var32) * var31;
					var22 = var21 + var28 * arg8;
					var20 = 0;
					var24 = var22;
					while (var20 < arg0) {
						arg3.position(var24);
						if (arg10) {
							var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
							var16[var20] += var44 * var15;
						} else {
							var16[var20] += arg3.getFloat() * var15;
						}
						var20++;
						var24 += arg7;
					}
					var40 = var26 + 1;
					label284: while (true) {
						if (var40 >= var27) {
							var22 += arg9;
							var15 = var31 * var33;
							var20 = 0;
							var24 = var22;
							while (true) {
								if (var20 >= arg0) {
									break label284;
								}
								arg3.position(var24);
								if (arg10) {
									var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
									var16[var20] += var44 * var15;
								} else {
									var16[var20] += arg3.getFloat() * var15;
								}
								var20++;
								var24 += arg7;
							}
						}
						var22 += arg9;
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
								var16[var20] += var44 * var31;
							} else {
								var16[var20] += arg3.getFloat() * var31;
							}
							var20++;
							var24 += arg7;
						}
						var40++;
					}
				}
				int var23 = var21 + arg9 + (var28 + 1) * arg8;
				for (var41 = var28 + 1; var41 < var29; var41++) {
					var22 = var23;
					for (var40 = var26 + 1; var40 < var27; var40++) {
						var20 = 0;
						var24 = var22;
						while (var20 < arg0) {
							arg3.position(var24);
							if (arg10) {
								var44 = Mipmap.GLU_SWAP_4_BYTES(arg3.getFloat());
								var16[var20] += var44;
							} else {
								var16[var20] += arg3.getFloat();
							}
							var20++;
							var24 += arg7;
						}
						var22 += arg9;
					}
					var23 += arg8;
				}
				int var25 = (var19 + var18 * arg4) * arg0;
				for (var20 = 0; var20 < arg0; var20++) {
					arg6.position(var25 + var20);
					arg6.put(var16[var20] / var17);
				}
				var26 = var27;
				var32 = var33;
				var27 += var39;
				var33 += var37;
				if (var33 > 1.0F) {
					var33--;
					var27++;
				}
				if (var27 > arg1 - 1) {
					int var45 = var27 + 1 - arg1;
					var26 -= var45;
					var27 -= var45;
				}
			}
			var28 = var29;
			var34 = var35;
			var29 += var38;
			var35 += var36;
			if (var35 > 1.0F) {
				var35--;
				var29++;
			}
		}
	}

	public static void scaleInternalPackedPixel(int arg0, Extract arg1, int arg2, int arg3, ByteBuffer arg4, int arg5, int arg6, ByteBuffer arg7, int arg8, int arg9, boolean arg10) {
		float[] var16 = new float[4];
		float[] var17 = new float[4];
		float[] var18 = new float[4];
		float[] var19 = new float[4];
		int var28 = 0;
		if (arg2 == arg5 * 2 && arg3 == arg6 * 2) {
			HalveImage.halveImagePackedPixel(arg0, arg1, arg2, arg3, arg4, arg7, arg8, arg9, arg10);
			return;
		}
		float var14 = (float) arg3 / (float) arg6;
		float var12 = (float) arg2 / (float) arg5;
		int var41 = (int) Math.floor((double) var14);
		float var39 = var14 - (float) var41;
		int var42 = (int) Math.floor((double) var12);
		float var40 = var12 - (float) var42;
		float var20 = var12 * var14;
		int var31 = 0;
		float var37 = 0.0F;
		int var32 = var41;
		float var38 = var40;
		for (int var21 = 0; var21 < arg6; var21++) {
			if (var32 >= arg3) {
				var32 = arg3 - 1;
			}
			int var29 = 0;
			float var35 = 0.0F;
			int var30 = var42;
			float var36 = var40;
			for (int var22 = 0; var22 < arg5; var22++) {
				var16[0] = var16[1] = var16[2] = var16[3] = 0.0F;
				int var24 = var29 * arg8;
				float var15;
				int var23;
				int var25;
				float var34;
				int var43;
				int var44;
				if (var32 > var31 && var30 > var29) {
					var34 = 1.0F - var37;
					var25 = var24 + var31 * arg9;
					var15 = var34 * (1.0F - var35);
					arg4.position(var25);
					arg1.extract(arg10, arg4, var17);
					for (var23 = 0; var23 < arg0; var23++) {
						var16[var23] += var17[var23] * var15;
					}
					int var45 = var25;
					var43 = var29 + 1;
					label181: while (true) {
						if (var43 >= var30) {
							var25 += arg8;
							int var46 = var25;
							var15 = var34 * var36;
							arg4.position(var25);
							arg1.extract(arg10, arg4, var17);
							for (var23 = 0; var23 < arg0; var23++) {
								var16[var23] += var17[var23] * var15;
							}
							var34 = var38;
							var15 = var38 * (1.0F - var35);
							var25 = var24 + var32 * arg9;
							arg4.position(var25);
							arg1.extract(arg10, arg4, var17);
							for (var23 = 0; var23 < arg0; var23++) {
								var16[var23] += var17[var23] * var15;
							}
							for (var43 = var29 + 1; var43 < var30; var43++) {
								var25 += arg8;
								arg4.position(var25);
								arg1.extract(arg10, arg4, var17);
								for (var23 = 0; var23 < arg0; var23++) {
									var16[var23] += var17[var23] * var34;
								}
							}
							var25 += arg8;
							var15 = var34 * var36;
							arg4.position(var25);
							for (var23 = 0; var23 < arg0; var23++) {
								var16[var23] += var17[var23] * var15;
							}
							var44 = var31 + 1;
							while (true) {
								if (var44 >= var32) {
									break label181;
								}
								var45 += arg9;
								var46 += arg9;
								arg4.position(var45);
								arg1.extract(arg10, arg4, var17);
								arg4.position(var46);
								arg1.extract(arg10, arg4, var18);
								for (var23 = 0; var23 < arg0; var23++) {
									var16[var23] += var17[var23] * (1.0F - var35) + var18[var23] * var36;
								}
								var44++;
							}
						}
						var25 += arg8;
						arg4.position(var25);
						arg1.extract(arg10, arg4, var17);
						for (var23 = 0; var23 < arg0; var23++) {
							var16[var23] += var17[var23] * var34;
						}
						var43++;
					}
				} else if (var32 > var31) {
					float var33 = var36 - var35;
					var15 = (1.0F - var37) * var33;
					var25 = var24 + var31 * arg9;
					arg4.position(var25);
					arg1.extract(arg10, arg4, var17);
					for (var23 = 0; var23 < arg0; var23++) {
						var16[var23] += var17[var23] * var15;
					}
					var44 = var31 + 1;
					label198: while (true) {
						if (var44 >= var32) {
							var15 = var33 * var38;
							var25 += arg9;
							arg4.position(var25);
							arg1.extract(arg10, arg4, var17);
							var23 = 0;
							while (true) {
								if (var23 >= arg0) {
									break label198;
								}
								var16[var23] += var17[var23] * var15;
								var23++;
							}
						}
						var25 += arg9;
						arg4.position(var25);
						arg1.extract(arg10, arg4, var17);
						for (var23 = 0; var23 < arg0; var23++) {
							var16[var23] += var17[var23] * var33;
						}
						var44++;
					}
				} else if (var30 <= var29) {
					var15 = (var38 - var37) * (var36 - var35);
					var25 = var24 + var31 * arg9;
					arg4.position(var25);
					arg1.extract(arg10, arg4, var17);
					for (var23 = 0; var23 < arg0; var23++) {
						var16[var23] += var17[var23] * var15;
					}
				} else {
					var34 = var38 - var37;
					var15 = (1.0F - var35) * var34;
					var25 = var24 + var31 * arg9;
					arg4.position(var25);
					arg1.extract(arg10, arg4, var17);
					for (var23 = 0; var23 < arg0; var23++) {
						var16[var23] += var17[var23] * var15;
					}
					var43 = var29 + 1;
					label215: while (true) {
						if (var43 >= var30) {
							var25 += arg8;
							var15 = var34 * var36;
							arg4.position(var25);
							arg1.extract(arg10, arg4, var17);
							var23 = 0;
							while (true) {
								if (var23 >= arg0) {
									break label215;
								}
								var16[var23] += var17[var23] * var15;
								var23++;
							}
						}
						var25 += arg8;
						arg4.position(var25);
						arg1.extract(arg10, arg4, var17);
						for (var23 = 0; var23 < arg0; var23++) {
							var16[var23] += var17[var23] * var34;
						}
						var43++;
					}
				}
				int var26 = var24 + arg8 + (var31 + 1) * arg9;
				for (var44 = var31 + 1; var44 < var32; var44++) {
					var25 = var26;
					for (var43 = var29 + 1; var43 < var30; var43++) {
						arg4.position(var25);
						arg1.extract(arg10, arg4, var17);
						for (var23 = 0; var23 < arg0; var23++) {
							var16[var23] += var17[var23] * var15;
						}
						var25 += arg8;
					}
					var26 += arg9;
				}
				var28 = var22 + var21 * arg5;
				for (var23 = 0; var23 < arg0; var23++) {
					var19[var23] = var16[var23] / var20;
				}
				arg1.shove(var19, var28, arg7);
				var29 = var30;
				var35 = var36;
				var30 += var42;
				var36 += var40;
				if (var36 > 1.0F) {
					var36--;
					var30++;
				}
				if (var30 > arg2 - 1) {
					int var47 = var30 + 1 - arg2;
					var29 -= var47;
					var30 -= var47;
				}
			}
			var31 = var32;
			var37 = var38;
			var32 += var41;
			var38 += var39;
			if (var38 > 1.0F) {
				var38--;
				var32++;
			}
		}
		assert var28 == arg5 * arg6 - 1;
	}
}
