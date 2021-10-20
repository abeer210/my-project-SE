package defpackage;

import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: un  reason: default package */
/* compiled from: ResourceEncoderRegistry */
public class un {
    private final List<a<?>> a = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: un$a */
    /* compiled from: ResourceEncoderRegistry */
    public static final class a<T> {
        private final Class<T> a;
        public final l<T> b;

        public a(Class<T> cls, l<T> lVar) {
            this.a = cls;
            this.b = lVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, l<Z> lVar) {
        this.a.add(new a<>(cls, lVar));
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: com.bumptech.glide.load.l<T>, com.bumptech.glide.load.l<Z> */
    public synchronized <Z> l<Z> b(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (l<T>) aVar.b;
            }
        }
        return null;
    }
}
