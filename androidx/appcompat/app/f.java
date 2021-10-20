package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.x0;
import androidx.lifecycle.d;
import defpackage.a0;
import defpackage.v2;
import defpackage.w;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import vigqyno.C0201;

/* compiled from: AppCompatDelegateImpl */
public class f extends e implements g.a, LayoutInflater.Factory2 {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    private static final Map<Class<?>, Integer> d0 = new r0();
    private static final boolean e0 = (Build.VERSION.SDK_INT < 21);
    private static final int[] f0 = {16842836};
    private static boolean g0 = true;
    private static final boolean h0;
    private View A;
    private boolean B;
    private boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    private boolean I;
    private o[] J;
    private o K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    public boolean P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private l U;
    private l V;
    public boolean W;
    public int X;
    private final Runnable Y;
    private boolean Z;
    private Rect a0;
    private Rect b0;
    private AppCompatViewInflater c0;
    public final Object d;
    public final Context e;
    public Window f;
    private j g;
    public final d h;
    public a i;
    public MenuInflater j;
    private CharSequence k;
    private c0 l;
    private h m;
    private p n;
    public w o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable u;
    public p3 v;
    private boolean w;
    private boolean x;
    private ViewGroup y;
    private TextView z;

    /* compiled from: AppCompatDelegateImpl */
    static class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains(C0201.m82(3488)) || message.contains(C0201.m82(3489))) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + C0201.m82(3490));
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.X & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.X & 4096) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.W = false;
            fVar3.X = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public class c implements g3 {
        public c() {
        }

        @Override // defpackage.g3
        public t3 a(View view, t3 t3Var) {
            int d = t3Var.d();
            int K0 = f.this.K0(d);
            if (d != K0) {
                t3Var = t3Var.f(t3Var.b(), K0, t3Var.c(), t3Var.a());
            }
            return k3.V(view, t3Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public class d implements g0.a {
        public d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = f.this.K0(rect.top);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public class e implements ContentFrameLayout.a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    public class RunnableC0007f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        /* compiled from: AppCompatDelegateImpl */
        class a extends r3 {
            public a() {
            }

            @Override // defpackage.q3
            public void b(View view) {
                f.this.p.setAlpha(1.0f);
                f.this.v.f(null);
                f.this.v = null;
            }

            @Override // defpackage.r3, defpackage.q3
            public void c(View view) {
                f.this.p.setVisibility(0);
            }
        }

        public RunnableC0007f() {
        }

        public void run() {
            f fVar = f.this;
            fVar.q.showAtLocation(fVar.p, 55, 0, 0);
            f.this.V();
            if (f.this.C0()) {
                f.this.p.setAlpha(0.0f);
                f fVar2 = f.this;
                p3 c = k3.c(fVar2.p);
                c.a(1.0f);
                fVar2.v = c;
                f.this.v.f(new a());
                return;
            }
            f.this.p.setAlpha(1.0f);
            f.this.p.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public class g extends r3 {
        public g() {
        }

        @Override // defpackage.q3
        public void b(View view) {
            f.this.p.setAlpha(1.0f);
            f.this.v.f(null);
            f.this.v = null;
        }

        @Override // defpackage.r3, defpackage.q3
        public void c(View view) {
            f.this.p.setVisibility(0);
            f.this.p.sendAccessibilityEvent(32);
            if (f.this.p.getParent() instanceof View) {
                k3.f0((View) f.this.p.getParent());
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl */
    public final class h implements m.a {
        public h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.M(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback e0 = f.this.e0();
            if (e0 == null) {
                return true;
            }
            e0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public class i implements w.a {
        private w.a a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends r3 {
            public a() {
            }

            @Override // defpackage.q3
            public void b(View view) {
                f.this.p.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.p.getParent() instanceof View) {
                    k3.f0((View) f.this.p.getParent());
                }
                f.this.p.removeAllViews();
                f.this.v.f(null);
                f.this.v = null;
            }
        }

        public i(w.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.w.a
        public void a(w wVar) {
            this.a.a(wVar);
            f fVar = f.this;
            if (fVar.q != null) {
                fVar.f.getDecorView().removeCallbacks(f.this.u);
            }
            f fVar2 = f.this;
            if (fVar2.p != null) {
                fVar2.V();
                f fVar3 = f.this;
                p3 c = k3.c(fVar3.p);
                c.a(0.0f);
                fVar3.v = c;
                f.this.v.f(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.h;
            if (dVar != null) {
                dVar.f(fVar4.o);
            }
            f.this.o = null;
        }

        @Override // defpackage.w.a
        public boolean b(w wVar, Menu menu) {
            return this.a.b(wVar, menu);
        }

        @Override // defpackage.w.a
        public boolean c(w wVar, Menu menu) {
            return this.a.c(wVar, menu);
        }

        @Override // defpackage.w.a
        public boolean d(w wVar, MenuItem menuItem) {
            return this.a.d(wVar, menuItem);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl */
    public class k extends l {
        private final PowerManager c;

        public k(Context context) {
            super();
            this.c = (PowerManager) context.getSystemService(C0201.m82(2298));
        }

        @Override // androidx.appcompat.app.f.l
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C0201.m82(2299));
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            if (Build.VERSION.SDK_INT < 21 || !this.c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.G();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public abstract class l {
        private BroadcastReceiver a;

        /* access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl */
        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        public l() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                f.this.e.registerReceiver(this.a, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl */
    public class m extends l {
        private final k c;

        public m(k kVar) {
            super();
            this.c = kVar;
        }

        @Override // androidx.appcompat.app.f.l
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C0201.m82(2267));
            intentFilter.addAction(C0201.m82(2268));
            intentFilter.addAction(C0201.m82(2269));
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.G();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl */
    public class n extends ContentFrameLayout {
        public n(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.O(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(defpackage.n.d(getContext(), i2));
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl */
    public static final class o {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public androidx.appcompat.view.menu.g j;
        public androidx.appcompat.view.menu.e k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public o(int i2) {
            this.a = i2;
        }

        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, defpackage.j.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.h(aVar);
                this.j.b(this.k);
            }
            return this.k.b(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            if (this.i == null && this.k.a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.O(this.k);
                }
                this.j = gVar;
                if (gVar != null && (eVar = this.k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(defpackage.d.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(defpackage.d.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                newTheme.applyStyle(i3, true);
            } else {
                newTheme.applyStyle(defpackage.l.Theme_AppCompat_CompactMenu, true);
            }
            y yVar = new y(context, 0);
            yVar.getTheme().setTo(newTheme);
            this.l = yVar;
            TypedArray obtainStyledAttributes = yVar.obtainStyledAttributes(defpackage.m.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(defpackage.m.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(defpackage.m.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl */
    public final class p implements m.a {
        public p() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z2 = D != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = D;
            }
            o Y = fVar.Y(gVar);
            if (Y == null) {
                return;
            }
            if (z2) {
                f.this.L(Y.a, Y, D);
                f.this.P(Y, true);
                return;
            }
            f.this.P(Y, z);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback e0;
            if (gVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.D || (e0 = fVar.e0()) == null || f.this.P) {
                return true;
            }
            e0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        C0201.m83(f.class, 13);
        boolean z2 = false;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z2 = true;
        }
        h0 = z2;
        if (e0 && !g0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public f(Activity activity, d dVar) {
        this(activity, null, dVar, activity);
    }

    private void A0(androidx.appcompat.view.menu.g gVar, boolean z2) {
        c0 c0Var = this.l;
        if (c0Var == null || !c0Var.d() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.l.e())) {
            o c02 = c0(0, true);
            c02.q = true;
            P(c02, false);
            w0(c02, null);
            return;
        }
        Window.Callback e02 = e0();
        if (this.l.b() && z2) {
            this.l.f();
            if (!this.P) {
                e02.onPanelClosed(108, c0(0, true).j);
            }
        } else if (e02 != null && !this.P) {
            if (this.W && (this.X & 1) != 0) {
                this.f.getDecorView().removeCallbacks(this.Y);
                this.Y.run();
            }
            o c03 = c0(0, true);
            androidx.appcompat.view.menu.g gVar2 = c03.j;
            if (gVar2 != null && !c03.r && e02.onPreparePanel(0, c03.i, gVar2)) {
                e02.onMenuOpened(108, c03.j);
                this.l.g();
            }
        }
    }

    private int B0(int i2) {
        String r0 = C0201.m82(4622);
        if (i2 == 8) {
            Log.i(r0, C0201.m82(4623));
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i(r0, C0201.m82(4624));
            return 109;
        }
    }

    private boolean D0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || k3.M((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void G0() {
        if (this.x) {
            throw new AndroidRuntimeException(C0201.m82(4625));
        }
    }

    private boolean H(boolean z2) {
        if (this.P) {
            return false;
        }
        int K2 = K();
        boolean I0 = I0(m0(K2), z2);
        if (K2 == 0) {
            b0().e();
        } else {
            l lVar = this.U;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (K2 == 3) {
            a0().e();
        } else {
            l lVar2 = this.V;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return I0;
    }

    private c H0() {
        for (Context context = this.e; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof c) {
                return (c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void I() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.y.findViewById(16908290);
        View decorView = this.f.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(defpackage.m.AppCompatTheme);
        obtainStyledAttributes.getValue(defpackage.m.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(defpackage.m.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(defpackage.m.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(defpackage.m.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(defpackage.m.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(defpackage.m.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(defpackage.m.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(defpackage.m.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(defpackage.m.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(defpackage.m.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean I0(int i2, boolean z2) {
        int i3 = this.e.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z3 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean k0 = k0();
        boolean z4 = false;
        if ((h0 || i4 != i3) && !k0 && Build.VERSION.SDK_INT >= 17 && !this.M && (this.d instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i4;
            try {
                ((ContextThemeWrapper) this.d).applyOverrideConfiguration(configuration);
                z4 = true;
            } catch (IllegalStateException e2) {
                Log.e(C0201.m82(4626), C0201.m82(4627), e2);
            }
        }
        int i5 = this.e.getResources().getConfiguration().uiMode & 48;
        if (!z4 && i5 != i4 && z2 && !k0 && this.M && (Build.VERSION.SDK_INT >= 17 || this.N)) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                androidx.core.app.a.n((Activity) obj);
                z4 = true;
            }
        }
        if (z4 || i5 == i4) {
            z3 = z4;
        } else {
            J0(i4, k0);
        }
        if (z3) {
            Object obj2 = this.d;
            if (obj2 instanceof c) {
                ((c) obj2).D(i2);
            }
        }
        return z3;
    }

    private void J(Window window) {
        Window window2 = this.f;
        String r1 = C0201.m82(4628);
        if (window2 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof j)) {
                j jVar = new j(callback);
                this.g = jVar;
                window.setCallback(jVar);
                x0 t = x0.t(this.e, null, f0);
                Drawable h2 = t.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                t.v();
                this.f = window;
                return;
            }
            throw new IllegalStateException(r1);
        }
        throw new IllegalStateException(r1);
    }

    private void J0(int i2, boolean z2) {
        Resources resources = this.e.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            h.a(resources);
        }
        int i3 = this.R;
        if (i3 != 0) {
            this.e.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.e.getTheme().applyStyle(this.R, true);
            }
        }
        if (z2) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (((androidx.lifecycle.g) activity).getLifecycle().b().b(d.b.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.O) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    private int K() {
        int i2 = this.Q;
        return i2 != -100 ? i2 : e.h();
    }

    private void N() {
        l lVar = this.U;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.V;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(defpackage.m.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(defpackage.m.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(defpackage.m.AppCompatTheme_windowNoTitle, false)) {
                y(1);
            } else if (obtainStyledAttributes.getBoolean(defpackage.m.AppCompatTheme_windowActionBar, false)) {
                y(108);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.m.AppCompatTheme_windowActionBarOverlay, false)) {
                y(109);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.m.AppCompatTheme_windowActionModeOverlay, false)) {
                y(10);
            }
            this.G = obtainStyledAttributes.getBoolean(defpackage.m.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            X();
            this.f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.e);
            if (this.H) {
                if (this.F) {
                    viewGroup = (ViewGroup) from.inflate(defpackage.j.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(defpackage.j.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    k3.t0(viewGroup, new c());
                } else {
                    ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
            } else if (this.G) {
                viewGroup = (ViewGroup) from.inflate(defpackage.j.abc_dialog_title_material, (ViewGroup) null);
                this.E = false;
                this.D = false;
            } else if (this.D) {
                TypedValue typedValue = new TypedValue();
                this.e.getTheme().resolveAttribute(defpackage.d.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new y(this.e, typedValue.resourceId);
                } else {
                    context = this.e;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(defpackage.j.abc_screen_toolbar, (ViewGroup) null);
                c0 c0Var = (c0) viewGroup.findViewById(defpackage.i.decor_content_parent);
                this.l = c0Var;
                c0Var.setWindowCallback(e0());
                if (this.E) {
                    this.l.h(109);
                }
                if (this.B) {
                    this.l.h(2);
                }
                if (this.C) {
                    this.l.h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.l == null) {
                    this.z = (TextView) viewGroup.findViewById(defpackage.i.title);
                }
                d1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(defpackage.i.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException(C0201.m82(4629) + this.D + C0201.m82(4630) + this.E + C0201.m82(4631) + this.G + C0201.m82(4632) + this.F + C0201.m82(4633) + this.H + C0201.m82(4634));
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException(C0201.m82(4635));
    }

    private void W() {
        if (!this.x) {
            this.y = Q();
            CharSequence d02 = d0();
            if (!TextUtils.isEmpty(d02)) {
                c0 c0Var = this.l;
                if (c0Var != null) {
                    c0Var.setWindowTitle(d02);
                } else if (x0() != null) {
                    x0().u(d02);
                } else {
                    TextView textView = this.z;
                    if (textView != null) {
                        textView.setText(d02);
                    }
                }
            }
            I();
            v0(this.y);
            this.x = true;
            o c02 = c0(0, false);
            if (this.P) {
                return;
            }
            if (c02 == null || c02.j == null) {
                j0(108);
            }
        }
    }

    private void X() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                J(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException(C0201.m82(4636));
        }
    }

    private l a0() {
        if (this.V == null) {
            this.V = new k(this.e);
        }
        return this.V;
    }

    private void f0() {
        W();
        if (this.D && this.i == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                this.i = new l((Activity) this.d, this.E);
            } else if (obj instanceof Dialog) {
                this.i = new l((Dialog) this.d);
            }
            a aVar = this.i;
            if (aVar != null) {
                aVar.r(this.Z);
            }
        }
    }

    private boolean g0(o oVar) {
        View view = oVar.i;
        if (view != null) {
            oVar.h = view;
            return true;
        } else if (oVar.j == null) {
            return false;
        } else {
            if (this.n == null) {
                this.n = new p();
            }
            View view2 = (View) oVar.a(this.n);
            oVar.h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean h0(o oVar) {
        oVar.d(Z());
        oVar.g = new n(oVar.l);
        oVar.c = 81;
        return true;
    }

    private boolean i0(o oVar) {
        Context context = this.e;
        int i2 = oVar.a;
        if ((i2 == 0 || i2 == 108) && this.l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(defpackage.d.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(defpackage.d.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(defpackage.d.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                y yVar = new y(context, 0);
                yVar.getTheme().setTo(theme2);
                context = yVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        oVar.c(gVar);
        return true;
    }

    private void j0(int i2) {
        this.X = (1 << i2) | this.X;
        if (!this.W) {
            k3.a0(this.f.getDecorView(), this.Y);
            this.W = true;
        }
    }

    private boolean k0() {
        if (!this.T && (this.d instanceof Activity)) {
            PackageManager packageManager = this.e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.e, this.d.getClass()), 0);
                this.S = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d(C0201.m82(4637), C0201.m82(4638), e2);
                this.S = false;
            }
        }
        this.T = true;
        return this.S;
    }

    private boolean p0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        o c02 = c0(i2, true);
        if (!c02.o) {
            return z0(c02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    private boolean s0(int i2, KeyEvent keyEvent) {
        boolean z2;
        c0 c0Var;
        if (this.o != null) {
            return false;
        }
        boolean z3 = true;
        o c02 = c0(i2, true);
        if (i2 == 0 && (c0Var = this.l) != null && c0Var.d() && !ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
            if (this.l.b()) {
                z3 = this.l.f();
            } else if (!this.P && z0(c02, keyEvent)) {
                z3 = this.l.g();
            }
            if (z3) {
            }
            return z3;
        } else if (c02.o || c02.n) {
            boolean z4 = c02.o;
            P(c02, true);
            z3 = z4;
            if (z3) {
                AudioManager audioManager = (AudioManager) this.e.getSystemService(C0201.m82(4639));
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                } else {
                    Log.w(C0201.m82(4640), C0201.m82(4641));
                }
            }
            return z3;
        } else if (c02.m) {
            if (c02.r) {
                c02.m = false;
                z2 = z0(c02, keyEvent);
            } else {
                z2 = true;
            }
            if (z2) {
                w0(c02, keyEvent);
                if (z3) {
                }
                return z3;
            }
        }
        z3 = false;
        if (z3) {
        }
        return z3;
    }

    private void w0(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!oVar.o && !this.P) {
            if (oVar.a == 0) {
                if ((this.e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback e02 = e0();
            if (e02 == null || e02.onMenuOpened(oVar.a, oVar.j)) {
                WindowManager windowManager = (WindowManager) this.e.getSystemService(C0201.m82(4642));
                if (windowManager != null && z0(oVar, keyEvent)) {
                    if (oVar.g == null || oVar.q) {
                        ViewGroup viewGroup = oVar.g;
                        if (viewGroup == null) {
                            if (!h0(oVar) || oVar.g == null) {
                                return;
                            }
                        } else if (oVar.q && viewGroup.getChildCount() > 0) {
                            oVar.g.removeAllViews();
                        }
                        if (g0(oVar) && oVar.b()) {
                            ViewGroup.LayoutParams layoutParams2 = oVar.h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.g.setBackgroundResource(oVar.b);
                            ViewParent parent = oVar.h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.h);
                            }
                            oVar.g.addView(oVar.h, layoutParams2);
                            if (!oVar.h.hasFocus()) {
                                oVar.h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            oVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, oVar.d, oVar.e, 1002, 8519680, -3);
                            layoutParams3.gravity = oVar.c;
                            layoutParams3.windowAnimations = oVar.f;
                            windowManager.addView(oVar.g, layoutParams3);
                            oVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    oVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, oVar.d, oVar.e, 1002, 8519680, -3);
                    layoutParams32.gravity = oVar.c;
                    layoutParams32.windowAnimations = oVar.f;
                    windowManager.addView(oVar.g, layoutParams32);
                    oVar.o = true;
                    return;
                }
                return;
            }
            P(oVar, true);
        }
    }

    private boolean y0(o oVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.m || z0(oVar, keyEvent)) && (gVar = oVar.j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.l == null) {
            P(oVar, true);
        }
        return z2;
    }

    private boolean z0(o oVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.P) {
            return false;
        }
        if (oVar.m) {
            return true;
        }
        o oVar2 = this.K;
        if (!(oVar2 == null || oVar2 == oVar)) {
            P(oVar2, false);
        }
        Window.Callback e02 = e0();
        if (e02 != null) {
            oVar.i = e02.onCreatePanelView(oVar.a);
        }
        int i2 = oVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var3 = this.l) != null) {
            c0Var3.c();
        }
        if (oVar.i == null && (!z2 || !(x0() instanceof i))) {
            if (oVar.j == null || oVar.r) {
                if (oVar.j == null && (!i0(oVar) || oVar.j == null)) {
                    return false;
                }
                if (z2 && this.l != null) {
                    if (this.m == null) {
                        this.m = new h();
                    }
                    this.l.a(oVar.j, this.m);
                }
                oVar.j.d0();
                if (!e02.onCreatePanelMenu(oVar.a, oVar.j)) {
                    oVar.c(null);
                    if (z2 && (c0Var2 = this.l) != null) {
                        c0Var2.a(null, this.m);
                    }
                    return false;
                }
                oVar.r = false;
            }
            oVar.j.d0();
            Bundle bundle = oVar.s;
            if (bundle != null) {
                oVar.j.P(bundle);
                oVar.s = null;
            }
            if (!e02.onPreparePanel(0, oVar.i, oVar.j)) {
                if (z2 && (c0Var = this.l) != null) {
                    c0Var.a(null, this.m);
                }
                oVar.j.c0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.p = z3;
            oVar.j.setQwertyMode(z3);
            oVar.j.c0();
        }
        oVar.m = true;
        oVar.n = false;
        this.K = oVar;
        return true;
    }

    @Override // androidx.appcompat.app.e
    public void A(int i2) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.a().onContentChanged();
    }

    public final boolean C0() {
        ViewGroup viewGroup;
        return this.x && (viewGroup = this.y) != null && k3.O(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public void D(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            a k2 = k();
            if (!(k2 instanceof l)) {
                this.j = null;
                if (k2 != null) {
                    k2.n();
                }
                if (toolbar != null) {
                    i iVar = new i(toolbar, d0(), this.g);
                    this.i = iVar;
                    this.f.setCallback(iVar.x());
                } else {
                    this.i = null;
                    this.f.setCallback(this.g);
                }
                m();
                return;
            }
            throw new IllegalStateException(C0201.m82(4643));
        }
    }

    @Override // androidx.appcompat.app.e
    public void E(int i2) {
        this.R = i2;
    }

    public w E0(w.a aVar) {
        d dVar;
        if (aVar != null) {
            w wVar = this.o;
            if (wVar != null) {
                wVar.c();
            }
            i iVar = new i(aVar);
            a k2 = k();
            if (k2 != null) {
                w v2 = k2.v(iVar);
                this.o = v2;
                if (!(v2 == null || (dVar = this.h) == null)) {
                    dVar.e(v2);
                }
            }
            if (this.o == null) {
                this.o = F0(iVar);
            }
            return this.o;
        }
        throw new IllegalArgumentException(C0201.m82(4644));
    }

    @Override // androidx.appcompat.app.e
    public final void F(CharSequence charSequence) {
        this.k = charSequence;
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (x0() != null) {
            x0().u(charSequence);
        } else {
            TextView textView = this.z;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    public w F0(w.a aVar) {
        w wVar;
        w wVar2;
        d dVar;
        y yVar;
        V();
        w wVar3 = this.o;
        if (wVar3 != null) {
            wVar3.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        d dVar2 = this.h;
        if (dVar2 != null && !this.P) {
            try {
                wVar = dVar2.h(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (wVar == null) {
                this.o = wVar;
            } else {
                boolean z2 = true;
                if (this.p == null) {
                    if (this.G) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.e.getTheme();
                        theme.resolveAttribute(defpackage.d.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.e.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            y yVar2 = new y(this.e, 0);
                            yVar2.getTheme().setTo(newTheme);
                            yVar = yVar2;
                        } else {
                            yVar = this.e;
                        }
                        this.p = new ActionBarContextView(yVar);
                        PopupWindow popupWindow = new PopupWindow(yVar, (AttributeSet) null, defpackage.d.actionModePopupWindowStyle);
                        this.q = popupWindow;
                        androidx.core.widget.h.b(popupWindow, 2);
                        this.q.setContentView(this.p);
                        this.q.setWidth(-1);
                        yVar.getTheme().resolveAttribute(defpackage.d.actionBarSize, typedValue, true);
                        this.p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, yVar.getResources().getDisplayMetrics()));
                        this.q.setHeight(-2);
                        this.u = new RunnableC0007f();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.y.findViewById(defpackage.i.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(Z()));
                            this.p = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.p != null) {
                    V();
                    this.p.k();
                    Context context = this.p.getContext();
                    ActionBarContextView actionBarContextView = this.p;
                    if (this.q != null) {
                        z2 = false;
                    }
                    z zVar = new z(context, actionBarContextView, aVar, z2);
                    if (aVar.b(zVar, zVar.e())) {
                        zVar.k();
                        this.p.h(zVar);
                        this.o = zVar;
                        if (C0()) {
                            this.p.setAlpha(0.0f);
                            p3 c2 = k3.c(this.p);
                            c2.a(1.0f);
                            this.v = c2;
                            c2.f(new g());
                        } else {
                            this.p.setAlpha(1.0f);
                            this.p.setVisibility(0);
                            this.p.sendAccessibilityEvent(32);
                            if (this.p.getParent() instanceof View) {
                                k3.f0((View) this.p.getParent());
                            }
                        }
                        if (this.q != null) {
                            this.f.getDecorView().post(this.u);
                        }
                    } else {
                        this.o = null;
                    }
                }
            }
            wVar2 = this.o;
            if (!(wVar2 == null || (dVar = this.h) == null)) {
                dVar.e(wVar2);
            }
            return this.o;
        }
        wVar = null;
        if (wVar == null) {
        }
        wVar2 = this.o;
        dVar.e(wVar2);
        return this.o;
    }

    public boolean G() {
        return H(true);
    }

    public int K0(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.p;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z4 = true;
            if (this.p.isShown()) {
                if (this.a0 == null) {
                    this.a0 = new Rect();
                    this.b0 = new Rect();
                }
                Rect rect = this.a0;
                Rect rect2 = this.b0;
                rect.set(0, i2, 0, 0);
                d1.a(this.y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.A;
                    if (view == null) {
                        View view2 = new View(this.e);
                        this.A = view2;
                        view2.setBackgroundColor(this.e.getResources().getColor(defpackage.f.abc_input_method_navigation_guard));
                        this.y.addView(this.A, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.A.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.A == null) {
                    z4 = false;
                }
                if (!this.F && z4) {
                    i2 = 0;
                }
                z4 = z3;
                z2 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.A;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    public void L(int i2, o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.J;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                menu = oVar.j;
            }
        }
        if ((oVar == null || oVar.o) && !this.P) {
            this.g.a().onPanelClosed(i2, menu);
        }
    }

    public void M(androidx.appcompat.view.menu.g gVar) {
        if (!this.I) {
            this.I = true;
            this.l.i();
            Window.Callback e02 = e0();
            if (e02 != null && !this.P) {
                e02.onPanelClosed(108, gVar);
            }
            this.I = false;
        }
    }

    public void O(int i2) {
        P(c0(i2, true), true);
    }

    public void P(o oVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || oVar.a != 0 || (c0Var = this.l) == null || !c0Var.b()) {
            WindowManager windowManager = (WindowManager) this.e.getSystemService(C0201.m82(4645));
            if (!(windowManager == null || !oVar.o || (viewGroup = oVar.g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    L(oVar.a, oVar, null);
                }
            }
            oVar.m = false;
            oVar.n = false;
            oVar.o = false;
            oVar.h = null;
            oVar.q = true;
            if (this.K == oVar) {
                this.K = null;
                return;
            }
            return;
        }
        M(oVar.j);
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z3 = false;
        if (this.c0 == null) {
            String string = this.e.obtainStyledAttributes(defpackage.m.AppCompatTheme).getString(defpackage.m.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.c0 = new AppCompatViewInflater();
            } else {
                try {
                    this.c0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i(b, c + string + a, th);
                    this.c0 = new AppCompatViewInflater();
                }
            }
        }
        if (e0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = D0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.c0.q(view, str, context, attributeSet, z2, e0, true, c1.c());
    }

    public void S() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.i();
        }
        if (this.q != null) {
            this.f.getDecorView().removeCallbacks(this.u);
            if (this.q.isShowing()) {
                try {
                    this.q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.q = null;
        }
        V();
        o c02 = c0(0, false);
        if (c02 != null && (gVar = c02.j) != null) {
            gVar.close();
        }
    }

    public boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.d;
        boolean z2 = true;
        if (((obj instanceof v2.a) || (obj instanceof g)) && (decorView = this.f.getDecorView()) != null && v2.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? o0(keyCode, keyEvent) : r0(keyCode, keyEvent);
    }

    public void U(int i2) {
        o c02;
        o c03 = c0(i2, true);
        if (c03.j != null) {
            Bundle bundle = new Bundle();
            c03.j.Q(bundle);
            if (bundle.size() > 0) {
                c03.s = bundle;
            }
            c03.j.d0();
            c03.j.clear();
        }
        c03.r = true;
        c03.q = true;
        if ((i2 == 108 || i2 == 0) && this.l != null && (c02 = c0(0, false)) != null) {
            c02.m = false;
            z0(c02, null);
        }
    }

    public void V() {
        p3 p3Var = this.v;
        if (p3Var != null) {
            p3Var.b();
        }
    }

    public o Y(Menu menu) {
        o[] oVarArr = this.J;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            o oVar = oVarArr[i2];
            if (oVar != null && oVar.j == menu) {
                return oVar;
            }
        }
        return null;
    }

    public final Context Z() {
        a k2 = k();
        Context k3 = k2 != null ? k2.k() : null;
        return k3 == null ? this.e : k3;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        o Y2;
        Window.Callback e02 = e0();
        if (e02 == null || this.P || (Y2 = Y(gVar.D())) == null) {
            return false;
        }
        return e02.onMenuItemSelected(Y2.a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        A0(gVar, true);
    }

    public final l b0() {
        if (this.U == null) {
            this.U = new m(k.a(this.e));
        }
        return this.U;
    }

    @Override // androidx.appcompat.app.e
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.y.findViewById(16908290)).addView(view, layoutParams);
        this.g.a().onContentChanged();
    }

    public o c0(int i2, boolean z2) {
        o[] oVarArr = this.J;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[(i2 + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.J = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(i2);
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    @Override // androidx.appcompat.app.e
    public void d(Context context) {
        H(false);
        this.M = true;
    }

    public final CharSequence d0() {
        Object obj = this.d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.k;
    }

    public final Window.Callback e0() {
        return this.f.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T g(int i2) {
        W();
        return (T) this.f.findViewById(i2);
    }

    @Override // androidx.appcompat.app.e
    public int i() {
        return this.Q;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater j() {
        if (this.j == null) {
            f0();
            a aVar = this.i;
            this.j = new b0(aVar != null ? aVar.k() : this.e);
        }
        return this.j;
    }

    @Override // androidx.appcompat.app.e
    public a k() {
        f0();
        return this.i;
    }

    @Override // androidx.appcompat.app.e
    public void l() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            w2.b(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i(C0201.m82(4646), C0201.m82(4647));
        }
    }

    public boolean l0() {
        return this.w;
    }

    @Override // androidx.appcompat.app.e
    public void m() {
        a k2 = k();
        if (k2 == null || !k2.l()) {
            j0(0);
        }
    }

    public int m0(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 == -1) {
            return i2;
        }
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return i2;
            }
            if (i2 == 3) {
                return a0().c();
            }
            throw new IllegalStateException(C0201.m82(4648));
        } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) this.e.getSystemService(UiModeManager.class)).getNightMode() != 0) {
            return b0().c();
        } else {
            return -1;
        }
    }

    public boolean n0() {
        w wVar = this.o;
        if (wVar != null) {
            wVar.c();
            return true;
        }
        a k2 = k();
        if (k2 == null || !k2.h()) {
            return false;
        }
        return true;
    }

    public boolean o0(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.L = z2;
        } else if (i2 == 82) {
            p0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p(Configuration configuration) {
        a k2;
        if (this.D && this.x && (k2 = k()) != null) {
            k2.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.e);
        H(false);
    }

    @Override // androidx.appcompat.app.e
    public void q(Bundle bundle) {
        this.M = true;
        H(false);
        X();
        Object obj = this.d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a x0 = x0();
                if (x0 == null) {
                    this.Z = true;
                } else {
                    x0.r(true);
                }
            }
        }
        this.N = true;
    }

    public boolean q0(int i2, KeyEvent keyEvent) {
        a k2 = k();
        if (k2 != null && k2.o(i2, keyEvent)) {
            return true;
        }
        o oVar = this.K;
        if (oVar == null || !y0(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.K == null) {
                o c02 = c0(0, true);
                z0(c02, keyEvent);
                boolean y0 = y0(c02, keyEvent.getKeyCode(), keyEvent, 1);
                c02.m = false;
                if (y0) {
                    return true;
                }
            }
            return false;
        }
        o oVar2 = this.K;
        if (oVar2 != null) {
            oVar2.n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.e
    public void r() {
        e.o(this);
        if (this.W) {
            this.f.getDecorView().removeCallbacks(this.Y);
        }
        this.O = false;
        this.P = true;
        a aVar = this.i;
        if (aVar != null) {
            aVar.n();
        }
        N();
    }

    public boolean r0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.L;
            this.L = false;
            o c02 = c0(0, false);
            if (c02 != null && c02.o) {
                if (!z2) {
                    P(c02, true);
                }
                return true;
            } else if (n0()) {
                return true;
            }
        } else if (i2 == 82) {
            s0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void s(Bundle bundle) {
        W();
    }

    @Override // androidx.appcompat.app.e
    public void t() {
        a k2 = k();
        if (k2 != null) {
            k2.t(true);
        }
    }

    public void t0(int i2) {
        a k2;
        if (i2 == 108 && (k2 = k()) != null) {
            k2.i(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void u(Bundle bundle) {
        if (this.Q != -100) {
            d0.put(this.d.getClass(), Integer.valueOf(this.Q));
        }
    }

    public void u0(int i2) {
        if (i2 == 108) {
            a k2 = k();
            if (k2 != null) {
                k2.i(false);
            }
        } else if (i2 == 0) {
            o c02 = c0(i2, true);
            if (c02.o) {
                P(c02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        this.O = true;
        G();
        e.n(this);
    }

    public void v0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        this.O = false;
        e.o(this);
        a k2 = k();
        if (k2 != null) {
            k2.t(false);
        }
        if (this.d instanceof Dialog) {
            N();
        }
    }

    public final a x0() {
        return this.i;
    }

    @Override // androidx.appcompat.app.e
    public boolean y(int i2) {
        int B0 = B0(i2);
        if (this.H && B0 == 108) {
            return false;
        }
        if (this.D && B0 == 1) {
            this.D = false;
        }
        if (B0 == 1) {
            G0();
            this.H = true;
            return true;
        } else if (B0 == 2) {
            G0();
            this.B = true;
            return true;
        } else if (B0 == 5) {
            G0();
            this.C = true;
            return true;
        } else if (B0 == 10) {
            G0();
            this.F = true;
            return true;
        } else if (B0 == 108) {
            G0();
            this.D = true;
            return true;
        } else if (B0 != 109) {
            return this.f.requestFeature(B0);
        } else {
            G0();
            this.E = true;
            return true;
        }
    }

    public f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private f(Context context, Window window, d dVar, Object obj) {
        Integer num;
        c H0;
        this.v = null;
        this.w = true;
        this.Q = -100;
        this.Y = new b();
        this.e = context;
        this.h = dVar;
        this.d = obj;
        if (this.Q == -100 && (obj instanceof Dialog) && (H0 = H0()) != null) {
            this.Q = H0.A().i();
        }
        if (this.Q == -100 && (num = d0.get(this.d.getClass())) != null) {
            this.Q = num.intValue();
            d0.remove(this.d.getClass());
        }
        if (window != null) {
            J(window);
        }
        androidx.appcompat.widget.j.h();
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl */
    public class j extends d0 {
        public j(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            a0.a aVar = new a0.a(f.this.e, callback);
            w E0 = f.this.E0(aVar);
            if (E0 != null) {
                return aVar.e(E0);
            }
            return null;
        }

        @Override // defpackage.d0
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // defpackage.d0
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.q0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // defpackage.d0
        public void onContentChanged() {
        }

        @Override // defpackage.d0
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // defpackage.d0
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f.this.t0(i);
            return true;
        }

        @Override // defpackage.d0
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f.this.u0(i);
        }

        @Override // defpackage.d0
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // defpackage.d0, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            o c0 = f.this.c0(0, true);
            if (c0 == null || (gVar = c0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // defpackage.d0
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (f.this.l0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // defpackage.d0
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!f.this.l0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return b(callback);
        }
    }
}
