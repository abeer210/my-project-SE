package defpackage;

import java.io.IOException;

/* renamed from: gc1  reason: default package */
public final class gc1 extends ec1<hc1, hc1> {
    private static void t(Object obj, hc1 hc1) {
        ((l91) obj).zzahz = hc1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    @Override // defpackage.ec1
    public final /* synthetic */ void a(hc1 hc1, int i, long j) {
        hc1.c(i << 3, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, c81] */
    @Override // defpackage.ec1
    public final /* synthetic */ void b(hc1 hc1, int i, c81 c81) {
        hc1.c((i << 3) | 2, c81);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ void c(hc1 hc1, int i, hc1 hc12) {
        hc1.c((i << 3) | 3, hc12);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, cd1] */
    @Override // defpackage.ec1
    public final /* synthetic */ void d(hc1 hc1, cd1 cd1) throws IOException {
        hc1.e(cd1);
    }

    @Override // defpackage.ec1
    public final boolean e(mb1 mb1) {
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    @Override // defpackage.ec1
    public final /* synthetic */ void g(hc1 hc1, int i, long j) {
        hc1.c((i << 3) | 1, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // defpackage.ec1
    public final /* synthetic */ void h(hc1 hc1, int i, int i2) {
        hc1.c((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, cd1] */
    @Override // defpackage.ec1
    public final /* synthetic */ void i(hc1 hc1, cd1 cd1) throws IOException {
        hc1.b(cd1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ void j(Object obj, hc1 hc1) {
        t(obj, hc1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ void k(Object obj, hc1 hc1) {
        t(obj, hc1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ hc1 l(hc1 hc1, hc1 hc12) {
        hc1 hc13 = hc1;
        hc1 hc14 = hc12;
        if (hc14.equals(hc1.i())) {
            return hc13;
        }
        return hc1.a(hc13, hc14);
    }

    @Override // defpackage.ec1
    public final void m(Object obj) {
        ((l91) obj).zzahz.g();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ hc1 n(hc1 hc1) {
        hc1 hc12 = hc1;
        hc12.g();
        return hc12;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ int o(hc1 hc1) {
        return hc1.h();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.ec1
    public final /* synthetic */ hc1 p() {
        return hc1.j();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.ec1
    public final /* synthetic */ hc1 q(Object obj) {
        return ((l91) obj).zzahz;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.ec1
    public final /* synthetic */ hc1 r(Object obj) {
        hc1 hc1 = ((l91) obj).zzahz;
        if (hc1 != hc1.i()) {
            return hc1;
        }
        hc1 j = hc1.j();
        t(obj, j);
        return j;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ec1
    public final /* synthetic */ int s(hc1 hc1) {
        return hc1.k();
    }
}
