package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import java.lang.reflect.Method;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ListPopupWindow */
public class j0 implements p {
    private static Method I;
    private static Method J;
    private static Method K;
    private final e A;
    private final d B;
    private final b C;
    public final Handler D;
    private final Rect E;
    private Rect F;
    private boolean G;
    public PopupWindow H;
    private Context a;
    private ListAdapter b;
    public f0 c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    public int o;
    private View p;
    private int q;
    private DataSetObserver u;
    private View v;
    private Drawable w;
    private AdapterView.OnItemClickListener x;
    private AdapterView.OnItemSelectedListener y;
    public final f z;

    /* access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            w30.n(view, i);
            if (i != -1) {
                try {
                    f0 f0Var = j0.this.c;
                    if (f0Var != null) {
                        f0Var.setListSelectionHidden(false);
                    }
                } catch (Throwable th) {
                    w30.o();
                    throw th;
                }
            }
            w30.o();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ListPopupWindow */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j0.this.r();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ListPopupWindow */
    public class c extends DataSetObserver {
        public c() {
        }

        public void onChanged() {
            if (j0.this.b()) {
                j0.this.a();
            }
        }

        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ListPopupWindow */
    public class d implements AbsListView.OnScrollListener {
        public d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !j0.this.A() && j0.this.H.getContentView() != null) {
                j0 j0Var = j0.this;
                j0Var.D.removeCallbacks(j0Var.z);
                j0.this.z.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ListPopupWindow */
    public class e implements View.OnTouchListener {
        public e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.H) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.H.getWidth() && y >= 0 && y < j0.this.H.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.D.postDelayed(j0Var.z, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.D.removeCallbacks(j0Var2.z);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ListPopupWindow */
    public class f implements Runnable {
        public f() {
        }

        public void run() {
            f0 f0Var = j0.this.c;
            if (f0Var != null && k3.M(f0Var) && j0.this.c.getCount() > j0.this.c.getChildCount()) {
                int childCount = j0.this.c.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.o) {
                    j0Var.H.setInputMethodMode(2);
                    j0.this.a();
                }
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        String r3 = C0201.m82(12272);
        if (i2 <= 28) {
            try {
                I = PopupWindow.class.getDeclaredMethod(C0201.m82(12273), Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(r3, C0201.m82(12274));
            }
            try {
                K = PopupWindow.class.getDeclaredMethod(C0201.m82(12275), Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(r3, C0201.m82(12276));
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                J = PopupWindow.class.getDeclaredMethod(C0201.m82(12277), View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i(r3, C0201.m82(12278));
            }
        }
    }

    public j0(Context context) {
        this(context, null, defpackage.d.listPopupWindowStyle);
    }

    private void C() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    private void N(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.H, Boolean.valueOf(z2));
                } catch (Exception unused) {
                    Log.i(C0201.m82(12279), C0201.m82(12280));
                }
            }
        } else {
            this.H.setIsClippedToScreen(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    private int q() {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2 = true;
        if (this.c == null) {
            Context context = this.a;
            f0 s = s(context, !this.G);
            this.c = s;
            Drawable drawable = this.w;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.x);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new a());
            this.c.setOnScrollListener(this.B);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.y;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            f0 f0Var = this.c;
            View view = this.p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i6 = this.q;
                if (i6 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(f0Var, layoutParams);
                } else if (i6 != 1) {
                    Log.e(C0201.m82(12282), C0201.m82(12281) + this.q);
                } else {
                    linearLayout.addView(f0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i7 = this.e;
                if (i7 >= 0) {
                    i5 = C0188.f23;
                } else {
                    i7 = 0;
                    i5 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i7, i5), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                f0Var = linearLayout;
            } else {
                i2 = 0;
            }
            this.H.setContentView(f0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.H.getContentView();
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.H.getBackground();
        if (background != null) {
            background.getPadding(this.E);
            Rect rect = this.E;
            int i8 = rect.top;
            i3 = rect.bottom + i8;
            if (!this.i) {
                this.g = -i8;
            }
        } else {
            this.E.setEmpty();
            i3 = 0;
        }
        if (this.H.getInputMethodMode() != 2) {
            z2 = false;
        }
        int u2 = u(t(), this.g, z2);
        if (this.m || this.d == -1) {
            return u2 + i3;
        }
        int i9 = this.e;
        if (i9 == -2) {
            int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.E;
            i4 = View.MeasureSpec.makeMeasureSpec(i10 - (rect2.left + rect2.right), C0188.f23);
        } else if (i9 != -1) {
            i4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            int i11 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.E;
            i4 = View.MeasureSpec.makeMeasureSpec(i11 - (rect3.left + rect3.right), 1073741824);
        }
        int d2 = this.c.d(i4, 0, -1, u2 - i2, -1);
        if (d2 > 0) {
            i2 += i3 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return d2 + i2;
    }

    private int u(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.H.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = J;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.H, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i(C0201.m82(12283), C0201.m82(12284));
            }
        }
        return this.H.getMaxAvailableHeight(view, i2);
    }

    public boolean A() {
        return this.H.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.G;
    }

    public void D(View view) {
        this.v = view;
    }

    public void E(int i2) {
        this.H.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.H.getBackground();
        if (background != null) {
            background.getPadding(this.E);
            Rect rect = this.E;
            this.e = rect.left + rect.right + i2;
            return;
        }
        Q(i2);
    }

    public void G(int i2) {
        this.l = i2;
    }

    public void H(Rect rect) {
        this.F = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.H.setInputMethodMode(i2);
    }

    public void J(boolean z2) {
        this.G = z2;
        this.H.setFocusable(z2);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.H.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.x = onItemClickListener;
    }

    public void M(boolean z2) {
        this.k = true;
        this.j = z2;
    }

    public void O(int i2) {
        this.q = i2;
    }

    public void P(int i2) {
        f0 f0Var = this.c;
        if (b() && f0Var != null) {
            f0Var.setListSelectionHidden(false);
            f0Var.setSelection(i2);
            if (f0Var.getChoiceMode() != 0) {
                f0Var.setItemChecked(i2, true);
            }
        }
    }

    public void Q(int i2) {
        this.e = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        int q2 = q();
        boolean A2 = A();
        h.b(this.H, this.h);
        boolean z2 = true;
        if (!this.H.isShowing()) {
            int i2 = this.e;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = t().getWidth();
            }
            int i3 = this.d;
            if (i3 == -1) {
                q2 = -1;
            } else if (i3 != -2) {
                q2 = i3;
            }
            this.H.setWidth(i2);
            this.H.setHeight(q2);
            N(true);
            this.H.setOutsideTouchable(!this.n && !this.m);
            this.H.setTouchInterceptor(this.A);
            if (this.k) {
                h.a(this.H, this.j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = K;
                if (method != null) {
                    try {
                        method.invoke(this.H, this.F);
                    } catch (Exception e2) {
                        Log.e(C0201.m82(12285), C0201.m82(12286), e2);
                    }
                }
            } else {
                this.H.setEpicenterBounds(this.F);
            }
            h.c(this.H, t(), this.f, this.g, this.l);
            this.c.setSelection(-1);
            if (!this.G || this.c.isInTouchMode()) {
                r();
            }
            if (!this.G) {
                this.D.post(this.C);
            }
        } else if (k3.M(t())) {
            int i4 = this.e;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = t().getWidth();
            }
            int i5 = this.d;
            if (i5 == -1) {
                if (!A2) {
                    q2 = -1;
                }
                if (A2) {
                    this.H.setWidth(this.e == -1 ? -1 : 0);
                    this.H.setHeight(0);
                } else {
                    this.H.setWidth(this.e == -1 ? -1 : 0);
                    this.H.setHeight(-1);
                }
            } else if (i5 != -2) {
                q2 = i5;
            }
            PopupWindow popupWindow = this.H;
            if (this.n || this.m) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.H.update(t(), this.f, this.g, i4 < 0 ? -1 : i4, q2 < 0 ? -1 : q2);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.H.isShowing();
    }

    public void c(Drawable drawable) {
        this.H.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.H.dismiss();
        C();
        this.H.setContentView(null);
        this.c = null;
        this.D.removeCallbacks(this.z);
    }

    public void f(int i2) {
        this.f = i2;
    }

    public Drawable i() {
        return this.H.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.c;
    }

    public void l(int i2) {
        this.g = i2;
        this.i = true;
    }

    public int o() {
        if (!this.i) {
            return 0;
        }
        return this.g;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.u;
        if (dataSetObserver == null) {
            this.u = new c();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        f0 f0Var = this.c;
        if (f0Var != null) {
            f0Var.setAdapter(this.b);
        }
    }

    public void r() {
        f0 f0Var = this.c;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    public f0 s(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public View t() {
        return this.v;
    }

    public Object v() {
        if (!b()) {
            return null;
        }
        return this.c.getSelectedItem();
    }

    public long w() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.c.getSelectedItemId();
    }

    public int x() {
        if (!b()) {
            return -1;
        }
        return this.c.getSelectedItemPosition();
    }

    public View y() {
        if (!b()) {
            return null;
        }
        return this.c.getSelectedView();
    }

    public int z() {
        return this.e;
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = C0188.f24;
        this.q = 0;
        this.z = new f();
        this.A = new e();
        this.B = new d();
        this.C = new b();
        this.E = new Rect();
        this.a = context;
        this.D = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ListPopupWindow, i2, i3);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(m.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(m.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.H = qVar;
        qVar.setInputMethodMode(1);
    }
}
