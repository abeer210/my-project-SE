package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.z3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: w3  reason: default package */
/* compiled from: AccessibilityNodeInfoCompat */
public class w3 {
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    /* renamed from: w3$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(16, null);
        public static final a h = new a(32, null);
        public static final a i = new a(4096, null);
        public static final a j = new a(8192, null);
        public static final a k = new a(262144, null);
        public static final a l = new a(524288, null);
        public static final a m = new a(1048576, null);
        public static final a n = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, z3.f.class);
        public final Object a;
        private final int b;
        private final Class<? extends z3.a> c;
        public final z3 d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, null);
            new a(8, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, z3.b.class);
            new a(512, null, z3.b.class);
            new a(1024, null, z3.c.class);
            new a(2048, null, z3.c.class);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, z3.g.class);
            new a(2097152, null, z3.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, z3.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, z3.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, z3 z3Var) {
            return new a(null, this.b, charSequence, z3Var, this.c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
        public boolean c(View view, Bundle bundle) {
            Exception e2;
            Class<? extends z3.a> cls;
            String str;
            if (this.d == null) {
                return false;
            }
            z3.a aVar = null;
            Class<? extends z3.a> cls2 = this.c;
            if (cls2 != null) {
                try {
                    z3.a aVar2 = (z3.a) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVar2.a(bundle);
                        aVar = aVar2;
                    } catch (Exception e3) {
                        e2 = e3;
                        aVar = aVar2;
                        cls = this.c;
                        if (cls != null) {
                        }
                        Log.e(C0201.m82(33541), C0201.m82(33540) + str, e2);
                        return this.d.a(view, aVar);
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    cls = this.c;
                    if (cls != null) {
                        str = C0201.m82(33539);
                    } else {
                        str = cls.getName();
                    }
                    Log.e(C0201.m82(33541), C0201.m82(33540) + str, e2);
                    return this.d.a(view, aVar);
                }
            }
            return this.d.a(view, aVar);
        }

        private a(int i2, CharSequence charSequence, Class<? extends z3.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, z3 z3Var, Class<? extends z3.a> cls) {
            this.b = i2;
            this.d = z3Var;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.a = obj;
            } else {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.c = cls;
        }
    }

    /* renamed from: w3$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new b(null);
        }
    }

    /* renamed from: w3$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new c(null);
        }

        public static c b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new c(null);
        }
    }

    /* renamed from: w3$d */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class d {
        public final Object a;

        public d(Object obj) {
            this.a = obj;
        }

        public static d a(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new d(null);
        }
    }

    private w3(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static w3 B0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new w3(accessibilityNodeInfo);
    }

    public static w3 M() {
        return B0(AccessibilityNodeInfo.obtain());
    }

    public static w3 N(View view) {
        return B0(AccessibilityNodeInfo.obtain(view));
    }

    public static w3 O(w3 w3Var) {
        return B0(AccessibilityNodeInfo.obtain(w3Var.a));
    }

    private void S(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        if (u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < u.size(); i++) {
                if (u.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                u.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void U(int i, boolean z) {
        Bundle r = r();
        if (r != null) {
            String r1 = C0201.m82(10670);
            int i2 = r.getInt(r1, 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            r.putInt(r1, i | i2);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h(C0201.m82(10671)).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h(C0201.m82(10672)).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h(C0201.m82(10673)).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h(C0201.m82(10674)).add(Integer.valueOf(i));
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove(C0201.m82(10675));
            this.a.getExtras().remove(C0201.m82(10676));
            this.a.getExtras().remove(C0201.m82(10677));
            this.a.getExtras().remove(C0201.m82(10678));
        }
    }

    private List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i) {
        if (i == 1) {
            return C0201.m82(10697);
        }
        if (i == 2) {
            return C0201.m82(10696);
        }
        switch (i) {
            case 4:
                return C0201.m82(10695);
            case 8:
                return C0201.m82(10694);
            case 16:
                return C0201.m82(10693);
            case 32:
                return C0201.m82(10692);
            case 64:
                return C0201.m82(10691);
            case 128:
                return C0201.m82(10690);
            case 256:
                return C0201.m82(10689);
            case 512:
                return C0201.m82(10688);
            case 1024:
                return C0201.m82(10687);
            case 2048:
                return C0201.m82(10686);
            case 4096:
                return C0201.m82(10685);
            case 8192:
                return C0201.m82(10684);
            case 16384:
                return C0201.m82(10683);
            case 32768:
                return C0201.m82(10682);
            case 65536:
                return C0201.m82(10681);
            case 131072:
                return C0201.m82(10680);
            default:
                return C0201.m82(10679);
        }
    }

    private boolean k(int i) {
        Bundle r = r();
        if (r != null && (r.getInt(C0201.m82(10698), 0) & i) == i) {
            return true;
        }
        return false;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        if (u != null) {
            return u;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(e1.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(e1.tag_accessibility_clickable_spans);
    }

    private boolean x() {
        return !h(C0201.m82(10699)).isEmpty();
    }

    private int y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public boolean A() {
        return this.a.isCheckable();
    }

    public AccessibilityNodeInfo A0() {
        return this.a;
    }

    public boolean B() {
        return this.a.isChecked();
    }

    public boolean C() {
        return this.a.isClickable();
    }

    public boolean D() {
        return this.a.isEnabled();
    }

    public boolean E() {
        return this.a.isFocusable();
    }

    public boolean F() {
        return this.a.isFocused();
    }

    public boolean G() {
        return this.a.isLongClickable();
    }

    public boolean H() {
        return this.a.isPassword();
    }

    public boolean I() {
        return this.a.isScrollable();
    }

    public boolean J() {
        return this.a.isSelected();
    }

    public boolean K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.isShowingHintText();
        }
        return k(4);
    }

    public boolean L() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.isVisibleToUser();
        }
        return false;
    }

    public boolean P(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(i, bundle);
        }
        return false;
    }

