package defpackage;

/* renamed from: d60  reason: default package */
/* compiled from: Suppliers */
public class d60 {

    /* access modifiers changed from: package-private */
    /* renamed from: d60$a */
    /* compiled from: Suppliers */
    public static class a implements c60<T> {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.c60
        public T get() {
            return (T) this.a;
        }
    }

    public static <T> c60<T> a(T t) {
        return new a(t);
    }
}
