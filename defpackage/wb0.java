package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: wb0  reason: default package */
/* compiled from: AnimatedImageResultBuilder */
public class wb0 {
    private final tb0 a;
    private v60<Bitmap> b;
    private List<v60<Bitmap>> c;
    private int d;

    public wb0(tb0 tb0) {
        this.a = tb0;
    }

    public vb0 a() {
        try {
            return new vb0(this);
        } finally {
            v60.s(this.b);
            this.b = null;
            v60.u(this.c);
            this.c = null;
        }
    }

    public List<v60<Bitmap>> b() {
        return v60.o(this.c);
    }

    public int c() {
        return this.d;
    }

    public tb0 d() {
        return this.a;
    }

    public v60<Bitmap> e() {
        return v60.n(this.b);
    }

    public wb0 f(List<v60<Bitmap>> list) {
        this.c = v60.o(list);
        return this;
    }

    public wb0 g(int i) {
        this.d = i;
        return this;
    }

    public wb0 h(v60<Bitmap> v60) {
        this.b = v60.n(v60);
        return this;
    }
}
