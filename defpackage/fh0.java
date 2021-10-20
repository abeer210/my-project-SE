package defpackage;

/* renamed from: fh0  reason: default package */
/* compiled from: ThumbnailSizeChecker */
public final class fh0 {
    public static int a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    public static boolean b(int i, int i2, rd0 rd0) {
        if (rd0 == null) {
            if (((float) a(i)) < 2048.0f || a(i2) < 2048) {
                return false;
            }
            return true;
        } else if (a(i) < rd0.a || a(i2) < rd0.b) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean c(af0 af0, rd0 rd0) {
        if (af0 == null) {
            return false;
        }
        int x = af0.x();
        if (x == 90 || x == 270) {
            return b(af0.s(), af0.A(), rd0);
        }
        return b(af0.A(), af0.s(), rd0);
    }
}
