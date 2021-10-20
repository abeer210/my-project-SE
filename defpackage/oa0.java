package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import defpackage.ja0;
import defpackage.ma0;
import defpackage.y50;
import vigqyno.C0201;

/* renamed from: oa0  reason: default package */
/* compiled from: DraweeView */
public class oa0<DH extends ja0> extends ImageView {
    private static boolean f;
    private final ma0.a a = new ma0.a();
    private float b = 0.0f;
    private na0<DH> c;
    private boolean d = false;
    private boolean e = false;

    static {
        C0201.m83(oa0.class, 461);
    }

    public oa0(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(24068));
            }
            if (!this.d) {
                boolean z = true;
                this.d = true;
                this.c = na0.e(null, context);
                if (Build.VERSION.SDK_INT >= 21) {
                    ColorStateList imageTintList = getImageTintList();
                    if (imageTintList != null) {
                        setColorFilter(imageTintList.getDefaultColor());
                    } else if (oh0.d()) {
                        oh0.b();
                        return;
                    } else {
                        return;
                    }
                }
                if (!f || context.getApplicationInfo().targetSdkVersion < 24) {
                    z = false;
                }
                this.e = z;
                if (oh0.d()) {
                    oh0.b();
                }
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (this.e && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f = z;
    }

    public void a() {
        this.c.k();
    }

    public void b() {
        this.c.l();
    }

    public void e() {
        a();
    }

    public void f() {
        b();
    }

    public float getAspectRatio() {
        return this.b;
    }

    public ia0 getController() {
        return this.c.g();
    }

    public DH getHierarchy() {
        return this.c.h();
    }

    public Drawable getTopLevelDrawable() {
        return this.c.i();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    public void onMeasure(int i, int i2) {
        ma0.a aVar = this.a;
        aVar.a = i;
        aVar.b = i2;
        ma0.b(aVar, this.b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        ma0.a aVar2 = this.a;
        super.onMeasure(aVar2.a, aVar2.b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c.m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d();
    }

    public void setAspectRatio(float f2) {
        if (f2 != this.b) {
            this.b = f2;
            requestLayout();
        }
    }

    public void setController(ia0 ia0) {
        this.c.o(ia0);
        super.setImageDrawable(this.c.i());
    }

    public void setHierarchy(DH dh) {
        this.c.p(dh);
        super.setImageDrawable(this.c.i());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.c.o(null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.c.o(null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        c(getContext());
        this.c.o(null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.c.o(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.e = z;
    }

    public String toString() {
        y50.b d2 = y50.d(this);
        na0<DH> na0 = this.c;
        d2.b(C0201.m82(24070), na0 != null ? na0.toString() : C0201.m82(24069));
        return d2.toString();
    }
}
