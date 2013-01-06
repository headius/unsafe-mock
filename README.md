unsafe-mock
-----------

This library provides a false version of sun.misc.Unsafe that supports all APIs
up through the new "fences" API in Java 8 EA builds b71 and later. This Unsafe
is a partial copy of the one from Java 8 EA build b71, and it is expected that
if you want to build against it you put it in javac's bootclasspath. You are
responsible for determining whether you can access Unsafe and which methods
are available; this library is only to provide an all-inclusive Unsafe against
which you can compile.
