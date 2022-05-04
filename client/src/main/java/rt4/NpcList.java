package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class NpcList {
    @OriginalMember(owner = "client!nm", name = "S", descriptor = "[Lclient!km;")
    public static final Npc[] npcs = new Npc[32768];
    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public static final int[] ids = new int[32768];
    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int size = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method2274() {
        for (@Pc(7) int local7 = 0; local7 < size; local7++) {
            @Pc(18) int local18 = ids[local7];
            @Pc(22) Npc local22 = npcs[local18];
            if (local22 != null) {
                method4514(local22.type.size, local22);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!fe;)V")
    public static void method4514(@OriginalArg(0) int arg0, @OriginalArg(2) PathingEntity arg1) {
        if (client.loop < arg1.anInt3395) {
            method553(arg1);
        } else if (arg1.anInt3386 >= client.loop) {
            method4665(arg1);
        } else {
            method2247(arg1);
        }
        if (arg1.xFine < 128 || arg1.zFine < 128 || arg1.xFine >= 13184 || arg1.zFine >= 13184) {
            arg1.seqId = -1;
            arg1.spotAnimId = -1;
            arg1.anInt3395 = 0;
            arg1.anInt3386 = 0;
            arg1.xFine = arg1.movementQueueX[0] * 128 + arg1.getSize() * 64;
            arg1.zFine = arg1.movementQueueZ[0] * 128 + arg1.getSize() * 64;
            arg1.method2689();
        }
        if (arg1 == PlayerList.self && (arg1.xFine < 1536 || arg1.zFine < 1536 || arg1.xFine >= 11776 || arg1.zFine >= 11776)) {
            arg1.spotAnimId = -1;
            arg1.anInt3395 = 0;
            arg1.anInt3386 = 0;
            arg1.seqId = -1;
            arg1.xFine = arg1.movementQueueX[0] * 128 + arg1.getSize() * 64;
            arg1.zFine = arg1.movementQueueZ[0] * 128 + arg1.getSize() * 64;
            arg1.method2689();
        }
        method949(arg1);
        method879(arg1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!fe;Z)V")
    public static void method553(@OriginalArg(0) PathingEntity arg0) {
        @Pc(8) int local8 = arg0.anInt3395 - client.loop;
        @Pc(20) int local20 = arg0.anInt3380 * 128 + arg0.getSize() * 64;
        @Pc(36) int local36 = arg0.anInt3428 * 128 + arg0.getSize() * 64;
        if (arg0.anInt3431 == 0) {
            arg0.anInt3400 = 1024;
        }
        arg0.xFine += (local20 - arg0.xFine) / local8;
        arg0.zFine += (local36 - arg0.zFine) / local8;
        if (arg0.anInt3431 == 1) {
            arg0.anInt3400 = 1536;
        }
        arg0.anInt3417 = 0;
        if (arg0.anInt3431 == 2) {
            arg0.anInt3400 = 0;
        }
        if (arg0.anInt3431 == 3) {
            arg0.anInt3400 = 512;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!fe;B)V")
    public static void method4665(@OriginalArg(0) PathingEntity arg0) {
        if (client.loop == arg0.anInt3386 || arg0.seqId == -1 || arg0.anInt3420 != 0 || arg0.anInt3360 + 1 > SeqTypeList.get(arg0.seqId).anIntArray474[arg0.anInt3425]) {
            @Pc(35) int local35 = arg0.anInt3386 - arg0.anInt3395;
            @Pc(41) int local41 = client.loop - arg0.anInt3395;
            @Pc(52) int local52 = arg0.anInt3380 * 128 + arg0.getSize() * 64;
            @Pc(64) int local64 = arg0.anInt3428 * 128 + arg0.getSize() * 64;
            @Pc(75) int local75 = arg0.anInt3416 * 128 + arg0.getSize() * 64;
            @Pc(86) int local86 = arg0.anInt3392 * 128 + arg0.getSize() * 64;
            arg0.xFine = (local41 * local75 + local52 * (local35 - local41)) / local35;
            arg0.zFine = (local86 * local41 + local64 * (local35 - local41)) / local35;
        }
        arg0.anInt3417 = 0;
        if (arg0.anInt3431 == 0) {
            arg0.anInt3400 = 1024;
        }
        if (arg0.anInt3431 == 1) {
            arg0.anInt3400 = 1536;
        }
        if (arg0.anInt3431 == 2) {
            arg0.anInt3400 = 0;
        }
        if (arg0.anInt3431 == 3) {
            arg0.anInt3400 = 512;
        }
        arg0.anInt3381 = arg0.anInt3400;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!fe;)V")
    public static void method2247(@OriginalArg(1) PathingEntity arg0) {
        @Pc(9) BasType local9 = arg0.getBasType();
        arg0.movementSeqId = local9.idleAnimationId;
        if (arg0.movementQueueSize == 0) {
            arg0.anInt3417 = 0;
            return;
        }
        if (arg0.seqId != -1 && arg0.anInt3420 == 0) {
            @Pc(40) SeqType local40 = SeqTypeList.get(arg0.seqId);
            if (arg0.anInt3405 > 0 && local40.anInt5363 == 0) {
                arg0.anInt3417++;
                return;
            }
            if (arg0.anInt3405 <= 0 && local40.anInt5349 == 0) {
                arg0.anInt3417++;
                return;
            }
        }
        @Pc(79) int local79 = arg0.xFine;
        @Pc(82) int local82 = arg0.zFine;
        @Pc(99) int local99 = arg0.movementQueueX[arg0.movementQueueSize - 1] * 128 + arg0.getSize() * 64;
        @Pc(116) int local116 = arg0.movementQueueZ[arg0.movementQueueSize - 1] * 128 + arg0.getSize() * 64;
        if (local99 - local79 > 256 || local99 - local79 < -256 || local116 - local82 > 256 || local116 - local82 < -256) {
            arg0.xFine = local99;
            arg0.zFine = local116;
            return;
        }
        if (local99 <= local79) {
            if (local79 <= local99) {
                if (local116 > local82) {
                    arg0.anInt3400 = 1024;
                } else if (local82 > local116) {
                    arg0.anInt3400 = 0;
                }
            } else if (local116 > local82) {
                arg0.anInt3400 = 768;
            } else if (local116 < local82) {
                arg0.anInt3400 = 256;
            } else {
                arg0.anInt3400 = 512;
            }
        } else if (local116 > local82) {
            arg0.anInt3400 = 1280;
        } else if (local82 > local116) {
            arg0.anInt3400 = 1792;
        } else {
            arg0.anInt3400 = 1536;
        }
        @Pc(224) int local224 = arg0.anInt3400 - arg0.anInt3381 & 0x7FF;
        @Pc(227) int local227 = local9.turnAnimation1;
        if (local224 > 1024) {
            local224 -= 2048;
        }
        @Pc(233) boolean local233 = true;
        @Pc(235) byte local235 = 1;
        if (local224 >= -256 && local224 <= 256) {
            local227 = local9.walkAnimation;
        } else if (local224 >= 256 && local224 < 768) {
            local227 = local9.turnAnimation3;
        } else if (local224 >= -768 && local224 <= -256) {
            local227 = local9.turnAnimation2;
        }
        @Pc(273) int local273 = 4;
        if (local227 == -1) {
            local227 = local9.walkAnimation;
        }
        arg0.movementSeqId = local227;
        if (arg0 instanceof Npc) {
            local233 = ((Npc) arg0).type.aBoolean181;
        }
        if (local233) {
            if (arg0.anInt3381 != arg0.anInt3400 && arg0.faceEntity == -1 && arg0.anInt3376 != 0) {
                local273 = 2;
            }
            if (arg0.movementQueueSize > 2) {
                local273 = 6;
            }
            if (arg0.movementQueueSize > 3) {
                local273 = 8;
            }
            if (arg0.anInt3417 > 0 && arg0.movementQueueSize > 1) {
                local273 = 8;
                arg0.anInt3417--;
            }
        } else {
            if (arg0.movementQueueSize > 1) {
                local273 = 6;
            }
            if (arg0.movementQueueSize > 2) {
                local273 = 8;
            }
            if (arg0.anInt3417 > 0 && arg0.movementQueueSize > 1) {
                arg0.anInt3417--;
                local273 = 8;
            }
        }
        if (arg0.movementQueueSpeed[arg0.movementQueueSize - 1] == 2) {
            local273 <<= 0x1;
            local235 = 2;
        } else if (arg0.movementQueueSpeed[arg0.movementQueueSize - 1] == 0) {
            local235 = 0;
            local273 >>= 0x1;
        }
        if (local273 < 8 || local9.runAnimationId == -1) {
            if (local9.anInt1062 != -1 && local235 == 0) {
                if (local9.turnAnimation1 == arg0.movementSeqId && local9.anInt1042 != -1) {
                    arg0.movementSeqId = local9.anInt1042;
                } else if (local9.turnAnimation2 == arg0.movementSeqId && local9.anInt1066 != -1) {
                    arg0.movementSeqId = local9.anInt1066;
                } else if (local9.turnAnimation3 == arg0.movementSeqId && local9.anInt1048 != -1) {
                    arg0.movementSeqId = local9.anInt1048;
                } else {
                    arg0.movementSeqId = local9.anInt1062;
                }
            }
        } else if (local9.turnAnimation1 == arg0.movementSeqId && local9.runAnimationId2 != -1) {
            arg0.movementSeqId = local9.runAnimationId2;
        } else if (arg0.movementSeqId == local9.turnAnimation2 && local9.runAnimationId3 != -1) {
            arg0.movementSeqId = local9.runAnimationId3;
        } else if (arg0.movementSeqId == local9.turnAnimation3 && local9.runAnimationId4 != -1) {
            arg0.movementSeqId = local9.runAnimationId4;
        } else {
            arg0.movementSeqId = local9.runAnimationId;
        }
        if (local9.anInt1032 != -1) {
            local273 <<= 0x7;
            if (arg0.movementQueueSize == 1) {
                @Pc(594) int local594 = (local99 >= arg0.xFine ? local99 - arg0.xFine : -local99 + arg0.xFine) << 7;
                @Pc(600) int local600 = arg0.anInt3358 * arg0.anInt3358;
                @Pc(622) int local622 = (local116 < arg0.zFine ? arg0.zFine - local116 : -arg0.zFine + local116) << 7;
                @Pc(629) int local629 = local594 > local622 ? local594 : local622;
                @Pc(636) int local636 = local9.anInt1032 * 2 * local629;
                if (local636 < local600) {
                    arg0.anInt3358 /= 2;
                } else if (local629 < local600 / 2) {
                    arg0.anInt3358 -= local9.anInt1032;
                    if (arg0.anInt3358 < 0) {
                        arg0.anInt3358 = 0;
                    }
                } else if (arg0.anInt3358 < local273) {
                    arg0.anInt3358 += local9.anInt1032;
                    if (arg0.anInt3358 > local273) {
                        arg0.anInt3358 = local273;
                    }
                }
            } else if (local273 > arg0.anInt3358) {
                arg0.anInt3358 += local9.anInt1032;
                if (local273 < arg0.anInt3358) {
                    arg0.anInt3358 = local273;
                }
            } else if (arg0.anInt3358 > 0) {
                arg0.anInt3358 -= local9.anInt1032;
                if (arg0.anInt3358 < 0) {
                    arg0.anInt3358 = 0;
                }
            }
            local273 = arg0.anInt3358 >> 7;
            if (local273 < 1) {
                local273 = 1;
            }
        }
        if (local79 < local99) {
            arg0.xFine += local273;
            if (local99 < arg0.xFine) {
                arg0.xFine = local99;
            }
        } else if (local79 > local99) {
            arg0.xFine -= local273;
            if (local99 > arg0.xFine) {
                arg0.xFine = local99;
            }
        }
        if (local82 < local116) {
            arg0.zFine += local273;
            if (arg0.zFine > local116) {
                arg0.zFine = local116;
            }
        } else if (local116 < local82) {
            arg0.zFine -= local273;
            if (local116 > arg0.zFine) {
                arg0.zFine = local116;
            }
        }
        if (arg0.xFine == local99 && local116 == arg0.zFine) {
            arg0.movementQueueSize--;
            if (arg0.anInt3405 > 0) {
                arg0.anInt3405--;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!fe;)V")
	public static void method949(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt3376 == 0) {
			return;
		}
		@Pc(13) BasType local13 = arg0.getBasType();
		@Pc(43) int local43;
		@Pc(36) int local36;
		if (arg0.faceEntity != -1 && arg0.faceEntity < 32768) {
			@Pc(26) Npc local26 = npcs[arg0.faceEntity];
			if (local26 != null) {
				local36 = arg0.zFine - local26.zFine;
				local43 = arg0.xFine - local26.xFine;
				if (local43 != 0 || local36 != 0) {
					arg0.anInt3400 = (int) (Math.atan2((double) local43, (double) local36) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(94) int local94;
		@Pc(70) int local70;
		if (arg0.faceEntity >= 32768) {
			local70 = arg0.faceEntity - 32768;
			if (local70 == PlayerList.selfId) {
				local70 = 2047;
			}
			@Pc(83) Player local83 = PlayerList.players[local70];
			if (local83 != null) {
				local94 = arg0.zFine - local83.zFine;
				local36 = arg0.xFine - local83.xFine;
				if (local36 != 0 || local94 != 0) {
					arg0.anInt3400 = (int) (Math.atan2((double) local36, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.faceX != 0 || arg0.faceY != 0) && (arg0.movementQueueSize == 0 || arg0.anInt3417 > 0)) {
			local70 = arg0.xFine - (arg0.faceX - Static225.originX - Static225.originX) * 64;
			local43 = arg0.zFine - (arg0.faceY - Static142.originZ - Static142.originZ) * 64;
			if (local70 != 0 || local43 != 0) {
				arg0.anInt3400 = (int) (Math.atan2((double) local70, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.faceY = 0;
			arg0.faceX = 0;
		}
		local70 = arg0.anInt3400 - arg0.anInt3381 & 0x7FF;
		if (local70 == 0) {
			arg0.anInt3385 = 0;
			arg0.anInt3414 = 0;
		} else if (local13.anInt1038 == 0) {
			arg0.anInt3385++;
			@Pc(226) boolean local226;
			if (local70 > 1024) {
				arg0.anInt3381 -= arg0.anInt3376;
				local226 = true;
				if (local70 < arg0.anInt3376 || local70 > 2048 - arg0.anInt3376) {
					arg0.anInt3381 = arg0.anInt3400;
					local226 = false;
				}
				if (local13.idleAnimationId == arg0.movementSeqId && (arg0.anInt3385 > 25 || local226)) {
					if (local13.anInt1036 == -1) {
						arg0.movementSeqId = local13.walkAnimation;
					} else {
						arg0.movementSeqId = local13.anInt1036;
					}
				}
			} else {
				local226 = true;
				arg0.anInt3381 += arg0.anInt3376;
				if (arg0.anInt3376 > local70 || local70 > 2048 - arg0.anInt3376) {
					local226 = false;
					arg0.anInt3381 = arg0.anInt3400;
				}
				if (local13.idleAnimationId == arg0.movementSeqId && (arg0.anInt3385 > 25 || local226)) {
					if (local13.anInt1067 == -1) {
						arg0.movementSeqId = local13.walkAnimation;
					} else {
						arg0.movementSeqId = local13.anInt1067;
					}
				}
			}
			arg0.anInt3381 &= 0x7FF;
		} else {
			if (local13.idleAnimationId == arg0.movementSeqId && arg0.anInt3385 > 25) {
				if (local13.anInt1067 == -1) {
					arg0.movementSeqId = local13.walkAnimation;
				} else {
					arg0.movementSeqId = local13.anInt1067;
				}
			}
			local43 = arg0.anInt3400 << 5;
			if (local43 != arg0.anInt3402) {
				arg0.anInt3387 = 0;
				arg0.anInt3402 = local43;
				local36 = local43 - arg0.anInt3377 & 0xFFFF;
				local94 = arg0.anInt3414 * arg0.anInt3414 / (local13.anInt1038 * 2);
				@Pc(471) int local471;
				if (arg0.anInt3414 > 0 && local36 >= local94 && local36 - local94 < 32768) {
					arg0.anInt3397 = local36 / 2;
					arg0.aBoolean167 = true;
					local471 = local13.anInt1031 * local13.anInt1031 / (local13.anInt1038 * 2);
					if (local471 > 32767) {
						local471 = 32767;
					}
					if (local471 < arg0.anInt3397) {
						arg0.anInt3397 = local36 - local471;
					}
				} else if (arg0.anInt3414 < 0 && local94 <= 65536 - local36 && 65536 - local36 - local94 < 32768) {
					arg0.anInt3397 = (65536 - local36) / 2;
					arg0.aBoolean167 = true;
					local471 = local13.anInt1031 * local13.anInt1031 / (local13.anInt1038 * 2);
					if (local471 > 32767) {
						local471 = 32767;
					}
					if (local471 < arg0.anInt3397) {
						arg0.anInt3397 = 65536 - local36 - local471;
					}
				} else {
					arg0.aBoolean167 = false;
				}
			}
			if (arg0.anInt3414 == 0) {
				local36 = arg0.anInt3402 - arg0.anInt3377 & 0xFFFF;
				if (local36 < local13.anInt1038) {
					arg0.anInt3377 = arg0.anInt3402;
				} else {
					arg0.anInt3387 = 0;
					local94 = local13.anInt1031 * local13.anInt1031 / (local13.anInt1038 * 2);
					arg0.aBoolean167 = true;
					if (local94 > 32767) {
						local94 = 32767;
					}
					if (local36 >= 32768) {
						arg0.anInt3414 = -local13.anInt1038;
						arg0.anInt3397 = (65536 - local36) / 2;
						if (local94 < arg0.anInt3397) {
							arg0.anInt3397 = 65536 - local36 - local94;
						}
					} else {
						arg0.anInt3414 = local13.anInt1038;
						arg0.anInt3397 = local36 / 2;
						if (local94 < arg0.anInt3397) {
							arg0.anInt3397 = local36 - local94;
						}
					}
				}
			} else if (arg0.anInt3414 <= 0) {
				if (arg0.anInt3387 >= arg0.anInt3397) {
					arg0.aBoolean167 = false;
				}
				if (!arg0.aBoolean167) {
					arg0.anInt3414 += local13.anInt1038;
					if (arg0.anInt3414 > 0) {
						arg0.anInt3414 = 0;
					}
				} else if (-local13.anInt1031 < arg0.anInt3414) {
					arg0.anInt3414 -= local13.anInt1038;
				}
			} else {
				if (arg0.anInt3397 <= arg0.anInt3387) {
					arg0.aBoolean167 = false;
				}
				if (!arg0.aBoolean167) {
					arg0.anInt3414 -= local13.anInt1038;
					if (arg0.anInt3414 < 0) {
						arg0.anInt3414 = 0;
					}
				} else if (arg0.anInt3414 < local13.anInt1031) {
					arg0.anInt3414 += local13.anInt1038;
				}
			}
			arg0.anInt3377 += arg0.anInt3414;
			arg0.anInt3377 &= 0xFFFF;
			if (arg0.anInt3414 <= 0) {
				arg0.anInt3387 -= arg0.anInt3414;
			} else {
				arg0.anInt3387 += arg0.anInt3414;
			}
			arg0.anInt3381 = arg0.anInt3377 >> 5;
		}
	}

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!fe;I)V")
	public static void method879(@OriginalArg(0) PathingEntity arg0) {
		arg0.aBoolean171 = false;
		@Pc(18) SeqType local18;
		if (arg0.movementSeqId != -1) {
			local18 = SeqTypeList.get(arg0.movementSeqId);
			if (local18 == null || local18.frames == null) {
				arg0.movementSeqId = -1;
			} else {
				arg0.anInt3396++;
				if (local18.frames.length > arg0.anInt3407 && arg0.anInt3396 > local18.anIntArray474[arg0.anInt3407]) {
					arg0.anInt3396 = 1;
					arg0.anInt3407++;
					arg0.anInt3388++;
					SoundPlayer.playSeqSound(arg0.zFine, local18, arg0.xFine, arg0 == PlayerList.self, arg0.anInt3407);
				}
				if (arg0.anInt3407 >= local18.frames.length) {
					arg0.anInt3407 = 0;
					arg0.anInt3396 = 0;
					SoundPlayer.playSeqSound(arg0.zFine, local18, arg0.xFine, PlayerList.self == arg0, arg0.anInt3407);
				}
				arg0.anInt3388 = arg0.anInt3407 + 1;
				if (arg0.anInt3388 >= local18.frames.length) {
					arg0.anInt3388 = 0;
				}
			}
		}
		@Pc(156) int local156;
		if (arg0.spotAnimId != -1 && client.loop >= arg0.spotAnimStart) {
			local156 = SpotAnimTypeList.get(arg0.spotAnimId).seqId;
			if (local156 == -1) {
				arg0.spotAnimId = -1;
			} else {
				@Pc(165) SeqType local165 = SeqTypeList.get(local156);
				if (local165 == null || local165.frames == null) {
					arg0.spotAnimId = -1;
				} else {
					if (arg0.anInt3399 < 0) {
						arg0.anInt3399 = 0;
						SoundPlayer.playSeqSound(arg0.zFine, local165, arg0.xFine, PlayerList.self == arg0, 0);
					}
					arg0.anInt3361++;
					if (arg0.anInt3399 < local165.frames.length && local165.anIntArray474[arg0.anInt3399] < arg0.anInt3361) {
						arg0.anInt3399++;
						arg0.anInt3361 = 1;
						SoundPlayer.playSeqSound(arg0.zFine, local165, arg0.xFine, PlayerList.self == arg0, arg0.anInt3399);
					}
					if (arg0.anInt3399 >= local165.frames.length) {
						arg0.spotAnimId = -1;
					}
					arg0.anInt3418 = arg0.anInt3399 + 1;
					if (local165.frames.length <= arg0.anInt3418) {
						arg0.anInt3418 = -1;
					}
				}
			}
		}
		if (arg0.seqId != -1 && arg0.anInt3420 <= 1) {
			local18 = SeqTypeList.get(arg0.seqId);
			if (local18.anInt5363 == 1 && arg0.anInt3405 > 0 && client.loop >= arg0.anInt3395 && client.loop > arg0.anInt3386) {
				arg0.anInt3420 = 1;
				return;
			}
		}
		if (arg0.seqId != -1 && arg0.anInt3420 == 0) {
			local18 = SeqTypeList.get(arg0.seqId);
			if (local18 == null || local18.frames == null) {
				arg0.seqId = -1;
			} else {
				arg0.anInt3360++;
				if (arg0.anInt3425 < local18.frames.length && arg0.anInt3360 > local18.anIntArray474[arg0.anInt3425]) {
					arg0.anInt3360 = 1;
					arg0.anInt3425++;
					SoundPlayer.playSeqSound(arg0.zFine, local18, arg0.xFine, arg0 == PlayerList.self, arg0.anInt3425);
				}
				if (local18.frames.length <= arg0.anInt3425) {
					arg0.anInt3425 -= local18.anInt5362;
					arg0.anInt3371++;
					if (arg0.anInt3371 >= local18.anInt5357) {
						arg0.seqId = -1;
					} else if (arg0.anInt3425 >= 0 && local18.frames.length > arg0.anInt3425) {
						SoundPlayer.playSeqSound(arg0.zFine, local18, arg0.xFine, PlayerList.self == arg0, arg0.anInt3425);
					} else {
						arg0.seqId = -1;
					}
				}
				arg0.anInt3373 = arg0.anInt3425 + 1;
				if (arg0.anInt3373 >= local18.frames.length) {
					arg0.anInt3373 -= local18.anInt5362;
					if (local18.anInt5357 <= arg0.anInt3371 + 1) {
						arg0.anInt3373 = -1;
					} else if (arg0.anInt3373 < 0 || arg0.anInt3373 >= local18.frames.length) {
						arg0.anInt3373 = -1;
					}
				}
				arg0.aBoolean171 = local18.aBoolean279;
			}
		}
		if (arg0.anInt3420 > 0) {
			arg0.anInt3420--;
		}
		for (local156 = 0; local156 < arg0.aClass147Array3.length; local156++) {
			@Pc(545) Npc_Class147 local545 = arg0.aClass147Array3[local156];
			if (local545 != null) {
				if (local545.anInt5408 > 0) {
					local545.anInt5408--;
				} else {
					@Pc(570) SeqType local570 = SeqTypeList.get(local545.anInt5396);
					if (local570 == null || local570.frames == null) {
						arg0.aClass147Array3[local156] = null;
					} else {
						local545.anInt5404++;
						if (local545.anInt5399 < local570.frames.length && local545.anInt5404 > local570.anIntArray474[local545.anInt5399]) {
							local545.anInt5399++;
							local545.anInt5404 = 1;
							SoundPlayer.playSeqSound(arg0.zFine, local570, arg0.xFine, arg0 == PlayerList.self, local545.anInt5399);
						}
						if (local570.frames.length <= local545.anInt5399) {
							local545.anInt5400++;
							local545.anInt5399 -= local570.anInt5362;
							if (local570.anInt5357 <= local545.anInt5400) {
								arg0.aClass147Array3[local156] = null;
							} else if (local545.anInt5399 >= 0 && local545.anInt5399 < local570.frames.length) {
								SoundPlayer.playSeqSound(arg0.zFine, local570, arg0.xFine, PlayerList.self == arg0, local545.anInt5399);
							} else {
								arg0.aClass147Array3[local156] = null;
							}
						}
						local545.anInt5398 = local545.anInt5399 + 1;
						if (local570.frames.length <= local545.anInt5398) {
							local545.anInt5398 -= local570.anInt5362;
							if (local545.anInt5400 + 1 >= local570.anInt5357) {
								local545.anInt5398 = -1;
							} else if (local545.anInt5398 < 0 || local570.frames.length <= local545.anInt5398) {
								local545.anInt5398 = -1;
							}
						}
					}
				}
			}
		}
	}
}
