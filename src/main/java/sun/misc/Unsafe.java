package sun.misc;

import java.lang.reflect.Field;
import java.security.ProtectionDomain;

public final class Unsafe {

    private Unsafe() {
    }
    private static final Unsafe theUnsafe = new Unsafe();

    public static Unsafe getUnsafe() {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public int getInt(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putInt(Object o, long offset, int x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public Object getObject(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putObject(Object o, long offset, Object x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public boolean getBoolean(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putBoolean(Object o, long offset, boolean x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public byte getByte(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putByte(Object o, long offset, byte x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public short getShort(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putShort(Object o, long offset, short x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public char getChar(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putChar(Object o, long offset, char x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long getLong(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putLong(Object o, long offset, long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public float getFloat(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putFloat(Object o, long offset, float x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public double getDouble(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putDouble(Object o, long offset, double x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public int getInt(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putInt(Object o, int offset, int x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public Object getObject(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putObject(Object o, int offset, Object x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public boolean getBoolean(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putBoolean(Object o, int offset, boolean x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public byte getByte(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putByte(Object o, int offset, byte x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public short getShort(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putShort(Object o, int offset, short x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public char getChar(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putChar(Object o, int offset, char x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public long getLong(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putLong(Object o, int offset, long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public float getFloat(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putFloat(Object o, int offset, float x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public double getDouble(Object o, int offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public void putDouble(Object o, int offset, double x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    // These work on values in the C heap.
    public byte getByte(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putByte(long address, byte x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public short getShort(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putShort(long address, short x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public char getChar(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putChar(long address, char x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public int getInt(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putInt(long address, int x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long getLong(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putLong(long address, long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public float getFloat(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putFloat(long address, float x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public double getDouble(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putDouble(long address, double x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long getAddress(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putAddress(long address, long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    /// wrappers for malloc, realloc, free:
    public long allocateMemory(long bytes) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long reallocateMemory(long address, long bytes) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void setMemory(Object o, long offset, long bytes, byte value) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void setMemory(long address, long bytes, byte value) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void copyMemory(Object srcBase, long srcOffset,
            Object destBase, long destOffset,
            long bytes) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void copyMemory(long srcAddress, long destAddress, long bytes) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void freeMemory(long address) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }
    /// random queries
    public static final int INVALID_FIELD_OFFSET = -1;

    @Deprecated
    public int fieldOffset(Field f) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    @Deprecated
    public Object staticFieldBase(Class<?> c) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long staticFieldOffset(Field f) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long objectFieldOffset(Field f) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public Object staticFieldBase(Field f) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public boolean shouldBeInitialized(Class<?> c) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void ensureClassInitialized(Class<?> c) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public int arrayBaseOffset(Class<?> arrayClass) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }
    public static int ARRAY_BOOLEAN_BASE_OFFSET = -1;
    public static int ARRAY_BYTE_BASE_OFFSET = -1;
    public static int ARRAY_SHORT_BASE_OFFSET = -1;
    public static int ARRAY_CHAR_BASE_OFFSET = -1;
    public static int ARRAY_INT_BASE_OFFSET = -1;
    public static int ARRAY_LONG_BASE_OFFSET = -1;
    public static int ARRAY_FLOAT_BASE_OFFSET = -1;
    public static int ARRAY_DOUBLE_BASE_OFFSET = -1;
    public static int ARRAY_OBJECT_BASE_OFFSET = -1;

    public int arrayIndexScale(Class<?> arrayClass) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }
    public static final int ARRAY_BOOLEAN_INDEX_SCALE = -1;
    public static final int ARRAY_BYTE_INDEX_SCALE = -1;
    public static final int ARRAY_SHORT_INDEX_SCALE = -1;
    public static final int ARRAY_CHAR_INDEX_SCALE = -1;
    public static final int ARRAY_INT_INDEX_SCALE = -1;
    public static final int ARRAY_LONG_INDEX_SCALE = -1;
    public static final int ARRAY_FLOAT_INDEX_SCALE = -1;
    public static final int ARRAY_DOUBLE_INDEX_SCALE = -1;
    public static final int ARRAY_OBJECT_INDEX_SCALE = -1;

    public int addressSize() {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }
    public static final int ADDRESS_SIZE = -1;

    public int pageSize() {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    /// random trusted operations from JNI:
    public Class<?> defineClass(String name, byte[] b, int off, int len,
            ClassLoader loader,
            ProtectionDomain protectionDomain) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public Class<?> defineClass(String name, byte[] b, int off, int len) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public Class<?> defineAnonymousClass(Class<?> hostClass, byte[] data, Object[] cpPatches) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public Object allocateInstance(Class<?> cls)
            throws InstantiationException {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void monitorEnter(Object o) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void monitorExit(Object o) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public boolean tryMonitorEnter(Object o) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void throwException(Throwable ee) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final boolean compareAndSwapObject(Object o, long offset,
            Object expected,
            Object x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final boolean compareAndSwapInt(Object o, long offset,
            int expected,
            int x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final boolean compareAndSwapLong(Object o, long offset,
            long expected,
            long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public Object getObjectVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putObjectVolatile(Object o, long offset, Object x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public int getIntVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putIntVolatile(Object o, long offset, int x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public boolean getBooleanVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putBooleanVolatile(Object o, long offset, boolean x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public byte getByteVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putByteVolatile(Object o, long offset, byte x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public short getShortVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putShortVolatile(Object o, long offset, short x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public char getCharVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putCharVolatile(Object o, long offset, char x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public long getLongVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putLongVolatile(Object o, long offset, long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public float getFloatVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putFloatVolatile(Object o, long offset, float x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public double getDoubleVolatile(Object o, long offset) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putDoubleVolatile(Object o, long offset, double x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putOrderedObject(Object o, long offset, Object x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putOrderedInt(Object o, long offset, int x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void putOrderedLong(Object o, long offset, long x) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void unpark(Object thread) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void park(boolean isAbsolute, long time) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public int getLoadAverage(double[] loadavg, int nelems) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    // The following contain CAS-based Java implementations used on
    // platforms not supporting instructions
    public final int getAndAddInt(Object o, long offset, int delta) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final long getAndAddLong(Object o, long offset, long delta) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final int getAndSetInt(Object o, long offset, int newValue) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final long getAndSetLong(Object o, long offset, long newValue) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public final Object getAndSetObject(Object o, long offset, Object newValue) {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void loadFence() {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void storeFence() {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }

    public void fullFence() {
        throw new RuntimeException("This is the Unsafe mock, not the real Unsafe!");
    }
}
