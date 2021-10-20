package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.qo;

/* renamed from: jo  reason: default package */
/* compiled from: ImageViewTarget */
public abstract class jo<Z> extends oo<ImageView, Z> implements qo.a {
    private Animatable g;

    public jo(ImageView imageView) {
        super(imageView);
    }

    private void n(Z z) {
        if (z instanceof Animatable) {
            Z z2 = z;
            this.g = z2;
            z2.start();
            return;
        }
        this.g = null;
    }

    private void q(Z z) {
        p(z);
        n(z);
    }

    @Override // defpackage.no
    public void b(Z z, qo<? super Z> qoVar) {
        if (qoVar == null || !qoVar.a(z, this)) {
            q(z);
        } else {
            n(z);
        }
    }

    @Override // defpackage.no, defpackage.eo
    public void d(Drawable drawable) {
        super.d(drawable);
        q(null);
        o(drawable);
    }

    @Override // defpackage.oo, defpackage.no, defpackage.eo
    public void e(Drawable drawable) {
        super.e(drawable);
        q(null);
        o(drawable);
    }

    @Override // defpackage.oo, defpackage.no, defpackage.eo
    public void g(Drawable drawable) {
        super.g(drawable);
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.stop();
        }
        q(null);
        o(drawable);
    }

    public void o(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.eo, defpackage.dn
    public void onStart() {
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.eo, defpackage.dn
    public void onStop() {
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public abstract void p(Z z);
}
