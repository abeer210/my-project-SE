package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import vigqyno.C0201;

/* compiled from: NativeViewHierarchyOptimizer */
public class n {
    private final v0 a;
    private final h0 b;
    private final SparseBooleanArray c = new SparseBooleanArray();

    /* access modifiers changed from: private */
    /* compiled from: NativeViewHierarchyOptimizer */
    public static class a {
        public final a0 a;
        public final int b;

        public a(a0 a0Var, int i) {
            this.a = a0Var;
            this.b = i;
        }
    }

    public n(v0 v0Var, h0 h0Var) {
        this.a = v0Var;
        this.b = h0Var;
    }

    private void a(a0 a0Var, a0 a0Var2, int i) {
        yh0.a(a0Var2.getNativeKind() != l.PARENT);
        for (int i2 = 0; i2 < a0Var2.getChildCount(); i2++) {
            a0 childAt = a0Var2.getChildAt(i2);
            yh0.a(childAt.getNativeParent() == null);
            int nativeChildCount = a0Var.getNativeChildCount();
            if (childAt.getNativeKind() == l.NONE) {
                d(a0Var, childAt, i);
            } else {
                b(a0Var, childAt, i);
            }
            i += a0Var.getNativeChildCount() - nativeChildCount;
        }
    }

    private void b(a0 a0Var, a0 a0Var2, int i) {
        a0Var.addNativeChildAt(a0Var2, i);
        this.a.I(a0Var.getReactTag(), null, new w0[]{new w0(a0Var2.getReactTag(), i)}, null);
        if (a0Var2.getNativeKind() != l.PARENT) {
            a(a0Var, a0Var2, i + 1);
        }
    }

    private void c(a0 a0Var, a0 a0Var2, int i) {
        int nativeOffsetForChild = a0Var.getNativeOffsetForChild(a0Var.getChildAt(i));
        if (a0Var.getNativeKind() != l.PARENT) {
            a s = s(a0Var, nativeOffsetForChild);
            if (s != null) {
                a0 a0Var3 = s.a;
                nativeOffsetForChild = s.b;
                a0Var = a0Var3;
            } else {
                return;
            }
        }
        if (a0Var2.getNativeKind() != l.NONE) {
            b(a0Var, a0Var2, nativeOffsetForChild);
        } else {
            d(a0Var, a0Var2, nativeOffsetForChild);
        }
    }

    private void d(a0 a0Var, a0 a0Var2, int i) {
        a(a0Var, a0Var2, i);
    }

    private void e(a0 a0Var) {
        int reactTag = a0Var.getReactTag();
        if (!this.c.get(reactTag)) {
            this.c.put(reactTag, true);
            a0 parent = a0Var.getParent();
            int screenX = a0Var.getScreenX();
            int screenY = a0Var.getScreenY();
            while (parent != null && parent.getNativeKind() != l.PARENT) {
                if (!parent.isVirtual()) {
                    screenX += Math.round(parent.getLayoutX());
                    screenY += Math.round(parent.getLayoutY());
                }
                parent = parent.getParent();
            }
            f(a0Var, screenX, screenY);
        }
    }

    private void f(a0 a0Var, int i, int i2) {
        if (a0Var.getNativeKind() == l.NONE || a0Var.getNativeParent() == null) {
            for (int i3 = 0; i3 < a0Var.getChildCount(); i3++) {
                a0 childAt = a0Var.getChildAt(i3);
                int reactTag = childAt.getReactTag();
                if (!this.c.get(reactTag)) {
                    this.c.put(reactTag, true);
                    f(childAt, childAt.getScreenX() + i, childAt.getScreenY() + i2);
                }
            }
            return;
        }
        this.a.S(a0Var.getLayoutParent().getReactTag(), a0Var.getReactTag(), i, i2, a0Var.getScreenWidth(), a0Var.getScreenHeight());
    }

    public static void j(a0 a0Var) {
        a0Var.removeAllNativeChildren();
    }

