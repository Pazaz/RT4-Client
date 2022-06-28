package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Rasteriser {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public static int centerY;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!m;")
	public static TextureProvider textureProvider;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public static int screenLowerX;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public static int screenUpperX;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public static int screenLowerY;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public static int screenUpperY;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	private static int height;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public static int centerX;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	public static int width;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
	public static final int[] palette = new int[65536];

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	private static int[] offsets = new int[1024];

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Z")
	public static boolean textureHasTransparency = false;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Z")
	private static boolean opaque = false;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Z")
	public static boolean jagged = true;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Z")
	private static boolean lowDetail = false;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "F")
	private static float brightness = 1.0F;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
	public static boolean testX = false;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public static int alpha = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
	public static void prepare() {
		prepareOffsets(SoftwareRaster.clipLeft, SoftwareRaster.clipTop, SoftwareRaster.clipRight, SoftwareRaster.clipBottom);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void fillTexturedTriangle(@OriginalArg(0) int yA, @OriginalArg(1) int yB, @OriginalArg(2) int yC, @OriginalArg(3) int xA, @OriginalArg(4) int xB, @OriginalArg(5) int xC, @OriginalArg(6) int colorA, @OriginalArg(7) int colorB, @OriginalArg(8) int colorC, @OriginalArg(9) int viewXA, @OriginalArg(10) int viewXB, @OriginalArg(11) int viewXC, @OriginalArg(12) int viewYA, @OriginalArg(13) int viewYB, @OriginalArg(14) int viewYC, @OriginalArg(15) int viewZA, @OriginalArg(16) int viewZB, @OriginalArg(17) int viewZC, @OriginalArg(18) int textureId) {
		@Pc(5) int[] texels = textureProvider.method3232(textureId, brightness);
		if (texels == null) {
			int averageColor = textureProvider.getAverageColor(textureId);
			fillGouraudTriangle(yA, yB, yC, xA, xB, xC, ColorUtils.multiplyLightness(averageColor, colorA), ColorUtils.multiplyLightness(averageColor, colorB), ColorUtils.multiplyLightness(averageColor, colorC));
			return;
		}

		lowDetail = textureProvider.isLowDetail(textureId);
		opaque = textureProvider.isOpaque(textureId);
		@Pc(12) int dxAB = xB - xA;
		@Pc(47) int dyAB = yB - yA;
		@Pc(51) int dxAC = xC - xA;
		@Pc(55) int dyAC = yC - yA;
		@Pc(59) int colorStepAB = colorB - colorA;
		@Pc(63) int colorStepAC = colorC - colorA;

		@Pc(65) int xStepAB = 0;
		if (yB != yA) {
			xStepAB = (xB - xA << 16) / (yB - yA);
		}

		@Pc(80) int xStepBC = 0;
		if (yC != yB) {
			xStepBC = (xC - xB << 16) / (yC - yB);
		}

		@Pc(95) int xStepAC = 0;
		if (yC != yA) {
			xStepAC = (xA - xC << 16) / (yA - yC);
		}

		@Pc(116) int length = dxAB * dyAC - dxAC * dyAB;
		if (length == 0) {
			return;
		}

		@Pc(131) int colorStepA = (colorStepAB * dyAC - colorStepAC * dyAB << 9) / length;
		@Pc(143) int colorStepB = (colorStepAC * dxAB - colorStepAB * dxAC << 9) / length;

		@Pc(147) int local147 = viewXA - viewXB;
		@Pc(151) int local151 = viewYA - viewYB;
		@Pc(155) int local155 = viewZA - viewZB;

		@Pc(159) int local159 = viewXC - viewXA;
		@Pc(163) int local163 = viewYC - viewYA;
		@Pc(167) int local167 = viewZC - viewZA;

		@Pc(177) int local177 = local159 * viewYA - local163 * viewXA << 14;
		@Pc(187) int local187 = local163 * viewZA - local167 * viewYA << 5;
		@Pc(197) int local197 = local167 * viewXA - local159 * viewZA << 5;

		@Pc(207) int local207 = local147 * viewYA - local151 * viewXA << 14;
		@Pc(217) int local217 = local151 * viewZA - local155 * viewYA << 5;
		@Pc(227) int local227 = local155 * viewXA - local147 * viewZA << 5;

		@Pc(237) int local237 = local151 * local159 - local147 * local163 << 14;
		@Pc(247) int local247 = local155 * local163 - local151 * local167 << 5;
		@Pc(257) int local257 = local147 * local167 - local155 * local159 << 5;
		@Pc(336) int local336;

		if (yA <= yB && yA <= yC) {
			if (yA < height) {
				if (yB > height) {
					yB = height;
				}

				if (yC > height) {
					yC = height;
				}

				colorA = (colorA << 9) + colorStepA - colorStepA * xA;
				if (yB < yC) {
					xC = xA <<= 0x10;
					if (yA < 0) {
						xC -= xStepAC * yA;
						xA -= xStepAB * yA;
						colorA -= colorStepB * yA;
						yA = 0;
					}

					xB <<= 0x10;
					if (yB < 0) {
						xB -= xStepBC * yB;
						yB = 0;
					}

					local336 = yA - centerY;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (yA != yB && xStepAC < xStepAB || yA == yB && xStepAC > xStepBC) {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xC >> 16, xB >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
									xC += xStepAC;
									xB += xStepBC;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xC >> 16, xA >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
							xC += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xB >> 16, xC >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
									xC += xStepAC;
									xB += xStepBC;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xA >> 16, xC >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
							xC += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					xB = xA <<= 0x10;
					if (yA < 0) {
						xB -= xStepAC * yA;
						xA -= xStepAB * yA;
						colorA -= colorStepB * yA;
						yA = 0;
					}

					xC <<= 0x10;
					if (yC < 0) {
						xC -= xStepBC * yC;
						yC = 0;
					}

					local336 = yA - centerY;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if ((yA == yC || xStepAC >= xStepAB) && (yA != yC || xStepBC <= xStepAB)) {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}
									drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xA >> 16, xC >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
									xC += xStepBC;
									xA += xStepAB;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xA >> 16, xB >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
							xB += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xC >> 16, xA >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
									xC += xStepBC;
									xA += xStepAB;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yA, xB >> 16, xA >> 16, colorA, colorStepA, local177, local207, local237, local187, local217, local247);
							xB += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (yB <= yC) {
			if (yB < height) {
				if (yC > height) {
					yC = height;
				}

				if (yA > height) {
					yA = height;
				}

				colorB = (colorB << 9) + colorStepA - colorStepA * xB;
				if (yC < yA) {
					xA = xB <<= 0x10;
					if (yB < 0) {
						xA -= xStepAB * yB;
						xB -= xStepBC * yB;
						colorB -= colorStepB * yB;
						yB = 0;
					}

					xC <<= 0x10;
					if (yC < 0) {
						xC -= xStepAC * yC;
						yC = 0;
					}

					local336 = yB - centerY;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (yB != yC && xStepAB < xStepBC || yB == yC && xStepAB > xStepAC) {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xA >> 16, xC >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
									xA += xStepAB;
									xC += xStepAC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xA >> 16, xB >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
							xA += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xC >> 16, xA >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
									xA += xStepAB;
									xC += xStepAC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xB >> 16, xA >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
							xA += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					xC = xB <<= 0x10;
					if (yB < 0) {
						xC -= xStepAB * yB;
						xB -= xStepBC * yB;
						colorB -= colorStepB * yB;
						yB = 0;
					}

					xA <<= 0x10;
					if (yA < 0) {
						xA -= xStepAC * yA;
						yA = 0;
					}

					local336 = yB - centerY;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (xStepAB < xStepBC) {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xA >> 16, xB >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
									xA += xStepAC;
									xB += xStepBC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xC >> 16, xB >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
							xC += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xB >> 16, xA >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
									xA += xStepAC;
									xB += xStepBC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}

							drawTexturedScanline(SoftwareRaster.pixels, texels, yB, xB >> 16, xC >> 16, colorB, colorStepA, local177, local207, local237, local187, local217, local247);
							xC += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (yC < height) {
			if (yA > height) {
				yA = height;
			}

			if (yB > height) {
				yB = height;
			}

			colorC = (colorC << 9) + colorStepA - colorStepA * xC;
			if (yA < yB) {
				xB = xC <<= 0x10;
				if (yC < 0) {
					xB -= xStepBC * yC;
					xC -= xStepAC * yC;
					colorC -= colorStepB * yC;
					yC = 0;
				}

				xA <<= 0x10;
				if (yA < 0) {
					xA -= xStepAB * yA;
					yA = 0;
				}

				local336 = yC - centerY;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (xStepBC < xStepAC) {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xB >> 16, xA >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
								xB += xStepBC;
								xA += xStepAB;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}

						drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xB >> 16, xC >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
						xB += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xA >> 16, xB >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
								xB += xStepBC;
								xA += xStepAB;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}

						drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xC >> 16, xB >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
						xB += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			} else {
				xA = xC <<= 0x10;
				if (yC < 0) {
					xA -= xStepBC * yC;
					xC -= xStepAC * yC;
					colorC -= colorStepB * yC;
					yC = 0;
				}

				xB <<= 0x10;
				if (yB < 0) {
					xB -= xStepAB * yB;
					yB = 0;
				}

				local336 = yC - centerY;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (xStepBC < xStepAC) {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xB >> 16, xC >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
								xB += xStepAB;
								xC += xStepAC;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}

						drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xA >> 16, xC >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
						xA += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xC >> 16, xB >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
								xB += xStepAB;
								xC += xStepAC;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}

						drawTexturedScanline(SoftwareRaster.pixels, texels, yC, xC >> 16, xA >> 16, colorC, colorStepA, local177, local207, local237, local187, local217, local247);
						xA += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(F)V")
	public static void setBrightness(@OriginalArg(0) float brightness) {
		randBrightness(brightness);
		calculateBrightness();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void fillTexturedAlphaTriangle(@OriginalArg(0) int yA, @OriginalArg(1) int yB, @OriginalArg(2) int yC, @OriginalArg(3) int xA, @OriginalArg(4) int xB, @OriginalArg(5) int xC, @OriginalArg(6) int colorA, @OriginalArg(7) int colorB, @OriginalArg(8) int colorC, @OriginalArg(9) int viewXA, @OriginalArg(10) int viewXB, @OriginalArg(11) int viewXC, @OriginalArg(12) int viewYA, @OriginalArg(13) int viewYB, @OriginalArg(14) int viewYC, @OriginalArg(15) int viewZA, @OriginalArg(16) int viewZB, @OriginalArg(17) int viewZC, @OriginalArg(18) int textureId) {
		@Pc(5) int[] texels = textureProvider.method3232(textureId, brightness);
		if (texels == null || alpha > 10) {
			int average = textureProvider.getAverageColor(textureId);
			textureHasTransparency = true;
			fillGouraudTriangle(yA, yB, yC, xA, xB, xC, ColorUtils.multiplyLightness(average, colorA), ColorUtils.multiplyLightness(average, colorB), ColorUtils.multiplyLightness(average, colorC));
			return;
		}

		lowDetail = textureProvider.isLowDetail(textureId);
		opaque = textureProvider.isOpaque(textureId);
		@Pc(15) int dxAB = xB - xA;
		@Pc(52) int dyAB = yB - yA;
		@Pc(56) int dxAC = xC - xA;
		@Pc(60) int dyAC = yC - yA;
		@Pc(64) int colorStepAB = colorB - colorA;
		@Pc(68) int colorStepAC = colorC - colorA;

		@Pc(70) int xStepAB = 0;
		if (yB != yA) {
			xStepAB = (xB - xA << 16) / (yB - yA);
		}

		@Pc(85) int xStepBC = 0;
		if (yC != yB) {
			xStepBC = (xC - xB << 16) / (yC - yB);
		}

		@Pc(100) int xStepAC = 0;
		if (yC != yA) {
			xStepAC = (xA - xC << 16) / (yA - yC);
		}

		@Pc(121) int length = dxAB * dyAC - dxAC * dyAB;
		if (length == 0) {
			return;
		}

		@Pc(136) int colorStepA = (colorStepAB * dyAC - colorStepAC * dyAB << 9) / length;
		@Pc(148) int colorStepB = (colorStepAC * dxAB - colorStepAB * dxAC << 9) / length;

		@Pc(152) int local152 = viewXA - viewXB;
		@Pc(156) int local156 = viewYA - viewYB;
		@Pc(160) int local160 = viewZA - viewZB;

		@Pc(164) int local164 = viewXC - viewXA;
		@Pc(168) int local168 = viewYC - viewYA;
		@Pc(172) int local172 = viewZC - viewZA;

		@Pc(182) int local182 = local164 * viewYA - local168 * viewXA << 14;
		@Pc(192) int local192 = local168 * viewZA - local172 * viewYA << 8;
		@Pc(202) int local202 = local172 * viewXA - local164 * viewZA << 5;
		@Pc(212) int local212 = local152 * viewYA - local156 * viewXA << 14;
		@Pc(222) int local222 = local156 * viewZA - local160 * viewYA << 8;
		@Pc(232) int local232 = local160 * viewXA - local152 * viewZA << 5;
		@Pc(242) int local242 = local156 * local164 - local152 * local168 << 14;
		@Pc(252) int local252 = local160 * local168 - local156 * local172 << 8;
		@Pc(262) int local262 = local152 * local172 - local160 * local164 << 5;
		@Pc(341) int local341;

		if (yA <= yB && yA <= yC) {
			if (yA < height) {
				if (yB > height) {
					yB = height;
				}
				if (yC > height) {
					yC = height;
				}

				colorA = (colorA << 9) + colorStepA - colorStepA * xA;
				if (yB < yC) {
					xC = xA <<= 0x10;
					if (yA < 0) {
						xC -= xStepAC * yA;
						xA -= xStepAB * yA;
						colorA -= colorStepB * yA;
						yA = 0;
					}

					xB <<= 0x10;
					if (yB < 0) {
						xB -= xStepBC * yB;
						yB = 0;
					}

					local341 = yA - centerY;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if (yA != yB && xStepAC < xStepAB || yA == yB && xStepAC > xStepBC) {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xC >> 16, xB >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
									xC += xStepAC;
									xB += xStepBC;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xC >> 16, xA >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
							xC += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xB >> 16, xC >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
									xC += xStepAC;
									xB += xStepBC;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xA >> 16, xC >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
							xC += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				} else {
					xB = xA <<= 0x10;
					if (yA < 0) {
						xB -= xStepAC * yA;
						xA -= xStepAB * yA;
						colorA -= colorStepB * yA;
						yA = 0;
					}

					xC <<= 0x10;
					if (yC < 0) {
						xC -= xStepBC * yC;
						yC = 0;
					}

					local341 = yA - centerY;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if ((yA == yC || xStepAC >= xStepAB) && (yA != yC || xStepBC <= xStepAB)) {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xA >> 16, xC >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
									xC += xStepBC;
									xA += xStepAB;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xA >> 16, xB >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
							xB += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xC >> 16, xA >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
									xC += xStepBC;
									xA += xStepAB;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yA, xB >> 16, xA >> 16, colorA, colorStepA, local182, local212, local242, local192, local222, local252);
							xB += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				}
			}
		} else if (yB <= yC) {
			if (yB < height) {
				if (yC > height) {
					yC = height;
				}
				if (yA > height) {
					yA = height;
				}

				colorB = (colorB << 9) + colorStepA - colorStepA * xB;
				if (yC < yA) {
					xA = xB <<= 0x10;
					if (yB < 0) {
						xA -= xStepAB * yB;
						xB -= xStepBC * yB;
						colorB -= colorStepB * yB;
						yB = 0;
					}
					xC <<= 0x10;
					if (yC < 0) {
						xC -= xStepAC * yC;
						yC = 0;
					}

					local341 = yB - centerY;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if (yB != yC && xStepAB < xStepBC || yB == yC && xStepAB > xStepAC) {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xA >> 16, xC >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
									xA += xStepAB;
									xC += xStepAC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xA >> 16, xB >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
							xA += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xC >> 16, xA >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
									xA += xStepAB;
									xC += xStepAC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xB >> 16, xA >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
							xA += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				} else {
					xC = xB <<= 0x10;
					if (yB < 0) {
						xC -= xStepAB * yB;
						xB -= xStepBC * yB;
						colorB -= colorStepB * yB;
						yB = 0;
					}

					xA <<= 0x10;
					if (yA < 0) {
						xA -= xStepAC * yA;
						yA = 0;
					}

					local341 = yB - centerY;
					local182 += local202 * local341;
					local212 += local232 * local341;
					local242 += local262 * local341;
					if (xStepAB < xStepBC) {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xA >> 16, xB >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
									xA += xStepAC;
									xB += xStepBC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xC >> 16, xB >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
							xC += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					} else {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xB >> 16, xA >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
									xA += xStepAC;
									xB += xStepBC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
									local182 += local202;
									local212 += local232;
									local242 += local262;
								}
							}

							drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yB, xB >> 16, xC >> 16, colorB, colorStepA, local182, local212, local242, local192, local222, local252);
							xC += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
							local182 += local202;
							local212 += local232;
							local242 += local262;
						}
					}
				}
			}
		} else if (yC < height) {
			if (yA > height) {
				yA = height;
			}
			if (yB > height) {
				yB = height;
			}

			colorC = (colorC << 9) + colorStepA - colorStepA * xC;
			if (yA < yB) {
				xB = xC <<= 0x10;
				if (yC < 0) {
					xB -= xStepBC * yC;
					xC -= xStepAC * yC;
					colorC -= colorStepB * yC;
					yC = 0;
				}
				xA <<= 0x10;
				if (yA < 0) {
					xA -= xStepAB * yA;
					yA = 0;
				}

				local341 = yC - centerY;
				local182 += local202 * local341;
				local212 += local232 * local341;
				local242 += local262 * local341;
				if (xStepBC < xStepAC) {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xB >> 16, xA >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
								xB += xStepBC;
								xA += xStepAB;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}

						drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xB >> 16, xC >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
						xB += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				} else {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xA >> 16, xB >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
								xB += xStepBC;
								xA += xStepAB;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}

						drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xC >> 16, xB >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
						xB += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				}
			} else {
				xA = xC <<= 0x10;
				if (yC < 0) {
					xA -= xStepBC * yC;
					xC -= xStepAC * yC;
					colorC -= colorStepB * yC;
					yC = 0;
				}

				xB <<= 0x10;
				if (yB < 0) {
					xB -= xStepAB * yB;
					yB = 0;
				}

				local341 = yC - centerY;
				local182 += local202 * local341;
				local212 += local232 * local341;
				local242 += local262 * local341;
				if (xStepBC < xStepAC) {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xB >> 16, xC >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
								xB += xStepAB;
								xC += xStepAC;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}

						drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xA >> 16, xC >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
						xA += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				} else {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xC >> 16, xB >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
								xB += xStepAB;
								xC += xStepAC;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
								local182 += local202;
								local212 += local232;
								local242 += local262;
							}
						}

						drawTexturedAlphaScanline(SoftwareRaster.pixels, texels, yC, xC >> 16, xA >> 16, colorC, colorStepA, local182, local212, local242, local192, local222, local252);
						xA += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
						local182 += local202;
						local212 += local232;
						local242 += local262;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()I")
	public static int getOffsetRemainder() {
		return offsets[0] % SoftwareRaster.width;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!m;)V")
	public static void unpackTextures(@OriginalArg(0) TextureProvider provider) {
		textureProvider = provider;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()V")
	public static void prepareOffsets() {
		centerX = width / 2;
		centerY = height / 2;
		screenLowerX = -centerX;
		screenUpperX = width - centerX;
		screenLowerY = -centerY;
		screenUpperY = height - centerY;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void drawTexturedAlphaScanline(@OriginalArg(0) int[] dst, @OriginalArg(1) int[] texels, @OriginalArg(4) int offset, @OriginalArg(5) int xA, @OriginalArg(6) int xB, @OriginalArg(7) int lightnessA, @OriginalArg(8) int lightnessB, @OriginalArg(9) int verticalA, @OriginalArg(10) int verticalB, @OriginalArg(11) int verticalC, @OriginalArg(12) int horizontalA, @OriginalArg(13) int horizontalB, @OriginalArg(14) int horizontalC) {
		if (testX) {
			if (xB > width) {
				xB = width;
			}

			if (xA < 0) {
				xA = 0;
			}
		}

		if (xA >= xB) {
			return;
		}

		offset += xA;
		lightnessA += lightnessB * xA;

		@Pc(28) int length = xB - xA;
		@Pc(140) int lightness;
		@Pc(128) int uvStep;
		@Pc(68) int uA;
		@Pc(72) int vA;
		@Pc(99) int uB;
		@Pc(103) int vB;
		@Pc(62) int c;
		@Pc(34) int delta;
		@Pc(154) int color;
		@Pc(114) int uv;

		if (!lowDetail) {
			delta = xA - centerX;
			verticalA += (horizontalA >> 3) * delta;
			verticalB += (horizontalB >> 3) * delta;
			verticalC += (horizontalC >> 3) * delta;

			c = verticalC >> 14;
			if (c == 0) {
				uA = 0;
				vA = 0;
			} else {
				uA = verticalA / c;
				vA = verticalB / c;
			}

			verticalA = verticalA + horizontalA;
			verticalB = verticalB + horizontalB;
			verticalC = verticalC + horizontalC;
			c = verticalC >> 14;
			if (c == 0) {
				uB = 0;
				vB = 0;
			} else {
				uB = verticalA / c;
				vB = verticalB / c;
			}

			uv = (uA << 18) + vA;
			uvStep = (uB - uA >> 3 << 18) + (vB - vA >> 3);
			length >>= 3;
			lightnessB <<= 3;
			lightness = lightnessA >> 8;
			if (opaque) {
				if (length > 0) {
					do {
						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;

						uA = uB;
						vA = vB;

						verticalA += horizontalA;
						verticalB += horizontalB;
						verticalC += horizontalC;

						c = verticalC >> 14;
						if (c == 0) {
							uB = 0;
							vB = 0;
						} else {
							uB = verticalA / c;
							vB = verticalB / c;
						}

						uv = (uA << 18) + vA;
						uvStep = (uB - uA >> 3 << 18) + (vB - vA >> 3);
						lightnessA += lightnessB;
						lightness = lightnessA >> 8;
						length--;
					} while (length > 0);
				}

				length = xB - xA & 0x7;
				if (length > 0) {
					do {
						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;
						length--;
					} while (length > 0);
				}
			} else {
				if (length > 0) {
					do {
						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;

						uv += uvStep;
						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;

						uA = uB;
						vA = vB;
						verticalA += horizontalA;
						verticalB += horizontalB;
						verticalC += horizontalC;

						c = verticalC >> 14;
						if (c == 0) {
							uB = 0;
							vB = 0;
						} else {
							uB = verticalA / c;
							vB = verticalB / c;
						}

						uv = (uA << 18) + vA;
						uvStep = (uB - uA >> 3 << 18) + (vB - vA >> 3);
						lightnessA += lightnessB;
						lightness = lightnessA >> 8;
						length--;
					} while (length > 0);
				}

				length = xB - xA & 0x7;
				if (length > 0) {
					do {
						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;
						length--;
					} while (length > 0);
				}
			}
			return;
		}

		delta = xA - centerX;
		verticalA = verticalA + (horizontalA >> 3) * delta;
		verticalB = verticalB + (horizontalB >> 3) * delta;
		verticalC = verticalC + (horizontalC >> 3) * delta;

		c = verticalC >> 12;
		if (c == 0) {
			uA = 0;
			vA = 0;
		} else {
			uA = verticalA / c;
			vA = verticalB / c;
		}

		verticalA = verticalA + horizontalA;
		verticalB = verticalB + horizontalB;
		verticalC = verticalC + horizontalC;

		c = verticalC >> 12;
		if (c == 0) {
			uB = 0;
			vB = 0;
		} else {
			uB = verticalA / c;
			vB = verticalB / c;
		}

		uv = (uA << 20) + vA;
		uvStep = (uB - uA >> 3 << 20) + (vB - vA >> 3);
		length >>= 0x3;
		lightnessB <<= 3;
		lightness = lightnessA >> 8;

		if (opaque) {
			if (length > 0) {
				do {
					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;

					uA = uB;
					vA = vB;
					verticalA += horizontalA;
					verticalB += horizontalB;
					verticalC += horizontalC;

					c = verticalC >> 12;
					if (c == 0) {
						uB = 0;
						vB = 0;
					} else {
						uB = verticalA / c;
						vB = verticalB / c;
					}

					uv = (uA << 20) + vA;
					uvStep = (uB - uA >> 3 << 20) + (vB - vA >> 3);
					lightnessA += lightnessB;
					lightness = lightnessA >> 8;
					length--;
				} while (length > 0);
			}

			length = xB - xA & 0x7;
			if (length > 0) {
				do {
					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;
					length--;
				} while (length > 0);
			}
			return;
		}

		if (length > 0) {
			do {
				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;

				uA = uB;
				vA = vB;
				verticalA += horizontalA;
				verticalB += horizontalB;
				verticalC += horizontalC;

				c = verticalC >> 12;
				if (c == 0) {
					uB = 0;
					vB = 0;
				} else {
					uB = verticalA / c;
					vB = verticalB / c;
				}

				uv = (uA << 20) + vA;
				uvStep = (uB - uA >> 3 << 20) + (vB - vA >> 3);
				lightnessA += lightnessB;
				lightness = lightnessA >> 8;
				length--;
			} while (length > 0);
		}

		length = xB - xA & 0x7;
		if (length <= 0) {
			return;
		}

		do {
			if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
				dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
			}
			offset++;
			uv += uvStep;
			length--;
		} while (length > 0);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void drawTexturedScanline(@OriginalArg(0) int[] dst, @OriginalArg(1) int[] texels, @OriginalArg(4) int offset, @OriginalArg(5) int xA, @OriginalArg(6) int xB, @OriginalArg(7) int lightnessA, @OriginalArg(8) int lightnessB, @OriginalArg(9) int verticalA, @OriginalArg(10) int verticalB, @OriginalArg(11) int verticalC, @OriginalArg(12) int horizontalA, @OriginalArg(13) int horizontalB, @OriginalArg(14) int horizontalC) {
		if (testX) {
			if (xB > width) {
				xB = width;
			}

			if (xA < 0) {
				xA = 0;
			}
		}

		if (xA >= xB) {
			return;
		}

		offset += xA;
		lightnessA += lightnessB * xA;

		@Pc(28) int length = xB - xA;
		@Pc(140) int lightness;
		@Pc(128) int uvStep;
		@Pc(62) int uA;
		@Pc(66) int vA;
		@Pc(99) int uB;
		@Pc(103) int vB;
		@Pc(56) int c;
		@Pc(34) int delta;
		@Pc(154) int color;
		@Pc(114) int uv;

		if (!lowDetail) {
			delta = xA - centerX;
			verticalA += horizontalA * delta;
			verticalB += horizontalB * delta;
			verticalC += horizontalC * delta;

			c = verticalC >> 14;
			if (c == 0) {
				uA = 0;
				vA = 0;
			} else {
				uA = verticalA / c;
				vA = verticalB / c;
			}

			verticalA += horizontalA * length;
			verticalB += horizontalB * length;
			verticalC += horizontalC * length;

			c = verticalC >> 14;
			if (c == 0) {
				uB = 0;
				vB = 0;
			} else {
				uB = verticalA / c;
				vB = verticalB / c;
			}

			uv = (uA << 18) + vA;
			uvStep = ((uB - uA) / length << 18) + (vB - vA) / length;
			length >>= 0x3;
			lightnessB <<= 3;
			lightness = lightnessA >> 8;

			if (opaque) {
				if (length > 0) {
					do {
						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;

						lightnessA += lightnessB;
						lightness = lightnessA >> 8;
						length--;
					} while (length > 0);
				}

				length = xB - xA & 0x7;
				if (length > 0) {
					do {
						color = texels[(uv & 0x3F80) + (uv >>> 25)];
						dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						uv += uvStep;
						length--;
					} while (length > 0);
				}
			} else {
				if (length > 0) {
					do {
						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;
						uv += uvStep;

						lightnessA += lightnessB;
						lightness = lightnessA >> 8;
						length--;
					} while (length > 0);
				}

				length = xB - xA & 0x7;
				if (length > 0) {
					do {
						if ((color = texels[(uv & 0x3F80) + (uv >>> 25)]) != 0) {
							dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
						}
						offset++;

						uv += uvStep;
						length--;
					} while (length > 0);
				}
			}
			return;
		}

		delta = xA - centerX;
		verticalA = verticalA + horizontalA * delta;
		verticalB = verticalB + horizontalB * delta;
		verticalC = verticalC + horizontalC * delta;

		c = verticalC >> 12;
		if (c == 0) {
			uA = 0;
			vA = 0;
		} else {
			uA = verticalA / c;
			vA = verticalB / c;
		}

		verticalA += horizontalA * length;
		verticalB += horizontalB * length;
		verticalC += horizontalC * length;
		c = verticalC >> 12;
		if (c == 0) {
			uB = 0;
			vB = 0;
		} else {
			uB = verticalA / c;
			vB = verticalB / c;
		}

		uv = (uA << 20) + vA;
		uvStep = ((uB - uA) / length << 20) + (vB - vA) / length;
		length >>= 0x3;
		lightnessB = lightnessB << 3;
		lightness = lightnessA >> 8;

		if (opaque) {
			if (length > 0) {
				do {
					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;

					lightnessA += lightnessB;
					lightness = lightnessA >> 8;
					length--;
				} while (length > 0);
			}

			length = xB - xA & 0x7;
			if (length > 0) {
				do {
					color = texels[(uv & 0xFC0) + (uv >>> 26)];
					dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
					uv += uvStep;
					length--;
				} while (length > 0);
			}
			return;
		}

		if (length > 0) {
			do {
				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				offset++;
				uv += uvStep;

				if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
					dst[offset] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
				}
				uv += uvStep;

				lightnessA += lightnessB;
				lightness = lightnessA >> 8;
				length--;
			} while (length > 0);
		}

		length = xB - xA & 0x7;
		if (length <= 0) {
			return;
		}

		do {
			if ((color = texels[(uv & 0xFC0) + (uv >>> 26)]) != 0) {
				dst[offset++] = ((color & 0xFF00FF) * lightness & 0xFF00FF00) + ((color & 0xFF00) * lightness & 0xFF0000) >> 8;
			}

			uv += uvStep;
			length--;
		} while (length > 0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIII)V")
	public static void fillTriangle(@OriginalArg(0) int yA, @OriginalArg(1) int yB, @OriginalArg(2) int yC, @OriginalArg(3) int xA, @OriginalArg(4) int xB, @OriginalArg(5) int xC, @OriginalArg(6) int color) {
		@Pc(1) int mAB = 0;
		if (yB != yA) {
			mAB = (xB - xA << 16) / (yB - yA);
		}

		@Pc(16) int mBC = 0;
		if (yC != yB) {
			mBC = (xC - xB << 16) / (yC - yB);
		}

		@Pc(31) int mAC = 0;
		if (yC != yA) {
			mAC = (xA - xC << 16) / (yA - yC);
		}

		if (yA <= yB && yA <= yC) {
			if (yA < height) {
				if (yB > height) {
					yB = height;
				}

				if (yC > height) {
					yC = height;
				}

				if (yB < yC) {
					xC = xA <<= 0x10;
					if (yA < 0) {
						xC -= mAC * yA;
						xA -= mAB * yA;
						yA = 0;
					}

					xB <<= 0x10;
					if (yB < 0) {
						xB -= mBC * yB;
						yB = 0;
					}

					if (yA != yB && mAC < mAB || yA == yB && mAC > mBC) {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yA, color, xC >> 16, xB >> 16);
									xC += mAC;
									xB += mBC;
									yA += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yA, color, xC >> 16, xA >> 16);
							xC += mAC;
							xA += mAB;
							yA += SoftwareRaster.width;
						}
					} else {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yA, color, xB >> 16, xC >> 16);
									xC += mAC;
									xB += mBC;
									yA += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yA, color, xA >> 16, xC >> 16);
							xC += mAC;
							xA += mAB;
							yA += SoftwareRaster.width;
						}
					}
				} else {
					xB = xA <<= 0x10;
					if (yA < 0) {
						xB -= mAC * yA;
						xA -= mAB * yA;
						yA = 0;
					}

					xC <<= 0x10;
					if (yC < 0) {
						xC -= mBC * yC;
						yC = 0;
					}

					if (yA != yC && mAC < mAB || yA == yC && mBC > mAB) {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yA, color, xC >> 16, xA >> 16);
									xC += mBC;
									xA += mAB;
									yA += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yA, color, xB >> 16, xA >> 16);
							xB += mAC;
							xA += mAB;
							yA += SoftwareRaster.width;
						}
					} else {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yA, color, xA >> 16, xC >> 16);
									xC += mBC;
									xA += mAB;
									yA += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yA, color, xA >> 16, xB >> 16);
							xB += mAC;
							xA += mAB;
							yA += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (yB <= yC) {
			if (yB < height) {
				if (yC > height) {
					yC = height;
				}

				if (yA > height) {
					yA = height;
				}

				if (yC < yA) {
					xA = xB <<= 0x10;
					if (yB < 0) {
						xA -= mAB * yB;
						xB -= mBC * yB;
						yB = 0;
					}

					xC <<= 0x10;
					if (yC < 0) {
						xC -= mAC * yC;
						yC = 0;
					}

					if (yB != yC && mAB < mBC || yB == yC && mAB > mAC) {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yB, color, xA >> 16, xC >> 16);
									xA += mAB;
									xC += mAC;
									yB += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yB, color, xA >> 16, xB >> 16);
							xA += mAB;
							xB += mBC;
							yB += SoftwareRaster.width;
						}
					} else {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yB, color, xC >> 16, xA >> 16);
									xA += mAB;
									xC += mAC;
									yB += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yB, color, xB >> 16, xA >> 16);
							xA += mAB;
							xB += mBC;
							yB += SoftwareRaster.width;
						}
					}
				} else {
					xC = xB <<= 0x10;
					if (yB < 0) {
						xC -= mAB * yB;
						xB -= mBC * yB;
						yB = 0;
					}

					xA <<= 0x10;
					if (yA < 0) {
						xA -= mAC * yA;
						yA = 0;
					}

					if (mAB < mBC) {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yB, color, xA >> 16, xB >> 16);
									xA += mAC;
									xB += mBC;
									yB += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yB, color, xC >> 16, xB >> 16);
							xC += mAB;
							xB += mBC;
							yB += SoftwareRaster.width;
						}
					} else {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawScanline(SoftwareRaster.pixels, yB, color, xB >> 16, xA >> 16);
									xA += mAC;
									xB += mBC;
									yB += SoftwareRaster.width;
								}
							}

							drawScanline(SoftwareRaster.pixels, yB, color, xB >> 16, xC >> 16);
							xC += mAB;
							xB += mBC;
							yB += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (yC < height) {
			if (yA > height) {
				yA = height;
			}

			if (yB > height) {
				yB = height;
			}

			if (yA < yB) {
				xB = xC <<= 0x10;
				if (yC < 0) {
					xB -= mBC * yC;
					xC -= mAC * yC;
					yC = 0;
				}

				xA <<= 0x10;
				if (yA < 0) {
					xA -= mAB * yA;
					yA = 0;
				}

				if (mBC < mAC) {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawScanline(SoftwareRaster.pixels, yC, color, xB >> 16, xA >> 16);
								xB += mBC;
								xA += mAB;
								yC += SoftwareRaster.width;
							}
						}

						drawScanline(SoftwareRaster.pixels, yC, color, xB >> 16, xC >> 16);
						xB += mBC;
						xC += mAC;
						yC += SoftwareRaster.width;
					}
				} else {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawScanline(SoftwareRaster.pixels, yC, color, xA >> 16, xB >> 16);
								xB += mBC;
								xA += mAB;
								yC += SoftwareRaster.width;
							}
						}

						drawScanline(SoftwareRaster.pixels, yC, color, xC >> 16, xB >> 16);
						xB += mBC;
						xC += mAC;
						yC += SoftwareRaster.width;
					}
				}
			} else {
				xA = xC <<= 0x10;
				if (yC < 0) {
					xA -= mBC * yC;
					xC -= mAC * yC;
					yC = 0;
				}

				xB <<= 0x10;
				if (yB < 0) {
					xB -= mAB * yB;
					yB = 0;
				}

				if (mBC < mAC) {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawScanline(SoftwareRaster.pixels, yC, color, xB >> 16, xC >> 16);
								xB += mAB;
								xC += mAC;
								yC += SoftwareRaster.width;
							}
						}

						drawScanline(SoftwareRaster.pixels, yC, color, xA >> 16, xC >> 16);
						xA += mBC;
						xC += mAC;
						yC += SoftwareRaster.width;
					}
				} else {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawScanline(SoftwareRaster.pixels, yC, color, xC >> 16, xB >> 16);
								xB += mAB;
								xC += mAC;
								yC += SoftwareRaster.width;
							}
						}

						drawScanline(SoftwareRaster.pixels, yC, color, xC >> 16, xA >> 16);
						xA += mBC;
						xC += mAC;
						yC += SoftwareRaster.width;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public static void setBounds(@OriginalArg(0) int right, @OriginalArg(1) int bottom) {
		@Pc(3) int offset = offsets[0];
		@Pc(7) int top = offset / SoftwareRaster.width;
		@Pc(13) int left = offset - top * SoftwareRaster.width;
		centerX = right - left;
		centerY = bottom - top;
		screenLowerX = -centerX;
		screenUpperX = width - centerX;
		screenLowerY = -centerY;
		screenUpperY = height - centerY;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIIIIII)V")
	private static void drawGouraudScanline(@OriginalArg(0) int[] pixels, @OriginalArg(1) int offset, @OriginalArg(4) int xA, @OriginalArg(5) int xB, @OriginalArg(6) int colorA, @OriginalArg(7) int colorStep) {
		if (testX) {
			if (xB > width) {
				xB = width;
			}

			if (xA < 0) {
				xA = 0;
			}
		}

		if (xA >= xB) {
			return;
		}

		offset += xA;
		colorA += colorStep * xA;
		@Pc(98) int alpha;
		@Pc(102) int invAlpha;
		@Pc(138) int srcColor;
		@Pc(32) int length;
		@Pc(46) int color;

		if (!jagged) {
			length = xB - xA;
			if (Rasteriser.alpha == 0) {
				do {
					pixels[offset++] = palette[colorA >> 8];
					colorA += colorStep;
					length--;
				} while (length > 0);
			} else {
				alpha = Rasteriser.alpha;
				invAlpha = 256 - Rasteriser.alpha;

				do {
					color = palette[colorA >> 8];

					colorA += colorStep;
					color = ((color & 0xFF00FF) * invAlpha >> 8 & 0xFF00FF) + ((color & 0xFF00) * invAlpha >> 8 & 0xFF00);

					srcColor = pixels[offset];
					pixels[offset++] = color + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);

					length--;
				} while (length > 0);
			}
		} else {
			length = xB - xA >> 2;
			colorStep <<= 2;

			if (Rasteriser.alpha == 0) {
				if (length > 0) {
					do {
						color = palette[colorA >> 8];
						colorA += colorStep;
						pixels[offset++] = color;
						pixels[offset++] = color;
						pixels[offset++] = color;
						pixels[offset++] = color;
						length--;
					} while (length > 0);
				}

				length = xB - xA & 0x3;
				if (length > 0) {
					color = palette[colorA >> 8];
					do {
						pixels[offset++] = color;
						length--;
					} while (length > 0);
				}
			} else {
				alpha = Rasteriser.alpha;
				invAlpha = 256 - Rasteriser.alpha;
				if (length > 0) {
					do {
						color = palette[colorA >> 8];

						colorA += colorStep;
						color = ((color & 0xFF00FF) * invAlpha >> 8 & 0xFF00FF) + ((color & 0xFF00) * invAlpha >> 8 & 0xFF00);

						srcColor = pixels[offset];
						pixels[offset++] = color + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);

						srcColor = pixels[offset];
						pixels[offset++] = color + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);

						srcColor = pixels[offset];
						pixels[offset++] = color + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);

						srcColor = pixels[offset];
						pixels[offset++] = color + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);

						length--;
					} while (length > 0);
				}

				length = xB - xA & 0x3;
				if (length <= 0) {
					return;
				}

				color = palette[colorA >> 8];
				color = ((color & 0xFF00FF) * invAlpha >> 8 & 0xFF00FF) + ((color & 0xFF00) * invAlpha >> 8 & 0xFF00);
				do {
					srcColor = pixels[offset];
					pixels[offset++] = color + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);
					length--;
				} while (length > 0);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIIIIIII)V")
	public static void fillSpriteTriangle(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg1) {
			local1 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}

		@Pc(16) int local16 = 0;
		if (arg3 != arg2) {
			local16 = (arg6 - arg5 << 16) / (arg3 - arg2);
		}

		@Pc(31) int local31 = 0;
		if (arg3 != arg1) {
			local31 = (arg4 - arg6 << 16) / (arg1 - arg3);
		}

		if (arg1 <= arg2 && arg1 <= arg3) {
			if (arg2 < arg3) {
				arg6 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg6 -= local31 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}

				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local16 * arg2;
					arg2 = 0;
				}

				if ((arg1 == arg2 || local31 >= local1) && (arg1 != arg2 || local31 <= local16)) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								drawSpriteScanline(arg0, arg1, arg5 >> 16, arg6 >> 16);
								arg6 += local31;
								arg5 += local16;
								arg1 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg1, arg4 >> 16, arg6 >> 16);
						arg6 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								drawSpriteScanline(arg0, arg1, arg6 >> 16, arg5 >> 16);
								arg6 += local31;
								arg5 += local16;
								arg1 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg1, arg6 >> 16, arg4 >> 16);
						arg6 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local31 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}

				arg6 <<= 0x10;
				if (arg3 < 0) {
					arg6 -= local16 * arg3;
					arg3 = 0;
				}

				if ((arg1 == arg3 || local31 >= local1) && (arg1 != arg3 || local16 <= local1)) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}

								drawSpriteScanline(arg0, arg1, arg4 >> 16, arg6 >> 16);
								arg6 += local16;
								arg4 += local1;
								arg1 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg1, arg4 >> 16, arg5 >> 16);
						arg5 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}

								drawSpriteScanline(arg0, arg1, arg6 >> 16, arg4 >> 16);
								arg6 += local16;
								arg4 += local1;
								arg1 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg1, arg5 >> 16, arg4 >> 16);
						arg5 += local31;
						arg4 += local1;
						arg1 += arg7;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local1 * arg2;
					arg5 -= local16 * arg2;
					arg2 = 0;
				}

				arg6 <<= 0x10;
				if (arg3 < 0) {
					arg6 -= local31 * arg3;
					arg3 = 0;
				}

				if (arg2 != arg3 && local1 < local16 || arg2 == arg3 && local1 > local31) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								drawSpriteScanline(arg0, arg2, arg4 >> 16, arg6 >> 16);
								arg4 += local1;
								arg6 += local31;
								arg2 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg2, arg4 >> 16, arg5 >> 16);
						arg4 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}

								drawSpriteScanline(arg0, arg2, arg6 >> 16, arg4 >> 16);
								arg4 += local1;
								arg6 += local31;
								arg2 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg2, arg5 >> 16, arg4 >> 16);
						arg4 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				}
			} else {
				arg6 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg6 -= local1 * arg2;
					arg5 -= local16 * arg2;
					arg2 = 0;
				}

				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local31 * arg1;
					arg1 = 0;
				}

				if (local1 < local16) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}

								drawSpriteScanline(arg0, arg2, arg4 >> 16, arg5 >> 16);
								arg4 += local31;
								arg5 += local16;
								arg2 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg2, arg6 >> 16, arg5 >> 16);
						arg6 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= arg7;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}

								drawSpriteScanline(arg0, arg2, arg5 >> 16, arg4 >> 16);
								arg4 += local31;
								arg5 += local16;
								arg2 += arg7;
							}
						}

						drawSpriteScanline(arg0, arg2, arg5 >> 16, arg6 >> 16);
						arg6 += local1;
						arg5 += local16;
						arg2 += arg7;
					}
				}
			}
		} else if (arg1 < arg2) {
			arg5 = arg6 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local16 * arg3;
				arg6 -= local31 * arg3;
				arg3 = 0;
			}

			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local1 * arg1;
				arg1 = 0;
			}

			if (local16 < local31) {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}

							drawSpriteScanline(arg0, arg3, arg5 >> 16, arg4 >> 16);
							arg5 += local16;
							arg4 += local1;
							arg3 += arg7;
						}
					}

					drawSpriteScanline(arg0, arg3, arg5 >> 16, arg6 >> 16);
					arg5 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}

							drawSpriteScanline(arg0, arg3, arg4 >> 16, arg5 >> 16);
							arg5 += local16;
							arg4 += local1;
							arg3 += arg7;
						}
					}

					drawSpriteScanline(arg0, arg3, arg6 >> 16, arg5 >> 16);
					arg5 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			}
		} else {
			arg4 = arg6 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local16 * arg3;
				arg6 -= local31 * arg3;
				arg3 = 0;
			}

			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local1 * arg2;
				arg2 = 0;
			}

			if (local16 < local31) {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}

							drawSpriteScanline(arg0, arg3, arg5 >> 16, arg6 >> 16);
							arg5 += local1;
							arg6 += local31;
							arg3 += arg7;
						}
					}

					drawSpriteScanline(arg0, arg3, arg4 >> 16, arg6 >> 16);
					arg4 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= arg7;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}

							drawSpriteScanline(arg0, arg3, arg6 >> 16, arg5 >> 16);
							arg5 += local1;
							arg6 += local31;
							arg3 += arg7;
						}
					}

					drawSpriteScanline(arg0, arg3, arg6 >> 16, arg4 >> 16);
					arg4 += local16;
					arg6 += local31;
					arg3 += arg7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)V")
	public static void testPoints(@OriginalArg(0) int a, @OriginalArg(1) int b, @OriginalArg(2) int c) {
		testX = a < 0 || a > width || b < 0 || b > width || c < 0 || c > width;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIIII)V")
	private static void drawScanline(@OriginalArg(0) int[] pixels, @OriginalArg(1) int offset, @OriginalArg(2) int color, @OriginalArg(4) int xA, @OriginalArg(5) int xB) {
		if (testX) {
			if (xB > width) {
				xB = width;
			}
			if (xA < 0) {
				xA = 0;
			}
		}

		if (xA >= xB) {
			return;
		}

		offset += xA;
		@Pc(24) int length = xB - xA >> 2;
		if (alpha == 0) {
			while (true) {
				length--;
				if (length < 0) {
					length = xB - xA & 0x3;
					while (true) {
						length--;
						if (length < 0) {
							return;
						}
						pixels[offset++] = color;
					}
				}

				pixels[offset++] = color;
				pixels[offset++] = color;
				pixels[offset++] = color;
				pixels[offset++] = color;
			}
		} else if (alpha == 254) {
			while (true) {
				length--;
				if (length < 0) {
					length = xB - xA & 0x3;
					while (true) {
						length--;
						if (length < 0) {
							return;
						}
						pixels[offset++] = pixels[offset];
					}
				}

				pixels[offset++] = color;
				pixels[offset++] = color;
				pixels[offset++] = color;
				pixels[offset++] = color;
			}
		} else {
			@Pc(119) int alpha = Rasteriser.alpha;
			@Pc(123) int invAlpha = 256 - Rasteriser.alpha;
			@Pc(143) int sample = ((color & 0xFF00FF) * invAlpha >> 8 & 0xFF00FF) + ((color & 0xFF00) * invAlpha >> 8 & 0xFF00);

			while (true) {
				length--;
				@Pc(150) int srcColor;

				if (length < 0) {
					length = xB - xA & 0x3;
					while (true) {
						length--;
						if (length < 0) {
							return;
						}

						srcColor = pixels[offset];
						pixels[offset++] = sample + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);
					}
				}

				srcColor = pixels[offset];
				pixels[offset++] = sample + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);
				srcColor = pixels[offset];
				pixels[offset++] = sample + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);
				srcColor = pixels[offset];
				pixels[offset++] = sample + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);
				srcColor = pixels[offset];
				pixels[offset++] = sample + ((srcColor & 0xFF00FF) * alpha >> 8 & 0xFF00FF) + ((srcColor & 0xFF00) * alpha >> 8 & 0xFF00);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V")
	private static void calculateBrightness() {
		@Pc(3) int offset = 0;

		for (@Pc(5) int y = 0; y < 512; y++) {
			@Pc(17) double hue = (double) (y >> 3) / 64.0D + 0.0078125D;
			@Pc(26) double saturation = (double) (y & 0x7) / 8.0D + 0.0625D;

			for (@Pc(28) int x = 0; x < 128; x++) {
				@Pc(36) double lightness = (double) x / 128.0D;

				@Pc(38) double r = lightness;
				@Pc(40) double g = lightness;
				@Pc(42) double b = lightness;

				if (saturation != 0.0D) {
					@Pc(56) double q;
					if (lightness < 0.5D) {
						q = lightness * (saturation + 1.0D);
					} else {
						q = lightness + saturation - lightness * saturation;
					}

					@Pc(71) double p = lightness * 2.0D - q;
					@Pc(75) double t = hue + 0.3333333333333333D;
					if (t > 1.0D) {
						t--;
					}

					@Pc(89) double d11 = hue - 0.3333333333333333D;
					if (d11 < 0.0D) {
						d11++;
					}

					if (t * 6.0D < 1.0D) {
						r = p + (q - p) * 6.0D * t;
					} else if (t * 2.0D < 1.0D) {
						r = q;
					} else if (t * 3.0D < 2.0D) {
						r = p + (q - p) * (0.6666666666666666D - t) * 6.0D;
					} else {
						r = p;
					}

					if (hue * 6.0D < 1.0D) {
						g = p + (q - p) * 6.0D * hue;
					} else if (hue * 2.0D < 1.0D) {
						g = q;
					} else if (hue * 3.0D < 2.0D) {
						g = p + (q - p) * (0.6666666666666666D - hue) * 6.0D;
					} else {
						g = p;
					}

					if (d11 * 6.0D < 1.0D) {
						b = p + (q - p) * 6.0D * d11;
					} else if (d11 * 2.0D < 1.0D) {
						b = q;
					} else if (d11 * 3.0D < 2.0D) {
						b = p + (q - p) * (0.6666666666666666D - d11) * 6.0D;
					} else {
						b = p;
					}
				}

				r = Math.pow(r, brightness);
				g = Math.pow(g, brightness);
				b = Math.pow(b, brightness);

				@Pc(258) int intR = (int) (r * 256.0D);
				@Pc(263) int intG = (int) (g * 256.0D);
				@Pc(268) int intB = (int) (b * 256.0D);

				@Pc(278) int rgb = (intR << 16) + (intG << 8) + intB;
				if (rgb == 0) {
					rgb = 1;
				}
				palette[offset++] = rgb;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	private static void prepareOffsets(@OriginalArg(0) int left, @OriginalArg(1) int top, @OriginalArg(2) int right, @OriginalArg(3) int bottom) {
		width = right - left;
		height = bottom - top;
		prepareOffsets();
		if (offsets.length < height) {
			offsets = new int[IntUtils.clp2(height)];
		}
		@Pc(23) int x = top * SoftwareRaster.width + left;
		for (@Pc(25) int y = 0; y < height; y++) {
			offsets[y] = x;
			x += SoftwareRaster.width;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(F)V")
	private static void randBrightness(@OriginalArg(0) float start) {
		brightness = start;
		brightness = (float) ((double) brightness + Math.random() * 0.03D - 0.015D);
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "()I")
	public static int getOffset() {
		return offsets[0] / SoftwareRaster.width;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void fillGouraudTriangle(@OriginalArg(0) int yA, @OriginalArg(1) int yB, @OriginalArg(2) int yC, @OriginalArg(3) int xA, @OriginalArg(4) int xB, @OriginalArg(5) int xC, @OriginalArg(6) int colorA, @OriginalArg(7) int colorB, @OriginalArg(8) int colorC) {
		@Pc(3) int dxAB = xB - xA;
		@Pc(7) int dyAB = yB - yA;
		@Pc(11) int dxAC = xC - xA;
		@Pc(15) int dyAC = yC - yA;
		@Pc(19) int colorStepAB = colorB - colorA;
		@Pc(23) int colorStepAC = colorC - colorA;

		@Pc(36) int xStepBC;
		if (yC == yB) {
			xStepBC = 0;
		} else {
			xStepBC = (xC - xB << 16) / (yC - yB);
		}

		@Pc(48) int xStepAB;
		if (yB == yA) {
			xStepAB = 0;
		} else {
			xStepAB = (dxAB << 16) / dyAB;
		}

		@Pc(60) int xStepAC;
		if (yC == yA) {
			xStepAC = 0;
		} else {
			xStepAC = (dxAC << 16) / dyAC;
		}

		@Pc(71) int length = dxAB * dyAC - dxAC * dyAB;
		if (length == 0) {
			return;
		}

		@Pc(86) int colorStepA = (colorStepAB * dyAC - colorStepAC * dyAB << 8) / length;
		@Pc(98) int colorStepB = (colorStepAC * dxAB - colorStepAB * dxAC << 8) / length;
		if (yA <= yB && yA <= yC) {
			if (yA < height) {
				if (yB > height) {
					yB = height;
				}
				if (yC > height) {
					yC = height;
				}

				colorA = (colorA << 8) + colorStepA - colorStepA * xA;
				if (yB < yC) {
					xC = xA <<= 0x10;
					if (yA < 0) {
						xC -= xStepAC * yA;
						xA -= xStepAB * yA;
						colorA -= colorStepB * yA;
						yA = 0;
					}

					xB <<= 0x10;
					if (yB < 0) {
						xB -= xStepBC * yB;
						yB = 0;
					}

					if ((yA == yB || xStepAC >= xStepAB) && (yA != yB || xStepAC <= xStepBC)) {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yA, xB >> 16, xC >> 16, colorA, colorStepA);
									xC += xStepAC;
									xB += xStepBC;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yA, xA >> 16, xC >> 16, colorA, colorStepA);
							xC += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
						}
					} else {
						yC -= yB;
						yB -= yA;
						yA = offsets[yA];
						while (true) {
							yB--;
							if (yB < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yA, xC >> 16, xB >> 16, colorA, colorStepA);
									xC += xStepAC;
									xB += xStepBC;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yA, xC >> 16, xA >> 16, colorA, colorStepA);
							xC += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
						}
					}
				} else {
					xB = xA <<= 0x10;
					if (yA < 0) {
						xB -= xStepAC * yA;
						xA -= xStepAB * yA;
						colorA -= colorStepB * yA;
						yA = 0;
					}

					xC <<= 0x10;
					if (yC < 0) {
						xC -= xStepBC * yC;
						yC = 0;
					}

					if (yA != yC && xStepAC < xStepAB || yA == yC && xStepBC > xStepAB) {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yA, xC >> 16, xA >> 16, colorA, colorStepA);
									xC += xStepBC;
									xA += xStepAB;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yA, xB >> 16, xA >> 16, colorA, colorStepA);
							xB += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
						}
					} else {
						yB -= yC;
						yC -= yA;
						yA = offsets[yA];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yB--;
									if (yB < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yA, xA >> 16, xC >> 16, colorA, colorStepA);
									xC += xStepBC;
									xA += xStepAB;
									colorA += colorStepB;
									yA += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yA, xA >> 16, xB >> 16, colorA, colorStepA);
							xB += xStepAC;
							xA += xStepAB;
							colorA += colorStepB;
							yA += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (yB <= yC) {
			if (yB < height) {
				if (yC > height) {
					yC = height;
				}
				if (yA > height) {
					yA = height;
				}

				colorB = (colorB << 8) + colorStepA - colorStepA * xB;
				if (yC < yA) {
					xA = xB <<= 0x10;
					if (yB < 0) {
						xA -= xStepAB * yB;
						xB -= xStepBC * yB;
						colorB -= colorStepB * yB;
						yB = 0;
					}
					xC <<= 0x10;
					if (yC < 0) {
						xC -= xStepAC * yC;
						yC = 0;
					}
					if ((yB == yC || xStepAB >= xStepBC) && (yB != yC || xStepAB <= xStepAC)) {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yB, xC >> 16, xA >> 16, colorB, colorStepA);
									xA += xStepAB;
									xC += xStepAC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yB, xB >> 16, xA >> 16, colorB, colorStepA);
							xA += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
						}
					} else {
						yA -= yC;
						yC -= yB;
						yB = offsets[yB];
						while (true) {
							yC--;
							if (yC < 0) {
								while (true) {
									yA--;
									if (yA < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yB, xA >> 16, xC >> 16, colorB, colorStepA);
									xA += xStepAB;
									xC += xStepAC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yB, xA >> 16, xB >> 16, colorB, colorStepA);
							xA += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
						}
					}
				} else {
					xC = xB <<= 0x10;
					if (yB < 0) {
						xC -= xStepAB * yB;
						xB -= xStepBC * yB;
						colorB -= colorStepB * yB;
						yB = 0;
					}

					xA <<= 0x10;
					if (yA < 0) {
						xA -= xStepAC * yA;
						yA = 0;
					}

					if (xStepAB < xStepBC) {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yB, xA >> 16, xB >> 16, colorB, colorStepA);
									xA += xStepAC;
									xB += xStepBC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yB, xC >> 16, xB >> 16, colorB, colorStepA);
							xC += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
						}
					} else {
						yC -= yA;
						yA -= yB;
						yB = offsets[yB];
						while (true) {
							yA--;
							if (yA < 0) {
								while (true) {
									yC--;
									if (yC < 0) {
										return;
									}

									drawGouraudScanline(SoftwareRaster.pixels, yB, xB >> 16, xA >> 16, colorB, colorStepA);
									xA += xStepAC;
									xB += xStepBC;
									colorB += colorStepB;
									yB += SoftwareRaster.width;
								}
							}

							drawGouraudScanline(SoftwareRaster.pixels, yB, xB >> 16, xC >> 16, colorB, colorStepA);
							xC += xStepAB;
							xB += xStepBC;
							colorB += colorStepB;
							yB += SoftwareRaster.width;
						}
					}
				}
			}
		} else if (yC < height) {
			if (yA > height) {
				yA = height;
			}
			if (yB > height) {
				yB = height;
			}

			colorC = (colorC << 8) + colorStepA - colorStepA * xC;
			if (yA < yB) {
				xB = xC <<= 0x10;
				if (yC < 0) {
					xB -= xStepBC * yC;
					xC -= xStepAC * yC;
					colorC -= colorStepB * yC;
					yC = 0;
				}

				xA <<= 0x10;
				if (yA < 0) {
					xA -= xStepAB * yA;
					yA = 0;
				}

				if (xStepBC < xStepAC) {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawGouraudScanline(SoftwareRaster.pixels, yC, xB >> 16, xA >> 16, colorC, colorStepA);
								xB += xStepBC;
								xA += xStepAB;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
							}
						}

						drawGouraudScanline(SoftwareRaster.pixels, yC, xB >> 16, xC >> 16, colorC, colorStepA);
						xB += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
					}
				} else {
					yB -= yA;
					yA -= yC;
					yC = offsets[yC];
					while (true) {
						yA--;
						if (yA < 0) {
							while (true) {
								yB--;
								if (yB < 0) {
									return;
								}

								drawGouraudScanline(SoftwareRaster.pixels, yC, xA >> 16, xB >> 16, colorC, colorStepA);
								xB += xStepBC;
								xA += xStepAB;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
							}
						}

						drawGouraudScanline(SoftwareRaster.pixels, yC, xC >> 16, xB >> 16, colorC, colorStepA);
						xB += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
					}
				}
			} else {
				xA = xC <<= 0x10;
				if (yC < 0) {
					xA -= xStepBC * yC;
					xC -= xStepAC * yC;
					colorC -= colorStepB * yC;
					yC = 0;
				}

				xB <<= 0x10;
				if (yB < 0) {
					xB -= xStepAB * yB;
					yB = 0;
				}

				if (xStepBC < xStepAC) {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawGouraudScanline(SoftwareRaster.pixels, yC, xB >> 16, xC >> 16, colorC, colorStepA);
								xB += xStepAB;
								xC += xStepAC;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
							}
						}

						drawGouraudScanline(SoftwareRaster.pixels, yC, xA >> 16, xC >> 16, colorC, colorStepA);
						xA += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
					}
				} else {
					yA -= yB;
					yB -= yC;
					yC = offsets[yC];
					while (true) {
						yB--;
						if (yB < 0) {
							while (true) {
								yA--;
								if (yA < 0) {
									return;
								}

								drawGouraudScanline(SoftwareRaster.pixels, yC, xC >> 16, xB >> 16, colorC, colorStepA);
								xB += xStepAB;
								xC += xStepAC;
								colorC += colorStepB;
								yC += SoftwareRaster.width;
							}
						}

						drawGouraudScanline(SoftwareRaster.pixels, yC, xC >> 16, xA >> 16, colorC, colorStepA);
						xA += xStepBC;
						xC += xStepAC;
						colorC += colorStepB;
						yC += SoftwareRaster.width;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIIII)V")
	private static void drawSpriteScanline(@OriginalArg(0) byte[] dst, @OriginalArg(1) int off, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}

		off += arg2;
		@Pc(13) int local13 = arg3 - arg2 >> 2;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg3 - arg2 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					dst[off++] = 1;
				}
			}

			dst[off++] = 1;
			dst[off++] = 1;
			dst[off++] = 1;
			dst[off++] = 1;
		}
	}
}
