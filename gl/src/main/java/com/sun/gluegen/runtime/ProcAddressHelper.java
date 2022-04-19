package com.sun.gluegen.runtime;

import java.lang.reflect.Field;

public class ProcAddressHelper {

	public static void resetProcAddressTable(Object arg0, DynamicLookupHelper arg1) throws RuntimeException {
		Class var2 = arg0.getClass();
		Field[] var3 = var2.getFields();
		for (int var4 = 0; var4 < var3.length; var4++) {
			String var5 = var3[var4].getName();
			if (var5.startsWith("_addressof_")) {
				int var6 = "_addressof_".length();
				String var7 = var5.substring(var6);
				try {
					Field var8 = var3[var4];
					assert var8.getType() == Long.TYPE;
					long var9 = arg1.dynamicLookupFunction(var7);
					var8.setLong(arg0, var9);
				} catch (Exception var11) {
					throw new RuntimeException("Can not get proc address for method \"" + var7 + "\": Couldn't set value of field \"" + var5 + "\" in class " + var2.getName(), var11);
				}
			}
		}
	}
}
