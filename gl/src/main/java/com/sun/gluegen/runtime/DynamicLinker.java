package com.sun.gluegen.runtime;

interface DynamicLinker {

	long openLibrary(String arg0);

	void closeLibrary(long arg0);
}
