package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: w60  reason: default package */
/* compiled from: OOMSoftReference */
public class w60<T> {
    public SoftReference<T> a = null;
    public SoftReference<T> b = null;
    public SoftReference<T> c = null;

    public void a() {
        SoftReference<T> softReference = this.a;
        if (softReference != null) {
            softReference.clear();
            this.a = null;
        }
        SoftReference<T> softReference2 = this.b;
        if (softReference2 != null) {
            softReference2.clear();
            this.b = null;
        }
        SoftReference<T> softReference3 = this.c;
        if (softReference3 != null) {
            softReference3.clear();
            this.c = null;
        }
    }

    public T b() {
        SoftReference<T> softReference = this.a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(T t) {
        this.a = new SoftReference<>(t);
        this.b = new SoftReference<>(t);
        this.c = new SoftReference<>(t);
    }
}
