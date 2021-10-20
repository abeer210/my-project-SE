package vigqyno;

import java.text.MessageFormat;
import java.util.List;

/* renamed from: vigqyno.┉  reason: contains not printable characters */
public class C0181 {

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    private static C0181 f13;

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private long f14 = 0;

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private int f15 = C0188.f23;

    private C0181() {
        m31();
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public static synchronized C0181 m28() {
        C0181 r1;
        synchronized (C0181.class) {
            if (f13 == null) {
                f13 = new C0181();
            }
            r1 = f13;
        }
        return r1;
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private native synchronized void m29(String str);

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    private native void m30();

    /* renamed from: ┃  reason: not valid java name and contains not printable characters */
    private native void m31();

    /* renamed from: ┄  reason: not valid java name and contains not printable characters */
    private native List<String> m32();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        throw r0;
     */
    public void finalize() {
        m30();
        super.finalize();
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public void m33(int i, String str) {
        if (m35(i)) {
            m29(str);
        }
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public void m34(int i, String str, Object[] objArr) {
        if (m35(i)) {
            m29(MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public boolean m35(int i) {
        return i >= this.f15;
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public List<String> m36() {
        return m32();
    }

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public void m37(int i) {
        this.f15 = i;
    }
}
