package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: TooltipCompatHandler */
public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static a1 j;
    private static a1 k;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d = new a();
    private final Runnable e = new b();
    private int f;
    private int g;
    private b1 h;
    private boolean i;

    /* compiled from: TooltipCompatHandler */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            a1.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            a1.this.c();
        }
    }

    private a1(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.c = l3.c(ViewConfiguration.get(view.getContext()));
        b();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    private void a() {
        this.a.removeCallbacks(this.d);
    }

    private void b() {
        this.f = C0188.f24;
        this.g = C0188.f24;
    }

    private void d() {
        this.a.postDelayed(this.d, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(a1 a1Var) {
        a1 a1Var2 = j;
        if (a1Var2 != null) {
            a1Var2.a();
        }
        j = a1Var;
        if (a1Var != null) {
            a1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        a1 a1Var = j;
        if (a1Var != null && a1Var.a == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var2 = k;
            if (a1Var2 != null && a1Var2.a == view) {
                a1Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new a1(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f) <= this.c && Math.abs(y - this.g) <= this.c) {
            return false;
        }
        this.f = x;
        this.g = y;
        return true;
    }

    public void c() {
        if (k == this) {
            k = null;
            b1 b1Var = this.h;
            if (b1Var != null) {
                b1Var.c();
                this.h = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(C0201.m82(31077), C0201.m82(31078));
            }
        }
        if (j == this) {
            e(null);
        }
        this.a.removeCallbacks(this.e);
    }

    public void g(boolean z) {
        long j2;
        int i2;
        long j3;
        if (k3.M(this.a)) {
            e(null);
            a1 a1Var = k;
            if (a1Var != null) {
                a1Var.c();
            }
            k = this;
            this.i = z;
            b1 b1Var = new b1(this.a.getContext());
            this.h = b1Var;
            b1Var.e(this.a, this.f, this.g, this.i, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                if ((k3.F(this.a) & 1) == 1) {
                    j3 = 3000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 15000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j3 - ((long) i2);
            }
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h != null && this.i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService(C0201.m82(31079));
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.a.isEnabled() && this.h == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
