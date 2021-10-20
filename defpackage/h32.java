package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: h32  reason: default package */
/* compiled from: Excluder */
public final class h32 implements y22, Cloneable {
    public static final h32 g = new h32();
    private double a = -1.0d;
    private int b = 136;
    private boolean c = true;
    private boolean d;
    private List<g22> e = Collections.emptyList();
    private List<g22> f = Collections.emptyList();

    /* renamed from: h32$a */
    /* compiled from: Excluder */
    class a extends x22<T> {
        private x22<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ k22 c;
        public final /* synthetic */ g42 d;

        public a(boolean z, boolean z2, k22 k22, g42 g42) {
            this.b = z2;
            this.c = k22;
            this.d = g42;
        }

        private x22<T> d() {
            x22<T> x22 = this.a;
            if (x22 != null) {
                return x22;
            }
            x22<T> h = this.c.h(h32.this, this.d);
            this.a = h;
            return h;
        }

        @Override // defpackage.x22
        public void c(h42 h42, T t) throws IOException {
            if (this.b) {
                h42.x();
            } else {
                d().c(h42, t);
            }
        }
    }

    private boolean d(Class<?> cls) {
        if (this.a != -1.0d && !n((c32) cls.getAnnotation(c32.class), (d32) cls.getAnnotation(d32.class))) {
            return true;
        }
        if ((this.c || !i(cls)) && !g(cls)) {
            return false;
        }
        return true;
    }

    private boolean e(Class<?> cls, boolean z) {
        for (g22 g22 : z ? this.e : this.f) {
            if (g22.b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean i(Class<?> cls) {
        return cls.isMemberClass() && !j(cls);
    }

    private boolean j(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean l(c32 c32) {
        return c32 == null || c32.value() <= this.a;
    }

    private boolean m(d32 d32) {
        return d32 == null || d32.value() > this.a;
    }

    private boolean n(c32 c32, d32 d32) {
        return l(c32) && m(d32);
    }

    @Override // defpackage.y22
    public <T> x22<T> a(k22 k22, g42<T> g42) {
        Class<? super T> c2 = g42.c();
        boolean d2 = d(c2);
        boolean z = d2 || e(c2, true);
        boolean z2 = d2 || e(c2, false);
        if (z || z2) {
            return new a(z2, z, k22, g42);
        }
        return null;
    }

    /* renamed from: b */
    public h32 clone() {
        try {
            return (h32) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean c(Class<?> cls, boolean z) {
        return d(cls) || e(cls, z);
    }

    public boolean f(Field field, boolean z) {
        z22 z22;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if (!(this.a == -1.0d || n((c32) field.getAnnotation(c32.class), (d32) field.getAnnotation(d32.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.d && ((z22 = (z22) field.getAnnotation(z22.class)) == null || (!z ? !z22.deserialize() : !z22.serialize()))) {
            return true;
        }
        if ((!this.c && i(field.getType())) || g(field.getType())) {
            return true;
        }
        List<g22> list = z ? this.e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        h22 h22 = new h22(field);
        for (g22 g22 : list) {
            if (g22.a(h22)) {
                return true;
            }
        }
        return false;
    }
}
