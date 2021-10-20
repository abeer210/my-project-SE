package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: te  reason: default package */
/* compiled from: JsonUtils */
public class te {
    private static final qf.a a = qf.a.a(C0201.m82(7836), C0201.m82(7837));

    /* access modifiers changed from: package-private */
    /* renamed from: te$a */
    /* compiled from: JsonUtils */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[qf.b.values().length];
            a = iArr;
            iArr[qf.b.NUMBER.ordinal()] = 1;
            a[qf.b.BEGIN_ARRAY.ordinal()] = 2;
            try {
                a[qf.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static PointF a(qf qfVar, float f) throws IOException {
        qfVar.c();
        float r = (float) qfVar.r();
        float r2 = (float) qfVar.r();
        while (qfVar.y() != qf.b.END_ARRAY) {
            qfVar.D();
        }
        qfVar.k();
        return new PointF(r * f, r2 * f);
    }

    private static PointF b(qf qfVar, float f) throws IOException {
        float r = (float) qfVar.r();
        float r2 = (float) qfVar.r();
        while (qfVar.o()) {
            qfVar.D();
        }
        return new PointF(r * f, r2 * f);
    }

    private static PointF c(qf qfVar, float f) throws IOException {
        qfVar.h();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (qfVar.o()) {
            int A = qfVar.A(a);
            if (A == 0) {
                f2 = g(qfVar);
            } else if (A != 1) {
                qfVar.B();
                qfVar.D();
            } else {
                f3 = g(qfVar);
            }
        }
        qfVar.m();
        return new PointF(f2 * f, f3 * f);
    }

    public static int d(qf qfVar) throws IOException {
        qfVar.c();
        int r = (int) (qfVar.r() * 255.0d);
        int r2 = (int) (qfVar.r() * 255.0d);
        int r3 = (int) (qfVar.r() * 255.0d);
        while (qfVar.o()) {
            qfVar.D();
        }
        qfVar.k();
        return Color.argb(255, r, r2, r3);
    }

    public static PointF e(qf qfVar, float f) throws IOException {
        int i = a.a[qfVar.y().ordinal()];
        if (i == 1) {
            return b(qfVar, f);
        }
        if (i == 2) {
            return a(qfVar, f);
        }
        if (i == 3) {
            return c(qfVar, f);
        }
        throw new IllegalArgumentException(C0201.m82(7838) + qfVar.y());
    }

    public static List<PointF> f(qf qfVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        qfVar.c();
        while (qfVar.y() == qf.b.BEGIN_ARRAY) {
            qfVar.c();
            arrayList.add(e(qfVar, f));
            qfVar.k();
        }
        qfVar.k();
        return arrayList;
    }

    public static float g(qf qfVar) throws IOException {
        qf.b y = qfVar.y();
        int i = a.a[y.ordinal()];
        if (i == 1) {
            return (float) qfVar.r();
        }
        if (i == 2) {
            qfVar.c();
            float r = (float) qfVar.r();
            while (qfVar.o()) {
                qfVar.D();
            }
            qfVar.k();
            return r;
        }
        throw new IllegalArgumentException(C0201.m82(7839) + y);
    }
}
