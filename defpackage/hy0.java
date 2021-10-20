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

/* renamed from: hy0  reason: default package */
public final class hy0 {
    private static final Logger a = Logger.getLogger(hy0.class.getName());
    private static final Unsafe b = z();
    private static final Class<?> c = zt0.c();
    private static final boolean d = G(Long.TYPE);
    private static final boolean e = G(Integer.TYPE);
    private static final d f;
    private static final boolean g = B();
    private static final boolean h = A();
    private static final long i = ((long) E(byte[].class));
    private static final long j = n(C());
    private static final boolean k = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: hy0$a */
    static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.hy0.d
        public final void b(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        @Override // defpackage.hy0.d
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.hy0.d
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.hy0.d
        public final void g(Object obj, long j, boolean z) {
            if (hy0.k) {
                hy0.r(obj, j, z);
            } else {
                hy0.t(obj, j, z);
            }
        }

        @Override // defpackage.hy0.d
        public final void h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        @Override // defpackage.hy0.d
        public final void i(Object obj, long j, byte b) {
            if (hy0.k) {
                hy0.d(obj, j, b);
            } else {
                hy0.q(obj, j, b);
            }
        }

        @Override // defpackage.hy0.d
        public final boolean l(Object obj, long j) {
            return hy0.k ? hy0.P(obj, j) : hy0.Q(obj, j);
        }

        @Override // defpackage.hy0.d
        public final float m(Object obj, long j) {
            return Float.intBitsToFloat(j(obj, j));
        }

        @Override // defpackage.hy0.d
        public final double n(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // defpackage.hy0.d
        public final byte o(Object obj, long j) {
            return hy0.k ? hy0.N(obj, j) : hy0.O(obj, j);
        }
    }

    /* renamed from: hy0$b */
    static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.hy0.d
        public final void b(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // defpackage.hy0.d
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // defpackage.hy0.d
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // defpackage.hy0.d
        public final void g(Object obj, long j, boolean z) {
            if (hy0.k) {
                hy0.r(obj, j, z);
            } else {
                hy0.t(obj, j, z);
            }
        }

        @Override // defpackage.hy0.d
        public final void h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // defpackage.hy0.d
        public final void i(Object obj, long j, byte b) {
            if (hy0.k) {
                hy0.d(obj, j, b);
            } else {
                hy0.q(obj, j, b);
            }
        }

        @Override // defpackage.hy0.d
        public final boolean l(Object obj, long j) {
            return hy0.k ? hy0.P(obj, j) : hy0.Q(obj, j);
        }

        @Override // defpackage.hy0.d
        public final float m(Object obj, long j) {
            return Float.intBitsToFloat(j(obj, j));
        }

        @Override // defpackage.hy0.d
        public final double n(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // defpackage.hy0.d
        public final byte o(Object obj, long j) {
            return hy0.k ? hy0.N(obj, j) : hy0.O(obj, j);
        }
    }

    /* renamed from: hy0$c */
    static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // defpackage.hy0.d
        public final void b(long j, byte b) {
            this.a.putByte(j, b);
        }

        @Override // defpackage.hy0.d
        public final void c(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // defpackage.hy0.d
        public final void d(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // defpackage.hy0.d
        public final void g(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // defpackage.hy0.d
        public final void h(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, hy0.i + j, (Object) null, j2, j3);
        }

        @Override // defpackage.hy0.d
        public final void i(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // defpackage.hy0.d
        public final boolean l(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // defpackage.hy0.d
        public final float m(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // defpackage.hy0.d
        public final double n(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // defpackage.hy0.d
        public final byte o(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hy0$d */
    public static abstract class d {
        public Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final long a(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void b(long j, byte b);

        public abstract void c(Object obj, long j, double d);

        public abstract void d(Object obj, long j, float f);

        public final void e(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void f(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public abstract void h(byte[] bArr, long j, long j2, long j3);

        public abstract void i(Object obj, long j, byte b);

        public final int j(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long k(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean l(Object obj, long j);

        public abstract float m(Object obj, long j);

        public abstract double n(Object obj, long j);

        public abstract byte o(Object obj, long j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ca  */
    static {
        d dVar;
        Field p;
        Field field = null;
        if (b != null) {
            if (!zt0.b()) {
                dVar = new c(b);
            } else if (d) {
                dVar = new b(b);
            } else if (e) {
                dVar = new a(b);
            }
            f = dVar;
            E(boolean[].class);
            F(boolean[].class);
            E(int[].class);
            F(int[].class);
            E(long[].class);
            F(long[].class);
            E(float[].class);
            F(float[].class);
            E(double[].class);
            F(double[].class);
            E(Object[].class);
            F(Object[].class);
            p = p(String.class, C0201.m82(5732));
            if (p != null && p.getType() == char[].class) {
                field = p;
            }
            n(field);
        }
        dVar = null;
        f = dVar;
        E(boolean[].class);
        F(boolean[].class);
        E(int[].class);
        F(int[].class);
        E(long[].class);
        F(long[].class);
        E(float[].class);
        F(float[].class);
        E(double[].class);
        F(double[].class);
        E(Object[].class);
        F(Object[].class);
        p = p(String.class, C0201.m82(5732));
        field = p;
        n(field);
    }

    private hy0() {
    }

    private static boolean A() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(C0201.m82(5733), Field.class);
            cls.getMethod(C0201.m82(5734), Class.class);
            cls.getMethod(C0201.m82(5735), Class.class);
            cls.getMethod(C0201.m82(5736), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5737), Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod(C0201.m82(5738), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5739), Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod(C0201.m82(5740), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5741), Object.class, Long.TYPE, Object.class);
            if (zt0.b()) {
                return true;
            }
            cls.getMethod(C0201.m82(5742), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5743), Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod(C0201.m82(5744), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5745), Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod(C0201.m82(5746), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5747), Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod(C0201.m82(5748), Object.class, Long.TYPE);
            cls.getMethod(C0201.m82(5749), Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(C0201.m82(5750));
            sb.append(valueOf);
            logger.logp(level, C0201.m82(5751), C0201.m82(5752), sb.toString());
            return false;
        }
    }

    private static boolean B() {
        String r0 = C0201.m82(5753);
        String r1 = C0201.m82(5754);
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod(C0201.m82(5755), Field.class);
            cls.getMethod(r1, Object.class, Long.TYPE);
            if (C() == null) {
                return false;
            }
            if (zt0.b()) {
                return true;
            }
            cls.getMethod(C0201.m82(5756), Long.TYPE);
            cls.getMethod(C0201.m82(5757), Long.TYPE, Byte.TYPE);
            cls.getMethod(C0201.m82(5758), Long.TYPE);
            cls.getMethod(C0201.m82(5759), Long.TYPE, Integer.TYPE);
            cls.getMethod(r1, Long.TYPE);
            cls.getMethod(C0201.m82(5760), Long.TYPE, Long.TYPE);
            cls.getMethod(r0, Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod(r0, Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append(C0201.m82(5761));
            sb.append(valueOf);
            logger.logp(level, C0201.m82(5762), C0201.m82(5763), sb.toString());
            return false;
        }
    }

    private static Field C() {
        Field p;
        if (zt0.b() && (p = p(Buffer.class, C0201.m82(5764))) != null) {
            return p;
        }
        Field p2 = p(Buffer.class, C0201.m82(5765));
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    private static int E(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int F(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean G(Class<?> cls) {
        if (!zt0.b()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            cls2.getMethod(C0201.m82(5766), cls, Boolean.TYPE);
            cls2.getMethod(C0201.m82(5767), cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod(C0201.m82(5768), cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod(C0201.m82(5769), cls, Boolean.TYPE);
            cls2.getMethod(C0201.m82(5770), cls, Byte.TYPE);
            cls2.getMethod(C0201.m82(5771), cls);
            cls2.getMethod(C0201.m82(5772), cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod(C0201.m82(5773), cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int H(Object obj, long j2) {
        return f.j(obj, j2);
    }

    public static long I(Object obj, long j2) {
        return f.k(obj, j2);
    }

    public static boolean J(Object obj, long j2) {
        return f.l(obj, j2);
    }

    public static float K(Object obj, long j2) {
        return f.m(obj, j2);
    }

    public static double L(Object obj, long j2) {
        return f.n(obj, j2);
    }

    public static Object M(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    /* access modifiers changed from: private */
    public static byte N(Object obj, long j2) {
        return (byte) (H(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte O(Object obj, long j2) {
        return (byte) (H(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean P(Object obj, long j2) {
        return N(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean Q(Object obj, long j2) {
        return O(obj, j2) != 0;
    }

    public static byte a(byte[] bArr, long j2) {
        return f.o(bArr, i + j2);
    }

    public static long b(Field field) {
        return f.a(field);
    }

    public static void c(long j2, byte b2) {
        f.b(j2, b2);
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        g(obj, j3, ((255 & b2) << i2) | (H(obj, j3) & ((255 << i2) ^ -1)));
    }

    public static void e(Object obj, long j2, double d2) {
        f.c(obj, j2, d2);
    }

    public static void f(Object obj, long j2, float f2) {
        f.d(obj, j2, f2);
    }

    public static void g(Object obj, long j2, int i2) {
        f.e(obj, j2, i2);
    }

    public static void h(Object obj, long j2, long j3) {
        f.f(obj, j2, j3);
    }

    public static void i(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    public static void j(Object obj, long j2, boolean z) {
        f.g(obj, j2, z);
    }

    public static void k(byte[] bArr, long j2, byte b2) {
        f.i(bArr, i + j2, b2);
    }

    public static void l(byte[] bArr, long j2, long j3, long j4) {
        f.h(bArr, j2, j3, j4);
    }

    private static long n(Field field) {
        d dVar;
        if (field == null || (dVar = f) == null) {
            return -1;
        }
        return dVar.a(field);
    }

    public static long o(ByteBuffer byteBuffer) {
        return f.k(byteBuffer, j);
    }

    private static Field p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void q(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        g(obj, j3, ((255 & b2) << i2) | (H(obj, j3) & ((255 << i2) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static void r(Object obj, long j2, boolean z) {
        d(obj, j2, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void t(Object obj, long j2, boolean z) {
        q(obj, j2, z ? (byte) 1 : 0);
    }

    public static boolean x() {
        return h;
    }

    public static boolean y() {
        return g;
    }

    public static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new iy0());
        } catch (Throwable unused) {
            return null;
        }
    }
}
