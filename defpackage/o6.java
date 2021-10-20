package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: o6  reason: default package */
/* compiled from: ViewGroupOverlayApi18 */
public class o6 implements p6 {
    private final ViewGroupOverlay a;

    public o6(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // defpackage.u6
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.u6
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // defpackage.p6
    public void c(View view) {
        this.a.add(view);
    }

    @Override // defpackage.p6
    public void d(View view) {
        this.a.remove(view);
    }
}
