package defpackage;

import defpackage.kl1;
import defpackage.kl1.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* renamed from: kl1  reason: default package */
public abstract class kl1<MessageType extends kl1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends rj1<MessageType, BuilderType> {
    private static Map<Object, kl1<?, ?>> zzwl = new ConcurrentHashMap();
    public co1 zzwj = co1.i();
    private int zzwk = -1;

    /* renamed from: kl1$a */
    public static abstract class a<MessageType extends kl1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends sj1<MessageType, BuilderType> {
        private final MessageType a;
        public MessageType b;
        public boolean c = false;

        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) ((kl1) messagetype.k(f.d, null, null));
        }

        private static void l(MessageType messagetype, MessageType messagetype2) {
            fn1.b().d(messagetype).a(messagetype, messagetype2);
        }

        @Override // defpackage.vm1
        public final boolean b() {
            return kl1.o(this.b, false);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: kl1$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.a.k(f.e, null, null);
            aVar.j((kl1) p());
            return aVar;
        }

        @Override // defpackage.vm1
        public final /* synthetic */ tm1 e() {
            return this.a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: kl1$a<MessageType extends kl1<MessageType, BuilderType>, BuilderType extends kl1$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sj1
        public final /* synthetic */ sj1 i(rj1 rj1) {
            j((kl1) rj1);
            return this;
        }

        public final BuilderType j(MessageType messagetype) {
            m();
            l(this.b, messagetype);
            return this;
        }

        public void m() {
            if (this.c) {
                MessageType messagetype = (MessageType) ((kl1) this.b.k(f.d, null, null));
                l(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        /* renamed from: n */
        public MessageType p() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            fn1.b().d(messagetype).b(messagetype);
            this.c = true;
            return this.b;
        }

        /* renamed from: o */
        public final MessageType H() {
            MessageType messagetype = (MessageType) ((kl1) p());
            byte byteValue = ((Byte) messagetype.k(f.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = fn1.b().d(messagetype).c(messagetype);
                    messagetype.k(f.b, z ? messagetype : null, null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new ao1(messagetype);
        }
    }

    /* renamed from: kl1$b */
    public static class b<T extends kl1<T, ?>> extends tj1<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // defpackage.dn1
        public final /* synthetic */ Object a(kk1 kk1, wk1 wk1) throws sl1 {
            return kl1.j(this.a, kk1, wk1);
        }
    }

    /* renamed from: kl1$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends kl1<MessageType, BuilderType> implements vm1 {
        public bl1<d> zzwp = bl1.s();
    }

    /* renamed from: kl1$d */
    static final class d implements dl1<d> {
        public final pl1<?> a;
        public final int b;
        public final ro1 c;
        public final boolean d;
        public final boolean e;

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: kl1$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dl1
        public final um1 A0(um1 um1, tm1 tm1) {
            return ((a) um1).j((kl1) tm1);
        }

        @Override // defpackage.dl1
        public final boolean F() {
            return this.d;
        }

        @Override // defpackage.dl1
        public final boolean V0() {
            return this.e;
        }

        @Override // defpackage.dl1
        public final int a() {
            return this.b;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.b - ((d) obj).b;
        }

        @Override // defpackage.dl1
        public final ro1 i0() {
            return this.c;
        }

        @Override // defpackage.dl1
        public final zm1 j0(zm1 zm1, zm1 zm12) {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.dl1
        public final wo1 o() {
            return this.c.b();
        }
    }

    /* renamed from: kl1$e */
    public static class e<ContainingType extends tm1, Type> extends uk1<ContainingType, Type> {
        public final tm1 a;
        public final d b;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: kl1$f */
    public static final class f {
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
            C0201.m83(f.class, 282);
        }

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    public static <T extends kl1<T, ?>> T j(T t, kk1 kk1, wk1 wk1) throws sl1 {
        T t2 = (T) ((kl1) t.k(f.d, null, null));
        try {
            fn1.b().d(t2).f(t2, ok1.Q(kk1), wk1);
            fn1.b().d(t2).b(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof sl1) {
                throw ((sl1) e2.getCause());
            }
            sl1 sl1 = new sl1(e2.getMessage());
            sl1.j(t2);
            throw sl1;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof sl1) {
                throw ((sl1) e3.getCause());
            }
            throw e3;
        }
    }

    public static Object l(tm1 tm1, String str, Object[] objArr) {
        return new gn1(tm1, str, objArr);
    }

    public static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(C0201.m82(37379), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(C0201.m82(37378), cause);
            }
        }
    }

    public static <T extends kl1<?, ?>> void n(Class<T> cls, T t) {
        zzwl.put(cls, t);
    }

    public static final <T extends kl1<T, ?>> boolean o(T t, boolean z) {
        byte byteValue = ((Byte) t.k(f.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return fn1.b().d(t).c(t);
    }

    public static <T extends kl1<?, ?>> T q(Class<T> cls) {
        kl1<?, ?> kl1 = zzwl.get(cls);
        if (kl1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                kl1 = (T) zzwl.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(C0201.m82(37380), e2);
            }
        }
        if (kl1 == null) {
            kl1 = (T) ((kl1) ((kl1) ho1.v(cls)).k(f.f, null, null));
            if (kl1 != null) {
                zzwl.put(cls, kl1);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) kl1;
    }

    @Override // defpackage.vm1
    public final boolean b() {
        byte byteValue = ((Byte) k(f.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = fn1.b().d(this).c(this);
        k(f.b, c2 ? this : null, null);
        return c2;
    }

    @Override // defpackage.tm1
    public final /* synthetic */ um1 c() {
        a aVar = (a) k(f.e, null, null);
        aVar.j(this);
        return aVar;
    }

    @Override // defpackage.tm1
    public final void d(qk1 qk1) throws IOException {
        fn1.b().a(getClass()).i(this, sk1.P(qk1));
    }

    @Override // defpackage.vm1
    public final /* synthetic */ tm1 e() {
        return (kl1) k(f.f, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((kl1) k(f.f, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        return fn1.b().d(this).d(this, (kl1) obj);
    }

    @Override // defpackage.tm1
    public final int f() {
        if (this.zzwk == -1) {
            this.zzwk = fn1.b().d(this).h(this);
        }
        return this.zzwk;
    }

    @Override // defpackage.tm1
    public final /* synthetic */ um1 g() {
        return (a) k(f.e, null, null);
    }

    @Override // defpackage.rj1
    public final int h() {
        return this.zzwk;
    }

    public int hashCode() {
        int i = this.zzri;
        if (i != 0) {
            return i;
        }
        int g = fn1.b().d(this).g(this);
        this.zzri = g;
        return g;
    }

    @Override // defpackage.rj1
    public final void i(int i) {
        this.zzwk = i;
    }

    public abstract Object k(int i, Object obj, Object obj2);

    public String toString() {
        return wm1.a(this, super.toString());
    }
}
