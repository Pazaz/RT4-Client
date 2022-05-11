package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!be;")
	public static Component aClass13_26 = null;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	public static int anInt5895 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([IIIIIIIIIZB)V")
	public static void method4667(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		@Pc(7) int local7 = arg2;
		if (SoftwareRaster.clipRight <= arg2) {
			return;
		}
		if (arg2 < SoftwareRaster.clipLeft) {
			local7 = SoftwareRaster.clipLeft;
		}
		@Pc(30) int local30 = arg7 + arg2;
		if (SoftwareRaster.clipLeft >= local30) {
			return;
		}
		if (SoftwareRaster.clipRight < local30) {
			local30 = SoftwareRaster.clipRight;
		}
		@Pc(43) int local43 = arg8;
		if (SoftwareRaster.clipBottom <= arg8) {
			return;
		}
		@Pc(56) int local56 = arg8 + arg6;
		if (arg8 < SoftwareRaster.clipTop) {
			local43 = SoftwareRaster.clipTop;
		}
		if (local56 <= SoftwareRaster.clipTop) {
			return;
		}
		@Pc(79) int local79 = local7 + SoftwareRaster.width * local43;
		if (arg5 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg5 = 1;
		}
		@Pc(99) int local99 = local7 + SoftwareRaster.width - local30;
		local43 -= arg8;
		@Pc(108) int local108 = arg6 - local43;
		if (SoftwareRaster.clipBottom < local56) {
			local56 = SoftwareRaster.clipBottom;
		}
		if (arg5 == 10) {
			arg3 = arg3 + 3 & 0x3;
			arg5 = 1;
		}
		local7 -= arg2;
		@Pc(136) int local136 = arg7 - local7;
		if (arg5 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg5 = 8;
		}
		local30 -= arg2;
		@Pc(157) int local157 = arg7 - local30;
		local56 -= arg8;
		@Pc(165) int local165 = arg6 - local56;
		@Pc(175) int local175;
		@Pc(184) int local184;
		if (arg5 == 1) {
			if (arg3 == 0) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 <= local175) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 1) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local175 >= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 2) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 >= local175) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 3) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 >= local175) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			}
		} else if (arg5 == 2) {
			if (arg3 == 0) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local175 >> 1 >= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 1) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local79 >= 0 && local79 < arg0.length) {
							if (local175 << 1 <= local184) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						} else {
							local79++;
						}
					}
					local79 += local99;
				}
			} else if (arg3 == 2) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local136 - 1; local184 >= local157; local184--) {
						if (local175 >> 1 >= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 3) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local136 - 1; local184 >= local157; local184--) {
						if (local175 << 1 <= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			}
		} else if (arg5 == 3) {
			if (arg3 == 0) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local136 - 1; local184 >= local157; local184--) {
						if (local175 >> 1 >= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 1) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 >= local175 << 1) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 2) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local184 <= local175 >> 1) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 3) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local136 - 1; local184 >= local157; local184--) {
						if (local175 << 1 <= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			}
		} else if (arg5 == 4) {
			if (arg3 == 0) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local175 >> 1 <= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 1) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local7; local184 < local30; local184++) {
						if (local175 << 1 >= local184) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 2) {
				for (local175 = local43; local175 < local56; local175++) {
					for (local184 = local136 - 1; local184 >= local157; local184--) {
						if (local184 >= local175 >> 1) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			} else if (arg3 == 3) {
				for (local175 = local108 - 1; local175 >= local165; local175--) {
					for (local184 = local136 - 1; local184 >= local157; local184--) {
						if (local184 <= local175 << 1) {
							arg0[local79] = arg1;
						} else if (arg9) {
							arg0[local79] = arg4;
						}
						local79++;
					}
					local79 += local99;
				}
			}
		} else if (arg5 != 5) {
			if (arg5 == 6) {
				if (arg3 == 0) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local184 <= arg7 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 1) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local175 <= arg6 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 2) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local184 >= arg7 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 3) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local175 >= arg6 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
			}
			if (arg5 == 7) {
				if (arg3 == 0) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local184 <= local175 - arg6 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 1) {
					for (local175 = local108 - 1; local175 >= local165; local175--) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local175 - arg6 / 2 >= local184) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 2) {
					for (local175 = local108 - 1; local175 >= local165; local175--) {
						for (local184 = local136 - 1; local184 >= local157; local184--) {
							if (local184 <= local175 - arg6 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 3) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local136 - 1; local184 >= local157; local184--) {
							if (local175 - arg6 / 2 >= local184) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
			}
			if (arg5 == 8) {
				if (arg3 == 0) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local175 - arg6 / 2 <= local184) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 1) {
					for (local175 = local108 - 1; local175 >= local165; local175--) {
						for (local184 = local7; local184 < local30; local184++) {
							if (local175 - arg6 / 2 <= local184) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 2) {
					for (local175 = local108 - 1; local175 >= local165; local175--) {
						for (local184 = local136 - 1; local184 >= local157; local184--) {
							if (local184 >= local175 - arg6 / 2) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
				if (arg3 == 3) {
					for (local175 = local43; local175 < local56; local175++) {
						for (local184 = local136 - 1; local184 >= local157; local184--) {
							if (local175 - arg6 / 2 <= local184) {
								arg0[local79] = arg1;
							} else if (arg9) {
								arg0[local79] = arg4;
							}
							local79++;
						}
						local79 += local99;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (local175 = local108 - 1; local175 >= local165; local175--) {
				for (local184 = local136 - 1; local184 >= local157; local184--) {
					if (local175 >> 1 <= local184) {
						arg0[local79] = arg1;
					} else if (arg9) {
						arg0[local79] = arg4;
					}
					local79++;
				}
				local79 += local99;
			}
		} else if (arg3 == 1) {
			for (local175 = local108 - 1; local175 >= local165; local175--) {
				for (local184 = local7; local184 < local30; local184++) {
					if (local184 <= local175 << 1) {
						arg0[local79] = arg1;
					} else if (arg9) {
						arg0[local79] = arg4;
					}
					local79++;
				}
				local79 += local99;
			}
		} else if (arg3 == 2) {
			for (local175 = local43; local175 < local56; local175++) {
				for (local184 = local7; local184 < local30; local184++) {
					if (local184 >= local175 >> 1) {
						arg0[local79] = arg1;
					} else if (arg9) {
						arg0[local79] = arg4;
					}
					local79++;
				}
				local79 += local99;
			}
		} else if (arg3 == 3) {
			for (local175 = local43; local175 < local56; local175++) {
				for (local184 = local136 - 1; local184 >= local157; local184--) {
					if (local175 << 1 >= local184) {
						arg0[local79] = arg1;
					} else if (arg9) {
						arg0[local79] = arg4;
					}
					local79++;
				}
				local79 += local99;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!be;I)Lclient!be;")
	public static Component method4668(@OriginalArg(0) Component arg0) {
		if (arg0.layer != -1) {
			return InterfaceList.getComponent(arg0.layer);
		}
		@Pc(28) int local28 = arg0.id >>> 16;
		@Pc(33) HashTableIterator local33 = new HashTableIterator(InterfaceList.openInterfaces);
		for (@Pc(38) ComponentPointer local38 = (ComponentPointer) local33.method2701(); local38 != null; local38 = (ComponentPointer) local33.method2700()) {
			if (local28 == local38.anInt5878) {
				return InterfaceList.getComponent((int) local38.key);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBIIIII)V")
	public static void method4670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = arg2 - arg4;
		Static251.method4278(arg2);
		@Pc(23) int local23 = 0;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(35) int local35 = -arg2;
		@Pc(38) int local38 = -local18;
		@Pc(40) int local40 = local18;
		@Pc(42) int local42 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (arg1 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg1) {
			@Pc(52) int[] local52 = Static71.anIntArrayArray10[arg1];
			local61 = Static78.method1690(TextureOp29.anInt5063, arg5 - arg2, TextureOp29.anInt4164);
			local69 = Static78.method1690(TextureOp29.anInt5063, arg2 + arg5, TextureOp29.anInt4164);
			local78 = Static78.method1690(TextureOp29.anInt5063, arg5 - local18, TextureOp29.anInt4164);
			local87 = Static78.method1690(TextureOp29.anInt5063, arg5 + local18, TextureOp29.anInt4164);
			Static131.method2576(local52, local61, local78, arg3);
			Static131.method2576(local52, local78, local87, arg0);
			Static131.method2576(local52, local87, local69, arg3);
		}
		@Pc(107) int local107 = -1;
		while (local23 < local32) {
			local42 += 2;
			local107 += 2;
			local38 += local107;
			local35 += local42;
			if (local38 >= 0 && local40 >= 1) {
				local40--;
				Static241.anIntArray522[local40] = local23;
				local38 -= local40 << 1;
			}
			local23++;
			@Pc(264) int local264;
			@Pc(273) int local273;
			@Pc(280) int[] local280;
			@Pc(161) int local161;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				local161 = arg1 - local32;
				local61 = arg1 + local32;
				if (TextureOp29.anInt5773 <= local61 && TextureOp29.anInt2869 >= local161) {
					if (local32 >= local18) {
						local69 = Static78.method1690(TextureOp29.anInt5063, local23 + arg5, TextureOp29.anInt4164);
						local78 = Static78.method1690(TextureOp29.anInt5063, arg5 - local23, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							Static131.method2576(Static71.anIntArrayArray10[local61], local78, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							Static131.method2576(Static71.anIntArrayArray10[local161], local78, local69, arg3);
						}
					} else {
						local69 = Static241.anIntArray522[local32];
						local78 = Static78.method1690(TextureOp29.anInt5063, local23 + arg5, TextureOp29.anInt4164);
						local87 = Static78.method1690(TextureOp29.anInt5063, arg5 - local23, TextureOp29.anInt4164);
						local264 = Static78.method1690(TextureOp29.anInt5063, arg5 + local69, TextureOp29.anInt4164);
						local273 = Static78.method1690(TextureOp29.anInt5063, arg5 - local69, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							local280 = Static71.anIntArrayArray10[local61];
							Static131.method2576(local280, local87, local273, arg3);
							Static131.method2576(local280, local273, local264, arg0);
							Static131.method2576(local280, local264, local78, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							local280 = Static71.anIntArrayArray10[local161];
							Static131.method2576(local280, local87, local273, arg3);
							Static131.method2576(local280, local273, local264, arg0);
							Static131.method2576(local280, local264, local78, arg3);
						}
					}
				}
			}
			local161 = arg1 - local23;
			local61 = arg1 + local23;
			if (TextureOp29.anInt5773 <= local61 && TextureOp29.anInt2869 >= local161) {
				local69 = arg5 + local32;
				local78 = arg5 - local32;
				if (local69 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= local78) {
					local69 = Static78.method1690(TextureOp29.anInt5063, local69, TextureOp29.anInt4164);
					local78 = Static78.method1690(TextureOp29.anInt5063, local78, TextureOp29.anInt4164);
					if (local23 < local18) {
						local87 = local40 >= local23 ? local40 : Static241.anIntArray522[local23];
						local264 = Static78.method1690(TextureOp29.anInt5063, local87 + arg5, TextureOp29.anInt4164);
						local273 = Static78.method1690(TextureOp29.anInt5063, arg5 - local87, TextureOp29.anInt4164);
						if (TextureOp29.anInt2869 >= local61) {
							local280 = Static71.anIntArrayArray10[local61];
							Static131.method2576(local280, local78, local273, arg3);
							Static131.method2576(local280, local273, local264, arg0);
							Static131.method2576(local280, local264, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							local280 = Static71.anIntArrayArray10[local161];
							Static131.method2576(local280, local78, local273, arg3);
							Static131.method2576(local280, local273, local264, arg0);
							Static131.method2576(local280, local264, local69, arg3);
						}
					} else {
						if (TextureOp29.anInt2869 >= local61) {
							Static131.method2576(Static71.anIntArrayArray10[local61], local78, local69, arg3);
						}
						if (local161 >= TextureOp29.anInt5773) {
							Static131.method2576(Static71.anIntArrayArray10[local161], local78, local69, arg3);
						}
					}
				}
			}
		}
	}

}
