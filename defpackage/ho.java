package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ho  reason: default package */
/* compiled from: CustomViewTarget */
public abstract class ho<T extends View, Z> implements no<Z> {
    private static final int f = h.glide_custom_view_target_tag;
    private final a a;
    public final T b;
    private View.OnAttachStateChangeListener c;
    private boolean d;
    private boolean e;

    /* renamed from: ho$a */
    /* compiled from: CustomViewTarget */
    static final class a {
        public static Integer e;
        private final View a;
        private final List<mo> b = new ArrayList();
        public boolean c;
        private ViewTreeObserver$OnPreDrawListenerC0139a d;

        /* access modifiers changed from: private */
        /* renamed from: ho$a$a  reason: collision with other inner class name */
        /* compiled from: CustomViewTarget */
        public static final class ViewTreeObserver$OnPreDrawListenerC0139a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> a;

            public ViewTreeObserver$OnPreDrawListenerC0139a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String r0 = C0201.m82(15691);
                if (Log.isLoggable(r0, 2)) {
                    Log.v(r0, C0201.m82(15692) + this);
                }
                a aVar = this.a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        private static int c(Context context) {
            if (e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService(C0201.m82(23090));
                ep.d(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String r4 = C0201.m82(23091);
            if (Log.isLoggable(r4, 4)) {
                Log.i(r4, C0201.m82(23092));
            }
            return c(this.a.getContext());
        }

        private int f() {
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        private void j(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((mo) it.next()).g(i, i2);
            }
        }

        public void a() {
            if (!this.b.isEmpty()) {
                int g = g();
                int f = f();
                if (i(g, f)) {
                    j(g, f);
                    b();
                }
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        public void d(mo moVar) {
            int g = g();
            int f = f();
            if (i(g, f)) {
                moVar.g(g, f);
                return;
            }
            if (!this.b.contains(moVar)) {
                this.b.add(moVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0139a aVar = new ViewTreeObserver$OnPreDrawListenerC0139a(this);
                this.d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public void k(mo moVar) {
            this.b.remove(moVar);
        }
    }

    public ho(T t) {
        ep.d(t);
        this.b = t;
        this.a = new a(t);
    }

    private Object i() {
        return this.b.getTag(f);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener != null && !this.e) {
            this.b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.e = true;
        }
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener != null && this.e) {
            this.b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.e = false;
        }
    }

    private void n(Object obj) {
        this.b.setTag(f, obj);
    }

    @Override // defpackage.no
    public final void a(mo moVar) {
        this.a.k(moVar);
    }

    @Override // defpackage.no
    public final void c(xn xnVar) {
        n(xnVar);
    }

    @Override // defpackage.no
    public final void e(Drawable drawable) {
        j();
        m(drawable);
    }

    @Override // defpackage.no
    public final xn f() {
        Object i = i();
        if (i == null) {
            return null;
        }
        if (i instanceof xn) {
            return (xn) i;
        }
        throw new IllegalArgumentException(C0201.m82(20498));
    }

    @Override // defpackage.no
    public final void g(Drawable drawable) {
        this.a.b();
        l(drawable);
        if (!this.d) {
            k();
        }
    }

    @Override // defpackage.no
    public final void h(mo moVar) {
        this.a.d(moVar);
    }

    public abstract void l(Drawable drawable);

    public void m(Drawable drawable) {
    }

    @Override // defpackage.dn
    public void onDestroy() {
    }

    @Override // defpackage.dn
    public void onStart() {
    }

    @Override // defpackage.dn
    public void onStop() {
    }

    public String toString() {
        return C0201.m82(20499) + this.b;
    }
}
