package vigqyno;

import android.hardware.display.DisplayManager;

/* renamed from: vigqyno.┈  reason: contains not printable characters */
public class C0180 implements DisplayManager.DisplayListener {
    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public static native void m25(int i);

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    public static native void m26(int i);

    /* renamed from: │  reason: not valid java name and contains not printable characters */
    public static native void m27(int i);

    public void onDisplayAdded(int i) {
        m27(i);
    }

    public void onDisplayChanged(int i) {
        m25(i);
    }

    public void onDisplayRemoved(int i) {
        m26(i);
    }
}
