package defpackage;

import com.bumptech.glide.load.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: tn  reason: default package */
/* compiled from: ResourceDecoderRegistry */
public class tn {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: tn$a */
    /* compiled from: ResourceDecoderRegistry */
    public static class a<T, R> {
        private final Class<T> a;
        public final Class<R> b;
        public final k<T, R> c;

        public a(Class<T> cls, Class<R> cls2, k<T, R> kVar) {
            this.a = cls;
            this.b = cls2;
            this.c = kVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(String str, k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, kVar));
    }

    public synchronized <T, R> List<k<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.a);
        this.a.clear();
        for (String str : list) {
            this.a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.a.add(str2);
            }
        }
    }
}
