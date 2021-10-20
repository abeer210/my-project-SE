package defpackage;

import com.bumptech.glide.g;

/* renamed from: vg  reason: default package */
/* compiled from: DataFetcher */
public interface vg<T> {

    /* renamed from: vg$a */
    /* compiled from: DataFetcher */
    public interface a<T> {
        void c(Exception exc);

        void f(T t);
    }

    Class<T> a();

    void b();

    void cancel();

    com.bumptech.glide.load.a d();

    void e(g gVar, a<? super T> aVar);
}
