package defpackage;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import defpackage.r2;
import defpackage.w3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: k3  reason: default package */
/* compiled from: ViewCompat */
public class k3 {
    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;
    private static WeakHashMap<View, String> e;
    private static WeakHashMap<View, p3> f = null;
    private static Field g;
    private static boolean h = false;
    private static ThreadLocal<Rect> i;

    /* access modifiers changed from: package-private */
    /* renamed from: k3$a */
    /* compiled from: ViewCompat */
    public static class a implements View.OnApplyWindowInsetsListener {
        public final /* synthetic */ g3 a;

        public a(g3 g3Var) {
            this.a = g3Var;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) t3.g(this.a.a(view, t3.h(windowInsets)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3$b */
    /* compiled from: ViewCompat */
    public static class b extends f<Boolean> {
        public b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3$c */
    /* compiled from: ViewCompat */
    public static class c extends f<CharSequence> {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3$d */
    /* compiled from: ViewCompat */
    public static class d extends f<Boolean> {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: k3$e */
    /* compiled from: ViewCompat */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    k3.S(view, 16);
                }
                this.a.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.a.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3$f */
    /* compiled from: ViewCompat */
    public static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;

        public f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                k3.z(view);
                view.setTag(this.a, t);
                k3.S(view, 0);
            }
        }

        public abstract boolean h(T t, T t2);

        public f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.c = i3;
        }
    }

    /* renamed from: k3$g */
    /* compiled from: ViewCompat */
    public interface g {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* renamed from: k3$h */
    /* compiled from: ViewCompat */
    static class h {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        public static h a(View view) {
            h hVar = (h) view.getTag(e1.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            view.setTag(e1.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(e1.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((g) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!d.isEmpty()) {
                synchronized (d) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = d.size() - 1; size >= 0; size--) {
                        View view = d.get(size).get();
                        if (view == null) {
                            d.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c2));
                }
            }
            return c2 != null;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && k3.M(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new e();
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    private static void A0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static ViewParent C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static String D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static float E(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    public static int F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean H(View view) {
        return j(view) != null;
    }

    public static boolean I(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean J(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean L(View view) {
        Boolean f2 = a().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    public static boolean M(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean N(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    public static boolean O(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof a3) {
            return ((a3) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean R(View view) {
        Boolean f2 = g0().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    public static void S(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService(C0201.m82(23024))).isEnabled()) {
            boolean z = l(view) != null;
            if (k(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e(C0201.m82(23026), view.getParent().getClass().getSimpleName() + C0201.m82(23025), e2);
                }
            }
        }
    }

    public static void T(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect s = s();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i2);
            if (z && s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(s);
            }
        } else {
            d(view, i2);
        }
    }

    public static void U(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect s = s();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            e(view, i2);
            if (z && s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(s);
            }
        } else {
            e(view, i2);
        }
    }

    public static t3 V(View view, t3 t3Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return t3Var;
        }
        WindowInsets windowInsets = (WindowInsets) t3.g(t3Var);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return t3.h(windowInsets);
    }

    public static void W(View view, w3 w3Var) {
        view.onInitializeAccessibilityNodeInfo(w3Var.A0());
    }

    private static f<CharSequence> X() {
        return new c(e1.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean Y(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static void Z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    private static f<Boolean> a() {
        return new d(e1.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void a0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    private static void b(View view, w3.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            z(view);
            d0(aVar.b(), view);
            m(view).add(aVar);
            S(view, 0);
        }
    }

    public static void b0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static p3 c(View view) {
        if (f == null) {
            f = new WeakHashMap<>();
        }
        p3 p3Var = f.get(view);
        if (p3Var != null) {
            return p3Var;
        }
        p3 p3Var2 = new p3(view);
        f.put(view, p3Var2);
        return p3Var2;
    }

    public static void c0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            d0(i2, view);
            S(view, 0);
        }
    }

    private static void d(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            A0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                A0((View) parent);
            }
        }
    }

    private static void d0(int i2, View view) {
        List<w3.a> m = m(view);
        for (int i3 = 0; i3 < m.size(); i3++) {
            if (m.get(i3).b() == i2) {
                m.remove(i3);
                return;
            }
        }
    }

    private static void e(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            A0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                A0((View) parent);
            }
        }
    }

    public static void e0(View view, w3.a aVar, CharSequence charSequence, z3 z3Var) {
        b(view, aVar.a(charSequence, z3Var));
    }

    public static t3 f(View view, t3 t3Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return t3Var;
        }
        WindowInsets windowInsets = (WindowInsets) t3.g(t3Var);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return t3.h(windowInsets);
    }

    public static void f0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).b(view, keyEvent);
    }

    private static f<Boolean> g0() {
        return new b(e1.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).f(keyEvent);
    }

    public static void h0(View view, r2 r2Var) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2Var == null && (j(view) instanceof r2.a)) {
            r2Var = new r2();
        }
        if (r2Var == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = r2Var.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static r2 i(View view) {
        View.AccessibilityDelegate j = j(view);
        if (j == null) {
            return null;
        }
        if (j instanceof r2.a) {
            return ((r2.a) j).a;
        }
        return new r2(j);
    }

    public static void i0(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    private static View.AccessibilityDelegate j(View view) {
        if (h) {
            return null;
        }
        if (g == null) {
            try {
                Field declaredField = View.class.getDeclaredField(C0201.m82(23027));
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                h = true;
                return null;
            }
        }
        try {
            Object obj = g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            h = true;
            return null;
        }
    }

    public static void j0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void k0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static CharSequence l(View view) {
        return X().f(view);
    }

    public static void l0(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof j3) {
            ((j3) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    private static List<w3.a> m(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(e1.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(e1.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void m0(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof j3) {
            ((j3) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static ColorStateList n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof j3) {
            return ((j3) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void n0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static PorterDuff.Mode o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof j3) {
            return ((j3) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void o0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static Rect p(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void p0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static Display q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (M(view)) {
            return ((WindowManager) view.getContext().getSystemService(C0201.m82(23028))).getDefaultDisplay();
        }
        return null;
    }

    public static void q0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static float r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void r0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    private static Rect s() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = i.get();
        if (rect == null) {
            rect = new Rect();
            i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void s0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof a3) {
            ((a3) view).setNestedScrollingEnabled(z);
        }
    }

    public static boolean t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void t0(View view, g3 g3Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (g3Var == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(g3Var));
        }
    }

    public static int u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void u0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int v(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void v0(View view, i3 i3Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (i3Var != null ? i3Var.a() : null));
        }
    }

    public static int w(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static void w0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField(C0201.m82(23029));
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void x0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (e == null) {
            e = new WeakHashMap<>();
        }
        e.put(view, str);
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField(C0201.m82(23030));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static void y0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f2);
        }
    }

    public static r2 z(View view) {
        r2 i2 = i(view);
        if (i2 == null) {
            i2 = new r2();
        }
        h0(view, i2);
        return i2;
    }

    public static void z0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof a3) {
            ((a3) view).stopNestedScroll();
        }
    }
}
