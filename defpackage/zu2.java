package defpackage;

import android.graphics.Bitmap;

/* renamed from: zu2  reason: default package */
/* compiled from: NoOpBlurAlgorithm */
public class zu2 implements vu2 {
    @Override // defpackage.vu2
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.vu2
    public boolean b() {
        return true;
    }

    @Override // defpackage.vu2
    public Bitmap c(Bitmap bitmap, float f) {
        return bitmap;
    }

    @Override // defpackage.vu2
    public void destroy() {
    }
}
