package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: ViewGroupDrawingOrderHelper */
public class x0 {
    private final ViewGroup a;
    private int b = 0;
    private int[] c;

    /* access modifiers changed from: package-private */
    /* compiled from: ViewGroupDrawingOrderHelper */
    public class a implements Comparator<View> {
        public a(x0 x0Var) {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            Integer num = 0;
            if (viewZIndex == null) {
                viewZIndex = num;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            if (viewZIndex2 != null) {
                num = viewZIndex2;
            }
            return viewZIndex.intValue() - num.intValue();
        }
    }

    public x0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public int a(int i, int i2) {
        if (this.c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.a.getChildAt(i3));
            }
            Collections.sort(arrayList, new a(this));
            this.c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.c[i4] = this.a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.c[i2];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.b++;
        }
        this.c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.b--;
        }
        this.c = null;
    }

    public boolean d() {
        return this.b > 0;
    }

    public void e() {
        this.b = 0;
        for (int i = 0; i < this.a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.a.getChildAt(i)) != null) {
                this.b++;
            }
        }
        this.c = null;
    }
}
