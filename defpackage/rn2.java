package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rn2  reason: default package */
/* compiled from: StackControllerBuilder */
public class rn2 {
    private Activity a;
    private dl2 b;
    private yn2 c;
    private String d;
    private bf2 e = new bf2();
    private be2 f;
    private pn2 g = new pn2();
    private ii2 h;
    private mi2 i;
    private List<nl2> j = new ArrayList();
    private oi2 k;

    public rn2(Activity activity, oi2 oi2) {
        this.a = activity;
        this.k = oi2;
        this.h = new ii2(activity, new bf2());
        this.f = new be2(activity, new ko2());
    }

    public qn2 a() {
        return new qn2(this.a, this.j, this.b, this.k, this.c, this.f, this.d, this.e, this.g, this.i, this.h);
    }

    public rn2 b(dl2 dl2) {
        this.b = dl2;
        return this;
    }

    public rn2 c(List<nl2> list) {
        this.j = list;
        return this;
    }

    public rn2 d(String str) {
        this.d = str;
        return this;
    }

    public rn2 e(bf2 bf2) {
        this.e = bf2;
        return this;
    }

    public rn2 f(ii2 ii2) {
        this.h = ii2;
        return this;
    }

    public rn2 g(mi2 mi2) {
        this.i = mi2;
        return this;
    }

    public rn2 h(yn2 yn2) {
        this.c = yn2;
        return this;
    }
}
