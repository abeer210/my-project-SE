package vigqyno;

import java.io.File;

/* renamed from: vigqyno.∭  reason: contains not printable characters */
public class C0172 {

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private static boolean f3 = false;

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private String f4 = null;

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    private String f5 = null;

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    private C0195 f6 = null;

    static {
        C0179.m19();
    }

    public C0172(C0195 r2) {
        this.f6 = r2;
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private String m4() {
        if (this.f6.m59() == null) {
            throw new RuntimeException("Could not find directory to extract library.");
        }
        StringBuilder append = new StringBuilder().append(this.f6.m59()).append("/lib");
        C0195 r1 = this.f6;
        return append.append(C0195.m55()).append(".so").toString();
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private static String m5(String str) {
        return new File(str).getName();
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private void m6() {
        System.load(this.f4);
    }

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    private void m7() {
        this.f6.m60(this.f5, this.f4);
    }

    /* renamed from: ┄  reason: not valid java name and contains not printable characters */
    private void m8() {
        File file = new File(this.f4);
        if (!file.delete()) {
            file.deleteOnExit();
        }
    }

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public void m9() {
        if (this.f6 == null) {
            throw new RuntimeException(getClass().getName() + " object is not initialized properly.");
        }
        try {
            C0195 r0 = this.f6;
            System.loadLibrary(C0195.m55());
        } catch (Exception e) {
            this.f5 = this.f6.m62();
            this.f4 = m4();
            f3 = true;
            m7();
            m6();
            m8();
        }
    }
}