    private static boolean n(c0 c0Var) {
        if (c0Var == null) {
            return true;
        }
        String r1 = C0201.m82(23423);
        if (c0Var.g(r1) && !c0Var.b(r1, true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = c0Var.a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!c1.a(c0Var.a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(a0 a0Var, boolean z) {
        if (a0Var.getNativeKind() != l.PARENT) {
            for (int childCount = a0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                q(a0Var.getChildAt(childCount), z);
            }
        }
        a0 nativeParent = a0Var.getNativeParent();
        if (nativeParent != null) {
            int indexOfNativeChild = nativeParent.indexOfNativeChild(a0Var);
            nativeParent.removeNativeChildAt(indexOfNativeChild);
            this.a.I(nativeParent.getReactTag(), new int[]{indexOfNativeChild}, null, z ? new int[]{a0Var.getReactTag()} : null);
        }
    }

    private void r(a0 a0Var, c0 c0Var) {
        a0 parent = a0Var.getParent();
        if (parent == null) {
            a0Var.setIsLayoutOnly(false);
            return;
        }
        int indexOf = parent.indexOf(a0Var);
        parent.removeChildAt(indexOf);
        q(a0Var, false);
        a0Var.setIsLayoutOnly(false);
        this.a.C(a0Var.getThemedContext(), a0Var.getReactTag(), a0Var.getViewClass(), c0Var);
        parent.addChildAt(a0Var, indexOf);
        c(parent, a0Var, indexOf);
        for (int i = 0; i < a0Var.getChildCount(); i++) {
            c(a0Var, a0Var.getChildAt(i), i);
        }
        boolean z = true;
        if (dj0.h) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(23424));
            sb.append(a0Var.getReactTag());
            sb.append(C0201.m82(23425));
            sb.append(a0Var.getRootTag());
            sb.append(C0201.m82(23426));
            sb.append(c0Var != null);
            sb.append(C0201.m82(23427));
            sb.append(this.c.size());
            f60.n(C0201.m82(23428), sb.toString());
        }
        if (this.c.size() != 0) {
            z = false;
        }
        yh0.a(z);
        e(a0Var);
        for (int i2 = 0; i2 < a0Var.getChildCount(); i2++) {
            e(a0Var.getChildAt(i2));
        }
        this.c.clear();
    }

    private a s(a0 a0Var, int i) {
        while (a0Var.getNativeKind() != l.PARENT) {
            a0 parent = a0Var.getParent();
            if (parent == null) {
                return null;
            }
            i = i + (a0Var.getNativeKind() == l.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(a0Var);
            a0Var = parent;
        }
        return new a(a0Var, i);
    }

    public void g(a0 a0Var, k0 k0Var, c0 c0Var) {
        a0Var.setIsLayoutOnly(a0Var.getViewClass().equals(C0201.m82(23429)) && n(c0Var));
        if (a0Var.getNativeKind() != l.NONE) {
            this.a.C(k0Var, a0Var.getReactTag(), a0Var.getViewClass(), c0Var);
        }
    }

    public void h(a0 a0Var) {
        if (a0Var.isLayoutOnly()) {
            r(a0Var, null);
        }
    }

    public void i(a0 a0Var, int[] iArr, int[] iArr2, w0[] w0VarArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            q(this.b.c(i), z);
        }
        for (w0 w0Var : w0VarArr) {
            c(a0Var, this.b.c(w0Var.a), w0Var.b);
        }
    }

    public void k(a0 a0Var, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            c(a0Var, this.b.c(readableArray.getInt(i)), i);
        }
    }

    public void l(a0 a0Var) {
        e(a0Var);
    }

    public void m(a0 a0Var, String str, c0 c0Var) {
        if (a0Var.isLayoutOnly() && !n(c0Var)) {
            r(a0Var, c0Var);
        } else if (!a0Var.isLayoutOnly()) {
            this.a.T(a0Var.getReactTag(), str, c0Var);
        }
    }

    public void o() {
        this.c.clear();
    }

    public void p(a0 a0Var) {
        this.c.clear();
    }
}
