package defpackage;

import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: tm  reason: default package */
/* compiled from: TranscoderRegistry */
public class tm {
    private final List<a<?, ?>> a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: tm$a */
    /* compiled from: TranscoderRegistry */
    public static final class a<Z, R> {
        private final Class<Z> a;
        private final Class<R> b;
        public final sm<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, sm<Z, R> smVar) {
            this.a = cls;
            this.b = cls2;
            this.c = smVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized <Z, R> sm<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return um.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return aVar.c;
            }
        }
        throw new IllegalArgumentException(C0201.m82(8201) + cls + C0201.m82(8202) + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, sm<Z, R> smVar) {
        this.a.add(new a<>(cls, cls2, smVar));
    }
}
