package defpackage;

import com.bumptech.glide.load.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pn  reason: default package */
/* compiled from: EncoderRegistry */
public class pn {
    private final List<a<?>> a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: pn$a */
    /* compiled from: EncoderRegistry */
    public static final class a<T> {
        private final Class<T> a;
        public final d<T> b;

        public a(Class<T> cls, d<T> dVar) {
            this.a = cls;
            this.b = dVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.a.add(new a<>(cls, dVar));
    }

    public synchronized <T> d<T> b(Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
