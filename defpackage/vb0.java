package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: vb0  reason: default package */
/* compiled from: AnimatedImageResult */
public class vb0 {
    private final tb0 a;
    private v60<Bitmap> b;
    private List<v60<Bitmap>> c;

    public vb0(wb0 wb0) {
        tb0 d = wb0.d();
        z50.g(d);
        this.a = d;
        wb0.c();
        this.b = wb0.e();
        this.c = wb0.b();
    }

    public static vb0 b(tb0 tb0) {
        return new vb0(tb0);
    }

    public static wb0 d(tb0 tb0) {
        return new wb0(tb0);
    }

    public synchronized void a() {
        v60.s(this.b);
        this.b = null;
        v60.u(this.c);
        this.c = null;
    }

    public tb0 c() {
        return this.a;
    }

    private vb0(tb0 tb0) {
        z50.g(tb0);
        this.a = tb0;
    }
}
