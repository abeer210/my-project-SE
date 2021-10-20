package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.a;
import com.shockwave.pdfium.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zl0  reason: default package */
/* compiled from: PdfFile */
public class zl0 {
    private static final Object s = new Object();
    private a a;
    private PdfiumCore b;
    private int c = 0;
    private List<Size> d = new ArrayList();
    private List<com.shockwave.pdfium.util.a> e = new ArrayList();
    private SparseBooleanArray f = new SparseBooleanArray();
    private Size g = new Size(0, 0);
    private Size h = new Size(0, 0);
    private com.shockwave.pdfium.util.a i = new com.shockwave.pdfium.util.a(0.0f, 0.0f);
    private com.shockwave.pdfium.util.a j = new com.shockwave.pdfium.util.a(0.0f, 0.0f);
    private boolean k = true;
    private int l = 0;
    private boolean m;
    private List<Float> n = new ArrayList();
    private List<Float> o = new ArrayList();
    private float p = 0.0f;
    private final um0 q;
    private int[] r;

    public zl0(PdfiumCore pdfiumCore, a aVar, um0 um0, Size size, int[] iArr, boolean z, int i2, boolean z2) {
        this.b = pdfiumCore;
        this.a = aVar;
        this.q = um0;
        this.r = iArr;
        this.k = z;
        this.l = i2;
        this.m = z2;
        A(size);
    }

    private void A(Size size) {
        int[] iArr = this.r;
        if (iArr != null) {
            this.c = iArr.length;
        } else {
            this.c = this.b.d(this.a);
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Size f2 = this.b.f(this.a, c(i2));
            if (f2.b() > this.g.b()) {
                this.g = f2;
            }
            if (f2.a() > this.h.a()) {
                this.h = f2;
            }
            this.d.add(f2);
        }
        y(size);
    }

    private void v(Size size) {
        float f2;
        float f3;
        this.o.clear();
        for (int i2 = 0; i2 < p(); i2++) {
            com.shockwave.pdfium.util.a aVar = this.e.get(i2);
            if (this.k) {
                f2 = (float) size.a();
                f3 = aVar.a();
            } else {
                f2 = (float) size.b();
                f3 = aVar.b();
            }
            float max = Math.max(0.0f, f2 - f3);
            if (i2 < p() - 1) {
                max += (float) this.l;
            }
            this.o.add(Float.valueOf(max));
        }
    }

