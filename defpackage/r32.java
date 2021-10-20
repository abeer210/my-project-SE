package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: r32  reason: default package */
/* compiled from: CollectionTypeAdapterFactory */
public final class r32 implements y22 {
    private final g32 a;

    /* renamed from: r32$a */
    /* compiled from: CollectionTypeAdapterFactory */
    private static final class a<E> extends x22<Collection<E>> {
        private final x22<E> a;

        public a(k22 k22, Type type, x22<E> x22, l32<? extends Collection<E>> l32) {
            this.a = new b42(k22, x22, type);
        }

        /* renamed from: d */
        public void c(h42 h42, Collection<E> collection) throws IOException {
            if (collection == null) {
                h42.x();
                return;
            }
            h42.h();
            for (E e : collection) {
                this.a.c(h42, e);
            }
            h42.n();
        }
    }

    public r32(g32 g32) {
        this.a = g32;
    }

    @Override // defpackage.y22
    public <T> x22<T> a(k22 k22, g42<T> g42) {
        Type e = g42.e();
        Class<? super T> c = g42.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = f32.h(e, c);
        return new a(k22, h, k22.f(g42.b(h)), this.a.a(g42));
    }
}
