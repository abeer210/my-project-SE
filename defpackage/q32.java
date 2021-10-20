package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: q32  reason: default package */
/* compiled from: ArrayTypeAdapter */
public final class q32<E> extends x22<Object> {
    public static final y22 b = new a();
    private final x22<E> a;

    /* renamed from: q32$a */
    /* compiled from: ArrayTypeAdapter */
    static class a implements y22 {
        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            Type e = g42.e();
            if (!(e instanceof GenericArrayType) && (!(e instanceof Class) || !((Class) e).isArray())) {
                return null;
            }
            Type g = f32.g(e);
            return new q32(k22, k22.f(g42.b(g)), f32.k(g));
        }
    }

    public q32(k22 k22, x22<E> x22, Class<E> cls) {
        this.a = new b42(k22, x22, cls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: x22<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x22
    public void c(h42 h42, Object obj) throws IOException {
        if (obj == null) {
            h42.x();
            return;
        }
        h42.h();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.c(h42, Array.get(obj, i));
        }
        h42.n();
    }
}
