package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import vigqyno.C0201;

/* renamed from: fk0  reason: default package */
/* compiled from: LayoutAnimationController */
public class fk0 {
    private static Handler h;
    private final bk0 a = new ik0();
    private final bk0 b = new lk0();
    private final bk0 c = new jk0();
    private final SparseArray<kk0> d = new SparseArray<>(0);
    private boolean e;
    private long f = -1;
    private Runnable g;

    /* access modifiers changed from: package-private */
    /* renamed from: fk0$a */
    /* compiled from: LayoutAnimationController */
    public class a implements Runnable {
        public final /* synthetic */ Callback a;

        public a(fk0 fk0, Callback callback) {
            this.a = callback;
        }

        public void run() {
            this.a.invoke(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fk0$b */
    /* compiled from: LayoutAnimationController */
    public class b implements Animation.AnimationListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        public void onAnimationEnd(Animation animation) {
            fk0.this.d.remove(this.a);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            fk0.this.d.put(this.a, (kk0) animation);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fk0$c */
    /* compiled from: LayoutAnimationController */
    public class c implements Animation.AnimationListener {
        public final /* synthetic */ gk0 a;

        public c(fk0 fk0, gk0 gk0) {
            this.a = gk0;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.onAnimationEnd();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    private void d(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i));
            }
        }
    }

    private void g(long j) {
        if (h == null) {
            h = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.g;
        if (runnable != null) {
            h.removeCallbacks(runnable);
            h.postDelayed(this.g, j);
        }
    }

    public void b(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        kk0 kk0 = this.d.get(id);
        if (kk0 != null) {
            kk0.a(i, i2, i3, i4);
            return;
        }
        Animation a2 = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.a : this.b).a(view, i, i2, i3, i4);
        if (a2 instanceof kk0) {
            a2.setAnimationListener(new b(id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (a2 != null) {
            long duration = a2.getDuration();
            if (duration > this.f) {
                this.f = duration;
                g(duration);
            }
            view.startAnimation(a2);
        }
    }

    public void c(View view, gk0 gk0) {
        UiThreadUtil.assertOnUiThread();
        Animation a2 = this.c.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a2 != null) {
            d(view);
            a2.setAnimationListener(new c(this, gk0));
            long duration = a2.getDuration();
            if (duration > this.f) {
                g(duration);
                this.f = duration;
            }
            view.startAnimation(a2);
            return;
        }
        gk0.onAnimationEnd();
    }

    public void e(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            f();
            return;
        }
        int i = 0;
        this.e = false;
        String r1 = C0201.m82(27653);
        if (readableMap.hasKey(r1)) {
            i = readableMap.getInt(r1);
        }
        if (readableMap.hasKey(hk0.b(hk0.CREATE))) {
            this.a.d(readableMap.getMap(hk0.b(hk0.CREATE)), i);
            this.e = true;
        }
        if (readableMap.hasKey(hk0.b(hk0.UPDATE))) {
            this.b.d(readableMap.getMap(hk0.b(hk0.UPDATE)), i);
            this.e = true;
        }
        if (readableMap.hasKey(hk0.b(hk0.DELETE))) {
            this.c.d(readableMap.getMap(hk0.b(hk0.DELETE)), i);
            this.e = true;
        }
        if (this.e && callback != null) {
            this.g = new a(this, callback);
        }
    }

    public void f() {
        this.a.f();
        this.b.f();
        this.c.f();
        this.g = null;
        this.e = false;
        this.f = -1;
    }

    public boolean h(View view) {
        if (view == null) {
            return false;
        }
        if ((!this.e || view.getParent() == null) && this.d.get(view.getId()) == null) {
            return false;
        }
        return true;
    }
}
