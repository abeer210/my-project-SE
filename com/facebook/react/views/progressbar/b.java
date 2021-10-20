package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.i;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: ProgressBarShadowNode */
public class b extends i implements m {
    private String a = C0201.m82(15824);
    private final SparseIntArray b = new SparseIntArray();
    private final SparseIntArray c = new SparseIntArray();
    private final Set<Integer> d = new HashSet();

    public b() {
        c();
    }

    private void c() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.m
    public long a(p pVar, float f, n nVar, float f2, n nVar2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(b());
        if (!this.d.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.b.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.c.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.d.add(Integer.valueOf(styleFromString));
        }
        return o.b(this.c.get(styleFromString), this.b.get(styleFromString));
    }

    public String b() {
        return this.a;
    }

    @xj0(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = C0201.m82(15825);
        }
        this.a = str;
    }
}
