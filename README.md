## Goals

* Identify all classes
  * Create new static classes by grouping related members
* Identify all methods
* Identify all fields
* Identify all local variables
* Remove any remaining obfuscation (possibly none left)
* Fix poor decompiler behavior (fernflower)
* Replace magic numbers and bitmasks with named final fields
* Refactor code to improve behavior/readability
* Modernize code/libraries (High DPI support, modern refresh rates, ...)
* Support existing servers via global config flags that adjust packet behaviors
* Organize classes into packages

OpenRS2 annotations are left in the source to build a deob map from, in case some of my changes aren't desirable.  
That mapping can be used to generate a new deob with everything renamed for you.

## Instructions

Build requirements:
* Java 8+

Runtime requirements:
* SD: Java 8+
* HD on Windows, use Java 15 or lower. There is a JOGL issue on 16+ related to how they grab the WGL context from the window.
* HD on Linux: Java 8+
* HD on macOS: Not possible yet on latest macOS. Might work for earlier OS versions.

```
git clone https://github.com/Pazaz/RT4-Client.git
cd RT4-Client
./gradlew run
```

You will be connected to a test server automatically.  
This server is provided by 2009scape for their own internal developments.
