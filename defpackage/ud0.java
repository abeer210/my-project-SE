package defpackage;

import defpackage.v60;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import vigqyno.C0201;

/* renamed from: ud0  reason: default package */
/* compiled from: CloseableReferenceFactory */
public class ud0 {
    private final v60.c a;

    /* renamed from: ud0$a */
    /* compiled from: CloseableReferenceFactory */
    class a implements v60.c {
        public final /* synthetic */ me0 a;

        public a(ud0 ud0, me0 me0) {
            this.a = me0;
        }

        @Override // defpackage.v60.c
        public void a(y60<Object> y60, Throwable th) {
            this.a.b(y60, th);
            f60.C(C0201.m82(27256), C0201.m82(27257), Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(y60)), y60.f().getClass().getName(), ud0.d(th));
        }

        @Override // defpackage.v60.c
        public boolean b() {
            return this.a.a();
        }
    }

    public ud0(me0 me0) {
        this.a = new a(this, me0);
    }

    /* access modifiers changed from: private */
    public static String d(Throwable th) {
        if (th == null) {
            return C0201.m82(21926);
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public <U extends Closeable> v60<U> b(U u) {
        return v60.D(u, this.a);
    }

    public <T> v60<T> c(T t, x60<T> x60) {
        return v60.G(t, x60, this.a);
    }
}
