package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x3  reason: default package */
/* compiled from: AccessibilityNodeProviderCompat */
public class x3 {
    private final Object a;

    /* renamed from: x3$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class a extends AccessibilityNodeProvider {
        public final x3 a;

        public a(x3 x3Var) {
            this.a = x3Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            w3 a2 = this.a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.A0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<w3> b = this.a.b(str, i);
            if (b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(b.get(i2).A0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.e(i, i2, bundle);
        }
    }

    /* renamed from: x3$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class b extends a {
        public b(x3 x3Var) {
            super(x3Var);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            w3 c = this.a.c(i);
            if (c == null) {
                return null;
            }
            return c.A0();
        }
    }

    public x3() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.a = new b(this);
        } else if (i >= 16) {
            this.a = new a(this);
        } else {
            this.a = null;
        }
    }

    public w3 a(int i) {
        return null;
    }

    public List<w3> b(String str, int i) {
        return null;
    }

    public w3 c(int i) {
        return null;
    }

    public Object d() {
        return this.a;
    }

    public boolean e(int i, int i2, Bundle bundle) {
        return false;
    }

    public x3(Object obj) {
        this.a = obj;
    }
}
