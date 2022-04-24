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

OpenRS2 annotations are left in the source to build a deob map from, in case some of my changes aren't desirable.  
That mapping can be used to generate a new deob with everything renamed for you.

## Instructions

```
git clone https://github.com/Pazaz/RT4-Client.git
cd RT4-Client
./gradlew run
```

You will be connected to a test server automatically.
This server is provided by 2009scape for their own internal developments.
