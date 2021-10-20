package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: lk0  reason: default package */
/* compiled from: LayoutUpdateAnimation */
public class lk0 extends bk0 {
    @Override // defpackage.bk0
    public Animation b(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        if (!(view.getWidth() == i3 && view.getHeight() == i4)) {
            z = true;
        }
        if (z2 || z) {
            return new nk0(view, i, i2, i3, i4);
        }
        return null;
    }

    @Override // defpackage.bk0
    public boolean e() {
        return this.d > 0;
    }
}
