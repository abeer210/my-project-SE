package defpackage;

import vigqyno.C0201;

/* renamed from: eb0  reason: default package */
/* compiled from: FixedNumberBitmapFramePreparationStrategy */
public class eb0 implements bb0 {
    private static final Class<?> b = eb0.class;
    private final int a;

    public eb0() {
        this(3);
    }

    @Override // defpackage.bb0
    public void a(cb0 cb0, wa0 wa0, ra0 ra0, int i) {
        for (int i2 = 1; i2 <= this.a; i2++) {
            int b2 = (i + i2) % ra0.b();
            if (f60.o(2)) {
                f60.r(b, C0201.m82(18914), Integer.valueOf(b2), Integer.valueOf(i));
            }
            if (!cb0.a(wa0, ra0, b2)) {
                return;
            }
        }
    }

    public eb0(int i) {
        this.a = i;
    }
}
