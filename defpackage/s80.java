package defpackage;

import com.facebook.common.time.b;

/* renamed from: s80  reason: default package */
/* compiled from: ImagePerfRequestListener */
public class s80 extends ef0 {
    private final b a;
    private final p80 b;

    public s80(b bVar, p80 p80) {
        this.a = bVar;
        this.b = p80;
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void a(ih0 ih0, Object obj, String str, boolean z) {
        this.b.o(this.a.now());
        this.b.m(ih0);
        this.b.c(obj);
        this.b.t(str);
        this.b.s(z);
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void c(ih0 ih0, String str, boolean z) {
        this.b.n(this.a.now());
        this.b.m(ih0);
        this.b.t(str);
        this.b.s(z);
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void g(ih0 ih0, String str, Throwable th, boolean z) {
        this.b.n(this.a.now());
        this.b.m(ih0);
        this.b.t(str);
        this.b.s(z);
    }

    @Override // defpackage.gf0, defpackage.ef0
    public void k(String str) {
        this.b.n(this.a.now());
        this.b.t(str);
    }
}
