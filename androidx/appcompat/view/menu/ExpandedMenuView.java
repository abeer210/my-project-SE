package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.x0;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {
    private static final int[] c = {16842964, 16843049};
    private g a;
    private int b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.a.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.a = gVar;
    }

    public int getWindowAnimations() {
        return this.b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        w30.l(view, i);
        try {
            a((i) getAdapter().getItem(i));
        } finally {
            w30.m();
        }
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        x0 u = x0.u(context, attributeSet, c, i, 0);
        if (u.r(0)) {
            setBackgroundDrawable(u.g(0));
        }
        if (u.r(1)) {
            setDivider(u.g(1));
        }
        u.v();
    }
}
