package defpackage;

import java.util.Map;

/* renamed from: yg0  reason: default package */
/* compiled from: StatefulProducerRunnable */
public abstract class yg0<T> extends m50<T> {
    private final sf0<T> b;
    private final ug0 c;
    private final String d;
    private final String e;

    public yg0(sf0<T> sf0, ug0 ug0, String str, String str2) {
        this.b = sf0;
        this.c = ug0;
        this.d = str;
        this.e = str2;
        ug0.b(str2, str);
    }

    @Override // defpackage.m50
    public void d() {
        ug0 ug0 = this.c;
        String str = this.e;
        ug0.d(str, this.d, ug0.f(str) ? g() : null);
        this.b.b();
    }

    @Override // defpackage.m50
    public void e(Exception exc) {
        ug0 ug0 = this.c;
        String str = this.e;
        ug0.j(str, this.d, exc, ug0.f(str) ? h(exc) : null);
        this.b.a(exc);
    }

    @Override // defpackage.m50
    public void f(T t) {
        ug0 ug0 = this.c;
        String str = this.e;
        ug0.i(str, this.d, ug0.f(str) ? i(t) : null);
        this.b.d(t, 1);
    }

    public Map<String, String> g() {
        return null;
    }

    public Map<String, String> h(Exception exc) {
        return null;
    }

    public Map<String, String> i(T t) {
        return null;
    }
}
