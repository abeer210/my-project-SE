package defpackage;

import defpackage.kv0;
import defpackage.kv0.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* renamed from: kv0  reason: default package */
public abstract class kv0<MessageType extends kv0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends vt0<MessageType, BuilderType> {
    private static Map<Object, kv0<?, ?>> zzjr = new ConcurrentHashMap();
    public by0 zzjp = by0.h();
    private int zzjq = -1;

    /* renamed from: kv0$a */
    public static abstract class a<MessageType extends kv0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends wt0<MessageType, BuilderType> {
        private final MessageType a;
        public MessageType b;
        public boolean c = false;

        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) ((kv0) messagetype.l(e.d, null, null));
        }

        private static void l(MessageType messagetype, MessageType messagetype2) {
            dx0.a().d(messagetype).a(messagetype, messagetype2);
        }

        @Override // defpackage.rw0
        public final /* synthetic */ qw0 A() {
            kv0 kv0 = (kv0) s0();
            byte byteValue = ((Byte) kv0.l(e.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dx0.a().d(kv0).f(kv0);
                    kv0.l(e.b, z ? kv0 : null, null);
                }
            }
            if (z) {
                return kv0;
            }
            throw new zx0(kv0);
        }

        @Override // defpackage.sw0
        public final boolean b() {
            return kv0.p(this.b, false);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: kv0$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.a.l(e.e, null, null);
            aVar.j((kv0) s0());
            return aVar;
        }

        @Override // defpackage.sw0
        public final /* synthetic */ qw0 g() {
            return this.a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: kv0$a<MessageType extends kv0<MessageType, BuilderType>, BuilderType extends kv0$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wt0
        public final /* synthetic */ wt0 i(vt0 vt0) {
            j((kv0) vt0);
            return this;
        }

        public final BuilderType j(MessageType messagetype) {
            m();
            l(this.b, messagetype);
            return this;
        }

        public void m() {
            if (this.c) {
                MessageType messagetype = (MessageType) ((kv0) this.b.l(e.d, null, null));
                l(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        /* renamed from: n */
        public MessageType s0() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            dx0.a().d(messagetype).i(messagetype);
            this.c = true;
            return this.b;
        }

        public final MessageType o() {
            MessageType messagetype = (MessageType) ((kv0) s0());
            byte byteValue = ((Byte) messagetype.l(e.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dx0.a().d(messagetype).f(messagetype);
                    messagetype.l(e.b, z ? messagetype : null, null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zx0(messagetype);
        }
    }

    /* renamed from: kv0$b */
    public static class b<T extends kv0<T, ?>> extends xt0<T> {
        public b(T t) {
        }
    }

    /* renamed from: kv0$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends kv0<MessageType, BuilderType> implements sw0 {
        public bv0<d> zzjv = bv0.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kv0$d */
    public static final class d implements ev0<d> {
        public final int a;
        public final py0 b;

        @Override // defpackage.ev0
        public final py0 M0() {
            return this.b;
        }

        @Override // defpackage.ev0
        public final xw0 N0(xw0 xw0, xw0 xw02) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.a - ((d) obj).a;
        }

        @Override // defpackage.ev0
        public final uy0 e0() {
            return this.b.b();
        }

        @Override // defpackage.ev0
        public final boolean r0() {
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: kv0$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ev0
        public final rw0 s(rw0 rw0, qw0 qw0) {
            return ((a) rw0).j((kv0) qw0);
        }

        @Override // defpackage.ev0
        public final int u() {
            return this.a;
        }

        @Override // defpackage.ev0
        public final boolean y() {
            return false;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: kv0$e */
    public static final class e {
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;
        public static final int d = 0;
        public static final int e = 0;
        public static final int f = 0;
        public static final int g = 0;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        public static final int i = 0;
        public static final int j = 0;
        public static final int k = 0;
        public static final int l = 0;

        static {
            C0201.m83(e.class, 421);
        }

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    private static <T extends kv0<T, ?>> T k(T t, byte[] bArr) throws qv0 {
        T t2 = (T) ((kv0) t.l(e.d, null, null));
        try {
            dx0.a().d(t2).j(t2, bArr, 0, bArr.length, new bu0());
            dx0.a().d(t2).i(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof qv0) {
                throw ((qv0) e2.getCause());
            }
            qv0 qv0 = new qv0(e2.getMessage());
            qv0.f(t2);
            throw qv0;
        } catch (IndexOutOfBoundsException unused) {
            qv0 a2 = qv0.a();
            a2.f(t2);
            throw a2;
        }
    }

    public static Object m(qw0 qw0, String str, Object[] objArr) {
        return new fx0(qw0, str, objArr);
    }

    public static Object n(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(C0201.m82(17324), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(C0201.m82(17323), cause);
            }
        }
    }

    public static <T extends kv0<?, ?>> void o(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    public static final <T extends kv0<T, ?>> boolean p(T t, boolean z) {
        byte byteValue = ((Byte) t.l(e.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return dx0.a().d(t).f(t);
    }

    public static <T extends kv0<T, ?>> T q(T t, byte[] bArr) throws qv0 {
        T t2 = (T) k(t, bArr);
        if (t2 != null) {
            byte byteValue = ((Byte) t2.l(e.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dx0.a().d(t2).f(t2);
                    t2.l(e.b, z ? t2 : null, null);
                }
            }
            if (!z) {
                qv0 qv0 = new qv0(new zx0(t2).getMessage());
                qv0.f(t2);
                throw qv0;
            }
        }
        return t2;
    }

    public static <E> pv0<E> r() {
        return ex0.b();
    }

    public static <T extends kv0<?, ?>> T s(Class<T> cls) {
        T t = (T) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzjr.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(C0201.m82(17325), e2);
            }
        }
        if (t != null) {
            return t;
        }
        String r1 = C0201.m82(17326);
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
    }

    @Override // defpackage.sw0
    public final boolean b() {
        byte byteValue = ((Byte) l(e.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = dx0.a().d(this).f(this);
        l(e.b, f ? this : null, null);
        return f;
    }

    @Override // defpackage.qw0
    public final /* synthetic */ rw0 c() {
        a aVar = (a) l(e.e, null, null);
        aVar.j(this);
        return aVar;
    }

    @Override // defpackage.qw0
    public final void d(ru0 ru0) throws IOException {
        dx0.a().b(getClass()).h(this, tu0.P(ru0));
    }

    @Override // defpackage.qw0
    public final /* synthetic */ rw0 e() {
        return (a) l(e.e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((kv0) l(e.f, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        return dx0.a().d(this).d(this, (kv0) obj);
    }

    @Override // defpackage.qw0
    public final int f() {
        if (this.zzjq == -1) {
            this.zzjq = dx0.a().d(this).b(this);
        }
        return this.zzjq;
    }

    @Override // defpackage.sw0
    public final /* synthetic */ qw0 g() {
        return (kv0) l(e.f, null, null);
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int g = dx0.a().d(this).g(this);
        this.zzex = g;
        return g;
    }

    @Override // defpackage.vt0
    public final void i(int i) {
        this.zzjq = i;
    }

    @Override // defpackage.vt0
    public final int j() {
        return this.zzjq;
    }

    public abstract Object l(int i, Object obj, Object obj2);

    public String toString() {
        return tw0.a(this, super.toString());
    }
}
