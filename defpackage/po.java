package defpackage;

import defpackage.qo;

/* renamed from: po  reason: default package */
/* compiled from: NoTransition */
public class po<R> implements qo<R> {
    public static final po<?> a = new po<>();
    private static final ro<?> b = new a();

    /* renamed from: po$a */
    /* compiled from: NoTransition */
    public static class a<R> implements ro<R> {
        @Override // defpackage.ro
        public qo<R> a(com.bumptech.glide.load.a aVar, boolean z) {
            return po.a;
        }
    }

    public static <R> ro<R> b() {
        return (ro<R>) b;
    }

    @Override // defpackage.qo
    public boolean a(Object obj, qo.a aVar) {
        return false;
    }
}
