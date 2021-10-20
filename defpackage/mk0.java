package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: mk0  reason: default package */
/* compiled from: OpacityAnimation */
public class mk0 extends Animation {
    private final View a;
    private final float b;
    private final float c;

    /* renamed from: mk0$a */
    /* compiled from: OpacityAnimation */
    static class a implements Animation.AnimationListener {
        private final View a;
        private boolean b = false;

        public a(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public mk0(View view, float f, float f2) {
        this.a = view;
        this.b = f;
        this.c = f2 - f;
        setAnimationListener(new a(view));
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.a.setAlpha(this.b + (this.c * f));
    }

    public boolean willChangeBounds() {
        return false;
    }
}
