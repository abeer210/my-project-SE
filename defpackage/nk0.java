package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: nk0  reason: default package */
/* compiled from: PositionAndSizeAnimation */
public class nk0 extends Animation implements kk0 {
    private final View a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;

    public nk0(View view, int i2, int i3, int i4, int i5) {
        this.a = view;
        b(i2, i3, i4, i5);
    }

    private void b(int i2, int i3, int i4, int i5) {
        this.b = this.a.getX() - this.a.getTranslationX();
        this.c = this.a.getY() - this.a.getTranslationY();
        this.f = this.a.getWidth();
        int height = this.a.getHeight();
        this.g = height;
        this.d = ((float) i2) - this.b;
        this.e = ((float) i3) - this.c;
        this.h = i4 - this.f;
        this.i = i5 - height;
    }

    @Override // defpackage.kk0
    public void a(int i2, int i3, int i4, int i5) {
        b(i2, i3, i4, i5);
    }

    public void applyTransformation(float f2, Transformation transformation) {
        float f3 = this.b + (this.d * f2);
        float f4 = this.c + (this.e * f2);
        this.a.layout(Math.round(f3), Math.round(f4), Math.round(f3 + ((float) this.f) + (((float) this.h) * f2)), Math.round(f4 + ((float) this.g) + (((float) this.i) * f2)));
    }

    public boolean willChangeBounds() {
        return true;
    }
}
