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

/* renamed from: ho1  reason: default package */
public final class ho1 {
    private static final Logger a = Logger.getLogger(ho1.class.getName());
    private static final Unsafe b = y();
    private static final Class<?> c = vj1.b();
    private static final boolean d = G(Long.TYPE);
    private static final boolean e = G(Integer.TYPE);
    private static final d f;
    private static final boolean g = A();
    private static final boolean h = z();
    private static final long i = ((long) D(byte[].class));
    private static final long j;
    private static final boolean k = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: ho1$a */
    static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.ho1.d
        public final void a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        @Override // defpackage.ho1.d
        public final void b(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.ho1.d
        public final void c(Object obj, long j, float f) {
            g(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.ho1.d
        public final void e(Object obj, long j, boolean z) {
            if (ho1.k) {
                ho1.o(obj, j, z);
            } else {
                ho1.q(obj, j, z);
            }
        }

        @Override // defpackage.ho1.d
        public final void f(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        @Override // defpackage.ho1.d
        public final void h(Object obj, long j, byte b) {
            if (ho1.k) {
                ho1.c(obj, j, b);
            } else {
                ho1.m(obj, j, b);
            }
        }

        @Override // defpackage.ho1.d
        public final boolean k(Object obj, long j) {
            if (ho1.k) {
                return ho1.O(obj, j);
            }
            return ho1.P(obj, j);
        }

        @Override // defpackage.ho1.d
        public final float l(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // defpackage.ho1.d
        public final double m(Object obj, long j) {
            return Double.longBitsToDouble(j(obj, j));
        }

        @Override // defpackage.ho1.d
        public final byte n(Object obj, long j) {
            if (ho1.k) {
                return ho1.M(obj, j);
            }
            return ho1.N(obj, j);
        }
    }

    /* renamed from: ho1$b */
    static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.ho1.d
        public final void a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // defpackage.ho1.d
        public final void b(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.ho1.d
        public final void c(Object obj, long j, float f) {
            g(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.ho1.d
        public final void e(Object obj, long j, boolean z) {
            if (ho1.k) {
                ho1.o(obj, j, z);
            } else {
                ho1.q(obj, j, z);
            }
        }

        @Override // defpackage.ho1.d
        public final void f(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // defpackage.ho1.d
        public final void h(Object obj, long j, byte b) {
            if (ho1.k) {
                ho1.c(obj, j, b);
            } else {
                ho1.m(obj, j, b);
            }
        }

        @Override // defpackage.ho1.d
        public final boolean k(Object obj, long j) {
            if (ho1.k) {
                return ho1.O(obj, j);
            }
            return ho1.P(obj, j);
        }

        @Override // defpackage.ho1.d
        public final float l(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // defpackage.ho1.d
        public final double m(Object obj, long j) {
            return Double.longBitsToDouble(j(obj, j));
        }

        @Override // defpackage.ho1.d
        public final byte n(Object obj, long j) {
            if (ho1.k) {
                return ho1.M(obj, j);
            }
            return ho1.N(obj, j);
        }
    }

    /* renamed from: ho1$c */
    static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.ho1.d
        public final void a(long j, byte b) {
            this.a.putByte(j, b);
        }

        @Override // defpackage.ho1.d
        public final void b(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // defpackage.ho1.d
        public final void c(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // defpackage.ho1.d
        public final void e(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // defpackage.ho1.d
        public final void f(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, ho1.i + j, (Object) null, j2, j3);
        }

        @Override // defpackage.ho1.d
        public final void h(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // defpackage.ho1.d
        public final boolean k(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // defpackage.ho1.d
        public final float l(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // defpackage.ho1.d
        public final double m(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // defpackage.ho1.d
        public final byte n(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ho1$d */
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
            if (!vj1.a()) {
                dVar2 = new c(b);
            } else if (d) {
                dVar2 = new b(b);
            } else if (e) {
                dVar2 = new a(b);
            }
        }
        f = dVar2;
        D(boolean[].class);
        E(boolean[].class);
        D(int[].class);
        E(int[].class);
        D(long[].class);
        E(long[].class);
        D(float[].class);
        E(float[].class);
        D(double[].class);
        E(double[].class);
        D(Object[].class);
        E(Object[].class);
        Field B = B();
        j = (B == null || (dVar = f) == null) ? -1 : dVar.a.objectFieldOffset(B);
    }

    private ho1() {
    }

    private static boolean A() {
        String r0 = C0201.m82(22395);
        String r1 = C0201.m82(22396);
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(C0201.m82(22397), Field.class);
            cls.getMethod(r1, Object.class, Long.TYPE);
            if (B() == null) {
                return false;
            }
            if (vj1.a()) {
                return true;
            }
            cls.getMethod(C0201.m82(22398), Long.TYPE);
            cls.getMethod(C0201.m82(22399), Long.TYPE, Byte.TYPE);
            cls.getMethod(C0201.m82(22400), Long.TYPE);
            cls.getMethod(C0201.m82(22401), Long.TYPE, Integer.TYPE);
            cls.getMethod(r1, Long.TYPE);
            cls.getMethod(C0201.m82(22402), Long.TYPE, Long.TYPE);
            cls.getMethod(r0, Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod(r0, Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(C0201.m82(22403));
            sb.append(valueOf);
            logger.logp(level, C0201.m82(22404), C0201.m82(22405), sb.toString());
            return false;
        }
    }

    private static Field B() {
        Field l;
        if (vj1.a() && (l = l(Buffer.class, C0201.m82(22406))) != null) {
            return l;
        }
        Field l2 = l(Buffer.class, C0201.m82(22407));
        if (l2 == null || l2.getType() != Long.TYPE) {
            return null;
        }
        return l2;
    }

    private static int D(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int E(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int F(Object obj, long j2) {
        return f.i(obj, j2);
    }

    private static boolean G(Class<?> cls) {
        if (!vj1.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            cls2.getMethod(C0201.m82(22408), cls, Boolean.TYPE);
            cls2.getMethod(C0201.m82(22409), cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod(C0201.m82(22410), cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod(C0201.m82(22411), cls, Boolean.TYPE);
            cls2.getMethod(C0201.m82(22412), cls, Byte.TYPE);
            cls2.getMethod(C0201.m82(22413), cls);
            cls2.getMethod(C0201.m82(22414), cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod(C0201.m82(22415), cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long H(Object obj, long j2) {
        return f.j(obj, j2);
    }

    public static boolean I(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static float J(Object obj, long j2) {
        return f.l(obj, j2);
    }

    public static double K(Object obj, long j2) {
        return f.m(obj, j2);
    }

    public static Object L(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    /* access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (F(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte N(Object obj, long j2) {
        return (byte) (F(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean P(Object obj, long j2) {
        return N(obj, j2) != 0;
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
        n(obj, j3, ((255 & b2) << i2) | (F(obj, j3) & ((255 << i2) ^ -1)));
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
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void m(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        n(obj, j3, ((255 & b2) << i2) | (F(obj, j3) & ((255 << i2) ^ -1)));
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

    public static <T> T v(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static boolean w() {
        return h;
    }

    public static boolean x() {
        return g;
    }

    public static Unsafe y() {
        try {
            return (Unsafe) AccessController.doPrivileged(new io1());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean z() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(C0201.m82(22416), Field.class);
            cls.getMethod(C0201.m82(22417), Class.class);
            cls.getMethod(C0201.m82(22418), Class.class);
            cls.getMethod(C0201.m82(22419), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22420), Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod(C0201.m82(22421), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22422), Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod(C0201.m82(22423), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22424), Object.class, Long.TYPE, Object.class);
            if (vj1.a()) {
                return true;
            }
            cls.getMethod(C0201.m82(22425), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22426), Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod(C0201.m82(22427), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22428), Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod(C0201.m82(22429), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22430), Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod(C0201.m82(22431), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(22432), Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(C0201.m82(22433));
            sb.append(valueOf);
            logger.logp(level, C0201.m82(22434), C0201.m82(22435), sb.toString());
            return false;
        }
    }
}
