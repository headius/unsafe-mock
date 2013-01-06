unsafe-mock
-----------

This library provides a false version of sun.misc.Unsafe that supports all APIs
up through the new "fences" API in Java 8 EA builds b71 and later. This Unsafe
is in the package sun_misc to avoid conflicting with the real one during
builds. The usual use of this library will be to compile against the false
sun_misc.Unsafe and then use a package-rewriting tool like JarJarLinks to
rewrite to sun.misc.Unsafe. It is up to you to perform appropriate checks to
know which of the Unsafe methods are actually available on the real version,
and whether Unsafe is available at all. 
