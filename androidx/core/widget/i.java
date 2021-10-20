package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* compiled from: ScrollerCompat */
public final class i {
    public OverScroller a;

    public i(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator == null) {
            overScroller = new OverScroller(context);
        }
        this.a = overScroller;
    }

    @Deprecated
    public static i c(Context context) {
        return d(context, null);
    }

    @Deprecated
    public static i d(Context context, Interpolator interpolator) {
        return new i(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public int f() {
        return this.a.getCurrX();
    }

    @Deprecated
    public int g() {
        return this.a.getCurrY();
    }

    @Deprecated
    public boolean h() {
        return this.a.isFinished();
    }
}
