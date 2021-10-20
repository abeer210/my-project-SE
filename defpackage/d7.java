package defpackage;

import android.view.View;
import vigqyno.C0201;

/* renamed from: d7  reason: default package */
/* compiled from: VisibilityPropagation */
public abstract class d7 extends h6 {
    private static final String[] a = {C0201.m82(6365), C0201.m82(6366)};

    private static int d(k6 k6Var, int i) {
        int[] iArr;
        if (k6Var == null || (iArr = (int[]) k6Var.a.get(C0201.m82(6367))) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // defpackage.h6
    public void a(k6 k6Var) {
        View view = k6Var.b;
        Integer num = (Integer) k6Var.a.get(C0201.m82(6368));
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        k6Var.a.put(C0201.m82(6369), num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        k6Var.a.put(C0201.m82(6370), iArr);
    }

    @Override // defpackage.h6
    public String[] b() {
        return a;
    }

    public int e(k6 k6Var) {
        Integer num;
        if (k6Var == null || (num = (Integer) k6Var.a.get(C0201.m82(6371))) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(k6 k6Var) {
        return d(k6Var, 0);
    }

    public int g(k6 k6Var) {
        return d(k6Var, 1);
    }
}
