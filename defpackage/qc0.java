package defpackage;

import android.graphics.Bitmap;

/* renamed from: qc0  reason: default package */
/* compiled from: SimpleBitmapReleaser */
public class qc0 implements x60<Bitmap> {
    private static qc0 a;

    private qc0() {
    }

    public static qc0 b() {
        if (a == null) {
            a = new qc0();
        }
        return a;
    }

    /* renamed from: c */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
