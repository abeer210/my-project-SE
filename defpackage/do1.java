package defpackage;

import java.io.IOException;

/* renamed from: do1  reason: default package */
public final class do1 extends bo1<co1, co1> {
    private static void t(Object obj, co1 co1) {
        ((kl1) obj).zzwj = co1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    @Override // defpackage.bo1
    public final /* synthetic */ void a(co1 co1, int i, long j) {
        co1.d(i << 3, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, bk1] */
    @Override // defpackage.bo1
    public final /* synthetic */ void b(co1 co1, int i, bk1 bk1) {
        co1.d((i << 3) | 2, bk1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ void c(co1 co1, int i, co1 co12) {
        co1.d((i << 3) | 3, co12);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, xo1] */
    @Override // defpackage.bo1
    public final /* synthetic */ void d(co1 co1, xo1 xo1) throws IOException {
        co1.f(xo1);
    }

    @Override // defpackage.bo1
    public final boolean e(hn1 hn1) {
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    @Override // defpackage.bo1
    public final /* synthetic */ void g(co1 co1, int i, long j) {
        co1.d((i << 3) | 1, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // defpackage.bo1
    public final /* synthetic */ void h(co1 co1, int i, int i2) {
        co1.d((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, xo1] */
    @Override // defpackage.bo1
    public final /* synthetic */ void i(co1 co1, xo1 xo1) throws IOException {
        co1.b(xo1);
    }

    @Override // defpackage.bo1
    public final void j(Object obj) {
        ((kl1) obj).zzwj.g();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ void k(Object obj, co1 co1) {
        t(obj, co1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ void l(Object obj, co1 co1) {
        t(obj, co1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ co1 m(co1 co1, co1 co12) {
        co1 co13 = co1;
        co1 co14 = co12;
        if (co14.equals(co1.i())) {
            return co13;
        }
        return co1.a(co13, co14);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.bo1
    public final /* synthetic */ co1 n() {
        return co1.j();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ co1 o(co1 co1) {
        co1 co12 = co1;
        co12.g();
        return co12;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ int p(co1 co1) {
        return co1.h();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.bo1
    public final /* synthetic */ co1 q(Object obj) {
        return ((kl1) obj).zzwj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.bo1
    public final /* synthetic */ co1 r(Object obj) {
        co1 co1 = ((kl1) obj).zzwj;
        if (co1 != co1.i()) {
            return co1;
        }
        co1 j = co1.j();
        t(obj, j);
        return j;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.bo1
    public final /* synthetic */ int s(co1 co1) {
        return co1.k();
    }
}