    private void w() {
        float f2;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < p(); i2++) {
            com.shockwave.pdfium.util.a aVar = this.e.get(i2);
            f3 += this.k ? aVar.a() : aVar.b();
            if (this.m) {
                f2 = this.o.get(i2).floatValue();
            } else if (i2 < p() - 1) {
                f2 = (float) this.l;
            }
            f3 += f2;
        }
        this.p = f3;
    }

    private void x() {
        float f2;
        this.n.clear();
        float f3 = 0.0f;
        for (int i2 = 0; i2 < p(); i2++) {
            com.shockwave.pdfium.util.a aVar = this.e.get(i2);
            float a2 = this.k ? aVar.a() : aVar.b();
            if (this.m) {
                f3 += this.o.get(i2).floatValue() / 2.0f;
                if (i2 == 0) {
                    f3 -= ((float) this.l) / 2.0f;
                } else if (i2 == p() - 1) {
                    f3 += ((float) this.l) / 2.0f;
                }
                this.n.add(Float.valueOf(f3));
                f2 = this.o.get(i2).floatValue() / 2.0f;
            } else {
                this.n.add(Float.valueOf(f3));
                f2 = (float) this.l;
            }
            f3 += a2 + f2;
        }
    }

    public int a(int i2) {
        int p2;
        if (i2 <= 0) {
            return 0;
        }
        int[] iArr = this.r;
        if (iArr != null) {
            if (i2 >= iArr.length) {
                p2 = iArr.length;
            }
            return i2;
        }
        if (i2 >= p()) {
            p2 = p();
        }
        return i2;
        return p2 - 1;
    }

    public void b() {
        a aVar;
        PdfiumCore pdfiumCore = this.b;
        if (!(pdfiumCore == null || (aVar = this.a) == null)) {
            pdfiumCore.a(aVar);
        }
        this.a = null;
        this.r = null;
    }

    public int c(int i2) {
        int i3;
        int[] iArr = this.r;
        if (iArr == null) {
            i3 = i2;
        } else if (i2 < 0 || i2 >= iArr.length) {
            return -1;
        } else {
            i3 = iArr[i2];
        }
        if (i3 < 0 || i2 >= p()) {
            return -1;
        }
        return i3;
    }

    public List<a.C0126a> d() {
        a aVar = this.a;
        if (aVar == null) {
            return new ArrayList();
        }
        return this.b.g(aVar);
    }

    public float e(float f2) {
        return this.p * f2;
    }

    public float f() {
        return g().a();
    }

    public com.shockwave.pdfium.util.a g() {
        return this.k ? this.j : this.i;
    }

    public float h() {
        return g().b();
    }

    public a.c i() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        return this.b.b(aVar);
    }

    public int j(float f2, float f3) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < p() && (this.n.get(i2).floatValue() * f3) - (o(i2, f3) / 2.0f) < f2) {
            i3++;
            i2++;
        }
        int i4 = i3 - 1;
        if (i4 >= 0) {
            return i4;
        }
        return 0;
    }

    public float k(int i2, float f2) {
        com.shockwave.pdfium.util.a n2 = n(i2);
        return (this.k ? n2.a() : n2.b()) * f2;
    }

    public List<a.b> l(int i2) {
        return this.b.e(this.a, c(i2));
    }

    public float m(int i2, float f2) {
        if (c(i2) < 0) {
            return 0.0f;
        }
        return this.n.get(i2).floatValue() * f2;
    }

    public com.shockwave.pdfium.util.a n(int i2) {
        if (c(i2) < 0) {
            return new com.shockwave.pdfium.util.a(0.0f, 0.0f);
        }
        return this.e.get(i2);
    }

    public float o(int i2, float f2) {
        return (this.m ? this.o.get(i2).floatValue() : (float) this.l) * f2;
    }

    public int p() {
        return this.c;
    }

    public com.shockwave.pdfium.util.a q(int i2, float f2) {
        com.shockwave.pdfium.util.a n2 = n(i2);
        return new com.shockwave.pdfium.util.a(n2.b() * f2, n2.a() * f2);
    }

    public float r(int i2, float f2) {
        float f3;
        float a2;
        com.shockwave.pdfium.util.a n2 = n(i2);
        if (this.k) {
            f3 = h();
            a2 = n2.b();
        } else {
            f3 = f();
            a2 = n2.a();
        }
        return (f2 * (f3 - a2)) / 2.0f;
    }

    public RectF s(int i2, int i3, int i4, int i5, int i6, RectF rectF) {
        return this.b.i(this.a, c(i2), i3, i4, i5, i6, 0, rectF);
    }

    public boolean t(int i2) throws bm0 {
        int c2 = c(i2);
        if (c2 < 0) {
            return false;
        }
        synchronized (s) {
            if (this.f.indexOfKey(c2) >= 0) {
                return false;
            }
            try {
                this.b.k(this.a, c2);
                this.f.put(c2, true);
                return true;
            } catch (Exception e2) {
                this.f.put(c2, false);
                throw new bm0(i2, e2);
            }
        }
    }

    public boolean u(int i2) {
        return !this.f.get(c(i2), false);
    }

    public void y(Size size) {
        this.e.clear();
        wm0 wm0 = new wm0(this.q, this.g, this.h, size);
        this.j = wm0.g();
        this.i = wm0.f();
        for (Size size2 : this.d) {
            this.e.add(wm0.a(size2));
        }
        if (this.m) {
            v(size);
        }
        w();
        x();
    }

    public void z(Bitmap bitmap, int i2, Rect rect, boolean z) {
        this.b.m(this.a, bitmap, c(i2), rect.left, rect.top, rect.width(), rect.height(), z);
    }
}
