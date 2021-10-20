package defpackage;

import com.shockwave.pdfium.util.Size;

/* renamed from: wm0  reason: default package */
/* compiled from: PageSizeCalculator */
public class wm0 {
    private um0 a;
    private final Size b;
    private final Size c;
    private final Size d;
    private com.shockwave.pdfium.util.a e;
    private com.shockwave.pdfium.util.a f;
    private float g;
    private float h;

    /* access modifiers changed from: package-private */
    /* renamed from: wm0$a */
    /* compiled from: PageSizeCalculator */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[um0.values().length];
            a = iArr;
            iArr[um0.HEIGHT.ordinal()] = 1;
            a[um0.BOTH.ordinal()] = 2;
        }
    }

    public wm0(um0 um0, Size size, Size size2, Size size3) {
        this.a = um0;
        this.b = size;
        this.c = size2;
        this.d = size3;
        b();
    }

    private void b() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            com.shockwave.pdfium.util.a d2 = d(this.c, (float) this.d.a());
            this.f = d2;
            this.h = d2.a() / ((float) this.c.a());
            Size size = this.b;
            this.e = d(size, ((float) size.a()) * this.h);
        } else if (i != 2) {
            com.shockwave.pdfium.util.a e2 = e(this.b, (float) this.d.b());
            this.e = e2;
            this.g = e2.b() / ((float) this.b.b());
            Size size2 = this.c;
            this.f = e(size2, ((float) size2.b()) * this.g);
        } else {
            float b2 = c(this.b, (float) this.d.b(), (float) this.d.a()).b() / ((float) this.b.b());
            Size size3 = this.c;
            com.shockwave.pdfium.util.a c2 = c(size3, ((float) size3.b()) * b2, (float) this.d.a());
            this.f = c2;
            this.h = c2.a() / ((float) this.c.a());
            com.shockwave.pdfium.util.a c3 = c(this.b, (float) this.d.b(), ((float) this.b.a()) * this.h);
            this.e = c3;
            this.g = c3.b() / ((float) this.b.b());
        }
    }

    private com.shockwave.pdfium.util.a c(Size size, float f2, float f3) {
        float b2 = ((float) size.b()) / ((float) size.a());
        float floor = (float) Math.floor((double) (f2 / b2));
        if (floor > f3) {
            f2 = (float) Math.floor((double) (b2 * f3));
        } else {
            f3 = floor;
        }
        return new com.shockwave.pdfium.util.a(f2, f3);
    }

    private com.shockwave.pdfium.util.a d(Size size, float f2) {
        return new com.shockwave.pdfium.util.a((float) Math.floor((double) (f2 / (((float) size.a()) / ((float) size.b())))), f2);
    }

    private com.shockwave.pdfium.util.a e(Size size, float f2) {
        return new com.shockwave.pdfium.util.a(f2, (float) Math.floor((double) (f2 / (((float) size.b()) / ((float) size.a())))));
    }

    public com.shockwave.pdfium.util.a a(Size size) {
        if (size.b() <= 0 || size.a() <= 0) {
            return new com.shockwave.pdfium.util.a(0.0f, 0.0f);
        }
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return d(size, ((float) size.a()) * this.h);
        }
        if (i != 2) {
            return e(size, ((float) size.b()) * this.g);
        }
        return c(size, ((float) size.b()) * this.g, ((float) size.a()) * this.h);
    }

    public com.shockwave.pdfium.util.a f() {
        return this.f;
    }

    public com.shockwave.pdfium.util.a g() {
        return this.e;
    }
}