    public void Q() {
        this.a.recycle();
    }

    public boolean R(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
        return false;
    }

    public void T(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(z);
        }
    }

    public void V(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void W(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void X(boolean z) {
        this.a.setCheckable(z);
    }

    public void Y(boolean z) {
        this.a.setChecked(z);
    }

    public void Z(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(boolean z) {
        this.a.setClickable(z);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
    }

    public void b0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a);
        }
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public void c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
        }
    }

    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.addChild(view, i);
        }
    }

    public void d0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void e0(boolean z) {
        this.a.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w3.class != obj.getClass()) {
            return false;
        }
        w3 w3Var = (w3) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (w3Var.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(w3Var.a)) {
            return false;
        }
        return this.c == w3Var.c && this.b == w3Var.b;
    }

    public void f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            g();
            S(view);
            ClickableSpan[] p = p(charSequence);
            if (p != null && p.length > 0) {
                r().putInt(C0201.m82(10700), e1.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> s = s(view);
                int i2 = 0;
                while (p != null && i2 < p.length) {
                    int y = y(p[i2], s);
                    s.put(y, new WeakReference<>(p[i2]));
                    e(p[i2], (Spanned) charSequence, y);
                    i2++;
                }
            }
        }
    }

    public void f0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setError(charSequence);
        }
    }

    public void g0(boolean z) {
        this.a.setFocusable(z);
    }

    public void h0(boolean z) {
        this.a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            U(2, z);
        }
    }

    public int j() {
        return this.a.getActions();
    }

    public void j0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a.setHintText(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence(C0201.m82(10701), charSequence);
        }
    }

    public void k0(boolean z) {
        this.a.setLongClickable(z);
    }

    public void l(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void l0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setMaxTextLength(i);
        }
    }

    public void m(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void m0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public int n() {
        return this.a.getChildCount();
    }

    public void n0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence(C0201.m82(10702), charSequence);
        }
    }

    public CharSequence o() {
        return this.a.getClassName();
    }

    public void o0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public void p0(View view, int i) {
        this.b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setParent(view, i);
        }
    }

    public CharSequence q() {
        return this.a.getContentDescription();
    }

    public void q0(d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.a);
        }
    }

    public Bundle r() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.a.getExtras();
        }
        return new Bundle();
    }

    public void r0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence(C0201.m82(10703), charSequence);
        }
    }

    public void s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            U(1, z);
        }
    }

    public CharSequence t() {
        return this.a.getPackageName();
    }

    public void t0(boolean z) {
        this.a.setScrollable(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append(C0201.m82(10704) + rect);
        m(rect);
        sb.append(C0201.m82(10705) + rect);
        sb.append(C0201.m82(10706));
        sb.append(t());
        sb.append(C0201.m82(10707));
        sb.append(o());
        sb.append(C0201.m82(10708));
        sb.append(v());
        sb.append(C0201.m82(10709));
        sb.append(q());
        sb.append(C0201.m82(10710));
        sb.append(w());
        sb.append(C0201.m82(10711));
        sb.append(A());
        sb.append(C0201.m82(10712));
        sb.append(B());
        sb.append(C0201.m82(10713));
        sb.append(E());
        sb.append(C0201.m82(10714));
        sb.append(F());
        sb.append(C0201.m82(10715));
        sb.append(J());
        sb.append(C0201.m82(10716));
        sb.append(C());
        sb.append(C0201.m82(10717));
        sb.append(G());
        sb.append(C0201.m82(10718));
        sb.append(D());
        sb.append(C0201.m82(10719));
        sb.append(H());
        sb.append(C0201.m82(10720) + I());
        sb.append(C0201.m82(10721));
        int j = j();
        while (j != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j);
            j &= numberOfTrailingZeros ^ -1;
            sb.append(i(numberOfTrailingZeros));
            if (j != 0) {
                sb.append(C0201.m82(10722));
            }
        }
        sb.append(C0201.m82(10723));
        return sb.toString();
    }

    public void u0(boolean z) {
        this.a.setSelected(z);
    }

    public CharSequence v() {
        if (!x()) {
            return this.a.getText();
        }
        List<Integer> h = h(C0201.m82(10724));
        List<Integer> h2 = h(C0201.m82(10725));
        List<Integer> h3 = h(C0201.m82(10726));
        List<Integer> h4 = h(C0201.m82(10727));
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new u3(h4.get(i).intValue(), this, r().getInt(C0201.m82(10728))), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    public void v0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            U(4, z);
        }
    }

    public String w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public void w0(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public void x0(View view, int i) {
        this.c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSource(view, i);
        }
    }

    public void y0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean z() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.isAccessibilityFocused();
        }
        return false;
    }

    public void z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(z);
        }
    }
}
