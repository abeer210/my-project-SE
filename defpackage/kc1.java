package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;
import vigqyno.C0201;

/* renamed from: kc1  reason: default package */
public final class kc1 {
    private static final Logger a = Logger.getLogger(kc1.class.getName());
    private static final Unsafe b = N();
    private static final Class<?> c = v71.c();
    private static final boolean d = y(Long.TYPE);
    private static final boolean e = y(Integer.TYPE);
    private static final d f;
    private static final boolean g = P();
    private static final boolean h = O();
    public static final long i = ((long) v(byte[].class));
    private static final long j;
    public static final boolean k = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: kc1$a */
    static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.kc1.d
        public final void a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        @Override // defpackage.kc1.d
        public final void b(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.kc1.d
        public final void c(Object obj, long j, float f) {
            g(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.kc1.d
        public final void e(Object obj, long j, boolean z) {
            if (kc1.k) {
                kc1.o(obj, j, z);
            } else {
                kc1.q(obj, j, z);
            }
        }

        @Override // defpackage.kc1.d
        public final void f(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        @Override // defpackage.kc1.d
        public final void h(Object obj, long j, byte b) {
            if (kc1.k) {
                kc1.c(obj, j, b);
            } else {
                kc1.m(obj, j, b);
            }
        }

        @Override // defpackage.kc1.d
        public final boolean k(Object obj, long j) {
            if (kc1.k) {
                return kc1.G(obj, j);
            }
            return kc1.H(obj, j);
        }

        @Override // defpackage.kc1.d
        public final float l(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // defpackage.kc1.d
        public final double m(Object obj, long j) {
            return Double.longBitsToDouble(j(obj, j));
        }

        @Override // defpackage.kc1.d
        public final byte n(Object obj, long j) {
            if (kc1.k) {
                return kc1.E(obj, j);
            }
            return kc1.F(obj, j);
        }
    }

    /* renamed from: kc1$b */
    static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.kc1.d
        public final void a(long j, byte b) {
            this.a.putByte(j, b);
        }

        @Override // defpackage.kc1.d
        public final void b(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // defpackage.kc1.d
        public final void c(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // defpackage.kc1.d
        public final void e(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // defpackage.kc1.d
        public final void f(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, kc1.i + j, (Object) null, j2, j3);
        }

        @Override // defpackage.kc1.d
        public final void h(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // defpackage.kc1.d
        public final boolean k(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // defpackage.kc1.d
        public final float l(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // defpackage.kc1.d
        public final double m(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // defpackage.kc1.d
        public final byte n(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    /* renamed from: kc1$c */
    static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.kc1.d
        public final void a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // defpackage.kc1.d
        public final void b(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.kc1.d
        public final void c(Object obj, long j, float f) {
            g(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.kc1.d
        public final void e(Object obj, long j, boolean z) {
            if (kc1.k) {
                kc1.o(obj, j, z);
            } else {
                kc1.q(obj, j, z);
            }
        }

        @Override // defpackage.kc1.d
        public final void f(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // defpackage.kc1.d
        public final void h(Object obj, long j, byte b) {
            if (kc1.k) {
                kc1.c(obj, j, b);
            } else {
                kc1.m(obj, j, b);
            }
        }

        @Override // defpackage.kc1.d
        public final boolean k(Object obj, long j) {
            if (kc1.k) {
                return kc1.G(obj, j);
            }
            return kc1.H(obj, j);
        }

        @Override // defpackage.kc1.d
        public final float l(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // defpackage.kc1.d
        public final double m(Object obj, long j) {
            return Double.longBitsToDouble(j(obj, j));
        }

        @Override // defpackage.kc1.d
        public final byte n(Object obj, long j) {
            if (kc1.k) {
                return kc1.E(obj, j);
            }
            return kc1.F(obj, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kc1$d */
    public static abstract class d {
        public Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract void a(long j, byte b);

        public abstract void b(Object obj, long j, double d);

        public abstract void c(Object obj, long j, float f);

        public final void d(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void e(Object obj, long j, boolean z);

        public abstract void f(byte[] bArr, long j, long j2, long j3);

        public final void g(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public abstract void h(Object obj, long j, byte b);

        public final int i(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long j(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean k(Object obj, long j);

        public abstract float l(Object obj, long j);

        public abstract double m(Object obj, long j);

        public abstract byte n(Object obj, long j);
    }

    static {
        d dVar;
        d dVar2 = null;
        if (b != null) {
            if (!v71.b()) {
                dVar2 = new b(b);
            } else if (d) {
                dVar2 = new c(b);
            } else if (e) {
                dVar2 = new a(b);
            }
        }
        f = dVar2;
        v(boolean[].class);
        w(boolean[].class);
        v(int[].class);
        w(int[].class);
        v(long[].class);
        w(long[].class);
        v(float[].class);
        w(float[].class);
        v(double[].class);
        w(double[].class);
        v(Object[].class);
        w(Object[].class);
        Field Q = Q();
        j = (Q == null || (dVar = f) == null) ? -1 : dVar.a.objectFieldOffset(Q);
    }

    private kc1() {
    }

    public static boolean A(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static float B(Object obj, long j2) {
        return f.l(obj, j2);
    }

    public static double C(Object obj, long j2) {
        return f.m(obj, j2);
    }

    public static Object D(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    /* access modifiers changed from: private */
    public static byte E(Object obj, long j2) {
        return (byte) (x(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte F(Object obj, long j2) {
        return (byte) (x(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean G(Object obj, long j2) {
        return E(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean H(Object obj, long j2) {
        return F(obj, j2) != 0;
    }

    public static boolean L() {
        return h;
    }

    public static boolean M() {
        return g;
    }

    public static Unsafe N() {
        try {
            return (Unsafe) AccessController.doPrivileged(new mc1());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean O() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(C0201.m82(12291), Field.class);
            cls.getMethod(C0201.m82(12292), Class.class);
            cls.getMethod(C0201.m82(12293), Class.class);
            cls.getMethod(C0201.m82(12294), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12295), Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod(C0201.m82(12296), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12297), Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod(C0201.m82(12298), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12299), Object.class, Long.TYPE, Object.class);
            if (v71.b()) {
                return true;
            }
            cls.getMethod(C0201.m82(12300), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12301), Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod(C0201.m82(12302), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12303), Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod(C0201.m82(12304), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12305), Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod(C0201.m82(12306), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(12307), Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(C0201.m82(12308));
            sb.append(valueOf);
            logger.logp(level, C0201.m82(12309), C0201.m82(12310), sb.toString());
            return false;
        }
    }

    private static boolean P() {
        String r0 = C0201.m82(12311);
        String r1 = C0201.m82(12312);
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(C0201.m82(12313), Field.class);
            cls.getMethod(r1, Object.class, Long.TYPE);
            if (Q() == null) {
                return false;
            }
            if (v71.b()) {
                return true;
            }
            cls.getMethod(C0201.m82(12314), Long.TYPE);
            cls.getMethod(C0201.m82(12315), Long.TYPE, Byte.TYPE);
            cls.getMethod(C0201.m82(12316), Long.TYPE);
            cls.getMethod(C0201.m82(12317), Long.TYPE, Integer.TYPE);
            cls.getMethod(r1, Long.TYPE);
            cls.getMethod(C0201.m82(12318), Long.TYPE, Long.TYPE);
            cls.getMethod(r0, Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod(r0, Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(C0201.m82(12319));
            sb.append(valueOf);
            logger.logp(level, C0201.m82(12320), C0201.m82(12321), sb.toString());
            return false;
        }
    }

    private static Field Q() {
        Field l;
        if (v71.b() && (l = l(Buffer.class, C0201.m82(12322))) != null) {
            return l;
        }
        Field l2 = l(Buffer.class, C0201.m82(12323));
        if (l2 == null || l2.getType() != Long.TYPE) {
            return null;
        }
        return l2;
    }

    public static byte a(byte[] bArr, long j2) {
        return f.n(bArr, i + j2);
    }

    public static void b(long j2, byte b2) {
        f.a(j2, b2);
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        n(obj, j3, ((255 & b2) << i2) | (x(obj, j3) & ((255 << i2) ^ -1)));
    }

    public static void d(Object obj, long j2, double d2) {
        f.b(obj, j2, d2);
    }

    public static void e(Object obj, long j2, float f2) {
        f.c(obj, j2, f2);
    }

    public static void f(Object obj, long j2, long j3) {
        f.d(obj, j2, j3);
    }

    public static void g(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    public static void h(Object obj, long j2, boolean z) {
        f.e(obj, j2, z);
    }

    public static void i(byte[] bArr, long j2, byte b2) {
        f.h(bArr, i + j2, b2);
    }

    public static void j(byte[] bArr, long j2, long j3, long j4) {
        f.f(bArr, j2, j3, j4);
    }

    public static long k(ByteBuffer byteBuffer) {
        return f.j(byteBuffer, j);
    }

    private static Field l(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void m(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        n(obj, j3, ((255 & b2) << i2) | (x(obj, j3) & ((255 << i2) ^ -1)));
    }

    public static void n(Object obj, long j2, int i2) {
        f.g(obj, j2, i2);
    }

    /* access modifiers changed from: private */
    public static void o(Object obj, long j2, boolean z) {
        c(obj, j2, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void q(Object obj, long j2, boolean z) {
        m(obj, j2, z ? (byte) 1 : 0);
    }

    public static <T> T u(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int v(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int w(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int x(Object obj, long j2) {
        return f.i(obj, j2);
    }

    private static boolean y(Class<?> cls) {
        if (!v71.b()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            cls2.getMethod(C0201.m82(12324), cls, Boolean.TYPE);
            cls2.getMethod(C0201.m82(12325), cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod(C0201.m82(12326), cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod(C0201.m82(12327), cls, Boolean.TYPE);
            cls2.getMethod(C0201.m82(12328), cls, Byte.TYPE);
            cls2.getMethod(C0201.m82(12329), cls);
            cls2.getMethod(C0201.m82(12330), cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod(C0201.m82(12331), cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long z(Object obj, long j2) {
        return f.j(obj, j2);
    }
}
