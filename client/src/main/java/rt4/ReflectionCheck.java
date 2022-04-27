package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@OriginalClass("client!ed")
public final class ReflectionCheck extends Node {

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "[Lsignlink!im;")
	public PrivilegedRequest[] aClass212Array1;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "[Lsignlink!im;")
	public PrivilegedRequest[] aClass212Array2;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
	public int anInt1732;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!i;II)V")
    public static void loop(@OriginalArg(0) Packet arg0) {
        while (true) {
            @Pc(18) ReflectionCheck local18 = (ReflectionCheck) Static204.aClass69_113.start();
            if (local18 == null) {
                return;
            }
            @Pc(23) boolean local23 = false;
            @Pc(25) int local25;
            for (local25 = 0; local25 < local18.anInt1725; local25++) {
                if (local18.aClass212Array2[local25] != null) {
                    if (local18.aClass212Array2[local25].status == 2) {
                        local18.anIntArray138[local25] = -5;
                    }
                    if (local18.aClass212Array2[local25].status == 0) {
                        local23 = true;
                    }
                }
                if (local18.aClass212Array1[local25] != null) {
                    if (local18.aClass212Array1[local25].status == 2) {
                        local18.anIntArray138[local25] = -6;
                    }
                    if (local18.aClass212Array1[local25].status == 0) {
                        local23 = true;
                    }
                }
            }
            if (local23) {
                return;
            }
            arg0.p1isaac(163);
            arg0.p1(0);
            local25 = arg0.offset;
            arg0.p4(local18.anInt1732);
            for (@Pc(121) int local121 = 0; local121 < local18.anInt1725; local121++) {
                if (local18.anIntArray138[local121] == 0) {
                    try {
                        @Pc(151) int local151 = local18.anIntArray139[local121];
                        @Pc(168) Field local168;
                        @Pc(195) int local195;
                        if (local151 == 0) {
                            local168 = (Field) local18.aClass212Array2[local121].result;
                            local195 = local168.getInt(null);
                            arg0.p1(0);
                            arg0.p4(local195);
                        } else if (local151 == 1) {
                            local168 = (Field) local18.aClass212Array2[local121].result;
                            local168.setInt(null, local18.anIntArray137[local121]);
                            arg0.p1(0);
                        } else if (local151 == 2) {
                            local168 = (Field) local18.aClass212Array2[local121].result;
                            local195 = local168.getModifiers();
                            arg0.p1(0);
                            arg0.p4(local195);
                        }
                        @Pc(234) Method local234;
                        if (local151 == 3) {
                            local234 = (Method) local18.aClass212Array1[local121].result;
                            @Pc(239) byte[][] local239 = local18.aByteArrayArrayArray6[local121];
                            @Pc(243) Object[] local243 = new Object[local239.length];
                            for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
                                @Pc(259) ObjectInputStream local259 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
                                local243[local245] = local259.readObject();
                            }
                            @Pc(272) Object local272 = local234.invoke(null, local243);
                            if (local272 == null) {
                                arg0.p1(0);
                            } else if (local272 instanceof Number) {
                                arg0.p1(1);
                                arg0.p8(((Number) local272).longValue());
                            } else if (local272 instanceof JagString) {
                                arg0.p1(2);
                                arg0.pjstr((JagString) local272);
                            } else {
                                arg0.p1(4);
                            }
                        } else if (local151 == 4) {
                            local234 = (Method) local18.aClass212Array1[local121].result;
                            local195 = local234.getModifiers();
                            arg0.p1(0);
                            arg0.p4(local195);
                        }
                    } catch (@Pc(338) ClassNotFoundException local338) {
                        arg0.p1(-10);
                    } catch (@Pc(344) InvalidClassException local344) {
                        arg0.p1(-11);
                    } catch (@Pc(350) StreamCorruptedException local350) {
                        arg0.p1(-12);
                    } catch (@Pc(356) OptionalDataException local356) {
                        arg0.p1(-13);
                    } catch (@Pc(362) IllegalAccessException local362) {
                        arg0.p1(-14);
                    } catch (@Pc(368) IllegalArgumentException local368) {
                        arg0.p1(-15);
                    } catch (@Pc(374) InvocationTargetException local374) {
                        arg0.p1(-16);
                    } catch (@Pc(380) SecurityException local380) {
                        arg0.p1(-17);
                    } catch (@Pc(386) IOException local386) {
                        arg0.p1(-18);
                    } catch (@Pc(392) NullPointerException local392) {
                        arg0.p1(-19);
                    } catch (@Pc(398) Exception local398) {
                        arg0.p1(-20);
                    } catch (@Pc(404) Throwable local404) {
                        arg0.p1(-21);
                    }
                } else {
                    arg0.p1(local18.anIntArray138[local121]);
                }
            }
            arg0.pCrc32(local25);
            arg0.p1len(arg0.offset - local25);
            local18.unlink();
        }
    }
}
