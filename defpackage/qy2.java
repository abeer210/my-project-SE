package defpackage;

/* renamed from: qy2  reason: default package */
/* compiled from: SegmentPool */
public final class qy2 {
    public static py2 a;
    public static long b;

    private qy2() {
    }

    public static void a(py2 py2) {
        if (py2.f != null || py2.g != null) {
            throw new IllegalArgumentException();
        } else if (!py2.d) {
            synchronized (qy2.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    py2.f = a;
                    py2.c = 0;
                    py2.b = 0;
                    a = py2;
                }
            }
        }
    }

    public static py2 b() {
        synchronized (qy2.class) {
            if (a == null) {
                return new py2();
            }
            py2 py2 = a;
            a = py2.f;
            py2.f = null;
            b -= 8192;
            return py2;
        }
    }
}
