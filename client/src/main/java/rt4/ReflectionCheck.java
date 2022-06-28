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

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Lclient!ih;")
	public static LinkedList queue = new LinkedList();

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "[Lsignlink!im;")
	public PrivilegedRequest[] methodRequests;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "[I")
	public int[] fieldValues;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
	public int[] errors;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "[I")
	public int[] types;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "[[[B")
	public byte[][][] methodArguments;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "[Lsignlink!im;")
	public PrivilegedRequest[] fieldRequests;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!i;II)V")
	public static void loop(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(18) ReflectionCheck local18 = (ReflectionCheck) queue.head();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			@Pc(25) int local25;
			for (local25 = 0; local25 < local18.size; local25++) {
				if (local18.fieldRequests[local25] != null) {
					if (local18.fieldRequests[local25].status == 2) {
						local18.errors[local25] = -5;
					}
					if (local18.fieldRequests[local25].status == 0) {
						local23 = true;
					}
				}
				if (local18.methodRequests[local25] != null) {
					if (local18.methodRequests[local25].status == 2) {
						local18.errors[local25] = -6;
					}
					if (local18.methodRequests[local25].status == 0) {
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
			arg0.p4(local18.id);
			for (@Pc(121) int local121 = 0; local121 < local18.size; local121++) {
				if (local18.errors[local121] == 0) {
					try {
						@Pc(151) int local151 = local18.types[local121];
						@Pc(168) Field local168;
						@Pc(195) int local195;
						if (local151 == 0) {
							local168 = (Field) local18.fieldRequests[local121].result;
							local195 = local168.getInt(null);
							arg0.p1(0);
							arg0.p4(local195);
						} else if (local151 == 1) {
							local168 = (Field) local18.fieldRequests[local121].result;
							local168.setInt(null, local18.fieldValues[local121]);
							arg0.p1(0);
						} else if (local151 == 2) {
							local168 = (Field) local18.fieldRequests[local121].result;
							local195 = local168.getModifiers();
							arg0.p1(0);
							arg0.p4(local195);
						}
						@Pc(234) Method local234;
						if (local151 == 3) {
							local234 = (Method) local18.methodRequests[local121].result;
							@Pc(239) byte[][] local239 = local18.methodArguments[local121];
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
							local234 = (Method) local18.methodRequests[local121].result;
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
					arg0.p1(local18.errors[local121]);
				}
			}
			arg0.addcrc(local25);
			arg0.psize1(arg0.offset - local25);
			local18.unlink();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lsignlink!ll;Lclient!wa;IB)V")
	public static void push(@OriginalArg(0) SignLink arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
		@Pc(17) ReflectionCheck check = new ReflectionCheck();
		check.size = arg1.g1();
		check.id = arg1.g4();
		check.methodRequests = new PrivilegedRequest[check.size];
		check.errors = new int[check.size];
		check.methodArguments = new byte[check.size][][];
		check.fieldRequests = new PrivilegedRequest[check.size];
		check.types = new int[check.size];
		check.fieldValues = new int[check.size];
		for (@Pc(59) int local59 = 0; local59 < check.size; local59++) {
			try {
				@Pc(71) int local71 = arg1.g1();
				@Pc(93) String local93;
				@Pc(104) String local104;
				@Pc(95) int local95;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local93 = new String(arg1.gjstr().method3148());
					local95 = 0;
					local104 = new String(arg1.gjstr().method3148());
					if (local71 == 1) {
						local95 = arg1.g4();
					}
					check.types[local59] = local71;
					check.fieldValues[local59] = local95;
					check.fieldRequests[local59] = arg0.getDeclaredField(local104, classForName(local93));
				} else if (local71 == 3 || local71 == 4) {
					local93 = new String(arg1.gjstr().method3148());
					local104 = new String(arg1.gjstr().method3148());
					local95 = arg1.g1();
					@Pc(171) String[] local171 = new String[local95];
					for (@Pc(173) int local173 = 0; local173 < local95; local173++) {
						local171[local173] = new String(arg1.gjstr().method3148());
					}
					@Pc(193) byte[][] local193 = new byte[local95][];
					@Pc(210) int local210;
					if (local71 == 3) {
						for (@Pc(199) int local199 = 0; local199 < local95; local199++) {
							local210 = arg1.g4();
							local193[local199] = new byte[local210];
							arg1.gdata(local210, local193[local199]);
						}
					}
					check.types[local59] = local71;
					@Pc(234) Class<?>[] local234 = new Class[local95];
					for (local210 = 0; local210 < local95; local210++) {
						local234[local210] = classForName(local171[local210]);
					}
					check.methodRequests[local59] = arg0.getDeclaredMethod(classForName(local93), local234, local104);
					check.methodArguments[local59] = local193;
				}
			} catch (@Pc(269) ClassNotFoundException local269) {
				check.errors[local59] = -1;
			} catch (@Pc(276) SecurityException local276) {
				check.errors[local59] = -2;
			} catch (@Pc(283) NullPointerException local283) {
				check.errors[local59] = -3;
			} catch (@Pc(290) Exception local290) {
				check.errors[local59] = -4;
			} catch (@Pc(297) Throwable local297) {
				check.errors[local59] = -5;
			}
		}
		queue.addTail(check);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public static void clear() {
		queue = new LinkedList();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class<?> classForName(@OriginalArg(1) String name) throws ClassNotFoundException {
		if (name.equals("B")) {
			return Byte.TYPE;
		} else if (name.equals("I")) {
			return Integer.TYPE;
		} else if (name.equals("S")) {
			return Short.TYPE;
		} else if (name.equals("J")) {
			return Long.TYPE;
		} else if (name.equals("Z")) {
			return Boolean.TYPE;
		} else if (name.equals("F")) {
			return Float.TYPE;
		} else if (name.equals("D")) {
			return Double.TYPE;
		} else if (name.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(name);
		}
	}
}
