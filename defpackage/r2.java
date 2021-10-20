package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import defpackage.w3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: r2  reason: default package */
/* compiled from: AccessibilityDelegateCompat */
public class r2 {
    private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;

    /* access modifiers changed from: package-private */
    /* renamed from: r2$a */
    /* compiled from: AccessibilityDelegateCompat */
    public static final class a extends View.AccessibilityDelegate {
        public final r2 a;

        public a(r2 r2Var) {
            this.a = r2Var;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            x3 b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.d();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            w3 B0 = w3.B0(accessibilityNodeInfo);
            B0.s0(k3.R(view));
            B0.i0(k3.L(view));
            B0.n0(k3.l(view));
            this.a.g(view, B0);
            B0.f(accessibilityNodeInfo.getText(), view);
            List<w3.a> c = r2.c(view);
            for (int i = 0; i < c.size(); i++) {
                B0.b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.a.l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public r2() {
        this(c);
    }

    public static List<w3.a> c(View view) {
        List<w3.a> list = (List) view.getTag(e1.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p = w3.p(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (p != null && i < p.length) {
                if (clickableSpan.equals(p[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(e1.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public x3 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new x3(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, w3 w3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, w3Var.A0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List<w3.a> c2 = c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c2.size()) {
                break;
            }
            w3.a aVar = c2.get(i2);
            if (aVar.b() == i) {
                z = aVar.c(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != e1.accessibility_action_clickable_span) ? z : k(bundle.getInt(C0201.m82(37618), -1), view);
    }

    public void l(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public r2(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }
}
