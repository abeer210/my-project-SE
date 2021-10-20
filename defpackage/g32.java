package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import vigqyno.C0201;

/* renamed from: g32  reason: default package */
/* compiled from: ConstructorConstructor */
public final class g32 {
    private final Map<Type, l22<?>> a;
    private final e42 b = e42.a();

    /* access modifiers changed from: package-private */
    /* renamed from: g32$a */
    /* compiled from: ConstructorConstructor */
    public class a implements l32<T> {
        public a(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$b */
    /* compiled from: ConstructorConstructor */
    public class b implements l32<T> {
        public b(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$c */
    /* compiled from: ConstructorConstructor */
    public class c implements l32<T> {
        public c(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$d */
    /* compiled from: ConstructorConstructor */
    public class d implements l32<T> {
        public d(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new k32();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$e */
    /* compiled from: ConstructorConstructor */
    public class e implements l32<T> {
        private final p32 a = p32.b();
        public final /* synthetic */ Class b;
        public final /* synthetic */ Type c;

        public e(g32 g32, Class cls, Type type) {
            this.b = cls;
            this.c = type;
        }

        @Override // defpackage.l32
        public T a() {
            try {
                return (T) this.a.c(this.b);
            } catch (Exception e) {
                throw new RuntimeException(C0201.m82(17203) + this.c + C0201.m82(17204), e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$f */
    /* compiled from: ConstructorConstructor */
    public class f implements l32<T> {
        public final /* synthetic */ l22 a;
        public final /* synthetic */ Type b;

        public f(g32 g32, l22 l22, Type type) {
            this.a = l22;
            this.b = type;
        }

        @Override // defpackage.l32
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$g */
    /* compiled from: ConstructorConstructor */
    public class g implements l32<T> {
        public final /* synthetic */ l22 a;
        public final /* synthetic */ Type b;

        public g(g32 g32, l22 l22, Type type) {
            this.a = l22;
            this.b = type;
        }

        @Override // defpackage.l32
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$h */
    /* compiled from: ConstructorConstructor */
    public class h implements l32<T> {
        public final /* synthetic */ Constructor a;

        public h(g32 g32, Constructor constructor) {
            this.a = constructor;
        }

        @Override // defpackage.l32
        public T a() {
            String r0 = C0201.m82(17368);
            String r1 = C0201.m82(17369);
            try {
                return (T) this.a.newInstance(null);
            } catch (InstantiationException e) {
                throw new RuntimeException(r1 + this.a + r0, e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(r1 + this.a + r0, e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$i */
    /* compiled from: ConstructorConstructor */
    public class i implements l32<T> {
        public i(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$j */
    /* compiled from: ConstructorConstructor */
    public class j implements l32<T> {
        public final /* synthetic */ Type a;

        public j(g32 g32, Type type) {
            this.a = type;
        }

        @Override // defpackage.l32
        public T a() {
            Type type = this.a;
            boolean z = type instanceof ParameterizedType;
            String r2 = C0201.m82(17429);
            if (z) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new p22(r2 + this.a.toString());
            }
            throw new p22(r2 + this.a.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$k */
    /* compiled from: ConstructorConstructor */
    public class k implements l32<T> {
        public k(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$l */
    /* compiled from: ConstructorConstructor */
    public class l implements l32<T> {
        public l(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$m */
    /* compiled from: ConstructorConstructor */
    public class m implements l32<T> {
        public m(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g32$n */
    /* compiled from: ConstructorConstructor */
    public class n implements l32<T> {
        public n(g32 g32) {
        }

        @Override // defpackage.l32
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public g32(Map<Type, l22<?>> map) {
        this.a = map;
    }

    private <T> l32<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> l32<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l(this);
            }
            return new m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(g42.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new d(this);
            }
            return new c(this);
        }
    }

    private <T> l32<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> l32<T> a(g42<T> g42) {
        Type e2 = g42.e();
        Class<? super T> c2 = g42.c();
        l22<?> l22 = this.a.get(e2);
        if (l22 != null) {
            return new f(this, l22, e2);
        }
        l22<?> l222 = this.a.get(c2);
        if (l222 != null) {
            return new g(this, l222, e2);
        }
        l32<T> b2 = b(c2);
        if (b2 != null) {
            return b2;
        }
        l32<T> c3 = c(e2, c2);
        if (c3 != null) {
            return c3;
        }
        return d(e2, c2);
    }

    public String toString() {
        return this.a.toString();
    }
}
