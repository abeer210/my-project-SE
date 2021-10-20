package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.g;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: bk0  reason: default package */
/* compiled from: AbstractLayoutAnimation */
public abstract class bk0 {
    private static final Map<ek0, BaseInterpolator> e = e.g(ek0.LINEAR, new LinearInterpolator(), ek0.EASE_IN, new AccelerateInterpolator(), ek0.EASE_OUT, new DecelerateInterpolator(), ek0.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    private Interpolator a;
    private int b;
    public ck0 c;
    public int d;

    private static Interpolator c(ek0 ek0, ReadableMap readableMap) {
        BaseInterpolator baseInterpolator;
        if (ek0.equals(ek0.SPRING)) {
            baseInterpolator = new ok0(ok0.a(readableMap));
        } else {
            baseInterpolator = e.get(ek0);
        }
        if (baseInterpolator != null) {
            return baseInterpolator;
        }
        throw new IllegalArgumentException(C0201.m82(16152) + ek0);
    }

    public final Animation a(View view, int i, int i2, int i3, int i4) {
        if (!e()) {
            return null;
        }
        Animation b2 = b(view, i, i2, i3, i4);
        if (b2 != null) {
            b2.setDuration((long) (this.d * 1));
            b2.setStartOffset((long) (this.b * 1));
            b2.setInterpolator(this.a);
        }
        return b2;
    }

    public abstract Animation b(View view, int i, int i2, int i3, int i4);

    public void d(ReadableMap readableMap, int i) {
        String r0 = C0201.m82(16153);
        this.c = readableMap.hasKey(r0) ? ck0.b(readableMap.getString(r0)) : null;
        String r02 = C0201.m82(16154);
        if (readableMap.hasKey(r02)) {
            i = readableMap.getInt(r02);
        }
        this.d = i;
        String r4 = C0201.m82(16155);
        this.b = readableMap.hasKey(r4) ? readableMap.getInt(r4) : 0;
        String r42 = C0201.m82(16156);
        if (readableMap.hasKey(r42)) {
            this.a = c(ek0.b(readableMap.getString(r42)), readableMap);
            if (!e()) {
                throw new g(C0201.m82(16157) + readableMap);
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(16158));
    }

    public abstract boolean e();

    public void f() {
        this.c = null;
        this.d = 0;
        this.b = 0;
        this.a = null;
    }
}
