package com.sun.gluegen.runtime;

public class WindowsDynamicLinkerImpl implements DynamicLinker {

	private static native int FreeLibrary(long arg0);

	private static native long LoadLibraryA(String arg0);

	public long openLibrary(String arg0) {
		return LoadLibraryA(arg0);
	}

	public void closeLibrary(long arg0) {
		FreeLibrary(arg0);
	}
}
