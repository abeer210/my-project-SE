package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import vigqyno.C0201;

/* renamed from: u90  reason: default package */
/* compiled from: RoundedNinePatchDrawable */
public class u90 extends t90 {
    public u90(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // defpackage.t90
    public void draw(Canvas canvas) {
        if (oh0.d()) {
            oh0.a(C0201.m82(1466));
        }
        if (!g()) {
            super.draw(canvas);
            if (oh0.d()) {
                oh0.b();
                return;
            }
            return;
        }
        k();
        h();
        canvas.clipPath(this.e);
        super.draw(canvas);
        if (oh0.d()) {
            oh0.b();
        }
    }
}
