package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: t6  reason: default package */
/* compiled from: ViewOverlayApi18 */
public class t6 implements u6 {
    private final ViewOverlay a;

    public t6(View view) {
        this.a = view.getOverlay();
    }

    @Override // defpackage.u6
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.u6
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
