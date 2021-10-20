package defpackage;

import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.views.scroll.h;
import vigqyno.C0201;

/* renamed from: fe2  reason: default package */
/* compiled from: ScrollEventListener */
public class fe2 implements e {
    private c a;
    private b b;
    private a c;
    private d d;
    private int e = -1;
    private boolean f;

    /* renamed from: fe2$a */
    /* compiled from: ScrollEventListener */
    public interface a {
        void b();

        void c();
    }

    /* renamed from: fe2$b */
    /* compiled from: ScrollEventListener */
    public interface b {
        void a(float f);

        void d(float f);
    }

    /* renamed from: fe2$c */
    /* compiled from: ScrollEventListener */
    public interface c {
        int getMeasuredHeight();

        float getTranslationY();
    }

    public fe2(d dVar) {
        this.d = dVar;
    }

    private int b(int i, int i2, int i3) {
        int i4 = i - i2;
        return Math.abs(i4) > i3 ? (Math.abs(i4) / i4) * i3 : i4;
    }

    private void c(h hVar) {
        try {
            if (C0201.m82(18865).equals(hVar.f())) {
                int intValue = ((Integer) rj2.a(hVar, C0201.m82(18866))).intValue();
                f(intValue, this.e);
                if (intValue != this.e) {
                    this.e = intValue;
                    return;
                }
                return;
            }
            boolean equals = C0201.m82(18867).equals(hVar.f());
            String r1 = C0201.m82(18868);
            if (equals) {
                e(true, ((Double) rj2.a(hVar, r1)).doubleValue());
            } else if (C0201.m82(18869).equals(hVar.f())) {
                e(false, ((Double) rj2.a(hVar, r1)).doubleValue());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void e(boolean z, double d2) {
        this.f = z;
        wj2.a(new ee2(this, d2));
    }

    private void f(int i, int i2) {
        c cVar;
        if (i >= 0 && this.f && (cVar = this.a) != null) {
            int b2 = b(i, i2, cVar.getMeasuredHeight());
            float translationY = this.a.getTranslationY() - ((float) b2);
            if (b2 < 0) {
                this.b.d(translationY);
            } else {
                this.b.a(translationY);
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(com.facebook.react.uimanager.events.c cVar) {
        if (cVar instanceof h) {
            c((h) cVar);
        }
    }

    public /* synthetic */ void d(double d2) {
        if (this.f) {
            return;
        }
        if (d2 > 0.0d) {
            this.c.c();
        } else {
            this.c.b();
        }
    }

    public void g(c cVar, b bVar, a aVar) {
        this.a = cVar;
        this.b = bVar;
        this.c = aVar;
        this.d.s(this);
    }

    public void h() {
        this.d.C(this);
    }
}
