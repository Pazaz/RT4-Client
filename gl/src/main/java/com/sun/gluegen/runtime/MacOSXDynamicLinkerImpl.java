package com.sun.gluegen.runtime;

public class MacOSXDynamicLinkerImpl implements DynamicLinker {

	private static native int dlclose(long arg0);

	private static native long dlopen(String arg0, int arg1);

	public long openLibrary(String arg0) {
		return dlopen(arg0, 9);
	}

	public void closeLibrary(long arg0) {
		dlclose(arg0);
	}
}
