package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.systrace.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: NativeViewHierarchyManager */
public class m {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    private static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final SparseArray<View> a;
    private final SparseArray<ViewManager> b;
    private final SparseBooleanArray c;
    private final a1 d;
    private final tj0 e;
    private final RootViewManager f;
    private final fk0 g;
    private final RectF h;
    private boolean i;
    private PopupMenu j;
    private HashMap<Integer, Set<Integer>> k;

    /* compiled from: NativeViewHierarchyManager */
    class a implements gk0 {
        public final /* synthetic */ ViewGroupManager a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ View c;
        public final /* synthetic */ Set d;
        public final /* synthetic */ int e;

        public a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i) {
            this.a = viewGroupManager;
            this.b = viewGroup;
            this.c = view;
            this.d = set;
            this.e = i;
        }

        @Override // defpackage.gk0
        public void onAnimationEnd() {
            UiThreadUtil.assertOnUiThread();
            this.a.removeView(this.b, this.c);
            m.this.n(this.c);
            this.d.remove(Integer.valueOf(this.c.getId()));
            if (this.d.isEmpty()) {
                m.this.k.remove(Integer.valueOf(this.e));
            }
        }
    }

    /* compiled from: NativeViewHierarchyManager */
    private static class b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {
        public final Callback a;
        public boolean b;

        public /* synthetic */ b(Callback callback, a aVar) {
            this(callback);
        }

        public void onDismiss(PopupMenu popupMenu) {
            if (!this.b) {
                this.a.invoke(C0201.m82(14539));
                this.b = true;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.b) {
                return false;
            }
            this.a.invoke(C0201.m82(14540), Integer.valueOf(menuItem.getOrder()));
            this.b = true;
            return true;
        }

        private b(Callback callback) {
            this.b = false;
            this.a = callback;
        }
    }

    static {
        C0201.m83(m.class, 72);
    }

    public m(a1 a1Var) {
        this(a1Var, new RootViewManager());
    }

    private void D(View view, int i2, int i3, int i4, int i5) {
        if (!this.i || !this.g.h(view)) {
            view.layout(i2, i3, i4 + i2, i5 + i3);
        } else {
            this.g.b(view, i2, i3, i4, i5);
        }
    }

    private boolean d(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void g(View view, int[] iArr) {
        this.h.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        s(view, this.h);
        iArr[0] = Math.round(this.h.left);
        iArr[1] = Math.round(this.h.top);
        RectF rectF = this.h;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.h;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String i(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, w0[] w0VarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        String r1 = C0201.m82(23535);
        String r2 = C0201.m82(23536);
        String r3 = C0201.m82(23537);
        String r4 = C0201.m82(23538);
        if (viewGroup != null) {
            sb.append(C0201.m82(23539) + viewGroup.getId() + r4);
            sb.append(C0201.m82(23540) + viewGroupManager.getChildCount(viewGroup) + r3);
            for (int i2 = 0; i2 < viewGroupManager.getChildCount(viewGroup); i2 += 16) {
                int i3 = 0;
                while (true) {
                    int i4 = i2 + i3;
                    if (i4 >= viewGroupManager.getChildCount(viewGroup) || i3 >= 16) {
                        sb.append(r4);
                    } else {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i4).getId() + r2);
                        i3++;
                    }
                }
                sb.append(r4);
            }
            sb.append(r1);
        }
        if (iArr != null) {
            sb.append(C0201.m82(23541) + iArr.length + r3);
            for (int i5 = 0; i5 < iArr.length; i5 += 16) {
                int i6 = 0;
                while (true) {
                    int i7 = i5 + i6;
                    if (i7 >= iArr.length || i6 >= 16) {
                        sb.append(r4);
                    } else {
                        sb.append(iArr[i7] + r2);
                        i6++;
                    }
                }
                sb.append(r4);
            }
            sb.append(r1);
        }
        if (w0VarArr != null) {
            sb.append(C0201.m82(23542) + w0VarArr.length + r3);
            for (int i8 = 0; i8 < w0VarArr.length; i8 += 16) {
                int i9 = 0;
                while (true) {
                    int i10 = i8 + i9;
                    if (i10 >= w0VarArr.length || i9 >= 16) {
                        sb.append(r4);
                    } else {
                        sb.append(C0201.m82(23543) + w0VarArr[i10].b + r2 + w0VarArr[i10].a + C0201.m82(23544));
                        i9++;
                    }
                }
                sb.append(r4);
            }
            sb.append(r1);
        }
        if (iArr2 != null) {
            sb.append(C0201.m82(23545) + iArr2.length + r3);
            for (int i11 = 0; i11 < iArr2.length; i11 += 16) {
                int i12 = 0;
                while (true) {
                    int i13 = i11 + i12;
                    if (i13 >= iArr2.length || i12 >= 16) {
                        sb.append(r4);
                    } else {
                        sb.append(iArr2[i13] + r2);
                        i12++;
                    }
                }
                sb.append(r4);
            }
            sb.append(C0201.m82(23546));
        }
        return sb.toString();
    }

    private Set<Integer> p(int i2) {
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        if (!this.k.containsKey(Integer.valueOf(i2))) {
            this.k.put(Integer.valueOf(i2), new HashSet());
        }
        return this.k.get(Integer.valueOf(i2));
    }

    private k0 q(int i2) {
        View view = this.a.get(i2);
        if (view != null) {
            return (k0) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(23547) + i2);
    }

    private void s(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset((float) view2.getLeft(), (float) view2.getTop());
            parent = view2.getParent();
        }
    }

    public void A(boolean z2) {
        this.i = z2;
    }

    public synchronized void B(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i2);
        if (view == null) {
            callback2.invoke(C0201.m82(23548) + i2);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(q(i2), view);
        this.j = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (int i3 = 0; i3 < readableArray.size(); i3++) {
            menu.add(0, 0, i3, readableArray.getString(i3));
        }
        b bVar = new b(callback, null);
        this.j.setOnMenuItemClickListener(bVar);
        this.j.setOnDismissListener(bVar);
        this.j.show();
    }

    public synchronized void C(int i2, int i3, int i4, int i5, int i6, int i7) {
        UiThreadUtil.assertOnUiThread();
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, o);
        a2.a(w, i2);
        a2.a(D, i3);
        a2.c();
        try {
            View w2 = w(i3);
            w2.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            ViewParent parent = w2.getParent();
            if (parent instanceof f0) {
                parent.requestLayout();
            }
            if (!this.c.get(i2)) {
                ViewManager viewManager = this.b.get(i2);
                if (viewManager instanceof f) {
                    f fVar = (f) viewManager;
                    if (fVar != null && !fVar.needsCustomLayoutForChildren()) {
                        D(w2, i4, i5, i6, i7);
                    }
                } else {
                    throw new g(n + i2 + A);
                }
            } else {
                D(w2, i4, i5, i6, i7);
            }
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    public synchronized void E(int i2, c0 c0Var) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager x2 = x(i2);
            View w2 = w(i2);
            if (c0Var != null) {
                x2.updateProperties(w2, c0Var);
            }
        } catch (g e2) {
            String str = l;
            f60.j(str, C0201.m82(23549) + i2, e2);
        }
    }

    public synchronized void F(int i2, Object obj) {
        UiThreadUtil.assertOnUiThread();
        x(i2).updateExtraData(w(i2), obj);
    }

    public synchronized void b(int i2, View view) {
        c(i2, view);
    }

    public final synchronized void c(int i2, View view) {
        if (view.getId() != -1) {
            String str = l;
            f60.i(str, C0201.m82(23550) + view.getId() + C0201.m82(23551));
        }
        this.a.put(i2, view);
        this.b.put(i2, this.f);
        this.c.put(i2, true);
        view.setId(i2);
    }

    public void e() {
        this.e.b();
    }

    public void f() {
        this.g.f();
    }

    public void h(ReadableMap readableMap, Callback callback) {
        this.g.e(readableMap, callback);
    }

    public synchronized void j(k0 k0Var, int i2, String str, c0 c0Var) {
        UiThreadUtil.assertOnUiThread();
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(23552));
        a2.a(C0201.m82(23553), i2);
        a2.b(C0201.m82(23554), str);
        a2.c();
        try {
            ViewManager a3 = this.d.a(str);
            View createView = a3.createView(k0Var, null, null, this.e);
            this.a.put(i2, createView);
            this.b.put(i2, a3);
            createView.setId(i2);
            if (c0Var != null) {
                a3.updateProperties(createView, c0Var);
            }
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    public void k() {
        PopupMenu popupMenu = this.j;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    @Deprecated
    public synchronized void l(int i2, int i3, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i2);
        if (view != null) {
            x(i2).receiveCommand(view, i3, readableArray);
        } else {
            throw new RetryableMountingLayerException(C0201.m82(23555) + i2 + C0201.m82(23556) + i3);
        }
    }

    public synchronized void m(int i2, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i2);
        if (view != null) {
            x(i2).receiveCommand(view, str, readableArray);
        } else {
            throw new RetryableMountingLayerException(C0201.m82(23557) + i2 + C0201.m82(23558) + str);
        }
    }

    public synchronized void n(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            if (this.b.get(view.getId()) != null) {
                if (!this.c.get(view.getId())) {
                    x(view.getId()).onDropViewInstance(view);
                }
                ViewManager viewManager = this.b.get(view.getId());
                if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                        View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                        if (childAt == null) {
                            f60.i(l, C0201.m82(23559));
                        } else if (this.a.get(childAt.getId()) != null) {
                            n(childAt);
                        }
                    }
                    viewGroupManager.removeAllViews(viewGroup);
                }
                this.a.remove(view.getId());
                this.b.remove(view.getId());
            }
        }
    }

    public synchronized int o(int i2, float f2, float f3) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.a.get(i2);
        if (view != null) {
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(23560) + i2);
        }
        return l0.c(f2, f3, (ViewGroup) view);
    }

    public synchronized void r(int i2, int[] iArr, w0[] w0VarArr, int[] iArr2) {
        int i3;
        int[] iArr3 = iArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            Set<Integer> p2 = p(i2);
            ViewGroup viewGroup = (ViewGroup) this.a.get(i2);
            ViewGroupManager viewGroupManager = (ViewGroupManager) x(i2);
            if (viewGroup != null) {
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr3 != null) {
                    int length = iArr3.length - 1;
                    while (length >= 0) {
                        int i4 = iArr3[length];
                        if (i4 < 0) {
                            throw new g(u + i4 + y + i2 + z + i(viewGroup, viewGroupManager, iArr3, w0VarArr, iArr2));
                        } else if (i4 >= viewGroupManager.getChildCount(viewGroup)) {
                            if (!this.c.get(i2) || viewGroupManager.getChildCount(viewGroup) != 0) {
                                throw new g(F + i4 + m + i2 + B + i(viewGroup, viewGroupManager, iArr3, w0VarArr, iArr2));
                            }
                            return;
                        } else if (i4 < childCount) {
                            View childAt = viewGroupManager.getChildAt(viewGroup, i4);
                            if (!this.i || !this.g.h(childAt) || !d(iArr2, childAt.getId())) {
                                viewGroupManager.removeViewAt(viewGroup, i4);
                            }
                            length--;
                            childCount = i4;
                        } else {
                            throw new g(q + i4 + t + i2 + E + i(viewGroup, viewGroupManager, iArr3, w0VarArr, iArr2));
                        }
                    }
                }
                if (iArr2 != null) {
                    int i5 = 0;
                    while (i5 < iArr2.length) {
                        int i6 = iArr2[i5];
                        View view = this.a.get(i6);
                        if (view != null) {
                            if (!this.i || !this.g.h(view)) {
                                i3 = i5;
                                n(view);
                            } else {
                                p2.add(Integer.valueOf(i6));
                                i3 = i5;
                                this.g.c(view, new a(viewGroupManager, viewGroup, view, p2, i2));
                            }
                            i5 = i3 + 1;
                            iArr3 = iArr;
                        } else {
                            throw new g(r + i6 + p + i(viewGroup, viewGroupManager, iArr, w0VarArr, iArr2));
                        }
                    }
                }
                if (w0VarArr != null) {
                    for (int i7 = 0; i7 < w0VarArr.length; i7++) {
                        w0 w0Var = w0VarArr[i7];
                        View view2 = this.a.get(w0Var.a);
                        if (view2 != null) {
                            int i8 = w0Var.b;
                            if (!p2.isEmpty()) {
                                i8 = 0;
                                int i9 = 0;
                                while (i8 < viewGroup.getChildCount() && i9 != w0Var.b) {
                                    if (!p2.contains(Integer.valueOf(viewGroup.getChildAt(i8).getId()))) {
                                        i9++;
                                    }
                                    i8++;
                                }
                            }
                            viewGroupManager.addView(viewGroup, view2, i8);
                        } else {
                            throw new g(v + w0Var.a + C + i(viewGroup, viewGroupManager, iArr3, w0VarArr, iArr2));
                        }
                    }
                }
                if (p2.isEmpty()) {
                    this.k.remove(Integer.valueOf(i2));
                }
                return;
            }
            throw new g(s + i2 + x + i(viewGroup, viewGroupManager, iArr3, w0VarArr, iArr2));
        }
    }

    public synchronized void t(int i2, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i2);
        if (view != null) {
            View view2 = (View) g0.a(view);
            if (view2 != null) {
                g(view2, iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                g(view, iArr);
                iArr[0] = iArr[0] - i3;
                iArr[1] = iArr[1] - i4;
            } else {
                throw new o(C0201.m82(23561) + i2 + C0201.m82(23562));
            }
        } else {
            throw new o(C0201.m82(23563) + i2 + C0201.m82(23564));
        }
    }

    public synchronized void u(int i2, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.a.get(i2);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier(C0201.m82(23565), C0201.m82(23566), C0201.m82(23567));
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            throw new o(C0201.m82(23568) + i2 + C0201.m82(23569));
        }
    }

    public synchronized void v(int i2) {
        UiThreadUtil.assertOnUiThread();
        if (!this.c.get(i2)) {
            SoftAssertions.assertUnreachable(C0201.m82(23570) + i2 + C0201.m82(23571));
        }
        n(this.a.get(i2));
        this.c.delete(i2);
    }

    public final synchronized View w(int i2) {
        View view;
        view = this.a.get(i2);
        if (view == null) {
            throw new g(C0201.m82(23572) + i2 + C0201.m82(23573));
        }
        return view;
    }

    public final synchronized ViewManager x(int i2) {
        ViewManager viewManager;
        viewManager = this.b.get(i2);
        if (viewManager == null) {
            throw new g(C0201.m82(23574) + i2 + C0201.m82(23575));
        }
        return viewManager;
    }

    public void y(int i2, int i3) {
        View view = this.a.get(i2);
        if (view != null) {
            view.sendAccessibilityEvent(i3);
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(23576) + i2);
    }

    public synchronized void z(int i2, int i3, boolean z2) {
        if (!z2) {
            this.e.d(i3, null);
            return;
        }
        View view = this.a.get(i2);
        if (i3 == i2 || !(view instanceof ViewParent)) {
            if (this.c.get(i2)) {
                SoftAssertions.assertUnreachable(C0201.m82(23577) + i2 + C0201.m82(23578));
            }
            this.e.d(i3, view.getParent());
            return;
        }
        this.e.d(i3, (ViewParent) view);
    }

    public m(a1 a1Var, RootViewManager rootViewManager) {
        this.e = new tj0();
        this.g = new fk0();
        this.h = new RectF();
        this.d = a1Var;
        this.a = new SparseArray<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.f = rootViewManager;
    }
}
