package com.sun.opengl.impl.mipmap;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class Image {

	public static void fill_image(PixelStorageModes arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, ByteBuffer arg6, ShortBuffer arg7) {
		int var16 = 0;
		Object var22 = null;
		switch(arg4) {
			case 32818:
				var22 = new Extract332();
				break;
			case 32819:
				var22 = new Extract4444();
				break;
			case 32820:
				var22 = new Extract5551();
				break;
			case 32821:
				var22 = new Extract8888();
				break;
			case 32822:
				var22 = new Extract1010102();
				break;
			case 33634:
				var22 = new Extract233rev();
				break;
			case 33635:
				var22 = new Extract565();
				break;
			case 33636:
				var22 = new Extract565rev();
				break;
			case 33637:
				var22 = new Extract4444rev();
				break;
			case 33638:
				var22 = new Extract1555rev();
				break;
			case 33639:
				var22 = new Extract8888rev();
				break;
			case 33640:
				var22 = new Extract2101010rev();
		}
		boolean var21 = arg0.getUnpackSwapBytes();
		int var8 = Mipmap.elements_per_group(arg3, arg4);
		int var12;
		if (arg0.getUnpackRowLength() > 0) {
			var12 = arg0.getUnpackRowLength();
		} else {
			var12 = arg1;
		}
		int var10;
		int var11;
		int var14;
		int var15;
		int var17;
		int var18;
		int var19;
		if (arg4 == 6656) {
			var10 = (var12 * var8 + 7) / 8;
			var11 = var10 % arg0.getUnpackAlignment();
			if (var11 != 0) {
				var10 += arg0.getUnpackAlignment() - var11;
			}
			var15 = arg0.getUnpackSkipRows() * var10 + arg0.getUnpackSkipPixels() * var8 / 8;
			var14 = arg1 * var8;
			var17 = 0;
			for (var18 = 0; var18 < arg2; var18++) {
				var16 = var15;
				arg6.position(var15);
				int var23 = arg0.getUnpackSkipPixels() * var8 % 8;
				for (var19 = 0; var19 < var14; var19++) {
					int var24;
					if (arg0.getUnpackLsbFirst()) {
						arg6.position(var16);
						var24 = arg6.get() & 0xFF & 0x1 << var23;
					} else {
						var24 = arg6.get() & 0xFF & 0x1 << 7 - var23;
					}
					if (var24 == 0) {
						arg7.position(var17);
						arg7.put((short) 0);
					} else if (arg5) {
						arg7.position(var17);
						arg7.put((short) 1);
					} else {
						arg7.position(var17);
						arg7.put((short) -1);
					}
					var23++;
					if (var23 == 8) {
						var23 = 0;
						var16++;
					}
					var17++;
				}
				var15 += var10;
			}
			return;
		}
		int var9 = Mipmap.bytes_per_element(arg4);
		int var13 = var9 * var8;
		if (var9 == 1) {
			var21 = false;
		}
		var10 = var12 * var13;
		var11 = var10 % arg0.getUnpackAlignment();
		if (var11 != 0) {
			var10 += arg0.getUnpackAlignment() - var11;
		}
		var15 = arg0.getUnpackSkipRows() * var10 + arg0.getUnpackSkipPixels() * var13;
		var14 = arg1 * var8;
		var17 = 0;
		for (var18 = 0; var18 < arg2; var18++) {
			var16 = var15;
			arg6.position(var15);
			for (var19 = 0; var19 < var14; var19++) {
				Type_Widget var25 = new Type_Widget();
				float[] var26 = new float[4];
				arg6.position(var16);
				int var20;
				label219: switch(arg4) {
					case 5120:
						if (arg5) {
							arg7.put(var17++, (short) arg6.get());
						} else {
							arg7.put(var17++, (short) (arg6.get() * 516));
						}
						break;
					case 5121:
						if (arg5) {
							arg7.put(var17++, (short) (arg6.get() & 0xFF));
						} else {
							arg7.put(var17++, (short) (arg6.get() * 257 & 0xFF));
						}
						break;
					case 5122:
					case 5123:
						if (var21) {
							var25.setUB1(arg6.get());
							var25.setUB0(arg6.get());
						} else {
							var25.setUB0(arg6.get());
							var25.setUB1(arg6.get());
						}
						if (arg4 != 5122) {
							arg7.put(var17++, var25.getUS0());
						} else if (arg5) {
							arg7.put(var17++, var25.getS0());
						} else {
							arg7.put(var17++, (short) (var25.getS0() * 2));
						}
						break;
					case 5124:
					case 5125:
					case 5126:
						if (var21) {
							var25.setUB3(arg6.get());
							var25.setUB2(arg6.get());
							var25.setUB1(arg6.get());
							var25.setUB0(arg6.get());
						} else {
							var25.setUB0(arg6.get());
							var25.setUB1(arg6.get());
							var25.setUB2(arg6.get());
							var25.setUB3(arg6.get());
						}
						if (arg4 == 5126) {
							if (arg5) {
								arg7.put(var17++, (short) var25.getF());
							} else {
								arg7.put(var17++, (short) (var25.getF() * 65535.0F));
							}
						} else if (arg4 == 5125) {
							if (arg5) {
								arg7.put(var17++, (short) var25.getUI());
							} else {
								arg7.put(var17++, (short) (var25.getUI() >> 16));
							}
						} else if (arg5) {
							arg7.put(var17++, (short) var25.getI());
						} else {
							arg7.put(var17++, (short) (var25.getI() >> 15));
						}
						break;
					case 32818:
						((Extract) var22).extract(false, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 3) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 32819:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 32820:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 32821:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 32822:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33634:
						((Extract) var22).extract(false, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 3) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33635:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 3) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33636:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 3) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33637:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33638:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33639:
						((Extract) var22).extract(var21, arg6, var26);
						var20 = 0;
						while (true) {
							if (var20 >= 4) {
								break label219;
							}
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
							var20++;
						}
					case 33640:
						((Extract) var22).extract(var21, arg6, var26);
						for (var20 = 0; var20 < 4; var20++) {
							arg7.put(var17++, (short) (var26[var20] * 65535.0F));
						}
				}
				var16 += var9;
			}
			var15 += var10;
			var16 = var15;
		}
		if (Mipmap.isTypePackedPixel(arg4)) {
			assert var17 == arg1 * arg2 * Mipmap.elements_per_group(arg3, 0);
		} else {
			assert var17 == arg1 * arg2 * var8;
		}
		assert var16 == var10 * arg2 + arg0.getUnpackSkipRows() * var10 + arg0.getUnpackSkipPixels() * var13;
	}
}
