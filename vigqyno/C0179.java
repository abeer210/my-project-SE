package vigqyno;

import java.io.IOException;

/* renamed from: vigqyno.┇  reason: contains not printable characters */
public class C0179 {

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static boolean f10 = true;

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private static long f11 = 0;

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    private static boolean f12 = true;

    static {
        m19();
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public static void m19() {
        if (f10) {
            m22(null);
        }
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public static void m20(a aVar) {
        if (aVar == null) {
            throw new NullPointerException();
        }
        m22(aVar);
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private static void m21() {
        C0195 r0 = new C0195();
        C0208.m96();
        new C0172(r0).m9();
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private static synchronized void m22(a aVar) {
        synchronized (C0179.class) {
            try {
                if (f11 == 0) {
                    f11 = System.currentTimeMillis();
                }
                if (f10) {
                    f10 = false;
                    m21();
                }
                if (f12 && aVar != null) {
                    f12 = false;
                    m24(aVar);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public static native void m23(a aVar);

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    private static void m24(a aVar) {
        m23(aVar);
    }
}
