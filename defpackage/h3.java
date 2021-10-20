package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import vigqyno.C0201;

/* renamed from: h3  reason: default package */
/* compiled from: OneShotPreDrawListener */
public final class h3 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private h3(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static h3 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException(C0201.m82(15654));
        } else if (runnable != null) {
            h3 h3Var = new h3(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(h3Var);
            view.addOnAttachStateChangeListener(h3Var);
            return h3Var;
        } else {
            throw new NullPointerException(C0201.m82(15653));
        }
    }

    public void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
