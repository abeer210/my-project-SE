package defpackage;

import defpackage.l91;
import defpackage.l91.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* renamed from: l91  reason: default package */
public abstract class l91<MessageType extends l91<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends s71<MessageType, BuilderType> {
    private static Map<Object, l91<?, ?>> zzaib = new ConcurrentHashMap();
    public hc1 zzahz = hc1.i();
    private int zzaia = -1;

    /* renamed from: l91$a */
    public static abstract class a<MessageType extends l91<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends u71<MessageType, BuilderType> {
        private final MessageType a;
        public MessageType b;
        private boolean c = false;

        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) ((l91) messagetype.q(d.d, null, null));
        }

        private static void n(MessageType messagetype, MessageType messagetype2) {
            hb1.b().c(messagetype).a(messagetype, messagetype2);
        }

        private final BuilderType o(byte[] bArr, int i, int i2, y81 y81) throws v91 {
            q();
            try {
                hb1.b().c(this.b).j(this.b, bArr, 0, i2 + 0, new x71(y81));
                return this;
            } catch (v91 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw v91.b();
            } catch (IOException e2) {
                throw new RuntimeException(C0201.m82(20735), e2);
            }
        }

        @Override // defpackage.ya1
        public final boolean b() {
            return l91.u(this.b, false);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: l91$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.a.q(d.e, null, null);
            aVar.m((l91) u0());
            return aVar;
        }

        @Override // defpackage.ya1
        public final /* synthetic */ wa1 e() {
            return this.a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: l91$a<MessageType extends l91<MessageType, BuilderType>, BuilderType extends l91$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.u71
        public final /* synthetic */ u71 i(s71 s71) {
            m((l91) s71);
            return this;
        }

        @Override // defpackage.u71
        public final /* synthetic */ u71 j(byte[] bArr, int i, int i2, y81 y81) throws v91 {
            o(bArr, 0, i2, y81);
            return this;
        }

        public final BuilderType m(MessageType messagetype) {
            q();
            n(this.b, messagetype);
            return this;
        }

        public final void q() {
            if (this.c) {
                MessageType messagetype = (MessageType) ((l91) this.b.q(d.d, null, null));
                n(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        /* renamed from: s */
        public MessageType u0() {
            if (this.c) {
                return this.b;
            }
            this.b.w();
            this.c = true;
            return this.b;
        }

        /* renamed from: t */
        public final MessageType G0() {
            MessageType messagetype = (MessageType) ((l91) u0());
            if (messagetype.b()) {
                return messagetype;
            }
            throw new fc1(messagetype);
        }
    }

    /* renamed from: l91$b */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends l91<MessageType, BuilderType> implements ya1 {
        public b91<Object> zzaic = b91.r();

        public final b91<Object> C() {
            if (this.zzaic.b()) {
                this.zzaic = (b91) this.zzaic.clone();
            }
            return this.zzaic;
        }
    }

    /* renamed from: l91$c */
    public static class c<T extends l91<T, ?>> extends t71<T> {
        private final T a;

        public c(T t) {
            this.a = t;
        }

        @Override // defpackage.fb1
        public final /* synthetic */ Object a(o81 o81, y81 y81) throws v91 {
            return l91.l(this.a, o81, y81);
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: l91$d */
    public static final class d {
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
            C0201.m83(d.class, 316);
        }

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* renamed from: l91$e */
    public static class e<ContainingType extends wa1, Type> extends x81<ContainingType, Type> {
    }

    public static t91 A() {
        return ja1.e();
    }

    public static <E> s91<E> B() {
        return kb1.b();
    }

    public static <T extends l91<T, ?>> T l(T t, o81 o81, y81 y81) throws v91 {
        T t2 = (T) ((l91) t.q(d.d, null, null));
        try {
            hb1.b().c(t2).h(t2, p81.O(o81), y81);
            t2.w();
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof v91) {
                throw ((v91) e2.getCause());
            }
            v91 v91 = new v91(e2.getMessage());
            v91.a(t2);
            throw v91;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof v91) {
                throw ((v91) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends l91<T, ?>> T m(T t, byte[] bArr, int i, int i2, y81 y81) throws v91 {
        T t2 = (T) ((l91) t.q(d.d, null, null));
        try {
            hb1.b().c(t2).j(t2, bArr, 0, i2, new x71(y81));
            t2.w();
            if (t2.zzact == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof v91) {
                throw ((v91) e2.getCause());
            }
            v91 v91 = new v91(e2.getMessage());
            v91.a(t2);
            throw v91;
        } catch (IndexOutOfBoundsException unused) {
            v91 b2 = v91.b();
            b2.a(t2);
            throw b2;
        }
    }

    public static <T extends l91<T, ?>> T n(T t, byte[] bArr, y81 y81) throws v91 {
        T t2 = (T) m(t, bArr, 0, bArr.length, y81);
        if (t2 == null || t2.b()) {
            return t2;
        }
        v91 v91 = new v91(new fc1(t2).getMessage());
        v91.a(t2);
        throw v91;
    }

    public static <E> s91<E> o(s91<E> s91) {
        int size = s91.size();
        return s91.Z0(size == 0 ? 10 : size << 1);
    }

    public static t91 p(t91 t91) {
        int size = t91.size();
        return t91.a0(size == 0 ? 10 : size << 1);
    }

    public static Object r(wa1 wa1, String str, Object[] objArr) {
        return new jb1(wa1, str, objArr);
    }

    public static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(C0201.m82(27395), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(C0201.m82(27394), cause);
            }
        }
    }

    public static <T extends l91<?, ?>> void t(Class<T> cls, T t) {
        zzaib.put(cls, t);
    }

    public static final <T extends l91<T, ?>> boolean u(T t, boolean z) {
        byte byteValue = ((Byte) t.q(d.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = hb1.b().c(t).b(t);
        if (z) {
            t.q(d.b, b2 ? t : null, null);
        }
        return b2;
    }

    public static <T extends l91<?, ?>> T v(Class<T> cls) {
        l91<?, ?> l91 = zzaib.get(cls);
        if (l91 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l91 = (T) zzaib.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(C0201.m82(27396), e2);
            }
        }
        if (l91 == null) {
            l91 = (T) ((l91) ((l91) kc1.u(cls)).q(d.f, null, null));
            if (l91 != null) {
                zzaib.put(cls, l91);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) l91;
    }

    public static q91 z() {
        return o91.g();
    }

    @Override // defpackage.wa1
    public final int a() {
        if (this.zzaia == -1) {
            this.zzaia = hb1.b().c(this).i(this);
        }
        return this.zzaia;
    }

    @Override // defpackage.ya1
    public final boolean b() {
        return u(this, true);
    }

    @Override // defpackage.wa1
    public final /* synthetic */ va1 d() {
        return (a) q(d.e, null, null);
    }

    @Override // defpackage.ya1
    public final /* synthetic */ wa1 e() {
        return (l91) q(d.f, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((l91) q(d.f, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        return hb1.b().c(this).d(this, (l91) obj);
    }

    @Override // defpackage.wa1
    public final /* synthetic */ va1 f() {
        a aVar = (a) q(d.e, null, null);
        aVar.m(this);
        return aVar;
    }

    @Override // defpackage.wa1
    public final void g(r81 r81) throws IOException {
        hb1.b().a(getClass()).f(this, v81.P(r81));
    }

    public int hashCode() {
        int i = this.zzact;
        if (i != 0) {
            return i;
        }
        int g = hb1.b().c(this).g(this);
        this.zzact = g;
        return g;
    }

    @Override // defpackage.s71
    public final void j(int i) {
        this.zzaia = i;
    }

    @Override // defpackage.s71
    public final int k() {
        return this.zzaia;
    }

    public abstract Object q(int i, Object obj, Object obj2);

    public String toString() {
        return xa1.a(this, super.toString());
    }

    public final void w() {
        hb1.b().c(this).c(this);
    }

    public final <MessageType extends l91<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType x() {
        return (BuilderType) ((a) q(d.e, null, null));
    }

    public final BuilderType y() {
        BuilderType buildertype = (BuilderType) ((a) q(d.e, null, null));
        buildertype.m(this);
        return buildertype;
    }
}
