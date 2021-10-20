package defpackage;

import java.io.IOException;

/* renamed from: cy0  reason: default package */
public final class cy0 extends ay0<by0, by0> {
    private static void m(Object obj, by0 by0) {
        ((kv0) obj).zzjp = by0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    @Override // defpackage.ay0
    public final /* synthetic */ void a(by0 by0, int i, long j) {
        by0.e(i << 3, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, fu0] */
    @Override // defpackage.ay0
    public final /* synthetic */ void b(by0 by0, int i, fu0 fu0) {
        by0.e((i << 3) | 2, fu0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, vy0] */
    @Override // defpackage.ay0
    public final /* synthetic */ void c(by0 by0, vy0 vy0) throws IOException {
        by0.g(vy0);
    }

    @Override // defpackage.ay0
    public final void d(Object obj) {
        ((kv0) obj).zzjp.k();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, vy0] */
    @Override // defpackage.ay0
    public final /* synthetic */ void e(by0 by0, vy0 vy0) throws IOException {
        by0.b(vy0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.ay0
    public final /* synthetic */ by0 f() {
        return by0.i();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.ay0
    public final /* synthetic */ void g(Object obj, by0 by0) {
        m(obj, by0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.ay0
    public final /* synthetic */ void h(Object obj, by0 by0) {
        m(obj, by0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.ay0
    public final /* synthetic */ by0 i(by0 by0, by0 by02) {
        by0 by03 = by0;
        by0 by04 = by02;
        return by04.equals(by0.h()) ? by03 : by0.a(by03, by04);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ay0
    public final /* synthetic */ int j(by0 by0) {
        return by0.d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.ay0
    public final /* synthetic */ by0 k(Object obj) {
        return ((kv0) obj).zzjp;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ay0
    public final /* synthetic */ int l(by0 by0) {
        return by0.j();
    }
}
